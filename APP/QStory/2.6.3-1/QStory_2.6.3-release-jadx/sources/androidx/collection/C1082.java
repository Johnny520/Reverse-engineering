package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import p203.AbstractC8601;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1082 extends AbstractC1133 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f1220;

    public C1082(int i) {
        this.f1346 = AbstractC1137.f1352;
        this.f1345 = AbstractC8601.f21424;
        if (i >= 0) {
            m1303(AbstractC1137.m1443(i));
        } else {
            C6755.m11869("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m1299(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f1344;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.f1346;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i13 = i3;
                if (AbstractC5227.m9466(this.f1345[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM1304 = m1304(i5);
                long j8 = 255;
                if (this.f1220 != 0 || ((this.f1346[iM1304 >> 3] >> ((iM1304 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.f1344;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (Long.compareUnsigned(((long) this.f1343) * 32, ((long) i15) * 25) <= 0) {
                            long[] jArr4 = this.f1346;
                            int i17 = this.f1344;
                            Object[] objArr2 = this.f1345;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            j3 = 128;
                            while (i19 < i18) {
                                long j9 = j8;
                                long j10 = jArr4[i19] & (-9187201950435737472L);
                                jArr4[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i19++;
                                i16 = i16;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i20 = i16;
                            int iM9386 = AbstractC5179.m9386(jArr4);
                            int i21 = iM9386 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM9386] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i22];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
                                    int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i26 = i25 >>> 7;
                                    int iM13042 = m1304(i26);
                                    int i27 = i26 & i17;
                                    if (((iM13042 - i27) & i17) / i20 == ((i22 - i27) & i17) / i20) {
                                        long j13 = j11;
                                        jArr4[i23] = (((long) (i25 & 127)) << i24) | ((~(j << i24)) & jArr4[i23]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i28 = iM13042 >> 3;
                                        long j15 = jArr4[i28];
                                        int i29 = (iM13042 & 7) << 3;
                                        if (((j15 >> i29) & j) == 128) {
                                            i2 = i20;
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j15) | (((long) (i25 & 127)) << i29);
                                            jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
                                            objArr[iM13042] = objArr[i22];
                                            objArr[i22] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            i2 = i20;
                                            jArr4[i28] = (((long) (i25 & 127)) << i29) | ((~(j << i29)) & j15);
                                            Object obj3 = objArr[iM13042];
                                            objArr[iM13042] = objArr[i22];
                                            objArr[i22] = obj3;
                                            i22--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j14;
                                        i20 = i2;
                                        i17 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            this.f1220 = AbstractC1137.m1446(this.f1344) - this.f1343;
                        }
                        iM1304 = m1304(i5);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM1445 = AbstractC1137.m1445(this.f1344);
                    long[] jArr5 = this.f1346;
                    Object[] objArr3 = this.f1345;
                    int i30 = this.f1344;
                    m1303(iM1445);
                    long[] jArr6 = this.f1346;
                    Object[] objArr4 = this.f1345;
                    int i31 = this.f1344;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM13043 = m1304(i33 >>> 7);
                            long j16 = i33 & 127;
                            int i34 = iM13043 >> 3;
                            int i35 = (iM13043 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i34] & (~(255 << i35))) | (j16 << i35);
                            jArr[i34] = j17;
                            jArr[(((iM13043 - 7) & i31) + (i31 & 7)) >> 3] = j17;
                            objArr4[iM13043] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM1304 = m1304(i5);
                }
                this.f1343++;
                int i36 = this.f1220;
                long[] jArr7 = this.f1346;
                int i37 = iM1304 >> 3;
                long j18 = jArr7[i37];
                int i38 = (iM1304 & 7) << 3;
                this.f1220 = i36 - (((j18 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.f1344;
                long j19 = (j18 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j19;
                jArr7[(((iM1304 - 7) & i39) + (i39 & 7)) >> 3] = j19;
                return iM1304;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1300() {
        this.f1343 = 0;
        long[] jArr = this.f1346;
        if (jArr != AbstractC1137.f1352) {
            AbstractC5179.m9392(-9187201950435737472L, jArr);
            long[] jArr2 = this.f1346;
            int i = this.f1344;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC5179.m9393(0, this.f1344, null, this.f1345);
        this.f1220 = AbstractC1137.m1446(this.f1344) - this.f1343;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m1301(Object obj) {
        int i = this.f1343;
        this.f1345[m1299(obj)] = obj;
        return this.f1343 != i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m1302(int i) {
        this.f1343--;
        long[] jArr = this.f1346;
        int i2 = this.f1344;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f1345[i] = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1303(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC1137.m1444(i)) : 0;
        this.f1344 = iMax;
        if (iMax == 0) {
            jArr = AbstractC1137.f1352;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f1346 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f1220 = AbstractC1137.m1446(this.f1344) - this.f1343;
        this.f1345 = iMax == 0 ? AbstractC8601.f21424 : new Object[iMax];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m1304(int i) {
        int i2 = this.f1344;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f1346;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1305(Object obj) {
        this.f1345[m1299(obj)] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1306(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f1344;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f1346;
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
                if (AbstractC5227.m9466(this.f1345[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m1302(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1307(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f1344;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f1346;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (AbstractC5227.m9466(this.f1345[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            m1302(iNumberOfTrailingZeros);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1308(AbstractC1133 abstractC1133) {
        abstractC1133.getClass();
        Object[] objArr = abstractC1133.f1345;
        long[] jArr = abstractC1133.f1346;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        m1305(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public /* synthetic */ C1082() {
        this(6);
    }
}
