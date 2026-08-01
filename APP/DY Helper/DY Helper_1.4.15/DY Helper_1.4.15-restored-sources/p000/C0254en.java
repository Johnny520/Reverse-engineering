package p000;

/* JADX INFO: renamed from: en */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0254en extends android.view.View.DragShadowBuilder {

    /* JADX INFO: renamed from: α */
    public final p000.C1068zr f3597;

    /* JADX INFO: renamed from: β */
    public final long f3598;

    /* JADX INFO: renamed from: γ */
    public final p000.a80 f3599;

    public C0254en(p000.C1068zr r1, long r2, p000.a80 r4) {
            r0 = this;
            r0.<init>()
            r0.f3597 = r1
            r0.f3598 = r2
            r0.f3599 = r4
            return
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(android.graphics.Canvas r10) {
            r9 = this;
            fe r0 = new fe
            r0.<init>()
            android.graphics.Canvas r1 = p000.AbstractC0532m0.f6880
            l0 r1 = new l0
            r1.<init>()
            r1.f6337 = r10
            ee r10 = r0.f3906
            yr r2 = r10.f3514
            np0 r3 = r10.f3515
            de r4 = r10.f3516
            long r5 = r10.f3517
            zr r7 = r9.f3597
            r10.f3514 = r7
            np0 r7 = p000.np0.f7701
            r10.f3515 = r7
            r10.f3516 = r1
            long r7 = r9.f3598
            r10.f3517 = r7
            r1.mo1729()
            a80 r9 = r9.f3599
            r9.invoke(r0)
            r1.mo1727()
            r10.f3514 = r2
            r10.f3515 = r3
            r10.f3516 = r4
            r10.f3517 = r5
            return
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(android.graphics.Point r6, android.graphics.Point r7) {
            r5 = this;
            r0 = 32
            long r1 = r5.f3598
            long r3 = r1 >> r0
            int r0 = (int) r3
            float r0 = java.lang.Float.intBitsToFloat(r0)
            zr r5 = r5.f3597
            float r3 = r5.mo586()
            float r0 = r0 / r3
            int r0 = r5.mo583(r0)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r2 = r5.mo586()
            float r1 = r1 / r2
            int r5 = r5.mo583(r1)
            r6.set(r0, r5)
            int r5 = r6.x
            int r5 = r5 / 2
            int r6 = r6.y
            int r6 = r6 / 2
            r7.set(r5, r6)
            return
    }
}
