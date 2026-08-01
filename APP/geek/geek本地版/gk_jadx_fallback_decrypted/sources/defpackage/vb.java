package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vb implements java.util.concurrent.Executor, android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable {
    public final long a;
    public java.lang.Runnable b;
    public boolean c;
    public final /* synthetic */ androidx.activity.ComponentActivity d;

    public vb(androidx.activity.ComponentActivity r5) {
            r4 = this;
            r4.<init>()
            r4.d = r5
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 + r2
            r4.a = r0
            r5 = 0
            r4.c = r5
            return
    }

    public final void a(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto Le
            r0 = 1
            r1.c = r0
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            r2.addOnDrawListener(r1)
        Le:
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r3) {
            r2 = this;
            r2.b = r3
            androidx.activity.ComponentActivity r3 = r2.d
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            boolean r0 = r2.c
            if (r0 == 0) goto L22
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L1e
            r3.invalidate()
            return
        L1e:
            r3.postInvalidate()
            return
        L22:
            p1 r0 = new p1
            r1 = 4
            r0.<init>(r1, r2)
            r3.postOnAnimation(r0)
            return
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
            r6 = this;
            java.lang.Runnable r0 = r6.b
            r1 = 0
            if (r0 == 0) goto L2a
            r0.run()
            r0 = 0
            r6.b = r0
            androidx.activity.ComponentActivity r0 = r6.d
            gm r0 = r0.i
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            boolean r0 = r0.a     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)
            if (r0 == 0) goto L43
            r6.c = r1
            androidx.activity.ComponentActivity r0 = r6.d
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.post(r6)
            return
        L27:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L2a:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L43
            r6.c = r1
            androidx.activity.ComponentActivity r0 = r6.d
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.post(r6)
        L43:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            androidx.activity.ComponentActivity r0 = r1.d
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnDrawListener(r1)
            return
    }
}
