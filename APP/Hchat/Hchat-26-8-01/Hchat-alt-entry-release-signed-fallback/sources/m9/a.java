package m9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m9.e f8784e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "game_emoji_result"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "固定骰子点数和猜拳结果，或在发送时选择"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "game_emoji_result"
            java.lang.String r3 = "指定骰子猜拳"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            m9.e r0 = new m9.e
            ia.t r1 = new ia.t
            java.lang.Class<m9.a> r2 = m9.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 11
            r2 = 2
            java.lang.String r5 = "logRuntimeError"
            java.lang.String r6 = "logRuntimeError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f8784e = r0
            android.os.Handler r11 = r8.e.f11615a
            i.e0 r11 = new i.e0
            r0 = 7
            r11.<init>(r10, r0)
            r0 = 8
            java.lang.String r1 = "game_emoji_result"
            java.lang.String r2 = "指定骰子猜拳"
            r8.c r4 = r8.c.f11604j
            r8.e.f(r0, r11, r1, r2, r4)
            ke.h r11 = new ke.h
            r0 = 23
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "指定骰子猜拳"
            return r0
    }
}
