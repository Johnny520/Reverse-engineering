package va;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final uf.d f14298e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f14299f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f14300g;

    static {
            uf.d r0 = new uf.d
            r1 = 3
            r0.<init>(r1)
            va.c.f14298e = r0
            java.lang.String r0 = "see_room_member"
            java.lang.String r1 = "room_name"
            java.lang.String r2 = "expand_room_member"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            va.c.f14299f = r0
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "profile_id"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "在好友和群聊资料页显示可复制的微信 ID"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "profile_id"
            java.lang.String r3 = "资料页显示ID"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r7) {
            r6 = this;
            r7.getClass()
            uf.d r0 = va.c.f14298e
            android.content.Context r1 = r7.f11620a
            java.lang.ClassLoader r7 = r7.f11622c
            if (r7 == 0) goto L3c
            boolean r2 = va.c.f14300g
            if (r2 == 0) goto L10
            goto L3c
        L10:
            monitor-enter(r0)
            boolean r2 = va.c.f14300g     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L17
            monitor-exit(r0)
            return
        L17:
            java.lang.String r2 = "com.tencent.mm.plugin.profile.ui.ContactInfoUI"
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r7)     // Catch: java.lang.Throwable -> L39
            if (r2 != 0) goto L25
            java.lang.String r2 = "[Hchat:ProfileId] 未找到好友资料页类"
            fb.v0.m(r2)     // Catch: java.lang.Throwable -> L39
            goto L31
        L25:
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            fb.f1 r4 = new fb.f1     // Catch: java.lang.Throwable -> L39
            r5 = 1
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L39
            uf.d.r(r2, r3, r4)     // Catch: java.lang.Throwable -> L39
        L31:
            uf.d.s(r1, r7)     // Catch: java.lang.Throwable -> L39
            r7 = 1
            va.c.f14300g = r7     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)
            return
        L39:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L3c:
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "资料页显示ID"
            return r0
    }
}
