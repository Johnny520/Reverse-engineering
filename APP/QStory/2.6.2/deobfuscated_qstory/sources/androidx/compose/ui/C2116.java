package androidx.compose.ui;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2116 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f6254;

    public C2116(float f) {
        this.f6254 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2116) && Float.compare(this.f6254, ((C2116) obj).f6254) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6254);
    }

    public final String toString() {
        return AbstractC0053.m157(new StringBuilder("Horizontal(bias="), this.f6254, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m3848(int i, int i2, LayoutDirection layoutDirection) {
        float f = (i2 - i) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f2 = this.f6254;
        if (layoutDirection != layoutDirection2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }
}
