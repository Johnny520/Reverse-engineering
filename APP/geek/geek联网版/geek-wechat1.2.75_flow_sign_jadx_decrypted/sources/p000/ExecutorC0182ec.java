package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ec */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0182ec implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: b */
    public Runnable f1570b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ComponentActivity f1572d;

    /* JADX INFO: renamed from: a */
    public final long f1569a = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: c */
    public boolean f1571c = false;

    public ExecutorC0182ec(ComponentActivity componentActivity) {
        this.f1572d = componentActivity;
    }

    /* JADX INFO: renamed from: a */
    public final void m985a(View view) {
        if (this.f1571c) {
            return;
        }
        this.f1571c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1570b = runnable;
        View decorView = this.f1572d.getWindow().getDecorView();
        if (!this.f1571c) {
            decorView.postOnAnimation(new RunnableC0884x8(3, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f1570b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1569a) {
                this.f1571c = false;
                this.f1572d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1570b = null;
        C0339im c0339im = this.f1572d.f128i;
        synchronized (c0339im.f2554b) {
            z = c0339im.f2553a;
        }
        if (z) {
            this.f1571c = false;
            this.f1572d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1572d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
