package androidx.compose.foundation.gestures;

import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1342 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f1830;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Orientation f1831;

    public /* synthetic */ C1342(Orientation orientation, int i) {
        this(0L, (i & 1) != 0 ? null : orientation);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m1820(long j) {
        return Float.intBitsToFloat((int) (this.f1831 == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m1821(float f, long j, boolean z) {
        long jM13084;
        long j2 = this.f1830;
        if (z) {
            jM13084 = C8158.m13084(j2, j);
            this.f1830 = jM13084;
        } else {
            jM13084 = C8158.m13084(j2, j);
        }
        if ((this.f1831 == null ? C8158.m13086(jM13084) : Math.abs(m1820(jM13084))) < f) {
            return 9205357640488583168L;
        }
        Orientation orientation = this.f1831;
        long j3 = this.f1830;
        if (orientation == null) {
            return C8158.m13085(this.f1830, C8158.m13091(f, C8158.m13088(C8158.m13086(j3), j3)));
        }
        float fM1820 = m1820(j3) - (Math.signum(m1820(this.f1830)) * f);
        long j4 = this.f1830;
        Orientation orientation2 = this.f1831;
        Orientation orientation3 = Orientation.Horizontal;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation2 == orientation3 ? j4 & 4294967295L : j4 >> 32));
        if (this.f1831 != orientation3) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fM1820)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM1820)) << 32);
    }

    public C1342(long j, Orientation orientation) {
        this.f1831 = orientation;
        this.f1830 = j;
    }
}
