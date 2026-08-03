package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.github.cherrywechat.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC0671Pj;
import p000.AbstractC0706Qb;
import p000.AbstractC0714Qj;
import p000.AbstractC0776S2;
import p000.AbstractC2374ph;
import p000.AccessibilityManagerTouchExplorationStateChangeListenerC2807zk;
import p000.C0027Ak;
import p000.C0834Tb;
import p000.C2437r0;
import p000.ViewOnAttachStateChangeListenerC0995X6;

/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends AbstractC0706Qb {

    /* JADX INFO: renamed from: a */
    public AbstractC0671Pj f4391a;

    /* JADX INFO: renamed from: b */
    public AccessibilityManager f4392b;

    /* JADX INFO: renamed from: c */
    public AccessibilityManagerTouchExplorationStateChangeListenerC2807zk f4393c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f4394d;

    /* JADX INFO: renamed from: e */
    public int f4395e;

    /* JADX INFO: renamed from: f */
    public int f4396f;

    /* JADX INFO: renamed from: g */
    public TimeInterpolator f4397g;

    /* JADX INFO: renamed from: h */
    public TimeInterpolator f4398h;

    /* JADX INFO: renamed from: i */
    public int f4399i;

    /* JADX INFO: renamed from: j */
    public int f4400j;

    /* JADX INFO: renamed from: k */
    public ViewPropertyAnimator f4401k;

    public HideViewOnScrollBehavior() {
        this.f4394d = new LinkedHashSet();
        this.f4399i = 0;
        this.f4400j = 2;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout r4, View r5, int r6) {
        if (this.f4392b != null) goto L5;
        this.f4392b = (AccessibilityManager) r5.getContext().getSystemService(AccessibilityManager.class);
    L5:
        AccessibilityManager r42 = this.f4392b;
        if (r42 != null) goto L8;
    L10:
        ViewGroup.MarginLayoutParams r43 = (ViewGroup.MarginLayoutParams) r5.getLayoutParams();
        int r0 = ((C0834Tb) r5.getLayoutParams()).f2647c;
        if (r0 != 80) goto L13;
    L23:
        m2424r(1);
    L24:
        this.f4399i = this.f4391a.mo36n(r5, r43);
        this.f4395e = AbstractC0714Qj.m1473D(r5.getContext(), R.attr.motionDurationLong2, 225);
        this.f4396f = AbstractC0714Qj.m1473D(r5.getContext(), R.attr.motionDurationMedium4, 175);
        this.f4397g = AbstractC0714Qj.m1474E(r5.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2456d);
        this.f4398h = AbstractC0714Qj.m1474E(r5.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2455c);
        return false;
    L13:
        if (r0 == 81) goto L23;
        int r62 = Gravity.getAbsoluteGravity(r0, r6);
        if (r62 != 3) goto L18;
    L21:
        int r63 = 2;
    L22:
        m2424r(r63);
        goto L24
    L18:
        if (r62 == 19) goto L21;
        r63 = 0;
        goto L22
    L8:
        if (this.f4393c != null) goto L10;
        AccessibilityManagerTouchExplorationStateChangeListenerC2807zk r02 = new AccessibilityManagerTouchExplorationStateChangeListenerC2807zk(this, r5, 1);
        this.f4393c = r02;
        r42.addTouchExplorationStateChangeListener(r02);
        r5.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(5, this));
        goto L10
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: k */
    public final void mo1463k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
        if (r3 > 0) goto L4;
        if (r3 >= 0) goto L23;
        m2425s(r2);
        return;
    L23:
        return;
    L4:
        if (this.f4400j == 1) goto L24;
        AccessibilityManager r12 = this.f4392b;
        if (r12 != null) goto L9;
    L11:
        ViewPropertyAnimator r13 = this.f4401k;
        if (r13 == null) goto L14;
        r13.cancel();
        r2.clearAnimation();
    L14:
        this.f4400j = 1;
        Iterator r14 = this.f4394d.iterator();
        if (r14.hasNext() == true) goto L18;
        int r15 = this.f4399i;
        this.f4401k = this.f4391a.mo38q(r2, r15).setInterpolator(this.f4398h).setDuration(this.f4396f).setListener(new C2437r0(4, this));
        return;
    L18:
        r14.next().getClass();
        throw new ClassCastException();
    L9:
        if (r12.isTouchExplorationEnabled() == false) goto L11;
        return;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: o */
    public final boolean mo1467o(View r1, int r2, int r3) {
        if (r2 != 2) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m2424r(int r4) {
        AbstractC0671Pj r0 = this.f4391a;
        if (r0 != null) goto L5;
    L8:
        if (r4 != 0) goto L10;
        this.f4391a = new C0027Ak(2);
        return;
    L10:
        if (r4 != 1) goto L12;
        this.f4391a = new C0027Ak(0);
        return;
    L12:
        if (r4 != 2) goto L16;
        this.f4391a = new C0027Ak(1);
        return;
    L16:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r4, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
    L5:
        if (r0.mo37p() != r4) goto L8;
    }

    /* JADX INFO: renamed from: s */
    public final void m2425s(View r6) {
        if (this.f4400j != 2) goto L5;
        return;
    L5:
        ViewPropertyAnimator r0 = this.f4401k;
        if (r0 == null) goto L8;
        r0.cancel();
        r6.clearAnimation();
    L8:
        this.f4400j = 2;
        Iterator r02 = this.f4394d.iterator();
        if (r02.hasNext() == true) goto L12;
        this.f4391a.getClass();
        this.f4401k = this.f4391a.mo38q(r6, 0).setInterpolator(this.f4397g).setDuration(this.f4395e).setListener(new C2437r0(4, this));
        return;
    L12:
        r02.next().getClass();
        throw new ClassCastException();
    }

    public HideViewOnScrollBehavior(Context r1, AttributeSet r2) {
        this.f4394d = new LinkedHashSet();
        this.f4399i = 0;
        this.f4400j = 2;
    }
}
