package p000;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1166o;
import java.util.ArrayList;

/* JADX INFO: renamed from: Rl */
/* JADX INFO: loaded from: classes.dex */
public final class C0758Rl implements InterfaceC2560tv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0973Wl f2407a;

    public C0758Rl(C0973Wl c0973Wl) {
        this.f2407a = c0973Wl;
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: a */
    public final void mo1552a(MotionEvent motionEvent) {
        C0973Wl c0973Wl = this.f2407a;
        RunnableC0431K0 runnableC0431K0 = c0973Wl.f3046r;
        c0973Wl.f3051w.f3928a.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c0973Wl.f3047s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c0973Wl.f3040l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c0973Wl.f3040l);
        if (iFindPointerIndex >= 0) {
            c0973Wl.m1852f(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC1166o abstractC1166o = c0973Wl.f3031c;
        if (abstractC1166o == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c0973Wl.m1860o(c0973Wl.f3043o, iFindPointerIndex, motionEvent);
                    c0973Wl.m1857l(abstractC1166o);
                    c0973Wl.f3045q.removeCallbacks(runnableC0431K0);
                    runnableC0431K0.run();
                    c0973Wl.f3045q.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c0973Wl.f3040l) {
                    c0973Wl.f3040l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c0973Wl.m1860o(c0973Wl.f3043o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c0973Wl.f3047s;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c0973Wl.m1859n(null, 0);
        c0973Wl.f3040l = -1;
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: b */
    public final boolean mo1553b(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C0973Wl c0973Wl = this.f2407a;
        c0973Wl.f3051w.f3928a.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C0801Sl c0801Sl = null;
        if (actionMasked == 0) {
            c0973Wl.f3040l = motionEvent.getPointerId(0);
            c0973Wl.f3032d = motionEvent.getX();
            c0973Wl.f3033e = motionEvent.getY();
            VelocityTracker velocityTracker = c0973Wl.f3047s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c0973Wl.f3047s = VelocityTracker.obtain();
            if (c0973Wl.f3031c == null) {
                ArrayList arrayList = c0973Wl.f3044p;
                if (!arrayList.isEmpty()) {
                    View viewM1855i = c0973Wl.m1855i(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C0801Sl c0801Sl2 = (C0801Sl) arrayList.get(size);
                        if (c0801Sl2.f2512e.itemView == viewM1855i) {
                            c0801Sl = c0801Sl2;
                            break;
                        }
                        size--;
                    }
                }
                if (c0801Sl != null) {
                    AbstractC1166o abstractC1166o = c0801Sl.f2512e;
                    c0973Wl.f3032d -= c0801Sl.f2516i;
                    c0973Wl.f3033e -= c0801Sl.f2517j;
                    c0973Wl.m1854h(abstractC1166o, true);
                    if (c0973Wl.f3029a.remove(abstractC1166o.itemView)) {
                        c0973Wl.f3041m.mo1531a(c0973Wl.f3045q, abstractC1166o);
                    }
                    c0973Wl.m1859n(abstractC1166o, c0801Sl.f2513f);
                    c0973Wl.m1860o(c0973Wl.f3043o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c0973Wl.f3040l = -1;
            c0973Wl.m1859n(null, 0);
        } else {
            int i = c0973Wl.f3040l;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c0973Wl.m1852f(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c0973Wl.f3047s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c0973Wl.f3031c != null;
    }

    @Override // p000.InterfaceC2560tv
    /* JADX INFO: renamed from: c */
    public final void mo1554c(boolean z) {
        if (z) {
            this.f2407a.m1859n(null, 0);
        }
    }
}
