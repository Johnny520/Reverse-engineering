package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1.t f21975h;

    public /* synthetic */ j(y1.t r1, int r2) {
            r0 = this;
            r0.f21974g = r2
            r0.f21975h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f21974g
            switch(r0) {
                case 0: goto L35;
                case 1: goto L19;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            y1.t r0 = r4.f21975h
            x1.f0 r0 = r0.getRoot()
            y1.t.p(r0)
            return
        Lf:
            y1.t r0 = r4.f21975h
            x1.f0 r0 = r0.getRoot()
            y1.t.p(r0)
            return
        L19:
            r0 = 0
            y1.t r1 = r4.f21975h
            r1.K0 = r0
            android.view.MotionEvent r0 = r1.C0
            r0.getClass()
            int r2 = r0.getActionMasked()
            r3 = 10
            if (r2 != r3) goto L2f
            r1.K(r0)
            goto L34
        L2f:
            java.lang.String r0 = "The ACTION_HOVER_EXIT event was not cleared."
            j8.o.A(r0)
        L34:
            return
        L35:
            y1.t r0 = r4.f21975h
            tf.k r0 = r0.f22097o
            java.lang.String r1 = "AndroidOwner:outOfFrameExecutor"
            android.os.Trace.beginSection(r1)
        L3e:
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L50
            java.lang.Object r1 = r0.removeLast()     // Catch: java.lang.Throwable -> L4e
            fg.a r1 = (fg.a) r1     // Catch: java.lang.Throwable -> L4e
            r1.invoke()     // Catch: java.lang.Throwable -> L4e
            goto L3e
        L4e:
            r0 = move-exception
            goto L54
        L50:
            android.os.Trace.endSection()
            return
        L54:
            android.os.Trace.endSection()
            throw r0
    }
}
