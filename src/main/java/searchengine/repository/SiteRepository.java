package searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import searchengine.config.Site;

public interface SiteRepository extends JpaRepository<Site,Long> {
}
