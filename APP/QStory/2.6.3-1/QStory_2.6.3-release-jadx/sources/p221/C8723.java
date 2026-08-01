package p221;

import androidx.activity.AbstractC0900;
import androidx.window.area.AbstractC3400;
import p220.InterfaceC8721;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8723 implements InterfaceC8725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f22205;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8721 f22206;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f22207;

    public C8723(float f, float f2, InterfaceC8721 interfaceC8721) {
        this.f22207 = f;
        this.f22205 = f2;
        this.f22206 = interfaceC8721;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8723)) {
            return false;
        }
        C8723 c8723 = (C8723) obj;
        return Float.compare(this.f22207, c8723.f22207) == 0 && Float.compare(this.f22205, c8723.f22205) == 0 && this.f22206.equals(c8723.f22206);
    }

    public final int hashCode() {
        return this.f22206.hashCode() + AbstractC0900.m705(Float.hashCode(this.f22207) * 31, this.f22205, 31);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f22207 + ", fontScale=" + this.f22205 + ", converter=" + this.f22206 + ')';
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f22207;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1900(float f) {
        return AbstractC3400.m5622(this.f22206.mo13873(f), 4294967296L);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1901(long j) {
        if (C8730.m13905(C8728.m13903(j), 4294967296L)) {
            return this.f22206.mo13872(C8728.m13902(j));
        }
        C6755.m11870("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f22205;
    }
}
