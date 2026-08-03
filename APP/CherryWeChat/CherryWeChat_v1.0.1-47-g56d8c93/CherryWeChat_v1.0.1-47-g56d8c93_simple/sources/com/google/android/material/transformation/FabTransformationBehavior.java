package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p000.C0834Tb;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, p000.AbstractC0706Qb
    /* JADX INFO: renamed from: b */
    public final void mo1454b(View r2) {
        if (r2.getVisibility() == 8) goto L6;
        return;
    L6:
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: c */
    public final void mo1455c(C0834Tb r2) {
        if (r2.f2652h != 0) goto L6;
        r2.f2652h = 80;
        return;
    }

    public FabTransformationBehavior(Context r1, AttributeSet r2) {
        super(r1, r2);
        new Rect();
        new RectF();
        new RectF();
    }
}
