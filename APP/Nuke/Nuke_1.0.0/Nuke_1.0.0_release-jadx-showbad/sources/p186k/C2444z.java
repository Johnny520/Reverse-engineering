package p186k;

import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2444z {

    /* JADX INFO: renamed from: a */
    public long[] f7898a;

    /* JADX INFO: renamed from: b */
    public Object[] f7899b;

    /* JADX INFO: renamed from: c */
    public int[] f7900c;

    /* JADX INFO: renamed from: d */
    public int f7901d;

    /* JADX INFO: renamed from: e */
    public int f7902e;

    /* JADX INFO: renamed from: f */
    public int f7903f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2444z(int i5) {
        this.f7898a = AbstractC2415L.f7816a;
        this.f7899b = AbstractC2477a.f7973c;
        this.f7900c = AbstractC2430l.f7851a;
        if (i5 >= 0) {
            m4365e(AbstractC2415L.m4298d(i5));
        } else {
            AbstractC2477a.m4422c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4361a() {
        this.f7902e = 0;
        long[] jArr = this.f7898a;
        if (jArr != AbstractC2415L.f7816a) {
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
            long[] jArr2 = this.f7898a;
            int i5 = this.f7901d;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        AbstractC0972l.m1998V(this.f7899b, 0, this.f7901d);
        this.f7903f = AbstractC2415L.m4295a(this.f7901d) - this.f7902e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m4362b(int i5) {
        int i6 = this.f7901d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f7898a;
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
    /* JADX INFO: renamed from: c */
    public final int m4363c(Object obj) {
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
        int i10 = this.f7901d;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr3 = this.f7898a;
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
                if (AbstractC1665j.m2981a(this.f7899b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i6 = i16;
            }
            int i17 = i6;
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int iM4362b = m4362b(i8);
                long j12 = 255;
                if (this.f7903f != 0 || ((this.f7898a[iM4362b >> 3] >> ((iM4362b & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                } else {
                    int i18 = this.f7901d;
                    if (i18 > 8) {
                        int i19 = 8;
                        if (Long.compareUnsigned(((long) this.f7902e) * 32, ((long) i18) * 25) <= 0) {
                            long[] jArr4 = this.f7898a;
                            int i20 = this.f7901d;
                            Object[] objArr2 = this.f7899b;
                            int[] iArr = this.f7900c;
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
                            long j15 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM2002Z] = jArr4[0];
                            int i25 = 0;
                            while (i25 != i20) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j16 = (jArr4[i26] >> i27) & j5;
                                if (j16 != 128 && j16 == 254) {
                                    Object obj2 = objArr2[i25];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i17;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iM4362b2 = m4362b(i29);
                                    int i30 = i29 & i20;
                                    long j17 = j15;
                                    if (((iM4362b2 - i30) & i20) / 8 == ((i25 - i30) & i20) / i23) {
                                        jArr4[i26] = (((long) (i28 & 127)) << i27) | (jArr4[i26] & (~(j5 << i27)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j17) | Long.MIN_VALUE;
                                        i25++;
                                        i23 = i23;
                                        j15 = j17;
                                    } else {
                                        int i31 = i23;
                                        int i32 = iM4362b2 >> 3;
                                        long j18 = jArr4[i32];
                                        int i33 = (iM4362b2 & 7) << 3;
                                        if (((j18 >> i33) & j5) == 128) {
                                            i5 = i20;
                                            objArr = objArr2;
                                            jArr4[i32] = ((~(j5 << i33)) & j18) | (((long) (i28 & 127)) << i33);
                                            jArr4[i26] = (jArr4[i26] & (~(j5 << i27))) | (128 << i27);
                                            objArr[iM4362b2] = objArr[i25];
                                            objArr[i25] = null;
                                            iArr[iM4362b2] = iArr[i25];
                                            iArr[i25] = 0;
                                        } else {
                                            i5 = i20;
                                            objArr = objArr2;
                                            jArr4[i32] = (((long) (i28 & 127)) << i33) | ((~(j5 << i33)) & j18);
                                            Object obj3 = objArr[iM4362b2];
                                            objArr[iM4362b2] = objArr[i25];
                                            objArr[i25] = obj3;
                                            int i34 = iArr[iM4362b2];
                                            iArr[iM4362b2] = iArr[i25];
                                            iArr[i25] = i34;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j17) | Long.MIN_VALUE;
                                        i25++;
                                        i20 = i5;
                                        i23 = i31;
                                        j15 = j17;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            this.f7903f = AbstractC2415L.m4295a(this.f7901d) - this.f7902e;
                        }
                        iM4362b = m4362b(i8);
                    }
                    j5 = 255;
                    j6 = j9;
                    j7 = 128;
                    int iM4296b = AbstractC2415L.m4296b(this.f7901d);
                    long[] jArr5 = this.f7898a;
                    Object[] objArr3 = this.f7899b;
                    int[] iArr2 = this.f7900c;
                    int i35 = this.f7901d;
                    m4365e(iM4296b);
                    long[] jArr6 = this.f7898a;
                    Object[] objArr4 = this.f7899b;
                    int[] iArr3 = this.f7900c;
                    int i36 = this.f7901d;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr5[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i37];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i17;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM4362b3 = m4362b(i38 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j19 = i38 & 127;
                            int i39 = iM4362b3 >> 3;
                            int i40 = (iM4362b3 & 7) << 3;
                            long j20 = (jArr[i39] & (~(255 << i40))) | (j19 << i40);
                            jArr[i39] = j20;
                            jArr[(((iM4362b3 - 7) & i36) + (i36 & 7)) >> 3] = j20;
                            objArr4[iM4362b3] = obj4;
                            iArr3[iM4362b3] = iArr2[i37];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i37++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM4362b = m4362b(i8);
                }
                this.f7902e++;
                int i41 = this.f7903f;
                long[] jArr7 = this.f7898a;
                int i42 = iM4362b >> 3;
                long j21 = jArr7[i42];
                int i43 = (iM4362b & 7) << 3;
                this.f7903f = i41 - (((j21 >> i43) & j5) == j7 ? 1 : 0);
                int i44 = this.f7901d;
                long j22 = (j21 & (~(j5 << i43))) | (j6 << i43);
                jArr7[i42] = j22;
                jArr7[(((iM4362b - 7) & i44) + (i44 & 7)) >> 3] = j22;
                return ~iM4362b;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
            i6 = i17;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m4364d(Object obj) {
        int i5 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 & 127;
        int i8 = this.f7901d;
        int i9 = i6 >>> 7;
        while (true) {
            int i10 = i9 & i8;
            long[] jArr = this.f7898a;
            int i11 = i10 >> 3;
            int i12 = (i10 & 7) << 3;
            long j5 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j6 = (((long) i7) * 72340172838076673L) ^ j5;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i10) & i8;
                if (AbstractC1665j.m2981a(this.f7899b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i9 = i10 + i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4365e(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, AbstractC2415L.m4297c(i5)) : 0;
        this.f7901d = iMax;
        if (iMax == 0) {
            jArr = AbstractC2415L.f7816a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
        }
        this.f7898a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f7903f = AbstractC2415L.m4295a(this.f7901d) - this.f7902e;
        this.f7899b = new Object[iMax];
        this.f7900c = new int[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2444z)) {
            return false;
        }
        C2444z c2444z = (C2444z) obj;
        if (c2444z.f7902e != this.f7902e) {
            return false;
        }
        Object[] objArr = this.f7899b;
        int[] iArr = this.f7900c;
        long[] jArr = this.f7898a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i5 = 0;
        loop0: while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((255 & j5) < 128) {
                        int i8 = (i5 << 3) + i7;
                        Object obj2 = objArr[i8];
                        int i9 = iArr[i8];
                        int iM4364d = c2444z.m4364d(obj2);
                        if (iM4364d < 0) {
                            break loop0;
                        }
                        z6 = z7;
                        if (i9 != c2444z.f7900c[iM4364d]) {
                            break loop0;
                        }
                    } else {
                        z6 = z7;
                    }
                    j5 >>= 8;
                    i7++;
                    z7 = z6;
                }
                z5 = z7;
                if (i6 != 8) {
                    return z5;
                }
            } else {
                z5 = z7;
            }
            if (i5 == length) {
                return z5;
            }
            i5++;
            z7 = z5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4366f(int i5) {
        this.f7902e--;
        long[] jArr = this.f7898a;
        int i6 = this.f7901d;
        int i7 = i5 >> 3;
        int i8 = (i5 & 7) << 3;
        long j5 = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        jArr[i7] = j5;
        jArr[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j5;
        this.f7899b[i5] = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4367g(int i5, Object obj) {
        int iM4363c = m4363c(obj);
        if (iM4363c < 0) {
            iM4363c = ~iM4363c;
        }
        this.f7899b[iM4363c] = obj;
        this.f7900c[iM4363c] = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f7899b;
        int[] iArr = this.f7900c;
        long[] jArr = this.f7898a;
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
                        iHashCode += Integer.hashCode(iArr[i8]) ^ (obj != null ? obj.hashCode() : 0);
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
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (this.f7902e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f7899b;
        int[] iArr = this.f7900c;
        long[] jArr = this.f7898a;
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
                            int i10 = iArr[i9];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i10);
                            i6++;
                            if (i6 < this.f7902e) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:9) call: k.z.<init>(int):void type: THIS */
    public /* synthetic */ C2444z() {
        this(6);
    }
}
