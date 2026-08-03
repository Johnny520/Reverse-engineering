package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.AbstractC0049B5;
import p000.C0774S0;
import p000.C1456gf;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h */
    public final C1456gf f4584h;

    public BaseTransientBottomBar$Behavior() {
        C1456gf c1456gf = new C1456gf(23);
        this.f4406e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f4407f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f4405d = 0;
        this.f4584h = c1456gf;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    public final boolean mo1458f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f4584h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0774S0.f2447b == null) {
                    C0774S0.f2447b = new C0774S0();
                }
                synchronized (C0774S0.f2447b.f2448a) {
                }
            }
        } else if (coordinatorLayout.m2138n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0774S0.f2447b == null) {
                C0774S0.f2447b = new C0774S0();
            }
            synchronized (C0774S0.f2447b.f2448a) {
            }
        }
        return super.mo1458f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: r */
    public final boolean mo2426r(View view) {
        this.f4584h.getClass();
        return view instanceof AbstractC0049B5;
    }
}
