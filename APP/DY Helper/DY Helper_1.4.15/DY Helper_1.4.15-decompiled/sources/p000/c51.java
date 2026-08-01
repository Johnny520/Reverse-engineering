package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c51 implements p000.InterfaceC0980xd {

    /* JADX INFO: renamed from: ε */
    public final p000.u60 f1966;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.d51 f1967;

    public c51(p000.d51 r1, p000.u60 r2) {
            r0 = this;
            r0.<init>()
            r2.getClass()
            r0.f1967 = r1
            r0.f1966 = r2
            return
    }

    @Override // p000.InterfaceC0980xd
    public final void cancel() {
            r4 = this;
            d51 r0 = r4.f1967
            w6 r1 = r0.f2894
            u60 r2 = r4.f1966
            r1.remove(r2)
            u60 r1 = r0.f2895
            boolean r1 = p000.ln0.m3626(r1, r2)
            r3 = 0
            if (r1 == 0) goto L17
            r2.getClass()
            r0.f2895 = r3
        L17:
            r2.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f10608
            r0.remove(r4)
            p80 r4 = r2.f10609
            if (r4 == 0) goto L26
            r4.invoke()
        L26:
            r2.f10609 = r3
            return
    }
}
