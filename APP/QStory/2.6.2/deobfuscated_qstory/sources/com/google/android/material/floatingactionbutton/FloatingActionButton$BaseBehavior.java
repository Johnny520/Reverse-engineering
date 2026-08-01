package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p201.AbstractC7875;
import p201.C7872;
import p313.AbstractC8668;
import p314.AbstractC8669;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC7875 {
    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8669.f24450);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo7010(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7040(C7872 c7872) {
        if (c7872.f21664 == 0) {
            c7872.f21664 = 80;
        }
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo7160(View view) {
        throw new ClassCastException();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7006(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior() {
    }

    public void setInternalAutoHideListener(AbstractC8668 abstractC8668) {
    }
}
