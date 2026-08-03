package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public FabTransformationScrimBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p078r.AbstractC1058a
    /* JADX INFO: renamed from: b */
    public final void mo1826b(View r1) {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: q */
    public final boolean mo1824q(View r1, MotionEvent r2) {
        return false;
    }

    public FabTransformationScrimBehavior(Context r1, AttributeSet r2) {
        super(r1, r2);
    }
}
