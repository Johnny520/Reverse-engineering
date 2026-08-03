package y9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y9.e f22329e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "member_title"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "在群聊昵称左侧显示群主、管理员、群员或自定义头衔"
            java.lang.String r1 = "entertainment"
            java.lang.String r2 = "member_title"
            java.lang.String r3 = "群员头衔"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            ib.b r0 = new ib.b
            android.content.Context r1 = r12.f11620a
            r2 = 2
            r0.<init>(r1, r2)
            y9.e r1 = new y9.e
            y9.b r2 = new y9.b
            java.lang.Class<y9.c> r3 = y9.c.class
            java.lang.Class r5 = eh.a.i(r3)
            r9 = 0
            r10 = 0
            r3 = 2
            java.lang.String r6 = "logFeatureError"
            java.lang.String r7 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.<init>(r12, r0, r2)
            r4.f22329e = r1
            v0.a r12 = new v0.a
            r1 = 10
            r12.<init>(r11, r1)
            r1 = 12
            java.lang.String r2 = "member_title"
            java.lang.String r3 = "群员头衔"
            r5 = 0
            r8.e.f(r1, r12, r2, r3, r5)
            q9.a r12 = new q9.a
            r1 = 13
            r12.<init>(r11, r1)
            java.lang.Class<f8.e> r1 = f8.e.class
            r11.i(r1, r12)
            i8.a r12 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r12.getClass()
            g8.g r12 = h.Hchat.hooks.api.core.WeChatApis.d()
            if (r12 == 0) goto L5c
            y9.a r1 = new y9.a
            r1.<init>(r0, r11)
            a2.a r12 = r12.a(r1)
            r11.j(r12)
        L5c:
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "群员头衔"
            return r0
    }
}
