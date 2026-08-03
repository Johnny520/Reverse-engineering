package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends okhttp3.WebSocketListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21286b;

    public /* synthetic */ j(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f21285a = r2
            r0.f21286b = r1
            r0.<init>()
            return
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(okhttp3.WebSocket r2, int r3, java.lang.String r4) {
            r1 = this;
            int r3 = r1.f21285a
            r2.getClass()
            r4.getClass()
            switch(r3) {
                case 0: goto L23;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r3 = r1.f21286b
            x8.n r3 = (x8.n) r3
            r3.c(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r3.f21319f
            r3 = 0
            java.lang.Object r2 = r2.getAndSet(r3)
            x8.m r2 = (x8.m) r2
            if (r2 == 0) goto L22
            x8.d r2 = r2.f21311e
            r2.invoke()
        L22:
            return
        L23:
            java.lang.Object r3 = r1.f21286b
            x8.k r3 = (x8.k) r3
            java.util.concurrent.atomic.AtomicReference r4 = r3.f21293g
        L29:
            r0 = 0
            boolean r0 = r4.compareAndSet(r2, r0)
            if (r0 == 0) goto L31
            goto L37
        L31:
            java.lang.Object r0 = r4.get()
            if (r0 == r2) goto L29
        L37:
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.f21296j
            r4 = 0
            r2.set(r4)
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.f21295i
            boolean r2 = r2.get()
            if (r2 != 0) goto L48
            x8.k.a(r3)
        L48:
            return
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(okhttp3.WebSocket r2, java.lang.Throwable r3, okhttp3.Response r4) {
            r1 = this;
            int r0 = r1.f21285a
            r2.getClass()
            r3.getClass()
            switch(r0) {
                case 0: goto L23;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r1.f21286b
            x8.n r0 = (x8.n) r0
            r0.c(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r0.f21319f
            r0 = 0
            java.lang.Object r2 = r2.getAndSet(r0)
            x8.m r2 = (x8.m) r2
            if (r2 == 0) goto L22
            c9.z0 r2 = r2.f21310d
            r2.invoke(r3, r4)
        L22:
            return
        L23:
            java.lang.Object r3 = r1.f21286b
            x8.k r3 = (x8.k) r3
            java.util.concurrent.atomic.AtomicReference r4 = r3.f21293g
        L29:
            r0 = 0
            boolean r0 = r4.compareAndSet(r2, r0)
            if (r0 == 0) goto L31
            goto L37
        L31:
            java.lang.Object r0 = r4.get()
            if (r0 == r2) goto L29
        L37:
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.f21296j
            r4 = 0
            r2.set(r4)
            x8.k.a(r3)
            return
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(okhttp3.WebSocket r6, java.lang.String r7) {
            r5 = this;
            int r0 = r5.f21285a
            r6.getClass()
            r7.getClass()
            switch(r0) {
                case 0: goto L78;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r5.f21286b
            x8.n r0 = (x8.n) r0
            java.util.concurrent.atomic.AtomicReference r1 = r0.f21319f
            r0.e()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L53
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = "type"
            java.lang.String r7 = r2.optString(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "hello"
            boolean r7 = gg.l.a(r7, r3)     // Catch: java.lang.Throwable -> L53
            r3 = 0
            sf.n r4 = sf.n.f12433a
            if (r7 == 0) goto L55
            java.lang.String r7 = "audio_params"
            org.json.JSONObject r7 = r2.optJSONObject(r7)     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.atomic.AtomicReference r2 = r0.f21323j     // Catch: java.lang.Throwable -> L53
            r2.set(r7)     // Catch: java.lang.Throwable -> L53
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f21321h     // Catch: java.lang.Throwable -> L53
            r2 = 1
            r0.set(r2)     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r1.get()     // Catch: java.lang.Throwable -> L53
            x8.m r0 = (x8.m) r0     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L68
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f21313g     // Catch: java.lang.Throwable -> L53
            r3 = 0
            boolean r1 = r1.compareAndSet(r3, r2)     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L51
            wb.o7 r0 = r0.f21307a     // Catch: java.lang.Throwable -> L53
            r0.invoke(r6, r7)     // Catch: java.lang.Throwable -> L53
        L51:
            r3 = r4
            goto L68
        L53:
            r6 = move-exception
            goto L63
        L55:
            java.lang.Object r7 = r1.get()     // Catch: java.lang.Throwable -> L53
            x8.m r7 = (x8.m) r7     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L68
            wb.qp r7 = r7.f21308b     // Catch: java.lang.Throwable -> L53
            r7.invoke(r6, r2)     // Catch: java.lang.Throwable -> L53
            goto L51
        L63:
            sf.f r3 = new sf.f
            r3.<init>(r6)
        L68:
            java.lang.Throwable r6 = sf.g.b(r3)
            if (r6 == 0) goto L77
            java.lang.String r7 = r6.getMessage()
            java.lang.String r0 = "[Hchat:AutoReply] 小智AI 数据解析失败: "
            eh.a.x(r0, r7, r6)
        L77:
            return
        L78:
            java.lang.Object r0 = r5.f21286b
            x8.k r0 = (x8.k) r0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La1
            r1.<init>(r7)     // Catch: java.lang.Throwable -> La1
            java.lang.String r7 = "method"
            java.lang.String r7 = r1.optString(r7)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "ping"
            boolean r2 = gg.l.a(r7, r2)     // Catch: java.lang.Throwable -> La1
            if (r2 != 0) goto La3
            java.lang.String r2 = "notifications/initialized"
            boolean r7 = gg.l.a(r7, r2)     // Catch: java.lang.Throwable -> La1
            if (r7 != 0) goto La3
            java.util.concurrent.atomic.AtomicLong r7 = r0.f21298l     // Catch: java.lang.Throwable -> La1
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La1
            r7.set(r2)     // Catch: java.lang.Throwable -> La1
            goto La3
        La1:
            r6 = move-exception
            goto Lbe
        La3:
            r0.g()     // Catch: java.lang.Throwable -> La1
            java.lang.String r7 = "endpoint"
            org.json.JSONObject r7 = r0.d(r7, r1)     // Catch: java.lang.Throwable -> La1
            if (r7 == 0) goto Ld3
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> La1
            r7.getClass()     // Catch: java.lang.Throwable -> La1
            boolean r6 = r6.send(r7)     // Catch: java.lang.Throwable -> La1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> La1
            goto Lc4
        Lbe:
            sf.f r7 = new sf.f
            r7.<init>(r6)
            r6 = r7
        Lc4:
            java.lang.Throwable r6 = sf.g.b(r6)
            if (r6 == 0) goto Ld3
            java.lang.String r7 = r6.getMessage()
            java.lang.String r0 = "[Hchat:AutoReply] 小智MCP桥接消息处理失败: "
            eh.a.x(r0, r7, r6)
        Ld3:
            return
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(okhttp3.WebSocket r2, okio.ByteString r3) {
            r1 = this;
            int r0 = r1.f21285a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onMessage(r2, r3)
            return
        L9:
            r2.getClass()
            r3.getClass()
            java.lang.Object r2 = r1.f21286b
            x8.n r2 = (x8.n) r2
            r2.e()
            java.util.concurrent.atomic.AtomicReference r2 = r2.f21319f
            java.lang.Object r2 = r2.get()
            x8.m r2 = (x8.m) r2
            if (r2 == 0) goto L25
            d9.h r2 = r2.f21309c
            r2.invoke(r3)
        L25:
            return
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(okhttp3.WebSocket r6, okhttp3.Response r7) {
            r5 = this;
            int r0 = r5.f21285a
            java.lang.Object r1 = r5.f21286b
            r6.getClass()
            r7.getClass()
            switch(r0) {
                case 0: goto L84;
                default: goto Ld;
            }
        Ld:
            x8.n r1 = (x8.n) r1
            r1.e()
            java.util.concurrent.ExecutorService r7 = x8.q.f21329a
            x8.t r7 = r1.f21316c
            boolean r0 = r1.f21317d
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "type"
            java.lang.String r3 = "hello"
            r1.put(r2, r3)
            java.lang.String r2 = "version"
            r3 = 1
            r1.put(r2, r3)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r7.f21359k
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L4b
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "mcp"
            r0.put(r2, r3)
            java.lang.String r2 = "features"
            r1.put(r2, r0)
        L4b:
            java.lang.String r0 = "transport"
            java.lang.String r2 = "websocket"
            r1.put(r0, r2)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "format"
            java.lang.String r4 = "opus"
            r0.put(r2, r4)
            java.lang.String r2 = "sample_rate"
            r4 = 16000(0x3e80, float:2.2421E-41)
            r0.put(r2, r4)
            java.lang.String r2 = "channels"
            r0.put(r2, r3)
            java.lang.String r2 = "frame_duration"
            r3 = 60
            r0.put(r2, r3)
            java.lang.String r2 = "audio_params"
            r1.put(r2, r0)
            x8.q.B(r1, r7)
            java.lang.String r7 = r1.toString()
            r7.getClass()
            r6.send(r7)
            return
        L84:
            x8.k r1 = (x8.k) r1
            java.util.concurrent.atomic.AtomicLong r7 = r1.f21298l
            long r2 = java.lang.System.currentTimeMillis()
            r7.set(r2)
            r1.g()
            java.util.concurrent.atomic.AtomicBoolean r7 = r1.f21296j
            r0 = 0
            r7.set(r0)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r0 = "jsonrpc"
            java.lang.String r1 = "2.0"
            r7.put(r0, r1)
            java.lang.String r0 = "method"
            java.lang.String r1 = "notifications/initialized"
            r7.put(r0, r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "params"
            r7.put(r1, r0)
            java.lang.String r7 = r7.toString()
            r7.getClass()
            r6.send(r7)
            return
    }
}
