package h8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.hooks.api.runtime.WeChatDatabaseApi f5135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.i f5136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8.r f5137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f5138d;

    public a(h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1, g8.i r2, q8.r r3, h.Hchat.dexkit.DexFinder r4, i8.f r5) {
            r0 = this;
            r0.<init>()
            r0.f5135a = r1
            r0.f5136b = r2
            r0.f5137c = r3
            r0.f5138d = r4
            return
    }

    public static int d(java.lang.String r0, java.util.Map r1) {
            if (r1 == 0) goto L7
            java.lang.Object r0 = r1.get(r0)
            goto L8
        L7:
            r0 = 0
        L8:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L13:
            if (r0 == 0) goto L1a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L1c
        L1a:
            java.lang.String r0 = ""
        L1c:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            r0 = 0
            return r0
    }

    public static long g(java.lang.String r0, java.util.Map r1) {
            if (r1 == 0) goto L7
            java.lang.Object r0 = r1.get(r0)
            goto L8
        L7:
            r0 = 0
        L8:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        L13:
            if (r0 == 0) goto L1a
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L21
            goto L1c
        L1a:
            java.lang.String r0 = ""
        L1c:
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            r0 = 0
            return r0
    }

    public static java.lang.String j(java.lang.String r0, java.util.Map r1) {
            if (r1 == 0) goto L7
            java.lang.Object r0 = r1.get(r0)
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto Lf
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public static l8.b k(java.util.Map r3) {
            l8.b r0 = new l8.b
            java.lang.String r1 = "username"
            java.lang.String r1 = j(r1, r3)
            java.lang.String r2 = "unReadCount"
            d(r2, r3)
            java.lang.String r2 = "status"
            d(r2, r3)
            java.lang.String r2 = "isSend"
            d(r2, r3)
            java.lang.String r2 = "conversationTime"
            g(r2, r3)
            java.lang.String r2 = "content"
            j(r2, r3)
            java.lang.String r2 = "msgType"
            j(r2, r3)
            java.lang.String r2 = "flag"
            g(r2, r3)
            java.lang.String r2 = "digest"
            j(r2, r3)
            java.lang.String r2 = "digestUser"
            j(r2, r3)
            java.lang.String r2 = "atCount"
            d(r2, r3)
            java.lang.String r2 = "unReadMuteCount"
            d(r2, r3)
            java.lang.String r2 = "hasTodo"
            d(r2, r3)
            r0.<init>(r1)
            return r0
    }

    public final boolean a(java.lang.String r6) {
            r5 = this;
            if (r6 == 0) goto L7
            java.lang.String r6 = r6.trim()
            goto L9
        L7:
            java.lang.String r6 = ""
        L9:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L8f
            h.Hchat.dexkit.DexFinder r0 = r5.f5138d
            java.lang.reflect.Method r0 = r0.conversationDeleteMethod
            if (r0 != 0) goto L1c
            java.lang.String r6 = "原生会话删除方法尚未就绪"
            r5.f(r6)
            return r1
        L1c:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = r5.f5135a
            java.lang.Object r3 = r2.storageObjectForMethod(r0)
            if (r3 != 0) goto L36
            java.lang.Class r6 = r0.getDeclaringClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = "未找到原生会话 storage: "
            java.lang.String r6 = r0.concat(r6)
            r5.f(r6)
            return r1
        L36:
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L71
            h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r3, r4)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "SELECT 1 FROM rconversation WHERE username=? LIMIT 1"
            java.lang.String[] r3 = new java.lang.String[]{r6}
            android.database.Cursor r0 = r2.rawQuery(r0, r3)
            r2 = 0
            if (r0 != 0) goto L4b
            goto L56
        L4b:
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L53
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L53
        L53:
            r0.close()     // Catch: java.lang.Throwable -> L56
        L56:
            if (r2 != 0) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "无法验证原生会话删除结果: talker="
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.f(r6)
            return r1
        L6a:
            boolean r6 = r2.booleanValue()
            r6 = r6 ^ 1
            return r6
        L71:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "原生会话删除失败: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = " talker="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r5.f(r6)
        L8f:
            return r1
    }

    public final java.lang.String b(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            g8.i r0 = r2.f5136b
            java.lang.String r0 = r0.r(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            return r0
        L16:
            return r3
    }

    public final java.util.ArrayList c() {
            r2 = this;
            r0 = 1
            r1 = 10000(0x2710, float:1.4013E-41)
            int r1 = java.lang.Math.min(r1, r1)
            int r0 = java.lang.Math.max(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r1 = "SELECT username, unReadCount, status, isSend, conversationTime, content, msgType, flag, digest, digestUser, atCount, unReadMuteCount, hasTodo FROM rconversation WHERE username!='' ORDER BY conversationTime DESC LIMIT ?"
            java.util.ArrayList r0 = r2.i(r1, r0)
            return r0
    }

    public final boolean e(java.lang.String r6) {
            r5 = this;
            java.lang.String r6 = r6.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L65
            h.Hchat.dexkit.DexFinder r0 = r5.f5138d
            java.lang.reflect.Method r0 = r0.contactMuteStateMethod
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            r3 = 0
            if (r2 == 0) goto L17
            goto L26
        L17:
            java.lang.String r2 = r6.trim()
            g8.i r4 = r5.f5136b
            b.e r2 = r4.R(r2)
            if (r2 == 0) goto L26
            java.lang.Object r2 = r2.f333i
            goto L27
        L26:
            r2 = r3
        L27:
            if (r0 == 0) goto L65
            if (r2 == 0) goto L65
            java.lang.Class[] r4 = r0.getParameterTypes()
            r4 = r4[r1]
            boolean r4 = r4.isInstance(r2)
            if (r4 != 0) goto L38
            goto L65
        L38:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r3, r2)     // Catch: java.lang.Throwable -> L47
            boolean r6 = r4.equals(r0)     // Catch: java.lang.Throwable -> L47
            return r6
        L47:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "读取微信免打扰状态失败: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = " talker="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r5.f(r6)
        L65:
            return r1
    }

    public final void f(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatConversationApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public final boolean h(java.lang.String r5) {
            r4 = this;
            q8.r r0 = r4.f5137c
            android.content.Context r1 = r0.f10735a
            android.content.Intent[] r5 = r0.a(r5)
            if (r5 == 0) goto L31
            int r2 = r5.length
            if (r2 != 0) goto Le
            goto L31
        Le:
            r2 = 1
            r1.startActivities(r5)     // Catch: java.lang.Throwable -> L13
            goto L32
        L13:
            int r3 = r5.length     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 - r2
            r5 = r5[r3]     // Catch: java.lang.Throwable -> L1b
            r1.startActivity(r5)     // Catch: java.lang.Throwable -> L1b
            goto L32
        L1b:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "打开聊天失败: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.b(r5)
        L31:
            r2 = 0
        L32:
            return r2
    }

    public final java.util.ArrayList i(java.lang.String r4, java.lang.String[] r5) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r3.f5135a
            java.util.List r4 = r1.query(r4, r5)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L32
        Lf:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L34
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L32
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "username"
            java.lang.String r1 = j(r1, r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "wxid_hchat_group_"
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L2a
            goto Lf
        L2a:
            l8.b r5 = k(r5)     // Catch: java.lang.Throwable -> L32
            r0.add(r5)     // Catch: java.lang.Throwable -> L32
            goto Lf
        L32:
            r4 = move-exception
            goto L35
        L34:
            return r0
        L35:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "会话查询失败: "
            r5.<init>(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.f(r4)
            return r0
    }
}
