package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.app.Activity f8509;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f8510;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.vd1 f8511;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f8512;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Integer f8513;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Long f8514;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ boolean f8515;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ boolean f8516;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ p000.a80 f8517;

    public /* synthetic */ pd1(android.app.Activity r1, java.lang.String r2, p000.vd1 r3, int r4, java.lang.Integer r5, java.lang.Long r6, boolean r7, boolean r8, p000.a80 r9) {
            r0 = this;
            r0.<init>()
            r0.f8509 = r1
            r0.f8510 = r2
            r0.f8511 = r3
            r0.f8512 = r4
            r0.f8513 = r5
            r0.f8514 = r6
            r0.f8515 = r7
            r0.f8516 = r8
            r0.f8517 = r9
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            android.app.Activity r1 = r10.f8509
            java.lang.String r2 = r10.f8510
            vd1 r3 = r10.f8511
            int r4 = r10.f8512
            java.lang.Integer r5 = r10.f8513
            java.lang.Long r6 = r10.f8514
            boolean r7 = r10.f8515
            boolean r8 = r10.f8516
            a80 r9 = r10.f8517
            p000.xd1.m6625(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L18
            s62 r10 = p000.s62.f9751     // Catch: java.lang.Throwable -> L18
            goto L20
        L18:
            r0 = move-exception
            r10 = r0
            eo1 r0 = new eo1
            r0.<init>(r10)
            r10 = r0
        L20:
            java.lang.Throwable r10 = p000.fo1.m2190(r10)
            if (r10 == 0) goto L3b
            java.lang.String r0 = "DYHelper"
            java.lang.String r2 = "打开营地种子选择面板失败"
            p000.C0888ux.m5977(r0, r2, r10)
            java.lang.String r10 = r10.getMessage()
            if (r10 != 0) goto L35
            java.lang.String r10 = ""
        L35:
            java.lang.String r0 = "打开种子选择面板失败: "
            r2 = 1
            p000.a12.m21(r2, r1, r0, r10)
        L3b:
            return
    }
}
