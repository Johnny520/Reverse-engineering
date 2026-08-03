package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1315h;

    public /* synthetic */ p1(android.content.Context r1, int r2) {
            r0 = this;
            r0.f1314g = r2
            r0.f1315h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f1314g
            r1 = 0
            android.content.Context r2 = r11.f1315h
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L37;
                case 2: goto L2d;
                case 3: goto L13;
                default: goto L8;
            }
        L8:
            t3.d r0 = new t3.d
            r0.<init>()
            l3.w r3 = t3.f.f13050a
            t3.f.t(r2, r0, r3, r1)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.<init>(r5, r6, r7, r9, r10)
            c9.p1 r0 = new c9.p1
            r1 = 4
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L2d:
            java.lang.String r0 = "该消息暂不支持复读"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            return
        L37:
            h.Hchat.hooks.items.script.ScriptPluginRuntime.i(r2)
            return
        L3b:
            java.util.concurrent.atomic.AtomicBoolean r3 = c9.d2.f1139c
            java.util.concurrent.atomic.AtomicBoolean r4 = c9.d2.f1140d
        L3f:
            r4.set(r1)     // Catch: java.lang.Throwable -> L77
            c9.d2 r0 = c9.d2.f1137a     // Catch: java.lang.Throwable -> L77
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L51
            r0.getClass()     // Catch: java.lang.Throwable -> L51
            c9.d2.z(r0)     // Catch: java.lang.Throwable -> L51
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L51
            goto L58
        L51:
            r0 = move-exception
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L77
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L77
            r0 = r5
        L58:
            java.lang.Throwable r0 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L79
            java.lang.String r5 = r0.getMessage()     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = "[Hchat:ConversationGroup] 同步聊天分组失败: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L77
            r6.append(r5)     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L77
            fb.v0.n(r5, r0)     // Catch: java.lang.Throwable -> L77
            goto L79
        L77:
            r0 = move-exception
            goto L8c
        L79:
            boolean r0 = r4.get()     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L3f
            r3.set(r1)
            boolean r0 = r4.get()
            if (r0 == 0) goto L8b
            c9.d2.y(r2)
        L8b:
            return
        L8c:
            r3.set(r1)
            boolean r1 = r4.get()
            if (r1 == 0) goto L98
            c9.d2.y(r2)
        L98:
            throw r0
    }
}
