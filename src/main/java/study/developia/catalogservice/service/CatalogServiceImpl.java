package study.developia.catalogservice.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.developia.catalogservice.jpa.CatalogEntity;
import study.developia.catalogservice.jpa.CatalogRepository;

@Data
@Slf4j
@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService{
    private final CatalogRepository catalogRepository;

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return null;
    }
}