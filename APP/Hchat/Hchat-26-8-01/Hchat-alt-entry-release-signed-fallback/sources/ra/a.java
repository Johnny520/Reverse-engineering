package ra;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ra.c f11830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f11831i;

    public /* synthetic */ a(ra.c r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f11829g = r3
            r0.f11830h = r1
            r0.f11831i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f11829g
            switch(r0) {
                case 0: goto L45;
                default: goto L5;
            }
        L5:
            ra.c r0 = r4.f11830h
            java.lang.Object r1 = r0.f11838e
            na.k r1 = (na.k) r1
            java.lang.String r2 = r4.f11831i
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L44
            java.util.Set r3 = r1.f9192q
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L44
            java.util.Set r3 = r1.f9191p
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L44
            java.util.Set r3 = r1.f9190o
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L2c
            goto L44
        L2c:
            java.lang.String r3 = "收红包响应超时"
            boolean r3 = r0.r(r2, r3)
            if (r3 != 0) goto L44
            java.util.concurrent.ConcurrentHashMap r1 = r1.f9186k
            java.lang.Object r1 = r1.get(r2)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = "网络超时未收到收红包响应"
            r0.n(r3, r1)
            r0.d(r2)
        L44:
            return
        L45:
            ra.c r0 = r4.f11830h
            java.lang.Object r1 = r0.f11838e
            na.k r1 = (na.k) r1
            java.lang.String r2 = r4.f11831i
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L7c
            java.util.Set r3 = r1.f9192q
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L7c
            java.util.Set r3 = r1.f9191p
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L64
            goto L7c
        L64:
            java.util.concurrent.ConcurrentHashMap r1 = r1.f9186k
            java.lang.Object r1 = r1.get(r2)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = "拆红包响应超时"
            boolean r3 = r0.p(r1, r2, r3)
            if (r3 != 0) goto L7c
            java.lang.String r3 = "网络超时未收到拆红包响应"
            r0.n(r3, r1)
            r0.d(r2)
        L7c:
            return
    }
}
