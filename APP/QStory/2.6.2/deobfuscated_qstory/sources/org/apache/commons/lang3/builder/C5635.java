package org.apache.commons.lang3.builder;

/* JADX INFO: renamed from: org.apache.commons.lang3.builder.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static volatile ToStringStyle f15517 = ToStringStyle.DEFAULT_STYLE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ToStringStyle f15518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f15519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final StringBuffer f15520;

    public C5635(Object obj, ToStringStyle toStringStyle) {
        toStringStyle = toStringStyle == null ? f15517 : toStringStyle;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.f15520 = stringBuffer;
        this.f15518 = toStringStyle;
        this.f15519 = obj;
        toStringStyle.appendStart(stringBuffer, obj);
    }

    public String toString() {
        Object obj = this.f15519;
        ToStringStyle toStringStyle = this.f15518;
        StringBuffer stringBuffer = this.f15520;
        toStringStyle.appendEnd(stringBuffer, obj);
        return stringBuffer.toString();
    }
}
