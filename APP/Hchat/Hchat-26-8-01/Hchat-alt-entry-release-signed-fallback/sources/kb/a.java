package kb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a2.a f7568e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f7569f;

    static {
            a2.a r0 = new a2.a
            r1 = 24
            r0.<init>(r1)
            kb.a.f7568e = r0
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "status_text_limit"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "允许个人状态词超过 10 个字"
            java.lang.String r1 = "entertainment"
            java.lang.String r2 = "status_text_limit"
            java.lang.String r3 = "解除状态词长度限制"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r9) {
            r8 = this;
            r9.getClass()
            a2.a r0 = kb.a.f7568e
            android.content.Context r1 = r9.f11620a
            java.lang.ClassLoader r9 = r9.f11622c
            if (r9 == 0) goto L61
            boolean r2 = kb.a.f7569f
            if (r2 == 0) goto L10
            goto L61
        L10:
            monitor-enter(r0)
            boolean r2 = kb.a.f7569f     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L17
            monitor-exit(r0)
            return
        L17:
            java.lang.String r2 = "com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2"
            java.lang.Class r9 = h.Hchat.utils.KavaReflector.loadClass(r2, r9)     // Catch: java.lang.Throwable -> L29
            r2 = 1
            if (r9 != 0) goto L2b
            java.lang.String r9 = "[Hchat:StatusTextLimit] 未找到状态词编辑页类"
            fb.v0.m(r9)     // Catch: java.lang.Throwable -> L29
            kb.a.f7569f = r2     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)
            return
        L29:
            r9 = move-exception
            goto L5f
        L2b:
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredConstructors(r9)     // Catch: java.lang.Throwable -> L29
            boolean r3 = r9.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L3e
            java.lang.String r9 = "[Hchat:StatusTextLimit] 未找到状态词编辑页构造方法"
            fb.v0.m(r9)     // Catch: java.lang.Throwable -> L29
            kb.a.f7569f = r2     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)
            return
        L3e:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L29
        L42:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Throwable -> L29
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> L29
            ea.b r5 = new ea.b     // Catch: java.lang.Throwable -> L29
            r6 = 4
            r7 = 0
            r5.<init>(r1, r6, r7)     // Catch: java.lang.Throwable -> L29
            r4.b(r3, r5)     // Catch: java.lang.Throwable -> L29
            goto L42
        L5b:
            kb.a.f7569f = r2     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)
            return
        L5f:
            monitor-exit(r0)
            throw r9
        L61:
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "解除状态词长度限制"
            return r0
    }
}
