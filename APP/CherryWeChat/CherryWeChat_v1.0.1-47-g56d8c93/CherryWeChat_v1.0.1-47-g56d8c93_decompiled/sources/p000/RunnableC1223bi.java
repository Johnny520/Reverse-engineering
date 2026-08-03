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

    public /* synthetic */ RunnableC1223bi(AbstractViewOnTouchListenerC1266ci abstractViewOnTouchListenerC1266ci, int i) {
        this.f4179a = i;
        this.f4180b = abstractViewOnTouchListenerC1266ci;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4179a) {
            case 0:
                ViewParent parent = this.f4180b.f4305d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC1266ci abstractViewOnTouchListenerC1266ci = this.f4180b;
                abstractViewOnTouchListenerC1266ci.m2407a();
                View view = abstractViewOnTouchListenerC1266ci.f4305d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1266ci.mo1754c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC1266ci.f4308g = true;
                    break;
                }
                break;
        }
    }
}
