package p117i;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p132j.AbstractC3492d;
import p172l8.C4688c0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: i.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3074n0 extends AbstractC3088u0 {

    /* JADX INFO: renamed from: f */
    public int f8154f;

    public C3074n0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC3492d.m13015a("Capacity must be a positive value.");
        }
        m11442p(AbstractC3044c1.m11265e(i10));
    }

    /* JADX INFO: renamed from: i */
    public final void m11435i() {
        if (this.f8225d <= 8 || Long.compareUnsigned(C4688c0.m18729c(C4688c0.m18729c(this.f8226e) * 32), C4688c0.m18729c(C4688c0.m18729c(this.f8225d) * 25)) > 0) {
            m11446t(AbstractC3044c1.m11263c(this.f8225d));
        } else {
            m11437k();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11436j() {
        this.f8226e = 0;
        long[] jArr = this.f8222a;
        if (jArr != AbstractC3044c1.f8088a) {
            AbstractC5102r.m20674z(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f8222a;
            int i10 = this.f8225d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC5102r.m20672x(this.f8223b, null, 0, this.f8225d);
        m11440n();
    }

    /* JADX INFO: renamed from: k */
    public final void m11437k() {
        long j10;
        long[] jArr = this.f8222a;
        int i10 = this.f8225d;
        Object[] objArr = this.f8223b;
        int[] iArr = this.f8224c;
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
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iM11438l = m11438l(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iM11438l - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC5106t.m20730e0(jArr)] = (jArr[i21] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iM11438l >> 3;
                    long j14 = jArr[i22];
                    int i23 = (iM11438l & 7) << 3;
                    if (((j14 >> i23) & 255) == 128) {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iM11438l] = objArr[i15];
                        objArr[i15] = null;
                        iArr[iM11438l] = iArr[i15];
                        iArr[i15] = i21;
                    } else {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        Object obj2 = objArr[iM11438l];
                        objArr[iM11438l] = objArr[i15];
                        objArr[i15] = obj2;
                        int i24 = iArr[iM11438l];
                        iArr[iM11438l] = iArr[i15];
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
        m11440n();
    }

    /* JADX INFO: renamed from: l */
    public final int m11438l(int i10) {
        int i11 = this.f8225d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8222a;
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

    /* JADX INFO: renamed from: m */
    public final int m11439m(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f8225d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f8222a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC1061t.m3842c(this.f8223b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM11438l = m11438l(i11);
                if (this.f8154f == 0 && ((this.f8222a[iM11438l >> 3] >> ((iM11438l & 7) << 3)) & 255) != 254) {
                    m11435i();
                    iM11438l = m11438l(i11);
                }
                this.f8226e++;
                int i19 = this.f8154f;
                long[] jArr2 = this.f8222a;
                int i20 = iM11438l >> 3;
                long j14 = jArr2[i20];
                int i21 = (iM11438l & 7) << 3;
                this.f8154f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f8225d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iM11438l - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iM11438l;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11440n() {
        this.f8154f = AbstractC3044c1.m11261a(m11567d()) - this.f8226e;
    }

    /* JADX INFO: renamed from: o */
    public final void m11441o(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC3044c1.f8088a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC5102r.m20674z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f8222a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m11440n();
    }

    /* JADX INFO: renamed from: p */
    public final void m11442p(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC3044c1.m11264d(i10)) : 0;
        this.f8225d = iMax;
        m11441o(iMax);
        this.f8223b = new Object[iMax];
        this.f8224c = new int[iMax];
    }

    /* JADX INFO: renamed from: q */
    public final int m11443q(Object obj, int i10, int i11) {
        int iM11439m = m11439m(obj);
        if (iM11439m < 0) {
            iM11439m = ~iM11439m;
        } else {
            i11 = this.f8224c[iM11439m];
        }
        this.f8223b[iM11439m] = obj;
        this.f8224c[iM11439m] = i10;
        return i11;
    }

    /* JADX INFO: renamed from: r */
    public final void m11444r(Object obj) {
        int iM11565b = m11565b(obj);
        if (iM11565b >= 0) {
            m11445s(iM11565b);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m11445s(int i10) {
        this.f8226e--;
        long[] jArr = this.f8222a;
        int i11 = this.f8225d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f8223b[i10] = null;
    }

    /* JADX INFO: renamed from: t */
    public final void m11446t(int i10) {
        int i11;
        long[] jArr = this.f8222a;
        Object[] objArr = this.f8223b;
        int[] iArr = this.f8224c;
        int i12 = this.f8225d;
        m11442p(i10);
        long[] jArr2 = this.f8222a;
        Object[] objArr2 = this.f8223b;
        int[] iArr2 = this.f8224c;
        int i13 = this.f8225d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iM11438l = m11438l(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iM11438l >> 3;
                int i17 = (iM11438l & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iM11438l - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr2[iM11438l] = obj;
                iArr2[iM11438l] = iArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11447u(Object obj, int i10) {
        int iM11439m = m11439m(obj);
        if (iM11439m < 0) {
            iM11439m = ~iM11439m;
        }
        this.f8223b[iM11439m] = obj;
        this.f8224c[iM11439m] = i10;
    }

    public /* synthetic */ C3074n0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
