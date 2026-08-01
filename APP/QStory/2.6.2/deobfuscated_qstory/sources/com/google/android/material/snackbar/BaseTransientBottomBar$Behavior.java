package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p075.C6960;
import p124.C7412;
import p306.AbstractC8656;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6960 f10575;

    public BaseTransientBottomBar$Behavior() {
        C6960 c6960 = new C6960(21);
        this.f10005 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f10004 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f10006 = 0;
        this.f10575 = c6960;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo7020(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f10575.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C7412.f20103 == null) {
                    C7412.f20103 = new C7412();
                }
                synchronized (C7412.f20103.f20104) {
                }
            }
        } else if (coordinatorLayout.m3931(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C7412.f20103 == null) {
                C7412.f20103 = new C7412();
            }
            synchronized (C7412.f20103.f20104) {
            }
        }
        return super.mo7020(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo7022(View view) {
        this.f10575.getClass();
        return view instanceof AbstractC8656;
    }
}
