package androidx.compose.ui;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2117 implements InterfaceC2118 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f6255;

    public C2117(float f) {
        this.f6255 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2117) && Float.compare(this.f6255, ((C2117) obj).f6255) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f6255) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f6255 + ", verticalBias=-1.0)";
    }

    @Override // androidx.compose.ui.InterfaceC2118
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long mo3849(long j, long j2, LayoutDirection layoutDirection) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f)) & 4294967295L) | (((long) Math.round((1.0f + this.f6255) * (((int) (j3 >> 32)) / 2.0f))) << 32);
    }
}
