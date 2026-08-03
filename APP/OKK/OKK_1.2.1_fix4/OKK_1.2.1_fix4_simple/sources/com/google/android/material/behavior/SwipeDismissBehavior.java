package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p008E.C0151e;
import p021L.C0245e;
import p064j0.C0968a;
import p078r.AbstractC1058a;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC1058a {

    /* JADX INFO: renamed from: a */
    public C0245e f2273a;

    /* JADX INFO: renamed from: b */
    public boolean f2274b;

    /* JADX INFO: renamed from: c */
    public boolean f2275c;

    /* JADX INFO: renamed from: d */
    public int f2276d;

    /* JADX INFO: renamed from: e */
    public final float f2277e;

    /* JADX INFO: renamed from: f */
    public float f2278f;

    /* JADX INFO: renamed from: g */
    public float f2279g;

    /* JADX INFO: renamed from: h */
    public final C0968a f2280h;

    public SwipeDismissBehavior() {
        this.f2276d = 2;
        this.f2277e = 0.5f;
        this.f2278f = 0.0f;
        this.f2279g = 0.5f;
        this.f2280h = new C0968a(this);
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: f */
    public boolean mo1815f(CoordinatorLayout r5, View r6, MotionEvent r7) {
        boolean r02 = this.f2274b;
        int r1 = r7.getActionMasked();
        if (r1 == 0) goto L9;
        if (r1 != 1) goto L6;
    L8:
        this.f2274b = false;
    L10:
        if (r02 == true) goto L12;
        return false;
    L12:
        if (this.f2273a != null) goto L15;
        this.f2273a = new C0245e(r5.getContext(), r5, this.f2280h);
    L15:
        if (this.f2275c == true) goto L20;
        if (this.f2273a.m683o(r7) == false) goto L20;
        return true;
    L20:
        return false;
    L6:
        if (r1 == 3) goto L8;
    L9:
        r02 = r5.m1172n(r6, (int) r7.getX(), (int) r7.getY());
        this.f2274b = r02;
        goto L10
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout r3, View r4, int r5) {
        Field r32 = AbstractC0080Q.f219a;
        if (r4.getImportantForAccessibility() != 0) goto L7;
        r4.setImportantForAccessibility(1);
        AbstractC0080Q.m288g(r4, 1048576);
        AbstractC0080Q.m286e(r4, 0);
        if (mo1831r(r4) == false) goto L7;
        AbstractC0080Q.m289h(r4, C0151e.f349j, new C0095d(20, this));
    L7:
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: q */
    public final boolean mo1824q(View r2, MotionEvent r3) {
        if (this.f2273a != null) goto L5;
        return false;
    L5:
        if (this.f2275c == true) goto L7;
    L8:
        this.f2273a.m677i(r3);
        return true;
    L7:
        if (r3.getActionMasked() != 3) goto L8;
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo1831r(View r1) {
        return true;
    }
}
