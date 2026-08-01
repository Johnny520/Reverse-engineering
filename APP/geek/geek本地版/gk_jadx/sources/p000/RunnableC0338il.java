package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: il */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0338il implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2437a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC0378jl f2438b;

    public /* synthetic */ RunnableC0338il(AbstractViewOnTouchListenerC0378jl abstractViewOnTouchListenerC0378jl, int i) {
        this.f2437a = i;
        this.f2438b = abstractViewOnTouchListenerC0378jl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2437a) {
            case Base64.DEFAULT /* 0 */:
                ViewParent parent = this.f2438b.f2642d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC0378jl abstractViewOnTouchListenerC0378jl = this.f2438b;
                abstractViewOnTouchListenerC0378jl.m1604a();
                View view = abstractViewOnTouchListenerC0378jl.f2642d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0378jl.mo864c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0378jl.f2645g = true;
                    break;
                }
                break;
        }
    }
}
