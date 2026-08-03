package qb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qb.k f10797e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "voice_forward"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "长按聊天语音或收藏语音后转发给好友/群聊，或保存到本地"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "voice_forward"
            java.lang.String r3 = "语音转发保存"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            qb.k r0 = new qb.k
            ia.t r1 = new ia.t
            java.lang.Class<qb.a> r2 = qb.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 19
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f10797e = r0
            i.e0 r11 = new i.e0
            r0 = 13
            r11.<init>(r10, r0)
            r0 = 12
            java.lang.String r1 = "voice_forward"
            java.lang.String r2 = "语音转发保存"
            r4 = 0
            r8.e.f(r0, r11, r1, r2, r4)
            q9.a r11 = new q9.a
            r0 = 1
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "语音转发保存"
            return r0
    }
}
