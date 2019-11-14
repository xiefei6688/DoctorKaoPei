package com.yskp.freemarker;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;

/**
 * freemarker环境配置扩展
 * @author Jimc.
 * @since 2018/7/3.
 * https://blog.csdn.net/weixin_30270561/article/details/99152902
 */
public class FreeMarkerConfigExtend extends FreeMarkerConfigurer {
    @Override
    public void afterPropertiesSet() throws IOException, TemplateException {
        super.afterPropertiesSet();
        Configuration cfg = this.getConfiguration();
        // 添加shiro标签
//        cfg.setSharedVariable("shiro", new ShiroTags());//shiro标签
    }
}
