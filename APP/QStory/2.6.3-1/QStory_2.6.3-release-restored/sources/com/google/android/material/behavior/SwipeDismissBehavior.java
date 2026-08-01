package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC3103;
import p171.C8439;
import p185.C8546;
import p217.AbstractC8705;
import p246.C8878;
import p332.C9494;
import p332.InterfaceC9493;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC8705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f10357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f10358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8546 f10359;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f10356 = 2;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f10355 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f10354 = 0.5f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C9494 f10360 = new C9494(this);

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean mo7566(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM4501 = this.f10358;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM4501 = coordinatorLayout.m4501(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f10358 = zM4501;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10358 = false;
        }
        if (zM4501) {
            if (this.f10359 == null) {
                this.f10359 = new C8546(coordinatorLayout.getContext(), coordinatorLayout, this.f10360);
            }
            if (!this.f10357 && this.f10359.m13586(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo7567(View view, MotionEvent motionEvent) {
        if (this.f10359 == null) {
            return false;
        }
        if (this.f10357 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f10359.m13592(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean mo7568(View view) {
        return true;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7552(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC3103.m4808(view, 1048576);
            AbstractC3103.m4809(view, 0);
            if (mo7568(view)) {
                AbstractC3103.m4799(view, C8439.f20985, new C8878(this, 13));
            }
        }
        return false;
    }

    public void setListener(InterfaceC9493 interfaceC9493) {
    }
}
