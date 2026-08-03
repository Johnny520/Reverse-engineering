package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1339i;

    public /* synthetic */ s(android.app.Activity r2, java.util.List r3) {
            r1 = this;
            r0 = 0
            r1.f1337g = r0
            r1.<init>()
            r1.f1339i = r2
            r1.f1338h = r3
            return
    }

    public /* synthetic */ s(java.util.List r2, android.app.Activity r3) {
            r1 = this;
            r0 = 1
            r1.f1337g = r0
            r1.<init>()
            r1.f1338h = r2
            r1.f1339i = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f1337g
            android.app.Activity r1 = r7.f1339i
            java.util.List r2 = r7.f1338h
            r3 = 0
            switch(r0) {
                case 0: goto L3c;
                default: goto La;
            }
        La:
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8
            r8.getClass()
            java.util.Iterator r0 = r2.iterator()
            r4 = r3
        L14:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L30
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r8.get()
            if (r6 == 0) goto L27
            goto L14
        L27:
            boolean r5 = ya.i.f(r1, r5, r3)
            if (r5 == 0) goto L14
            int r4 = r4 + 1
            goto L14
        L30:
            c9.y r8 = new c9.y
            int r0 = r2.size()
            java.lang.String r1 = "已读"
            r8.<init>(r1, r4, r0, r3)
            return r8
        L3c:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            android.os.Handler r0 = c9.b0.f1104a
            int r0 = r2.size()
            java.lang.String r4 = "正在发送到 "
            java.lang.String r5 = " 个会话..."
            java.lang.String r0 = eh.a.m(r0, r4, r5)
            c9.i r4 = new c9.i
            r4.<init>(r2, r3, r8)
            c9.j r8 = new c9.j
            r8.<init>(r1, r3)
            java.lang.String r2 = "发送"
            c9.b0.d(r1, r2, r0, r4, r8)
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
