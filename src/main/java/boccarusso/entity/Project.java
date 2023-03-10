package boccarusso.entity;

import boccarusso.DTO.ProjectDTO;
import static boccarusso.Functions.sanitize;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Project {
 @Id
 private String slug;
 private String title;
 private String tagline;
 private String image;
 private String repo;

 public Project(ProjectDTO dto) {
  this.slug = sanitize(dto.getTitle());
  this.image = dto.getImage();
  this.tagline = dto.getTagline();
  this.title = dto.getTitle();
  this.repo = dto.getRepo();
 }

 public void setSlug(String s) {
  this.slug = sanitize(s);
 }
}
