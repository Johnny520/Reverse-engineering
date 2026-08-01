package p186k;

import p061L2.AbstractC0972l;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2439u extends AbstractC2428j {

    /* JADX INFO: renamed from: f */
    public int f7879f;

    public C2439u(int i5) {
        this.f7845a = AbstractC2415L.f7816a;
        this.f7846b = AbstractC2430l.f7851a;
        this.f7847c = AbstractC2477a.f7973c;
        if (i5 >= 0) {
            m4342f(AbstractC2415L.m4298d(i5));
        } else {
            AbstractC2477a.m4422c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4339c() {
        this.f7849e = 0;
        long[] jArr = this.f7845a;
        if (jArr != AbstractC2415L.f7816a) {
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
            long[] jArr2 = this.f7845a;
            int i5 = this.f7848d;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        AbstractC0972l.m1998V(this.f7847c, 0, this.f7848d);
        this.f7879f = AbstractC2415L.m4295a(this.f7848d) - this.f7849e;
    }

    /* JADX INFO: renamed from: d */
    public final int m4340d(int i5) {
        long j5;
        long j6;
        int i6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i7;
        int i8 = -862048943;
        int iHashCode = Integer.hashCode(i5) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f7848d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.f7845a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = 1;
            long j8 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j9 = i11;
            int i18 = i14;
            int i19 = 0;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (j11 != 0) {
                int iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j11) >> 3)) & i12;
                int i20 = i8;
                int i21 = i19;
                if (this.f7846b[iNumberOfTrailingZeros] == i5) {
                    return iNumberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i8 = i20;
                i19 = i21;
            }
            int i22 = i8;
            int i23 = i19;
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int iM4341e = m4341e(i10);
                long j12 = 255;
                if (this.f7879f != 0 || ((this.f7845a[iM4341e >> 3] >> ((iM4341e & 7) << 3)) & 255) == 254) {
                    j5 = 255;
                    j6 = j9;
                    i6 = 1;
                    j7 = 128;
                } else {
                    int i24 = this.f7848d;
                    if (i24 > 8) {
                        j7 = 128;
                        if (Long.compareUnsigned(((long) this.f7849e) * 32, ((long) i24) * 25) <= 0) {
                            long[] jArr4 = this.f7845a;
                            int i25 = this.f7848d;
                            int[] iArr2 = this.f7846b;
                            Object[] objArr2 = this.f7847c;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = i23;
                            while (i27 < i26) {
                                long j13 = j12;
                                long j14 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j14) + (j14 >>> 7));
                                i27++;
                                j9 = j9;
                                j12 = j13;
                            }
                            j5 = j12;
                            j6 = j9;
                            int iM2002Z = AbstractC0972l.m2002Z(jArr4);
                            int i28 = iM2002Z - 1;
                            long j15 = 72057594037927935L;
                            jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM2002Z] = jArr4[i23];
                            int i29 = i23;
                            while (i29 != i25) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j16 = (jArr4[i30] >> i31) & j5;
                                if (j16 != 128 && j16 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i29]) * i22;
                                    int i32 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i33 = i32 >>> 7;
                                    int iM4341e2 = m4341e(i33);
                                    int i34 = i33 & i25;
                                    if (((iM4341e2 - i34) & i25) / 8 == ((i29 - i34) & i25) / 8) {
                                        long j17 = j15;
                                        jArr4[i30] = (((long) (i32 & 127)) << i31) | ((~(j5 << i31)) & jArr4[i30]);
                                        jArr4[jArr4.length - i17] = (jArr4[i23] & j17) | Long.MIN_VALUE;
                                        i29++;
                                        j15 = j17;
                                    } else {
                                        long j18 = j15;
                                        int i35 = iM4341e2 >> 3;
                                        long j19 = jArr4[i35];
                                        int i36 = (iM4341e2 & 7) << 3;
                                        if (((j19 >> i36) & j5) == 128) {
                                            i7 = i17;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j5 << i36)) & j19) | (((long) (i32 & 127)) << i36);
                                            jArr4[i30] = (jArr4[i30] & (~(j5 << i31))) | (128 << i31);
                                            iArr[iM4341e2] = iArr[i29];
                                            iArr[i29] = i23;
                                            objArr[iM4341e2] = objArr[i29];
                                            objArr[i29] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i7 = i17;
                                            jArr4[i35] = (((long) (i32 & 127)) << i36) | ((~(j5 << i36)) & j19);
                                            int i37 = iArr[iM4341e2];
                                            iArr[iM4341e2] = iArr[i29];
                                            iArr[i29] = i37;
                                            Object obj = objArr[iM4341e2];
                                            objArr[iM4341e2] = objArr[i29];
                                            objArr[i29] = obj;
                                            i29--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i23] & j18) | Long.MIN_VALUE;
                                        i29++;
                                        j15 = j18;
                                        i17 = i7;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            i6 = i17;
                            this.f7879f = AbstractC2415L.m4295a(this.f7848d) - this.f7849e;
                        }
                        iM4341e = m4341e(i10);
                    } else {
                        j7 = 128;
                    }
                    j5 = 255;
                    j6 = j9;
                    i6 = 1;
                    int iM4296b = AbstractC2415L.m4296b(this.f7848d);
                    long[] jArr5 = this.f7845a;
                    int[] iArr3 = this.f7846b;
                    Object[] objArr3 = this.f7847c;
                    int i38 = this.f7848d;
                    m4342f(iM4296b);
                    long[] jArr6 = this.f7845a;
                    int[] iArr4 = this.f7846b;
                    Object[] objArr4 = this.f7847c;
                    int i39 = this.f7848d;
                    int i40 = i23;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j7) {
                            int i41 = iArr3[i40];
                            int iHashCode3 = Integer.hashCode(i41) * i22;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM4341e3 = m4341e(i42 >>> 7);
                            long j20 = i42 & 127;
                            int i43 = iM4341e3 >> 3;
                            int i44 = (iM4341e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = (jArr6[i43] & (~(255 << i44))) | (j20 << i44);
                            jArr[i43] = j21;
                            jArr[(((iM4341e3 - 7) & i39) + (i39 & 7)) >> 3] = j21;
                            iArr4[iM4341e3] = i41;
                            objArr4[iM4341e3] = objArr3[i40];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM4341e = m4341e(i10);
                }
                this.f7849e++;
                int i45 = this.f7879f;
                long[] jArr7 = this.f7845a;
                int i46 = iM4341e >> 3;
                long j22 = jArr7[i46];
                int i47 = (iM4341e & 7) << 3;
                if (((j22 >> i47) & j5) != j7) {
                    i6 = i23;
                }
                this.f7879f = i45 - i6;
                int i48 = this.f7848d;
                long j23 = (j22 & (~(j5 << i47))) | (j6 << i47);
                jArr7[i46] = j23;
                jArr7[(((iM4341e - 7) & i48) + (i48 & 7)) >> 3] = j23;
                return iM4341e;
            }
            i14 = i18 + 8;
            i13 = (i13 + i14) & i12;
            i8 = i22;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m4341e(int i5) {
        int i6 = this.f7848d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f7845a;
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

    /* JADX INFO: renamed from: f */
    public final void m4342f(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, AbstractC2415L.m4297c(i5)) : 0;
        this.f7848d = iMax;
        if (iMax == 0) {
            jArr = AbstractC2415L.f7816a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
        }
        this.f7845a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f7879f = AbstractC2415L.m4295a(this.f7848d) - this.f7849e;
        this.f7846b = new int[iMax];
        this.f7847c = new Object[iMax];
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4343g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f7848d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f7845a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f7846b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L97
            r10 = -1
        L64:
            r14 = 0
            if (r10 < 0) goto L96
            int r0 = r13.f7849e
            int r0 = r0 + (-1)
            r13.f7849e = r0
            long[] r0 = r13.f7845a
            int r1 = r13.f7848d
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r13.f7847c
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L96:
            return r14
        L97:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: p186k.C2439u.m4343g(int):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    public final void m4344h(int i5, Object obj) {
        int iM4340d = m4340d(i5);
        this.f7846b[iM4340d] = i5;
        this.f7847c[iM4340d] = obj;
    }

    public /* synthetic */ C2439u() {
        this(6);
    }
}
