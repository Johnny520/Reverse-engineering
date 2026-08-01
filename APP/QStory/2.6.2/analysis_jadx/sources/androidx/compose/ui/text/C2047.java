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
import kotlin.jvm.internal.AbstractC4394;
import p194.C7831;
import p205.C7898;
import p205.C7900;
import p209.C7919;
import p209.C7921;
import p209.C7923;
import p209.C7926;
import p209.C7930;
import p209.InterfaceC7922;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2047 implements InterfaceC2053 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC1993 f6052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1987 f6053;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1990 f6054;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1988 f6055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f6056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7922 f6057;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1570 f6058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7930 f6059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AbstractC1505 f6060;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f6061;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f6062;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7831 f6063;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long f6064;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7921 f6065;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C7926 f6066;

    public C2047(long j, long j2, C1988 c1988, C1990 c1990, C1987 c1987, AbstractC1993 abstractC1993, String str, long j3, C7921 c7921, C7926 c7926, C7831 c7831, long j4, C7930 c7930, C1570 c1570, int i) {
        this((i & 1) != 0 ? C1599.f4696 : j, (i & 2) != 0 ? C7898.f21869 : j2, (i & 4) != 0 ? null : c1988, (i & 8) != 0 ? null : c1990, (i & 16) != 0 ? null : c1987, (i & 32) != 0 ? null : abstractC1993, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C7898.f21869 : j3, (i & 256) != 0 ? null : c7921, (i & 512) != 0 ? null : c7926, (i & 1024) != 0 ? null : c7831, (i & 2048) != 0 ? C1599.f4696 : j4, (i & 4096) != 0 ? null : c7930, (i & 8192) != 0 ? null : c1570);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2047)) {
            return false;
        }
        C2047 c2047 = (C2047) obj;
        return m3755(c2047) && m3754(c2047);
    }

    public final int hashCode() {
        InterfaceC7922 interfaceC7922 = this.f6057;
        long jMo13389 = interfaceC7922.mo13389();
        int i = C1599.f4698;
        int iHashCode = Long.hashCode(jMo13389) * 31;
        AbstractC1598 abstractC1598Mo13388 = interfaceC7922.mo13388();
        int iHashCode2 = (Float.hashCode(interfaceC7922.mo13390()) + ((iHashCode + (abstractC1598Mo13388 != null ? abstractC1598Mo13388.hashCode() : 0)) * 31)) * 31;
        C7900[] c7900Arr = C7898.f21870;
        int iM141 = AbstractC0053.m141(iHashCode2, 31, this.f6056);
        C1988 c1988 = this.f6055;
        int i2 = (iM141 + (c1988 != null ? c1988.f5876 : 0)) * 31;
        C1990 c1990 = this.f6054;
        int iHashCode3 = (i2 + (c1990 != null ? Integer.hashCode(c1990.f5879) : 0)) * 31;
        C1987 c1987 = this.f6053;
        int iHashCode4 = (iHashCode3 + (c1987 != null ? Integer.hashCode(c1987.f5869) : 0)) * 31;
        AbstractC1993 abstractC1993 = this.f6052;
        int iHashCode5 = (iHashCode4 + (abstractC1993 != null ? abstractC1993.hashCode() : 0)) * 31;
        String str = this.f6062;
        int iM1412 = AbstractC0053.m141((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f6061);
        C7921 c7921 = this.f6065;
        int iHashCode6 = (iM1412 + (c7921 != null ? Float.hashCode(c7921.f21947) : 0)) * 31;
        C7926 c7926 = this.f6066;
        int iHashCode7 = (iHashCode6 + (c7926 != null ? c7926.hashCode() : 0)) * 31;
        C7831 c7831 = this.f6063;
        int iM1413 = AbstractC0053.m141((iHashCode7 + (c7831 != null ? c7831.f21377.hashCode() : 0)) * 31, 31, this.f6064);
        C7930 c7930 = this.f6059;
        int i3 = (iM1413 + (c7930 != null ? c7930.f21965 : 0)) * 31;
        C1570 c1570 = this.f6058;
        int iHashCode8 = (i3 + (c1570 != null ? c1570.hashCode() : 0)) * 961;
        AbstractC1505 abstractC1505 = this.f6060;
        return iHashCode8 + (abstractC1505 != null ? abstractC1505.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        InterfaceC7922 interfaceC7922 = this.f6057;
        sb.append((Object) C1599.m2944(interfaceC7922.mo13389()));
        sb.append(", brush=");
        sb.append(interfaceC7922.mo13388());
        sb.append(", alpha=");
        sb.append(interfaceC7922.mo13390());
        sb.append(", fontSize=");
        sb.append((Object) C7898.m13314(this.f6056));
        sb.append(", fontWeight=");
        sb.append(this.f6055);
        sb.append(", fontStyle=");
        sb.append(this.f6054);
        sb.append(", fontSynthesis=");
        sb.append(this.f6053);
        sb.append(", fontFamily=");
        sb.append(this.f6052);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f6062);
        sb.append(", letterSpacing=");
        sb.append((Object) C7898.m13314(this.f6061));
        sb.append(", baselineShift=");
        sb.append(this.f6065);
        sb.append(", textGeometricTransform=");
        sb.append(this.f6066);
        sb.append(", localeList=");
        sb.append(this.f6063);
        sb.append(", background=");
        AbstractC0053.m138(this.f6064, sb, ", textDecoration=");
        sb.append(this.f6059);
        sb.append(", shadow=");
        sb.append(this.f6058);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f6060);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2047 m3753(C2047 c2047) {
        if (c2047 == null) {
            return this;
        }
        InterfaceC7922 interfaceC7922 = c2047.f6057;
        return AbstractC2046.m3752(this, interfaceC7922.mo13389(), interfaceC7922.mo13388(), interfaceC7922.mo13390(), c2047.f6056, c2047.f6055, c2047.f6054, c2047.f6053, c2047.f6052, c2047.f6062, c2047.f6061, c2047.f6065, c2047.f6066, c2047.f6063, c2047.f6064, c2047.f6059, c2047.f6058, c2047.f6060);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m3754(C2047 c2047) {
        return AbstractC4394.m8917(this.f6057, c2047.f6057) && AbstractC4394.m8917(this.f6059, c2047.f6059) && AbstractC4394.m8917(this.f6058, c2047.f6058) && AbstractC4394.m8917(this.f6060, c2047.f6060);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m3755(C2047 c2047) {
        if (this == c2047) {
            return true;
        }
        return C7898.m13317(this.f6056, c2047.f6056) && AbstractC4394.m8917(this.f6055, c2047.f6055) && AbstractC4394.m8917(this.f6054, c2047.f6054) && AbstractC4394.m8917(this.f6053, c2047.f6053) && AbstractC4394.m8917(this.f6052, c2047.f6052) && AbstractC4394.m8917(this.f6062, c2047.f6062) && C7898.m13317(this.f6061, c2047.f6061) && AbstractC4394.m8917(this.f6065, c2047.f6065) && AbstractC4394.m8917(this.f6066, c2047.f6066) && AbstractC4394.m8917(this.f6063, c2047.f6063) && C1599.m2939(this.f6064, c2047.f6064);
    }

    public C2047(InterfaceC7922 interfaceC7922, long j, C1988 c1988, C1990 c1990, C1987 c1987, AbstractC1993 abstractC1993, String str, long j2, C7921 c7921, C7926 c7926, C7831 c7831, long j3, C7930 c7930, C1570 c1570, AbstractC1505 abstractC1505) {
        this.f6057 = interfaceC7922;
        this.f6056 = j;
        this.f6055 = c1988;
        this.f6054 = c1990;
        this.f6053 = c1987;
        this.f6052 = abstractC1993;
        this.f6062 = str;
        this.f6061 = j2;
        this.f6065 = c7921;
        this.f6066 = c7926;
        this.f6063 = c7831;
        this.f6064 = j3;
        this.f6059 = c7930;
        this.f6058 = c1570;
        this.f6060 = abstractC1505;
    }

    public C2047(long j, long j2, C1988 c1988, C1990 c1990, C1987 c1987, AbstractC1993 abstractC1993, String str, long j3, C7921 c7921, C7926 c7926, C7831 c7831, long j4, C7930 c7930, C1570 c1570) {
        this(j != 16 ? new C7919(j) : C7923.f21948, j2, c1988, c1990, c1987, abstractC1993, str, j3, c7921, c7926, c7831, j4, c7930, c1570, (AbstractC1505) null);
    }
}
