package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q50 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8870;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.String f8871;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ android.content.Context f8872;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ int f8873;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ java.lang.Object f8874;

    public /* synthetic */ q50(java.lang.String r1, android.content.Context r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.f8870 = r5
            r0.f8871 = r1
            r0.f8872 = r2
            r0.f8874 = r3
            r0.f8873 = r4
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r3 = this;
            int r0 = r3.f8870
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r3.f8871     // Catch: java.lang.Throwable -> L14
            android.content.Context r1 = r3.f8872     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r3.f8874     // Catch: java.lang.Throwable -> L14
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L14
            int r3 = r3.f8873     // Catch: java.lang.Throwable -> L14
            s50 r3 = p000.t50.m5607(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L14:
            s50 r3 = new s50
            r0 = -3
            r3.<init>(r0)
        L1a:
            return r3
        L1b:
            java.lang.Object r0 = r3.f8874
            n50 r0 = (p000.n50) r0
            java.util.List r0 = java.util.List.of(r0)
            int r1 = r3.f8873
            java.lang.String r2 = r3.f8871
            android.content.Context r3 = r3.f8872
            s50 r3 = p000.t50.m5607(r2, r3, r0, r1)
            return r3
    }
}
