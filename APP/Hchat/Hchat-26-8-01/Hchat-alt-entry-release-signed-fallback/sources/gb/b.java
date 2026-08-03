package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final okhttp3.MediaType f4408a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final okhttp3.OkHttpClient f4409b = null;

    static {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            java.lang.String r1 = "application/json; charset=utf-8"
            okhttp3.MediaType r0 = r0.get(r1)
            gb.b.f4408a = r0
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r1 = 15
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r1, r3)
            r1 = 120(0x78, double:5.93E-322)
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r1, r3)
            okhttp3.OkHttpClient$Builder r0 = r0.writeTimeout(r1, r3)
            r1 = 180(0xb4, double:8.9E-322)
            okhttp3.OkHttpClient$Builder r0 = r0.callTimeout(r1, r3)
            okhttp3.OkHttpClient r0 = r0.build()
            gb.b.f4409b = r0
            return
    }

    public static java.lang.Object a(android.content.Context r7, gb.s r8, java.lang.String r9, java.lang.String r10) {
            boolean r0 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L53
            gb.a r2 = gb.a.f4405h     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "v1"
            java.lang.String r1 = "plugins"
            java.lang.String r3 = "comments"
            java.lang.String[] r9 = new java.lang.String[]{r0, r1, r9, r3}     // Catch: java.lang.Throwable -> L5b
            java.util.List r3 = a.a.y0(r9)     // Catch: java.lang.Throwable -> L5b
            org.json.JSONObject r4 = r8.a()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = "content"
            r4.put(r8, r10)     // Catch: java.lang.Throwable -> L5b
            tf.u r6 = tf.u.f13168g     // Catch: java.lang.Throwable -> L5b
            r5 = 0
            r1 = r7
            org.json.JSONObject r7 = l(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5b
            org.json.JSONObject r7 = c(r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = "comment"
            org.json.JSONObject r8 = r7.optJSONObject(r8)     // Catch: java.lang.Throwable -> L5b
            if (r8 == 0) goto L4b
            gb.c r8 = gb.q.b(r8)     // Catch: java.lang.Throwable -> L5b
            gb.d r9 = new gb.d     // Catch: java.lang.Throwable -> L5b
            java.lang.String r10 = "commentCount"
            r0 = 0
            long r2 = r7.optLong(r10, r0)     // Catch: java.lang.Throwable -> L5b
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L46
            goto L47
        L46:
            r0 = r2
        L47:
            r9.<init>(r8, r0)     // Catch: java.lang.Throwable -> L5b
            return r9
        L4b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = "插件仓库未返回新评论"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L5b
            throw r7     // Catch: java.lang.Throwable -> L5b
        L53:
            java.lang.String r7 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            throw r8     // Catch: java.lang.Throwable -> L5b
        L5b:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }

    public static java.lang.Object b(android.content.Context r10, java.lang.String r11, gb.s r12) {
            java.lang.String r0 = "limit"
            boolean r1 = og.m.t0(r11)     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L96
            r1 = 100
            r2 = 1
            int r3 = r9.e0.r(r1, r2, r1)     // Catch: java.lang.Throwable -> L9e
            gb.a r5 = gb.a.f4404g     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "v1"
            java.lang.String r6 = "plugins"
            java.lang.String r7 = "comments"
            java.lang.String[] r11 = new java.lang.String[]{r4, r6, r11, r7}     // Catch: java.lang.Throwable -> L9e
            java.util.List r6 = a.a.y0(r11)     // Catch: java.lang.Throwable -> L9e
            uf.g r11 = new uf.g     // Catch: java.lang.Throwable -> L9e
            r11.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L9e
            r11.put(r0, r4)     // Catch: java.lang.Throwable -> L9e
            if (r12 == 0) goto L3e
            java.lang.String r12 = r12.f4476a     // Catch: java.lang.Throwable -> L9e
            boolean r4 = og.m.t0(r12)     // Catch: java.lang.Throwable -> L9e
            if (r4 != 0) goto L36
            goto L37
        L36:
            r12 = 0
        L37:
            if (r12 == 0) goto L3e
            java.lang.String r4 = "userWxId"
            r11.put(r4, r12)     // Catch: java.lang.Throwable -> L9e
        L3e:
            uf.g r9 = r11.c()     // Catch: java.lang.Throwable -> L9e
            r7 = 0
            r8 = 0
            r4 = r10
            org.json.JSONObject r10 = l(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9e
            org.json.JSONObject r10 = c(r10)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r11 = "items"
            org.json.JSONArray r11 = r10.optJSONArray(r11)     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto L56
            goto L5b
        L56:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L9e
            r11.<init>()     // Catch: java.lang.Throwable -> L9e
        L5b:
            uf.c r12 = a.a.E()     // Catch: java.lang.Throwable -> L9e
            int r4 = r11.length()     // Catch: java.lang.Throwable -> L9e
            r5 = 0
        L64:
            if (r5 < r4) goto L86
            uf.c r11 = a.a.t(r12)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = "total"
            r4 = 0
            long r6 = r10.optLong(r12, r4)     // Catch: java.lang.Throwable -> L9e
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 >= 0) goto L77
            goto L78
        L77:
            r4 = r6
        L78:
            int r10 = r10.optInt(r0, r3)     // Catch: java.lang.Throwable -> L9e
            int r10 = r9.e0.r(r10, r2, r1)     // Catch: java.lang.Throwable -> L9e
            gb.e r12 = new gb.e     // Catch: java.lang.Throwable -> L9e
            r12.<init>(r11, r4, r10)     // Catch: java.lang.Throwable -> L9e
            return r12
        L86:
            org.json.JSONObject r6 = r11.optJSONObject(r5)     // Catch: java.lang.Throwable -> L9e
            if (r6 == 0) goto L93
            gb.c r6 = gb.q.b(r6)     // Catch: java.lang.Throwable -> L9e
            r12.add(r6)     // Catch: java.lang.Throwable -> L9e
        L93:
            int r5 = r5 + 1
            goto L64
        L96:
            java.lang.String r10 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L9e
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = move-exception
            r10 = r0
            sf.f r11 = new sf.f
            r11.<init>(r10)
            return r11
    }

    public static org.json.JSONObject c(org.json.JSONObject r1) {
            java.lang.String r0 = "data"
            java.lang.Object r1 = r1.opt(r0)
            boolean r0 = r1 instanceof org.json.JSONObject
            if (r0 == 0) goto Ld
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            return r1
        Ld:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            return r1
    }

    public static java.lang.Object d(android.content.Context r7, gb.m r8) {
            java.lang.String r0 = r8.f4443a
            boolean r1 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L36
            java.lang.String r1 = "v1"
            java.lang.String r2 = "plugins"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r0}     // Catch: java.lang.Throwable -> L3e
            java.util.List r3 = a.a.y0(r0)     // Catch: java.lang.Throwable -> L3e
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "installId"
            java.lang.String r1 = gb.q.d(r7)     // Catch: java.lang.Throwable -> L3e
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "ownerToken"
            java.lang.String r1 = r8.f4444b     // Catch: java.lang.Throwable -> L3e
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = r8.f4444b     // Catch: java.lang.Throwable -> L3e
            gb.a r2 = gb.a.f4406i     // Catch: java.lang.Throwable -> L3e
            tf.u r6 = tf.u.f13168g     // Catch: java.lang.Throwable -> L3e
            r1 = r7
            l(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3e
            sf.n r7 = sf.n.f12433a     // Catch: java.lang.Throwable -> L3e
            return r7
        L36:
            java.lang.String r7 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }

    public static java.lang.Object e(android.content.Context r7, gb.s r8, java.lang.String r9, java.lang.String r10) {
            r10.getClass()
            boolean r0 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L65
            if (r0 != 0) goto L5d
            boolean r0 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L65
            if (r0 != 0) goto L55
            gb.a r2 = gb.a.f4406i     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = "v1"
            java.lang.String r1 = "plugins"
            java.lang.String r3 = "comments"
            java.lang.String[] r9 = new java.lang.String[]{r0, r1, r9, r3, r10}     // Catch: java.lang.Throwable -> L65
            java.util.List r3 = a.a.y0(r9)     // Catch: java.lang.Throwable -> L65
            org.json.JSONObject r4 = r8.a()     // Catch: java.lang.Throwable -> L65
            tf.u r6 = tf.u.f13168g     // Catch: java.lang.Throwable -> L65
            r5 = 0
            r1 = r7
            org.json.JSONObject r7 = l(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L65
            org.json.JSONObject r7 = c(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = "deleted"
            r9 = 0
            boolean r8 = r7.optBoolean(r8, r9)     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L4d
            gb.d r8 = new gb.d     // Catch: java.lang.Throwable -> L65
            java.lang.String r9 = "commentCount"
            r0 = 0
            long r9 = r7.optLong(r9, r0)     // Catch: java.lang.Throwable -> L65
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 >= 0) goto L47
            goto L48
        L47:
            r0 = r9
        L48:
            r7 = 0
            r8.<init>(r7, r0)     // Catch: java.lang.Throwable -> L65
            return r8
        L4d:
            java.lang.String r7 = "插件仓库未确认评论已删除"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L55:
            java.lang.String r7 = "评论 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5d:
            java.lang.String r7 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }

    public static java.lang.Object f(android.content.Context r7, java.lang.String r8) {
            boolean r0 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L26
            gb.a r2 = gb.a.f4404g     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "v1"
            java.lang.String r1 = "plugins"
            java.lang.String[] r8 = new java.lang.String[]{r0, r1, r8}     // Catch: java.lang.Throwable -> L2e
            java.util.List r3 = a.a.y0(r8)     // Catch: java.lang.Throwable -> L2e
            tf.u r6 = tf.u.f13168g     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5 = 0
            r1 = r7
            org.json.JSONObject r7 = l(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r7 = c(r7)     // Catch: java.lang.Throwable -> L2e
            gb.o r7 = gb.q.c(r7)     // Catch: java.lang.Throwable -> L2e
            return r7
        L26:
            java.lang.String r7 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L2e
            throw r8     // Catch: java.lang.Throwable -> L2e
        L2e:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }

    public static java.lang.String g(org.json.JSONObject r2, int r3) {
            java.lang.String r0 = "error"
            java.lang.Object r2 = r2.opt(r0)
            boolean r0 = r2 instanceof org.json.JSONObject
            if (r0 == 0) goto L1d
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r0 = "message"
            java.lang.String r0 = r2.optString(r0)
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L2f
            java.lang.String r0 = r2.toString()
            goto L2f
        L1d:
            if (r2 == 0) goto L2d
            java.lang.Object r0 = org.json.JSONObject.NULL
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L28
            goto L2d
        L28:
            java.lang.String r0 = r2.toString()
            goto L2f
        L2d:
            java.lang.String r0 = ""
        L2f:
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L3c
            java.lang.String r2 = "插件仓库请求失败: HTTP "
            java.lang.String r2 = eh.a.l(r3, r2)
            return r2
        L3c:
            return r0
    }

    public static java.lang.Object h(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
            boolean r0 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L36
            boolean r0 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L2e
            gb.a r2 = gb.a.f4404g     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "v1"
            java.lang.String r1 = "plugins"
            java.lang.String r3 = "snapshots"
            java.lang.String[] r8 = new java.lang.String[]{r0, r1, r8, r3, r9}     // Catch: java.lang.Throwable -> L3e
            java.util.List r3 = a.a.y0(r8)     // Catch: java.lang.Throwable -> L3e
            tf.u r6 = tf.u.f13168g     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            r5 = 0
            r1 = r7
            org.json.JSONObject r7 = l(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3e
            org.json.JSONObject r7 = c(r7)     // Catch: java.lang.Throwable -> L3e
            gb.o r7 = gb.q.c(r7)     // Catch: java.lang.Throwable -> L3e
            return r7
        L2e:
            java.lang.String r7 = "历史版本 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        L36:
            java.lang.String r7 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }

    public static java.lang.Object i(android.content.Context r7, java.lang.String r8, gb.s r9) {
            boolean r0 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L41
            gb.a r2 = gb.a.f4405h     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "v1"
            java.lang.String r1 = "plugins"
            java.lang.String r3 = "likes"
            java.lang.String[] r8 = new java.lang.String[]{r0, r1, r8, r3}     // Catch: java.lang.Throwable -> L49
            java.util.List r3 = a.a.y0(r8)     // Catch: java.lang.Throwable -> L49
            org.json.JSONObject r4 = r9.a()     // Catch: java.lang.Throwable -> L49
            tf.u r6 = tf.u.f13168g     // Catch: java.lang.Throwable -> L49
            r5 = 0
            r1 = r7
            org.json.JSONObject r7 = l(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L49
            org.json.JSONObject r7 = c(r7)     // Catch: java.lang.Throwable -> L49
            gb.l r8 = new gb.l     // Catch: java.lang.Throwable -> L49
            java.lang.String r9 = "liked"
            r0 = 0
            boolean r9 = r7.optBoolean(r9, r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "likeCount"
            r1 = 0
            long r3 = r7.optLong(r0, r1)     // Catch: java.lang.Throwable -> L49
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 >= 0) goto L3c
            goto L3d
        L3c:
            r1 = r3
        L3d:
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> L49
            return r8
        L41:
            java.lang.String r7 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L49
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L49
            throw r8     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }

    public static java.lang.Object j(android.content.Context r7, java.lang.String r8, gb.s r9) {
            boolean r0 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L47
            gb.a r2 = gb.a.f4404g     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "v1"
            java.lang.String r1 = "plugins"
            java.lang.String r3 = "likes"
            java.lang.String[] r8 = new java.lang.String[]{r0, r1, r8, r3}     // Catch: java.lang.Throwable -> L4f
            java.util.List r3 = a.a.y0(r8)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = "userWxId"
            java.lang.String r9 = r9.f4476a     // Catch: java.lang.Throwable -> L4f
            java.util.Map r6 = java.util.Collections.singletonMap(r8, r9)     // Catch: java.lang.Throwable -> L4f
            r6.getClass()     // Catch: java.lang.Throwable -> L4f
            r4 = 0
            r5 = 0
            r1 = r7
            org.json.JSONObject r7 = l(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4f
            org.json.JSONObject r7 = c(r7)     // Catch: java.lang.Throwable -> L4f
            gb.l r8 = new gb.l     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = "liked"
            r0 = 0
            boolean r9 = r7.optBoolean(r9, r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "likeCount"
            r1 = 0
            long r3 = r7.optLong(r0, r1)     // Catch: java.lang.Throwable -> L4f
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 >= 0) goto L42
            goto L43
        L42:
            r1 = r3
        L43:
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> L4f
            return r8
        L47:
            java.lang.String r7 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L4f
            throw r8     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }

    public static java.io.Serializable k(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            boolean r0 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L68
            boolean r0 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L60
            boolean r0 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L58
            gb.a r2 = gb.a.f4405h     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "v1"
            java.lang.String r1 = "plugins"
            java.lang.String r3 = "downloads"
            java.lang.String[] r8 = new java.lang.String[]{r0, r1, r8, r3}     // Catch: java.lang.Throwable -> L70
            java.util.List r3 = a.a.y0(r8)     // Catch: java.lang.Throwable -> L70
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L70
            r4.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = "versionId"
            r4.put(r8, r9)     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = "eventId"
            r4.put(r8, r10)     // Catch: java.lang.Throwable -> L70
            tf.u r6 = tf.u.f13168g     // Catch: java.lang.Throwable -> L70
            r5 = 0
            r1 = r7
            org.json.JSONObject r7 = l(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L70
            org.json.JSONObject r7 = c(r7)     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = "downloadCount"
            r9 = -1
            long r7 = r7.optLong(r8, r9)     // Catch: java.lang.Throwable -> L70
            r9 = 0
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L50
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L70
            return r7
        L50:
            java.lang.String r7 = "插件仓库未返回有效下载量"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L70
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L70
            throw r8     // Catch: java.lang.Throwable -> L70
        L58:
            java.lang.String r7 = "下载事件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L70
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L70
            throw r8     // Catch: java.lang.Throwable -> L70
        L60:
            java.lang.String r7 = "远程插件版本 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L70
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L70
            throw r8     // Catch: java.lang.Throwable -> L70
        L68:
            java.lang.String r7 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L70
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L70
            throw r8     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }

    public static org.json.JSONObject l(android.content.Context r10, gb.a r11, java.util.List r12, org.json.JSONObject r13, java.lang.String r14, java.util.Map r15) {
            java.lang.String r1 = "ok"
            java.lang.String r2 = " path=/"
            r10.getClass()
            android.content.Context r0 = r10.getApplicationContext()
            if (r0 == 0) goto Le
            goto Lf
        Le:
            r0 = r10
        Lf:
            java.lang.String r3 = "Hchat_script_plugin_market"
            android.content.SharedPreferences r0 = ub.b.c(r0, r3)
            java.lang.String r3 = "service_url"
            java.lang.String r4 = "https://hchat.208.75.133.91.sslip.io"
            java.lang.String r0 = r0.getString(r3, r4)
            r3 = 0
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L37
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L37
            char[] r7 = new char[r5]
            r8 = 47
            r7[r3] = r8
            java.lang.String r0 = og.m.U0(r0, r7)
            goto L38
        L37:
            r0 = r6
        L38:
            java.lang.String r7 = ""
            if (r0 != 0) goto L3d
            r0 = r7
        L3d:
            boolean r8 = og.m.t0(r0)
            if (r8 == 0) goto L44
            goto L45
        L44:
            r4 = r0
        L45:
            java.lang.CharSequence r0 = og.m.R0(r4)
            java.lang.String r0 = r0.toString()
            okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.Companion     // Catch: java.lang.Throwable -> L54
            okhttp3.HttpUrl r0 = r4.parse(r0)     // Catch: java.lang.Throwable -> L54
            goto L5b
        L54:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L5b:
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto L61
            r0 = r6
        L61:
            okhttp3.HttpUrl r0 = (okhttp3.HttpUrl) r0
            if (r0 == 0) goto L2e9
            java.lang.String r4 = r0.scheme()
            java.lang.String r8 = "https"
            boolean r4 = gg.l.a(r4, r8)
            if (r4 != 0) goto L84
            java.lang.String r4 = r0.scheme()
            java.lang.String r8 = "http"
            boolean r4 = gg.l.a(r4, r8)
            if (r4 == 0) goto L7e
            goto L84
        L7e:
            java.lang.String r10 = "插件仓库只支持 HTTP/HTTPS 地址"
            j8.o.t(r10)
            return r6
        L84:
            okhttp3.HttpUrl$Builder r0 = r0.newBuilder()
            java.util.Iterator r4 = r12.iterator()
        L8c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto Lb8
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = og.m.t0(r8)
            if (r9 != 0) goto Lb2
            java.lang.String r9 = "."
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lb2
            java.lang.String r9 = ".."
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lb2
            r0.addPathSegment(r8)
            goto L8c
        Lb2:
            java.lang.String r10 = "插件仓库路径无效"
            j8.o.t(r10)
            return r6
        Lb8:
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        Lc0:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto Le2
            java.lang.Object r4 = r15.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r8 = r4.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r9 = og.m.t0(r4)
            if (r9 != 0) goto Lc0
            r0.addQueryParameter(r8, r4)
            goto Lc0
        Le2:
            okhttp3.HttpUrl r15 = r0.build()
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Request$Builder r15 = r0.url(r15)
            java.lang.String r0 = "Accept"
            java.lang.String r4 = "application/json"
            okhttp3.Request$Builder r15 = r15.header(r0, r4)
            java.lang.String r0 = "X-Hchat-Install-Id"
            java.lang.String r10 = gb.q.d(r10)
            okhttp3.Request$Builder r10 = r15.header(r0, r10)
            if (r14 == 0) goto L122
            java.lang.CharSequence r14 = og.m.R0(r14)
            java.lang.String r14 = r14.toString()
            if (r14 == 0) goto L122
            boolean r15 = og.m.t0(r14)
            if (r15 != 0) goto L114
            goto L115
        L114:
            r14 = r6
        L115:
            if (r14 == 0) goto L122
            java.lang.String r15 = "Bearer "
            java.lang.String r14 = r15.concat(r14)
            java.lang.String r15 = "Authorization"
            r10.header(r15, r14)
        L122:
            int r14 = r11.ordinal()
            if (r14 == 0) goto L165
            okhttp3.MediaType r15 = gb.b.f4408a
            if (r14 == r5) goto L14c
            r0 = 2
            if (r14 != r0) goto L148
            okhttp3.RequestBody$Companion r14 = okhttp3.RequestBody.Companion
            if (r13 == 0) goto L134
            goto L139
        L134:
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
        L139:
            java.lang.String r13 = r13.toString()
            r13.getClass()
            okhttp3.RequestBody r13 = r14.create(r13, r15)
            r10.delete(r13)
            goto L168
        L148:
            okio.a.k()
            return r6
        L14c:
            okhttp3.RequestBody$Companion r14 = okhttp3.RequestBody.Companion
            if (r13 == 0) goto L151
            goto L156
        L151:
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
        L156:
            java.lang.String r13 = r13.toString()
            r13.getClass()
            okhttp3.RequestBody r13 = r14.create(r13, r15)
            r10.post(r13)
            goto L168
        L165:
            r10.get()
        L168:
            r13 = 10
            okhttp3.OkHttpClient r14 = gb.b.f4409b     // Catch: java.lang.Throwable -> L1c3 java.io.IOException -> L27b gb.f -> L2c0
            okhttp3.Request r10 = r10.build()     // Catch: java.lang.Throwable -> L1c3 java.io.IOException -> L1c7 gb.f -> L1cc
            okhttp3.Call r10 = r14.newCall(r10)     // Catch: java.lang.Throwable -> L1c3 java.io.IOException -> L1c7 gb.f -> L1cc
            okhttp3.Response r10 = r10.execute()     // Catch: java.lang.Throwable -> L1c3 java.io.IOException -> L1c7 gb.f -> L1cc
            okhttp3.ResponseBody r14 = r10.body()     // Catch: java.lang.Throwable -> L183
            if (r14 == 0) goto L187
            java.lang.String r14 = r14.string()     // Catch: java.lang.Throwable -> L183
            goto L188
        L183:
            r0 = move-exception
            r14 = r0
            goto L232
        L187:
            r14 = r6
        L188:
            if (r14 != 0) goto L18b
            goto L18c
        L18b:
            r7 = r14
        L18c:
            boolean r14 = og.m.t0(r7)     // Catch: java.lang.Throwable -> L195
            if (r14 == 0) goto L198
            java.lang.String r7 = "{}"
            goto L198
        L195:
            r0 = move-exception
            r14 = r0
            goto L19e
        L198:
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L195
            r14.<init>(r7)     // Catch: java.lang.Throwable -> L195
            goto L1a4
        L19e:
            sf.f r15 = new sf.f     // Catch: java.lang.Throwable -> L183
            r15.<init>(r14)     // Catch: java.lang.Throwable -> L183
            r14 = r15
        L1a4:
            java.lang.Throwable r15 = sf.g.b(r14)     // Catch: java.lang.Throwable -> L183
            if (r15 != 0) goto L212
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch: java.lang.Throwable -> L183
            boolean r15 = r14.has(r1)     // Catch: java.lang.Throwable -> L183
            if (r15 == 0) goto L205
            boolean r15 = r14.optBoolean(r1, r3)     // Catch: java.lang.Throwable -> L183
            boolean r0 = r10.isSuccessful()     // Catch: java.lang.Throwable -> L183
            if (r0 == 0) goto L1d1
            if (r15 != 0) goto L1bf
            goto L1d1
        L1bf:
            r10.close()     // Catch: java.lang.Throwable -> L1c3 java.io.IOException -> L1c7 gb.f -> L1cc
            return r14
        L1c3:
            r0 = move-exception
            r10 = r0
            goto L239
        L1c7:
            r0 = move-exception
            r10 = r0
            r3 = r12
            goto L27e
        L1cc:
            r0 = move-exception
            r10 = r0
            r3 = r12
            goto L2c3
        L1d1:
            gb.f r15 = new gb.f     // Catch: java.lang.Throwable -> L183
            int r0 = r10.code()     // Catch: java.lang.Throwable -> L183
            java.lang.String r0 = g(r14, r0)     // Catch: java.lang.Throwable -> L183
            r10.code()     // Catch: java.lang.Throwable -> L183
            java.lang.String r1 = "error"
            org.json.JSONObject r14 = r14.optJSONObject(r1)     // Catch: java.lang.Throwable -> L183
            if (r14 == 0) goto L1ff
            java.lang.String r1 = "code"
            java.lang.String r14 = r14.optString(r1)     // Catch: java.lang.Throwable -> L183
            if (r14 == 0) goto L1ff
            java.lang.CharSequence r14 = og.m.R0(r14)     // Catch: java.lang.Throwable -> L183
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L183
            if (r14 == 0) goto L1ff
            boolean r1 = og.m.t0(r14)     // Catch: java.lang.Throwable -> L183
            if (r1 != 0) goto L1ff
            goto L200
        L1ff:
            r14 = r6
        L200:
            r1 = 4
            r15.<init>(r0, r1, r14, r6)     // Catch: java.lang.Throwable -> L183
            throw r15     // Catch: java.lang.Throwable -> L183
        L205:
            gb.f r14 = new gb.f     // Catch: java.lang.Throwable -> L183
            java.lang.String r15 = "插件仓库响应缺少 ok 字段"
            r10.code()     // Catch: java.lang.Throwable -> L183
            r0 = 12
            r14.<init>(r15, r0, r6, r6)     // Catch: java.lang.Throwable -> L183
            throw r14     // Catch: java.lang.Throwable -> L183
        L212:
            gb.f r14 = new gb.f     // Catch: java.lang.Throwable -> L183
            int r0 = r10.code()     // Catch: java.lang.Throwable -> L183
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L183
            r1.<init>()     // Catch: java.lang.Throwable -> L183
            java.lang.String r3 = "插件仓库返回了无效 JSON: HTTP "
            r1.append(r3)     // Catch: java.lang.Throwable -> L183
            r1.append(r0)     // Catch: java.lang.Throwable -> L183
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L183
            r10.code()     // Catch: java.lang.Throwable -> L183
            r1 = 8
            r14.<init>(r0, r1, r6, r15)     // Catch: java.lang.Throwable -> L183
            throw r14     // Catch: java.lang.Throwable -> L183
        L232:
            throw r14     // Catch: java.lang.Throwable -> L233
        L233:
            r0 = move-exception
            r15 = r0
            ig.a.i(r10, r14)     // Catch: java.lang.Throwable -> L1c3 java.io.IOException -> L1c7 gb.f -> L1cc
            throw r15     // Catch: java.lang.Throwable -> L1c3 java.io.IOException -> L1c7 gb.f -> L1cc
        L239:
            gb.f r14 = new gb.f
            java.lang.String r15 = r10.getMessage()
            if (r15 == 0) goto L242
            goto L24a
        L242:
            java.lang.Class r15 = r10.getClass()
            java.lang.String r15 = r15.getSimpleName()
        L24a:
            java.lang.String r0 = "插件仓库请求失败: "
            java.lang.String r15 = r0.concat(r15)
            r14.<init>(r15, r13, r6, r10)
            java.lang.String r10 = r11.name()
            r7 = 0
            r8 = 62
            java.lang.String r4 = "/"
            r5 = 0
            r6 = 0
            r3 = r12
            java.lang.String r11 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "[Hchat:PluginMarket] 请求异常 method="
            r12.<init>(r13)
            r12.append(r10)
            r12.append(r2)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            fb.v0.n(r10, r14)
            throw r14
        L27b:
            r0 = move-exception
            r3 = r12
            r10 = r0
        L27e:
            boolean r12 = r10 instanceof java.net.SocketTimeoutException
            if (r12 != 0) goto L292
            java.lang.String r12 = r10.getMessage()
            if (r12 == 0) goto L289
            goto L28b
        L289:
            java.lang.String r12 = "网络不可用"
        L28b:
            java.lang.String r14 = "插件仓库网络请求失败: "
            java.lang.String r12 = r14.concat(r12)
            goto L294
        L292:
            java.lang.String r12 = "插件仓库请求超时"
        L294:
            gb.f r14 = new gb.f
            r14.<init>(r12, r13, r6, r10)
            java.lang.String r10 = r11.name()
            r7 = 0
            r8 = 62
            java.lang.String r4 = "/"
            r5 = 0
            r6 = 0
            java.lang.String r11 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "[Hchat:PluginMarket] 网络请求失败 method="
            r12.<init>(r13)
            r12.append(r10)
            r12.append(r2)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            fb.v0.n(r10, r14)
            throw r14
        L2c0:
            r0 = move-exception
            r3 = r12
            r10 = r0
        L2c3:
            java.lang.String r11 = r11.name()
            r7 = 0
            r8 = 62
            java.lang.String r4 = "/"
            r5 = 0
            r6 = 0
            java.lang.String r12 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            java.lang.String r13 = r10.getMessage()
            java.lang.String r14 = "[Hchat:PluginMarket] 请求失败 method="
            java.lang.String r15 = " "
            java.lang.StringBuilder r11 = bc.e.p(r14, r11, r2, r12, r15)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            fb.v0.n(r11, r10)
            throw r10
        L2e9:
            gb.f r10 = new gb.f
            java.lang.String r11 = "插件仓库地址无效，请先配置完整的 HTTPS 地址"
            r12 = 14
            r10.<init>(r11, r12, r6, r6)
            throw r10
    }

    public static java.lang.Object m(android.content.Context r7, java.lang.String r8, gb.s r9) {
            boolean r0 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L41
            gb.a r2 = gb.a.f4406i     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "v1"
            java.lang.String r1 = "plugins"
            java.lang.String r3 = "likes"
            java.lang.String[] r8 = new java.lang.String[]{r0, r1, r8, r3}     // Catch: java.lang.Throwable -> L49
            java.util.List r3 = a.a.y0(r8)     // Catch: java.lang.Throwable -> L49
            org.json.JSONObject r4 = r9.a()     // Catch: java.lang.Throwable -> L49
            tf.u r6 = tf.u.f13168g     // Catch: java.lang.Throwable -> L49
            r5 = 0
            r1 = r7
            org.json.JSONObject r7 = l(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L49
            org.json.JSONObject r7 = c(r7)     // Catch: java.lang.Throwable -> L49
            gb.l r8 = new gb.l     // Catch: java.lang.Throwable -> L49
            java.lang.String r9 = "liked"
            r0 = 0
            boolean r9 = r7.optBoolean(r9, r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "likeCount"
            r1 = 0
            long r3 = r7.optLong(r0, r1)     // Catch: java.lang.Throwable -> L49
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 >= 0) goto L3c
            goto L3d
        L3c:
            r1 = r3
        L3d:
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> L49
            return r8
        L41:
            java.lang.String r7 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L49
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L49
            throw r8     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }

    public static java.lang.Object n(android.content.Context r7, gb.r r8, gb.m r9) {
            r7.getClass()
            gb.a r1 = gb.a.f4405h     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = "v1"
            java.lang.String r2 = "plugins"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}     // Catch: java.lang.Throwable -> Ldd
            java.util.List r2 = a.a.y0(r0)     // Catch: java.lang.Throwable -> Ldd
            r6 = 0
            if (r9 == 0) goto L17
            java.lang.String r0 = r9.f4443a     // Catch: java.lang.Throwable -> Ldd
            goto L18
        L17:
            r0 = r6
        L18:
            org.json.JSONObject r3 = r8.a(r0)     // Catch: java.lang.Throwable -> Ldd
            if (r9 == 0) goto L22
            java.lang.String r8 = r9.f4444b     // Catch: java.lang.Throwable -> Ldd
            r4 = r8
            goto L23
        L22:
            r4 = r6
        L23:
            tf.u r5 = tf.u.f13168g     // Catch: java.lang.Throwable -> Ldd
            r0 = r7
            org.json.JSONObject r7 = l(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Ldd
            org.json.JSONObject r7 = c(r7)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r8 = "ownership"
            org.json.JSONObject r8 = r7.optJSONObject(r8)     // Catch: java.lang.Throwable -> Ldd
            if (r8 == 0) goto L37
            goto L38
        L37:
            r8 = r7
        L38:
            java.lang.String r0 = "remotePluginId"
            java.lang.String r0 = r8.optString(r0)     // Catch: java.lang.Throwable -> Ldd
            boolean r1 = og.m.t0(r0)     // Catch: java.lang.Throwable -> Ldd
            if (r1 == 0) goto L4a
            java.lang.String r0 = "pluginId"
            java.lang.String r0 = r8.optString(r0)     // Catch: java.lang.Throwable -> Ldd
        L4a:
            boolean r1 = og.m.t0(r0)     // Catch: java.lang.Throwable -> Ldd
            if (r1 == 0) goto L56
            java.lang.String r0 = "id"
            java.lang.String r0 = r8.optString(r0)     // Catch: java.lang.Throwable -> Ldd
        L56:
            boolean r1 = og.m.t0(r0)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r2 = ""
            if (r1 == 0) goto L67
            if (r9 == 0) goto L63
            java.lang.String r0 = r9.f4443a     // Catch: java.lang.Throwable -> Ldd
            goto L64
        L63:
            r0 = r6
        L64:
            if (r0 != 0) goto L67
            r0 = r2
        L67:
            java.lang.CharSequence r0 = og.m.R0(r0)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = "ownerToken"
            java.lang.String r8 = r8.optString(r1)     // Catch: java.lang.Throwable -> Ldd
            boolean r1 = og.m.t0(r8)     // Catch: java.lang.Throwable -> Ldd
            if (r1 == 0) goto L86
            if (r9 == 0) goto L80
            java.lang.String r8 = r9.f4444b     // Catch: java.lang.Throwable -> Ldd
            goto L81
        L80:
            r8 = r6
        L81:
            if (r8 != 0) goto L84
            goto L85
        L84:
            r2 = r8
        L85:
            r8 = r2
        L86:
            java.lang.CharSequence r8 = og.m.R0(r8)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Ldd
            boolean r9 = og.m.t0(r0)     // Catch: java.lang.Throwable -> Ldd
            if (r9 != 0) goto Ld5
            boolean r9 = og.m.t0(r8)     // Catch: java.lang.Throwable -> Ldd
            if (r9 != 0) goto Lcd
            gb.m r9 = new gb.m     // Catch: java.lang.Throwable -> Ldd
            a2.a r1 = gb.p.f4461g     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r2 = "reviewStatus"
            java.lang.String r7 = r7.optString(r2)     // Catch: java.lang.Throwable -> Ldd
            r1.getClass()     // Catch: java.lang.Throwable -> Ldd
            if (r7 == 0) goto Lbc
            java.lang.CharSequence r7 = og.m.R0(r7)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Ldd
            if (r7 == 0) goto Lbc
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r6 = r7.toLowerCase(r1)     // Catch: java.lang.Throwable -> Ldd
            r6.getClass()     // Catch: java.lang.Throwable -> Ldd
        Lbc:
            java.lang.String r7 = "pending"
            boolean r7 = gg.l.a(r6, r7)     // Catch: java.lang.Throwable -> Ldd
            if (r7 == 0) goto Lc7
            gb.p r7 = gb.p.f4462h     // Catch: java.lang.Throwable -> Ldd
            goto Lc9
        Lc7:
            gb.p r7 = gb.p.f4463i     // Catch: java.lang.Throwable -> Ldd
        Lc9:
            r9.<init>(r0, r8, r7)     // Catch: java.lang.Throwable -> Ldd
            return r9
        Lcd:
            java.lang.String r7 = "上传成功但服务端未返回 ownerToken"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ldd
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Ldd
            throw r8     // Catch: java.lang.Throwable -> Ldd
        Ld5:
            java.lang.String r7 = "上传成功但服务端未返回 remotePluginId"
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ldd
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Ldd
            throw r8     // Catch: java.lang.Throwable -> Ldd
        Ldd:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            return r8
    }
}
