package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p091.C7790;
import p140.C8242;
import p322.AbstractC9477;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C7790 f10925;

    public BaseTransientBottomBar$Behavior() {
        C7790 c7790 = new C7790(21);
        this.f10355 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f10354 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f10356 = 0;
        this.f10925 = c7790;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo7566(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f10925.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C8242.f20443 == null) {
                    C8242.f20443 = new C8242();
                }
                synchronized (C8242.f20443.f20444) {
                }
            }
        } else if (coordinatorLayout.m4501(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C8242.f20443 == null) {
                C8242.f20443 = new C8242();
            }
            synchronized (C8242.f20443.f20444) {
            }
        }
        return super.mo7566(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo7568(View view) {
        this.f10925.getClass();
        return view instanceof AbstractC9477;
    }
}
