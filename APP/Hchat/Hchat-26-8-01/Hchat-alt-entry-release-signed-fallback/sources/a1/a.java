package a1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12h;

    public /* synthetic */ a(ib.c r1, r8.g r2) {
            r0 = this;
            r1 = 23
            r0.f11g = r1
            r0.<init>()
            r0.f12h = r2
            return
    }

    public /* synthetic */ a(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f11g = r2
            r0.f12h = r1
            r0.<init>()
            return
    }

    private final void a() {
            r4 = this;
            java.lang.Object r0 = r4.f12h
            g8.g r0 = (g8.g) r0
            monitor-enter(r0)
            boolean r1 = r0.f4361e     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2d
            o8.d r1 = r0.f4357a     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto Le
            goto L2d
        Le:
            g8.e r2 = new g8.e     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L2b
            r1.g(r2)     // Catch: java.lang.Throwable -> L2b
            r1 = 1
            r0.f4361e = r1     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "群聊变更监听已安装"
            g1.d r2 = r0.f4359c     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L29
            java.lang.String r2 = "[WeChatChatroomChangeApi] "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L2b
            i8.i.f(r1)     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)
            goto L2e
        L2b:
            r1 = move-exception
            goto L2f
        L2d:
            monitor-exit(r0)
        L2e:
            return
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r1
    }

    private final void b() {
            r8 = this;
            java.lang.Object r0 = r8.f12h
            q8.o r0 = (q8.o) r0
            java.lang.String r1 = "当前Activity Hook失败: "
            monitor-enter(r0)
            boolean r2 = r0.f10731c     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto Ld
            monitor-exit(r0)
            return
        Ld:
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "onResume"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r2, r3, r5)     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r5 = "onPause"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r3, r5, r6)     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            java.lang.String r6 = "onDestroy"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r5, r6, r4)     // Catch: java.lang.Throwable -> L56
            r8.i r5 = r8.i.f11631b     // Catch: java.lang.Throwable -> L56
            q8.n r6 = new q8.n     // Catch: java.lang.Throwable -> L56
            r7 = 0
            r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L56
            r5.b(r2, r6)     // Catch: java.lang.Throwable -> L56
            q8.n r2 = new q8.n     // Catch: java.lang.Throwable -> L56
            r6 = 1
            r2.<init>(r0, r6)     // Catch: java.lang.Throwable -> L56
            r5.b(r3, r2)     // Catch: java.lang.Throwable -> L56
            r5.b(r4, r2)     // Catch: java.lang.Throwable -> L56
            r2 = 1
            r0.f10731c = r2     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "当前Activity Hook已安装"
            i8.f r3 = r0.f10729a     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L74
            java.lang.String r3 = "[WeChatCurrentActivityApi] "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L56
            i8.i.f(r2)     // Catch: java.lang.Throwable -> L56
            goto L74
        L56:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> L76
            r3.append(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L76
            i8.f r2 = r0.f10729a     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L74
            java.lang.String r2 = "[WeChatCurrentActivityApi] "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L76
            i8.i.f(r1)     // Catch: java.lang.Throwable -> L76
        L74:
            monitor-exit(r0)
            return
        L76:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            throw r1
    }

    private final void c() {
            r4 = this;
            java.lang.Object r0 = r4.f12h
            q8.i r0 = (q8.i) r0
            java.lang.String r1 = "Activity启动监听Hook: methods="
            monitor-enter(r0)
            boolean r2 = r0.f10709c     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto Ld
            monitor-exit(r0)
            return
        Ld:
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            int r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<android.content.ContextWrapper> r3 = android.content.ContextWrapper.class
            int r3 = r0.a(r3)     // Catch: java.lang.Throwable -> L3c
            int r2 = r2 + r3
            if (r2 <= 0) goto L1e
            r3 = 1
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r0.f10709c = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3c
            r3.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L3c
            i8.f r2 = r0.f10707a     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3a
            java.lang.String r2 = "[WeChatActivityStartApi] "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L3c
            i8.i.f(r1)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r0)
            return
        L3c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r1
    }

    private final void d() {
            r5 = this;
            java.lang.Object r0 = r5.f12h
            q8.q r0 = (q8.q) r0
            java.lang.String r1 = "生命周期监听Hook: methods="
            monitor-enter(r0)
            boolean r2 = r0.f10734c     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto Ld
            monitor-exit(r0)
            return
        Ld:
            java.lang.String r2 = "onResume"
            java.lang.String r3 = "resume"
            int r2 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "onPause"
            java.lang.String r4 = "pause"
            int r3 = r0.a(r3, r4)     // Catch: java.lang.Throwable -> L3f
            int r2 = r2 + r3
            java.lang.String r3 = "onDestroy"
            java.lang.String r4 = "destroy"
            int r3 = r0.a(r3, r4)     // Catch: java.lang.Throwable -> L3f
            int r2 = r2 + r3
            if (r2 <= 0) goto L2b
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            r0.f10734c = r3     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            r3.append(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            r0.b(r1)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)
            return
        L3f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
    }

    private final void e() {
            r4 = this;
            java.lang.Object r0 = r4.f12h
            q8.m r0 = (q8.m) r0
            java.lang.String r1 = "聊天页监听已安装: dexMethods="
            monitor-enter(r0)
            boolean r2 = r0.f10722h     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto Ld
            monitor-exit(r0)
            goto L47
        Ld:
            int r2 = r0.d()     // Catch: java.lang.Throwable -> L22
            r0.f10723i = r2     // Catch: java.lang.Throwable -> L22
            q8.i r2 = r0.f10718d     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            q8.j r3 = new q8.j     // Catch: java.lang.Throwable -> L22
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f10708b     // Catch: java.lang.Throwable -> L22
            r2.addIfAbsent(r3)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r1 = move-exception
            goto L48
        L24:
            q8.q r2 = r0.f10717c     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L32
            q8.k r3 = new q8.k     // Catch: java.lang.Throwable -> L22
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f10733b     // Catch: java.lang.Throwable -> L22
            r2.addIfAbsent(r3)     // Catch: java.lang.Throwable -> L22
        L32:
            r2 = 1
            r0.f10722h = r2     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L22
            int r1 = r0.f10723i     // Catch: java.lang.Throwable -> L22
            r2.append(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L22
            r0.e(r1)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
        L47:
            return
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    private final void f() {
            r5 = this;
            java.lang.Object r0 = r5.f12h
            l3.r r0 = (l3.r) r0
            java.lang.String r1 = "fetchFonts result is not OK. ("
            java.lang.Object r2 = r0.f7814d
            monitor-enter(r2)
            a7.a r3 = r0.f7818h     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            goto Lc6
        L12:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            e3.d r2 = r0.c()     // Catch: java.lang.Throwable -> L24
            int r3 = r2.f2352e     // Catch: java.lang.Throwable -> L24
            r4 = 2
            if (r3 != r4) goto L27
            java.lang.Object r4 = r0.f7814d     // Catch: java.lang.Throwable -> L24
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            goto L27
        L21:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            throw r1     // Catch: java.lang.Throwable -> L24
        L24:
            r1 = move-exception
            goto Lb2
        L27:
            if (r3 != 0) goto L9b
            java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r3 = d3.c.f1974a     // Catch: java.lang.Throwable -> L8e
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L8e
            a2.a r1 = r0.f7813c     // Catch: java.lang.Throwable -> L8e
            android.content.Context r3 = r0.f7811a     // Catch: java.lang.Throwable -> L8e
            r1.getClass()     // Catch: java.lang.Throwable -> L8e
            e3.d[] r1 = new e3.d[]{r2}     // Catch: java.lang.Throwable -> L8e
            a.a r4 = b3.c.f450a     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "TypefaceCompat.createFromFontInfo"
            a.a.o(r4)     // Catch: java.lang.Throwable -> L8e
            a.a r4 = b3.c.f450a     // Catch: java.lang.Throwable -> L90
            android.graphics.Typeface r1 = r4.D(r3, r1)     // Catch: java.lang.Throwable -> L90
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L8e
            android.content.Context r3 = r0.f7811a     // Catch: java.lang.Throwable -> L8e
            android.net.Uri r2 = r2.f2348a     // Catch: java.lang.Throwable -> L8e
            java.nio.MappedByteBuffer r2 = a7.a.C(r3, r2)     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L86
            if (r1 == 0) goto L86
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L7f
            hb.c r3 = new hb.c     // Catch: java.lang.Throwable -> L7f
            m3.b r2 = be.h.T(r2)     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r1, r2)     // Catch: java.lang.Throwable -> L7f
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L8e
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r0.f7814d     // Catch: java.lang.Throwable -> L24
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L24
            a7.a r2 = r0.f7818h     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L78
            r2.E(r3)     // Catch: java.lang.Throwable -> L76
            goto L78
        L76:
            r2 = move-exception
            goto L7d
        L78:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L76
            r0.b()     // Catch: java.lang.Throwable -> L24
            return
        L7d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L76
            throw r2     // Catch: java.lang.Throwable -> L24
        L7f:
            r1 = move-exception
            int r2 = d3.c.f1974a     // Catch: java.lang.Throwable -> L8e
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L86:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r1 = move-exception
            goto L95
        L90:
            r1 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L95:
            int r2 = d3.c.f1974a     // Catch: java.lang.Throwable -> L24
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L24
            throw r1     // Catch: java.lang.Throwable -> L24
        L9b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L24
            r4.append(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = ")"
            r4.append(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L24
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L24
            throw r2     // Catch: java.lang.Throwable -> L24
        Lb2:
            java.lang.Object r3 = r0.f7814d
            monitor-enter(r3)
            a7.a r2 = r0.f7818h     // Catch: java.lang.Throwable -> Lbd
            if (r2 == 0) goto Lbf
            r2.D(r1)     // Catch: java.lang.Throwable -> Lbd
            goto Lbf
        Lbd:
            r0 = move-exception
            goto Lc4
        Lbf:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbd
            r0.b()
            return
        Lc4:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lbd
            throw r0
        Lc6:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    private final void g() {
            r9 = this;
            java.lang.Object r0 = r9.f12h
            rb.k r0 = (rb.k) r0
            java.lang.String r1 = "正在检测 "
            java.lang.Object r2 = r0.f11907d
            monitor-enter(r2)
            boolean r3 = r0.f11916m     // Catch: java.lang.Throwable -> L12d
            if (r3 == 0) goto L12f
            rb.h r3 = r0.f11920q     // Catch: java.lang.Throwable -> L12d
            if (r3 == 0) goto L13
            goto L12f
        L13:
            java.util.ArrayDeque r3 = r0.f11910g     // Catch: java.lang.Throwable -> L12d
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L12d
            r4 = 0
            if (r3 == 0) goto L1e
            r3 = r4
            goto L26
        L1e:
            java.util.ArrayDeque r3 = r0.f11910g     // Catch: java.lang.Throwable -> L12d
            java.lang.Object r3 = r3.removeFirst()     // Catch: java.lang.Throwable -> L12d
            rb.j r3 = (rb.j) r3     // Catch: java.lang.Throwable -> L12d
        L26:
            monitor-exit(r2)
            if (r3 != 0) goto L2d
            r0.e()
            return
        L2d:
            java.util.concurrent.ConcurrentHashMap r2 = r0.f11913j
            java.lang.String r5 = r3.f11902a
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L3b
            java.lang.String r2 = ""
        L3b:
            boolean r5 = og.m.t0(r2)
            if (r5 == 0) goto L43
            java.lang.String r2 = r3.f11902a
        L43:
            rb.c r5 = r0.f11914k     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            java.lang.String r6 = r3.f11902a     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.a(r6)     // Catch: java.lang.Throwable -> L4e
            goto L58
        L4e:
            r5 = move-exception
            goto L52
        L50:
            r5 = r4
            goto L58
        L52:
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L58:
            boolean r6 = r5 instanceof sf.f
            if (r6 == 0) goto L5e
            r5 = r4
        L5e:
            if (r5 != 0) goto L70
            rb.d r1 = new rb.d
            java.lang.String r3 = r3.f11902a
            rb.e r4 = rb.e.f11887i
            java.lang.String r5 = "构造检测请求失败"
            r1.<init>(r3, r2, r4, r5)
            r0.i(r1)
            goto L128
        L70:
            rb.h r6 = new rb.h
            r6.<init>(r3, r5)
            java.lang.Object r7 = r0.f11907d
            monitor-enter(r7)
            boolean r8 = r0.f11916m     // Catch: java.lang.Throwable -> L87
            if (r8 != 0) goto L8a
            java.util.ArrayDeque r1 = r0.f11910g     // Catch: java.lang.Throwable -> L87
            r1.addFirst(r3)     // Catch: java.lang.Throwable -> L87
            r0.h()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r7)
            goto L128
        L87:
            r0 = move-exception
            goto L12b
        L8a:
            r0.f11920q = r6     // Catch: java.lang.Throwable -> L87
            r0.f11918o = r2     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L87
            r3.append(r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L87
            r0.f11917n = r1     // Catch: java.lang.Throwable -> L87
            r0.h()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r7)
            r0.m()
            r1 = 0
            rb.c r2 = r0.f11914k     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto Lc1
            m8.a r3 = h.Hchat.hooks.api.core.WeChatApis.network()     // Catch: java.lang.Throwable -> Lc7
            if (r3 == 0) goto Lbc
            r8.g r2 = r2.f11873a     // Catch: java.lang.Throwable -> Lc7
            h.Hchat.dexkit.DexFinder r2 = r2.f11624e     // Catch: java.lang.Throwable -> Lc7
            r3.a(r2)     // Catch: java.lang.Throwable -> Lc7
            m8.c r2 = r3.f8777a     // Catch: java.lang.Throwable -> Lc7
            boolean r2 = r2.j(r5)     // Catch: java.lang.Throwable -> Lc7
            goto Lbd
        Lbc:
            r2 = r1
        Lbd:
            r3 = 1
            if (r2 != r3) goto Lc1
            goto Lc2
        Lc1:
            r3 = r1
        Lc2:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lc7
            goto Lce
        Lc7:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        Lce:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r5 = r2 instanceof sf.f
            if (r5 == 0) goto Ld5
            r2 = r3
        Ld5:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lf6
            java.lang.Object r1 = r0.f11907d
            monitor-enter(r1)
            rb.h r2 = r0.f11920q     // Catch: java.lang.Throwable -> Le7
            if (r2 != r6) goto Le9
            r0.f11920q = r4     // Catch: java.lang.Throwable -> Le7
            goto Le9
        Le7:
            r0 = move-exception
            goto Lf4
        Le9:
            java.lang.String r2 = ""
            r0.f11918o = r2     // Catch: java.lang.Throwable -> Le7
            monitor-exit(r1)
            java.lang.String r1 = "检测请求发送失败"
            r0.f(r6, r1)
            goto L128
        Lf4:
            monitor-exit(r1)
            throw r0
        Lf6:
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r0.f11908e
            rb.g r3 = new rb.g
            r4 = 0
            r3.<init>(r0, r4, r6)
            rb.l r4 = r0.f11906c
            android.content.SharedPreferences r4 = r4.f11928a
            java.lang.String r5 = "zombie_check_timeout_seconds"
            r7 = 15
            int r4 = r4.getInt(r5, r7)
            r5 = 5
            r7 = 60
            int r4 = r9.e0.r(r4, r5, r7)
            long r4 = (long) r4
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledFuture r2 = r2.schedule(r3, r4, r7)
            java.lang.Object r3 = r0.f11907d
            monitor-enter(r3)
            rb.h r0 = r0.f11920q     // Catch: java.lang.Throwable -> L122
            if (r0 != r6) goto L124
            r6.f11899c = r2     // Catch: java.lang.Throwable -> L122
            goto L127
        L122:
            r0 = move-exception
            goto L129
        L124:
            r2.cancel(r1)     // Catch: java.lang.Throwable -> L122
        L127:
            monitor-exit(r3)
        L128:
            return
        L129:
            monitor-exit(r3)
            throw r0
        L12b:
            monitor-exit(r7)
            throw r0
        L12d:
            r0 = move-exception
            goto L131
        L12f:
            monitor-exit(r2)
            return
        L131:
            monitor-exit(r2)
            throw r0
    }

    @Override // java.lang.Runnable
    public final void run() {
            r26 = this;
            r1 = r26
            int r0 = r1.f11g
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r0) {
                case 0: goto L515;
                case 1: goto L4f1;
                case 2: goto L4e9;
                case 3: goto L4dd;
                case 4: goto L4d5;
                case 5: goto L35c;
                case 6: goto L33b;
                case 7: goto L31d;
                case 8: goto L315;
                case 9: goto L30d;
                case 10: goto L230;
                case 11: goto L1c5;
                case 12: goto L1bd;
                case 13: goto L1b5;
                case 14: goto L185;
                case 15: goto L155;
                case 16: goto L151;
                case 17: goto L14d;
                case 18: goto L149;
                case 19: goto L145;
                case 20: goto L13d;
                case 21: goto L139;
                case 22: goto L127;
                case 23: goto Ldf;
                case 24: goto Ldb;
                case 25: goto L27;
                case 26: goto L23;
                case 27: goto L1b;
                case 28: goto L13;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r1.f12h
            gg.q r0 = (gg.q) r0
            r0.f4560g = r5
            return
        L13:
            java.lang.Object r0 = r1.f12h
            u9.f r0 = (u9.f) r0
            r0.invoke()
            return
        L1b:
            java.lang.Object r0 = r1.f12h
            ra.c r0 = (ra.c) r0
            r0.f()
            return
        L23:
            r1.g()
            return
        L27:
            java.lang.Object r0 = r1.f12h
            n2.v r0 = (n2.v) r0
            b5.c r7 = r0.f8987b
            r0.f8999n = r2
            j0.b r8 = r0.f8998m
            android.view.View r0 = r0.f8986a
            boolean r9 = r0.isFocused()
            if (r9 != 0) goto L4e
            android.view.View r0 = r0.getRootView()
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L4e
            boolean r0 = r0.onCheckIsTextEditor()
            if (r0 != r6) goto L4e
            r8.g()
            goto Lda
        L4e:
            java.lang.Object[] r0 = r8.f6671g
            int r9 = r8.f6673i
            r10 = r2
            r11 = r5
        L54:
            if (r11 >= r9) goto L8a
            r12 = r0[r11]
            n2.u r12 = (n2.u) r12
            int r13 = r12.ordinal()
            if (r13 == 0) goto L84
            if (r13 == r6) goto L80
            if (r13 == r4) goto L6c
            if (r13 != r3) goto L67
            goto L6c
        L67:
            okio.a.k()
            goto Lda
        L6c:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            boolean r13 = gg.l.a(r2, r13)
            if (r13 != 0) goto L87
            n2.u r10 = n2.u.f8983i
            if (r12 != r10) goto L7a
            r10 = r6
            goto L7b
        L7a:
            r10 = r5
        L7b:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            goto L87
        L80:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L82:
            r10 = r2
            goto L87
        L84:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L82
        L87:
            int r11 = r11 + 1
            goto L54
        L8a:
            r8.g()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = gg.l.a(r2, r0)
            if (r0 == 0) goto La4
            java.lang.Object r0 = r7.f470b
            java.lang.Object r0 = r0.getValue()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            java.lang.Object r3 = r7.f469a
            android.view.View r3 = (android.view.View) r3
            r0.restartInput(r3)
        La4:
            if (r10 == 0) goto Lc3
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto Lb8
            java.lang.Object r0 = r7.f471c
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            java.lang.Object r0 = r0.f310h
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.b0()
            goto Lc3
        Lb8:
            java.lang.Object r0 = r7.f471c
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            java.lang.Object r0 = r0.f310h
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.y()
        Lc3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = gg.l.a(r2, r0)
            if (r0 == 0) goto Lda
            java.lang.Object r0 = r7.f470b
            java.lang.Object r0 = r0.getValue()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            java.lang.Object r2 = r7.f469a
            android.view.View r2 = (android.view.View) r2
            r0.restartInput(r2)
        Lda:
            return
        Ldb:
            r1.f()
            return
        Ldf:
            java.lang.Object r0 = r1.f12h
            r8.g r0 = (r8.g) r0
            e8.c r2 = new e8.c     // Catch: java.lang.Throwable -> L112
            org.luckypray.dexkit.DexKitBridge r3 = r0.f11623d     // Catch: java.lang.Throwable -> L112
            java.lang.ClassLoader r4 = r0.f11622c     // Catch: java.lang.Throwable -> L112
            android.content.Context r0 = r0.f11620a     // Catch: java.lang.Throwable -> L112
            r2.<init>(r3, r4, r0)     // Catch: java.lang.Throwable -> L112
            ib.b r3 = new ib.b     // Catch: java.lang.Throwable -> L112
            r3.<init>(r0, r5)     // Catch: java.lang.Throwable -> L112
            android.content.SharedPreferences r7 = r3.f6650a     // Catch: java.lang.Throwable -> L112
            java.lang.String r8 = "plus_menu_enable"
            boolean r8 = r7.getBoolean(r8, r5)     // Catch: java.lang.Throwable -> L112
            if (r8 != 0) goto L114
            java.lang.String r8 = "plugin_agent_plus_menu_enable"
            boolean r7 = r7.getBoolean(r8, r5)     // Catch: java.lang.Throwable -> L112
            if (r7 != 0) goto L114
            boolean r7 = ya.i.c(r0)     // Catch: java.lang.Throwable -> L112
            if (r7 != 0) goto L114
            boolean r7 = f8.i.T(r0)     // Catch: java.lang.Throwable -> L112
            if (r7 == 0) goto L115
            goto L114
        L112:
            r0 = move-exception
            goto L121
        L114:
            r5 = r6
        L115:
            r2.k(r5)     // Catch: java.lang.Throwable -> L112
            q8.h r5 = new q8.h     // Catch: java.lang.Throwable -> L112
            r5.<init>(r0, r4, r2, r3)     // Catch: java.lang.Throwable -> L112
            r5.r()     // Catch: java.lang.Throwable -> L112
            goto L126
        L121:
            java.lang.String r2 = "[Hchat:Settings] 设置入口安装失败"
            fb.v0.n(r2, r0)
        L126:
            return
        L127:
            java.lang.Object r0 = r1.f12h
            ia.a0 r0 = (ia.a0) r0
            r8.g r0 = r0.f6538a
            android.content.Context r0 = r0.f11620a
            java.lang.String r2 = "伪评论仅在本机显示，不能回复"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r5)
            r0.show()
            return
        L139:
            r1.e()
            return
        L13d:
            java.lang.Object r0 = r1.f12h
            k8.p r0 = (k8.p) r0
            r0.b()
            return
        L145:
            r1.d()
            return
        L149:
            r1.c()
            return
        L14d:
            r1.b()
            return
        L151:
            r1.a()
            return
        L155:
            java.lang.Object r0 = r1.f12h
            r2 = r0
            g8.j r2 = (g8.j) r2
            monitor-enter(r2)
            boolean r0 = r2.f4385e     // Catch: java.lang.Throwable -> L17f
            if (r0 != 0) goto L181
            o8.d r0 = r2.f4381a     // Catch: java.lang.Throwable -> L17f
            if (r0 != 0) goto L164
            goto L181
        L164:
            g8.e r3 = new g8.e     // Catch: java.lang.Throwable -> L17f
            r3.<init>(r2, r6)     // Catch: java.lang.Throwable -> L17f
            r0.g(r3)     // Catch: java.lang.Throwable -> L17f
            r2.f4385e = r6     // Catch: java.lang.Throwable -> L17f
            java.lang.String r0 = "联系人变更监听已安装"
            g1.d r3 = r2.f4383c     // Catch: java.lang.Throwable -> L17f
            if (r3 == 0) goto L17d
            java.lang.String r3 = "[WeChatContactChangeApi] "
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> L17f
            i8.i.f(r0)     // Catch: java.lang.Throwable -> L17f
        L17d:
            monitor-exit(r2)
            goto L182
        L17f:
            r0 = move-exception
            goto L183
        L181:
            monitor-exit(r2)
        L182:
            return
        L183:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17f
            throw r0
        L185:
            java.lang.Object r0 = r1.f12h
            r2 = r0
            h8.b r2 = (h8.b) r2
            monitor-enter(r2)
            boolean r0 = r2.f5143e     // Catch: java.lang.Throwable -> L1af
            if (r0 != 0) goto L1b1
            o8.d r0 = r2.f5139a     // Catch: java.lang.Throwable -> L1af
            if (r0 != 0) goto L194
            goto L1b1
        L194:
            g8.e r3 = new g8.e     // Catch: java.lang.Throwable -> L1af
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L1af
            r0.g(r3)     // Catch: java.lang.Throwable -> L1af
            r2.f5143e = r6     // Catch: java.lang.Throwable -> L1af
            java.lang.String r0 = "会话变更监听已安装"
            g1.d r3 = r2.f5141c     // Catch: java.lang.Throwable -> L1af
            if (r3 == 0) goto L1ad
            java.lang.String r3 = "[WeChatConversationChangeApi] "
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> L1af
            i8.i.f(r0)     // Catch: java.lang.Throwable -> L1af
        L1ad:
            monitor-exit(r2)
            goto L1b2
        L1af:
            r0 = move-exception
            goto L1b3
        L1b1:
            monitor-exit(r2)
        L1b2:
            return
        L1b3:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1af
            throw r0
        L1b5:
            java.lang.Object r0 = r1.f12h
            k8.i r0 = (k8.i) r0
            r0.a()
            return
        L1bd:
            java.lang.Object r0 = r1.f12h
            o8.d r0 = (o8.d) r0
            r0.e()
            return
        L1c5:
            java.lang.Object r0 = r1.f12h
            ha.z r0 = (ha.z) r0
            java.util.Map r2 = r0.f5300g
            r2.getClass()
            monitor-enter(r2)
            java.util.Map r3 = r0.f5300g     // Catch: java.lang.Throwable -> L201
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L201
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L201
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L201
            int r5 = tf.n.e1(r3)     // Catch: java.lang.Throwable -> L201
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L201
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L201
        L1e4:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L201
            if (r5 == 0) goto L203
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L201
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L201
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L201
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L201
            sf.e r7 = new sf.e     // Catch: java.lang.Throwable -> L201
            r7.<init>(r6, r5)     // Catch: java.lang.Throwable -> L201
            r4.add(r7)     // Catch: java.lang.Throwable -> L201
            goto L1e4
        L201:
            r0 = move-exception
            goto L22e
        L203:
            monitor-exit(r2)
            java.util.Iterator r2 = r4.iterator()
        L208:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L22d
            java.lang.Object r3 = r2.next()
            sf.e r3 = (sf.e) r3
            java.lang.Object r4 = r3.f12418g
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r3.f12419h
            r4.getClass()
            r0.q(r4)
            r3.getClass()
            boolean r3 = r0.r(r3)
            if (r3 == 0) goto L208
            r0.d(r4)
            goto L208
        L22d:
            return
        L22e:
            monitor-exit(r2)
            throw r0
        L230:
            java.lang.String r2 = "last_result"
            java.lang.String r3 = "last_time"
            java.lang.Object r0 = r1.f12h
            r4 = r0
            ha.m r4 = (ha.m) r4
            java.lang.String r7 = ""
            android.content.SharedPreferences r8 = r4.f5258b
            java.lang.String r0 = "enable"
            boolean r0 = r8.getBoolean(r0, r5)
            if (r0 != 0) goto L247
            goto L30c
        L247:
            java.lang.String r0 = "time_window_enable"
            boolean r0 = r8.getBoolean(r0, r5)
            if (r0 == 0) goto L26d
            java.lang.String r0 = "start_time"
            java.lang.String r9 = "08:00:00"
            java.lang.String r0 = r8.getString(r0, r9)
            if (r0 != 0) goto L25a
            r0 = r7
        L25a:
            java.lang.String r9 = "end_time"
            java.lang.String r10 = "23:00:00"
            java.lang.String r9 = r8.getString(r9, r10)
            if (r9 != 0) goto L265
            r9 = r7
        L265:
            boolean r0 = r9.e0.H(r0, r9)
            if (r0 != 0) goto L26d
            goto L30c
        L26d:
            java.lang.String r0 = "interval_seconds"
            r9 = 300(0x12c, float:4.2E-43)
            int r0 = r8.getInt(r0, r9)
            if (r0 >= 0) goto L278
            r0 = r5
        L278:
            long r9 = (long) r0
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = r4.f5261e
            long r13 = r11 - r13
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 >= 0) goto L28a
            goto L30c
        L28a:
            r4.f5261e = r11
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi()     // Catch: java.lang.Throwable -> L29a
            if (r0 == 0) goto L29c
            boolean r0 = r0.s()     // Catch: java.lang.Throwable -> L29a
            if (r0 != r6) goto L29c
            r5 = r6
            goto L29c
        L29a:
            r0 = move-exception
            goto L2a1
        L29c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L29a
            goto L2a7
        L2a1:
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L2a7:
            boolean r5 = r0 instanceof sf.f
            r13 = 30000(0x7530, double:1.4822E-319)
            if (r5 != 0) goto L2d7
            r5 = r0
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L2c1
            long r15 = r11 - r9
            long r17 = java.lang.Math.min(r9, r13)
            long r13 = r17 + r15
            r4.f5261e = r13
        L2c1:
            if (r5 == 0) goto L2c6
            java.lang.String r5 = "刷新请求已提交"
            goto L2c8
        L2c6:
            java.lang.String r5 = "刷新请求提交失败"
        L2c8:
            android.content.SharedPreferences$Editor r6 = r8.edit()
            android.content.SharedPreferences$Editor r6 = r6.putLong(r3, r11)
            android.content.SharedPreferences$Editor r5 = r6.putString(r2, r5)
            r5.apply()
        L2d7:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L30c
            long r5 = r11 - r9
            r13 = 30000(0x7530, double:1.4822E-319)
            long r9 = java.lang.Math.min(r9, r13)
            long r9 = r9 + r5
            r4.f5261e = r9
            java.lang.String r5 = r0.getMessage()
            if (r5 != 0) goto L2ef
            goto L2f0
        L2ef:
            r7 = r5
        L2f0:
            java.lang.String r5 = "刷新异常："
            java.lang.String r5 = r5.concat(r7)
            android.content.SharedPreferences$Editor r6 = r8.edit()
            android.content.SharedPreferences$Editor r3 = r6.putLong(r3, r11)
            android.content.SharedPreferences$Editor r2 = r3.putString(r2, r5)
            r2.apply()
            ab.b r2 = r4.f5257a
            java.lang.String r3 = "朋友圈自动刷新失败"
            r2.invoke(r3, r0)
        L30c:
            return
        L30d:
            java.lang.Object r0 = r1.f12h
            eb.w0 r0 = (eb.w0) r0
            h.Hchat.hooks.items.script.ScriptWaBridge.A(r0)
            return
        L315:
            java.lang.Object r0 = r1.f12h
            h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet r0 = (h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet) r0
            h.Hchat.hooks.items.script.ScriptPluginRuntime.t(r0)
            return
        L31d:
            java.lang.Object r0 = r1.f12h
            h.Hchat.hooks.items.script.ScriptMessageBean r0 = (h.Hchat.hooks.items.script.ScriptMessageBean) r0
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L330
            r2.dispatchOnHandleMsg(r0)     // Catch: java.lang.Throwable -> L330
            boolean r3 = r2.hasImageDownloadCallback()     // Catch: java.lang.Throwable -> L330
            if (r3 == 0) goto L33a
            r2.dispatchOnImageDownload(r0)     // Catch: java.lang.Throwable -> L330
            goto L33a
        L330:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:Script] 消息监听异步分发失败: "
            eh.a.x(r3, r2, r0)
        L33a:
            return
        L33b:
            java.lang.Object r0 = r1.f12h
            c9.r1 r0 = (c9.r1) r0
            android.app.Activity r2 = r0.f1335a
            boolean r3 = r2.isFinishing()
            if (r3 != 0) goto L35b
            boolean r3 = r2.isDestroyed()
            if (r3 != 0) goto L35b
            c9.j1 r3 = c9.j1.f1228a
            java.lang.String r3 = r0.f1336b
            ab.a r4 = new ab.a
            r5 = 9
            r4.<init>(r0, r5)
            c9.j1.v(r2, r3, r4)
        L35b:
            return
        L35c:
            java.lang.Object r0 = r1.f12h
            c9.x1 r0 = (c9.x1) r0
            c9.u1 r7 = r0.f1433a
            android.app.Activity r8 = r7.f1393a
            boolean r9 = r8.isFinishing()
            if (r9 != 0) goto L4d4
            boolean r9 = r8.isDestroyed()
            if (r9 == 0) goto L372
            goto L4d4
        L372:
            c9.v1 r9 = r0.f1434b
            int r9 = r9.ordinal()
            if (r9 == 0) goto L4b0
            if (r9 == r6) goto L4a2
            if (r9 == r4) goto L386
            if (r9 != r3) goto L381
            goto L386
        L381:
            okio.a.k()
            goto L4d4
        L386:
            c9.v1 r0 = r0.f1434b
            c9.v1 r2 = c9.v1.f1410i
            if (r0 != r2) goto L38e
            r0 = r6
            goto L38f
        L38e:
            r0 = r5
        L38f:
            java.lang.String r2 = r7.f1395c
            java.lang.String r3 = r7.f1394b
            r2.getClass()
            java.lang.Object r4 = c9.o2.f1298a
            monitor-enter(r4)
            java.lang.String r9 = c9.o2.a()     // Catch: java.lang.Throwable -> L3e6
            java.lang.CharSequence r2 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L3e6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3e6
            java.lang.CharSequence r3 = og.m.R0(r3)     // Catch: java.lang.Throwable -> L3e6
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3e6
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L3e6
            if (r10 != 0) goto L3ef
            boolean r10 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L3e6
            if (r10 != 0) goto L3ef
            boolean r10 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L3e6
            if (r10 == 0) goto L3c0
            goto L3ef
        L3c0:
            java.util.List r10 = c9.o2.j(r8, r9)     // Catch: java.lang.Throwable -> L3e6
            java.util.Iterator r11 = r10.iterator()     // Catch: java.lang.Throwable -> L3e6
            r12 = r5
        L3c9:
            boolean r13 = r11.hasNext()     // Catch: java.lang.Throwable -> L3e6
            if (r13 == 0) goto L3ec
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Throwable -> L3e6
            c9.a r13 = (c9.a) r13     // Catch: java.lang.Throwable -> L3e6
            java.lang.String r14 = r13.f1081a     // Catch: java.lang.Throwable -> L3e6
            boolean r14 = gg.l.a(r14, r2)     // Catch: java.lang.Throwable -> L3e6
            if (r14 == 0) goto L3e9
            java.util.List r13 = r13.f1085e     // Catch: java.lang.Throwable -> L3e6
            boolean r13 = r13.contains(r3)     // Catch: java.lang.Throwable -> L3e6
            if (r13 == 0) goto L3e9
            goto L3ed
        L3e6:
            r0 = move-exception
            goto L4a0
        L3e9:
            int r12 = r12 + 1
            goto L3c9
        L3ec:
            r12 = -1
        L3ed:
            if (r12 >= 0) goto L3f2
        L3ef:
            r6 = r5
            goto L47e
        L3f2:
            java.lang.Object r2 = r10.get(r12)     // Catch: java.lang.Throwable -> L3e6
            r13 = r2
            c9.a r13 = (c9.a) r13     // Catch: java.lang.Throwable -> L3e6
            if (r0 == 0) goto L427
            java.util.List r2 = a.a.x0(r3)     // Catch: java.lang.Throwable -> L3e6
            java.util.List r11 = r13.f1086f     // Catch: java.lang.Throwable -> L3e6
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e6
            r14.<init>()     // Catch: java.lang.Throwable -> L3e6
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L3e6
        L40a:
            boolean r15 = r11.hasNext()     // Catch: java.lang.Throwable -> L3e6
            if (r15 == 0) goto L422
            java.lang.Object r15 = r11.next()     // Catch: java.lang.Throwable -> L3e6
            r6 = r15
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L3e6
            boolean r6 = gg.l.a(r6, r3)     // Catch: java.lang.Throwable -> L3e6
            if (r6 != 0) goto L420
            r14.add(r15)     // Catch: java.lang.Throwable -> L3e6
        L420:
            r6 = 1
            goto L40a
        L422:
            java.util.ArrayList r2 = tf.m.F1(r2, r14)     // Catch: java.lang.Throwable -> L3e6
            goto L44a
        L427:
            java.util.List r2 = r13.f1086f     // Catch: java.lang.Throwable -> L3e6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e6
            r6.<init>()     // Catch: java.lang.Throwable -> L3e6
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3e6
        L432:
            boolean r11 = r2.hasNext()     // Catch: java.lang.Throwable -> L3e6
            if (r11 == 0) goto L449
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L3e6
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L3e6
            boolean r14 = gg.l.a(r14, r3)     // Catch: java.lang.Throwable -> L3e6
            if (r14 != 0) goto L432
            r6.add(r11)     // Catch: java.lang.Throwable -> L3e6
            goto L432
        L449:
            r2 = r6
        L44a:
            java.util.List r3 = r13.f1086f     // Catch: java.lang.Throwable -> L3e6
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L3e6
            if (r3 == 0) goto L454
            r6 = 1
            goto L47e
        L454:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e6
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L3e6
            r24 = 0
            r25 = 4063(0xfdf, float:5.693E-42)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r19 = r2
            c9.a r2 = c9.a.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> L3e6
            r3.set(r12, r2)     // Catch: java.lang.Throwable -> L3e6
            java.util.ArrayList r2 = c9.o2.l(r3)     // Catch: java.lang.Throwable -> L3e6
            boolean r6 = c9.o2.r(r8, r9, r2)     // Catch: java.lang.Throwable -> L3e6
        L47e:
            monitor-exit(r4)
            android.content.Context r2 = r8.getApplicationContext()
            if (r6 != 0) goto L488
            java.lang.String r0 = "更新分组置顶失败"
            goto L48f
        L488:
            if (r0 == 0) goto L48d
            java.lang.String r0 = "已在当前分组置顶"
            goto L48f
        L48d:
            java.lang.String r0 = "已取消当前分组置顶"
        L48f:
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r5)
            r0.show()
            if (r6 == 0) goto L4d4
            c9.d2 r0 = c9.d2.f1137a
            java.lang.Object r0 = r7.f1396d
            c9.d2.w(r0, r8)
            goto L4d4
        L4a0:
            monitor-exit(r4)
            throw r0
        L4a2:
            c9.j1 r0 = c9.j1.f1228a
            java.lang.String r0 = r7.f1394b
            aa.c r2 = new aa.c
            r3 = 5
            r2.<init>(r8, r3, r7)
            c9.j1.v(r8, r0, r2)
            goto L4d4
        L4b0:
            java.lang.String r0 = r7.f1394b
            boolean r0 = c9.o2.s(r8, r0, r2)
            android.content.Context r2 = r8.getApplicationContext()
            if (r0 == 0) goto L4bf
            java.lang.String r3 = "已移出当前分组"
            goto L4c1
        L4bf:
            java.lang.String r3 = "移出会话失败"
        L4c1:
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r5)
            r2.show()
            if (r0 == 0) goto L4d4
            c9.d2.y(r8)
            c9.d2 r0 = c9.d2.f1137a
            java.lang.Object r0 = r7.f1396d
            c9.d2.w(r0, r8)
        L4d4:
            return
        L4d5:
            java.lang.Object r0 = r1.f12h
            c9.r0 r0 = (c9.r0) r0
            r0.invoke()
            return
        L4dd:
            java.lang.Object r0 = r1.f12h
            b0.h r0 = (b0.h) r0
            android.view.ActionMode r0 = r0.f374h
            if (r0 == 0) goto L4e8
            r0.finish()
        L4e8:
            return
        L4e9:
            java.lang.Object r0 = r1.f12h
            y2.v r0 = (y2.v) r0
            y2.v.a(r0)
            return
        L4f1:
            java.lang.Object r0 = r1.f12h
            androidx.lifecycle.y r0 = (androidx.lifecycle.y) r0
            androidx.lifecycle.s r2 = r0.f317l
            int r3 = r0.f313h
            if (r3 != 0) goto L504
            r3 = 1
            r0.f314i = r3
            androidx.lifecycle.k r4 = androidx.lifecycle.k.ON_PAUSE
            r2.d(r4)
            goto L505
        L504:
            r3 = 1
        L505:
            int r4 = r0.f312g
            if (r4 != 0) goto L514
            boolean r4 = r0.f314i
            if (r4 == 0) goto L514
            androidx.lifecycle.k r4 = androidx.lifecycle.k.ON_STOP
            r2.d(r4)
            r0.f315j = r3
        L514:
            return
        L515:
            java.lang.Object r0 = r1.f12h
            a1.i r0 = (a1.i) r0
            boolean r2 = r0.i()
            y1.t r3 = r0.f29g
            if (r2 != 0) goto L523
            goto L5c4
        L523:
            java.lang.String r2 = "ContentCapture:changeChecker"
            android.os.Trace.beginSection(r2)
            r2 = 1
            r3.x(r2)     // Catch: java.lang.Throwable -> L5c5
            f.w r2 = r0.f39q     // Catch: java.lang.Throwable -> L5c5
            int[] r6 = r2.f2844b     // Catch: java.lang.Throwable -> L5c5
            long[] r2 = r2.f2843a     // Catch: java.lang.Throwable -> L5c5
            int r7 = r2.length     // Catch: java.lang.Throwable -> L5c5
            int r7 = r7 - r4
            if (r7 < 0) goto L59f
            r4 = r5
        L537:
            r8 = r2[r4]     // Catch: java.lang.Throwable -> L5c5
            long r10 = ~r8     // Catch: java.lang.Throwable -> L5c5
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L595
            int r10 = r4 - r7
            int r10 = ~r10     // Catch: java.lang.Throwable -> L5c5
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L551:
            if (r12 >= r10) goto L590
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L587
            int r13 = r4 << 3
            int r13 = r13 + r12
            r15 = r6[r13]     // Catch: java.lang.Throwable -> L5c5
            f.k r13 = r0.h()     // Catch: java.lang.Throwable -> L5c5
            boolean r13 = r13.a(r15)     // Catch: java.lang.Throwable -> L5c5
            if (r13 != 0) goto L587
            java.util.ArrayList r13 = r0.f32j     // Catch: java.lang.Throwable -> L5c5
            a1.j r14 = new a1.j     // Catch: java.lang.Throwable -> L5c5
            r21 = r6
            long r5 = r0.f38p     // Catch: java.lang.Throwable -> L5c5
            a1.k r18 = a1.k.f48h     // Catch: java.lang.Throwable -> L5c5
            r19 = 0
            r16 = r5
            r14.<init>(r15, r16, r18, r19)     // Catch: java.lang.Throwable -> L5c5
            r13.add(r14)     // Catch: java.lang.Throwable -> L5c5
            sg.c r5 = r0.f36n     // Catch: java.lang.Throwable -> L5c5
            sf.n r6 = sf.n.f12433a     // Catch: java.lang.Throwable -> L5c5
            r5.p(r6)     // Catch: java.lang.Throwable -> L5c5
            goto L589
        L587:
            r21 = r6
        L589:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            r6 = r21
            r5 = 0
            goto L551
        L590:
            r21 = r6
            if (r10 != r11) goto L59f
            goto L597
        L595:
            r21 = r6
        L597:
            if (r4 == r7) goto L59f
            int r4 = r4 + 1
            r6 = r21
            r5 = 0
            goto L537
        L59f:
            java.lang.String r2 = "ContentCapture:sendAppearEvents"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L5c5
            f2.s r2 = r3.getSemanticsOwner()     // Catch: java.lang.Throwable -> L5c7
            f2.q r2 = r2.a()     // Catch: java.lang.Throwable -> L5c7
            y1.f2 r3 = r0.f40r     // Catch: java.lang.Throwable -> L5c7
            r0.k(r2, r3)     // Catch: java.lang.Throwable -> L5c7
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L5c5
            f.k r2 = r0.h()     // Catch: java.lang.Throwable -> L5c5
            r0.f(r2)     // Catch: java.lang.Throwable -> L5c5
            r0.o()     // Catch: java.lang.Throwable -> L5c5
            r2 = 0
            r0.f41s = r2     // Catch: java.lang.Throwable -> L5c5
            android.os.Trace.endSection()
        L5c4:
            return
        L5c5:
            r0 = move-exception
            goto L5cc
        L5c7:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L5c5
            throw r0     // Catch: java.lang.Throwable -> L5c5
        L5cc:
            android.os.Trace.endSection()
            throw r0
    }
}
