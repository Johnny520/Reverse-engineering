package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gx extends defpackage.yq {
    public final /* synthetic */ defpackage.hx q;

    public gx(defpackage.hx r1, android.content.Context r2) {
            r0 = this;
            r0.q = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.yq
    public final float d(android.util.DisplayMetrics r2) {
            r1 = this;
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            return r0
    }

    @Override // defpackage.yq
    public final int e(int r2) {
            r1 = this;
            r0 = 100
            int r2 = super.e(r2)
            int r2 = java.lang.Math.min(r0, r2)
            return r2
    }

    @Override // defpackage.yq
    public final void h(android.view.View r7, defpackage.wz r8) {
            r6 = this;
            hx r0 = r6.q
            androidx.recyclerview.widget.RecyclerView r1 = r0.a
            nz r1 = r1.getLayoutManager()
            int[] r7 = r0.a(r1, r7)
            r0 = 0
            r0 = r7[r0]
            r1 = 1
            r7 = r7[r1]
            int r2 = java.lang.Math.abs(r0)
            int r3 = java.lang.Math.abs(r7)
            int r2 = java.lang.Math.max(r2, r3)
            int r2 = r6.e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L3c
            r8.a = r0
            r8.b = r7
            r8.c = r2
            android.view.animation.DecelerateInterpolator r7 = r6.j
            r8.e = r7
            r8.f = r1
        L3c:
            return
    }
}
