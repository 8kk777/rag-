package com.yizhaoqi.rag.repository;

import com.yizhaoqi.rag.model.ChunkInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChunkInfoRepository extends JpaRepository<ChunkInfo, Long> {
    List<ChunkInfo> findByFileMd5OrderByChunkIndexAsc(String fileMd5);

    boolean existsByFileMd5AndChunkIndex(String fileMd5, int chunkIndex);
}
