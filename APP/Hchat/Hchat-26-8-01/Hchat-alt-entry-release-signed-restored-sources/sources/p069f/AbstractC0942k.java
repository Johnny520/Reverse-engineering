package p069f;

/* JADX INFO: renamed from: f.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0942k {

    /* JADX INFO: renamed from: a */
    public long[] f2963a;

    /* JADX INFO: renamed from: b */
    public int[] f2964b;

    /* JADX INFO: renamed from: c */
    public Object[] f2965c;

    /* JADX INFO: renamed from: d */
    public int f2966d;

    /* JADX INFO: renamed from: e */
    public int f2967e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2312a(int i9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f2966d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f2963a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j3 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j4 = (((long) i11) * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i13) & i12;
                if (this.f2964b[iNumberOfTrailingZeros] == i9) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2313b(int i9) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f2966d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f2963a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j3 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j4 = (((long) i11) * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i13) & i12;
                if (this.f2964b[iNumberOfTrailingZeros] == i9) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f2965c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0942k)) {
            return false;
        }
        AbstractC0942k abstractC0942k = (AbstractC0942k) obj;
        if (abstractC0942k.f2967e != this.f2967e) {
            return false;
        }
        int[] iArr = this.f2964b;
        Object[] objArr = this.f2965c;
        long[] jArr = this.f2963a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            loop0: while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128) {
                            int i12 = (i9 << 3) + i11;
                            int i13 = iArr[i12];
                            Object obj2 = objArr[i12];
                            if (obj2 == null) {
                                if (abstractC0942k.m2313b(i13) != null || !abstractC0942k.m2312a(i13)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(abstractC0942k.m2313b(i13))) {
                                return false;
                            }
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
        int[] iArr = this.f2964b;
        Object[] objArr = this.f2965c;
        long[] jArr = this.f2963a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i9 = 0;
        int iHashCode = 0;
        while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j3) < 128) {
                        int i12 = (i9 << 3) + i11;
                        int i13 = iArr[i12];
                        Object obj = objArr[i12];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i13);
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
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (this.f2967e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f2964b;
        Object[] objArr = this.f2965c;
        long[] jArr = this.f2963a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            int i13 = (i9 << 3) + i12;
                            int i14 = iArr[i13];
                            Object obj = objArr[i13];
                            sb2.append(i14);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i10++;
                            if (i10 < this.f2967e) {
                                sb2.append(", ");
                            }
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
        }
        sb2.append('}');
        return sb2.toString();
    }
}
