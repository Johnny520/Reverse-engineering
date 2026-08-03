package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d9.f f2096a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f2097b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2098c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f2099d = null;

    static {
            d9.f r0 = new d9.f
            r0.<init>()
            d9.f.f2096a = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 27152(0x6a10, float:3.8048E-41)
            r0.<init>(r1)
            d9.f.f2097b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            d9.f.f2098c = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            d9.f.f2099d = r0
            return
    }

    public final synchronized void a(java.lang.Class r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = d9.f.f2099d     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.add(r4)     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            java.lang.String r0 = "onActivityResult"
            ba.f r1 = new ba.f     // Catch: java.lang.Throwable -> L19
            r2 = 12
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L19
            java.util.Set r0 = de.robv.android.xposed.XposedBridge.hookAllMethods(r4, r0, r1)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r0 = move-exception
            sf.f r1 = new sf.f     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            r0 = r1
        L20:
            java.lang.Throwable r0 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2e
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = d9.f.f2099d     // Catch: java.lang.Throwable -> L2c
            r0.remove(r4)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r4 = move-exception
            goto L30
        L2e:
            monitor-exit(r3)
            return
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r4
    }

    public final void b(android.app.Activity r6, fg.l r7, java.lang.String r8, boolean r9) {
            r5 = this;
            sf.n r0 = sf.n.f12433a
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            int r1 = r8.length()
            if (r1 != 0) goto L16
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7.invoke(r6)
            return
        L16:
            java.lang.Class r1 = r6.getClass()
            r5.a(r1)
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5.a(r1)
            ba.c r1 = new ba.c
            r2 = 2
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = d9.f.f2097b
            int r1 = r2.updateAndGet(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            d9.e r3 = new d9.e
            r3.<init>(r6, r7, r8, r9)
            java.util.concurrent.ConcurrentHashMap r7 = d9.f.f2098c
            r7.put(r2, r3)
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "android.intent.action.OPEN_DOCUMENT"
            r8.<init>(r9)
            java.lang.String r9 = "android.intent.category.OPENABLE"
            r8.addCategory(r9)
            java.lang.String r2 = "image/*"
            r8.setType(r2)
            r3 = 1
            r8.addFlags(r3)
            r4 = 64
            r8.addFlags(r4)
            r6.startActivityForResult(r8, r1)     // Catch: java.lang.Throwable -> L5b
            r4 = r0
            goto L61
        L5b:
            r8 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r8)
        L61:
            java.lang.Throwable r8 = sf.g.b(r4)
            if (r8 == 0) goto La0
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.GET_CONTENT"
            r8.<init>(r4)
            r8.addCategory(r9)
            r8.setType(r2)
            r8.addFlags(r3)
            java.lang.String r9 = "选择头像"
            android.content.Intent r8 = android.content.Intent.createChooser(r8, r9)     // Catch: java.lang.Throwable -> L81
            r6.startActivityForResult(r8, r1)     // Catch: java.lang.Throwable -> L81
            goto L87
        L81:
            r6 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r6)
        L87:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 == 0) goto La0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r7.remove(r6)
            d9.e r6 = (d9.e) r6
            if (r6 == 0) goto La0
            fg.l r6 = r6.f2095d
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.invoke(r7)
        La0:
            return
    }
}
