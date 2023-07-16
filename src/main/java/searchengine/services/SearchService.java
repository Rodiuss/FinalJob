package searchengine.services;

import searchengine.dto.statistics.StatisticsSearch;

import java.util.List;

public interface SearchService {
    List<StatisticsSearch> allSiteSearch(String text, int offset, int limit);
    List<StatisticsSearch> siteSearch(String searchText, String url, int offset, int limit);
}
