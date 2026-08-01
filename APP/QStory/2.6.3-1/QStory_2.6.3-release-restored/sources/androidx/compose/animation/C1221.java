package androidx.compose.animation;

import androidx.activity.AbstractC0900;
import androidx.compose.animation.core.InterfaceC1157;
import androidx.compose.p001ui.graphics.C2450;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1221 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1157 f1628;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1630;

    public C1221(float f, long j, InterfaceC1157 interfaceC1157) {
        this.f1630 = f;
        this.f1629 = j;
        this.f1628 = interfaceC1157;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1221)) {
            return false;
        }
        C1221 c1221 = (C1221) obj;
        return Float.compare(this.f1630, c1221.f1630) == 0 && C2450.m3545(this.f1629, c1221.f1629) && this.f1628.equals(c1221.f1628);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f1630) * 31;
        int i = C2450.f5071;
        return this.f1628.hashCode() + AbstractC0900.m702(iHashCode, 31, this.f1629);
    }

    public final String toString() {
        return "Scale(scale=" + this.f1630 + ", transformOrigin=" + ((Object) C2450.m3544(this.f1629)) + ", animationSpec=" + this.f1628 + ')';
    }
}
