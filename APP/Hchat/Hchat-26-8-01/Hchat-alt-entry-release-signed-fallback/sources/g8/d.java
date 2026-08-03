package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.hooks.api.runtime.WeChatDatabaseApi f4348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.i f4349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f4350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m8.c f4351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i8.f f4352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f4353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f4354g;

    public d(h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2, g8.i r3, h.Hchat.dexkit.DexFinder r4, m8.c r5, i8.f r6) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f4353f = r0
            r1.f4348a = r2
            r1.f4349b = r3
            r1.f4350c = r4
            r1.f4351d = r5
            r1.f4352e = r6
            return
    }

    public static byte[] b(java.util.Map r7) {
            r0 = 0
            if (r7 == 0) goto La
            java.lang.String r1 = "roomdata"
            java.lang.Object r7 = r7.get(r1)
            goto Lb
        La:
            r7 = r0
        Lb:
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L12
            byte[] r7 = (byte[]) r7
            return r7
        L12:
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto Lab
            java.lang.String r7 = (java.lang.String) r7
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L20
            goto Ld8
        L20:
            java.lang.String r7 = r7.trim()
            java.lang.String r1 = "hex->"
            boolean r1 = r7.startsWith(r1)
            if (r1 == 0) goto L31
            r1 = 5
            java.lang.String r7 = r7.substring(r1)
        L31:
            java.lang.String r1 = " "
            java.lang.String r2 = ""
            java.lang.String r7 = r7.replace(r1, r2)
            java.lang.String r1 = "\n"
            java.lang.String r7 = r7.replace(r1, r2)
            java.lang.String r1 = "\r"
            java.lang.String r7 = r7.replace(r1, r2)
            int r1 = r7.length()
            r2 = 2
            if (r1 < r2) goto Ld8
            int r1 = r7.length()
            r1 = r1 & 1
            if (r1 == 0) goto L56
            goto Ld8
        L56:
            r1 = 0
            r3 = r1
        L58:
            int r4 = r7.length()
            if (r3 >= r4) goto L7d
            char r4 = r7.charAt(r3)
            r5 = 48
            if (r4 < r5) goto L6a
            r5 = 57
            if (r4 <= r5) goto L7a
        L6a:
            r5 = 97
            if (r4 < r5) goto L72
            r5 = 102(0x66, float:1.43E-43)
            if (r4 <= r5) goto L7a
        L72:
            r5 = 65
            if (r4 < r5) goto Ld8
            r5 = 70
            if (r4 > r5) goto Ld8
        L7a:
            int r3 = r3 + 1
            goto L58
        L7d:
            int r3 = r7.length()
            int r3 = r3 / r2
            byte[] r2 = new byte[r3]
        L84:
            if (r1 >= r3) goto Laa
            int r4 = r1 * 2
            char r5 = r7.charAt(r4)
            r6 = 16
            int r5 = java.lang.Character.digit(r5, r6)
            int r4 = r4 + 1
            char r4 = r7.charAt(r4)
            int r4 = java.lang.Character.digit(r4, r6)
            if (r5 < 0) goto Ld8
            if (r4 >= 0) goto La1
            goto Ld8
        La1:
            int r5 = r5 << 4
            r4 = r4 | r5
            byte r4 = (byte) r4
            r2[r1] = r4
            int r1 = r1 + 1
            goto L84
        Laa:
            return r2
        Lab:
            if (r7 != 0) goto Lae
            goto Ld8
        Lae:
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r2 = "toByteArray"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r1 = r1.invoke(r7, r0)     // Catch: java.lang.Throwable -> Lc3
            boolean r2 = r1 instanceof byte[]     // Catch: java.lang.Throwable -> Lc3
            if (r2 == 0) goto Lc3
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> Lc3
            return r1
        Lc3:
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "getBytes"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r7 = r1.invoke(r7, r0)     // Catch: java.lang.Throwable -> Ld8
            boolean r1 = r7 instanceof byte[]     // Catch: java.lang.Throwable -> Ld8
            if (r1 == 0) goto Ld8
            byte[] r7 = (byte[]) r7     // Catch: java.lang.Throwable -> Ld8
            return r7
        Ld8:
            return r0
    }

    public static java.util.ArrayList c(java.util.List r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 != 0) goto L8
            goto L29
        L8:
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto Lc
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L25
            goto Lc
        L25:
            r0.add(r1)
            goto Lc
        L29:
            return r0
    }

    public static g8.c o(byte[] r5) {
            g8.c r0 = new g8.c
            r0.<init>()
            g8.b r1 = new g8.b     // Catch: java.lang.Throwable -> L5a
            r2 = 0
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch: java.lang.Throwable -> L5a
        Lc:
            int r5 = r1.f4344c     // Catch: java.lang.Throwable -> L5a
            byte[] r2 = r1.f4343b     // Catch: java.lang.Throwable -> L5a
            int r2 = r2.length     // Catch: java.lang.Throwable -> L5a
            r3 = 1
            if (r5 < r2) goto L16
            r5 = r3
            goto L17
        L16:
            r5 = 0
        L17:
            if (r5 != 0) goto L59
            int r5 = r1.j()     // Catch: java.lang.Throwable -> L5a
            int r2 = r5 >>> 3
            r5 = r5 & 7
            r4 = 2
            if (r5 != r4) goto L31
            if (r2 != r3) goto L31
            java.lang.String r5 = r1.i()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L5a
            r0.f4345a = r5     // Catch: java.lang.Throwable -> L5a
            goto Lc
        L31:
            if (r5 != r4) goto L39
            if (r2 != r4) goto L39
            r1.i()     // Catch: java.lang.Throwable -> L5a
            goto Lc
        L39:
            if (r5 != 0) goto L45
            r3 = 3
            if (r2 != r3) goto L45
            int r5 = r1.j()     // Catch: java.lang.Throwable -> L5a
            r0.f4347c = r5     // Catch: java.lang.Throwable -> L5a
            goto Lc
        L45:
            if (r5 != r4) goto L55
            r3 = 4
            if (r2 != r3) goto L55
            java.lang.String r5 = r1.i()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L5a
            r0.f4346b = r5     // Catch: java.lang.Throwable -> L5a
            goto Lc
        L55:
            r1.l(r5)     // Catch: java.lang.Throwable -> L5a
            goto Lc
        L59:
            return r0
        L5a:
            g8.c r5 = new g8.c
            r5.<init>()
            return r5
    }

    public static java.lang.String p(java.lang.String r0, java.util.Map r1) {
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

    public final boolean a(java.lang.String r7, java.util.List r8) {
            r6 = this;
            java.lang.String r0 = "添加群成员"
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r1 != 0) goto L8d
            if (r8 == 0) goto L8d
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L13
            goto L8d
        L13:
            h.Hchat.dexkit.DexFinder r1 = r6.f4350c
            if (r1 == 0) goto L87
            java.lang.reflect.Constructor<?> r3 = r1.addChatroomMemberCtor
            if (r3 == 0) goto L87
            m8.c r3 = r6.f4351d
            if (r3 != 0) goto L20
            goto L87
        L20:
            java.util.ArrayList r8 = c(r8)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L30
            java.lang.String r7 = "添加群成员失败: member为空"
            r6.n(r7)
            return r2
        L30:
            r6.l()
            java.lang.reflect.Constructor<?> r1 = r1.addChatroomMemberCtor     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r8, r4, r5}     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r1, r4)     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r3.j(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L50
            java.lang.String r0 = "成功"
            goto L52
        L4e:
            r7 = move-exception
            goto L71
        L50:
            java.lang.String r0 = "失败"
        L52:
            r3.append(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = ": "
            r3.append(r0)     // Catch: java.lang.Throwable -> L4e
            r3.append(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = " count="
            r3.append(r7)     // Catch: java.lang.Throwable -> L4e
            int r7 = r8.size()     // Catch: java.lang.Throwable -> L4e
            r3.append(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L4e
            r6.n(r7)     // Catch: java.lang.Throwable -> L4e
            return r1
        L71:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "添加群成员异常: "
            r8.<init>(r0)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.n(r7)
            return r2
        L87:
            java.lang.String r7 = "添加群成员失败: API未就绪"
            r6.n(r7)
            return r2
        L8d:
            java.lang.String r7 = "添加群成员失败: chatroom/member为空"
            r6.n(r7)
            return r2
    }

    public final boolean d(java.lang.String r6, java.util.List r7) {
            r5 = this;
            java.lang.String r0 = "移除群成员"
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 0
            if (r1 != 0) goto L8e
            if (r7 == 0) goto L8e
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L13
            goto L8e
        L13:
            h.Hchat.dexkit.DexFinder r1 = r5.f4350c
            if (r1 == 0) goto L88
            java.lang.reflect.Constructor<?> r3 = r1.delChatroomMemberCtor
            if (r3 == 0) goto L88
            m8.c r3 = r5.f4351d
            if (r3 != 0) goto L20
            goto L88
        L20:
            java.util.ArrayList r7 = c(r7)
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L30
            java.lang.String r6 = "移除群成员失败: member为空"
            r5.n(r6)
            return r2
        L30:
            r5.l()
            java.lang.reflect.Constructor<?> r1 = r1.delChatroomMemberCtor     // Catch: java.lang.Throwable -> L4f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r7, r4}     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r1, r4)     // Catch: java.lang.Throwable -> L4f
            boolean r1 = r3.j(r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L51
            java.lang.String r0 = "成功"
            goto L53
        L4f:
            r6 = move-exception
            goto L72
        L51:
            java.lang.String r0 = "失败"
        L53:
            r3.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = ": "
            r3.append(r0)     // Catch: java.lang.Throwable -> L4f
            r3.append(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = " count="
            r3.append(r6)     // Catch: java.lang.Throwable -> L4f
            int r6 = r7.size()     // Catch: java.lang.Throwable -> L4f
            r3.append(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L4f
            r5.n(r6)     // Catch: java.lang.Throwable -> L4f
            return r1
        L72:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "移除群成员异常: "
            r7.<init>(r0)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.n(r6)
            return r2
        L88:
            java.lang.String r6 = "移除群成员失败: API未就绪"
            r5.n(r6)
            return r2
        L8e:
            java.lang.String r6 = "移除群成员失败: chatroom/member为空"
            r5.n(r6)
            return r2
    }

    public final h.Hchat.hooks.api.model.WeChatChatroom e(java.lang.String r13) {
            r12 = this;
            g8.i r0 = r12.f4349b
            r1 = 0
            if (r0 == 0) goto L86
            boolean r0 = g8.i.I(r13)
            if (r0 == 0) goto L86
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r12.f4348a
            if (r0 != 0) goto L11
            goto L86
        L11:
            java.lang.String r2 = "SELECT chatroomname, memberlist, displayname, roomowner FROM chatroom WHERE chatroomname=? LIMIT 1"
            java.lang.String[] r3 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L6f
            java.util.List r0 = r0.query(r2, r3)     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L22
            goto L86
        L22:
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L6f
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L6f
            h.Hchat.hooks.api.model.WeChatChatroom r3 = new h.Hchat.hooks.api.model.WeChatChatroom     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "chatroomname"
            java.lang.String r4 = p(r4, r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = r12.f(r13)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = "roomowner"
            java.lang.String r6 = p(r6, r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r7 = "memberlist"
            java.lang.String r7 = p(r7, r0)     // Catch: java.lang.Throwable -> L6f
            r8 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6f
            r7.<init>()     // Catch: java.lang.Throwable -> L6f
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L6f
            if (r9 == 0) goto L4e
            goto L65
        L4e:
            java.lang.String r9 = ";"
            java.lang.String[] r8 = r8.split(r9)     // Catch: java.lang.Throwable -> L6f
            int r9 = r8.length     // Catch: java.lang.Throwable -> L6f
        L55:
            if (r2 >= r9) goto L65
            r10 = r8[r2]     // Catch: java.lang.Throwable -> L6f
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L6f
            if (r11 != 0) goto L62
            r7.add(r10)     // Catch: java.lang.Throwable -> L6f
        L62:
            int r2 = r2 + 1
            goto L55
        L65:
            java.lang.String r2 = "displayname"
            java.lang.String r8 = p(r2, r0)     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6f
            return r3
        L6f:
            r0 = move-exception
            java.lang.String r2 = "读取群聊失败: "
            java.lang.String r3 = " "
            java.lang.StringBuilder r13 = bc.e.o(r2, r13, r3)
            java.lang.String r0 = r0.getMessage()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.n(r13)
        L86:
            return r1
    }

    public final java.lang.String f(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            g8.i r0 = r2.f4349b
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.r(r3)
        L11:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L18
            return r1
        L18:
            return r3
    }

    public final java.util.ArrayList g() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            g8.i r1 = r10.f4349b
            if (r1 != 0) goto La
            goto L42
        La:
            java.util.ArrayList r1 = r1.x()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            h.Hchat.hooks.api.model.WeChatContact r2 = (h.Hchat.hooks.api.model.WeChatContact) r2
            java.lang.String r3 = r2.wxId
            h.Hchat.hooks.api.model.WeChatChatroom r3 = r10.e(r3)
            if (r3 == 0) goto L2a
            r0.add(r3)
            goto L12
        L2a:
            h.Hchat.hooks.api.model.WeChatChatroom r4 = new h.Hchat.hooks.api.model.WeChatChatroom
            java.lang.String r5 = r2.wxId
            java.lang.String r6 = r2.displayName()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r9 = ""
            java.lang.String r7 = ""
            r4.<init>(r5, r6, r7, r8, r9)
            r0.add(r4)
            goto L12
        L42:
            return r0
    }

    public final java.lang.String h(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            g8.i r0 = r1.f4349b
            if (r0 != 0) goto Le
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto Lb
            return r3
        Lb:
            java.lang.String r2 = ""
            return r2
        Le:
            java.lang.String r2 = r0.t(r2, r3)
            return r2
    }

    public final java.util.List i(java.lang.String r2) {
            r1 = this;
            g8.i r0 = r1.f4349b
            if (r0 == 0) goto L9
            java.util.ArrayList r2 = r0.u(r2)
            return r2
        L9:
            h.Hchat.hooks.api.model.WeChatChatroom r2 = r1.e(r2)
            if (r2 == 0) goto L12
            java.util.List<java.lang.String> r2 = r2.memberIds
            return r2
        L12:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
    }

    public final int j(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L72
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Le
            goto L72
        Le:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r2 = ""
            if (r0 != 0) goto L51
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = r6.f4348a
            if (r0 != 0) goto L1b
            goto L51
        L1b:
            java.lang.String r3 = "SELECT roomowner FROM chatroom WHERE chatroomname=? LIMIT 1"
            java.lang.String[] r4 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "roomowner"
            java.lang.String r0 = r0.queryFirstString(r3, r4, r5)     // Catch: java.lang.Throwable -> L32
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L49
            java.lang.String r2 = r0.trim()     // Catch: java.lang.Throwable -> L32
            goto L51
        L32:
            r0 = move-exception
            java.lang.String r3 = "读取群主失败: "
            java.lang.String r4 = " "
            java.lang.StringBuilder r3 = bc.e.o(r3, r7, r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.n(r0)
        L49:
            h.Hchat.hooks.api.model.WeChatChatroom r0 = r6.e(r7)
            if (r0 == 0) goto L51
            java.lang.String r2 = r0.owner
        L51:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L5f
            boolean r0 = r2.equals(r8)
            if (r0 == 0) goto L5f
            r7 = 2
            return r7
        L5f:
            java.util.LinkedHashMap r7 = r6.k(r7)
            java.lang.Object r7 = r7.get(r8)
            g8.c r7 = (g8.c) r7
            if (r7 == 0) goto L72
            int r7 = r7.f4347c
            r7 = r7 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L72
            r1 = 1
        L72:
            return r1
    }

    public final java.util.LinkedHashMap k(java.lang.String r11) {
            r10 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto Lf1
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = r10.f4348a
            if (r1 == 0) goto Lf1
            java.lang.String r2 = "chatroom"
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L7a
            java.lang.String r2 = "roomdata"
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L7a
            java.util.concurrent.ConcurrentHashMap r5 = r10.f4353f
            java.lang.String r6 = "chatroom:roomdata"
            java.lang.Object r7 = r5.get(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L32
            boolean r2 = r7.booleanValue()
            goto L7b
        L32:
            java.lang.String r7 = "PRAGMA table_info(chatroom)"
            r8 = 0
            java.util.List r7 = r1.query(r7, r8)     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L57
        L3d:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L57
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L57
            java.lang.String r9 = "name"
            java.lang.String r8 = p(r9, r8)     // Catch: java.lang.Throwable -> L57
            boolean r8 = r2.equalsIgnoreCase(r8)     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L3d
            r2 = r3
            goto L6e
        L57:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "检测字段失败: chatroom.roomdata "
            r7.<init>(r8)
            java.lang.String r2 = r2.getMessage()
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r10.n(r2)
        L6d:
            r2 = r4
        L6e:
            if (r2 == 0) goto L76
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.put(r6, r7)
            goto L7b
        L76:
            r5.remove(r6)
            goto L7b
        L7a:
            r2 = r4
        L7b:
            if (r2 != 0) goto L7f
            goto Lf1
        L7f:
            java.lang.String r2 = "SELECT roomdata FROM chatroom WHERE chatroomname=? LIMIT 1"
            java.lang.String[] r11 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> Ld6
            java.util.List r11 = r1.query(r2, r11)     // Catch: java.lang.Throwable -> Ld6
            boolean r1 = r11.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            if (r1 == 0) goto L90
            goto Lf1
        L90:
            java.lang.Object r11 = r11.get(r4)     // Catch: java.lang.Throwable -> Ld6
            java.util.Map r11 = (java.util.Map) r11     // Catch: java.lang.Throwable -> Ld6
            byte[] r11 = b(r11)     // Catch: java.lang.Throwable -> Ld6
            if (r11 == 0) goto Lf1
            int r1 = r11.length     // Catch: java.lang.Throwable -> Ld6
            if (r1 != 0) goto La0
            goto Lf1
        La0:
            g8.b r1 = new g8.b     // Catch: java.lang.Throwable -> Ld6
            r2 = 0
            r5 = 0
            r1.<init>(r11, r2, r5)     // Catch: java.lang.Throwable -> Ld6
        La7:
            int r11 = r1.f4344c     // Catch: java.lang.Throwable -> Ld6
            byte[] r2 = r1.f4343b     // Catch: java.lang.Throwable -> Ld6
            int r2 = r2.length     // Catch: java.lang.Throwable -> Ld6
            if (r11 < r2) goto Lb0
            r11 = r3
            goto Lb1
        Lb0:
            r11 = r4
        Lb1:
            if (r11 != 0) goto Lf1
            int r11 = r1.j()     // Catch: java.lang.Throwable -> Ld6
            int r2 = r11 >>> 3
            r11 = r11 & 7
            if (r2 != r3) goto Ld8
            r2 = 2
            if (r11 != r2) goto Ld8
            byte[] r11 = r1.h()     // Catch: java.lang.Throwable -> Ld6
            g8.c r11 = o(r11)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = r11.f4345a     // Catch: java.lang.Throwable -> Ld6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ld6
            if (r2 != 0) goto La7
            java.lang.String r2 = r11.f4345a     // Catch: java.lang.Throwable -> Ld6
            r0.put(r2, r11)     // Catch: java.lang.Throwable -> Ld6
            goto La7
        Ld6:
            r11 = move-exception
            goto Ldc
        Ld8:
            r1.l(r11)     // Catch: java.lang.Throwable -> Ld6
            goto La7
        Ldc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "解析群成员身份失败: "
            r1.<init>(r2)
            java.lang.String r11 = r11.getMessage()
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.n(r11)
        Lf1:
            return r0
    }

    public final void l() {
            r3 = this;
            boolean r0 = r3.f4354g
            if (r0 != 0) goto L28
            m8.c r0 = r3.f4351d
            if (r0 == 0) goto L28
            h.Hchat.dexkit.DexFinder r0 = r3.f4350c
            if (r0 != 0) goto Ld
            goto L28
        Ld:
            java.lang.Class<?> r1 = r0.netQueueClass
            if (r1 != 0) goto L1a
            java.util.List<java.lang.Class<?>> r0 = r0.netQueueCandidateClasses
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            goto L28
        L1a:
            m8.c r0 = r3.f4351d
            h.Hchat.dexkit.DexFinder r1 = r3.f4350c
            java.lang.Class<?> r2 = r1.netQueueClass
            java.util.List<java.lang.Class<?>> r1 = r1.netQueueCandidateClasses
            r0.c(r2, r1)
            r0 = 1
            r3.f4354g = r0
        L28:
            return
    }

    public final boolean m(java.lang.String r7, java.util.List r8) {
            r6 = this;
            java.lang.String r0 = "邀请群成员"
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r1 != 0) goto L8f
            if (r8 == 0) goto L8f
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L13
            goto L8f
        L13:
            h.Hchat.dexkit.DexFinder r1 = r6.f4350c
            if (r1 == 0) goto L89
            java.lang.reflect.Constructor<?> r3 = r1.inviteChatroomMemberCtor
            if (r3 == 0) goto L89
            m8.c r3 = r6.f4351d
            if (r3 != 0) goto L20
            goto L89
        L20:
            java.util.ArrayList r8 = c(r8)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L30
            java.lang.String r7 = "邀请群成员失败: member为空"
            r6.n(r7)
            return r2
        L30:
            r6.l()
            java.lang.reflect.Constructor<?> r1 = r1.inviteChatroomMemberCtor     // Catch: java.lang.Throwable -> L50
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L50
            r5 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r8, r4, r5}     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r1, r4)     // Catch: java.lang.Throwable -> L50
            boolean r1 = r3.j(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            java.lang.String r0 = "成功"
            goto L54
        L50:
            r7 = move-exception
            goto L73
        L52:
            java.lang.String r0 = "失败"
        L54:
            r3.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = ": "
            r3.append(r0)     // Catch: java.lang.Throwable -> L50
            r3.append(r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = " count="
            r3.append(r7)     // Catch: java.lang.Throwable -> L50
            int r7 = r8.size()     // Catch: java.lang.Throwable -> L50
            r3.append(r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L50
            r6.n(r7)     // Catch: java.lang.Throwable -> L50
            return r1
        L73:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "邀请群成员异常: "
            r8.<init>(r0)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.n(r7)
            return r2
        L89:
            java.lang.String r7 = "邀请群成员失败: API未就绪"
            r6.n(r7)
            return r2
        L8f:
            java.lang.String r7 = "邀请群成员失败: chatroom/member为空"
            r6.n(r7)
            return r2
    }

    public final void n(java.lang.String r2) {
            r1 = this;
            i8.f r0 = r1.f4352e
            if (r0 == 0) goto Ld
            java.lang.String r0 = "[WeChatChatroomApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
        Ld:
            return
    }
}
