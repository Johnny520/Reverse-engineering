package p069f;

import gg.AbstractC1416l;
import java.util.Arrays;
import p087g.AbstractC1256a;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0943k0 {

    /* JADX INFO: renamed from: a */
    public long[] f2968a;

    /* JADX INFO: renamed from: b */
    public Object[] f2969b;

    /* JADX INFO: renamed from: c */
    public Object[] f2970c;

    /* JADX INFO: renamed from: d */
    public int f2971d;

    /* JADX INFO: renamed from: e */
    public int f2972e;

    /* JADX INFO: renamed from: f */
    public int f2973f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0943k0(int i9) {
        this.f2968a = AbstractC0957r0.f3015a;
        Object[] objArr = AbstractC1256a.f4115c;
        this.f2969b = objArr;
        this.f2970c = objArr;
        if (i9 >= 0) {
            m2321h(AbstractC0957r0.m2358d(i9));
        } else {
            C2104o.m5294t("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2314a() {
        this.f2972e = 0;
        long[] jArr = this.f2968a;
        if (jArr != AbstractC0957r0.f3015a) {
            AbstractC4165l.m8388w0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f2968a;
            int i9 = this.f2971d;
            int i10 = i9 >> 3;
            long j3 = 255 << ((i9 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j3)) | j3;
        }
        AbstractC4165l.m8387v0(0, this.f2971d, null, this.f2970c);
        AbstractC4165l.m8387v0(0, this.f2971d, null, this.f2969b);
        this.f2973f = AbstractC0957r0.m2355a(this.f2971d) - this.f2972e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2315b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f2971d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f2968a;
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
                if (AbstractC1416l.m3825a(this.f2969b[iNumberOfTrailingZeros], obj)) {
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
    public final boolean m2316c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f2971d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f2968a;
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
                if (AbstractC1416l.m3825a(this.f2969b[iNumberOfTrailingZeros], obj)) {
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
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2317d(Object obj) {
        Object[] objArr = this.f2970c;
        long[] jArr = this.f2968a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128 && AbstractC1416l.m3825a(obj, objArr[(i9 << 3) + i11])) {
                            return true;
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
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m2318e(int i9) {
        int i10 = this.f2971d;
        int i11 = i9 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f2968a;
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
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0943k0)) {
            return false;
        }
        C0943k0 c0943k0 = (C0943k0) obj;
        if (c0943k0.f2972e != this.f2972e) {
            return false;
        }
        Object[] objArr = this.f2969b;
        Object[] objArr2 = this.f2970c;
        long[] jArr = this.f2968a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            loop0: while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128) {
                            int i12 = (i9 << 3) + i11;
                            Object obj2 = objArr[i12];
                            Object obj3 = objArr2[i12];
                            if (obj3 == null) {
                                if (c0943k0.m2320g(obj2) != null || !c0943k0.m2316c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(c0943k0.m2320g(obj2))) {
                                return false;
                            }
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
    public final int m2319f(Object obj) {
        long j3;
        long j4;
        long j5;
        long[] jArr;
        long[] jArr2;
        int i9;
        Object[] objArr;
        int i10 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f2971d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f2968a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j11 = i13;
            int i19 = i13;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j13) >> 3)) & i14;
                int i20 = i10;
                if (AbstractC1416l.m3825a(this.f2969b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM2318e = m2318e(i12);
                long j14 = 255;
                if (this.f2973f != 0 || ((this.f2968a[iM2318e >> 3] >> ((iM2318e & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j4 = j11;
                    j5 = 128;
                } else {
                    int i22 = this.f2971d;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compareUnsigned(((long) this.f2972e) * 32, ((long) i22) * 25) <= 0) {
                            long[] jArr4 = this.f2968a;
                            int i24 = this.f2971d;
                            Object[] objArr2 = this.f2969b;
                            Object[] objArr3 = this.f2970c;
                            j5 = 128;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
                            while (i26 < i25) {
                                long j15 = j14;
                                long j16 = jArr4[i26] & (-9187201950435737472L);
                                jArr4[i26] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i26++;
                                i23 = i23;
                                j11 = j11;
                                j14 = j15;
                            }
                            j3 = j14;
                            j4 = j11;
                            int i27 = i23;
                            int iM8365B0 = AbstractC4165l.m8365B0(jArr4);
                            int i28 = iM8365B0 - 1;
                            jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM8365B0] = jArr4[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j17 = (jArr4[i30] >> i31) & j3;
                                if (j17 != 128 && j17 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i33 = i32 >>> 7;
                                    int iM2318e2 = m2318e(i33);
                                    int i34 = i33 & i24;
                                    if (((iM2318e2 - i34) & i24) / i27 == ((i29 - i34) & i24) / i27) {
                                        jArr4[i30] = (((long) (i32 & 127)) << i31) | (jArr4[i30] & (~(j3 << i31)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i29++;
                                        i27 = i27;
                                    } else {
                                        int i35 = i27;
                                        int i36 = iM2318e2 >> 3;
                                        long j18 = jArr4[i36];
                                        int i37 = (iM2318e2 & 7) << 3;
                                        if (((j18 >> i37) & j3) == 128) {
                                            i9 = i24;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j3 << i37)) & j18) | (((long) (i32 & 127)) << i37);
                                            jArr4[i30] = (jArr4[i30] & (~(j3 << i31))) | (128 << i31);
                                            objArr[iM2318e2] = objArr[i29];
                                            objArr[i29] = null;
                                            objArr3[iM2318e2] = objArr3[i29];
                                            objArr3[i29] = null;
                                        } else {
                                            i9 = i24;
                                            objArr = objArr2;
                                            jArr4[i36] = (((long) (i32 & 127)) << i37) | ((~(j3 << i37)) & j18);
                                            Object obj3 = objArr[iM2318e2];
                                            objArr[iM2318e2] = objArr[i29];
                                            objArr[i29] = obj3;
                                            Object obj4 = objArr3[iM2318e2];
                                            objArr3[iM2318e2] = objArr3[i29];
                                            objArr3[i29] = obj4;
                                            i29--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i29++;
                                        i27 = i35;
                                        i24 = i9;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f2973f = AbstractC0957r0.m2355a(this.f2971d) - this.f2972e;
                        }
                        iM2318e = m2318e(i12);
                    }
                    j3 = 255;
                    j4 = j11;
                    j5 = 128;
                    int iM2356b = AbstractC0957r0.m2356b(this.f2971d);
                    long[] jArr5 = this.f2968a;
                    Object[] objArr4 = this.f2969b;
                    Object[] objArr5 = this.f2970c;
                    int i38 = this.f2971d;
                    m2321h(iM2356b);
                    long[] jArr6 = this.f2968a;
                    Object[] objArr6 = this.f2969b;
                    Object[] objArr7 = this.f2970c;
                    int i39 = this.f2971d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i40];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i21;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2318e3 = m2318e(i41 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j19 = i41 & 127;
                            int i42 = iM2318e3 >> 3;
                            int i43 = (iM2318e3 & 7) << 3;
                            long j20 = (jArr[i42] & (~(255 << i43))) | (j19 << i43);
                            jArr[i42] = j20;
                            jArr[(((iM2318e3 - 7) & i39) + (i39 & 7)) >> 3] = j20;
                            objArr6[iM2318e3] = obj5;
                            objArr7[iM2318e3] = objArr5[i40];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM2318e = m2318e(i12);
                }
                this.f2972e++;
                int i44 = this.f2973f;
                long[] jArr7 = this.f2968a;
                int i45 = iM2318e >> 3;
                long j21 = jArr7[i45];
                int i46 = (iM2318e & 7) << 3;
                this.f2973f = i44 - (((j21 >> i46) & j3) == j5 ? 1 : 0);
                int i47 = this.f2971d;
                long j22 = (j21 & (~(j3 << i46))) | (j4 << i46);
                jArr7[i45] = j22;
                jArr7[(((iM2318e - 7) & i47) + (i47 & 7)) >> 3] = j22;
                return ~iM2318e;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2320g(Object obj) {
        int iNumberOfTrailingZeros;
        int i9 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f2971d;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f2968a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j3 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j4 = (((long) i11) * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i14) & i12;
                if (AbstractC1416l.m3825a(this.f2969b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i9 += 8;
            i13 = i14 + i9;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f2970c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m2321h(int i9) {
        long[] jArr;
        int iMax = i9 > 0 ? Math.max(7, AbstractC0957r0.m2357c(i9)) : 0;
        this.f2971d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0957r0.f3015a;
        } else {
            int i10 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            int i11 = iMax >> 3;
            long j3 = 255 << ((iMax & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j3)) | j3;
            jArr = jArr2;
        }
        this.f2968a = jArr;
        this.f2973f = AbstractC0957r0.m2355a(this.f2971d) - this.f2972e;
        Object[] objArr = AbstractC1256a.f4115c;
        this.f2969b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f2970c = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f2969b;
        Object[] objArr2 = this.f2970c;
        long[] jArr = this.f2968a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i9 = 0;
        int iHashCode = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128) {
                        int i12 = (i9 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j3 >>= 8;
                }
                if (i10 != 8) {
                    return iHashCode;
                }
            }
            if (i9 == length) {
                return iHashCode;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m2322i() {
        return this.f2972e == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m2323j() {
        return this.f2972e != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2324k(Object obj) {
        int iNumberOfTrailingZeros;
        int i9 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f2971d;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f2968a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j3 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j4 = (((long) i11) * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i14) & i12;
                if (AbstractC1416l.m3825a(this.f2969b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i9 += 8;
            i13 = i14 + i9;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m2325l(iNumberOfTrailingZeros);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Object m2325l(int i9) {
        this.f2972e--;
        long[] jArr = this.f2968a;
        int i10 = this.f2971d;
        int i11 = i9 >> 3;
        int i12 = (i9 & 7) << 3;
        long j3 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j3;
        jArr[(((i9 - 7) & i10) + (i10 & 7)) >> 3] = j3;
        this.f2969b[i9] = null;
        Object[] objArr = this.f2970c;
        Object obj = objArr[i9];
        objArr[i9] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m2326m(Object obj, Object obj2) {
        int iM2319f = m2319f(obj);
        if (iM2319f < 0) {
            iM2319f = ~iM2319f;
        }
        this.f2969b[iM2319f] = obj;
        this.f2970c[iM2319f] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[PHI: r8
  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (m2322i()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f2969b;
        Object[] objArr2 = this.f2970c;
        long[] jArr = this.f2968a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            int i13 = (i9 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i10++;
                            if (i10 < this.f2972e) {
                                sb2.append(", ");
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:36) call: f.k0.<init>(int):void type: THIS */
    public /* synthetic */ C0943k0() {
        this(6);
    }
}
