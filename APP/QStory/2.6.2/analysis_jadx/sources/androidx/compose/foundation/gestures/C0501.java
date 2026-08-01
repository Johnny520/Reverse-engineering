package androidx.compose.foundation.gestures;

import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0501 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f1484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Orientation f1485;

    public /* synthetic */ C0501(Orientation orientation, int i) {
        this(0L, (i & 1) != 0 ? null : orientation);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m1250(long j) {
        return Float.intBitsToFloat((int) (this.f1485 == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m1251(float f, long j, boolean z) {
        long jM12498;
        long j2 = this.f1484;
        if (z) {
            jM12498 = C7328.m12498(j2, j);
            this.f1484 = jM12498;
        } else {
            jM12498 = C7328.m12498(j2, j);
        }
        if ((this.f1485 == null ? C7328.m12500(jM12498) : Math.abs(m1250(jM12498))) < f) {
            return 9205357640488583168L;
        }
        Orientation orientation = this.f1485;
        long j3 = this.f1484;
        if (orientation == null) {
            return C7328.m12499(this.f1484, C7328.m12505(f, C7328.m12502(C7328.m12500(j3), j3)));
        }
        float fM1250 = m1250(j3) - (Math.signum(m1250(this.f1484)) * f);
        long j4 = this.f1484;
        Orientation orientation2 = this.f1485;
        Orientation orientation3 = Orientation.Horizontal;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation2 == orientation3 ? j4 & 4294967295L : j4 >> 32));
        if (this.f1485 != orientation3) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fM1250)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM1250)) << 32);
    }

    public C0501(long j, Orientation orientation) {
        this.f1485 = orientation;
        this.f1484 = j;
    }
}
