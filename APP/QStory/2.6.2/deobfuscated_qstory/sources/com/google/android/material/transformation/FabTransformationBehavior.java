package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p201.C7872;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7040(C7872 c7872) {
        if (c7872.f21664 == 0) {
            c7872.f21664 = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p201.AbstractC7875
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7011(View view) {
        if (view.getVisibility() != 8) {
            return;
        }
        C5919.m11250("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
