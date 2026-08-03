package p057g;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import p055f.ViewOnTouchListenerC0770a;

/* JADX INFO: renamed from: g.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0899e0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewOnTouchListenerC0770a f3182b;

    public /* synthetic */ RunnableC0899e0(ViewOnTouchListenerC0770a r1, int r2) {
        this.f3181a = r2;
        this.f3182b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f3181a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        ViewOnTouchListenerC0770a r02 = this.f3182b;
        r02.m1971a();
        View r1 = r02.f2735d;
        if (r1.isEnabled() == true) goto L7;
        return;
    L7:
        if (r1.isLongClickable() == false) goto L10;
        return;
    L10:
        if (r02.m1973c() == false) goto L20;
        r1.getParent().requestDisallowInterceptTouchEvent(true);
        long r6 = SystemClock.uptimeMillis();
        MotionEvent r2 = MotionEvent.obtain(r6, r6, 3, 0.0f, 0.0f, 0);
        r1.onTouchEvent(r2);
        r2.recycle();
        r02.f2738g = true;
        return;
    L20:
        return;
    L14:
        ViewParent r03 = this.f3182b.f2735d.getParent();
        if (r03 == null) goto L21;
        r03.requestDisallowInterceptTouchEvent(true);
        return;
    }
}
