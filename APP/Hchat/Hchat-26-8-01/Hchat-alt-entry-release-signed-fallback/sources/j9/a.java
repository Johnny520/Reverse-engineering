package j9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ea.c f6848e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "fake_voice_duration"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "自定义微信显示的语音时长"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "fake_voice_duration"
            java.lang.String r3 = "伪造语音时长"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            ea.c r0 = new ea.c
            ia.t r1 = new ia.t
            java.lang.Class<j9.a> r2 = j9.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 4
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f6848e = r0
            android.os.Handler r11 = r8.e.f11615a
            i.e0 r11 = new i.e0
            r0 = 2
            r11.<init>(r10, r0)
            r0 = 8
            java.lang.String r1 = "fake_voice_duration"
            java.lang.String r2 = "伪造语音时长"
            r8.c r4 = r8.c.f11603i
            r8.e.f(r0, r11, r1, r2, r4)
            ke.h r11 = new ke.h
            r0 = 19
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "伪造语音时长"
            return r0
    }
}
