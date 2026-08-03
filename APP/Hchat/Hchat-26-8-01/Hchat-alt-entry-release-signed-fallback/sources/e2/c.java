package e2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements android.view.ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.q f2320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2.k f2321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.x f2322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1.t f2323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vg.c f2324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2.g f2325f;

    public c(f2.q r1, u2.k r2, vg.c r3, androidx.lifecycle.x r4, y1.t r5) {
            r0 = this;
            r0.<init>()
            r0.f2320a = r1
            r0.f2321b = r2
            r0.f2322c = r4
            r0.f2323d = r5
            vg.c r1 = new vg.c
            wf.g r3 = r3.f14326g
            e2.e r4 = e2.e.f2328g
            wf.g r3 = r3.e(r4)
            r1.<init>(r3)
            r0.f2324e = r1
            e2.g r1 = new e2.g
            int r2 = r2.a()
            ci.m0 r3 = new ci.m0
            r4 = 0
            r3.<init>(r0, r4)
            r1.<init>(r2, r3)
            r0.f2325f = r1
            return
    }

    public static final java.lang.Object a(e2.c r11, android.view.ScrollCaptureSession r12, u2.k r13, yf.c r14) {
            boolean r0 = r14 instanceof e2.a
            if (r0 == 0) goto L13
            r0 = r14
            e2.a r0 = (e2.a) r0
            int r1 = r0.f2315m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2315m = r1
            goto L18
        L13:
            e2.a r0 = new e2.a
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f2313k
            int r1 = r0.f2315m
            r2 = 1
            r3 = 2
            xf.a r4 = xf.a.f21579g
            if (r1 == 0) goto L52
            if (r1 == r2) goto L3e
            if (r1 != r3) goto L37
            int r12 = r0.f2312j
            int r13 = r0.f2311i
            u2.k r1 = r0.f2310h
            java.lang.Object r0 = r0.f2309g
            android.view.ScrollCaptureSession r0 = a1.c.j(r0)
            f8.i.I0(r14)
            goto Lb1
        L37:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
        L3c:
            r11 = 0
            return r11
        L3e:
            int r12 = r0.f2312j
            int r13 = r0.f2311i
            u2.k r1 = r0.f2310h
            java.lang.Object r2 = r0.f2309g
            android.view.ScrollCaptureSession r2 = a1.c.j(r2)
            f8.i.I0(r14)
            r14 = r13
            r13 = r1
            r1 = r12
            r12 = r2
            goto L92
        L52:
            f8.i.I0(r14)
            int r14 = r13.f13350b
            int r1 = r13.f13352d
            e2.g r5 = r11.f2325f
            r0.f2309g = r12
            r0.f2310h = r13
            r0.f2311i = r14
            r0.f2312j = r1
            r0.f2315m = r2
            int r2 = r5.f2332a
            if (r14 > r1) goto L12e
            int r6 = r1 - r14
            if (r6 > r2) goto L121
            float r7 = (float) r14
            float r8 = r5.f2333b
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            sf.n r9 = sf.n.f12433a
            if (r7 < 0) goto L7e
            float r7 = (float) r1
            float r10 = (float) r2
            float r10 = r10 + r8
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 > 0) goto L7e
            goto L8f
        L7e:
            int r6 = r6 / r3
            int r6 = r6 + r14
            int r2 = r2 / r3
            int r6 = r6 - r2
            float r2 = (float) r6
            float r2 = r2 - r8
            java.lang.Object r2 = r5.b(r2, r0)
            if (r2 != r4) goto L8b
            goto L8c
        L8b:
            r2 = r9
        L8c:
            if (r2 != r4) goto L8f
            r9 = r2
        L8f:
            if (r9 != r4) goto L92
            goto Lac
        L92:
            e2.b r2 = e2.b.f2316h
            r0.f2309g = r12
            r0.f2310h = r13
            r0.f2311i = r14
            r0.f2312j = r1
            r0.f2315m = r3
            wf.g r3 = r0.getContext()
            i0.d r3 = i0.r.s(r3)
            java.lang.Object r0 = r3.d(r2, r0)
            if (r0 != r4) goto Lad
        Lac:
            return r4
        Lad:
            r0 = r12
            r12 = r1
            r1 = r13
            r13 = r14
        Lb1:
            e2.g r14 = r11.f2325f
            float r2 = r14.f2333b
            int r2 = ig.a.X(r2)
            int r13 = r13 - r2
            int r14 = r14.f2332a
            r2 = 0
            int r13 = r9.e0.r(r13, r2, r14)
            e2.g r14 = r11.f2325f
            float r3 = r14.f2333b
            int r3 = ig.a.X(r3)
            int r12 = r12 - r3
            int r14 = r14.f2332a
            int r12 = r9.e0.r(r12, r2, r14)
            int r14 = r1.f13349a
            int r1 = r1.f13351c
            if (r13 != r12) goto Ld9
            u2.k r11 = u2.k.f13348e
            return r11
        Ld9:
            android.view.Surface r2 = a1.c.l(r0)
            android.graphics.Canvas r2 = r2.lockHardwareCanvas()
            r2.save()     // Catch: java.lang.Throwable -> L118
            float r3 = (float) r14     // Catch: java.lang.Throwable -> L118
            float r3 = -r3
            float r4 = (float) r13     // Catch: java.lang.Throwable -> L118
            float r4 = -r4
            r2.translate(r3, r4)     // Catch: java.lang.Throwable -> L118
            u2.k r3 = r11.f2321b     // Catch: java.lang.Throwable -> L118
            int r4 = r3.f13349a     // Catch: java.lang.Throwable -> L118
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L118
            float r4 = -r4
            int r3 = r3.f13350b     // Catch: java.lang.Throwable -> L118
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L118
            float r3 = -r3
            r2.translate(r4, r3)     // Catch: java.lang.Throwable -> L118
            y1.t r3 = r11.f2323d     // Catch: java.lang.Throwable -> L118
            android.view.View r3 = r3.getRootView()     // Catch: java.lang.Throwable -> L118
            r3.draw(r2)     // Catch: java.lang.Throwable -> L118
            android.view.Surface r0 = a1.c.l(r0)
            r0.unlockCanvasAndPost(r2)
            e2.g r11 = r11.f2325f
            float r11 = r11.f2333b
            int r11 = ig.a.X(r11)
            u2.k r0 = new u2.k
            int r13 = r13 + r11
            int r12 = r12 + r11
            r0.<init>(r14, r13, r1, r12)
            return r0
        L118:
            r11 = move-exception
            android.view.Surface r12 = a1.c.l(r0)
            r12.unlockCanvasAndPost(r2)
            throw r11
        L121:
            java.lang.String r11 = "Expected range ("
            java.lang.String r12 = ") to be ≤ viewportSize="
            java.lang.String r11 = p.a.j(r6, r11, r12, r2)
            j8.o.q(r11)
            goto L3c
        L12e:
            java.lang.String r11 = "Expected min="
            java.lang.String r12 = " ≤ max="
            java.lang.String r11 = p.a.j(r14, r11, r12, r1)
            j8.o.q(r11)
            goto L3c
    }

    public final void onScrollCaptureEnd(java.lang.Runnable r5) {
            r4 = this;
            qg.b1 r0 = qg.b1.f11035h
            ci.j r1 = new ci.j
            r2 = 0
            r3 = 1
            r1.<init>(r4, r5, r2, r3)
            r5 = 2
            vg.c r2 = r4.f2324e
            qg.v.q(r2, r0, r1, r5)
            return
    }

    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession r8, android.os.CancellationSignal r9, android.graphics.Rect r10, java.util.function.Consumer r11) {
            r7 = this;
            ci.e r0 = new ci.e
            r5 = 0
            r6 = 1
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = 0
            r10 = 3
            vg.c r11 = r1.f2324e
            qg.e1 r8 = qg.v.q(r11, r8, r0, r10)
            b1.f r10 = new b1.f
            r11 = 3
            r10.<init>(r9, r11)
            r8.o(r10)
            e2.d r10 = new e2.d
            r11 = 0
            r10.<init>(r8, r11)
            r9.setOnCancelListener(r10)
            return
    }

    public final void onScrollCaptureSearch(android.os.CancellationSignal r1, java.util.function.Consumer r2) {
            r0 = this;
            u2.k r1 = r0.f2321b
            android.graphics.Rect r1 = f1.c0.t(r1)
            r2.accept(r1)
            return
    }

    public final void onScrollCaptureStart(android.view.ScrollCaptureSession r1, android.os.CancellationSignal r2, java.lang.Runnable r3) {
            r0 = this;
            e2.g r1 = r0.f2325f
            r2 = 0
            r1.f2333b = r2
            androidx.lifecycle.x r1 = r0.f2322c
            java.lang.Object r1 = r1.f310h
            i0.j1 r1 = (i0.j1) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setValue(r2)
            r3.run()
            return
    }
}
