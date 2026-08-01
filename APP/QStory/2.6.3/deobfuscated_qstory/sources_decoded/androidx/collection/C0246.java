package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC4347;
import p187.AbstractC7772;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0246 extends AbstractC0269 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f903;

    public C0246(int i) {
        this.f974 = AbstractC0290.f1007;
        this.f973 = AbstractC0274.f979;
        this.f972 = AbstractC7772.f21079;
        if (i >= 0) {
            m786(AbstractC0290.m883(i));
        } else {
            C5925.m11310("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m786(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC0290.m884(i)) : 0;
        this.f971 = iMax;
        if (iMax == 0) {
            jArr = AbstractC0290.f1007;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f974 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f903 = AbstractC0290.m886(this.f971) - this.f970;
        this.f973 = new int[iMax];
        this.f972 = new Object[iMax];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m787(int i) {
        int i2 = this.f971;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f974;
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
    public final int m788(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i3;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f971;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.f974;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.f973[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM787 = m787(i6);
                long j8 = 255;
                if (this.f903 != 0 || ((this.f974[iM787 >> 3] >> ((iM787 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.f971;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f970) * 32, ((long) i20) * 25) <= 0) {
                            long[] jArr4 = this.f974;
                            int i21 = this.f971;
                            int[] iArr2 = this.f973;
                            Object[] objArr2 = this.f972;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                long j9 = j8;
                                long j10 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i23++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int iM8827 = AbstractC4347.m8827(jArr4);
                            int i24 = iM8827 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM8827] = jArr4[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr4[i26] >> i27) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iM7872 = m787(i29);
                                    int i30 = i29 & i21;
                                    if (((iM7872 - i30) & i21) / 8 == ((i25 - i30) & i21) / 8) {
                                        long j13 = j11;
                                        jArr4[i26] = (((long) (i28 & 127)) << i27) | ((~(j << i27)) & jArr4[i26]);
                                        jArr4[jArr4.length - i13] = (jArr4[i19] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i31 = iM7872 >> 3;
                                        long j15 = jArr4[i31];
                                        int i32 = (iM7872 & 7) << 3;
                                        if (((j15 >> i32) & j) == 128) {
                                            i3 = i13;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i31] = ((~(j << i32)) & j15) | (((long) (i28 & 127)) << i32);
                                            jArr4[i26] = (jArr4[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[iM7872] = iArr[i25];
                                            iArr[i25] = i19;
                                            objArr[iM7872] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i3 = i13;
                                            jArr4[i31] = (((long) (i28 & 127)) << i32) | ((~(j << i32)) & j15);
                                            int i33 = iArr[iM7872];
                                            iArr[iM7872] = iArr[i25];
                                            iArr[i25] = i33;
                                            Object obj = objArr[iM7872];
                                            objArr[iM7872] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i19] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j14;
                                        i13 = i3;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i13;
                            this.f903 = AbstractC0290.m886(this.f971) - this.f970;
                        }
                        iM787 = m787(i6);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iM885 = AbstractC0290.m885(this.f971);
                    long[] jArr5 = this.f974;
                    int[] iArr3 = this.f973;
                    Object[] objArr3 = this.f972;
                    int i34 = this.f971;
                    m786(iM885);
                    long[] jArr6 = this.f974;
                    int[] iArr4 = this.f973;
                    Object[] objArr4 = this.f972;
                    int i35 = this.f971;
                    int i36 = i19;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            int i37 = iArr3[i36];
                            int iHashCode3 = Integer.hashCode(i37) * i18;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM7873 = m787(i38 >>> 7);
                            long j16 = i38 & 127;
                            int i39 = iM7873 >> 3;
                            int i40 = (iM7873 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i39] & (~(255 << i40))) | (j16 << i40);
                            jArr[i39] = j17;
                            jArr[(((iM7873 - 7) & i35) + (i35 & 7)) >> 3] = j17;
                            iArr4[iM7873] = i37;
                            objArr4[iM7873] = objArr3[i36];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i36++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM787 = m787(i6);
                }
                this.f970++;
                int i41 = this.f903;
                long[] jArr7 = this.f974;
                int i42 = iM787 >> 3;
                long j18 = jArr7[i42];
                int i43 = (iM787 & 7) << 3;
                if (((j18 >> i43) & j) != j3) {
                    i2 = i19;
                }
                this.f903 = i41 - i2;
                int i44 = this.f971;
                long j19 = (j18 & (~(j << i43))) | (j2 << i43);
                jArr7[i42] = j19;
                jArr7[(((iM787 - 7) & i44) + (i44 & 7)) >> 3] = j19;
                return iM787;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m789() {
        this.f970 = 0;
        long[] jArr = this.f974;
        if (jArr != AbstractC0290.f1007) {
            AbstractC4347.m8833(-9187201950435737472L, jArr);
            long[] jArr2 = this.f974;
            int i = this.f971;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC4347.m8834(0, this.f971, null, this.f972);
        this.f903 = AbstractC0290.m886(this.f971) - this.f970;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m790(int i, Object obj) {
        int iM788 = m788(i);
        this.f973[iM788] = i;
        this.f972[iM788] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m791(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f971
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f974
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
            int[] r11 = r13.f973
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
            int r0 = r13.f970
            int r0 = r0 + (-1)
            r13.f970 = r0
            long[] r0 = r13.f974
            int r1 = r13.f971
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
            java.lang.Object[] r13 = r13.f972
            r0 = r13[r10]
            r13[r10] = r14
            return r0
        L96:
            return r14
        L97:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0246.m791(int):java.lang.Object");
    }

    public /* synthetic */ C0246() {
        this(6);
    }
}
