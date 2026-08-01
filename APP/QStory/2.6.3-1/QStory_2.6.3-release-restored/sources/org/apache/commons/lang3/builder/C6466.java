package org.apache.commons.lang3.builder;

/* JADX INFO: renamed from: org.apache.commons.lang3.builder.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6466 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static volatile ToStringStyle f15862 = ToStringStyle.DEFAULT_STYLE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ToStringStyle f15863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f15864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final StringBuffer f15865;

    public C6466(Object obj, ToStringStyle toStringStyle) {
        toStringStyle = toStringStyle == null ? f15862 : toStringStyle;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.f15865 = stringBuffer;
        this.f15863 = toStringStyle;
        this.f15864 = obj;
        toStringStyle.appendStart(stringBuffer, obj);
    }

    public String toString() {
        Object obj = this.f15864;
        ToStringStyle toStringStyle = this.f15863;
        StringBuffer stringBuffer = this.f15865;
        toStringStyle.appendEnd(stringBuffer, obj);
        return stringBuffer.toString();
    }
}
