package p069f;

import java.util.Arrays;
import p087g.AbstractC1256a;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0965w extends AbstractC0942k {

    /* JADX INFO: renamed from: f */
    public int f3037f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0965w(int i9) {
        this.f2963a = AbstractC0957r0.f3015a;
        this.f2964b = AbstractC0946m.f2980a;
        this.f2965c = AbstractC1256a.f4115c;
        if (i9 >= 0) {
            m2377f(AbstractC0957r0.m2358d(i9));
        } else {
            C2104o.m5294t("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2374c() {
        this.f2967e = 0;
        long[] jArr = this.f2963a;
        if (jArr != AbstractC0957r0.f3015a) {
            AbstractC4165l.m8388w0(-9187201950435737472L, jArr);
            long[] jArr2 = this.f2963a;
            int i9 = this.f2966d;
            int i10 = i9 >> 3;
            long j3 = 255 << ((i9 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j3)) | j3;
        }
        AbstractC4165l.m8387v0(0, this.f2966d, null, this.f2965c);
        this.f3037f = AbstractC0957r0.m2355a(this.f2966d) - this.f2967e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m2375d(int i9) {
        long j3;
        long j4;
        int i10;
        long j5;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i11;
        int i12 = -862048943;
        int iHashCode = Integer.hashCode(i9) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f2966d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f2963a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j10 = ((jArr3[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr3[i19] >>> i20);
            long j11 = i15;
            int i22 = i18;
            int i23 = 0;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j13) >> 3)) & i16;
                int i24 = i12;
                int i25 = i23;
                if (this.f2964b[iNumberOfTrailingZeros] == i9) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i12 = i24;
                i23 = i25;
            }
            int i26 = i12;
            int i27 = i23;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM2376e = m2376e(i14);
                long j14 = 255;
                if (this.f3037f != 0 || ((this.f2963a[iM2376e >> 3] >> ((iM2376e & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    j4 = j11;
                    i10 = 1;
                    j5 = 128;
                } else {
                    int i28 = this.f2966d;
                    if (i28 > 8) {
                        j5 = 128;
                        if (Long.compareUnsigned(((long) this.f2967e) * 32, ((long) i28) * 25) <= 0) {
                            long[] jArr4 = this.f2963a;
                            int i29 = this.f2966d;
                            int[] iArr2 = this.f2964b;
                            Object[] objArr2 = this.f2965c;
                            int i30 = (i29 + 7) >> 3;
                            int i31 = i27;
                            while (i31 < i30) {
                                long j15 = j14;
                                long j16 = jArr4[i31] & (-9187201950435737472L);
                                jArr4[i31] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i31++;
                                j11 = j11;
                                j14 = j15;
                            }
                            j3 = j14;
                            j4 = j11;
                            int iM8365B0 = AbstractC4165l.m8365B0(jArr4);
                            int i32 = iM8365B0 - 1;
                            long j17 = 72057594037927935L;
                            jArr4[i32] = (jArr4[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM8365B0] = jArr4[i27];
                            int i33 = i27;
                            while (i33 != i29) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j18 = (jArr4[i34] >> i35) & j3;
                                if (j18 != 128 && j18 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i33]) * i26;
                                    int i36 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i37 = i36 >>> 7;
                                    int iM2376e2 = m2376e(i37);
                                    int i38 = i37 & i29;
                                    if (((iM2376e2 - i38) & i29) / 8 == ((i33 - i38) & i29) / 8) {
                                        long j19 = j17;
                                        jArr4[i34] = (((long) (i36 & 127)) << i35) | ((~(j3 << i35)) & jArr4[i34]);
                                        jArr4[jArr4.length - i21] = (jArr4[i27] & j19) | Long.MIN_VALUE;
                                        i33++;
                                        j17 = j19;
                                    } else {
                                        long j20 = j17;
                                        int i39 = iM2376e2 >> 3;
                                        long j21 = jArr4[i39];
                                        int i40 = (iM2376e2 & 7) << 3;
                                        if (((j21 >> i40) & j3) == 128) {
                                            i11 = i21;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i39] = ((~(j3 << i40)) & j21) | (((long) (i36 & 127)) << i40);
                                            jArr4[i34] = (jArr4[i34] & (~(j3 << i35))) | (128 << i35);
                                            iArr[iM2376e2] = iArr[i33];
                                            iArr[i33] = i27;
                                            objArr[iM2376e2] = objArr[i33];
                                            objArr[i33] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i11 = i21;
                                            jArr4[i39] = (((long) (i36 & 127)) << i40) | ((~(j3 << i40)) & j21);
                                            int i41 = iArr[iM2376e2];
                                            iArr[iM2376e2] = iArr[i33];
                                            iArr[i33] = i41;
                                            Object obj = objArr[iM2376e2];
                                            objArr[iM2376e2] = objArr[i33];
                                            objArr[i33] = obj;
                                            i33--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i27] & j20) | Long.MIN_VALUE;
                                        i33++;
                                        j17 = j20;
                                        i21 = i11;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i33++;
                                }
                            }
                            i10 = i21;
                            this.f3037f = AbstractC0957r0.m2355a(this.f2966d) - this.f2967e;
                        }
                        iM2376e = m2376e(i14);
                    } else {
                        j5 = 128;
                    }
                    j3 = 255;
                    j4 = j11;
                    i10 = 1;
                    int iM2356b = AbstractC0957r0.m2356b(this.f2966d);
                    long[] jArr5 = this.f2963a;
                    int[] iArr3 = this.f2964b;
                    Object[] objArr3 = this.f2965c;
                    int i42 = this.f2966d;
                    m2377f(iM2356b);
                    long[] jArr6 = this.f2963a;
                    int[] iArr4 = this.f2964b;
                    Object[] objArr4 = this.f2965c;
                    int i43 = this.f2966d;
                    int i44 = i27;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j5) {
                            int i45 = iArr3[i44];
                            int iHashCode3 = Integer.hashCode(i45) * i26;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2376e3 = m2376e(i46 >>> 7);
                            long j22 = i46 & 127;
                            int i47 = iM2376e3 >> 3;
                            int i48 = (iM2376e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = (jArr6[i47] & (~(255 << i48))) | (j22 << i48);
                            jArr[i47] = j23;
                            jArr[(((iM2376e3 - 7) & i43) + (i43 & 7)) >> 3] = j23;
                            iArr4[iM2376e3] = i45;
                            objArr4[iM2376e3] = objArr3[i44];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i44++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM2376e = m2376e(i14);
                }
                this.f2967e++;
                int i49 = this.f3037f;
                long[] jArr7 = this.f2963a;
                int i50 = iM2376e >> 3;
                long j24 = jArr7[i50];
                int i51 = (iM2376e & 7) << 3;
                if (((j24 >> i51) & j3) != j5) {
                    i10 = i27;
                }
                this.f3037f = i49 - i10;
                int i52 = this.f2966d;
                long j25 = (j24 & (~(j3 << i51))) | (j4 << i51);
                jArr7[i50] = j25;
                jArr7[(((iM2376e - 7) & i52) + (i52 & 7)) >> 3] = j25;
                return iM2376e;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i26;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m2376e(int i9) {
        int i10 = this.f2966d;
        int i11 = i9 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f2963a;
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
    /* JADX INFO: renamed from: f */
    public final void m2377f(int i9) {
        long[] jArr;
        int iMax = i9 > 0 ? Math.max(7, AbstractC0957r0.m2357c(i9)) : 0;
        this.f2966d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0957r0.f3015a;
        } else {
            int i10 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f2963a = jArr;
        int i11 = iMax >> 3;
        long j3 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f3037f = AbstractC0957r0.m2355a(this.f2966d) - this.f2967e;
        this.f2964b = new int[iMax];
        this.f2965c = new Object[iMax];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2378g(int i9) {
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
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f2967e--;
        long[] jArr2 = this.f2963a;
        int i17 = this.f2966d;
        int i18 = iNumberOfTrailingZeros >> 3;
        int i19 = (iNumberOfTrailingZeros & 7) << 3;
        long j10 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
        jArr2[i18] = j10;
        jArr2[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j10;
        Object[] objArr = this.f2965c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m2379h(int i9, Object obj) {
        int iM2375d = m2375d(i9);
        this.f2964b[iM2375d] = i9;
        this.f2965c[iM2375d] = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (6 int) A[MD:(int):void (m)] (LINE:38) call: f.w.<init>(int):void type: THIS */
    public /* synthetic */ C0965w() {
        this(6);
    }
}
