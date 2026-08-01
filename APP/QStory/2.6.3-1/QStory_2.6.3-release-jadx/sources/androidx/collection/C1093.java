package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import p203.AbstractC8601;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1093 extends AbstractC1116 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f1248;

    public C1093(int i) {
        this.f1319 = AbstractC1137.f1352;
        this.f1318 = AbstractC1121.f1324;
        this.f1317 = AbstractC8601.f21424;
        if (i >= 0) {
            m1346(AbstractC1137.m1443(i));
        } else {
            C6755.m11869("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1346(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC1137.m1444(i)) : 0;
        this.f1316 = iMax;
        if (iMax == 0) {
            jArr = AbstractC1137.f1352;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f1319 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f1248 = AbstractC1137.m1446(this.f1316) - this.f1315;
        this.f1318 = new int[iMax];
        this.f1317 = new Object[iMax];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m1347(int i) {
        int i2 = this.f1316;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f1319;
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
    public final int m1348(int i) {
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
        int i8 = this.f1316;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.f1319;
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
                if (this.f1318[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM1347 = m1347(i6);
                long j8 = 255;
                if (this.f1248 != 0 || ((this.f1319[iM1347 >> 3] >> ((iM1347 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.f1316;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f1315) * 32, ((long) i20) * 25) <= 0) {
                            long[] jArr4 = this.f1319;
                            int i21 = this.f1316;
                            int[] iArr2 = this.f1318;
                            Object[] objArr2 = this.f1317;
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
                            int iM9386 = AbstractC5179.m9386(jArr4);
                            int i24 = iM9386 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM9386] = jArr4[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr4[i26] >> i27) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int iM13472 = m1347(i29);
                                    int i30 = i29 & i21;
                                    if (((iM13472 - i30) & i21) / 8 == ((i25 - i30) & i21) / 8) {
                                        long j13 = j11;
                                        jArr4[i26] = (((long) (i28 & 127)) << i27) | ((~(j << i27)) & jArr4[i26]);
                                        jArr4[jArr4.length - i13] = (jArr4[i19] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i31 = iM13472 >> 3;
                                        long j15 = jArr4[i31];
                                        int i32 = (iM13472 & 7) << 3;
                                        if (((j15 >> i32) & j) == 128) {
                                            i3 = i13;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i31] = ((~(j << i32)) & j15) | (((long) (i28 & 127)) << i32);
                                            jArr4[i26] = (jArr4[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[iM13472] = iArr[i25];
                                            iArr[i25] = i19;
                                            objArr[iM13472] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i3 = i13;
                                            jArr4[i31] = (((long) (i28 & 127)) << i32) | ((~(j << i32)) & j15);
                                            int i33 = iArr[iM13472];
                                            iArr[iM13472] = iArr[i25];
                                            iArr[i25] = i33;
                                            Object obj = objArr[iM13472];
                                            objArr[iM13472] = objArr[i25];
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
                            this.f1248 = AbstractC1137.m1446(this.f1316) - this.f1315;
                        }
                        iM1347 = m1347(i6);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int iM1445 = AbstractC1137.m1445(this.f1316);
                    long[] jArr5 = this.f1319;
                    int[] iArr3 = this.f1318;
                    Object[] objArr3 = this.f1317;
                    int i34 = this.f1316;
                    m1346(iM1445);
                    long[] jArr6 = this.f1319;
                    int[] iArr4 = this.f1318;
                    Object[] objArr4 = this.f1317;
                    int i35 = this.f1316;
                    int i36 = i19;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            int i37 = iArr3[i36];
                            int iHashCode3 = Integer.hashCode(i37) * i18;
                            int i38 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM13473 = m1347(i38 >>> 7);
                            long j16 = i38 & 127;
                            int i39 = iM13473 >> 3;
                            int i40 = (iM13473 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i39] & (~(255 << i40))) | (j16 << i40);
                            jArr[i39] = j17;
                            jArr[(((iM13473 - 7) & i35) + (i35 & 7)) >> 3] = j17;
                            iArr4[iM13473] = i37;
                            objArr4[iM13473] = objArr3[i36];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i36++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM1347 = m1347(i6);
                }
                this.f1315++;
                int i41 = this.f1248;
                long[] jArr7 = this.f1319;
                int i42 = iM1347 >> 3;
                long j18 = jArr7[i42];
                int i43 = (iM1347 & 7) << 3;
                if (((j18 >> i43) & j) != j3) {
                    i2 = i19;
                }
                this.f1248 = i41 - i2;
                int i44 = this.f1316;
                long j19 = (j18 & (~(j << i43))) | (j2 << i43);
                jArr7[i42] = j19;
                jArr7[(((iM1347 - 7) & i44) + (i44 & 7)) >> 3] = j19;
                return iM1347;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1349() {
        this.f1315 = 0;
        long[] jArr = this.f1319;
        if (jArr != AbstractC1137.f1352) {
            AbstractC5179.m9392(-9187201950435737472L, jArr);
            long[] jArr2 = this.f1319;
            int i = this.f1316;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC5179.m9393(0, this.f1316, null, this.f1317);
        this.f1248 = AbstractC1137.m1446(this.f1316) - this.f1315;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1350(int i, Object obj) {
        int iM1348 = m1348(i);
        this.f1318[iM1348] = i;
        this.f1317[iM1348] = obj;
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
    */
    public final Object m1351(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f1316;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f1319;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f1318[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f1315--;
        long[] jArr2 = this.f1319;
        int i9 = this.f1316;
        int i10 = iNumberOfTrailingZeros >> 3;
        int i11 = (iNumberOfTrailingZeros & 7) << 3;
        long j4 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
        jArr2[i10] = j4;
        jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j4;
        Object[] objArr = this.f1317;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public /* synthetic */ C1093() {
        this(6);
    }
}
