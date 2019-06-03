package com.plugin.example.plugin2.config;

import com.plugin.development.annotation.ConfigDefinition;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @Description:
 * @Author: zhangzhuo
 * @Version: 1.0
 * @Create Date Time: 2019-05-30 16:01
 * @Update Date Time:
 * @see
 */
@Component
@ConfigDefinition("plugin2.yml")
public class Plugin2Config {

    private String name;
    private String plugin;
    private Set<String> setString;
    private List<Integer> listInteger;

    private String defaultValue = "defaultValue";

    private Sub2Config sub2Config;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public Set<String> getSetString() {
        return setString;
    }

    public void setSetString(Set<String> setString) {
        this.setString = setString;
    }

    public List<Integer> getListInteger() {
        return listInteger;
    }

    public void setListInteger(List<Integer> listInteger) {
        this.listInteger = listInteger;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Sub2Config getSub2Config() {
        return sub2Config;
    }

    public void setSub2Config(Sub2Config sub2Config) {
        this.sub2Config = sub2Config;
    }

    @Override
    public String toString() {
        return "PluginConfig{" +
                "name='" + name + '\'' +
                ", plugin='" + plugin + '\'' +
                ", setString=" + setString +
                ", listInteger=" + listInteger +
                ", defaultValue='" + defaultValue + '\'' +
                '}';
    }

}
