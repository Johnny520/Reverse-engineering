package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements okhttp3.Dns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3838a;

    static {
            return
    }

    public /* synthetic */ w(int r1) {
            r0 = this;
            r0.f3838a = r1
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1, java.lang.String r2, java.lang.String r3, org.json.JSONObject r4) {
            r1.getClass()
            r3.getClass()
            org.json.JSONArray r1 = t(r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            boolean r4 = og.m.t0(r2)
            if (r4 != 0) goto L1e
            java.lang.String r4 = "hchat_message_id"
            r0.put(r4, r2)
        L1e:
            boolean r2 = og.m.t0(r3)
            if (r2 != 0) goto L29
            java.lang.String r2 = "hchat_runtime_state"
            r0.put(r2, r3)
        L29:
            r1.put(r0)
            java.lang.String r1 = r1.toString()
            r1.getClass()
            return r1
    }

    public static /* synthetic */ java.lang.String b(java.lang.String r1, org.json.JSONObject r2, java.lang.String r3, int r4) {
            r4 = r4 & 8
            java.lang.String r0 = ""
            if (r4 == 0) goto L7
            r3 = r0
        L7:
            java.lang.String r1 = a(r1, r0, r3, r2)
            return r1
    }

    public static java.lang.String c(java.lang.String r1) {
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r1.getClass()
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = " "
            java.lang.String r1 = r1.replaceAll(r0)
            r1.getClass()
            r0 = 32
            java.lang.String r1 = og.m.P0(r0, r1)
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L2f
            java.lang.String r1 = "未命名配置"
        L2f:
            return r1
    }

    public static boolean d(java.lang.String r5, java.lang.String r6) {
            r5.getClass()
            r6.getClass()
            boolean r0 = og.m.t0(r6)
            r1 = 0
            if (r0 == 0) goto Le
            goto L19
        Le:
            org.json.JSONArray r5 = t(r5)
            int r0 = r5.length()
            r2 = r1
        L17:
            if (r2 < r0) goto L1a
        L19:
            return r1
        L1a:
            org.json.JSONObject r3 = r5.optJSONObject(r2)
            if (r3 == 0) goto L27
            java.lang.String r4 = "hchat_message_id"
            java.lang.String r3 = r3.optString(r4)
            goto L28
        L27:
            r3 = 0
        L28:
            boolean r3 = gg.l.a(r3, r6)
            if (r3 == 0) goto L30
            r5 = 1
            return r5
        L30:
            int r2 = r2 + 1
            goto L17
    }

    public static fb.t0 e(android.content.Context r5, java.lang.String r6, fb.v r7) {
            r6.getClass()
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)
            java.util.List r0 = i(r0)
            java.lang.String r6 = c(r6)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L18
            goto L38
        L18:
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            fb.t0 r1 = (fb.t0) r1
            java.lang.String r1 = r1.f3784b
            boolean r1 = og.t.X(r1, r6)
            if (r1 != 0) goto L31
            goto L1c
        L31:
            java.lang.String r5 = "配置名称已存在"
            j8.o.t(r5)
            r5 = 0
            return r5
        L38:
            fb.t0 r0 = new fb.t0
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r4 = "-"
            java.lang.String r1 = og.t.a0(r1, r4, r2, r3)
            fb.v r7 = q(r7)
            r0.<init>(r1, r6, r7)
            x(r5, r0)
            return r0
    }

    public static fb.v f(org.json.JSONObject r18) {
            r0 = r18
            java.lang.String r1 = "mcpServers"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            if (r1 == 0) goto L79
            uf.c r5 = a.a.E()
            int r6 = r1.length()
            r7 = r2
        L17:
            if (r7 < r6) goto L21
            uf.c r1 = a.a.t(r5)
            if (r1 == 0) goto L79
        L1f:
            r10 = r1
            goto L90
        L21:
            org.json.JSONObject r8 = r1.optJSONObject(r7)
            if (r8 == 0) goto L76
            fb.r0 r9 = new fb.r0
            int r10 = r7 + 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "mcp-"
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "id"
            java.lang.String r11 = r8.optString(r12, r11)
            r11.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "MCP "
            r12.<init>(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            java.lang.String r12 = "name"
            java.lang.String r10 = r8.optString(r12, r10)
            r10.getClass()
            java.lang.String r12 = "enabled"
            boolean r14 = r8.optBoolean(r12, r3)
            java.lang.String r12 = "endpoint"
            java.lang.String r12 = r8.optString(r12, r4)
            java.lang.String r13 = "authorization"
            java.lang.String r13 = j8.b.i(r12, r13, r4, r8)
            r17 = r11
            r11 = r10
            r10 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            r5.add(r9)
        L76:
            int r7 = r7 + 1
            goto L17
        L79:
            java.lang.String r1 = "mcpEnabled"
            boolean r1 = r0.optBoolean(r1, r2)
            java.lang.String r2 = "mcpEndpoint"
            java.lang.String r2 = r0.optString(r2, r4)
            java.lang.String r5 = "mcpAuthorization"
            java.lang.String r5 = j8.b.i(r2, r5, r4, r0)
            java.util.List r1 = m(r2, r5, r1)
            goto L1f
        L90:
            fb.v r5 = new fb.v
            java.lang.String r1 = "apiBaseUrl"
            java.lang.String r1 = r0.optString(r1, r4)
            java.lang.String r2 = "apiEndpoint"
            java.lang.String r6 = r0.optString(r2, r1)
            r6.getClass()
            java.lang.String r1 = "apiPath"
            java.lang.String r7 = r0.optString(r1, r4)
            java.lang.String r1 = "apiKey"
            java.lang.String r8 = j8.b.i(r7, r1, r4, r0)
            java.lang.String r1 = "model"
            java.lang.String r2 = "deepseek-ai/DeepSeek-V3"
            java.lang.String r9 = r0.optString(r1, r2)
            r9.getClass()
            java.lang.String r1 = "autoCompactEnabled"
            boolean r11 = r0.optBoolean(r1, r3)
            java.lang.String r1 = "compactTokenThreshold"
            r2 = 24000(0x5dc0, float:3.3631E-41)
            int r12 = r0.optInt(r1, r2)
            java.lang.String r1 = "webSearchEnabled"
            boolean r13 = r0.optBoolean(r1, r3)
            java.lang.String r1 = "workspaceWriteApprovalMode"
            java.lang.String r2 = "ask"
            java.lang.String r14 = r0.optString(r1, r2)
            java.lang.String r1 = "promptCacheMode"
            java.lang.String r2 = "force"
            java.lang.String r15 = j8.b.i(r14, r1, r2, r0)
            java.lang.String r1 = "endpointMode"
            java.lang.String r2 = "openai_compatible"
            java.lang.String r16 = r0.optString(r1, r2)
            r16.getClass()
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            fb.v r0 = q(r5)
            return r0
    }

    public static fb.t0 g(android.content.Context r5, java.lang.String r6) {
            r6.getClass()
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r5 = ub.b.c(r5, r0)
            java.util.List r0 = i(r5)
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L86
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            r4 = r3
            fb.t0 r4 = (fb.t0) r4
            java.lang.String r4 = r4.f3783a
            boolean r4 = gg.l.a(r4, r6)
            if (r4 != 0) goto L1d
            r1.add(r3)
            goto L1d
        L36:
            int r2 = r1.size()
            int r0 = r0.size()
            if (r2 == r0) goto L7f
            java.lang.String r0 = "script_plugin_agent_active_profile"
            java.lang.String r2 = ""
            java.lang.String r0 = r5.getString(r0, r2)
            if (r0 != 0) goto L4b
            goto L4c
        L4b:
            r2 = r0
        L4c:
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L59
        L52:
            java.lang.Object r6 = tf.m.t1(r1)
            fb.t0 r6 = (fb.t0) r6
            goto L79
        L59:
            java.util.Iterator r6 = r1.iterator()
        L5d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r6.next()
            r3 = r0
            fb.t0 r3 = (fb.t0) r3
            java.lang.String r3 = r3.f3783a
            boolean r3 = gg.l.a(r3, r2)
            if (r3 == 0) goto L5d
            goto L74
        L73:
            r0 = 0
        L74:
            r6 = r0
            fb.t0 r6 = (fb.t0) r6
            if (r6 == 0) goto L52
        L79:
            java.lang.String r0 = r6.f3783a
            y(r5, r1, r0)
            return r6
        L7f:
            java.lang.String r5 = "配置不存在"
            j8.o.t(r5)
        L84:
            r5 = 0
            return r5
        L86:
            java.lang.String r5 = "至少保留一个配置"
            j8.o.t(r5)
            goto L84
    }

    public static java.lang.String h(java.util.List r7) {
            java.lang.String r0 = "chat"
            java.lang.String r1 = "completions"
            java.lang.String r2 = "v1"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            java.util.ArrayList r1 = tf.m.F1(r7, r0)
            r5 = 0
            r6 = 62
            java.lang.String r2 = "/"
            r3 = 0
            r4 = 0
            java.lang.String r7 = tf.m.A1(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "/"
            java.lang.String r7 = r0.concat(r7)
            return r7
    }

    public static java.util.List i(android.content.SharedPreferences r17) {
            r1 = r17
            java.lang.String r0 = "script_plugin_agent_profiles_v1"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 != 0) goto Ld
            r0 = r2
        Ld:
            boolean r3 = og.m.t0(r0)
            r4 = 0
            tf.t r5 = tf.t.f13167g
            if (r3 == 0) goto L18
            goto L8a
        L18:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            uf.c r0 = a.a.E()     // Catch: java.lang.Throwable -> L2d
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L2d
            r7 = r4
        L26:
            if (r7 < r6) goto L2f
            uf.c r0 = a.a.t(r0)     // Catch: java.lang.Throwable -> L2d
            goto L81
        L2d:
            r0 = move-exception
            goto L7b
        L2f:
            org.json.JSONObject r8 = r3.optJSONObject(r7)     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L78
            java.lang.String r9 = "id"
            java.lang.String r9 = r8.optString(r9, r2)     // Catch: java.lang.Throwable -> L2d
            r9.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.CharSequence r9 = og.m.R0(r9)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r10 = "name"
            java.lang.String r10 = r8.optString(r10, r2)     // Catch: java.lang.Throwable -> L2d
            r10.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.CharSequence r10 = og.m.R0(r10)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r11 = "config"
            org.json.JSONObject r8 = r8.optJSONObject(r11)     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L78
            boolean r11 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L2d
            if (r11 != 0) goto L78
            boolean r11 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L2d
            if (r11 == 0) goto L6c
            goto L78
        L6c:
            fb.t0 r11 = new fb.t0     // Catch: java.lang.Throwable -> L2d
            fb.v r8 = f(r8)     // Catch: java.lang.Throwable -> L2d
            r11.<init>(r9, r10, r8)     // Catch: java.lang.Throwable -> L2d
            r0.add(r11)     // Catch: java.lang.Throwable -> L2d
        L78:
            int r7 = r7 + 1
            goto L26
        L7b:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L81:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L87
            goto L88
        L87:
            r5 = r0
        L88:
            java.util.List r5 = (java.util.List) r5
        L8a:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L91
            return r5
        L91:
            fb.t0 r0 = new fb.t0
            fb.v r5 = new fb.v
            java.lang.String r3 = "script_plugin_agent_api_base"
            java.lang.String r3 = r1.getString(r3, r2)
            if (r3 != 0) goto L9f
            r6 = r2
            goto La0
        L9f:
            r6 = r3
        La0:
            java.lang.String r3 = "script_plugin_agent_api_path"
            java.lang.String r7 = "/chat/completions"
            java.lang.String r3 = r1.getString(r3, r7)
            if (r3 != 0) goto Lac
            r7 = r2
            goto Lad
        Lac:
            r7 = r3
        Lad:
            java.lang.String r3 = "script_plugin_agent_api_key"
            java.lang.String r3 = r1.getString(r3, r2)
            if (r3 != 0) goto Lb7
            r8 = r2
            goto Lb8
        Lb7:
            r8 = r3
        Lb8:
            java.lang.String r3 = "script_plugin_agent_model"
            java.lang.String r9 = "deepseek-ai/DeepSeek-V3"
            java.lang.String r3 = r1.getString(r3, r9)
            if (r3 != 0) goto Lc4
            r9 = r2
            goto Lc5
        Lc4:
            r9 = r3
        Lc5:
            java.lang.String r3 = "script_plugin_agent_mcp_enable"
            boolean r3 = r1.getBoolean(r3, r4)
            java.lang.String r4 = "script_plugin_agent_mcp_endpoint"
            java.lang.String r4 = r1.getString(r4, r2)
            if (r4 != 0) goto Ld4
            r4 = r2
        Ld4:
            java.lang.String r10 = "script_plugin_agent_mcp_authorization"
            java.lang.String r10 = r1.getString(r10, r2)
            if (r10 != 0) goto Ldd
            r10 = r2
        Ldd:
            java.util.List r10 = m(r4, r10, r3)
            java.lang.String r3 = "script_plugin_agent_auto_compact"
            r4 = 1
            boolean r11 = r1.getBoolean(r3, r4)
            java.lang.String r3 = "script_plugin_agent_compact_token_threshold"
            r12 = 24000(0x5dc0, float:3.3631E-41)
            int r3 = r1.getInt(r3, r12)
            r12 = 2000(0x7d0, float:2.803E-42)
            r13 = 1000000(0xf4240, float:1.401298E-39)
            int r12 = r9.e0.r(r3, r12, r13)
            java.lang.String r3 = "script_plugin_agent_web_search_enabled"
            boolean r13 = r1.getBoolean(r3, r4)
            java.lang.String r3 = "script_plugin_agent_workspace_write_approval"
            java.lang.String r4 = "ask"
            java.lang.String r3 = r1.getString(r3, r4)
            if (r3 != 0) goto L10b
            r14 = r2
            goto L10c
        L10b:
            r14 = r3
        L10c:
            java.lang.String r15 = "force"
            java.lang.String r16 = "openai_compatible"
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            fb.v r2 = q(r5)
            java.lang.String r3 = "default"
            java.lang.String r4 = "默认配置"
            r0.<init>(r3, r4, r2)
            java.util.List r2 = a.a.x0(r0)
            y(r1, r2, r3)
            java.util.List r0 = a.a.x0(r0)
            return r0
    }

    public static int j(java.lang.String r11, java.util.List r12, fb.y r13, java.lang.String r14, java.lang.String r15) {
            r11.getClass()
            r14.getClass()
            r15.getClass()
            boolean r0 = og.m.t0(r15)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L19
            boolean r0 = k(r15)
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L21
            int r11 = r15.length()
            goto L2a
        L21:
            int r11 = r11.length()
            int r3 = r14.length()
            int r11 = r11 + r3
        L2a:
            if (r0 == 0) goto L66
            int r3 = r12.size()
            java.util.ListIterator r3 = r12.listIterator(r3)
        L34:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r3.previous()
            fb.c r4 = (fb.c) r4
            java.lang.String r5 = r4.f3431a
            java.lang.String r6 = "user"
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L54
            java.lang.String r4 = r4.f3433c
            boolean r4 = d(r15, r4)
            if (r4 != 0) goto L54
            r4 = r1
            goto L55
        L54:
            r4 = r2
        L55:
            if (r4 == 0) goto L34
            int r15 = r3.nextIndex()
            goto L5d
        L5c:
            r15 = -1
        L5d:
            if (r15 < 0) goto L64
            java.util.List r12 = tf.m.q1(r15, r12)
            goto L66
        L64:
            tf.t r12 = tf.t.f13167g
        L66:
            java.util.Iterator r12 = r12.iterator()
        L6a:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L106
            java.lang.Object r15 = r12.next()
            fb.c r15 = (fb.c) r15
            java.lang.String r3 = r15.f3432b
            int r3 = r3.length()
            java.lang.String r4 = r15.f3438h
            int r4 = r4.length()
            int r4 = r4 + r3
            java.lang.String r3 = r15.f3439i
            int r3 = r3.length()
            int r3 = r3 + r4
            int r3 = r3 + r11
            fb.a1 r11 = r15.f3442l
            if (r11 == 0) goto L96
            java.lang.String r11 = r11.f3395b
            int r11 = r11.length()
            goto L97
        L96:
            r11 = r2
        L97:
            int r3 = r3 + r11
            if (r0 != 0) goto Lcf
            boolean r11 = og.m.t0(r14)
            if (r11 == 0) goto Lcf
            java.util.List r11 = r15.f3440j
            java.util.Iterator r11 = r11.iterator()
        La6:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto Lcf
            java.lang.Object r4 = r11.next()
            fb.q1 r4 = (fb.q1) r4
            java.lang.String r5 = r4.f3723c
            int r5 = r5.length()
            java.lang.String r6 = r4.f3724d
            int r6 = r6.length()
            int r6 = r6 + r5
            java.lang.String r5 = r4.f3725e
            int r5 = r5.length()
            int r5 = r5 + r6
            java.lang.String r4 = r4.f3726f
            int r4 = r4.length()
            int r4 = r4 + r5
            int r3 = r3 + r4
            goto La6
        Lcf:
            java.util.List r11 = r15.f3441k
            java.util.Iterator r11 = r11.iterator()
        Ld5:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L103
            java.lang.Object r15 = r11.next()
            fb.a r15 = (fb.a) r15
            java.lang.String r4 = r15.f3386a
            int r4 = r4.length()
            java.lang.String r5 = r15.f3388c
            java.lang.String r6 = "image/"
            boolean r5 = og.t.d0(r5, r6, r2)
            if (r5 == 0) goto Lf4
            r15 = 4000(0xfa0, float:5.605E-42)
            goto L100
        Lf4:
            long r5 = r15.f3389d
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = 524288(0x80000, double:2.590327E-318)
            long r5 = r9.e0.s(r5, r7, r9)
            int r15 = (int) r5
        L100:
            int r4 = r4 + r15
            int r3 = r3 + r4
            goto Ld5
        L103:
            r11 = r3
            goto L6a
        L106:
            if (r13 == 0) goto L11f
            java.lang.String r12 = r13.f3853b
            int r12 = r12.length()
            java.lang.String r14 = r13.f3852a
            int r14 = r14.length()
            int r14 = r14 + r12
            java.lang.String r12 = r13.f3856e
            int r12 = r12.length()
            int r12 = r12 + r14
            int r12 = r12 + 256
            int r11 = r11 + r12
        L11f:
            int r11 = r11 / 4
            if (r11 >= r1) goto L124
            return r1
        L124:
            return r11
    }

    public static boolean k(java.lang.String r5) {
            r5.getClass()
            boolean r0 = og.m.t0(r5)
            r1 = 1
            if (r0 == 0) goto Lb
            return r1
        Lb:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L11
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L11
            goto L17
        L11:
            r5 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r5)
        L17:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L1c
            r0 = 0
        L1c:
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            r5 = 0
            if (r0 == 0) goto L5e
            int r2 = r0.length()
            lg.d r2 = r9.e0.r0(r5, r2)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L38
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L38
        L36:
            r0 = r1
            goto L59
        L38:
            java.util.Iterator r2 = r2.iterator()
        L3c:
            r3 = r2
            lg.c r3 = (lg.c) r3
            boolean r4 = r3.f8047i
            if (r4 == 0) goto L36
            java.lang.Object r3 = r3.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            org.json.JSONObject r3 = r0.optJSONObject(r3)
            if (r3 == 0) goto L55
            r3 = r1
            goto L56
        L55:
            r3 = r5
        L56:
            if (r3 != 0) goto L3c
            r0 = r5
        L59:
            if (r0 != r1) goto L5c
            goto L5d
        L5c:
            r1 = r5
        L5d:
            r5 = r1
        L5e:
            return r5
    }

    public static boolean l(fb.v r4) {
            r0 = 1
            java.lang.String r1 = r4.f3823a     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = r4.f3833k     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = r4.f3826d     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = v(r1, r2, r4, r0)     // Catch: java.lang.Throwable -> L10
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r4 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r4)
            r4 = r1
        L17:
            boolean r1 = r4 instanceof sf.f
            if (r1 == 0) goto L1d
            r4 = 0
        L1d:
            android.net.Uri r4 = (android.net.Uri) r4
            r1 = 0
            if (r4 == 0) goto L48
            java.lang.String r2 = r4.getScheme()
            java.lang.String r3 = "http"
            boolean r2 = og.t.X(r2, r3)
            if (r2 != 0) goto L3a
            java.lang.String r2 = r4.getScheme()
            java.lang.String r3 = "https"
            boolean r2 = og.t.X(r2, r3)
            if (r2 == 0) goto L46
        L3a:
            java.lang.String r4 = r4.getHost()
            if (r4 == 0) goto L46
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L47
        L46:
            r0 = r1
        L47:
            return r0
        L48:
            return r1
    }

    public static java.util.List m(java.lang.String r6, java.lang.String r7, boolean r8) {
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L11
            boolean r0 = og.m.t0(r7)
            if (r0 == 0) goto L11
            if (r8 != 0) goto L11
            tf.t r6 = tf.t.f13167g
            return r6
        L11:
            fb.r0 r0 = new fb.r0
            java.lang.String r1 = "legacy"
            java.lang.String r2 = "MCP 1"
            r3 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r6 = a.a.x0(r0)
            return r6
    }

    public static fb.t0 n(android.content.Context r4) {
            r4.getClass()
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r4 = ub.b.c(r4, r0)
            java.util.List r0 = i(r4)
            java.lang.String r1 = "script_plugin_agent_active_profile"
            java.lang.String r2 = ""
            java.lang.String r4 = r4.getString(r1, r2)
            if (r4 != 0) goto L18
            goto L19
        L18:
            r2 = r4
        L19:
            java.util.Iterator r4 = r0.iterator()
        L1d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r4.next()
            r3 = r1
            fb.t0 r3 = (fb.t0) r3
            java.lang.String r3 = r3.f3783a
            boolean r3 = gg.l.a(r3, r2)
            if (r3 == 0) goto L1d
            goto L34
        L33:
            r1 = 0
        L34:
            fb.t0 r1 = (fb.t0) r1
            if (r1 == 0) goto L39
            return r1
        L39:
            java.lang.Object r4 = tf.m.t1(r0)
            fb.t0 r4 = (fb.t0) r4
            return r4
    }

    public static java.util.ArrayList o(java.lang.String r20, java.util.List r21) {
            r20.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r21.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r1.next()
            r3 = r2
            fb.c r3 = (fb.c) r3
            java.lang.String r2 = r3.f3431a
            java.util.List r4 = r3.f3440j
            java.lang.String r5 = "tool"
            boolean r2 = gg.l.a(r2, r5)
            if (r2 == 0) goto L8b
            java.lang.String r2 = r3.f3434d
            r5 = r20
            boolean r2 = gg.l.a(r2, r5)
            if (r2 == 0) goto L30
            goto L8b
        L30:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r2 = r4.iterator()
        L39:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L62
            java.lang.Object r6 = r2.next()
            r7 = r6
            fb.q1 r7 = (fb.q1) r7
            java.lang.String r8 = r7.f3722b
            java.lang.String r9 = "workspace"
            boolean r8 = gg.l.a(r8, r9)
            if (r8 != 0) goto L5b
            java.lang.String r7 = r7.f3733m
            java.lang.String r8 = "hchat_workspace_"
            r9 = 0
            boolean r7 = og.t.d0(r7, r8, r9)
            if (r7 == 0) goto L5c
        L5b:
            r9 = 1
        L5c:
            if (r9 != 0) goto L39
            r12.add(r6)
            goto L39
        L62:
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L6a
            r3 = 0
            goto L8b
        L6a:
            int r2 = r12.size()
            int r4 = r4.size()
            if (r2 != r4) goto L75
            goto L8b
        L75:
            r17 = 0
            r19 = 261631(0x3fdff, float:3.66623E-40)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            fb.c r3 = fb.c.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
        L8b:
            if (r3 == 0) goto Lc
            r0.add(r3)
            goto Lc
        L92:
            return r0
    }

    public static java.lang.String p(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            r18.getClass()
            r19.getClass()
            r20.getClass()
            java.lang.String r0 = r(r19)
            int r1 = r0.hashCode()
            r2 = 6
            java.lang.String r3 = "v1"
            java.lang.String r4 = "/chat/completions"
            r5 = 1
            java.lang.String r6 = "/"
            java.lang.String r7 = "https://"
            r8 = 0
            java.lang.String r9 = "://"
            r10 = 0
            r11 = 47
            java.lang.String r12 = ""
            switch(r1) {
                case -2131439764: goto L25a;
                case -1581359199: goto L248;
                case -1249537483: goto L136;
                case 629437796: goto L28;
                default: goto L26;
            }
        L26:
            goto L262
        L28:
            java.lang.String r1 = "deepseek"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L262
        L32:
            java.lang.CharSequence r0 = og.m.R0(r18)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L42
            goto L482
        L42:
            boolean r1 = og.m.h0(r0, r9, r8)
            if (r1 != 0) goto L54
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L54:
            r1 = r0
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L5a
            goto L61
        L5a:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L61:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L67
            r0 = r10
        L67:
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L128
            java.lang.String r3 = r0.getScheme()
            if (r3 == 0) goto L128
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L79
            goto L128
        L79:
            java.lang.String r3 = r0.getHost()
            if (r3 == 0) goto L128
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L87
            goto L128
        L87:
            java.lang.String r1 = r0.getEncodedPath()
            if (r1 != 0) goto L8e
            goto L8f
        L8e:
            r12 = r1
        L8f:
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.util.List r1 = og.m.F0(r12, r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        La0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb7
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto La0
            r2.add(r3)
            goto La0
        Lb7:
            lg.d r1 = a.a.X(r2)
            java.util.Iterator r1 = r1.iterator()
        Lbf:
            r3 = r1
            lg.c r3 = (lg.c) r3
            boolean r4 = r3.f8047i
            java.lang.String r7 = "chat"
            if (r4 == 0) goto Le1
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.t.d0(r7, r4, r5)
            if (r4 == 0) goto Lbf
            r10 = r3
            goto Lbf
        Le1:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto Led
            int r1 = r10.intValue()
            java.util.List r2 = tf.m.L1(r1, r2)
        Led:
            java.lang.String r1 = "completions"
            java.lang.String[] r1 = new java.lang.String[]{r7, r1}
            java.util.List r1 = a.a.y0(r1)
            java.util.ArrayList r12 = tf.m.F1(r2, r1)
            r16 = 0
            r17 = 62
            java.lang.String r13 = "/"
            r14 = 0
            r15 = 0
            java.lang.String r1 = tf.m.A1(r12, r13, r14, r15, r16, r17)
            java.lang.String r1 = r6.concat(r1)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.encodedPath(r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.lang.String r12 = og.m.U0(r0, r1)
            goto L482
        L128:
            char[] r0 = new char[r5]
            r0[r8] = r11
            java.lang.String r0 = og.m.U0(r1, r0)
            java.lang.String r12 = bc.e.i(r0, r4)
            goto L482
        L136:
            java.lang.String r1 = "gemini"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L140
            goto L262
        L140:
            java.lang.CharSequence r0 = og.m.R0(r18)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L150
            goto L482
        L150:
            boolean r1 = og.m.h0(r0, r9, r8)
            if (r1 != 0) goto L162
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L162:
            r1 = r0
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L168
            goto L16f
        L168:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L16f:
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto L175
            r0 = r10
        L175:
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L238
            java.lang.String r4 = r0.getScheme()
            if (r4 == 0) goto L238
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L187
            goto L238
        L187:
            java.lang.String r4 = r0.getHost()
            if (r4 == 0) goto L238
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L195
            goto L238
        L195:
            java.lang.String r1 = r0.getEncodedPath()
            if (r1 != 0) goto L19c
            goto L19d
        L19c:
            r12 = r1
        L19d:
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.util.List r1 = og.m.F0(r12, r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1ae:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1c5
            java.lang.Object r4 = r1.next()
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = og.m.t0(r7)
            if (r7 != 0) goto L1ae
            r2.add(r4)
            goto L1ae
        L1c5:
            lg.d r1 = a.a.X(r2)
            java.util.Iterator r1 = r1.iterator()
        L1cd:
            r4 = r1
            lg.c r4 = (lg.c) r4
            boolean r7 = r4.f8047i
            java.lang.String r9 = "v1beta"
            if (r7 == 0) goto L1fb
            java.lang.Object r4 = r4.next()
            r7 = r4
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r12 = r2.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            boolean r9 = og.t.d0(r9, r12, r5)
            if (r9 != 0) goto L1f9
            java.lang.Object r7 = r2.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = og.t.X(r7, r3)
            if (r7 == 0) goto L1cd
        L1f9:
            r10 = r4
            goto L1cd
        L1fb:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L207
            int r1 = r10.intValue()
            java.util.List r2 = tf.m.L1(r1, r2)
        L207:
            java.util.ArrayList r12 = tf.m.G1(r2, r9)
            r16 = 0
            r17 = 62
            java.lang.String r13 = "/"
            r14 = 0
            r15 = 0
            java.lang.String r1 = tf.m.A1(r12, r13, r14, r15, r16, r17)
            java.lang.String r1 = r6.concat(r1)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.encodedPath(r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.lang.String r12 = og.m.U0(r0, r1)
            goto L482
        L238:
            char[] r0 = new char[r5]
            r0[r8] = r11
            java.lang.String r0 = og.m.U0(r1, r0)
            java.lang.String r1 = "/v1beta"
        L242:
            java.lang.String r12 = bc.e.i(r0, r1)
            goto L482
        L248:
            java.lang.String r1 = "custom_url"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L251
            goto L262
        L251:
            java.lang.CharSequence r0 = og.m.R0(r18)
            java.lang.String r0 = r0.toString()
            return r0
        L25a:
            java.lang.String r1 = "anthropic"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35c
        L262:
            java.lang.CharSequence r0 = og.m.R0(r18)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L272
            goto L482
        L272:
            boolean r1 = og.m.h0(r0, r9, r8)
            if (r1 != 0) goto L284
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L284:
            boolean r1 = og.m.t0(r20)
            if (r1 != 0) goto L2b4
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.lang.String r1 = og.m.U0(r0, r1)
            boolean r1 = og.t.W(r1, r4, r8)
            if (r1 != 0) goto L2b4
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.lang.String r0 = og.m.U0(r0, r1)
            java.lang.CharSequence r1 = og.m.R0(r20)
            java.lang.String r1 = r1.toString()
            char[] r3 = new char[r5]
            r3[r8] = r11
            java.lang.String r1 = og.m.W0(r1, r3)
            java.lang.String r0 = wb.en.h(r0, r6, r1)
        L2b4:
            r1 = r0
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L2ba
            goto L2c1
        L2ba:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L2c1:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L2c7
            r0 = r10
        L2c7:
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L30e
            java.lang.String r3 = r0.getScheme()
            if (r3 == 0) goto L30e
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L2d8
            goto L30e
        L2d8:
            java.lang.String r3 = r0.getHost()
            if (r3 == 0) goto L30e
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L2e5
            goto L30e
        L2e5:
            java.lang.String r1 = r0.getEncodedPath()
            if (r1 != 0) goto L2ec
            goto L2ed
        L2ec:
            r12 = r1
        L2ed:
            java.lang.String r1 = s(r12)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.encodedPath(r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.lang.String r12 = og.m.U0(r0, r1)
            goto L482
        L30e:
            java.lang.CharSequence r0 = og.m.R0(r1)
            java.lang.String r0 = r0.toString()
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.lang.String r0 = og.m.U0(r0, r1)
            int r1 = og.m.r0(r0, r9, r8, r8, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r1 < 0) goto L329
            r10 = r2
        L329:
            if (r10 == 0) goto L332
            int r1 = r10.intValue()
            int r1 = r1 + 3
            goto L333
        L332:
            r1 = r8
        L333:
            r2 = 4
            int r1 = og.m.q0(r0, r11, r1, r2)
            if (r1 >= 0) goto L343
            java.lang.String r1 = "/v1/chat/completions"
            java.lang.String r0 = r0.concat(r1)
        L340:
            r12 = r0
            goto L482
        L343:
            java.lang.String r2 = r0.substring(r8, r1)
            char[] r3 = new char[r5]
            r3[r8] = r11
            java.lang.String r2 = og.m.U0(r2, r3)
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = s(r0)
            java.lang.String r0 = bc.e.i(r2, r0)
            goto L340
        L35c:
            java.lang.CharSequence r0 = og.m.R0(r18)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L36c
            goto L482
        L36c:
            boolean r1 = og.m.h0(r0, r9, r8)
            if (r1 != 0) goto L37e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L37e:
            r1 = r0
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L384
            goto L38b
        L384:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L38b:
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto L391
            r0 = r10
        L391:
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L476
            java.lang.String r4 = r0.getScheme()
            if (r4 == 0) goto L476
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L3a3
            goto L476
        L3a3:
            java.lang.String r4 = r0.getHost()
            if (r4 == 0) goto L476
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L3b1
            goto L476
        L3b1:
            java.lang.String r1 = r0.getEncodedPath()
            if (r1 != 0) goto L3b8
            goto L3b9
        L3b8:
            r12 = r1
        L3b9:
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.util.List r1 = og.m.F0(r12, r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3ca:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3e1
            java.lang.Object r4 = r1.next()
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = og.m.t0(r7)
            if (r7 != 0) goto L3ca
            r2.add(r4)
            goto L3ca
        L3e1:
            int r1 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r1)
        L3e9:
            boolean r4 = r1.hasPrevious()
            if (r4 == 0) goto L400
            java.lang.Object r4 = r1.previous()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.t.X(r4, r3)
            if (r4 == 0) goto L3e9
            int r1 = r1.nextIndex()
            goto L401
        L400:
            r1 = -1
        L401:
            lg.d r4 = a.a.X(r2)
            java.util.Iterator r4 = r4.iterator()
        L409:
            r7 = r4
            lg.c r7 = (lg.c) r7
            boolean r9 = r7.f8047i
            java.lang.String r12 = "messages"
            if (r9 == 0) goto L42b
            java.lang.Object r7 = r7.next()
            r9 = r7
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r9 = r2.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = og.t.d0(r12, r9, r5)
            if (r9 == 0) goto L409
            r10 = r7
            goto L409
        L42b:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r1 < 0) goto L434
            java.util.List r2 = tf.m.L1(r1, r2)
            goto L43e
        L434:
            if (r10 == 0) goto L43e
            int r1 = r10.intValue()
            java.util.List r2 = tf.m.L1(r1, r2)
        L43e:
            java.lang.String[] r1 = new java.lang.String[]{r3, r12}
            java.util.List r1 = a.a.y0(r1)
            java.util.ArrayList r12 = tf.m.F1(r2, r1)
            r16 = 0
            r17 = 62
            java.lang.String r13 = "/"
            r14 = 0
            r15 = 0
            java.lang.String r1 = tf.m.A1(r12, r13, r14, r15, r16, r17)
            java.lang.String r1 = r6.concat(r1)
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.encodedPath(r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            char[] r1 = new char[r5]
            r1[r8] = r11
            java.lang.String r12 = og.m.U0(r0, r1)
            goto L482
        L476:
            char[] r0 = new char[r5]
            r0[r8] = r11
            java.lang.String r0 = og.m.U0(r1, r0)
            java.lang.String r1 = "/v1/messages"
            goto L242
        L482:
            return r12
    }

    public static fb.v q(fb.v r18) {
            r0 = r18
            java.lang.String r1 = r0.f3833k
            java.lang.String r9 = r(r1)
            java.lang.String r1 = r0.f3823a
            java.lang.String r2 = r0.f3824b
            java.lang.String r1 = p(r1, r9, r2)
            java.lang.String r2 = r0.f3825c
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r0.f3826d
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.util.List r4 = r0.f3827e
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = tf.n.e1(r4)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L34:
            boolean r7 = r4.hasNext()
            r8 = 0
            if (r7 == 0) goto Lb7
            java.lang.Object r7 = r4.next()
            int r10 = r6 + 1
            if (r6 < 0) goto Lb3
            r11 = r7
            fb.r0 r11 = (fb.r0) r11
            java.lang.String r6 = r11.f3744a
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L5c
            java.lang.String r6 = "mcp-"
            java.lang.String r6 = eh.a.l(r10, r6)
        L5c:
            r12 = r6
            java.lang.String r6 = r11.f3745b
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "\\s+"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            r7.getClass()
            r6.getClass()
            java.util.regex.Matcher r6 = r7.matcher(r6)
            java.lang.String r7 = " "
            java.lang.String r6 = r6.replaceAll(r7)
            r6.getClass()
            r7 = 32
            java.lang.String r6 = og.m.P0(r7, r6)
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L92
            java.lang.String r6 = "MCP "
            java.lang.String r6 = eh.a.l(r10, r6)
        L92:
            r13 = r6
            java.lang.String r6 = r11.f3747d
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r15 = r6.toString()
            java.lang.String r6 = r11.f3748e
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r16 = r6.toString()
            r17 = 4
            r14 = 0
            fb.r0 r6 = fb.r0.a(r11, r12, r13, r14, r15, r16, r17)
            r5.add(r6)
            r6 = r10
            goto L34
        Lb3:
            a.a.Q0()
            throw r8
        Lb7:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lc5:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lde
            java.lang.Object r7 = r5.next()
            r10 = r7
            fb.r0 r10 = (fb.r0) r10
            java.lang.String r10 = r10.f3744a
            boolean r10 = r4.add(r10)
            if (r10 == 0) goto Lc5
            r6.add(r7)
            goto Lc5
        Lde:
            int r4 = r0.f3829g
            r5 = 2000(0x7d0, float:2.803E-42)
            r7 = 1000000(0xf4240, float:1.401298E-39)
            int r5 = r9.e0.r(r4, r5, r7)
            java.lang.String r4 = r0.f3831i
            java.lang.String r7 = "ask"
            boolean r10 = gg.l.a(r4, r7)
            if (r10 != 0) goto Lfd
            java.lang.String r10 = "always_allow"
            boolean r10 = gg.l.a(r4, r10)
            if (r10 == 0) goto Lfc
            goto Lfd
        Lfc:
            r4 = r8
        Lfd:
            if (r4 == 0) goto L100
            r7 = r4
        L100:
            java.lang.String r4 = r0.f3832j
            java.lang.String r10 = "auto"
            boolean r10 = gg.l.a(r4, r10)
            java.lang.String r11 = "force"
            if (r10 != 0) goto L11a
            boolean r10 = gg.l.a(r4, r11)
            if (r10 != 0) goto L11a
            java.lang.String r10 = "off"
            boolean r10 = gg.l.a(r4, r10)
            if (r10 == 0) goto L11b
        L11a:
            r8 = r4
        L11b:
            if (r8 == 0) goto L11e
            goto L11f
        L11e:
            r8 = r11
        L11f:
            r10 = 160(0xa0, float:2.24E-43)
            r4 = r6
            r6 = 0
            fb.v r0 = fb.v.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public static java.lang.String r(java.lang.String r2) {
            java.lang.String r0 = "openai_compatible"
            boolean r1 = gg.l.a(r2, r0)
            if (r1 != 0) goto L43
            java.lang.String r1 = "openai"
            boolean r1 = gg.l.a(r2, r1)
            if (r1 != 0) goto L43
            java.lang.String r1 = "deepseek"
            boolean r1 = gg.l.a(r2, r1)
            if (r1 != 0) goto L43
            java.lang.String r1 = "openrouter"
            boolean r1 = gg.l.a(r2, r1)
            if (r1 != 0) goto L43
            java.lang.String r1 = "siliconflow"
            boolean r1 = gg.l.a(r2, r1)
            if (r1 != 0) goto L43
            java.lang.String r1 = "gemini"
            boolean r1 = gg.l.a(r2, r1)
            if (r1 != 0) goto L43
            java.lang.String r1 = "anthropic"
            boolean r1 = gg.l.a(r2, r1)
            if (r1 != 0) goto L43
            java.lang.String r1 = "custom_url"
            boolean r1 = gg.l.a(r2, r1)
            if (r1 == 0) goto L41
            goto L43
        L41:
            r1 = 0
            goto L44
        L43:
            r1 = 1
        L44:
            if (r1 == 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            if (r2 == 0) goto L4b
            return r2
        L4b:
            return r0
    }

    public static java.lang.String s(java.lang.String r8) {
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 47
            r1[r2] = r3
            r3 = 6
            java.util.List r8 = og.m.F0(r8, r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L16:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r8.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L16
            r1.add(r3)
            goto L16
        L2d:
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L36
            java.lang.String r8 = "/v1/chat/completions"
            return r8
        L36:
            int r8 = r1.size()
            java.util.ListIterator r8 = r1.listIterator(r8)
        L3e:
            boolean r3 = r8.hasPrevious()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r8.previous()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "v1"
            boolean r3 = og.t.X(r3, r4)
            if (r3 == 0) goto L3e
            int r8 = r8.nextIndex()
            goto L58
        L57:
            r8 = -1
        L58:
            if (r8 < 0) goto L63
            java.util.List r8 = tf.m.L1(r8, r1)
            java.lang.String r8 = h(r8)
            return r8
        L63:
            lg.d r8 = a.a.X(r1)
            java.util.Iterator r8 = r8.iterator()
            r3 = 0
        L6c:
            r4 = r8
            lg.c r4 = (lg.c) r4
            boolean r5 = r4.f8047i
            if (r5 == 0) goto La4
            java.lang.Object r4 = r4.next()
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = r1.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "chat"
            boolean r6 = og.t.X(r6, r7)
            if (r6 != 0) goto L8e
            r5 = r2
            goto La0
        L8e:
            int r5 = r5 + 1
            java.lang.Object r5 = tf.m.w1(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L9f
            java.lang.String r6 = "completions"
            boolean r5 = og.t.d0(r6, r5, r0)
            goto La0
        L9f:
            r5 = r0
        La0:
            if (r5 == 0) goto L6c
            r3 = r4
            goto L6c
        La4:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto Lb5
            int r8 = r3.intValue()
            java.util.List r8 = tf.m.L1(r8, r1)
            java.lang.String r8 = h(r8)
            return r8
        Lb5:
            java.lang.String r8 = h(r1)
            return r8
    }

    public static org.json.JSONArray t(java.lang.String r1) {
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto Lc
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            return r1
        Lc:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
            goto L18
        L12:
            r1 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r1)
        L18:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L1f
            goto L24
        L1f:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L24:
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
    }

    public static fb.t0 u(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            r6.getClass()
            r7.getClass()
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)
            java.util.List r0 = i(r0)
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            r4 = r2
            fb.t0 r4 = (fb.t0) r4
            java.lang.String r4 = r4.f3783a
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L14
            goto L2c
        L2b:
            r2 = r3
        L2c:
            fb.t0 r2 = (fb.t0) r2
            if (r2 == 0) goto L71
            java.lang.String r7 = c(r7)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3b
            goto L68
        L3b:
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            fb.t0 r1 = (fb.t0) r1
            java.lang.String r4 = r1.f3783a
            boolean r4 = gg.l.a(r4, r6)
            if (r4 != 0) goto L5d
            java.lang.String r1 = r1.f3784b
            boolean r1 = og.t.X(r1, r7)
            if (r1 == 0) goto L5d
            r1 = 1
            goto L5e
        L5d:
            r1 = 0
        L5e:
            if (r1 != 0) goto L61
            goto L3f
        L61:
            java.lang.String r5 = "配置名称已存在"
            j8.o.t(r5)
        L66:
            r5 = 0
            return r5
        L68:
            r6 = 5
            fb.t0 r6 = fb.t0.a(r2, r7, r3, r6)
            x(r5, r6)
            return r6
        L71:
            java.lang.String r5 = "配置不存在"
            j8.o.t(r5)
            goto L66
    }

    public static java.lang.String v(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r4.getClass()
            r5.getClass()
            r6.getClass()
            java.lang.String r5 = r(r5)
            java.lang.String r0 = ""
            java.lang.String r4 = p(r4, r5, r0)
            java.lang.String r1 = "gemini"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L85
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r5 = og.m.R0(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "models/"
            java.lang.String r5 = og.m.A0(r5, r6)
            boolean r6 = og.m.t0(r4)
            if (r6 != 0) goto L85
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L3e
            goto L85
        L3e:
            if (r7 == 0) goto L43
            java.lang.String r6 = "streamGenerateContent"
            goto L45
        L43:
            java.lang.String r6 = "generateContent"
        L45:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r1 = r4.getEncodedPath()
            if (r1 != 0) goto L50
            goto L51
        L50:
            r0 = r1
        L51:
            r1 = 1
            char[] r1 = new char[r1]
            r2 = 47
            r3 = 0
            r1[r3] = r2
            java.lang.String r0 = og.m.U0(r0, r1)
            java.lang.String r5 = android.net.Uri.encode(r5)
            java.lang.String r1 = "/models/"
            java.lang.String r2 = ":"
            java.lang.String r5 = bc.e.v(r0, r1, r5, r2, r6)
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r4 = r4.encodedPath(r5)
            if (r7 == 0) goto L7a
            java.lang.String r5 = "alt"
            java.lang.String r6 = "sse"
            r4.appendQueryParameter(r5, r6)
        L7a:
            android.net.Uri r4 = r4.build()
            java.lang.String r4 = r4.toString()
            r4.getClass()
        L85:
            return r4
    }

    public static void w(android.content.Context r3, fb.v r4) {
            r3.getClass()
            fb.t0 r0 = n(r3)
            fb.v r4 = q(r4)
            r1 = 3
            r2 = 0
            fb.t0 r4 = fb.t0.a(r0, r2, r4, r1)
            x(r3, r4)
            return
    }

    public static void x(android.content.Context r5, fb.t0 r6) {
            r5.getClass()
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r5 = ub.b.c(r5, r0)
            java.util.List r0 = i(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.lang.String r0 = r6.f3784b
            java.lang.String r0 = c(r0)
            fb.v r2 = r6.f3785c
            fb.v r2 = q(r2)
            r3 = 1
            fb.t0 r6 = fb.t0.a(r6, r0, r2, r3)
            java.lang.String r0 = r6.f3783a
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        L2a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r2.next()
            fb.t0 r4 = (fb.t0) r4
            java.lang.String r4 = r4.f3783a
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L3f
            goto L43
        L3f:
            int r3 = r3 + 1
            goto L2a
        L42:
            r3 = -1
        L43:
            if (r3 < 0) goto L49
            r1.set(r3, r6)
            goto L4c
        L49:
            r1.add(r6)
        L4c:
            y(r5, r1, r0)
            return
    }

    public static void y(android.content.SharedPreferences r18, java.util.List r19, java.lang.String r20) {
            java.util.Iterator r0 = r19.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            r3 = r1
            fb.t0 r3 = (fb.t0) r3
            java.lang.String r3 = r3.f3783a
            r4 = r20
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L4
            goto L1d
        L1c:
            r1 = 0
        L1d:
            fb.t0 r1 = (fb.t0) r1
            if (r1 == 0) goto L22
            goto L29
        L22:
            java.lang.Object r0 = tf.m.t1(r19)
            r1 = r0
            fb.t0 r1 = (fb.t0) r1
        L29:
            fb.v r0 = r1.f3785c
            java.util.List r3 = r0.f3827e
            java.lang.String r4 = r0.f3823a
            java.lang.String r5 = r0.f3833k
            java.lang.String r6 = ""
            java.lang.String r4 = p(r4, r5, r6)
            java.lang.String r7 = "openai_compatible"
            boolean r5 = r5.equals(r7)
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L5f
            java.lang.String r5 = "/chat/completions"
            boolean r9 = og.t.W(r4, r5, r8)
            if (r9 == 0) goto L5f
            r9 = 17
            java.lang.String r4 = og.m.k0(r9, r4)
            char[] r9 = new char[r8]
            r10 = 47
            r9[r7] = r10
            java.lang.String r4 = og.m.U0(r4, r9)
            sf.e r9 = new sf.e
            r9.<init>(r4, r5)
            goto L64
        L5f:
            sf.e r9 = new sf.e
            r9.<init>(r4, r6)
        L64:
            java.util.Iterator r4 = r3.iterator()
        L68:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7a
            java.lang.Object r5 = r4.next()
            r10 = r5
            fb.r0 r10 = (fb.r0) r10
            boolean r10 = r10.f3746c
            if (r10 == 0) goto L68
            goto L7b
        L7a:
            r5 = 0
        L7b:
            fb.r0 r5 = (fb.r0) r5
            if (r5 == 0) goto L80
            goto L87
        L80:
            java.lang.Object r3 = tf.m.v1(r3)
            r5 = r3
            fb.r0 r5 = (fb.r0) r5
        L87:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r4 = r19.iterator()
        L90:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L1ab
            java.lang.Object r10 = r4.next()
            fb.t0 r10 = (fb.t0) r10
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            java.lang.String r12 = r10.f3783a
            java.lang.String r13 = "id"
            r11.put(r13, r12)
            java.lang.String r12 = r10.f3784b
            java.lang.String r14 = "name"
            r11.put(r14, r12)
            fb.v r10 = r10.f3785c
            fb.v r10 = q(r10)
            java.util.List r12 = r10.f3827e
            java.util.Iterator r15 = r12.iterator()
        Lbb:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto Lce
            java.lang.Object r16 = r15.next()
            r2 = r16
            fb.r0 r2 = (fb.r0) r2
            boolean r2 = r2.f3746c
            if (r2 == 0) goto Lbb
            goto Ld0
        Lce:
            r16 = 0
        Ld0:
            fb.r0 r16 = (fb.r0) r16
            if (r16 == 0) goto Ld7
        Ld4:
            r2 = r16
            goto Le0
        Ld7:
            java.lang.Object r2 = tf.m.v1(r12)
            r16 = r2
            fb.r0 r16 = (fb.r0) r16
            goto Ld4
        Le0:
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r7 = "apiEndpoint"
            java.lang.String r8 = r10.f3823a
            r15.put(r7, r8)
            java.lang.String r7 = "endpointMode"
            java.lang.String r8 = r10.f3833k
            r15.put(r7, r8)
            java.lang.String r7 = "apiKey"
            java.lang.String r8 = r10.f3825c
            r15.put(r7, r8)
            java.lang.String r7 = "model"
            java.lang.String r8 = r10.f3826d
            r15.put(r7, r8)
            if (r2 == 0) goto L10a
            boolean r7 = r2.f3746c
            r8 = 1
            if (r7 != r8) goto L10a
            r8 = 1
            goto L10b
        L10a:
            r8 = 0
        L10b:
            java.lang.String r7 = "mcpEnabled"
            r15.put(r7, r8)
            if (r2 == 0) goto L115
            java.lang.String r7 = r2.f3747d
            goto L116
        L115:
            r7 = 0
        L116:
            if (r7 != 0) goto L119
            r7 = r6
        L119:
            java.lang.String r8 = "mcpEndpoint"
            r15.put(r8, r7)
            if (r2 == 0) goto L123
            java.lang.String r2 = r2.f3748e
            goto L124
        L123:
            r2 = 0
        L124:
            if (r2 != 0) goto L127
            r2 = r6
        L127:
            java.lang.String r7 = "mcpAuthorization"
            r15.put(r7, r2)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r7 = r12.iterator()
        L135:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L171
            java.lang.Object r8 = r7.next()
            fb.r0 r8 = (fb.r0) r8
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            r19 = r4
            java.lang.String r4 = r8.f3744a
            r12.put(r13, r4)
            java.lang.String r4 = r8.f3745b
            r12.put(r14, r4)
            java.lang.String r4 = "enabled"
            r17 = r6
            boolean r6 = r8.f3746c
            r12.put(r4, r6)
            java.lang.String r4 = "endpoint"
            java.lang.String r6 = r8.f3747d
            r12.put(r4, r6)
            java.lang.String r4 = "authorization"
            java.lang.String r6 = r8.f3748e
            r12.put(r4, r6)
            r2.put(r12)
            r4 = r19
            r6 = r17
            goto L135
        L171:
            r19 = r4
            r17 = r6
            java.lang.String r4 = "mcpServers"
            r15.put(r4, r2)
            java.lang.String r2 = "autoCompactEnabled"
            boolean r4 = r10.f3828f
            r15.put(r2, r4)
            java.lang.String r2 = "compactTokenThreshold"
            int r4 = r10.f3829g
            r15.put(r2, r4)
            java.lang.String r2 = "webSearchEnabled"
            boolean r4 = r10.f3830h
            r15.put(r2, r4)
            java.lang.String r2 = "workspaceWriteApprovalMode"
            java.lang.String r4 = r10.f3831i
            r15.put(r2, r4)
            java.lang.String r2 = "promptCacheMode"
            java.lang.String r4 = r10.f3832j
            r15.put(r2, r4)
            java.lang.String r2 = "config"
            r11.put(r2, r15)
            r3.put(r11)
            r4 = r19
            r7 = 0
            r8 = 1
            goto L90
        L1ab:
            r17 = r6
            android.content.SharedPreferences$Editor r2 = r18.edit()
            java.lang.String r4 = "script_plugin_agent_profiles_v1"
            java.lang.String r3 = r3.toString()
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r3)
            java.lang.String r3 = "script_plugin_agent_active_profile"
            java.lang.String r1 = r1.f3783a
            android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)
            java.lang.Object r2 = r9.f12418g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "script_plugin_agent_api_base"
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            java.lang.Object r2 = r9.f12419h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "script_plugin_agent_api_path"
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            java.lang.String r2 = "script_plugin_agent_api_key"
            java.lang.String r3 = r0.f3825c
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)
            java.lang.String r2 = "script_plugin_agent_model"
            java.lang.String r3 = r0.f3826d
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)
            if (r5 == 0) goto L1f0
            boolean r2 = r5.f3746c
            r8 = 1
            if (r2 != r8) goto L1f0
            r7 = r8
            goto L1f1
        L1f0:
            r7 = 0
        L1f1:
            java.lang.String r2 = "script_plugin_agent_mcp_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r7)
            if (r5 == 0) goto L1fc
            java.lang.String r2 = r5.f3747d
            goto L1fd
        L1fc:
            r2 = 0
        L1fd:
            if (r2 != 0) goto L201
            r2 = r17
        L201:
            java.lang.String r3 = "script_plugin_agent_mcp_endpoint"
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            if (r5 == 0) goto L20c
            java.lang.String r2 = r5.f3748e
            goto L20d
        L20c:
            r2 = 0
        L20d:
            if (r2 != 0) goto L212
            r6 = r17
            goto L213
        L212:
            r6 = r2
        L213:
            java.lang.String r2 = "script_plugin_agent_mcp_authorization"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r6)
            java.lang.String r2 = "script_plugin_agent_auto_compact"
            boolean r3 = r0.f3828f
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r3)
            java.lang.String r2 = "script_plugin_agent_compact_token_threshold"
            int r3 = r0.f3829g
            android.content.SharedPreferences$Editor r1 = r1.putInt(r2, r3)
            java.lang.String r2 = "script_plugin_agent_web_search_enabled"
            boolean r3 = r0.f3830h
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r3)
            java.lang.String r2 = "script_plugin_agent_workspace_write_approval"
            java.lang.String r0 = r0.f3831i
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            r0.apply()
            return
    }

    @Override // okhttp3.Dns
    public java.util.List lookup(java.lang.String r21) {
            r20 = this;
            r1 = r20
            r2 = r21
            int r0 = r1.f3838a
            r3 = 46
            r4 = 0
            r5 = 1
            switch(r0) {
                case 3: goto L284;
                default: goto Ld;
            }
        Ld:
            tf.t r6 = tf.t.f13167g
            r2.getClass()
            okhttp3.Dns r0 = okhttp3.Dns.SYSTEM     // Catch: java.net.UnknownHostException -> L1b
            java.util.List r0 = r0.lookup(r2)     // Catch: java.net.UnknownHostException -> L1b
            r8 = r0
            r9 = 0
            goto L1e
        L1b:
            r0 = move-exception
            r9 = r0
            r8 = r6
        L1e:
            java.util.concurrent.ConcurrentHashMap r0 = fb.h2.f3543a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r8.iterator()
        L29:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L40
            java.lang.Object r11 = r10.next()
            r12 = r11
            java.net.InetAddress r12 = (java.net.InetAddress) r12
            boolean r12 = fb.h2.i(r12)
            if (r12 != 0) goto L29
            r0.add(r11)
            goto L29
        L40:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L48
            goto L244
        L48:
            java.util.concurrent.ConcurrentHashMap r0 = fb.h2.f3543a
            java.lang.CharSequence r0 = og.m.R0(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r10 = "["
            java.lang.String r0 = og.m.A0(r0, r10)
            java.lang.String r10 = "]"
            java.lang.String r0 = og.m.B0(r0, r10)
            r10 = 58
            boolean r10 = og.m.i0(r0, r10)
            if (r10 != 0) goto L71
            og.k r10 = fb.h2.f3548f
            boolean r0 = r10.d(r0)
            if (r0 == 0) goto L6f
            goto L71
        L6f:
            r0 = r4
            goto L72
        L71:
            r0 = r5
        L72:
            java.lang.String r10 = ""
            if (r0 == 0) goto L78
            r11 = r6
            goto Lc7
        L78:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r8.iterator()
        L81:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Lc7
            java.lang.Object r13 = r12.next()
            r14 = r13
            java.net.InetAddress r14 = (java.net.InetAddress) r14
            java.lang.String r14 = r14.getHostAddress()
            if (r14 != 0) goto L95
            r14 = r10
        L95:
            r15 = 37
            java.lang.String r14 = og.m.M0(r14, r15)
            java.util.Locale r15 = java.util.Locale.US
            r15.getClass()
            java.lang.String r14 = r14.toLowerCase(r15)
            r14.getClass()
            java.lang.String r15 = "."
            java.lang.String r14 = og.m.B0(r14, r15)
            java.lang.String r15 = "fdfe:dcba:9876::"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto Lc0
            java.lang.String r15 = "fdfe:dcba:9876:"
            boolean r14 = og.t.d0(r14, r15, r4)
            if (r14 == 0) goto Lbe
            goto Lc0
        Lbe:
            r14 = r4
            goto Lc1
        Lc0:
            r14 = r5
        Lc1:
            if (r14 == 0) goto L81
            r11.add(r13)
            goto L81
        Lc7:
            if (r0 != 0) goto Ld6
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto Lda
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto Ld6
            goto Lda
        Ld6:
            r16 = r8
            goto L23d
        Lda:
            java.util.concurrent.ConcurrentHashMap r0 = fb.h2.f3543a
            java.lang.String r0 = "type"
            char[] r12 = new char[r5]
            r12[r4] = r3
            java.lang.String r3 = og.m.U0(r2, r12)
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r12, r3, r12)
            long r12 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r14 = fb.h2.f3543a
            java.lang.Object r15 = r14.get(r3)
            fb.b2 r15 = (fb.b2) r15
            r16 = r8
            if (r15 == 0) goto L10a
            long r7 = r15.f3430b
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 <= 0) goto L103
            goto L104
        L103:
            r15 = 0
        L104:
            if (r15 == 0) goto L10a
            java.util.List r0 = r15.f3429a
            goto L236
        L10a:
            java.lang.String r7 = "https://cloudflare-dns.com/dns-query"
            okhttp3.HttpUrl r7 = fb.h2.r(r7)     // Catch: java.lang.Throwable -> L20e
            r7.getClass()     // Catch: java.lang.Throwable -> L20e
            okhttp3.HttpUrl$Builder r7 = r7.newBuilder()     // Catch: java.lang.Throwable -> L20e
            java.lang.String r8 = "name"
            okhttp3.HttpUrl$Builder r7 = r7.addQueryParameter(r8, r3)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r8 = "A"
            okhttp3.HttpUrl$Builder r7 = r7.addQueryParameter(r0, r8)     // Catch: java.lang.Throwable -> L20e
            okhttp3.HttpUrl r7 = r7.build()     // Catch: java.lang.Throwable -> L20e
            okhttp3.Request$Builder r8 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L20e
            r8.<init>()     // Catch: java.lang.Throwable -> L20e
            okhttp3.Request$Builder r7 = r8.url(r7)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r8 = "Accept"
            java.lang.String r15 = "application/dns-json"
            okhttp3.Request$Builder r7 = r7.header(r8, r15)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r8 = "User-Agent"
            java.lang.String r15 = "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36 Hchat-Plugin-Agent/1.1"
            okhttp3.Request$Builder r7 = r7.header(r8, r15)     // Catch: java.lang.Throwable -> L20e
            okhttp3.Request$Builder r7 = r7.get()     // Catch: java.lang.Throwable -> L20e
            okhttp3.Request r7 = r7.build()     // Catch: java.lang.Throwable -> L20e
            sf.i r8 = fb.h2.f3545c     // Catch: java.lang.Throwable -> L20e
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L20e
            okhttp3.OkHttpClient r8 = (okhttp3.OkHttpClient) r8     // Catch: java.lang.Throwable -> L20e
            okhttp3.Call r7 = r8.newCall(r7)     // Catch: java.lang.Throwable -> L20e
            okhttp3.Response r7 = r7.execute()     // Catch: java.lang.Throwable -> L20e
            boolean r8 = r7.isSuccessful()     // Catch: java.lang.Throwable -> L1bf
            if (r8 != 0) goto L161
        L15e:
            r5 = r6
            goto L20a
        L161:
            okhttp3.ResponseBody r8 = r7.body()     // Catch: java.lang.Throwable -> L1bf
            if (r8 == 0) goto L15e
            java.lang.String r8 = r8.string()     // Catch: java.lang.Throwable -> L1bf
            if (r8 == 0) goto L15e
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1bf
            r15.<init>(r8)     // Catch: java.lang.Throwable -> L1bf
            java.lang.String r8 = "Status"
            r5 = -1
            int r5 = r15.optInt(r8, r5)     // Catch: java.lang.Throwable -> L1bf
            if (r5 == 0) goto L17c
            goto L15e
        L17c:
            java.lang.String r5 = "Answer"
            org.json.JSONArray r5 = r15.optJSONArray(r5)     // Catch: java.lang.Throwable -> L1bf
            if (r5 == 0) goto L15e
            uf.c r8 = a.a.E()     // Catch: java.lang.Throwable -> L1bf
            int r15 = r5.length()     // Catch: java.lang.Throwable -> L1bf
        L18c:
            if (r4 < r15) goto L1c2
            uf.c r0 = a.a.t(r8)     // Catch: java.lang.Throwable -> L1bf
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1bf
            r4.<init>()     // Catch: java.lang.Throwable -> L1bf
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1bf
            r5.<init>()     // Catch: java.lang.Throwable -> L1bf
            r8 = 0
            java.util.ListIterator r0 = r0.listIterator(r8)     // Catch: java.lang.Throwable -> L1bf
        L1a1:
            r8 = r0
            uf.a r8 = (uf.a) r8     // Catch: java.lang.Throwable -> L1bf
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L1bf
            if (r10 == 0) goto L20a
            java.lang.Object r8 = r8.next()     // Catch: java.lang.Throwable -> L1bf
            r10 = r8
            java.net.InetAddress r10 = (java.net.InetAddress) r10     // Catch: java.lang.Throwable -> L1bf
            java.lang.String r10 = r10.getHostAddress()     // Catch: java.lang.Throwable -> L1bf
            boolean r10 = r4.add(r10)     // Catch: java.lang.Throwable -> L1bf
            if (r10 == 0) goto L1a1
            r5.add(r8)     // Catch: java.lang.Throwable -> L1bf
            goto L1a1
        L1bf:
            r0 = move-exception
            r1 = r0
            goto L210
        L1c2:
            org.json.JSONObject r1 = r5.optJSONObject(r4)     // Catch: java.lang.Throwable -> L1bf
            if (r1 == 0) goto L1ff
            r18 = r4
            r19 = r5
            r4 = 0
            int r5 = r1.optInt(r0, r4)     // Catch: java.lang.Throwable -> L1bf
            r4 = 1
            if (r5 == r4) goto L1d5
            goto L203
        L1d5:
            java.lang.String r4 = "data"
            java.lang.String r1 = r1.optString(r4, r10)     // Catch: java.lang.Throwable -> L1bf
            r1.getClass()     // Catch: java.lang.Throwable -> L1bf
            java.lang.CharSequence r1 = og.m.R0(r1)     // Catch: java.lang.Throwable -> L1bf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1bf
            og.k r4 = fb.h2.f3548f     // Catch: java.lang.Throwable -> L1bf
            boolean r4 = r4.d(r1)     // Catch: java.lang.Throwable -> L1bf
            if (r4 != 0) goto L1ef
            goto L203
        L1ef:
            java.net.InetAddress r1 = fb.h2.k(r1)     // Catch: java.lang.Throwable -> L1bf
            if (r1 == 0) goto L203
            boolean r4 = fb.h2.i(r1)     // Catch: java.lang.Throwable -> L1bf
            if (r4 != 0) goto L203
            r8.add(r1)     // Catch: java.lang.Throwable -> L1bf
            goto L203
        L1ff:
            r18 = r4
            r19 = r5
        L203:
            int r4 = r18 + 1
            r1 = r20
            r5 = r19
            goto L18c
        L20a:
            r7.close()     // Catch: java.lang.Throwable -> L20e
            goto L21b
        L20e:
            r0 = move-exception
            goto L216
        L210:
            throw r1     // Catch: java.lang.Throwable -> L211
        L211:
            r0 = move-exception
            ig.a.i(r7, r1)     // Catch: java.lang.Throwable -> L20e
            throw r0     // Catch: java.lang.Throwable -> L20e
        L216:
            sf.f r5 = new sf.f
            r5.<init>(r0)
        L21b:
            boolean r0 = r5 instanceof sf.f
            if (r0 == 0) goto L220
            goto L221
        L220:
            r6 = r5
        L221:
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L235
            fb.b2 r0 = new fb.b2
            r4 = 300000(0x493e0, double:1.482197E-318)
            long r12 = r12 + r4
            r0.<init>(r6, r12)
            r14.put(r3, r0)
        L235:
            r0 = r6
        L236:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L23d
            goto L244
        L23d:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L245
            r0 = r11
        L244:
            return r0
        L245:
            java.util.concurrent.ConcurrentHashMap r0 = fb.h2.f3543a
            java.util.Iterator r0 = r16.iterator()
        L24b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L260
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            boolean r3 = fb.h2.i(r3)
            if (r3 == 0) goto L24b
            r7 = r1
            goto L261
        L260:
            r7 = 0
        L261:
            java.net.InetAddress r7 = (java.net.InetAddress) r7
            if (r7 != 0) goto L274
            if (r9 == 0) goto L268
            goto L273
        L268:
            java.net.UnknownHostException r9 = new java.net.UnknownHostException
            java.lang.String r0 = "域名解析失败: "
            java.lang.String r0 = r0.concat(r2)
            r9.<init>(r0)
        L273:
            throw r9
        L274:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r1 = r7.getHostAddress()
            java.lang.String r2 = "拒绝访问内网地址: "
            java.lang.String r1 = wb.en.g(r2, r1)
            r0.<init>(r1)
            throw r0
        L284:
            r2.getClass()
            r4 = 1
            char[] r0 = new char[r4]
            r17 = 0
            r0[r17] = r3
            java.lang.String r0 = og.m.U0(r2, r0)
            java.lang.String r1 = "cloudflare-dns.com"
            boolean r0 = og.t.X(r0, r1)
            if (r0 == 0) goto L2b6
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x02c4: FILL_ARRAY_DATA , data: [1, 1, 1, 1} // fill-array
            java.net.InetAddress r1 = java.net.InetAddress.getByAddress(r1)
            byte[] r0 = new byte[r0]
            r0 = {x02ca: FILL_ARRAY_DATA , data: [1, 0, 0, 1} // fill-array
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r0)
            java.net.InetAddress[] r0 = new java.net.InetAddress[]{r1, r0}
            java.util.List r0 = a.a.y0(r0)
            goto L2bc
        L2b6:
            okhttp3.Dns r0 = okhttp3.Dns.SYSTEM
            java.util.List r0 = r0.lookup(r2)
        L2bc:
            return r0
    }
}
