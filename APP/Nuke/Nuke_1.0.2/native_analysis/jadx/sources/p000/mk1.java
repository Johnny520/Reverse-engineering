package p000;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mk1 {

    /* JADX INFO: renamed from: a */
    public long[] f6702a = ed2.f2401a;

    /* JADX INFO: renamed from: b */
    public Object[] f6703b = rg3.f9566h;

    /* JADX INFO: renamed from: c */
    public long[] f6704c = AbstractC0691se.f10072e;

    /* JADX INFO: renamed from: d */
    public int f6705d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f6706e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public int f6707f;

    /* JADX INFO: renamed from: g */
    public int f6708g;

    /* JADX INFO: renamed from: h */
    public int f6709h;

    public mk1(int i) {
        if (i >= 0) {
            m3129f(ed2.m1339d(i));
        } else {
            C0676s.m4651j("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3124a(Object obj) {
        int i = this.f6708g;
        int iM3127d = m3127d(obj);
        this.f6703b[iM3127d] = obj;
        long[] jArr = this.f6704c;
        int i2 = this.f6705d;
        jArr[iM3127d] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iM3127d) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.f6705d = iM3127d;
        if (this.f6706e == Integer.MAX_VALUE) {
            this.f6706e = iM3127d;
        }
        return this.f6708g != i;
    }

    /* JADX INFO: renamed from: b */
    public final void m3125b() {
        this.f6708g = 0;
        long[] jArr = this.f6702a;
        if (jArr != ed2.f2401a) {
            AbstractC0460mg.m3095j0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f6702a;
            int i = this.f6707f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC0460mg.m3094i0(this.f6703b, 0, this.f6707f);
        AbstractC0460mg.m3095j0(4611686018427387903L, this.f6704c);
        this.f6705d = Integer.MAX_VALUE;
        this.f6706e = Integer.MAX_VALUE;
        this.f6709h = ed2.m1336a(this.f6707f) - this.f6708g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3126c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f6707f;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f6702a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (t11.m5086l(this.f6703b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m3127d(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f6707f;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f6702a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (t11.m5086l(this.f6703b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iM3128e = m3128e(i4);
                long j9 = 255;
                if (this.f6709h != 0 || ((this.f6702a[iM3128e >> 3] >> ((iM3128e & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.f6707f;
                    if (i13 > 8) {
                        c = 31;
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f6708g) * 32, ((long) i13) * 25) <= 0) {
                            long[] jArr4 = this.f6702a;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this.f6707f;
                                Object[] objArr = this.f6703b;
                                long[] jArr5 = this.f6704c;
                                long[] jArr6 = new long[i14];
                                Arrays.fill(jArr6, 0, i14, 9223372034707292159L);
                                i = 0;
                                int i15 = (i14 + 7) >> 3;
                                int i16 = 0;
                                while (i16 < i15) {
                                    long j10 = j9;
                                    long j11 = jArr4[i16] & (-9187201950435737472L);
                                    int i17 = i16;
                                    jArr4[i17] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                    i16 = i17 + 1;
                                    j9 = j10;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i18] = jArr4[0];
                                int i20 = 0;
                                while (i20 != i14) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j12 = (jArr4[i21] >> i22) & j2;
                                    if (j12 != 128 && j12 == 254) {
                                        Object obj2 = objArr[i20];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i24 = i23 >>> 7;
                                        int iM3128e2 = m3128e(i24);
                                        int i25 = i24 & i14;
                                        if (((iM3128e2 - i25) & i14) / 8 == ((i20 - i25) & i14) / 8) {
                                            int i26 = i14;
                                            Object[] objArr2 = objArr;
                                            jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (((long) (i23 & 127)) << i22);
                                            if (jArr6[i20] == 9223372034707292159L) {
                                                long j13 = i20;
                                                jArr6[i20] = j13 | (j13 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i26;
                                            objArr = objArr2;
                                        } else {
                                            int i27 = i14;
                                            Object[] objArr3 = objArr;
                                            int i28 = iM3128e2 >> 3;
                                            long j14 = jArr4[i28];
                                            int i29 = (iM3128e2 & 7) << 3;
                                            if (((j14 >> i29) & j2) == 128) {
                                                jArr4[i28] = (j14 & (~(j2 << i29))) | (((long) (i23 & 127)) << i29);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[iM3128e2] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[iM3128e2] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i30 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i30 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i30] = ((long) iM3128e2) | (jArr6[i30] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = 9223372032559808512L | ((long) iM3128e2);
                                                }
                                                jArr6[iM3128e2] = (((long) i20) << 32) | 2147483647L;
                                            } else {
                                                j4 = j6;
                                                jArr4[i28] = (((long) (i23 & 127)) << i29) | (j14 & (~(j2 << i29)));
                                                Object obj3 = objArr3[iM3128e2];
                                                objArr3[iM3128e2] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j15 = jArr5[iM3128e2];
                                                jArr5[iM3128e2] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i31 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i31 != Integer.MAX_VALUE) {
                                                    long j16 = iM3128e2;
                                                    jArr6[i31] = (jArr6[i31] & (-4294967296L)) | j16;
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = iM3128e2;
                                                    jArr6[i20] = j17 | (j17 << 32);
                                                    i31 = i20;
                                                }
                                                jArr6[iM3128e2] = (((long) i31) << 32) | ((long) i20);
                                                i20--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i27;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    } else {
                                        i20++;
                                    }
                                }
                                j = j6;
                                this.f6709h = ed2.m1336a(this.f6707f) - this.f6708g;
                                long[] jArr7 = this.f6704c;
                                int length2 = jArr7.length;
                                for (int i32 = 0; i32 < length2; i32++) {
                                    long j18 = jArr7[i32];
                                    int i33 = (int) ((j18 >> 31) & 2147483647L);
                                    int i34 = (int) (j18 & 2147483647L);
                                    jArr7[i32] = (((j18 & (-4611686018427387904L)) | ((long) (i33 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i33] & 4294967295L)))) << 31) | ((long) (i34 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i34] & 4294967295L)));
                                }
                                int i35 = this.f6705d;
                                if (i35 != Integer.MAX_VALUE) {
                                    this.f6705d = (int) (jArr6[i35] & 4294967295L);
                                }
                                int i36 = this.f6706e;
                                if (i36 != Integer.MAX_VALUE) {
                                    this.f6706e = (int) (jArr6[i36] & 4294967295L);
                                }
                            }
                        }
                        iM3128e = m3128e(i4);
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int iM1337b = ed2.m1337b(this.f6707f);
                    long[] jArr8 = this.f6702a;
                    Object[] objArr4 = this.f6703b;
                    long[] jArr9 = this.f6704c;
                    int i37 = this.f6707f;
                    int[] iArr = new int[i37];
                    m3129f(iM1337b);
                    long[] jArr10 = this.f6702a;
                    Object[] objArr5 = this.f6703b;
                    long[] jArr11 = this.f6704c;
                    int i38 = this.f6707f;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr8[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM3128e3 = m3128e(i40 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j19 = i40 & 127;
                            int i41 = iM3128e3 >> 3;
                            int i42 = (iM3128e3 & 7) << 3;
                            long j20 = (jArr[i41] & (~(255 << i42))) | (j19 << i42);
                            jArr[i41] = j20;
                            jArr[(((iM3128e3 - 7) & i38) + (i38 & 7)) >> 3] = j20;
                            objArr5[iM3128e3] = obj4;
                            jArr11[iM3128e3] = jArr9[i39];
                            iArr[i39] = iM3128e3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i39++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f6704c;
                    int length3 = jArr12.length;
                    for (int i43 = 0; i43 < length3; i43++) {
                        long j21 = jArr12[i43];
                        int i44 = (int) ((j21 >> c) & 2147483647L);
                        int i45 = (int) (j21 & 2147483647L);
                        jArr12[i43] = (((j21 & (-4611686018427387904L)) | ((long) (i44 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i44]))) << c) | ((long) (i45 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i45]));
                    }
                    int i46 = this.f6705d;
                    if (i46 != Integer.MAX_VALUE) {
                        this.f6705d = iArr[i46];
                    }
                    int i47 = this.f6706e;
                    if (i47 != Integer.MAX_VALUE) {
                        this.f6706e = iArr[i47];
                    }
                    iM3128e = m3128e(i4);
                }
                this.f6708g++;
                int i48 = this.f6709h;
                long[] jArr13 = this.f6702a;
                int i49 = iM3128e >> 3;
                long j22 = jArr13[i49];
                int i50 = (iM3128e & 7) << 3;
                if (((j22 >> i50) & j2) == j3) {
                    i = 1;
                }
                this.f6709h = i48 - i;
                int i51 = this.f6707f;
                long j23 = (j22 & (~(j2 << i50))) | (j << i50);
                jArr13[i49] = j23;
                jArr13[(((iM3128e - 7) & i51) + (i51 & 7)) >> 3] = j23;
                return iM3128e;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m3128e(int i) {
        int i2 = this.f6707f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f6702a;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mk1)) {
            return false;
        }
        mk1 mk1Var = (mk1) obj;
        if (mk1Var.f6708g != this.f6708g) {
            return false;
        }
        Object[] objArr = this.f6703b;
        long[] jArr = this.f6702a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !mk1Var.m3126c(objArr[(i << 3) + i3])) {
                            return false;
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
    public final void m3129f(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, ed2.m1338c(i)) : 0;
        this.f6707f = iMax;
        if (iMax == 0) {
            jArr = ed2.f2401a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f6702a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f6709h = ed2.m1336a(this.f6707f) - this.f6708g;
        this.f6703b = iMax == 0 ? rg3.f9566h : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC0691se.f10072e;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.f6704c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3130g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f6707f;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f6702a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (t11.m5086l(this.f6703b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m3131h(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final void m3131h(int i) {
        this.f6708g--;
        long[] jArr = this.f6702a;
        int i2 = this.f6707f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f6703b[i] = null;
        long[] jArr2 = this.f6704c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.f6705d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.f6706e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f6707f * 31) + this.f6708g;
        Object[] objArr = this.f6703b;
        long[] jArr = this.f6702a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!t11.m5086l(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3132i(Collection collection) {
        collection.getClass();
        Object[] objArr = this.f6703b;
        int i = this.f6708g;
        long[] jArr = this.f6702a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!AbstractC0142du.m1157m0(collection, objArr[i5])) {
                                m3131h(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this.f6708g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f6703b;
        long[] jArr = this.f6704c;
        int i = this.f6706e;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
            i = i3;
        }
        return sb.toString();
    }
}
