package p069f;

import gg.AbstractC1416l;
import java.util.Arrays;
import p016b1.C0166f;
import p087g.AbstractC1256a;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0945l0 {

    /* JADX INFO: renamed from: a */
    public long[] f2975a;

    /* JADX INFO: renamed from: b */
    public Object[] f2976b;

    /* JADX INFO: renamed from: c */
    public int f2977c;

    /* JADX INFO: renamed from: d */
    public int f2978d;

    /* JADX INFO: renamed from: e */
    public int f2979e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0945l0(int i9) {
        this.f2975a = AbstractC0957r0.f3015a;
        this.f2976b = AbstractC1256a.f4115c;
        if (i9 >= 0) {
            m2333f(AbstractC0957r0.m2358d(i9));
        } else {
            C2104o.m5294t("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m2328a(Object obj) {
        int i9 = this.f2978d;
        this.f2976b[m2331d(obj)] = obj;
        return this.f2978d != i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2329b() {
        this.f2978d = 0;
        long[] jArr = this.f2975a;
        if (jArr != AbstractC0957r0.f3015a) {
            AbstractC4165l.m8388w0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f2975a;
            int i9 = this.f2977c;
            int i10 = i9 >> 3;
            long j3 = 255 << ((i9 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j3)) | j3;
        }
        AbstractC4165l.m8387v0(0, this.f2977c, null, this.f2976b);
        this.f2979e = AbstractC0957r0.m2355a(this.f2977c) - this.f2978d;
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
    public final boolean m2330c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f2977c;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f2975a;
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
                if (AbstractC1416l.m3825a(this.f2976b[iNumberOfTrailingZeros], obj)) {
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
    public final int m2331d(Object obj) {
        long j3;
        long j4;
        long j5;
        long[] jArr;
        long[] jArr2;
        int i9;
        Object[] objArr;
        int i10;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f2977c;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f2975a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j11 = i14;
            int i20 = i14;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j13) >> 3)) & i15;
                int i21 = i11;
                if (AbstractC1416l.m3825a(this.f2976b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM2332e = m2332e(i13);
                long j14 = 255;
                if (this.f2979e != 0 || ((this.f2975a[iM2332e >> 3] >> ((iM2332e & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j4 = j11;
                    j5 = 128;
                } else {
                    int i23 = this.f2977c;
                    if (i23 > 8) {
                        int i24 = 8;
                        if (Long.compareUnsigned(((long) this.f2978d) * 32, ((long) i23) * 25) <= 0) {
                            long[] jArr4 = this.f2975a;
                            int i25 = this.f2977c;
                            Object[] objArr2 = this.f2976b;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            j5 = 128;
                            while (i27 < i26) {
                                long j15 = j14;
                                long j16 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i27++;
                                i24 = i24;
                                j11 = j11;
                                j14 = j15;
                            }
                            j3 = j14;
                            j4 = j11;
                            int i28 = i24;
                            int iM8365B0 = AbstractC4165l.m8365B0(jArr4);
                            int i29 = iM8365B0 - 1;
                            long j17 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM8365B0] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j18 = (jArr4[i31] >> i32) & j3;
                                if (j18 != 128 && j18 == 254) {
                                    Object obj2 = objArr2[i30];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i22;
                                    int i33 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i34 = i33 >>> 7;
                                    int iM2332e2 = m2332e(i34);
                                    int i35 = i34 & i25;
                                    if (((iM2332e2 - i35) & i25) / i28 == ((i30 - i35) & i25) / i28) {
                                        long j19 = j17;
                                        jArr4[i31] = (((long) (i33 & 127)) << i32) | ((~(j3 << i32)) & jArr4[i31]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i30++;
                                        j17 = j19;
                                    } else {
                                        long j20 = j17;
                                        int i36 = iM2332e2 >> 3;
                                        long j21 = jArr4[i36];
                                        int i37 = (iM2332e2 & 7) << 3;
                                        if (((j21 >> i37) & j3) == 128) {
                                            i10 = i28;
                                            i9 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j3 << i37)) & j21) | (((long) (i33 & 127)) << i37);
                                            jArr4[i31] = (jArr4[i31] & (~(j3 << i32))) | (128 << i32);
                                            objArr[iM2332e2] = objArr[i30];
                                            objArr[i30] = null;
                                        } else {
                                            i9 = i25;
                                            objArr = objArr2;
                                            i10 = i28;
                                            jArr4[i36] = (((long) (i33 & 127)) << i37) | ((~(j3 << i37)) & j21);
                                            Object obj3 = objArr[iM2332e2];
                                            objArr[iM2332e2] = objArr[i30];
                                            objArr[i30] = obj3;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j20) | Long.MIN_VALUE;
                                        i30++;
                                        j17 = j20;
                                        i28 = i10;
                                        i25 = i9;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f2979e = AbstractC0957r0.m2355a(this.f2977c) - this.f2978d;
                        }
                        iM2332e = m2332e(i13);
                    }
                    j3 = 255;
                    j4 = j11;
                    j5 = 128;
                    int iM2356b = AbstractC0957r0.m2356b(this.f2977c);
                    long[] jArr5 = this.f2975a;
                    Object[] objArr3 = this.f2976b;
                    int i38 = this.f2977c;
                    m2333f(iM2356b);
                    long[] jArr6 = this.f2975a;
                    Object[] objArr4 = this.f2976b;
                    int i39 = this.f2977c;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i40];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i22;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2332e3 = m2332e(i41 >>> 7);
                            long j22 = i41 & 127;
                            int i42 = iM2332e3 >> 3;
                            int i43 = (iM2332e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = (jArr6[i42] & (~(255 << i43))) | (j22 << i43);
                            jArr[i42] = j23;
                            jArr[(((iM2332e3 - 7) & i39) + (i39 & 7)) >> 3] = j23;
                            objArr4[iM2332e3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM2332e = m2332e(i13);
                }
                this.f2978d++;
                int i44 = this.f2979e;
                long[] jArr7 = this.f2975a;
                int i45 = iM2332e >> 3;
                long j24 = jArr7[i45];
                int i46 = (iM2332e & 7) << 3;
                this.f2979e = i44 - (((j24 >> i46) & j3) == j5 ? 1 : 0);
                int i47 = this.f2977c;
                long j25 = (j24 & (~(j3 << i46))) | (j4 << i46);
                jArr7[i45] = j25;
                jArr7[(((iM2332e - 7) & i47) + (i47 & 7)) >> 3] = j25;
                return iM2332e;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m2332e(int i9) {
        int i10 = this.f2977c;
        int i11 = i9 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f2975a;
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
        if (!(obj instanceof C0945l0)) {
            return false;
        }
        C0945l0 c0945l0 = (C0945l0) obj;
        if (c0945l0.f2978d != this.f2978d) {
            return false;
        }
        Object[] objArr = this.f2976b;
        long[] jArr = this.f2975a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128 && !c0945l0.m2330c(objArr[(i9 << 3) + i11])) {
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
    public final void m2333f(int i9) {
        long[] jArr;
        int iMax = i9 > 0 ? Math.max(7, AbstractC0957r0.m2357c(i9)) : 0;
        this.f2977c = iMax;
        if (iMax == 0) {
            jArr = AbstractC0957r0.f3015a;
        } else {
            int i10 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f2975a = jArr;
        int i11 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f2979e = AbstractC0957r0.m2355a(this.f2977c) - this.f2978d;
        this.f2976b = iMax == 0 ? AbstractC1256a.f4115c : new Object[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m2334g() {
        return this.f2978d == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m2335h() {
        return this.f2978d != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f2977c * 31) + this.f2978d;
        Object[] objArr = this.f2976b;
        long[] jArr = this.f2975a;
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
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2336i(Object obj) {
        int iNumberOfTrailingZeros;
        int i9 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f2977c;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f2975a;
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
                if (AbstractC1416l.m3825a(this.f2976b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                } else {
                    j5 &= j5 - 1;
                }
            }
            i9 += 8;
            i13 = i14 + i9;
        }
        if (iNumberOfTrailingZeros >= 0) {
            m2340m(iNumberOfTrailingZeros);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m2337j(C0945l0 c0945l0) {
        c0945l0.getClass();
        Object[] objArr = c0945l0.f2976b;
        long[] jArr = c0945l0.f2975a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128) {
                        m2338k(objArr[(i9 << 3) + i11]);
                    }
                    j3 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length) {
                return;
            } else {
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m2338k(Object obj) {
        this.f2976b[m2331d(obj)] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2339l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f2977c;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f2975a;
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
                if (AbstractC1416l.m3825a(this.f2976b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        boolean z9 = iNumberOfTrailingZeros >= 0;
        if (z9) {
            m2340m(iNumberOfTrailingZeros);
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m2340m(int i9) {
        this.f2978d--;
        long[] jArr = this.f2975a;
        int i10 = this.f2977c;
        int i11 = i9 >> 3;
        int i12 = (i9 & 7) << 3;
        long j3 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j3;
        jArr[(((i9 - 7) & i10) + (i10 & 7)) >> 3] = j3;
        this.f2976b[i9] = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        C0166f c0166f = new C0166f(this, 6);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f2976b;
        long[] jArr = this.f2975a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i9 << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append((CharSequence) c0166f.invoke(obj));
                            i10++;
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
            sb2.append((CharSequence) "]");
        } else {
            sb2.append((CharSequence) "]");
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:29) call: f.l0.<init>(int):void type: THIS */
    public /* synthetic */ C0945l0() {
        this(6);
    }
}
