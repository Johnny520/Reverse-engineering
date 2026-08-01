package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0176 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC0164 f690;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f691;

    public /* synthetic */ RunnableC0176(AbstractViewOnTouchListenerC0164 abstractViewOnTouchListenerC0164, int i) {
        this.f691 = i;
        this.f690 = abstractViewOnTouchListenerC0164;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f691;
        AbstractViewOnTouchListenerC0164 abstractViewOnTouchListenerC0164 = this.f690;
        switch (i) {
            case 0:
                ViewParent parent = abstractViewOnTouchListenerC0164.f649.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                abstractViewOnTouchListenerC0164.m620();
                View view = abstractViewOnTouchListenerC0164.f649;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0164.mo526()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0164.f653 = true;
                    break;
                }
                break;
        }
    }
}
