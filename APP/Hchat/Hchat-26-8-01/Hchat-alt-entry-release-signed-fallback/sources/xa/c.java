package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xa.m f21421e;

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "quick_contact_edit"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "长按私聊会话或好友朋友圈头像快速修改备注和标签"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "quick_contact_edit"
            java.lang.String r3 = "快捷设置备注和标签"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            xa.m r1 = new xa.m
            ia.t r2 = new ia.t
            java.lang.Class<xa.c> r0 = xa.c.class
            java.lang.Class r5 = eh.a.i(r0)
            java.lang.String r6 = "logFeatureError"
            java.lang.String r7 = "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r9 = 0
            r10 = 28
            r3 = 2
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.<init>(r12, r2)
            r4.f21421e = r1
            monitor-enter(r1)
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsHeader"
            java.lang.ClassLoader r12 = r12.f11622c     // Catch: java.lang.Throwable -> L45
            java.lang.Class r12 = h.Hchat.utils.KavaReflector.loadClass(r0, r12)     // Catch: java.lang.Throwable -> L45
            r0 = 0
            if (r12 == 0) goto L4b
            java.lang.String r2 = "setAvatarOnClickListener"
            java.lang.Class<android.view.View$OnClickListener> r3 = android.view.View.OnClickListener.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r12 = h.Hchat.utils.KavaReflector.findMethodRecursive(r12, r2, r3)     // Catch: java.lang.Throwable -> L45
            if (r12 == 0) goto L48
            xa.k r2 = new xa.k     // Catch: java.lang.Throwable -> L45
            r3 = 2
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L45
            boolean r12 = r1.e(r12, r2)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)
            goto L4d
        L45:
            r0 = move-exception
            r12 = r0
            goto L69
        L48:
            monitor-exit(r1)
        L49:
            r12 = r0
            goto L4d
        L4b:
            monitor-exit(r1)
            goto L49
        L4d:
            r1 = 1
            if (r12 != r1) goto L51
            r0 = r1
        L51:
            if (r0 != 0) goto L59
            java.lang.String r12 = "好友朋友圈头像长按 Hook 未安装"
            r0 = 0
            r11.e(r12, r0)
        L59:
            r11.k()
            java.lang.Class<f8.e> r12 = f8.e.class
            q9.a r0 = new q9.a
            r1 = 12
            r0.<init>(r11, r1)
            r11.i(r12, r0)
            return
        L69:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r12
    }

    public final void k() {
            r5 = this;
            xa.b r0 = new xa.b
            r1 = 0
            r0.<init>(r5, r1)
            r1 = 12
            java.lang.String r2 = "quick_contact_edit"
            java.lang.String r3 = "快捷设置备注和标签"
            r4 = 0
            r8.e.f(r1, r0, r2, r3, r4)
            xa.b r0 = new xa.b
            r2 = 1
            r0.<init>(r5, r2)
            java.lang.String r2 = "quick_contact_edit:sns_avatar_menu"
            java.lang.String r3 = "快捷设置备注和标签朋友圈头像菜单"
            r8.e.f(r1, r0, r2, r3, r4)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "快捷设置备注和标签"
            return r0
    }
}
