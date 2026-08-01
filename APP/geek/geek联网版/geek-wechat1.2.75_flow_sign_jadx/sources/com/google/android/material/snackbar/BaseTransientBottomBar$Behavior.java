package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.AbstractC0660r7;
import p000.C0318i0;
import p000.C0893xh;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h */
    public final C0893xh f1092h;

    public BaseTransientBottomBar$Behavior() {
        C0893xh c0893xh = new C0893xh(16);
        this.f935e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f936f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f934d = 0;
        this.f1092h = c0893xh;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.AbstractC0889xd
    /* JADX INFO: renamed from: f */
    public final boolean mo654f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f1092h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0318i0.f2293b == null) {
                    C0318i0.f2293b = new C0318i0();
                }
                synchronized (C0318i0.f2293b.f2294a) {
                }
            }
        } else if (coordinatorLayout.m207o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0318i0.f2293b == null) {
                C0318i0.f2293b = new C0318i0();
            }
            synchronized (C0318i0.f2293b.f2294a) {
            }
        }
        return super.mo654f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: r */
    public final boolean mo670r(View view) {
        this.f1092h.getClass();
        return view instanceof AbstractC0660r7;
    }
}
