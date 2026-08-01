package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0048 implements InterfaceExecutorC0057, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ComponentActivity f98;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Runnable f99;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f100;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f101 = SystemClock.uptimeMillis() + 10000;

    public ViewTreeObserverOnDrawListenerC0048(ComponentActivity componentActivity) {
        this.f98 = componentActivity;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f99 = runnable;
        View decorView = this.f98.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f100) {
            decorView.postOnAnimation(new RunnableC0049(this, 0));
        } else if (AbstractC4395.m8907(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        ComponentActivity componentActivity = this.f98;
        Runnable runnable = this.f99;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f101) {
                this.f100 = false;
                componentActivity.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f99 = null;
        C0024 fullyDrawnReporter = componentActivity.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f55) {
            z = fullyDrawnReporter.f52;
        }
        if (z) {
            this.f100 = false;
            componentActivity.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f98.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m134(View view) {
        if (this.f100) {
            return;
        }
        this.f100 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }
}
