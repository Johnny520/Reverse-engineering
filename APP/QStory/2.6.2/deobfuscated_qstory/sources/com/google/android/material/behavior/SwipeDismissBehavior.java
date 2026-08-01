package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2270;
import p155.C7609;
import p169.C7716;
import p201.AbstractC7875;
import p230.C8048;
import p316.C8673;
import p316.InterfaceC8672;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC7875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f10007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f10008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7716 f10009;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f10006 = 2;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f10005 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f10004 = 0.5f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8673 f10010 = new C8673(this);

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean mo7020(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM3931 = this.f10008;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM3931 = coordinatorLayout.m3931(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f10008 = zM3931;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10008 = false;
        }
        if (zM3931) {
            if (this.f10009 == null) {
                this.f10009 = new C7716(coordinatorLayout.getContext(), coordinatorLayout, this.f10010);
            }
            if (!this.f10007 && this.f10009.m12997(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo7021(View view, MotionEvent motionEvent) {
        if (this.f10009 == null) {
            return false;
        }
        if (this.f10007 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f10009.m13003(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean mo7022(View view) {
        return true;
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7006(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC2270.m4238(view, 1048576);
            AbstractC2270.m4239(view, 0);
            if (mo7022(view)) {
                AbstractC2270.m4229(view, C7609.f20645, new C8048(this, 13));
            }
        }
        return false;
    }

    public void setListener(InterfaceC8672 interfaceC8672) {
    }
}
