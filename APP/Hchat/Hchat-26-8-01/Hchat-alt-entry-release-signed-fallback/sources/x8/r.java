package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f21343a;

    public r(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Lc
            java.lang.String r0 = "Hchat_auto_reply_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.f21343a = r2
            return
    }

    public final x8.u a() {
            r5 = this;
            r5.d()
            java.util.List r0 = r5.p()
            java.lang.String r1 = r5.b()
            java.util.Iterator r2 = r0.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()
            r4 = r3
            x8.u r4 = (x8.u) r4
            java.lang.String r4 = r4.f21365a
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto Lf
            goto L26
        L25:
            r3 = 0
        L26:
            x8.u r3 = (x8.u) r3
            if (r3 == 0) goto L2b
            return r3
        L2b:
            java.lang.Object r0 = tf.m.v1(r0)
            x8.u r0 = (x8.u) r0
            if (r0 == 0) goto L34
            return r0
        L34:
            x8.u r0 = r5.j()
            return r0
    }

    public final java.lang.String b() {
            r3 = this;
            r3.d()
            java.lang.String r0 = "zhilia_active_config_name_v1"
            java.lang.String r1 = "默认配置"
            java.lang.String r0 = r3.h(r0, r1)
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L12
            return r1
        L12:
            return r0
    }

    public final java.util.List c() {
            r4 = this;
            java.lang.String r0 = "auto_accept_steps_v1"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.h(r0, r1)
            java.util.List r0 = r9.e0.V(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L20
            x8.s r0 = new x8.s
            java.lang.String r1 = "你好，%friendName%"
            r2 = 25
            r3 = 0
            r0.<init>(r2, r3, r1)
            java.util.List r0 = a.a.x0(r0)
        L20:
            return r0
    }

    public final void d() {
            r3 = this;
            java.lang.String r0 = "zhilia_multi_configs_v1"
            java.lang.String r1 = ""
            java.lang.String r0 = r3.h(r0, r1)
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto Lf
            return
        Lf:
            x8.u r0 = r3.j()
            java.util.List r0 = a.a.x0(r0)
            java.lang.String r1 = "zhilia_active_config_name_v1"
            java.lang.String r2 = "默认配置"
            java.lang.String r1 = r3.h(r1, r2)
            r3.n(r1, r0)
            return
    }

    public final boolean e(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            android.content.SharedPreferences r0 = r2.f21343a     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            if (r0 == 0) goto Lf
            boolean r1 = r0.getBoolean(r3, r1)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r3 = move-exception
            goto L14
        Lf:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> Ld
            goto L1a
        L14:
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L21
            r3 = r0
        L21:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }

    public final int f(java.lang.String r2, int r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f21343a     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            int r2 = r0.getInt(r2, r3)     // Catch: java.lang.Throwable -> L9
            goto Lc
        L9:
            r2 = move-exception
            goto L11
        Lb:
            r2 = r3
        Lc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L9
            goto L17
        L11:
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L17:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L20
            r2 = r3
        L20:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
    }

    public final long g(java.lang.String r5) {
            r4 = this;
            r0 = 2000(0x7d0, double:9.88E-321)
            android.content.SharedPreferences r2 = r4.f21343a     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Ld
            long r2 = r2.getLong(r5, r0)     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r5 = move-exception
            goto L13
        Ld:
            r2 = r0
        Le:
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lb
            goto L19
        L13:
            sf.f r2 = new sf.f
            r2.<init>(r5)
            r5 = r2
        L19:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r1 = r5 instanceof sf.f
            if (r1 == 0) goto L22
            r5 = r0
        L22:
            java.lang.Number r5 = (java.lang.Number) r5
            long r0 = r5.longValue()
            return r0
    }

    public final java.lang.String h(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            android.content.SharedPreferences r0 = r1.f21343a     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            java.lang.String r2 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L10
            goto L18
        Le:
            r2 = move-exception
            goto L12
        L10:
            r2 = r3
            goto L18
        L12:
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L18:
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r3 = r2
        L1f:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public final java.util.List i() {
            r4 = this;
            java.lang.String r0 = "greet_accepted_steps_v1"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.h(r0, r1)
            java.util.List r0 = r9.e0.V(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L20
            x8.s r0 = new x8.s
            java.lang.String r1 = "哈喽，%friendName%！感谢通过好友请求，以后请多指教啦！"
            r2 = 25
            r3 = 0
            r0.<init>(r2, r3, r1)
            java.util.List r0 = a.a.x0(r0)
        L20:
            return r0
    }

    public final x8.u j() {
            r10 = this;
            java.lang.String r0 = "默认配置"
            og.m.t0(r0)
            java.lang.String r0 = "ai_api_key"
            java.lang.String r1 = ""
            java.lang.String r4 = r10.h(r0, r1)
            java.lang.String r0 = "ai_api_base"
            java.lang.String r1 = "https://api.siliconflow.cn/v1"
            java.lang.String r5 = r10.h(r0, r1)
            java.lang.String r0 = "ai_api_path"
            java.lang.String r1 = "/chat/completions"
            java.lang.String r6 = r10.h(r0, r1)
            java.lang.String r0 = "ai_model"
            java.lang.String r1 = "deepseek-ai/DeepSeek-V3"
            java.lang.String r7 = r10.h(r0, r1)
            java.lang.String r0 = "ai_system_prompt"
            java.lang.String r1 = "你是一个简洁、有帮助的聊天助手"
            java.lang.String r8 = r10.h(r0, r1)
            java.lang.String r0 = "ai_context_limit"
            r1 = 10
            int r0 = r10.f(r0, r1)
            r1 = 0
            r2 = 50
            int r9 = r9.e0.r(r0, r1, r2)
            x8.u r2 = new x8.u
            java.lang.String r3 = "默认配置"
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }

    public final void k(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.SharedPreferences r0 = r1.f21343a
            if (r0 == 0) goto L13
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r0 == 0) goto L13
            android.content.SharedPreferences$Editor r2 = r0.putString(r2, r3)
            if (r2 == 0) goto L13
            r2.apply()
        L13:
            return
    }

    public final java.util.List l() {
            r30 = this;
            java.lang.String r0 = "auto_reply_rules_v1"
            java.lang.String r1 = ""
            r2 = r30
            java.lang.String r0 = r2.h(r0, r1)
            boolean r3 = og.m.t0(r0)
            tf.t r4 = tf.t.f13167g
            if (r3 == 0) goto L13
            return r4
        L13:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            uf.c r0 = a.a.E()     // Catch: java.lang.Throwable -> L2b
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            r7 = r6
        L22:
            if (r7 < r5) goto L2f
            uf.c r0 = a.a.t(r0)     // Catch: java.lang.Throwable -> L2b
            r6 = r4
            goto L130
        L2b:
            r0 = move-exception
            r6 = r4
            goto L12a
        L2f:
            org.json.JSONObject r8 = r3.optJSONObject(r7)     // Catch: java.lang.Throwable -> L2b
            if (r8 == 0) goto L11c
            java.lang.String r9 = "id"
            java.lang.String r9 = r8.optString(r9)     // Catch: java.lang.Throwable -> L2b
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L2b
            if (r10 == 0) goto L59
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r11.<init>()     // Catch: java.lang.Throwable -> L2b
            r11.append(r9)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r9 = "_"
            r11.append(r9)     // Catch: java.lang.Throwable -> L2b
            r11.append(r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L2b
        L59:
            java.lang.String r10 = "name"
            int r11 = r7 + 1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r12.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r13 = "规则 "
            r12.append(r13)     // Catch: java.lang.Throwable -> L2b
            r12.append(r11)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r10 = r8.optString(r10, r11)     // Catch: java.lang.Throwable -> L2b
            r10.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r11 = "enabled"
            r12 = 1
            boolean r11 = r8.optBoolean(r11, r12)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r12 = "keyword"
            java.lang.String r12 = r8.optString(r12, r1)     // Catch: java.lang.Throwable -> L2b
            r12.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r13 = "excludedKeywords"
            java.lang.String r13 = r8.optString(r13, r1)     // Catch: java.lang.Throwable -> L2b
            r13.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r14 = "matchType"
            int r14 = r8.optInt(r14, r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r15 = "targetMode"
            int r15 = r8.optInt(r15, r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = "targetIds"
            org.json.JSONArray r6 = r8.optJSONArray(r6)     // Catch: java.lang.Throwable -> L2b
            java.util.Set r16 = r9.e0.W(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = "excludedIds"
            org.json.JSONArray r6 = r8.optJSONArray(r6)     // Catch: java.lang.Throwable -> L2b
            java.util.Set r17 = r9.e0.W(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = "includedGroupMembers"
            org.json.JSONArray r6 = r8.optJSONArray(r6)     // Catch: java.lang.Throwable -> L2b
            java.util.Set r18 = r9.e0.W(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = "excludedGroupMembers"
            org.json.JSONArray r6 = r8.optJSONArray(r6)     // Catch: java.lang.Throwable -> L2b
            java.util.Set r19 = r9.e0.W(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = "atTrigger"
            r2 = 0
            int r20 = r8.optInt(r6, r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = "patTrigger"
            int r21 = r8.optInt(r6, r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "startTime"
            java.lang.String r22 = r8.optString(r2, r1)     // Catch: java.lang.Throwable -> L2b
            r22.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "endTime"
            java.lang.String r23 = r8.optString(r2, r1)     // Catch: java.lang.Throwable -> L2b
            r23.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "maxReplyCount"
            r6 = 0
            int r2 = r8.optInt(r2, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 >= 0) goto Led
            r24 = 0
            goto Lef
        Led:
            r24 = r2
        Lef:
            java.lang.String r2 = "cooldownSeconds"
            r29 = r3
            r6 = r4
            r3 = 0
            long r25 = r8.optLong(r2, r3)     // Catch: java.lang.Throwable -> L11a
            int r2 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r2 >= 0) goto L100
            r25 = r3
        L100:
            java.lang.String r2 = "replyAsQuote"
            r3 = 0
            boolean r27 = r8.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r2 = "steps"
            java.lang.String r2 = r8.optString(r2, r1)     // Catch: java.lang.Throwable -> L11a
            java.util.List r28 = r9.e0.V(r2)     // Catch: java.lang.Throwable -> L11a
            x8.b r8 = new x8.b     // Catch: java.lang.Throwable -> L11a
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)     // Catch: java.lang.Throwable -> L11a
            r0.add(r8)     // Catch: java.lang.Throwable -> L11a
            goto L120
        L11a:
            r0 = move-exception
            goto L12a
        L11c:
            r29 = r3
            r3 = r6
            r6 = r4
        L120:
            int r7 = r7 + 1
            r2 = r30
            r4 = r6
            r6 = r3
            r3 = r29
            goto L22
        L12a:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L130:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L137
            r4 = r6
            goto L138
        L137:
            r4 = r0
        L138:
            java.util.List r4 = (java.util.List) r4
            return r4
    }

    public final void m(x8.t r5) {
            r4 = this;
            android.content.SharedPreferences r0 = r4.f21343a
            if (r0 == 0) goto L134
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21349a
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L1c
            java.lang.String r1 = "wss://api.tenclass.net/xiaozhi/v1/"
        L1c:
            java.lang.String r2 = "xiaozhi_serve_url"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21350b
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L36
            java.lang.String r1 = "https://api.tenclass.net/xiaozhi/ota/"
        L36:
            java.lang.String r2 = "xiaozhi_ota_url"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21351c
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L50
            java.lang.String r1 = "https://xiaozhi.me/console/agents"
        L50:
            java.lang.String r2 = "xiaozhi_console_url"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21352d
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "xiaozhi_console_phone"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21353e
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "xiaozhi_console_token"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21354f
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "xiaozhi_console_agent_id"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21355g
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "xiaozhi_console_model"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21356h
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "xiaozhi_voice_role"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = "xiaozhi_music_mcp"
            boolean r2 = r5.f21357i
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            if (r0 == 0) goto L134
            java.lang.String r1 = "xiaozhi_mcp_bridge_enable"
            boolean r2 = r5.f21358j
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21359k
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "xiaozhi_mcp_endpoint_url"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = "xiaozhi_mcp_kugou_enable"
            boolean r2 = r5.f21360l
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21361m
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "xiaozhi_mcp_kugou_plugin_id"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            java.lang.String r1 = r5.f21362n
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L106
            java.lang.String r1 = "queryKugouMusic"
        L106:
            java.lang.String r2 = "xiaozhi_mcp_kugou_function"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            if (r0 == 0) goto L134
            int r1 = r5.f21363o
            r2 = 1
            r3 = 30
            int r1 = r9.e0.r(r1, r2, r3)
            java.lang.String r2 = "xiaozhi_mcp_ready_seconds"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            if (r0 == 0) goto L134
            int r5 = r5.f21364p
            r1 = 10
            r2 = 600(0x258, float:8.41E-43)
            int r5 = r9.e0.r(r5, r1, r2)
            java.lang.String r1 = "xiaozhi_mcp_idle_seconds"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            if (r5 == 0) goto L134
            r5.apply()
        L134:
            return
    }

    public final void n(java.lang.String r10, java.util.List r11) {
            r9 = this;
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r11)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L10:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r11.next()
            x8.u r1 = (x8.u) r1
            x8.u r1 = r1.b()
            r0.add(r1)
            goto L10
        L24:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            r2 = r1
            x8.u r2 = (x8.u) r2
            java.lang.String r2 = r2.f21365a
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L2d
            r11.add(r1)
            goto L2d
        L46:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L54:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r11.next()
            r3 = r2
            x8.u r3 = (x8.u) r3
            java.lang.String r3 = r3.f21365a
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto L54
            r1.add(r2)
            goto L54
        L6d:
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L7b
            x8.u r11 = r9.j()
            java.util.List r1 = a.a.x0(r11)
        L7b:
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            java.util.Iterator r0 = r1.iterator()
        L84:
            boolean r2 = r0.hasNext()
            r3 = 50
            r4 = 0
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r0.next()
            x8.u r2 = (x8.u) r2
            java.lang.String r5 = r2.f21365a
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "apiKey"
            java.lang.String r8 = r2.f21366b
            r6.put(r7, r8)
            java.lang.String r7 = "apiUrl"
            java.lang.String r8 = r2.f21367c
            r6.put(r7, r8)
            java.lang.String r7 = "apiPath"
            java.lang.String r8 = r2.f21368d
            r6.put(r7, r8)
            java.lang.String r7 = "modelName"
            java.lang.String r8 = r2.f21369e
            r6.put(r7, r8)
            java.lang.String r7 = "systemPrompt"
            java.lang.String r8 = r2.f21370f
            r6.put(r7, r8)
            int r2 = r2.f21371g
            int r2 = r9.e0.r(r2, r4, r3)
            java.lang.String r3 = "contextLimit"
            r6.put(r3, r2)
            r11.put(r5, r6)
            goto L84
        Lcc:
            java.util.Iterator r0 = r1.iterator()
        Ld0:
            boolean r2 = r0.hasNext()
            r5 = 0
            if (r2 == 0) goto Le7
            java.lang.Object r2 = r0.next()
            r6 = r2
            x8.u r6 = (x8.u) r6
            java.lang.String r6 = r6.f21365a
            boolean r6 = gg.l.a(r6, r10)
            if (r6 == 0) goto Ld0
            goto Le8
        Le7:
            r2 = r5
        Le8:
            x8.u r2 = (x8.u) r2
            if (r2 == 0) goto Lf1
            java.lang.String r10 = r2.f21365a
            if (r10 == 0) goto Lf1
            goto Lf9
        Lf1:
            java.lang.Object r10 = tf.m.t1(r1)
            x8.u r10 = (x8.u) r10
            java.lang.String r10 = r10.f21365a
        Lf9:
            android.content.SharedPreferences r0 = r9.f21343a
            if (r0 == 0) goto L11a
            android.content.SharedPreferences$Editor r2 = r0.edit()
            if (r2 == 0) goto L11a
            java.lang.String r6 = "zhilia_multi_configs_v1"
            java.lang.String r11 = r11.toString()
            android.content.SharedPreferences$Editor r11 = r2.putString(r6, r11)
            if (r11 == 0) goto L11a
            java.lang.String r2 = "zhilia_active_config_name_v1"
            android.content.SharedPreferences$Editor r11 = r11.putString(r2, r10)
            if (r11 == 0) goto L11a
            r11.apply()
        L11a:
            java.util.Iterator r11 = r1.iterator()
        L11e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L134
            java.lang.Object r1 = r11.next()
            r2 = r1
            x8.u r2 = (x8.u) r2
            java.lang.String r2 = r2.f21365a
            boolean r2 = gg.l.a(r2, r10)
            if (r2 == 0) goto L11e
            r5 = r1
        L134:
            x8.u r5 = (x8.u) r5
            if (r5 == 0) goto L183
            if (r0 == 0) goto L183
            android.content.SharedPreferences$Editor r10 = r0.edit()
            if (r10 == 0) goto L183
            java.lang.String r11 = "ai_api_key"
            java.lang.String r0 = r5.f21366b
            android.content.SharedPreferences$Editor r10 = r10.putString(r11, r0)
            if (r10 == 0) goto L183
            java.lang.String r11 = "ai_api_base"
            java.lang.String r0 = r5.f21367c
            android.content.SharedPreferences$Editor r10 = r10.putString(r11, r0)
            if (r10 == 0) goto L183
            java.lang.String r11 = "ai_api_path"
            java.lang.String r0 = r5.f21368d
            android.content.SharedPreferences$Editor r10 = r10.putString(r11, r0)
            if (r10 == 0) goto L183
            java.lang.String r11 = "ai_model"
            java.lang.String r0 = r5.f21369e
            android.content.SharedPreferences$Editor r10 = r10.putString(r11, r0)
            if (r10 == 0) goto L183
            java.lang.String r11 = "ai_system_prompt"
            java.lang.String r0 = r5.f21370f
            android.content.SharedPreferences$Editor r10 = r10.putString(r11, r0)
            if (r10 == 0) goto L183
            int r11 = r5.f21371g
            int r11 = r9.e0.r(r11, r4, r3)
            java.lang.String r0 = "ai_context_limit"
            android.content.SharedPreferences$Editor r10 = r10.putInt(r0, r11)
            if (r10 == 0) goto L183
            r10.apply()
        L183:
            return
    }

    public final x8.t o() {
            r19 = this;
            r0 = r19
            x8.t r1 = new x8.t
            java.lang.String r2 = "xiaozhi_serve_url"
            java.lang.String r3 = "wss://api.tenclass.net/xiaozhi/v1/"
            java.lang.String r2 = r0.h(r2, r3)
            java.lang.String r3 = "xiaozhi_ota_url"
            java.lang.String r4 = "https://api.tenclass.net/xiaozhi/ota/"
            java.lang.String r3 = r0.h(r3, r4)
            java.lang.String r4 = "xiaozhi_console_url"
            java.lang.String r5 = "https://xiaozhi.me/console/agents"
            java.lang.String r4 = r0.h(r4, r5)
            java.lang.String r5 = "xiaozhi_console_phone"
            java.lang.String r6 = ""
            java.lang.String r5 = r0.h(r5, r6)
            java.lang.String r7 = "xiaozhi_console_token"
            java.lang.String r7 = r0.h(r7, r6)
            java.lang.String r8 = "xiaozhi_console_agent_id"
            java.lang.String r8 = r0.h(r8, r6)
            java.lang.String r9 = "xiaozhi_console_model"
            java.lang.String r9 = r0.h(r9, r6)
            java.lang.String r10 = "xiaozhi_voice_role"
            java.lang.String r10 = r0.h(r10, r6)
            java.lang.String r11 = "xiaozhi_music_mcp"
            boolean r11 = r0.e(r11)
            java.lang.String r12 = "xiaozhi_mcp_bridge_enable"
            boolean r12 = r0.e(r12)
            java.lang.String r13 = "xiaozhi_mcp_endpoint_url"
            java.lang.String r6 = r0.h(r13, r6)
            java.lang.String r13 = "xiaozhi_mcp_kugou_enable"
            boolean r13 = r0.e(r13)
            java.lang.String r14 = "xiaozhi_mcp_kugou_plugin_id"
            java.lang.String r15 = "QQ点歌"
            java.lang.String r14 = r0.h(r14, r15)
            java.lang.String r15 = "xiaozhi_mcp_kugou_function"
            r16 = r1
            java.lang.String r1 = "queryKugouMusic"
            java.lang.String r15 = r0.h(r15, r1)
            java.lang.String r1 = "xiaozhi_mcp_ready_seconds"
            r17 = r2
            r2 = 5
            int r1 = r0.f(r1, r2)
            java.lang.String r2 = "xiaozhi_mcp_idle_seconds"
            r18 = r1
            r1 = 90
            int r1 = r0.f(r2, r1)
            r2 = r12
            r12 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r2
            r2 = r17
            r17 = r1
            r1 = r16
            r16 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r16 = r1
            return r16
    }

    public final java.util.List p() {
            r19 = this;
            java.lang.String r0 = "deepseek-ai/DeepSeek-V3"
            java.lang.String r1 = "/chat/completions"
            java.lang.String r2 = "https://api.siliconflow.cn/v1"
            tf.t r3 = tf.t.f13167g
            java.lang.String r4 = "zhilia_multi_configs_v1"
            java.lang.String r5 = ""
            r6 = r19
            java.lang.String r4 = r6.h(r4, r5)
            boolean r7 = og.m.t0(r4)     // Catch: java.lang.Throwable -> L9c
            if (r7 == 0) goto L1b
            r0 = r3
            goto Lae
        L1b:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9c
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L9c
            uf.c r4 = a.a.E()     // Catch: java.lang.Throwable -> L9c
            java.util.Iterator r8 = r7.keys()     // Catch: java.lang.Throwable -> L9c
            r8.getClass()     // Catch: java.lang.Throwable -> L9c
        L2b:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L9c
            if (r9 == 0) goto La3
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L9c
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L9c
            org.json.JSONObject r9 = r7.optJSONObject(r11)     // Catch: java.lang.Throwable -> L9c
            if (r9 == 0) goto L9e
            r11.getClass()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r10 = "apiKey"
            java.lang.String r12 = r9.optString(r10, r5)     // Catch: java.lang.Throwable -> L9c
            r12.getClass()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r10 = "apiUrl"
            java.lang.String r10 = r9.optString(r10, r2)     // Catch: java.lang.Throwable -> L9c
            boolean r13 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L9c
            if (r13 == 0) goto L58
            r13 = r2
            goto L59
        L58:
            r13 = r10
        L59:
            java.lang.String r10 = "apiPath"
            java.lang.String r10 = r9.optString(r10, r1)     // Catch: java.lang.Throwable -> L9c
            boolean r14 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L9c
            if (r14 == 0) goto L67
            r14 = r1
            goto L68
        L67:
            r14 = r10
        L68:
            java.lang.String r10 = "modelName"
            java.lang.String r10 = r9.optString(r10, r0)     // Catch: java.lang.Throwable -> L9c
            boolean r15 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L9c
            if (r15 == 0) goto L76
            r15 = r0
            goto L77
        L76:
            r15 = r10
        L77:
            java.lang.String r10 = "systemPrompt"
            r18 = r0
            java.lang.String r0 = "你是一个简洁、有帮助的聊天助手"
            java.lang.String r16 = r9.optString(r10, r0)     // Catch: java.lang.Throwable -> L9c
            r16.getClass()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = "contextLimit"
            r10 = 10
            int r0 = r9.optInt(r0, r10)     // Catch: java.lang.Throwable -> L9c
            r9 = 0
            r10 = 50
            int r17 = r9.e0.r(r0, r9, r10)     // Catch: java.lang.Throwable -> L9c
            x8.u r10 = new x8.u     // Catch: java.lang.Throwable -> L9c
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L9c
            r4.add(r10)     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r0 = move-exception
            goto La8
        L9e:
            r18 = r0
        La0:
            r0 = r18
            goto L2b
        La3:
            uf.c r0 = a.a.t(r4)     // Catch: java.lang.Throwable -> L9c
            goto Lae
        La8:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        Lae:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto Lb4
            goto Lb5
        Lb4:
            r3 = r0
        Lb5:
            java.util.List r3 = (java.util.List) r3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lc5
            x8.u r0 = r6.j()
            java.util.List r3 = a.a.x0(r0)
        Lc5:
            return r3
    }
}
