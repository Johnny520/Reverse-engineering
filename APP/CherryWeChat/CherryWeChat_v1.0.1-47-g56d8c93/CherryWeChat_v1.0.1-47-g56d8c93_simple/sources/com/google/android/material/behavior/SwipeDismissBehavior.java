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
    public int f4405d;

    /* JADX INFO: renamed from: e */
    public float f4406e;

    /* JADX INFO: renamed from: f */
    public float f4407f;

    /* JADX INFO: renamed from: g */
    public final C0687Pz f4408g;

    public SwipeDismissBehavior() {
        this.f4405d = 2;
        this.f4406e = 0.0f;
        this.f4407f = 0.5f;
        this.f4408g = new C0687Pz(this);
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    public boolean mo1458f(CoordinatorLayout r5, View r6, MotionEvent r7) {
        boolean r0 = this.f4403b;
        int r1 = r7.getActionMasked();
        if (r1 == 0) goto L9;
        if (r1 != 1) goto L6;
    L8:
        this.f4403b = false;
    L10:
        if (r0 == true) goto L12;
    L19:
        return false;
    L12:
        if (this.f4402a != null) goto L15;
        this.f4402a = new C2228mE(r5.getContext(), r5, this.f4408g);
    L15:
        if (this.f4404c == true) goto L19;
        if (this.f4402a.m4500o(r7) == false) goto L19;
        return true;
    L6:
        if (r1 == 3) goto L8;
    L9:
        r0 = r5.m2138n(r6, (int) r7.getX(), (int) r7.getY());
        this.f4403b = r0;
        goto L10
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout r3, View r4, int r5) {
        if (r4.getImportantForAccessibility() != 0) goto L7;
        r4.setImportantForAccessibility(1);
        AbstractC2185lE.m4396i(r4, 1048576);
        AbstractC2185lE.m4393f(r4, 0);
        if (mo2426r(r4) == false) goto L7;
        AbstractC2185lE.m4397j(r4, C0902V.f2807j, new C1017Xm(16, this));
    L7:
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: q */
    public final boolean mo1469q(View r2, MotionEvent r3) {
        if (this.f4402a != null) goto L5;
        return false;
    L5:
        if (this.f4404c == true) goto L7;
    L8:
        this.f4402a.m4494i(r3);
        return true;
    L7:
        if (r3.getActionMasked() != 3) goto L8;
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo2426r(View r1) {
        return true;
    }
}
