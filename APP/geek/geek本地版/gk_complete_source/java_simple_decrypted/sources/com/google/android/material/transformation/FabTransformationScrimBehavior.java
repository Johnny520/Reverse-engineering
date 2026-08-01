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

    @Override // defpackage.wd
    public final boolean q(View r1, MotionEvent r2) {
        return false;
    }

    public FabTransformationScrimBehavior(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.wd
    public final void b(View r1) {
    }
}
