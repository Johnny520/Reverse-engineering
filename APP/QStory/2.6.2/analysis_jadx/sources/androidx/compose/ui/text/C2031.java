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
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.Opcodes;
import p194.C7831;
import p205.C7898;
import p209.C7917;
import p209.C7918;
import p209.C7919;
import p209.C7921;
import p209.C7923;
import p209.C7926;
import p209.C7927;
import p209.C7930;
import p209.C7931;
import p209.C7932;
import p209.C7933;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2031 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2031 f5980 = new C2031(0, 0, null, 0, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2059 f5981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2064 f5982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2047 f5983;

    public C2031(long j, long j2, C1988 c1988, long j3, long j4, int i, long j5, int i2) {
        this(new C2047((i2 & 1) != 0 ? C1599.f4696 : j, (i2 & 2) != 0 ? C7898.f21869 : j2, (i2 & 4) != 0 ? null : c1988, null, null, null, null, (i2 & 128) != 0 ? C7898.f21869 : j3, null, null, null, (i2 & 2048) != 0 ? C1599.f4696 : j4, null, null), new C2064((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? C7898.f21869 : j5, null, null, null, 0, 0, null), null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2031 m3726(C2031 c2031, long j, long j2, C1988 c1988, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? C7898.f21869 : j2;
        C1988 c19882 = (i2 & 4) != 0 ? null : c1988;
        long j6 = (i2 & 128) != 0 ? C7898.f21869 : j3;
        long j7 = C1599.f4696;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? C7898.f21869 : j4;
        C2047 c2047M3752 = AbstractC2046.m3752(c2031.f5983, j, null, Float.NaN, j5, c19882, null, null, null, null, j6, null, null, null, j7, null, null, null);
        C2064 c2064M3773 = AbstractC2056.m3773(c2031.f5982, i3, 0, j8, null, null, null, 0, 0, null);
        return (c2031.f5983 == c2047M3752 && c2031.f5982 == c2064M3773) ? c2031 : new C2031(c2047M3752, c2064M3773);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2031 m3727(C2031 c2031, long j, C1988 c1988, AbstractC1993 abstractC1993, long j2, long j3, C7932 c7932, int i) {
        C7921 c7921;
        C7926 c7926;
        long j4;
        C2059 c2059 = AbstractC1120.f3266;
        long jMo13389 = c2031.f5983.f6057.mo13389();
        long j5 = (i & 2) != 0 ? c2031.f5983.f6056 : j;
        C1988 c19882 = (i & 4) != 0 ? c2031.f5983.f6055 : c1988;
        C2047 c2047 = c2031.f5983;
        C1990 c1990 = c2047.f6054;
        C1987 c1987 = c2047.f6053;
        AbstractC1993 abstractC19932 = (i & 32) != 0 ? c2047.f6052 : abstractC1993;
        String str = c2047.f6062;
        long j6 = (i & 128) != 0 ? c2047.f6061 : j2;
        C7921 c79212 = c2047.f6065;
        C7926 c79262 = c2047.f6066;
        C7831 c7831 = c2047.f6063;
        long j7 = c2047.f6064;
        C7930 c7930 = c2047.f6059;
        C1570 c1570 = c2047.f6058;
        AbstractC1505 abstractC1505 = c2047.f6060;
        C2064 c2064 = c2031.f5982;
        int i2 = c2064.f6112;
        int i3 = c2064.f6111;
        if ((i & 131072) != 0) {
            c7921 = c79212;
            c7926 = c79262;
            j4 = c2064.f6110;
        } else {
            c7921 = c79212;
            c7926 = c79262;
            j4 = j3;
        }
        C7927 c7927 = c2064.f6109;
        C2059 c20592 = (i & Opcodes.ASM8) != 0 ? c2031.f5981 : c2059;
        return new C2031(new C2047(C1599.m2939(jMo13389, c2047.f6057.mo13389()) ? c2047.f6057 : jMo13389 != 16 ? new C7919(jMo13389) : C7923.f21948, j5, c19882, c1990, c1987, abstractC19932, str, j6, c7921, c7926, c7831, j7, c7930, c1570, abstractC1505), new C2064(i2, i3, j4, c7927, c20592 != null ? c20592.f6095 : null, (i & 1048576) != 0 ? c2064.f6107 : c7932, c2064.f6114, c2064.f6113, c2064.f6115), c20592);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2031)) {
            return false;
        }
        C2031 c2031 = (C2031) obj;
        return AbstractC4394.m8917(this.f5983, c2031.f5983) && AbstractC4394.m8917(this.f5982, c2031.f5982) && AbstractC4394.m8917(this.f5981, c2031.f5981);
    }

    public final int hashCode() {
        int iHashCode = (this.f5982.hashCode() + (this.f5983.hashCode() * 31)) * 31;
        C2059 c2059 = this.f5981;
        return iHashCode + (c2059 != null ? c2059.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C1599.m2944(m3729()));
        sb.append(", brush=");
        C2047 c2047 = this.f5983;
        sb.append(c2047.f6057.mo13388());
        sb.append(", alpha=");
        sb.append(c2047.f6057.mo13390());
        sb.append(", fontSize=");
        sb.append((Object) C7898.m13314(c2047.f6056));
        sb.append(", fontWeight=");
        sb.append(c2047.f6055);
        sb.append(", fontStyle=");
        sb.append(c2047.f6054);
        sb.append(", fontSynthesis=");
        sb.append(c2047.f6053);
        sb.append(", fontFamily=");
        sb.append(c2047.f6052);
        sb.append(", fontFeatureSettings=");
        sb.append(c2047.f6062);
        sb.append(", letterSpacing=");
        sb.append((Object) C7898.m13314(c2047.f6061));
        sb.append(", baselineShift=");
        sb.append(c2047.f6065);
        sb.append(", textGeometricTransform=");
        sb.append(c2047.f6066);
        sb.append(", localeList=");
        sb.append(c2047.f6063);
        sb.append(", background=");
        AbstractC0053.m138(c2047.f6064, sb, ", textDecoration=");
        sb.append(c2047.f6059);
        sb.append(", shadow=");
        sb.append(c2047.f6058);
        sb.append(", drawStyle=");
        sb.append(c2047.f6060);
        sb.append(", textAlign=");
        C2064 c2064 = this.f5982;
        sb.append((Object) C7933.m13392(c2064.f6112));
        sb.append(", textDirection=");
        sb.append((Object) C7931.m13391(c2064.f6111));
        sb.append(", lineHeight=");
        sb.append((Object) C7898.m13314(c2064.f6110));
        sb.append(", textIndent=");
        sb.append(c2064.f6109);
        sb.append(", platformStyle=");
        sb.append(this.f5981);
        sb.append(", lineHeightStyle=");
        sb.append(c2064.f6107);
        sb.append(", lineBreak=");
        sb.append((Object) C7917.m13386(c2064.f6114));
        sb.append(", hyphens=");
        sb.append((Object) C7918.m13387(c2064.f6113));
        sb.append(", textMotion=");
        sb.append(c2064.f6115);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m3728(C2031 c2031) {
        if (this != c2031) {
            return AbstractC4394.m8917(this.f5982, c2031.f5982) && this.f5983.m3755(c2031.f5983);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m3729() {
        return this.f5983.f6057.mo13389();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2031(C2047 c2047, C2064 c2064) {
        c2047.getClass();
        C2055 c2055 = c2064.f6108;
        this(c2047, c2064, c2055 == null ? null : new C2059(c2055));
    }

    public C2031(C2047 c2047, C2064 c2064, C2059 c2059) {
        this.f5983 = c2047;
        this.f5982 = c2064;
        this.f5981 = c2059;
    }
}
