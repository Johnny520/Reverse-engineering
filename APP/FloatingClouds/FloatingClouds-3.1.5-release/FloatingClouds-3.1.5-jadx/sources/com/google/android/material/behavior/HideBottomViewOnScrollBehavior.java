package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1247R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.C0685l6;
import p000a.C0869v0;
import p000a.C0888w0;
import p000a.C0899wb;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC1059c<V> {

    /* JADX INFO: renamed from: i */
    public static final int f5385i = C1247R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: j */
    public static final int f5386j = C1247R.attr.motionDurationMedium4;

    /* JADX INFO: renamed from: k */
    public static final int f5387k = C1247R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet<InterfaceC1254a> f5388a;

    /* JADX INFO: renamed from: b */
    public int f5389b;

    /* JADX INFO: renamed from: c */
    public int f5390c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f5391d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f5392e;

    /* JADX INFO: renamed from: f */
    public int f5393f;

    /* JADX INFO: renamed from: g */
    public int f5394g;

    /* JADX INFO: renamed from: h */
    public ViewPropertyAnimator f5395h;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public interface InterfaceC1254a {
        /* JADX INFO: renamed from: a */
        void m3084a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HideBottomViewOnScrollBehavior() {
        this.f5388a = new LinkedHashSet<>();
        this.f5393f = 0;
        this.f5394g = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: h */
    public boolean mo371h(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f5393f = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.f5389b = C0899wb.m2187c(v.getContext(), f5385i, 225);
        this.f5390c = C0899wb.m2187c(v.getContext(), f5386j, 175);
        Context context = v.getContext();
        C0685l6 c0685l6 = C0888w0.f3471d;
        int i2 = f5387k;
        this.f5391d = C0899wb.m2188d(context, i2, c0685l6);
        this.f5392e = C0899wb.m2188d(v.getContext(), i2, C0888w0.f3470c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: l */
    public final void mo2462l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet<InterfaceC1254a> linkedHashSet = this.f5388a;
        if (i > 0) {
            if (this.f5394g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f5395h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f5394g = 1;
            Iterator<InterfaceC1254a> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().m3084a();
            }
            this.f5395h = view.animate().translationY(this.f5393f).setInterpolator(this.f5392e).setDuration(this.f5390c).setListener(new C0869v0(2, this));
            return;
        }
        if (i >= 0 || this.f5394g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f5395h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f5394g = 2;
        Iterator<InterfaceC1254a> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            it2.next().m3084a();
        }
        this.f5395h = view.animate().translationY(0).setInterpolator(this.f5391d).setDuration(this.f5389b).setListener(new C0869v0(2, this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: p */
    public boolean mo2466p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5388a = new LinkedHashSet<>();
        this.f5393f = 0;
        this.f5394g = 2;
    }
}
