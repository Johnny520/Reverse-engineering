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

    /* JADX INFO: renamed from: e */
    public int f4395e;

    /* JADX INFO: renamed from: f */
    public int f4396f;

    /* JADX INFO: renamed from: g */
    public TimeInterpolator f4397g;

    /* JADX INFO: renamed from: h */
    public TimeInterpolator f4398h;

    /* JADX INFO: renamed from: k */
    public ViewPropertyAnimator f4401k;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f4394d = new LinkedHashSet();

    /* JADX INFO: renamed from: i */
    public int f4399i = 0;

    /* JADX INFO: renamed from: j */
    public int f4400j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.f4392b == null) {
            this.f4392b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f4392b;
        if (accessibilityManager != null && this.f4393c == null) {
            AccessibilityManagerTouchExplorationStateChangeListenerC2807zk accessibilityManagerTouchExplorationStateChangeListenerC2807zk = new AccessibilityManagerTouchExplorationStateChangeListenerC2807zk(this, view, 1);
            this.f4393c = accessibilityManagerTouchExplorationStateChangeListenerC2807zk;
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2807zk);
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(5, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((C0834Tb) view.getLayoutParams()).f2647c;
        if (i2 == 80 || i2 == 81) {
            m2424r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            m2424r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f4399i = this.f4391a.mo36n(view, marginLayoutParams);
        this.f4395e = AbstractC0714Qj.m1473D(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f4396f = AbstractC0714Qj.m1473D(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f4397g = AbstractC0714Qj.m1474E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2456d);
        this.f4398h = AbstractC0714Qj.m1474E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2455c);
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: k */
    public final void mo1463k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                m2425s(view);
                return;
            }
            return;
        }
        if (this.f4400j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f4392b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f4401k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f4400j = 1;
            Iterator it = this.f4394d.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f4401k = this.f4391a.mo38q(view, this.f4399i).setInterpolator(this.f4398h).setDuration(this.f4396f).setListener(new C2437r0(4, this));
        }
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: o */
    public final boolean mo1467o(View view, int i, int i2) {
        return i == 2;
    }

    /* JADX INFO: renamed from: r */
    public final void m2424r(int i) {
        AbstractC0671Pj abstractC0671Pj = this.f4391a;
        if (abstractC0671Pj == null || abstractC0671Pj.mo37p() != i) {
            if (i == 0) {
                this.f4391a = new C0027Ak(2);
            } else if (i == 1) {
                this.f4391a = new C0027Ak(0);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.f4391a = new C0027Ak(1);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2425s(View view) {
        if (this.f4400j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4401k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f4400j = 2;
        Iterator it = this.f4394d.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f4391a.getClass();
        this.f4401k = this.f4391a.mo38q(view, 0).setInterpolator(this.f4397g).setDuration(this.f4395e).setListener(new C2437r0(4, this));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
