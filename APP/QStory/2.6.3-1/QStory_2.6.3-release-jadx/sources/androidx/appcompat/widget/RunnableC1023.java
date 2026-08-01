package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1023 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC1011 f1035;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1036;

    public /* synthetic */ RunnableC1023(AbstractViewOnTouchListenerC1011 abstractViewOnTouchListenerC1011, int i) {
        this.f1036 = i;
        this.f1035 = abstractViewOnTouchListenerC1011;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1036;
        AbstractViewOnTouchListenerC1011 abstractViewOnTouchListenerC1011 = this.f1035;
        switch (i) {
            case 0:
                ViewParent parent = abstractViewOnTouchListenerC1011.f994.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                abstractViewOnTouchListenerC1011.m1180();
                View view = abstractViewOnTouchListenerC1011.f994;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1011.mo1086()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC1011.f998 = true;
                    break;
                }
                break;
        }
    }
}
