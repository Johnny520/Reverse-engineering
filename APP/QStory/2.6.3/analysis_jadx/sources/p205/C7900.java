package p205;

import androidx.activity.AbstractC0053;
import p204.InterfaceC7892;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7900 implements InterfaceC7892 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21869;

    public C7900(float f) {
        this.f21869 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7900) && Float.compare(this.f21869, ((C7900) obj).f21869) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21869);
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f21869, ')');
    }

    @Override // p204.InterfaceC7892
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo13313(float f) {
        return f * this.f21869;
    }

    @Override // p204.InterfaceC7892
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo13314(float f) {
        return f / this.f21869;
    }
}
