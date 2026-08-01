package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p211.AbstractC8663;
import p221.C8728;
import p221.C8730;
import p225.C8747;
import p225.C8748;
import p225.C8755;
import p225.C8757;
import p225.C8761;
import p225.C8762;
import p225.C8763;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2898 implements InterfaceC2887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8762 f6453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2889 f6454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8757 f6455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f6456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6457;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6458;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f6459;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f6460;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8755 f6461;

    public C2898(int i, int i2, long j, C8757 c8757, C2889 c2889, C8762 c8762, int i3, int i4, C8755 c8755) {
        this.f6458 = i;
        this.f6457 = i2;
        this.f6456 = j;
        this.f6455 = c8757;
        this.f6454 = c2889;
        this.f6453 = c8762;
        this.f6460 = i3;
        this.f6459 = i4;
        this.f6461 = c8755;
        if (C8728.m13904(j, C8728.f22211) || C8728.m13902(j) >= 0.0f) {
            return;
        }
        AbstractC8663.m13756("lineHeight can't be negative (" + C8728.m13902(j) + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2898)) {
            return false;
        }
        C2898 c2898 = (C2898) obj;
        return this.f6458 == c2898.f6458 && this.f6457 == c2898.f6457 && C8728.m13904(this.f6456, c2898.f6456) && AbstractC5227.m9466(this.f6455, c2898.f6455) && AbstractC5227.m9466(this.f6454, c2898.f6454) && AbstractC5227.m9466(this.f6453, c2898.f6453) && this.f6460 == c2898.f6460 && this.f6459 == c2898.f6459 && AbstractC5227.m9466(this.f6461, c2898.f6461);
    }

    public final int hashCode() {
        int iM704 = AbstractC0900.m704(this.f6457, Integer.hashCode(this.f6458) * 31, 31);
        C8730[] c8730Arr = C8728.f22212;
        int iM702 = AbstractC0900.m702(iM704, 31, this.f6456);
        C8757 c8757 = this.f6455;
        int iHashCode = (iM702 + (c8757 != null ? c8757.hashCode() : 0)) * 31;
        C2889 c2889 = this.f6454;
        int iHashCode2 = (iHashCode + (c2889 != null ? c2889.hashCode() : 0)) * 31;
        C8762 c8762 = this.f6453;
        int iM7042 = AbstractC0900.m704(this.f6459, AbstractC0900.m704(this.f6460, (iHashCode2 + (c8762 != null ? c8762.hashCode() : 0)) * 31, 31), 31);
        C8755 c8755 = this.f6461;
        return iM7042 + (c8755 != null ? c8755.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C8763.m13979(this.f6458)) + ", textDirection=" + ((Object) C8761.m13978(this.f6457)) + ", lineHeight=" + ((Object) C8728.m13901(this.f6456)) + ", textIndent=" + this.f6455 + ", platformStyle=" + this.f6454 + ", lineHeightStyle=" + this.f6453 + ", lineBreak=" + ((Object) C8747.m13973(this.f6460)) + ", hyphens=" + ((Object) C8748.m13974(this.f6459)) + ", textMotion=" + this.f6461 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2898 m4357(C2898 c2898) {
        return c2898 == null ? this : AbstractC2890.m4343(this, c2898.f6458, c2898.f6457, c2898.f6456, c2898.f6455, c2898.f6454, c2898.f6453, c2898.f6460, c2898.f6459, c2898.f6461);
    }
}
