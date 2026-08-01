package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p206.InterfaceC8606;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1011 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public RunnableC1023 f993;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final View f994;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f995;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f996 = new int[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public RunnableC1023 f997;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f998;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f999;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f1000;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f1001;

    public AbstractViewOnTouchListenerC1011(View view) {
        this.f994 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1001 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f999 = tapTimeout;
        this.f1000 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C1024 c1024Mo1211;
        boolean z2 = this.f998;
        View view2 = this.f994;
        if (z2) {
            InterfaceC8606 interfaceC8606Mo1087 = mo1087();
            if (interfaceC8606Mo1087 == null || !interfaceC8606Mo1087.mo1206() || (c1024Mo1211 = interfaceC8606Mo1087.mo1211()) == null || !c1024Mo1211.isShown()) {
                z = !mo1179();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f996;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c1024Mo1211.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM1201 = c1024Mo1211.m1201(motionEventObtainNoHistory, this.f995);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM1201 || !z3) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f995 = motionEvent.getPointerId(0);
                if (this.f993 == null) {
                    this.f993 = new RunnableC1023(this, 0);
                }
                view2.postDelayed(this.f993, this.f999);
                if (this.f997 == null) {
                    this.f997 = new RunnableC1023(this, 1);
                }
                view2.postDelayed(this.f997, this.f1000);
            } else if (actionMasked2 == 1) {
                m1180();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f995);
                if (iFindPointerIndex >= 0) {
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f = this.f1001;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                        m1180();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (mo1086()) {
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
        this.f998 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f998 = false;
        this.f995 = -1;
        RunnableC1023 runnableC1023 = this.f993;
        if (runnableC1023 != null) {
            this.f994.removeCallbacks(runnableC1023);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean mo1179() {
        InterfaceC8606 interfaceC8606Mo1087 = mo1087();
        if (interfaceC8606Mo1087 == null || !interfaceC8606Mo1087.mo1206()) {
            return true;
        }
        interfaceC8606Mo1087.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract boolean mo1086();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract InterfaceC8606 mo1087();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1180() {
        RunnableC1023 runnableC1023 = this.f997;
        View view = this.f994;
        if (runnableC1023 != null) {
            view.removeCallbacks(runnableC1023);
        }
        RunnableC1023 runnableC10232 = this.f993;
        if (runnableC10232 != null) {
            view.removeCallbacks(runnableC10232);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
