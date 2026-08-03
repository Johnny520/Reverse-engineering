package ka;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ka.f f7543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f7544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f7546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ka.d f7547k;

    public /* synthetic */ c(ka.f r1, java.lang.String r2, long r3, java.lang.String r5, ka.d r6) {
            r0 = this;
            r0.<init>()
            r0.f7543g = r1
            r0.f7544h = r2
            r0.f7545i = r3
            r0.f7546j = r5
            r0.f7547k = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            ka.f r1 = r7.f7543g
            java.lang.String r2 = r7.f7544h
            long r3 = r7.f7545i
            java.lang.String r5 = r7.f7546j
            ka.d r6 = r7.f7547k
            r1.d(r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L10
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L17:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L29
            ia.t r1 = r1.f7552a
            java.lang.String r5 = "QQ点歌处理异常"
            r1.invoke(r5, r0)
            java.lang.String r0 = "处理失败"
            ka.f.e(r3, r2, r0)
        L29:
            return
    }
}
