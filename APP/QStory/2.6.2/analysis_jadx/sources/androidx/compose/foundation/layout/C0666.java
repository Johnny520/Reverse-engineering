package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.unit.LayoutDirection;
import p180.AbstractC7753;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0666 implements InterfaceC0664 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f1846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1847;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1848;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1849;

    public C0666(float f, float f2, float f3, float f4) {
        this.f1849 = f;
        this.f1848 = f2;
        this.f1847 = f3;
        this.f1846 = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            AbstractC7753.m13083("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0666)) {
            return false;
        }
        C0666 c0666 = (C0666) obj;
        return C7892.m13290(this.f1849, c0666.f1849) && C7892.m13290(this.f1848, c0666.f1848) && C7892.m13290(this.f1847, c0666.f1847) && C7892.m13290(this.f1846, c0666.f1846);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1846) + AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f1849) * 31, this.f1848, 31), this.f1847, 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) C7892.m13289(this.f1849)) + ", top=" + ((Object) C7892.m13289(this.f1848)) + ", end=" + ((Object) C7892.m13289(this.f1847)) + ", bottom=" + ((Object) C7892.m13289(this.f1846)) + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0664
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final float mo1451() {
        return this.f1848;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0664
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo1452(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f1847 : this.f1849;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0664
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1453(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f1849 : this.f1847;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0664
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo1454() {
        return this.f1846;
    }
}
