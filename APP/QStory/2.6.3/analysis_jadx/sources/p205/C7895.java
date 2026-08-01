package p205;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7895 implements InterfaceC7896 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f21863;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f21864;

    public C7895(float f, float f2) {
        this.f21864 = f;
        this.f21863 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7895)) {
            return false;
        }
        C7895 c7895 = (C7895) obj;
        return Float.compare(this.f21864, c7895.f21864) == 0 && Float.compare(this.f21863, c7895.f21863) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21863) + (Float.hashCode(this.f21864) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f21864);
        sb.append(", fontScale=");
        return AbstractC0053.m155(sb, this.f21863, ')');
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f21864;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f21863;
    }
}
