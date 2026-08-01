package p221;

import androidx.activity.AbstractC0900;
import p220.InterfaceC8721;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8729 implements InterfaceC8721 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f22214;

    public C8729(float f) {
        this.f22214 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8729) && Float.compare(this.f22214, ((C8729) obj).f22214) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22214);
    }

    public final String toString() {
        return AbstractC0900.m715(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f22214, ')');
    }

    @Override // p220.InterfaceC8721
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo13872(float f) {
        return f * this.f22214;
    }

    @Override // p220.InterfaceC8721
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo13873(float f) {
        return f / this.f22214;
    }
}
