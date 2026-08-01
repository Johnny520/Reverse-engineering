package p069i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: i.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0722v0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2445a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC0724w0 f2446b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0722v0(AbstractViewOnTouchListenerC0724w0 abstractViewOnTouchListenerC0724w0, int i2) {
        this.f2445a = i2;
        this.f2446b = abstractViewOnTouchListenerC0724w0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2445a) {
            case 0:
                ViewParent parent = this.f2446b.f2452e.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC0724w0 abstractViewOnTouchListenerC0724w0 = this.f2446b;
                abstractViewOnTouchListenerC0724w0.m1375a();
                View view = abstractViewOnTouchListenerC0724w0.f2452e;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0724w0.mo1172c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0724w0.f2455h = true;
                    break;
                }
                break;
        }
    }
}
