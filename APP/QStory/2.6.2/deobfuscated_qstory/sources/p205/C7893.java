package p205;

import androidx.activity.AbstractC0053;
import p204.InterfaceC7891;
import p392.AbstractC9124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7893 implements InterfaceC7895 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f21863;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7891 f21864;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f21865;

    public C7893(float f, float f2, InterfaceC7891 interfaceC7891) {
        this.f21865 = f;
        this.f21863 = f2;
        this.f21864 = interfaceC7891;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7893)) {
            return false;
        }
        C7893 c7893 = (C7893) obj;
        return Float.compare(this.f21865, c7893.f21865) == 0 && Float.compare(this.f21863, c7893.f21863) == 0 && this.f21864.equals(c7893.f21864);
    }

    public final int hashCode() {
        return this.f21864.hashCode() + AbstractC0053.m144(Float.hashCode(this.f21865) * 31, this.f21863, 31);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f21865 + ", fontScale=" + this.f21863 + ", converter=" + this.f21864 + ')';
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f21865;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1330(float f) {
        return AbstractC9124.m14667(this.f21864.mo13286(f), 4294967296L);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1331(long j) {
        if (C7900.m13318(C7898.m13316(j), 4294967296L)) {
            return this.f21864.mo13285(C7898.m13315(j));
        }
        C5919.m11250("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f21863;
    }
}
