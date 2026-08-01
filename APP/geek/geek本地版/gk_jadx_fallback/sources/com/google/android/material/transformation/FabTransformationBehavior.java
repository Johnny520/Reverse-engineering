package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            return
    }

    public FabTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            return
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.wd
    public final void b(android.view.View r2) {
            r1 = this;
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L9
            return
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            r2.<init>(r0)
            throw r2
    }

    @Override // defpackage.wd
    public final void c(defpackage.zd r2) {
            r1 = this;
            int r0 = r2.h
            if (r0 != 0) goto L8
            r0 = 80
            r2.h = r0
        L8:
            return
    }
}
