package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends m1.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1.c f8548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f8549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1.a f8551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gg.m f8552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.j1 f8553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f1.n f8554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.j1 f8555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f8557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f8558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1.d0 f8559m;

    public e0(m1.c r3) {
            r2 = this;
            r2.<init>()
            r2.f8548b = r3
            m1.d0 r0 = new m1.d0
            r1 = 0
            r0.<init>(r2, r1)
            r3.f8513i = r0
            java.lang.String r3 = ""
            r2.f8549c = r3
            r3 = 1
            r2.f8550d = r3
            m1.a r3 = new m1.a
            r3.<init>()
            r2.f8551e = r3
            m1.g r3 = m1.g.f8575i
            r2.f8552f = r3
            r3 = 0
            i0.j1 r3 = i0.r.u(r3)
            r2.f8553g = r3
            e1.e r3 = new e1.e
            r0 = 0
            r3.<init>(r0)
            i0.j1 r3 = i0.r.u(r3)
            r2.f8555i = r3
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.f8556j = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f8557k = r3
            r2.f8558l = r3
            m1.d0 r3 = new m1.d0
            r0 = 1
            r3.<init>(r2, r0)
            r2.f8559m = r3
            return
    }

    @Override // m1.c0
    public final void a(h1.d r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r2.e(r3, r0, r1)
            return
    }

    public final void e(h1.d r32, float r33, f1.n r34) {
            r31 = this;
            r0 = r31
            r1 = r34
            m1.c r2 = r0.f8548b
            boolean r3 = r2.f8508d
            r4 = 5
            i0.j1 r5 = r0.f8553g
            r6 = 1
            if (r3 == 0) goto L3d
            long r8 = r2.f8509e
            r10 = 16
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r5.getValue()
            f1.n r3 = (f1.n) r3
            int r8 = m1.h0.f8607a
            boolean r8 = r3 instanceof f1.n
            r9 = 3
            if (r8 == 0) goto L2b
            int r3 = r3.f3079c
            if (r3 != r4) goto L28
            goto L2d
        L28:
            if (r3 != r9) goto L3d
            goto L2d
        L2b:
            if (r3 != 0) goto L3d
        L2d:
            boolean r3 = r1 instanceof f1.n
            if (r3 == 0) goto L39
            int r3 = r1.f3079c
            if (r3 != r4) goto L36
            goto L3b
        L36:
            if (r3 != r9) goto L3d
            goto L3b
        L39:
            if (r1 != 0) goto L3d
        L3b:
            r3 = r6
            goto L3e
        L3d:
            r3 = 0
        L3e:
            boolean r8 = r0.f8550d
            m1.a r9 = r0.f8551e
            if (r8 != 0) goto L5e
            long r10 = r0.f8556j
            long r12 = r32.a()
            boolean r8 = e1.e.a(r10, r12)
            if (r8 == 0) goto L5e
            f1.g r8 = r9.f8496a
            if (r8 == 0) goto L59
            int r8 = r8.a()
            goto L5a
        L59:
            r8 = 0
        L5a:
            if (r3 != r8) goto L5e
            goto L175
        L5e:
            if (r3 != r6) goto L79
            long r10 = r2.f8509e
            int r2 = m1.h0.f8607a
            float r2 = f1.w.d(r10)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L6f
            goto L73
        L6f:
            long r10 = f1.w.b(r10, r6)
        L73:
            f1.n r2 = new f1.n
            r2.<init>(r10, r4)
            goto L7a
        L79:
            r2 = 0
        L7a:
            r0.f8554h = r2
            long r10 = r32.a()
            r2 = 32
            long r10 = r10 >> r2
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            i0.j1 r6 = r0.f8555i
            java.lang.Object r8 = r6.getValue()
            e1.e r8 = (e1.e) r8
            long r10 = r8.f2308a
            long r10 = r10 >> r2
            int r8 = (int) r10
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r4 = r4 / r8
            r0.f8557k = r4
            long r10 = r32.a()
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Object r6 = r6.getValue()
            e1.e r6 = (e1.e) r6
            long r10 = r6.f2308a
            long r10 = r10 & r12
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r4 = r4 / r6
            r0.f8558l = r4
            long r10 = r32.a()
            long r10 = r10 >> r2
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            double r10 = (double) r4
            double r10 = java.lang.Math.ceil(r10)
            float r4 = (float) r10
            int r4 = (int) r4
            long r10 = r32.a()
            long r10 = r10 & r12
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            float r6 = (float) r10
            int r6 = (int) r6
            long r10 = (long) r4
            long r10 = r10 << r2
            long r14 = (long) r6
            long r14 = r14 & r12
            long r10 = r10 | r14
            u2.m r4 = r32.getLayoutDirection()
            f1.g r6 = r9.f8496a
            f1.b r8 = r9.f8497b
            if (r6 == 0) goto L10b
            if (r8 == 0) goto L10b
            long r14 = r10 >> r2
            int r14 = (int) r14
            android.graphics.Bitmap r15 = r6.f3055a
            r16 = r2
            int r2 = r15.getWidth()
            r17 = r12
            if (r14 > r2) goto L10f
            long r12 = r10 & r17
            int r2 = (int) r12
            int r12 = r15.getHeight()
            if (r2 > r12) goto L10f
            int r2 = r9.f8499d
            if (r2 != r3) goto L10f
            goto L123
        L10b:
            r16 = r2
            r17 = r12
        L10f:
            long r12 = r10 >> r16
            int r2 = (int) r12
            long r12 = r10 & r17
            int r6 = (int) r12
            f1.g r6 = f1.c0.e(r2, r6, r3)
            f1.b r8 = f1.c0.a(r6)
            r9.f8496a = r6
            r9.f8497b = r8
            r9.f8499d = r3
        L123:
            r9.f8498c = r10
            h1.b r12 = r9.f8500e
            long r2 = r9.e0.q0(r10)
            h1.a r10 = r12.f5037g
            u2.c r11 = r10.f5033a
            u2.m r13 = r10.f5034b
            f1.u r14 = r10.f5035c
            r20 = r8
            long r7 = r10.f5036d
            r15 = r32
            r10.f5033a = r15
            r10.f5034b = r4
            r4 = r20
            r10.f5035c = r4
            r10.f5036d = r2
            r4.e()
            r2 = r13
            r3 = r14
            long r13 = f1.w.f3126b
            r18 = 0
            r19 = 62
            r15 = 0
            r17 = 0
            h1.d.Z(r12, r13, r15, r17, r18, r19)
            m1.d0 r10 = r0.f8559m
            r10.invoke(r12)
            r4.p()
            h1.a r4 = r12.f5037g
            r4.f5033a = r11
            r4.f5034b = r2
            r4.f5035c = r3
            r4.f5036d = r7
            android.graphics.Bitmap r2 = r6.f3055a
            r2.prepareToDraw()
            r2 = 0
            r0.f8550d = r2
            long r2 = r32.a()
            r0.f8556j = r2
        L175:
            if (r1 == 0) goto L17a
        L177:
            r28 = r1
            goto L18c
        L17a:
            java.lang.Object r1 = r5.getValue()
            f1.n r1 = (f1.n) r1
            if (r1 == 0) goto L189
            java.lang.Object r1 = r5.getValue()
            f1.n r1 = (f1.n) r1
            goto L177
        L189:
            f1.n r1 = r0.f8554h
            goto L177
        L18c:
            f1.g r1 = r9.f8496a
            if (r1 == 0) goto L191
            goto L196
        L191:
            java.lang.String r2 = "drawCachedImage must be invoked first before attempting to draw the result into another destination"
            u1.a.b(r2)
        L196:
            long r2 = r9.f8498c
            r29 = 0
            r30 = 858(0x35a, float:1.202E-42)
            r25 = 0
            r21 = r32
            r27 = r33
            r22 = r1
            r23 = r2
            h1.d.U0(r21, r22, r23, r25, r27, r28, r29, r30)
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Params: \tname: "
            r0.<init>(r1)
            java.lang.String r1 = r5.f8549c
            r0.append(r1)
            java.lang.String r1 = "\n\tviewportWidth: "
            r0.append(r1)
            i0.j1 r1 = r5.f8555i
            java.lang.Object r2 = r1.getValue()
            e1.e r2 = (e1.e) r2
            long r2 = r2.f2308a
            r4 = 32
            long r2 = r2 >> r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r0.append(r2)
            java.lang.String r2 = "\n\tviewportHeight: "
            r0.append(r2)
            java.lang.Object r1 = r1.getValue()
            e1.e r1 = (e1.e) r1
            long r1 = r1.f2308a
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
