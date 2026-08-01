package p117i;

import p132j.AbstractC3492d;
import p172l8.C4688c0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: i.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3072m0 extends AbstractC3095y {

    /* JADX INFO: renamed from: e */
    public int f8152e;

    public C3072m0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC3492d.m13015a("Capacity must be a positive value.");
        }
        m11426k(AbstractC3044c1.m11265e(i10));
    }

    /* JADX INFO: renamed from: e */
    public final void m11420e() {
        if (this.f8243c <= 8 || Long.compareUnsigned(C4688c0.m18729c(C4688c0.m18729c(this.f8244d) * 32), C4688c0.m18729c(C4688c0.m18729c(this.f8243c) * 25)) > 0) {
            m11430o(AbstractC3044c1.m11263c(this.f8243c));
        } else {
            m11421f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11421f() {
        long j10;
        long[] jArr = this.f8241a;
        int i10 = this.f8243c;
        long[] jArr2 = this.f8242b;
        int i11 = (i10 + 7) >> 3;
        char c10 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = jArr[i12] & (-9187201950435737472L);
            jArr[i12] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iM20730e0 = AbstractC5106t.m20730e0(jArr);
        int i13 = iM20730e0 - 1;
        long j12 = 72057594037927935L;
        jArr[i13] = (jArr[i13] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM20730e0] = jArr[0];
        int i14 = 0;
        while (i14 != i10) {
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j13 = (jArr[i15] >> i16) & 255;
            if (j13 != 128 && j13 == 254) {
                int iHashCode = Long.hashCode(jArr2[i14]) * (-862048943);
                int i17 = iHashCode ^ (iHashCode << 16);
                int i18 = i17 >>> 7;
                int iM11423h = m11423h(i18);
                int i19 = i18 & i10;
                char c11 = c10;
                if (((iM11423h - i19) & i10) / 8 == ((i14 - i19) & i10) / 8) {
                    jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[AbstractC5106t.m20730e0(jArr)] = (jArr[c11] & j12) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                } else {
                    int i20 = iM11423h >> 3;
                    long j14 = jArr[i20];
                    int i21 = (iM11423h & 7) << 3;
                    if (((j14 >> i21) & 255) == 128) {
                        j10 = j12;
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j14 & (~(255 << i21)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        jArr2[iM11423h] = jArr2[i14];
                        jArr2[i14] = 0;
                    } else {
                        j10 = j12;
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j14 & (~(255 << i21)));
                        long j15 = jArr2[iM11423h];
                        jArr2[iM11423h] = jArr2[i14];
                        jArr2[i14] = j15;
                        i14--;
                    }
                    jArr[AbstractC5106t.m20730e0(jArr)] = (jArr[c11] & j10) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                    j12 = j10;
                }
            } else {
                i14++;
            }
        }
        m11424i();
    }

    /* JADX INFO: renamed from: g */
    public final int m11422g(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f8243c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f8241a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f8242b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iM11423h = m11423h(i11);
                if (this.f8152e == 0 && ((this.f8241a[iM11423h >> 3] >> ((iM11423h & 7) << 3)) & 255) != 254) {
                    m11420e();
                    iM11423h = m11423h(i11);
                }
                this.f8244d++;
                int i19 = this.f8152e;
                long[] jArr2 = this.f8241a;
                int i20 = iM11423h >> 3;
                long j15 = jArr2[i20];
                int i21 = (iM11423h & 7) << 3;
                this.f8152e = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f8243c;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iM11423h - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return iM11423h;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m11423h(int i10) {
        int i11 = this.f8243c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8241a;
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
    public final void m11424i() {
        this.f8152e = AbstractC3044c1.m11261a(m11609b()) - this.f8244d;
    }

    /* JADX INFO: renamed from: j */
    public final void m11425j(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC3044c1.f8088a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC5102r.m20674z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f8241a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m11424i();
    }

    /* JADX INFO: renamed from: k */
    public final void m11426k(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC3044c1.m11264d(i10)) : 0;
        this.f8243c = iMax;
        m11425j(iMax);
        this.f8242b = new long[iMax];
    }

    /* JADX INFO: renamed from: l */
    public final void m11427l(long j10) {
        this.f8242b[m11422g(j10)] = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11428m(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f8243c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f8241a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f8242b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L72
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            if (r4 == 0) goto L71
            r0.m11429n(r10)
        L71:
            return r4
        L72:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3072m0.m11428m(long):boolean");
    }

    /* JADX INFO: renamed from: n */
    public final void m11429n(int i10) {
        this.f8244d--;
        long[] jArr = this.f8241a;
        int i11 = this.f8243c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    /* JADX INFO: renamed from: o */
    public final void m11430o(int i10) {
        long[] jArr = this.f8241a;
        long[] jArr2 = this.f8242b;
        int i11 = this.f8243c;
        m11426k(i10);
        long[] jArr3 = this.f8241a;
        long[] jArr4 = this.f8242b;
        int i12 = this.f8243c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iM11423h = m11423h(i14 >>> 7);
                long j11 = i14 & 127;
                int i15 = iM11423h >> 3;
                int i16 = (iM11423h & 7) << 3;
                long j12 = (jArr3[i15] & (~(255 << i16))) | (j11 << i16);
                jArr3[i15] = j12;
                jArr3[(((iM11423h - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr4[iM11423h] = j10;
            }
        }
    }
}
