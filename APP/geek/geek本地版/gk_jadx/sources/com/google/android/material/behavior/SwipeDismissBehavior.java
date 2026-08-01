package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p000.AbstractC0852wd;
import p000.C0281h0;
import p000.C0431l0;
import p000.ja0;
import p000.ma0;
import p000.n50;
import p000.s90;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0852wd {

    /* JADX INFO: renamed from: a */
    public ma0 f1006a;

    /* JADX INFO: renamed from: b */
    public boolean f1007b;

    /* JADX INFO: renamed from: c */
    public boolean f1008c;

    /* JADX INFO: renamed from: d */
    public int f1009d = 2;

    /* JADX INFO: renamed from: e */
    public float f1010e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f1011f = 0.5f;

    /* JADX INFO: renamed from: g */
    public final n50 f1012g = new n50(this);

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: f */
    public boolean mo696f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM222o = this.f1007b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM222o = coordinatorLayout.m222o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1007b = zM222o;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1007b = false;
        }
        if (zM222o) {
            if (this.f1006a == null) {
                this.f1006a = new ma0(coordinatorLayout.getContext(), coordinatorLayout, this.f1012g);
            }
            if (!this.f1008c && this.f1006a.m1816p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: g */
    public final boolean mo697g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = ja0.f2600a;
        if (s90.m2311c(view) == 0) {
            s90.m2327s(view, 1);
            ja0.m1572i(view, 1048576);
            ja0.m1570g(view, 0);
            if (mo712r(view)) {
                ja0.m1573j(view, C0281h0.f2185j, new C0431l0(26, this));
            }
        }
        return false;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: q */
    public final boolean mo705q(View view, MotionEvent motionEvent) {
        if (this.f1006a == null) {
            return false;
        }
        if (this.f1008c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f1006a.m1810j(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean mo712r(View view) {
        return true;
    }
}
