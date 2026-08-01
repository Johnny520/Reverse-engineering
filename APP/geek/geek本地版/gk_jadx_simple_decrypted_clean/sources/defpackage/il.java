package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class il implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl b;

    public /* synthetic */ il(jl r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        jl r0 = this.b;
        r0.a();
        View r1 = r0.d;
        if (r1.isEnabled() == true) goto L7;
        return;
    L7:
        if (r1.isLongClickable() == false) goto L10;
        return;
    L10:
        if (r0.c() == false) goto L20;
        r1.getParent().requestDisallowInterceptTouchEvent(true);
        long r4 = SystemClock.uptimeMillis();
        MotionEvent r2 = MotionEvent.obtain(r4, r4, 3, 0.0f, 0.0f, 0);
        r1.onTouchEvent(r2);
        r2.recycle();
        r0.g = true;
        return;
    L20:
        return;
    L14:
        ViewParent r02 = this.b.d.getParent();
        if (r02 == null) goto L21;
        r02.requestDisallowInterceptTouchEvent(true);
        return;
    }
}
