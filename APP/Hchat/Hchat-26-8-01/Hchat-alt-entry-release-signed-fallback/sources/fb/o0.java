package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb.b f3682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final okhttp3.OkHttpClient f3683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f3684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.String f3685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f3687h;

    public o0(java.lang.String r2, java.lang.String r3, fb.b r4) {
            r1 = this;
            r1.<init>()
            r1.f3680a = r2
            r1.f3681b = r3
            r1.f3682c = r4
            okhttp3.OkHttpClient$Builder r2 = new okhttp3.OkHttpClient$Builder
            r2.<init>()
            r3 = 15
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r2 = r2.connectTimeout(r3, r0)
            r3 = 60
            okhttp3.OkHttpClient$Builder r2 = r2.readTimeout(r3, r0)
            r3 = 30
            okhttp3.OkHttpClient$Builder r2 = r2.writeTimeout(r3, r0)
            okhttp3.OkHttpClient r2 = r2.build()
            r1.f3683d = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r3 = 0
            r2.<init>(r3)
            r1.f3684e = r2
            java.lang.String r2 = ""
            r1.f3685f = r2
            r1.f3687h = r2
            return
    }

    public final void a() {
            r5 = this;
            boolean r0 = r5.f3686g
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "2024-11-05"
            java.lang.String r1 = "protocolVersion"
            org.json.JSONObject r0 = wb.en.k(r1, r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "capabilities"
            r0.put(r3, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "name"
            java.lang.String r4 = "Hchat Plugin Agent"
            r2.put(r3, r4)
            java.lang.String r3 = "version"
            java.lang.String r4 = "1.0"
            r2.put(r3, r4)
            java.lang.String r3 = "clientInfo"
            r0.put(r3, r2)
            java.lang.String r2 = "initialize"
            org.json.JSONObject r0 = r5.d(r2, r0)
            java.lang.String r1 = r0.optString(r1)
            r1.getClass()
            boolean r1 = og.m.t0(r1)
            if (r1 != 0) goto L7b
            java.lang.String r1 = "instructions"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            r0.getClass()
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            r1 = 4000(0xfa0, float:5.605E-42)
            java.lang.String r0 = og.m.P0(r1, r0)
            r5.f3687h = r0
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "2.0"
            java.lang.String r2 = "method"
            java.lang.String r3 = "jsonrpc"
            java.lang.String r4 = "notifications/initialized"
            org.json.JSONObject r1 = wb.en.l(r3, r1, r2, r4)
            java.lang.String r2 = "params"
            r1.put(r2, r0)
            r0 = 0
            r5.c(r1, r0)
            r0 = 1
            r5.f3686g = r0
            return
        L7b:
            java.lang.String r0 = "MCP initialize 返回无效"
            j8.o.A(r0)
            return
    }

    public final java.lang.String b() {
            r9 = this;
            r9.a()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.String r2 = ""
            r3 = r2
        L10:
            boolean r4 = og.m.t0(r3)
            java.lang.String r5 = "tools"
            if (r4 != 0) goto L1f
            boolean r4 = r1.add(r3)
            if (r4 != 0) goto L1f
            goto L54
        L1f:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            boolean r6 = og.m.t0(r3)
            if (r6 != 0) goto L2f
            java.lang.String r6 = "cursor"
            r4.put(r6, r3)
        L2f:
            java.lang.String r3 = "tools/list"
            org.json.JSONObject r3 = r9.d(r3, r4)
            org.json.JSONArray r4 = r3.optJSONArray(r5)
            if (r4 == 0) goto L3c
            goto L41
        L3c:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
        L41:
            int r6 = r4.length()
            r7 = 0
        L46:
            if (r7 < r6) goto L73
            java.lang.String r4 = "nextCursor"
            java.lang.String r3 = bc.e.l(r4, r2, r3)
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L10
        L54:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = r9.f3687h
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L68
            java.lang.String r2 = "instructions"
            java.lang.String r3 = r9.f3687h
            r1.put(r2, r3)
        L68:
            r1.put(r5, r0)
            java.lang.String r0 = r1.toString()
            r0.getClass()
            return r0
        L73:
            java.lang.Object r8 = r4.opt(r7)
            r0.put(r8)
            int r7 = r7 + 1
            goto L46
    }

    public final java.lang.String c(org.json.JSONObject r10, boolean r11) {
            r9 = this;
            java.lang.String r0 = "MCP HTTP "
            fb.b r1 = r9.f3682c
            java.util.Set r2 = r1.f3401b
            r1.d()
            okhttp3.Request$Builder r3 = new okhttp3.Request$Builder
            r3.<init>()
            java.lang.String r4 = r9.f3680a
            okhttp3.Request$Builder r3 = r3.url(r4)
            java.lang.String r4 = "Accept"
            java.lang.String r5 = "application/json, text/event-stream"
            okhttp3.Request$Builder r3 = r3.header(r4, r5)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            okhttp3.Request$Builder r3 = r3.header(r4, r5)
            java.lang.String r4 = "MCP-Protocol-Version"
            java.lang.String r6 = "2024-11-05"
            okhttp3.Request$Builder r3 = r3.header(r4, r6)
            java.lang.String r4 = r9.f3685f
            boolean r4 = og.m.t0(r4)
            java.lang.String r6 = "Mcp-Session-Id"
            if (r4 != 0) goto L3b
            java.lang.String r4 = r9.f3685f
            r3.header(r6, r4)
        L3b:
            java.lang.String r4 = r9.f3681b
            boolean r7 = og.m.t0(r4)
            if (r7 != 0) goto L48
            java.lang.String r7 = "Authorization"
            r3.header(r7, r4)
        L48:
            okhttp3.RequestBody$Companion r4 = okhttp3.RequestBody.Companion
            java.lang.String r10 = r10.toString()
            r10.getClass()
            okhttp3.MediaType$Companion r7 = okhttp3.MediaType.Companion
            okhttp3.MediaType r5 = r7.get(r5)
            okhttp3.RequestBody r10 = r4.create(r10, r5)
            okhttp3.Request$Builder r10 = r3.post(r10)
            okhttp3.Request r10 = r10.build()
            okhttp3.OkHttpClient r3 = r9.f3683d
            okhttp3.Call r10 = r3.newCall(r10)
            r1.a(r10)
            okhttp3.Response r3 = r10.execute()     // Catch: java.lang.Throwable -> Lb4
            r1.d()     // Catch: java.lang.Throwable -> L8e
            r4 = 2
            r5 = 0
            java.lang.String r7 = okhttp3.Response.header$default(r3, r6, r5, r4, r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = ""
            if (r7 != 0) goto L7e
            r7 = r8
        L7e:
            boolean r7 = og.m.t0(r7)     // Catch: java.lang.Throwable -> L8e
            if (r7 != 0) goto L90
            java.lang.String r4 = okhttp3.Response.header$default(r3, r6, r5, r4, r5)     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L8b
            r4 = r8
        L8b:
            r9.f3685f = r4     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r11 = move-exception
            goto Ld4
        L90:
            boolean r4 = r3.isSuccessful()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto Lbe
            if (r11 != 0) goto L99
            goto Lad
        L99:
            okhttp3.ResponseBody r11 = r3.body()     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto La3
            java.lang.String r5 = r11.string()     // Catch: java.lang.Throwable -> L8e
        La3:
            if (r5 != 0) goto La6
            goto La7
        La6:
            r8 = r5
        La7:
            boolean r11 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L8e
            if (r11 != 0) goto Lb6
        Lad:
            r3.close()     // Catch: java.lang.Throwable -> Lb4
            r2.remove(r10)
            return r8
        Lb4:
            r11 = move-exception
            goto Lda
        Lb6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "MCP 返回为空"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L8e
            throw r11     // Catch: java.lang.Throwable -> L8e
        Lbe:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            int r4 = r3.code()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L8e
            r5.append(r4)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L8e
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L8e
            throw r11     // Catch: java.lang.Throwable -> L8e
        Ld4:
            throw r11     // Catch: java.lang.Throwable -> Ld5
        Ld5:
            r0 = move-exception
            ig.a.i(r3, r11)     // Catch: java.lang.Throwable -> Lb4
            throw r0     // Catch: java.lang.Throwable -> Lb4
        Lda:
            boolean r0 = r1.b(r11)     // Catch: java.lang.Throwable -> Le9
            r1 = 1
            if (r0 != r1) goto Leb
            java.util.concurrent.CancellationException r11 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Le9
            java.lang.String r0 = "Agent 已中断"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Le9
            throw r11     // Catch: java.lang.Throwable -> Le9
        Le9:
            r11 = move-exception
            goto Lec
        Leb:
            throw r11     // Catch: java.lang.Throwable -> Le9
        Lec:
            r10.getClass()
            r2.remove(r10)
            throw r11
    }

    public final org.json.JSONObject d(java.lang.String r11, org.json.JSONObject r12) {
            r10 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r10.f3684e
            long r0 = r0.incrementAndGet()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "jsonrpc"
            java.lang.String r4 = "2.0"
            r2.put(r3, r4)
            java.lang.String r3 = "id"
            r2.put(r3, r0)
            java.lang.String r4 = "method"
            r2.put(r4, r11)
            java.lang.String r4 = "params"
            r2.put(r4, r12)
            r12 = 1
            java.lang.String r2 = r10.c(r2, r12)
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            r4 = 0
            java.lang.String r5 = "{"
            boolean r4 = og.t.d0(r2, r5, r4)
            r5 = -9223372036854775808
            r7 = 0
            if (r4 == 0) goto L52
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>(r2)
            long r2 = r12.optLong(r3, r5)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L48
            r7 = r12
        L48:
            if (r7 == 0) goto L4b
            goto Lab
        L4b:
            java.lang.String r11 = "MCP 返回的请求 ID 不匹配"
            j8.o.A(r11)
        L50:
            r11 = 0
            return r11
        L52:
            dg.n r4 = new dg.n
            r8 = 4
            r4.<init>(r2, r8)
            fb.g0 r2 = new fb.g0
            r8 = 3
            r2.<init>(r8)
            ng.t r2 = ng.m.W(r4, r2)
            fb.g0 r4 = new fb.g0
            r8 = 4
            r4.<init>(r8)
            ng.i r8 = new ng.i
            r8.<init>(r2, r12, r4)
            fb.g0 r2 = new fb.g0
            r4 = 5
            r2.<init>(r4)
            ng.t r2 = ng.m.W(r8, r2)
            fb.g0 r4 = new fb.g0
            r8 = 6
            r4.<init>(r8)
            ng.i r8 = new ng.i
            r8.<init>(r2, r12, r4)
            fb.g0 r12 = new fb.g0
            r2 = 7
            r12.<init>(r2)
            ng.i r12 = ng.m.X(r8, r12)
            ng.h r2 = new ng.h
            r2.<init>(r12)
        L91:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto La7
            java.lang.Object r12 = r2.next()
            r4 = r12
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            long r8 = r4.optLong(r3, r5)
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 != 0) goto L91
            r7 = r12
        La7:
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            if (r7 == 0) goto Ldd
        Lab:
            java.lang.String r12 = "error"
            org.json.JSONObject r12 = r7.optJSONObject(r12)
            java.lang.String r0 = "MCP "
            if (r12 != 0) goto Lc8
            java.lang.String r12 = "result"
            org.json.JSONObject r12 = r7.optJSONObject(r12)
            if (r12 == 0) goto Lbe
            return r12
        Lbe:
            java.lang.String r12 = " 缺少 result"
            java.lang.String r11 = eh.a.n(r0, r11, r12)
            j8.o.A(r11)
            goto L50
        Lc8:
            java.lang.String r1 = "message"
            java.lang.String r2 = r12.toString()
            java.lang.String r12 = r12.optString(r1, r2)
            java.lang.String r1 = " 失败: "
            java.lang.String r11 = bc.e.j(r0, r11, r1, r12)
            j8.o.A(r11)
            goto L50
        Ldd:
            java.lang.String r11 = "MCP SSE 中没有匹配的请求响应"
            j8.o.A(r11)
            goto L50
    }
}
