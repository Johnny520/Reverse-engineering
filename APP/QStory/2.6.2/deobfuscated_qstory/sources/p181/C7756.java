package p181;

import p112.C7325;
import p176.AbstractC7740;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7756 implements InterfaceC7758 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21047;

    public C7756(float f) {
        this.f21047 = f;
        if (f < 0.0f || f > 100.0f) {
            AbstractC7740.m13069("The percent should be in the range of [0, 100]");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7756) && Float.compare(this.f21047, ((C7756) obj).f21047) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21047);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f21047 + "%)";
    }

    @Override // p181.InterfaceC7758
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo13085(long j, InterfaceC7895 interfaceC7895) {
        return (this.f21047 / 100.0f) * C7325.m12487(j);
    }
}
