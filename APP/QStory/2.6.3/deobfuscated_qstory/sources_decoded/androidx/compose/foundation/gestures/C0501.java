package androidx.compose.foundation.gestures;

import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0501 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f1485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Orientation f1486;

    public /* synthetic */ C0501(Orientation orientation, int i) {
        this(0L, (i & 1) != 0 ? null : orientation);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m1260(long j) {
        return Float.intBitsToFloat((int) (this.f1486 == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m1261(float f, long j, boolean z) {
        long jM12525;
        long j2 = this.f1485;
        if (z) {
            jM12525 = C7329.m12525(j2, j);
            this.f1485 = jM12525;
        } else {
            jM12525 = C7329.m12525(j2, j);
        }
        if ((this.f1486 == null ? C7329.m12527(jM12525) : Math.abs(m1260(jM12525))) < f) {
            return 9205357640488583168L;
        }
        Orientation orientation = this.f1486;
        long j3 = this.f1485;
        if (orientation == null) {
            return C7329.m12526(this.f1485, C7329.m12532(f, C7329.m12529(C7329.m12527(j3), j3)));
        }
        float fM1260 = m1260(j3) - (Math.signum(m1260(this.f1485)) * f);
        long j4 = this.f1485;
        Orientation orientation2 = this.f1486;
        Orientation orientation3 = Orientation.Horizontal;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation2 == orientation3 ? j4 & 4294967295L : j4 >> 32));
        if (this.f1486 != orientation3) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fM1260)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM1260)) << 32);
    }

    public C0501(long j, Orientation orientation) {
        this.f1486 = orientation;
        this.f1485 = j;
    }
}
