package p221;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8724 implements InterfaceC8725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f22208;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f22209;

    public C8724(float f, float f2) {
        this.f22209 = f;
        this.f22208 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8724)) {
            return false;
        }
        C8724 c8724 = (C8724) obj;
        return Float.compare(this.f22209, c8724.f22209) == 0 && Float.compare(this.f22208, c8724.f22208) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22208) + (Float.hashCode(this.f22209) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f22209);
        sb.append(", fontScale=");
        return AbstractC0900.m715(sb, this.f22208, ')');
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f22209;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f22208;
    }
}
