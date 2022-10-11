package searchengine.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import searchengine.dto.statistics.IndexingStatusResponse;
import searchengine.dto.statistics.StatisticsResponse;
import searchengine.services.StatisticsService;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Resource
    private final StatisticsService statisticsService;

    public ApiController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping("/statistics")
    public ResponseEntity<StatisticsResponse> statistics() {
        return ResponseEntity.ok(statisticsService.getStatistics());
    }

   // @GetMapping("/startIndexing")
   // public ResponseEntity<IndexingStatusResponse> startIndexing() throws IOException {
   //     IndexingStatusResponse status = indexingService.startIndexing();
   //     if (indexingService.isIndexing()) {
   //         return ResponseEntity.ok(status);
   //     }
   //     throw new UnknownIndexingStatusException("Неизвестная ошибка индексирования");
   // }
}
