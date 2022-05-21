package gp.cnusambe.payload.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import gp.cnusambe.domain.OssLicense;
import gp.cnusambe.domain.Project;
import gp.cnusambe.domain.ProjectCategory;
import gp.cnusambe.domain.User;
import lombok.*;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ProjectPostRequest {
    private String projectDescription;
    private String projectName;
    private String projectStatus;
    private Long ossLicenseId;
    private String projectCategoryName;
    private String userId;

    private static final ModelMapper modelMapper = new ModelMapper();

    public Project makeProjectEntity(OssLicense license, User user, ProjectCategory category){
        Project project = modelMapper.map(this, Project.class);

        project.setLicense(license);
        project.setUser(user);
        project.setProjectCategory(category);

        return project;
    }
}
