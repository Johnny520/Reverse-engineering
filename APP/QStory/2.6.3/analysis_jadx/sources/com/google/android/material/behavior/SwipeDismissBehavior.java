package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2270;
import p155.C7610;
import p169.C7717;
import p201.AbstractC7876;
import p230.C8049;
import p316.C8665;
import p316.InterfaceC8664;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC7876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f10012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f10013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7717 f10014;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f10011 = 2;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f10010 = 0.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f10009 = 0.5f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8665 f10015 = new C8665(this);

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean mo7007(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM3941 = this.f10013;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM3941 = coordinatorLayout.m3941(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f10013 = zM3941;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f10013 = false;
        }
        if (zM3941) {
            if (this.f10014 == null) {
                this.f10014 = new C7717(coordinatorLayout.getContext(), coordinatorLayout, this.f10015);
            }
            if (!this.f10012 && this.f10014.m13027(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean mo7008(View view, MotionEvent motionEvent) {
        if (this.f10014 == null) {
            return false;
        }
        if (this.f10012 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f10014.m13033(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean mo7009(View view) {
        return true;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6993(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC2270.m4248(view, 1048576);
            AbstractC2270.m4249(view, 0);
            if (mo7009(view)) {
                AbstractC2270.m4239(view, C7610.f20640, new C8049(this, 13));
            }
        }
        return false;
    }

    public void setListener(InterfaceC8664 interfaceC8664) {
    }
}
