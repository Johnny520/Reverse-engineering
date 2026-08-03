package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.AbstractC0706Qb;
import p000.AbstractC2185lE;
import p000.C0687Pz;
import p000.C0902V;
import p000.C1017Xm;
import p000.C2228mE;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0706Qb {

    /* JADX INFO: renamed from: a */
    public C2228mE f4402a;

    /* JADX INFO: renamed from: b */
    public boolean f4403b;

    /* JADX INFO: renamed from: c */
    public boolean f4404c;

    /* JADX INFO: renamed from: d */
    public int f4405d = 2;

    /* JADX INFO: renamed from: e */
    public float f4406e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f4407f = 0.5f;

    /* JADX INFO: renamed from: g */
    public final C0687Pz f4408g = new C0687Pz(this);

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    public boolean mo1458f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM2138n = this.f4403b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM2138n = coordinatorLayout.m2138n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f4403b = zM2138n;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4403b = false;
        }
        if (zM2138n) {
            if (this.f4402a == null) {
                this.f4402a = new C2228mE(coordinatorLayout.getContext(), coordinatorLayout, this.f4408g);
            }
            if (!this.f4404c && this.f4402a.m4500o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC2185lE.m4396i(view, 1048576);
            AbstractC2185lE.m4393f(view, 0);
            if (mo2426r(view)) {
                AbstractC2185lE.m4397j(view, C0902V.f2807j, new C1017Xm(16, this));
            }
        }
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: q */
    public final boolean mo1469q(View view, MotionEvent motionEvent) {
        if (this.f4402a == null) {
            return false;
        }
        if (this.f4404c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f4402a.m4494i(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo2426r(View view) {
        return true;
    }
}
