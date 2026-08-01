package p135b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import p010B3.AbstractActivityC0224c;
import p028F.RunnableC0346g;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: b.i */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC1821i implements InterfaceExecutorC1820h, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: d */
    public final long f6216d = SystemClock.uptimeMillis() + ((long) 10000);

    /* JADX INFO: renamed from: e */
    public Runnable f6217e;

    /* JADX INFO: renamed from: f */
    public boolean f6218f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractActivityC0224c f6219g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnDrawListenerC1821i(AbstractActivityC0224c abstractActivityC0224c) {
        this.f6219g = abstractActivityC0224c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3290a(View view) {
        if (this.f6218f) {
            return;
        }
        this.f6218f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1665j.m2985e(runnable, "runnable");
        this.f6217e = runnable;
        View decorView = this.f6219g.getWindow().getDecorView();
        AbstractC1665j.m2984d(decorView, "getDecorView(...)");
        if (!this.f6218f) {
            decorView.postOnAnimation(new RunnableC0346g(5, this));
        } else if (AbstractC1665j.m2981a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z5;
        Runnable runnable = this.f6217e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f6216d) {
                this.f6218f = false;
                this.f6219g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f6217e = null;
        C1832t fullyDrawnReporter = this.f6219g.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f6226a) {
            z5 = fullyDrawnReporter.f6227b;
        }
        if (z5) {
            this.f6218f = false;
            this.f6219g.getWindow().getDecorView().post(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f6219g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
