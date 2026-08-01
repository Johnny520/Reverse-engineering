package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ljx.wechatmod.R;
import defpackage.ct;
import defpackage.q2;
import defpackage.wd;
import defpackage.y0;
import defpackage.z30;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends wd {
    public final LinkedHashSet a;
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public int f;
    public int g;
    public ViewPropertyAnimator h;

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
    }

    @Override // defpackage.wd
    public boolean g(CoordinatorLayout r2, View r3, int r4) {
        ViewGroup.MarginLayoutParams r22 = (ViewGroup.MarginLayoutParams) r3.getLayoutParams();
        this.f = r3.getMeasuredHeight() + r22.bottomMargin;
        this.b = ct.v(r3.getContext(), R.attr.motionDurationLong2, 225);
        this.c = ct.v(r3.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = ct.w(r3.getContext(), R.attr.motionEasingEmphasizedInterpolator, q2.d);
        this.e = ct.w(r3.getContext(), R.attr.motionEasingEmphasizedInterpolator, q2.c);
        return false;
    }

    @Override // defpackage.wd
    public final void k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
        LinkedHashSet r12 = this.a;
        if (r3 > 0) goto L5;
        if (r3 < 0) goto L18;
        return;
    L18:
        if (this.g == 2) goto L31;
        ViewPropertyAnimator r32 = this.h;
        if (r32 == null) goto L23;
        r32.cancel();
        r2.clearAnimation();
    L23:
        this.g = 2;
        Iterator r13 = r12.iterator();
        if (r13.hasNext() == true) goto L28;
        this.h = r2.animate().translationY(0).setInterpolator(this.d).setDuration(this.b).setListener(new y0(3, this));
        return;
    L28:
        throw z30.h(r13);
    L31:
        return;
    L5:
        if (this.g == 1) goto L30;
        ViewPropertyAnimator r33 = this.h;
        if (r33 == null) goto L10;
        r33.cancel();
        r2.clearAnimation();
    L10:
        this.g = 1;
        Iterator r14 = r12.iterator();
        if (r14.hasNext() == true) goto L15;
        int r15 = this.f;
        this.h = r2.animate().translationY(r15).setInterpolator(this.e).setDuration(this.c).setListener(new y0(3, this));
        return;
    L15:
        throw z30.h(r14);
    }

    @Override // defpackage.wd
    public boolean o(View r1, int r2, int r3) {
        if (r2 != 2) goto L6;
        return true;
    L6:
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context r1, AttributeSet r2) {
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
    }
}
