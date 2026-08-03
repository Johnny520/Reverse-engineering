package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements android.view.Choreographer.FrameCallback, java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y1.n0 f21997g;

    public m0(y1.n0 r1) {
            r0 = this;
            r0.<init>()
            r0.f21997g = r1
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r6) {
            r5 = this;
            y1.n0 r0 = r5.f21997g
            android.os.Handler r0 = r0.f22007j
            r0.removeCallbacks(r5)
            y1.n0 r0 = r5.f21997g
            y1.n0.z(r0)
            y1.n0 r0 = r5.f21997g
            java.lang.Object r1 = r0.f22008k
            monitor-enter(r1)
            boolean r2 = r0.f22013p     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L17
            monitor-exit(r1)
            return
        L17:
            r2 = 0
            r0.f22013p = r2     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r3 = r0.f22010m     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r4 = r0.f22011n     // Catch: java.lang.Throwable -> L39
            r0.f22010m = r4     // Catch: java.lang.Throwable -> L39
            r0.f22011n = r3     // Catch: java.lang.Throwable -> L39
            monitor-exit(r1)
            int r0 = r3.size()
        L27:
            if (r2 >= r0) goto L35
            java.lang.Object r1 = r3.get(r2)
            android.view.Choreographer$FrameCallback r1 = (android.view.Choreographer.FrameCallback) r1
            r1.doFrame(r6)
            int r2 = r2 + 1
            goto L27
        L35:
            r3.clear()
            return
        L39:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            y1.n0 r0 = r3.f21997g
            y1.n0.z(r0)
            y1.n0 r0 = r3.f21997g
            java.lang.Object r1 = r0.f22008k
            monitor-enter(r1)
            java.util.ArrayList r2 = r0.f22010m     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            android.view.Choreographer r2 = r0.f22006i     // Catch: java.lang.Throwable -> L1b
            r2.removeFrameCallback(r3)     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            r0.f22013p = r2     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L1f
        L1d:
            monitor-exit(r1)
            return
        L1f:
            monitor-exit(r1)
            throw r0
    }
}
