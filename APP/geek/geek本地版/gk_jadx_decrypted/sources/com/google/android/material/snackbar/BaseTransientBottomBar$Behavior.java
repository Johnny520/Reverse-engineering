package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.AbstractC0288h7;
import p000.C0318i0;
import p000.C0819vh;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h */
    public final C0819vh f1167h;

    public BaseTransientBottomBar$Behavior() {
        C0819vh c0819vh = new C0819vh(14);
        this.f1010e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f1011f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f1009d = 0;
        this.f1167h = c0819vh;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.AbstractC0852wd
    /* JADX INFO: renamed from: f */
    public final boolean mo696f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f1167h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0318i0.f2323b == null) {
                    C0318i0.f2323b = new C0318i0();
                }
                synchronized (C0318i0.f2323b.f2324a) {
                }
            }
        } else if (coordinatorLayout.m222o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0318i0.f2323b == null) {
                C0318i0.f2323b = new C0318i0();
            }
            synchronized (C0318i0.f2323b.f2324a) {
            }
        }
        return super.mo696f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: r */
    public final boolean mo712r(View view) {
        this.f1167h.getClass();
        return view instanceof AbstractC0288h7;
    }
}
