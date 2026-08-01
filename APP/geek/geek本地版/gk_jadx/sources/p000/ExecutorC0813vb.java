package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: vb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0813vb implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: b */
    public Runnable f4825b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ComponentActivity f4827d;

    /* JADX INFO: renamed from: a */
    public final long f4824a = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: c */
    public boolean f4826c = false;

    public ExecutorC0813vb(ComponentActivity componentActivity) {
        this.f4827d = componentActivity;
    }

    /* JADX INFO: renamed from: a */
    public final void m2502a(View view) {
        if (this.f4826c) {
            return;
        }
        this.f4826c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4825b = runnable;
        View decorView = this.f4827d.getWindow().getDecorView();
        if (!this.f4826c) {
            decorView.postOnAnimation(new RunnableC0581p1(4, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f4825b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f4824a) {
                this.f4826c = false;
                this.f4827d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f4825b = null;
        C0266gm c0266gm = this.f4827d.f165i;
        synchronized (c0266gm.f2142b) {
            z = c0266gm.f2141a;
        }
        if (z) {
            this.f4826c = false;
            this.f4827d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4827d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
