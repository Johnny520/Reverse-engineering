package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: bi */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1223bi implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4179a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC1266ci f4180b;

    public /* synthetic */ RunnableC1223bi(AbstractViewOnTouchListenerC1266ci r1, int r2) {
        this.f4179a = r2;
        this.f4180b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f4179a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        AbstractViewOnTouchListenerC1266ci r0 = this.f4180b;
        r0.m2407a();
        View r1 = r0.f4305d;
        if (r1.isEnabled() == true) goto L7;
        return;
    L7:
        if (r1.isLongClickable() == false) goto L10;
        return;
    L10:
        if (r0.mo1754c() == false) goto L20;
        r1.getParent().requestDisallowInterceptTouchEvent(true);
        long r4 = SystemClock.uptimeMillis();
        MotionEvent r2 = MotionEvent.obtain(r4, r4, 3, 0.0f, 0.0f, 0);
        r1.onTouchEvent(r2);
        r2.recycle();
        r0.f4308g = true;
        return;
    L20:
        return;
    L14:
        ViewParent r02 = this.f4180b.f4305d.getParent();
        if (r02 == null) goto L21;
        r02.requestDisallowInterceptTouchEvent(true);
        return;
    }
}
