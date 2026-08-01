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
import p000.AbstractC0126ct;
import p000.AbstractC0619q2;
import p000.AbstractC0852wd;
import p000.C0913y0;
import p000.z30;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0852wd {

    /* JADX INFO: renamed from: b */
    public int f999b;

    /* JADX INFO: renamed from: c */
    public int f1000c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f1001d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f1002e;

    /* JADX INFO: renamed from: h */
    public ViewPropertyAnimator f1005h;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f998a = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public int f1003f = 0;

    /* JADX INFO: renamed from: g */
    public int f1004g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: g */
    public boolean mo697g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1003f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f999b = AbstractC0126ct.m824v(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f1000c = AbstractC0126ct.m824v(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1001d = AbstractC0126ct.m825w(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0619q2.f3974d);
        this.f1002e = AbstractC0126ct.m825w(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0619q2.f3973c);
        return false;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: k */
    public final void mo700k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f998a;
        if (i > 0) {
            if (this.f1004g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f1005h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1004g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw z30.m2763h(it);
            }
            this.f1005h = view.animate().translationY(this.f1003f).setInterpolator(this.f1002e).setDuration(this.f1000c).setListener(new C0913y0(3, this));
            return;
        }
        if (i >= 0 || this.f1004g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f1005h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1004g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw z30.m2763h(it2);
        }
        this.f1005h = view.animate().translationY(0).setInterpolator(this.f1001d).setDuration(this.f999b).setListener(new C0913y0(3, this));
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: o */
    public boolean mo703o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
