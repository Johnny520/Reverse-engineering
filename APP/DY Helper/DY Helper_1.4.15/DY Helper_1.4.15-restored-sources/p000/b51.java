package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b51 implements p000.fr0, p000.InterfaceC0980xd {

    /* JADX INFO: renamed from: ε */
    public final p000.jr0 f1480;

    /* JADX INFO: renamed from: ζ */
    public final p000.u60 f1481;

    /* JADX INFO: renamed from: η */
    public p000.c51 f1482;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.d51 f1483;

    public b51(p000.d51 r1, p000.jr0 r2, p000.u60 r3) {
            r0 = this;
            r0.<init>()
            r3.getClass()
            r0.f1483 = r1
            r0.f1480 = r2
            r0.f1481 = r3
            r2.m2980(r0)
            return
    }

    @Override // p000.InterfaceC0980xd
    public final void cancel() {
            r1 = this;
            jr0 r0 = r1.f1480
            r0.m2985(r1)
            u60 r0 = r1.f1481
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f10608
            r0.remove(r1)
            c51 r0 = r1.f1482
            if (r0 == 0) goto L16
            r0.cancel()
        L16:
            r0 = 0
            r1.f1482 = r0
            return
    }

    @Override // p000.fr0
    /* JADX INFO: renamed from: κ */
    public final void mo743(p000.hr0 r9, p000.br0 r10) {
            r8 = this;
            br0 r9 = p000.br0.ON_START
            if (r10 != r9) goto L31
            u60 r9 = r8.f1481
            r9.getClass()
            d51 r2 = r8.f1483
            w6 r10 = r2.f2894
            r10.addLast(r9)
            c51 r10 = new c51
            r10.<init>(r2, r9)
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f10608
            r0.add(r10)
            r2.m1655()
            w0 r0 = new w0
            r6 = 0
            r7 = 8
            r1 = 0
            java.lang.Class<d51> r3 = p000.d51.class
            java.lang.String r4 = "updateEnabledCallbacks"
            java.lang.String r5 = "updateEnabledCallbacks()V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.f10609 = r0
            r8.f1482 = r10
            return
        L31:
            br0 r9 = p000.br0.ON_STOP
            if (r10 != r9) goto L3d
            c51 r8 = r8.f1482
            if (r8 == 0) goto L44
            r8.cancel()
            return
        L3d:
            br0 r9 = p000.br0.ON_DESTROY
            if (r10 != r9) goto L44
            r8.cancel()
        L44:
            return
    }
}
