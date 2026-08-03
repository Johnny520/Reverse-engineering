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

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(android.view.View r3, android.view.View r4) {
            r2 = this;
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L1e
            boolean r0 = r4 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r0 == 0) goto L1c
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            int r4 = r4.getExpandedComponentIdHint()
            if (r4 == 0) goto L1a
            int r3 = r3.getId()
            if (r4 != r3) goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            r3.<init>(r4)
            throw r3
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(androidx.coordinatorlayout.widget.CoordinatorLayout.f r2) {
            r1 = this;
            int r0 = r2.h
            if (r0 != 0) goto L8
            r0 = 80
            r2.h = r0
        L8:
            return
    }
}
