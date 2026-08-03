package jb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jb.e f6850e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "finder_media_download"
            return r0
    }

    @Override // r8.f
    public final boolean b(r8.g r3) {
            r2 = this;
            r3.getClass()
            android.content.Context r3 = r3.f11620a
            java.lang.String r0 = "Hchat_finder_media_download"
            android.content.SharedPreferences r3 = ub.b.c(r3, r0)
            java.lang.String r0 = "enable"
            r1 = 0
            boolean r3 = r3.getBoolean(r0, r1)
            return r3
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "在视频号分享菜单增加复制链接和下载入口"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "finder_media_download"
            java.lang.String r3 = "视频号媒体下载"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r11) {
            r10 = this;
            r11.getClass()
            jb.e r0 = new jb.e
            ia.t r1 = new ia.t
            java.lang.Class<jb.a> r2 = jb.a.class
            java.lang.Class r4 = eh.a.i(r2)
            r8 = 0
            r9 = 6
            r2 = 2
            java.lang.String r5 = "logError"
            java.lang.String r6 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r11, r1)
            r3.f6850e = r0
            i.e0 r11 = new i.e0
            r0 = 4
            r11.<init>(r10, r0)
            r0 = 12
            java.lang.String r1 = "finder_media_download"
            java.lang.String r2 = "视频号媒体下载"
            r4 = 0
            r8.e.f(r0, r11, r1, r2, r4)
            ke.h r11 = new ke.h
            r0 = 21
            r11.<init>(r10, r0)
            java.lang.Class<f8.e> r0 = f8.e.class
            r10.i(r0, r11)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "视频号媒体下载"
            return r0
    }
}
