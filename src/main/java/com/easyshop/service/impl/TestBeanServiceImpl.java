package com.easyshop.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.easyshop.dao.TestBeanDao;
import com.easyshop.entity.TestBean;
import com.easyshop.service.TestBeanService;
import org.springframework.stereotype.Service;

/**
 * @auther:IntelliJ IDEA
 * @description:
 * @author: Onisms
 * @date 2020/6/1 20:15
 */
@Service
public class TestBeanServiceImpl extends ServiceImpl<TestBeanDao, TestBean> implements TestBeanService {
}
