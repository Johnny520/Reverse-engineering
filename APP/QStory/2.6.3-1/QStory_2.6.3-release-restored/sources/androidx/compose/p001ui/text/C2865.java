package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import androidx.compose.material3.internal.AbstractC1955;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.Opcodes;
import p210.C8661;
import p221.C8728;
import p225.C8747;
import p225.C8748;
import p225.C8749;
import p225.C8751;
import p225.C8753;
import p225.C8756;
import p225.C8757;
import p225.C8760;
import p225.C8761;
import p225.C8762;
import p225.C8763;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2865 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2865 f6326 = new C2865(0, 0, null, 0, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2893 f6327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2898 f6328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2881 f6329;

    public C2865(long j, long j2, C2822 c2822, long j3, long j4, int i, long j5, int i2) {
        this(new C2881((i2 & 1) != 0 ? C2434.f5042 : j, (i2 & 2) != 0 ? C8728.f22211 : j2, (i2 & 4) != 0 ? null : c2822, null, null, null, null, (i2 & 128) != 0 ? C8728.f22211 : j3, null, null, null, (i2 & 2048) != 0 ? C2434.f5042 : j4, null, null), new C2898((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? C8728.f22211 : j5, null, null, null, 0, 0, null), null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2865 m4296(C2865 c2865, long j, long j2, C2822 c2822, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? C8728.f22211 : j2;
        C2822 c28222 = (i2 & 4) != 0 ? null : c2822;
        long j6 = (i2 & 128) != 0 ? C8728.f22211 : j3;
        long j7 = C2434.f5042;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? C8728.f22211 : j4;
        C2881 c2881M4322 = AbstractC2880.m4322(c2865.f6329, j, null, Float.NaN, j5, c28222, null, null, null, null, j6, null, null, null, j7, null, null, null);
        C2898 c2898M4343 = AbstractC2890.m4343(c2865.f6328, i3, 0, j8, null, null, null, 0, 0, null);
        return (c2865.f6329 == c2881M4322 && c2865.f6328 == c2898M4343) ? c2865 : new C2865(c2881M4322, c2898M4343);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2865 m4297(C2865 c2865, long j, C2822 c2822, AbstractC2827 abstractC2827, long j2, long j3, C8762 c8762, int i) {
        C8751 c8751;
        C8756 c8756;
        long j4;
        C2893 c2893 = AbstractC1955.f3612;
        long jMo13976 = c2865.f6329.f6403.mo13976();
        long j5 = (i & 2) != 0 ? c2865.f6329.f6402 : j;
        C2822 c28222 = (i & 4) != 0 ? c2865.f6329.f6401 : c2822;
        C2881 c2881 = c2865.f6329;
        C2824 c2824 = c2881.f6400;
        C2821 c2821 = c2881.f6399;
        AbstractC2827 abstractC28272 = (i & 32) != 0 ? c2881.f6398 : abstractC2827;
        String str = c2881.f6408;
        long j6 = (i & 128) != 0 ? c2881.f6407 : j2;
        C8751 c87512 = c2881.f6411;
        C8756 c87562 = c2881.f6412;
        C8661 c8661 = c2881.f6409;
        long j7 = c2881.f6410;
        C8760 c8760 = c2881.f6405;
        C2405 c2405 = c2881.f6404;
        AbstractC2340 abstractC2340 = c2881.f6406;
        C2898 c2898 = c2865.f6328;
        int i2 = c2898.f6458;
        int i3 = c2898.f6457;
        if ((i & 131072) != 0) {
            c8751 = c87512;
            c8756 = c87562;
            j4 = c2898.f6456;
        } else {
            c8751 = c87512;
            c8756 = c87562;
            j4 = j3;
        }
        C8757 c8757 = c2898.f6455;
        C2893 c28932 = (i & Opcodes.ASM8) != 0 ? c2865.f6327 : c2893;
        return new C2865(new C2881(C2434.m3509(jMo13976, c2881.f6403.mo13976()) ? c2881.f6403 : jMo13976 != 16 ? new C8749(jMo13976) : C8753.f22290, j5, c28222, c2824, c2821, abstractC28272, str, j6, c8751, c8756, c8661, j7, c8760, c2405, abstractC2340), new C2898(i2, i3, j4, c8757, c28932 != null ? c28932.f6441 : null, (i & 1048576) != 0 ? c2898.f6453 : c8762, c2898.f6460, c2898.f6459, c2898.f6461), c28932);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2865)) {
            return false;
        }
        C2865 c2865 = (C2865) obj;
        return AbstractC5227.m9466(this.f6329, c2865.f6329) && AbstractC5227.m9466(this.f6328, c2865.f6328) && AbstractC5227.m9466(this.f6327, c2865.f6327);
    }

    public final int hashCode() {
        int iHashCode = (this.f6328.hashCode() + (this.f6329.hashCode() * 31)) * 31;
        C2893 c2893 = this.f6327;
        return iHashCode + (c2893 != null ? c2893.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C2434.m3514(m4299()));
        sb.append(", brush=");
        C2881 c2881 = this.f6329;
        sb.append(c2881.f6403.mo13975());
        sb.append(", alpha=");
        sb.append(c2881.f6403.mo13977());
        sb.append(", fontSize=");
        sb.append((Object) C8728.m13901(c2881.f6402));
        sb.append(", fontWeight=");
        sb.append(c2881.f6401);
        sb.append(", fontStyle=");
        sb.append(c2881.f6400);
        sb.append(", fontSynthesis=");
        sb.append(c2881.f6399);
        sb.append(", fontFamily=");
        sb.append(c2881.f6398);
        sb.append(", fontFeatureSettings=");
        sb.append(c2881.f6408);
        sb.append(", letterSpacing=");
        sb.append((Object) C8728.m13901(c2881.f6407));
        sb.append(", baselineShift=");
        sb.append(c2881.f6411);
        sb.append(", textGeometricTransform=");
        sb.append(c2881.f6412);
        sb.append(", localeList=");
        sb.append(c2881.f6409);
        sb.append(", background=");
        AbstractC0900.m698(c2881.f6410, sb, ", textDecoration=");
        sb.append(c2881.f6405);
        sb.append(", shadow=");
        sb.append(c2881.f6404);
        sb.append(", drawStyle=");
        sb.append(c2881.f6406);
        sb.append(", textAlign=");
        C2898 c2898 = this.f6328;
        sb.append((Object) C8763.m13979(c2898.f6458));
        sb.append(", textDirection=");
        sb.append((Object) C8761.m13978(c2898.f6457));
        sb.append(", lineHeight=");
        sb.append((Object) C8728.m13901(c2898.f6456));
        sb.append(", textIndent=");
        sb.append(c2898.f6455);
        sb.append(", platformStyle=");
        sb.append(this.f6327);
        sb.append(", lineHeightStyle=");
        sb.append(c2898.f6453);
        sb.append(", lineBreak=");
        sb.append((Object) C8747.m13973(c2898.f6460));
        sb.append(", hyphens=");
        sb.append((Object) C8748.m13974(c2898.f6459));
        sb.append(", textMotion=");
        sb.append(c2898.f6461);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m4298(C2865 c2865) {
        if (this != c2865) {
            return AbstractC5227.m9466(this.f6328, c2865.f6328) && this.f6329.m4325(c2865.f6329);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m4299() {
        return this.f6329.f6403.mo13976();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2865(C2881 c2881, C2898 c2898) {
        c2881.getClass();
        C2889 c2889 = c2898.f6454;
        this(c2881, c2898, c2889 == null ? null : new C2893(c2889));
    }

    public C2865(C2881 c2881, C2898 c2898, C2893 c2893) {
        this.f6329 = c2881;
        this.f6328 = c2898;
        this.f6327 = c2893;
    }
}
