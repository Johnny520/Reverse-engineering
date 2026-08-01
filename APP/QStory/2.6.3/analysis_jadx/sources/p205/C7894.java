package p205;

import androidx.activity.AbstractC0053;
import androidx.window.area.AbstractC2567;
import p204.InterfaceC7892;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7894 implements InterfaceC7896 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f21860;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7892 f21861;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f21862;

    public C7894(float f, float f2, InterfaceC7892 interfaceC7892) {
        this.f21862 = f;
        this.f21860 = f2;
        this.f21861 = interfaceC7892;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7894)) {
            return false;
        }
        C7894 c7894 = (C7894) obj;
        return Float.compare(this.f21862, c7894.f21862) == 0 && Float.compare(this.f21860, c7894.f21860) == 0 && this.f21861.equals(c7894.f21861);
    }

    public final int hashCode() {
        return this.f21861.hashCode() + AbstractC0053.m145(Float.hashCode(this.f21862) * 31, this.f21860, 31);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f21862 + ", fontScale=" + this.f21860 + ", converter=" + this.f21861 + ')';
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f21862;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1340(float f) {
        return AbstractC2567.m5062(this.f21861.mo13314(f), 4294967296L);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1341(long j) {
        if (C7901.m13346(C7899.m13344(j), 4294967296L)) {
            return this.f21861.mo13313(C7899.m13343(j));
        }
        C5925.m11311("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f21860;
    }
}
