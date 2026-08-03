package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.d f7424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k8.s f7425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g8.a f7426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i8.f f7427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f7428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f7429f;

    public i(o8.d r2, k8.s r3, g8.a r4, i8.f r5) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f7428e = r0
            r1.f7424a = r2
            r1.f7425b = r3
            r1.f7426c = r4
            r1.f7427d = r5
            return
    }

    public static long c(android.content.ContentValues r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L14
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L14
            boolean r1 = r2.containsKey(r3)
            if (r1 != 0) goto L10
            goto L14
        L10:
            java.lang.Long r0 = r2.getAsLong(r3)     // Catch: java.lang.Throwable -> L14
        L14:
            if (r0 == 0) goto L1b
            long r2 = r0.longValue()
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public static java.lang.String d(android.content.ContentValues r1, java.lang.String r2) {
            if (r1 == 0) goto L1a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1a
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L1a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
        L1a:
            java.lang.String r1 = ""
            return r1
    }

    public final synchronized void a() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f7429f     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            o8.d r0 = r3.f7424a     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto La
            goto L29
        La:
            g8.e r1 = new g8.e     // Catch: java.lang.Throwable -> L27
            r2 = 6
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L27
            r0.g(r1)     // Catch: java.lang.Throwable -> L27
            r0 = 1
            r3.f7429f = r0     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "消息变更监听已安装"
            i8.f r1 = r3.f7427d     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L25
            java.lang.String r1 = "[WeChatMessageChangeApi] "
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L27
            i8.i.f(r0)     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r3)
            return
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r3)
            return
        L2b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    public final boolean b() {
            r1 = this;
            o8.d r0 = r1.f7424a
            if (r0 == 0) goto Lc
            boolean r0 = r0.f()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final a2.a e(k8.h r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.f7428e
            r0.addIfAbsent(r2)
            a2.a r2 = new a2.a
            r0 = 22
            r2.<init>(r0)
            return r2
    }
}
