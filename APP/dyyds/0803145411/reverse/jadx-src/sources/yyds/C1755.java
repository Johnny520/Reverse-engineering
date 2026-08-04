package yyds;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛸᛴᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1755 implements InterfaceC2310 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1877 f8827;

    public C1755(C1877 c1877) {
        this.f8827 = c1877;
    }

    @Override // yyds.InterfaceC2310
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo3487(MotionEvent motionEvent) {
        C1877 c1877 = this.f8827;
        RunnableC0871 runnableC0871 = c1877.f9462;
        c1877.f9446.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c1877.f9448;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c1877.f9459 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(c1877.f9459);
        if (iFindPointerIndex >= 0) {
            c1877.m3663(actionMasked, iFindPointerIndex, motionEvent);
        }
        AbstractC0185 abstractC0185 = c1877.f9463;
        if (abstractC0185 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    c1877.m3665(c1877.f9449, iFindPointerIndex, motionEvent);
                    c1877.m3664(abstractC0185);
                    c1877.f9450.removeCallbacks(runnableC0871);
                    runnableC0871.run();
                    c1877.f9450.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c1877.f9459) {
                    c1877.f9459 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c1877.m3665(c1877.f9449, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c1877.f9448;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c1877.m3670(null, 0);
        c1877.f9459 = -1;
    }

    @Override // yyds.InterfaceC2310
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean mo3488(MotionEvent motionEvent) {
        int iFindPointerIndex;
        C1877 c1877 = this.f8827;
        c1877.f9446.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C1472 c1472 = null;
        if (actionMasked == 0) {
            c1877.f9459 = motionEvent.getPointerId(0);
            c1877.f9466 = motionEvent.getX();
            c1877.f9445 = motionEvent.getY();
            VelocityTracker velocityTracker = c1877.f9448;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c1877.f9448 = VelocityTracker.obtain();
            if (c1877.f9463 == null) {
                ArrayList arrayList = c1877.f9464;
                if (!arrayList.isEmpty()) {
                    View viewM3668 = c1877.m3668(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C1472 c14722 = (C1472) arrayList.get(size);
                        if (c14722.f6993.f1093 == viewM3668) {
                            c1472 = c14722;
                            break;
                        }
                        size--;
                    }
                }
                if (c1472 != null) {
                    AbstractC0185 abstractC0185 = c1472.f6993;
                    c1877.f9466 -= c1472.f6992;
                    c1877.f9445 -= c1472.f7000;
                    c1877.m3667(abstractC0185, true);
                    if (c1877.f9447.remove(abstractC0185.f1093)) {
                        c1877.f9442.mo1232(c1877.f9450, abstractC0185);
                    }
                    c1877.m3670(abstractC0185, c1472.f7003);
                    c1877.m3665(c1877.f9449, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c1877.f9459 = -1;
            c1877.m3670(null, 0);
        } else {
            int i = c1877.f9459;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c1877.m3663(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c1877.f9448;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c1877.f9463 != null;
    }

    @Override // yyds.InterfaceC2310
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void mo3489(boolean z) {
        if (z) {
            this.f8827.m3670(null, 0);
        }
    }
}
