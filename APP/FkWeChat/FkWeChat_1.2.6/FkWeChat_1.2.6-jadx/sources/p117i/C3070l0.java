package p117i;

import p024b9.AbstractC1043k;
import p132j.AbstractC3492d;
import p172l8.C4688c0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: i.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3070l0 extends AbstractC3091w {

    /* JADX INFO: renamed from: f */
    public int f8149f;

    public C3070l0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC3492d.m13015a("Capacity must be a positive value.");
        }
        m11406m(AbstractC3044c1.m11265e(i10));
    }

    /* JADX INFO: renamed from: f */
    public final void m11399f() {
        if (this.f8233d <= 8 || Long.compareUnsigned(C4688c0.m18729c(C4688c0.m18729c(this.f8234e) * 32), C4688c0.m18729c(C4688c0.m18729c(this.f8233d) * 25)) > 0) {
            m11410q(AbstractC3044c1.m11263c(this.f8233d));
        } else {
            m11401h();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11400g() {
        this.f8234e = 0;
        long[] jArr = this.f8230a;
        if (jArr != AbstractC3044c1.f8088a) {
            AbstractC5102r.m20674z(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f8230a;
            int i10 = this.f8233d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC5102r.m20672x(this.f8232c, null, 0, this.f8233d);
        m11404k();
    }

    /* JADX INFO: renamed from: h */
    public final void m11401h() {
        long j10;
        long[] jArr = this.f8230a;
        int i10 = this.f8233d;
        long[] jArr2 = this.f8231b;
        Object[] objArr = this.f8232c;
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
                int iM11403j = m11403j(i18);
                int i19 = i18 & i10;
                char c11 = c10;
                if (((iM11403j - i19) & i10) / 8 == ((i14 - i19) & i10) / 8) {
                    jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                    jArr[AbstractC5106t.m20730e0(jArr)] = (jArr[c11] & j12) | Long.MIN_VALUE;
                    i14++;
                    c10 = c11;
                } else {
                    int i20 = iM11403j >> 3;
                    long j14 = jArr[i20];
                    int i21 = (iM11403j & 7) << 3;
                    if (((j14 >> i21) & 255) == 128) {
                        j10 = j12;
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j14 & (~(255 << i21)));
                        jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                        jArr2[iM11403j] = jArr2[i14];
                        jArr2[i14] = 0;
                        objArr[iM11403j] = objArr[i14];
                        objArr[i14] = null;
                    } else {
                        j10 = j12;
                        jArr[i20] = (((long) (i17 & 127)) << i21) | (j14 & (~(255 << i21)));
                        long j15 = jArr2[iM11403j];
                        jArr2[iM11403j] = jArr2[i14];
                        jArr2[i14] = j15;
                        Object obj = objArr[iM11403j];
                        objArr[iM11403j] = objArr[i14];
                        objArr[i14] = obj;
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
        m11404k();
    }

    /* JADX INFO: renamed from: i */
    public final int m11402i(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f8233d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f8230a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f8231b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iM11403j = m11403j(i11);
                if (this.f8149f == 0 && ((this.f8230a[iM11403j >> 3] >> ((iM11403j & 7) << 3)) & 255) != 254) {
                    m11399f();
                    iM11403j = m11403j(i11);
                }
                this.f8234e++;
                int i19 = this.f8149f;
                long[] jArr2 = this.f8230a;
                int i20 = iM11403j >> 3;
                long j15 = jArr2[i20];
                int i21 = (iM11403j & 7) << 3;
                this.f8149f = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f8233d;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((iM11403j - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return iM11403j;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m11403j(int i10) {
        int i11 = this.f8233d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8230a;
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

    /* JADX INFO: renamed from: k */
    public final void m11404k() {
        this.f8149f = AbstractC3044c1.m11261a(m11579c()) - this.f8234e;
    }

    /* JADX INFO: renamed from: l */
    public final void m11405l(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC3044c1.f8088a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC5102r.m20674z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f8230a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m11404k();
    }

    /* JADX INFO: renamed from: m */
    public final void m11406m(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC3044c1.m11264d(i10)) : 0;
        this.f8233d = iMax;
        m11405l(iMax);
        this.f8231b = new long[iMax];
        this.f8232c = new Object[iMax];
    }

    /* JADX INFO: renamed from: n */
    public final Object m11407n(long j10, Object obj) {
        int iM11402i = m11402i(j10);
        Object[] objArr = this.f8232c;
        Object obj2 = objArr[iM11402i];
        this.f8231b[iM11402i] = j10;
        objArr[iM11402i] = obj;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11408o(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f8233d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.f8230a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f8231b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object r0 = r14.m11409p(r10)
            return r0
        L6d:
            r0 = 0
            return r0
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3070l0.m11408o(long):java.lang.Object");
    }

    /* JADX INFO: renamed from: p */
    public final Object m11409p(int i10) {
        this.f8234e--;
        long[] jArr = this.f8230a;
        int i11 = this.f8233d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        Object[] objArr = this.f8232c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    /* JADX INFO: renamed from: q */
    public final void m11410q(int i10) {
        long[] jArr;
        C3070l0 c3070l0 = this;
        long[] jArr2 = c3070l0.f8230a;
        long[] jArr3 = c3070l0.f8231b;
        Object[] objArr = c3070l0.f8232c;
        int i11 = c3070l0.f8233d;
        m11406m(i10);
        long[] jArr4 = c3070l0.f8230a;
        long[] jArr5 = c3070l0.f8231b;
        Object[] objArr2 = c3070l0.f8232c;
        int i12 = c3070l0.f8233d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i13];
                int iHashCode = Long.hashCode(j10) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iM11403j = c3070l0.m11403j(i14 >>> 7);
                long j11 = i14 & 127;
                int i15 = iM11403j >> 3;
                int i16 = (iM11403j & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i15] & (~(255 << i16))) | (j11 << i16);
                jArr4[i15] = j12;
                jArr4[(((iM11403j - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr5[iM11403j] = j10;
                objArr2[iM11403j] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c3070l0 = this;
            jArr2 = jArr;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m11411r(long j10, Object obj) {
        int iM11402i = m11402i(j10);
        this.f8231b[iM11402i] = j10;
        this.f8232c[iM11402i] = obj;
    }

    public /* synthetic */ C3070l0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
