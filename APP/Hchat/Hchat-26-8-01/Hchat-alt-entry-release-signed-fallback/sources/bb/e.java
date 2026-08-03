package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bb.g f647e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "real_name_tail"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "real_name_tail"
            java.lang.String r1 = "实名尾字"
            java.lang.String r2 = "群聊里自动补查并显示实名尾字"
            java.lang.String r3 = "entertainment"
            r5.<init>(r0, r1, r2, r3)
            r4.h(r5)
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "群昵称自定义颜色"
            java.lang.String r1 = "自定义群聊成员昵称的颜色和粗细"
            java.lang.String r2 = "group_nickname_color"
            r5.<init>(r2, r0, r1, r3)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r17) {
            r16 = this;
            r9 = r17
            r9.getClass()
            bb.l r10 = new bb.l
            android.content.Context r0 = r9.f11620a
            r10.<init>(r0)
            ib.b r11 = new ib.b
            r1 = 1
            r11.<init>(r0, r1)
            b9.f r12 = new b9.f
            ab.b r0 = new ab.b
            java.lang.Class<bb.e> r13 = bb.e.class
            java.lang.Class r3 = eh.a.i(r13)
            r7 = 0
            r8 = 3
            r1 = 2
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r6 = 0
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.<init>(r9, r0)
            bb.k r14 = new bb.k
            ab.b r0 = new ab.b
            java.lang.Class r3 = eh.a.i(r13)
            r8 = 4
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            bb.c r1 = new bb.c
            r3 = 0
            r1.<init>(r2, r3)
            r14.<init>(r10, r12, r0, r1)
            bb.b r12 = new bb.b
            ab.b r0 = new ab.b
            java.lang.Class r3 = eh.a.i(r13)
            r8 = 2
            r1 = 2
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            bb.c r1 = new bb.c
            r3 = 1
            r1.<init>(r2, r3)
            r12.<init>(r9, r0, r1)
            bb.g r15 = new bb.g
            ab.b r0 = new ab.b
            java.lang.Class r3 = eh.a.i(r13)
            r8 = 1
            r1 = 2
            java.lang.String r4 = "logFeatureError"
            java.lang.String r5 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r5 = r0
            r6 = r2
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r14
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f663m = r12
            r6.f647e = r0
            ab.a r0 = new ab.a
            r1 = 7
            r0.<init>(r6, r1)
            r1 = 12
            java.lang.String r3 = "real_name_tail"
            java.lang.String r5 = "实名尾字"
            r7 = 0
            r8.e.f(r1, r0, r3, r5, r7)
            ke.h r0 = new ke.h
            r1 = 4
            r0.<init>(r6, r1)
            java.lang.Class<f8.e> r1 = f8.e.class
            r6.i(r1, r0)
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()
            r0.getClass()
            k8.p r0 = h.Hchat.hooks.api.core.WeChatApis.l()
            if (r0 == 0) goto Lb2
            bb.d r1 = new bb.d
            r1.<init>(r2, r6, r4)
            a2.a r0 = r0.e(r1)
            r6.j(r0)
        Lb2:
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "实名尾字"
            return r0
    }
}
