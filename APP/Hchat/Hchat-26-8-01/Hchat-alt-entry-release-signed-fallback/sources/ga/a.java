package ga;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f4403e = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            ga.a.f4403e = r0
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "skip_mini_program_video_ads"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "自动跳过小程序视频广告"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "skip_mini_program_video_ads"
            java.lang.String r3 = "跳过小程序视频广告"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r2) {
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r2.f11620a
            java.lang.ClassLoader r2 = r2.f11622c
            a2.a.k(r0, r2)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "跳过小程序视频广告"
            return r0
    }
}
