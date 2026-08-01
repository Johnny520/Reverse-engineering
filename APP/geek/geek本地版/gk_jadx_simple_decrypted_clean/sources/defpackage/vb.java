package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vb implements Executor, ViewTreeObserver.OnDrawListener, Runnable {
    public final long a;
    public Runnable b;
    public boolean c;
    public final /* synthetic */ ComponentActivity d;

    public vb(ComponentActivity r5) {
        this.d = r5;
        this.a = SystemClock.uptimeMillis() + 10000;
        this.c = false;
    }

    public final void a(View r2) {
        if (this.c == true) goto L6;
        this.c = true;
        r2.getViewTreeObserver().addOnDrawListener(this);
        return;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r3) {
        this.b = r3;
        View r32 = this.d.getWindow().getDecorView();
        if (this.c == true) goto L5;
        r32.postOnAnimation(new p1(4, this));
        return;
    L5:
        if (Looper.myLooper() != Looper.getMainLooper()) goto L8;
        r32.invalidate();
        return;
    L8:
        r32.postInvalidate();
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable r0 = this.b;
        if (r0 == null) goto L15;
        r0.run();
        this.b = null;
        gm r02 = this.d.i;
        Object r2 = r02.b;
        monitor-enter(r2);
        boolean r03 = r02.a;     // Catch: Throwable -> L11
        monitor-exit(r2);
        if (r03 == false) goto L20;
        this.c = false;
        this.d.getWindow().getDecorView().post(this);
        return;
    L20:
        return;
    L11:
        th = move-exception;
        throw th;
    L15:
        if (SystemClock.uptimeMillis() <= this.a) goto L21;
        this.c = false;
        this.d.getWindow().getDecorView().post(this);
        return;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
