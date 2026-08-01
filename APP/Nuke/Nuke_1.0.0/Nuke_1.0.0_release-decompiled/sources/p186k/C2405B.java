package p186k;

import java.util.Arrays;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2405B {

    /* JADX INFO: renamed from: a */
    public long[] f7769a = AbstractC2415L.f7816a;

    /* JADX INFO: renamed from: b */
    public Object[] f7770b = AbstractC2477a.f7973c;

    /* JADX INFO: renamed from: c */
    public long[] f7771c = AbstractC2434p.f7859b;

    /* JADX INFO: renamed from: d */
    public int f7772d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f7773e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public int f7774f;

    /* JADX INFO: renamed from: g */
    public int f7775g;

    /* JADX INFO: renamed from: h */
    public int f7776h;

    public C2405B(int i5) {
        if (i5 >= 0) {
            m4262f(AbstractC2415L.m4298d(i5));
        } else {
            AbstractC2477a.m4422c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4257a(Object obj) {
        int i5 = this.f7775g;
        int iM4260d = m4260d(obj);
        this.f7770b[iM4260d] = obj;
        long[] jArr = this.f7771c;
        int i6 = this.f7772d;
        jArr[iM4260d] = (((long) i6) & 2147483647L) | 4611686016279904256L;
        if (i6 != Integer.MAX_VALUE) {
            jArr[i6] = ((((long) iM4260d) & 2147483647L) << 31) | (jArr[i6] & (-4611686016279904257L));
        }
        this.f7772d = iM4260d;
        if (this.f7773e == Integer.MAX_VALUE) {
            this.f7773e = iM4260d;
        }
        return this.f7775g != i5;
    }

    /* JADX INFO: renamed from: b */
    public final void m4258b() {
        this.f7775g = 0;
        long[] jArr = this.f7769a;
        if (jArr != AbstractC2415L.f7816a) {
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
            long[] jArr2 = this.f7769a;
            int i5 = this.f7774f;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        AbstractC0972l.m1998V(this.f7770b, 0, this.f7774f);
        AbstractC0972l.m1999W(4611686018427387903L, this.f7771c);
        this.f7772d = Integer.MAX_VALUE;
        this.f7773e = Integer.MAX_VALUE;
        this.f7776h = AbstractC2415L.m4295a(this.f7774f) - this.f7775g;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4259c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f7774f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f7769a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f7770b
            r15 = r15[r11]
            boolean r15 = p117X2.AbstractC1665j.m2981a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p186k.C2405B.m4259c(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: d */
    public final int m4260d(Object obj) {
        int i5;
        long j5;
        long j6;
        long j7;
        char c5;
        long[] jArr;
        long[] jArr2;
        long j8;
        int i6 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f7774f;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr3 = this.f7769a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j9 = ((jArr3[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr3[i13] >>> i14);
            long j10 = i9;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L);
            while (j12 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i11) & i10;
                int i15 = i6;
                if (AbstractC1665j.m2981a(this.f7770b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j12 &= j12 - 1;
                i6 = i15;
            }
            int i16 = i6;
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                int iM4261e = m4261e(i8);
                long j13 = 255;
                if (this.f7776h != 0 || ((this.f7769a[iM4261e >> 3] >> ((iM4261e & 7) << 3)) & 255) == 254) {
                    i5 = 0;
                    j5 = j10;
                    j6 = 255;
                    j7 = 128;
                } else {
                    int i17 = this.f7774f;
                    if (i17 > 8) {
                        c5 = 31;
                        j7 = 128;
                        if (Long.compareUnsigned(((long) this.f7775g) * 32, ((long) i17) * 25) <= 0) {
                            long[] jArr4 = this.f7769a;
                            if (jArr4 == null) {
                                i5 = 0;
                                j5 = j10;
                                j6 = 255;
                            } else {
                                int i18 = this.f7774f;
                                Object[] objArr = this.f7770b;
                                long[] jArr5 = this.f7771c;
                                long[] jArr6 = new long[i18];
                                Arrays.fill(jArr6, 0, i18, 9223372034707292159L);
                                i5 = 0;
                                int i19 = (i18 + 7) >> 3;
                                int i20 = 0;
                                while (i20 < i19) {
                                    long j14 = j13;
                                    long j15 = jArr4[i20] & (-9187201950435737472L);
                                    int i21 = i20;
                                    jArr4[i21] = ((~j15) + (j15 >>> 7)) & (-72340172838076674L);
                                    i20 = i21 + 1;
                                    j13 = j14;
                                }
                                j6 = j13;
                                int length = jArr4.length;
                                int i22 = length - 1;
                                int i23 = length - 2;
                                jArr4[i23] = (jArr4[i23] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i22] = jArr4[0];
                                int i24 = 0;
                                while (i24 != i18) {
                                    int i25 = i24 >> 3;
                                    int i26 = (i24 & 7) << 3;
                                    long j16 = (jArr4[i25] >> i26) & j6;
                                    if (j16 != 128 && j16 == 254) {
                                        Object obj2 = objArr[i24];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i16;
                                        int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i28 = i27 >>> 7;
                                        int iM4261e2 = m4261e(i28);
                                        int i29 = i28 & i18;
                                        if (((iM4261e2 - i29) & i18) / 8 == ((i24 - i29) & i18) / 8) {
                                            int i30 = i18;
                                            Object[] objArr2 = objArr;
                                            jArr4[i25] = (jArr4[i25] & (~(j6 << i26))) | (((long) (i27 & 127)) << i26);
                                            if (jArr6[i24] == 9223372034707292159L) {
                                                long j17 = i24;
                                                jArr6[i24] = j17 | (j17 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i24++;
                                            i18 = i30;
                                            objArr = objArr2;
                                        } else {
                                            int i31 = i18;
                                            Object[] objArr3 = objArr;
                                            int i32 = iM4261e2 >> 3;
                                            long j18 = jArr4[i32];
                                            int i33 = (iM4261e2 & 7) << 3;
                                            if (((j18 >> i33) & j6) == 128) {
                                                jArr4[i32] = (j18 & (~(j6 << i33))) | (((long) (i27 & 127)) << i33);
                                                jArr4[i25] = (jArr4[i25] & (~(j6 << i26))) | (128 << i26);
                                                objArr3[iM4261e2] = objArr3[i24];
                                                objArr3[i24] = null;
                                                jArr5[iM4261e2] = jArr5[i24];
                                                jArr5[i24] = 4611686018427387903L;
                                                int i34 = (int) ((jArr6[i24] >> 32) & 4294967295L);
                                                int i35 = Integer.MAX_VALUE;
                                                if (i34 != Integer.MAX_VALUE) {
                                                    j8 = j10;
                                                    jArr6[i34] = ((long) iM4261e2) | (jArr6[i34] & (-4294967296L));
                                                    jArr6[i24] = (jArr6[i24] & 4294967295L) | (-4294967296L);
                                                    i35 = Integer.MAX_VALUE;
                                                } else {
                                                    j8 = j10;
                                                    jArr6[i24] = (((long) Integer.MAX_VALUE) << 32) | ((long) iM4261e2);
                                                }
                                                jArr6[iM4261e2] = (((long) i24) << 32) | ((long) i35);
                                            } else {
                                                j8 = j10;
                                                jArr4[i32] = (((long) (i27 & 127)) << i33) | (j18 & (~(j6 << i33)));
                                                Object obj3 = objArr3[iM4261e2];
                                                objArr3[iM4261e2] = objArr3[i24];
                                                objArr3[i24] = obj3;
                                                long j19 = jArr5[iM4261e2];
                                                jArr5[iM4261e2] = jArr5[i24];
                                                jArr5[i24] = j19;
                                                int i36 = (int) ((jArr6[i24] >> 32) & 4294967295L);
                                                if (i36 != Integer.MAX_VALUE) {
                                                    long j20 = iM4261e2;
                                                    jArr6[i36] = (jArr6[i36] & (-4294967296L)) | j20;
                                                    jArr6[i24] = (jArr6[i24] & 4294967295L) | (j20 << 32);
                                                } else {
                                                    long j21 = iM4261e2;
                                                    jArr6[i24] = j21 | (j21 << 32);
                                                    i36 = i24;
                                                }
                                                jArr6[iM4261e2] = (((long) i36) << 32) | ((long) i24);
                                                i24--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i24++;
                                            i18 = i31;
                                            objArr = objArr3;
                                            j10 = j8;
                                        }
                                    } else {
                                        i24++;
                                    }
                                }
                                j5 = j10;
                                this.f7776h = AbstractC2415L.m4295a(this.f7774f) - this.f7775g;
                                long[] jArr7 = this.f7771c;
                                int length2 = jArr7.length;
                                for (int i37 = 0; i37 < length2; i37++) {
                                    long j22 = jArr7[i37];
                                    int i38 = (int) ((j22 >> 31) & 2147483647L);
                                    int i39 = (int) (j22 & 2147483647L);
                                    jArr7[i37] = (((j22 & (-4611686018427387904L)) | ((long) (i38 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i38] & 4294967295L)))) << 31) | ((long) (i39 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i39] & 4294967295L)));
                                }
                                int i40 = this.f7772d;
                                if (i40 != Integer.MAX_VALUE) {
                                    this.f7772d = (int) (jArr6[i40] & 4294967295L);
                                }
                                int i41 = this.f7773e;
                                if (i41 != Integer.MAX_VALUE) {
                                    this.f7773e = (int) (jArr6[i41] & 4294967295L);
                                }
                            }
                        }
                        iM4261e = m4261e(i8);
                    } else {
                        c5 = 31;
                        j7 = 128;
                    }
                    i5 = 0;
                    j5 = j10;
                    j6 = 255;
                    int iM4296b = AbstractC2415L.m4296b(this.f7774f);
                    long[] jArr8 = this.f7769a;
                    Object[] objArr4 = this.f7770b;
                    long[] jArr9 = this.f7771c;
                    int i42 = this.f7774f;
                    int[] iArr = new int[i42];
                    m4262f(iM4296b);
                    long[] jArr10 = this.f7769a;
                    Object[] objArr5 = this.f7770b;
                    long[] jArr11 = this.f7771c;
                    int i43 = this.f7774f;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr8[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j7) {
                            Object obj4 = objArr4[i44];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i16;
                            int i45 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM4261e3 = m4261e(i45 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j23 = i45 & 127;
                            int i46 = iM4261e3 >> 3;
                            int i47 = (iM4261e3 & 7) << 3;
                            long j24 = (jArr[i46] & (~(255 << i47))) | (j23 << i47);
                            jArr[i46] = j24;
                            jArr[(((iM4261e3 - 7) & i43) + (i43 & 7)) >> 3] = j24;
                            objArr5[iM4261e3] = obj4;
                            jArr11[iM4261e3] = jArr9[i44];
                            iArr[i44] = iM4261e3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i44++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f7771c;
                    int length3 = jArr12.length;
                    for (int i48 = 0; i48 < length3; i48++) {
                        long j25 = jArr12[i48];
                        int i49 = (int) ((j25 >> c5) & 2147483647L);
                        int i50 = (int) (j25 & 2147483647L);
                        jArr12[i48] = (((j25 & (-4611686018427387904L)) | ((long) (i49 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i49]))) << c5) | ((long) (i50 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i50]));
                    }
                    int i51 = this.f7772d;
                    if (i51 != Integer.MAX_VALUE) {
                        this.f7772d = iArr[i51];
                    }
                    int i52 = this.f7773e;
                    if (i52 != Integer.MAX_VALUE) {
                        this.f7773e = iArr[i52];
                    }
                    iM4261e = m4261e(i8);
                }
                this.f7775g++;
                int i53 = this.f7776h;
                long[] jArr13 = this.f7769a;
                int i54 = iM4261e >> 3;
                long j26 = jArr13[i54];
                int i55 = (iM4261e & 7) << 3;
                if (((j26 >> i55) & j6) == j7) {
                    i5 = 1;
                }
                this.f7776h = i53 - i5;
                int i56 = this.f7774f;
                long j27 = (j26 & (~(j6 << i55))) | (j5 << i55);
                jArr13[i54] = j27;
                jArr13[(((iM4261e - 7) & i56) + (i56 & 7)) >> 3] = j27;
                return iM4261e;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i6 = i16;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m4261e(int i5) {
        int i6 = this.f7774f;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f7769a;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof p186k.C2405B
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            k.B r1 = (p186k.C2405B) r1
            int r3 = r1.f7775g
            int r5 = r0.f7775g
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f7770b
            long[] r5 = r0.f7769a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.m4259c(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p186k.C2405B.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: f */
    public final void m4262f(int i5) {
        long[] jArr;
        long[] jArr2;
        int iMax = i5 > 0 ? Math.max(7, AbstractC2415L.m4297c(i5)) : 0;
        this.f7774f = iMax;
        if (iMax == 0) {
            jArr = AbstractC2415L.f7816a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC0972l.m1999W(-9187201950435737472L, jArr);
        }
        this.f7769a = jArr;
        int i6 = iMax >> 3;
        long j5 = 255 << ((iMax & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        this.f7776h = AbstractC2415L.m4295a(this.f7774f) - this.f7775g;
        this.f7770b = iMax == 0 ? AbstractC2477a.f7973c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC2434p.f7859b;
        } else {
            jArr2 = new long[iMax];
            AbstractC0972l.m1999W(4611686018427387903L, jArr2);
        }
        this.f7771c = jArr2;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4263g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f7774f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f7769a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f7770b
            r15 = r15[r11]
            boolean r15 = p117X2.AbstractC1665j.m2981a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.m4264h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p186k.C2405B.m4263g(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: h */
    public final void m4264h(int i5) {
        this.f7775g--;
        long[] jArr = this.f7769a;
        int i6 = this.f7774f;
        int i7 = i5 >> 3;
        int i8 = (i5 & 7) << 3;
        long j5 = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        jArr[i7] = j5;
        jArr[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j5;
        this.f7770b[i5] = null;
        long[] jArr2 = this.f7771c;
        long j6 = jArr2[i5];
        int i9 = (int) ((j6 >> 31) & 2147483647L);
        int i10 = (int) (j6 & 2147483647L);
        if (i9 != Integer.MAX_VALUE) {
            jArr2[i9] = (jArr2[i9] & (-2147483648L)) | (((long) i10) & 2147483647L);
        } else {
            this.f7772d = i10;
        }
        if (i10 != Integer.MAX_VALUE) {
            jArr2[i10] = ((((long) i9) & 2147483647L) << 31) | (jArr2[i10] & (-4611686016279904257L));
        } else {
            this.f7773e = i9;
        }
        jArr2[i5] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f7774f * 31) + this.f7775g;
        Object[] objArr = this.f7770b;
        long[] jArr = this.f7769a;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4265i(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            p117X2.AbstractC1665j.m2985e(r1, r2)
            java.lang.Object[] r2 = r0.f7770b
            int r3 = r0.f7775g
            long[] r4 = r0.f7769a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = p061L2.AbstractC0973m.m2010Q(r14, r15)
            if (r14 != 0) goto L4c
            r0.m4264h(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.f7775g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p186k.C2405B.m4265i(java.util.Collection):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f7770b;
        long[] jArr = this.f7771c;
        int i5 = this.f7773e;
        int i6 = 0;
        while (true) {
            if (i5 == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i7 = (int) ((jArr[i5] >> 31) & 2147483647L);
            Object obj = objArr[i5];
            if (i6 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i6 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i6++;
            i5 = i7;
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }
}
