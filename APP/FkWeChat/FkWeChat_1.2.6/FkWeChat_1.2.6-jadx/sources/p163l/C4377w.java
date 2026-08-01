package p163l;

import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: l.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4377w {

    /* JADX INFO: renamed from: a */
    public final a[][] f12804a;

    /* JADX INFO: renamed from: b */
    public final boolean f12805b = true;

    /* JADX INFO: renamed from: l.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final float f12806a;

        /* JADX INFO: renamed from: b */
        public final float f12807b;

        /* JADX INFO: renamed from: c */
        public final float f12808c;

        /* JADX INFO: renamed from: d */
        public final float f12809d;

        /* JADX INFO: renamed from: e */
        public final float f12810e;

        /* JADX INFO: renamed from: f */
        public final float f12811f;

        /* JADX INFO: renamed from: g */
        public float f12812g;

        /* JADX INFO: renamed from: h */
        public float f12813h;

        /* JADX INFO: renamed from: i */
        public float f12814i;

        /* JADX INFO: renamed from: j */
        public final float[] f12815j;

        /* JADX INFO: renamed from: k */
        public final float f12816k;

        /* JADX INFO: renamed from: l */
        public final float f12817l;

        /* JADX INFO: renamed from: m */
        public final float f12818m;

        /* JADX INFO: renamed from: n */
        public final float f12819n;

        /* JADX INFO: renamed from: o */
        public final float f12820o;

        /* JADX INFO: renamed from: p */
        public final boolean f12821p;

        /* JADX INFO: renamed from: q */
        public final float f12822q;

        /* JADX INFO: renamed from: r */
        public final float f12823r;

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f12806a = f10;
            this.f12807b = f11;
            this.f12808c = f12;
            this.f12809d = f13;
            this.f12810e = f14;
            this.f12811f = f15;
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            boolean z10 = true;
            boolean z11 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
            float f18 = z11 ? -1.0f : 1.0f;
            this.f12818m = f18;
            float f19 = 1 / (f11 - f10);
            this.f12816k = f19;
            this.f12815j = new float[101];
            boolean z12 = i10 == 3;
            if (z12 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
                float fHypot = (float) Math.hypot(f17, f16);
                this.f12812g = fHypot;
                this.f12817l = fHypot * f19;
                this.f12822q = f16 * f19;
                this.f12823r = f17 * f19;
                this.f12819n = Float.NaN;
                this.f12820o = Float.NaN;
            } else {
                this.f12819n = f16 * f18;
                this.f12820o = f17 * (-f18);
                this.f12822q = z11 ? f14 : f12;
                this.f12823r = z11 ? f13 : f15;
                m17141c(f12, f13, f14, f15);
                this.f12817l = this.f12812g * f19;
                z10 = z12;
            }
            this.f12821p = z10;
        }

        /* JADX INFO: renamed from: c */
        public final void m17141c(float f10, float f11, float f12, float f13) {
            float f14;
            float f15;
            float fHypot;
            float f16 = f12 - f10;
            float f17 = f11 - f13;
            float[] fArr = AbstractC4382x.f12830a;
            int length = fArr.length - 1;
            float f18 = length;
            float[] fArr2 = this.f12815j;
            if (1 <= length) {
                float f19 = f17;
                int i10 = 1;
                fHypot = 0.0f;
                float f20 = 0.0f;
                while (true) {
                    f15 = 0.0f;
                    double radians = (float) Math.toRadians((((double) i10) * 90.0d) / ((double) length));
                    float fSin = ((float) Math.sin(radians)) * f16;
                    float fCos = ((float) Math.cos(radians)) * f17;
                    f14 = f18;
                    fHypot += (float) Math.hypot(fSin - f20, fCos - f19);
                    fArr[i10] = fHypot;
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    f19 = fCos;
                    f18 = f14;
                    f20 = fSin;
                }
            } else {
                f14 = f18;
                f15 = 0.0f;
                fHypot = 0.0f;
            }
            this.f12812g = fHypot;
            if (1 <= length) {
                int i11 = 1;
                while (true) {
                    fArr[i11] = fArr[i11] / fHypot;
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i12 = 0; i12 < length2; i12++) {
                float f21 = i12 / 100.0f;
                int iM20654f = AbstractC5102r.m20654f(fArr, f21, 0, 0, 6, null);
                if (iM20654f >= 0) {
                    fArr2[i12] = iM20654f / f14;
                } else if (iM20654f == -1) {
                    fArr2[i12] = f15;
                } else {
                    int i13 = -iM20654f;
                    int i14 = i13 - 2;
                    float f22 = i14;
                    float f23 = fArr[i14];
                    fArr2[i12] = (f22 + ((f21 - f23) / (fArr[i13 - 1] - f23))) / f14;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final float m17142d() {
            float f10 = this.f12819n * this.f12814i;
            return f10 * this.f12818m * (this.f12817l / ((float) Math.hypot(f10, (-this.f12820o) * this.f12813h)));
        }

        /* JADX INFO: renamed from: e */
        public final float m17143e() {
            float f10 = this.f12819n * this.f12814i;
            float f11 = (-this.f12820o) * this.f12813h;
            return f11 * this.f12818m * (this.f12817l / ((float) Math.hypot(f10, f11)));
        }

        /* JADX INFO: renamed from: f */
        public final float m17144f(float f10) {
            float f11 = (f10 - this.f12806a) * this.f12816k;
            float f12 = this.f12808c;
            return f12 + (f11 * (this.f12810e - f12));
        }

        /* JADX INFO: renamed from: g */
        public final float m17145g(float f10) {
            float f11 = (f10 - this.f12806a) * this.f12816k;
            float f12 = this.f12809d;
            return f12 + (f11 * (this.f12811f - f12));
        }

        /* JADX INFO: renamed from: h */
        public final float m17146h() {
            return this.f12806a;
        }

        /* JADX INFO: renamed from: i */
        public final float m17147i() {
            return this.f12807b;
        }

        /* JADX INFO: renamed from: j */
        public final float m17148j(float f10) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            float f11 = f10 * 100;
            int i10 = (int) f11;
            float f12 = f11 - i10;
            float[] fArr = this.f12815j;
            float f13 = fArr[i10];
            return f13 + (f12 * (fArr[i10 + 1] - f13));
        }

        /* JADX INFO: renamed from: k */
        public final void m17149k(float f10) {
            double dM17148j = m17148j((this.f12818m == -1.0f ? this.f12807b - f10 : f10 - this.f12806a) * this.f12816k) * 1.5707964f;
            this.f12813h = (float) Math.sin(dM17148j);
            this.f12814i = (float) Math.cos(dM17148j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[PHI: r10
  0x0028: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4377w(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r0.<init>()
            r2 = 1
            r0.f12805b = r2
            int r3 = r1.length
            int r3 = r3 - r2
            l.w$a[][] r4 = new p163l.C4377w.a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L69
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L28
            if (r9 == r2) goto L31
            if (r9 == r11) goto L2f
            if (r9 == r10) goto L2a
            r10 = 4
            if (r9 == r10) goto L28
            r10 = 5
            if (r9 == r10) goto L28
            r13 = r8
            goto L33
        L28:
            r13 = r10
            goto L33
        L2a:
            if (r7 != r2) goto L31
            goto L2f
        L2d:
            r13 = r7
            goto L33
        L2f:
            r7 = r11
            goto L2d
        L31:
            r7 = r2
            goto L2d
        L33:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r2 = r8.length
            int r2 = r2 % r11
            int r2 = r2 + r12
            l.w$a[] r11 = new p163l.C4377w.a[r2]
            r12 = r5
        L45:
            if (r12 >= r2) goto L63
            int r16 = r12 * 2
            r17 = r12
            l.w$a r12 = new l.w$a
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L45
        L63:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r2 = 1
            goto L12
        L69:
            r0.f12804a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163l.C4377w.<init>(int[], float[], float[][]):void");
    }

    /* JADX INFO: renamed from: a */
    public final void m17137a(float f10, float[] fArr) {
        a[][] aVarArr = this.f12804a;
        int length = aVarArr.length - 1;
        int i10 = 0;
        float fM17146h = aVarArr[0][0].m17146h();
        float fM17147i = aVarArr[length][0].m17147i();
        int length2 = fArr.length;
        if (!this.f12805b) {
            f10 = Math.min(Math.max(f10, fM17146h), fM17147i);
        } else if (f10 < fM17146h || f10 > fM17147i) {
            if (f10 > fM17147i) {
                fM17146h = fM17147i;
            } else {
                length = 0;
            }
            float f11 = f10 - fM17146h;
            int i11 = 0;
            while (i10 < length2 - 1) {
                a aVar = aVarArr[length][i11];
                if (aVar.f12821p) {
                    fArr[i10] = aVar.m17144f(fM17146h) + (aVar.f12822q * f11);
                    fArr[i10 + 1] = aVar.m17145g(fM17146h) + (aVar.f12823r * f11);
                } else {
                    aVar.m17149k(fM17146h);
                    fArr[i10] = aVar.f12822q + (aVar.f12819n * aVar.f12813h) + (aVar.m17142d() * f11);
                    fArr[i10 + 1] = aVar.f12823r + (aVar.f12820o * aVar.f12814i) + (aVar.m17143e() * f11);
                }
                i10 += 2;
                i11++;
            }
            return;
        }
        boolean z10 = false;
        for (a[] aVarArr2 : aVarArr) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < length2 - 1) {
                a aVar2 = aVarArr2[i13];
                if (f10 <= aVar2.m17147i()) {
                    if (aVar2.f12821p) {
                        fArr[i12] = aVar2.m17144f(f10);
                        fArr[i12 + 1] = aVar2.m17145g(f10);
                    } else {
                        aVar2.m17149k(f10);
                        fArr[i12] = aVar2.f12822q + (aVar2.f12819n * aVar2.f12813h);
                        fArr[i12 + 1] = aVar2.f12823r + (aVar2.f12820o * aVar2.f12814i);
                    }
                    z10 = true;
                }
                i12 += 2;
                i13++;
            }
            if (z10) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17138b(float f10, float[] fArr) {
        a[][] aVarArr = this.f12804a;
        float fM17146h = aVarArr[0][0].m17146h();
        float fM17147i = aVarArr[aVarArr.length - 1][0].m17147i();
        if (f10 < fM17146h) {
            f10 = fM17146h;
        }
        if (f10 <= fM17147i) {
            fM17147i = f10;
        }
        int length = fArr.length;
        boolean z10 = false;
        for (a[] aVarArr2 : aVarArr) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < length - 1) {
                a aVar = aVarArr2[i11];
                if (fM17147i <= aVar.m17147i()) {
                    if (aVar.f12821p) {
                        fArr[i10] = aVar.f12822q;
                        fArr[i10 + 1] = aVar.f12823r;
                    } else {
                        aVar.m17149k(fM17147i);
                        fArr[i10] = aVar.m17142d();
                        fArr[i10 + 1] = aVar.m17143e();
                    }
                    z10 = true;
                }
                i10 += 2;
                i11++;
            }
            if (z10) {
                return;
            }
        }
    }
}
