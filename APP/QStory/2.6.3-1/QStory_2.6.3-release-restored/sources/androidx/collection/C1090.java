package androidx.collection;

import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import p203.AbstractC8601;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1090 extends AbstractC1138 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f1241;

    public C1090(int i) {
        this.f1358 = AbstractC1137.f1352;
        this.f1357 = AbstractC8601.f21424;
        this.f1356 = AbstractC1114.f1306;
        this.f1355 = Integer.MAX_VALUE;
        this.f1354 = Integer.MAX_VALUE;
        if (i >= 0) {
            m1322(AbstractC1137.m1443(i));
        } else {
            C6755.m11869("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1322(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, AbstractC1137.m1444(i)) : 0;
        this.f1353 = iMax;
        if (iMax == 0) {
            jArr = AbstractC1137.f1352;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f1358 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f1241 = AbstractC1137.m1446(this.f1353) - this.f1359;
        this.f1357 = iMax == 0 ? AbstractC8601.f21424 : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC1114.f1306;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.f1356 = jArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m1323(int i) {
        int i2 = this.f1353;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f1358;
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
    public final int m1324(Object obj) {
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
        int i6 = this.f1353;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f1358;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (AbstractC5227.m9466(this.f1357[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iM1323 = m1323(i4);
                long j9 = 255;
                if (this.f1241 != 0 || ((this.f1358[iM1323 >> 3] >> ((iM1323 & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.f1353;
                    if (i13 > 8) {
                        c = 31;
                        j3 = 128;
                        if (Long.compareUnsigned(((long) this.f1359) * 32, ((long) i13) * 25) <= 0) {
                            long[] jArr4 = this.f1358;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this.f1353;
                                Object[] objArr = this.f1357;
                                long[] jArr5 = this.f1356;
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
                                        int iM13232 = m1323(i24);
                                        int i25 = i24 & i14;
                                        if (((iM13232 - i25) & i14) / 8 == ((i20 - i25) & i14) / 8) {
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
                                            int i28 = iM13232 >> 3;
                                            long j14 = jArr4[i28];
                                            int i29 = (iM13232 & 7) << 3;
                                            if (((j14 >> i29) & j2) == 128) {
                                                jArr4[i28] = (j14 & (~(j2 << i29))) | (((long) (i23 & 127)) << i29);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[iM13232] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[iM13232] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i30 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i30 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i30] = ((long) iM13232) | (jArr6[i30] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = 9223372032559808512L | ((long) iM13232);
                                                }
                                                jArr6[iM13232] = (((long) i20) << 32) | 2147483647L;
                                            } else {
                                                j4 = j6;
                                                jArr4[i28] = (((long) (i23 & 127)) << i29) | (j14 & (~(j2 << i29)));
                                                Object obj3 = objArr3[iM13232];
                                                objArr3[iM13232] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j15 = jArr5[iM13232];
                                                jArr5[iM13232] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i31 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i31 != Integer.MAX_VALUE) {
                                                    long j16 = iM13232;
                                                    jArr6[i31] = (jArr6[i31] & (-4294967296L)) | j16;
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = iM13232;
                                                    jArr6[i20] = j17 | (j17 << 32);
                                                    i31 = i20;
                                                }
                                                jArr6[iM13232] = (((long) i31) << 32) | ((long) i20);
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
                                this.f1241 = AbstractC1137.m1446(this.f1353) - this.f1359;
                                long[] jArr7 = this.f1356;
                                int length2 = jArr7.length;
                                for (int i32 = 0; i32 < length2; i32++) {
                                    long j18 = jArr7[i32];
                                    int i33 = (int) ((j18 >> 31) & 2147483647L);
                                    int i34 = (int) (j18 & 2147483647L);
                                    jArr7[i32] = (((j18 & (-4611686018427387904L)) | ((long) (i33 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i33] & 4294967295L)))) << 31) | ((long) (i34 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i34] & 4294967295L)));
                                }
                                int i35 = this.f1355;
                                if (i35 != Integer.MAX_VALUE) {
                                    this.f1355 = (int) (jArr6[i35] & 4294967295L);
                                }
                                int i36 = this.f1354;
                                if (i36 != Integer.MAX_VALUE) {
                                    this.f1354 = (int) (jArr6[i36] & 4294967295L);
                                }
                            }
                        }
                        iM1323 = m1323(i4);
                    } else {
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int iM1445 = AbstractC1137.m1445(this.f1353);
                    long[] jArr8 = this.f1358;
                    Object[] objArr4 = this.f1357;
                    long[] jArr9 = this.f1356;
                    int i37 = this.f1353;
                    int[] iArr = new int[i37];
                    m1322(iM1445);
                    long[] jArr10 = this.f1358;
                    Object[] objArr5 = this.f1357;
                    long[] jArr11 = this.f1356;
                    int i38 = this.f1353;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr8[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM13233 = m1323(i40 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j19 = i40 & 127;
                            int i41 = iM13233 >> 3;
                            int i42 = (iM13233 & 7) << 3;
                            long j20 = (jArr[i41] & (~(255 << i42))) | (j19 << i42);
                            jArr[i41] = j20;
                            jArr[(((iM13233 - 7) & i38) + (i38 & 7)) >> 3] = j20;
                            objArr5[iM13233] = obj4;
                            jArr11[iM13233] = jArr9[i39];
                            iArr[i39] = iM13233;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i39++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f1356;
                    int length3 = jArr12.length;
                    for (int i43 = 0; i43 < length3; i43++) {
                        long j21 = jArr12[i43];
                        int i44 = (int) ((j21 >> c) & 2147483647L);
                        int i45 = (int) (j21 & 2147483647L);
                        jArr12[i43] = (((j21 & (-4611686018427387904L)) | ((long) (i44 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i44]))) << c) | ((long) (i45 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i45]));
                    }
                    int i46 = this.f1355;
                    if (i46 != Integer.MAX_VALUE) {
                        this.f1355 = iArr[i46];
                    }
                    int i47 = this.f1354;
                    if (i47 != Integer.MAX_VALUE) {
                        this.f1354 = iArr[i47];
                    }
                    iM1323 = m1323(i4);
                }
                this.f1359++;
                int i48 = this.f1241;
                long[] jArr13 = this.f1358;
                int i49 = iM1323 >> 3;
                long j22 = jArr13[i49];
                int i50 = (iM1323 & 7) << 3;
                if (((j22 >> i50) & j2) == j3) {
                    i = 1;
                }
                this.f1241 = i48 - i;
                int i51 = this.f1353;
                long j23 = (j22 & (~(j2 << i50))) | (j << i50);
                jArr13[i49] = j23;
                jArr13[(((iM1323 - 7) & i51) + (i51 & 7)) >> 3] = j23;
                return iM1323;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1325() {
        this.f1359 = 0;
        long[] jArr = this.f1358;
        if (jArr != AbstractC1137.f1352) {
            AbstractC5179.m9392(-9187201950435737472L, jArr);
            long[] jArr2 = this.f1358;
            int i = this.f1353;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC5179.m9393(0, this.f1353, null, this.f1357);
        AbstractC5179.m9392(4611686018427387903L, this.f1356);
        this.f1355 = Integer.MAX_VALUE;
        this.f1354 = Integer.MAX_VALUE;
        this.f1241 = AbstractC1137.m1446(this.f1353) - this.f1359;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1326(Object obj) {
        int i = this.f1359;
        int iM1324 = m1324(obj);
        this.f1357[iM1324] = obj;
        long[] jArr = this.f1356;
        int i2 = this.f1355;
        jArr[iM1324] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iM1324) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.f1355 = iM1324;
        if (this.f1354 == Integer.MAX_VALUE) {
            this.f1354 = iM1324;
        }
        return this.f1359 != i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1327(int i) {
        this.f1359--;
        long[] jArr = this.f1358;
        int i2 = this.f1353;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f1357[i] = null;
        long[] jArr2 = this.f1356;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.f1355 = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.f1354 = i5;
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
    */
    public final boolean m1328(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f1353;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f1358;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (AbstractC5227.m9466(this.f1357[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m1327(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1329(Collection collection) {
        collection.getClass();
        Object[] objArr = this.f1357;
        int i = this.f1359;
        long[] jArr = this.f1358;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!AbstractC5176.m9365(collection, objArr[i5])) {
                                m1327(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this.f1359;
    }
}
