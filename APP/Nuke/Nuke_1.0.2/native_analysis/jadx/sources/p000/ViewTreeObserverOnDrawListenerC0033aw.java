package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: aw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0033aw implements InterfaceExecutorC0976zv, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: h */
    public final long f412h = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: i */
    public Runnable f413i;

    /* JADX INFO: renamed from: j */
    public boolean f414j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractActivityC0144dw f415k;

    public ViewTreeObserverOnDrawListenerC0033aw(AbstractActivityC0144dw abstractActivityC0144dw) {
        this.f415k = abstractActivityC0144dw;
    }

    /* JADX INFO: renamed from: a */
    public final void m297a(View view) {
        if (this.f414j) {
            return;
        }
        this.f414j = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f413i = runnable;
        View decorView = this.f415k.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f414j) {
            decorView.postOnAnimation(new RunnableC0446m2(5, this));
        } else if (t11.m5086l(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f413i;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f412h) {
                this.f414j = false;
                this.f415k.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f413i = null;
        vm0 fullyDrawnReporter = this.f415k.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f12015a) {
            z = fullyDrawnReporter.f12016b;
        }
        if (z) {
            this.f414j = false;
            this.f415k.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f415k.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
