package p069f;

import java.util.Arrays;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0962u {

    /* JADX INFO: renamed from: a */
    public long[] f3027a;

    /* JADX INFO: renamed from: b */
    public int[] f3028b;

    /* JADX INFO: renamed from: c */
    public int[] f3029c;

    /* JADX INFO: renamed from: d */
    public int f3030d;

    /* JADX INFO: renamed from: e */
    public int f3031e;

    /* JADX INFO: renamed from: f */
    public int f3032f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0962u(int i9) {
        this.f3027a = AbstractC0957r0.f3015a;
        int[] iArr = AbstractC0946m.f2980a;
        this.f3028b = iArr;
        this.f3029c = iArr;
        if (i9 >= 0) {
            m2367e(AbstractC0957r0.m2358d(i9));
        } else {
            C2104o.m5294t("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2363a() {
        this.f3031e = 0;
        long[] jArr = this.f3027a;
        if (jArr != AbstractC0957r0.f3015a) {
            AbstractC4165l.m8388w0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f3027a;
            int i9 = this.f3030d;
            int i10 = i9 >> 3;
            long j3 = 255 << ((i9 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j3)) | j3;
        }
        this.f3032f = AbstractC0957r0.m2355a(this.f3030d) - this.f3031e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m2364b(int i9) {
        int i10 = this.f3030d;
        int i11 = i9 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f3027a;
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
    public final int m2365c(int i9) {
        int iHashCode = Integer.hashCode(i9) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f3030d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f3027a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j3 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j4 = (((long) i11) * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i13) & i12;
                if (this.f3028b[iNumberOfTrailingZeros] == i9) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m2366d(int i9) {
        int iM2365c = m2365c(i9);
        if (iM2365c >= 0) {
            return this.f3029c[iM2365c];
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2367e(int i9) {
        long[] jArr;
        int iMax = i9 > 0 ? Math.max(7, AbstractC0957r0.m2357c(i9)) : 0;
        this.f3030d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0957r0.f3015a;
        } else {
            int i10 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f3027a = jArr;
        int i11 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f3032f = AbstractC0957r0.m2355a(this.f3030d) - this.f3031e;
        this.f3028b = new int[iMax];
        this.f3029c = new int[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0962u)) {
            return false;
        }
        C0962u c0962u = (C0962u) obj;
        if (c0962u.f3031e != this.f3031e) {
            return false;
        }
        int[] iArr = this.f3028b;
        int[] iArr2 = this.f3029c;
        long[] jArr = this.f3027a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i9 = 0;
        loop0: while (true) {
            long j3 = jArr[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j3) < 128) {
                        int i12 = (i9 << 3) + i11;
                        int i13 = iArr[i12];
                        int i14 = iArr2[i12];
                        int iM2365c = c0962u.m2365c(i13);
                        if (iM2365c < 0) {
                            break loop0;
                        }
                        z10 = z11;
                        if (i14 != c0962u.f3029c[iM2365c]) {
                            break loop0;
                        }
                    } else {
                        z10 = z11;
                    }
                    j3 >>= 8;
                    i11++;
                    z11 = z10;
                }
                z9 = z11;
                if (i10 != 8) {
                    return z9;
                }
            } else {
                z9 = z11;
            }
            if (i9 == length) {
                return z9;
            }
            i9++;
            z11 = z9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        r2 = m2364b(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (r37.f3032f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (((r37.f3027a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        r2 = r37.f3030d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r2 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r37.f3031e) * 32, ((long) r2) * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        r2 = r37.f3027a;
        r3 = r37.f3030d;
        r5 = r37.f3028b;
        r6 = r37.f3029c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        if (r7 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        r27 = r9;
        r25 = r11;
        r12 = 7;
        r7 = tf.AbstractC4165l.m8365B0(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010c, code lost:
    
        if (r7 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010e, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011b, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011d, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r13 = m2364b(r10);
        r10 = r10 & r3;
        r29 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0148, code lost:
    
        r32 = r15;
        r2[r8] = (((long) (r9 & 127)) << r11) | (r2[r8] & (~(r25 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r29;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016d, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017f, code lost:
    
        if (((r14 >> r12) & r25) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0181, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r25 << r12)) & r14) | (((long) (r9 & 127)) << r12);
        r2[r8] = (r2[r8] & (~(r25 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ab, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = (((long) (r9 & 127)) << r12) | ((~(r25 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01cc, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r29;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e5, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f3032f = p069f.AbstractC0957r0.m2355a(r37.f3030d) - r37.f3031e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f8, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0203, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0206, code lost:
    
        r2 = p069f.AbstractC0957r0.m2356b(r37.f3030d);
        r3 = r37.f3027a;
        r5 = r37.f3028b;
        r6 = r37.f3029c;
        r7 = r37.f3030d;
        m2367e(r2);
        r2 = r37.f3027a;
        r8 = r37.f3028b;
        r9 = r37.f3029c;
        r10 = r37.f3030d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0221, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0230, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0232, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = m2364b(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x026e, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026f, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0275, code lost:
    
        r2 = m2364b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0279, code lost:
    
        r37.f3031e++;
        r1 = r37.f3032f;
        r3 = r37.f3027a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0291, code lost:
    
        if (((r5 >> r7) & r25) != r19) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0293, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0295, code lost:
    
        r37.f3032f = r1 - r32;
        r1 = r37.f3030d;
        r5 = (r5 & (~(r25 << r7))) | (r27 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2368f(int i9, int i10) {
        int i11;
        int iNumberOfTrailingZeros;
        int i12 = i9;
        int i13 = -862048943;
        int iHashCode = Integer.hashCode(i12) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f3030d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.f3027a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            int i23 = i19;
            int i24 = 0;
            long j3 = (((-i21) >> 63) & (jArr[i20 + 1] << (64 - i21))) | (jArr[i20] >>> i21);
            long j4 = i16;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j10 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i18) & i17;
                int i25 = i13;
                if (this.f3028b[iNumberOfTrailingZeros] == i12) {
                    break loop0;
                }
                j10 &= j10 - 1;
                i13 = i25;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i12 = i9;
            i13 = i11;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f3028b[iNumberOfTrailingZeros] = i9;
        this.f3029c[iNumberOfTrailingZeros] = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int[] iArr = this.f3028b;
        int[] iArr2 = this.f3029c;
        long[] jArr = this.f3027a;
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
                        iHashCode += Integer.hashCode(iArr2[i12]) ^ Integer.hashCode(i13);
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (this.f3031e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f3028b;
        int[] iArr2 = this.f3029c;
        long[] jArr = this.f3027a;
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
                            int i15 = iArr2[i13];
                            sb2.append(i14);
                            sb2.append("=");
                            sb2.append(i15);
                            i10++;
                            if (i10 < this.f3031e) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:31) call: f.u.<init>(int):void type: THIS */
    public /* synthetic */ C0962u() {
        this(6);
    }
}
