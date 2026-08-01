package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: u5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0791u5 {

    /* JADX INFO: renamed from: a */
    public int f6134a;

    /* JADX INFO: renamed from: b */
    public Object f6135b;

    /* JADX INFO: renamed from: c */
    public Object f6136c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed A[LOOP:1: B:28:0x00cb->B:34:0x00ed, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0791u5(z20 z20Var, u50 u50Var) {
        Object c0097cm;
        C0791u5 c0791u5Mo3023l = u50Var.mo3023l();
        int i = z20Var.f7248d;
        if (i < 0) {
            z10.m5363c("negative nearestRange.first");
        }
        int iMin = Math.min(z20Var.f7249e, c0791u5Mo3023l.f6134a - 1);
        if (iMin < i) {
            ch0 ch0Var = jk0.f2910a;
            ch0Var.getClass();
            this.f6135b = ch0Var;
            this.f6136c = new Object[0];
            this.f6134a = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.f6136c = new Object[i2];
        this.f6134a = i;
        ch0 ch0Var2 = new ch0(i2);
        sh0 sh0Var = (sh0) c0791u5Mo3023l.f6135b;
        if (i < 0 || i >= c0791u5Mo3023l.f6134a) {
            z10.m5364d("Index " + i + ", size " + c0791u5Mo3023l.f6134a);
        }
        if (iMin < 0 || iMin >= c0791u5Mo3023l.f6134a) {
            z10.m5364d("Index " + iMin + ", size " + c0791u5Mo3023l.f6134a);
        }
        if (iMin < i) {
            z10.m5361a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iM2997g = p30.m2997g(i, sh0Var);
        int i3 = ((k30) sh0Var.f5768d[iM2997g]).f3000a;
        while (i3 <= iMin) {
            k30 k30Var = (k30) sh0Var.f5768d[iM2997g];
            InterfaceC0742sw key = k30Var.f3002c.getKey();
            int i4 = k30Var.f3000a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (k30Var.f3001b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key == null) {
                        c0097cm = new C0097cm(iMax);
                        ch0Var2.m537g(iMax, c0097cm);
                        ((Object[]) this.f6136c)[iMax - this.f6134a] = c0097cm;
                        iMax = iMax == iMin2 ? iMax + 1 : iMax;
                    } else {
                        c0097cm = key.invoke(Integer.valueOf(iMax - i4));
                        if (c0097cm == null) {
                        }
                        ch0Var2.m537g(iMax, c0097cm);
                        ((Object[]) this.f6136c)[iMax - this.f6134a] = c0097cm;
                        if (iMax == iMin2) {
                            break;
                        }
                    }
                }
            }
            i3 += k30Var.f3001b;
            iM2997g++;
        }
        this.f6135b = ch0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m4250a(int i, h70 h70Var) {
        if (i < 0) {
            z10.m5361a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        k30 k30Var = new k30(this.f6134a, i, h70Var);
        this.f6134a += i;
        ((sh0) this.f6135b).m4072b(k30Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public k30 m4251b(int i) {
        if (i < 0 || i >= this.f6134a) {
            z10.m5364d("Index " + i + ", size " + this.f6134a);
        }
        k30 k30Var = (k30) this.f6136c;
        if (k30Var != null) {
            int i2 = k30Var.f3000a;
            if (i < k30Var.f3001b + i2 && i2 <= i) {
                return k30Var;
            }
        }
        sh0 sh0Var = (sh0) this.f6135b;
        k30 k30Var2 = (k30) sh0Var.f5768d[p30.m2997g(i, sh0Var)];
        this.f6136c = k30Var2;
        return k30Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public int m4252c(Object obj) {
        ch0 ch0Var = (ch0) this.f6135b;
        int iM534d = ch0Var.m534d(obj);
        if (iM534d >= 0) {
            return ch0Var.f812c[iM534d];
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m4253d(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.f6135b;
        int i8 = this.f6134a;
        int i9 = i8 + 3;
        this.f6134a = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.f6135b = Arrays.copyOf(jArr, iMax);
            this.f6136c = Arrays.copyOf((long[]) this.f6136c, iMax);
        }
        long[] jArr2 = (long[]) this.f6135b;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                int i13 = (i8 - i11) / 3;
                int i14 = tt0.f6043b;
                jArr2[i12] = (((long) Math.min(i13, 1023)) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m4254f(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f6135b;
        int i3 = this.f6134a;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m4255g(long j, int i, int i2) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.f6135b;
        long[] jArr2 = (long[]) this.f6136c;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.f6134a : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        int i12 = tt0.f6043b;
                        jArr2[i4] = ((-1125899873288193L) & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m4256h(int i, InterfaceC0978yw interfaceC0978yw) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f6135b;
        int i3 = this.f6134a;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                interfaceC0978yw.mo259b(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public C0791u5() {
        this.f6135b = new sh0(new k30[16]);
    }
}
