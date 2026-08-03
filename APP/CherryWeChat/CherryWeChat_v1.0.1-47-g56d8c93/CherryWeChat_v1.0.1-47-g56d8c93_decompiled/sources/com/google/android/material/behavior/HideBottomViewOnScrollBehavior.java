package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.github.cherrywechat.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC0706Qb;
import p000.AbstractC0714Qj;
import p000.AbstractC0776S2;
import p000.AccessibilityManagerTouchExplorationStateChangeListenerC2807zk;
import p000.C2437r0;
import p000.ViewOnAttachStateChangeListenerC0995X6;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0706Qb {

    /* JADX INFO: renamed from: b */
    public int f4381b;

    /* JADX INFO: renamed from: c */
    public int f4382c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f4383d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f4384e;

    /* JADX INFO: renamed from: g */
    public AccessibilityManager f4386g;

    /* JADX INFO: renamed from: h */
    public AccessibilityManagerTouchExplorationStateChangeListenerC2807zk f4387h;

    /* JADX INFO: renamed from: k */
    public ViewPropertyAnimator f4390k;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f4380a = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public int f4385f = 0;

    /* JADX INFO: renamed from: i */
    public final boolean f4388i = true;

    /* JADX INFO: renamed from: j */
    public int f4389j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public boolean mo1459g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f4385f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f4381b = AbstractC0714Qj.m1473D(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f4382c = AbstractC0714Qj.m1473D(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f4383d = AbstractC0714Qj.m1474E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2456d);
        this.f4384e = AbstractC0714Qj.m1474E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2455c);
        if (this.f4386g == null) {
            this.f4386g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f4386g;
        if (accessibilityManager == null || this.f4387h != null) {
            return false;
        }
        AccessibilityManagerTouchExplorationStateChangeListenerC2807zk accessibilityManagerTouchExplorationStateChangeListenerC2807zk = new AccessibilityManagerTouchExplorationStateChangeListenerC2807zk(this, view, 0);
        this.f4387h = accessibilityManagerTouchExplorationStateChangeListenerC2807zk;
        accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2807zk);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(4, this));
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: k */
    public final void mo1463k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                m2423r(view);
                return;
            }
            return;
        }
        if (this.f4389j == 1) {
            return;
        }
        if (this.f4388i && (accessibilityManager = this.f4386g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4390k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f4389j = 1;
        Iterator it = this.f4380a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f4390k = view.animate().translationY(this.f4385f).setInterpolator(this.f4384e).setDuration(this.f4382c).setListener(new C2437r0(3, this));
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: o */
    public boolean mo1467o(View view, int i, int i2) {
        return i == 2;
    }

    /* JADX INFO: renamed from: r */
    public final void m2423r(View view) {
        if (this.f4389j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4390k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f4389j = 2;
        Iterator it = this.f4380a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f4390k = view.animate().translationY(0).setInterpolator(this.f4383d).setDuration(this.f4381b).setListener(new C2437r0(3, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
