package p000;

/* JADX INFO: renamed from: xt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0996xt extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ boolean f12280;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C0574n5 f12281;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f12282;

    public C0996xt(boolean r1, p000.C0574n5 r2, java.lang.String r3) {
            r0 = this;
            r0.f12280 = r1
            r0.f12281 = r2
            r0.f12282 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r2 = this;
            boolean r0 = r2.f12280
            if (r0 == 0) goto L1c
            n5 r0 = r2.f12281
            java.lang.String r2 = r2.f12282
            java.lang.Object r0 = r0.f7387
            jq1 r0 = (p000.jq1) r0
            zz1 r1 = r0.f5548
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r0.f5549     // Catch: java.lang.Throwable -> L19
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L19
            hq1 r2 = (p000.hq1) r2     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)
            goto L1c
        L19:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L1c:
            s62 r2 = p000.s62.f9751
            return r2
    }
}
