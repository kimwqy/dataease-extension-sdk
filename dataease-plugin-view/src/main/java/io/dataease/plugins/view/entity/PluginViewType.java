package io.dataease.plugins.view.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PluginViewType implements Serializable {
    private static final long serialVersionUID = -2715025716608100657L;

    private String render;

    private String category;

    private String value;

    // 支持的样式组件类型
    private String[] properties;
}
