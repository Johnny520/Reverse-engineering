package Yue;

import Yue.InterfaceC7144;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public abstract class AbstractViewOnTouchListenerC5066 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final float f12012;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f12013;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f12014;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final View f12015;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Runnable f12016;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Runnable f12017;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f12018;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f12019;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final int[] f12020 = new int[2];

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۨ$ۥ */
    public class RunnableC0633 implements Runnable {
        public RunnableC0633() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC5066.this.f12015.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۨ$ۥ۟ */
    public class RunnableC0634 implements Runnable {
        public RunnableC0634() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC5066.this.m15610();
        }
    }

    public AbstractViewOnTouchListenerC5066(View view) {
        this.f12015 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f12012 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f12013 = tapTimeout;
        this.f12014 = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m15608(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f12018;
        if (z2) {
            z = m15611(motionEvent) || !mo15609();
        } else {
            z = m15612(motionEvent) && mo6795();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f12015.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f12018 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f12018 = false;
        this.f12019 = -1;
        Runnable runnable = this.f12016;
        if (runnable != null) {
            this.f12015.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m1890() {
        Runnable runnable = this.f12017;
        if (runnable != null) {
            this.f12015.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f12016;
        if (runnable2 != null) {
            this.f12015.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract InterfaceC7462 mo399();

    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo6795() {
        InterfaceC7462 interfaceC7462Mo399 = mo399();
        if (interfaceC7462Mo399 == null || interfaceC7462Mo399.mo2407()) {
            return true;
        }
        interfaceC7462Mo399.show();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo15609() {
        InterfaceC7462 interfaceC7462Mo399 = mo399();
        if (interfaceC7462Mo399 == null || !interfaceC7462Mo399.mo2407()) {
            return true;
        }
        interfaceC7462Mo399.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m15610() {
        m1890();
        View view = this.f12015;
        if (view.isEnabled() && !view.isLongClickable() && mo6795()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f12018 = true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m15611(MotionEvent motionEvent) {
        C4546 c4546;
        View view = this.f12015;
        InterfaceC7462 interfaceC7462Mo399 = mo399();
        if (interfaceC7462Mo399 == null || !interfaceC7462Mo399.mo2407() || (c4546 = (C4546) interfaceC7462Mo399.mo17740()) == null || !c4546.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m15613(view, motionEventObtainNoHistory);
        m15614(c4546, motionEventObtainNoHistory);
        boolean zMo13369 = c4546.mo13369(motionEventObtainNoHistory, this.f12019);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zMo13369 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m15612(MotionEvent motionEvent) {
        View view = this.f12015;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12019 = motionEvent.getPointerId(0);
            if (this.f12016 == null) {
                this.f12016 = new RunnableC0633();
            }
            view.postDelayed(this.f12016, this.f12013);
            if (this.f12017 == null) {
                this.f12017 = new RunnableC0634();
            }
            view.postDelayed(this.f12017, this.f12014);
        } else if (actionMasked == 1) {
            m1890();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f12019);
            if (iFindPointerIndex >= 0 && !m15608(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f12012)) {
                m1890();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m15613(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f12020);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m15614(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f12020);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }
}
