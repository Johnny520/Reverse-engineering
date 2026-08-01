package androidx.compose.p001ui;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2964 implements InterfaceC2951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f6640;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f6641;

    public C2964(float f, float f2) {
        this.f6641 = f;
        this.f6640 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2964)) {
            return false;
        }
        C2964 c2964 = (C2964) obj;
        return Float.compare(this.f6641, c2964.f6641) == 0 && Float.compare(this.f6640, c2964.f6640) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6640) + (Float.hashCode(this.f6641) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f6641);
        sb.append(", verticalBias=");
        return AbstractC0900.m715(sb, this.f6640, ')');
    }

    @Override // androidx.compose.p001ui.InterfaceC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo4419(long j, long j2, LayoutDirection layoutDirection) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f3 = this.f6641;
        if (layoutDirection != layoutDirection2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.f6640) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }
}
