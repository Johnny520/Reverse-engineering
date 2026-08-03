package a;

/* JADX INFO: loaded from: classes.dex */
public final class N2 extends androidx.recyclerview.widget.o {
    public final /* synthetic */ com.google.android.material.carousel.CarouselLayoutManager q;

    public N2(com.google.android.material.carousel.CarouselLayoutManager r1, android.content.Context r2) {
            r0 = this;
            r0.q = r1
            r0.<init>(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public final android.graphics.PointF a(int r2) {
            r1 = this;
            com.google.android.material.carousel.CarouselLayoutManager r0 = r1.q
            android.graphics.PointF r2 = r0.a(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.o
    public final int f(android.view.View r2, int r3) {
            r1 = this;
            com.google.android.material.carousel.CarouselLayoutManager r3 = r1.q
            com.google.android.material.carousel.c r0 = r3.u
            if (r0 == 0) goto L20
            boolean r0 = r3.P0()
            if (r0 != 0) goto Ld
            goto L20
        Ld:
            int r2 = androidx.recyclerview.widget.RecyclerView.l.H(r2)
            com.google.android.material.carousel.b r0 = r3.L0(r2)
            int r2 = r3.M0(r2, r0)
            float r2 = (float) r2
            int r3 = r3.p
            float r3 = (float) r3
            float r3 = r3 - r2
            int r2 = (int) r3
            return r2
        L20:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.o
    public final int g(android.view.View r2, int r3) {
            r1 = this;
            com.google.android.material.carousel.CarouselLayoutManager r3 = r1.q
            com.google.android.material.carousel.c r0 = r3.u
            if (r0 == 0) goto L20
            boolean r0 = r3.P0()
            if (r0 == 0) goto Ld
            goto L20
        Ld:
            int r2 = androidx.recyclerview.widget.RecyclerView.l.H(r2)
            com.google.android.material.carousel.b r0 = r3.L0(r2)
            int r2 = r3.M0(r2, r0)
            float r2 = (float) r2
            int r3 = r3.p
            float r3 = (float) r3
            float r3 = r3 - r2
            int r2 = (int) r3
            return r2
        L20:
            r2 = 0
            return r2
    }
}
