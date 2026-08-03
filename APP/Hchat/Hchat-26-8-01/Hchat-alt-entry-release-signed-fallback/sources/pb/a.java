package pb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cb.f f10459e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "block_typing_report"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "输入文字时不向对方显示正在输入状态"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "block_typing_report"
            java.lang.String r3 = "拦截正在输入上报"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            cb.f r0 = new cb.f
            ia.t r1 = new ia.t
            java.lang.Class<pb.a> r2 = pb.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 16
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r0.<init>(r11, r1, r2)
            r3.f10459e = r0
            r11 = 0
            boolean r11 = r0.g(r11)
            r0 = 1
            if (r11 != r0) goto L29
            goto L3a
        L29:
            i.e0 r11 = new i.e0
            r0 = 11
            r11.<init>(r10, r0)
            r0 = 12
            java.lang.String r1 = "block_typing_report"
            java.lang.String r2 = "拦截正在输入上报"
            r4 = 0
            r8.e.f(r0, r11, r1, r2, r4)
        L3a:
            ke.h r11 = new ke.h
            r0 = 29
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "拦截正在输入上报"
            return r0
    }
}
