package p069f;

import gg.AbstractC1416l;
import java.util.Arrays;
import p087g.AbstractC1256a;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0925b0 {

    /* JADX INFO: renamed from: a */
    public long[] f2894a;

    /* JADX INFO: renamed from: b */
    public Object[] f2895b;

    /* JADX INFO: renamed from: c */
    public int[] f2896c;

    /* JADX INFO: renamed from: d */
    public int f2897d;

    /* JADX INFO: renamed from: e */
    public int f2898e;

    /* JADX INFO: renamed from: f */
    public int f2899f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0925b0(int i9) {
        this.f2894a = AbstractC0957r0.f3015a;
        this.f2895b = AbstractC1256a.f4115c;
        this.f2896c = AbstractC0946m.f2980a;
        if (i9 >= 0) {
            m2271e(AbstractC0957r0.m2358d(i9));
        } else {
            C2104o.m5294t("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2267a() {
        this.f2898e = 0;
        long[] jArr = this.f2894a;
        if (jArr != AbstractC0957r0.f3015a) {
            AbstractC4165l.m8388w0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f2894a;
            int i9 = this.f2897d;
            int i10 = i9 >> 3;
            long j3 = 255 << ((i9 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j3)) | j3;
        }
        AbstractC4165l.m8387v0(0, this.f2897d, null, this.f2895b);
        this.f2899f = AbstractC0957r0.m2355a(this.f2897d) - this.f2898e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m2268b(int i9) {
        int i10 = this.f2897d;
        int i11 = i9 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f2894a;
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
    /* JADX INFO: renamed from: c */
    public final int m2269c(Object obj) {
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
        int i14 = this.f2897d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f2894a;
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
                if (AbstractC1416l.m3825a(this.f2895b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM2268b = m2268b(i12);
                long j14 = 255;
                if (this.f2899f != 0 || ((this.f2894a[iM2268b >> 3] >> ((iM2268b & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j4 = j11;
                    j5 = 128;
                } else {
                    int i22 = this.f2897d;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compareUnsigned(((long) this.f2898e) * 32, ((long) i22) * 25) <= 0) {
                            long[] jArr4 = this.f2894a;
                            int i24 = this.f2897d;
                            Object[] objArr2 = this.f2895b;
                            int[] iArr = this.f2896c;
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
                            long j17 = 72057594037927935L;
                            jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM8365B0] = jArr4[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j18 = (jArr4[i30] >> i31) & j3;
                                if (j18 != 128 && j18 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i33 = i32 >>> 7;
                                    int iM2268b2 = m2268b(i33);
                                    int i34 = i33 & i24;
                                    long j19 = j17;
                                    if (((iM2268b2 - i34) & i24) / 8 == ((i29 - i34) & i24) / i27) {
                                        jArr4[i30] = (((long) (i32 & 127)) << i31) | (jArr4[i30] & (~(j3 << i31)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i29++;
                                        i27 = i27;
                                        j17 = j19;
                                    } else {
                                        int i35 = i27;
                                        int i36 = iM2268b2 >> 3;
                                        long j20 = jArr4[i36];
                                        int i37 = (iM2268b2 & 7) << 3;
                                        if (((j20 >> i37) & j3) == 128) {
                                            i9 = i24;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j3 << i37)) & j20) | (((long) (i32 & 127)) << i37);
                                            jArr4[i30] = (jArr4[i30] & (~(j3 << i31))) | (128 << i31);
                                            objArr[iM2268b2] = objArr[i29];
                                            objArr[i29] = null;
                                            iArr[iM2268b2] = iArr[i29];
                                            iArr[i29] = 0;
                                        } else {
                                            i9 = i24;
                                            objArr = objArr2;
                                            jArr4[i36] = (((long) (i32 & 127)) << i37) | ((~(j3 << i37)) & j20);
                                            Object obj3 = objArr[iM2268b2];
                                            objArr[iM2268b2] = objArr[i29];
                                            objArr[i29] = obj3;
                                            int i38 = iArr[iM2268b2];
                                            iArr[iM2268b2] = iArr[i29];
                                            iArr[i29] = i38;
                                            i29--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i29++;
                                        i24 = i9;
                                        i27 = i35;
                                        j17 = j19;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f2899f = AbstractC0957r0.m2355a(this.f2897d) - this.f2898e;
                        }
                        iM2268b = m2268b(i12);
                    }
                    j3 = 255;
                    j4 = j11;
                    j5 = 128;
                    int iM2356b = AbstractC0957r0.m2356b(this.f2897d);
                    long[] jArr5 = this.f2894a;
                    Object[] objArr3 = this.f2895b;
                    int[] iArr2 = this.f2896c;
                    int i39 = this.f2897d;
                    m2271e(iM2356b);
                    long[] jArr6 = this.f2894a;
                    Object[] objArr4 = this.f2895b;
                    int[] iArr3 = this.f2896c;
                    int i40 = this.f2897d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr5[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i41];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2268b3 = m2268b(i42 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = i42 & 127;
                            int i43 = iM2268b3 >> 3;
                            int i44 = (iM2268b3 & 7) << 3;
                            long j22 = (jArr[i43] & (~(255 << i44))) | (j21 << i44);
                            jArr[i43] = j22;
                            jArr[(((iM2268b3 - 7) & i40) + (i40 & 7)) >> 3] = j22;
                            objArr4[iM2268b3] = obj4;
                            iArr3[iM2268b3] = iArr2[i41];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i41++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM2268b = m2268b(i12);
                }
                this.f2898e++;
                int i45 = this.f2899f;
                long[] jArr7 = this.f2894a;
                int i46 = iM2268b >> 3;
                long j23 = jArr7[i46];
                int i47 = (iM2268b & 7) << 3;
                this.f2899f = i45 - (((j23 >> i47) & j3) == j5 ? 1 : 0);
                int i48 = this.f2897d;
                long j24 = (j23 & (~(j3 << i47))) | (j4 << i47);
                jArr7[i46] = j24;
                jArr7[(((iM2268b - 7) & i48) + (i48 & 7)) >> 3] = j24;
                return ~iM2268b;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m2270d(Object obj) {
        int i9 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f2897d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f2894a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j3 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j4 = (((long) i11) * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i14) & i12;
                if (AbstractC1416l.m3825a(this.f2895b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i9 += 8;
            i13 = i14 + i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2271e(int i9) {
        long[] jArr;
        int iMax = i9 > 0 ? Math.max(7, AbstractC0957r0.m2357c(i9)) : 0;
        this.f2897d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0957r0.f3015a;
        } else {
            int i10 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f2894a = jArr;
        int i11 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f2899f = AbstractC0957r0.m2355a(this.f2897d) - this.f2898e;
        this.f2895b = new Object[iMax];
        this.f2896c = new int[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0925b0)) {
            return false;
        }
        C0925b0 c0925b0 = (C0925b0) obj;
        if (c0925b0.f2898e != this.f2898e) {
            return false;
        }
        Object[] objArr = this.f2895b;
        int[] iArr = this.f2896c;
        long[] jArr = this.f2894a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i9 = 0;
        loop0: while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j3) < 128) {
                        int i12 = (i9 << 3) + i11;
                        Object obj2 = objArr[i12];
                        int i13 = iArr[i12];
                        int iM2270d = c0925b0.m2270d(obj2);
                        if (iM2270d < 0) {
                            break loop0;
                        }
                        z10 = z11;
                        if (i13 != c0925b0.f2896c[iM2270d]) {
                            break loop0;
                        }
                    } else {
                        z10 = z11;
                    }
                    j3 >>= 8;
                    i11++;
                    z11 = z10;
                }
                z9 = z11;
                if (i10 != 8) {
                    return z9;
                }
            } else {
                z9 = z11;
            }
            if (i9 == length) {
                return z9;
            }
            i9++;
            z11 = z9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2272f(int i9) {
        this.f2898e--;
        long[] jArr = this.f2894a;
        int i10 = this.f2897d;
        int i11 = i9 >> 3;
        int i12 = (i9 & 7) << 3;
        long j3 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j3;
        jArr[(((i9 - 7) & i10) + (i10 & 7)) >> 3] = j3;
        this.f2895b[i9] = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m2273g(int i9, Object obj) {
        int iM2269c = m2269c(obj);
        if (iM2269c < 0) {
            iM2269c = ~iM2269c;
        }
        this.f2895b[iM2269c] = obj;
        this.f2896c[iM2269c] = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f2895b;
        int[] iArr = this.f2896c;
        long[] jArr = this.f2894a;
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
                        iHashCode += Integer.hashCode(iArr[i12]) ^ (obj != null ? obj.hashCode() : 0);
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
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (this.f2898e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f2895b;
        int[] iArr = this.f2896c;
        long[] jArr = this.f2894a;
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
                            int i14 = iArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i14);
                            i10++;
                            if (i10 < this.f2898e) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:38) call: f.b0.<init>(int):void type: THIS */
    public /* synthetic */ C0925b0() {
        this(6);
    }
}
