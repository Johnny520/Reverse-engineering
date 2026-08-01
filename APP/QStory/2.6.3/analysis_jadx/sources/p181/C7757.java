package p181;

import p112.C7326;
import p176.AbstractC7741;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7757 implements InterfaceC7759 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21044;

    public C7757(float f) {
        this.f21044 = f;
        if (f < 0.0f || f > 100.0f) {
            AbstractC7741.m13097("The percent should be in the range of [0, 100]");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7757) && Float.compare(this.f21044, ((C7757) obj).f21044) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21044);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f21044 + "%)";
    }

    @Override // p181.InterfaceC7759
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo13113(long j, InterfaceC7896 interfaceC7896) {
        return (this.f21044 / 100.0f) * C7326.m12514(j);
    }
}
