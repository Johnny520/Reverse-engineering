package fa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f3384f = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ea.c f3385e;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            fa.a.f3384f = r0
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "skip_global_mini_program_splash_ads"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "阻止所有小程序展示启动开屏广告"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "skip_global_mini_program_splash_ads"
            java.lang.String r3 = "跳过全局小程序开屏广告"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            ea.c r0 = new ea.c
            ab.b r1 = new ab.b
            java.lang.Class<fa.a> r2 = fa.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 12
            r2 = 2
            java.lang.String r5 = "logFeatureError"
            java.lang.String r6 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r0.<init>(r11, r1, r2)
            r3.f3385e = r0
            android.os.Handler r11 = r8.e.f11615a
            ab.a r11 = new ab.a
            r0 = 20
            r11.<init>(r10, r0)
            r0 = -100
            java.lang.String r1 = "skip_global_mini_program_splash_ads"
            java.lang.String r2 = "跳过全局小程序开屏广告"
            r8.c r4 = r8.c.f11603i
            r8.e.e(r0, r11, r1, r2, r4)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "跳过全局小程序开屏广告"
            return r0
    }
}
