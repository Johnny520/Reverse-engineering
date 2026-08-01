package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import p187.AbstractC7771;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0243 extends AbstractC0291 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f896;

    public C0243(int i) {
        this.f1013 = AbstractC0290.f1007;
        this.f1012 = AbstractC7771.f21082;
        this.f1011 = AbstractC0267.f961;
        this.f1010 = Integer.MAX_VALUE;
        this.f1009 = Integer.MAX_VALUE;
        if (i >= 0) {
            m761(AbstractC0290.m882(i));
        } else {
            C5919.m11249("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m761(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, AbstractC0290.m883(i)) : 0;
        this.f1008 = iMax;
        if (iMax == 0) {
            jArr = AbstractC0290.f1007;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f1013 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f896 = AbstractC0290.m885(this.f1008) - this.f1014;
        this.f1012 = iMax == 0 ? AbstractC7771.f21082 : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC0267.f961;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.f1011 = jArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m762(int i) {
        int i2 = this.f1008;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f1013;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m763(Object obj) {
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
        int i6 = this.f1008;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f1013;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (AbstractC4394.m8917(this.f1012[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iM762 = m762(i4);
                long j9 = 255;
                if (this.f896 != 0 || ((this.f1013[iM762 >> 3] >> ((iM762 & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.f1008;
                    if (i13 > 8) {
                        c = 31;
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f1014) * 32, ((long) i13) * 25) <= 0) {
                            long[] jArr4 = this.f1013;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this.f1008;
                                Object[] objArr = this.f1012;
                                long[] jArr5 = this.f1011;
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
                                        int iM7622 = m762(i24);
                                        int i25 = i24 & i14;
                                        if (((iM7622 - i25) & i14) / 8 == ((i20 - i25) & i14) / 8) {
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
                                            int i28 = iM7622 >> 3;
                                            long j14 = jArr4[i28];
                                            int i29 = (iM7622 & 7) << 3;
                                            if (((j14 >> i29) & j2) == 128) {
                                                jArr4[i28] = (j14 & (~(j2 << i29))) | (((long) (i23 & 127)) << i29);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[iM7622] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[iM7622] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i30 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i30 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i30] = ((long) iM7622) | (jArr6[i30] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = 9223372032559808512L | ((long) iM7622);
                                                }
                                                jArr6[iM7622] = (((long) i20) << 32) | 2147483647L;
                                            } else {
                                                j4 = j6;
                                                jArr4[i28] = (((long) (i23 & 127)) << i29) | (j14 & (~(j2 << i29)));
                                                Object obj3 = objArr3[iM7622];
                                                objArr3[iM7622] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j15 = jArr5[iM7622];
                                                jArr5[iM7622] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i31 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i31 != Integer.MAX_VALUE) {
                                                    long j16 = iM7622;
                                                    jArr6[i31] = (jArr6[i31] & (-4294967296L)) | j16;
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = iM7622;
                                                    jArr6[i20] = j17 | (j17 << 32);
                                                    i31 = i20;
                                                }
                                                jArr6[iM7622] = (((long) i31) << 32) | ((long) i20);
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
                                this.f896 = AbstractC0290.m885(this.f1008) - this.f1014;
                                long[] jArr7 = this.f1011;
                                int length2 = jArr7.length;
                                for (int i32 = 0; i32 < length2; i32++) {
                                    long j18 = jArr7[i32];
                                    int i33 = (int) ((j18 >> 31) & 2147483647L);
                                    int i34 = (int) (j18 & 2147483647L);
                                    jArr7[i32] = (((j18 & (-4611686018427387904L)) | ((long) (i33 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i33] & 4294967295L)))) << 31) | ((long) (i34 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i34] & 4294967295L)));
                                }
                                int i35 = this.f1010;
                                if (i35 != Integer.MAX_VALUE) {
                                    this.f1010 = (int) (jArr6[i35] & 4294967295L);
                                }
                                int i36 = this.f1009;
                                if (i36 != Integer.MAX_VALUE) {
                                    this.f1009 = (int) (jArr6[i36] & 4294967295L);
                                }
                            }
                        }
                        iM762 = m762(i4);
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int iM884 = AbstractC0290.m884(this.f1008);
                    long[] jArr8 = this.f1013;
                    Object[] objArr4 = this.f1012;
                    long[] jArr9 = this.f1011;
                    int i37 = this.f1008;
                    int[] iArr = new int[i37];
                    m761(iM884);
                    long[] jArr10 = this.f1013;
                    Object[] objArr5 = this.f1012;
                    long[] jArr11 = this.f1011;
                    int i38 = this.f1008;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr8[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM7623 = m762(i40 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j19 = i40 & 127;
                            int i41 = iM7623 >> 3;
                            int i42 = (iM7623 & 7) << 3;
                            long j20 = (jArr[i41] & (~(255 << i42))) | (j19 << i42);
                            jArr[i41] = j20;
                            jArr[(((iM7623 - 7) & i38) + (i38 & 7)) >> 3] = j20;
                            objArr5[iM7623] = obj4;
                            jArr11[iM7623] = jArr9[i39];
                            iArr[i39] = iM7623;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i39++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f1011;
                    int length3 = jArr12.length;
                    for (int i43 = 0; i43 < length3; i43++) {
                        long j21 = jArr12[i43];
                        int i44 = (int) ((j21 >> c) & 2147483647L);
                        int i45 = (int) (j21 & 2147483647L);
                        jArr12[i43] = (((j21 & (-4611686018427387904L)) | ((long) (i44 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i44]))) << c) | ((long) (i45 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i45]));
                    }
                    int i46 = this.f1010;
                    if (i46 != Integer.MAX_VALUE) {
                        this.f1010 = iArr[i46];
                    }
                    int i47 = this.f1009;
                    if (i47 != Integer.MAX_VALUE) {
                        this.f1009 = iArr[i47];
                    }
                    iM762 = m762(i4);
                }
                this.f1014++;
                int i48 = this.f896;
                long[] jArr13 = this.f1013;
                int i49 = iM762 >> 3;
                long j22 = jArr13[i49];
                int i50 = (iM762 & 7) << 3;
                if (((j22 >> i50) & j2) == j3) {
                    i = 1;
                }
                this.f896 = i48 - i;
                int i51 = this.f1008;
                long j23 = (j22 & (~(j2 << i50))) | (j << i50);
                jArr13[i49] = j23;
                jArr13[(((iM762 - 7) & i51) + (i51 & 7)) >> 3] = j23;
                return iM762;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m764() {
        this.f1014 = 0;
        long[] jArr = this.f1013;
        if (jArr != AbstractC0290.f1007) {
            AbstractC4346.m8865(-9187201950435737472L, jArr);
            long[] jArr2 = this.f1013;
            int i = this.f1008;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC4346.m8861(0, this.f1008, null, this.f1012);
        AbstractC4346.m8865(4611686018427387903L, this.f1011);
        this.f1010 = Integer.MAX_VALUE;
        this.f1009 = Integer.MAX_VALUE;
        this.f896 = AbstractC0290.m885(this.f1008) - this.f1014;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m765(Object obj) {
        int i = this.f1014;
        int iM763 = m763(obj);
        this.f1012[iM763] = obj;
        long[] jArr = this.f1011;
        int i2 = this.f1010;
        jArr[iM763] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iM763) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.f1010 = iM763;
        if (this.f1009 == Integer.MAX_VALUE) {
            this.f1009 = iM763;
        }
        return this.f1014 != i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m766(int i) {
        this.f1014--;
        long[] jArr = this.f1013;
        int i2 = this.f1008;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f1012[i] = null;
        long[] jArr2 = this.f1011;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.f1010 = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.f1009 = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m767(java.lang.Object r18) {
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
            int r5 = r0.f1008
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f1013
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
            java.lang.Object[] r15 = r0.f1012
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC4394.m8917(r15, r1)
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
            r0.m766(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0243.m767(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m768(java.util.Collection r17) {
        /*
            r16 = this;
            r0 = r16
            r17.getClass()
            java.lang.Object[] r1 = r0.f1012
            int r2 = r0.f1014
            long[] r3 = r0.f1013
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L54
            r6 = r5
        L12:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L4f
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2c:
            if (r11 >= r9) goto L4d
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L49
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = kotlin.collections.AbstractC4343.m8789(r13, r14)
            if (r13 != 0) goto L49
            r0.m766(r12)
        L49:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2c
        L4d:
            if (r9 != r10) goto L54
        L4f:
            if (r6 == r4) goto L54
            int r6 = r6 + 1
            goto L12
        L54:
            int r0 = r0.f1014
            if (r2 == r0) goto L5a
            r0 = 1
            return r0
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0243.m768(java.util.Collection):boolean");
    }
}
