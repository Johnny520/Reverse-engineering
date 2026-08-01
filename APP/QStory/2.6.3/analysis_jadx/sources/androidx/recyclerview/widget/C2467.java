package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2467 implements InterfaceC2532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2473 f7357;

    public C2467(C2473 c2473) {
        this.f7357 = c2473;
    }

    @Override // androidx.recyclerview.widget.InterfaceC2532
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo4870(boolean z) {
        if (z) {
            this.f7357.m4884(null, 0);
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC2532
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo4871(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C2473 c2473 = this.f7357;
        c2473.f7401.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C2466 c2466 = null;
        if (actionMasked == 0) {
            c2473.f7413 = motionEvent.getPointerId(0);
            c2473.f7394 = motionEvent.getX();
            c2473.f7393 = motionEvent.getY();
            VelocityTracker velocityTracker = c2473.f7398;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c2473.f7398 = VelocityTracker.obtain();
            if (c2473.f7395 == null) {
                ArrayList arrayList = c2473.f7409;
                if (!arrayList.isEmpty()) {
                    View viewM4883 = c2473.m4883(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C2466 c24662 = (C2466) arrayList.get(size);
                        if (c24662.f7342.itemView == viewM4883) {
                            c2466 = c24662;
                            break;
                        }
                        size--;
                    }
                }
                if (c2466 != null) {
                    AbstractC2484 abstractC2484 = c2466.f7342;
                    c2473.f7394 -= c2466.f7355;
                    c2473.f7393 -= c2466.f7356;
                    c2473.m4890(abstractC2484, true);
                    if (c2473.f7397.remove(abstractC2484.itemView)) {
                        c2473.f7405.getClass();
                        AbstractC2464.m4867(abstractC2484);
                    }
                    c2473.m4884(abstractC2484, c2466.f7341);
                    c2473.m4885(c2473.f7408, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c2473.f7413 = -1;
            c2473.m4884(null, 0);
        } else {
            int i = c2473.f7413;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c2473.m4892(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c2473.f7398;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c2473.f7395 != null;
    }

    @Override // androidx.recyclerview.widget.InterfaceC2532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4872(MotionEvent motionEvent) {
        C2473 c2473 = this.f7357;
        RunnableC2504 runnableC2504 = c2473.f7399;
        c2473.f7401.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c2473.f7398;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c2473.f7413 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c2473.f7413);
        if (iFindPointerIndex >= 0) {
            c2473.m4892(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC2484 abstractC2484 = c2473.f7395;
        if (abstractC2484 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c2473.m4885(c2473.f7408, iFindPointerIndex, motionEvent);
                    c2473.m4886(abstractC2484);
                    c2473.f7407.removeCallbacks(runnableC2504);
                    runnableC2504.run();
                    c2473.f7407.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c2473.f7413) {
                    c2473.f7413 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c2473.m4885(c2473.f7408, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c2473.f7398;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c2473.m4884(null, 0);
        c2473.f7413 = -1;
    }
}
