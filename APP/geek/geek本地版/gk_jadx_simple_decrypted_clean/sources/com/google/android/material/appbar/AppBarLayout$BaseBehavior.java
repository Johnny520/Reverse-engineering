package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ta0;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends ta0 {
    public boolean b;
    public int c;
    public int d;
    public int e;
    public VelocityTracker f;

    public AppBarLayout$BaseBehavior() {
        this.c = -1;
        this.e = -1;
    }

    @Override // defpackage.wd
    public final boolean f(CoordinatorLayout r4, View r5, MotionEvent r6) {
        if (this.e >= 0) goto L6;
        this.e = ViewConfiguration.get(r4.getContext()).getScaledTouchSlop();
    L6:
        if (r6.getActionMasked() != 2) goto L20;
        if (this.b == false) goto L20;
        int r42 = this.c;
        if (r42 == (-1)) goto L24;
        int r43 = r6.findPointerIndex(r42);
        if (r43 == (-1)) goto L24;
        int r44 = (int) r6.getY(r43);
        if (Math.abs(r44 - this.d) <= this.e) goto L20;
        this.d = r44;
        return true;
    L24:
        return false;
    L20:
        if (r6.getActionMasked() == 0) goto L25;
        VelocityTracker r45 = this.f;
        if (r45 == null) goto L24;
        r45.addMovement(r6);
        goto L24
    L25:
        this.c = -1;
        r6.getX();
        r6.getY();
        throw new ClassCastException();
    }

    @Override // defpackage.ta0, defpackage.wd
    public final boolean g(CoordinatorLayout r1, View r2, int r3) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final boolean h(CoordinatorLayout r1, View r2, int r3, int r4, int r5) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final /* synthetic */ void j(CoordinatorLayout r1, View r2, View r3, int r4, int r5, int[] r6, int r7) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final void k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final void m(View r1, Parcelable r2) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final Parcelable n(View r1) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final boolean o(View r1, int r2, int r3) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final void p(View r1, View r2, int r3) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final boolean q(View r6, MotionEvent r7) {
        int r0 = r7.getActionMasked();
        if (r0 != 1) goto L5;
        VelocityTracker r02 = this.f;
        if (r02 != null) goto L33;
    L23:
        this.b = false;
        this.c = -1;
        VelocityTracker r62 = this.f;
        if (r62 == null) goto L26;
        r62.recycle();
        this.f = null;
    L26:
        VelocityTracker r63 = this.f;
        if (r63 == null) goto L30;
        r63.addMovement(r7);
    L30:
        if (this.b == true) goto L32;
    L31:
        return false;
    L32:
        return true;
    L33:
        r02.addMovement(r7);
        this.f.computeCurrentVelocity(1000);
        this.f.getYVelocity(this.c);
        r6.getClass();
        throw new ClassCastException();
    L5:
        if (r0 != 2) goto L7;
        int r03 = r7.findPointerIndex(this.c);
        if (r03 == (-1)) goto L31;
        this.d = (int) r7.getY(r03);
        r6.getClass();
        throw new ClassCastException();
    L7:
        if (r0 == 3) goto L23;
        if (r0 != 6) goto L26;
        if (r7.getActionIndex() != 0) goto L14;
        int r64 = 1;
    L15:
        this.c = r7.getPointerId(r64);
        this.d = (int) (r7.getY(r64) + 0.5f);
        goto L26
    L14:
        r64 = 0;
        goto L15
    }

    public AppBarLayout$BaseBehavior(Context r1, AttributeSet r2) {
        this.c = -1;
        this.e = -1;
    }
}
