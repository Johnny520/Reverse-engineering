package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p40 extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public /* synthetic */ int f8414;

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            op r2 = (p000.InterfaceC0631op) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            op r0 = r0.mo1119(r2, r1)
            p40 r0 = (p000.p40) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r2, java.lang.Object r3) {
            r1 = this;
            p40 r1 = new p40
            r0 = 2
            r1.<init>(r0, r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r3.intValue()
            r1.f8414 = r2
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r1) {
            r0 = this;
            p000.i81.m2649(r1)
            int r0 = r0.f8414
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
