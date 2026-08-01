package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ljx.wechatmod.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC0274gu;
import p000.AbstractC0618q2;
import p000.AbstractC0889xd;
import p000.C0913y0;
import p000.g40;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0889xd {

    /* JADX INFO: renamed from: b */
    public int f924b;

    /* JADX INFO: renamed from: c */
    public int f925c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f926d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f927e;

    /* JADX INFO: renamed from: h */
    public ViewPropertyAnimator f930h;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f923a = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public int f928f = 0;

    /* JADX INFO: renamed from: g */
    public int f929g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: g */
    public boolean mo655g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f928f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f924b = AbstractC0274gu.m1302E(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f925c = AbstractC0274gu.m1302E(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f926d = AbstractC0274gu.m1303F(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0618q2.f3773d);
        this.f927e = AbstractC0274gu.m1303F(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0618q2.f3772c);
        return false;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: k */
    public final void mo658k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f923a;
        if (i > 0) {
            if (this.f929g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f930h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f929g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw g40.m1145h(it);
            }
            this.f930h = view.animate().translationY(this.f928f).setInterpolator(this.f927e).setDuration(this.f925c).setListener(new C0913y0(3, this));
            return;
        }
        if (i >= 0 || this.f929g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f930h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f929g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw g40.m1145h(it2);
        }
        this.f930h = view.animate().translationY(0).setInterpolator(this.f926d).setDuration(this.f924b).setListener(new C0913y0(3, this));
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: o */
    public boolean mo661o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
