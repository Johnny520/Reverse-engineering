package y8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {
    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "auto_view_original"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "打开聊天图片或视频时自动查看原图或原视频"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "auto_view_original"
            java.lang.String r3 = "自动查看原图"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            y8.d r1 = new y8.d
            ia.t r2 = new ia.t
            java.lang.Class<y8.a> r0 = y8.a.class
            java.lang.Class r5 = eh.a.i(r0)
            java.lang.String r6 = "logFeatureError"
            java.lang.String r7 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r9 = 0
            r10 = 29
            r3 = 2
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.<init>(r12, r2)
            monitor-enter(r1)
            boolean r0 = r1.f22325i     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L24
            monitor-exit(r1)
            return
        L24:
            java.lang.String r0 = "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI"
            java.lang.ClassLoader r12 = r12.f11622c     // Catch: java.lang.Throwable -> L89
            java.lang.Class r12 = h.Hchat.utils.KavaReflector.loadClass(r0, r12)     // Catch: java.lang.Throwable -> L89
            r0 = 0
            if (r12 == 0) goto L93
            java.lang.String r3 = "onResume"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L89
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r12, r3, r5)     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = "onDestroy"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L89
            java.lang.reflect.Method r12 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r12, r5, r4)     // Catch: java.lang.Throwable -> L89
            boolean r4 = y8.d.a(r3)     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L8c
            boolean r4 = y8.d.a(r12)     // Catch: java.lang.Throwable -> L89
            if (r4 != 0) goto L4d
            goto L8c
        L4d:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L6d
            r3.getClass()     // Catch: java.lang.Throwable -> L6d
            y8.b r2 = new y8.b     // Catch: java.lang.Throwable -> L6d
            r4 = 1
            r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> L6d
            r0.b(r3, r2)     // Catch: java.lang.Throwable -> L6d
            r12.getClass()     // Catch: java.lang.Throwable -> L6d
            y8.b r2 = new y8.b     // Catch: java.lang.Throwable -> L6d
            r3 = 2
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L6d
            r0.b(r12, r2)     // Catch: java.lang.Throwable -> L6d
            r12 = 1
            r1.f22325i = r12     // Catch: java.lang.Throwable -> L6d
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6d
            goto L75
        L6d:
            r0 = move-exception
            r12 = r0
            sf.f r0 = new sf.f     // Catch: java.lang.Throwable -> L89
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L89
            r12 = r0
        L75:
            java.lang.Throwable r0 = sf.g.b(r12)     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L7c
            goto L85
        L7c:
            ia.t r12 = r1.f22317a     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "安装聊天媒体查看页面 Hook 失败"
            r12.invoke(r2, r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L89
        L85:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L89
            monitor-exit(r1)
            return
        L89:
            r0 = move-exception
            r12 = r0
            goto L9a
        L8c:
            java.lang.String r12 = "聊天媒体查看页面生命周期入口不完整"
            r2.invoke(r12, r0)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r1)
            return
        L93:
            java.lang.String r12 = "未找到聊天媒体查看页面: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI"
            r2.invoke(r12, r0)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r1)
            return
        L9a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L89
            throw r12
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "自动查看原图"
            return r0
    }
}
