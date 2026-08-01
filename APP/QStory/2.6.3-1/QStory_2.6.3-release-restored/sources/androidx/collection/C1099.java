package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import p203.AbstractC8601;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1099 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f1258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f1259;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f1260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f1261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object[] f1262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long[] f1263;

    public C1099(int i) {
        this.f1263 = AbstractC1137.f1352;
        this.f1262 = AbstractC8601.f21424;
        this.f1261 = AbstractC1121.f1324;
        if (i >= 0) {
            m1363(AbstractC1137.m1443(i));
        } else {
            C6755.m11869("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1099)) {
            return false;
        }
        C1099 c1099 = (C1099) obj;
        if (c1099.f1259 != this.f1259) {
            return false;
        }
        Object[] objArr = this.f1262;
        int[] iArr = this.f1261;
        long[] jArr = this.f1263;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            int iM1364 = c1099.m1364(obj2);
                            if (iM1364 < 0 || i5 != c1099.f1261[iM1364]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f1262;
        int[] iArr = this.f1261;
        long[] jArr = this.f1263;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        iHashCode += Integer.hashCode(iArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (this.f1259 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f1262;
        int[] iArr = this.f1261;
        long[] jArr = this.f1263;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
                            i2++;
                            if (i2 < this.f1259) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1362(int i) {
        this.f1259--;
        long[] jArr = this.f1263;
        int i2 = this.f1260;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f1262[i] = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1363(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC1137.m1444(i)) : 0;
        this.f1260 = iMax;
        if (iMax == 0) {
            jArr = AbstractC1137.f1352;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f1263 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f1258 = AbstractC1137.m1446(this.f1260) - this.f1259;
        this.f1262 = new Object[iMax];
        this.f1261 = new int[iMax];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m1364(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f1260;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f1263;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (AbstractC5227.m9466(this.f1262[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m1365(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f1260;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f1263;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (AbstractC5227.m9466(this.f1262[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM1366 = m1366(i4);
                long j8 = 255;
                if (this.f1258 != 0 || ((this.f1263[iM1366 >> 3] >> ((iM1366 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.f1260;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compareUnsigned(((long) this.f1259) * 32, ((long) i14) * 25) <= 0) {
                            long[] jArr4 = this.f1263;
                            int i16 = this.f1260;
                            Object[] objArr2 = this.f1262;
                            int[] iArr = this.f1261;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int iM9386 = AbstractC5179.m9386(jArr4);
                            int i20 = iM9386 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM9386] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iM13662 = m1366(i25);
                                    int i26 = i25 & i16;
                                    long j13 = j11;
                                    if (((iM13662 - i26) & i16) / 8 == ((i21 - i26) & i16) / i19) {
                                        jArr4[i22] = (((long) (i24 & 127)) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i19 = i19;
                                        j11 = j13;
                                    } else {
                                        int i27 = i19;
                                        int i28 = iM13662 >> 3;
                                        long j14 = jArr4[i28];
                                        int i29 = (iM13662 & 7) << 3;
                                        if (((j14 >> i29) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j14) | (((long) (i24 & 127)) << i29);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iM13662] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[iM13662] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = (((long) (i24 & 127)) << i29) | ((~(j << i29)) & j14);
                                            Object obj3 = objArr[iM13662];
                                            objArr[iM13662] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i30 = iArr[iM13662];
                                            iArr[iM13662] = iArr[i21];
                                            iArr[i21] = i30;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        i19 = i27;
                                        j11 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f1258 = AbstractC1137.m1446(this.f1260) - this.f1259;
                        }
                        iM1366 = m1366(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM1445 = AbstractC1137.m1445(this.f1260);
                    long[] jArr5 = this.f1263;
                    Object[] objArr3 = this.f1262;
                    int[] iArr2 = this.f1261;
                    int i31 = this.f1260;
                    m1363(iM1445);
                    long[] jArr6 = this.f1263;
                    Object[] objArr4 = this.f1262;
                    int[] iArr3 = this.f1261;
                    int i32 = this.f1260;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr5[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i33];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i34 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM13663 = m1366(i34 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i34 & 127;
                            int i35 = iM13663 >> 3;
                            int i36 = (iM13663 & 7) << 3;
                            long j16 = (jArr[i35] & (~(255 << i36))) | (j15 << i36);
                            jArr[i35] = j16;
                            jArr[(((iM13663 - 7) & i32) + (i32 & 7)) >> 3] = j16;
                            objArr4[iM13663] = obj4;
                            iArr3[iM13663] = iArr2[i33];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i33++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM1366 = m1366(i4);
                }
                this.f1259++;
                int i37 = this.f1258;
                long[] jArr7 = this.f1263;
                int i38 = iM1366 >> 3;
                long j17 = jArr7[i38];
                int i39 = (iM1366 & 7) << 3;
                this.f1258 = i37 - (((j17 >> i39) & j) == j3 ? 1 : 0);
                int i40 = this.f1260;
                long j18 = (j17 & (~(j << i39))) | (j2 << i39);
                jArr7[i38] = j18;
                jArr7[(((iM1366 - 7) & i40) + (i40 & 7)) >> 3] = j18;
                return ~iM1366;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m1366(int i) {
        int i2 = this.f1260;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f1263;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1367() {
        this.f1259 = 0;
        long[] jArr = this.f1263;
        if (jArr != AbstractC1137.f1352) {
            AbstractC5179.m9392(-9187201950435737472L, jArr);
            long[] jArr2 = this.f1263;
            int i = this.f1260;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        AbstractC5179.m9393(0, this.f1260, null, this.f1262);
        this.f1258 = AbstractC1137.m1446(this.f1260) - this.f1259;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1368(int i, Object obj) {
        int iM1365 = m1365(obj);
        if (iM1365 < 0) {
            iM1365 = ~iM1365;
        }
        this.f1262[iM1365] = obj;
        this.f1261[iM1365] = i;
    }

    public /* synthetic */ C1099() {
        this(6);
    }
}
