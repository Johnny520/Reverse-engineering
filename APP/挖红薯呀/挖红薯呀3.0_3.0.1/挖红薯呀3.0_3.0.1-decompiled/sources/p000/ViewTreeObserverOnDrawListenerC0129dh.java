package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: renamed from: dh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0129dh implements InterfaceExecutorC0092ch, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: d */
    public final long f1104d = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: e */
    public Runnable f1105e;

    /* JADX INFO: renamed from: f */
    public boolean f1106f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MainActivity f1107g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnDrawListenerC0129dh(MainActivity mainActivity) {
        this.f1107g = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m696a(View view) {
        if (this.f1106f) {
            return;
        }
        this.f1106f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f1105e = runnable;
        View decorView = this.f1107g.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f1106f) {
            decorView.postOnAnimation(new RunnableC0912x3(2, this));
        } else if (p30.m3002l(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f1105e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1104d) {
                this.f1106f = false;
                this.f1107g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1105e = null;
        C0261gw fullyDrawnReporter = this.f1107g.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f2079a) {
            z = fullyDrawnReporter.f2080b;
        }
        if (z) {
            this.f1106f = false;
            this.f1107g.getWindow().getDecorView().post(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f1107g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
