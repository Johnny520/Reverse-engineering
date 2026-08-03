package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ac.o f185h;

    public /* synthetic */ m(ac.o r1, int r2) {
            r0 = this;
            r0.f184g = r2
            r0.f185h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f184g
            switch(r0) {
                case 0: goto L43;
                default: goto L5;
            }
        L5:
            ac.o r0 = r3.f185h
            monitor-enter(r0)
            java.util.HashMap r1 = r0.f196f     // Catch: java.lang.Throwable -> L25
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L25
            r2 = 1
            r0.f197g = r2     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r2 = r0.f196f     // Catch: java.lang.Throwable -> L3e
            r2.notify()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L25
            boolean r1 = f8.i.g0(r0)     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L27
            int r1 = r0.f213w     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L27
            f8.i.f0(r0)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r1 = move-exception
            goto L41
        L27:
            ac.k r1 = r0.f198h     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L34
            ac.k r1 = new ac.k     // Catch: java.lang.Throwable -> L25
            int r2 = ac.o.A     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            r0.f198h = r1     // Catch: java.lang.Throwable -> L25
        L34:
            int r1 = r0.f194d     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L3c
            r1 = 12
            r0.f194d = r1     // Catch: java.lang.Throwable -> L25
        L3c:
            monitor-exit(r0)
            return
        L3e:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
            throw r2     // Catch: java.lang.Throwable -> L25
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
        L43:
            ac.o r0 = r3.f185h
            f8.i.T0(r0)
            return
    }
}
