package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f21290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f21292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f21293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f21294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f21295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f21296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f21297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f21298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f21299m;

    public k(java.lang.String r1, java.lang.String r2, boolean r3, java.lang.String r4, java.lang.String r5, long r6) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.f21287a = r1
            r0.f21288b = r3
            r0.f21289c = r4
            r0.f21290d = r5
            r0.f21291e = r6
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>(r2)
            r0.f21292f = r3
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r0.f21293g = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r0.f21294h = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f21295i = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r3)
            r0.f21296j = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r3)
            r0.f21297k = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            long r3 = java.lang.System.currentTimeMillis()
            r2.<init>(r3)
            r0.f21298l = r2
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            boolean r1 = og.m.t0(r1)
            r1 = r1 ^ 1
            r2.<init>(r1)
            r0.f21299m = r2
            return
    }

    public static final void a(x8.k r4) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f21295i
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L13
        L9:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f21296j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L14
        L13:
            return
        L14:
            java.lang.Thread r0 = new java.lang.Thread
            wb.cr r1 = new wb.cr
            r3 = 3
            r1.<init>(r4, r3)
            java.lang.String r4 = "Hchat-Xiaozhi-MCP-Reconnect"
            r0.<init>(r1, r4)
            r0.setDaemon(r2)
            r0.start()
            return
    }

    public static org.json.JSONObject e(java.lang.String r2, java.lang.String r3, org.json.JSONObject r4, org.json.JSONArray r5) {
            java.lang.String r0 = "name"
            java.lang.String r1 = "description"
            org.json.JSONObject r2 = wb.en.l(r0, r2, r1, r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "type"
            java.lang.String r1 = "object"
            r3.put(r0, r1)
            java.lang.String r0 = "properties"
            r3.put(r0, r4)
            java.lang.String r4 = "required"
            r3.put(r4, r5)
            java.lang.String r4 = "inputSchema"
            r2.put(r4, r3)
            return r2
    }

    public final void b(java.lang.String r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f21295i
            r1 = 1
            r0.set(r1)
            java.util.concurrent.ConcurrentHashMap r0 = r2.f21294h
            r0.clear()
            java.util.concurrent.atomic.AtomicReference r0 = r2.f21293g
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            okhttp3.WebSocket r0 = (okhttp3.WebSocket) r0
            if (r0 == 0) goto L1b
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.close(r1, r3)
        L1b:
            return
    }

    public final void c() {
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f21296j
            java.lang.String r1 = r7.f21287a
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.f21295i
            boolean r2 = r2.get()
            if (r2 == 0) goto Ld
            goto L64
        Ld:
            r2 = 0
            boolean r3 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.atomic.AtomicReference r4 = r7.f21293g
            if (r3 == 0) goto L2d
            r1 = 0
            java.lang.Object r1 = r4.getAndSet(r1)     // Catch: java.lang.Throwable -> L27
            okhttp3.WebSocket r1 = (okhttp3.WebSocket) r1     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            java.lang.String r3 = "main websocket mcp only"
            r4 = 1000(0x3e8, float:1.401E-42)
            r1.close(r4, r3)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r1 = move-exception
            goto L4c
        L29:
            r0.set(r2)     // Catch: java.lang.Throwable -> L27
            return
        L2d:
            okhttp3.Request$Builder r3 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L27
            r3.<init>()     // Catch: java.lang.Throwable -> L27
            okhttp3.Request$Builder r1 = r3.url(r1)     // Catch: java.lang.Throwable -> L27
            okhttp3.Request r1 = r1.build()     // Catch: java.lang.Throwable -> L27
            okhttp3.OkHttpClient r3 = x8.q.f21331c     // Catch: java.lang.Throwable -> L27
            x8.j r5 = new x8.j     // Catch: java.lang.Throwable -> L27
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L27
            okhttp3.WebSocket r1 = r3.newWebSocket(r1, r5)     // Catch: java.lang.Throwable -> L27
            r4.set(r1)     // Catch: java.lang.Throwable -> L27
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> L27
            goto L52
        L4c:
            sf.f r3 = new sf.f
            r3.<init>(r1)
            r1 = r3
        L52:
            java.lang.Throwable r1 = sf.g.b(r1)
            if (r1 == 0) goto L64
            r0.set(r2)
            java.lang.String r0 = r1.getMessage()
            java.lang.String r2 = "[Hchat:AutoReply] 小智MCP桥接连接失败: "
            eh.a.x(r2, r0, r1)
        L64:
            return
    }

    public final org.json.JSONObject d(java.lang.String r34, org.json.JSONObject r35) {
            r33 = this;
            r0 = r33
            r1 = r35
            r2 = 0
            if (r1 != 0) goto L8
            goto L10
        L8:
            java.lang.String r3 = "id"
            boolean r4 = r1.has(r3)
            if (r4 != 0) goto L11
        L10:
            return r2
        L11:
            java.lang.Object r4 = r1.opt(r3)
            java.lang.String r5 = "method"
            java.lang.String r5 = r1.optString(r5)
            if (r5 == 0) goto L2d8
            int r6 = r5.hashCode()
            java.lang.String r7 = "hchat_kugou_order_music"
            java.lang.String r8 = r0.f21289c
            boolean r9 = r0.f21288b
            java.lang.String r10 = "appId"
            java.lang.String r11 = "musicDataUrl"
            java.lang.String r12 = "musicUrl"
            java.lang.String r13 = "title"
            java.lang.String r14 = "hchat_share_music"
            java.lang.String r15 = "description"
            java.lang.String r2 = "type"
            r16 = r4
            java.lang.String r4 = "text"
            r17 = r6
            java.lang.String r6 = "hchat_send_text"
            r18 = r9
            java.lang.String r9 = "keyword"
            r19 = r3
            java.lang.String r3 = "name"
            r20 = r8
            java.lang.String r8 = "tools"
            switch(r17) {
                case 3441010: goto L2c4;
                case 498659858: goto L1a6;
                case 498935890: goto L8d;
                case 871091088: goto L50;
                default: goto L4c;
            }
        L4c:
            r7 = r0
        L4d:
            r8 = r5
            goto L2df
        L50:
            java.lang.String r1 = "initialize"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L59
            goto L4c
        L59:
            java.lang.String r1 = "protocolVersion"
            java.lang.String r2 = "2024-11-05"
            org.json.JSONObject r2 = wb.en.k(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r1.put(r8, r4)
            java.lang.String r4 = "capabilities"
            r2.put(r4, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r4 = "Hchat"
            r1.put(r3, r4)
            java.lang.String r3 = "version"
            java.lang.String r4 = "1.0"
            r1.put(r3, r4)
            java.lang.String r3 = "serverInfo"
            r2.put(r3, r1)
            r7 = r0
            r8 = r5
            goto L2e0
        L8d:
            java.lang.String r1 = "tools/list"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L96
            goto L4c
        L96:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r17 = r5
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r0 = "要发送到当前微信会话的文字内容，尽量少于1024字节"
            r34 = r1
            java.lang.String r1 = "string"
            org.json.JSONObject r0 = wb.en.l(r2, r1, r15, r0)
            r5.put(r4, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r0.put(r2, r1)
            r21 = r8
            java.lang.String r8 = "当前 Hchat 会话 session_id；如果你拿得到，请使用用户消息里的原值"
            r0.put(r15, r8)
            r22 = r7
            java.lang.String r7 = "session_id"
            r5.put(r7, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            org.json.JSONArray r0 = r0.put(r4)
            r0.getClass()
            java.lang.String r4 = "当用户要求你通过微信发送、通知、回复文字时，使用此工具把文字发送到当前触发自动回复的微信会话。不能指定其他会话。"
            org.json.JSONObject r0 = e(r6, r4, r5, r0)
            r3.put(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r4 = "歌曲标题"
            org.json.JSONObject r4 = wb.en.l(r2, r1, r15, r4)
            r0.put(r13, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r4.put(r2, r1)
            java.lang.String r5 = "歌手或描述"
            r4.put(r15, r5)
            r0.put(r15, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r4.put(r2, r1)
            java.lang.String r5 = "音乐详情页或分享页 URL"
            r4.put(r15, r5)
            r0.put(r12, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r4.put(r2, r1)
            java.lang.String r5 = "可播放的音频直链 URL"
            r4.put(r15, r5)
            r0.put(r11, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r4.put(r2, r1)
            java.lang.String r5 = "微信 appid，可留空"
            r4.put(r15, r5)
            r0.put(r10, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r4.put(r2, r1)
            r4.put(r15, r8)
            r0.put(r7, r4)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            org.json.JSONArray r4 = r4.put(r13)
            org.json.JSONArray r4 = r4.put(r12)
            org.json.JSONArray r4 = r4.put(r11)
            r4.getClass()
            java.lang.String r5 = "当你已经获得歌曲播放链接时，使用此工具发送微信音乐卡片到当前触发自动回复的微信会话。不能指定其他会话。"
            org.json.JSONObject r0 = e(r14, r5, r0, r4)
            r3.put(r0)
            if (r18 == 0) goto L193
            boolean r0 = og.m.t0(r20)
            if (r0 != 0) goto L193
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r4 = "从用户请求中提取出的歌曲名、歌手名或组合关键词，例如 晴天、周杰伦 晴天、林俊杰 黑夜问白天"
            org.json.JSONObject r4 = wb.en.l(r2, r1, r15, r4)
            r0.put(r9, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r4.put(r2, r1)
            r4.put(r15, r8)
            r0.put(r7, r4)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            org.json.JSONArray r1 = r1.put(r9)
            r1.getClass()
            java.lang.String r2 = "当用户表达想听歌、放一首歌、播放音乐、来一首某歌手或某歌曲时，先从用户话里提取歌曲名、歌手名或组合关键词，然后使用此工具调用 Hchat 配置的点歌工具，在当前微信会话搜索并发送音乐卡片。"
            r5 = r22
            org.json.JSONObject r0 = e(r5, r2, r0, r1)
            r3.put(r0)
        L193:
            r0 = r34
            r1 = r21
            r0.put(r1, r3)
            r7 = r33
            java.util.concurrent.CountDownLatch r1 = r7.f21299m
            r1.countDown()
        L1a1:
            r2 = r0
            r8 = r17
            goto L2e0
        L1a6:
            r17 = r5
            r5 = r7
            r7 = r0
            java.lang.String r0 = "tools/call"
            r8 = r17
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1b6
            goto L2df
        L1b6:
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r1.optJSONObject(r0)
            if (r0 == 0) goto L1c3
            java.lang.String r1 = r0.optString(r3)
            goto L1c4
        L1c3:
            r1 = 0
        L1c4:
            if (r1 != 0) goto L1c8
            java.lang.String r1 = ""
        L1c8:
            if (r0 == 0) goto L1d3
            java.lang.String r3 = "arguments"
            org.json.JSONObject r0 = r0.optJSONObject(r3)
            if (r0 == 0) goto L1d3
            goto L1d8
        L1d3:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L1d8:
            int r3 = r1.hashCode()
            r17 = r8
            r8 = -907276859(0xffffffffc9ec0dc5, float:-1933752.6)
            r21 = 0
            r22 = r2
            r2 = 1
            if (r3 == r8) goto L27a
            r6 = 483515334(0x1cd1dbc6, float:1.388727E-21)
            if (r3 == r6) goto L228
            r6 = 1725887449(0x66def3d9, float:5.2643178E23)
            if (r3 == r6) goto L1f4
            goto L298
        L1f4:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L1fc
            goto L298
        L1fc:
            java.lang.String r1 = wb.en.j(r9, r0)
            boolean r3 = og.m.t0(r1)
            if (r3 != 0) goto L298
            if (r18 == 0) goto L298
            boolean r3 = og.m.t0(r20)
            if (r3 != 0) goto L298
            h.Hchat.hooks.items.script.ScriptPluginRuntime r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.String r0 = r7.h(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = r7.f21290d
            r5 = r20
            java.lang.Object r0 = r3.m13callPluginFunction0E7RQCE(r5, r1, r0)
            boolean r0 = r0 instanceof sf.f
            if (r0 != 0) goto L298
        L224:
            r21 = r2
            goto L298
        L228:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L22f
            goto L298
        L22f:
            java.lang.String r25 = wb.en.j(r13, r0)
            java.lang.String r1 = wb.en.j(r15, r0)
            java.lang.String r27 = wb.en.j(r12, r0)
            java.lang.String r28 = wb.en.j(r11, r0)
            java.lang.String r32 = wb.en.j(r10, r0)
            java.lang.String r24 = r7.h(r0)
            boolean r0 = og.m.t0(r25)
            if (r0 != 0) goto L298
            boolean r0 = og.m.t0(r27)
            if (r0 != 0) goto L298
            boolean r0 = og.m.t0(r28)
            if (r0 != 0) goto L298
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L298
            boolean r3 = og.m.t0(r1)
            if (r3 == 0) goto L267
            java.lang.String r1 = "音乐"
        L267:
            r26 = r1
            androidx.lifecycle.x r0 = r0.f6819e
            java.lang.String r29 = ""
            java.lang.String r30 = ""
            r31 = 0
            r23 = r0
            boolean r0 = r23.Z(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            if (r0 != r2) goto L298
            goto L224
        L27a:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L281
            goto L298
        L281:
            java.lang.String r1 = wb.en.j(r4, r0)
            java.lang.String r0 = r7.h(r0)
            boolean r3 = og.m.t0(r1)
            if (r3 != 0) goto L298
            java.util.concurrent.ExecutorService r3 = x8.q.f21329a
            boolean r0 = x8.q.I(r0, r1)
            if (r0 == 0) goto L298
            goto L224
        L298:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r3 = r22
            org.json.JSONObject r3 = wb.en.k(r3, r4)
            if (r21 == 0) goto L2ad
            java.lang.String r5 = "ok"
            goto L2af
        L2ad:
            java.lang.String r5 = "failed"
        L2af:
            r3.put(r4, r5)
            org.json.JSONArray r1 = r1.put(r3)
            java.lang.String r3 = "content"
            r0.put(r3, r1)
            java.lang.String r1 = "isError"
            r2 = r21 ^ 1
            r0.put(r1, r2)
            goto L1a1
        L2c4:
            r7 = r0
            r17 = r5
            java.lang.String r0 = "ping"
            r8 = r17
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L2d2
            goto L2df
        L2d2:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            goto L2e0
        L2d8:
            r7 = r0
            r19 = r3
            r16 = r4
            goto L4d
        L2df:
            r2 = 0
        L2e0:
            java.lang.String r0 = "2.0"
            java.lang.String r1 = "jsonrpc"
            if (r2 != 0) goto L314
            java.lang.String r2 = "Method not found: "
            java.lang.String r2 = wb.en.g(r2, r8)
            org.json.JSONObject r0 = wb.en.k(r1, r0)
            if (r16 == 0) goto L2f7
            r4 = r16
        L2f4:
            r3 = r19
            goto L2fa
        L2f7:
            java.lang.Object r4 = org.json.JSONObject.NULL
            goto L2f4
        L2fa:
            r0.put(r3, r4)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "code"
            r4 = -32601(0xffffffffffff80a7, float:NaN)
            r1.put(r3, r4)
            java.lang.String r3 = "message"
            r1.put(r3, r2)
            java.lang.String r2 = "error"
            r0.put(r2, r1)
            return r0
        L314:
            r3 = r19
            org.json.JSONObject r0 = wb.en.k(r1, r0)
            if (r16 == 0) goto L31f
            r4 = r16
            goto L321
        L31f:
            java.lang.Object r4 = org.json.JSONObject.NULL
        L321:
            r0.put(r3, r4)
            java.lang.String r1 = "result"
            r0.put(r1, r2)
            return r0
    }

    public final void f(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r2 = r3.f21298l
            r2.set(r0)
            x8.i r2 = new x8.i
            r2.<init>(r5, r0)
            java.util.concurrent.ConcurrentHashMap r5 = r3.f21294h
            r5.put(r4, r2)
            java.util.Set r4 = r5.entrySet()
            ca.c r5 = new ca.c
            r2 = 21
            r5.<init>(r0, r2)
            x8.h r0 = new x8.h
            r1 = 0
            r0.<init>(r5, r1)
            r4.removeIf(r0)
            r3.g()
            return
    }

    public final void g() {
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f21295i
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            goto L13
        L9:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f21297k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L14
        L13:
            return
        L14:
            java.lang.Thread r0 = new java.lang.Thread
            rb.g r1 = new rb.g
            r3 = 19
            r1.<init>(r4, r3, r4)
            java.lang.String r3 = "Hchat-Xiaozhi-MCP-Idle"
            r0.<init>(r1, r3)
            r0.setDaemon(r2)
            r0.start()
            return
    }

    public final java.lang.String h(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "session_id"
            java.lang.String r4 = wb.en.j(r0, r4)
            java.util.concurrent.ConcurrentHashMap r0 = r3.f21294h
            java.lang.Object r4 = r0.get(r4)
            x8.i r4 = (x8.i) r4
            if (r4 == 0) goto L13
            java.lang.String r4 = r4.f21283a
            goto L1b
        L13:
            java.util.concurrent.atomic.AtomicReference r4 = r3.f21292f
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
        L1b:
            java.util.concurrent.ConcurrentHashMap r0 = x8.q.f21338j
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.put(r4, r1)
            r4.getClass()
            return r4
    }

    public final void i() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f21295i
            boolean r0 = r0.get()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.concurrent.atomic.AtomicLong r0 = r3.f21298l
            long r1 = java.lang.System.currentTimeMillis()
            r0.set(r1)
            r3.g()
            return
    }
}
