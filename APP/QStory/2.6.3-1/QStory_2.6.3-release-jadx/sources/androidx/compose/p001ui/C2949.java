package androidx.compose.p001ui;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2949 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f6600;

    public C2949(float f) {
        this.f6600 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2949) && Float.compare(this.f6600, ((C2949) obj).f6600) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6600);
    }

    public final String toString() {
        return AbstractC0900.m715(new StringBuilder("Horizontal(bias="), this.f6600, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m4418(int i, int i2, LayoutDirection layoutDirection) {
        float f = (i2 - i) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f2 = this.f6600;
        if (layoutDirection != layoutDirection2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }
}
