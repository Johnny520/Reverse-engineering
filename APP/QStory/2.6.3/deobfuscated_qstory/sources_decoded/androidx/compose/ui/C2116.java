package androidx.compose.ui;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2116 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f6255;

    public C2116(float f) {
        this.f6255 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2116) && Float.compare(this.f6255, ((C2116) obj).f6255) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6255);
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("Horizontal(bias="), this.f6255, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m3858(int i, int i2, LayoutDirection layoutDirection) {
        float f = (i2 - i) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f2 = this.f6255;
        if (layoutDirection != layoutDirection2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }
}
