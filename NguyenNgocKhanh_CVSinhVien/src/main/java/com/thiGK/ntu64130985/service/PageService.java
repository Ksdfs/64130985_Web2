package com.thiGK.ntu64130985.service;

import com.thiGK.ntu64130985.models.Page;
import com.thiGK.ntu64130985.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PageService {
	@Autowired
    private PageRepository pageRepository;

    public List<Page> getAllPages() {
        return pageRepository.findAll();
    }

    public Optional<Page> getPageById(Long id) {
        return pageRepository.findById(id);
    }

    public void savePage(Page page) {
        pageRepository.save(page);
    }

    public void deletePage(Long id) {
        pageRepository.deleteById(id);
    }
}
