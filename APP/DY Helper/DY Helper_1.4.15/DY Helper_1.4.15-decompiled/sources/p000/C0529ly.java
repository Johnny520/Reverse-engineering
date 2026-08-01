package p000;

/* JADX INFO: renamed from: ly */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0529ly extends p000.pd2 {

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ p000.pd2 f6837;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor f6838;

    public C0529ly(p000.pd2 r1, java.util.concurrent.ThreadPoolExecutor r2) {
            r0 = this;
            r0.<init>()
            r0.f6837 = r1
            r0.f6838 = r2
            return
    }

    @Override // p000.pd2
    /* JADX INFO: renamed from: Ε */
    public final void mo1978(java.lang.Throwable r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.f6838
            pd2 r1 = r1.f6837     // Catch: java.lang.Throwable -> Lb
            r1.mo1978(r2)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r1 = move-exception
            r0.shutdown()
            throw r1
    }

    @Override // p000.pd2
    /* JADX INFO: renamed from: Ζ */
    public final void mo1979(p000.C0379i0 r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.f6838
            pd2 r1 = r1.f6837     // Catch: java.lang.Throwable -> Lb
            r1.mo1979(r2)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r1 = move-exception
            r0.shutdown()
            throw r1
    }
}
