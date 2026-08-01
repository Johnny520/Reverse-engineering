package p117i;

import p024b9.AbstractC1043k;
import p132j.AbstractC3492d;
import p172l8.C4688c0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: i.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3052f0 extends AbstractC3063j {

    /* JADX INFO: renamed from: f */
    public int f8103f;

    public C3052f0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC3492d.m13015a("Capacity must be a positive value.");
        }
        m11293o(AbstractC3044c1.m11265e(i10));
    }

    /* JADX INFO: renamed from: h */
    public final void m11286h() {
        if (this.f8132d <= 8 || Long.compareUnsigned(C4688c0.m18729c(C4688c0.m18729c(this.f8133e) * 32), C4688c0.m18729c(C4688c0.m18729c(this.f8132d) * 25)) > 0) {
            m11295q(AbstractC3044c1.m11263c(this.f8132d));
        } else {
            m11288j();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11287i() {
        this.f8133e = 0;
        long[] jArr = this.f8129a;
        if (jArr != AbstractC3044c1.f8088a) {
            AbstractC5102r.m20674z(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f8129a;
            int i10 = this.f8132d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        m11291m();
    }

    /* JADX INFO: renamed from: j */
    public final void m11288j() {
        long j10;
        long[] jArr = this.f8129a;
        int i10 = this.f8132d;
        int[] iArr = this.f8130b;
        int[] iArr2 = this.f8131c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iM20730e0 = AbstractC5106t.m20730e0(jArr);
        int i14 = iM20730e0 - 1;
        long j12 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM20730e0] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j13 = (jArr[i16] >> i17) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Integer.hashCode(iArr[i15]) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iM11289k = m11289k(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iM11289k - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC5106t.m20730e0(jArr)] = (jArr[i21] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iM11289k >> 3;
                    long j14 = jArr[i22];
                    int i23 = (iM11289k & 7) << 3;
                    if (((j14 >> i23) & 255) == 128) {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        iArr[iM11289k] = iArr[i15];
                        iArr[i15] = i21;
                        iArr2[iM11289k] = iArr2[i15];
                        iArr2[i15] = i21;
                    } else {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        int i24 = iArr[iM11289k];
                        iArr[iM11289k] = iArr[i15];
                        iArr[i15] = i24;
                        int i25 = iArr2[iM11289k];
                        iArr2[iM11289k] = iArr2[i15];
                        iArr2[i15] = i25;
                        i15--;
                    }
                    jArr[AbstractC5106t.m20730e0(jArr)] = (jArr[i21] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        m11291m();
    }

    /* JADX INFO: renamed from: k */
    public final int m11289k(int i10) {
        int i11 = this.f8132d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8129a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m11290l(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f8132d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f8129a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                int i21 = i19;
                if (this.f8130b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM11289k = m11289k(i12);
                if (this.f8103f == 0 && ((this.f8129a[iM11289k >> 3] >> ((iM11289k & 7) << 3)) & 255) != 254) {
                    m11286h();
                    iM11289k = m11289k(i12);
                }
                this.f8133e++;
                int i23 = this.f8103f;
                long[] jArr2 = this.f8129a;
                int i24 = iM11289k >> 3;
                long j14 = jArr2[i24];
                int i25 = (iM11289k & 7) << 3;
                this.f8103f = i23 - (((j14 >> i25) & 255) == 128 ? i22 : 0);
                int i26 = this.f8132d;
                long j15 = ((~(255 << i25)) & j14) | (j11 << i25);
                jArr2[i24] = j15;
                jArr2[(((iM11289k - 7) & i26) + (i26 & 7)) >> 3] = j15;
                return ~iM11289k;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11291m() {
        this.f8103f = AbstractC3044c1.m11261a(m11363d()) - this.f8133e;
    }

    /* JADX INFO: renamed from: n */
    public final void m11292n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC3044c1.f8088a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC5102r.m20674z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f8129a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m11291m();
    }

    /* JADX INFO: renamed from: o */
    public final void m11293o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC3044c1.m11264d(i10)) : 0;
        this.f8132d = iMax;
        m11292n(iMax);
        this.f8130b = new int[iMax];
        this.f8131c = new int[iMax];
    }

    /* JADX INFO: renamed from: p */
    public final void m11294p(int i10, int i11) {
        m11296r(i10, i11);
    }

    /* JADX INFO: renamed from: q */
    public final void m11295q(int i10) {
        long[] jArr;
        C3052f0 c3052f0 = this;
        long[] jArr2 = c3052f0.f8129a;
        int[] iArr = c3052f0.f8130b;
        int[] iArr2 = c3052f0.f8131c;
        int i11 = c3052f0.f8132d;
        m11293o(i10);
        long[] jArr3 = c3052f0.f8129a;
        int[] iArr3 = c3052f0.f8130b;
        int[] iArr4 = c3052f0.f8131c;
        int i12 = c3052f0.f8132d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iM11289k = c3052f0.m11289k(i15 >>> 7);
                long j10 = i15 & 127;
                int i16 = iM11289k >> 3;
                int i17 = (iM11289k & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((iM11289k - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr3[iM11289k] = i14;
                iArr4[iM11289k] = iArr2[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c3052f0 = this;
            jArr2 = jArr;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m11296r(int i10, int i11) {
        int iM11290l = m11290l(i10);
        if (iM11290l < 0) {
            iM11290l = ~iM11290l;
        }
        this.f8130b[iM11290l] = i10;
        this.f8131c[iM11290l] = i11;
    }

    public /* synthetic */ C3052f0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
