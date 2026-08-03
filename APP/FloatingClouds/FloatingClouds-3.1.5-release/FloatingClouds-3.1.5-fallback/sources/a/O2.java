package a;

/* JADX INFO: loaded from: classes.dex */
public final class O2 extends a.Q2 {
    public final /* synthetic */ com.google.android.material.carousel.CarouselLayoutManager b;

    public O2(com.google.android.material.carousel.CarouselLayoutManager r1) {
            r0 = this;
            r0.b = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // a.Q2
    public final void a(android.graphics.RectF r4, android.graphics.RectF r5, android.graphics.RectF r6) {
            r3 = this;
            float r0 = r5.top
            float r1 = r6.top
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L19
            float r2 = r5.bottom
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 <= 0) goto L19
            float r1 = r1 - r0
            float r0 = r4.top
            float r0 = r0 + r1
            r4.top = r0
            float r0 = r6.top
            float r0 = r0 + r1
            r6.top = r0
        L19:
            float r0 = r5.bottom
            float r6 = r6.bottom
            int r1 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r1 <= 0) goto L3e
            float r1 = r5.top
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L3e
            float r0 = r0 - r6
            float r6 = r4.bottom
            float r6 = r6 - r0
            float r1 = r4.top
            float r6 = java.lang.Math.max(r6, r1)
            r4.bottom = r6
            float r4 = r5.bottom
            float r4 = r4 - r0
            float r6 = r5.top
            float r4 = java.lang.Math.max(r4, r6)
            r5.bottom = r4
        L3e:
            return
    }

    @Override // a.Q2
    public final float b(androidx.recyclerview.widget.RecyclerView.m r2) {
            r1 = this;
            int r0 = r2.topMargin
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            float r2 = (float) r0
            return r2
    }

    @Override // a.Q2
    public final android.graphics.RectF c(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.RectF r5 = new android.graphics.RectF
            r0 = 0
            float r2 = r2 - r4
            r5.<init>(r0, r4, r3, r2)
            return r5
    }

    @Override // a.Q2
    public final int d() {
            r1 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r1.b
            int r0 = r0.o
            return r0
    }

    @Override // a.Q2
    public final int e() {
            r1 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r1.b
            int r0 = r0.o
            return r0
    }

    @Override // a.Q2
    public final int f() {
            r1 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r1.b
            int r0 = r0.E()
            return r0
    }

    @Override // a.Q2
    public final int g() {
            r2 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r2.b
            int r1 = r0.n
            int r0 = r0.F()
            int r1 = r1 - r0
            return r1
    }

    @Override // a.Q2
    public final int h() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // a.Q2
    public final int i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // a.Q2
    public final void j(android.view.View r6, int r7, int r8) {
            r5 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r5.b
            int r1 = r0.E()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
            int r3 = androidx.recyclerview.widget.RecyclerView.l.A(r6)
            int r4 = r2.leftMargin
            int r3 = r3 + r4
            int r2 = r2.rightMargin
            int r3 = r3 + r2
            int r3 = r3 + r1
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView.l.N(r6, r1, r7, r3, r8)
            return
    }

    @Override // a.Q2
    public final void k(android.graphics.RectF r5, android.graphics.RectF r6, android.graphics.RectF r7) {
            r4 = this;
            float r0 = r6.bottom
            float r1 = r7.top
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L1d
            float r0 = r5.bottom
            double r2 = (double) r0
            double r2 = java.lang.Math.floor(r2)
            float r0 = (float) r2
            float r0 = r0 - r1
            r5.bottom = r0
            float r2 = r5.top
            float r0 = java.lang.Math.min(r2, r0)
            r5.top = r0
        L1d:
            float r6 = r6.top
            float r7 = r7.bottom
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L38
            float r6 = r5.top
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            float r6 = (float) r6
            float r6 = r6 + r1
            r5.top = r6
            float r7 = r5.bottom
            float r6 = java.lang.Math.max(r6, r7)
            r5.bottom = r6
        L38:
            return
    }

    @Override // a.Q2
    public final void l(android.view.View r1, android.graphics.Rect r2, float r3, float r4) {
            r0 = this;
            int r2 = r2.top
            float r2 = (float) r2
            float r2 = r2 + r3
            float r4 = r4 - r2
            int r2 = (int) r4
            r1.offsetTopAndBottom(r2)
            return
    }
}
