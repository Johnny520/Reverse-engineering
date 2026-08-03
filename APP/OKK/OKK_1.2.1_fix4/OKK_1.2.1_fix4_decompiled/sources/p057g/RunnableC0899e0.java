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

    public /* synthetic */ RunnableC0899e0(ViewOnTouchListenerC0770a viewOnTouchListenerC0770a, int i2) {
        this.f3181a = i2;
        this.f3182b = viewOnTouchListenerC0770a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3181a) {
            case 0:
                ViewParent parent = this.f3182b.f2735d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                ViewOnTouchListenerC0770a viewOnTouchListenerC0770a = this.f3182b;
                viewOnTouchListenerC0770a.m1971a();
                View view = viewOnTouchListenerC0770a.f2735d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0770a.m1973c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    viewOnTouchListenerC0770a.f2738g = true;
                    break;
                }
                break;
        }
    }
}
