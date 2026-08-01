package p069i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p068h.InterfaceC0579D;

/* JADX INFO: renamed from: i.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0724w0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b */
    public final float f2449b;

    /* JADX INFO: renamed from: c */
    public final int f2450c;

    /* JADX INFO: renamed from: d */
    public final int f2451d;

    /* JADX INFO: renamed from: e */
    public final View f2452e;

    /* JADX INFO: renamed from: f */
    public RunnableC0722v0 f2453f;

    /* JADX INFO: renamed from: g */
    public RunnableC0722v0 f2454g;

    /* JADX INFO: renamed from: h */
    public boolean f2455h;

    /* JADX INFO: renamed from: i */
    public int f2456i;

    /* JADX INFO: renamed from: j */
    public final int[] f2457j = new int[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractViewOnTouchListenerC0724w0(View view) {
        this.f2452e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2449b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2450c = tapTimeout;
        this.f2451d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1375a() {
        RunnableC0722v0 runnableC0722v0 = this.f2454g;
        View view = this.f2452e;
        if (runnableC0722v0 != null) {
            view.removeCallbacks(runnableC0722v0);
        }
        RunnableC0722v0 runnableC0722v02 = this.f2453f;
        if (runnableC0722v02 != null) {
            view.removeCallbacks(runnableC0722v02);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0579D mo1171b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1172c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public boolean mo1173d() {
        InterfaceC0579D interfaceC0579DMo1171b = mo1171b();
        if (interfaceC0579DMo1171b == null || !interfaceC0579DMo1171b.mo1144a()) {
            return true;
        }
        interfaceC0579DMo1171b.dismiss();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        C0717t0 c0717t0Mo1145f;
        boolean z3 = this.f2455h;
        View view2 = this.f2452e;
        if (z3) {
            InterfaceC0579D interfaceC0579DMo1171b = mo1171b();
            if (interfaceC0579DMo1171b == null || !interfaceC0579DMo1171b.mo1144a() || (c0717t0Mo1145f = interfaceC0579DMo1171b.mo1145f()) == null || !c0717t0Mo1145f.isShown()) {
                z2 = !mo1173d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2457j;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c0717t0Mo1145f.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM1365b = c0717t0Mo1145f.m1365b(motionEventObtainNoHistory, this.f2456i);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM1365b || !z4) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f2456i = motionEvent.getPointerId(0);
                if (this.f2453f == null) {
                    this.f2453f = new RunnableC0722v0(this, 0);
                }
                view2.postDelayed(this.f2453f, this.f2450c);
                if (this.f2454g == null) {
                    this.f2454g = new RunnableC0722v0(this, 1);
                }
                view2.postDelayed(this.f2454g, this.f2451d);
            } else if (actionMasked2 == 1) {
                m1375a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2456i);
                if (iFindPointerIndex >= 0) {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float f = this.f2449b;
                    float f2 = -f;
                    if (x2 < f2 || y2 < f2 || x2 >= (view2.getRight() - view2.getLeft()) + f || y2 >= (view2.getBottom() - view2.getTop()) + f) {
                        m1375a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (mo1172c()) {
                            z2 = true;
                        }
                        if (z2) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                    }
                }
            } else if (actionMasked2 == 3) {
            }
            z2 = false;
            if (z2) {
            }
        } else {
            z2 = false;
            if (z2) {
            }
        }
        this.f2455h = z2;
        return z2 || z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2455h = false;
        this.f2456i = -1;
        RunnableC0722v0 runnableC0722v0 = this.f2453f;
        if (runnableC0722v0 != null) {
            this.f2452e.removeCallbacks(runnableC0722v0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
