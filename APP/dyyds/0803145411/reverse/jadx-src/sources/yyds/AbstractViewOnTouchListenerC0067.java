package yyds;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: yyds.ᛱᛱᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0067 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public RunnableC0487 f599;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f600;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f601;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public RunnableC0487 f602;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final int[] f603 = new int[2];

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f604;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final float f605;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final View f606;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f607;

    public AbstractViewOnTouchListenerC0067(View view) {
        this.f606 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f605 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f607 = tapTimeout;
        this.f601 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C2045 c2045Mo1522;
        boolean z2 = this.f600;
        View view2 = this.f606;
        if (z2) {
            InterfaceC0911 interfaceC0911Mo438 = mo438();
            if (interfaceC0911Mo438 == null || !interfaceC0911Mo438.mo1515() || (c2045Mo1522 = interfaceC0911Mo438.mo1522()) == null || !c2045Mo1522.isShown()) {
                z = !mo440();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f603;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c2045Mo1522.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM3915 = c2045Mo1522.m3915(motionEventObtainNoHistory, this.f604);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM3915 || !z3) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f604 = motionEvent.getPointerId(0);
                RunnableC0487 runnableC0487 = this.f602;
                if (runnableC0487 == null) {
                    runnableC0487 = new RunnableC0487(this, 0);
                    this.f602 = runnableC0487;
                }
                view2.postDelayed(runnableC0487, this.f607);
                RunnableC0487 runnableC04872 = this.f599;
                if (runnableC04872 == null) {
                    runnableC04872 = new RunnableC0487(this, 1);
                    this.f599 = runnableC04872;
                }
                view2.postDelayed(runnableC04872, this.f601);
            } else if (actionMasked2 == 1) {
                m437();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f604);
                if (iFindPointerIndex >= 0) {
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f = this.f605;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                        m437();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (mo439()) {
                            z = true;
                        }
                        if (z) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            z = false;
            if (z) {
            }
        } else {
            z = false;
            if (z) {
            }
        }
        this.f600 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f600 = false;
        this.f604 = -1;
        RunnableC0487 runnableC0487 = this.f602;
        if (runnableC0487 != null) {
            this.f606.removeCallbacks(runnableC0487);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m437() {
        RunnableC0487 runnableC0487 = this.f599;
        View view = this.f606;
        if (runnableC0487 != null) {
            view.removeCallbacks(runnableC0487);
        }
        RunnableC0487 runnableC04872 = this.f602;
        if (runnableC04872 != null) {
            view.removeCallbacks(runnableC04872);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public abstract InterfaceC0911 mo438();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public abstract boolean mo439();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean mo440() {
        InterfaceC0911 interfaceC0911Mo438 = mo438();
        if (interfaceC0911Mo438 == null || !interfaceC0911Mo438.mo1515()) {
            return true;
        }
        interfaceC0911Mo438.dismiss();
        return true;
    }
}
