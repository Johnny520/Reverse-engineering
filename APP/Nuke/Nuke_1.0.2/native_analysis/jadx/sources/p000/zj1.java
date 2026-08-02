package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zj1 extends x01 {

    /* JADX INFO: renamed from: f */
    public int f13929f;

    public zj1(int i) {
        this.f12749a = ed2.f2401a;
        this.f12750b = g11.f3247a;
        this.f12751c = rg3.f9566h;
        if (i >= 0) {
            m6419f(ed2.m1339d(i));
        } else {
            C0676s.m4651j("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6416c() {
        this.f12753e = 0;
        long[] jArr = this.f12749a;
        if (jArr != ed2.f2401a) {
            AbstractC0460mg.m3095j0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f12749a;
            int i = this.f12752d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC0460mg.m3094i0(this.f12751c, 0, this.f12752d);
        this.f13929f = ed2.m1336a(this.f12752d) - this.f12753e;
    }

    /* JADX INFO: renamed from: d */
    public final int m6417d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i3;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f12752d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.f12749a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.f12750b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM6418e = m6418e(i6);
                long j8 = 255;
                if (this.f13929f != 0 || ((this.f12749a[iM6418e >> 3] >> ((iM6418e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.f12752d;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f12753e) * 32, ((long) i20) * 25) <= 0) {
                            long[] jArr4 = this.f12749a;
                            int i21 = this.f12752d;
                            int[] iArr2 = this.f12750b;
                            Object[] objArr2 = this.f12751c;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                long j9 = j8;
                                long j10 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i23++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int iM3098m0 = AbstractC0460mg.m3098m0(jArr4);
                            int i24 = iM3098m0 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM3098m0] = jArr4[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr4[i26] >> i27) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iM6418e2 = m6418e(i29);
                                    int i30 = i29 & i21;
                                    if (((iM6418e2 - i30) & i21) / 8 == ((i25 - i30) & i21) / 8) {
                                        long j13 = j11;
                                        jArr4[i26] = (((long) (i28 & 127)) << i27) | ((~(j << i27)) & jArr4[i26]);
                                        jArr4[jArr4.length - i13] = (jArr4[i19] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i31 = iM6418e2 >> 3;
                                        long j15 = jArr4[i31];
                                        int i32 = (iM6418e2 & 7) << 3;
                                        if (((j15 >> i32) & j) == 128) {
                                            i3 = i13;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i31] = ((~(j << i32)) & j15) | (((long) (i28 & 127)) << i32);
                                            jArr4[i26] = (jArr4[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[iM6418e2] = iArr[i25];
                                            iArr[i25] = i19;
                                            objArr[iM6418e2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i3 = i13;
                                            jArr4[i31] = (((long) (i28 & 127)) << i32) | ((~(j << i32)) & j15);
                                            int i33 = iArr[iM6418e2];
                                            iArr[iM6418e2] = iArr[i25];
                                            iArr[i25] = i33;
                                            Object obj = objArr[iM6418e2];
                                            objArr[iM6418e2] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i19] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j14;
                                        i13 = i3;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i13;
                            this.f13929f = ed2.m1336a(this.f12752d) - this.f12753e;
                        }
                        iM6418e = m6418e(i6);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iM1337b = ed2.m1337b(this.f12752d);
                    long[] jArr5 = this.f12749a;
                    int[] iArr3 = this.f12750b;
                    Object[] objArr3 = this.f12751c;
                    int i34 = this.f12752d;
                    m6419f(iM1337b);
                    long[] jArr6 = this.f12749a;
                    int[] iArr4 = this.f12750b;
                    Object[] objArr4 = this.f12751c;
                    int i35 = this.f12752d;
                    int i36 = i19;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            int i37 = iArr3[i36];
                            int iHashCode3 = Integer.hashCode(i37) * i18;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM6418e3 = m6418e(i38 >>> 7);
                            long j16 = i38 & 127;
                            int i39 = iM6418e3 >> 3;
                            int i40 = (iM6418e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i39] & (~(255 << i40))) | (j16 << i40);
                            jArr[i39] = j17;
                            jArr[(((iM6418e3 - 7) & i35) + (i35 & 7)) >> 3] = j17;
                            iArr4[iM6418e3] = i37;
                            objArr4[iM6418e3] = objArr3[i36];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i36++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM6418e = m6418e(i6);
                }
                this.f12753e++;
                int i41 = this.f13929f;
                long[] jArr7 = this.f12749a;
                int i42 = iM6418e >> 3;
                long j18 = jArr7[i42];
                int i43 = (iM6418e & 7) << 3;
                if (((j18 >> i43) & j) != j3) {
                    i2 = i19;
                }
                this.f13929f = i41 - i2;
                int i44 = this.f12752d;
                long j19 = (j18 & (~(j << i43))) | (j2 << i43);
                jArr7[i42] = j19;
                jArr7[(((iM6418e - 7) & i44) + (i44 & 7)) >> 3] = j19;
                return iM6418e;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m6418e(int i) {
        int i2 = this.f12752d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f12749a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6419f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ed2.m1338c(i)) : 0;
        this.f12752d = iMax;
        if (iMax == 0) {
            jArr = ed2.f2401a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f12749a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f13929f = ed2.m1336a(this.f12752d) - this.f12753e;
        this.f12750b = new int[iMax];
        this.f12751c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6420g(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f12752d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f12749a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f12750b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f12753e--;
        long[] jArr2 = this.f12749a;
        int i9 = this.f12752d;
        int i10 = iNumberOfTrailingZeros >> 3;
        int i11 = (iNumberOfTrailingZeros & 7) << 3;
        long j4 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
        jArr2[i10] = j4;
        jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j4;
        Object[] objArr = this.f12751c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m6421h(int i, Object obj) {
        int iM6417d = m6417d(i);
        this.f12750b[iM6417d] = i;
        this.f12751c[iM6417d] = obj;
    }

    public /* synthetic */ zj1() {
        this(6);
    }
}
