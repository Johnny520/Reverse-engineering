package v9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uf.d f14287e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.List f14288f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.List f14289g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f14290h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.HashSet f14291i = null;

    static {
            uf.d r0 = new uf.d
            r1 = 2
            r0.<init>(r1)
            v9.b.f14287e = r0
            java.lang.String r0 = "onReceiveUpgradePatch. try to start apply"
            java.lang.String r1 = "verify patch signature failed, tinker."
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.hp.util.TinkerSyncResponse"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            v9.b.f14288f = r0
            java.lang.String r0 = "before commandNewApkMd5HardCode, response.newApkMd5 = "
            java.lang.String r1 = ", response.fileMd5 = "
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            v9.b.f14289g = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            v9.b.f14290h = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            v9.b.f14291i = r0
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "disable_hot_update"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "阻止微信加载和应用热更新补丁"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "disable_hot_update"
            java.lang.String r3 = "屏蔽热更新"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r4) {
            r3 = this;
            r4.getClass()
            android.content.Context r0 = r4.f11620a
            boolean r1 = uf.d.C(r0)
            if (r1 != 0) goto Lc
            return
        Lc:
            java.lang.ClassLoader r1 = r4.f11622c
            org.luckypray.dexkit.DexKitBridge r4 = r4.f11623d
            uf.d r2 = v9.b.f14287e
            r2.z(r4, r1, r0)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "屏蔽热更新"
            return r0
    }
}
