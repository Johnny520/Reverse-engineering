package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f10715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8.o f10716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8.q f10717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8.i f10718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g8.i f10719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1.d f10720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f10721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f10722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f10723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile java.lang.String f10724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile java.lang.String f10725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f10726l;

    public m(h.Hchat.dexkit.DexFinder r2, q8.o r3, q8.q r4, q8.i r5, g8.i r6, g1.d r7) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f10721g = r0
            java.lang.String r0 = ""
            r1.f10724j = r0
            r1.f10725k = r0
            r1.f10715a = r2
            r1.f10716b = r3
            r1.f10717c = r4
            r1.f10718d = r5
            r1.f10719e = r6
            r1.f10720f = r7
            return
    }

    public static java.lang.String f(java.lang.reflect.Method r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String g(android.content.Intent r1) {
            if (r1 != 0) goto L3
            goto L10
        L3:
            java.lang.String r0 = "Chat_User"
            java.lang.String r1 = r1.getStringExtra(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            java.lang.String r1 = ""
            return r1
    }

    public final java.lang.String a() {
            r3 = this;
            q8.o r0 = r3.f10716b
            if (r0 == 0) goto L9
            android.app.Activity r0 = r0.a()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Ld
            goto L3c
        Ld:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.ui.chatting.ChattingUI"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L25
            java.lang.String r2 = ".ui.chatting."
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L3c
        L25:
            if (r0 != 0) goto L28
            goto L31
        L28:
            android.content.Intent r0 = r0.getIntent()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = g(r0)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            java.lang.String r0 = ""
        L33:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3c
            r3.f10724j = r0
            return r0
        L3c:
            java.lang.String r0 = r3.f10724j
            return r0
    }

    public final void b(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7
            goto L15
        L7:
            g8.i r0 = r4.f10719e
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.r(r6)
            goto L12
        L10:
            java.lang.String r0 = ""
        L12:
            android.text.TextUtils.isEmpty(r0)
        L15:
            g8.i r0 = r4.f10719e
            if (r0 == 0) goto L1d
            boolean r6 = g8.i.I(r6)
        L1d:
            java.util.concurrent.CopyOnWriteArrayList r6 = r4.f10721g
            java.util.Iterator r6 = r6.iterator()
        L23:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r6.next()
            k9.b r0 = (k9.b) r0
            r0.getClass()     // Catch: java.lang.Throwable -> L61
            k9.r r0 = k9.r.f7530a     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "enter"
            boolean r0 = r0.equals(r5)     // Catch: java.lang.Throwable -> L61
            k9.r.f7535f = r0     // Catch: java.lang.Throwable -> L61
            boolean r1 = k9.r.f7534e     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L23
            android.content.SharedPreferences r1 = k9.r.f7532c     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = "home"
            if (r1 == 0) goto L4f
            java.lang.String r3 = "scope"
            java.lang.String r1 = r1.getString(r3, r2)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L4f
            goto L50
        L4f:
            r1 = r2
        L50:
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L61
            if (r1 != 0) goto L57
            goto L23
        L57:
            k9.q r1 = new k9.q     // Catch: java.lang.Throwable -> L61
            r2 = 1
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L61
            k9.r.p(r1)     // Catch: java.lang.Throwable -> L61
            goto L23
        L61:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "聊天页回调失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.e(r0)
            goto L23
        L78:
            return
    }

    public final void c(java.lang.String r7) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7
            goto L1d
        L7:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r6.f10724j
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L1e
            long r2 = r6.f10726l
            long r2 = r0 - r2
            r4 = 500(0x1f4, double:2.47E-321)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L1e
        L1d:
            return
        L1e:
            r6.f10724j = r7
            r6.f10726l = r0
            java.lang.String r0 = "enter"
            r6.b(r0, r7)
            return
    }

    public final int d() {
            r10 = this;
            r0 = 0
            h.Hchat.dexkit.DexFinder r1 = r10.f10715a
            if (r1 != 0) goto L6
            return r0
        L6:
            r1.resolveChatPageApi()     // Catch: java.lang.Throwable -> La
            goto L20
        La:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "聊天页Dex解析失败: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r10.e(r2)
        L20:
            java.lang.reflect.Method r2 = r1.chatPageStartMethod
            java.lang.String r3 = "聊天页启动方法Hook: "
            java.lang.String r4 = " "
            r5 = 1
            if (r2 != 0) goto L2b
        L29:
            r2 = r0
            goto L67
        L2b:
            h.Hchat.utils.KavaReflector.accessible(r2)     // Catch: java.lang.Throwable -> L46
            r8.i r6 = r8.i.f11631b     // Catch: java.lang.Throwable -> L46
            q8.l r7 = new q8.l     // Catch: java.lang.Throwable -> L46
            r8 = 0
            r7.<init>(r10, r2, r8)     // Catch: java.lang.Throwable -> L46
            r6.b(r2, r7)     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = f(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r3.concat(r6)     // Catch: java.lang.Throwable -> L46
            r10.e(r3)     // Catch: java.lang.Throwable -> L46
            r2 = r5
            goto L67
        L46:
            r3 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "聊天页启动方法Hook失败: "
            r6.<init>(r7)
            java.lang.String r2 = f(r2)
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r3.getMessage()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r10.e(r2)
            goto L29
        L67:
            java.lang.reflect.Method r3 = r1.chatPageFragmentEnterMethod
            java.lang.String r6 = "聊天页Fragment进入方法Hook: "
            if (r3 != 0) goto L6f
        L6d:
            r3 = r0
            goto Lab
        L6f:
            h.Hchat.utils.KavaReflector.accessible(r3)     // Catch: java.lang.Throwable -> L8a
            r8.i r7 = r8.i.f11631b     // Catch: java.lang.Throwable -> L8a
            q8.l r8 = new q8.l     // Catch: java.lang.Throwable -> L8a
            r9 = 1
            r8.<init>(r10, r3, r9)     // Catch: java.lang.Throwable -> L8a
            r7.b(r3, r8)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = f(r3)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = r6.concat(r7)     // Catch: java.lang.Throwable -> L8a
            r10.e(r6)     // Catch: java.lang.Throwable -> L8a
            r3 = r5
            goto Lab
        L8a:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "聊天页Fragment进入方法Hook失败: "
            r7.<init>(r8)
            java.lang.String r3 = f(r3)
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = r6.getMessage()
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r10.e(r3)
            goto L6d
        Lab:
            int r2 = r2 + r3
            java.lang.reflect.Method r1 = r1.chatPageFragmentExitMethod
            java.lang.String r3 = "聊天页Fragment退出方法Hook: "
            if (r1 != 0) goto Lb3
            goto Lee
        Lb3:
            h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> Lce
            r8.i r6 = r8.i.f11631b     // Catch: java.lang.Throwable -> Lce
            q8.l r7 = new q8.l     // Catch: java.lang.Throwable -> Lce
            r8 = 2
            r7.<init>(r10, r1, r8)     // Catch: java.lang.Throwable -> Lce
            r6.b(r1, r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = f(r1)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = r3.concat(r6)     // Catch: java.lang.Throwable -> Lce
            r10.e(r3)     // Catch: java.lang.Throwable -> Lce
            r0 = r5
            goto Lee
        Lce:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "聊天页Fragment退出方法Hook失败: "
            r5.<init>(r6)
            java.lang.String r1 = f(r1)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r3.getMessage()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r10.e(r1)
        Lee:
            int r2 = r2 + r0
            return r2
    }

    public final void e(java.lang.String r2) {
            r1 = this;
            g1.d r0 = r1.f10720f
            if (r0 == 0) goto Ld
            java.lang.String r0 = "[WeChatChatPageApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
        Ld:
            return
    }
}
