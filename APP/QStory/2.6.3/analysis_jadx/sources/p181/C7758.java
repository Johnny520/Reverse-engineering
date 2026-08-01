package p181;

import p205.C7893;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7758 implements InterfaceC7759 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21045;

    public C7758(float f) {
        this.f21045 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7758) && C7893.m13318(this.f21045, ((C7758) obj).f21045);
    }

    public final int hashCode() {
        return Float.hashCode(this.f21045);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f21045 + ".dp)";
    }

    @Override // p181.InterfaceC7759
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo13113(long j, InterfaceC7896 interfaceC7896) {
        return interfaceC7896.mo1344(this.f21045);
    }
}
