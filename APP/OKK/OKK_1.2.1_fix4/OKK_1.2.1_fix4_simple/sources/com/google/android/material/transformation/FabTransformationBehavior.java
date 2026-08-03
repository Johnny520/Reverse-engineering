package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p078r.C1061d;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p078r.AbstractC1058a
    /* JADX INFO: renamed from: b */
    public final void mo1826b(View r2) {
        if (r2.getVisibility() == 8) goto L6;
        return;
    L6:
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: c */
    public final void mo1843c(C1061d r2) {
        if (r2.f4071h != 0) goto L6;
        r2.f4071h = 80;
        return;
    }

    public FabTransformationBehavior(Context r1, AttributeSet r2) {
        super(r1, r2);
        new Rect();
        new RectF();
        new RectF();
    }
}
