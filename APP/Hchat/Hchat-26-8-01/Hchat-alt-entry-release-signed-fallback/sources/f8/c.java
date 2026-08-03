package f8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f8.c f3320c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f3321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f3322b;

    static {
            f8.c r0 = new f8.c
            r0.<init>()
            f8.c.f3320c = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f3321a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f3322b = r0
            return
    }

    public static void a(java.lang.Class r2, f8.d r3, java.lang.Throwable r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:EventBus] 处理事件异常: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = ", handler="
            r0.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = ", error="
            r0.append(r2)
            bc.e.s(r4, r0, r4)
            return
    }

    public final void b(java.lang.Object r5) {
            r4 = this;
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<f8.e> r1 = f8.e.class
            if (r0 != r1) goto Ld
            java.util.concurrent.ConcurrentHashMap r1 = r4.f3322b
            r1.put(r0, r5)
        Ld:
            java.util.concurrent.ConcurrentHashMap r1 = r4.f3321a
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L3d
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1e
            goto L3d
        L1e:
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            f8.a r1 = (f8.a) r1
            f8.d r1 = r1.f3319a
            r1.b(r5)     // Catch: java.lang.Throwable -> L34
            goto L22
        L34:
            r2 = move-exception
            java.lang.Class r3 = r5.getClass()
            a(r3, r1, r2)
            goto L22
        L3d:
            return
    }

    public final f8.b c(java.lang.Class r6, f8.d r7) {
            r5 = this;
            f8.a r0 = new f8.a
            r0.<init>(r7)
            com.alibaba.fastjson2.writer.b r1 = new com.alibaba.fastjson2.writer.b
            r2 = 18
            r1.<init>(r2)
            java.util.concurrent.ConcurrentHashMap r2 = r5.f3321a
            java.lang.Object r1 = r2.computeIfAbsent(r6, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            r2 = 0
            r3 = r2
        L16:
            int r4 = r1.size()
            if (r2 >= r4) goto L2a
            java.lang.Object r3 = r1.get(r2)
            f8.a r3 = (f8.a) r3
            r3.getClass()
            int r3 = r2 + 1
            int r2 = r2 + 1
            goto L16
        L2a:
            int r2 = r1.size()
            if (r3 < r2) goto L34
            r1.add(r0)
            goto L37
        L34:
            r1.add(r3, r0)
        L37:
            java.util.concurrent.ConcurrentHashMap r0 = r5.f3322b
            java.lang.Object r0 = r0.get(r6)
            if (r0 != 0) goto L40
            goto L4c
        L40:
            java.lang.Object r0 = r6.cast(r0)     // Catch: java.lang.Throwable -> L48
            r7.b(r0)     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r0 = move-exception
            a(r6, r7, r0)
        L4c:
            f8.b r6 = new f8.b
            r6.<init>()
            return r6
    }
}
