package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class FabTransformationScrimBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
    public FabTransformationScrimBehavior() {
            r3 = this;
            r3.<init>()
            a.vb r0 = new a.vb
            r1 = 75
            r0.<init>(r1)
            a.vb r0 = new a.vb
            r1 = 0
            r0.<init>(r1)
            return
    }

    public FabTransformationScrimBehavior(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            a.vb r3 = new a.vb
            r0 = 75
            r3.<init>(r0)
            a.vb r3 = new a.vb
            r0 = 0
            r3.<init>(r0)
            return
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(android.view.View r1, android.view.View r2) {
            r0 = this;
            boolean r1 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.MotionEvent r3) {
            r0 = this;
            r1 = 0
            return r1
    }
}
