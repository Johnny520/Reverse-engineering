package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f5225e = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            ha.h0.f5225e = r0
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "remove_moments_ads"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            aa.g r5 = new aa.g
            java.lang.String r0 = "阻止朋友圈广告信息解析和展示"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "remove_moments_ads"
            java.lang.String r3 = "去除朋友圈广告"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r8) {
            r7 = this;
            r8.getClass()
            android.content.Context r0 = r8.f11620a
            java.lang.ClassLoader r8 = r8.f11622c
            java.lang.String r1 = "[Hchat:MomentsAds] Hook 朋友圈广告信息失败: "
            if (r8 != 0) goto Lc
            return
        Lc:
            java.lang.Class r2 = r8.getClass()
            java.lang.String r2 = r2.getName()
            int r3 = java.lang.System.identityHashCode(r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "@"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            java.util.HashSet r3 = ha.h0.f5225e
            monitor-enter(r3)
            boolean r4 = r3.contains(r2)     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L37
            monitor-exit(r3)
            return
        L37:
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.ADInfo"
            java.lang.Class r8 = h.Hchat.utils.KavaReflector.loadClass(r4, r8)     // Catch: java.lang.Throwable -> L46
            if (r8 != 0) goto L48
            java.lang.String r8 = "[Hchat:MomentsAds] 未找到朋友圈广告信息类: com.tencent.mm.plugin.sns.storage.ADInfo"
            fb.v0.m(r8)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            return
        L46:
            r8 = move-exception
            goto L91
        L48:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Constructor r8 = h.Hchat.utils.KavaReflector.findConstructor(r8, r4)     // Catch: java.lang.Throwable -> L46
            if (r8 != 0) goto L5b
            java.lang.String r8 = "[Hchat:MomentsAds] 未找到朋友圈广告信息构造方法: com.tencent.mm.plugin.sns.storage.ADInfo(String)"
            fb.v0.m(r8)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)
            return
        L5b:
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> L6f
            ea.b r5 = new ea.b     // Catch: java.lang.Throwable -> L6f
            r6 = 3
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L6f
            r4.b(r8, r5)     // Catch: java.lang.Throwable -> L6f
            boolean r8 = r3.add(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r8 = move-exception
            sf.f r0 = new sf.f     // Catch: java.lang.Throwable -> L46
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L46
            r8 = r0
        L76:
            java.lang.Throwable r8 = sf.g.b(r8)     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L8f
            java.lang.String r0 = r8.getMessage()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L46
            r2.append(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L46
            fb.v0.n(r0, r8)     // Catch: java.lang.Throwable -> L46
        L8f:
            monitor-exit(r3)
            return
        L91:
            monitor-exit(r3)
            throw r8
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "去除朋友圈广告"
            return r0
    }
}
