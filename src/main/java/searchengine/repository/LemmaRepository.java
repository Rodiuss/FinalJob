package searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import searchengine.model.Lemma;
import searchengine.model.SitePage;

import java.util.List;

@Repository
public interface LemmaRepository extends JpaRepository<Lemma, Long> {
    long countBySitePageId(SitePage site);

    List<Lemma> findBySitePageId(SitePage siteId);
    @Query(value = "SELECT l.* FROM Lemma l WHERE l.lemma IN :lemmas AND l.site_id = :site", nativeQuery = true)
    List<Lemma> findLemmaListBySite(@Param("lemmas") List<String> lemmaList,
                                    @Param("site") SitePage site);

    @Query(value = "SELECT l.* FROM Lemma l WHERE l.lemma = :lemma ORDER BY frequency ASC", nativeQuery = true)
    List<Lemma> findByLemma(@Param("lemma") String lemma);

}