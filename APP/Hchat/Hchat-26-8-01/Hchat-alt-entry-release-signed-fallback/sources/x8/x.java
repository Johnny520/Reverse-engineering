package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final okhttp3.OkHttpClient f21380a = null;

    static {
            m.a r0 = new m.a
            r1 = 29
            r0.<init>(r1)
            okhttp3.OkHttpClient$Builder r1 = new okhttp3.OkHttpClient$Builder
            r1.<init>()
            okhttp3.OkHttpClient$Builder r0 = r1.cookieJar(r0)
            r1 = 15
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r1, r3)
            r1 = 30
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r1, r3)
            okhttp3.OkHttpClient r0 = r0.build()
            x8.x.f21380a = r0
            return
    }

    public static void a(okhttp3.Request.Builder r2, java.lang.String r3) {
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r0 = og.m.t0(r3)
            if (r0 != 0) goto L21
            r0 = 0
            java.lang.String r1 = "Bearer "
            boolean r0 = og.t.d0(r3, r1, r0)
            if (r0 == 0) goto L18
            goto L1c
        L18:
            java.lang.String r3 = r1.concat(r3)
        L1c:
            java.lang.String r0 = "Authorization"
            r2.addHeader(r0, r3)
        L21:
            return
    }

    public static void b(okhttp3.Request.Builder r2, java.lang.String r3) {
            java.lang.String r0 = "User-Agent"
            java.lang.String r1 = "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0 Mobile Safari/537.36"
            r2.header(r0, r1)
            java.lang.String r0 = "Accept"
            java.lang.String r1 = "*/*"
            r2.header(r0, r1)
            java.lang.String r0 = "Accept-Language"
            java.lang.String r1 = "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7"
            r2.header(r0, r1)
            java.lang.String r0 = "/api/auth/"
            r1 = 0
            boolean r0 = og.t.d0(r3, r0, r1)
            java.lang.String r1 = "Referer"
            if (r0 == 0) goto L26
            java.lang.String r0 = "https://xiaozhi.me/login"
            r2.header(r1, r0)
            goto L2b
        L26:
            java.lang.String r0 = "https://xiaozhi.me/console/agents"
            r2.header(r1, r0)
        L2b:
            java.lang.String r0 = "/api/auth/send-code"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "/api/auth/phone-login"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L3c
            goto L3d
        L3c:
            return
        L3d:
            java.lang.String r3 = "Origin"
            java.lang.String r0 = "https://xiaozhi.me"
            r2.header(r3, r0)
            return
    }

    public static org.json.JSONObject c(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "/api/agents/"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            x8.w r2 = i(r3, r2)
            boolean r3 = r2.f21378b
            if (r3 == 0) goto L66
            java.lang.String r2 = r2.f21379c
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L2e
            java.lang.String r2 = "{}"
        L2e:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r2)
            java.lang.String r2 = "success"
            r0 = 0
            boolean r2 = r3.optBoolean(r2, r0)
            if (r2 != 0) goto L4f
            java.lang.String r2 = "message"
            java.lang.String r2 = r3.optString(r2)
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L4a
            java.lang.String r2 = "拉取智能体配置失败"
        L4a:
            ah.a.h(r2)
        L4d:
            r2 = 0
            return r2
        L4f:
            java.lang.String r2 = "data"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            if (r2 == 0) goto L60
            java.lang.String r3 = "agent"
            org.json.JSONObject r2 = r2.optJSONObject(r3)
            if (r2 == 0) goto L60
            return r2
        L60:
            java.lang.String r2 = "智能体配置为空"
            j8.o.A(r2)
            goto L4d
        L66:
            int r2 = r2.f21377a
            java.lang.String r3 = "拉取智能体配置失败: HTTP "
            okio.a.d(r2, r3)
            goto L4d
    }

    public static uf.c d(java.lang.String r13) {
            r13.getClass()
            java.lang.String r0 = "/api/agents?page=1&pageSize=24"
            x8.w r13 = i(r0, r13)
            boolean r0 = r13.f21378b
            if (r0 == 0) goto Le8
            java.lang.String r13 = r13.f21379c
            boolean r0 = og.m.t0(r13)
            if (r0 == 0) goto L17
            java.lang.String r13 = "{}"
        L17:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r13)
            java.lang.String r13 = "success"
            r1 = 0
            boolean r13 = r0.optBoolean(r13, r1)
            if (r13 != 0) goto L38
            java.lang.String r13 = "message"
            java.lang.String r13 = r0.optString(r13)
            boolean r0 = og.m.t0(r13)
            if (r0 == 0) goto L33
            java.lang.String r13 = "拉取智能体失败"
        L33:
            ah.a.h(r13)
            r13 = 0
            return r13
        L38:
            java.lang.String r13 = "data"
            org.json.JSONArray r13 = r0.optJSONArray(r13)
            if (r13 == 0) goto L42
        L40:
            r0 = r13
            goto L48
        L42:
            org.json.JSONArray r13 = new org.json.JSONArray
            r13.<init>()
            goto L40
        L48:
            uf.c r2 = a.a.E()
            int r3 = r0.length()
            r13 = r1
        L51:
            if (r13 < r3) goto L6d
            uf.c r13 = a.a.t(r2)
            int r0 = r13.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "智能体列表已拉取 count="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            j(r0)
            return r13
        L6d:
            org.json.JSONObject r4 = r0.optJSONObject(r13)
            if (r4 == 0) goto Le4
            java.lang.String r5 = "id"
            java.lang.String r6 = r4.optString(r5)
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto La6
            r6 = 0
            long r8 = r4.optLong(r5, r6)
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 <= 0) goto L8f
            r6 = 1
            goto L90
        L8f:
            r6 = r1
        L90:
            r7 = 0
            if (r6 == 0) goto L94
            goto L95
        L94:
            r5 = r7
        L95:
            if (r5 == 0) goto L9f
            long r5 = r5.longValue()
            java.lang.String r7 = java.lang.String.valueOf(r5)
        L9f:
            if (r7 != 0) goto La5
            java.lang.String r5 = ""
            r6 = r5
            goto La6
        La5:
            r6 = r7
        La6:
            r8 = r6
            boolean r5 = og.m.t0(r8)
            if (r5 == 0) goto Lae
            goto Le4
        Lae:
            java.lang.String r5 = "agent_name"
            java.lang.String r5 = r4.optString(r5)
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto Lc0
            java.lang.String r5 = "智能体 "
            java.lang.String r5 = r5.concat(r8)
        Lc0:
            r9 = r5
            java.lang.String r5 = "assistant_name"
            java.lang.String r10 = r4.optString(r5)
            r10.getClass()
            java.lang.String r5 = "llm_model"
            java.lang.String r11 = r4.optString(r5)
            r11.getClass()
            java.lang.String r5 = "tts_voice"
            java.lang.String r12 = r4.optString(r5)
            r12.getClass()
            x8.v r7 = new x8.v
            r7.<init>(r8, r9, r10, r11, r12)
            r2.add(r7)
        Le4:
            int r13 = r13 + 1
            goto L51
        Le8:
            int r13 = r13.f21377a
            java.lang.String r0 = "拉取智能体失败: HTTP "
            okio.a.d(r13, r0)
            r13 = 0
            return r13
    }

    public static java.lang.String e() {
            java.lang.String r0 = "/api/auth/captcha"
            java.lang.String r1 = ""
            x8.w r0 = i(r0, r1)
            boolean r1 = r0.f21378b
            if (r1 == 0) goto L34
            java.lang.String r0 = r0.f21379c
            java.lang.String r1 = "<svg"
            r2 = 1
            boolean r1 = og.m.h0(r0, r1, r2)
            if (r1 == 0) goto L2d
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "图形验证码已刷新 len="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            j(r1)
            return r0
        L2d:
            java.lang.String r0 = "图形验证码格式异常"
            j8.o.A(r0)
            r0 = 0
            return r0
        L34:
            int r0 = r0.f21377a
            java.lang.String r1 = "图形验证码请求失败: HTTP "
            okio.a.d(r0, r1)
            r0 = 0
            return r0
    }

    public static x8.y f(java.lang.String r7, java.lang.String r8) {
            r7.getClass()
            r8.getClass()
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            boolean r0 = og.m.t0(r8)
            if (r0 != 0) goto Lc6
            java.lang.String r0 = "agent_"
            r1 = 0
            boolean r2 = og.t.d0(r8, r0, r1)
            if (r2 == 0) goto L1e
            goto L22
        L1e:
            java.lang.String r8 = r0.concat(r8)
        L22:
            java.lang.String r0 = "https://api.xiaozhi.me/mcp/endpoints/list?endpoint_ids="
            java.lang.String r8 = r0.concat(r8)
            x8.w r7 = i(r8, r7)
            java.lang.String r8 = r7.f21379c
            boolean r0 = r7.f21378b
            if (r0 != 0) goto L51
            int r7 = r7.f21377a
            r0 = 304(0x130, float:4.26E-43)
            if (r7 != r0) goto L39
            goto L51
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "查询 MCP 状态失败: HTTP "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L51:
            boolean r7 = og.m.t0(r8)
            if (r7 == 0) goto L61
            x8.y r7 = new x8.y
            java.lang.String r8 = "未知"
            java.lang.String r0 = "控制台返回空内容，请稍后刷新"
            r7.<init>(r8, r0, r1)
            return r7
        L61:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>(r8)
            java.lang.String r8 = "endpoints"
            org.json.JSONArray r7 = r7.optJSONArray(r8)
            java.lang.String r8 = "离线"
            if (r7 == 0) goto Lbe
            org.json.JSONObject r7 = r7.optJSONObject(r1)
            if (r7 == 0) goto Lbe
            java.lang.String r0 = "connectionCount"
            int r0 = r7.optInt(r0, r1)
            java.lang.String r2 = "status"
            java.lang.String r2 = r7.optString(r2)
            java.lang.String r3 = "tools"
            org.json.JSONArray r7 = r7.optJSONArray(r3)
            if (r7 == 0) goto L8f
            int r7 = r7.length()
            goto L90
        L8f:
            r7 = r1
        L90:
            if (r0 > 0) goto La2
            java.lang.String r3 = "connected"
            boolean r3 = og.t.X(r2, r3)
            if (r3 != 0) goto La2
            java.lang.String r3 = "online"
            boolean r3 = og.t.X(r2, r3)
            if (r3 == 0) goto La3
        La2:
            r1 = 1
        La3:
            x8.y r3 = new x8.y
            if (r1 == 0) goto La9
            java.lang.String r8 = "在线"
        La9:
            java.lang.String r4 = "，连接数="
            java.lang.String r5 = "，工具="
            java.lang.String r6 = "控制台 status="
            java.lang.StringBuilder r0 = eh.a.u(r0, r6, r2, r4, r5)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r3.<init>(r8, r7, r1)
            return r3
        Lbe:
            x8.y r7 = new x8.y
            java.lang.String r0 = "控制台未返回接入点"
            r7.<init>(r8, r0, r1)
            return r7
        Lc6:
            java.lang.String r7 = "请先选择小智智能体"
            j8.o.A(r7)
            r7 = 0
            return r7
    }

    public static uf.c g(java.lang.String r6) {
            r6.getClass()
            java.lang.String r0 = "/api/roles/model-list"
            x8.w r6 = i(r0, r6)
            boolean r0 = r6.f21378b
            if (r0 == 0) goto L93
            java.lang.String r6 = r6.f21379c
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L17
            java.lang.String r6 = "{}"
        L17:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            java.lang.String r6 = "data"
            org.json.JSONObject r6 = r0.optJSONObject(r6)
            if (r6 == 0) goto L2e
            java.lang.String r0 = "modelList"
            org.json.JSONArray r6 = r6.optJSONArray(r0)
            if (r6 == 0) goto L2e
        L2c:
            r0 = r6
            goto L34
        L2e:
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            goto L2c
        L34:
            uf.c r1 = a.a.E()
            int r2 = r0.length()
            r6 = 0
        L3d:
            if (r6 < r2) goto L59
            uf.c r6 = a.a.t(r1)
            int r0 = r6.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "模型列表已拉取 count="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            j(r0)
            return r6
        L59:
            org.json.JSONObject r3 = r0.optJSONObject(r6)
            if (r3 == 0) goto L90
            java.lang.String r4 = "name"
            java.lang.String r4 = r3.optString(r4)
            boolean r5 = og.m.t0(r4)
            if (r5 == 0) goto L71
            java.lang.String r4 = "model"
            java.lang.String r4 = r3.optString(r4)
        L71:
            r4.getClass()
            boolean r5 = og.m.t0(r4)
            if (r5 == 0) goto L7b
            goto L90
        L7b:
            java.lang.String r5 = "description"
            java.lang.String r3 = r3.optString(r5)
            boolean r5 = og.m.t0(r3)
            if (r5 == 0) goto L88
            r3 = r4
        L88:
            x8.z r5 = new x8.z
            r5.<init>(r4, r3)
            r1.add(r5)
        L90:
            int r6 = r6 + 1
            goto L3d
        L93:
            int r6 = r6.f21377a
            java.lang.String r0 = "拉取模型列表失败: HTTP "
            okio.a.d(r6, r0)
            r6 = 0
            return r6
    }

    public static uf.c h(java.lang.String r13) {
            r13.getClass()
            java.lang.String r0 = "/api/roles/tts-list"
            x8.w r13 = i(r0, r13)
            boolean r0 = r13.f21378b
            if (r0 == 0) goto Lbc
            java.lang.String r13 = r13.f21379c
            boolean r0 = og.m.t0(r13)
            if (r0 == 0) goto L17
            java.lang.String r13 = "{}"
        L17:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r13)
            java.lang.String r13 = "data"
            org.json.JSONObject r13 = r0.optJSONObject(r13)
            if (r13 == 0) goto L2e
            java.lang.String r0 = "ttsList"
            org.json.JSONArray r13 = r13.optJSONArray(r0)
            if (r13 == 0) goto L2e
        L2c:
            r0 = r13
            goto L34
        L2e:
            org.json.JSONArray r13 = new org.json.JSONArray
            r13.<init>()
            goto L2c
        L34:
            uf.c r1 = a.a.E()
            int r2 = r0.length()
            r3 = 0
            r13 = r3
        L3e:
            if (r13 < r2) goto L5a
            uf.c r13 = a.a.t(r1)
            int r0 = r13.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "语音角色列表已拉取 count="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            j(r0)
            return r13
        L5a:
            org.json.JSONObject r4 = r0.optJSONObject(r13)
            if (r4 == 0) goto Lb9
            java.lang.String r5 = "voice_id"
            java.lang.String r5 = r4.optString(r5)
            r5.getClass()
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L70
            goto Lb9
        L70:
            java.lang.String r6 = "languages"
            org.json.JSONArray r6 = r4.optJSONArray(r6)
            r7 = 0
            if (r6 == 0) goto La0
            uf.c r8 = a.a.E()
            int r9 = r6.length()
            r10 = r3
        L82:
            if (r10 < r9) goto L89
            uf.c r7 = a.a.t(r8)
            goto La0
        L89:
            java.lang.String r11 = r6.optString(r10)
            r11.getClass()
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto L97
            goto L98
        L97:
            r11 = r7
        L98:
            if (r11 == 0) goto L9d
            r8.add(r11)
        L9d:
            int r10 = r10 + 1
            goto L82
        La0:
            if (r7 != 0) goto La4
            tf.t r7 = tf.t.f13167g
        La4:
            java.lang.String r6 = "name"
            java.lang.String r4 = r4.optString(r6)
            boolean r6 = og.m.t0(r4)
            if (r6 == 0) goto Lb1
            r4 = r5
        Lb1:
            x8.a0 r6 = new x8.a0
            r6.<init>(r5, r4, r7)
            r1.add(r6)
        Lb9:
            int r13 = r13 + 1
            goto L3e
        Lbc:
            int r13 = r13.f21377a
            java.lang.String r0 = "拉取语音角色失败: HTTP "
            okio.a.d(r13, r0)
            r13 = 0
            return r13
    }

    public static x8.w i(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "http://"
            r1 = 0
            boolean r0 = og.t.d0(r3, r0, r1)
            if (r0 != 0) goto L19
            java.lang.String r0 = "https://"
            boolean r0 = og.t.d0(r3, r0, r1)
            if (r0 == 0) goto L12
            goto L19
        L12:
            java.lang.String r0 = "https://xiaozhi.me"
            java.lang.String r0 = r0.concat(r3)
            goto L1a
        L19:
            r0 = r3
        L1a:
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder
            r1.<init>()
            okhttp3.Request$Builder r0 = r1.url(r0)
            b(r0, r3)
            a(r0, r4)
            okhttp3.Request$Builder r3 = r0.get()
            okhttp3.Request r3 = r3.build()
            okhttp3.OkHttpClient r4 = x8.x.f21380a
            okhttp3.Call r3 = r4.newCall(r3)
            okhttp3.Response r3 = r3.execute()
            x8.w r4 = new x8.w     // Catch: java.lang.Throwable -> L50
            int r0 = r3.code()     // Catch: java.lang.Throwable -> L50
            boolean r1 = r3.isSuccessful()     // Catch: java.lang.Throwable -> L50
            okhttp3.ResponseBody r2 = r3.body()     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L52
            java.lang.String r2 = r2.string()     // Catch: java.lang.Throwable -> L50
            goto L53
        L50:
            r4 = move-exception
            goto L5e
        L52:
            r2 = 0
        L53:
            if (r2 != 0) goto L57
            java.lang.String r2 = ""
        L57:
            r4.<init>(r2, r0, r1)     // Catch: java.lang.Throwable -> L50
            r3.close()
            return r4
        L5e:
            throw r4     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            ig.a.i(r3, r4)
            throw r0
    }

    public static void j(java.lang.String r1) {
            java.lang.String r0 = "[Hchat:XiaozhiConsole] "
            java.lang.String r1 = r0.concat(r1)
            de.robv.android.xposed.XposedBridge.log(r1)
            return
    }

    public static java.lang.String k(java.lang.String r3) {
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = " "
            java.lang.String r1 = ""
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "-"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "+"
            boolean r1 = og.t.d0(r3, r0, r2)
            if (r1 == 0) goto L20
            return r3
        L20:
            java.lang.String r1 = "86"
            boolean r1 = og.t.d0(r3, r1, r2)
            if (r1 == 0) goto L35
            int r1 = r3.length()
            r2 = 13
            if (r1 != r2) goto L35
            java.lang.String r3 = r0.concat(r3)
            return r3
        L35:
            java.lang.String r0 = "+86"
            java.lang.String r3 = r0.concat(r3)
            return r3
    }

    public static java.lang.String l(java.lang.String r5, java.lang.String r6) {
            r5.getClass()
            r6.getClass()
            java.lang.String r5 = k(r5)
            java.lang.String r0 = "phone"
            org.json.JSONObject r0 = wb.en.k(r0, r5)
            java.lang.CharSequence r1 = og.m.R0(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "code"
            r0.put(r2, r1)
            int r1 = r5.length()
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            int r6 = r6.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "手机号登录请求: phoneLen="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " codeLen="
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            j(r6)
            java.lang.String r6 = "/api/auth/phone-login"
            java.lang.String r1 = ""
            x8.w r6 = m(r6, r1, r0)
            int r0 = r6.f21377a
            java.lang.String r2 = r6.f21379c
            boolean r6 = r6.f21378b
            java.lang.String r3 = " body="
            if (r6 == 0) goto Lc8
            boolean r6 = og.m.t0(r2)
            if (r6 == 0) goto L61
            java.lang.String r6 = "{}"
            goto L62
        L61:
            r6 = r2
        L62:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            java.lang.String r6 = "success"
            r4 = 0
            boolean r6 = r0.optBoolean(r6, r4)
            if (r6 != 0) goto La2
            int r5 = r5.length()
            java.lang.String r6 = o(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "手机号登录业务失败: phoneLen="
            r1.<init>(r2)
            r1.append(r5)
            r1.append(r3)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            j(r5)
            java.lang.String r5 = "message"
            java.lang.String r5 = r0.optString(r5)
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L9d
            java.lang.String r5 = "登录失败"
        L9d:
            ah.a.h(r5)
        La0:
            r5 = 0
            return r5
        La2:
            java.lang.String r5 = "data"
            org.json.JSONObject r5 = r0.optJSONObject(r5)
            if (r5 == 0) goto Lb1
            java.lang.String r6 = "token"
            java.lang.String r5 = r5.optString(r6)
            goto Lb2
        Lb1:
            r5 = 0
        Lb2:
            if (r5 != 0) goto Lb5
            goto Lb6
        Lb5:
            r1 = r5
        Lb6:
            boolean r5 = og.m.t0(r1)
            if (r5 != 0) goto Lc2
            java.lang.String r5 = "手机号登录成功 tokenPresent=true"
            j(r5)
            return r1
        Lc2:
            java.lang.String r5 = "登录成功但未返回 token"
            j8.o.A(r5)
            goto La0
        Lc8:
            int r5 = r5.length()
            java.lang.String r6 = o(r2)
            java.lang.String r1 = "手机号登录失败: HTTP "
            java.lang.String r4 = " phoneLen="
            java.lang.StringBuilder r5 = eh.a.s(r0, r5, r1, r4, r3)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            j(r5)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = n(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "登录失败: HTTP "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public static x8.w m(java.lang.String r2, java.lang.String r3, org.json.JSONObject r4) {
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            java.lang.String r1 = "https://xiaozhi.me"
            java.lang.String r1 = r1.concat(r2)
            okhttp3.Request$Builder r0 = r0.url(r1)
            b(r0, r2)
            a(r0, r3)
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/json"
            okhttp3.Request$Builder r2 = r0.addHeader(r2, r3)
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion
            java.lang.String r4 = r4.toString()
            r4.getClass()
            okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
            okhttp3.MediaType r3 = r1.get(r3)
            okhttp3.RequestBody r3 = r0.create(r4, r3)
            okhttp3.Request$Builder r2 = r2.post(r3)
            okhttp3.Request r2 = r2.build()
            okhttp3.OkHttpClient r3 = x8.x.f21380a
            okhttp3.Call r2 = r3.newCall(r2)
            okhttp3.Response r2 = r2.execute()
            x8.w r3 = new x8.w     // Catch: java.lang.Throwable -> L57
            int r4 = r2.code()     // Catch: java.lang.Throwable -> L57
            boolean r0 = r2.isSuccessful()     // Catch: java.lang.Throwable -> L57
            okhttp3.ResponseBody r1 = r2.body()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L59
            java.lang.String r1 = r1.string()     // Catch: java.lang.Throwable -> L57
            goto L5a
        L57:
            r3 = move-exception
            goto L65
        L59:
            r1 = 0
        L5a:
            if (r1 != 0) goto L5e
            java.lang.String r1 = ""
        L5e:
            r3.<init>(r1, r4, r0)     // Catch: java.lang.Throwable -> L57
            r2.close()
            return r3
        L65:
            throw r3     // Catch: java.lang.Throwable -> L66
        L66:
            r4 = move-exception
            ig.a.i(r2, r3)
            throw r4
    }

    public static java.lang.String n(java.lang.String r3) {
            boolean r0 = og.m.t0(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "message"
            java.lang.String r3 = r0.optString(r3)     // Catch: java.lang.Throwable -> L21
            boolean r2 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L23
            java.lang.String r3 = "msg"
            java.lang.String r3 = r0.optString(r3)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r3 = move-exception
            goto L30
        L23:
            boolean r2 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L36
            java.lang.String r3 = "code"
            java.lang.String r3 = r0.optString(r3)     // Catch: java.lang.Throwable -> L21
            goto L36
        L30:
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L36:
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto L3c
            goto L3d
        L3c:
            r1 = r3
        L3d:
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            r3 = 80
            java.lang.String r3 = og.m.P0(r3, r1)
            return r3
    }

    public static java.lang.String o(java.lang.String r2) {
            java.lang.String r0 = "\"token\"\\s*:\\s*\"[^\"]+\""
            java.lang.String r1 = "\"token\":\"***\""
            java.lang.String r2 = j8.b.h(r0, r2, r1)
            java.lang.String r0 = "\"phone\"\\s*:\\s*\"[^\"]+\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = "\"phone\":\"***\""
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r1)
            r2.getClass()
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r2 = og.m.P0(r0, r2)
            return r2
    }

    public static x8.v p(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
            r15.getClass()
            r16.getClass()
            org.json.JSONObject r0 = c(r15, r16)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "agent_name"
            java.lang.String r3 = r0.optString(r2)
            r1.put(r2, r3)
            java.lang.String r3 = "assistant_name"
            java.lang.String r4 = r0.optString(r3)
            r1.put(r3, r4)
            r4 = 0
            if (r17 == 0) goto L2d
            java.lang.CharSequence r5 = og.m.R0(r17)
            java.lang.String r5 = r5.toString()
            goto L2e
        L2d:
            r5 = r4
        L2e:
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L3b
            boolean r8 = og.m.t0(r5)
            if (r8 == 0) goto L39
            goto L3b
        L39:
            r8 = r7
            goto L3c
        L3b:
            r8 = r6
        L3c:
            if (r8 != 0) goto L3f
            goto L40
        L3f:
            r5 = r4
        L40:
            java.lang.String r8 = "llm_model"
            if (r5 == 0) goto L45
            goto L49
        L45:
            java.lang.String r5 = r0.optString(r8)
        L49:
            r1.put(r8, r5)
            if (r18 == 0) goto L57
            java.lang.CharSequence r5 = og.m.R0(r18)
            java.lang.String r5 = r5.toString()
            goto L58
        L57:
            r5 = r4
        L58:
            if (r5 == 0) goto L63
            boolean r9 = og.m.t0(r5)
            if (r9 == 0) goto L61
            goto L63
        L61:
            r9 = r7
            goto L64
        L63:
            r9 = r6
        L64:
            if (r9 != 0) goto L67
            r4 = r5
        L67:
            java.lang.String r5 = "tts_voice"
            if (r4 == 0) goto L6c
            goto L70
        L6c:
            java.lang.String r4 = r0.optString(r5)
        L70:
            r1.put(r5, r4)
            java.lang.String r4 = "tts_speech_speed"
            java.lang.String r9 = r0.optString(r4)
            boolean r10 = og.m.t0(r9)
            if (r10 == 0) goto L81
            java.lang.String r9 = "normal"
        L81:
            r1.put(r4, r9)
            java.lang.String r4 = "tts_pitch"
            java.lang.Object r9 = r0.opt(r4)
            if (r9 == 0) goto L8d
            goto L91
        L8d:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
        L91:
            r1.put(r4, r9)
            java.lang.String r4 = "asr_speed"
            java.lang.String r9 = r0.optString(r4)
            r1.put(r4, r9)
            java.lang.String r4 = "language"
            java.lang.String r9 = r0.optString(r4)
            boolean r10 = og.m.t0(r9)
            if (r10 == 0) goto Lb7
            java.lang.String r9 = "lang_code"
            java.lang.String r9 = r0.optString(r9)
            boolean r10 = og.m.t0(r9)
            if (r10 == 0) goto Lb7
            java.lang.String r9 = "zh"
        Lb7:
            r1.put(r4, r9)
            java.lang.String r4 = "character"
            java.lang.String r9 = r0.optString(r4)
            r1.put(r4, r9)
            java.lang.String r4 = "memory"
            java.lang.String r9 = r0.optString(r4)
            r1.put(r4, r9)
            java.lang.String r4 = "memory_by_speaker"
            java.lang.Object r9 = r0.opt(r4)
            if (r9 == 0) goto Ld5
            goto Ld7
        Ld5:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
        Ld7:
            r1.put(r4, r9)
            java.lang.String r4 = "mcp_endpoints"
            org.json.JSONArray r9 = r0.optJSONArray(r4)
            if (r9 == 0) goto Le3
            goto Le8
        Le3:
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
        Le8:
            r1.put(r4, r9)
            java.lang.String r4 = "memory_type"
            java.lang.String r9 = r0.optString(r4)
            r1.put(r4, r9)
            java.lang.String r4 = "teen_mode"
            java.lang.Object r9 = r0.opt(r4)
            if (r9 == 0) goto Lfd
            goto Lff
        Lfd:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
        Lff:
            r1.put(r4, r9)
            java.lang.String r4 = "knowledge_base_ids"
            org.json.JSONArray r0 = r0.optJSONArray(r4)
            if (r0 == 0) goto L10b
            goto L110
        L10b:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L110:
            r1.put(r4, r0)
            java.lang.CharSequence r0 = og.m.R0(r16)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "/api/agents/"
            r4.<init>(r9)
            r4.append(r0)
            java.lang.String r0 = "/config"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            x8.w r0 = m(r0, r15, r1)
            boolean r1 = r0.f21378b
            if (r1 == 0) goto L1db
            java.lang.String r0 = r0.f21379c
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L140
            java.lang.String r0 = "{}"
        L140:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            java.lang.String r0 = "success"
            boolean r0 = r1.optBoolean(r0, r7)
            if (r0 != 0) goto L160
            java.lang.String r15 = "message"
            java.lang.String r15 = r1.optString(r15)
            boolean r0 = og.m.t0(r15)
            if (r0 == 0) goto L15b
            java.lang.String r15 = "保存智能体配置失败"
        L15b:
            ah.a.h(r15)
        L15e:
            r15 = 0
            return r15
        L160:
            if (r17 == 0) goto L16b
            boolean r0 = og.m.t0(r17)
            if (r0 == 0) goto L169
            goto L16b
        L169:
            r0 = r7
            goto L16c
        L16b:
            r0 = r6
        L16c:
            r0 = r0 ^ r6
            if (r18 == 0) goto L175
            boolean r1 = og.m.t0(r18)
            if (r1 == 0) goto L176
        L175:
            r7 = r6
        L176:
            r1 = r7 ^ 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "智能体配置已保存 agentId="
            r4.<init>(r6)
            r6 = r16
            r4.append(r6)
            java.lang.String r7 = " modelSet="
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = " voiceSet="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            j(r0)
            org.json.JSONObject r15 = c(r15, r16)
            java.lang.CharSequence r0 = og.m.R0(r6)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = r15.optString(r2)
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L1bf
            java.lang.CharSequence r0 = og.m.R0(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "智能体 "
            java.lang.String r0 = wb.en.g(r1, r0)
        L1bf:
            r11 = r0
            java.lang.String r12 = r15.optString(r3)
            r12.getClass()
            java.lang.String r13 = r15.optString(r8)
            r13.getClass()
            java.lang.String r14 = r15.optString(r5)
            r14.getClass()
            x8.v r9 = new x8.v
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
        L1db:
            int r15 = r0.f21377a
            java.lang.String r0 = "保存智能体配置失败: HTTP "
            okio.a.d(r15, r0)
            goto L15e
    }

    public static void q(java.lang.String r5, java.lang.String r6) {
            r5.getClass()
            r6.getClass()
            java.lang.String r5 = k(r5)
            java.lang.String r0 = "phone"
            org.json.JSONObject r0 = wb.en.k(r0, r5)
            java.lang.CharSequence r1 = og.m.R0(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "captcha_code"
            r0.put(r2, r1)
            int r1 = r5.length()
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            int r6 = r6.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "短信验证码请求: phoneLen="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " captchaLen="
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            j(r6)
            java.lang.String r6 = "/api/auth/send-code"
            java.lang.String r1 = ""
            x8.w r6 = m(r6, r1, r0)
            int r0 = r6.f21377a
            java.lang.String r1 = r6.f21379c
            boolean r6 = r6.f21378b
            java.lang.String r2 = " body="
            if (r6 == 0) goto Lb7
            boolean r6 = og.m.t0(r1)
            if (r6 == 0) goto L61
            java.lang.String r6 = "{}"
            goto L62
        L61:
            r6 = r1
        L62:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            java.lang.String r6 = "success"
            r3 = 0
            boolean r6 = r0.optBoolean(r6, r3)
            if (r6 != 0) goto La1
            int r5 = r5.length()
            java.lang.String r6 = o(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "短信验证码业务失败: phoneLen="
            r1.<init>(r3)
            r1.append(r5)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            j(r5)
            java.lang.String r5 = "message"
            java.lang.String r5 = r0.optString(r5)
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L9d
            java.lang.String r5 = "短信验证码请求失败"
        L9d:
            ah.a.h(r5)
            return
        La1:
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "短信验证码已发送 phoneLen="
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            j(r5)
            return
        Lb7:
            int r5 = r5.length()
            java.lang.String r6 = o(r1)
            java.lang.String r3 = " phoneLen="
            java.lang.String r4 = "短信验证码请求失败: HTTP "
            java.lang.StringBuilder r5 = eh.a.s(r0, r5, r4, r3, r2)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            j(r5)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = n(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }
}
