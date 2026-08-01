package p000;

/* JADX INFO: renamed from: g3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0308g3 implements android.view.Choreographer.FrameCallback, java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.C0345h3 f4218;

    public ChoreographerFrameCallbackC0308g3(p000.C0345h3 r1) {
            r0 = this;
            r0.<init>()
            r0.f4218 = r1
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r5) {
            r4 = this;
            h3 r0 = r4.f4218
            android.os.Handler r0 = r0.f4547
            r0.removeCallbacks(r4)
            h3 r0 = r4.f4218
            p000.C0345h3.m2344(r0)
            h3 r4 = r4.f4218
            java.lang.Object r0 = r4.f4548
            monitor-enter(r0)
            boolean r1 = r4.f4553     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L17
            monitor-exit(r0)
            return
        L17:
            r1 = 0
            r4.f4553 = r1     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r2 = r4.f4550     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r3 = r4.f4551     // Catch: java.lang.Throwable -> L39
            r4.f4550 = r3     // Catch: java.lang.Throwable -> L39
            r4.f4551 = r2     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)
            int r4 = r2.size()
        L27:
            if (r1 >= r4) goto L35
            java.lang.Object r0 = r2.get(r1)
            android.view.Choreographer$FrameCallback r0 = (android.view.Choreographer.FrameCallback) r0
            r0.doFrame(r5)
            int r1 = r1 + 1
            goto L27
        L35:
            r2.clear()
            return
        L39:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            h3 r0 = r3.f4218
            p000.C0345h3.m2344(r0)
            h3 r0 = r3.f4218
            java.lang.Object r1 = r0.f4548
            monitor-enter(r1)
            java.util.ArrayList r2 = r0.f4550     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            android.view.Choreographer r2 = r0.f4546     // Catch: java.lang.Throwable -> L1b
            r2.removeFrameCallback(r3)     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            r0.f4553 = r3     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r1)
            return
        L1f:
            monitor-exit(r1)
            throw r3
    }
}
