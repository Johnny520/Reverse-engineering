package a;

/* JADX INFO: loaded from: classes.dex */
public final class P2 extends a.Q2 {
    public final /* synthetic */ com.google.android.material.carousel.CarouselLayoutManager b;

    public P2(com.google.android.material.carousel.CarouselLayoutManager r1) {
            r0 = this;
            r0.b = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // a.Q2
    public final void a(android.graphics.RectF r4, android.graphics.RectF r5, android.graphics.RectF r6) {
            r3 = this;
            float r0 = r5.left
            float r1 = r6.left
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L19
            float r2 = r5.right
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 <= 0) goto L19
            float r1 = r1 - r0
            float r0 = r4.left
            float r0 = r0 + r1
            r4.left = r0
            float r0 = r5.left
            float r0 = r0 + r1
            r5.left = r0
        L19:
            float r0 = r5.right
            float r6 = r6.right
            int r1 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r1 <= 0) goto L3e
            float r1 = r5.left
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L3e
            float r0 = r0 - r6
            float r6 = r4.right
            float r6 = r6 - r0
            float r1 = r4.left
            float r6 = java.lang.Math.max(r6, r1)
            r4.right = r6
            float r4 = r5.right
            float r4 = r4 - r0
            float r6 = r5.left
            float r4 = java.lang.Math.max(r4, r6)
            r5.right = r4
        L3e:
            return
    }

    @Override // a.Q2
    public final float b(androidx.recyclerview.widget.RecyclerView.m r2) {
            r1 = this;
            int r0 = r2.rightMargin
            int r2 = r2.leftMargin
            int r0 = r0 + r2
            float r2 = (float) r0
            return r2
    }

    @Override // a.Q2
    public final android.graphics.RectF c(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.RectF r4 = new android.graphics.RectF
            r0 = 0
            float r3 = r3 - r5
            r4.<init>(r5, r0, r3, r2)
            return r4
    }

    @Override // a.Q2
    public final int d() {
            r2 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r2.b
            int r1 = r0.o
            int r0 = r0.D()
            int r1 = r1 - r0
            return r1
    }

    @Override // a.Q2
    public final int e() {
            r2 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r2.b
            boolean r1 = r0.Q0()
            if (r1 == 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r0.n
            return r0
    }

    @Override // a.Q2
    public final int f() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // a.Q2
    public final int g() {
            r1 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r1.b
            int r0 = r0.n
            return r0
    }

    @Override // a.Q2
    public final int h() {
            r2 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r2.b
            boolean r1 = r0.Q0()
            if (r1 == 0) goto Lb
            int r0 = r0.n
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // a.Q2
    public final int i() {
            r1 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r1.b
            int r0 = r0.G()
            return r0
    }

    @Override // a.Q2
    public final void j(android.view.View r6, int r7, int r8) {
            r5 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r5.b
            int r1 = r0.G()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r2 = (androidx.recyclerview.widget.RecyclerView.m) r2
            int r3 = androidx.recyclerview.widget.RecyclerView.l.z(r6)
            int r4 = r2.topMargin
            int r3 = r3 + r4
            int r2 = r2.bottomMargin
            int r3 = r3 + r2
            int r3 = r3 + r1
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView.l.N(r6, r7, r1, r8, r3)
            return
    }

    @Override // a.Q2
    public final void k(android.graphics.RectF r5, android.graphics.RectF r6, android.graphics.RectF r7) {
            r4 = this;
            float r0 = r6.right
            float r1 = r7.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L1d
            float r0 = r5.right
            double r2 = (double) r0
            double r2 = java.lang.Math.floor(r2)
            float r0 = (float) r2
            float r0 = r0 - r1
            r5.right = r0
            float r2 = r5.left
            float r0 = java.lang.Math.min(r2, r0)
            r5.left = r0
        L1d:
            float r6 = r6.left
            float r7 = r7.right
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L38
            float r6 = r5.left
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            float r6 = (float) r6
            float r6 = r6 + r1
            r5.left = r6
            float r7 = r5.right
            float r6 = java.lang.Math.max(r6, r7)
            r5.right = r6
        L38:
            return
    }

    @Override // a.Q2
    public final void l(android.view.View r1, android.graphics.Rect r2, float r3, float r4) {
            r0 = this;
            int r2 = r2.left
            float r2 = (float) r2
            float r2 = r2 + r3
            float r4 = r4 - r2
            int r2 = (int) r4
            r1.offsetLeftAndRight(r2)
            return
    }
}
