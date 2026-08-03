package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.hooks.api.runtime.WeChatDatabaseApi f7469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.a f7470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f7471c;

    public s(h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1, g8.a r2, h.Hchat.dexkit.DexFinder r3, i8.f r4) {
            r0 = this;
            r0.<init>()
            r0.f7469a = r1
            r0.f7470b = r2
            r0.f7471c = r3
            return
    }

    public static int g(java.lang.String r0, java.util.Map r1) {
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
            if (r0 != 0) goto L16
            goto L1f
        L16:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L1f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L1f
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public static long j(java.lang.String r2, java.util.Map r3) {
            if (r3 == 0) goto L7
            java.lang.Object r2 = r3.get(r2)
            goto L8
        L7:
            r2 = 0
        L8:
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L13
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            return r2
        L13:
            r0 = 0
            if (r2 != 0) goto L18
            return r0
        L18:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L21
            return r2
        L21:
            return r0
    }

    public static java.lang.String n(java.lang.String r0, java.util.Map r1) {
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

    public final long a(long r9) {
            r8 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L5f
            java.util.ArrayList r2 = r8.k()
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "createTime"
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r5 = r8.f7469a
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r8.m(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L29
            goto Le
        L29:
            java.lang.String r6 = "SELECT createTime FROM "
            java.lang.String r7 = " WHERE msgSvrId=? ORDER BY createTime DESC LIMIT 1"
            java.lang.String r3 = eh.a.n(r6, r3, r7)
            java.lang.String r6 = java.lang.String.valueOf(r9)
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r3 = r5.queryFirstString(r3, r6, r4)
            if (r3 != 0) goto L41
        L3f:
            r3 = r0
            goto L45
        L41:
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L3f
        L45:
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto Le
            return r3
        L4a:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String[] r9 = new java.lang.String[]{r9}
            java.lang.String r10 = "SELECT createTime FROM message WHERE msgSvrId=? ORDER BY createTime DESC LIMIT 1"
            java.lang.String r9 = r5.queryFirstString(r10, r9, r4)
            if (r9 != 0) goto L5b
            goto L5f
        L5b:
            long r0 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L5f
        L5f:
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatMessage b(java.lang.String r2) {
            r1 = this;
            r0 = 1
            java.util.ArrayList r2 = r1.f(r0, r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            r2 = 0
            return r2
        Ld:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            h.Hchat.hooks.api.model.WeChatMessage r2 = (h.Hchat.hooks.api.model.WeChatMessage) r2
            return r2
    }

    public final h.Hchat.hooks.api.model.WeChatMessage c(long r6) {
            r5 = this;
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L7
            goto L5c
        L7:
            java.util.ArrayList r0 = r5.k()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r5.m(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L27
            goto Lf
        L27:
            java.lang.String r3 = "SELECT * FROM "
            java.lang.String r4 = " WHERE msgId=? LIMIT 1"
            java.lang.String r1 = eh.a.n(r3, r1, r4)
            java.lang.String r3 = java.lang.String.valueOf(r6)
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.ArrayList r1 = r5.l(r1, r3)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto Lf
            java.lang.Object r6 = r1.get(r2)
            h.Hchat.hooks.api.model.WeChatMessage r6 = (h.Hchat.hooks.api.model.WeChatMessage) r6
            return r6
        L48:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.lang.String r7 = "SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM message WHERE msgId=? LIMIT 1"
            java.util.ArrayList r6 = r5.l(r7, r6)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L5e
        L5c:
            r6 = 0
            return r6
        L5e:
            java.lang.Object r6 = r6.get(r2)
            h.Hchat.hooks.api.model.WeChatMessage r6 = (h.Hchat.hooks.api.model.WeChatMessage) r6
            return r6
    }

    public final h.Hchat.hooks.api.model.WeChatMessage d(long r8) {
            r7 = this;
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = r7.k()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r7.m(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L28
            goto L10
        L28:
            java.lang.String r5 = "SELECT * FROM "
            java.lang.String r6 = " WHERE msgSvrId=? ORDER BY createTime DESC, msgId DESC LIMIT 1"
            java.lang.String r4 = eh.a.n(r5, r4, r6)
            java.lang.String r5 = java.lang.String.valueOf(r8)
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.util.ArrayList r4 = r7.l(r4, r5)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "按msgSvrId命中分表: id="
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = " table="
            r0.append(r8)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
            r7.i(r8)
            java.lang.Object r8 = r4.get(r3)
            h.Hchat.hooks.api.model.WeChatMessage r8 = (h.Hchat.hooks.api.model.WeChatMessage) r8
            return r8
        L62:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r2 = "SELECT * FROM message WHERE msgSvrId=? ORDER BY createTime DESC, msgId DESC LIMIT 1"
            java.util.ArrayList r0 = r7.l(r2, r0)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "按msgSvrId命中主表: id="
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.i(r8)
            java.lang.Object r8 = r0.get(r3)
            h.Hchat.hooks.api.model.WeChatMessage r8 = (h.Hchat.hooks.api.model.WeChatMessage) r8
            return r8
        L8e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "按msgSvrId未命中: id="
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.i(r8)
            return r1
    }

    public final h.Hchat.hooks.api.model.WeChatMessage e(long r10, java.lang.String r12) {
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto Ld2
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto Le
            goto Ld2
        Le:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r1 = ""
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = r9.f7469a
            if (r0 == 0) goto L1a
            r0 = r1
            goto L1e
        L1a:
            java.lang.String r0 = r2.messageTableForTalker(r12)
        L1e:
            java.lang.String r0 = r9.m(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r4 = " table="
            java.lang.String r5 = " id="
            java.lang.String r6 = " WHERE msgSvrId=? ORDER BY createTime DESC, msgId DESC LIMIT 1"
            java.lang.String r7 = "SELECT * FROM "
            if (r3 != 0) goto L5a
            java.lang.String r3 = eh.a.n(r7, r0, r6)
            java.lang.String r8 = java.lang.String.valueOf(r10)
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.util.ArrayList r3 = r9.l(r3, r8)
            boolean r8 = r3.isEmpty()
            if (r8 != 0) goto L5a
            java.lang.String r1 = "按talker/msgSvrId命中会话表: talker="
            java.lang.StringBuilder r10 = eh.a.v(r1, r12, r5, r10)
            r10.append(r4)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.i(r10)
            goto Lc3
        L5a:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L61
            goto L65
        L61:
            java.lang.String r1 = r2.messageTableForTalker(r12)
        L65:
            java.util.ArrayList r0 = r9.k()
            java.util.Iterator r0 = r0.iterator()
        L6d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L80
            goto L6d
        L80:
            java.lang.String r3 = r9.m(r2)
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 == 0) goto L8b
            goto L6d
        L8b:
            java.lang.String r3 = eh.a.n(r7, r3, r6)
            java.lang.String r8 = java.lang.String.valueOf(r10)
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.util.ArrayList r3 = r9.l(r3, r8)
            boolean r8 = r3.isEmpty()
            if (r8 != 0) goto L6d
            java.lang.String r0 = "按talker/msgSvrId命中分表: talker="
            java.lang.StringBuilder r10 = eh.a.v(r0, r12, r5, r10)
            r10.append(r4)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.i(r10)
            goto Lc3
        Lb5:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String[] r10 = new java.lang.String[]{r12, r10}
            java.lang.String r11 = "SELECT * FROM message WHERE talker=? AND msgSvrId=? ORDER BY createTime DESC, msgId DESC LIMIT 1"
            java.util.ArrayList r3 = r9.l(r11, r10)
        Lc3:
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto Lca
            goto Ld2
        Lca:
            r10 = 0
            java.lang.Object r10 = r3.get(r10)
            h.Hchat.hooks.api.model.WeChatMessage r10 = (h.Hchat.hooks.api.model.WeChatMessage) r10
            return r10
        Ld2:
            r10 = 0
            return r10
    }

    public final java.util.ArrayList f(int r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lc
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
        Lc:
            r0 = 200(0xc8, float:2.8E-43)
            int r4 = java.lang.Math.min(r0, r4)
            r0 = 1
            int r4 = java.lang.Math.max(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L20
            java.lang.String r0 = ""
            goto L26
        L20:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r3.f7469a
            java.lang.String r0 = r0.messageTableForTalker(r5)
        L26:
            java.lang.String r0 = r3.m(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM "
            java.lang.String r2 = " ORDER BY createTime DESC, msgId DESC LIMIT ?"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.ArrayList r0 = r3.l(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L4b
            return r0
        L4b:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}
            java.lang.String r5 = "SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM message WHERE talker=? ORDER BY createTime DESC, msgId DESC LIMIT ?"
            java.util.ArrayList r4 = r3.l(r5, r4)
            return r4
    }

    public final boolean h() {
            r1 = this;
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r1.f7469a
            boolean r0 = r0.isAvailable()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void i(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatMessageStoreApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public final java.util.ArrayList k() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r2.f7469a
            java.util.List r1 = r1.messageTables()
            r0.addAll(r1)
            return r0
    }

    public final java.util.ArrayList l(java.lang.String r23, java.lang.String[] r24) {
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r1.f7469a
            r3 = r23
            r4 = r24
            java.util.List r0 = r0.query(r3, r4)     // Catch: java.lang.Throwable -> L12
            goto L2d
        L12:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "消息查询失败: "
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.i(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L2d:
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r0.next()
            java.util.Map r3 = (java.util.Map) r3
            h.Hchat.hooks.api.model.WeChatMessage r4 = new h.Hchat.hooks.api.model.WeChatMessage
            java.lang.String r5 = "msgId"
            long r5 = j(r5, r3)
            java.lang.String r7 = "msgSvrId"
            long r7 = j(r7, r3)
            java.lang.String r9 = "type"
            int r9 = g(r9, r3)
            java.lang.String r10 = "status"
            int r10 = g(r10, r3)
            java.lang.String r11 = "isSend"
            int r11 = g(r11, r3)
            java.lang.String r12 = "createTime"
            long r12 = j(r12, r3)
            java.lang.String r14 = "talker"
            java.lang.String r14 = n(r14, r3)
            java.lang.String r15 = "content"
            java.lang.String r15 = n(r15, r3)
            r23 = r0
            java.lang.String r0 = "imgPath"
            java.lang.String r16 = n(r0, r3)
            java.lang.String r0 = "reserved"
            java.lang.String r17 = n(r0, r3)
            java.lang.String r0 = "transContent"
            java.lang.String r18 = n(r0, r3)
            java.lang.String r0 = "flag"
            int r19 = g(r0, r3)
            java.lang.String r0 = "msgSource"
            java.lang.String r20 = n(r0, r3)
            g8.a r0 = r1.f7470b
            java.lang.String r21 = r0.c()
            r4.<init>(r5, r7, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.add(r4)
            r0 = r23
            goto L31
        L9e:
            return r2
    }

    public final java.lang.String m(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r1.f7469a
            java.lang.String r2 = r0.quoteTable(r2)
            return r2
    }
}
