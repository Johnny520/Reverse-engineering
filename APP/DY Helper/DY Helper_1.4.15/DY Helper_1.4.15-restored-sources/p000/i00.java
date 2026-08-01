package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i00 extends p000.t22 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.bp1 f4861;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.j00 f4862;

    public i00(java.lang.String r1, p000.bp1 r2, p000.j00 r3) {
            r0 = this;
            r0.f4861 = r2
            r0.f4862 = r3
            r0.<init>(r1)
            return
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: α */
    public final long mo2576() {
            r4 = this;
            bp1 r0 = r4.f4861
            ap1 r1 = r0.mo992()     // Catch: java.lang.Throwable -> L7
            goto Lf
        L7:
            r1 = move-exception
            ap1 r2 = new ap1
            r3 = 2
            r2.<init>(r0, r1, r3)
            r1 = r2
        Lf:
            j00 r4 = r4.f4862
            java.util.concurrent.CopyOnWriteArrayList r2 = r4.f5284
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L1e
            java.util.concurrent.LinkedBlockingDeque r4 = r4.f5285
            r4.put(r1)
        L1e:
            r0 = -1
            return r0
    }
}
