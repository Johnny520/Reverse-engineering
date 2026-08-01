package androidx.compose.animation;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.ui.graphics.C1615;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC0311 f1283;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1284;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1285;

    public C0375(float f, long j, InterfaceC0311 interfaceC0311) {
        this.f1285 = f;
        this.f1284 = j;
        this.f1283 = interfaceC0311;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0375)) {
            return false;
        }
        C0375 c0375 = (C0375) obj;
        return Float.compare(this.f1285, c0375.f1285) == 0 && C1615.m2985(this.f1284, c0375.f1284) && this.f1283.equals(c0375.f1283);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f1285) * 31;
        int i = C1615.f4726;
        return this.f1283.hashCode() + AbstractC0053.m142(iHashCode, 31, this.f1284);
    }

    public final String toString() {
        return "Scale(scale=" + this.f1285 + ", transformOrigin=" + ((Object) C1615.m2984(this.f1284)) + ", animationSpec=" + this.f1283 + ')';
    }
}
