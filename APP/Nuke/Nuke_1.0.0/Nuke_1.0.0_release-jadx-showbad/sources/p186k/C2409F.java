package p186k;

import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.F */
/* JADX INFO: loaded from: classes.dex */
public final class C2409F {

    /* JADX INFO: renamed from: a */
    public long[] f7793a;

    /* JADX INFO: renamed from: b */
    public Object[] f7794b;

    /* JADX INFO: renamed from: c */
    public int f7795c;

    /* JADX INFO: renamed from: d */
    public int f7796d;

    /* JADX INFO: renamed from: e */
    public int f7797e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2409F(int i5) {
        this.f7793a = AbstractC2415L.f7816a;
        this.f7794b = AbstractC2477a.f7973c;
        if (i5 >= 0) {
            m4284f(AbstractC2415L.m4298d(i5));
        } else {
            AbstractC2477a.m4422c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4279a(Object obj) {
        int i5 = this.f7796d;
        this.f7794b[m4282d(obj)] = obj;
        return this.f7796d != i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4280b() {
        this.f7796d = 0;
        long[] jArr = this.f7793a;
        if (jArr != AbstractC2415L.f7816a) {
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
            long[] jArr2 = this.f7793a;
            int i5 = this.f7795c;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        AbstractC0972l.m1998V(this.f7794b, 0, this.f7795c);
        this.f7797e = AbstractC2415L.m4295a(this.f7795c) - this.f7796d;
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
    public final boolean m4281c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f7795c;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f7793a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j5 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (AbstractC1665j.m2981a(this.f7794b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m4282d(Object obj) {
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i5;
        Object[] objArr;
        int i6;
        int i7 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f7795c;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr3 = this.f7793a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr3[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr3[i14] >>> i15);
            long j9 = i10;
            int i16 = i10;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (j11 != 0) {
                int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
                int i17 = i7;
                if (AbstractC1665j.m2981a(this.f7794b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i7 = i17;
            }
            int i18 = i7;
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int iM4283e = m4283e(i9);
                long j12 = 255;
                if (this.f7797e != 0 || ((this.f7793a[iM4283e >> 3] >> ((iM4283e & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                } else {
                    int i19 = this.f7795c;
                    if (i19 > 8) {
                        int i20 = 8;
                        if (Long.compareUnsigned(((long) this.f7796d) * 32, ((long) i19) * 25) <= 0) {
                            long[] jArr4 = this.f7793a;
                            int i21 = this.f7795c;
                            Object[] objArr2 = this.f7794b;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = 0;
                            j7 = 128;
                            while (i23 < i22) {
                                long j13 = j12;
                                long j14 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j14) + (j14 >>> 7));
                                i23++;
                                i20 = i20;
                                j9 = j9;
                                j12 = j13;
                            }
                            j5 = j12;
                            j6 = j9;
                            int i24 = i20;
                            int iM2002Z = AbstractC0972l.m2002Z(jArr4);
                            int i25 = iM2002Z - 1;
                            long j15 = 72057594037927935L;
                            jArr4[i25] = (jArr4[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM2002Z] = jArr4[0];
                            int i26 = 0;
                            while (i26 != i21) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j16 = (jArr4[i27] >> i28) & j5;
                                if (j16 != 128 && j16 == 254) {
                                    Object obj2 = objArr2[i26];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i18;
                                    int i29 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i30 = i29 >>> 7;
                                    int iM4283e2 = m4283e(i30);
                                    int i31 = i30 & i21;
                                    if (((iM4283e2 - i31) & i21) / i24 == ((i26 - i31) & i21) / i24) {
                                        long j17 = j15;
                                        jArr4[i27] = (((long) (i29 & 127)) << i28) | ((~(j5 << i28)) & jArr4[i27]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j17) | Long.MIN_VALUE;
                                        i26++;
                                        j15 = j17;
                                    } else {
                                        long j18 = j15;
                                        int i32 = iM4283e2 >> 3;
                                        long j19 = jArr4[i32];
                                        int i33 = (iM4283e2 & 7) << 3;
                                        if (((j19 >> i33) & j5) == 128) {
                                            i6 = i24;
                                            i5 = i21;
                                            objArr = objArr2;
                                            jArr4[i32] = ((~(j5 << i33)) & j19) | (((long) (i29 & 127)) << i33);
                                            jArr4[i27] = (jArr4[i27] & (~(j5 << i28))) | (128 << i28);
                                            objArr[iM4283e2] = objArr[i26];
                                            objArr[i26] = null;
                                        } else {
                                            i5 = i21;
                                            objArr = objArr2;
                                            i6 = i24;
                                            jArr4[i32] = (((long) (i29 & 127)) << i33) | ((~(j5 << i33)) & j19);
                                            Object obj3 = objArr[iM4283e2];
                                            objArr[iM4283e2] = objArr[i26];
                                            objArr[i26] = obj3;
                                            i26--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                        i26++;
                                        j15 = j18;
                                        i24 = i6;
                                        i21 = i5;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            this.f7797e = AbstractC2415L.m4295a(this.f7795c) - this.f7796d;
                        }
                        iM4283e = m4283e(i9);
                    }
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                    int iM4296b = AbstractC2415L.m4296b(this.f7795c);
                    long[] jArr5 = this.f7793a;
                    Object[] objArr3 = this.f7794b;
                    int i34 = this.f7795c;
                    m4284f(iM4296b);
                    long[] jArr6 = this.f7793a;
                    Object[] objArr4 = this.f7794b;
                    int i35 = this.f7795c;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i36];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i18;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM4283e3 = m4283e(i37 >>> 7);
                            long j20 = i37 & 127;
                            int i38 = iM4283e3 >> 3;
                            int i39 = (iM4283e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = (jArr6[i38] & (~(255 << i39))) | (j20 << i39);
                            jArr[i38] = j21;
                            jArr[(((iM4283e3 - 7) & i35) + (i35 & 7)) >> 3] = j21;
                            objArr4[iM4283e3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i36++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM4283e = m4283e(i9);
                }
                this.f7796d++;
                int i40 = this.f7797e;
                long[] jArr7 = this.f7793a;
                int i41 = iM4283e >> 3;
                long j22 = jArr7[i41];
                int i42 = (iM4283e & 7) << 3;
                this.f7797e = i40 - (((j22 >> i42) & j5) == j7 ? 1 : 0);
                int i43 = this.f7795c;
                long j23 = (j22 & (~(j5 << i42))) | (j6 << i42);
                jArr7[i41] = j23;
                jArr7[(((iM4283e - 7) & i43) + (i43 & 7)) >> 3] = j23;
                return iM4283e;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i7 = i18;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m4283e(int i5) {
        int i6 = this.f7795c;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f7793a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j6 = j5 & ((~j5) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
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
        if (!(obj instanceof C2409F)) {
            return false;
        }
        C2409F c2409f = (C2409F) obj;
        if (c2409f.f7796d != this.f7796d) {
            return false;
        }
        Object[] objArr = this.f7794b;
        long[] jArr = this.f7793a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128 && !c2409f.m4281c(objArr[(i5 << 3) + i7])) {
                            return false;
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4284f(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, AbstractC2415L.m4297c(i5)) : 0;
        this.f7795c = iMax;
        if (iMax == 0) {
            jArr = AbstractC2415L.f7816a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
        }
        this.f7793a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f7797e = AbstractC2415L.m4295a(this.f7795c) - this.f7796d;
        this.f7794b = iMax == 0 ? AbstractC2477a.f7973c : new Object[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4285g() {
        return this.f7796d == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4286h() {
        return this.f7796d != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f7795c * 31) + this.f7796d;
        Object[] objArr = this.f7794b;
        long[] jArr = this.f7793a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i5 << 3) + i7];
                            if (!AbstractC1665j.m2981a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return iHashCode;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
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
    public final void m4287i(Object obj) {
        int iNumberOfTrailingZeros;
        int i5 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f7795c;
        int i9 = i6 >>> 7;
        loop0: while (true) {
            int i10 = i9 & i8;
            long[] jArr = this.f7793a;
            int i11 = i10 >> 3;
            int i12 = (i10 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (((long) i7) * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i8;
                if (AbstractC1665j.m2981a(this.f7794b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                } else {
                    j7 &= j7 - 1;
                }
            }
            i5 += 8;
            i9 = i10 + i5;
        }
        if (iNumberOfTrailingZeros >= 0) {
            m4291m(iNumberOfTrailingZeros);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4288j(Object obj) {
        this.f7794b[m4282d(obj)] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4289k(C2409F c2409f) {
        AbstractC1665j.m2985e(c2409f, "elements");
        Object[] objArr = c2409f.f7794b;
        long[] jArr = c2409f.f7793a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        m4288j(objArr[(i5 << 3) + i7]);
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
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
    public final boolean m4290l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f7795c;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f7793a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j5 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (AbstractC1665j.m2981a(this.f7794b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        boolean z5 = iNumberOfTrailingZeros >= 0;
        if (z5) {
            m4291m(iNumberOfTrailingZeros);
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4291m(int i5) {
        this.f7796d--;
        long[] jArr = this.f7793a;
        int i6 = this.f7795c;
        int i7 = i5 >> 3;
        int i8 = (i5 & 7) << 3;
        long j5 = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        jArr[i7] = j5;
        jArr[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j5;
        this.f7794b[i5] = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[PHI: r7
  0x0066: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:21:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f7794b;
        long[] jArr = this.f7793a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i5 << 3) + i8];
                            if (i6 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i6 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i6++;
                        }
                        j5 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
            sb.append((CharSequence) "]");
        } else {
            sb.append((CharSequence) "]");
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:7) call: k.F.<init>(int):void type: THIS */
    public /* synthetic */ C2409F() {
        this(6);
    }
}
