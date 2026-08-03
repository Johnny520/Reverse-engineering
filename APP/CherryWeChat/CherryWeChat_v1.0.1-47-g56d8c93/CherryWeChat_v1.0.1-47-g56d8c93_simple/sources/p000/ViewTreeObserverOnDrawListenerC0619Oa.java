package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: Oa */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0619Oa implements InterfaceExecutorC0576Na, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: a */
    public final long f1979a;

    /* JADX INFO: renamed from: b */
    public Runnable f1980b;

    /* JADX INFO: renamed from: c */
    public boolean f1981c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractActivityC2148ki f1982d;

    public ViewTreeObserverOnDrawListenerC0619Oa(AbstractActivityC2148ki r5) {
        this.f1982d = r5;
        this.f1979a = SystemClock.uptimeMillis() + ((long) 10000);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r3) {
        this.f1980b = r3;
        View r32 = this.f1982d.getWindow().getDecorView();
        if (this.f1981c == true) goto L5;
        r32.postOnAnimation(new RunnableC0562N2(6, this));
        return;
    L5:
        if (AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper()) == false) goto L8;
        r32.invalidate();
        return;
    L8:
        r32.postInvalidate();
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable r0 = this.f1980b;
        if (r0 == null) goto L15;
        r0.run();
        this.f1980b = null;
        C0713Qi r02 = this.f1982d.getFullyDrawnReporter();
        Object r2 = r02.f2291a;
        monitor-enter(r2);
        boolean r03 = r02.f2292b;     // Catch: Throwable -> L11
        monitor-exit(r2);
        if (r03 == false) goto L20;
        this.f1981c = false;
        this.f1982d.getWindow().getDecorView().post(this);
        return;
    L20:
        return;
    L11:
        th = move-exception;
        throw th;
    L15:
        if (SystemClock.uptimeMillis() <= this.f1979a) goto L21;
        this.f1981c = false;
        this.f1982d.getWindow().getDecorView().post(this);
        return;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1982d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
