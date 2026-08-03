package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3513h;

    public /* synthetic */ e1(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.f3512g = r0
            r1.<init>()
            r1.f3513h = r2
            return
    }

    public /* synthetic */ e1(k8.g r1, java.lang.String r2) {
            r0 = this;
            r1 = 1
            r0.f3512g = r1
            r0.<init>()
            r0.f3513h = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.f3512g
            java.lang.String r1 = r6.f3513h
            switch(r0) {
                case 0: goto L45;
                default: goto L7;
            }
        L7:
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = k8.g.f7413q
            byte[] r2 = k8.g.f(r1)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3d
            int r3 = r2.length     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L13
            goto L3d
        L13:
            java.util.concurrent.ConcurrentHashMap r3 = k8.g.f7412p     // Catch: java.lang.Throwable -> L32
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L32
            r5 = 64
            if (r4 < r5) goto L3a
            java.util.Set r4 = r3.keySet()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L32
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L34
            java.lang.Object r4 = r4.next()     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L32
            goto L35
        L32:
            r2 = move-exception
            goto L41
        L34:
            r4 = 0
        L35:
            if (r4 == 0) goto L3a
            r3.remove(r4)     // Catch: java.lang.Throwable -> L32
        L3a:
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L32
        L3d:
            r0.remove(r1)
            return
        L41:
            r0.remove(r1)
            throw r2
        L45:
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = fb.g1.f3529g
            java.util.concurrent.ConcurrentHashMap r2 = fb.g1.f3528f
            fb.g1 r3 = fb.g1.f3523a
        L4b:
            java.lang.Object r3 = r2.remove(r1)     // Catch: java.lang.Throwable -> L83
            sf.e r3 = (sf.e) r3     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L85
            java.lang.Object r4 = r3.f12418g     // Catch: java.lang.Throwable -> L61
            android.content.Context r4 = (android.content.Context) r4     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = r3.f12419h     // Catch: java.lang.Throwable -> L61
            fb.d1 r3 = (fb.d1) r3     // Catch: java.lang.Throwable -> L61
            fb.g1.n(r4, r3)     // Catch: java.lang.Throwable -> L61
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> L61
            goto L68
        L61:
            r3 = move-exception
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L83
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L83
            r3 = r4
        L68:
            java.lang.Throwable r3 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L83
            if (r3 == 0) goto L4b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r4.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = "[Hchat:ScriptAgent] 异步保存会话失败: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L83
            r4.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L83
            fb.v0.n(r4, r3)     // Catch: java.lang.Throwable -> L83
            goto L4b
        L83:
            r3 = move-exception
            goto La2
        L85:
            r0.remove(r1)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto La1
            java.lang.Object r0 = r2.get(r1)
            sf.e r0 = (sf.e) r0
            if (r0 == 0) goto La1
            java.lang.Object r1 = r0.f12418g
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.f12419h
            fb.d1 r0 = (fb.d1) r0
            fb.g1.o(r1, r0)
        La1:
            return
        La2:
            r0.remove(r1)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r2.get(r1)
            sf.e r0 = (sf.e) r0
            if (r0 == 0) goto Lbe
            java.lang.Object r1 = r0.f12418g
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.f12419h
            fb.d1 r0 = (fb.d1) r0
            fb.g1.o(r1, r0)
        Lbe:
            throw r3
    }
}
