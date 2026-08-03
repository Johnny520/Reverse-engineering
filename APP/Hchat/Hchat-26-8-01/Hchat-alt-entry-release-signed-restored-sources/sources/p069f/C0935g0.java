package p069f;

import gg.AbstractC1416l;
import java.util.Arrays;
import java.util.Collection;
import p016b1.C0166f;
import p087g.AbstractC1256a;
import p136j8.C2104o;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: f.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0935g0 {

    /* JADX INFO: renamed from: a */
    public long[] f2937a = AbstractC0957r0.f3015a;

    /* JADX INFO: renamed from: b */
    public Object[] f2938b = AbstractC1256a.f4115c;

    /* JADX INFO: renamed from: c */
    public long[] f2939c = AbstractC0954q.f3005b;

    /* JADX INFO: renamed from: d */
    public int f2940d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f2941e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public int f2942f;

    /* JADX INFO: renamed from: g */
    public int f2943g;

    /* JADX INFO: renamed from: h */
    public int f2944h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0935g0(int i9) {
        if (i9 >= 0) {
            m2307f(AbstractC0957r0.m2358d(i9));
        } else {
            C2104o.m5294t("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m2302a(Object obj) {
        int i9 = this.f2943g;
        int iM2305d = m2305d(obj);
        this.f2938b[iM2305d] = obj;
        long[] jArr = this.f2939c;
        int i10 = this.f2940d;
        jArr[iM2305d] = (((long) i10) & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((((long) iM2305d) & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f2940d = iM2305d;
        if (this.f2941e == Integer.MAX_VALUE) {
            this.f2941e = iM2305d;
        }
        return this.f2943g != i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2303b() {
        this.f2943g = 0;
        long[] jArr = this.f2937a;
        if (jArr != AbstractC0957r0.f3015a) {
            AbstractC4165l.m8388w0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f2937a;
            int i9 = this.f2942f;
            int i10 = i9 >> 3;
            long j3 = 255 << ((i9 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j3)) | j3;
        }
        AbstractC4165l.m8387v0(0, this.f2942f, null, this.f2938b);
        AbstractC4165l.m8388w0(4611686018427387903L, this.f2939c);
        this.f2940d = Integer.MAX_VALUE;
        this.f2941e = Integer.MAX_VALUE;
        this.f2944h = AbstractC0957r0.m2355a(this.f2942f) - this.f2943g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final boolean m2304c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f2942f;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f2937a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j3 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j4 = (((long) i10) * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i12) & i11;
                if (AbstractC1416l.m3825a(this.f2938b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m2305d(Object obj) {
        int i9;
        long j3;
        long j4;
        long j5;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i10 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f2942f;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f2937a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j12 = i13;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                int i19 = i10;
                if (AbstractC1416l.m3825a(this.f2938b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i10 = i19;
            }
            int i20 = i10;
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                int iM2306e = m2306e(i12);
                long j15 = 255;
                if (this.f2944h != 0 || ((this.f2937a[iM2306e >> 3] >> ((iM2306e & 7) << 3)) & 255) == 254) {
                    i9 = 0;
                    j3 = j12;
                    j4 = 255;
                    j5 = 128;
                } else {
                    int i21 = this.f2942f;
                    if (i21 > 8) {
                        c10 = 31;
                        j5 = 128;
                        if (Long.compareUnsigned(((long) this.f2943g) * 32, ((long) i21) * 25) <= 0) {
                            long[] jArr4 = this.f2937a;
                            if (jArr4 == null) {
                                i9 = 0;
                                j3 = j12;
                                j4 = 255;
                            } else {
                                int i22 = this.f2942f;
                                Object[] objArr = this.f2938b;
                                long[] jArr5 = this.f2939c;
                                long[] jArr6 = new long[i22];
                                Arrays.fill(jArr6, 0, i22, 9223372034707292159L);
                                i9 = 0;
                                int i23 = (i22 + 7) >> 3;
                                int i24 = 0;
                                while (i24 < i23) {
                                    long j16 = j15;
                                    long j17 = jArr4[i24] & (-9187201950435737472L);
                                    int i25 = i24;
                                    jArr4[i25] = ((~j17) + (j17 >>> 7)) & (-72340172838076674L);
                                    i24 = i25 + 1;
                                    j15 = j16;
                                }
                                j4 = j15;
                                int length = jArr4.length;
                                int i26 = length - 1;
                                int i27 = length - 2;
                                jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i26] = jArr4[0];
                                int i28 = 0;
                                while (i28 != i22) {
                                    int i29 = i28 >> 3;
                                    int i30 = (i28 & 7) << 3;
                                    long j18 = (jArr4[i29] >> i30) & j4;
                                    if (j18 != 128 && j18 == 254) {
                                        Object obj2 = objArr[i28];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i20;
                                        int i31 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i32 = i31 >>> 7;
                                        int iM2306e2 = m2306e(i32);
                                        int i33 = i32 & i22;
                                        if (((iM2306e2 - i33) & i22) / 8 == ((i28 - i33) & i22) / 8) {
                                            int i34 = i22;
                                            Object[] objArr2 = objArr;
                                            jArr4[i29] = (jArr4[i29] & (~(j4 << i30))) | (((long) (i31 & 127)) << i30);
                                            if (jArr6[i28] == 9223372034707292159L) {
                                                long j19 = i28;
                                                jArr6[i28] = j19 | (j19 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i34;
                                            objArr = objArr2;
                                        } else {
                                            int i35 = i22;
                                            Object[] objArr3 = objArr;
                                            int i36 = iM2306e2 >> 3;
                                            long j20 = jArr4[i36];
                                            int i37 = (iM2306e2 & 7) << 3;
                                            if (((j20 >> i37) & j4) == 128) {
                                                jArr4[i36] = (j20 & (~(j4 << i37))) | (((long) (i31 & 127)) << i37);
                                                jArr4[i29] = (jArr4[i29] & (~(j4 << i30))) | (128 << i30);
                                                objArr3[iM2306e2] = objArr3[i28];
                                                objArr3[i28] = null;
                                                jArr5[iM2306e2] = jArr5[i28];
                                                jArr5[i28] = 4611686018427387903L;
                                                int i38 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                int i39 = Integer.MAX_VALUE;
                                                if (i38 != Integer.MAX_VALUE) {
                                                    j10 = j12;
                                                    jArr6[i38] = ((long) iM2306e2) | (jArr6[i38] & (-4294967296L));
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (-4294967296L);
                                                    i39 = Integer.MAX_VALUE;
                                                } else {
                                                    j10 = j12;
                                                    jArr6[i28] = (((long) Integer.MAX_VALUE) << 32) | ((long) iM2306e2);
                                                }
                                                jArr6[iM2306e2] = (((long) i28) << 32) | ((long) i39);
                                            } else {
                                                j10 = j12;
                                                jArr4[i36] = (((long) (i31 & 127)) << i37) | (j20 & (~(j4 << i37)));
                                                Object obj3 = objArr3[iM2306e2];
                                                objArr3[iM2306e2] = objArr3[i28];
                                                objArr3[i28] = obj3;
                                                long j21 = jArr5[iM2306e2];
                                                jArr5[iM2306e2] = jArr5[i28];
                                                jArr5[i28] = j21;
                                                int i40 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                if (i40 != Integer.MAX_VALUE) {
                                                    long j22 = iM2306e2;
                                                    jArr6[i40] = (jArr6[i40] & (-4294967296L)) | j22;
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (j22 << 32);
                                                } else {
                                                    long j23 = iM2306e2;
                                                    jArr6[i28] = j23 | (j23 << 32);
                                                    i40 = i28;
                                                }
                                                jArr6[iM2306e2] = (((long) i40) << 32) | ((long) i28);
                                                i28--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i35;
                                            objArr = objArr3;
                                            j12 = j10;
                                        }
                                    } else {
                                        i28++;
                                    }
                                }
                                j3 = j12;
                                this.f2944h = AbstractC0957r0.m2355a(this.f2942f) - this.f2943g;
                                long[] jArr7 = this.f2939c;
                                int length2 = jArr7.length;
                                for (int i41 = 0; i41 < length2; i41++) {
                                    long j24 = jArr7[i41];
                                    int i42 = (int) ((j24 >> 31) & 2147483647L);
                                    int i43 = (int) (j24 & 2147483647L);
                                    jArr7[i41] = (((j24 & (-4611686018427387904L)) | ((long) (i42 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i42] & 4294967295L)))) << 31) | ((long) (i43 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i43] & 4294967295L)));
                                }
                                int i44 = this.f2940d;
                                if (i44 != Integer.MAX_VALUE) {
                                    this.f2940d = (int) (jArr6[i44] & 4294967295L);
                                }
                                int i45 = this.f2941e;
                                if (i45 != Integer.MAX_VALUE) {
                                    this.f2941e = (int) (jArr6[i45] & 4294967295L);
                                }
                            }
                        }
                        iM2306e = m2306e(i12);
                    } else {
                        c10 = 31;
                        j5 = 128;
                    }
                    i9 = 0;
                    j3 = j12;
                    j4 = 255;
                    int iM2356b = AbstractC0957r0.m2356b(this.f2942f);
                    long[] jArr8 = this.f2937a;
                    Object[] objArr4 = this.f2938b;
                    long[] jArr9 = this.f2939c;
                    int i46 = this.f2942f;
                    int[] iArr = new int[i46];
                    m2307f(iM2356b);
                    long[] jArr10 = this.f2937a;
                    Object[] objArr5 = this.f2938b;
                    long[] jArr11 = this.f2939c;
                    int i47 = this.f2942f;
                    int i48 = 0;
                    while (i48 < i46) {
                        if (((jArr8[i48 >> 3] >> ((i48 & 7) << 3)) & 255) < j5) {
                            Object obj4 = objArr4[i48];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i20;
                            int i49 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2306e3 = m2306e(i49 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j25 = i49 & 127;
                            int i50 = iM2306e3 >> 3;
                            int i51 = (iM2306e3 & 7) << 3;
                            long j26 = (jArr[i50] & (~(255 << i51))) | (j25 << i51);
                            jArr[i50] = j26;
                            jArr[(((iM2306e3 - 7) & i47) + (i47 & 7)) >> 3] = j26;
                            objArr5[iM2306e3] = obj4;
                            jArr11[iM2306e3] = jArr9[i48];
                            iArr[i48] = iM2306e3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i48++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f2939c;
                    int length3 = jArr12.length;
                    for (int i52 = 0; i52 < length3; i52++) {
                        long j27 = jArr12[i52];
                        int i53 = (int) ((j27 >> c10) & 2147483647L);
                        int i54 = (int) (j27 & 2147483647L);
                        jArr12[i52] = (((j27 & (-4611686018427387904L)) | ((long) (i53 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i53]))) << c10) | ((long) (i54 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i54]));
                    }
                    int i55 = this.f2940d;
                    if (i55 != Integer.MAX_VALUE) {
                        this.f2940d = iArr[i55];
                    }
                    int i56 = this.f2941e;
                    if (i56 != Integer.MAX_VALUE) {
                        this.f2941e = iArr[i56];
                    }
                    iM2306e = m2306e(i12);
                }
                this.f2943g++;
                int i57 = this.f2944h;
                long[] jArr13 = this.f2937a;
                int i58 = iM2306e >> 3;
                long j28 = jArr13[i58];
                int i59 = (iM2306e & 7) << 3;
                if (((j28 >> i59) & j4) == j5) {
                    i9 = 1;
                }
                this.f2944h = i57 - i9;
                int i60 = this.f2942f;
                long j29 = (j28 & (~(j4 << i59))) | (j3 << i59);
                jArr13[i58] = j29;
                jArr13[(((iM2306e - 7) & i60) + (i60 & 7)) >> 3] = j29;
                return iM2306e;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i10 = i20;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m2306e(int i9) {
        int i10 = this.f2942f;
        int i11 = i9 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f2937a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j3 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j4 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j4 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j4) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0935g0)) {
            return false;
        }
        C0935g0 c0935g0 = (C0935g0) obj;
        if (c0935g0.f2943g != this.f2943g) {
            return false;
        }
        Object[] objArr = this.f2938b;
        long[] jArr = this.f2937a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128 && !c0935g0.m2304c(objArr[(i9 << 3) + i11])) {
                            return false;
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2307f(int i9) {
        long[] jArr;
        long[] jArr2;
        int iMax = i9 > 0 ? Math.max(7, AbstractC0957r0.m2357c(i9)) : 0;
        this.f2942f = iMax;
        if (iMax == 0) {
            jArr = AbstractC0957r0.f3015a;
        } else {
            int i10 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i10];
            Arrays.fill(jArr3, 0, i10, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f2937a = jArr;
        int i11 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f2944h = AbstractC0957r0.m2355a(this.f2942f) - this.f2943g;
        this.f2938b = iMax == 0 ? AbstractC1256a.f4115c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC0954q.f3005b;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.f2939c = jArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final boolean m2308g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f2942f;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f2937a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j3 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j4 = (((long) i10) * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i12) & i11;
                if (AbstractC1416l.m3825a(this.f2938b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        boolean z9 = iNumberOfTrailingZeros >= 0;
        if (z9) {
            m2309h(iNumberOfTrailingZeros);
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m2309h(int i9) {
        this.f2943g--;
        long[] jArr = this.f2937a;
        int i10 = this.f2942f;
        int i11 = i9 >> 3;
        int i12 = (i9 & 7) << 3;
        long j3 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j3;
        jArr[(((i9 - 7) & i10) + (i10 & 7)) >> 3] = j3;
        this.f2938b[i9] = null;
        long[] jArr2 = this.f2939c;
        long j4 = jArr2[i9];
        int i13 = (int) ((j4 >> 31) & 2147483647L);
        int i14 = (int) (j4 & 2147483647L);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & (-2147483648L)) | (((long) i14) & 2147483647L);
        } else {
            this.f2940d = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((((long) i13) & 2147483647L) << 31) | (jArr2[i14] & (-4611686016279904257L));
        } else {
            this.f2941e = i13;
        }
        jArr2[i9] = 4611686018427387903L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f2942f * 31) + this.f2943g;
        Object[] objArr = this.f2938b;
        long[] jArr = this.f2937a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i9 << 3) + i11];
                            if (!AbstractC1416l.m3825a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        return iHashCode;
                    }
                }
                if (i9 == length) {
                    break;
                }
                i9++;
            }
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2310i(Collection collection) {
        collection.getClass();
        Object[] objArr = this.f2938b;
        int i9 = this.f2943g;
        long[] jArr = this.f2937a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!AbstractC4166m.m8417o1(collection, objArr[i13])) {
                                m2309h(i13);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return i9 != this.f2943g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C0166f c0166f = new C0166f(this, 5);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f2938b;
        long[] jArr = this.f2939c;
        int i9 = this.f2941e;
        int i10 = 0;
        while (true) {
            if (i9 == Integer.MAX_VALUE) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = (int) ((jArr[i9] >> 31) & 2147483647L);
            Object obj = objArr[i9];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) c0166f.invoke(obj));
            i10++;
            i9 = i11;
        }
        return sb2.toString();
    }
}
