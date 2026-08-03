package rb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rb.c f11872e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "zombie_check"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "批量核验好友关系并记录异常联系人"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "zombie_check"
            java.lang.String r3 = "僵尸粉检测"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r13) {
            r12 = this;
            r13.getClass()
            rb.k r9 = new rb.k
            android.content.Context r10 = r13.f11620a
            ia.t r0 = new ia.t
            java.lang.Class<rb.b> r11 = rb.b.class
            java.lang.Class r3 = eh.a.i(r11)
            r7 = 0
            r8 = 22
            r1 = 2
            java.lang.String r4 = "logRuntimeError"
            java.lang.String r5 = "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r6 = 0
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.<init>(r10, r0)
            rb.c r10 = new rb.c
            ia.t r0 = new ia.t
            java.lang.Class r3 = eh.a.i(r11)
            r8 = 21
            java.lang.String r4 = "logRuntimeError"
            java.lang.String r5 = "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.<init>(r13, r9, r0)
            r9.f11914k = r10
            r12.f11872e = r10
            fb.v0.f3834a = r9
            i.e0 r0 = new i.e0
            r1 = 16
            r0.<init>(r12, r1)
            r1 = 12
            java.lang.String r3 = "zombie_check"
            java.lang.String r4 = "僵尸粉检测"
            r5 = 0
            r8.e.f(r1, r0, r3, r4, r5)
            q9.a r0 = new q9.a
            r1 = 3
            r0.<init>(r12, r1)
            java.lang.Class<f8.e> r1 = f8.e.class
            r12.i(r1, r0)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "僵尸粉检测"
            return r0
    }
}
