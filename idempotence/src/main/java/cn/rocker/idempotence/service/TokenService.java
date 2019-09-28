package cn.rocker.idempotence.service;

import cn.rocker.idempotence.common.ServerResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author rocker
 * @date 2019/09/28 11:20
 * @since V1.0
 */
public interface TokenService {

    ServerResponse createToken();

    void checkToken(HttpServletRequest request);

}
