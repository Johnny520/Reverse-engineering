package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gk1 {

    /* JADX INFO: renamed from: a */
    public long[] f3552a;

    /* JADX INFO: renamed from: b */
    public Object[] f3553b;

    /* JADX INFO: renamed from: c */
    public int[] f3554c;

    /* JADX INFO: renamed from: d */
    public int f3555d;

    /* JADX INFO: renamed from: e */
    public int f3556e;

    /* JADX INFO: renamed from: f */
    public int f3557f;

    public gk1(int i) {
        this.f3552a = ed2.f2401a;
        this.f3553b = rg3.f9566h;
        this.f3554c = g11.f3247a;
        if (i >= 0) {
            m1934e(ed2.m1339d(i));
        } else {
            C0676s.m4651j("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1930a() {
        this.f3556e = 0;
        long[] jArr = this.f3552a;
        if (jArr != ed2.f2401a) {
            AbstractC0460mg.m3095j0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f3552a;
            int i = this.f3555d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC0460mg.m3094i0(this.f3553b, 0, this.f3555d);
        this.f3557f = ed2.m1336a(this.f3555d) - this.f3556e;
    }

    /* JADX INFO: renamed from: b */
    public final int m1931b(int i) {
        int i2 = this.f3555d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3552a;
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

    /* JADX INFO: renamed from: c */
    public final int m1932c(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f3555d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f3552a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (t11.m5086l(this.f3553b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM1931b = m1931b(i4);
                long j8 = 255;
                if (this.f3557f != 0 || ((this.f3552a[iM1931b >> 3] >> ((iM1931b & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.f3555d;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compareUnsigned(((long) this.f3556e) * 32, ((long) i14) * 25) <= 0) {
                            long[] jArr4 = this.f3552a;
                            int i16 = this.f3555d;
                            Object[] objArr2 = this.f3553b;
                            int[] iArr = this.f3554c;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int iM3098m0 = AbstractC0460mg.m3098m0(jArr4);
                            int i20 = iM3098m0 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM3098m0] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iM1931b2 = m1931b(i25);
                                    int i26 = i25 & i16;
                                    long j13 = j11;
                                    if (((iM1931b2 - i26) & i16) / 8 == ((i21 - i26) & i16) / i19) {
                                        jArr4[i22] = (((long) (i24 & 127)) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i19 = i19;
                                        j11 = j13;
                                    } else {
                                        int i27 = i19;
                                        int i28 = iM1931b2 >> 3;
                                        long j14 = jArr4[i28];
                                        int i29 = (iM1931b2 & 7) << 3;
                                        if (((j14 >> i29) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j14) | (((long) (i24 & 127)) << i29);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iM1931b2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[iM1931b2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = (((long) (i24 & 127)) << i29) | ((~(j << i29)) & j14);
                                            Object obj3 = objArr[iM1931b2];
                                            objArr[iM1931b2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i30 = iArr[iM1931b2];
                                            iArr[iM1931b2] = iArr[i21];
                                            iArr[i21] = i30;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        i19 = i27;
                                        j11 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f3557f = ed2.m1336a(this.f3555d) - this.f3556e;
                        }
                        iM1931b = m1931b(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM1337b = ed2.m1337b(this.f3555d);
                    long[] jArr5 = this.f3552a;
                    Object[] objArr3 = this.f3553b;
                    int[] iArr2 = this.f3554c;
                    int i31 = this.f3555d;
                    m1934e(iM1337b);
                    long[] jArr6 = this.f3552a;
                    Object[] objArr4 = this.f3553b;
                    int[] iArr3 = this.f3554c;
                    int i32 = this.f3555d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr5[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i33];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i34 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM1931b3 = m1931b(i34 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i34 & 127;
                            int i35 = iM1931b3 >> 3;
                            int i36 = (iM1931b3 & 7) << 3;
                            long j16 = (jArr[i35] & (~(255 << i36))) | (j15 << i36);
                            jArr[i35] = j16;
                            jArr[(((iM1931b3 - 7) & i32) + (i32 & 7)) >> 3] = j16;
                            objArr4[iM1931b3] = obj4;
                            iArr3[iM1931b3] = iArr2[i33];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i33++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM1931b = m1931b(i4);
                }
                this.f3556e++;
                int i37 = this.f3557f;
                long[] jArr7 = this.f3552a;
                int i38 = iM1931b >> 3;
                long j17 = jArr7[i38];
                int i39 = (iM1931b & 7) << 3;
                this.f3557f = i37 - (((j17 >> i39) & j) == j3 ? 1 : 0);
                int i40 = this.f3555d;
                long j18 = (j17 & (~(j << i39))) | (j2 << i39);
                jArr7[i38] = j18;
                jArr7[(((iM1931b - 7) & i40) + (i40 & 7)) >> 3] = j18;
                return ~iM1931b;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m1933d(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f3555d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f3552a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (t11.m5086l(this.f3553b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1934e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ed2.m1338c(i)) : 0;
        this.f3555d = iMax;
        if (iMax == 0) {
            jArr = ed2.f2401a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f3552a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f3557f = ed2.m1336a(this.f3555d) - this.f3556e;
        this.f3553b = new Object[iMax];
        this.f3554c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gk1)) {
            return false;
        }
        gk1 gk1Var = (gk1) obj;
        if (gk1Var.f3556e != this.f3556e) {
            return false;
        }
        Object[] objArr = this.f3553b;
        int[] iArr = this.f3554c;
        long[] jArr = this.f3552a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int iM1933d = gk1Var.m1933d(obj2);
                            if (iM1933d < 0 || i5 != gk1Var.f3554c[iM1933d]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m1935f(int i) {
        this.f3556e--;
        long[] jArr = this.f3552a;
        int i2 = this.f3555d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f3553b[i] = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m1936g(int i, Object obj) {
        int iM1932c = m1932c(obj);
        if (iM1932c < 0) {
            iM1932c = ~iM1932c;
        }
        this.f3553b[iM1932c] = obj;
        this.f3554c[iM1932c] = i;
    }

    public final int hashCode() {
        Object[] objArr = this.f3553b;
        int[] iArr = this.f3554c;
        long[] jArr = this.f3552a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (this.f3556e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f3553b;
        int[] iArr = this.f3554c;
        long[] jArr = this.f3552a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.f3556e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ gk1() {
        this(6);
    }
}
