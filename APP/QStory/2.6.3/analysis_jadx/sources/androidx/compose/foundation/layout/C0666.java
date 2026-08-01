package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.unit.LayoutDirection;
import p180.AbstractC7754;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0666 implements InterfaceC0664 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f1847;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1848;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1849;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1850;

    public C0666(float f, float f2, float f3, float f4) {
        this.f1850 = f;
        this.f1849 = f2;
        this.f1848 = f3;
        this.f1847 = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            AbstractC7754.m13111("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0666)) {
            return false;
        }
        C0666 c0666 = (C0666) obj;
        return C7893.m13318(this.f1850, c0666.f1850) && C7893.m13318(this.f1849, c0666.f1849) && C7893.m13318(this.f1848, c0666.f1848) && C7893.m13318(this.f1847, c0666.f1847);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1847) + AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f1850) * 31, this.f1849, 31), this.f1848, 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) C7893.m13317(this.f1850)) + ", top=" + ((Object) C7893.m13317(this.f1849)) + ", end=" + ((Object) C7893.m13317(this.f1848)) + ", bottom=" + ((Object) C7893.m13317(this.f1847)) + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0664
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final float mo1461() {
        return this.f1849;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0664
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo1462(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f1848 : this.f1850;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0664
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1463(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f1850 : this.f1848;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0664
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo1464() {
        return this.f1847;
    }
}
