package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2467 implements InterfaceC2532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2473 f7356;

    public C2467(C2473 c2473) {
        this.f7356 = c2473;
    }

    @Override // androidx.recyclerview.widget.InterfaceC2532
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo4860(boolean z) {
        if (z) {
            this.f7356.m4874(null, 0);
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC2532
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo4861(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C2473 c2473 = this.f7356;
        c2473.f7400.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C2466 c2466 = null;
        if (actionMasked == 0) {
            c2473.f7412 = motionEvent.getPointerId(0);
            c2473.f7393 = motionEvent.getX();
            c2473.f7392 = motionEvent.getY();
            VelocityTracker velocityTracker = c2473.f7397;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c2473.f7397 = VelocityTracker.obtain();
            if (c2473.f7394 == null) {
                ArrayList arrayList = c2473.f7408;
                if (!arrayList.isEmpty()) {
                    View viewM4873 = c2473.m4873(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C2466 c24662 = (C2466) arrayList.get(size);
                        if (c24662.f7341.itemView == viewM4873) {
                            c2466 = c24662;
                            break;
                        }
                        size--;
                    }
                }
                if (c2466 != null) {
                    AbstractC2484 abstractC2484 = c2466.f7341;
                    c2473.f7393 -= c2466.f7354;
                    c2473.f7392 -= c2466.f7355;
                    c2473.m4880(abstractC2484, true);
                    if (c2473.f7396.remove(abstractC2484.itemView)) {
                        c2473.f7404.getClass();
                        AbstractC2464.m4857(abstractC2484);
                    }
                    c2473.m4874(abstractC2484, c2466.f7340);
                    c2473.m4875(c2473.f7407, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c2473.f7412 = -1;
            c2473.m4874(null, 0);
        } else {
            int i = c2473.f7412;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c2473.m4882(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c2473.f7397;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c2473.f7394 != null;
    }

    @Override // androidx.recyclerview.widget.InterfaceC2532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4862(MotionEvent motionEvent) {
        C2473 c2473 = this.f7356;
        RunnableC2504 runnableC2504 = c2473.f7398;
        c2473.f7400.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c2473.f7397;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c2473.f7412 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c2473.f7412);
        if (iFindPointerIndex >= 0) {
            c2473.m4882(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC2484 abstractC2484 = c2473.f7394;
        if (abstractC2484 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c2473.m4875(c2473.f7407, iFindPointerIndex, motionEvent);
                    c2473.m4876(abstractC2484);
                    c2473.f7406.removeCallbacks(runnableC2504);
                    runnableC2504.run();
                    c2473.f7406.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c2473.f7412) {
                    c2473.f7412 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c2473.m4875(c2473.f7407, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c2473.f7397;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c2473.m4874(null, 0);
        c2473.f7412 = -1;
    }
}
