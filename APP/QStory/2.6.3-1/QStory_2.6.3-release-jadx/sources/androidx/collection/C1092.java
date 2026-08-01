package androidx.collection;

import java.util.Arrays;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1092 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f1243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f1244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f1245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f1246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long[] f1247;

    public C1092(int i) {
        this.f1247 = AbstractC1137.f1352;
        this.f1246 = AbstractC1121.f1324;
        if (i >= 0) {
            m1342(AbstractC1137.m1443(i));
        } else {
            C6755.m11869("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1092)) {
            return false;
        }
        C1092 c1092 = (C1092) obj;
        if (c1092.f1244 != this.f1244) {
            return false;
        }
        int[] iArr = this.f1246;
        long[] jArr = this.f1247;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !c1092.m1344(iArr[(i << 3) + i3])) {
                            return false;
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
        int[] iArr = this.f1246;
        long[] jArr = this.f1247;
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
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[PHI: r5
  0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f1246;
        long[] jArr = this.f1247;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i5);
                            i2++;
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
            sb.append((CharSequence) "]");
        } else {
            sb.append((CharSequence) "]");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1340(int i) {
        this.f1244--;
        long[] jArr = this.f1247;
        int i2 = this.f1245;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1341(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f1245;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f1247;
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
                if (this.f1246[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m1340(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1342(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, AbstractC1137.m1444(i)) : 0;
        this.f1245 = iMax;
        if (iMax == 0) {
            jArr = AbstractC1137.f1352;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f1247 = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f1243 = AbstractC1137.m1446(this.f1245) - this.f1244;
        this.f1246 = new int[iMax];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m1343(int i) {
        int i2 = this.f1245;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f1247;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1344(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f1245;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f1247;
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
                if (this.f1246[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (r8 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        r3 = m1343(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        if (r37.f1243 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (((r37.f1247[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        r25 = 255;
        r29 = true;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        r3 = r37.f1245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r37.f1244) * 32, ((long) r3) * 25) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
    
        r3 = r37.f1247;
        r4 = r37.f1245;
        r6 = r37.f1246;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if (r14 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        r27 = r8;
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r14 = r14 + 1;
        r12 = r12;
        r8 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
    
        r25 = r12;
        r7 = kotlin.collections.AbstractC5179.m9386(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010d, code lost:
    
        if (r7 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011c, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011e, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
    
        if (r12 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
    
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r12 = r12 ^ (r12 << 16);
        r13 = r12 >>> 7;
        r14 = m1343(r13);
        r13 = r13 & r4;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
    
        r28 = r6;
        r3[r8] = ((~(r25 << r9)) & r3[r8]) | (((long) (r12 & 127)) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0167, code lost:
    
        r6 = r28;
        r15 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016c, code lost:
    
        r28 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017e, code lost:
    
        if (((r33 >> r7) & r25) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0180, code lost:
    
        r3[r6] = (r33 & (~(r25 << r7))) | (((long) (r12 & 127)) << r7);
        r3[r8] = (r3[r8] & (~(r25 << r9))) | (128 << r9);
        r28[r14] = r28[r32];
        r28[r32] = 0;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a4, code lost:
    
        r3[r6] = (((long) (r12 & 127)) << r7) | (r33 & (~(r25 << r7)));
        r6 = r28[r14];
        r28[r14] = r28[r32];
        r28[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01be, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01cc, code lost:
    
        r29 = r15;
        r37.f1243 = androidx.collection.AbstractC1137.m1446(r37.f1245) - r37.f1244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01db, code lost:
    
        r25 = 255;
        r29 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e2, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e5, code lost:
    
        r3 = androidx.collection.AbstractC1137.m1445(r37.f1245);
        r4 = r37.f1247;
        r6 = r37.f1246;
        r7 = r37.f1245;
        m1342(r3);
        r3 = r37.f1247;
        r8 = r37.f1246;
        r9 = r37.f1245;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fc, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020b, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x020d, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r15 = m1343(r14 >>> 7);
        r19 = r3;
        r18 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r3;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0248, code lost:
    
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024c, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0253, code lost:
    
        r3 = m1343(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0257, code lost:
    
        r14 = r3;
        r37.f1244++;
        r3 = r37.f1243;
        r4 = r37.f1247;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0270, code lost:
    
        if (((r6 >> r8) & r25) != r20) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0272, code lost:
    
        r9 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0275, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0277, code lost:
    
        r37.f1243 = r3 - r9;
        r3 = r37.f1245;
        r6 = (r6 & (~(r25 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1345(int i) {
        int i2;
        boolean z;
        int iNumberOfTrailingZeros;
        int i3 = this.f1244;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f1245;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.f1247;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            boolean z2 = true;
            int i13 = i10;
            long j = (((-i12) >> 63) & (jArr[i11 + 1] << (64 - i12))) | (jArr[i11] >>> i12);
            long j2 = i7;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i9) & i8;
                int i14 = i4;
                if (this.f1246[iNumberOfTrailingZeros] == i) {
                    z = true;
                    break loop0;
                }
                j4 &= j4 - 1;
                i4 = i14;
            }
            i10 = i13 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i2;
        }
        this.f1246[iNumberOfTrailingZeros] = i;
        if (this.f1244 != i3) {
            return z;
        }
        return false;
    }

    public /* synthetic */ C1092() {
        this(6);
    }
}
