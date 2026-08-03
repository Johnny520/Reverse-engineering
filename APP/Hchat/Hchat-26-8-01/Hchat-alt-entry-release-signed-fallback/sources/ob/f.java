package ob;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ob.n f9719e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "text_voice"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "把输入文字合成为微信语音，或长按文字消息在线合成播放"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "text_voice"
            java.lang.String r3 = "文本转语音"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            ob.n r0 = new ob.n
            ia.t r1 = new ia.t
            java.lang.Class<ob.f> r2 = ob.f.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 15
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f9719e = r0
            eb.m0 r1 = eb.m0.f2587a
            ob.e r1 = new ob.e
            r1.<init>(r0)
            java.lang.String r0 = "text_voice"
            a2.a r1 = eb.m0.j(r0, r1)
            r10.j(r1)
            android.os.Handler r1 = r8.e.f11615a
            c9.f r1 = new c9.f
            r2 = 6
            r1.<init>(r11, r2)
            r2 = 8
            java.lang.String r4 = "shared:send_button"
            java.lang.String r5 = "聊天发送按钮"
            r8.c r6 = r8.c.f11604j
            r8.e.f(r2, r1, r4, r5, r6)
            i.e0 r1 = new i.e0
            r2 = 10
            r1.<init>(r10, r2)
            r2 = 12
            java.lang.String r4 = "文本转语音"
            r5 = 0
            r8.e.f(r2, r1, r0, r4, r5)
            e9.a r0 = new e9.a
            r1 = 4
            r0.<init>(r10, r1, r11)
            java.lang.Class<f8.e> r11 = f8.e.class
            r10.i(r11, r0)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "文本转语音"
            return r0
    }
}
