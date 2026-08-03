package p055f;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p057g.AbstractC0895c0;
import p057g.C0900f;
import p057g.C0902g;
import p057g.C0904h;
import p057g.C0906i;
import p057g.RunnableC0899e0;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0770a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f2732a;

    /* JADX INFO: renamed from: b */
    public final int f2733b;

    /* JADX INFO: renamed from: c */
    public final int f2734c;

    /* JADX INFO: renamed from: d */
    public final View f2735d;

    /* JADX INFO: renamed from: e */
    public RunnableC0899e0 f2736e;

    /* JADX INFO: renamed from: f */
    public RunnableC0899e0 f2737f;

    /* JADX INFO: renamed from: g */
    public boolean f2738g;

    /* JADX INFO: renamed from: h */
    public int f2739h;

    /* JADX INFO: renamed from: i */
    public final int[] f2740i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2741j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f2742k;

    public ViewOnTouchListenerC0770a(View view) {
        this.f2740i = new int[2];
        this.f2735d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2732a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2733b = tapTimeout;
        this.f2734c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1971a() {
        RunnableC0899e0 runnableC0899e0 = this.f2737f;
        View view = this.f2735d;
        if (runnableC0899e0 != null) {
            view.removeCallbacks(runnableC0899e0);
        }
        RunnableC0899e0 runnableC0899e02 = this.f2736e;
        if (runnableC0899e02 != null) {
            view.removeCallbacks(runnableC0899e02);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0781l m1972b() {
        C0900f c0900f;
        switch (this.f2741j) {
            case 0:
                AbstractC0771b abstractC0771b = ((ActionMenuItemView) this.f2742k).f1068m;
                if (abstractC0771b == null || (c0900f = ((C0902g) abstractC0771b).f3185a.f3221s) == null) {
                    return null;
                }
                return c0900f.m2026a();
            default:
                C0900f c0900f2 = ((C0904h) this.f2742k).f3201d.f3220r;
                if (c0900f2 == null) {
                    return null;
                }
                return c0900f2.m2026a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1973c() {
        AbstractC0781l abstractC0781lM1972b;
        switch (this.f2741j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2742k;
                InterfaceC0778i interfaceC0778i = actionMenuItemView.f1066k;
                return interfaceC0778i != null && interfaceC0778i.mo1116a(actionMenuItemView.f1063h) && (abstractC0781lM1972b = m1972b()) != null && abstractC0781lM1972b.mo1978d();
            default:
                ((C0904h) this.f2742k).f3201d.m2236f();
                return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m1974d() {
        switch (this.f2741j) {
            case 1:
                C0906i c0906i = ((C0904h) this.f2742k).f3201d;
                if (c0906i.f3222t != null) {
                    return false;
                }
                c0906i.m2235e();
                return true;
            default:
                return m1975e();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1975e() {
        AbstractC0781l abstractC0781lM1972b = m1972b();
        if (abstractC0781lM1972b == null || !abstractC0781lM1972b.mo1978d()) {
            return true;
        }
        abstractC0781lM1972b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        AbstractC0895c0 abstractC0895c0;
        boolean z3 = this.f2738g;
        View view2 = this.f2735d;
        if (z3) {
            AbstractC0781l abstractC0781lM1972b = m1972b();
            if (abstractC0781lM1972b == null || !abstractC0781lM1972b.mo1978d() || (abstractC0895c0 = (AbstractC0895c0) abstractC0781lM1972b.mo1979e()) == null || !abstractC0895c0.isShown()) {
                z2 = !m1974d();
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2740i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC0895c0.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM2230b = abstractC0895c0.m2230b(motionEventObtainNoHistory, this.f2739h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!zM2230b || !z4) {
                }
            }
        } else if (view2.isEnabled()) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f2739h = motionEvent.getPointerId(0);
                if (this.f2736e == null) {
                    this.f2736e = new RunnableC0899e0(this, 0);
                }
                view2.postDelayed(this.f2736e, this.f2733b);
                if (this.f2737f == null) {
                    this.f2737f = new RunnableC0899e0(this, 1);
                }
                view2.postDelayed(this.f2737f, this.f2734c);
            } else if (actionMasked2 == 1) {
                m1971a();
            } else if (actionMasked2 == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2739h);
                if (iFindPointerIndex >= 0) {
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f2 = this.f2732a;
                    float f3 = -f2;
                    if (x < f3 || y < f3 || x >= (view2.getRight() - view2.getLeft()) + f2 || y >= (view2.getBottom() - view2.getTop()) + f2) {
                        m1971a();
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        if (m1973c()) {
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
        this.f2738g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2738g = false;
        this.f2739h = -1;
        RunnableC0899e0 runnableC0899e0 = this.f2736e;
        if (runnableC0899e0 != null) {
            this.f2735d.removeCallbacks(runnableC0899e0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0770a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f2741j = 0;
        this.f2742k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0770a(C0904h c0904h, View view) {
        this(view);
        this.f2741j = 1;
        this.f2742k = c0904h;
    }
}
