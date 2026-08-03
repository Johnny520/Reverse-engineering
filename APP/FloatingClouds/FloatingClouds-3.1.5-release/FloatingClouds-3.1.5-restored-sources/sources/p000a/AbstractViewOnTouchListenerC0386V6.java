package p000a;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: renamed from: a.V6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0386V6 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f1464a;

    /* JADX INFO: renamed from: b */
    public final int f1465b;

    /* JADX INFO: renamed from: c */
    public final int f1466c;

    /* JADX INFO: renamed from: d */
    public final View f1467d;

    /* JADX INFO: renamed from: e */
    public a f1468e;

    /* JADX INFO: renamed from: f */
    public b f1469f;

    /* JADX INFO: renamed from: g */
    public boolean f1470g;

    /* JADX INFO: renamed from: h */
    public int f1471h;

    /* JADX INFO: renamed from: i */
    public final int[] f1472i = new int[2];

    /* JADX INFO: renamed from: a.V6$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0386V6.this.f1467d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: a.V6$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC0386V6 abstractViewOnTouchListenerC0386V6 = AbstractViewOnTouchListenerC0386V6.this;
            abstractViewOnTouchListenerC0386V6.m1015a();
            View view = abstractViewOnTouchListenerC0386V6.f1467d;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0386V6.mo1017c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                abstractViewOnTouchListenerC0386V6.f1470g = true;
            }
        }
    }

    public AbstractViewOnTouchListenerC0386V6(View view) {
        this.f1467d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1464a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1465b = tapTimeout;
        this.f1466c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1015a() {
        b bVar = this.f1469f;
        View view = this.f1467d;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f1468e;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0541de mo1016b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1017c();

    /* JADX INFO: renamed from: d */
    public boolean mo1018d() {
        InterfaceC0541de interfaceC0541deMo1016b = mo1016b();
        if (interfaceC0541deMo1016b == null || !interfaceC0541deMo1016b.mo276b()) {
            return true;
        }
        interfaceC0541deMo1016b.dismiss();
        return true;
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
        C0006A5 c0006a5Mo282k;
        boolean z2 = this.f1470g;
        View view2 = this.f1467d;
        if (z2) {
            InterfaceC0541de interfaceC0541deMo1016b = mo1016b();
            if (interfaceC0541deMo1016b == null || !interfaceC0541deMo1016b.mo276b() || (c0006a5Mo282k = interfaceC0541deMo1016b.mo282k()) == null || !c0006a5Mo282k.isShown()) {
                z = !mo1018d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1472i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c0006a5Mo282k.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM33b = c0006a5Mo282k.m33b(motionEventObtainNoHistory, this.f1471h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM33b || !z3) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f1471h = motionEvent.getPointerId(0);
                if (this.f1468e == null) {
                    this.f1468e = new a();
                }
                view2.postDelayed(this.f1468e, this.f1465b);
                if (this.f1469f == null) {
                    this.f1469f = new b();
                }
                view2.postDelayed(this.f1469f, this.f1466c);
            } else if (actionMasked2 == 1) {
                m1015a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1471h);
                if (iFindPointerIndex >= 0) {
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f = this.f1464a;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                        m1015a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (mo1017c()) {
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
        this.f1470g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1470g = false;
        this.f1471h = -1;
        a aVar = this.f1468e;
        if (aVar != null) {
            this.f1467d.removeCallbacks(aVar);
        }
    }
}
