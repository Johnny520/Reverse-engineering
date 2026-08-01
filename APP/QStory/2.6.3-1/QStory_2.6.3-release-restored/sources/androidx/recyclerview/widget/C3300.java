package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3300 implements InterfaceC3365 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3306 f7702;

    public C3300(C3306 c3306) {
        this.f7702 = c3306;
    }

    @Override // androidx.recyclerview.widget.InterfaceC3365
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo5430(boolean z) {
        if (z) {
            this.f7702.m5444(null, 0);
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC3365
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo5431(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C3306 c3306 = this.f7702;
        c3306.f7746.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C3299 c3299 = null;
        if (actionMasked == 0) {
            c3306.f7758 = motionEvent.getPointerId(0);
            c3306.f7739 = motionEvent.getX();
            c3306.f7738 = motionEvent.getY();
            VelocityTracker velocityTracker = c3306.f7743;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c3306.f7743 = VelocityTracker.obtain();
            if (c3306.f7740 == null) {
                ArrayList arrayList = c3306.f7754;
                if (!arrayList.isEmpty()) {
                    View viewM5443 = c3306.m5443(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C3299 c32992 = (C3299) arrayList.get(size);
                        if (c32992.f7687.itemView == viewM5443) {
                            c3299 = c32992;
                            break;
                        }
                        size--;
                    }
                }
                if (c3299 != null) {
                    AbstractC3317 abstractC3317 = c3299.f7687;
                    c3306.f7739 -= c3299.f7700;
                    c3306.f7738 -= c3299.f7701;
                    c3306.m5450(abstractC3317, true);
                    if (c3306.f7742.remove(abstractC3317.itemView)) {
                        c3306.f7750.getClass();
                        AbstractC3297.m5427(abstractC3317);
                    }
                    c3306.m5444(abstractC3317, c3299.f7686);
                    c3306.m5445(c3306.f7753, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c3306.f7758 = -1;
            c3306.m5444(null, 0);
        } else {
            int i = c3306.f7758;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c3306.m5452(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c3306.f7743;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c3306.f7740 != null;
    }

    @Override // androidx.recyclerview.widget.InterfaceC3365
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5432(MotionEvent motionEvent) {
        C3306 c3306 = this.f7702;
        RunnableC3337 runnableC3337 = c3306.f7744;
        c3306.f7746.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c3306.f7743;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c3306.f7758 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c3306.f7758);
        if (iFindPointerIndex >= 0) {
            c3306.m5452(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC3317 abstractC3317 = c3306.f7740;
        if (abstractC3317 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c3306.m5445(c3306.f7753, iFindPointerIndex, motionEvent);
                    c3306.m5446(abstractC3317);
                    c3306.f7752.removeCallbacks(runnableC3337);
                    runnableC3337.run();
                    c3306.f7752.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c3306.f7758) {
                    c3306.f7758 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c3306.m5445(c3306.f7753, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c3306.f7743;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c3306.m5444(null, 0);
        c3306.f7758 = -1;
    }
}
