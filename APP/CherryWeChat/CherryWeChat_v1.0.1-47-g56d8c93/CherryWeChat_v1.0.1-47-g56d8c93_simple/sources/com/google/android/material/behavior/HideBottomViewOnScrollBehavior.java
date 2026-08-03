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

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f4380a;

    /* JADX INFO: renamed from: b */
    public int f4381b;

    /* JADX INFO: renamed from: c */
    public int f4382c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f4383d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f4384e;

    /* JADX INFO: renamed from: f */
    public int f4385f;

    /* JADX INFO: renamed from: g */
    public AccessibilityManager f4386g;

    /* JADX INFO: renamed from: h */
    public AccessibilityManagerTouchExplorationStateChangeListenerC2807zk f4387h;

    /* JADX INFO: renamed from: i */
    public final boolean f4388i;

    /* JADX INFO: renamed from: j */
    public int f4389j;

    /* JADX INFO: renamed from: k */
    public ViewPropertyAnimator f4390k;

    public HideBottomViewOnScrollBehavior() {
        this.f4380a = new LinkedHashSet();
        this.f4385f = 0;
        this.f4388i = true;
        this.f4389j = 2;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public boolean mo1459g(CoordinatorLayout r2, View r3, int r4) {
        ViewGroup.MarginLayoutParams r22 = (ViewGroup.MarginLayoutParams) r3.getLayoutParams();
        this.f4385f = r3.getMeasuredHeight() + r22.bottomMargin;
        this.f4381b = AbstractC0714Qj.m1473D(r3.getContext(), R.attr.motionDurationLong2, 225);
        this.f4382c = AbstractC0714Qj.m1473D(r3.getContext(), R.attr.motionDurationMedium4, 175);
        this.f4383d = AbstractC0714Qj.m1474E(r3.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2456d);
        this.f4384e = AbstractC0714Qj.m1474E(r3.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2455c);
        if (this.f4386g != null) goto L5;
        this.f4386g = (AccessibilityManager) r3.getContext().getSystemService(AccessibilityManager.class);
    L5:
        AccessibilityManager r23 = this.f4386g;
        if (r23 != null) goto L8;
        return false;
    L8:
        if (this.f4387h != null) goto L13;
        AccessibilityManagerTouchExplorationStateChangeListenerC2807zk r42 = new AccessibilityManagerTouchExplorationStateChangeListenerC2807zk(this, r3, 0);
        this.f4387h = r42;
        r23.addTouchExplorationStateChangeListener(r42);
        r3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(4, this));
        return false;
    L13:
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: k */
    public final void mo1463k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
        if (r3 > 0) goto L4;
        if (r3 >= 0) goto L25;
        m2423r(r2);
        return;
    L25:
        return;
    L4:
        if (this.f4389j != 1) goto L7;
        return;
    L7:
        if (this.f4388i == false) goto L13;
        AccessibilityManager r12 = this.f4386g;
        if (r12 == null) goto L13;
        if (r12.isTouchExplorationEnabled() == false) goto L13;
        return;
    L13:
        ViewPropertyAnimator r13 = this.f4390k;
        if (r13 == null) goto L16;
        r13.cancel();
        r2.clearAnimation();
    L16:
        this.f4389j = 1;
        Iterator r14 = this.f4380a.iterator();
        if (r14.hasNext() == true) goto L20;
        int r15 = this.f4385f;
        this.f4390k = r2.animate().translationY(r15).setInterpolator(this.f4384e).setDuration(this.f4382c).setListener(new C2437r0(3, this));
        return;
    L20:
        r14.next().getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: o */
    public boolean mo1467o(View r1, int r2, int r3) {
        if (r2 != 2) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m2423r(View r5) {
        if (this.f4389j != 2) goto L5;
        return;
    L5:
        ViewPropertyAnimator r0 = this.f4390k;
        if (r0 == null) goto L8;
        r0.cancel();
        r5.clearAnimation();
    L8:
        this.f4389j = 2;
        Iterator r02 = this.f4380a.iterator();
        if (r02.hasNext() == true) goto L12;
        this.f4390k = r5.animate().translationY(0).setInterpolator(this.f4383d).setDuration(this.f4381b).setListener(new C2437r0(3, this));
        return;
    L12:
        r02.next().getClass();
        throw new ClassCastException();
    }

    public HideBottomViewOnScrollBehavior(Context r1, AttributeSet r2) {
        this.f4380a = new LinkedHashSet();
        this.f4385f = 0;
        this.f4388i = true;
        this.f4389j = 2;
    }
}
