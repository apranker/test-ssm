package com.qunar.mapper;

import com.qunar.entity.Work;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Repository
public interface WorkMapper {
    public List<Work> query(Map<String, Object> params);
}
