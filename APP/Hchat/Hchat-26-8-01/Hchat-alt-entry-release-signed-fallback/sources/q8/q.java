package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1.d f10732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f10733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f10734c;

    public q(g1.d r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f10733b = r0
            r1.f10732a = r2
            return
    }

    public final int a(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r0 = 0
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r1, r7, r2)     // Catch: java.lang.Throwable -> L18
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L18
            c9.c2 r3 = new c9.c2     // Catch: java.lang.Throwable -> L18
            r4 = 12
            r5 = 0
            r3.<init>(r4, r6, r8, r5)     // Catch: java.lang.Throwable -> L18
            r2.b(r1, r3)     // Catch: java.lang.Throwable -> L18
            r7 = 1
            return r7
        L18:
            r8 = move-exception
            java.lang.String r1 = "生命周期Hook失败: "
            java.lang.String r2 = " "
            java.lang.StringBuilder r7 = bc.e.o(r1, r7, r2)
            java.lang.String r8 = r8.getMessage()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.b(r7)
            return r0
    }

    public final void b(java.lang.String r2) {
            r1 = this;
            g1.d r0 = r1.f10732a
            if (r0 == 0) goto Ld
            java.lang.String r0 = "[WeChatLifecycleApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
        Ld:
            return
    }
}
