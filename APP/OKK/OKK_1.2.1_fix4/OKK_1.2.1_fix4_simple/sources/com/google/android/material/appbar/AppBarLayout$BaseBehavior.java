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
    public final boolean mo1815f(CoordinatorLayout r5, View r6, MotionEvent r7) {
        if (this.f2256f >= 0) goto L6;
        this.f2256f = ViewConfiguration.get(r5.getContext()).getScaledTouchSlop();
    L6:
        if (r7.getActionMasked() != 2) goto L20;
        if (this.f2253c == false) goto L20;
        int r52 = this.f2254d;
        if (r52 != (-1)) goto L12;
        return false;
    L12:
        int r53 = r7.findPointerIndex(r52);
        if (r53 != (-1)) goto L15;
        return false;
    L15:
        int r54 = (int) r7.getY(r53);
        if (Math.abs(r54 - this.f2255e) <= this.f2256f) goto L20;
        this.f2255e = r54;
        return true;
    L20:
        if (r7.getActionMasked() == 0) goto L25;
        VelocityTracker r55 = this.f2257g;
        if (r55 == null) goto L24;
        r55.addMovement(r7);
    L24:
        return false;
    L25:
        this.f2254d = -1;
        r7.getX();
        r7.getY();
        AbstractC0324d.m724g(r6);
        throw null;
    }

    @Override // p062i0.AbstractC0954a, p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout r1, View r2, int r3) {
        AbstractC0324d.m724g(r2);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: h */
    public final boolean mo1817h(CoordinatorLayout r1, View r2, int r3, int r4, int r5) {
        AbstractC0324d.m724g(r2);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: j */
    public final void mo1818j(CoordinatorLayout r1, View r2, View r3, int r4, int r5, int[] r6, int r7) {
        AbstractC0324d.m724g(r2);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: k */
    public final void mo1819k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
        AbstractC0324d.m724g(r2);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: m */
    public final void mo1820m(View r1, Parcelable r2) {
        AbstractC0324d.m724g(r1);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1821n(View r1) {
        AbstractC0324d.m724g(r1);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: o */
    public final boolean mo1822o(View r1, int r2, int r3) {
        AbstractC0324d.m724g(r1);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: p */
    public final void mo1823p(View r1, View r2, int r3) {
        AbstractC0324d.m724g(r1);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: q */
    public final boolean mo1824q(View r7, MotionEvent r8) {
        int r02 = r8.getActionMasked();
        int r2 = 1;
        if (r02 != 1) goto L5;
        VelocityTracker r03 = this.f2257g;
        if (r03 != null) goto L31;
    L23:
        this.f2253c = false;
        this.f2254d = -1;
        VelocityTracker r72 = this.f2257g;
        if (r72 == null) goto L26;
        r72.recycle();
        this.f2257g = null;
    L26:
        VelocityTracker r73 = this.f2257g;
        if (r73 == null) goto L30;
        r73.addMovement(r8);
    L30:
        return this.f2253c;
    L31:
        r03.addMovement(r8);
        this.f2257g.computeCurrentVelocity(1000);
        this.f2257g.getYVelocity(this.f2254d);
        AbstractC0324d.m726i(r7);
        throw null;
    L5:
        if (r02 != 2) goto L7;
        int r04 = r8.findPointerIndex(this.f2254d);
        if (r04 != (-1)) goto L19;
        return false;
    L19:
        this.f2255e = (int) r8.getY(r04);
        AbstractC0324d.m726i(r7);
        throw null;
    L7:
        if (r02 == 3) goto L23;
        if (r02 != 6) goto L26;
        if (r8.getActionIndex() == 0) goto L15;
        r2 = 0;
    L15:
        this.f2254d = r8.getPointerId(r2);
        this.f2255e = (int) (r8.getY(r2) + 0.5f);
        goto L26
    }

    public AppBarLayout$BaseBehavior(Context r1, AttributeSet r2) {
        super(0);
        this.f2254d = -1;
        this.f2256f = -1;
    }
}
