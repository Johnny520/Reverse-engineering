package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC3103;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p050.AbstractC7173;
import p217.C8702;
import p330.AbstractC9490;
import p334.AbstractC9502;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC9502 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f10291;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9490.f24757);
        this.f10291 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m7555(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean mo7556(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((C8702) view2.getLayoutParams()).f22002 instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f10291;
            int iM12446 = bottom - (i == 0 ? 0 : AbstractC7173.m12446((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            view.offsetTopAndBottom(iM12446);
        }
        return false;
    }

    @Override // p334.AbstractC9502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo7558(CoordinatorLayout coordinatorLayout, View view, int i) {
        m7555(coordinatorLayout.m4505(view));
        coordinatorLayout.m4499(view, i);
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo7551(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m7555(coordinatorLayout.m4505(view));
        return false;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean mo7559(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        m7555(coordinatorLayout.m4505(view));
        return false;
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7557(View view) {
    }

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }
}
