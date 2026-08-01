package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: kl */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0415kl implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC0452ll f2846b;

    public /* synthetic */ RunnableC0415kl(AbstractViewOnTouchListenerC0452ll abstractViewOnTouchListenerC0452ll, int i) {
        this.f2845a = i;
        this.f2846b = abstractViewOnTouchListenerC0452ll;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2845a) {
            case Base64.DEFAULT /* 0 */:
                ViewParent parent = this.f2846b.f3012d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC0452ll abstractViewOnTouchListenerC0452ll = this.f2846b;
                abstractViewOnTouchListenerC0452ll.m1770a();
                View view = abstractViewOnTouchListenerC0452ll.f3012d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0452ll.mo815c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0452ll.f3015g = true;
                    break;
                }
                break;
        }
    }
}
