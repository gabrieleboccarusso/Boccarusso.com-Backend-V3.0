package boccarusso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import boccarusso.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, String> {
}
