package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p217.C8702;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7586(C8702 c8702) {
        if (c8702.f22006 == 0) {
            c8702.f22006 = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p217.AbstractC8705
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7557(View view) {
        if (view.getVisibility() != 8) {
            return;
        }
        C6755.m11870("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
