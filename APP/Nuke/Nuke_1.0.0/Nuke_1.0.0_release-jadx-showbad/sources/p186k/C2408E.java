package p186k;

import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.E */
/* JADX INFO: loaded from: classes.dex */
public final class C2408E {

    /* JADX INFO: renamed from: a */
    public long[] f7787a;

    /* JADX INFO: renamed from: b */
    public Object[] f7788b;

    /* JADX INFO: renamed from: c */
    public Object[] f7789c;

    /* JADX INFO: renamed from: d */
    public int f7790d;

    /* JADX INFO: renamed from: e */
    public int f7791e;

    /* JADX INFO: renamed from: f */
    public int f7792f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2408E(int i5) {
        this.f7787a = AbstractC2415L.f7816a;
        Object[] objArr = AbstractC2477a.f7973c;
        this.f7788b = objArr;
        this.f7789c = objArr;
        if (i5 >= 0) {
            m4273h(AbstractC2415L.m4298d(i5));
        } else {
            AbstractC2477a.m4422c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4266a() {
        this.f7791e = 0;
        long[] jArr = this.f7787a;
        if (jArr != AbstractC2415L.f7816a) {
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
            long[] jArr2 = this.f7787a;
            int i5 = this.f7790d;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        AbstractC0972l.m1998V(this.f7789c, 0, this.f7790d);
        AbstractC0972l.m1998V(this.f7788b, 0, this.f7790d);
        this.f7792f = AbstractC2415L.m4295a(this.f7790d) - this.f7791e;
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
    public final boolean m4267b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f7790d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f7787a;
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
                if (AbstractC1665j.m2981a(this.f7788b[iNumberOfTrailingZeros], obj)) {
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
    public final boolean m4268c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f7790d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f7787a;
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
                if (AbstractC1665j.m2981a(this.f7788b[iNumberOfTrailingZeros], obj)) {
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
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4269d(Object obj) {
        Object[] objArr = this.f7789c;
        long[] jArr = this.f7787a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128 && AbstractC1665j.m2981a(obj, objArr[(i5 << 3) + i7])) {
                            return true;
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
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m4270e(int i5) {
        int i6 = this.f7790d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f7787a;
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
        if (!(obj instanceof C2408E)) {
            return false;
        }
        C2408E c2408e = (C2408E) obj;
        if (c2408e.f7791e != this.f7791e) {
            return false;
        }
        Object[] objArr = this.f7788b;
        Object[] objArr2 = this.f7789c;
        long[] jArr = this.f7787a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            loop0: while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            int i8 = (i5 << 3) + i7;
                            Object obj2 = objArr[i8];
                            Object obj3 = objArr2[i8];
                            if (obj3 == null) {
                                if (c2408e.m4272g(obj2) != null || !c2408e.m4268c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(c2408e.m4272g(obj2))) {
                                return false;
                            }
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
    public final int m4271f(Object obj) {
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i5;
        Object[] objArr;
        int i6 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f7790d;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr3 = this.f7787a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr3[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr3[i13] >>> i14);
            long j9 = i9;
            int i15 = i9;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (j11 != 0) {
                int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
                int i16 = i6;
                if (AbstractC1665j.m2981a(this.f7788b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i6 = i16;
            }
            int i17 = i6;
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int iM4270e = m4270e(i8);
                long j12 = 255;
                if (this.f7792f != 0 || ((this.f7787a[iM4270e >> 3] >> ((iM4270e & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                } else {
                    int i18 = this.f7790d;
                    if (i18 > 8) {
                        int i19 = 8;
                        if (Long.compareUnsigned(((long) this.f7791e) * 32, ((long) i18) * 25) <= 0) {
                            long[] jArr4 = this.f7787a;
                            int i20 = this.f7790d;
                            Object[] objArr2 = this.f7788b;
                            Object[] objArr3 = this.f7789c;
                            j7 = 128;
                            int i21 = (i20 + 7) >> 3;
                            int i22 = 0;
                            while (i22 < i21) {
                                long j13 = j12;
                                long j14 = jArr4[i22] & (-9187201950435737472L);
                                jArr4[i22] = (-72340172838076674L) & ((~j14) + (j14 >>> 7));
                                i22++;
                                i19 = i19;
                                j9 = j9;
                                j12 = j13;
                            }
                            j5 = j12;
                            j6 = j9;
                            int i23 = i19;
                            int iM2002Z = AbstractC0972l.m2002Z(jArr4);
                            int i24 = iM2002Z - 1;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM2002Z] = jArr4[0];
                            int i25 = 0;
                            while (i25 != i20) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j15 = (jArr4[i26] >> i27) & j5;
                                if (j15 != 128 && j15 == 254) {
                                    Object obj2 = objArr2[i25];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i17;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iM4270e2 = m4270e(i29);
                                    int i30 = i29 & i20;
                                    if (((iM4270e2 - i30) & i20) / i23 == ((i25 - i30) & i20) / i23) {
                                        jArr4[i26] = (((long) (i28 & 127)) << i27) | (jArr4[i26] & (~(j5 << i27)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i25++;
                                        i23 = i23;
                                    } else {
                                        int i31 = i23;
                                        int i32 = iM4270e2 >> 3;
                                        long j16 = jArr4[i32];
                                        int i33 = (iM4270e2 & 7) << 3;
                                        if (((j16 >> i33) & j5) == 128) {
                                            i5 = i20;
                                            objArr = objArr2;
                                            jArr4[i32] = ((~(j5 << i33)) & j16) | (((long) (i28 & 127)) << i33);
                                            jArr4[i26] = (jArr4[i26] & (~(j5 << i27))) | (128 << i27);
                                            objArr[iM4270e2] = objArr[i25];
                                            objArr[i25] = null;
                                            objArr3[iM4270e2] = objArr3[i25];
                                            objArr3[i25] = null;
                                        } else {
                                            i5 = i20;
                                            objArr = objArr2;
                                            jArr4[i32] = (((long) (i28 & 127)) << i33) | ((~(j5 << i33)) & j16);
                                            Object obj3 = objArr[iM4270e2];
                                            objArr[iM4270e2] = objArr[i25];
                                            objArr[i25] = obj3;
                                            Object obj4 = objArr3[iM4270e2];
                                            objArr3[iM4270e2] = objArr3[i25];
                                            objArr3[i25] = obj4;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i25++;
                                        i23 = i31;
                                        i20 = i5;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            this.f7792f = AbstractC2415L.m4295a(this.f7790d) - this.f7791e;
                        }
                        iM4270e = m4270e(i8);
                    }
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                    int iM4296b = AbstractC2415L.m4296b(this.f7790d);
                    long[] jArr5 = this.f7787a;
                    Object[] objArr4 = this.f7788b;
                    Object[] objArr5 = this.f7789c;
                    int i34 = this.f7790d;
                    m4273h(iM4296b);
                    long[] jArr6 = this.f7787a;
                    Object[] objArr6 = this.f7788b;
                    Object[] objArr7 = this.f7789c;
                    int i35 = this.f7790d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i36];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i17;
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM4270e3 = m4270e(i37 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = i37 & 127;
                            int i38 = iM4270e3 >> 3;
                            int i39 = (iM4270e3 & 7) << 3;
                            long j18 = (jArr[i38] & (~(255 << i39))) | (j17 << i39);
                            jArr[i38] = j18;
                            jArr[(((iM4270e3 - 7) & i35) + (i35 & 7)) >> 3] = j18;
                            objArr6[iM4270e3] = obj5;
                            objArr7[iM4270e3] = objArr5[i36];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i36++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM4270e = m4270e(i8);
                }
                this.f7791e++;
                int i40 = this.f7792f;
                long[] jArr7 = this.f7787a;
                int i41 = iM4270e >> 3;
                long j19 = jArr7[i41];
                int i42 = (iM4270e & 7) << 3;
                this.f7792f = i40 - (((j19 >> i42) & j5) == j7 ? 1 : 0);
                int i43 = this.f7790d;
                long j20 = (j19 & (~(j5 << i42))) | (j6 << i42);
                jArr7[i41] = j20;
                jArr7[(((iM4270e - 7) & i43) + (i43 & 7)) >> 3] = j20;
                return ~iM4270e;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
            i6 = i17;
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
    public final Object m4272g(Object obj) {
        int iNumberOfTrailingZeros;
        int i5 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f7790d;
        int i9 = i6 >>> 7;
        loop0: while (true) {
            int i10 = i9 & i8;
            long[] jArr = this.f7787a;
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
                if (AbstractC1665j.m2981a(this.f7788b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i5 += 8;
            i9 = i10 + i5;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f7789c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4273h(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, AbstractC2415L.m4297c(i5)) : 0;
        this.f7790d = iMax;
        if (iMax == 0) {
            jArr = AbstractC2415L.f7816a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
            int i6 = iMax >> 3;
            long j5 = 255 << ((iMax & 7) << 3);
            jArr[i6] = (jArr[i6] & (~j5)) | j5;
        }
        this.f7787a = jArr;
        this.f7792f = AbstractC2415L.m4295a(this.f7790d) - this.f7791e;
        Object[] objArr = AbstractC2477a.f7973c;
        this.f7788b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f7789c = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f7788b;
        Object[] objArr2 = this.f7789c;
        long[] jArr = this.f7787a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i5 = 0;
        int iHashCode = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        int i8 = (i5 << 3) + i7;
                        Object obj = objArr[i8];
                        Object obj2 = objArr2[i8];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return iHashCode;
                }
            }
            if (i5 == length) {
                return iHashCode;
            }
            i5++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m4274i() {
        return this.f7791e == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m4275j() {
        return this.f7791e != 0;
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
    public final Object m4276k(Object obj) {
        int iNumberOfTrailingZeros;
        int i5 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f7790d;
        int i9 = i6 >>> 7;
        loop0: while (true) {
            int i10 = i9 & i8;
            long[] jArr = this.f7787a;
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
                if (AbstractC1665j.m2981a(this.f7788b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i5 += 8;
            i9 = i10 + i5;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m4277l(iNumberOfTrailingZeros);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Object m4277l(int i5) {
        this.f7791e--;
        long[] jArr = this.f7787a;
        int i6 = this.f7790d;
        int i7 = i5 >> 3;
        int i8 = (i5 & 7) << 3;
        long j5 = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        jArr[i7] = j5;
        jArr[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j5;
        this.f7788b[i5] = null;
        Object[] objArr = this.f7789c;
        Object obj = objArr[i5];
        objArr[i5] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4278m(Object obj, Object obj2) {
        int iM4271f = m4271f(obj);
        if (iM4271f < 0) {
            iM4271f = ~iM4271f;
        }
        this.f7788b[iM4271f] = obj;
        this.f7789c[iM4271f] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[PHI: r8
  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (m4274i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f7788b;
        Object[] objArr2 = this.f7789c;
        long[] jArr = this.f7787a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j5) < 128) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = objArr[i9];
                            Object obj2 = objArr2[i9];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i6++;
                            if (i6 < this.f7791e) {
                                sb.append(", ");
                            }
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
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:8) call: k.E.<init>(int):void type: THIS */
    public /* synthetic */ C2408E() {
        this(6);
    }
}
