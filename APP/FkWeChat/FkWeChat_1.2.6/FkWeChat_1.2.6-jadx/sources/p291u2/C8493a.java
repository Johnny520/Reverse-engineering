package p291u2;

import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Arrays;
import p010a9.InterfaceC0190r;

/* JADX INFO: renamed from: u2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8493a {

    /* JADX INFO: renamed from: a */
    public long[] f28354a = new long[Opcodes.CHECKCAST];

    /* JADX INFO: renamed from: b */
    public long[] f28355b = new long[Opcodes.CHECKCAST];

    /* JADX INFO: renamed from: c */
    public int f28356c;

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m32672f(C8493a c8493a, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, boolean z12, int i16, int i17, Object obj) {
        if ((i17 & 32) != 0) {
            i15 = -1;
        }
        if ((i17 & 64) != 0) {
            z10 = false;
        }
        if ((i17 & 128) != 0) {
            z11 = false;
        }
        if ((i17 & 256) != 0) {
            z12 = false;
        }
        if ((i17 & 512) != 0) {
            i16 = -1;
        }
        c8493a.m32677e(i10, i11, i12, i13, i14, i15, z10, z11, z12, i16);
    }

    /* JADX INFO: renamed from: a */
    public final void m32673a() {
        long[] jArr = this.f28354a;
        int i10 = this.f28356c;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            int i12 = i11 + 2;
            jArr[i12] = jArr[i12] & (-1152921504606846977L);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m32674b() {
        long[] jArr = this.f28354a;
        int i10 = this.f28356c;
        long[] jArr2 = this.f28355b;
        int i11 = 0;
        for (int i12 = 0; i12 < jArr.length - 2 && i11 < jArr2.length - 2 && i12 < i10; i12 += 3) {
            int i13 = i12 + 2;
            if (jArr[i13] != AbstractC8494b.m32690c()) {
                jArr2[i11] = jArr[i12];
                jArr2[i11 + 1] = jArr[i12 + 1];
                jArr2[i11 + 2] = jArr[i13];
                i11 += 3;
            }
        }
        this.f28356c = i11;
        this.f28354a = jArr2;
        this.f28355b = jArr;
    }

    /* JADX INFO: renamed from: c */
    public final int m32675c() {
        return this.f28356c / 3;
    }

    /* JADX INFO: renamed from: d */
    public final long m32676d(int i10) {
        int i11 = i10 & 33554431;
        long[] jArr = this.f28354a;
        int i12 = this.f28356c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 33554431) == i11) {
                return jArr[i13];
            }
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: e */
    public final void m32677e(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, boolean z12, int i16) {
        long[] jArr = this.f28354a;
        int i17 = this.f28356c;
        int i18 = i17 + 3;
        this.f28356c = i18;
        int length = jArr.length;
        if (length <= i18) {
            m32683l(length, i17, jArr);
        }
        long[] jArr2 = this.f28354a;
        jArr2[i17] = (((long) i11) << 32) | (((long) i12) & 4294967295L);
        jArr2[i17 + 1] = (((long) i13) << 32) | (((long) i14) & 4294967295L);
        int i19 = i15 & 33554431;
        jArr2[i17 + 2] = ((z12 ? 1L : 0L) << 63) | ((z11 ? 1L : 0L) << 62) | ((z10 ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i19) << 25) | ((long) (i10 & 33554431));
        if (i15 < 0) {
            return;
        }
        for (int i20 = i16 != -1 ? i16 : i17 - 3; i20 >= 0; i20 -= 3) {
            int i21 = i20 + 2;
            long j10 = jArr2[i21];
            if ((((int) j10) & 33554431) == i19) {
                jArr2[i21] = (j10 & AbstractC8494b.m32688a()) | (((long) Math.min((i17 - i20) / 3, 1023)) << 50);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m32678g(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, boolean z12) {
        int i16 = i10 & 33554431;
        long[] jArr = this.f28354a;
        int i17 = this.f28356c;
        for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
            if ((((int) jArr[i18 + 2]) & 33554431) == i11) {
                long j10 = jArr[i18];
                int i19 = ((int) (j10 >> 32)) + i12;
                int i20 = ((int) j10) + i13;
                m32677e(i16, i19, i20, i19 + i14, i20 + i15, i11, z10, z11, z12, i18);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m32679h(int i10) {
        int i11 = i10 & 33554431;
        long[] jArr = this.f28354a;
        int i12 = this.f28356c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            long j10 = jArr[i14];
            if ((((int) j10) & 33554431) == i11) {
                jArr[i14] = (((j10 >> 63) & 1) << 60) | j10;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m32680i(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 & 33554431;
        long[] jArr = this.f28354a;
        int i16 = this.f28356c;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j10 = jArr[i18];
            if ((((int) j10) & 33554431) == i15) {
                long j11 = jArr[i17];
                jArr[i17] = (((long) i12) & 4294967295L) | (((long) i11) << 32);
                int i19 = i17;
                jArr[i17 + 1] = (((long) i14) & 4294967295L) | (((long) i13) << 32);
                jArr[i18] = (((j10 >> 63) & 1) << 60) | j10;
                int i20 = i11 - ((int) (j11 >> 32));
                int i21 = i12 - ((int) j11);
                if ((i20 != 0) || (i21 != 0)) {
                    m32686o((AbstractC8494b.m32689b() & j10) | (((long) ((i19 + 3) & 33554431)) << 25), i20, i21);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m32681j(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        long j10;
        int i17 = 33554431;
        int i18 = i10 & 33554431;
        int i19 = this.f28356c;
        int i20 = 0;
        for (long[] jArr = this.f28354a; i20 < jArr.length - 2 && i20 < i19; jArr = jArr) {
            if ((((int) jArr[i20 + 2]) & i17) == i11) {
                long j11 = jArr[i20];
                int i21 = ((int) (j11 >> 32)) + i12;
                int i22 = ((int) j11) + i13;
                int i23 = i21 + i14;
                int i24 = i22 + i15;
                do {
                    i20 += 3;
                    if (i20 >= jArr.length - 2 || i20 >= i19) {
                        break;
                    }
                    i16 = i20 + 2;
                    j10 = jArr[i16];
                } while ((((int) j10) & i17) != i18);
                int i25 = i17;
                long j12 = jArr[i20];
                int i26 = i21 - ((int) (j12 >> 32));
                int i27 = i22 - ((int) j12);
                long[] jArr2 = jArr;
                jArr2[i20] = (((long) i22) & 4294967295L) | (((long) i21) << 32);
                jArr2[i20 + 1] = (((long) i23) << 32) | (((long) i24) & 4294967295L);
                jArr2[i16] = (((j10 >> 63) & 1) << 60) | j10;
                if (i26 == 0 && i27 == 0) {
                    return;
                }
                m32686o((AbstractC8494b.m32689b() & j10) | (((long) ((i20 + 3) & i25)) << 25), i26, i27);
                return;
            }
            i20 += 3;
            i17 = i17;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m32682k(int i10) {
        int i11 = i10 & 33554431;
        long[] jArr = this.f28354a;
        int i12 = this.f28356c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            if ((((int) jArr[i14]) & 33554431) == i11) {
                jArr[i13] = -1;
                jArr[i13 + 1] = -1;
                jArr[i14] = AbstractC8494b.m32690c();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m32683l(int i10, int i11, long[] jArr) {
        int iMax = Math.max(i10 * 2, i11 + 3);
        this.f28354a = Arrays.copyOf(jArr, iMax);
        this.f28355b = Arrays.copyOf(this.f28355b, iMax);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m32684m(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 & 33554431;
        long[] jArr = this.f28354a;
        int i16 = this.f28356c;
        for (int i17 = 0; i17 < jArr.length - 2 && i17 < i16; i17 += 3) {
            int i18 = i17 + 2;
            long j10 = jArr[i18];
            if ((((int) j10) & 33554431) == i15) {
                jArr[i17] = (((long) i11) << 32) | (((long) i12) & 4294967295L);
                jArr[i17 + 1] = (((long) i13) << 32) | (((long) i14) & 4294967295L);
                jArr[i18] = (((j10 >> 63) & 1) << 60) | j10;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m32685n(int i10, boolean z10, boolean z11) {
        int i11 = i10 & 33554431;
        long[] jArr = this.f28354a;
        int i12 = this.f28356c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            long j10 = jArr[i14];
            if ((((int) j10) & 33554431) == i11) {
                jArr[i14] = ((z10 ? 1L : 0L) * FieldInfo.BACKR_REFERENCE) | ((-6917529027641081857L) & j10) | ((z11 ? 1L : 0L) * FieldInfo.RECORD);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m32686o(long j10, int i10, int i11) {
        int i12;
        char c10;
        char c11;
        long[] jArr = this.f28354a;
        long[] jArr2 = this.f28355b;
        m32675c();
        jArr2[0] = j10;
        int i13 = 1;
        while (i13 > 0) {
            i13--;
            long j11 = jArr2[i13];
            int i14 = 33554431;
            int i15 = ((int) j11) & 33554431;
            char c12 = 25;
            int i16 = ((int) (j11 >> 25)) & 33554431;
            char c13 = '2';
            int i17 = ((int) (j11 >> 50)) & 1023;
            int i18 = i17 == 1023 ? this.f28356c : (i17 * 3) + i16;
            if (i16 < 0) {
                return;
            }
            while (i16 < jArr.length - 2 && i16 < i18) {
                int i19 = i16 + 2;
                long j12 = jArr[i19];
                if ((((int) (j12 >> c12)) & i14) == i15) {
                    long j13 = jArr[i16];
                    int i20 = i16 + 1;
                    i12 = i14;
                    c10 = c12;
                    long j14 = jArr[i20];
                    c11 = c13;
                    jArr[i16] = (((long) (((int) j13) + i11)) & 4294967295L) | (((long) (((int) (j13 >> 32)) + i10)) << 32);
                    jArr[i20] = (((long) (((int) j14) + i11)) & 4294967295L) | (((long) (((int) (j14 >> 32)) + i10)) << 32);
                    jArr[i19] = (((j12 >> 63) & 1) << 60) | j12;
                    if ((((int) (j12 >> c11)) & 1023) > 0) {
                        jArr2[i13] = (AbstractC8494b.m32689b() & j12) | (((long) ((i16 + 3) & i12)) << c10);
                        i13++;
                    }
                } else {
                    i12 = i14;
                    c10 = c12;
                    c11 = c13;
                }
                i16 += 3;
                i14 = i12;
                c12 = c10;
                c13 = c11;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m32687p(int i10, InterfaceC0190r interfaceC0190r) {
        int i11 = i10 & 33554431;
        long[] jArr = this.f28354a;
        int i12 = this.f28356c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 33554431) == i11) {
                long j10 = jArr[i13];
                long j11 = jArr[i13 + 1];
                interfaceC0190r.mo284p(Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) j10), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                return true;
            }
        }
        return false;
    }
}
