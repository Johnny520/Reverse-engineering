package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1570;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.text.font.AbstractC1993;
import androidx.compose.ui.text.font.C1987;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.C1990;
import kotlin.jvm.internal.AbstractC4395;
import p194.C7832;
import p205.C7899;
import p205.C7901;
import p209.C7920;
import p209.C7922;
import p209.C7924;
import p209.C7927;
import p209.C7931;
import p209.InterfaceC7923;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2047 implements InterfaceC2053 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC1993 f6053;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1987 f6054;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1990 f6055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1988 f6056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f6057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7923 f6058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1570 f6059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7931 f6060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AbstractC1505 f6061;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f6062;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f6063;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7832 f6064;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long f6065;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7922 f6066;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C7927 f6067;

    public C2047(long j, long j2, C1988 c1988, C1990 c1990, C1987 c1987, AbstractC1993 abstractC1993, String str, long j3, C7922 c7922, C7927 c7927, C7832 c7832, long j4, C7931 c7931, C1570 c1570, int i) {
        this((i & 1) != 0 ? C1599.f4697 : j, (i & 2) != 0 ? C7899.f21866 : j2, (i & 4) != 0 ? null : c1988, (i & 8) != 0 ? null : c1990, (i & 16) != 0 ? null : c1987, (i & 32) != 0 ? null : abstractC1993, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C7899.f21866 : j3, (i & 256) != 0 ? null : c7922, (i & 512) != 0 ? null : c7927, (i & 1024) != 0 ? null : c7832, (i & 2048) != 0 ? C1599.f4697 : j4, (i & 4096) != 0 ? null : c7931, (i & 8192) != 0 ? null : c1570);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2047)) {
            return false;
        }
        C2047 c2047 = (C2047) obj;
        return m3765(c2047) && m3764(c2047);
    }

    public final int hashCode() {
        InterfaceC7923 interfaceC7923 = this.f6058;
        long jMo13417 = interfaceC7923.mo13417();
        int i = C1599.f4699;
        int iHashCode = Long.hashCode(jMo13417) * 31;
        AbstractC1598 abstractC1598Mo13416 = interfaceC7923.mo13416();
        int iHashCode2 = (Float.hashCode(interfaceC7923.mo13418()) + ((iHashCode + (abstractC1598Mo13416 != null ? abstractC1598Mo13416.hashCode() : 0)) * 31)) * 31;
        C7901[] c7901Arr = C7899.f21867;
        int iM142 = AbstractC0053.m142(iHashCode2, 31, this.f6057);
        C1988 c1988 = this.f6056;
        int i2 = (iM142 + (c1988 != null ? c1988.f5877 : 0)) * 31;
        C1990 c1990 = this.f6055;
        int iHashCode3 = (i2 + (c1990 != null ? Integer.hashCode(c1990.f5880) : 0)) * 31;
        C1987 c1987 = this.f6054;
        int iHashCode4 = (iHashCode3 + (c1987 != null ? Integer.hashCode(c1987.f5870) : 0)) * 31;
        AbstractC1993 abstractC1993 = this.f6053;
        int iHashCode5 = (iHashCode4 + (abstractC1993 != null ? abstractC1993.hashCode() : 0)) * 31;
        String str = this.f6063;
        int iM1422 = AbstractC0053.m142((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f6062);
        C7922 c7922 = this.f6066;
        int iHashCode6 = (iM1422 + (c7922 != null ? Float.hashCode(c7922.f21944) : 0)) * 31;
        C7927 c7927 = this.f6067;
        int iHashCode7 = (iHashCode6 + (c7927 != null ? c7927.hashCode() : 0)) * 31;
        C7832 c7832 = this.f6064;
        int iM1423 = AbstractC0053.m142((iHashCode7 + (c7832 != null ? c7832.f21374.hashCode() : 0)) * 31, 31, this.f6065);
        C7931 c7931 = this.f6060;
        int i3 = (iM1423 + (c7931 != null ? c7931.f21962 : 0)) * 31;
        C1570 c1570 = this.f6059;
        int iHashCode8 = (i3 + (c1570 != null ? c1570.hashCode() : 0)) * 961;
        AbstractC1505 abstractC1505 = this.f6061;
        return iHashCode8 + (abstractC1505 != null ? abstractC1505.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        InterfaceC7923 interfaceC7923 = this.f6058;
        sb.append((Object) C1599.m2954(interfaceC7923.mo13417()));
        sb.append(", brush=");
        sb.append(interfaceC7923.mo13416());
        sb.append(", alpha=");
        sb.append(interfaceC7923.mo13418());
        sb.append(", fontSize=");
        sb.append((Object) C7899.m13342(this.f6057));
        sb.append(", fontWeight=");
        sb.append(this.f6056);
        sb.append(", fontStyle=");
        sb.append(this.f6055);
        sb.append(", fontSynthesis=");
        sb.append(this.f6054);
        sb.append(", fontFamily=");
        sb.append(this.f6053);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f6063);
        sb.append(", letterSpacing=");
        sb.append((Object) C7899.m13342(this.f6062));
        sb.append(", baselineShift=");
        sb.append(this.f6066);
        sb.append(", textGeometricTransform=");
        sb.append(this.f6067);
        sb.append(", localeList=");
        sb.append(this.f6064);
        sb.append(", background=");
        AbstractC0053.m138(this.f6065, sb, ", textDecoration=");
        sb.append(this.f6060);
        sb.append(", shadow=");
        sb.append(this.f6059);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f6061);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2047 m3763(C2047 c2047) {
        if (c2047 == null) {
            return this;
        }
        InterfaceC7923 interfaceC7923 = c2047.f6058;
        return AbstractC2046.m3762(this, interfaceC7923.mo13417(), interfaceC7923.mo13416(), interfaceC7923.mo13418(), c2047.f6057, c2047.f6056, c2047.f6055, c2047.f6054, c2047.f6053, c2047.f6063, c2047.f6062, c2047.f6066, c2047.f6067, c2047.f6064, c2047.f6065, c2047.f6060, c2047.f6059, c2047.f6061);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m3764(C2047 c2047) {
        return AbstractC4395.m8907(this.f6058, c2047.f6058) && AbstractC4395.m8907(this.f6060, c2047.f6060) && AbstractC4395.m8907(this.f6059, c2047.f6059) && AbstractC4395.m8907(this.f6061, c2047.f6061);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m3765(C2047 c2047) {
        if (this == c2047) {
            return true;
        }
        return C7899.m13345(this.f6057, c2047.f6057) && AbstractC4395.m8907(this.f6056, c2047.f6056) && AbstractC4395.m8907(this.f6055, c2047.f6055) && AbstractC4395.m8907(this.f6054, c2047.f6054) && AbstractC4395.m8907(this.f6053, c2047.f6053) && AbstractC4395.m8907(this.f6063, c2047.f6063) && C7899.m13345(this.f6062, c2047.f6062) && AbstractC4395.m8907(this.f6066, c2047.f6066) && AbstractC4395.m8907(this.f6067, c2047.f6067) && AbstractC4395.m8907(this.f6064, c2047.f6064) && C1599.m2949(this.f6065, c2047.f6065);
    }

    public C2047(InterfaceC7923 interfaceC7923, long j, C1988 c1988, C1990 c1990, C1987 c1987, AbstractC1993 abstractC1993, String str, long j2, C7922 c7922, C7927 c7927, C7832 c7832, long j3, C7931 c7931, C1570 c1570, AbstractC1505 abstractC1505) {
        this.f6058 = interfaceC7923;
        this.f6057 = j;
        this.f6056 = c1988;
        this.f6055 = c1990;
        this.f6054 = c1987;
        this.f6053 = abstractC1993;
        this.f6063 = str;
        this.f6062 = j2;
        this.f6066 = c7922;
        this.f6067 = c7927;
        this.f6064 = c7832;
        this.f6065 = j3;
        this.f6060 = c7931;
        this.f6059 = c1570;
        this.f6061 = abstractC1505;
    }

    public C2047(long j, long j2, C1988 c1988, C1990 c1990, C1987 c1987, AbstractC1993 abstractC1993, String str, long j3, C7922 c7922, C7927 c7927, C7832 c7832, long j4, C7931 c7931, C1570 c1570) {
        this(j != 16 ? new C7920(j) : C7924.f21945, j2, c1988, c1990, c1987, abstractC1993, str, j3, c7922, c7927, c7832, j4, c7931, c1570, (AbstractC1505) null);
    }
}
