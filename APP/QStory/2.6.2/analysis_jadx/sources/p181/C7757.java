package p181;

import p205.C7892;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7757 implements InterfaceC7758 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21048;

    public C7757(float f) {
        this.f21048 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7757) && C7892.m13290(this.f21048, ((C7757) obj).f21048);
    }

    public final int hashCode() {
        return Float.hashCode(this.f21048);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f21048 + ".dp)";
    }

    @Override // p181.InterfaceC7758
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo13085(long j, InterfaceC7895 interfaceC7895) {
        return interfaceC7895.mo1334(this.f21048);
    }
}
