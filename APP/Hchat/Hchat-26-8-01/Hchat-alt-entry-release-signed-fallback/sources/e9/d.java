package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e9.c f2415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f2416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k8.o f2417k;

    public /* synthetic */ d(java.lang.String r1, e9.c r2, android.content.Context r3, k8.o r4, int r5) {
            r0 = this;
            r0.f2413g = r5
            r0.f2414h = r1
            r0.f2415i = r2
            r0.f2416j = r3
            r0.f2417k = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f2413g
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.util.concurrent.ExecutorService r0 = e9.q.f2463d
            e9.d r1 = new e9.d
            r6 = 0
            java.lang.String r2 = r8.f2414h
            e9.c r3 = r8.f2415i
            android.content.Context r4 = r8.f2416j
            k8.o r5 = r8.f2417k
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
        L19:
            android.content.Context r0 = r8.f2416j
            k8.o r1 = r8.f2417k
            java.util.concurrent.atomic.AtomicBoolean r2 = e9.q.f2460a
            java.util.concurrent.ConcurrentHashMap r2 = e9.q.f2467h
            java.lang.String r3 = r8.f2414h
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L3b
            long r4 = r2.longValue()
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r4 = 1500(0x5dc, double:7.41E-321)
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 >= 0) goto L3b
            goto L64
        L3b:
            e9.c r2 = r8.f2415i
            boolean r3 = e9.q.A(r2, r3)
            if (r3 == 0) goto L44
            goto L64
        L44:
            e9.l r1 = e9.q.e(r0, r2, r1)     // Catch: java.lang.Throwable -> L4e
            e9.q.z(r0, r2, r1)     // Catch: java.lang.Throwable -> L4e
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L4e
            goto L55
        L4e:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L55:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L64
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "[Hchat:CustomNotification] 发送自定义通知失败: "
            eh.a.x(r2, r1, r0)
        L64:
            return
    }
}
