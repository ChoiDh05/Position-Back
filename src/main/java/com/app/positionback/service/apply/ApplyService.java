package com.app.positionback.service.apply;

import com.app.positionback.domain.apply.ApplyListDTO;
import com.app.positionback.domain.apply.ApplyVO;
import com.app.positionback.utill.Pagination;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ApplyService {
    public ApplyListDTO getApplyByCorporationId(int page, Pagination pagination, Long corporationId);
    public int getTotal(Pagination pagination, Long corporationId);
    public void setApplyStatus(ApplyVO applyVO);
    public void uploadCertificationFile(String uuid, String path, MultipartFile file, Long applyId) throws IOException;

}
