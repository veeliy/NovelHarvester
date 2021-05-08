package com.unclezs.novel.app.main.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import lombok.Data;

/**
 * 阅读器配置
 *
 * @author blog.unclezs.com
 * @date 2021/5/8 11:28
 */
@Data
public class ReaderConfig {

  /**
   * 主题名称
   */
  private ObjectProperty<String> themeName = new SimpleObjectProperty<>("green");
  /**
   * 背景图
   */
  private ObjectProperty<String> bgImage = new SimpleObjectProperty<>("");
  /**
   * 字体大小
   */
  private ObjectProperty<Number> fontSize = new SimpleObjectProperty<>(18D);
  /**
   * 字体
   */
  private ObjectProperty<String> fontFamily = new SimpleObjectProperty<>("仿宋");
  /**
   * 正文对齐方式
   */
  private ObjectProperty<String> align = new SimpleObjectProperty<>("LEFT");
  /**
   * 显示头部
   */
  private boolean showHeader;
  /**
   * 页面宽度
   */
  private ObjectProperty<Number> pageWidth = new SimpleObjectProperty<>(100D);
  /**
   * 行间距
   */
  private ObjectProperty<Number> lineSpacing = new SimpleObjectProperty<>(0D);
  /**
   * 舞台宽度
   */
  private ObjectProperty<Double> stageWidth = new SimpleObjectProperty<>(800D);
  /**
   * 舞台高度
   */
  private ObjectProperty<Double> stageHeight = new SimpleObjectProperty<>(720D);
}