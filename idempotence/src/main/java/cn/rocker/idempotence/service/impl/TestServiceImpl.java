package cn.rocker.idempotence.service.impl;

import cn.rocker.idempotence.common.ServerResponse;
import cn.rocker.idempotence.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author rocker
 * @date 2019/09/28 11:41
 * @since V1.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public ServerResponse testIdempotence() {
        return ServerResponse.success("testIdempotence: success");
    }

    @Override
    public ServerResponse accessLimit() {
        return ServerResponse.success("accessLimit: success");
    }

}
