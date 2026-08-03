package mb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f8811e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f8812f = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            mb.a.f8811e = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            mb.a.f8812f = r0
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "wechat_tablet"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "伪装平板登录微信"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "wechat_tablet"
            java.lang.String r3 = "平板模式"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r3) {
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.f11620a
            boolean r1 = oh.h.F(r0)
            if (r1 != 0) goto Lc
            return
        Lc:
            java.lang.ClassLoader r1 = r3.f11622c
            org.luckypray.dexkit.DexKitBridge r3 = r3.f11623d
            oh.h.D(r3, r1, r0)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "平板模式"
            return r0
    }
}
