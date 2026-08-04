package yyds;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: yyds.ᛲᲈᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0487 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2403;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC0067 f2404;

    public /* synthetic */ RunnableC0487(AbstractViewOnTouchListenerC0067 abstractViewOnTouchListenerC0067, int i) {
        this.f2403 = i;
        this.f2404 = abstractViewOnTouchListenerC0067;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2403;
        AbstractViewOnTouchListenerC0067 abstractViewOnTouchListenerC0067 = this.f2404;
        switch (i) {
            case 0:
                ViewParent parent = abstractViewOnTouchListenerC0067.f606.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                abstractViewOnTouchListenerC0067.m437();
                View view = abstractViewOnTouchListenerC0067.f606;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0067.mo439()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0067.f600 = true;
                    break;
                }
                break;
        }
    }
}
