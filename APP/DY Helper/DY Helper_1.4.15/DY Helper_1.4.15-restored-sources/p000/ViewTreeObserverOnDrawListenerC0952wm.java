package p000;

/* JADX INFO: renamed from: wm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0952wm implements android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable, java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ε */
    public final long f11759;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Runnable f11760;

    /* JADX INFO: renamed from: η */
    public boolean f11761;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ androidx.activity.ComponentActivity f11762;

    public ViewTreeObserverOnDrawListenerC0952wm(androidx.activity.ComponentActivity r5) {
            r4 = this;
            r4.<init>()
            r4.f11762 = r5
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 + r2
            r4.f11759 = r0
            r5 = 0
            r4.f11761 = r5
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r3) {
            r2 = this;
            r2.f11760 = r3
            androidx.activity.ComponentActivity r3 = r2.f11762
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            boolean r0 = r2.f11761
            if (r0 == 0) goto L22
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r2 != r0) goto L1e
            r3.invalidate()
            return
        L1e:
            r3.postInvalidate()
            return
        L22:
            ν r0 = new ν
            r1 = 9
            r0.<init>(r1, r2)
            r3.postOnAnimation(r0)
            return
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
            r6 = this;
            java.lang.Runnable r0 = r6.f11760
            r1 = 0
            if (r0 == 0) goto L2a
            r0.run()
            r0 = 0
            r6.f11760 = r0
            androidx.activity.ComponentActivity r0 = r6.f11762
            o70 r0 = r0.f347
            java.lang.Object r2 = r0.f7968
            monitor-enter(r2)
            boolean r0 = r0.f7969     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)
            if (r0 == 0) goto L43
            r6.f11761 = r1
            androidx.activity.ComponentActivity r0 = r6.f11762
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.post(r6)
            return
        L27:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        L2a:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.f11759
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L43
            r6.f11761 = r1
            androidx.activity.ComponentActivity r0 = r6.f11762
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.post(r6)
        L43:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            androidx.activity.ComponentActivity r0 = r1.f11762
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnDrawListener(r1)
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6396(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.f11761
            if (r0 != 0) goto Le
            r0 = 1
            r1.f11761 = r0
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.addOnDrawListener(r1)
        Le:
            return
    }
}
