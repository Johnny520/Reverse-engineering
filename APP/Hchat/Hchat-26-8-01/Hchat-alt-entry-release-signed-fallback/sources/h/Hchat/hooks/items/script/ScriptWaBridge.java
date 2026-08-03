package h.Hchat.hooks.items.script;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptWaBridge {
    public static final int $stable = 8;
    private static final eb.z0 Companion = null;

    @java.lang.Deprecated
    public static final int SCRIPT_CONTACT_READ_ATTEMPTS = 5;

    @java.lang.Deprecated
    public static final long SCRIPT_CONTACT_READ_DELAY_MS = 250;

    @java.lang.Deprecated
    public static final long VIDEO_DOWNLOAD_TIMEOUT_MS = 60000;
    private final java.util.regex.Pattern atPattern;
    private final h.Hchat.hooks.items.script.ScriptPluginBridge bridge;
    private final java.util.concurrent.atomic.AtomicLong callbackSeq;
    private java.io.File currentPluginDir;
    private java.lang.String currentPluginName;
    private final sf.c durationCodec$delegate;
    private final java.util.Map<java.lang.Long, okhttp3.OkHttpClient> httpClients;

    static {
            eb.z0 r0 = new eb.z0
            r0.<init>()
            h.Hchat.hooks.items.script.ScriptWaBridge.Companion = r0
            return
    }

    public ScriptWaBridge(h.Hchat.hooks.items.script.ScriptPluginBridge r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.bridge = r3
            java.lang.String r3 = "\\[AtWx=([^\\]]+)]"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r3.getClass()
            r2.atPattern = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r0 = 1
            r3.<init>(r0)
            r2.callbackSeq = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Map r3 = java.util.Collections.synchronizedMap(r3)
            r2.httpClients = r3
            bi.c r3 = new bi.c
            r0 = 19
            r3.<init>(r0)
            sf.d r0 = sf.d.f12415g
            sf.c r3 = be.h.G(r0, r3)
            r2.durationCodec$delegate = r3
            return
    }

    public static /* synthetic */ void A(eb.w0 r0) {
            downloadVideoInternal$lambda$5(r0)
            return
    }

    public static /* synthetic */ void B(h.Hchat.hooks.items.script.ScriptWaBridge r0, long r1, a1.d r3) {
            delay$lambda$1(r0, r1, r3)
            return
    }

    public static /* synthetic */ sf.n C(java.util.function.Consumer r0, h.Hchat.hooks.items.script.ScriptWaBridge r1, java.lang.String r2, java.lang.String r3, java.util.Map r4, long r5) {
            sf.n r0 = download$lambda$0(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ java.lang.CharSequence D(h.Hchat.hooks.items.script.ScriptWaBridge r0, og.f r1) {
            java.lang.CharSequence r0 = unescapeXmlText$lambda$0(r0, r1)
            return r0
    }

    public static /* synthetic */ sf.n E(java.util.function.Consumer r0, h.Hchat.hooks.items.script.ScriptWaBridge r1, java.util.List r2, java.lang.String r3) {
            sf.n r0 = downloadImages$lambda$1(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ boolean F(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, byte[] r5, java.lang.String r6, j8.p r7) {
            boolean r0 = shareMiniProgram$lambda$0(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static /* synthetic */ boolean G(java.lang.String r0, java.lang.String r1, j8.p r2) {
            boolean r0 = sendEmoji$lambda$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ sf.n H(java.util.concurrent.atomic.AtomicBoolean r0, o8.j r1, java.lang.String r2, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r3, java.lang.Exception r4) {
            sf.n r0 = downloadVideoInternal$lambda$1(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ boolean I(java.lang.String r0, java.lang.String r1, j8.p r2) {
            boolean r0 = sendFavorite$lambda$1(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ sf.n J(java.util.function.Consumer r0, h.Hchat.hooks.items.script.ScriptWaBridge r1, java.lang.String r2, java.util.Map r3, long r4) {
            sf.n r0 = get$lambda$0(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ sf.n K(h.Hchat.hooks.items.script.ScriptWaBridge r0, java.util.function.Consumer r1, java.lang.String r2, java.lang.String r3) {
            sf.n r0 = downloadImage$lambda$1(r1, r0, r2, r3)
            return r0
    }

    public static /* synthetic */ sf.n L(java.util.function.Consumer r0, h.Hchat.hooks.items.script.ScriptWaBridge r1, java.util.List r2) {
            sf.n r0 = downloadImages$lambda$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ sf.n M(java.util.concurrent.atomic.AtomicBoolean r0, o8.j r1, java.lang.String r2, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r3, java.io.File r4) {
            sf.n r0 = downloadVideoInternal$lambda$0(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ me.yun.silk.SilkCodec N() {
            me.yun.silk.SilkCodec r0 = durationCodec_delegate$lambda$0()
            return r0
    }

    public static /* synthetic */ boolean O(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, byte[] r4, java.lang.String r5, j8.p r6) {
            boolean r0 = shareVideo$lambda$0(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static /* synthetic */ sf.n P(h.Hchat.hooks.items.script.ScriptWaBridge r0, java.lang.Object r1, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r2, java.lang.String r3) {
            sf.n r0 = downloadImg$lambda$0(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ sf.n Q(h.Hchat.hooks.items.script.ScriptWaBridge r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r5) {
            sf.n r0 = downloadVideo$lambda$0(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ boolean a(java.lang.String r0, java.lang.String r1, j8.p r2) {
            boolean r0 = sendOriginalImage$lambda$0(r0, r1, r2)
            return r0
    }

    private final okhttp3.Request.Builder applyHeaders(okhttp3.Request.Builder r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r3 = this;
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "Content-Type"
            boolean r2 = og.t.X(r1, r2)
            if (r2 == 0) goto L29
            goto L8
        L29:
            r4.header(r1, r0)
            goto L8
        L2d:
            return r4
    }

    private final void async(fg.a r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r4.callbackSeq
            long r0 = r0.getAndIncrement()
            java.lang.String r2 = "script_http_"
            java.lang.String r0 = bc.e.g(r0, r2)
            i8.e r1 = h.Hchat.hooks.api.core.WeChatApis.runtime()
            r1.getClass()
            o8.j r1 = h.Hchat.hooks.api.core.WeChatApis.p()
            if (r1 == 0) goto L23
            eb.t0 r0 = new eb.t0
            r2 = 0
            r0.<init>(r5, r4, r2)
            r1.d(r0)
            return
        L23:
            java.lang.Thread r1 = new java.lang.Thread
            eb.t0 r2 = new eb.t0
            r3 = 1
            r2.<init>(r5, r4, r3)
            r1.<init>(r2, r0)
            r1.start()
            return
    }

    private static final void async$lambda$0(fg.a r2, h.Hchat.hooks.items.script.ScriptWaBridge r3) {
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        Lc:
            java.lang.Throwable r2 = sf.g.b(r2)
            if (r2 == 0) goto L29
            h.Hchat.hooks.items.script.ScriptPluginBridge r3 = r3.bridge
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "异步任务失败: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.log(r2)
        L29:
            return
    }

    private static final void async$lambda$1(fg.a r2, h.Hchat.hooks.items.script.ScriptWaBridge r3) {
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        Lc:
            java.lang.Throwable r2 = sf.g.b(r2)
            if (r2 == 0) goto L29
            h.Hchat.hooks.items.script.ScriptPluginBridge r3 = r3.bridge
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "异步任务失败: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.log(r2)
        L29:
            return
    }

    public static /* synthetic */ boolean b(java.lang.String r0, java.lang.String r1, java.lang.String r2, j8.p r3) {
            boolean r0 = sendFile$lambda$1(r0, r1, r2, r3)
            return r0
    }

    private final java.lang.String buildPostBody(java.util.Map<?, ?> r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r6 = this;
            java.util.Map r7 = r6.normalizeMap(r7)
            boolean r0 = r7.isEmpty()
            java.lang.String r1 = ""
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.util.Set r8 = r8.entrySet()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L17:
            boolean r0 = r8.hasNext()
            r2 = 0
            if (r0 == 0) goto L34
            java.lang.Object r0 = r8.next()
            r3 = r0
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "Content-Type"
            boolean r3 = og.t.X(r3, r4)
            if (r3 == 0) goto L17
            goto L35
        L34:
            r0 = r2
        L35:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L40
            java.lang.Object r8 = r0.getValue()
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
        L40:
            if (r2 != 0) goto L43
            goto L44
        L43:
            r1 = r2
        L44:
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r0 = "application/json"
            r2 = 0
            boolean r8 = bc.e.u(r8, r1, r8, r0, r2)
            if (r8 == 0) goto L80
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L5c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r8.put(r1, r0)
            goto L5c
        L78:
            java.lang.String r7 = r8.toString()
            r7.getClass()
            return r7
        L80:
            java.util.Set r7 = r7.entrySet()
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            e9.h r4 = new e9.h
            r7 = 20
            r4.<init>(r7)
            r5 = 30
            java.lang.String r1 = "&"
            r2 = 0
            r3 = 0
            java.lang.String r7 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private static final java.lang.CharSequence buildPostBody$lambda$1(java.util.Map.Entry r2) {
            r2.getClass()
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = android.net.Uri.encode(r0)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = android.net.Uri.encode(r2)
            java.lang.String r1 = "="
            java.lang.String r2 = wb.en.h(r0, r1, r2)
            return r2
    }

    public static /* synthetic */ void c(h.Hchat.hooks.items.script.ScriptWaBridge r0, java.lang.Runnable r1) {
            delay$lambda$0(r0, r1)
            return
    }

    private final java.lang.Object callAny(java.lang.Object r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L29
            r1.getClass()     // Catch: java.lang.Throwable -> L29
            int r2 = r1.length     // Catch: java.lang.Throwable -> L29
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L3a
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L29
            boolean r6 = gg.l.a(r6, r9)     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L2b
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L29
            r6.getClass()     // Catch: java.lang.Throwable -> L29
            int r6 = r6.length     // Catch: java.lang.Throwable -> L29
            if (r6 != 0) goto L2b
            r6 = 1
            goto L2c
        L29:
            r8 = move-exception
            goto L44
        L2b:
            r6 = r3
        L2c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L29
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r4 = r4 + 1
            goto Lf
        L3a:
            r5 = r0
        L3b:
            if (r5 == 0) goto L42
            java.lang.Object r8 = r5.invoke(r8, r0)     // Catch: java.lang.Throwable -> L29
            goto L4a
        L42:
            r8 = r0
            goto L4a
        L44:
            sf.f r9 = new sf.f
            r9.<init>(r8)
            r8 = r9
        L4a:
            boolean r9 = r8 instanceof sf.f
            if (r9 == 0) goto L50
            goto L51
        L50:
            r0 = r8
        L51:
            return r0
    }

    private final java.lang.String callString(java.lang.Object r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = ""
            java.lang.Class r1 = r9.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L2b
            r1.getClass()     // Catch: java.lang.Throwable -> L2b
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            r4 = r3
        L10:
            r5 = 0
            if (r4 >= r2) goto L3c
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L2b
            boolean r7 = gg.l.a(r7, r10)     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L2d
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L2b
            r7.getClass()     // Catch: java.lang.Throwable -> L2b
            int r7 = r7.length     // Catch: java.lang.Throwable -> L2b
            if (r7 != 0) goto L2d
            r7 = 1
            goto L2e
        L2b:
            r9 = move-exception
            goto L4d
        L2d:
            r7 = r3
        L2e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L2b
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L39
            goto L3d
        L39:
            int r4 = r4 + 1
            goto L10
        L3c:
            r6 = r5
        L3d:
            if (r6 == 0) goto L49
            java.lang.Object r9 = r6.invoke(r9, r5)     // Catch: java.lang.Throwable -> L2b
            if (r9 == 0) goto L49
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> L2b
        L49:
            if (r5 != 0) goto L52
            r5 = r0
            goto L52
        L4d:
            sf.f r5 = new sf.f
            r5.<init>(r9)
        L52:
            boolean r9 = r5 instanceof sf.f
            if (r9 == 0) goto L57
            goto L58
        L57:
            r0 = r5
        L58:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static /* synthetic */ boolean d(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, j8.p r4) {
            boolean r0 = shareFile$lambda$0(r0, r1, r2, r3, r4)
            return r0
    }

    private final java.lang.String defaultContentType(java.util.Map<java.lang.String, java.lang.String> r5) {
            r4 = this;
            java.util.Set r5 = r5.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        La:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "Content-Type"
            boolean r2 = og.t.X(r2, r3)
            if (r2 == 0) goto La
            goto L28
        L27:
            r0 = r1
        L28:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L33
            java.lang.Object r5 = r0.getValue()
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
        L33:
            if (r1 == 0) goto L3d
            boolean r5 = og.m.t0(r1)
            if (r5 == 0) goto L3c
            goto L3d
        L3c:
            return r1
        L3d:
            java.lang.String r5 = "application/x-www-form-urlencoded; charset=UTF-8"
            return r5
    }

    private static final void delay$lambda$0(h.Hchat.hooks.items.script.ScriptWaBridge r2, java.lang.Runnable r3) {
            r3.run()     // Catch: java.lang.Throwable -> L6
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        Ld:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L33
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = "[Hchat:Script] 延迟任务失败: "
            eh.a.x(r1, r0, r3)
            h.Hchat.hooks.items.script.ScriptPluginBridge r2 = r2.bridge
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "延迟任务失败: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.log(r3)
        L33:
            return
    }

    private static final void delay$lambda$1(h.Hchat.hooks.items.script.ScriptWaBridge r3, long r4, java.lang.Runnable r6) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r4 = r0
        L7:
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L10
            r6.run()     // Catch: java.lang.Throwable -> L10
            sf.n r4 = sf.n.f12433a     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L17:
            java.lang.Throwable r4 = sf.g.b(r4)
            if (r4 == 0) goto L34
            h.Hchat.hooks.items.script.ScriptPluginBridge r3 = r3.bridge
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "延迟任务失败: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.log(r4)
        L34:
            return
    }

    private static final sf.n download$lambda$0(java.util.function.Consumer r0, h.Hchat.hooks.items.script.ScriptWaBridge r1, java.lang.String r2, java.lang.String r3, java.util.Map r4, long r5) {
            if (r0 == 0) goto L9
            java.io.File r1 = r1.downloadFile(r2, r3, r4, r5)
            r0.accept(r1)
        L9:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private final java.io.File downloadFile(java.lang.String r4, java.lang.String r5, java.util.Map<?, ?> r6, long r7) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto Lca
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto Lb
            goto Lca
        Lb:
            if (r5 == 0) goto Lca
            boolean r1 = og.m.t0(r5)
            if (r1 == 0) goto L15
            goto Lca
        L15:
            java.io.File r5 = r3.resolveDownloadTarget(r4, r5)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L98
            java.io.File r1 = r5.getParentFile()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2e
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L2e
            r1.mkdirs()     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r4 = move-exception
            goto La0
        L2e:
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            okhttp3.Request$Builder r4 = r1.url(r4)     // Catch: java.lang.Throwable -> L2b
            java.util.Map r6 = r3.normalizeMap(r6)     // Catch: java.lang.Throwable -> L2b
            okhttp3.Request$Builder r4 = r3.applyHeaders(r4, r6)     // Catch: java.lang.Throwable -> L2b
            okhttp3.Request$Builder r4 = r4.get()     // Catch: java.lang.Throwable -> L2b
            okhttp3.Request r4 = r4.build()     // Catch: java.lang.Throwable -> L2b
            okhttp3.OkHttpClient r6 = r3.httpClient(r7)     // Catch: java.lang.Throwable -> L2b
            okhttp3.Call r4 = r6.newCall(r4)     // Catch: java.lang.Throwable -> L2b
            okhttp3.Response r4 = r4.execute()     // Catch: java.lang.Throwable -> L2b
            okhttp3.ResponseBody r6 = r4.body()     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L95
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L7e
            java.io.InputStream r6 = r6.byteStream()     // Catch: java.lang.Throwable -> L7e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L7e
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L80
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L80
            r8 = 8192(0x2000, float:1.148E-41)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L82
        L6b:
            int r1 = r7.read(r8)     // Catch: java.lang.Throwable -> L82
            if (r1 > 0) goto L84
            r6.flush()     // Catch: java.lang.Throwable -> L82
            r6.close()     // Catch: java.lang.Throwable -> L80
            r7.close()     // Catch: java.lang.Throwable -> L7e
            r4.close()     // Catch: java.lang.Throwable -> L2b
            goto La5
        L7e:
            r5 = move-exception
            goto L9a
        L80:
            r5 = move-exception
            goto L8f
        L82:
            r5 = move-exception
            goto L89
        L84:
            r2 = 0
            r6.write(r8, r2, r1)     // Catch: java.lang.Throwable -> L82
            goto L6b
        L89:
            throw r5     // Catch: java.lang.Throwable -> L8a
        L8a:
            r8 = move-exception
            ig.a.i(r6, r5)     // Catch: java.lang.Throwable -> L80
            throw r8     // Catch: java.lang.Throwable -> L80
        L8f:
            throw r5     // Catch: java.lang.Throwable -> L90
        L90:
            r6 = move-exception
            ig.a.i(r7, r5)     // Catch: java.lang.Throwable -> L7e
            throw r6     // Catch: java.lang.Throwable -> L7e
        L95:
            r4.close()     // Catch: java.lang.Throwable -> L2b
        L98:
            r5 = r0
            goto La5
        L9a:
            throw r5     // Catch: java.lang.Throwable -> L9b
        L9b:
            r6 = move-exception
            ig.a.i(r4, r5)     // Catch: java.lang.Throwable -> L2b
            throw r6     // Catch: java.lang.Throwable -> L2b
        La0:
            sf.f r5 = new sf.f
            r5.<init>(r4)
        La5:
            java.lang.Throwable r4 = sf.g.b(r5)
            if (r4 == 0) goto Lc2
            h.Hchat.hooks.items.script.ScriptPluginBridge r6 = r3.bridge
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "下载失败: "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.log(r4)
        Lc2:
            boolean r4 = r5 instanceof sf.f
            if (r4 == 0) goto Lc7
            goto Lc8
        Lc7:
            r0 = r5
        Lc8:
            java.io.File r0 = (java.io.File) r0
        Lca:
            return r0
    }

    private static final sf.n downloadImage$lambda$0(java.util.function.Consumer r1, h.Hchat.hooks.items.script.ScriptWaBridge r2, java.lang.String r3) {
            if (r1 == 0) goto L10
            h.Hchat.hooks.items.script.ScriptPluginBridge r2 = r2.bridge
            android.content.Context r2 = r2.getHostContext()
            r0 = 0
            java.io.File r2 = zb.b.e(r2, r3, r0)
            r1.accept(r2)
        L10:
            sf.n r1 = sf.n.f12433a
            return r1
    }

    private static final sf.n downloadImage$lambda$1(java.util.function.Consumer r0, h.Hchat.hooks.items.script.ScriptWaBridge r1, java.lang.String r2, java.lang.String r3) {
            if (r0 == 0) goto Lf
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = r1.bridge
            android.content.Context r1 = r1.getHostContext()
            java.io.File r1 = zb.b.e(r1, r2, r3)
            r0.accept(r1)
        Lf:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n downloadImages$lambda$0(java.util.function.Consumer r1, h.Hchat.hooks.items.script.ScriptWaBridge r2, java.util.List r3) {
            if (r1 == 0) goto L10
            h.Hchat.hooks.items.script.ScriptPluginBridge r2 = r2.bridge
            android.content.Context r2 = r2.getHostContext()
            r0 = 0
            java.util.List r2 = zb.b.f(r2, r0, r3)
            r1.accept(r2)
        L10:
            sf.n r1 = sf.n.f12433a
            return r1
    }

    private static final sf.n downloadImages$lambda$1(java.util.function.Consumer r0, h.Hchat.hooks.items.script.ScriptWaBridge r1, java.util.List r2, java.lang.String r3) {
            if (r0 == 0) goto Lf
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = r1.bridge
            android.content.Context r1 = r1.getHostContext()
            java.util.List r1 = zb.b.f(r1, r3, r2)
            r0.accept(r1)
        Lf:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final sf.n downloadImg$lambda$0(h.Hchat.hooks.items.script.ScriptWaBridge r8, java.lang.Object r9, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r10, java.lang.String r11) {
            eb.a1 r9 = r8.imageDownloadRequest(r9)
            sf.n r0 = sf.n.f12433a
            if (r9 != 0) goto L15
            if (r10 == 0) goto L14
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Invalid image message"
            r8.<init>(r9)
            r10.onError(r8)
        L14:
            return r0
        L15:
            java.lang.String r2 = r9.f2495a
            java.lang.String r3 = r9.f2496b
            java.lang.String r4 = r9.f2497c
            int r6 = r9.f2498d
            int r7 = r9.f2499e
            r1 = r8
            r5 = r11
            java.io.File r8 = r1.downloadImgInternal(r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L3d
            boolean r9 = r8.isFile()
            if (r9 == 0) goto L3d
            long r1 = r8.length()
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L3d
            if (r10 == 0) goto L49
            r10.onSuccess(r8)
            goto L49
        L3d:
            if (r10 == 0) goto L49
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "Image download failed"
            r8.<init>(r9)
            r10.onError(r8)
        L49:
            return r0
    }

    private final java.io.File downloadImgInternal(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, int r22) {
            r16 = this;
            r1 = r16
            r0 = r22
            java.lang.String r8 = " "
            java.lang.String r9 = "downloadImg失败: CDN下载超时 fileType="
            java.lang.String r10 = "downloadImg失败: CDN任务提交失败 fileType="
            java.lang.String r2 = "downloadImg失败: 无法清理旧文件 -> "
            java.lang.String r3 = "downloadImg失败: 图片API未就绪 -> "
            java.lang.String r4 = "downloadImg失败: "
            r11 = 0
            r5 = r18
            java.lang.String r5 = r1.normalizeDownloadUrl(r5)     // Catch: java.lang.Throwable -> L50
            boolean r6 = og.m.t0(r5)     // Catch: java.lang.Throwable -> L50
            if (r6 != 0) goto L1e
            goto L1f
        L1e:
            r5 = r11
        L1f:
            if (r5 == 0) goto L86
            r6 = r17
            r7 = r20
            java.io.File r12 = r1.targetFile(r7, r6, r5)     // Catch: java.lang.Throwable -> L50
            boolean r6 = r1.isHttpUrl(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r13 = " -> "
            r14 = 120(0x78, float:1.68E-43)
            if (r6 == 0) goto L89
            sf.i r0 = zb.b.f22655a     // Catch: java.lang.Throwable -> L50
            r12.getClass()     // Catch: java.lang.Throwable -> L50
            r0 = 1
            java.io.File r2 = zb.b.g(r12, r5, r0)     // Catch: java.lang.Throwable -> L50
            r6 = 0
            if (r2 == 0) goto L53
            boolean r3 = r2.isFile()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L53
            long r9 = r2.length()     // Catch: java.lang.Throwable -> L50
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 > 0) goto L70
            goto L53
        L50:
            r0 = move-exception
            goto L15c
        L53:
            java.lang.String r3 = og.m.P0(r14, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L50
            r9.append(r3)     // Catch: java.lang.Throwable -> L50
            r9.append(r13)     // Catch: java.lang.Throwable -> L50
            r9.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = r9.toString()     // Catch: java.lang.Throwable -> L50
            r1.logDownload(r3)     // Catch: java.lang.Throwable -> L50
        L70:
            if (r2 == 0) goto L86
            boolean r3 = r2.isFile()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L81
            long r3 = r2.length()     // Catch: java.lang.Throwable -> L50
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L81
            goto L82
        L81:
            r0 = 0
        L82:
            if (r0 == 0) goto L86
            goto L161
        L86:
            r2 = r11
            goto L161
        L89:
            j8.p r4 = h.Hchat.hooks.api.core.WeChatApis.media()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L92
            j8.n r4 = r4.f6815a     // Catch: java.lang.Throwable -> L50
            goto L93
        L92:
            r4 = r11
        L93:
            if (r4 != 0) goto La9
            java.lang.String r0 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L50
            r2.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L50
            r1.logDownload(r0)     // Catch: java.lang.Throwable -> L50
            goto L86
        La9:
            boolean r3 = r12.exists()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto Lc9
            boolean r3 = r12.delete()     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto Lc9
            java.lang.String r0 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L50
            r3.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L50
            r1.logDownload(r0)     // Catch: java.lang.Throwable -> L50
            goto L86
        Lc9:
            if (r19 != 0) goto Lcf
            java.lang.String r2 = ""
        Lcd:
            r3 = r5
            goto Ld2
        Lcf:
            r2 = r19
            goto Lcd
        Ld2:
            java.lang.String r5 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L50
            r7 = 0
            r6 = r4
            r4 = r2
            r2 = r6
            r6 = r21
            boolean r4 = r2.e(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = " url="
            java.lang.String r7 = " totalLen="
            if (r4 != 0) goto L11b
            java.lang.String r2 = r2.c()     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = og.m.P0(r14, r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L50
            r9.append(r6)     // Catch: java.lang.Throwable -> L50
            r9.append(r7)     // Catch: java.lang.Throwable -> L50
            r9.append(r0)     // Catch: java.lang.Throwable -> L50
            r9.append(r8)     // Catch: java.lang.Throwable -> L50
            r9.append(r2)     // Catch: java.lang.Throwable -> L50
            r9.append(r5)     // Catch: java.lang.Throwable -> L50
            r9.append(r3)     // Catch: java.lang.Throwable -> L50
            r9.append(r13)     // Catch: java.lang.Throwable -> L50
            r9.append(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L50
            r1.logDownload(r0)     // Catch: java.lang.Throwable -> L50
            goto L86
        L11b:
            r14 = 60000(0xea60, double:2.9644E-319)
            boolean r4 = r1.waitDownloadedFile(r12, r14)     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L15a
            java.lang.String r2 = r2.c()     // Catch: java.lang.Throwable -> L50
            r4 = 120(0x78, float:1.68E-43)
            java.lang.String r3 = og.m.P0(r4, r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L50
            r10.append(r6)     // Catch: java.lang.Throwable -> L50
            r10.append(r7)     // Catch: java.lang.Throwable -> L50
            r10.append(r0)     // Catch: java.lang.Throwable -> L50
            r10.append(r8)     // Catch: java.lang.Throwable -> L50
            r10.append(r2)     // Catch: java.lang.Throwable -> L50
            r10.append(r5)     // Catch: java.lang.Throwable -> L50
            r10.append(r3)     // Catch: java.lang.Throwable -> L50
            r10.append(r13)     // Catch: java.lang.Throwable -> L50
            r10.append(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L50
            r1.logDownload(r0)     // Catch: java.lang.Throwable -> L50
            r12 = r11
        L15a:
            r2 = r12
            goto L161
        L15c:
            sf.f r2 = new sf.f
            r2.<init>(r0)
        L161:
            java.lang.Throwable r0 = sf.g.b(r2)
            if (r0 == 0) goto L17c
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "downloadImg异常: "
            java.lang.String r0 = bc.e.j(r4, r3, r8, r0)
            r1.logDownload(r0)
        L17c:
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L181
            goto L182
        L181:
            r11 = r2
        L182:
            java.io.File r11 = (java.io.File) r11
            return r11
    }

    public static /* synthetic */ java.io.File downloadImgInternal$default(h.Hchat.hooks.items.script.ScriptWaBridge r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, int r13, int r14, java.lang.Object r15) {
            r14 = r14 & 32
            if (r14 == 0) goto L5
            r13 = 0
        L5:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.io.File r7 = r0.downloadImgInternal(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static final sf.n downloadVideo$lambda$0(h.Hchat.hooks.items.script.ScriptWaBridge r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r12) {
            eb.c1 r0 = new eb.c1
            java.lang.String r1 = ""
            if (r8 != 0) goto L7
            r8 = r1
        L7:
            if (r9 != 0) goto Lb
            r2 = r1
            goto Lc
        Lb:
            r2 = r9
        Lc:
            if (r10 != 0) goto L10
            r3 = r1
            goto L11
        L10:
            r3 = r10
        L11:
            r4 = 0
            r6 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r6)
            r7.downloadVideoInternal(r0, r11, r12)
            sf.n r7 = sf.n.f12433a
            return r7
    }

    private static final sf.n downloadVideo$lambda$1(h.Hchat.hooks.items.script.ScriptWaBridge r1, java.lang.Object r2, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r3, java.lang.String r4) {
            eb.c1 r2 = r1.videoDownloadRequest(r2)
            sf.n r0 = sf.n.f12433a
            if (r2 != 0) goto L15
            if (r3 == 0) goto L14
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid video message"
            r1.<init>(r2)
            r3.onError(r1)
        L14:
            return r0
        L15:
            r1.downloadVideoInternal(r2, r4, r3)
            return r0
    }

    private final void downloadVideoInternal(eb.c1 r20, java.lang.String r21, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r22) {
            r19 = this;
            r1 = r19
            r0 = r20
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r3.<init>(r2)
            java.util.concurrent.atomic.AtomicLong r2 = r1.callbackSeq
            long r4 = r2.getAndIncrement()
            java.lang.String r2 = "script_video_download_timeout_"
            java.lang.String r5 = bc.e.g(r4, r2)
            i8.e r2 = h.Hchat.hooks.api.core.WeChatApis.runtime()
            r2.getClass()
            o8.j r4 = h.Hchat.hooks.api.core.WeChatApis.p()
            eb.w0 r2 = new eb.w0
            r7 = 0
            r6 = r22
            r2.<init>(r3, r4, r5, r6, r7)
            r8 = r2
            eb.w0 r2 = new eb.w0
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.String r3 = r0.f2515a
            long r6 = r0.f2518d
            r9 = r21
            java.io.File r3 = r1.videoTargetFile(r9, r3)
            java.io.File r9 = r3.getParentFile()
            if (r9 == 0) goto L49
            boolean r10 = r9.isDirectory()
            if (r10 != 0) goto L49
            r9.mkdirs()
        L49:
            java.io.File r9 = r0.f2519e
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L93
            java.lang.String r0 = r9.getCanonicalPath()     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = r3.getCanonicalPath()     // Catch: java.lang.Throwable -> L64
            boolean r0 = gg.l.a(r0, r4)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L60
            r3 = r9
            goto L6a
        L60:
            dg.l.a0(r9, r3)     // Catch: java.lang.Throwable -> L64
            goto L6a
        L64:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
        L6a:
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto L6f
            goto L70
        L6f:
            r10 = r3
        L70:
            java.io.File r10 = (java.io.File) r10
            if (r10 == 0) goto L87
            boolean r0 = r10.isFile()
            if (r0 == 0) goto L87
            long r3 = r10.length()
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 <= 0) goto L87
            r8.invoke(r10)
            goto L163
        L87:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r3 = "Video copy failed"
            r0.<init>(r3)
            r2.invoke(r0)
            goto L163
        L93:
            java.lang.String r9 = r0.f2516b
            java.lang.String r14 = r1.normalizeDownloadUrl(r9)
            boolean r9 = og.m.t0(r14)
            if (r9 == 0) goto Laa
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Video download URL is empty"
            r0.<init>(r3)
            r2.invoke(r0)
            return
        Laa:
            boolean r9 = r1.isHttpUrl(r14)
            if (r9 == 0) goto Led
            java.lang.String r9 = r0.f2517c
            boolean r9 = og.m.t0(r9)
            if (r9 == 0) goto Led
            r0 = 1
            java.io.File r0 = zb.b.g(r3, r14, r0)
            if (r0 == 0) goto Ldd
            boolean r3 = r0.isFile()
            if (r3 == 0) goto Ldd
            long r3 = r0.length()
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 <= 0) goto Ldd
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 <= 0) goto Ld9
            long r3 = r0.length()
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 < 0) goto Ldd
        Ld9:
            r8.invoke(r0)
            return
        Ldd:
            if (r0 == 0) goto Le2
            r0.delete()
        Le2:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r3 = "Video download failed"
            r0.<init>(r3)
            r2.invoke(r0)
            return
        Led:
            j8.p r6 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r6 == 0) goto Lf5
            bb.b r10 = r6.f6817c
        Lf5:
            if (r10 != 0) goto L102
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = "Video API is not ready"
            r0.<init>(r3)
            r2.invoke(r0)
            return
        L102:
            boolean r6 = r3.exists()
            if (r6 == 0) goto L119
            boolean r6 = r3.delete()
            if (r6 != 0) goto L119
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unable to replace existing video file"
            r0.<init>(r3)
            r2.invoke(r0)
            return
        L119:
            if (r4 == 0) goto L129
            a1.d r6 = new a1.d
            r7 = 10
            r6.<init>(r1, r7, r2)
            r11 = 60000(0xea60, double:2.9644E-319)
            r4.f(r5, r11, r6)
            goto L138
        L129:
            java.lang.Thread r4 = new java.lang.Thread
            a1.a r6 = new a1.a
            r7 = 9
            r6.<init>(r2, r7)
            r4.<init>(r6, r5)
            r4.start()
        L138:
            java.lang.String r15 = r0.f2517c
            java.lang.String r16 = r3.getAbsolutePath()
            eb.d1 r3 = new eb.d1
            r3.<init>(r0, r2, r8)
            java.lang.Object r0 = r10.f640d
            r13 = r0
            j8.n r13 = (j8.n) r13
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            r4 = 27
            r0.<init>(r3, r4)
            r17 = 4
            r18 = r0
            boolean r0 = r13.e(r14, r15, r16, r17, r18)
            if (r0 != 0) goto L163
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r3 = "Video download task submission failed"
            r0.<init>(r3)
            r2.invoke(r0)
        L163:
            return
    }

    private static final sf.n downloadVideoInternal$lambda$0(java.util.concurrent.atomic.AtomicBoolean r2, o8.j r3, java.lang.String r4, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r5, java.io.File r6) {
            r6.getClass()
            r0 = 0
            r1 = 1
            boolean r2 = r2.compareAndSet(r0, r1)
            if (r2 == 0) goto L15
            if (r3 == 0) goto L10
            r3.a(r4)
        L10:
            if (r5 == 0) goto L15
            r5.onSuccess(r6)
        L15:
            sf.n r2 = sf.n.f12433a
            return r2
    }

    private static final sf.n downloadVideoInternal$lambda$1(java.util.concurrent.atomic.AtomicBoolean r2, o8.j r3, java.lang.String r4, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r5, java.lang.Exception r6) {
            r6.getClass()
            r0 = 0
            r1 = 1
            boolean r2 = r2.compareAndSet(r0, r1)
            if (r2 == 0) goto L15
            if (r3 == 0) goto L10
            r3.a(r4)
        L10:
            if (r5 == 0) goto L15
            r5.onError(r6)
        L15:
            sf.n r2 = sf.n.f12433a
            return r2
    }

    private static final void downloadVideoInternal$lambda$4(h.Hchat.hooks.items.script.ScriptWaBridge r2, fg.l r3) {
            c9.o0 r0 = new c9.o0
            r1 = 1
            r0.<init>(r3, r1)
            r2.async(r0)
            return
    }

    private static final sf.n downloadVideoInternal$lambda$4$0(fg.l r2) {
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Video download timed out"
            r0.<init>(r1)
            r2.invoke(r0)
            sf.n r2 = sf.n.f12433a
            return r2
    }

    private static final void downloadVideoInternal$lambda$5(fg.l r2) {
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L11
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.InterruptedException -> L11
            java.lang.String r1 = "Video download timed out"
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L11
            r2.invoke(r0)     // Catch: java.lang.InterruptedException -> L11
            return
        L11:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            return
    }

    private static final me.yun.silk.SilkCodec durationCodec_delegate$lambda$0() {
            me.yun.silk.SilkCodec r0 = new me.yun.silk.SilkCodec
            r0.<init>()
            return r0
    }

    public static /* synthetic */ boolean e(java.lang.String r0, java.lang.String r1, j8.p r2) {
            boolean r0 = sendVideo$lambda$0(r0, r1, r2)
            return r0
    }

    private final java.lang.String extensionFromUrl(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.getLastPathSegment()     // Catch: java.lang.Throwable -> Le
            if (r3 != 0) goto L15
            r3 = r0
            goto L15
        Le:
            r3 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r3)
            r3 = r1
        L15:
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L1b
            r3 = r0
        L1b:
            java.lang.String r3 = (java.lang.String) r3
            r1 = 46
            java.lang.String r3 = og.m.L0(r3, r1, r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            int r0 = r3.hashCode()
            java.lang.String r1 = "jpg"
            switch(r0) {
                case 97669: goto L5e;
                case 102340: goto L55;
                case 105441: goto L4e;
                case 111145: goto L45;
                case 3268712: goto L3c;
                case 3645340: goto L33;
                default: goto L32;
            }
        L32:
            goto L66
        L33:
            java.lang.String r0 = "webp"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L67
            goto L66
        L3c:
            java.lang.String r0 = "jpeg"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L67
            goto L66
        L45:
            java.lang.String r0 = "png"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L67
            goto L66
        L4e:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L67
            goto L66
        L55:
            java.lang.String r0 = "gif"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L67
            goto L66
        L5e:
            java.lang.String r0 = "bmp"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L67
        L66:
            r3 = r1
        L67:
            return r3
    }

    public static /* synthetic */ boolean f(java.lang.String r0, java.lang.String r1, java.lang.String r2, j8.p r3) {
            boolean r0 = sendImage$lambda$1(r0, r1, r2, r3)
            return r0
    }

    private final java.util.Map<java.lang.String, java.lang.Object> favoriteItemMap(j8.i r5) {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            long r1 = r5.f6799a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "localId"
            r0.put(r2, r1)
            long r1 = r5.f6799a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "id"
            r0.put(r2, r1)
            int r1 = r5.f6800b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "type"
            r0.put(r2, r1)
            java.lang.String r1 = "typeLabel"
            java.lang.String r2 = r5.b()
            r0.put(r1, r2)
            java.lang.String r1 = r5.f6801c
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L3c
            java.lang.String r2 = r5.b()
            goto L3d
        L3c:
            r2 = r1
        L3d:
            java.lang.String r3 = "title"
            r0.put(r3, r2)
            java.lang.String r2 = "summary"
            java.lang.String r3 = r5.a()
            r0.put(r2, r3)
            java.lang.String r2 = "rawTitle"
            r0.put(r2, r1)
            java.lang.String r1 = "rawSummary"
            java.lang.String r2 = r5.f6802d
            r0.put(r1, r2)
            long r1 = r5.f6803e
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "totalSizeBytes"
            r0.put(r2, r1)
            long r1 = r5.f6804f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "updateTimeMillis"
            r0.put(r2, r1)
            java.lang.String r1 = "tags"
            java.util.List r5 = r5.f6805g
            r0.put(r1, r5)
            return r0
    }

    private final java.lang.Object fieldAny(java.lang.Object r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.Throwable -> L32
        L5:
            if (r1 == 0) goto L45
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L45
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L32
            r2.getClass()     // Catch: java.lang.Throwable -> L32
            int r3 = r2.length     // Catch: java.lang.Throwable -> L32
            r4 = 0
        L18:
            if (r4 >= r3) goto L34
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L32
            boolean r6 = gg.l.a(r6, r9)     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L32
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L2f
            goto L35
        L2f:
            int r4 = r4 + 1
            goto L18
        L32:
            r8 = move-exception
            goto L47
        L34:
            r5 = r0
        L35:
            if (r5 == 0) goto L40
            r9 = 1
            r5.setAccessible(r9)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = r5.get(r8)     // Catch: java.lang.Throwable -> L32
            goto L4d
        L40:
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> L32
            goto L5
        L45:
            r8 = r0
            goto L4d
        L47:
            sf.f r9 = new sf.f
            r9.<init>(r8)
            r8 = r9
        L4d:
            boolean r9 = r8 instanceof sf.f
            if (r9 == 0) goto L53
            goto L54
        L53:
            r0 = r8
        L54:
            return r0
    }

    private final java.lang.String fieldString(java.lang.Object r9, java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = ""
            java.lang.Class r1 = r9.getClass()     // Catch: java.lang.Throwable -> L34
        L6:
            if (r1 == 0) goto L49
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L49
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L34
            r2.getClass()     // Catch: java.lang.Throwable -> L34
            int r3 = r2.length     // Catch: java.lang.Throwable -> L34
            r4 = 0
        L19:
            r5 = 0
            if (r4 >= r3) goto L36
            r6 = r2[r4]     // Catch: java.lang.Throwable -> L34
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L34
            boolean r7 = gg.l.a(r7, r10)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L34
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L31
            goto L37
        L31:
            int r4 = r4 + 1
            goto L19
        L34:
            r9 = move-exception
            goto L50
        L36:
            r6 = r5
        L37:
            if (r6 == 0) goto L4b
            r10 = 1
            r6.setAccessible(r10)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r6.get(r9)     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L47
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> L34
        L47:
            if (r5 != 0) goto L55
        L49:
            r5 = r0
            goto L55
        L4b:
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> L34
            goto L6
        L50:
            sf.f r5 = new sf.f
            r5.<init>(r9)
        L55:
            boolean r9 = r5 instanceof sf.f
            if (r9 == 0) goto L5a
            goto L5b
        L5a:
            r0 = r5
        L5b:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private final java.lang.String firstNotBlank(java.lang.String... r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            java.lang.String r2 = ""
            if (r1 < r0) goto L7
            return r2
        L7:
            r3 = r6[r1]
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L13
            if (r3 == 0) goto L12
            return r3
        L12:
            return r2
        L13:
            int r1 = r1 + 1
            goto L2
    }

    private final int firstPositiveInt(java.lang.Object... r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 < r0) goto L6
            return r1
        L6:
            r3 = r6[r2]
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            goto L27
        L13:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L26
            java.lang.String r3 = (java.lang.String) r3
            r4 = 10
            java.lang.Integer r3 = og.t.e0(r4, r3)
            if (r3 == 0) goto L26
            int r3 = r3.intValue()
            goto L27
        L26:
            r3 = r1
        L27:
            if (r3 <= 0) goto L2a
            return r3
        L2a:
            int r2 = r2 + 1
            goto L3
    }

    private final long firstPositiveLong(java.lang.Object... r7) {
            r6 = this;
            int r0 = r7.length
            r1 = 0
        L2:
            r2 = 0
            if (r1 < r0) goto L7
            return r2
        L7:
            r4 = r7[r1]
            boolean r5 = r4 instanceof java.lang.Number
            if (r5 == 0) goto L14
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            goto L26
        L14:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L25
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Long r4 = og.t.g0(r4)
            if (r4 == 0) goto L25
            long r4 = r4.longValue()
            goto L26
        L25:
            r4 = r2
        L26:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2b
            return r4
        L2b:
            int r1 = r1 + 1
            goto L2
    }

    public static /* synthetic */ boolean g(java.lang.String r0, long r1, j8.p r3) {
            boolean r0 = sendFavorite$lambda$0(r0, r1, r3)
            return r0
    }

    private static final sf.n get$lambda$0(java.util.function.Consumer r7, h.Hchat.hooks.items.script.ScriptWaBridge r8, java.lang.String r9, java.util.Map r10, long r11) {
            if (r7 == 0) goto L10
            java.lang.String r1 = "GET"
            r3 = 0
            r0 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            java.lang.String r8 = r0.httpText(r1, r2, r3, r4, r5)
            r7.accept(r8)
        L10:
            sf.n r7 = sf.n.f12433a
            return r7
    }

    private final me.yun.silk.SilkCodec getDurationCodec() {
            r1 = this;
            sf.c r0 = r1.durationCodec$delegate
            java.lang.Object r0 = r0.getValue()
            me.yun.silk.SilkCodec r0 = (me.yun.silk.SilkCodec) r0
            return r0
    }

    private final <K, V> V getOrPut(java.util.Map<K, V> r2, K r3, fg.a r4) {
            r1 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.get(r3)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L9
            monitor-exit(r2)
            return r0
        L9:
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L12
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return r4
        L12:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private final java.lang.String groupDisplayName(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = og.m.t0(r4)
            if (r0 != 0) goto L1c
            boolean r0 = gg.l.a(r4, r3)
            if (r0 != 0) goto L1c
            boolean r2 = og.m.t0(r3)
            if (r2 != 0) goto L1b
            java.lang.String r2 = " ("
            java.lang.String r0 = ")"
            java.lang.String r2 = wb.en.i(r4, r2, r3, r0)
            return r2
        L1b:
            return r4
        L1c:
            java.lang.String[] r2 = new java.lang.String[]{r3, r4, r2}
            java.lang.String r2 = r1.firstNotBlank(r2)
            return r2
    }

    private final java.lang.String guessFileName(java.lang.String r3) {
            r2 = this;
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L9
            java.lang.String r3 = r3.getLastPathSegment()     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L10:
            boolean r0 = r3 instanceof sf.f
            r1 = 0
            if (r0 == 0) goto L17
            r3 = r1
        L17:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L1d
            java.lang.String r3 = ""
        L1d:
            boolean r0 = og.m.t0(r3)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2e
            r1 = r3
        L2e:
            if (r1 == 0) goto L31
            goto L3b
        L31:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "download_"
            java.lang.String r1 = bc.e.g(r0, r3)
        L3b:
            return r1
    }

    public static /* synthetic */ boolean h(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, byte[] r8, java.lang.String r9, j8.p r10) {
            boolean r0 = shareMusicVideo$lambda$0(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    private final okhttp3.OkHttpClient httpClient(long r4) {
            r3 = this;
            r0 = 1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r4 = r0
        L7:
            r0 = 300(0x12c, double:1.48E-321)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            r4 = r0
        Le:
            java.util.Map<java.lang.Long, okhttp3.OkHttpClient> r0 = r3.httpClients
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            eb.x0 r2 = new eb.x0
            r2.<init>(r4)
            java.lang.Object r4 = r3.getOrPut(r0, r1, r2)
            r4.getClass()
            okhttp3.OkHttpClient r4 = (okhttp3.OkHttpClient) r4
            return r4
    }

    private static final okhttp3.OkHttpClient httpClient$lambda$0(long r2) {
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r2, r1)
            okhttp3.OkHttpClient$Builder r2 = r0.writeTimeout(r2, r1)
            r3 = 1
            okhttp3.OkHttpClient$Builder r2 = r2.followRedirects(r3)
            okhttp3.OkHttpClient$Builder r2 = r2.followSslRedirects(r3)
            okhttp3.OkHttpClient r2 = r2.build()
            return r2
    }

    private final java.lang.String httpText(java.lang.String r4, java.lang.String r5, java.util.Map<?, ?> r6, java.util.Map<?, ?> r7, long r8) {
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L9b
            boolean r1 = og.m.t0(r5)
            if (r1 == 0) goto Lb
            goto L9b
        Lb:
            java.util.Map r7 = r3.normalizeMap(r7)     // Catch: java.lang.Throwable -> L3c
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            okhttp3.Request$Builder r5 = r1.url(r5)     // Catch: java.lang.Throwable -> L3c
            okhttp3.Request$Builder r5 = r3.applyHeaders(r5, r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "POST"
            boolean r1 = gg.l.a(r4, r1)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3e
            java.lang.String r1 = r3.defaultContentType(r7)     // Catch: java.lang.Throwable -> L3c
            okhttp3.RequestBody$Companion r2 = okhttp3.RequestBody.Companion     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = r3.buildPostBody(r6, r7)     // Catch: java.lang.Throwable -> L3c
            okhttp3.MediaType$Companion r7 = okhttp3.MediaType.Companion     // Catch: java.lang.Throwable -> L3c
            okhttp3.MediaType r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L3c
            okhttp3.RequestBody r6 = r2.create(r6, r7)     // Catch: java.lang.Throwable -> L3c
            r5.post(r6)     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r5 = move-exception
            goto L69
        L3e:
            r5.get()     // Catch: java.lang.Throwable -> L3c
        L41:
            okhttp3.OkHttpClient r6 = r3.httpClient(r8)     // Catch: java.lang.Throwable -> L3c
            okhttp3.Request r5 = r5.build()     // Catch: java.lang.Throwable -> L3c
            okhttp3.Call r5 = r6.newCall(r5)     // Catch: java.lang.Throwable -> L3c
            okhttp3.Response r5 = r5.execute()     // Catch: java.lang.Throwable -> L3c
            okhttp3.ResponseBody r6 = r5.body()     // Catch: java.lang.Throwable -> L5c
            if (r6 == 0) goto L5e
            java.lang.String r6 = r6.string()     // Catch: java.lang.Throwable -> L5c
            goto L5f
        L5c:
            r6 = move-exception
            goto L63
        L5e:
            r6 = r0
        L5f:
            r5.close()     // Catch: java.lang.Throwable -> L3c
            goto L6e
        L63:
            throw r6     // Catch: java.lang.Throwable -> L64
        L64:
            r7 = move-exception
            ig.a.i(r5, r6)     // Catch: java.lang.Throwable -> L3c
            throw r7     // Catch: java.lang.Throwable -> L3c
        L69:
            sf.f r6 = new sf.f
            r6.<init>(r5)
        L6e:
            java.lang.Throwable r5 = sf.g.b(r6)
            if (r5 == 0) goto L93
            h.Hchat.hooks.items.script.ScriptPluginBridge r7 = r3.bridge
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "HTTP "
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r4 = " 失败: "
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
            r7.log(r4)
        L93:
            boolean r4 = r6 instanceof sf.f
            if (r4 == 0) goto L98
            goto L99
        L98:
            r0 = r6
        L99:
            java.lang.String r0 = (java.lang.String) r0
        L9b:
            return r0
    }

    public static /* synthetic */ boolean i(java.lang.String r0, java.lang.String r1, j8.p r2) {
            boolean r0 = sendFile$lambda$0(r0, r1, r2)
            return r0
    }

    private final eb.a1 imageDownloadRequest(java.lang.Object r10) {
            r9 = this;
            if (r10 != 0) goto L3
            goto L4d
        L3:
            java.lang.String r0 = "getBigImgUrl"
            java.lang.String r0 = r9.callString(r10, r0)
            java.lang.String r1 = "bigImgUrl"
            java.lang.String r1 = r9.fieldString(r10, r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = r9.firstNotBlank(r0)
            java.lang.String r1 = "getMidImgUrl"
            java.lang.String r1 = r9.callString(r10, r1)
            java.lang.String r2 = "midImgUrl"
            java.lang.String r2 = r9.fieldString(r10, r2)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r1 = r9.firstNotBlank(r1)
            java.lang.String r2 = "getThumbUrl"
            java.lang.String r2 = r9.callString(r10, r2)
            java.lang.String r3 = "thumbUrl"
            java.lang.String r3 = r9.fieldString(r10, r3)
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r2 = r9.firstNotBlank(r2)
            java.lang.String[] r2 = new java.lang.String[]{r0, r1, r2}
            java.lang.String r7 = r9.firstNotBlank(r2)
            boolean r2 = og.m.t0(r7)
            if (r2 == 0) goto L4f
        L4d:
            r10 = 0
            return r10
        L4f:
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L58
            r2 = 1
        L56:
            r4 = r2
            goto L5a
        L58:
            r2 = 2
            goto L56
        L5a:
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L76
            java.lang.String r0 = "getBigLength"
            java.lang.Object r0 = r9.callAny(r10, r0)
            java.lang.String r1 = "bigLength"
            java.lang.Object r1 = r9.fieldAny(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = r9.firstPositiveInt(r0)
        L74:
            r5 = r0
            goto La6
        L76:
            boolean r0 = og.m.t0(r1)
            if (r0 != 0) goto L91
            java.lang.String r0 = "getMidLength"
            java.lang.Object r0 = r9.callAny(r10, r0)
            java.lang.String r1 = "midLength"
            java.lang.Object r1 = r9.fieldAny(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = r9.firstPositiveInt(r0)
            goto L74
        L91:
            java.lang.String r0 = "getThumbLength"
            java.lang.Object r0 = r9.callAny(r10, r0)
            java.lang.String r1 = "thumbLength"
            java.lang.Object r1 = r9.fieldAny(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = r9.firstPositiveInt(r0)
            goto L74
        La6:
            java.lang.String r0 = "getMd5"
            java.lang.String r0 = r9.callString(r10, r0)
            java.lang.String r1 = "md5"
            java.lang.String r1 = r9.fieldString(r10, r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r6 = r9.firstNotBlank(r0)
            java.lang.String r0 = "getKey"
            java.lang.String r0 = r9.callString(r10, r0)
            java.lang.String r1 = "getAesKey"
            java.lang.String r1 = r9.callString(r10, r1)
            java.lang.String r2 = "key"
            java.lang.String r2 = r9.fieldString(r10, r2)
            java.lang.String r3 = "aesKey"
            java.lang.String r10 = r9.fieldString(r10, r3)
            java.lang.String[] r10 = new java.lang.String[]{r0, r1, r2, r10}
            java.lang.String r8 = r9.firstNotBlank(r10)
            eb.a1 r3 = new eb.a1
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }

    private final boolean isHttpUrl(java.lang.String r3) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r0, r3, r0)
            java.lang.String r0 = "http://"
            r1 = 0
            boolean r0 = og.t.d0(r3, r0, r1)
            if (r0 != 0) goto L19
            java.lang.String r0 = "https://"
            boolean r3 = og.t.d0(r3, r0, r1)
            if (r3 == 0) goto L18
            goto L19
        L18:
            return r1
        L19:
            r3 = 1
            return r3
    }

    public static /* synthetic */ void j(h.Hchat.hooks.items.script.ScriptWaBridge r0, eb.w0 r1) {
            downloadVideoInternal$lambda$4(r0, r1)
            return
    }

    public static /* synthetic */ sf.n k(h.Hchat.hooks.items.script.ScriptWaBridge r0, java.util.function.Consumer r1, java.lang.String r2, java.lang.String r3) {
            sf.n r0 = sendText$lambda$0(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ boolean l(java.lang.String r0, java.lang.String r1, java.lang.String r2, j8.p r3) {
            boolean r0 = shareText$lambda$0(r0, r1, r2, r3)
            return r0
    }

    private final void logDownload(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = r3.currentPluginDir
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = r3.bridge
            if (r0 == 0) goto Lc
            java.lang.String r2 = r3.currentPluginName
            r1.log(r2, r0, r4)
            return
        Lc:
            r1.log(r4)
            return
    }

    public static /* synthetic */ sf.n m(h.Hchat.hooks.items.script.ScriptWaBridge r0, java.lang.Object r1, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r2, java.lang.String r3) {
            sf.n r0 = downloadVideo$lambda$1(r0, r1, r2, r3)
            return r0
    }

    private final java.lang.String mentionDisplayName(g8.i r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "notify@all"
            boolean r0 = gg.l.a(r5, r0)
            if (r0 == 0) goto Lb
            java.lang.String r3 = "所有人"
            return r3
        Lb:
            h.Hchat.hooks.api.model.WeChatContact r0 = r3.n(r5)
            java.lang.String r3 = r3.v(r4, r5)
            r4 = 0
            if (r0 == 0) goto L19
            java.lang.String r1 = r0.nickname
            goto L1a
        L19:
            r1 = r4
        L1a:
            if (r0 == 0) goto L1e
            java.lang.String r4 = r0.customWxId
        L1e:
            java.lang.String[] r3 = new java.lang.String[]{r3, r1, r4, r5}
            java.lang.String r3 = r2.firstNotBlank(r3)
            return r3
    }

    public static /* synthetic */ boolean n(java.lang.String r0, java.lang.Object r1, java.lang.String r2, j8.p r3) {
            boolean r0 = sendMediaMsg$lambda$0(r0, r1, r2, r3)
            return r0
    }

    private final java.lang.String normalizeDownloadUrl(java.lang.String r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto Lc
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            goto Ld
        Lc:
            r5 = r0
        Ld:
            java.lang.String r1 = ""
            if (r5 != 0) goto L12
            r5 = r1
        L12:
            boolean r2 = og.m.t0(r5)
            if (r2 == 0) goto L19
            return r1
        L19:
            java.util.regex.Pattern r2 = r4.atPattern
            java.util.regex.Matcher r2 = r2.matcher(r5)
            boolean r3 = r2.find()
            if (r3 == 0) goto L39
            r5 = 1
            java.lang.String r5 = r2.group(r5)
            if (r5 == 0) goto L34
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r0 = r5.toString()
        L34:
            if (r0 != 0) goto L37
            goto L38
        L37:
            r1 = r0
        L38:
            r5 = r1
        L39:
            java.lang.String r5 = r4.unescapeXmlText(r5)
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            return r5
    }

    private final java.util.Map<java.lang.String, java.lang.String> normalizeMap(java.util.Map<?, ?> r7) {
            r6 = this;
            if (r7 == 0) goto L58
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L9
            goto L58
        L9:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L16:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r3 = 0
            if (r2 == 0) goto L3c
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L3c
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            goto L3d
        L3c:
            r2 = r3
        L3d:
            java.lang.String r4 = ""
            if (r2 != 0) goto L42
            r2 = r4
        L42:
            boolean r5 = og.m.t0(r2)
            if (r5 == 0) goto L49
            goto L16
        L49:
            if (r1 == 0) goto L4f
            java.lang.String r3 = r1.toString()
        L4f:
            if (r3 != 0) goto L52
            goto L53
        L52:
            r4 = r3
        L53:
            r0.put(r2, r4)
            goto L16
        L57:
            return r0
        L58:
            tf.u r7 = tf.u.f13168g
            return r7
    }

    public static /* synthetic */ sf.n o(java.util.function.Consumer r0, h.Hchat.hooks.items.script.ScriptWaBridge r1, java.lang.String r2, java.util.Map r3, java.util.Map r4, long r5) {
            sf.n r0 = post$lambda$0(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ void p(fg.a r0, h.Hchat.hooks.items.script.ScriptWaBridge r1) {
            async$lambda$1(r0, r1)
            return
    }

    private final eb.b1 parseAtContent(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            g8.i r0 = wb.en.c()
            r1 = 0
            if (r0 == 0) goto L89
            boolean r2 = g8.i.I(r8)
            if (r2 != 0) goto Lf
            goto L89
        Lf:
            java.util.regex.Pattern r2 = r7.atPattern
            java.util.regex.Matcher r9 = r2.matcher(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
        L1f:
            boolean r4 = r9.find()
            if (r4 == 0) goto L6a
            r4 = 1
            java.lang.String r4 = r9.group(r4)
            if (r4 == 0) goto L35
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            goto L36
        L35:
            r4 = r1
        L36:
            java.lang.String r5 = ""
            if (r4 != 0) goto L3b
            r4 = r5
        L3b:
            boolean r6 = og.m.t0(r4)
            if (r6 == 0) goto L45
            r9.appendReplacement(r3, r5)
            goto L1f
        L45:
            r2.add(r4)
            java.lang.String r4 = r7.mentionDisplayName(r0, r8, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "@"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = "\u2005"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = java.util.regex.Matcher.quoteReplacement(r4)
            r4.getClass()
            r9.appendReplacement(r3, r4)
            goto L1f
        L6a:
            r9.appendTail(r3)
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L74
            goto L89
        L74:
            eb.b1 r8 = new eb.b1
            java.lang.String r9 = r3.toString()
            r9.getClass()
            java.util.Set r0 = tf.m.T1(r2)
            java.util.List r0 = tf.m.P1(r0)
            r8.<init>(r9, r0)
            return r8
        L89:
            return r1
    }

    private static final sf.n post$lambda$0(java.util.function.Consumer r7, h.Hchat.hooks.items.script.ScriptWaBridge r8, java.lang.String r9, java.util.Map r10, java.util.Map r11, long r12) {
            if (r7 == 0) goto L10
            java.lang.String r1 = "POST"
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.String r8 = r0.httpText(r1, r2, r3, r4, r5)
            r7.accept(r8)
        L10:
            sf.n r7 = sf.n.f12433a
            return r7
    }

    public static /* synthetic */ sf.n q(java.util.function.Consumer r0, h.Hchat.hooks.items.script.ScriptWaBridge r1, java.lang.String r2) {
            sf.n r0 = downloadImage$lambda$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ boolean r(int r0, java.lang.String r1, java.lang.String r2, j8.p r3) {
            boolean r0 = sendVoice$lambda$1(r0, r1, r2, r3)
            return r0
    }

    private final java.util.List<h.Hchat.hooks.api.model.WeChatContact> rawFriendList() {
            r3 = this;
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto Le
            java.lang.String r1 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom'"
            r2 = 0
            java.util.ArrayList r0 = r0.U(r1, r2)
            return r0
        Le:
            tf.t r0 = tf.t.f13167g
            return r0
    }

    private final java.util.Map<java.lang.String, h.Hchat.hooks.api.model.WeChatContact> rawGroupContactMap() {
            r4 = this;
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto Lb
            java.util.ArrayList r0 = r0.x()
            goto Ld
        Lb:
            tf.t r0 = tf.t.f13167g
        Ld:
            int r1 = tf.n.e1(r0)
            int r1 = tf.y.a0(r1)
            r2 = 16
            if (r1 >= r2) goto L1a
            r1 = r2
        L1a:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            r3 = r1
            h.Hchat.hooks.api.model.WeChatContact r3 = (h.Hchat.hooks.api.model.WeChatContact) r3
            java.lang.String r3 = r3.wxId
            r2.put(r3, r1)
            goto L23
        L36:
            return r2
    }

    private final java.util.List<h.Hchat.hooks.api.model.WeChatChatroom> rawGroupList() {
            r1 = this;
            g8.d r0 = j8.b.f()
            if (r0 == 0) goto Lb
            java.util.ArrayList r0 = r0.g()
            return r0
        Lb:
            tf.t r0 = tf.t.f13167g
            return r0
    }

    private final java.util.List<java.lang.String> readGroupMemberIds(java.lang.String r7, boolean r8) {
            r6 = this;
            if (r8 == 0) goto L4
            r8 = 5
            goto L5
        L4:
            r8 = 1
        L5:
            r0 = 0
        L6:
            if (r0 >= r8) goto L9d
            g8.i r1 = wb.en.c()
            g8.d r2 = j8.b.f()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            if (r2 == 0) goto L3b
            java.util.List r2 = r2.i(r7)
            if (r2 == 0) goto L3b
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r5 = og.m.t0(r5)
            if (r5 != 0) goto L21
            r3.add(r4)
            goto L21
        L3b:
            if (r1 == 0) goto L5f
            java.util.ArrayList r2 = r1.u(r7)
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r5 = og.m.t0(r5)
            if (r5 != 0) goto L45
            r3.add(r4)
            goto L45
        L5f:
            if (r1 == 0) goto L8b
            java.util.LinkedHashMap r1 = r1.w(r7)
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L8b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L71:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L71
            r3.add(r2)
            goto L71
        L8b:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L96
            java.util.List r7 = tf.m.P1(r3)
            return r7
        L96:
            r6.waitForContactData(r0)
            int r0 = r0 + 1
            goto L6
        L9d:
            tf.t r7 = tf.t.f13167g
            return r7
    }

    private final java.io.File resolveDownloadTarget(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            java.lang.String r1 = "/"
            r2 = 0
            boolean r5 = og.t.W(r5, r1, r2)
            if (r5 == 0) goto L18
            java.io.File r5 = new java.io.File
            java.lang.String r4 = r3.guessFileName(r4)
            r5.<init>(r0, r4)
            return r5
        L18:
            boolean r5 = r0.isDirectory()
            if (r5 == 0) goto L28
            java.io.File r5 = new java.io.File
            java.lang.String r4 = r3.guessFileName(r4)
            r5.<init>(r0, r4)
            return r5
        L28:
            boolean r5 = r0.exists()
            if (r5 != 0) goto L42
            java.lang.String r5 = dg.l.c0(r0)
            boolean r5 = og.m.t0(r5)
            if (r5 == 0) goto L42
            java.io.File r5 = new java.io.File
            java.lang.String r4 = r3.guessFileName(r4)
            r5.<init>(r0, r4)
            return r5
        L42:
            return r0
    }

    public static /* synthetic */ sf.n s(fg.l r0) {
            sf.n r0 = downloadVideoInternal$lambda$4$0(r0)
            return r0
    }

    private static final boolean sendEmoji$lambda$0(java.lang.String r1, java.lang.String r2, j8.p r3) {
            r3.getClass()
            java.lang.String r0 = ""
            if (r1 != 0) goto L8
            r1 = r0
        L8:
            if (r2 != 0) goto Lb
            r2 = r0
        Lb:
            j8.f r3 = r3.f6818d
            boolean r1 = r3.v(r1, r2)
            return r1
    }

    private static final boolean sendFavorite$lambda$0(java.lang.String r0, long r1, j8.p r3) {
            r3.getClass()
            j8.h r3 = r3.f6820f
            boolean r0 = r3.z(r1, r0)
            return r0
    }

    private static final boolean sendFavorite$lambda$1(java.lang.String r0, java.lang.String r1, j8.p r2) {
            r2.getClass()
            j8.h r2 = r2.f6820f
            boolean r0 = r2.A(r0, r1)
            return r0
    }

    private static final boolean sendFile$lambda$0(java.lang.String r1, java.lang.String r2, j8.p r3) {
            r3.getClass()
            java.lang.String r0 = ""
            if (r1 != 0) goto L8
            r1 = r0
        L8:
            if (r2 != 0) goto Lb
            r2 = r0
        Lb:
            androidx.lifecycle.x r3 = r3.f6819e
            boolean r1 = r3.T(r1, r2, r0)
            return r1
    }

    private static final boolean sendFile$lambda$1(java.lang.String r1, java.lang.String r2, java.lang.String r3, j8.p r4) {
            r4.getClass()
            java.lang.String r0 = ""
            if (r1 != 0) goto L8
            r1 = r0
        L8:
            if (r2 != 0) goto Lb
            r2 = r0
        Lb:
            if (r3 != 0) goto Le
            r3 = r0
        Le:
            androidx.lifecycle.x r4 = r4.f6819e
            boolean r1 = r4.T(r1, r2, r3)
            return r1
    }

    private static final boolean sendImage$lambda$0(java.lang.String r1, java.lang.String r2, j8.p r3) {
            r3.getClass()
            java.lang.String r0 = ""
            if (r1 != 0) goto L8
            r1 = r0
        L8:
            if (r2 != 0) goto Lb
            r2 = r0
        Lb:
            boolean r1 = r3.a(r1, r2)
            return r1
    }

    private static final boolean sendImage$lambda$1(java.lang.String r1, java.lang.String r2, java.lang.String r3, j8.p r4) {
            r4.getClass()
            java.lang.String r0 = ""
            if (r1 != 0) goto L8
            r1 = r0
        L8:
            if (r2 != 0) goto Lb
            r2 = r0
        Lb:
            if (r3 != 0) goto Le
            r3 = r0
        Le:
            j8.n r4 = r4.f6815a
            r0 = 0
            boolean r1 = r4.r(r1, r2, r3, r0)
            return r1
    }

    private final boolean sendMedia(fg.l r3) {
            r2 = this;
            i8.b r0 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r0.getClass()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.i()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L17
            r3.booleanValue()     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L1e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L25
            r3 = r0
        L25:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L2c:
            r3 = 0
            return r3
    }

    private static final boolean sendMediaMsg$lambda$0(java.lang.String r0, java.lang.Object r1, java.lang.String r2, j8.p r3) {
            r3.getClass()
            if (r2 != 0) goto L7
            java.lang.String r2 = ""
        L7:
            androidx.lifecycle.x r3 = r3.f6819e
            boolean r0 = r3.U(r1, r0, r2)
            return r0
    }

    private static final boolean sendOriginalImage$lambda$0(java.lang.String r2, java.lang.String r3, j8.p r4) {
            r4.getClass()
            java.lang.String r0 = ""
            if (r2 != 0) goto L8
            r2 = r0
        L8:
            if (r3 != 0) goto Lb
            r3 = r0
        Lb:
            j8.n r4 = r4.f6815a
            r1 = 1
            boolean r2 = r4.r(r2, r3, r0, r1)
            return r2
    }

    private static final sf.n sendText$lambda$0(h.Hchat.hooks.items.script.ScriptWaBridge r0, java.util.function.Consumer r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = r0.sendText(r2, r3)     // Catch: java.lang.Throwable -> L9
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L10:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L17
            r0 = r2
        L17:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r1 == 0) goto L2c
            if (r0 == 0) goto L28
            r2 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L29
        L28:
            r0 = 0
        L29:
            r1.accept(r0)
        L2c:
            sf.n r0 = sf.n.f12433a
            return r0
    }

    private static final boolean sendVideo$lambda$0(java.lang.String r1, java.lang.String r2, j8.p r3) {
            r3.getClass()
            bb.b r3 = r3.f6817c
            java.lang.String r0 = ""
            if (r1 != 0) goto La
            r1 = r0
        La:
            if (r2 != 0) goto Ld
            r2 = r0
        Ld:
            boolean r1 = r3.q(r1, r2)
            return r1
    }

    private static final boolean sendVoice$lambda$0(java.lang.String r1, java.lang.String r2, j8.p r3) {
            r3.getClass()
            java.lang.String r0 = ""
            if (r1 != 0) goto L8
            r1 = r0
        L8:
            if (r2 != 0) goto Lb
            r2 = r0
        Lb:
            j8.y r3 = r3.f6816b
            boolean r1 = r3.t(r1, r2)
            return r1
    }

    private static final boolean sendVoice$lambda$1(int r2, java.lang.String r3, java.lang.String r4, j8.p r5) {
            r5.getClass()
            r0 = 0
            r1 = 2147483(0x20c49b, float:3.009265E-39)
            int r2 = r9.e0.r(r2, r0, r1)
            int r2 = r2 * 1000
            java.lang.String r0 = ""
            if (r3 != 0) goto L12
            r3 = r0
        L12:
            if (r4 != 0) goto L15
            r4 = r0
        L15:
            j8.y r5 = r5.f6816b
            boolean r2 = r5.s(r2, r3, r4)
            return r2
    }

    private static final boolean shareFile$lambda$0(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, j8.p r4) {
            r4.getClass()
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
        L7:
            androidx.lifecycle.x r3 = r4.f6819e
            boolean r0 = r3.T(r0, r2, r1)
            return r0
    }

    private static final boolean shareMiniProgram$lambda$0(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, byte[] r7, java.lang.String r8, j8.p r9) {
            r9.getClass()
            java.lang.String r0 = ""
            if (r3 != 0) goto L8
            r3 = r0
        L8:
            if (r4 != 0) goto Lb
            r4 = r0
        Lb:
            if (r6 != 0) goto Le
            r6 = r0
        Le:
            if (r8 != 0) goto L19
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r9
            r9 = r0
            goto L22
        L19:
            r1 = r3
            r3 = r2
            r2 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r1
        L22:
            boolean r2 = r2.b(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }

    private static final boolean shareMusic$lambda$0(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, byte[] r16, java.lang.String r17, j8.p r18) {
            r18.getClass()
            java.lang.String r0 = ""
            if (r12 != 0) goto L9
            r3 = r0
            goto La
        L9:
            r3 = r12
        La:
            if (r13 != 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r13
        Lf:
            if (r17 != 0) goto L15
            r10 = r0
        L12:
            r12 = r18
            goto L18
        L15:
            r10 = r17
            goto L12
        L18:
            androidx.lifecycle.x r1 = r12.f6819e
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r2 = r11
            r5 = r14
            r6 = r15
            r9 = r16
            boolean r11 = r1.Z(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    private static final boolean shareMusicVideo$lambda$0(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, byte[] r21, java.lang.String r22, j8.p r23) {
            r23.getClass()
            java.lang.String r0 = ""
            if (r14 != 0) goto L8
            r14 = r0
        L8:
            if (r15 != 0) goto Lc
            r1 = r0
            goto Ld
        Lc:
            r1 = r15
        Ld:
            if (r18 != 0) goto L11
            r7 = r0
            goto L13
        L11:
            r7 = r18
        L13:
            if (r20 != 0) goto L17
            r11 = r0
            goto L19
        L17:
            r11 = r20
        L19:
            if (r22 != 0) goto L1e
        L1b:
            r2 = r23
            goto L21
        L1e:
            r0 = r22
            goto L1b
        L21:
            androidx.lifecycle.x r12 = r2.f6819e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r19)
            java.lang.String r10 = "songLyric"
            java.lang.String r2 = "musicUrl"
            java.lang.String r4 = "musicDataUrl"
            java.lang.String r6 = "singerName"
            java.lang.String r8 = "duration"
            r3 = r16
            r5 = r17
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            r12.getClass()
            java.lang.Object[][] r2 = androidx.lifecycle.x.q(r2)
            java.lang.String r3 = "description"
            java.lang.String r4 = "thumbData"
            java.lang.String r5 = "title"
            r15 = r14
            r19 = r21
            r17 = r1
            r16 = r3
            r18 = r4
            r14 = r5
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r15, r16, r17, r18, r19}
            java.lang.Object[][] r14 = androidx.lifecycle.x.q(r14)
            java.lang.String r1 = "com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject"
            java.lang.Object r14 = r12.D(r1, r2, r14)
            if (r14 == 0) goto L68
            boolean r13 = r12.U(r14, r13, r0)
            if (r13 == 0) goto L68
            r13 = 1
            return r13
        L68:
            r13 = 0
            return r13
    }

    private static final boolean shareText$lambda$0(java.lang.String r2, java.lang.String r3, java.lang.String r4, j8.p r5) {
            r5.getClass()
            if (r4 != 0) goto L7
            java.lang.String r4 = ""
        L7:
            androidx.lifecycle.x r5 = r5.f6819e
            java.lang.String r0 = "text"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            r5.getClass()
            java.lang.Object[][] r0 = androidx.lifecycle.x.q(r0)
            java.lang.String r1 = "description"
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3}
            java.lang.Object[][] r3 = androidx.lifecycle.x.q(r3)
            java.lang.String r1 = "com.tencent.mm.opensdk.modelmsg.WXTextObject"
            java.lang.Object r3 = r5.D(r1, r0, r3)
            if (r3 == 0) goto L30
            boolean r2 = r5.U(r3, r2, r4)
            if (r2 == 0) goto L30
            r2 = 1
            return r2
        L30:
            r2 = 0
            return r2
    }

    private static final boolean shareVideo$lambda$0(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, byte[] r7, java.lang.String r8, j8.p r9) {
            r9.getClass()
            java.lang.String r0 = ""
            if (r4 != 0) goto L8
            r4 = r0
        L8:
            if (r5 != 0) goto Lb
            r5 = r0
        Lb:
            if (r8 != 0) goto Le
            goto Lf
        Le:
            r0 = r8
        Lf:
            androidx.lifecycle.x r1 = r9.f6819e
            java.lang.String r8 = "videoUrl"
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6}
            r1.getClass()
            java.lang.Object[][] r2 = androidx.lifecycle.x.q(r6)
            java.lang.String r6 = "description"
            java.lang.String r8 = "thumbData"
            r9 = r7
            r7 = r5
            r5 = r4
            java.lang.String r4 = "title"
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9}
            java.lang.Object[][] r4 = androidx.lifecycle.x.q(r4)
            java.lang.String r5 = "com.tencent.mm.opensdk.modelmsg.WXVideoObject"
            java.lang.Object r4 = r1.D(r5, r2, r4)
            if (r4 == 0) goto L3f
            boolean r3 = r1.U(r4, r3, r0)
            if (r3 == 0) goto L3f
            r3 = 1
            return r3
        L3f:
            r3 = 0
            return r3
    }

    private static final boolean shareWebpage$lambda$0(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, byte[] r6, java.lang.String r7, j8.p r8) {
            r8.getClass()
            java.lang.String r0 = ""
            if (r3 != 0) goto L8
            r3 = r0
        L8:
            if (r4 != 0) goto Lb
            r4 = r0
        Lb:
            if (r7 != 0) goto L15
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r8
            r8 = r0
            goto L1d
        L15:
            r1 = r3
            r3 = r2
            r2 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r1
        L1d:
            boolean r2 = r2.c(r3, r4, r5, r6, r7, r8)
            return r2
    }

    public static /* synthetic */ boolean t(java.lang.String r0, java.lang.String r1, j8.p r2) {
            boolean r0 = sendVoice$lambda$0(r0, r1, r2)
            return r0
    }

    private final java.io.File targetFile(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto Lc
            boolean r1 = og.m.t0(r6)
            if (r1 != 0) goto La
            goto Lb
        La:
            r6 = r0
        Lb:
            r0 = r6
        Lc:
            java.lang.String r6 = "."
            java.lang.String r1 = "image_"
            if (r0 == 0) goto L4d
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L19
            goto L4d
        L19:
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.lang.String r3 = "/"
            r4 = 0
            boolean r0 = og.t.W(r0, r3, r4)
            if (r0 != 0) goto L2f
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L2e
            goto L2f
        L2e:
            return r2
        L2f:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = bc.e.g(r3, r1)
            java.lang.String[] r7 = new java.lang.String[]{r7, r0}
            java.lang.String r7 = r5.firstNotBlank(r7)
            java.lang.String r8 = r5.extensionFromUrl(r8)
            java.lang.String r6 = wb.en.h(r7, r6, r8)
            java.io.File r7 = new java.io.File
            r7.<init>(r2, r6)
            return r7
        L4d:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = bc.e.g(r2, r1)
            java.lang.String[] r7 = new java.lang.String[]{r7, r0}
            java.lang.String r7 = r5.firstNotBlank(r7)
            java.lang.String r8 = r5.extensionFromUrl(r8)
            java.lang.String r6 = wb.en.h(r7, r6, r8)
            java.io.File r7 = new java.io.File
            h.Hchat.hooks.items.script.ScriptPluginBridge r8 = r5.bridge
            android.content.Context r8 = r8.getHostContext()
            java.lang.String r0 = "Image"
            java.io.File r8 = zb.b.i(r8, r0)
            r7.<init>(r8, r6)
            return r7
    }

    public static /* synthetic */ okhttp3.OkHttpClient u(long r0) {
            okhttp3.OkHttpClient r0 = httpClient$lambda$0(r0)
            return r0
    }

    private final java.lang.String unescapeXmlText(java.lang.String r4) {
            r3 = this;
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L7
            return r4
        L7:
            java.lang.String r0 = "&quot;"
            java.lang.String r1 = "\""
            r2 = 0
            java.lang.String r4 = og.t.a0(r4, r0, r1, r2)
            java.lang.String r0 = "&#x20;"
            java.lang.String r1 = " "
            java.lang.String r4 = og.t.a0(r4, r0, r1, r2)
            java.lang.String r0 = "&#x0A;"
            java.lang.String r1 = "\n"
            java.lang.String r4 = og.t.a0(r4, r0, r1, r2)
            java.lang.String r0 = "&lt;"
            java.lang.String r1 = "<"
            java.lang.String r4 = og.t.a0(r4, r0, r1, r2)
            java.lang.String r0 = "&gt;"
            java.lang.String r1 = ">"
            java.lang.String r4 = og.t.a0(r4, r0, r1, r2)
            java.lang.String r0 = "&apos;"
            java.lang.String r1 = "'"
            java.lang.String r4 = og.t.a0(r4, r0, r1, r2)
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            java.lang.String r4 = og.t.a0(r4, r0, r1, r2)
            og.k r0 = new og.k
            java.lang.String r1 = "&#(x[0-9a-fA-F]+|[0-9]+);"
            r0.<init>(r1)
            b0.d0 r1 = new b0.d0
            r2 = 11
            r1.<init>(r3, r2)
            java.lang.String r4 = r0.e(r4, r1)
            return r4
    }

    private static final java.lang.CharSequence unescapeXmlText$lambda$0(h.Hchat.hooks.items.script.ScriptWaBridge r2, og.f r3) {
            r3.getClass()
            og.i r3 = (og.i) r3
            java.util.List r2 = r3.a()
            og.g r2 = (og.g) r2
            r0 = 1
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = "x"
            boolean r1 = og.t.d0(r2, r1, r0)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            java.lang.String r2 = r2.substring(r0)     // Catch: java.lang.Throwable -> L28
            r0 = 16
            a.a.w(r0)     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Integer.parseInt(r2, r0)     // Catch: java.lang.Throwable -> L28
            goto L2e
        L28:
            r2 = move-exception
            goto L33
        L2a:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L28
        L2e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L28
            goto L39
        L33:
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L39:
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L3f
            r2 = 0
        L3f:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L66
            int r2 = r2.intValue()
            char[] r2 = java.lang.Character.toChars(r2)     // Catch: java.lang.Throwable -> L54
            r2.getClass()     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L54
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L54
            goto L5a
        L54:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
        L5a:
            java.lang.String r2 = r3.c()
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L63
            r0 = r2
        L63:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
        L66:
            java.lang.String r2 = r3.c()
            return r2
    }

    public static /* synthetic */ boolean v(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, byte[] r5, java.lang.String r6, j8.p r7) {
            boolean r0 = shareMusic$lambda$0(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    private final eb.c1 videoDownloadRequest(java.lang.Object r13) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            boolean r1 = r13 instanceof h.Hchat.hooks.items.script.ScriptMessageBean
            if (r1 == 0) goto L16
            r2 = r13
            h.Hchat.hooks.items.script.ScriptMessageBean r2 = (h.Hchat.hooks.items.script.ScriptMessageBean) r2
            java.lang.Object r2 = r2.getMessage()
            boolean r3 = r2 instanceof h.Hchat.hooks.api.model.WeChatMessage
            if (r3 == 0) goto L1e
            h.Hchat.hooks.api.model.WeChatMessage r2 = (h.Hchat.hooks.api.model.WeChatMessage) r2
            goto L1f
        L16:
            boolean r2 = r13 instanceof h.Hchat.hooks.api.model.WeChatMessage
            if (r2 == 0) goto L1e
            r2 = r13
            h.Hchat.hooks.api.model.WeChatMessage r2 = (h.Hchat.hooks.api.model.WeChatMessage) r2
            goto L1f
        L1e:
            r2 = r0
        L1f:
            if (r1 == 0) goto L29
            r1 = r13
            h.Hchat.hooks.items.script.ScriptMessageBean r1 = (h.Hchat.hooks.items.script.ScriptMessageBean) r1
            java.lang.Object r1 = r1.getVideoMsg()
            goto L36
        L29:
            boolean r1 = r13 instanceof h.Hchat.hooks.api.model.WeChatMessage
            if (r1 == 0) goto L35
            r1 = r13
            h.Hchat.hooks.api.model.WeChatMessage r1 = (h.Hchat.hooks.api.model.WeChatMessage) r1
            h.Hchat.hooks.api.model.WeChatVideoMsg r1 = r1.getVideoMsg()
            goto L36
        L35:
            r1 = r13
        L36:
            j8.p r3 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r3 == 0) goto L3f
            bb.b r3 = r3.f6817c
            goto L40
        L3f:
            r3 = r0
        L40:
            if (r2 == 0) goto L45
            java.lang.String r2 = r2.imagePath
            goto L46
        L45:
            r2 = r0
        L46:
            java.lang.String r4 = "getImagePath"
            java.lang.String r4 = r12.callString(r13, r4)
            java.lang.String r5 = "imagePath"
            java.lang.String r13 = r12.fieldString(r13, r5)
            java.lang.String[] r13 = new java.lang.String[]{r2, r4, r13}
            java.lang.String r13 = r12.firstNotBlank(r13)
            boolean r2 = og.m.t0(r13)
            if (r2 != 0) goto L67
            if (r3 == 0) goto L67
            j8.r r2 = r3.n(r13)
            goto L68
        L67:
            r2 = r0
        L68:
            if (r2 == 0) goto L71
            long r4 = r2.f6824d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L72
        L71:
            r4 = r0
        L72:
            if (r1 == 0) goto L7b
            java.lang.String r5 = "getLength"
            java.lang.Object r5 = r12.callAny(r1, r5)
            goto L7c
        L7b:
            r5 = r0
        L7c:
            if (r1 == 0) goto L85
            java.lang.String r6 = "length"
            java.lang.Object r6 = r12.fieldAny(r1, r6)
            goto L86
        L85:
            r6 = r0
        L86:
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6}
            long r9 = r12.firstPositiveLong(r4)
            java.io.File r4 = new java.io.File
            r4.<init>(r13)
            boolean r4 = r4.isFile()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto La3
            r4 = r13
            goto La4
        La3:
            r4 = r0
        La4:
            boolean r5 = og.m.t0(r13)
            r6 = 1
            r5 = r5 ^ r6
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lb5
            goto Lb6
        Lb5:
            r13 = r0
        Lb6:
            if (r13 == 0) goto Lbf
            if (r3 == 0) goto Lbf
            java.lang.String r13 = r3.o(r13)
            goto Lc0
        Lbf:
            r13 = r0
        Lc0:
            java.lang.String[] r13 = new java.lang.String[]{r4, r13}
            java.lang.String r13 = r12.firstNotBlank(r13)
            boolean r3 = og.m.t0(r13)
            r3 = r3 ^ r6
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Ld8
            goto Ld9
        Ld8:
            r13 = r0
        Ld9:
            if (r13 == 0) goto L10c
            java.io.File r3 = new java.io.File
            r3.<init>(r13)
            boolean r13 = r3.isFile()
            if (r13 == 0) goto Lfd
            long r4 = r3.length()
            r7 = 0
            int r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r13 <= 0) goto Lfd
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 <= 0) goto Lfe
            long r4 = r3.length()
            int r13 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r13 < 0) goto Lfd
            goto Lfe
        Lfd:
            r6 = 0
        Lfe:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L109
            goto L10a
        L109:
            r3 = r0
        L10a:
            r11 = r3
            goto L10d
        L10c:
            r11 = r0
        L10d:
            if (r2 == 0) goto L112
            java.lang.String r13 = r2.f6821a
            goto L113
        L112:
            r13 = r0
        L113:
            if (r1 == 0) goto L11c
            java.lang.String r3 = "getNewMd5"
            java.lang.String r3 = r12.callString(r1, r3)
            goto L11d
        L11c:
            r3 = r0
        L11d:
            if (r1 == 0) goto L126
            java.lang.String r4 = "getMd5"
            java.lang.String r4 = r12.callString(r1, r4)
            goto L127
        L126:
            r4 = r0
        L127:
            if (r1 == 0) goto L130
            java.lang.String r5 = "newMd5"
            java.lang.String r5 = r12.fieldString(r1, r5)
            goto L131
        L130:
            r5 = r0
        L131:
            if (r1 == 0) goto L13a
            java.lang.String r6 = "md5"
            java.lang.String r6 = r12.fieldString(r1, r6)
            goto L13b
        L13a:
            r6 = r0
        L13b:
            java.lang.String[] r13 = new java.lang.String[]{r13, r3, r4, r5, r6}
            java.lang.String r6 = r12.firstNotBlank(r13)
            if (r2 == 0) goto L148
            java.lang.String r13 = r2.f6822b
            goto L149
        L148:
            r13 = r0
        L149:
            if (r1 == 0) goto L152
            java.lang.String r3 = "getCdnVideoUrl"
            java.lang.String r3 = r12.callString(r1, r3)
            goto L153
        L152:
            r3 = r0
        L153:
            if (r1 == 0) goto L15c
            java.lang.String r4 = "getCdnUrl"
            java.lang.String r4 = r12.callString(r1, r4)
            goto L15d
        L15c:
            r4 = r0
        L15d:
            if (r1 == 0) goto L166
            java.lang.String r5 = "cdnVideoUrl"
            java.lang.String r5 = r12.fieldString(r1, r5)
            goto L167
        L166:
            r5 = r0
        L167:
            if (r1 == 0) goto L170
            java.lang.String r7 = "cdnUrl"
            java.lang.String r7 = r12.fieldString(r1, r7)
            goto L171
        L170:
            r7 = r0
        L171:
            java.lang.String[] r13 = new java.lang.String[]{r13, r3, r4, r5, r7}
            java.lang.String r7 = r12.firstNotBlank(r13)
            if (r2 == 0) goto L17e
            java.lang.String r13 = r2.f6823c
            goto L17f
        L17e:
            r13 = r0
        L17f:
            if (r1 == 0) goto L188
            java.lang.String r2 = "getAesKey"
            java.lang.String r2 = r12.callString(r1, r2)
            goto L189
        L188:
            r2 = r0
        L189:
            if (r1 == 0) goto L192
            java.lang.String r3 = "aesKey"
            java.lang.String r1 = r12.fieldString(r1, r3)
            goto L193
        L192:
            r1 = r0
        L193:
            java.lang.String[] r13 = new java.lang.String[]{r13, r2, r1}
            java.lang.String r8 = r12.firstNotBlank(r13)
            if (r11 != 0) goto L1a4
            boolean r13 = og.m.t0(r7)
            if (r13 == 0) goto L1a4
            return r0
        L1a4:
            eb.c1 r5 = new eb.c1
            r5.<init>(r6, r7, r8, r9, r11)
            return r5
    }

    private final java.io.File videoTargetFile(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "video_"
            java.lang.String r0 = bc.e.g(r0, r2)
            java.lang.String[] r5 = new java.lang.String[]{r5, r0}
            java.lang.String r5 = r3.firstNotBlank(r5)
            java.lang.String r0 = ".mp4"
            java.lang.String r5 = bc.e.i(r5, r0)
            r0 = 0
            if (r4 == 0) goto L24
            boolean r1 = og.m.t0(r4)
            if (r1 != 0) goto L22
            goto L23
        L22:
            r4 = r0
        L23:
            r0 = r4
        L24:
            if (r0 == 0) goto L49
            boolean r4 = og.m.t0(r0)
            if (r4 == 0) goto L2d
            goto L49
        L2d:
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            java.lang.String r1 = "/"
            r2 = 0
            boolean r0 = og.t.W(r0, r1, r2)
            if (r0 != 0) goto L43
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L42
            goto L43
        L42:
            return r4
        L43:
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r5)
            return r0
        L49:
            java.io.File r4 = new java.io.File
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = r3.bridge
            android.content.Context r0 = r0.getHostContext()
            java.lang.String r1 = "Video"
            java.io.File r0 = zb.b.i(r0, r1)
            r4.<init>(r0, r5)
            return r4
    }

    public static /* synthetic */ boolean w(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, byte[] r4, java.lang.String r5, j8.p r6) {
            boolean r0 = shareWebpage$lambda$0(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    private final boolean waitDownloadedFile(java.io.File r13, long r14) {
            r12 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lb
            r14 = r2
        Lb:
            long r0 = r0 + r14
            r14 = -1
            r2 = 0
            r3 = r14
            r5 = r2
        L11:
            long r6 = java.lang.System.currentTimeMillis()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r7 = 0
            r9 = 1
            if (r6 >= 0) goto L45
            boolean r6 = r13.isFile()
            if (r6 == 0) goto L27
            long r10 = r13.length()
            goto L28
        L27:
            r10 = r14
        L28:
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 <= 0) goto L35
            int r6 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r6 != 0) goto L35
            int r5 = r5 + r9
            r6 = 2
            if (r5 < r6) goto L37
            return r9
        L35:
            r5 = r2
            r3 = r10
        L37:
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r6)     // Catch: java.lang.InterruptedException -> L3d
            goto L11
        L3d:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
            return r2
        L45:
            boolean r14 = r13.isFile()
            if (r14 == 0) goto L54
            long r13 = r13.length()
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 <= 0) goto L54
            return r9
        L54:
            return r2
    }

    private final void waitForContactData(int r3) {
            r2 = this;
            r0 = 4
            if (r3 >= r0) goto L2e
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L12
            goto L2e
        L12:
            r0 = 250(0xfa, double:1.235E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L1a
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L21:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L2e
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
        L2e:
            return
    }

    public static /* synthetic */ boolean x(java.lang.String r0, java.lang.String r1, j8.p r2) {
            boolean r0 = sendImage$lambda$0(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.CharSequence y(java.util.Map.Entry r0) {
            java.lang.CharSequence r0 = buildPostBody$lambda$1(r0)
            return r0
    }

    public static /* synthetic */ void z(fg.a r0, h.Hchat.hooks.items.script.ScriptWaBridge r1) {
            async$lambda$0(r0, r1)
            return
    }

    public final boolean addChatroomMember(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2d
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto La
            goto L2d
        La:
            if (r5 == 0) goto L2d
            boolean r1 = og.m.t0(r5)
            if (r1 == 0) goto L13
            goto L2d
        L13:
            g8.d r1 = j8.b.f()
            if (r1 == 0) goto L2d
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L21
            r4 = r0
            goto L29
        L21:
            java.util.List r5 = java.util.Collections.singletonList(r5)
            boolean r4 = r1.a(r4, r5)
        L29:
            r5 = 1
            if (r4 != r5) goto L2d
            return r5
        L2d:
            return r0
    }

    public final boolean addChatroomMember(java.lang.String r3, java.util.List<java.lang.String> r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L21
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto La
            goto L21
        La:
            if (r4 == 0) goto L21
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L13
            goto L21
        L13:
            g8.d r1 = j8.b.f()
            if (r1 == 0) goto L21
            boolean r3 = r1.a(r3, r4)
            r4 = 1
            if (r3 != r4) goto L21
            return r4
        L21:
            return r0
    }

    public final java.lang.String addContactLabel(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 == 0) goto L1b
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto Lb
            goto L1b
        Lb:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L16
            java.lang.String r3 = r1.a(r3)
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 != 0) goto L1a
            return r0
        L1a:
            return r3
        L1b:
            return r0
    }

    public final void bindPluginLog(java.lang.String r1, java.io.File r2) {
            r0 = this;
            r0.currentPluginName = r1
            r0.currentPluginDir = r2
            return
    }

    public final boolean clearAllUnread() {
            r5 = this;
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = r5.bridge
            android.content.Context r0 = r0.getHostContext()
            r1 = 0
            int r0 = ya.i.e(r0, r1)
            if (r0 >= 0) goto Le
            goto L35
        Le:
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()
            r0.getClass()
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.f()
            if (r0 == 0) goto L35
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r0.f5135a
            java.lang.String r2 = "wxid_hchat_group_%"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r3 = "total"
            java.lang.String r4 = "SELECT IFNULL(SUM(unReadCount),0) AS total FROM rconversation WHERE username NOT LIKE ?"
            java.lang.String r0 = r0.queryFirstString(r4, r2, r3)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            if (r0 != 0) goto L35
            r0 = 1
            return r0
        L35:
            return r1
    }

    public final boolean clearUnread(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L15
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto La
            goto L15
        La:
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = r2.bridge
            android.content.Context r1 = r1.getHostContext()
            boolean r3 = ya.i.f(r1, r3, r0)
            return r3
        L15:
            return r0
    }

    public final boolean delChatroomMember(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2d
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto La
            goto L2d
        La:
            if (r5 == 0) goto L2d
            boolean r1 = og.m.t0(r5)
            if (r1 == 0) goto L13
            goto L2d
        L13:
            g8.d r1 = j8.b.f()
            if (r1 == 0) goto L2d
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L21
            r4 = r0
            goto L29
        L21:
            java.util.List r5 = java.util.Collections.singletonList(r5)
            boolean r4 = r1.d(r4, r5)
        L29:
            r5 = 1
            if (r4 != r5) goto L2d
            return r5
        L2d:
            return r0
    }

    public final boolean delChatroomMember(java.lang.String r3, java.util.List<java.lang.String> r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L21
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto La
            goto L21
        La:
            if (r4 == 0) goto L21
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L13
            goto L21
        L13:
            g8.d r1 = j8.b.f()
            if (r1 == 0) goto L21
            boolean r3 = r1.d(r3, r4)
            r4 = 1
            if (r3 != r4) goto L21
            return r4
        L21:
            return r0
    }

    public final void delay(long r5, java.lang.Runnable r7) {
            r4 = this;
            if (r7 != 0) goto L3
            return
        L3:
            a1.d r0 = new a1.d
            r1 = 9
            r0.<init>(r4, r1, r7)
            i8.e r7 = h.Hchat.hooks.api.core.WeChatApis.runtime()
            r7.getClass()
            o8.j r7 = h.Hchat.hooks.api.core.WeChatApis.p()
            java.lang.String r1 = "script_delay_"
            if (r7 == 0) goto L27
            java.util.concurrent.atomic.AtomicLong r2 = r4.callbackSeq
            long r2 = r2.getAndIncrement()
            java.lang.String r1 = bc.e.g(r2, r1)
            r7.f(r1, r5, r0)
            return
        L27:
            java.lang.Thread r7 = new java.lang.Thread
            ca.r r2 = new ca.r
            r2.<init>(r4, r5, r0)
            java.util.concurrent.atomic.AtomicLong r5 = r4.callbackSeq
            long r5 = r5.getAndIncrement()
            java.lang.String r5 = bc.e.g(r5, r1)
            r7.<init>(r2, r5)
            r7.start()
            return
    }

    public final boolean deleteConversation(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 != 0) goto L10
            java.lang.String r3 = ""
        L10:
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()
            r0.getClass()
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.f()
            if (r0 == 0) goto L2a
            boolean r3 = r0.a(r3)
            return r3
        L2a:
            return r1
    }

    public final void download(java.lang.String r9, java.lang.String r10, java.util.Map<?, ?> r11, long r12, java.util.function.Consumer<java.io.File> r14) {
            r8 = this;
            eb.q0 r0 = new eb.q0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.async(r0)
            return
    }

    public final void download(java.lang.String r8, java.lang.String r9, java.util.Map<?, ?> r10, java.util.function.Consumer<java.io.File> r11) {
            r7 = this;
            r4 = 30
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r0.download(r1, r2, r3, r4, r6)
            return
    }

    public final void downloadImage(java.lang.String r2, java.lang.String r3, java.util.function.Consumer<java.io.File> r4) {
            r1 = this;
            eb.y0 r0 = new eb.y0
            r0.<init>(r4, r1, r2, r3)
            r1.async(r0)
            return
    }

    public final void downloadImage(java.lang.String r3, java.util.function.Consumer<java.io.File> r4) {
            r2 = this;
            ab.e r0 = new ab.e
            r1 = 7
            r0.<init>(r4, r2, r3, r1)
            r2.async(r0)
            return
    }

    public final void downloadImages(java.util.List<?> r7, java.lang.String r8, java.util.function.Consumer<java.util.List<java.io.File>> r9) {
            r6 = this;
            c9.n0 r0 = new c9.n0
            r5 = 3
            r3 = r6
            r4 = r7
            r2 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.async(r0)
            return
    }

    public final void downloadImages(java.util.List<?> r3, java.util.function.Consumer<java.util.List<java.io.File>> r4) {
            r2 = this;
            ab.e r0 = new ab.e
            r1 = 6
            r0.<init>(r4, r2, r3, r1)
            r2.async(r0)
            return
    }

    public final void downloadImg(java.lang.Object r8, java.lang.String r9) {
            r7 = this;
            eb.a1 r8 = r7.imageDownloadRequest(r8)
            if (r8 == 0) goto L15
            java.lang.String r1 = r8.f2495a
            java.lang.String r2 = r8.f2496b
            java.lang.String r3 = r8.f2497c
            int r5 = r8.f2498d
            int r6 = r8.f2499e
            r0 = r7
            r4 = r9
            r0.downloadImgInternal(r1, r2, r3, r4, r5, r6)
        L15:
            return
    }

    public final void downloadImg(java.lang.Object r7, java.lang.String r8, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r9) {
            r6 = this;
            eb.n0 r0 = new eb.n0
            r5 = 1
            r1 = r6
            r2 = r7
            r4 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.async(r0)
            return
    }

    public final void downloadImg(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            r9 = this;
            r7 = 32
            r8 = 0
            r5 = 2
            r6 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            downloadImgInternal$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public final void downloadVideo(java.lang.Object r7, java.lang.String r8, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r9) {
            r6 = this;
            eb.n0 r0 = new eb.n0
            r5 = 0
            r1 = r6
            r2 = r7
            r4 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.async(r0)
            return
    }

    public final void downloadVideo(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r13) {
            r8 = this;
            c9.p0 r0 = new c9.p0
            r7 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.async(r0)
            return
    }

    public final void get(java.lang.String r8, java.util.Map<?, ?> r9, long r10, java.util.function.Consumer<java.lang.String> r12) {
            r7 = this;
            eb.p0 r0 = new eb.p0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r7.async(r0)
            return
    }

    public final void get(java.lang.String r7, java.util.Map<?, ?> r8, java.util.function.Consumer<java.lang.String> r9) {
            r6 = this;
            r3 = 30
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.get(r1, r2, r3, r5)
            return
    }

    public final int getAllUnreadCount() {
            r5 = this;
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()
            r0.getClass()
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.f()
            r1 = 0
            if (r0 == 0) goto L23
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r0.f5135a
            java.lang.String r2 = "wxid_hchat_group_%"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r3 = "total"
            java.lang.String r4 = "SELECT IFNULL(SUM(unReadCount),0) AS total FROM rconversation WHERE username NOT LIKE ?"
            java.lang.String r0 = r0.queryFirstString(r4, r2, r3)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L23
            return r0
        L23:
            return r1
    }

    public final java.lang.String getAvatarUrl(java.lang.String r2) {
            r1 = this;
            r0 = 1
            java.lang.String r2 = r1.getAvatarUrl(r2, r0)
            return r2
    }

    public final java.lang.String getAvatarUrl(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 == 0) goto L1b
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto Lb
            goto L1b
        Lb:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L16
            java.lang.String r3 = r1.m(r3, r4)
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 != 0) goto L1a
            return r0
        L1a:
            return r3
        L1b:
            return r0
    }

    public final java.lang.String getChatroomName(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.getGroupName(r1)
            return r1
    }

    public final java.util.List<java.lang.String> getContactByLabelId(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L14
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L9
            goto L14
        L9:
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L14
            java.util.ArrayList r2 = r0.o(r2)
            return r2
        L14:
            tf.t r2 = tf.t.f13167g
            return r2
    }

    public final java.util.List<java.lang.String> getContactByLabelName(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L61
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L9
            goto L61
        L9:
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L61
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L1b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        L1b:
            java.util.ArrayList r1 = r0.p()
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            h.Hchat.hooks.api.model.ContactLabelBean r2 = (h.Hchat.hooks.api.model.ContactLabelBean) r2
            java.lang.String r3 = r2.getLabelName()
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L43
            java.lang.String r3 = r2.getName()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L23
        L43:
            java.lang.String r5 = r2.getLabelId()
            java.util.ArrayList r5 = r0.o(r5)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L5a
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r0 = r2.getUserNameList()
            r5.<init>(r0)
        L5a:
            return r5
        L5b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        L61:
            tf.t r5 = tf.t.f13167g
            return r5
    }

    public final java.util.List<h.Hchat.hooks.api.model.ContactLabelBean> getContactLabelList() {
            r1 = this;
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto Lb
            java.util.ArrayList r0 = r0.p()
            return r0
        Lb:
            tf.t r0 = tf.t.f13167g
            return r0
    }

    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getContactLabelListInfo() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r6.getContactLabelList()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()
            h.Hchat.hooks.api.model.ContactLabelBean r2 = (h.Hchat.hooks.api.model.ContactLabelBean) r2
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r4 = "labelId"
            java.lang.String r5 = r2.labelId
            r3.put(r4, r5)
            java.lang.String r4 = "id"
            java.lang.String r5 = r2.labelId
            r3.put(r4, r5)
            java.lang.String r4 = "labelName"
            java.lang.String r5 = r2.labelName
            r3.put(r4, r5)
            java.lang.String r4 = "name"
            java.lang.String r5 = r2.labelName
            r3.put(r4, r5)
            java.lang.String r4 = "userNameList"
            java.util.List<java.lang.String> r5 = r2.userNameList
            r3.put(r4, r5)
            java.lang.String r4 = "usernameList"
            java.util.List<java.lang.String> r5 = r2.userNameList
            r3.put(r4, r5)
            java.lang.String r4 = "contactList"
            java.util.List<java.lang.String> r2 = r2.userNameList
            r3.put(r4, r2)
            r0.add(r3)
            goto Ld
        L53:
            return r0
    }

    public final h.Hchat.hooks.api.runtime.WeChatDatabaseApi getDatabaseApi() {
            r1 = this;
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()
            return r0
    }

    public final long getDuration(java.lang.String r7) {
            r6 = this;
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            if (r7 == 0) goto Lac
            boolean r3 = og.m.t0(r7)
            if (r3 == 0) goto L10
            goto Lac
        L10:
            java.io.File r3 = new java.io.File
            r3.<init>(r7)
            boolean r7 = r3.isFile()
            if (r7 != 0) goto L1d
            goto Lac
        L1d:
            me.yun.silk.SilkCodec r7 = r6.getDurationCodec()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L2e
            long r4 = r7.getDuration(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            r7 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r7)
            r7 = r4
        L35:
            boolean r4 = r7 instanceof sf.f
            if (r4 == 0) goto L3b
            r7 = r2
        L3b:
            r4 = r7
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L47
            goto L48
        L47:
            r7 = 0
        L48:
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L51
            long r0 = r7.longValue()
            return r0
        L51:
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever
            r7.<init>()
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L70
            r7.setDataSource(r3)     // Catch: java.lang.Throwable -> L70
            r3 = 9
            java.lang.String r3 = r7.extractMetadata(r3)     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L72
            java.lang.Long r3 = og.t.g0(r3)     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L72
            long r0 = r3.longValue()     // Catch: java.lang.Throwable -> L70
            goto L72
        L70:
            r0 = move-exception
            goto L77
        L72:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L70
            goto L7d
        L77:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L7d:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 == 0) goto L9a
            h.Hchat.hooks.items.script.ScriptPluginBridge r3 = r6.bridge
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "读取音频时长失败: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.log(r1)
        L9a:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L9f
            goto La0
        L9f:
            r2 = r0
        La0:
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            r7.release()     // Catch: java.lang.Throwable -> La8
        La8:
            long r0 = r2.longValue()
        Lac:
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getFavorite(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L8
            goto L3d
        L8:
            i8.b r0 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r0.getClass()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.i()
            if (r0 == 0) goto L3d
            j8.h r0 = r0.f6820f
            if (r0 == 0) goto L3d
            java.lang.Object r3 = r0.r(r3)     // Catch: java.lang.Throwable -> L2a
            j8.i r3 = r0.i(r3)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
            java.util.Map r3 = r2.favoriteItemMap(r3)     // Catch: java.lang.Throwable -> L2a
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L2a
            goto L34
        L2a:
            r3 = move-exception
            goto L2e
        L2c:
            r3 = r1
            goto L34
        L2e:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L34:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r3
        L3b:
            java.util.Map r1 = (java.util.Map) r1
        L3d:
            return r1
    }

    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getFavoriteList(int r5) {
            r4 = this;
            i8.b r0 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r0.getClass()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.i()
            tf.t r1 = tf.t.f13167g
            if (r0 == 0) goto L50
            j8.h r0 = r0.f6820f
            if (r0 == 0) goto L50
            r2 = 1
            r3 = 200(0xc8, float:2.8E-43)
            int r5 = r9.e0.r(r5, r2, r3)     // Catch: java.lang.Throwable -> L42
            java.util.List r5 = r0.q(r5)     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L21
            r5 = r1
        L21:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L42
            int r2 = tf.n.e1(r5)     // Catch: java.lang.Throwable -> L42
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L42
        L2e:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L48
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L42
            j8.i r2 = (j8.i) r2     // Catch: java.lang.Throwable -> L42
            java.util.Map r2 = r4.favoriteItemMap(r2)     // Catch: java.lang.Throwable -> L42
            r0.add(r2)     // Catch: java.lang.Throwable -> L42
            goto L2e
        L42:
            r5 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r5)
        L48:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r0
        L4e:
            java.util.List r1 = (java.util.List) r1
        L50:
            return r1
    }

    public final java.lang.String getFriendCity(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            if (r4 == 0) goto L34
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto Lb
            goto L34
        Lb:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L2f
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L19
        L17:
            r4 = r0
            goto L30
        L19:
            boolean r2 = r1.L(r4)
            if (r2 == 0) goto L26
            r4 = 12292(0x3004, float:1.7225E-41)
            java.lang.String r4 = r1.Y(r4)
            goto L30
        L26:
            h.Hchat.hooks.api.model.WeChatContact r4 = r1.n(r4)
            if (r4 == 0) goto L17
            java.lang.String r4 = r4.city
            goto L30
        L2f:
            r4 = 0
        L30:
            if (r4 != 0) goto L33
            return r0
        L33:
            return r4
        L34:
            return r0
    }

    public final java.lang.String getFriendDisplayName(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            if (r6 == 0) goto L74
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto La
            goto L74
        La:
            r0 = 0
            if (r7 == 0) goto L53
            boolean r1 = og.m.t0(r7)
            if (r1 == 0) goto L14
            goto L53
        L14:
            g8.d r1 = j8.b.f()
            if (r1 == 0) goto L25
            g8.i r1 = r1.f4349b
            if (r1 != 0) goto L20
            r1 = r6
            goto L26
        L20:
            java.lang.String r1 = r1.v(r7, r6)
            goto L26
        L25:
            r1 = r0
        L26:
            eb.d r2 = eb.d.f2520a
            java.lang.String r2 = eb.d.b(r7, r6)
            g8.d r3 = j8.b.f()
            if (r3 == 0) goto L37
            java.lang.String r3 = r3.h(r7, r6)
            goto L38
        L37:
            r3 = r0
        L38:
            g8.i r4 = wb.en.c()
            if (r4 == 0) goto L43
            java.lang.String r7 = r4.t(r7, r6)
            goto L44
        L43:
            r7 = r0
        L44:
            java.lang.String[] r7 = new java.lang.String[]{r1, r2, r3, r7}
            java.lang.String r7 = r5.firstNotBlank(r7)
            boolean r1 = og.m.t0(r7)
            if (r1 != 0) goto L53
            return r7
        L53:
            g8.i r7 = wb.en.c()
            if (r7 == 0) goto L73
            h.Hchat.hooks.api.model.WeChatContact r1 = r7.n(r6)
            if (r1 == 0) goto L62
            java.lang.String r1 = r1.nickname
            goto L63
        L62:
            r1 = r0
        L63:
            h.Hchat.hooks.api.model.WeChatContact r7 = r7.n(r6)
            if (r7 == 0) goto L6b
            java.lang.String r0 = r7.customWxId
        L6b:
            java.lang.String[] r6 = new java.lang.String[]{r1, r0, r6}
            java.lang.String r6 = r5.firstNotBlank(r6)
        L73:
            return r6
        L74:
            java.lang.String r6 = ""
            return r6
    }

    public final int getFriendGender(java.lang.String r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L15
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto La
            goto L15
        La:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L15
            int r3 = r1.s(r3)
            return r3
        L15:
            return r0
    }

    public final java.util.List<me.hd.wauxv.data.bean.info.FriendInfo> getFriendList() {
            r15 = this;
            java.util.List r0 = r15.rawFriendList()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            h.Hchat.hooks.api.model.WeChatContact r2 = (h.Hchat.hooks.api.model.WeChatContact) r2
            me.hd.wauxv.data.bean.info.FriendInfo r3 = new me.hd.wauxv.data.bean.info.FriendInfo
            java.lang.String r4 = r2.wxId
            java.lang.String r5 = r2.nickname
            java.lang.String r6 = r2.remarkName
            java.lang.String r7 = r2.customWxId
            java.lang.String r8 = r2.avatarUrl
            java.lang.String r9 = r2.avatarBackupUrl
            java.lang.String r10 = r2.encryptedUsername
            java.lang.String r11 = r2.province
            java.lang.String r12 = r2.city
            int r13 = r2.gender
            int r14 = r2.type
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.add(r3)
            goto L11
        L3c:
            return r1
    }

    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getFriendListInfo() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r6.rawFriendList()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()
            h.Hchat.hooks.api.model.WeChatContact r2 = (h.Hchat.hooks.api.model.WeChatContact) r2
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r4 = "wxid"
            java.lang.String r5 = r2.wxId
            r3.put(r4, r5)
            java.lang.String r4 = "nickname"
            java.lang.String r5 = r2.nickname
            r3.put(r4, r5)
            java.lang.String r4 = "remarkName"
            java.lang.String r5 = r2.remarkName
            r3.put(r4, r5)
            java.lang.String r4 = "displayName"
            java.lang.String r5 = r2.displayName()
            r3.put(r4, r5)
            java.lang.String r4 = "customWxId"
            java.lang.String r5 = r2.customWxId
            r3.put(r4, r5)
            int r4 = r2.gender
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "gender"
            r3.put(r5, r4)
            java.lang.String r4 = "province"
            java.lang.String r5 = r2.province
            r3.put(r4, r5)
            java.lang.String r4 = "city"
            java.lang.String r5 = r2.city
            r3.put(r4, r5)
            java.lang.String r4 = "region"
            java.lang.String r5 = r2.getRegion()
            r3.put(r4, r5)
            java.lang.String r4 = "avatarUrl"
            java.lang.String r5 = r2.avatarUrl
            r3.put(r4, r5)
            java.lang.String r4 = "avatarBackupUrl"
            java.lang.String r5 = r2.avatarBackupUrl
            r3.put(r4, r5)
            int r2 = r2.type
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "type"
            r3.put(r4, r2)
            r0.add(r3)
            goto Ld
        L82:
            return r0
    }

    public final java.lang.String getFriendName(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L2f
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L9
            goto L2f
        L9:
            g8.i r0 = wb.en.c()
            r1 = 0
            if (r0 == 0) goto L15
            h.Hchat.hooks.api.model.WeChatContact r0 = r0.n(r5)
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L1b
            java.lang.String r2 = r0.remarkName
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r0 == 0) goto L21
            java.lang.String r3 = r0.nickname
            goto L22
        L21:
            r3 = r1
        L22:
            if (r0 == 0) goto L26
            java.lang.String r1 = r0.customWxId
        L26:
            java.lang.String[] r5 = new java.lang.String[]{r2, r3, r1, r5}
            java.lang.String r5 = r4.firstNotBlank(r5)
            return r5
        L2f:
            java.lang.String r5 = ""
            return r5
    }

    public final java.lang.String getFriendName(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 == 0) goto L29
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto Lb
            goto L29
        Lb:
            if (r4 == 0) goto L18
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto L14
            goto L18
        L14:
            java.lang.String r0 = r2.getFriendDisplayName(r3, r4)
        L18:
            java.lang.String r4 = r2.getFriendRemarkName(r3)
            java.lang.String r1 = r2.getFriendNickName(r3)
            java.lang.String[] r3 = new java.lang.String[]{r0, r4, r1, r3}
            java.lang.String r3 = r2.firstNotBlank(r3)
            return r3
        L29:
            return r0
    }

    public final java.lang.String getFriendNickName(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 == 0) goto L1f
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto Lb
            goto L1f
        Lb:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L1a
            h.Hchat.hooks.api.model.WeChatContact r3 = r1.n(r3)
            if (r3 == 0) goto L1a
            java.lang.String r3 = r3.nickname
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 != 0) goto L1e
            return r0
        L1e:
            return r3
        L1f:
            return r0
    }

    public final java.lang.String getFriendProvince(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ""
            if (r4 == 0) goto L34
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto Lb
            goto L34
        Lb:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L2f
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L19
        L17:
            r4 = r0
            goto L30
        L19:
            boolean r2 = r1.L(r4)
            if (r2 == 0) goto L26
            r4 = 12293(0x3005, float:1.7226E-41)
            java.lang.String r4 = r1.Y(r4)
            goto L30
        L26:
            h.Hchat.hooks.api.model.WeChatContact r4 = r1.n(r4)
            if (r4 == 0) goto L17
            java.lang.String r4 = r4.province
            goto L30
        L2f:
            r4 = 0
        L30:
            if (r4 != 0) goto L33
            return r0
        L33:
            return r4
        L34:
            return r0
    }

    public final java.lang.String getFriendRegion(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 == 0) goto L1b
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto Lb
            goto L1b
        Lb:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L16
            java.lang.String r3 = r1.z(r3)
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 != 0) goto L1a
            return r0
        L1a:
            return r3
        L1b:
            return r0
    }

    public final java.lang.String getFriendRemarkName(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 == 0) goto L1f
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto Lb
            goto L1f
        Lb:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L1a
            h.Hchat.hooks.api.model.WeChatContact r3 = r1.n(r3)
            if (r3 == 0) goto L1a
            java.lang.String r3 = r3.remarkName
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 != 0) goto L1e
            return r0
        L1e:
            return r3
        L1f:
            return r0
    }

    public final java.util.List<me.hd.wauxv.data.bean.info.GroupInfo> getGroupList() {
            r15 = this;
            java.util.Map r0 = r15.rawGroupContactMap()
            java.util.List r1 = r15.rawGroupList()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r1.next()
            h.Hchat.hooks.api.model.WeChatChatroom r3 = (h.Hchat.hooks.api.model.WeChatChatroom) r3
            java.lang.String r4 = r3.chatroomId
            java.lang.Object r4 = r0.get(r4)
            h.Hchat.hooks.api.model.WeChatContact r4 = (h.Hchat.hooks.api.model.WeChatContact) r4
            java.lang.String r5 = r3.name
            r6 = 0
            if (r4 == 0) goto L31
            java.lang.String r7 = r4.nickname
            goto L32
        L31:
            r7 = r6
        L32:
            java.lang.String r8 = r3.chatroomId
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8}
            java.lang.String r9 = r15.firstNotBlank(r5)
            me.hd.wauxv.data.bean.info.GroupInfo r7 = new me.hd.wauxv.data.bean.info.GroupInfo
            java.lang.String r8 = r3.chatroomId
            if (r4 == 0) goto L45
            java.lang.String r5 = r4.nickname
            goto L46
        L45:
            r5 = r6
        L46:
            java.lang.String[] r5 = new java.lang.String[]{r5, r9}
            java.lang.String r10 = r15.firstNotBlank(r5)
            if (r4 == 0) goto L52
            java.lang.String r6 = r4.remarkName
        L52:
            if (r6 != 0) goto L56
            java.lang.String r6 = ""
        L56:
            r11 = r6
            java.lang.String r12 = r3.owner
            java.util.List<java.lang.String> r13 = r3.memberIds
            java.lang.String r14 = r3.rawDisplayNames
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r2.add(r7)
            goto L15
        L64:
            return r2
    }

    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getGroupListInfo() {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r1 = r11.rawGroupContactMap()
            java.util.List r2 = r11.rawGroupList()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r2.next()
            h.Hchat.hooks.api.model.WeChatChatroom r3 = (h.Hchat.hooks.api.model.WeChatChatroom) r3
            java.lang.String r4 = r3.chatroomId
            java.lang.Object r4 = r1.get(r4)
            h.Hchat.hooks.api.model.WeChatContact r4 = (h.Hchat.hooks.api.model.WeChatContact) r4
            java.lang.String r5 = r3.name
            r6 = 0
            if (r4 == 0) goto L2d
            java.lang.String r7 = r4.nickname
            goto L2e
        L2d:
            r7 = r6
        L2e:
            java.lang.String r8 = r3.chatroomId
            java.lang.String[] r5 = new java.lang.String[]{r5, r7, r8}
            java.lang.String r5 = r11.firstNotBlank(r5)
            if (r4 == 0) goto L3d
            java.lang.String r7 = r4.remarkName
            goto L3e
        L3d:
            r7 = r6
        L3e:
            if (r7 != 0) goto L42
            java.lang.String r7 = ""
        L42:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.lang.String r9 = "roomId"
            java.lang.String r10 = r3.chatroomId
            r8.put(r9, r10)
            java.lang.String r9 = "name"
            r8.put(r9, r5)
            if (r4 == 0) goto L57
            java.lang.String r6 = r4.nickname
        L57:
            java.lang.String[] r4 = new java.lang.String[]{r6, r5}
            java.lang.String r4 = r11.firstNotBlank(r4)
            java.lang.String r6 = "nickname"
            r8.put(r6, r4)
            java.lang.String r4 = "remarkName"
            r8.put(r4, r7)
            java.lang.String r4 = r3.chatroomId
            java.lang.String r4 = r11.groupDisplayName(r4, r5, r7)
            java.lang.String r5 = "displayName"
            r8.put(r5, r4)
            java.lang.String r4 = "owner"
            java.lang.String r5 = r3.owner
            r8.put(r4, r5)
            int r4 = r3.memberCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "memberCount"
            r8.put(r5, r4)
            java.lang.String r4 = "memberList"
            java.util.List<java.lang.String> r5 = r3.memberIds
            r8.put(r4, r5)
            java.lang.String r4 = "rawDisplayNames"
            java.lang.String r3 = r3.rawDisplayNames
            r8.put(r4, r3)
            r0.add(r8)
            goto L11
        L9b:
            return r0
    }

    public final java.lang.String getGroupMemberCity(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto L17
            boolean r1 = og.m.t0(r1)
            if (r1 == 0) goto L9
            goto L17
        L9:
            if (r2 == 0) goto L17
            boolean r1 = og.m.t0(r2)
            if (r1 == 0) goto L12
            goto L17
        L12:
            java.lang.String r1 = r0.getFriendCity(r2)
            return r1
        L17:
            java.lang.String r1 = ""
            return r1
    }

    public final int getGroupMemberCount(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L21
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L9
            goto L21
        L9:
            g8.d r0 = j8.b.f()
            if (r0 == 0) goto L18
            java.util.List r2 = r0.i(r2)
            int r2 = r2.size()
            return r2
        L18:
            java.util.List r2 = r1.getGroupMemberList(r2)
            int r2 = r2.size()
            return r2
        L21:
            r2 = 0
            return r2
    }

    public final int getGroupMemberGender(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto L17
            boolean r1 = og.m.t0(r1)
            if (r1 == 0) goto L9
            goto L17
        L9:
            if (r2 == 0) goto L17
            boolean r1 = og.m.t0(r2)
            if (r1 == 0) goto L12
            goto L17
        L12:
            int r1 = r0.getFriendGender(r2)
            return r1
        L17:
            r1 = 0
            return r1
    }

    public final java.util.List<java.lang.String> getGroupMemberList(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L9
            goto Lf
        L9:
            r0 = 1
            java.util.List r2 = r1.readGroupMemberIds(r2, r0)
            return r2
        Lf:
            tf.t r2 = tf.t.f13167g
            return r2
    }

    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getGroupMemberListInfo(java.lang.String r15) {
            r14 = this;
            if (r15 == 0) goto L15a
            boolean r0 = og.m.t0(r15)
            if (r0 == 0) goto La
            goto L15a
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            g8.i r1 = wb.en.c()
            g8.d r2 = j8.b.f()
            r3 = 1
            java.util.List r3 = r14.readGroupMemberIds(r15, r3)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L24
            goto L159
        L24:
            r4 = 0
            if (r1 == 0) goto L4f
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            boolean r6 = g8.i.I(r15)
            if (r6 != 0) goto L33
            goto L50
        L33:
            java.util.ArrayList r6 = r1.u(r15)
            java.util.Iterator r6 = r6.iterator()
        L3b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L50
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r1.t(r15, r7)
            r5.put(r7, r8)
            goto L3b
        L4f:
            r5 = r4
        L50:
            tf.u r6 = tf.u.f13168g
            if (r5 != 0) goto L55
            r5 = r6
        L55:
            if (r1 == 0) goto L5c
            java.util.LinkedHashMap r7 = r1.w(r15)
            goto L5d
        L5c:
            r7 = r4
        L5d:
            if (r7 != 0) goto L60
            goto L61
        L60:
            r6 = r7
        L61:
            java.util.Iterator r3 = r3.iterator()
        L65:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L159
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r1 == 0) goto L78
            h.Hchat.hooks.api.model.WeChatContact r8 = r1.n(r7)
            goto L79
        L78:
            r8 = r4
        L79:
            boolean r9 = r6.containsKey(r7)
            java.lang.String r10 = ""
            if (r9 == 0) goto L8b
            java.lang.Object r9 = r6.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L94
        L89:
            r9 = r10
            goto L94
        L8b:
            eb.d r9 = eb.d.f2520a
            java.lang.String r9 = eb.d.b(r15, r7)
            if (r9 != 0) goto L94
            goto L89
        L94:
            java.lang.Object r11 = r5.get(r7)
            java.lang.String r11 = (java.lang.String) r11
            if (r2 == 0) goto La1
            java.lang.String r12 = r2.h(r15, r7)
            goto La2
        La1:
            r12 = r4
        La2:
            if (r1 == 0) goto La9
            java.lang.String r13 = r1.t(r15, r7)
            goto Laa
        La9:
            r13 = r4
        Laa:
            java.lang.String[] r11 = new java.lang.String[]{r9, r11, r12, r13}
            java.lang.String r11 = r14.firstNotBlank(r11)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.lang.String r13 = "wxid"
            r12.put(r13, r7)
            if (r8 == 0) goto Lc3
            java.lang.String r13 = r8.displayName()
            goto Lc4
        Lc3:
            r13 = r4
        Lc4:
            java.lang.String[] r7 = new java.lang.String[]{r11, r13, r7}
            java.lang.String r7 = r14.firstNotBlank(r7)
            java.lang.String r13 = "displayName"
            r12.put(r13, r7)
            java.lang.String r7 = "groupNick"
            r12.put(r7, r11)
            java.lang.String r7 = "groupNickName"
            r12.put(r7, r11)
            java.lang.String r7 = "rawGroupNickName"
            r12.put(r7, r9)
            if (r8 == 0) goto Le5
            java.lang.String r7 = r8.nickname
            goto Le6
        Le5:
            r7 = r4
        Le6:
            if (r7 != 0) goto Le9
            r7 = r10
        Le9:
            java.lang.String r9 = "nickname"
            r12.put(r9, r7)
            if (r8 == 0) goto Lf3
            java.lang.String r7 = r8.remarkName
            goto Lf4
        Lf3:
            r7 = r4
        Lf4:
            if (r7 != 0) goto Lf7
            r7 = r10
        Lf7:
            java.lang.String r9 = "remarkName"
            r12.put(r9, r7)
            if (r8 == 0) goto L101
            java.lang.String r7 = r8.customWxId
            goto L102
        L101:
            r7 = r4
        L102:
            if (r7 != 0) goto L105
            r7 = r10
        L105:
            java.lang.String r9 = "customWxId"
            r12.put(r9, r7)
            if (r8 == 0) goto L10f
            int r7 = r8.gender
            goto L110
        L10f:
            r7 = 0
        L110:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r9 = "gender"
            r12.put(r9, r7)
            if (r8 == 0) goto L11e
            java.lang.String r7 = r8.province
            goto L11f
        L11e:
            r7 = r4
        L11f:
            if (r7 != 0) goto L122
            r7 = r10
        L122:
            java.lang.String r9 = "province"
            r12.put(r9, r7)
            if (r8 == 0) goto L12c
            java.lang.String r7 = r8.city
            goto L12d
        L12c:
            r7 = r4
        L12d:
            if (r7 != 0) goto L130
            r7 = r10
        L130:
            java.lang.String r9 = "city"
            r12.put(r9, r7)
            if (r8 == 0) goto L13c
            java.lang.String r7 = r8.getRegion()
            goto L13d
        L13c:
            r7 = r4
        L13d:
            if (r7 != 0) goto L140
            r7 = r10
        L140:
            java.lang.String r9 = "region"
            r12.put(r9, r7)
            if (r8 == 0) goto L14a
            java.lang.String r7 = r8.avatarUrl
            goto L14b
        L14a:
            r7 = r4
        L14b:
            if (r7 != 0) goto L14e
            goto L14f
        L14e:
            r10 = r7
        L14f:
            java.lang.String r7 = "avatarUrl"
            r12.put(r7, r10)
            r0.add(r12)
            goto L65
        L159:
            return r0
        L15a:
            tf.t r15 = tf.t.f13167g
            return r15
    }

    public final java.lang.String getGroupMemberName(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            if (r9 == 0) goto L52
            boolean r0 = og.m.t0(r9)
            if (r0 == 0) goto L9
            goto L52
        L9:
            if (r10 == 0) goto L52
            boolean r0 = og.m.t0(r10)
            if (r0 == 0) goto L12
            goto L52
        L12:
            g8.d r0 = j8.b.f()
            r1 = 0
            if (r0 == 0) goto L25
            g8.i r0 = r0.f4349b
            if (r0 != 0) goto L1f
            r0 = r10
            goto L23
        L1f:
            java.lang.String r0 = r0.v(r9, r10)
        L23:
            r2 = r0
            goto L26
        L25:
            r2 = r1
        L26:
            eb.d r0 = eb.d.f2520a
            java.lang.String r3 = eb.d.b(r9, r10)
            g8.d r0 = j8.b.f()
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.h(r9, r10)
            r4 = r0
            goto L39
        L38:
            r4 = r1
        L39:
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L43
            java.lang.String r1 = r0.t(r9, r10)
        L43:
            r5 = r1
            java.lang.String r6 = r8.getFriendName(r10)
            r7 = r10
            java.lang.String[] r9 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            java.lang.String r9 = r8.firstNotBlank(r9)
            return r9
        L52:
            java.lang.String r9 = ""
            return r9
    }

    public final java.lang.String getGroupMemberProvince(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto L17
            boolean r1 = og.m.t0(r1)
            if (r1 == 0) goto L9
            goto L17
        L9:
            if (r2 == 0) goto L17
            boolean r1 = og.m.t0(r2)
            if (r1 == 0) goto L12
            goto L17
        L12:
            java.lang.String r1 = r0.getFriendProvince(r2)
            return r1
        L17:
            java.lang.String r1 = ""
            return r1
    }

    public final java.lang.String getGroupMemberRegion(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto L17
            boolean r1 = og.m.t0(r1)
            if (r1 == 0) goto L9
            goto L17
        L9:
            if (r2 == 0) goto L17
            boolean r1 = og.m.t0(r2)
            if (r1 == 0) goto L12
            goto L17
        L12:
            java.lang.String r1 = r0.getFriendRegion(r2)
            return r1
        L17:
            java.lang.String r1 = ""
            return r1
    }

    public final java.lang.String getGroupName(java.lang.String r4) {
            r3 = this;
            if (r4 == 0) goto L29
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L9
            goto L29
        L9:
            g8.d r0 = j8.b.f()
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.f(r4)
            goto L16
        L15:
            r0 = r1
        L16:
            g8.i r2 = wb.en.c()
            if (r2 == 0) goto L20
            java.lang.String r1 = r2.r(r4)
        L20:
            java.lang.String[] r4 = new java.lang.String[]{r0, r1, r4}
            java.lang.String r4 = r3.firstNotBlank(r4)
            return r4
        L29:
            java.lang.String r4 = ""
            return r4
    }

    public final java.lang.String getGroupNickName(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L3c
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            goto L3c
        L9:
            if (r4 == 0) goto L3c
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L12
            goto L3c
        L12:
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L1d
            java.util.LinkedHashMap r0 = r0.w(r3)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 != 0) goto L22
            tf.u r0 = tf.u.f13168g
        L22:
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto L32
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L31
            goto L3c
        L31:
            return r3
        L32:
            eb.d r0 = eb.d.f2520a
            java.lang.String r3 = eb.d.b(r3, r4)
            if (r3 != 0) goto L3b
            goto L3c
        L3b:
            return r3
        L3c:
            java.lang.String r3 = ""
            return r3
    }

    public final java.lang.String getGroupRemarkName(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ""
            if (r3 == 0) goto L1f
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto Lb
            goto L1f
        Lb:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L1a
            h.Hchat.hooks.api.model.WeChatContact r3 = r1.n(r3)
            if (r3 == 0) goto L1a
            java.lang.String r3 = r3.remarkName
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 != 0) goto L1e
            return r0
        L1e:
            return r3
        L1f:
            return r0
    }

    public final java.lang.String getLoginAlias() {
            r2 = this;
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r0.getClass()
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.a()
            if (r0 == 0) goto L14
            r1 = 42
            java.lang.String r0 = r0.b(r1)
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L19
            java.lang.String r0 = ""
        L19:
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L23
            java.lang.String r0 = r2.getLoginWxid()
        L23:
            return r0
    }

    public final java.lang.String getLoginWxid() {
            r4 = this;
            r0 = 0
        L1:
            java.lang.String r1 = ""
            r2 = 5
            if (r0 >= r2) goto L3a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r2 = r2.intValue()
            i8.a r3 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r3.getClass()
            g8.a r3 = h.Hchat.hooks.api.core.WeChatApis.a()
            if (r3 == 0) goto L20
            java.lang.String r3 = r3.c()
            goto L21
        L20:
            r3 = 0
        L21:
            if (r3 != 0) goto L24
            goto L25
        L24:
            r1 = r3
        L25:
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            if (r3 <= 0) goto L34
            return r1
        L34:
            r4.waitForContactData(r2)
            int r0 = r0 + 1
            goto L1
        L3a:
            return r1
    }

    public final java.util.List<h.Hchat.hooks.api.model.WeChatContact> getOfficialList() {
            r3 = this;
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto Le
            java.lang.String r1 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"
            r2 = 0
            java.util.ArrayList r0 = r0.U(r1, r2)
            return r0
        Le:
            tf.t r0 = tf.t.f13167g
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatSnsPost getSnsPost(java.lang.String r4) {
            r3 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto L35
            if (r4 != 0) goto Lb
            java.lang.String r4 = ""
        Lb:
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            int r2 = r4.length()
            if (r2 != 0) goto L1a
            goto L35
        L1a:
            p8.h r2 = r0.g()
            if (r2 == 0) goto L35
            p8.f r4 = r2.g(r4)
            java.lang.Object r4 = r4.f10353b
            if (r4 == 0) goto L2d
            p8.g r4 = p8.h.j(r4, r1)
            goto L2e
        L2d:
            r4 = r1
        L2e:
            if (r4 == 0) goto L35
            h.Hchat.hooks.api.model.WeChatSnsPost r4 = r0.o(r4)
            return r4
        L35:
            return r1
    }

    public final java.util.List<h.Hchat.hooks.api.model.WeChatSnsPost> getSnsPostList() {
            r1 = this;
            r0 = 50
            java.util.List r0 = r1.getSnsPostList(r0)
            return r0
    }

    public final java.util.List<h.Hchat.hooks.api.model.WeChatSnsPost> getSnsPostList(int r6) {
            r5 = this;
            p8.d0 r0 = bc.e.q()
            tf.t r1 = tf.t.f13167g
            if (r0 == 0) goto L4a
            p8.h r2 = r0.g()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L14
            java.util.List r4 = r2.h(r4, r6, r3)
        L14:
            if (r4 != 0) goto L17
            goto L18
        L17:
            r1 = r4
        L18:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r1.next()
            p8.g r4 = (p8.g) r4
            h.Hchat.hooks.api.model.WeChatSnsPost r4 = r0.o(r4)
            if (r4 == 0) goto L21
            r2.add(r4)
            goto L21
        L37:
            a9.h r0 = new a9.h
            r1 = 25
            r0.<init>(r1)
            java.util.List r0 = tf.m.K1(r2, r0)
            if (r6 >= 0) goto L45
            r6 = r3
        L45:
            java.util.List r6 = tf.m.L1(r6, r0)
            return r6
        L4a:
            return r1
    }

    public final java.util.List<h.Hchat.hooks.api.model.WeChatSnsPost> getSnsPostList(java.lang.String r5, int r6) {
            r4 = this;
            p8.d0 r0 = bc.e.q()
            tf.t r1 = tf.t.f13167g
            if (r0 == 0) goto L67
            if (r5 != 0) goto Lc
            java.lang.String r5 = ""
        Lc:
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            int r2 = r5.length()
            if (r2 != 0) goto L1b
            goto L67
        L1b:
            if (r6 > 0) goto L1e
            goto L67
        L1e:
            p8.h r2 = r0.g()
            if (r2 == 0) goto L33
            g8.a r3 = r0.f10333f
            java.lang.String r3 = r3.c()
            boolean r3 = r5.equals(r3)
            java.util.List r5 = r2.h(r5, r6, r3)
            goto L34
        L33:
            r5 = 0
        L34:
            if (r5 != 0) goto L37
            goto L38
        L37:
            r1 = r5
        L38:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L41:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            p8.g r2 = (p8.g) r2
            h.Hchat.hooks.api.model.WeChatSnsPost r2 = r0.o(r2)
            if (r2 == 0) goto L41
            r5.add(r2)
            goto L41
        L57:
            a9.h r0 = new a9.h
            r1 = 26
            r0.<init>(r1)
            java.util.List r5 = tf.m.K1(r5, r0)
            java.util.List r5 = tf.m.L1(r6, r5)
            return r5
        L67:
            return r1
    }

    public final java.lang.String getTargetTalker() {
            r7 = this;
            i8.b r0 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r0.getClass()
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.b()
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.String r0 = r0.a()
            if (r0 == 0) goto L29
            boolean r2 = og.m.t0(r0)
            r2 = r2 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L25
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 == 0) goto L29
            return r0
        L29:
            android.app.Activity r0 = r7.getTopActivity()
            java.lang.String r2 = ""
            if (r0 == 0) goto L80
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L80
            java.lang.String r3 = "Contact_User"
            java.lang.String r4 = "Contact_Username"
            java.lang.String r5 = "Chat_User"
            java.lang.String r6 = "Chat_UserName"
            java.lang.String[] r3 = new java.lang.String[]{r5, r6, r3, r4}
            java.util.List r3 = a.a.y0(r3)
            java.util.Iterator r3 = r3.iterator()
        L4b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r0.getStringExtra(r4)
            if (r4 == 0) goto L78
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L78
            boolean r5 = og.m.t0(r4)
            r5 = r5 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L78
            goto L79
        L78:
            r4 = r1
        L79:
            if (r4 == 0) goto L4b
            r1 = r4
        L7c:
            if (r1 != 0) goto L7f
            return r2
        L7f:
            return r1
        L80:
            return r2
    }

    public final android.app.Activity getTopActivity() {
            r1 = this;
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto Lb
            android.app.Activity r0 = r0.a()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final int getUnreadCount(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto Lb
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            goto Lc
        Lb:
            r5 = 0
        Lc:
            if (r5 != 0) goto L10
            java.lang.String r5 = ""
        L10:
            int r0 = r5.length()
            r1 = 0
            if (r0 != 0) goto L18
            goto L3e
        L18:
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()
            r0.getClass()
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.f()
            if (r0 == 0) goto L3e
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L3e
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r0.f5135a
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r2 = "unReadCount"
            java.lang.String r3 = "SELECT unReadCount FROM rconversation WHERE username=? LIMIT 1"
            java.lang.String r5 = r0.queryFirstString(r3, r5, r2)
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L3e
            return r5
        L3e:
            return r1
    }

    public final long insertSystemMsg(java.lang.String r10, java.lang.String r11, long r12) {
            r9 = this;
            r1 = 0
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()     // Catch: java.lang.Throwable -> L18
            r0.getClass()     // Catch: java.lang.Throwable -> L18
            k8.e r3 = h.Hchat.hooks.api.core.WeChatApis.h()     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1b
            r8 = 1
            r4 = r10
            r5 = r11
            r6 = r12
            long r10 = r3.e(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r0 = move-exception
            r10 = r0
            goto L21
        L1b:
            r10 = r1
        L1c:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L18
            goto L27
        L21:
            sf.f r11 = new sf.f
            r11.<init>(r10)
            r10 = r11
        L27:
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            boolean r12 = r10 instanceof sf.f
            if (r12 == 0) goto L30
            r10 = r11
        L30:
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            return r10
    }

    public final boolean inviteChatroomMember(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2d
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto La
            goto L2d
        La:
            if (r5 == 0) goto L2d
            boolean r1 = og.m.t0(r5)
            if (r1 == 0) goto L13
            goto L2d
        L13:
            g8.d r1 = j8.b.f()
            if (r1 == 0) goto L2d
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L21
            r4 = r0
            goto L29
        L21:
            java.util.List r5 = java.util.Collections.singletonList(r5)
            boolean r4 = r1.m(r4, r5)
        L29:
            r5 = 1
            if (r4 != r5) goto L2d
            return r5
        L2d:
            return r0
    }

    public final boolean inviteChatroomMember(java.lang.String r3, java.util.List<java.lang.String> r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L21
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto La
            goto L21
        La:
            if (r4 == 0) goto L21
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L13
            goto L21
        L13:
            g8.d r1 = j8.b.f()
            if (r1 == 0) goto L21
            boolean r3 = r1.m(r3, r4)
            r4 = 1
            if (r3 != r4) goto L21
            return r4
        L21:
            return r0
    }

    public final boolean modifyContactLabelList(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L18
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto La
            goto L18
        La:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L18
            boolean r3 = r1.O(r3, r4)
            r4 = 1
            if (r3 != r4) goto L18
            return r4
        L18:
            return r0
    }

    public final boolean modifyContactLabelList(java.lang.String r3, java.util.List<java.lang.String> r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L18
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto La
            goto L18
        La:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L18
            boolean r3 = r1.P(r3, r4)
            r4 = 1
            if (r3 != r4) goto L18
            return r4
        L18:
            return r0
    }

    public final void notify(java.lang.String r14, java.lang.String r15) {
            r13 = this;
            i8.b r0 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r0.getClass()
            q8.r r0 = h.Hchat.hooks.api.core.WeChatApis.n()
            if (r0 == 0) goto Le8
            java.lang.String r1 = ""
            if (r14 != 0) goto L12
            r14 = r1
        L12:
            if (r15 != 0) goto L15
            r15 = r1
        L15:
            java.lang.String r1 = "Hchat_wechat_api_notify_high"
            android.content.Context r2 = r0.f10735a
            java.lang.String r3 = "notification"
            java.lang.Object r3 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> La5
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3     // Catch: java.lang.Throwable -> La5
            if (r3 != 0) goto L25
            goto Le8
        L25:
            android.app.NotificationChannel r4 = new android.app.NotificationChannel     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = "Hchat 通知"
            r6 = 4
            r4.<init>(r1, r5, r6)     // Catch: java.lang.Throwable -> La5
            r3.createNotificationChannel(r4)     // Catch: java.lang.Throwable -> La5
            android.content.pm.ApplicationInfo r4 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> La5
            int r4 = r4.icon     // Catch: java.lang.Throwable -> La5
            if (r4 != 0) goto L3b
            r4 = 17301659(0x108009b, float:2.497969E-38)
        L3b:
            android.app.Notification$Builder r5 = new android.app.Notification$Builder     // Catch: java.lang.Throwable -> La5
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> La5
            android.app.Notification$Builder r1 = r5.setSmallIcon(r4)     // Catch: java.lang.Throwable -> La5
            android.app.Notification$Builder r14 = r1.setContentTitle(r14)     // Catch: java.lang.Throwable -> La5
            android.app.Notification$Builder r14 = r14.setContentText(r15)     // Catch: java.lang.Throwable -> La5
            android.app.Notification$Builder r14 = r14.setTicker(r15)     // Catch: java.lang.Throwable -> La5
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La5
            android.app.Notification$Builder r14 = r14.setWhen(r7)     // Catch: java.lang.Throwable -> La5
            r15 = 1
            android.app.Notification$Builder r14 = r14.setShowWhen(r15)     // Catch: java.lang.Throwable -> La5
            android.app.Notification$Builder r14 = r14.setAutoCancel(r15)     // Catch: java.lang.Throwable -> La5
            android.app.Notification$Builder r14 = r14.setPriority(r15)     // Catch: java.lang.Throwable -> La5
            r1 = -1
            r14.setDefaults(r1)     // Catch: java.lang.Throwable -> La5
            r14 = 0
            android.content.Intent[] r1 = r0.a(r14)     // Catch: java.lang.Throwable -> La5
            r4 = 0
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L9e
            int r9 = r1.length     // Catch: java.lang.Throwable -> La5
            if (r9 != 0) goto L78
            goto L9e
        L78:
            boolean r9 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> La5
            if (r9 == 0) goto L9d
            boolean r9 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> La5
            if (r9 == 0) goto L9c
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La5
            r11 = 1048575(0xfffff, double:5.18065E-318)
            long r9 = r9 & r11
            long r9 = r9 << r15
            r11 = 1308622848(0x4e000000, double:6.465455926E-315)
            long r9 = r9 | r11
            long r11 = (long) r4     // Catch: java.lang.Throwable -> La5
            long r9 = r9 | r11
            long r9 = r9 & r7
            int r15 = (int) r9     // Catch: java.lang.Throwable -> La5
            r9 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r15 = android.app.PendingIntent.getActivities(r2, r15, r1, r9)     // Catch: java.lang.Throwable -> La5
            goto L9f
        L9c:
            throw r14     // Catch: java.lang.Throwable -> La5
        L9d:
            throw r14     // Catch: java.lang.Throwable -> La5
        L9e:
            r15 = r14
        L9f:
            if (r15 == 0) goto La7
            r5.setContentIntent(r15)     // Catch: java.lang.Throwable -> La5
            goto La7
        La5:
            r14 = move-exception
            goto Ld3
        La7:
            android.graphics.Bitmap r15 = d9.o.f(r2, r14)     // Catch: java.lang.Throwable -> La5
            if (r15 == 0) goto Lb0
            r5.setLargeIcon(r15)     // Catch: java.lang.Throwable -> La5
        Lb0:
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> La5
            if (r15 == 0) goto Ld2
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La5
            r1 = 65535(0xffff, double:3.23786E-319)
            long r14 = r14 & r1
            long r14 = r14 << r6
            r1 = 1291845632(0x4d000000, double:6.382565465E-315)
            long r14 = r14 | r1
            long r1 = (long) r4     // Catch: java.lang.Throwable -> La5
            r9 = 15
            long r1 = r1 & r9
            long r14 = r14 | r1
            long r14 = r14 & r7
            int r14 = (int) r14     // Catch: java.lang.Throwable -> La5
            android.app.Notification r15 = r5.build()     // Catch: java.lang.Throwable -> La5
            r3.notify(r14, r15)     // Catch: java.lang.Throwable -> La5
            return
        Ld2:
            throw r14     // Catch: java.lang.Throwable -> La5
        Ld3:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "通知失败: "
            r15.<init>(r1)
            java.lang.String r14 = r14.getMessage()
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            r0.b(r14)
        Le8:
            return
    }

    public final void post(java.lang.String r9, java.util.Map<?, ?> r10, java.util.Map<?, ?> r11, long r12, java.util.function.Consumer<java.lang.String> r14) {
            r8 = this;
            eb.q0 r0 = new eb.q0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.async(r0)
            return
    }

    public final void post(java.lang.String r8, java.util.Map<?, ?> r9, java.util.Map<?, ?> r10, java.util.function.Consumer<java.lang.String> r11) {
            r7 = this;
            r4 = 30
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r0.post(r1, r2, r3, r4, r6)
            return
    }

    public final boolean publishSnsPost(java.lang.Object r8) {
            r7 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto Lb1
            boolean r2 = r8 instanceof h.Hchat.hooks.api.model.WeChatSnsPrepareResult
            if (r2 == 0) goto Le
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r8 = (h.Hchat.hooks.api.model.WeChatSnsPrepareResult) r8
            goto Lf
        Le:
            r8 = 0
        Lf:
            r2 = 1
            if (r8 == 0) goto L6f
            boolean r3 = r8.isSuccess()
            if (r3 != r2) goto L6f
            java.lang.String r3 = r8.getType()
            int r4 = r3.hashCode()
            java.lang.String r5 = ""
            switch(r4) {
                case 3556653: goto L9d;
                case 100313435: goto L87;
                case 112202875: goto L71;
                case 1210380575: goto L27;
                default: goto L25;
            }
        L25:
            goto La5
        L27:
            java.lang.String r4 = "live_photo"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L31
            goto La5
        L31:
            java.util.List r3 = r8.getLivePhotoList()
            java.lang.Object r3 = tf.m.I1(r3)
            h.Hchat.hooks.api.model.WeChatSnsLivePhoto r3 = (h.Hchat.hooks.api.model.WeChatSnsLivePhoto) r3
            if (r3 == 0) goto L6f
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "content"
            java.lang.String r8 = r8.getContent()
            org.json.JSONObject r8 = r4.put(r5, r8)
            java.lang.String r4 = "imagePath"
            java.lang.String r5 = r3.getImagePath()
            org.json.JSONObject r8 = r8.put(r4, r5)
            java.lang.String r4 = "videoPath"
            java.lang.String r5 = r3.getVideoPath()
            org.json.JSONObject r8 = r8.put(r4, r5)
            java.lang.String r4 = "coverTimeMs"
            long r5 = r3.getCoverTimeMillis()
            org.json.JSONObject r8 = r8.put(r4, r5)
            boolean r8 = r0.w(r8)
            goto Lae
        L6f:
            r8 = r1
            goto Lae
        L71:
            java.lang.String r4 = "video"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L7a
            goto La5
        L7a:
            java.lang.String r3 = r8.getContent()
            java.lang.String r8 = r8.getVideoPath()
            boolean r8 = r0.y(r3, r8, r5, r5)
            goto Lae
        L87:
            java.lang.String r4 = "image"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L90
            goto La5
        L90:
            java.lang.String r3 = r8.getContent()
            java.util.List r8 = r8.getImagePathList()
            boolean r8 = r0.x(r3, r8, r5, r5)
            goto Lae
        L9d:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La6
        La5:
            goto L6f
        La6:
            java.lang.String r8 = r8.getContent()
            boolean r8 = r0.u(r8, r5, r5)
        Lae:
            if (r8 != r2) goto Lb1
            return r2
        Lb1:
            return r1
    }

    public final java.util.List<me.hd.wauxv.data.bean.MsgInfoBean> queryHistoryMsg(java.lang.String r5, long r6, int r8) {
            r4 = this;
            if (r5 == 0) goto Lb6
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto La
            goto Lb6
        La:
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()
            r0.getClass()
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.m()
            if (r0 == 0) goto Lb6
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L23
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L90
        L23:
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L2e
            java.util.ArrayList r5 = r0.f(r8, r5)
            goto L90
        L2e:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L3a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L90
        L3a:
            r1 = 200(0xc8, float:2.8E-43)
            int r8 = java.lang.Math.min(r1, r8)
            r1 = 1
            int r8 = java.lang.Math.max(r1, r8)
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r0.f7469a
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L50
            java.lang.String r1 = ""
            goto L54
        L50:
            java.lang.String r1 = r1.messageTableForTalker(r5)
        L54:
            java.lang.String r1 = r0.m(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L7e
            java.lang.String r2 = "SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM "
            java.lang.String r3 = " WHERE createTime>? ORDER BY createTime ASC, msgId ASC LIMIT ?"
            java.lang.String r1 = eh.a.n(r2, r1, r3)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.ArrayList r1 = r0.l(r1, r2)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L7e
            r5 = r1
            goto L90
        L7e:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r8)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}
            java.lang.String r6 = "SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM message WHERE talker=? AND createTime>? ORDER BY createTime ASC, msgId ASC LIMIT ?"
            java.util.ArrayList r5 = r0.l(r6, r5)
        L90:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = tf.n.e1(r5)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L9d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lb5
            java.lang.Object r7 = r5.next()
            h.Hchat.hooks.api.model.WeChatMessage r7 = (h.Hchat.hooks.api.model.WeChatMessage) r7
            h.Hchat.hooks.items.script.ScriptMessageBean r8 = new h.Hchat.hooks.items.script.ScriptMessageBean
            r7.getClass()
            r8.<init>(r7)
            r6.add(r8)
            goto L9d
        Lb5:
            return r6
        Lb6:
            tf.t r5 = tf.t.f13167g
            return r5
    }

    public final boolean refreshSnsTimeline() {
            r3 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.s()
            r2 = 1
            if (r0 != r2) goto Lf
            return r2
        Lf:
            return r1
    }

    public final boolean revokeMsg(long r12) {
            r11 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 > 0) goto L9
            goto L1cd
        L9:
            k8.g r4 = p.a.q()
            if (r4 == 0) goto L1cd
            h.Hchat.dexkit.DexFinder r5 = r4.f7417a
            k8.s r6 = r4.f7421e
            if (r2 > 0) goto L1b
            java.lang.String r12 = "撤回消息失败: msgId无效"
            r4.o(r12)
            return r3
        L1b:
            boolean r2 = r6.h()
            if (r2 != 0) goto L27
            java.lang.String r12 = "撤回消息失败: messageStore未就绪"
            r4.o(r12)
            return r3
        L27:
            java.lang.reflect.Constructor<?> r2 = r5.revokeMsgCtor
            if (r2 == 0) goto L1c8
            h.Hchat.hooks.api.model.WeChatMessage r2 = r6.c(r12)
            if (r2 != 0) goto L35
            h.Hchat.hooks.api.model.WeChatMessage r2 = r6.d(r12)
        L35:
            if (r2 != 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "撤回消息失败: 未找到消息 msgId/msgSvrId="
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r4.o(r12)
            return r3
        L49:
            int r12 = r2.isSend
            long r7 = r2.msgId
            r13 = 1
            if (r12 == r13) goto L62
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "撤回消息失败: 只能撤回自己发送的消息 msgId="
            r12.<init>(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            r4.o(r12)
            return r3
        L62:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r12 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r12 == 0) goto L71
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r12 = h.Hchat.hooks.api.core.WeChatApis.database()
            java.lang.String r13 = r2.talker
            r12.messageTableForTalker(r13)
        L71:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r12 = h.Hchat.hooks.api.core.WeChatApis.database()
            r13 = 0
            if (r12 == 0) goto L81
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r12 = h.Hchat.hooks.api.core.WeChatApis.database()
            java.lang.Object r12 = r12.nativeMessageById(r7)
            goto L82
        L81:
            r12 = r13
        L82:
            if (r12 != 0) goto Lbf
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r12 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r12 != 0) goto L8c
        L8a:
            r12 = r13
            goto Lbf
        L8c:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r12 = h.Hchat.hooks.api.core.WeChatApis.database()
            long r9 = r2.msgId
            java.lang.Object r12 = r12.nativeMessageById(r9)
            if (r12 == 0) goto L99
            goto Lbf
        L99:
            long r9 = r2.msgSvrId
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 <= 0) goto L8a
            java.lang.String r12 = r2.talker
            h.Hchat.hooks.api.model.WeChatMessage r12 = r6.e(r9, r12)
            if (r12 == 0) goto L8a
            long r9 = r12.msgId
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8a
            long r0 = r2.msgId
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L8a
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()
            long r9 = r12.msgId
            java.lang.Object r12 = r0.nativeMessageById(r9)
            if (r12 == 0) goto L8a
        Lbf:
            if (r12 != 0) goto L1ac
            java.lang.reflect.Constructor<?> r12 = r5.localMessageCtor
            if (r12 != 0) goto Lc7
            goto L1ab
        Lc7:
            java.lang.Class[] r12 = r12.getParameterTypes()     // Catch: java.lang.Throwable -> L1ab
            int r12 = r12.length     // Catch: java.lang.Throwable -> L1ab
            java.lang.reflect.Constructor<?> r0 = r5.localMessageCtor
            if (r12 != 0) goto Ld7
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1ab
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.newInstance(r0, r12)     // Catch: java.lang.Throwable -> L1ab
            goto Le1
        Ld7:
            java.lang.String r12 = r2.talker     // Catch: java.lang.Throwable -> L1ab
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L1ab
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.newInstance(r0, r12)     // Catch: java.lang.Throwable -> L1ab
        Le1:
            if (r12 != 0) goto Le5
            goto L1ab
        Le5:
            long r0 = r2.msgId     // Catch: java.lang.Throwable -> L1ab
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_msgId"
            java.lang.String r5 = "msgId"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            long r0 = r2.msgSvrId     // Catch: java.lang.Throwable -> L1ab
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_msgSvrId"
            java.lang.String r5 = "msgSvrId"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            int r0 = r2.type     // Catch: java.lang.Throwable -> L1ab
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_type"
            java.lang.String r5 = "type"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            int r0 = r2.status     // Catch: java.lang.Throwable -> L1ab
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_status"
            java.lang.String r5 = "status"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            int r0 = r2.isSend     // Catch: java.lang.Throwable -> L1ab
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_isSend"
            java.lang.String r5 = "isSend"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            long r0 = r2.createTime     // Catch: java.lang.Throwable -> L1ab
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_createTime"
            java.lang.String r5 = "createTime"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r0 = r2.talker     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_talker"
            java.lang.String r5 = "talker"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r0 = r2.content     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_content"
            java.lang.String r5 = "content"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r0 = r2.imagePath     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_imgPath"
            java.lang.String r5 = "imgPath"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r0 = r2.reserved     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_reserved"
            java.lang.String r5 = "reserved"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r0 = r2.translatedContent     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_transContent"
            java.lang.String r5 = "transContent"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            int r0 = r2.flag     // Catch: java.lang.Throwable -> L1ab
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_flag"
            java.lang.String r5 = "flag"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r0 = r2.msgSource     // Catch: java.lang.Throwable -> L1ab
            java.lang.String r1 = "field_msgSource"
            java.lang.String r5 = "msgSource"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}     // Catch: java.lang.Throwable -> L1ab
            k8.g.B(r12, r0, r1)     // Catch: java.lang.Throwable -> L1ab
            r13 = r12
        L1ab:
            r12 = r13
        L1ac:
            if (r12 != 0) goto L1c3
            java.lang.String r12 = "撤回消息失败: 原生消息对象为空 msgId="
            java.lang.String r13 = " msgSvrId="
            java.lang.StringBuilder r12 = p.a.o(r7, r12, r13)
            long r0 = r2.msgSvrId
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r4.o(r12)
            goto L1c7
        L1c3:
            boolean r3 = r4.s(r12)
        L1c7:
            return r3
        L1c8:
            java.lang.String r12 = "撤回消息失败: API未就绪"
            r4.o(r12)
        L1cd:
            return r3
    }

    public final boolean sendAppBrandMsg(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            r6 = 0
            java.lang.String r7 = ""
            java.lang.String r3 = ""
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r11
            r4 = r12
            boolean r9 = r0.shareMiniProgram(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public final boolean sendEmoji(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            eb.g r0 = new eb.g
            r1 = 5
            r0.<init>(r1, r3, r4)
            boolean r3 = r2.sendMedia(r0)
            return r3
    }

    public final boolean sendFavorite(java.lang.String r3, long r4) {
            r2 = this;
            if (r3 == 0) goto L1b
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            goto L1b
        L9:
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L1b
        L10:
            eb.s0 r0 = new eb.s0
            r1 = 0
            r0.<init>(r3, r4, r1)
            boolean r3 = r2.sendMedia(r0)
            return r3
        L1b:
            r3 = 0
            return r3
    }

    public final boolean sendFavorite(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L1d
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            goto L1d
        L9:
            if (r4 == 0) goto L1d
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L12
            goto L1d
        L12:
            eb.g r0 = new eb.g
            r1 = 7
            r0.<init>(r1, r3, r4)
            boolean r3 = r2.sendMedia(r0)
            return r3
        L1d:
            r3 = 0
            return r3
    }

    public final boolean sendFile(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            eb.g r0 = new eb.g
            r1 = 6
            r0.<init>(r1, r3, r4)
            boolean r3 = r2.sendMedia(r0)
            return r3
    }

    public final boolean sendFile(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            eb.l r0 = new eb.l
            r1 = 2
            r0.<init>(r1, r3, r4, r5)
            boolean r3 = r2.sendMedia(r0)
            return r3
    }

    public final boolean sendImage(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            eb.g r0 = new eb.g
            r1 = 3
            r0.<init>(r1, r3, r4)
            boolean r3 = r2.sendMedia(r0)
            return r3
    }

    public final boolean sendImage(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            eb.l r0 = new eb.l
            r1 = 1
            r0.<init>(r1, r3, r4, r5)
            boolean r3 = r2.sendMedia(r0)
            return r3
    }

    public final boolean sendLocation(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto Laf
            boolean r1 = og.m.t0(r5)
            if (r1 == 0) goto Lb
            goto Laf
        Lb:
            if (r8 == 0) goto Laf
            boolean r1 = og.m.t0(r8)
            if (r1 == 0) goto L15
            goto Laf
        L15:
            if (r9 == 0) goto Laf
            boolean r1 = og.m.t0(r9)
            if (r1 == 0) goto L1f
            goto Laf
        L1f:
            k8.g r1 = p.a.q()
            if (r1 == 0) goto Laf
            java.lang.String r2 = ""
            if (r6 != 0) goto L2a
            r6 = r2
        L2a:
            if (r7 != 0) goto L2d
            r7 = r2
        L2d:
            if (r10 != 0) goto L30
            r10 = r2
        L30:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto Laa
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto Laa
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 == 0) goto L43
            goto Laa
        L43:
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L4c
            java.lang.String r10 = "16"
            goto L50
        L4c:
            java.lang.String r10 = r10.trim()
        L50:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "<msg><location x=\""
            r2.<init>(r3)
            java.lang.String r8 = k8.g.g(r8)
            r2.append(r8)
            java.lang.String r8 = "\" y=\""
            r2.append(r8)
            java.lang.String r8 = k8.g.g(r9)
            r2.append(r8)
            java.lang.String r8 = "\" scale=\""
            r2.append(r8)
            java.lang.String r8 = k8.g.g(r10)
            r2.append(r8)
            java.lang.String r8 = "\" label=\""
            r2.append(r8)
            java.lang.String r7 = k8.g.g(r7)
            r2.append(r7)
            java.lang.String r7 = "\" poiname=\""
            r2.append(r7)
            java.lang.String r6 = k8.g.g(r6)
            r2.append(r6)
            java.lang.String r6 = "\" infourl=\"\" maptype=\"0\" poiid=\"\" isFromPoiList=\"false\" poiCategoryTips=\"\" poiBusinessHour=\"\" poiPhone=\"\" poiPriceTips=\"0.0\" buildingId=\"\" floorName=\"\" /></msg>"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto La3
            java.lang.String r5 = "发送位置失败: XML构造失败"
            r1.o(r5)
            return r0
        La3:
            r7 = 48
            boolean r5 = r1.v(r7, r5, r6)
            return r5
        Laa:
            java.lang.String r5 = "发送位置失败: talker/经纬度为空"
            r1.o(r5)
        Laf:
            return r0
    }

    public final boolean sendLocation(java.lang.String r9, org.json.JSONObject r10) {
            r8 = this;
            if (r10 != 0) goto L4
            r9 = 0
            return r9
        L4:
            java.lang.String r0 = "poiName"
            java.lang.String r3 = r10.optString(r0)
            java.lang.String r0 = "label"
            java.lang.String r4 = r10.optString(r0)
            java.lang.String r0 = "x"
            java.lang.String r5 = r10.optString(r0)
            java.lang.String r0 = "y"
            java.lang.String r6 = r10.optString(r0)
            java.lang.String r0 = "scale"
            java.lang.String r7 = r10.optString(r0)
            r1 = r8
            r2 = r9
            boolean r9 = r1.sendLocation(r2, r3, r4, r5, r6, r7)
            return r9
    }

    public final boolean sendMediaMsg(java.lang.String r3, java.lang.Object r4, java.lang.String r5) {
            r2 = this;
            if (r3 == 0) goto L17
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            goto L17
        L9:
            if (r4 != 0) goto Lc
            goto L17
        Lc:
            b0.s r0 = new b0.s
            r1 = 6
            r0.<init>(r3, r4, r5, r1)
            boolean r3 = r2.sendMedia(r0)
            return r3
        L17:
            r3 = 0
            return r3
    }

    public final boolean sendOriginalImage(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            eb.g r0 = new eb.g
            r1 = 2
            r0.<init>(r1, r3, r4)
            boolean r3 = r2.sendMedia(r0)
            return r3
    }

    public final boolean sendPat(java.lang.String r23, java.lang.String r24) {
            r22 = this;
            r0 = r23
            r2 = r24
            r6 = 0
            if (r0 == 0) goto Ld
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L11
        Ld:
            r16 = r6
            goto L1c7
        L11:
            if (r2 == 0) goto Ld
            boolean r1 = og.m.t0(r2)
            if (r1 == 0) goto L1a
            goto Ld
        L1a:
            k8.g r7 = p.a.q()
            if (r7 == 0) goto Ld
            m8.c r8 = r7.f7418b
            r9 = 0
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            h.Hchat.dexkit.DexFinder r11 = r7.f7417a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3a
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L3e
        L3a:
            r16 = r6
            goto L1c2
        L3e:
            java.lang.reflect.Method r1 = r11.serviceGetterMethod
            if (r1 == 0) goto L1ba
            java.lang.reflect.Method r1 = r11.patCreatePairMethod
            if (r1 == 0) goto L1ba
            java.lang.reflect.Method r1 = r11.patSuffixMethod
            if (r1 == 0) goto L1ba
            java.lang.reflect.Constructor<?> r1 = r11.sendPatSceneCtor
            if (r1 == 0) goto L1ba
            g8.a r1 = r7.f7419c
            java.lang.String r1 = r1.c()
            r7.l()
            java.lang.reflect.Method r3 = r11.serviceGetterMethod     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L5e
            r3 = 0
        L5c:
            r14 = r3
            goto L92
        L5e:
            java.lang.reflect.Method r3 = r11.patCreatePairMethod     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L67
            java.lang.Class r3 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L9a
            goto L69
        L67:
            java.lang.Class<?> r3 = r11.patExtensionClass     // Catch: java.lang.Throwable -> L9a
        L69:
            java.lang.Object r3 = r7.k(r3)     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L70
            goto L5c
        L70:
            java.lang.Class<?> r3 = r11.patExtensionClass     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L79
            java.lang.Class[] r3 = r3.getInterfaces()     // Catch: java.lang.Throwable -> L9a
            goto L7b
        L79:
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L9a
        L7b:
            int r4 = r3.length     // Catch: java.lang.Throwable -> L9a
            r13 = r6
        L7d:
            if (r13 >= r4) goto L8b
            r14 = r3[r13]     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r14 = r7.k(r14)     // Catch: java.lang.Throwable -> L9a
            if (r14 == 0) goto L88
            goto L92
        L88:
            int r13 = r13 + 1
            goto L7d
        L8b:
            java.lang.Class<?> r3 = r11.patExtensionClass     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r3 = r7.k(r3)     // Catch: java.lang.Throwable -> L9a
            goto L5c
        L92:
            if (r14 != 0) goto L9f
            java.lang.String r0 = "发送拍一拍失败: 拍一拍服务为空"
            r7.o(r0)     // Catch: java.lang.Throwable -> L9a
            return r6
        L9a:
            r0 = move-exception
            r16 = r6
            goto L1a2
        L9f:
            java.lang.reflect.Method r3 = r11.patCanSendMethod     // Catch: java.lang.Throwable -> L9a
            java.lang.String r13 = " pattedUser="
            if (r3 == 0) goto Ld4
            java.lang.Object[] r4 = new java.lang.Object[]{r12, r0, r2}     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r3, r14, r4)     // Catch: java.lang.Throwable -> L9a
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto Ld4
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L9a
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto Ld4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r1.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = "发送拍一拍失败: 微信原生校验不允许 talker="
            r1.append(r3)     // Catch: java.lang.Throwable -> L9a
            r1.append(r0)     // Catch: java.lang.Throwable -> L9a
            r1.append(r13)     // Catch: java.lang.Throwable -> L9a
            r1.append(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L9a
            r7.o(r0)     // Catch: java.lang.Throwable -> L9a
            return r6
        Ld4:
            java.lang.reflect.Method r3 = r11.patSuffixMethod     // Catch: java.lang.Throwable -> L9a
            java.lang.Object[] r4 = new java.lang.Object[]{r2, r0}     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r3, r14, r4)     // Catch: java.lang.Throwable -> L9a
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L9a
            java.lang.String r15 = ""
            if (r4 == 0) goto Le7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L9a
            goto Le8
        Le7:
            r3 = r15
        Le8:
            long r16 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9a
            r18 = 1000(0x3e8, double:4.94E-321)
            r20 = r9
            long r9 = r16 / r18
            int r4 = (int) r9
            java.lang.reflect.Constructor<?> r9 = r11.sendPatSceneCtor     // Catch: java.lang.Throwable -> Lf7
            if (r9 != 0) goto Lfa
        Lf7:
            r16 = r6
            goto L118
        Lfa:
            android.util.Pair r9 = android.util.Pair.create(r5, r5)     // Catch: java.lang.Throwable -> Lf7
            java.lang.reflect.Constructor<?> r10 = r11.sendPatSceneCtor     // Catch: java.lang.Throwable -> Lf7
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r0, r2, r12}     // Catch: java.lang.Throwable -> Lf7
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.newInstance(r10, r9)     // Catch: java.lang.Throwable -> Lf7
            java.util.IdentityHashMap r10 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> Lf7
            r10.<init>()     // Catch: java.lang.Throwable -> Lf7
            java.util.Set r10 = java.util.Collections.newSetFromMap(r10)     // Catch: java.lang.Throwable -> Lf7
            r16 = r6
            r6 = 4
            java.lang.String r15 = k8.g.i(r9, r0, r2, r6, r10)     // Catch: java.lang.Throwable -> L118
        L118:
            boolean r6 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L12e
            if (r6 != 0) goto L11f
            r1 = r15
        L11f:
            boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L12e
            if (r6 == 0) goto L131
            java.lang.String r0 = "发送拍一拍失败: 自身wxid为空"
            r7.o(r0)     // Catch: java.lang.Throwable -> L12e
        L12a:
            r6 = r16
            goto L1b9
        L12e:
            r0 = move-exception
            goto L1a2
        L131:
            java.lang.reflect.Method r6 = r11.patCreatePairMethod     // Catch: java.lang.Throwable -> L12e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L12e
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5}     // Catch: java.lang.Throwable -> L12e
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r6, r14, r1)     // Catch: java.lang.Throwable -> L12e
            boolean r3 = r1 instanceof android.util.Pair     // Catch: java.lang.Throwable -> L12e
            if (r3 != 0) goto L149
            java.lang.String r0 = "发送拍一拍失败: 本地消息结果无效"
            r7.o(r0)     // Catch: java.lang.Throwable -> L12e
            goto L12a
        L149:
            android.util.Pair r1 = (android.util.Pair) r1     // Catch: java.lang.Throwable -> L12e
            java.lang.Object r3 = r1.first     // Catch: java.lang.Throwable -> L12e
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L12e
            if (r4 == 0) goto L19c
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L12e
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L12e
            int r3 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r3 > 0) goto L15c
            goto L19c
        L15c:
            java.lang.reflect.Constructor<?> r3 = r11.sendPatSceneCtor     // Catch: java.lang.Throwable -> L12e
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r0, r2, r12}     // Catch: java.lang.Throwable -> L12e
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r3, r4)     // Catch: java.lang.Throwable -> L12e
            boolean r3 = r8.j(r3)     // Catch: java.lang.Throwable -> L12e
            if (r3 != 0) goto L19a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12e
            r4.<init>()     // Catch: java.lang.Throwable -> L12e
            java.lang.String r5 = "发送拍一拍失败: 网络入队失败 msgId="
            r4.append(r5)     // Catch: java.lang.Throwable -> L12e
            java.lang.Object r5 = r1.first     // Catch: java.lang.Throwable -> L12e
            r4.append(r5)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r5 = " createTime="
            r4.append(r5)     // Catch: java.lang.Throwable -> L12e
            java.lang.Object r1 = r1.second     // Catch: java.lang.Throwable -> L12e
            r4.append(r1)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r1 = " talker="
            r4.append(r1)     // Catch: java.lang.Throwable -> L12e
            r4.append(r0)     // Catch: java.lang.Throwable -> L12e
            r4.append(r13)     // Catch: java.lang.Throwable -> L12e
            r4.append(r2)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L12e
            r7.o(r0)     // Catch: java.lang.Throwable -> L12e
        L19a:
            r6 = r3
            goto L1b9
        L19c:
            java.lang.String r0 = "发送拍一拍失败: 本地消息插入失败"
            r7.o(r0)     // Catch: java.lang.Throwable -> L12e
            goto L12a
        L1a2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "发送拍一拍异常: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.o(r0)
            goto L12a
        L1b9:
            return r6
        L1ba:
            r16 = r6
            java.lang.String r0 = "发送拍一拍失败: API 未就绪"
            r7.o(r0)
            return r16
        L1c2:
            java.lang.String r0 = "发送拍一拍失败: talker/pattedUser 为空"
            r7.o(r0)
        L1c7:
            return r16
    }

    public final boolean sendQuoteMsg(java.lang.String r4, long r5, java.lang.String r7) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1c
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto La
            goto L1c
        La:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L11
            goto L1c
        L11:
            k8.g r1 = p.a.q()
            if (r1 == 0) goto L1c
            boolean r4 = r1.u(r5, r4, r7)
            return r4
        L1c:
            return r0
    }

    public final boolean sendQuoteMsg(java.lang.String r1, java.lang.String r2, long r3) {
            r0 = this;
            boolean r1 = r0.sendQuoteMsg(r1, r3, r2)
            return r1
    }

    public final boolean sendShareCard(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto La
            goto L1e
        La:
            if (r4 == 0) goto L1e
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto L13
            goto L1e
        L13:
            k8.g r1 = p.a.q()
            if (r1 == 0) goto L1e
            boolean r3 = r1.w(r3, r4)
            return r3
        L1e:
            return r0
    }

    public final void sendText(java.lang.String r2, java.lang.String r3, java.util.function.Consumer<java.lang.Object> r4) {
            r1 = this;
            eb.y0 r0 = new eb.y0
            r0.<init>(r1, r4, r2, r3)
            r1.async(r0)
            return
    }

    public final boolean sendText(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            if (r4 == 0) goto L37
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L9
            goto L37
        L9:
            if (r5 == 0) goto L37
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L12
            goto L37
        L12:
            k8.g r0 = p.a.q()
            if (r0 == 0) goto L37
            eb.b1 r1 = r3.parseAtContent(r4, r5)
            if (r1 != 0) goto L23
            boolean r4 = r0.x(r4, r5)
            return r4
        L23:
            java.util.List r5 = r1.f2503b
            boolean r2 = r5.isEmpty()
            java.lang.String r1 = r1.f2502a
            if (r2 == 0) goto L32
            boolean r4 = r0.x(r4, r1)
            return r4
        L32:
            boolean r4 = r0.y(r4, r1, r5)
            return r4
        L37:
            r4 = 0
            return r4
    }

    public final boolean sendVideo(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            eb.g r0 = new eb.g
            r1 = 4
            r0.<init>(r1, r3, r4)
            boolean r3 = r2.sendMedia(r0)
            return r3
    }

    public final boolean sendVoice(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            eb.g r0 = new eb.g
            r1 = 1
            r0.<init>(r1, r3, r4)
            boolean r3 = r2.sendMedia(r0)
            return r3
    }

    public final boolean sendVoice(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            eb.v0 r0 = new eb.v0
            r1 = 0
            r0.<init>(r5, r3, r4, r1)
            boolean r3 = r2.sendMedia(r0)
            return r3
    }

    public final boolean sendXmlMsg(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto La
            goto L1e
        La:
            if (r4 == 0) goto L1e
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto L13
            goto L1e
        L13:
            k8.g r1 = p.a.q()
            if (r1 == 0) goto L1e
            boolean r3 = r1.z(r3, r4)
            return r3
        L1e:
            return r0
    }

    public final boolean shareFile(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            if (r9 == 0) goto L22
            boolean r0 = og.m.t0(r9)
            if (r0 == 0) goto L9
            goto L22
        L9:
            if (r11 == 0) goto L22
            boolean r0 = og.m.t0(r11)
            if (r0 == 0) goto L12
            goto L22
        L12:
            c9.k r1 = new c9.k
            r7 = 3
            r4 = 0
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            boolean r9 = r8.sendMedia(r1)
            return r9
        L22:
            r9 = 0
            return r9
    }

    public final boolean shareMiniProgram(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, byte[] r16, java.lang.String r17) {
            r10 = this;
            if (r11 == 0) goto L26
            boolean r0 = og.m.t0(r11)
            if (r0 == 0) goto L9
            goto L26
        L9:
            if (r14 == 0) goto L26
            boolean r0 = og.m.t0(r14)
            if (r0 == 0) goto L12
            goto L26
        L12:
            eb.r0 r1 = new eb.r0
            r9 = 1
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r11 = r10.sendMedia(r1)
            return r11
        L26:
            r11 = 0
            return r11
    }

    public final boolean shareMusic(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, byte[] r16, java.lang.String r17) {
            r10 = this;
            if (r11 == 0) goto L2f
            boolean r0 = og.m.t0(r11)
            if (r0 == 0) goto L9
            goto L2f
        L9:
            if (r14 == 0) goto L2f
            boolean r0 = og.m.t0(r14)
            if (r0 == 0) goto L12
            goto L2f
        L12:
            if (r15 == 0) goto L2f
            boolean r0 = og.m.t0(r15)
            if (r0 == 0) goto L1b
            goto L2f
        L1b:
            eb.r0 r1 = new eb.r0
            r9 = 0
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r11 = r10.sendMedia(r1)
            return r11
        L2f:
            r11 = 0
            return r11
    }

    public final boolean shareMusicVideo(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, byte[] r21, java.lang.String r22) {
            r12 = this;
            if (r13 == 0) goto L36
            boolean r0 = og.m.t0(r13)
            if (r0 == 0) goto L9
            goto L36
        L9:
            if (r16 == 0) goto L36
            boolean r0 = og.m.t0(r16)
            if (r0 == 0) goto L12
            goto L36
        L12:
            if (r17 == 0) goto L36
            boolean r0 = og.m.t0(r17)
            if (r0 == 0) goto L1b
            goto L36
        L1b:
            eb.o0 r1 = new eb.o0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r13 = r12.sendMedia(r1)
            return r13
        L36:
            r13 = 0
            return r13
    }

    public final boolean shareText(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            if (r3 == 0) goto L1d
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            goto L1d
        L9:
            if (r4 == 0) goto L1d
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L12
            goto L1d
        L12:
            eb.l r0 = new eb.l
            r1 = 3
            r0.<init>(r1, r3, r4, r5)
            boolean r3 = r2.sendMedia(r0)
            return r3
        L1d:
            r3 = 0
            return r3
    }

    public final boolean shareVideo(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, byte[] r14, java.lang.String r15) {
            r9 = this;
            if (r10 == 0) goto L23
            boolean r0 = og.m.t0(r10)
            if (r0 == 0) goto L9
            goto L23
        L9:
            if (r13 == 0) goto L23
            boolean r0 = og.m.t0(r13)
            if (r0 == 0) goto L12
            goto L23
        L12:
            eb.u0 r1 = new eb.u0
            r8 = 1
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            boolean r10 = r9.sendMedia(r1)
            return r10
        L23:
            r10 = 0
            return r10
    }

    public final boolean shareWebpage(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, byte[] r14, java.lang.String r15) {
            r9 = this;
            if (r10 == 0) goto L23
            boolean r0 = og.m.t0(r10)
            if (r0 == 0) goto L9
            goto L23
        L9:
            if (r13 == 0) goto L23
            boolean r0 = og.m.t0(r13)
            if (r0 == 0) goto L12
            goto L23
        L12:
            eb.u0 r1 = new eb.u0
            r8 = 0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            boolean r10 = r9.sendMedia(r1)
            return r10
        L23:
            r10 = 0
            return r10
    }

    public final boolean uploadDeviceStep(long r17) {
            r16 = this;
            r0 = r17
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 > 0) goto Lb
            goto Lb7
        Lb:
            k8.g r4 = p.a.q()
            if (r4 == 0) goto Lb7
            m8.c r5 = r4.f7418b
            h.Hchat.dexkit.DexFinder r6 = r4.f7417a
            java.lang.String r7 = "上传步数"
            if (r2 > 0) goto L1f
            java.lang.String r0 = "上传步数失败: step无效"
            r4.o(r0)
            return r3
        L1f:
            java.lang.reflect.Constructor<?> r2 = r6.uploadDeviceStepCtor
            if (r2 == 0) goto Lb2
            r4.l()
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r0, r8)     // Catch: java.lang.Throwable -> L85
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L85
            java.lang.reflect.Constructor<?> r1 = r6.uploadDeviceStepCtor     // Catch: java.lang.Throwable -> L85
            java.lang.String r8 = ""
            java.lang.String r9 = "gh_43f2581f6fd6"
            java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> L85
            r6 = 11
            r2.set(r6, r3)     // Catch: java.lang.Throwable -> L85
            r6 = 12
            r2.set(r6, r3)     // Catch: java.lang.Throwable -> L85
            r6 = 13
            r2.set(r6, r3)     // Catch: java.lang.Throwable -> L85
            r6 = 14
            r2.set(r6, r3)     // Catch: java.lang.Throwable -> L85
            long r10 = r2.getTimeInMillis()     // Catch: java.lang.Throwable -> L85
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r12
            int r2 = (int) r10     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L85
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L85
            long r14 = r14 / r12
            int r2 = (int) r14     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r13 = k8.g.b()     // Catch: java.lang.Throwable -> L85
            r2 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L85
            boolean r1 = r5.j(r1)     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L87
            java.lang.String r5 = "已发送"
            goto L89
        L85:
            r0 = move-exception
            goto L9c
        L87:
            java.lang.String r5 = "发送失败"
        L89:
            r2.append(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = ": step="
            r2.append(r5)     // Catch: java.lang.Throwable -> L85
            r2.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L85
            r4.o(r0)     // Catch: java.lang.Throwable -> L85
            return r1
        L9c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "上传步数异常: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.o(r0)
            return r3
        Lb2:
            java.lang.String r0 = "上传步数失败: API未就绪"
            r4.o(r0)
        Lb7:
            return r3
    }

    public final boolean uploadLivePhoto(java.lang.String r9) {
            r8 = this;
            p8.d0 r0 = bc.e.q()
            if (r0 == 0) goto L19
            java.lang.String r7 = ""
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r4 = r9
            boolean r9 = r0.v(r1, r3, r4, r5, r6, r7)
            r0 = 1
            if (r9 != r0) goto L19
            return r0
        L19:
            r9 = 0
            return r9
    }

    public final boolean uploadLivePhoto(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            p8.d0 r0 = bc.e.q()
            if (r0 == 0) goto L18
            java.lang.String r7 = ""
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r6 = ""
            r4 = r9
            r5 = r10
            boolean r9 = r0.v(r1, r3, r4, r5, r6, r7)
            r10 = 1
            if (r9 != r10) goto L18
            return r10
        L18:
            r9 = 0
            return r9
    }

    public final boolean uploadLivePhoto(org.json.JSONObject r9) {
            r8 = this;
            p8.d0 r0 = bc.e.q()
            if (r0 == 0) goto L1f
            if (r9 != 0) goto L17
            java.lang.String r7 = ""
            r1 = 0
            java.lang.String r3 = ""
            java.lang.String r6 = ""
            r4 = r3
            r5 = r3
            boolean r9 = r0.v(r1, r3, r4, r5, r6, r7)
            goto L1b
        L17:
            boolean r9 = r0.w(r9)
        L1b:
            r0 = 1
            if (r9 != r0) goto L1f
            return r0
        L1f:
            r9 = 0
            return r9
    }

    public final boolean uploadText(java.lang.String r4) {
            r3 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r2 = ""
            boolean r4 = r0.u(r4, r2, r2)
            r0 = 1
            if (r4 != r0) goto L11
            return r0
        L11:
            return r1
    }

    public final boolean uploadText(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r3 = r0.u(r3, r4, r5)
            r4 = 1
            if (r3 != r4) goto Lf
            return r4
        Lf:
            return r1
    }

    public final boolean uploadText(org.json.JSONObject r7) {
            r6 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.String r2 = ""
            if (r7 != 0) goto L10
            boolean r7 = r0.u(r2, r2, r2)
            goto L26
        L10:
            java.lang.String r3 = "content"
            java.lang.String r3 = r7.optString(r3, r2)
            java.lang.String r4 = "sdkId"
            java.lang.String r4 = r7.optString(r4, r2)
            java.lang.String r5 = "sdkAppName"
            java.lang.String r7 = r7.optString(r5, r2)
            boolean r7 = r0.u(r3, r4, r7)
        L26:
            r0 = 1
            if (r7 != r0) goto L2a
            return r0
        L2a:
            return r1
    }

    public final boolean uploadTextAndLivePhoto(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            p8.d0 r0 = bc.e.q()
            if (r0 == 0) goto L18
            java.lang.String r7 = ""
            r1 = 0
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r3 = r9
            r4 = r10
            boolean r9 = r0.v(r1, r3, r4, r5, r6, r7)
            r10 = 1
            if (r9 != r10) goto L18
            return r10
        L18:
            r9 = 0
            return r9
    }

    public final boolean uploadTextAndLivePhoto(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            p8.d0 r0 = bc.e.q()
            if (r0 == 0) goto L17
            java.lang.String r7 = ""
            r1 = 0
            java.lang.String r6 = ""
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r9 = r0.v(r1, r3, r4, r5, r6, r7)
            r10 = 1
            if (r9 != r10) goto L17
            return r10
        L17:
            r9 = 0
            return r9
    }

    public final boolean uploadTextAndLivePhoto(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            r9 = this;
            p8.d0 r0 = bc.e.q()
            r8 = 0
            if (r0 == 0) goto L17
            java.lang.String r5 = ""
            r1 = 0
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r13
            boolean r10 = r0.v(r1, r3, r4, r5, r6, r7)
            r11 = 1
            if (r10 != r11) goto L17
            return r11
        L17:
            return r8
    }

    public final boolean uploadTextAndLivePhoto(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r9 = this;
            p8.d0 r0 = bc.e.q()
            r8 = 0
            if (r0 == 0) goto L16
            r1 = 0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            boolean r10 = r0.v(r1, r3, r4, r5, r6, r7)
            r11 = 1
            if (r10 != r11) goto L16
            return r11
        L16:
            return r8
    }

    public final boolean uploadTextAndLivePhoto(org.json.JSONObject r3) {
            r2 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r3 = r0.w(r3)
            r0 = 1
            if (r3 != r0) goto Lf
            return r0
        Lf:
            return r1
    }

    public final boolean uploadTextAndPicList(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            p8.d0 r0 = bc.e.q()
            if (r0 == 0) goto L25
            if (r8 == 0) goto L15
            boolean r1 = og.m.t0(r8)
            if (r1 == 0) goto Lf
            goto L15
        Lf:
            java.util.List r8 = a.a.x0(r8)
        L13:
            r4 = r8
            goto L18
        L15:
            tf.t r8 = tf.t.f13167g
            goto L13
        L18:
            r2 = 0
            java.lang.String r3 = ""
            r5 = r3
            r1 = r7
            boolean r7 = r0.r(r1, r2, r3, r4, r5)
            r8 = 1
            if (r7 != r8) goto L25
            return r8
        L25:
            r7 = 0
            return r7
    }

    public final boolean uploadTextAndPicList(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            p8.d0 r0 = bc.e.q()
            if (r0 == 0) goto L24
            if (r8 == 0) goto L15
            boolean r1 = og.m.t0(r8)
            if (r1 == 0) goto Lf
            goto L15
        Lf:
            java.util.List r8 = a.a.x0(r8)
        L13:
            r4 = r8
            goto L18
        L15:
            tf.t r8 = tf.t.f13167g
            goto L13
        L18:
            r2 = 0
            r1 = r7
            r3 = r9
            r5 = r10
            boolean r7 = r0.r(r1, r2, r3, r4, r5)
            r8 = 1
            if (r7 != r8) goto L24
            return r8
        L24:
            r7 = 0
            return r7
    }

    public final boolean uploadTextAndPicList(java.lang.String r4, java.util.List<?> r5) {
            r3 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r2 = ""
            boolean r4 = r0.x(r4, r5, r2, r2)
            r5 = 1
            if (r4 != r5) goto L11
            return r5
        L11:
            return r1
    }

    public final boolean uploadTextAndPicList(java.lang.String r3, java.util.List<?> r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r3 = r0.x(r3, r4, r5, r6)
            r4 = 1
            if (r3 != r4) goto Lf
            return r4
        Lf:
            return r1
    }

    public final boolean uploadTextAndPicList(org.json.JSONObject r10) {
            r9 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto L6b
            java.lang.String r2 = ""
            if (r10 != 0) goto L12
            tf.t r10 = tf.t.f13167g
            boolean r10 = r0.x(r2, r10, r2, r2)
            goto L67
        L12:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "picPathList"
            org.json.JSONArray r4 = r10.optJSONArray(r4)
            if (r4 == 0) goto L42
            int r5 = r4.length()
            r6 = r1
        L24:
            if (r6 < r5) goto L27
            goto L42
        L27:
            java.lang.String r7 = r4.optString(r6, r2)
            r7.getClass()
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            boolean r8 = og.m.t0(r7)
            if (r8 != 0) goto L3f
            r3.add(r7)
        L3f:
            int r6 = r6 + 1
            goto L24
        L42:
            java.lang.String r4 = "picPath"
            java.lang.String r4 = bc.e.l(r4, r2, r10)
            boolean r5 = og.m.t0(r4)
            if (r5 != 0) goto L51
            r3.add(r4)
        L51:
            java.lang.String r4 = "content"
            java.lang.String r4 = r10.optString(r4, r2)
            java.lang.String r5 = "sdkId"
            java.lang.String r5 = r10.optString(r5, r2)
            java.lang.String r6 = "sdkAppName"
            java.lang.String r10 = r10.optString(r6, r2)
            boolean r10 = r0.x(r4, r3, r5, r10)
        L67:
            r0 = 1
            if (r10 != r0) goto L6b
            return r0
        L6b:
            return r1
    }

    public final boolean uploadTextAndVideo(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r2 = ""
            boolean r4 = r0.y(r4, r5, r2, r2)
            r5 = 1
            if (r4 != r5) goto L11
            return r5
        L11:
            return r1
    }

    public final boolean uploadTextAndVideo(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r3 = r0.y(r3, r4, r5, r6)
            r4 = 1
            if (r3 != r4) goto Lf
            return r4
        Lf:
            return r1
    }

    public final boolean uploadTextAndVideo(org.json.JSONObject r3) {
            r2 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r3 = r0.z(r3)
            r0 = 1
            if (r3 != r0) goto Lf
            return r0
        Lf:
            return r1
    }

    public final boolean uploadVideo(java.lang.String r4) {
            r3 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r2 = ""
            boolean r4 = r0.y(r2, r4, r2, r2)
            r0 = 1
            if (r4 != r0) goto L11
            return r0
        L11:
            return r1
    }

    public final boolean uploadVideo(org.json.JSONObject r3) {
            r2 = this;
            p8.d0 r0 = bc.e.q()
            r1 = 0
            if (r0 == 0) goto L18
            if (r3 != 0) goto L10
            java.lang.String r3 = ""
            boolean r3 = r0.y(r3, r3, r3, r3)
            goto L14
        L10:
            boolean r3 = r0.z(r3)
        L14:
            r0 = 1
            if (r3 != r0) goto L18
            return r0
        L18:
            return r1
    }

    public final boolean verifyUser(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            eb.k r0 = eb.k.f2567a
            java.lang.String r3 = eb.k.p(r5, r3, r4)
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r0.getClass()
            g8.l r0 = h.Hchat.hooks.api.core.WeChatApis.s()
            r1 = 0
            if (r0 == 0) goto L1c
            boolean r3 = r0.c(r3, r4, r5, r1)
            r4 = 1
            if (r3 != r4) goto L1c
            return r4
        L1c:
            return r1
    }

    public final boolean verifyUser(java.lang.String r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            eb.k r0 = eb.k.f2567a
            java.lang.String r2 = eb.k.p(r4, r2, r3)
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r0.getClass()
            g8.l r0 = h.Hchat.hooks.api.core.WeChatApis.s()
            if (r0 == 0) goto L1b
            boolean r2 = r0.c(r2, r3, r4, r5)
            r3 = 1
            if (r2 != r3) goto L1b
            return r3
        L1b:
            r2 = 0
            return r2
    }
}
