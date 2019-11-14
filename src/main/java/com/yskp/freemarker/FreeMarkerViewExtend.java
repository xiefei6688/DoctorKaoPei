package com.yskp.freemarker;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * freemarker视图配置扩展
 * @author Jimc.
 * @since 2018/7/4.
 */
public class FreeMarkerViewExtend extends FreeMarkerView {

    /**
     * 项目根路径
     */
    private static final String CONTEXT_PATH = "DoctorKaoPei";

    /**
     * 静态资源版本(清除缓存)
     */
    private static final String STATIC_VERSION = "_v";

    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) {
        try {
            super.exposeHelpers(model, request);
        } catch (Exception e) {
            e.printStackTrace();
//            LoggerUtils.error(FreeMarkerViewExtend.class,e, "FreeMarkerViewExtend 加载父类出现异常。请检查。");
        }

        model.put(CONTEXT_PATH, request.getContextPath());// 项目根路径
        model.put(STATIC_VERSION, System.currentTimeMillis());// 清除静态资源缓存用
    }
}