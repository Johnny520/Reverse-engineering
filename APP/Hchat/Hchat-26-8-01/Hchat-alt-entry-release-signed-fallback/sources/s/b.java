package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s.a1, android.view.View.OnAttachStateChangeListener, java.lang.Runnable, android.view.Choreographer.FrameCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static long f11972n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.view.View f11973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.PriorityQueue f11974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final android.view.Choreographer f11976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s.a f11977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11979m;

    public b(android.view.View r5) {
            r4 = this;
            r4.<init>()
            r4.f11973g = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            b8.c r1 = new b8.c
            r2 = 9
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.f11974h = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f11976j = r0
            s.a r0 = new s.a
            r0.<init>()
            r4.f11977k = r0
            long r0 = s.b.f11972n
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4b
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L41
            if (r0 == 0) goto L41
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L41
            goto L43
        L41:
            r0 = 1114636288(0x42700000, float:60.0)
        L43:
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r1 = (float) r1
            float r1 = r1 / r0
            long r0 = (long) r1
            s.b.f11972n = r0
        L4b:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L57
            r5 = 1
            r4.f11978l = r5
        L57:
            return
    }

    @Override // s.a1
    public final void a(s.z0 r3) {
            r2 = this;
            s.d1 r0 = new s.d1
            r1 = 1
            r0.<init>(r1, r3)
            java.util.PriorityQueue r3 = r2.f11974h
            r3.add(r0)
            boolean r3 = r2.f11975i
            if (r3 != 0) goto L16
            r2.f11975i = r1
            android.view.View r3 = r2.f11973g
            r3.post(r2)
        L16:
            return
    }

    public final boolean b() {
            r5 = this;
            s.a r0 = r5.f11977k
            long r1 = r0.a()
            java.lang.String r3 = "compose:lazy:prefetch:available_time_nanos"
            f8.i.K0(r1, r3)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            if (r1 <= 0) goto L2d
            java.util.PriorityQueue r1 = r5.f11974h
            java.lang.Object r3 = r1.peek()
            r3.getClass()
            s.d1 r3 = (s.d1) r3
            s.z0 r3 = r3.f12000b
            boolean r3 = r3.c(r0)
            r4 = 0
            if (r3 == 0) goto L27
            goto L2b
        L27:
            r1.poll()
            r2 = r4
        L2b:
            r0.f11965a = r4
        L2d:
            return r2
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r2) {
            r1 = this;
            boolean r0 = r1.f11978l
            if (r0 == 0) goto Lb
            r1.f11979m = r2
            android.view.View r2 = r1.f11973g
            r2.post(r1)
        Lb:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            r1 = 1
            r0.f11978l = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.f11978l = r1
            android.view.View r1 = r0.f11973g
            r1.removeCallbacks(r0)
            android.view.Choreographer r1 = r0.f11976j
            r1.removeFrameCallback(r0)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            java.util.PriorityQueue r0 = r11.f11974h
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto L7a
            boolean r1 = r11.f11975i
            if (r1 == 0) goto L7a
            boolean r1 = r11.f11978l
            if (r1 == 0) goto L7a
            android.view.View r1 = r11.f11973g
            int r3 = r1.getWindowVisibility()
            if (r3 == 0) goto L1a
            goto L7a
        L1a:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r1.getDrawingTime()
            long r3 = r3.toNanos(r4)
            long r5 = java.lang.System.nanoTime()
            r1 = 2
            long r7 = (long) r1
            long r9 = s.b.f11972n
            long r7 = r7 * r9
            long r7 = r7 + r3
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L34
            r1 = 1
            goto L35
        L34:
            r1 = r2
        L35:
            s.a r5 = r11.f11977k
            r5.f11965a = r1
            long r6 = r11.f11979m
            long r3 = java.lang.Math.max(r6, r3)
            long r6 = s.b.f11972n
            long r3 = r3 + r6
            r5.f11966b = r3
            r1 = r2
        L45:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L68
            if (r1 != 0) goto L68
            boolean r1 = r5.f11965a
            if (r1 == 0) goto L63
            java.lang.String r1 = "compose:lazy:prefetch:idle_frame"
            android.os.Trace.beginSection(r1)
            boolean r1 = r11.b()     // Catch: java.lang.Throwable -> L5e
            android.os.Trace.endSection()
            goto L45
        L5e:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L63:
            boolean r1 = r11.b()
            goto L45
        L68:
            if (r1 == 0) goto L70
            android.view.Choreographer r0 = r11.f11976j
            r0.postFrameCallback(r11)
            goto L72
        L70:
            r11.f11975i = r2
        L72:
            java.lang.String r0 = "compose:lazy:prefetch:available_time_nanos"
            r1 = 0
            f8.i.K0(r1, r0)
            return
        L7a:
            r11.f11975i = r2
            return
    }
}
