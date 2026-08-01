package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.unit.LayoutDirection;
import p196.AbstractC8583;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1507 implements InterfaceC1505 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f2192;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f2193;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f2194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f2195;

    public C1507(float f, float f2, float f3, float f4) {
        this.f2195 = f;
        this.f2194 = f2;
        this.f2193 = f3;
        this.f2192 = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            AbstractC8583.m13670("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1507)) {
            return false;
        }
        C1507 c1507 = (C1507) obj;
        return C8722.m13877(this.f2195, c1507.f2195) && C8722.m13877(this.f2194, c1507.f2194) && C8722.m13877(this.f2193, c1507.f2193) && C8722.m13877(this.f2192, c1507.f2192);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2192) + AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f2195) * 31, this.f2194, 31), this.f2193, 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) C8722.m13876(this.f2195)) + ", top=" + ((Object) C8722.m13876(this.f2194)) + ", end=" + ((Object) C8722.m13876(this.f2193)) + ", bottom=" + ((Object) C8722.m13876(this.f2192)) + ')';
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1505
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final float mo2021() {
        return this.f2194;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1505
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo2022(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f2193 : this.f2195;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1505
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo2023(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.f2195 : this.f2193;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC1505
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo2024() {
        return this.f2192;
    }
}
