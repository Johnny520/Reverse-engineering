package l1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.c0 f7736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f1.j f7737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f1.n f7738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u2.m f7742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.d f7744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f1.h f7745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f1.g f7746k;

    public c(l1.d r3, f1.c0 r4) {
            r2 = this;
            r2.<init>()
            r2.f7736a = r4
            int r4 = f1.w.f3132h
            long r0 = f1.w.f3131g
            r2.f7739d = r0
            r0 = 0
            r2.f7740e = r0
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.f7741f = r0
            u2.m r4 = u2.m.f13354g
            r2.f7742g = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.f7743h = r4
            r2.f7744i = r3
            f1.h r3 = f1.c0.f()
            r2.f7745j = r3
            return
    }

    public final void a(x1.h0 r24, f1.n r25, long r26, long r28, float r30, int r31) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            r4 = r28
            h1.b r6 = r1.f20932g
            f1.c0 r7 = r0.f7736a
            boolean r8 = r7 instanceof f1.j0
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L1c
            f1.j0 r7 = (f1.j0) r7
            f1.j r7 = r7.f3071f
            r0.f7737b = r7
            r0.f7740e = r10
            goto L40
        L1c:
            boolean r8 = r7 instanceof f1.l0
            if (r8 == 0) goto L38
            f1.l0 r7 = (f1.l0) r7
            e1.d r8 = r7.f3074f
            boolean r12 = be.h.D(r8)
            if (r12 == 0) goto L31
            r0.f7737b = r9
            long r7 = r8.f2304e
            r0.f7740e = r7
            goto L40
        L31:
            f1.j r7 = r7.f3075g
            r0.f7737b = r7
            r0.f7740e = r10
            goto L40
        L38:
            boolean r7 = r7 instanceof f1.k0
            if (r7 == 0) goto L1ce
            r0.f7737b = r9
            r0.f7740e = r10
        L40:
            if (r25 == 0) goto L46
            r4 = r6
            r6 = r25
            goto L67
        L46:
            r7 = 16
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 == 0) goto L65
            f1.n r7 = r0.f7738c
            if (r7 == 0) goto L58
            long r10 = r0.f7739d
            boolean r8 = f1.w.c(r10, r4)
            if (r8 != 0) goto L62
        L58:
            f1.n r7 = new f1.n
            r8 = 5
            r7.<init>(r4, r8)
            r0.f7739d = r4
            r0.f7738c = r7
        L62:
            r4 = r6
            r6 = r7
            goto L67
        L65:
            r4 = r6
            r6 = r9
        L67:
            long r7 = r0.f7741f
            r10 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 != 0) goto L73
            goto L94
        L73:
            boolean r5 = e1.e.a(r7, r2)
            if (r5 == 0) goto L94
            u2.m r5 = r0.f7742g
            u2.m r7 = r1.getLayoutDirection()
            if (r5 != r7) goto L94
            float r5 = r0.f7743h
            float r7 = r4.d()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L94
            r25 = 32
            r28 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L1a1
        L94:
            long r7 = r0.f7740e
            f1.j r5 = r0.f7737b
            l1.d r13 = r0.f7744i
            float r14 = r13.f7747a
            float r14 = r1.x0(r14)
            float r13 = r13.f7748b
            float r13 = r1.x0(r13)
            r15 = 1
            r9 = 11
            r25 = 32
            f1.h r10 = r0.f7745j
            r17 = 0
            r28 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 2
            if (r5 == 0) goto L12f
            float r7 = (float) r11
            float r8 = r14 * r7
            float r7 = r7 * r13
            float r7 = r7 + r8
            long r11 = r2 >> r25
            int r8 = (int) r11
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 + r7
            long r11 = r2 & r28
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r11 = r11 + r7
            double r7 = (double) r8
            double r7 = java.lang.Math.ceil(r7)
            float r7 = (float) r7
            int r7 = (int) r7
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            float r8 = (float) r11
            int r8 = (int) r8
            f1.g r7 = f1.c0.e(r7, r8, r15)
            f1.b r8 = f1.c0.a(r7)
            int r11 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r11 <= 0) goto L118
            float r11 = r14 + r13
            r8.m(r11, r11)
            int r11 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r11 <= 0) goto Lf7
            android.graphics.BlurMaskFilter r12 = new android.graphics.BlurMaskFilter
            android.graphics.BlurMaskFilter$Blur r15 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r12.<init>(r14, r15)
            goto Lf8
        Lf7:
            r12 = 0
        Lf8:
            r9.e0.v(r10, r12, r9)
            r8.j(r5, r10)
            if (r11 <= 0) goto L108
            android.graphics.BlurMaskFilter r9 = new android.graphics.BlurMaskFilter
            android.graphics.BlurMaskFilter$Blur r11 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r9.<init>(r14, r11)
            goto L109
        L108:
            r9 = 0
        L109:
            r11 = 3
            r9.e0.v(r10, r9, r11)
            r9 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 * r9
            r10.C(r13)
            r8.j(r5, r10)
            goto L191
        L118:
            int r11 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r11 <= 0) goto L124
            android.graphics.BlurMaskFilter r11 = new android.graphics.BlurMaskFilter
            android.graphics.BlurMaskFilter$Blur r12 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r11.<init>(r14, r12)
            goto L125
        L124:
            r11 = 0
        L125:
            r9.e0.v(r10, r11, r9)
            r8.m(r14, r14)
            r8.j(r5, r10)
            goto L191
        L12f:
            float r5 = (float) r11
            float r11 = r14 * r5
            float r13 = r13 * r5
            float r13 = r13 + r11
            long r11 = r2 >> r25
            int r5 = (int) r11
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 + r13
            long r11 = r2 & r28
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r11 = r11 + r13
            double r12 = (double) r5
            double r12 = java.lang.Math.ceil(r12)
            float r12 = (float) r12
            int r12 = (int) r12
            r13 = r10
            double r9 = (double) r11
            double r9 = java.lang.Math.ceil(r9)
            float r9 = (float) r9
            int r9 = (int) r9
            f1.g r9 = f1.c0.e(r12, r9, r15)
            f1.b r10 = f1.c0.a(r9)
            float r5 = r5 - r14
            float r19 = r11 - r14
            long r11 = r7 >> r25
            int r11 = (int) r11
            float r20 = java.lang.Float.intBitsToFloat(r11)
            long r7 = r7 & r28
            int r7 = (int) r7
            float r21 = java.lang.Float.intBitsToFloat(r7)
            int r7 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r7 <= 0) goto L17a
            android.graphics.BlurMaskFilter r7 = new android.graphics.BlurMaskFilter
            android.graphics.BlurMaskFilter$Blur r8 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r7.<init>(r14, r8)
        L177:
            r8 = 11
            goto L17c
        L17a:
            r7 = 0
            goto L177
        L17c:
            r9.e0.v(r13, r7, r8)
            android.graphics.Canvas r15 = r10.f3025a
            java.lang.Object r7 = r13.f3058i
            r22 = r7
            android.graphics.Paint r22 = (android.graphics.Paint) r22
            r17 = r14
            r18 = r5
            r16 = r14
            r15.drawRoundRect(r16, r17, r18, r19, r20, r21, r22)
            r7 = r9
        L191:
            r0.f7746k = r7
            r0.f7741f = r2
            u2.m r2 = r1.getLayoutDirection()
            r0.f7742g = r2
            float r2 = r4.d()
            r0.f7743h = r2
        L1a1:
            f1.g r2 = r0.f7746k
            if (r2 == 0) goto L1cd
            l1.d r3 = r0.f7744i
            float r4 = r3.f7747a
            float r4 = r1.x0(r4)
            float r3 = r3.f7748b
            float r3 = r1.x0(r3)
            float r3 = r3 + r4
            float r3 = -r3
            int r4 = java.lang.Float.floatToRawIntBits(r3)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r7 = (long) r3
            long r3 = r4 << r25
            long r7 = r7 & r28
            long r3 = r3 | r7
            r8 = 8
            r5 = r30
            r7 = r31
            h1.d.U(r1, r2, r3, r5, r6, r7, r8)
        L1cd:
            return
        L1ce:
            okio.a.k()
            return
    }
}
