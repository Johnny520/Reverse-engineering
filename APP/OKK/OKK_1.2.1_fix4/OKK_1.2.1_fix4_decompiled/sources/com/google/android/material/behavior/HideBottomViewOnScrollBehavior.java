package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.C1031R;
import p001A0.C0038n;
import p034S.AbstractC0324d;
import p056f0.AbstractC0805P;
import p060h0.AbstractC0945a;
import p078r.AbstractC1058a;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC1058a {

    /* JADX INFO: renamed from: b */
    public int f2266b;

    /* JADX INFO: renamed from: c */
    public int f2267c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f2268d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f2269e;

    /* JADX INFO: renamed from: h */
    public ViewPropertyAnimator f2272h;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f2265a = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public int f2270f = 0;

    /* JADX INFO: renamed from: g */
    public int f2271g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public boolean mo1816g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        this.f2270f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2266b = AbstractC0805P.m2038R(view.getContext(), C1031R.attr.motionDurationLong2, 225);
        this.f2267c = AbstractC0805P.m2038R(view.getContext(), C1031R.attr.motionDurationMedium4, 175);
        this.f2268d = AbstractC0805P.m2039S(view.getContext(), C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3357d);
        this.f2269e = AbstractC0805P.m2039S(view.getContext(), C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3356c);
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: k */
    public final void mo1819k(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2265a;
        if (i2 > 0) {
            if (this.f2271g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f2272h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2271g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                AbstractC0324d.m726i(it.next());
                throw null;
            }
            this.f2272h = view.animate().translationY(this.f2270f).setInterpolator(this.f2269e).setDuration(this.f2267c).setListener(new C0038n(3, this));
            return;
        }
        if (i2 >= 0 || this.f2271g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f2272h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2271g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            AbstractC0324d.m726i(it2.next());
            throw null;
        }
        this.f2272h = view.animate().translationY(0).setInterpolator(this.f2268d).setDuration(this.f2266b).setListener(new C0038n(3, this));
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: o */
    public boolean mo1822o(View view, int i2, int i3) {
        return i2 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
