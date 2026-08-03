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

    /* JADX INFO: renamed from: c */
    public int f4369c;

    /* JADX INFO: renamed from: d */
    public int f4370d;

    /* JADX INFO: renamed from: e */
    public int f4371e;

    /* JADX INFO: renamed from: f */
    public VelocityTracker f4372f;

    public AppBarLayout$BaseBehavior() {
        this.f4369c = -1;
        this.f4371e = -1;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    public final boolean mo1458f(CoordinatorLayout r4, View r5, MotionEvent r6) {
        if (this.f4371e >= 0) goto L6;
        this.f4371e = ViewConfiguration.get(r4.getContext()).getScaledTouchSlop();
    L6:
        if (r6.getActionMasked() != 2) goto L20;
        if (this.f4368b == false) goto L20;
        int r42 = this.f4369c;
        if (r42 == (-1)) goto L24;
        int r43 = r6.findPointerIndex(r42);
        if (r43 == (-1)) goto L24;
        int r44 = (int) r6.getY(r43);
        if (Math.abs(r44 - this.f4370d) <= this.f4371e) goto L20;
        this.f4370d = r44;
        return true;
    L24:
        return false;
    L20:
        if (r6.getActionMasked() == 0) goto L25;
        VelocityTracker r45 = this.f4372f;
        if (r45 == null) goto L24;
        r45.addMovement(r6);
        goto L24
    L25:
        this.f4369c = -1;
        r6.getX();
        r6.getY();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC2795zE, p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout r1, View r2, int r3) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: h */
    public final boolean mo1460h(CoordinatorLayout r1, View r2, int r3, int r4, int r5) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo1462j(CoordinatorLayout r1, View r2, View r3, int r4, int r5, int[] r6, int r7) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: k */
    public final void mo1463k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: m */
    public final void mo1465m(View r1, Parcelable r2) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1466n(View r1) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: o */
    public final boolean mo1467o(View r1, int r2, int r3) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: p */
    public final void mo1468p(View r1, View r2, int r3) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: q */
    public final boolean mo1469q(View r6, MotionEvent r7) {
        int r0 = r7.getActionMasked();
        if (r0 != 1) goto L5;
        VelocityTracker r02 = this.f4372f;
        if (r02 != null) goto L33;
    L23:
        this.f4368b = false;
        this.f4369c = -1;
        VelocityTracker r62 = this.f4372f;
        if (r62 == null) goto L26;
        r62.recycle();
        this.f4372f = null;
    L26:
        VelocityTracker r63 = this.f4372f;
        if (r63 == null) goto L30;
        r63.addMovement(r7);
    L30:
        if (this.f4368b == true) goto L32;
    L31:
        return false;
    L32:
        return true;
    L33:
        r02.addMovement(r7);
        this.f4372f.computeCurrentVelocity(1000);
        this.f4372f.getYVelocity(this.f4369c);
        r6.getClass();
        throw new ClassCastException();
    L5:
        if (r0 != 2) goto L7;
        int r03 = r7.findPointerIndex(this.f4369c);
        if (r03 == (-1)) goto L31;
        this.f4370d = (int) r7.getY(r03);
        r6.getClass();
        throw new ClassCastException();
    L7:
        if (r0 == 3) goto L23;
        if (r0 != 6) goto L26;
        if (r7.getActionIndex() != 0) goto L14;
        int r64 = 1;
    L15:
        this.f4369c = r7.getPointerId(r64);
        this.f4370d = (int) (r7.getY(r64) + 0.5f);
        goto L26
    L14:
        r64 = 0;
        goto L15
    }

    public AppBarLayout$BaseBehavior(Context r1, AttributeSet r2) {
        this.f4369c = -1;
        this.f4371e = -1;
    }
}
