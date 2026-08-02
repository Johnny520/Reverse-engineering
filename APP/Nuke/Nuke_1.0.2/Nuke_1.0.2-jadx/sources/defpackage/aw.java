package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class aw implements zv, ViewTreeObserver.OnDrawListener, Runnable {
    public final long h = SystemClock.uptimeMillis() + 10000;
    public Runnable i;
    public boolean j;
    public final /* synthetic */ dw k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public aw(dw dwVar) {
        this.k = dwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(View view) {
        if (this.j) {
            return;
        }
        this.j = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.i = runnable;
        View decorView = this.k.getWindow().getDecorView();
        decorView.getClass();
        if (!this.j) {
            decorView.postOnAnimation(new m2(5, this));
        } else if (t11.l(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.i;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.h) {
                this.j = false;
                this.k.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.i = null;
        vm0 fullyDrawnReporter = this.k.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.a) {
            z = fullyDrawnReporter.b;
        }
        if (z) {
            this.j = false;
            this.k.getWindow().getDecorView().post(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.k.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
