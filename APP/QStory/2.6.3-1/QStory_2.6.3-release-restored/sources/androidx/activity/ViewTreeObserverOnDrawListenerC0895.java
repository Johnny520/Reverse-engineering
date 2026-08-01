package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0895 implements InterfaceExecutorC0904, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ComponentActivity f443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Runnable f444;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f445;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f446 = SystemClock.uptimeMillis() + 10000;

    public ViewTreeObserverOnDrawListenerC0895(ComponentActivity componentActivity) {
        this.f443 = componentActivity;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f444 = runnable;
        View decorView = this.f443.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f445) {
            decorView.postOnAnimation(new RunnableC0896(this, 0));
        } else if (AbstractC5227.m9466(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        ComponentActivity componentActivity = this.f443;
        Runnable runnable = this.f444;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f446) {
                this.f445 = false;
                componentActivity.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f444 = null;
        C0871 fullyDrawnReporter = componentActivity.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f400) {
            z = fullyDrawnReporter.f397;
        }
        if (z) {
            this.f445 = false;
            componentActivity.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f443.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m694(View view) {
        if (this.f445) {
            return;
        }
        this.f445 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }
}
