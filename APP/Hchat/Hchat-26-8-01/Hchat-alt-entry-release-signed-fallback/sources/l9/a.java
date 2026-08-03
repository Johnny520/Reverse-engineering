package l9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l9.d f7934e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "remove_forward_limit"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "允许微信原生转发选择超过 9 个会话"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "remove_forward_limit"
            java.lang.String r3 = "移除转发限制"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            l9.d r1 = new l9.d
            ia.t r2 = new ia.t
            java.lang.Class<l9.a> r0 = l9.a.class
            java.lang.Class r5 = eh.a.i(r0)
            java.lang.String r6 = "logRuntimeError"
            java.lang.String r7 = "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r9 = 0
            r10 = 9
            r3 = 2
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.<init>(r12, r2)
            r4.f7934e = r1
            monitor-enter(r1)
            boolean r12 = r1.f7945f     // Catch: java.lang.Throwable -> L31
            if (r12 == 0) goto L26
            monitor-exit(r1)
            goto L35
        L26:
            java.lang.reflect.Method r12 = r1.e()     // Catch: java.lang.Throwable -> L31
            if (r12 == 0) goto L34
            r1.b(r12)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r1)
            goto L35
        L31:
            r0 = move-exception
            r12 = r0
            goto L46
        L34:
            monitor-exit(r1)
        L35:
            java.lang.String r12 = "remove_forward_limit"
            java.lang.String r0 = "移除转发限制"
            i.e0 r1 = new i.e0
            r2 = 6
            r1.<init>(r11, r2)
            r2 = 12
            r3 = 0
            r8.e.f(r2, r1, r12, r0, r3)
            return
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r12
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "移除转发限制"
            return r0
    }
}
