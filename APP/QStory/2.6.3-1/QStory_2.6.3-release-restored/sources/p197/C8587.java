package p197;

import p221.C8722;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8587 implements InterfaceC8588 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21390;

    public C8587(float f) {
        this.f21390 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8587) && C8722.m13877(this.f21390, ((C8587) obj).f21390);
    }

    public final int hashCode() {
        return Float.hashCode(this.f21390);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f21390 + ".dp)";
    }

    @Override // p197.InterfaceC8588
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo13672(long j, InterfaceC8725 interfaceC8725) {
        return interfaceC8725.mo1904(this.f21390);
    }
}
