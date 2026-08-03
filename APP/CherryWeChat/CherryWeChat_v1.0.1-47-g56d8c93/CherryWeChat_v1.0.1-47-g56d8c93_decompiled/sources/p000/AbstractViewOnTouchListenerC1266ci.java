package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: ci */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1266ci implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f4302a;

    /* JADX INFO: renamed from: b */
    public final int f4303b;

    /* JADX INFO: renamed from: c */
    public final int f4304c;

    /* JADX INFO: renamed from: d */
    public final View f4305d;

    /* JADX INFO: renamed from: e */
    public RunnableC1223bi f4306e;

    /* JADX INFO: renamed from: f */
    public RunnableC1223bi f4307f;

    /* JADX INFO: renamed from: g */
    public boolean f4308g;

    /* JADX INFO: renamed from: h */
    public int f4309h;

    /* JADX INFO: renamed from: i */
    public final int[] f4310i = new int[2];

    public AbstractViewOnTouchListenerC1266ci(View view) {
        this.f4305d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4302a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4303b = tapTimeout;
        this.f4304c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2407a() {
        RunnableC1223bi runnableC1223bi = this.f4307f;
        View view = this.f4305d;
        if (runnableC1223bi != null) {
            view.removeCallbacks(runnableC1223bi);
        }
        RunnableC1223bi runnableC1223bi2 = this.f4306e;
        if (runnableC1223bi2 != null) {
            view.removeCallbacks(runnableC1223bi2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC2168ky mo1753b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1754c();

    /* JADX INFO: renamed from: d */
    public boolean mo2408d() {
        InterfaceC2168ky interfaceC2168kyMo1753b = mo1753b();
        if (interfaceC2168kyMo1753b == null || !interfaceC2168kyMo1753b.mo575a()) {
            return true;
        }
        interfaceC2168kyMo1753b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C0365Ie c0365IeMo580h;
        boolean z2 = this.f4308g;
        View view2 = this.f4305d;
        if (z2) {
            InterfaceC2168ky interfaceC2168kyMo1753b = mo1753b();
            if (interfaceC2168kyMo1753b == null || !interfaceC2168kyMo1753b.mo575a() || (c0365IeMo580h = interfaceC2168kyMo1753b.mo580h()) == null || !c0365IeMo580h.isShown()) {
                z = !mo2408d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f4310i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c0365IeMo580h.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM807b = c0365IeMo580h.m807b(motionEventObtainNoHistory, this.f4309h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM807b || !z3) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f4309h = motionEvent.getPointerId(0);
                if (this.f4306e == null) {
                    this.f4306e = new RunnableC1223bi(this, 0);
                }
                view2.postDelayed(this.f4306e, this.f4303b);
                if (this.f4307f == null) {
                    this.f4307f = new RunnableC1223bi(this, 1);
                }
                view2.postDelayed(this.f4307f, this.f4304c);
            } else if (actionMasked2 == 1) {
                m2407a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4309h);
                if (iFindPointerIndex >= 0) {
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f = this.f4302a;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                        m2407a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (mo1754c()) {
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
        this.f4308g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4308g = false;
        this.f4309h = -1;
        RunnableC1223bi runnableC1223bi = this.f4306e;
        if (runnableC1223bi != null) {
            this.f4305d.removeCallbacks(runnableC1223bi);
        }
    }
}
