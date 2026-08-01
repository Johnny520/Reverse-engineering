package p225;

import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2434;
import p211.AbstractC8663;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8749 implements InterfaceC8752 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f22286;

    public C8749(long j) {
        this.f22286 = j;
        if (j != 16) {
            return;
        }
        AbstractC8663.m13757("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8749) && C2434.m3509(this.f22286, ((C8749) obj).f22286);
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Long.hashCode(this.f22286);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C2434.m3514(this.f22286)) + ')';
    }

    @Override // p225.InterfaceC8752
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2433 mo13975() {
        return null;
    }

    @Override // p225.InterfaceC8752
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long mo13976() {
        return this.f22286;
    }

    @Override // p225.InterfaceC8752
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo13977() {
        return C2434.m3508(this.f22286);
    }
}
