package androidx.compose.p001ui;

import androidx.compose.p001ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2950 implements InterfaceC2951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f6601;

    public C2950(float f) {
        this.f6601 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2950) && Float.compare(this.f6601, ((C2950) obj).f6601) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f6601) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f6601 + ", verticalBias=-1.0)";
    }

    @Override // androidx.compose.p001ui.InterfaceC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long mo4419(long j, long j2, LayoutDirection layoutDirection) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f)) & 4294967295L) | (((long) Math.round((1.0f + this.f6601) * (((int) (j3 >> 32)) / 2.0f))) << 32);
    }
}
