package com.plugin.development.context;

import com.plugin.development.context.factory.PluginBeanRegistry;
import com.plugin.development.context.factory.PluginComponentBeanRegistry;
import com.plugin.development.context.factory.PluginControllerBeanRegistry;
import com.plugin.development.context.process.PluginConfigProcess;
import com.plugin.development.context.process.PluginPostBeanProcess;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Description:
 * @Author: zhangzhuo
 * @Version: 1.0
 * @Create Date Time: 2019-05-31 09:11
 * @Update Date Time:
 * @see
 */
public class DefaultPluginContext implements PluginContext {

    private final ApplicationContext applicationContext;

    private final PluginBeanRegistry<String> componentBeanRegistry;
    private final PluginBeanRegistry<Set<RequestMappingInfo>> pluginControllerBeanRegistry;

    private final List<PluginPostBeanProcess> pluginPostBeanProcess = new ArrayList<>(5);

    public DefaultPluginContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        this.componentBeanRegistry = new PluginComponentBeanRegistry(applicationContext);
        this.pluginControllerBeanRegistry = new PluginControllerBeanRegistry(applicationContext);
        initPluginPostBeanProcess();
    }



    @Override
    public ApplicationContext getMainApplicationContext() {
        return applicationContext;
    }

    @Override
    public PluginBeanRegistry<String> getComponentBeanRegistry() {
        return componentBeanRegistry;
    }

    @Override
    public PluginBeanRegistry<Set<RequestMappingInfo>> getControllerBeanRegistry() {
        return pluginControllerBeanRegistry;
    }

    @Override
    public List<PluginPostBeanProcess> getPluginPostBeanProcess() {
        return pluginPostBeanProcess;
    }

    /**
     * 初始化 pluginPostBeanProcess
     */
    private void initPluginPostBeanProcess() {
        PluginConfigProcess pluginConfigProcess = new PluginConfigProcess(applicationContext);
        pluginPostBeanProcess.add(pluginConfigProcess);
    }


}
