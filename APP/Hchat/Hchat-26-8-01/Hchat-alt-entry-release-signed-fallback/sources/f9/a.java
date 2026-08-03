package f9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f9.e f3351e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "edit_message"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "长按文字、引用或转账消息后修改本地聊天记录"
            java.lang.String r1 = "entertainment"
            java.lang.String r2 = "edit_message"
            java.lang.String r3 = "修改聊天记录"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            f9.e r0 = new f9.e
            ab.b r1 = new ab.b
            java.lang.Class<f9.a> r2 = f9.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 11
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f3351e = r0
            ab.a r11 = new ab.a
            r0 = 19
            r11.<init>(r10, r0)
            r0 = 12
            java.lang.String r1 = "edit_message"
            java.lang.String r2 = "修改聊天记录"
            r4 = 0
            r8.e.f(r0, r11, r1, r2, r4)
            ke.h r11 = new ke.h
            r0 = 8
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "修改聊天记录"
            return r0
    }
}
