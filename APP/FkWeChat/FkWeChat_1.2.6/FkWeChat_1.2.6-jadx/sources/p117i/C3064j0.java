package p117i;

import p024b9.AbstractC1043k;
import p132j.AbstractC3492d;
import p172l8.C4688c0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: i.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3064j0 extends AbstractC3085t {

    /* JADX INFO: renamed from: f */
    public int f8134f;

    public C3064j0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC3492d.m13015a("Capacity must be a positive value.");
        }
        m11373l(AbstractC3044c1.m11265e(i10));
    }

    /* JADX INFO: renamed from: f */
    public final void m11367f() {
        if (this.f8203d <= 8 || Long.compareUnsigned(C4688c0.m18729c(C4688c0.m18729c(this.f8204e) * 32), C4688c0.m18729c(C4688c0.m18729c(this.f8203d) * 25)) > 0) {
            m11374m(AbstractC3044c1.m11263c(this.f8203d));
        } else {
            m11368g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11368g() {
        long j10;
        long[] jArr = this.f8200a;
        int i10 = this.f8203d;
        long[] jArr2 = this.f8201b;
        int[] iArr = this.f8202c;
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
                int iHashCode = Long.hashCode(jArr2[i15]) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iM11369h = m11369h(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iM11369h - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC5106t.m20730e0(jArr)] = (jArr[i21] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iM11369h >> 3;
                    long j14 = jArr[i22];
                    int i23 = (iM11369h & 7) << 3;
                    if (((j14 >> i23) & 255) == 128) {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        jArr2[iM11369h] = jArr2[i15];
                        jArr2[i15] = 0;
                        iArr[iM11369h] = iArr[i15];
                        iArr[i15] = i21;
                    } else {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        long j15 = jArr2[iM11369h];
                        jArr2[iM11369h] = jArr2[i15];
                        jArr2[i15] = j15;
                        int i24 = iArr[iM11369h];
                        iArr[iM11369h] = iArr[i15];
                        iArr[i15] = i24;
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
        m11371j();
    }

    /* JADX INFO: renamed from: h */
    public final int m11369h(int i10) {
        int i11 = this.f8203d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8200a;
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

    /* JADX INFO: renamed from: i */
    public final int m11370i(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f8203d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f8200a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f8201b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iM11369h = m11369h(i11);
                if (this.f8134f == 0 && ((this.f8200a[iM11369h >> 3] >> ((iM11369h & 7) << 3)) & 255) != 254) {
                    m11367f();
                    iM11369h = m11369h(i11);
                }
                this.f8204e++;
                int i19 = this.f8134f;
                long[] jArr2 = this.f8200a;
                int i20 = iM11369h >> 3;
                long j15 = jArr2[i20];
                int i21 = (iM11369h & 7) << 3;
                this.f8134f = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f8203d;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iM11369h - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return ~iM11369h;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11371j() {
        this.f8134f = AbstractC3044c1.m11261a(m11557c()) - this.f8204e;
    }

    /* JADX INFO: renamed from: k */
    public final void m11372k(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC3044c1.f8088a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC5102r.m20674z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f8200a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m11371j();
    }

    /* JADX INFO: renamed from: l */
    public final void m11373l(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC3044c1.m11264d(i10)) : 0;
        this.f8203d = iMax;
        m11372k(iMax);
        this.f8201b = new long[iMax];
        this.f8202c = new int[iMax];
    }

    /* JADX INFO: renamed from: m */
    public final void m11374m(int i10) {
        long[] jArr;
        C3064j0 c3064j0 = this;
        long[] jArr2 = c3064j0.f8200a;
        long[] jArr3 = c3064j0.f8201b;
        int[] iArr = c3064j0.f8202c;
        int i11 = c3064j0.f8203d;
        m11373l(i10);
        long[] jArr4 = c3064j0.f8200a;
        long[] jArr5 = c3064j0.f8201b;
        int[] iArr2 = c3064j0.f8202c;
        int i12 = c3064j0.f8203d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i13];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iM11369h = c3064j0.m11369h(i14 >>> 7);
                long j11 = i14 & 127;
                int i15 = iM11369h >> 3;
                int i16 = (iM11369h & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i15] & (~(255 << i16))) | (j11 << i16);
                jArr4[i15] = j12;
                jArr4[(((iM11369h - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr5[iM11369h] = j10;
                iArr2[iM11369h] = iArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c3064j0 = this;
            jArr2 = jArr;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11375n(long j10, int i10) {
        int iM11370i = m11370i(j10);
        if (iM11370i < 0) {
            iM11370i = ~iM11370i;
        }
        this.f8201b[iM11370i] = j10;
        this.f8202c[iM11370i] = i10;
    }

    public /* synthetic */ C3064j0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
