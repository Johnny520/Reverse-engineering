package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p008E.C0158l;
import p072n0.C1008c;
import p092z0.AbstractC1145c;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: i */
    public final C1008c f2431i;

    public BaseTransientBottomBar$Behavior() {
        C1008c c1008c = new C1008c();
        this.f2278f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2279g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2276d = 0;
        this.f2431i = c1008c;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p078r.AbstractC1058a
    /* JADX INFO: renamed from: f */
    public final boolean mo1815f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2431i.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0158l.f361b == null) {
                    C0158l.f361b = new C0158l(1);
                }
                synchronized (C0158l.f361b.f362a) {
                }
            }
        } else if (coordinatorLayout.m1172n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0158l.f361b == null) {
                C0158l.f361b = new C0158l(1);
            }
            synchronized (C0158l.f361b.f362a) {
            }
        }
        return super.mo1815f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: r */
    public final boolean mo1831r(View view) {
        this.f2431i.getClass();
        return view instanceof AbstractC1145c;
    }
}
