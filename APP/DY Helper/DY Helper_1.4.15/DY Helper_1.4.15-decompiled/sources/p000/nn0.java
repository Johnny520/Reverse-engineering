package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nn0 extends p000.AbstractC0695pp {

    /* JADX INFO: renamed from: θ */
    public int f7689;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.e80 f7690;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.InterfaceC0631op f7691;

    public nn0(p000.InterfaceC0631op r1, p000.InterfaceC0880up r2, p000.e80 r3, p000.InterfaceC0631op r4) {
            r0 = this;
            r0.f7690 = r3
            r0.f7691 = r4
            r0.<init>(r1, r2)
            return
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f7689
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Le
            r3.f7689 = r1
            p000.i81.m2649(r4)
            return r4
        Le:
            java.lang.String r3 = "This coroutine had already completed"
            p000.C1080.m7279(r3)
            r3 = 0
            return r3
        L15:
            r3.f7689 = r2
            p000.i81.m2649(r4)
            e80 r4 = r3.f7690
            r4.getClass()
            p000.h62.m2394(r1, r4)
            op r0 = r3.f7691
            java.lang.Object r3 = r4.invoke(r0, r3)
            return r3
    }
}
