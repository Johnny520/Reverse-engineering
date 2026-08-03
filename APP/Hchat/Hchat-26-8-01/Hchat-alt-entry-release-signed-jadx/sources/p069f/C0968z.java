package p069f;

import java.util.Arrays;
import p087g.AbstractC1256a;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0968z {

    /* JADX INFO: renamed from: a */
    public long[] f3045a = AbstractC0957r0.f3015a;

    /* JADX INFO: renamed from: b */
    public long[] f3046b = AbstractC0950o.f2996a;

    /* JADX INFO: renamed from: c */
    public Object[] f3047c = AbstractC1256a.f4115c;

    /* JADX INFO: renamed from: d */
    public int f3048d;

    /* JADX INFO: renamed from: e */
    public int f3049e;

    /* JADX INFO: renamed from: f */
    public int f3050f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0968z(int i9) {
        if (i9 >= 0) {
            m2391e(AbstractC0957r0.m2358d(i9));
        } else {
            C2104o.m5294t("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2387a() {
        this.f3049e = 0;
        long[] jArr = this.f3045a;
        if (jArr != AbstractC0957r0.f3015a) {
            AbstractC4165l.m8388w0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f3045a;
            int i9 = this.f3048d;
            int i10 = i9 >> 3;
            long j3 = 255 << ((i9 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j3)) | j3;
        }
        AbstractC4165l.m8387v0(0, this.f3048d, null, this.f3047c);
        this.f3050f = AbstractC0957r0.m2355a(this.f3048d) - this.f3049e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2388b(long j3) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j3) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f3048d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f3045a;
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
                if (this.f3046b[iNumberOfTrailingZeros] == j3) {
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
    /* JADX INFO: renamed from: c */
    public final int m2389c(int i9) {
        int i10 = this.f3048d;
        int i11 = i9 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f3045a;
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
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2390d(long j3) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j3) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f3048d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f3045a;
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
                if (this.f3046b[iNumberOfTrailingZeros] == j3) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f3047c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2391e(int i9) {
        long[] jArr;
        int iMax = i9 > 0 ? Math.max(7, AbstractC0957r0.m2357c(i9)) : 0;
        this.f3048d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0957r0.f3015a;
        } else {
            int i10 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f3045a = jArr;
        int i11 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f3050f = AbstractC0957r0.m2355a(this.f3048d) - this.f3049e;
        this.f3046b = new long[iMax];
        this.f3047c = new Object[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z9;
        long[] jArr;
        boolean z10;
        long[] jArr2;
        boolean z11 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0968z)) {
            return false;
        }
        C0968z c0968z = (C0968z) obj;
        if (c0968z.f3049e != this.f3049e) {
            return false;
        }
        long[] jArr3 = this.f3046b;
        Object[] objArr = this.f3047c;
        long[] jArr4 = this.f3045a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i9 = 0;
        loop0: while (true) {
            long j3 = jArr4[i9];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j3) < 128) {
                        int i12 = (i9 << 3) + i11;
                        z10 = z11;
                        jArr2 = jArr3;
                        long j4 = jArr2[i12];
                        Object obj2 = objArr[i12];
                        if (obj2 == null) {
                            if (c0968z.m2390d(j4) != null || !c0968z.m2388b(j4)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(c0968z.m2390d(j4))) {
                            return false;
                        }
                    } else {
                        z10 = z11;
                        jArr2 = jArr3;
                    }
                    j3 >>= 8;
                    i11++;
                    z11 = z10;
                    jArr3 = jArr2;
                }
                z9 = z11;
                jArr = jArr3;
                if (i10 != 8) {
                    return z9;
                }
            } else {
                z9 = z11;
                jArr = jArr3;
            }
            if (i9 == length) {
                return z9;
            }
            i9++;
            z11 = z9;
            jArr3 = jArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2392f(long j3) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j3) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f3048d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f3045a;
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
                if (this.f3046b[iNumberOfTrailingZeros] == j3) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f3049e--;
        long[] jArr2 = this.f3045a;
        int i16 = this.f3048d;
        int i17 = iNumberOfTrailingZeros >> 3;
        int i18 = (iNumberOfTrailingZeros & 7) << 3;
        long j11 = (jArr2[i17] & (~(255 << i18))) | (254 << i18);
        jArr2[i17] = j11;
        jArr2[(((iNumberOfTrailingZeros - 7) & i16) + (i16 & 7)) >> 3] = j11;
        Object[] objArr = this.f3047c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        r1 = m2389c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r38.f3050f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (((r38.f3045a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r1 = r38.f3048d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r38.f3049e) * 32, ((long) r1) * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        r1 = r38.f3045a;
        r2 = r38.f3048d;
        r4 = r38.f3046b;
        r5 = r38.f3047c;
        r6 = (r2 + 7) >> 3;
        r25 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        if (r7 >= r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        r29 = r10;
        r27 = r12;
        r11 = r13;
        r8 = 7;
        r6 = tf.AbstractC4165l.m8365B0(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r27];
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010c, code lost:
    
        if (r6 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010e, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011b, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
    
        if (r9 == 254) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r15 = m2389c(r10);
        r10 = r10 & r2;
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0148, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = (((long) (r9 & 127)) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r28;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017c, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017e, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | (((long) (r9 & 127)) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ab, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = (((long) (r9 & 127)) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d0, code lost:
    
        r1[r1.length - 1] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r28;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e8, code lost:
    
        r18 = r11;
        r38.f3050f = p069f.AbstractC0957r0.m2355a(r38.f3048d) - r38.f3049e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f9, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0204, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0207, code lost:
    
        r1 = p069f.AbstractC0957r0.m2356b(r38.f3048d);
        r2 = r38.f3045a;
        r4 = r38.f3046b;
        r5 = r38.f3047c;
        r6 = r38.f3048d;
        m2391e(r1);
        r1 = r38.f3045a;
        r7 = r38.f3046b;
        r8 = r38.f3047c;
        r9 = r38.f3048d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0222, code lost:
    
        if (r10 >= r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0231, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0233, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = m2389c(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0271, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0274, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027a, code lost:
    
        r1 = m2389c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x027e, code lost:
    
        r16 = r1;
        r38.f3049e++;
        r1 = r38.f3050f;
        r2 = r38.f3045a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0298, code lost:
    
        if (((r4 >> r6) & r25) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x029b, code lost:
    
        r18 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x029d, code lost:
    
        r38.f3050f = r1 - r18;
        r1 = r38.f3048d;
        r4 = (r4 & (~(r25 << r6))) | (r29 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2393g(Object obj, long j3) {
        int i9;
        int iNumberOfTrailingZeros;
        int i10 = -862048943;
        int iHashCode = Long.hashCode(j3) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f3048d;
        int i15 = i12 & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f3045a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j4 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j5 = i13;
            int i20 = i16;
            int i21 = 0;
            long j10 = j4 ^ (j5 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j11) >> 3)) & i14;
                int i22 = i10;
                if (this.f3046b[iNumberOfTrailingZeros] == j3) {
                    break loop0;
                }
                j11 &= j11 - 1;
                i10 = i22;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
            i10 = i9;
        }
        this.f3046b[iNumberOfTrailingZeros] = j3;
        this.f3047c[iNumberOfTrailingZeros] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long[] jArr = this.f3046b;
        Object[] objArr = this.f3047c;
        long[] jArr2 = this.f3045a;
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
                        int i12 = (i9 << 3) + i11;
                        long j4 = jArr[i12];
                        Object obj = objArr[i12];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j4);
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
    public final String toString() {
        int i9;
        int i10;
        if (this.f3049e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f3046b;
        Object[] objArr = this.f3047c;
        long[] jArr2 = this.f3045a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j3 = jArr2[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j3) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i10 = i11;
                            long j4 = jArr[i15];
                            Object obj = objArr[i15];
                            sb2.append(j4);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i12++;
                            if (i12 < this.f3049e) {
                                sb2.append(", ");
                            }
                        } else {
                            i10 = i11;
                        }
                        j3 >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i16 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i9 = i16;
                } else {
                    i9 = i11;
                }
                if (i9 == length) {
                    break;
                }
                i11 = i9 + 1;
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
