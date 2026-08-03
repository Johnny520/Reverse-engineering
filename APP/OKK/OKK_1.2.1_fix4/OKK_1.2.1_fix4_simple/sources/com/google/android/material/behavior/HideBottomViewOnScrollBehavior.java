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

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f2265a;

    /* JADX INFO: renamed from: b */
    public int f2266b;

    /* JADX INFO: renamed from: c */
    public int f2267c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f2268d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f2269e;

    /* JADX INFO: renamed from: f */
    public int f2270f;

    /* JADX INFO: renamed from: g */
    public int f2271g;

    /* JADX INFO: renamed from: h */
    public ViewPropertyAnimator f2272h;

    public HideBottomViewOnScrollBehavior() {
        this.f2265a = new LinkedHashSet();
        this.f2270f = 0;
        this.f2271g = 2;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public boolean mo1816g(CoordinatorLayout r2, View r3, int r4) {
        ViewGroup.MarginLayoutParams r22 = (ViewGroup.MarginLayoutParams) r3.getLayoutParams();
        this.f2270f = r3.getMeasuredHeight() + r22.bottomMargin;
        this.f2266b = AbstractC0805P.m2038R(r3.getContext(), C1031R.attr.motionDurationLong2, 225);
        this.f2267c = AbstractC0805P.m2038R(r3.getContext(), C1031R.attr.motionDurationMedium4, 175);
        this.f2268d = AbstractC0805P.m2039S(r3.getContext(), C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3357d);
        this.f2269e = AbstractC0805P.m2039S(r3.getContext(), C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3356c);
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: k */
    public final void mo1819k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
        LinkedHashSet r42 = this.f2265a;
        if (r3 > 0) goto L5;
        if (r3 < 0) goto L17;
        return;
    L17:
        if (this.f2271g == 2) goto L31;
        ViewPropertyAnimator r32 = this.f2272h;
        if (r32 == null) goto L22;
        r32.cancel();
        r2.clearAnimation();
    L22:
        this.f2271g = 2;
        Iterator r33 = r42.iterator();
        if (r33.hasNext() == true) goto L25;
        this.f2272h = r2.animate().translationY(0).setInterpolator(this.f2268d).setDuration(this.f2266b).setListener(new C0038n(3, this));
        return;
    L25:
        AbstractC0324d.m726i(r33.next());
        throw null;
    L31:
        return;
    L5:
        if (this.f2271g == 1) goto L30;
        ViewPropertyAnimator r34 = this.f2272h;
        if (r34 == null) goto L10;
        r34.cancel();
        r2.clearAnimation();
    L10:
        this.f2271g = 1;
        Iterator r35 = r42.iterator();
        if (r35.hasNext() == true) goto L13;
        int r12 = this.f2270f;
        this.f2272h = r2.animate().translationY(r12).setInterpolator(this.f2269e).setDuration(this.f2267c).setListener(new C0038n(3, this));
        return;
    L13:
        AbstractC0324d.m726i(r35.next());
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: o */
    public boolean mo1822o(View r1, int r2, int r3) {
        if (r2 != 2) goto L5;
        return true;
    L5:
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context r1, AttributeSet r2) {
        this.f2265a = new LinkedHashSet();
        this.f2270f = 0;
        this.f2271g = 2;
    }
}
