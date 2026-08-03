package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: Oa */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0619Oa implements InterfaceExecutorC0576Na, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: a */
    public final long f1979a = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: b */
    public Runnable f1980b;

    /* JADX INFO: renamed from: c */
    public boolean f1981c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractActivityC2148ki f1982d;

    public ViewTreeObserverOnDrawListenerC0619Oa(AbstractActivityC2148ki abstractActivityC2148ki) {
        this.f1982d = abstractActivityC2148ki;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1980b = runnable;
        View decorView = this.f1982d.getWindow().getDecorView();
        if (!this.f1981c) {
            decorView.postOnAnimation(new RunnableC0562N2(6, this));
        } else if (AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f1980b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1979a) {
                this.f1981c = false;
                this.f1982d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1980b = null;
        C0713Qi fullyDrawnReporter = this.f1982d.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f2291a) {
            z = fullyDrawnReporter.f2292b;
        }
        if (z) {
            this.f1981c = false;
            this.f1982d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1982d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
