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
    public int f2276d = 2;

    /* JADX INFO: renamed from: e */
    public final float f2277e = 0.5f;

    /* JADX INFO: renamed from: f */
    public float f2278f = 0.0f;

    /* JADX INFO: renamed from: g */
    public float f2279g = 0.5f;

    /* JADX INFO: renamed from: h */
    public final C0968a f2280h = new C0968a(this);

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: f */
    public boolean mo1815f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM1172n = this.f2274b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM1172n = coordinatorLayout.m1172n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2274b = zM1172n;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2274b = false;
        }
        if (!zM1172n) {
            return false;
        }
        if (this.f2273a == null) {
            this.f2273a = new C0245e(coordinatorLayout.getContext(), coordinatorLayout, this.f2280h);
        }
        return !this.f2275c && this.f2273a.m683o(motionEvent);
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        Field field = AbstractC0080Q.f219a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC0080Q.m288g(view, 1048576);
            AbstractC0080Q.m286e(view, 0);
            if (mo1831r(view)) {
                AbstractC0080Q.m289h(view, C0151e.f349j, new C0095d(20, this));
            }
        }
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: q */
    public final boolean mo1824q(View view, MotionEvent motionEvent) {
        if (this.f2273a == null) {
            return false;
        }
        if (this.f2275c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2273a.m677i(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo1831r(View view) {
        return true;
    }
}
