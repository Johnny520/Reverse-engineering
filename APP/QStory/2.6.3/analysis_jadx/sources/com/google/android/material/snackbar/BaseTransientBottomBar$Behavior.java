package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p075.C6961;
import p124.C7413;
import p306.AbstractC8648;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C6961 f10580;

    public BaseTransientBottomBar$Behavior() {
        C6961 c6961 = new C6961(21);
        this.f10010 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f10009 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f10011 = 0;
        this.f10580 = c6961;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo7007(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f10580.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C7413.f20098 == null) {
                    C7413.f20098 = new C7413();
                }
                synchronized (C7413.f20098.f20099) {
                }
            }
        } else if (coordinatorLayout.m3941(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C7413.f20098 == null) {
                C7413.f20098 = new C7413();
            }
            synchronized (C7413.f20098.f20099) {
            }
        }
        return super.mo7007(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo7009(View view) {
        this.f10580.getClass();
        return view instanceof AbstractC8648;
    }
}
