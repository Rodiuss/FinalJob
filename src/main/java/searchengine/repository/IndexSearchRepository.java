package searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import searchengine.model.IndexSearch;
import searchengine.model.Lemma;
import searchengine.model.Page;

import java.util.List;

@Repository
public interface IndexSearchRepository extends JpaRepository<IndexSearch, Long> {
    @Query(value = "SELECT i.* FROM index_search i WHERE i.lemma_id IN :lemmas AND i.page_id IN :pages", nativeQuery = true)
    List<IndexSearch> findByPagesAndLemmas(@Param("lemmas") List<Lemma> lemmaListId,
                                           @Param("pages") List<Page> pageListId);

    List<IndexSearch> findByLemmaId (long lemmaId);
    List<IndexSearch> findByPageId (long pageId);
    IndexSearch findByLemmaIdAndPageId (long lemmaId, long pageId);
}
