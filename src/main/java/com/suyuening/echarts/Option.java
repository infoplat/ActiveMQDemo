package com.suyuening.echarts;

public class Option {

    /**
     * <p>
     * 背景色，默认无背景。
     * </p>
     * <blockquote>
     * <p>
     * 颜色可以使用 RGB 表示，比如 <code>&#39;rgb(128, 128, 128)&#39;</code>，如果想要加上 alpha 通道表示不透明度，可以使用 RGBA，比如
     * <code>&#39;rgba(128, 128, 128, 0.5)&#39;</code>，也可以使用十六进制格式，比如 <code>&#39;#ccc&#39;</code>
     * 。除了纯色之外颜色也支持渐变色和纹理填充
     * </p>
     * 
     * <pre><code class=\"lang-js\">// 线性渐变，前四个参数分别是 x0, y0, x2, y2, 范围从 0 - 1，相当于在图形包围盒中的百分比，如果最后一个参数传 `true`，则该四个值是绝对的像素位置
     * color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
     *   offset: 0, color: &#39;red&#39; // 0% 处的颜色
     * }, {
     *   offset: 1, color: &#39;blue&#39; // 100% 处的颜色
     * }], false)
     * // 径向渐变，前三个参数分别是圆心 x, y 和半径，取值同线性渐变
     * color: new echarts.graphic.RadialGradient(0.5, 0.5, 0.5, [...], false)
     * // 纹理填充
     * color: new echarts.graphic.Pattern(
     *   imageDom, // 支持为 HTMLImageElement, HTMLCanvasElement，不支持路径字符串
     *   &#39;repeat&#39; // 是否平铺, 可以是 repeat-x, repeat-y, no-repeat
     * )
     * </code></pre>
     * 
     * </blockquote>
     */
    private Object backgroundColor;

    /**
     * 获取背景色值
     */
    public Object backgroundColor() {
        return this.backgroundColor;
    }

    /**
     * 设置背景色值
     *
     * @param backgroundColor
     */
    public Option backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * 获取背景色值
     */
    public Object getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 设置背景色值
     *
     * @param backgroundColor
     */
    public void setBackgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
