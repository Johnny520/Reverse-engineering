package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p201.C7873;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7027(C7873 c7873) {
        if (c7873.f21661 == 0) {
            c7873.f21661 = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p201.AbstractC7876
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6998(View view) {
        if (view.getVisibility() != 8) {
            return;
        }
        C5925.m11311("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
