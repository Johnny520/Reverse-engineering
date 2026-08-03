package p069f;

import java.util.Arrays;
import p136j8.C2104o;

/* JADX INFO: renamed from: f.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0923a0 {

    /* JADX INFO: renamed from: a */
    public long[] f2888a = AbstractC0957r0.f3015a;

    /* JADX INFO: renamed from: b */
    public long[] f2889b = AbstractC0950o.f2996a;

    /* JADX INFO: renamed from: c */
    public int f2890c;

    /* JADX INFO: renamed from: d */
    public int f2891d;

    /* JADX INFO: renamed from: e */
    public int f2892e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0923a0(int i9) {
        if (i9 >= 0) {
            m2266c(AbstractC0957r0.m2358d(i9));
        } else {
            C2104o.m5294t("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2264a(long j3) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j3) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f2890c;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f2888a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j4 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j5 = (((long) i10) * 72340172838076673L) ^ j4;
            long j10 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f2889b[iNumberOfTrailingZeros] == j3) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m2265b(int i9) {
        int i10 = this.f2890c;
        int i11 = i9 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f2888a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j3 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j4 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j4 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j4) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2266c(int i9) {
        long[] jArr;
        int iMax = i9 > 0 ? Math.max(7, AbstractC0957r0.m2357c(i9)) : 0;
        this.f2890c = iMax;
        if (iMax == 0) {
            jArr = AbstractC0957r0.f3015a;
        } else {
            int i10 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f2888a = jArr;
        int i11 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f2892e = AbstractC0957r0.m2355a(this.f2890c) - this.f2891d;
        this.f2889b = new long[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0923a0)) {
            return false;
        }
        C0923a0 c0923a0 = (C0923a0) obj;
        if (c0923a0.f2891d != this.f2891d) {
            return false;
        }
        long[] jArr = this.f2889b;
        long[] jArr2 = this.f2888a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr2[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128 && !c0923a0.m2264a(jArr[(i9 << 3) + i11])) {
                            return false;
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long[] jArr = this.f2889b;
        long[] jArr2 = this.f2888a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i9 = 0;
        int iHashCode = 0;
        while (true) {
            long j3 = jArr2[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128) {
                        iHashCode = Long.hashCode(jArr[(i9 << 3) + i11]) + iHashCode;
                    }
                    j3 >>= 8;
                }
                if (i10 != 8) {
                    return iHashCode;
                }
            }
            if (i9 == length) {
                return iHashCode;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f2889b;
        long[] jArr2 = this.f2888a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j3 = jArr2[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            long j4 = jArr[(i9 << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(j4);
                            i10++;
                        }
                        j3 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
            sb2.append((CharSequence) "]");
        } else {
            sb2.append((CharSequence) "]");
        }
        return sb2.toString();
    }
}
