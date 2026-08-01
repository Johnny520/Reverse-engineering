package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import kotlin.jvm.internal.AbstractC5227;
import p210.C8661;
import p221.C8728;
import p221.C8730;
import p225.C8749;
import p225.C8751;
import p225.C8753;
import p225.C8756;
import p225.C8760;
import p225.InterfaceC8752;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2881 implements InterfaceC2887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC2827 f6398;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2821 f6399;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2824 f6400;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2822 f6401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f6402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8752 f6403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C2405 f6404;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8760 f6405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AbstractC2340 f6406;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f6407;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f6408;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C8661 f6409;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long f6410;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8751 f6411;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8756 f6412;

    public C2881(long j, long j2, C2822 c2822, C2824 c2824, C2821 c2821, AbstractC2827 abstractC2827, String str, long j3, C8751 c8751, C8756 c8756, C8661 c8661, long j4, C8760 c8760, C2405 c2405, int i) {
        this((i & 1) != 0 ? C2434.f5042 : j, (i & 2) != 0 ? C8728.f22211 : j2, (i & 4) != 0 ? null : c2822, (i & 8) != 0 ? null : c2824, (i & 16) != 0 ? null : c2821, (i & 32) != 0 ? null : abstractC2827, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C8728.f22211 : j3, (i & 256) != 0 ? null : c8751, (i & 512) != 0 ? null : c8756, (i & 1024) != 0 ? null : c8661, (i & 2048) != 0 ? C2434.f5042 : j4, (i & 4096) != 0 ? null : c8760, (i & 8192) != 0 ? null : c2405);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2881)) {
            return false;
        }
        C2881 c2881 = (C2881) obj;
        return m4325(c2881) && m4324(c2881);
    }

    public final int hashCode() {
        InterfaceC8752 interfaceC8752 = this.f6403;
        long jMo13976 = interfaceC8752.mo13976();
        int i = C2434.f5044;
        int iHashCode = Long.hashCode(jMo13976) * 31;
        AbstractC2433 abstractC2433Mo13975 = interfaceC8752.mo13975();
        int iHashCode2 = (Float.hashCode(interfaceC8752.mo13977()) + ((iHashCode + (abstractC2433Mo13975 != null ? abstractC2433Mo13975.hashCode() : 0)) * 31)) * 31;
        C8730[] c8730Arr = C8728.f22212;
        int iM702 = AbstractC0900.m702(iHashCode2, 31, this.f6402);
        C2822 c2822 = this.f6401;
        int i2 = (iM702 + (c2822 != null ? c2822.f6222 : 0)) * 31;
        C2824 c2824 = this.f6400;
        int iHashCode3 = (i2 + (c2824 != null ? Integer.hashCode(c2824.f6225) : 0)) * 31;
        C2821 c2821 = this.f6399;
        int iHashCode4 = (iHashCode3 + (c2821 != null ? Integer.hashCode(c2821.f6215) : 0)) * 31;
        AbstractC2827 abstractC2827 = this.f6398;
        int iHashCode5 = (iHashCode4 + (abstractC2827 != null ? abstractC2827.hashCode() : 0)) * 31;
        String str = this.f6408;
        int iM7022 = AbstractC0900.m702((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f6407);
        C8751 c8751 = this.f6411;
        int iHashCode6 = (iM7022 + (c8751 != null ? Float.hashCode(c8751.f22289) : 0)) * 31;
        C8756 c8756 = this.f6412;
        int iHashCode7 = (iHashCode6 + (c8756 != null ? c8756.hashCode() : 0)) * 31;
        C8661 c8661 = this.f6409;
        int iM7023 = AbstractC0900.m702((iHashCode7 + (c8661 != null ? c8661.f21719.hashCode() : 0)) * 31, 31, this.f6410);
        C8760 c8760 = this.f6405;
        int i3 = (iM7023 + (c8760 != null ? c8760.f22307 : 0)) * 31;
        C2405 c2405 = this.f6404;
        int iHashCode8 = (i3 + (c2405 != null ? c2405.hashCode() : 0)) * 961;
        AbstractC2340 abstractC2340 = this.f6406;
        return iHashCode8 + (abstractC2340 != null ? abstractC2340.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        InterfaceC8752 interfaceC8752 = this.f6403;
        sb.append((Object) C2434.m3514(interfaceC8752.mo13976()));
        sb.append(", brush=");
        sb.append(interfaceC8752.mo13975());
        sb.append(", alpha=");
        sb.append(interfaceC8752.mo13977());
        sb.append(", fontSize=");
        sb.append((Object) C8728.m13901(this.f6402));
        sb.append(", fontWeight=");
        sb.append(this.f6401);
        sb.append(", fontStyle=");
        sb.append(this.f6400);
        sb.append(", fontSynthesis=");
        sb.append(this.f6399);
        sb.append(", fontFamily=");
        sb.append(this.f6398);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f6408);
        sb.append(", letterSpacing=");
        sb.append((Object) C8728.m13901(this.f6407));
        sb.append(", baselineShift=");
        sb.append(this.f6411);
        sb.append(", textGeometricTransform=");
        sb.append(this.f6412);
        sb.append(", localeList=");
        sb.append(this.f6409);
        sb.append(", background=");
        AbstractC0900.m698(this.f6410, sb, ", textDecoration=");
        sb.append(this.f6405);
        sb.append(", shadow=");
        sb.append(this.f6404);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f6406);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2881 m4323(C2881 c2881) {
        if (c2881 == null) {
            return this;
        }
        InterfaceC8752 interfaceC8752 = c2881.f6403;
        return AbstractC2880.m4322(this, interfaceC8752.mo13976(), interfaceC8752.mo13975(), interfaceC8752.mo13977(), c2881.f6402, c2881.f6401, c2881.f6400, c2881.f6399, c2881.f6398, c2881.f6408, c2881.f6407, c2881.f6411, c2881.f6412, c2881.f6409, c2881.f6410, c2881.f6405, c2881.f6404, c2881.f6406);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m4324(C2881 c2881) {
        return AbstractC5227.m9466(this.f6403, c2881.f6403) && AbstractC5227.m9466(this.f6405, c2881.f6405) && AbstractC5227.m9466(this.f6404, c2881.f6404) && AbstractC5227.m9466(this.f6406, c2881.f6406);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m4325(C2881 c2881) {
        if (this == c2881) {
            return true;
        }
        return C8728.m13904(this.f6402, c2881.f6402) && AbstractC5227.m9466(this.f6401, c2881.f6401) && AbstractC5227.m9466(this.f6400, c2881.f6400) && AbstractC5227.m9466(this.f6399, c2881.f6399) && AbstractC5227.m9466(this.f6398, c2881.f6398) && AbstractC5227.m9466(this.f6408, c2881.f6408) && C8728.m13904(this.f6407, c2881.f6407) && AbstractC5227.m9466(this.f6411, c2881.f6411) && AbstractC5227.m9466(this.f6412, c2881.f6412) && AbstractC5227.m9466(this.f6409, c2881.f6409) && C2434.m3509(this.f6410, c2881.f6410);
    }

    public C2881(InterfaceC8752 interfaceC8752, long j, C2822 c2822, C2824 c2824, C2821 c2821, AbstractC2827 abstractC2827, String str, long j2, C8751 c8751, C8756 c8756, C8661 c8661, long j3, C8760 c8760, C2405 c2405, AbstractC2340 abstractC2340) {
        this.f6403 = interfaceC8752;
        this.f6402 = j;
        this.f6401 = c2822;
        this.f6400 = c2824;
        this.f6399 = c2821;
        this.f6398 = abstractC2827;
        this.f6408 = str;
        this.f6407 = j2;
        this.f6411 = c8751;
        this.f6412 = c8756;
        this.f6409 = c8661;
        this.f6410 = j3;
        this.f6405 = c8760;
        this.f6404 = c2405;
        this.f6406 = abstractC2340;
    }

    public C2881(long j, long j2, C2822 c2822, C2824 c2824, C2821 c2821, AbstractC2827 abstractC2827, String str, long j3, C8751 c8751, C8756 c8756, C8661 c8661, long j4, C8760 c8760, C2405 c2405) {
        this(j != 16 ? new C8749(j) : C8753.f22290, j2, c2822, c2824, c2821, abstractC2827, str, j3, c8751, c8756, c8661, j4, c8760, c2405, (AbstractC2340) null);
    }
}
