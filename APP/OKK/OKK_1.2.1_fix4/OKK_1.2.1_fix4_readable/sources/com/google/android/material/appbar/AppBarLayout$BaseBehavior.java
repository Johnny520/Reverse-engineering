package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p034S.AbstractC0324d;
import p062i0.AbstractC0954a;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC0954a {

    /* JADX INFO: renamed from: c */
    public boolean f2253c;

    /* JADX INFO: renamed from: d */
    public int f2254d;

    /* JADX INFO: renamed from: e */
    public int f2255e;

    /* JADX INFO: renamed from: f */
    public int f2256f;

    /* JADX INFO: renamed from: g */
    public VelocityTracker f2257g;

    public AppBarLayout$BaseBehavior() {
        this.f2254d = -1;
        this.f2256f = -1;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: f */
    public final boolean mo1815f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f2256f < 0) {
            this.f2256f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2253c) {
            int i2 = this.f2254d;
            if (i2 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i2)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f2255e) > this.f2256f) {
                this.f2255e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f2257g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f2254d = -1;
        motionEvent.getX();
        motionEvent.getY();
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p062i0.AbstractC0954a, p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: h */
    public final boolean mo1817h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: j */
    public final void mo1818j(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: k */
    public final void mo1819k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: m */
    public final void mo1820m(View view, Parcelable parcelable) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1821n(View view) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: o */
    public final boolean mo1822o(View view, int i2, int i3) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: p */
    public final void mo1823p(View view, View view2, int i2) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1824q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2254d);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                this.f2255e = (int) motionEvent.getY(iFindPointerIndex);
                AbstractC0324d.m726i(view);
                throw null;
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.f2254d = motionEvent.getPointerId(i2);
                    this.f2255e = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            velocityTracker = this.f2257g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return this.f2253c;
        }
        VelocityTracker velocityTracker2 = this.f2257g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f2257g.computeCurrentVelocity(1000);
            this.f2257g.getYVelocity(this.f2254d);
            AbstractC0324d.m726i(view);
            throw null;
        }
        this.f2253c = false;
        this.f2254d = -1;
        VelocityTracker velocityTracker3 = this.f2257g;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f2257g = null;
        }
        velocityTracker = this.f2257g;
        if (velocityTracker != null) {
        }
        return this.f2253c;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f2254d = -1;
        this.f2256f = -1;
    }
}
