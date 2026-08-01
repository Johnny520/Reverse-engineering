package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2270;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034.AbstractC6344;
import p201.C7873;
import p314.AbstractC8661;
import p318.AbstractC8673;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC8673 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f9946;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8661.f24412);
        this.f9946 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m6996(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean mo6997(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((C7873) view2.getLayoutParams()).f21657 instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f9946;
            int iM11887 = bottom - (i == 0 ? 0 : AbstractC6344.m11887((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            view.offsetTopAndBottom(iM11887);
        }
        return false;
    }

    @Override // p318.AbstractC8673
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo6999(CoordinatorLayout coordinatorLayout, View view, int i) {
        m6996(coordinatorLayout.m3945(view));
        coordinatorLayout.m3939(view, i);
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo6992(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m6996(coordinatorLayout.m3945(view));
        return false;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo7000(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        m6996(coordinatorLayout.m3945(view));
        return false;
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo6998(View view) {
    }

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }
}
