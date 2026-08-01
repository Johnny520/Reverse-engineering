package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p000.AbstractC0889xd;
import p000.C0281h0;
import p000.C0431l0;
import p000.oa0;
import p000.ra0;
import p000.u50;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0889xd {

    /* JADX INFO: renamed from: a */
    public ra0 f931a;

    /* JADX INFO: renamed from: b */
    public boolean f932b;

    /* JADX INFO: renamed from: c */
    public boolean f933c;

    /* JADX INFO: renamed from: d */
    public int f934d = 2;

    /* JADX INFO: renamed from: e */
    public float f935e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f936f = 0.5f;

    /* JADX INFO: renamed from: g */
    public final u50 f937g = new u50(this);

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: f */
    public boolean mo654f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM207o = this.f932b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM207o = coordinatorLayout.m207o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f932b = zM207o;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f932b = false;
        }
        if (zM207o) {
            if (this.f931a == null) {
                this.f931a = new ra0(coordinatorLayout.getContext(), coordinatorLayout, this.f937g);
            }
            if (!this.f933c && this.f931a.m2281p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: g */
    public final boolean mo655g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = oa0.f3426a;
        if (x90.m2655c(view) == 0) {
            x90.m2671s(view, 1);
            oa0.m2009i(view, 1048576);
            oa0.m2007g(view, 0);
            if (mo670r(view)) {
                oa0.m2010j(view, C0281h0.f2073j, new C0431l0(26, this));
            }
        }
        return false;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: q */
    public final boolean mo663q(View view, MotionEvent motionEvent) {
        if (this.f931a == null) {
            return false;
        }
        if (this.f933c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f931a.m2275j(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo670r(View view) {
        return true;
    }
}
