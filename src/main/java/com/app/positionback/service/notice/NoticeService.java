package com.app.positionback.service.notice;

import com.app.positionback.domain.file.FileDTO;
import com.app.positionback.domain.notice.NoticeDTO;
import com.app.positionback.domain.notice.NoticeListDTO;
import com.app.positionback.utill.Pagination;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface NoticeService {
    // 공고 저장
    public void saveNotice(NoticeDTO noticeDTO, MultipartFile file)  throws IOException;

    // 공고 수정
    public void updateNotice(NoticeDTO noticeDTO, MultipartFile file) throws IOException;

    // 공고 삭제
    public void deleteNotice(Long id);

    // 공고 상세 조회
    public NoticeDTO getNoticeById(Long id);

    // 기업별 공고 목록 조회
    public NoticeListDTO getNoticesByCorporationId(int page, Pagination pagination, Long corporationId);

//    기업별 공고 전체 목록 개수
    public int getTotal(Long corporationId);
}
