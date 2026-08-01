package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import androidx.compose.material3.internal.AbstractC1120;
import androidx.compose.ui.graphics.C1570;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.text.font.AbstractC1993;
import androidx.compose.ui.text.font.C1987;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.C1990;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.jar.asm.Opcodes;
import p194.C7832;
import p205.C7899;
import p209.C7918;
import p209.C7919;
import p209.C7920;
import p209.C7922;
import p209.C7924;
import p209.C7927;
import p209.C7928;
import p209.C7931;
import p209.C7932;
import p209.C7933;
import p209.C7934;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2031 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2031 f5981 = new C2031(0, 0, null, 0, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2059 f5982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2064 f5983;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2047 f5984;

    public C2031(long j, long j2, C1988 c1988, long j3, long j4, int i, long j5, int i2) {
        this(new C2047((i2 & 1) != 0 ? C1599.f4697 : j, (i2 & 2) != 0 ? C7899.f21866 : j2, (i2 & 4) != 0 ? null : c1988, null, null, null, null, (i2 & 128) != 0 ? C7899.f21866 : j3, null, null, null, (i2 & 2048) != 0 ? C1599.f4697 : j4, null, null), new C2064((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? C7899.f21866 : j5, null, null, null, 0, 0, null), null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2031 m3736(C2031 c2031, long j, long j2, C1988 c1988, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? C7899.f21866 : j2;
        C1988 c19882 = (i2 & 4) != 0 ? null : c1988;
        long j6 = (i2 & 128) != 0 ? C7899.f21866 : j3;
        long j7 = C1599.f4697;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? C7899.f21866 : j4;
        C2047 c2047M3762 = AbstractC2046.m3762(c2031.f5984, j, null, Float.NaN, j5, c19882, null, null, null, null, j6, null, null, null, j7, null, null, null);
        C2064 c2064M3783 = AbstractC2056.m3783(c2031.f5983, i3, 0, j8, null, null, null, 0, 0, null);
        return (c2031.f5984 == c2047M3762 && c2031.f5983 == c2064M3783) ? c2031 : new C2031(c2047M3762, c2064M3783);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2031 m3737(C2031 c2031, long j, C1988 c1988, AbstractC1993 abstractC1993, long j2, long j3, C7933 c7933, int i) {
        C7922 c7922;
        C7927 c7927;
        long j4;
        C2059 c2059 = AbstractC1120.f3267;
        long jMo13417 = c2031.f5984.f6058.mo13417();
        long j5 = (i & 2) != 0 ? c2031.f5984.f6057 : j;
        C1988 c19882 = (i & 4) != 0 ? c2031.f5984.f6056 : c1988;
        C2047 c2047 = c2031.f5984;
        C1990 c1990 = c2047.f6055;
        C1987 c1987 = c2047.f6054;
        AbstractC1993 abstractC19932 = (i & 32) != 0 ? c2047.f6053 : abstractC1993;
        String str = c2047.f6063;
        long j6 = (i & 128) != 0 ? c2047.f6062 : j2;
        C7922 c79222 = c2047.f6066;
        C7927 c79272 = c2047.f6067;
        C7832 c7832 = c2047.f6064;
        long j7 = c2047.f6065;
        C7931 c7931 = c2047.f6060;
        C1570 c1570 = c2047.f6059;
        AbstractC1505 abstractC1505 = c2047.f6061;
        C2064 c2064 = c2031.f5983;
        int i2 = c2064.f6113;
        int i3 = c2064.f6112;
        if ((i & 131072) != 0) {
            c7922 = c79222;
            c7927 = c79272;
            j4 = c2064.f6111;
        } else {
            c7922 = c79222;
            c7927 = c79272;
            j4 = j3;
        }
        C7928 c7928 = c2064.f6110;
        C2059 c20592 = (i & Opcodes.ASM8) != 0 ? c2031.f5982 : c2059;
        return new C2031(new C2047(C1599.m2949(jMo13417, c2047.f6058.mo13417()) ? c2047.f6058 : jMo13417 != 16 ? new C7920(jMo13417) : C7924.f21945, j5, c19882, c1990, c1987, abstractC19932, str, j6, c7922, c7927, c7832, j7, c7931, c1570, abstractC1505), new C2064(i2, i3, j4, c7928, c20592 != null ? c20592.f6096 : null, (i & 1048576) != 0 ? c2064.f6108 : c7933, c2064.f6115, c2064.f6114, c2064.f6116), c20592);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2031)) {
            return false;
        }
        C2031 c2031 = (C2031) obj;
        return AbstractC4395.m8907(this.f5984, c2031.f5984) && AbstractC4395.m8907(this.f5983, c2031.f5983) && AbstractC4395.m8907(this.f5982, c2031.f5982);
    }

    public final int hashCode() {
        int iHashCode = (this.f5983.hashCode() + (this.f5984.hashCode() * 31)) * 31;
        C2059 c2059 = this.f5982;
        return iHashCode + (c2059 != null ? c2059.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C1599.m2954(m3739()));
        sb.append(", brush=");
        C2047 c2047 = this.f5984;
        sb.append(c2047.f6058.mo13416());
        sb.append(", alpha=");
        sb.append(c2047.f6058.mo13418());
        sb.append(", fontSize=");
        sb.append((Object) C7899.m13342(c2047.f6057));
        sb.append(", fontWeight=");
        sb.append(c2047.f6056);
        sb.append(", fontStyle=");
        sb.append(c2047.f6055);
        sb.append(", fontSynthesis=");
        sb.append(c2047.f6054);
        sb.append(", fontFamily=");
        sb.append(c2047.f6053);
        sb.append(", fontFeatureSettings=");
        sb.append(c2047.f6063);
        sb.append(", letterSpacing=");
        sb.append((Object) C7899.m13342(c2047.f6062));
        sb.append(", baselineShift=");
        sb.append(c2047.f6066);
        sb.append(", textGeometricTransform=");
        sb.append(c2047.f6067);
        sb.append(", localeList=");
        sb.append(c2047.f6064);
        sb.append(", background=");
        AbstractC0053.m138(c2047.f6065, sb, ", textDecoration=");
        sb.append(c2047.f6060);
        sb.append(", shadow=");
        sb.append(c2047.f6059);
        sb.append(", drawStyle=");
        sb.append(c2047.f6061);
        sb.append(", textAlign=");
        C2064 c2064 = this.f5983;
        sb.append((Object) C7934.m13420(c2064.f6113));
        sb.append(", textDirection=");
        sb.append((Object) C7932.m13419(c2064.f6112));
        sb.append(", lineHeight=");
        sb.append((Object) C7899.m13342(c2064.f6111));
        sb.append(", textIndent=");
        sb.append(c2064.f6110);
        sb.append(", platformStyle=");
        sb.append(this.f5982);
        sb.append(", lineHeightStyle=");
        sb.append(c2064.f6108);
        sb.append(", lineBreak=");
        sb.append((Object) C7918.m13414(c2064.f6115));
        sb.append(", hyphens=");
        sb.append((Object) C7919.m13415(c2064.f6114));
        sb.append(", textMotion=");
        sb.append(c2064.f6116);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m3738(C2031 c2031) {
        if (this != c2031) {
            return AbstractC4395.m8907(this.f5983, c2031.f5983) && this.f5984.m3765(c2031.f5984);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m3739() {
        return this.f5984.f6058.mo13417();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2031(C2047 c2047, C2064 c2064) {
        c2047.getClass();
        C2055 c2055 = c2064.f6109;
        this(c2047, c2064, c2055 == null ? null : new C2059(c2055));
    }

    public C2031(C2047 c2047, C2064 c2064, C2059 c2059) {
        this.f5984 = c2047;
        this.f5983 = c2064;
        this.f5982 = c2059;
    }
}
