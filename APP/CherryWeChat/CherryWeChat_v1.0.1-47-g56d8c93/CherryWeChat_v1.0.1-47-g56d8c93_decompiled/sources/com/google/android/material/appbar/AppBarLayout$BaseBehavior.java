package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.AbstractC2795zE;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC2795zE {

    /* JADX INFO: renamed from: b */
    public boolean f4368b;

    /* JADX INFO: renamed from: d */
    public int f4370d;

    /* JADX INFO: renamed from: f */
    public VelocityTracker f4372f;

    /* JADX INFO: renamed from: c */
    public int f4369c = -1;

    /* JADX INFO: renamed from: e */
    public int f4371e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1458f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f4371e < 0) {
            this.f4371e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f4368b) {
            int i = this.f4369c;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y - this.f4370d) > this.f4371e) {
                    this.f4370d = y;
                    return true;
                }
                if (motionEvent.getActionMasked() != 0) {
                }
            }
        } else {
            if (motionEvent.getActionMasked() != 0) {
                this.f4369c = -1;
                motionEvent.getX();
                motionEvent.getY();
                throw new ClassCastException();
            }
            VelocityTracker velocityTracker = this.f4372f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    @Override // p000.AbstractC2795zE, p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: h */
    public final boolean mo1460h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo1462j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: k */
    public final void mo1463k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: m */
    public final void mo1465m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1466n(View view) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: o */
    public final boolean mo1467o(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: p */
    public final void mo1468p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[RETURN] */
    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1469q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4369c);
                if (iFindPointerIndex != -1) {
                    this.f4370d = (int) motionEvent.getY(iFindPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f4369c = motionEvent.getPointerId(i);
                    this.f4370d = (int) (motionEvent.getY(i) + 0.5f);
                }
            }
            velocityTracker = this.f4372f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return !this.f4368b;
        }
        VelocityTracker velocityTracker2 = this.f4372f;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f4372f.computeCurrentVelocity(1000);
            this.f4372f.getYVelocity(this.f4369c);
            view.getClass();
            throw new ClassCastException();
        }
        this.f4368b = false;
        this.f4369c = -1;
        VelocityTracker velocityTracker3 = this.f4372f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f4372f = null;
        }
        velocityTracker = this.f4372f;
        if (velocityTracker != null) {
        }
        if (!this.f4368b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
