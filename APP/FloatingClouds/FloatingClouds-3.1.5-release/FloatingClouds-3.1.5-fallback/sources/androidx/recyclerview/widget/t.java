package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.recyclerview.widget.o {
    public final /* synthetic */ androidx.recyclerview.widget.u q;

    public t(androidx.recyclerview.widget.u r1, android.content.Context r2) {
            r0 = this;
            r0.q = r1
            r0.<init>(r2)
            return
    }

    @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.v
    public final void c(android.view.View r7, androidx.recyclerview.widget.RecyclerView.v.a r8) {
            r6 = this;
            androidx.recyclerview.widget.u r0 = r6.q
            androidx.recyclerview.widget.RecyclerView r1 = r0.f951a
            androidx.recyclerview.widget.RecyclerView$l r1 = r1.getLayoutManager()
            int[] r7 = r0.a(r1, r7)
            r0 = 0
            r0 = r7[r0]
            r1 = 1
            r7 = r7[r1]
            int r2 = java.lang.Math.abs(r0)
            int r3 = java.lang.Math.abs(r7)
            int r2 = java.lang.Math.max(r2, r3)
            int r2 = r6.i(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L3c
            android.view.animation.DecelerateInterpolator r3 = r6.j
            r8.f981a = r0
            r8.b = r7
            r8.c = r2
            r8.e = r3
            r8.f = r1
        L3c:
            return
    }

    @Override // androidx.recyclerview.widget.o
    public final float h(android.util.DisplayMetrics r2) {
            r1 = this;
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            return r0
    }

    @Override // androidx.recyclerview.widget.o
    public final int i(int r2) {
            r1 = this;
            r0 = 100
            int r2 = super.i(r2)
            int r2 = java.lang.Math.min(r0, r2)
            return r2
    }
}
