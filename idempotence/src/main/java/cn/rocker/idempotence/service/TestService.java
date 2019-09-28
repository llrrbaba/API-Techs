package cn.rocker.idempotence.service;

import cn.rocker.idempotence.common.ServerResponse;

/**
 * @author rocker
 * @date 2019/09/28 11:40
 * @since V1.0
 */
public interface TestService {

    ServerResponse testIdempotence();

    ServerResponse accessLimit();

}
