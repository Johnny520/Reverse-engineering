package p197;

import p128.C8155;
import p192.AbstractC8570;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8586 implements InterfaceC8588 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21389;

    public C8586(float f) {
        this.f21389 = f;
        if (f < 0.0f || f > 100.0f) {
            AbstractC8570.m13656("The percent should be in the range of [0, 100]");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8586) && Float.compare(this.f21389, ((C8586) obj).f21389) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21389);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f21389 + "%)";
    }

    @Override // p197.InterfaceC8588
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo13672(long j, InterfaceC8725 interfaceC8725) {
        return (this.f21389 / 100.0f) * C8155.m13073(j);
    }
}
