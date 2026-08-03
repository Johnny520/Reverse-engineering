package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.List f9657k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.List f9658l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.util.List f9659m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final og.k f9660n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final og.k f9661o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia.t f9662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f9663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bb.l f9664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f9670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final og.k f9671j;

    static {
            java.lang.String r0 = "邀请"
            java.lang.String r1 = "invited"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            o9.p.f9657k = r0
            java.lang.String r0 = "joined the group chat"
            java.lang.String r1 = "join the group chat"
            java.lang.String r2 = "加入了群聊"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            o9.p.f9658l = r0
            java.lang.String r0 = "left the group chat"
            java.lang.String r1 = "removed from the group chat"
            java.lang.String r2 = "移出了群聊"
            java.lang.String r3 = "退出了群聊"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            o9.p.f9659m = r0
            og.k r0 = new og.k
            java.lang.String r1 = "<(?:link|member)\\b[^>]*>"
            r2 = 0
            r0.<init>(r1, r2)
            o9.p.f9660n = r0
            og.k r0 = new og.k
            java.lang.String r1 = "([A-Za-z0-9_:-]+)\\s*=\\s*\"([^\"]*)\""
            r0.<init>(r1)
            o9.p.f9661o = r0
            return
    }

    public p(r8.g r1, ia.t r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9662a = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_group_leave_monitor_config"
            android.content.SharedPreferences r2 = ub.b.c(r1, r2)
            r0.f9663b = r2
            bb.l r2 = new bb.l
            r2.<init>(r1)
            r0.f9664c = r2
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f9665d = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f9666e = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f9667f = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f9668g = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f9669h = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f9670i = r1
            og.k r1 = new og.k
            java.lang.String r2 = "\\[AtWx=([^\\]]+)]"
            r1.<init>(r2)
            r0.f9671j = r1
            return
    }

    public static java.lang.String A(java.lang.String r1, o9.q r2) {
            int r0 = r1.hashCode()
            switch(r0) {
                case -1945814489: goto L44;
                case -1587269406: goto L38;
                case -931160507: goto L2c;
                case -709348824: goto L20;
                case 1213692196: goto L14;
                case 1526706539: goto L8;
                default: goto L7;
            }
        L7:
            goto L4c
        L8:
            java.lang.String r0 = "group_member_reply_left_text"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L11
            goto L4c
        L11:
            java.lang.String r1 = r2.f9680i
            return r1
        L14:
            java.lang.String r0 = "group_member_reply_join_card_title"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1d
            goto L4c
        L1d:
            java.lang.String r1 = r2.f9681j
            return r1
        L20:
            java.lang.String r0 = "group_member_reply_join_text"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L29
            goto L4c
        L29:
            java.lang.String r1 = r2.f9679h
            return r1
        L2c:
            java.lang.String r0 = "group_member_reply_join_card_desc"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L35
            goto L4c
        L35:
            java.lang.String r1 = r2.f9682k
            return r1
        L38:
            java.lang.String r0 = "group_member_reply_left_card_desc"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L41
            goto L4c
        L41:
            java.lang.String r1 = r2.f9684m
            return r1
        L44:
            java.lang.String r0 = "group_member_reply_left_card_title"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4e
        L4c:
            r1 = 0
            return r1
        L4e:
            java.lang.String r1 = r2.f9683l
            return r1
    }

    public static void F(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L7
            return
        L7:
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> Lb
            return
        Lb:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            return
    }

    public static java.util.ArrayList G(java.lang.String r3) {
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x004e: FILL_ARRAY_DATA , data: [124, 44} // fill-array
            r1 = 6
            java.util.List r3 = og.m.F0(r3, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L18
        L28:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L46
            r2 = 1
            goto L47
        L46:
            r2 = 0
        L47:
            if (r2 == 0) goto L31
            r3.add(r1)
            goto L31
        L4d:
            return r3
    }

    public static java.lang.String b(java.lang.String r3, o9.n r4) {
            java.lang.String r0 = r4.f9650b
            java.lang.String r1 = "%userName%"
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r1, r0, r2)
            java.lang.String r0 = "%groupNickname%"
            java.lang.String r1 = r4.f9651c
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%userWxid%"
            java.lang.String r1 = r4.f9649a
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%realNameTail%"
            java.lang.String r1 = r4.f9652d
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%gender%"
            java.lang.String r1 = r4.f9653e
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%region%"
            java.lang.String r1 = r4.f9654f
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%groupName%"
            java.lang.String r1 = r4.f9655g
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%time%"
            java.lang.String r4 = r4.f9656h
            java.lang.String r3 = og.t.a0(r3, r0, r4, r2)
            return r3
    }

    public static java.lang.String e(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "|"
            java.lang.String r1 = wb.en.h(r1, r0, r2)
            return r1
    }

    public static void h(java.lang.String r9, java.lang.String r10, java.util.LinkedHashMap r11) {
            boolean r0 = og.m.t0(r10)
            if (r0 == 0) goto L8
            goto Lfe
        L8:
            og.k r0 = o9.p.f9660n
            ng.c r0 = og.k.c(r0, r10)
            f.i0 r1 = new f.i0
            r1.<init>(r0)
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lfe
            java.lang.Object r0 = r1.next()
            og.f r0 = (og.f) r0
            og.i r0 = (og.i) r0
            java.lang.String r2 = r0.c()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            og.k r4 = o9.p.f9661o
            ng.c r2 = og.k.c(r4, r2)
            f.i0 r4 = new f.i0
            r4.<init>(r2)
        L35:
            boolean r2 = r4.hasNext()
            r5 = 1
            java.lang.String r6 = ""
            r7 = 0
            if (r2 == 0) goto L79
            java.lang.Object r2 = r4.next()
            og.f r2 = (og.f) r2
            og.i r2 = (og.i) r2
            java.util.List r8 = r2.a()
            java.lang.Object r5 = tf.m.w1(r5, r8)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L59
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r7 = j8.b.l(r7, r5, r7)
        L59:
            if (r7 != 0) goto L5c
            r7 = r6
        L5c:
            java.util.List r2 = r2.a()
            r5 = 2
            java.lang.Object r2 = tf.m.w1(r5, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L6a
            goto L6b
        L6a:
            r6 = r2
        L6b:
            java.lang.String r2 = i(r6)
            boolean r5 = og.m.t0(r7)
            if (r5 != 0) goto L35
            r3.put(r7, r2)
            goto L35
        L79:
            java.lang.String r2 = "username"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L8b
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r7 = r2.toString()
        L8b:
            if (r7 != 0) goto L8e
            r7 = r6
        L8e:
            boolean r2 = r(r9, r7)
            if (r2 == 0) goto L13
            boolean r2 = r11.containsKey(r7)
            if (r2 == 0) goto L9c
            goto L13
        L9c:
            java.lang.String r2 = "name"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "nickname"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            lg.d r0 = r0.b()
            int r0 = r0.f8043h
            int r0 = r0 + r5
            if (r0 <= 0) goto Lc4
            int r4 = r10.length()
            if (r0 < r4) goto Lbc
            goto Lc4
        Lbc:
            java.lang.String r4 = "</link>"
            int r4 = og.m.o0(r10, r4, r0, r5)
            if (r4 > r0) goto Lc6
        Lc4:
            r0 = r6
            goto Ld4
        Lc6:
            java.lang.String r0 = r10.substring(r0, r4)
            java.lang.String r0 = i(r0)
            java.lang.String r4 = "<[^>]+>"
            java.lang.String r0 = j8.b.h(r4, r0, r6)
        Ld4:
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0}
            r2 = 0
        Ld9:
            r3 = 3
            if (r2 < r3) goto Ldd
            goto Le9
        Ldd:
            r3 = r0[r2]
            if (r3 == 0) goto Lfb
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto Le8
            goto Lfb
        Le8:
            r6 = r3
        Le9:
            java.lang.CharSequence r0 = og.m.R0(r6)
            java.lang.String r0 = r0.toString()
            o9.i r2 = new o9.i
            r2.<init>(r7, r0)
            r11.put(r7, r2)
            goto L13
        Lfb:
            int r2 = r2 + 1
            goto Ld9
        Lfe:
            return
    }

    public static java.lang.String i(java.lang.String r3) {
            java.lang.String r0 = "&lt;"
            java.lang.String r1 = "<"
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&gt;"
            java.lang.String r1 = ">"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&quot;"
            java.lang.String r1 = "\""
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&apos;"
            java.lang.String r1 = "'"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            return r3
    }

    public static java.lang.String k(java.lang.String r3) {
            java.lang.String r0 = "&"
            java.lang.String r1 = "&amp;"
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "<"
            java.lang.String r1 = "&lt;"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = ">"
            java.lang.String r1 = "&gt;"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "\""
            java.lang.String r1 = "&quot;"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "'"
            java.lang.String r1 = "&apos;"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            return r3
    }

    public static java.lang.String m(java.lang.String r3) {
            g8.i r0 = wb.en.c()
            r1 = 0
            if (r0 == 0) goto Lc
            h.Hchat.hooks.api.model.WeChatContact r0 = r0.n(r3)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L2b
            java.lang.String r0 = r0.displayName()
            if (r0 == 0) goto L2b
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L23
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            if (r2 == 0) goto L27
            goto L28
        L27:
            r0 = r1
        L28:
            if (r0 == 0) goto L2b
            return r0
        L2b:
            g8.d r0 = j8.b.f()
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.f(r3)
            if (r0 == 0) goto L3e
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L3e
            r1 = r0
        L3e:
            if (r1 == 0) goto L41
            return r1
        L41:
            return r3
    }

    public static java.lang.String n(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "_"
            java.lang.String r1 = wb.en.h(r1, r0, r2)
            return r1
    }

    public static boolean r(java.lang.String r2, java.lang.String r3) {
            if (r3 == 0) goto Lb
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 != 0) goto L10
            java.lang.String r3 = ""
        L10:
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L37
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L37
            java.lang.String r2 = "notify@all"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L37
            java.lang.String r2 = "@chatroom"
            boolean r2 = og.t.W(r3, r2, r1)
            if (r2 != 0) goto L37
            java.lang.String r2 = "@im.chatroom"
            boolean r2 = og.t.W(r3, r2, r1)
            if (r2 != 0) goto L37
            r2 = 1
            return r2
        L37:
            return r1
    }

    public static java.lang.String v(java.lang.String r3) {
            int r0 = r3.hashCode()
            r1 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            java.lang.String r2 = "none"
            if (r0 == r1) goto L26
            r1 = 3387192(0x33af38, float:4.746467E-39)
            if (r0 == r1) goto L1f
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r0 == r1) goto L16
            goto L2e
        L16:
            java.lang.String r0 = "after"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2f
            goto L2e
        L1f:
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L2f
            goto L2e
        L26:
            java.lang.String r0 = "before"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2f
        L2e:
            return r2
        L2f:
            return r3
    }

    public static java.lang.String w(java.lang.String r3) {
            int r0 = r3.hashCode()
            r1 = 3029889(0x2e3b81, float:4.245779E-39)
            java.lang.String r2 = "text"
            if (r0 == r1) goto L26
            r1 = 3046160(0x2e7b10, float:4.26858E-39)
            if (r0 == r1) goto L1d
            r1 = 3556653(0x36452d, float:4.983932E-39)
            if (r0 == r1) goto L16
            goto L2e
        L16:
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L2f
            goto L2e
        L1d:
            java.lang.String r0 = "card"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2f
            goto L2e
        L26:
            java.lang.String r0 = "both"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2f
        L2e:
            return r2
        L2f:
            return r3
    }

    public static java.lang.String y(java.lang.String r3) {
            java.lang.String r0 = "||"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r3 = og.m.G0(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L17
        L27:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L45
            r2 = 1
            goto L46
        L45:
            r2 = 0
        L46:
            if (r2 == 0) goto L30
            r3.add(r1)
            goto L30
        L4c:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L55
            java.lang.String r3 = ""
            return r3
        L55:
            jg.a r0 = jg.d.f6902g
            int r0 = r3.size()
            jg.a r1 = jg.d.f6902g
            int r0 = r1.g(r0)
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public final void B(java.lang.String r7, java.util.LinkedHashSet r8) {
            r6 = this;
            g8.i r0 = wb.en.c()
            r1 = 0
            if (r0 == 0) goto Lc
            java.util.LinkedHashMap r0 = r0.w(r7)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L11
            tf.u r0 = tf.u.f13168g
        L11:
            java.util.Iterator r8 = r8.iterator()
        L15:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L32
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 != 0) goto L37
            java.lang.String r3 = ""
        L37:
            java.lang.String r4 = e(r7, r2)
            java.util.concurrent.ConcurrentHashMap r5 = r6.f9667f
            r5.remove(r4)
            int r4 = r3.length()
            if (r4 <= 0) goto L15
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L15
            java.lang.String r2 = e(r7, r2)
            r5.put(r2, r3)
            goto L15
        L54:
            return
    }

    public final void C(java.lang.String r3, o9.i r4) {
            r2 = this;
            java.lang.String r0 = r4.f9637b
            java.lang.String r4 = r4.f9636a
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 <= 0) goto L21
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L21
            java.util.concurrent.ConcurrentHashMap r1 = r2.f9667f
            java.lang.String r3 = e(r3, r4)
            r1.put(r3, r0)
        L21:
            return
    }

    public final void D(java.lang.String r12, java.lang.String r13, o9.n r14, o9.q r15) {
            r11 = this;
            java.lang.String r0 = "join"
            boolean r1 = r12.equals(r0)
            if (r1 == 0) goto Lb
            java.lang.String r1 = "group_member_reply_join_card_title"
            goto Ld
        Lb:
            java.lang.String r1 = "group_member_reply_left_card_title"
        Ld:
            boolean r2 = r12.equals(r0)
            if (r2 == 0) goto L16
            java.lang.String r2 = "group_member_reply_join_card_desc"
            goto L18
        L16:
            java.lang.String r2 = "group_member_reply_left_card_desc"
        L18:
            boolean r3 = r12.equals(r0)
            if (r3 == 0) goto L21
            java.lang.String r3 = "欢迎：%userName%"
            goto L23
        L21:
            java.lang.String r3 = "离群：%userName%"
        L23:
            r12.equals(r0)
            java.lang.String r12 = r11.f(r13, r1, r3, r15)
            java.lang.String r12 = y(r12)
            java.lang.String r5 = b(r12, r14)
            java.lang.String r12 = "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%"
            java.lang.String r12 = r11.f(r13, r2, r12, r15)
            java.lang.String r12 = y(r12)
            java.lang.String r6 = b(r12, r14)
            boolean r12 = og.m.t0(r5)
            if (r12 == 0) goto L4e
            boolean r12 = og.m.t0(r6)
            if (r12 == 0) goto L4e
            goto L10a
        L4e:
            g8.i r12 = wb.en.c()
            r15 = 0
            r1 = 1
            if (r12 == 0) goto L5d
            java.lang.String r14 = r14.f9649a
            java.lang.String r12 = r12.m(r14, r1)
            goto L5e
        L5d:
            r12 = r15
        L5e:
            if (r12 != 0) goto L62
            java.lang.String r12 = ""
        L62:
            r7 = r12
            boolean r12 = og.m.t0(r7)
            if (r12 == 0) goto L6b
        L69:
            r8 = r15
            goto Lb1
        L6b:
            java.net.URL r12 = new java.net.URL     // Catch: java.lang.Throwable -> L98
            r12.<init>(r7)     // Catch: java.lang.Throwable -> L98
            java.net.URLConnection r12 = r12.openConnection()     // Catch: java.lang.Throwable -> L98
            r12.getClass()     // Catch: java.lang.Throwable -> L98
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch: java.lang.Throwable -> L98
            r14 = 1200(0x4b0, float:1.682E-42)
            r12.setConnectTimeout(r14)     // Catch: java.lang.Throwable -> L98
            r12.setReadTimeout(r14)     // Catch: java.lang.Throwable -> L98
            java.lang.String r14 = "GET"
            r12.setRequestMethod(r14)     // Catch: java.lang.Throwable -> L98
            java.io.InputStream r14 = r12.getInputStream()     // Catch: java.lang.Throwable -> L98
            r14.getClass()     // Catch: java.lang.Throwable -> L9b
            byte[] r0 = g4.a.G(r14)     // Catch: java.lang.Throwable -> L9b
            r14.close()     // Catch: java.lang.Throwable -> L98
            r12.disconnect()     // Catch: java.lang.Throwable -> L98
            goto La8
        L98:
            r0 = move-exception
            r12 = r0
            goto La3
        L9b:
            r0 = move-exception
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = move-exception
            ig.a.i(r14, r12)     // Catch: java.lang.Throwable -> L98
            throw r0     // Catch: java.lang.Throwable -> L98
        La3:
            sf.f r0 = new sf.f
            r0.<init>(r12)
        La8:
            boolean r12 = r0 instanceof sf.f
            if (r12 == 0) goto Lad
            goto Lae
        Lad:
            r15 = r0
        Lae:
            byte[] r15 = (byte[]) r15
            goto L69
        Lb1:
            j8.p r3 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r3 == 0) goto Lc1
            java.lang.String r9 = ""
            r4 = r13
            boolean r12 = r3.c(r4, r5, r6, r7, r8, r9)
            if (r12 != r1) goto Lc2
            goto L10a
        Lc1:
            r4 = r13
        Lc2:
            boolean r12 = og.m.t0(r5)
            if (r12 == 0) goto Lce
            boolean r12 = og.m.t0(r6)
            if (r12 != 0) goto L10a
        Lce:
            k8.g r12 = h.Hchat.hooks.api.core.WeChatApis.messages()
            if (r12 == 0) goto L10a
            java.lang.String[] r13 = new java.lang.String[]{r5, r6}
            java.util.List r13 = a.a.y0(r13)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r13 = r13.iterator()
        Le5:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lfc
            java.lang.Object r14 = r13.next()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = og.m.t0(r15)
            if (r15 != 0) goto Le5
            r5.add(r14)
            goto Le5
        Lfc:
            r9 = 0
            r10 = 62
            java.lang.String r6 = "\n"
            r7 = 0
            r8 = 0
            java.lang.String r13 = tf.m.A1(r5, r6, r7, r8, r9, r10)
            r12.x(r4, r13)
        L10a:
            return
    }

    public final void E(java.lang.String r5, java.lang.String r6, o9.n r7, o9.q r8) {
            r4 = this;
            java.lang.String r0 = "join"
            boolean r1 = r5.equals(r0)
            if (r1 == 0) goto Lb
            java.lang.String r1 = "group_member_reply_join_text"
            goto Ld
        Lb:
            java.lang.String r1 = "group_member_reply_left_text"
        Ld:
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L16
            java.lang.String r5 = "[AtWx=%userWxid%]\n欢迎进群\n时间：%time%\n群昵称：%groupName%\n进群者微信昵称：%userName%\n进群者群内昵称：%groupNickname%\n进群者ID：%userWxid%"
            goto L18
        L16:
            java.lang.String r5 = "退群通知：\n时间：%time%\n群昵称：%groupName%\n退群者微信昵称：%userName%\n退群者群内昵称：%groupNickname%\n退群者ID：%userWxid%"
        L18:
            android.content.SharedPreferences r0 = r4.f9663b
            if (r8 == 0) goto L36
            java.lang.String r2 = A(r1, r8)
            java.lang.String r8 = r8.f9677f
            java.lang.String r3 = "global"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L2e
            if (r2 == 0) goto L2e
            r5 = r2
            goto L50
        L2e:
            java.lang.String r8 = r0.getString(r1, r5)
            if (r8 == 0) goto L50
        L34:
            r5 = r8
            goto L50
        L36:
            boolean r8 = r4.H(r6)
            if (r8 == 0) goto L49
            java.lang.String r5 = n(r1, r6)
            java.lang.String r8 = ""
            java.lang.String r5 = r0.getString(r5, r8)
            if (r5 != 0) goto L50
            goto L34
        L49:
            java.lang.String r8 = r0.getString(r1, r5)
            if (r8 == 0) goto L50
            goto L34
        L50:
            java.lang.String r5 = y(r5)
            boolean r8 = og.m.t0(r5)
            if (r8 == 0) goto L5b
            goto Lc6
        L5b:
            java.lang.String r5 = b(r5, r7)
            boolean r7 = og.m.t0(r5)
            if (r7 == 0) goto L66
            goto Lc6
        L66:
            k8.g r7 = p.a.q()
            if (r7 == 0) goto L6d
            goto L71
        L6d:
            k8.g r7 = h.Hchat.hooks.api.core.WeChatApis.messages()
        L71:
            r8 = 0
            if (r7 != 0) goto L7c
            ia.t r5 = r4.f9662a
            java.lang.String r6 = "进退群自动回复发送失败: 消息发送 API 未就绪"
            r5.invoke(r6, r8)
            return
        L7c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            b0.s r1 = new b0.s
            r2 = 13
            r1.<init>(r0, r4, r6, r2)
            og.k r2 = r4.f9671j
            java.lang.String r1 = r2.e(r5, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L95
            goto La2
        L95:
            o9.k r8 = new o9.k
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r0 = tf.m.P1(r0)
            r8.<init>(r1, r0)
        La2:
            if (r8 != 0) goto La8
            r7.x(r6, r5)
            return
        La8:
            java.util.List r5 = r8.f9643b
            java.lang.String r8 = r8.f9642a
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lb7
            boolean r5 = r7.x(r6, r8)
            goto Lbb
        Lb7:
            boolean r5 = r7.y(r6, r8, r5)
        Lbb:
            if (r5 != 0) goto Lc6
            boolean r5 = og.m.t0(r8)
            if (r5 != 0) goto Lc6
            r7.x(r6, r8)
        Lc6:
            return
    }

    public final boolean H(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "group_member_reply_prompt_type"
            java.lang.String r3 = n(r0, r3)
            android.content.SharedPreferences r0 = r2.f9663b
            java.lang.String r1 = "global"
            java.lang.String r3 = r0.getString(r3, r1)
            if (r3 == 0) goto L11
            goto L12
        L11:
            r3 = r1
        L12:
            boolean r3 = r3.equals(r1)
            r3 = r3 ^ 1
            return r3
    }

    public final java.lang.String a(java.lang.String r10, java.util.Map r11, java.util.Map r12) {
            r9 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Set r1 = r12.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.LinkedHashSet r0 = tf.d0.U(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            return r10
        L15:
            og.k r1 = new og.k
            o9.o r2 = new o9.o
            r2.<init>()
            java.util.List r3 = tf.m.K1(r0, r2)
            o9.e r7 = new o9.e
            r0 = 0
            r7.<init>(r0)
            r8 = 30
            java.lang.String r4 = "|"
            r5 = 0
            r6 = 0
            java.lang.String r0 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            r1.<init>(r0)
            b0.s r0 = new b0.s
            r2 = 12
            r0.<init>(r12, r9, r11, r2)
            java.lang.String r10 = r1.e(r10, r0)
            return r10
    }

    public final java.lang.String c(java.lang.String r11, o9.j r12, o9.j r13, int r14) {
            r10 = this;
            android.content.SharedPreferences r0 = r10.f9663b
            java.lang.String r1 = "group_invite_detail_notice_text"
            java.lang.String r2 = "邀请者：%inviterName% (%inviterWxid%)\n被邀请者：%inviteeName% (%inviteeWxid%)\n累计邀请：%inviteCount%"
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto Ld
            r2 = r0
        Ld:
            java.lang.String r0 = r12.a()
            sf.e r3 = new sf.e
            java.lang.String r1 = "%inviterName%"
            r3.<init>(r1, r0)
            java.lang.String r0 = r12.f9638a
            sf.e r4 = new sf.e
            java.lang.String r1 = "%inviterGroupNickname%"
            r4.<init>(r1, r0)
            java.lang.String r0 = r13.a()
            sf.e r5 = new sf.e
            java.lang.String r1 = "%inviteeName%"
            r5.<init>(r1, r0)
            java.lang.String r0 = r13.f9638a
            sf.e r6 = new sf.e
            java.lang.String r1 = "%inviteeGroupNickname%"
            r6.<init>(r1, r0)
            r0 = 1
            if (r14 >= r0) goto L39
            r14 = r0
        L39:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            sf.e r7 = new sf.e
            java.lang.String r0 = "%inviteCount%"
            r7.<init>(r0, r14)
            java.lang.String r11 = m(r11)
            sf.e r8 = new sf.e
            java.lang.String r14 = "%groupName%"
            r8.<init>(r14, r11)
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r14 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r0 = java.util.Locale.getDefault()
            r11.<init>(r14, r0)
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            java.lang.String r11 = r11.format(r14)
            sf.e r9 = new sf.e
            java.lang.String r14 = "%time%"
            r9.<init>(r14, r11)
            sf.e[] r11 = new sf.e[]{r3, r4, r5, r6, r7, r8, r9}
            java.util.Map r11 = tf.y.b0(r11)
            java.lang.String r12 = r12.f9641d
            sf.e r14 = new sf.e
            java.lang.String r0 = "%inviterWxid%"
            r14.<init>(r0, r12)
            java.lang.String r12 = r13.f9641d
            sf.e r13 = new sf.e
            java.lang.String r0 = "%inviteeWxid%"
            r13.<init>(r0, r12)
            sf.e[] r12 = new sf.e[]{r14, r13}
            java.util.Map r12 = tf.y.b0(r12)
            java.lang.String r11 = r10.a(r2, r11, r12)
            return r11
    }

    public final java.lang.String d(java.lang.String r14, o9.j r15) {
            r13 = this;
            java.lang.String r0 = r15.b()
            java.lang.String r1 = r15.f9638a
            java.lang.String r2 = r15.f9641d
            java.lang.String r3 = r15.f9640c
            java.lang.String r15 = r15.f9639b
            boolean r4 = og.m.t0(r15)
            if (r4 == 0) goto L14
            r4 = r2
            goto L15
        L14:
            r4 = r15
        L15:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r0.getClass()
            boolean r6 = og.m.t0(r1)
            if (r6 != 0) goto L3f
            boolean r6 = og.m.t0(r15)
            if (r6 != 0) goto L3f
            boolean r6 = r0.equals(r15)
            if (r6 != 0) goto L3f
            r6 = 40
            r5.append(r6)
            r5.append(r4)
            r6 = 41
            r5.append(r6)
        L3f:
            r4.getClass()
            boolean r6 = og.m.t0(r3)
            if (r6 != 0) goto L61
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L61
            boolean r0 = r3.equals(r4)
            if (r0 != 0) goto L61
            r0 = 91
            r5.append(r0)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
        L61:
            java.lang.String r0 = r5.toString()
            android.content.SharedPreferences r4 = r13.f9663b
            java.lang.String r5 = "group_leave_monitor_notice_text"
            java.lang.String r6 = "%displayName%(%userWxid%) 退出了群聊"
            java.lang.String r4 = r4.getString(r5, r6)
            if (r4 == 0) goto L72
            r6 = r4
        L72:
            sf.e r7 = new sf.e
            java.lang.String r4 = "%displayName%"
            r7.<init>(r4, r0)
            sf.e r8 = new sf.e
            java.lang.String r0 = "%groupNickname%"
            r8.<init>(r0, r1)
            sf.e r9 = new sf.e
            java.lang.String r0 = "%userName%"
            r9.<init>(r0, r15)
            sf.e r10 = new sf.e
            java.lang.String r15 = "%remarkName%"
            r10.<init>(r15, r3)
            java.lang.String r14 = m(r14)
            sf.e r11 = new sf.e
            java.lang.String r15 = "%groupName%"
            r11.<init>(r15, r14)
            java.text.SimpleDateFormat r14 = new java.text.SimpleDateFormat
            java.lang.String r15 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r0 = java.util.Locale.getDefault()
            r14.<init>(r15, r0)
            java.util.Date r15 = new java.util.Date
            r15.<init>()
            java.lang.String r14 = r14.format(r15)
            sf.e r12 = new sf.e
            java.lang.String r15 = "%time%"
            r12.<init>(r15, r14)
            sf.e[] r14 = new sf.e[]{r7, r8, r9, r10, r11, r12}
            java.util.Map r14 = tf.y.b0(r14)
            java.lang.String r15 = "%userWxid%"
            java.util.Map r15 = java.util.Collections.singletonMap(r15, r2)
            r15.getClass()
            java.lang.String r14 = r13.a(r6, r14, r15)
            return r14
    }

    public final java.lang.String f(java.lang.String r3, java.lang.String r4, java.lang.String r5, o9.q r6) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f9663b
            java.lang.String r1 = r0.getString(r4, r5)
            if (r1 == 0) goto L9
            r5 = r1
        L9:
            if (r6 == 0) goto L23
            java.lang.String r3 = A(r4, r6)
            java.lang.String r4 = r6.f9677f
            java.lang.String r6 = "global"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L3f
            if (r3 == 0) goto L3f
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L22
            goto L3f
        L22:
            return r3
        L23:
            boolean r6 = r2.H(r3)
            if (r6 == 0) goto L3f
            java.lang.String r3 = n(r4, r3)
            java.lang.String r4 = ""
            java.lang.String r3 = r0.getString(r3, r4)
            if (r3 != 0) goto L36
            goto L37
        L36:
            r4 = r3
        L37:
            boolean r3 = og.m.t0(r4)
            if (r3 == 0) goto L3e
            goto L3f
        L3e:
            return r4
        L3f:
            return r5
    }

    public final void g(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "|"
            java.lang.String r4 = bc.e.i(r4, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r3.f9669h
            java.util.Set r0 = r0.keySet()
            ca.s r1 = new ca.s
            r2 = 15
            r1.<init>(r4, r2)
            be.i r4 = new be.i
            r2 = 21
            r4.<init>(r1, r2)
            r0.removeIf(r4)
            return
    }

    public final long j(java.lang.String r5, java.lang.String r6, int r7, o9.q r8) {
            r4 = this;
            android.content.SharedPreferences r0 = r4.f9663b
            int r7 = r0.getInt(r6, r7)
            r1 = 0
            if (r7 >= 0) goto La
            r7 = r1
        La:
            java.lang.String r2 = "custom"
            if (r8 == 0) goto L76
            java.lang.String r5 = r8.C
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L98
            int r5 = r6.hashCode()
            switch(r5) {
                case -1459240629: goto L68;
                case -1204580096: goto L5c;
                case -292247072: goto L50;
                case -143181047: goto L44;
                case -41214421: goto L38;
                case 666720483: goto L2c;
                case 742871669: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L70
        L1e:
            java.lang.String r5 = "group_member_reply_emoji_delay_ms"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L27
            goto L70
        L27:
            int r5 = r8.G
        L29:
            r7 = r5
            goto L98
        L2c:
            java.lang.String r5 = "group_member_reply_prompt_delay_ms"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L35
            goto L70
        L35:
            int r5 = r8.D
            goto L29
        L38:
            java.lang.String r5 = "group_member_reply_favorite_delay_ms"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L41
            goto L70
        L41:
            int r5 = r8.J
            goto L29
        L44:
            java.lang.String r5 = "group_member_reply_voice_delay_ms"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L4d
            goto L70
        L4d:
            int r5 = r8.F
            goto L29
        L50:
            java.lang.String r5 = "group_member_reply_video_delay_ms"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L59
            goto L70
        L59:
            int r5 = r8.H
            goto L29
        L5c:
            java.lang.String r5 = "group_member_reply_image_delay_ms"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L65
            goto L70
        L65:
            int r5 = r8.E
            goto L29
        L68:
            java.lang.String r5 = "group_member_reply_file_delay_ms"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L73
        L70:
            r5 = 100
            goto L29
        L73:
            int r5 = r8.I
            goto L29
        L76:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "group_member_reply_delay_mode_"
            r8.<init>(r3)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r3 = "global"
            java.lang.String r8 = r0.getString(r8, r3)
            boolean r8 = gg.l.a(r8, r2)
            if (r8 == 0) goto L98
            java.lang.String r5 = n(r6, r5)
            int r7 = r0.getInt(r5, r7)
        L98:
            if (r7 >= 0) goto L9b
            goto L9c
        L9b:
            r1 = r7
        L9c:
            long r5 = (long) r1
            return r5
    }

    public final void l(java.lang.String r25, java.lang.String r26, o9.n r27, o9.q r28) {
            r24 = this;
            r1 = r24
            r2 = r26
            r6 = r28
            r0 = 0
            if (r6 == 0) goto Lc
            java.lang.String r3 = r6.f9677f
            goto Ld
        Lc:
            r3 = r0
        Ld:
            java.lang.String r7 = ""
            if (r3 != 0) goto L12
            r3 = r7
        L12:
            java.lang.String r4 = "group_member_reply_prompt_type"
            android.content.SharedPreferences r8 = r1.f9663b
            java.lang.String r9 = "text"
            java.lang.String r5 = "global"
            if (r6 == 0) goto L3b
            boolean r10 = og.m.t0(r3)
            if (r10 != 0) goto L2e
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L2e
            java.lang.String r3 = w(r3)
        L2c:
            r10 = r3
            goto L5f
        L2e:
            java.lang.String r3 = r8.getString(r4, r9)
            if (r3 == 0) goto L35
            goto L36
        L35:
            r3 = r9
        L36:
            java.lang.String r3 = w(r3)
            goto L2c
        L3b:
            java.lang.String r3 = n(r4, r2)
            java.lang.String r3 = r8.getString(r3, r5)
            if (r3 == 0) goto L46
            goto L47
        L46:
            r3 = r5
        L47:
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L52
            java.lang.String r3 = w(r3)
            goto L2c
        L52:
            java.lang.String r3 = r8.getString(r4, r9)
            if (r3 == 0) goto L59
            goto L5a
        L59:
            r3 = r9
        L5a:
            java.lang.String r3 = w(r3)
            goto L2c
        L5f:
            java.lang.String r3 = "group_member_reply_media_order"
            java.lang.String r4 = "none"
            java.lang.String r5 = r8.getString(r3, r4)
            if (r5 == 0) goto L6a
            goto L6b
        L6a:
            r5 = r4
        L6b:
            java.lang.String r5 = v(r5)
            java.lang.String r11 = "custom"
            if (r6 == 0) goto L8b
            java.lang.String r3 = r6.f9685n
            boolean r12 = r3.equals(r4)
            if (r12 == 0) goto L7d
        L7b:
            r12 = r4
            goto Lac
        L7d:
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L89
            java.lang.String r3 = r6.f9686o
            java.lang.String r5 = v(r3)
        L89:
            r12 = r5
            goto Lac
        L8b:
            java.lang.String r12 = r1.s(r2, r0)
            boolean r13 = r12.equals(r4)
            if (r13 == 0) goto L96
            goto L7b
        L96:
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L89
            java.lang.String r3 = n(r3, r2)
            java.lang.String r3 = r8.getString(r3, r5)
            if (r3 == 0) goto La7
            r5 = r3
        La7:
            java.lang.String r5 = v(r5)
            goto L89
        Lac:
            boolean r3 = r12.equals(r4)
            r13 = 0
            if (r3 == 0) goto Lba
            tf.t r0 = tf.t.f13167g
            r11 = r2
            r14 = r6
        Lb7:
            r15 = r0
            goto L26c
        Lba:
            java.lang.String r3 = "group_member_reply_media_sequence"
            java.lang.String r4 = "image,voice,emoji,video,file,favorite"
            java.lang.String r5 = r8.getString(r3, r4)
            if (r5 == 0) goto Lc5
            r4 = r5
        Lc5:
            if (r6 == 0) goto Ld9
            java.lang.String r0 = r6.f9685n
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto Ld7
            java.lang.String r0 = r6.f9687p
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto Led
        Ld7:
            r0 = r4
            goto Led
        Ld9:
            java.lang.String r0 = r1.s(r2, r0)
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto Ld7
            java.lang.String r0 = n(r3, r2)
            java.lang.String r0 = r8.getString(r0, r4)
            if (r0 == 0) goto Ld7
        Led:
            java.lang.String r4 = "group_member_reply_join_image_paths"
            java.lang.String r5 = "group_member_reply_left_image_paths"
            r3 = r25
            java.lang.String r4 = r1.t(r2, r3, r4, r5, r6)
            r11 = r2
            r14 = r6
            java.lang.String r2 = "group_member_reply_image_delay_ms"
            r15 = 100
            long r2 = r1.j(r11, r2, r15, r14)
            ca.s r6 = new ca.s
            r5 = 10
            r6.<init>(r11, r5)
            r22 = r2
            r3 = r4
            r4 = r22
            java.lang.String r2 = "image"
            o9.m r2 = r1.x(r2, r3, r4, r6)
            sf.e r1 = new sf.e
            java.lang.String r3 = "image"
            r1.<init>(r3, r2)
            java.lang.String r4 = "group_member_reply_join_voice_paths"
            java.lang.String r5 = "group_member_reply_left_voice_paths"
            r3 = r25
            r16 = r1
            r2 = r11
            r6 = r14
            r1 = r24
            java.lang.String r4 = r1.t(r2, r3, r4, r5, r6)
            java.lang.String r2 = "group_member_reply_voice_delay_ms"
            long r2 = r1.j(r11, r2, r15, r14)
            m.b r6 = new m.b
            r5 = 4
            r6.<init>(r1, r5, r11)
            r22 = r2
            r3 = r4
            r4 = r22
            java.lang.String r2 = "voice"
            o9.m r2 = r1.x(r2, r3, r4, r6)
            sf.e r1 = new sf.e
            java.lang.String r3 = "voice"
            r1.<init>(r3, r2)
            java.lang.String r4 = "group_member_reply_join_emoji_paths"
            java.lang.String r5 = "group_member_reply_left_emoji_paths"
            r3 = r25
            r17 = r1
            r2 = r11
            r6 = r14
            r1 = r24
            java.lang.String r4 = r1.t(r2, r3, r4, r5, r6)
            java.lang.String r2 = "group_member_reply_emoji_delay_ms"
            long r2 = r1.j(r11, r2, r15, r14)
            ca.s r6 = new ca.s
            r5 = 11
            r6.<init>(r11, r5)
            r22 = r2
            r3 = r4
            r4 = r22
            java.lang.String r2 = "emoji"
            o9.m r2 = r1.x(r2, r3, r4, r6)
            sf.e r1 = new sf.e
            java.lang.String r3 = "emoji"
            r1.<init>(r3, r2)
            java.lang.String r4 = "group_member_reply_join_video_paths"
            java.lang.String r5 = "group_member_reply_left_video_paths"
            r3 = r25
            r18 = r1
            r2 = r11
            r6 = r14
            r1 = r24
            java.lang.String r4 = r1.t(r2, r3, r4, r5, r6)
            java.lang.String r2 = "group_member_reply_video_delay_ms"
            long r2 = r1.j(r11, r2, r15, r14)
            ca.s r6 = new ca.s
            r5 = 12
            r6.<init>(r11, r5)
            r22 = r2
            r3 = r4
            r4 = r22
            java.lang.String r2 = "video"
            o9.m r2 = r1.x(r2, r3, r4, r6)
            sf.e r1 = new sf.e
            java.lang.String r3 = "video"
            r1.<init>(r3, r2)
            java.lang.String r4 = "group_member_reply_join_file_paths"
            java.lang.String r5 = "group_member_reply_left_file_paths"
            r3 = r25
            r19 = r1
            r2 = r11
            r6 = r14
            r1 = r24
            java.lang.String r4 = r1.t(r2, r3, r4, r5, r6)
            java.lang.String r2 = "group_member_reply_file_delay_ms"
            long r2 = r1.j(r11, r2, r15, r14)
            ca.s r6 = new ca.s
            r5 = 13
            r6.<init>(r11, r5)
            r22 = r2
            r3 = r4
            r4 = r22
            java.lang.String r2 = "file"
            o9.m r2 = r1.x(r2, r3, r4, r6)
            sf.e r1 = new sf.e
            java.lang.String r3 = "file"
            r1.<init>(r3, r2)
            java.lang.String r4 = "group_member_reply_join_favorite_paths"
            java.lang.String r5 = "group_member_reply_left_favorite_paths"
            r3 = r25
            r20 = r1
            r2 = r11
            r6 = r14
            r1 = r24
            java.lang.String r4 = r1.t(r2, r3, r4, r5, r6)
            java.lang.String r2 = "group_member_reply_favorite_delay_ms"
            long r2 = r1.j(r11, r2, r15, r14)
            ca.s r6 = new ca.s
            r5 = 14
            r6.<init>(r11, r5)
            r22 = r2
            r3 = r4
            r4 = r22
            java.lang.String r2 = "favorite"
            o9.m r2 = r1.x(r2, r3, r4, r6)
            sf.e r3 = new sf.e
            java.lang.String r4 = "favorite"
            r3.<init>(r4, r2)
            r21 = r3
            sf.e[] r2 = new sf.e[]{r16, r17, r18, r19, r20, r21}
            java.util.Map r2 = tf.y.b0(r2)
            r3 = 1
            char[] r3 = new char[r3]
            r4 = 44
            r3[r13] = r4
            r4 = 6
            java.util.List r0 = og.m.F0(r0, r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = tf.n.e1(r0)
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L227:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L24b
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r5 = java.util.Locale.US
            r5.getClass()
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
            r3.add(r4)
            goto L227
        L24b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L254:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r2.get(r4)
            o9.m r4 = (o9.m) r4
            if (r4 == 0) goto L254
            r0.add(r4)
            goto L254
        L26c:
            java.lang.String r0 = "group_member_reply_prompt_delay_ms"
            long r2 = r1.j(r11, r0, r13, r14)
            java.lang.String r13 = "card"
            boolean r0 = r10.equals(r13)
            if (r0 == 0) goto L298
            o9.m r7 = new o9.m
            o9.f r0 = new o9.f
            r6 = 0
            r4 = r27
            r8 = r2
            r3 = r11
            r5 = r14
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.<init>(r13, r8, r0)
            java.util.List r0 = a.a.x0(r7)
            r1 = r24
            r2 = r26
            r16 = r15
            goto L347
        L298:
            r0 = r2
            java.lang.String r11 = "both"
            boolean r2 = r10.equals(r11)
            if (r2 == 0) goto L327
            o9.m r10 = new o9.m
            r1 = r0
            o9.f r0 = new o9.f
            r6 = 1
            r3 = r26
            r4 = r27
            r5 = r28
            r16 = r15
            r14 = r1
            r1 = r24
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.<init>(r9, r14, r0)
            o9.m r9 = new o9.m
            o9.f r0 = new o9.f
            r6 = 2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = r3
            r6 = r5
            r3 = 120(0x78, double:5.93E-322)
            r9.<init>(r13, r3, r0)
            java.lang.String r0 = "card_first"
            java.lang.String r1 = "group_member_reply_both_order"
            java.lang.String r3 = "text_first"
            if (r6 == 0) goto L2eb
            java.lang.String r4 = r6.f9677f
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L2dc
            java.lang.String r1 = r6.f9678g
            goto L2e4
        L2dc:
            java.lang.String r1 = r8.getString(r1, r3)
            if (r1 == 0) goto L2e3
            goto L2e4
        L2e3:
            r1 = r3
        L2e4:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L30d
            goto L30c
        L2eb:
            java.lang.String r4 = n(r1, r2)
            java.lang.String r4 = r8.getString(r4, r7)
            if (r4 != 0) goto L2f6
            goto L2f7
        L2f6:
            r7 = r4
        L2f7:
            boolean r4 = og.m.t0(r7)
            if (r4 == 0) goto L306
            java.lang.String r1 = r8.getString(r1, r3)
            if (r1 == 0) goto L305
            r7 = r1
            goto L306
        L305:
            r7 = r3
        L306:
            boolean r1 = r7.equals(r0)
            if (r1 == 0) goto L30d
        L30c:
            r3 = r0
        L30d:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L31e
            o9.m[] r0 = new o9.m[]{r9, r10}
            java.util.List r0 = a.a.y0(r0)
        L31b:
            r1 = r24
            goto L347
        L31e:
            o9.m[] r0 = new o9.m[]{r10, r9}
            java.util.List r0 = a.a.y0(r0)
            goto L31b
        L327:
            r2 = r26
            r6 = r28
            r16 = r15
            r14 = r0
            o9.m r7 = new o9.m
            o9.f r0 = new o9.f
            r6 = 3
            r1 = r24
            r4 = r27
            r5 = r28
            r3 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = r3
            r7.<init>(r9, r14, r0)
            java.util.List r0 = a.a.x0(r7)
        L347:
            java.lang.String r3 = "before"
            boolean r3 = r12.equals(r3)
            if (r3 == 0) goto L356
            r3 = r16
            java.util.ArrayList r0 = tf.m.F1(r3, r0)
            goto L364
        L356:
            r3 = r16
            java.lang.String r4 = "after"
            boolean r4 = r12.equals(r4)
            if (r4 == 0) goto L364
            java.util.ArrayList r0 = tf.m.F1(r0, r3)
        L364:
            java.util.Iterator r3 = r0.iterator()
        L368:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a4
            java.lang.Object r0 = r3.next()
            r4 = r0
            o9.m r4 = (o9.m) r4
            long r5 = r4.f9647b
            F(r5)
            fg.a r0 = r4.f9648c     // Catch: java.lang.Throwable -> L382
            r0.invoke()     // Catch: java.lang.Throwable -> L382
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L382
            goto L389
        L382:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L389:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L39e
            java.lang.String r4 = r4.f9646a
            java.lang.String r5 = "进退群自动回复发送失败: "
            java.lang.String r6 = "/"
            java.lang.String r4 = bc.e.j(r5, r2, r6, r4)
            ia.t r5 = r1.f9662a
            r5.invoke(r4, r0)
        L39e:
            r4 = 300(0x12c, double:1.48E-321)
            F(r4)
            goto L368
        L3a4:
            return
    }

    public final boolean o(int r18, java.lang.String r19, java.lang.String r20) {
            r17 = this;
            r1 = r17
            r3 = r19
            r0 = r20
            g8.d r2 = j8.b.f()
            r8 = 0
            if (r2 == 0) goto L4a
            java.lang.String r4 = ""
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L3f
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L1c
            goto L3f
        L1c:
            java.util.LinkedHashMap r2 = r2.k(r3)
            java.lang.Object r2 = r2.get(r0)
            g8.c r2 = (g8.c) r2
            if (r2 == 0) goto L3f
            java.lang.String r5 = r2.f4346b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L31
            goto L3f
        L31:
            java.lang.String r2 = r2.f4346b
            java.lang.String r2 = r2.trim()
            boolean r5 = r0.equals(r2)
            if (r5 == 0) goto L3e
            goto L3f
        L3e:
            r4 = r2
        L3f:
            if (r4 == 0) goto L4a
            java.lang.CharSequence r2 = og.m.R0(r4)
            java.lang.String r2 = r2.toString()
            goto L4b
        L4a:
            r2 = r8
        L4b:
            if (r2 != 0) goto L4f
            java.lang.String r2 = ""
        L4f:
            r9 = r2
            boolean r2 = r(r3, r9)
            r4 = 0
            if (r2 == 0) goto L12f
            boolean r2 = r9.equals(r0)
            if (r2 == 0) goto L5f
            goto L12f
        L5f:
            r0.getClass()
            java.lang.Object r2 = r1.f9670i
            monitor-enter(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12c
            java.lang.String r6 = "group_invite_detail_count_"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L12c
            r5.append(r3)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r6 = "|"
            r5.append(r6)     // Catch: java.lang.Throwable -> L12c
            r5.append(r9)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L12c
            android.content.SharedPreferences r6 = r1.f9663b     // Catch: java.lang.Throwable -> L12c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12c
            java.lang.String r10 = "group_invite_detail_count_"
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L12c
            r7.append(r3)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r10 = "|"
            r7.append(r10)     // Catch: java.lang.Throwable -> L12c
            r7.append(r9)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L12c
            int r6 = r6.getInt(r7, r4)     // Catch: java.lang.Throwable -> L12c
            if (r6 >= 0) goto L9a
            r6 = r4
        L9a:
            r10 = 1
            r7 = r18
            if (r7 >= r10) goto La0
            r7 = r10
        La0:
            int r6 = r6 + r7
            android.content.SharedPreferences r7 = r1.f9663b     // Catch: java.lang.Throwable -> L12c
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Throwable -> L12c
            android.content.SharedPreferences$Editor r5 = r7.putInt(r5, r6)     // Catch: java.lang.Throwable -> L12c
            r5.commit()     // Catch: java.lang.Throwable -> L12c
            monitor-exit(r2)
            android.content.SharedPreferences r2 = r1.f9663b
            java.lang.String r5 = "group_invite_detail_enable"
            boolean r2 = r2.getBoolean(r5, r4)
            if (r2 == 0) goto L12b
            boolean r2 = r1.q(r3)
            if (r2 == 0) goto L12b
            java.lang.String r11 = "/"
            ia.t r12 = r1.f9662a
            java.lang.String r13 = "邀请详情插入失败: "
            long r4 = java.lang.System.currentTimeMillis()
            i8.c r2 = h.Hchat.hooks.api.core.WeChatApis.message()
            r2.getClass()
            k8.e r2 = h.Hchat.hooks.api.core.WeChatApis.h()
            if (r2 != 0) goto Ldc
            java.lang.String r0 = "邀请详情插入失败: 本地消息 API 未就绪"
            r12.invoke(r0, r8)
            goto L12b
        Ldc:
            r2.c()     // Catch: java.lang.Throwable -> L115
            o9.j r7 = r1.u(r3, r9)     // Catch: java.lang.Throwable -> L115
            o9.j r14 = r1.u(r3, r0)     // Catch: java.lang.Throwable -> L115
            java.lang.String r6 = r1.c(r3, r7, r14, r6)     // Catch: java.lang.Throwable -> L115
            r7 = 1
            r15 = r4
            r4 = r6
            r5 = r15
            long r4 = r2.e(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L115
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L117
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L115
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L115
            r2.append(r3)     // Catch: java.lang.Throwable -> L115
            r2.append(r11)     // Catch: java.lang.Throwable -> L115
            r2.append(r9)     // Catch: java.lang.Throwable -> L115
            r2.append(r11)     // Catch: java.lang.Throwable -> L115
            r2.append(r0)     // Catch: java.lang.Throwable -> L115
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L115
            r12.invoke(r0, r8)     // Catch: java.lang.Throwable -> L115
            goto L117
        L115:
            r0 = move-exception
            goto L11a
        L117:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L115
            goto L120
        L11a:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L120:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L12b
            java.lang.String r2 = "邀请详情插入异常"
            r12.invoke(r2, r0)
        L12b:
            return r10
        L12c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L12f:
            return r4
    }

    public final void p(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r12 = this;
            java.lang.String r0 = "group_member_reply_enable"
            r1 = 0
            android.content.SharedPreferences r2 = r12.f9663b
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto Ld
            goto Le2
        Ld:
            java.lang.String r0 = "group_member_reply_listen_groups"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto L18
            r0 = r1
        L18:
            java.util.ArrayList r0 = G(r0)
            java.util.Set r0 = tf.m.U1(r0)
            boolean r0 = r0.contains(r14)
            if (r0 != 0) goto L28
            goto Le2
        L28:
            java.lang.String r0 = "group_member_reply_template_bindings"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto L31
            r0 = r1
        L31:
            java.util.List r0 = r9.e0.R(r0)
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L50
            java.lang.Object r3 = r0.next()
            r5 = r3
            o9.r r5 = (o9.r) r5
            java.lang.String r5 = r5.f9698a
            boolean r5 = gg.l.a(r5, r14)
            if (r5 == 0) goto L39
            goto L51
        L50:
            r3 = r4
        L51:
            o9.r r3 = (o9.r) r3
            if (r3 == 0) goto L80
            java.lang.String r0 = "group_member_reply_templates"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto L5e
            r0 = r1
        L5e:
            java.util.List r0 = r9.e0.X(r0)
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r0.next()
            r6 = r5
            o9.q r6 = (o9.q) r6
            java.lang.String r6 = r6.f9672a
            java.lang.String r7 = r3.f9700c
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L66
            r4 = r5
        L7e:
            o9.q r4 = (o9.q) r4
        L80:
            r10 = r4
            java.lang.String r0 = "join"
            boolean r0 = r13.equals(r0)
            r3 = 1
            if (r0 == 0) goto Lb2
            if (r10 == 0) goto L95
            boolean r0 = r10.f9674c
            if (r0 == 0) goto Le2
            boolean r0 = r10.f9675d
            if (r0 != 0) goto Lb2
            goto Le2
        L95:
            java.lang.String r0 = "group_member_reply_join_enable"
            boolean r0 = r2.getBoolean(r0, r3)
            if (r0 != 0) goto L9e
            goto Le2
        L9e:
            java.lang.String r0 = "group_member_reply_join_disabled_groups"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto La7
            r0 = r1
        La7:
            java.util.ArrayList r0 = G(r0)
            boolean r0 = r0.contains(r14)
            if (r0 == 0) goto Lb2
            goto Le2
        Lb2:
            java.lang.String r0 = "left"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Le3
            if (r10 == 0) goto Lc5
            boolean r0 = r10.f9674c
            if (r0 == 0) goto Le2
            boolean r0 = r10.f9676e
            if (r0 != 0) goto Le3
            goto Le2
        Lc5:
            java.lang.String r0 = "group_member_reply_left_enable"
            boolean r0 = r2.getBoolean(r0, r3)
            if (r0 != 0) goto Lce
            goto Le2
        Lce:
            java.lang.String r0 = "group_member_reply_left_disabled_groups"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto Ld7
            goto Ld8
        Ld7:
            r1 = r0
        Ld8:
            java.util.ArrayList r0 = G(r1)
            boolean r0 = r0.contains(r14)
            if (r0 == 0) goto Le3
        Le2:
            return
        Le3:
            java.lang.Thread r0 = new java.lang.Thread
            ca.x r5 = new ca.x
            r11 = 10
            r6 = r12
            r9 = r13
            r7 = r14
            r8 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = "Hchat-GroupMemberReply"
            r0.<init>(r5, r13)
            r0.start()
            return
    }

    public final boolean q(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f9663b
            java.lang.String r1 = "group_monitor_notice_scope"
            java.lang.String r2 = "all"
            java.lang.String r1 = r0.getString(r1, r2)
            if (r1 == 0) goto Ld
            r2 = r1
        Ld:
            java.lang.String r1 = "specific"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2e
            java.lang.String r1 = "group_monitor_notice_groups"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L20
            goto L21
        L20:
            r2 = r0
        L21:
            java.util.ArrayList r0 = G(r2)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L2c
            goto L2e
        L2c:
            r4 = 0
            return r4
        L2e:
            r4 = 1
            return r4
    }

    public final java.lang.String s(java.lang.String r5, o9.q r6) {
            r4 = this;
            java.lang.String r0 = "global"
            java.lang.String r1 = "custom"
            java.lang.String r2 = "none"
            if (r6 == 0) goto L18
            java.lang.String r5 = r6.f9685n
            boolean r6 = r5.equals(r1)
            if (r6 == 0) goto L11
            goto L4c
        L11:
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L4d
            goto L44
        L18:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r3 = "group_member_reply_media_mode_"
            r6.<init>(r3)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.content.SharedPreferences r6 = r4.f9663b
            java.lang.String r5 = r6.getString(r5, r0)
            if (r5 == 0) goto L4d
            int r6 = r5.hashCode()
            r3 = -1349088399(0xffffffffaf968b71, float:-2.738392E-10)
            if (r6 == r3) goto L45
            r1 = 3387192(0x33af38, float:4.746467E-39)
            if (r6 == r1) goto L3d
            goto L4d
        L3d:
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L44
            goto L4d
        L44:
            return r2
        L45:
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L4c
            goto L4d
        L4c:
            return r1
        L4d:
            return r0
    }

    public final java.lang.String t(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, o9.q r7) {
            r2 = this;
            java.lang.String r0 = "join"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L9
            goto La
        L9:
            r5 = r6
        La:
            java.lang.String r4 = r2.s(r3, r7)
            java.lang.String r6 = "custom"
            boolean r4 = r4.equals(r6)
            android.content.SharedPreferences r6 = r2.f9663b
            java.lang.String r0 = ""
            if (r4 == 0) goto Lcc
            r4 = 0
            if (r7 == 0) goto Lbd
            int r1 = r5.hashCode()
            switch(r1) {
                case -1933938394: goto Lb2;
                case -1489647034: goto La6;
                case -798477783: goto L9a;
                case -650106461: goto L8e;
                case -387472689: goto L82;
                case -3224998: goto L76;
                case 452067884: goto L6a;
                case 611178438: goto L5e;
                case 744951727: goto L50;
                case 836315575: goto L42;
                case 1584492300: goto L34;
                case 1769824073: goto L26;
                default: goto L24;
            }
        L24:
            goto Lbd
        L26:
            java.lang.String r1 = "group_member_reply_left_favorite_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L30
            goto Lbd
        L30:
            java.lang.String r4 = r7.B
            goto Lbd
        L34:
            java.lang.String r1 = "group_member_reply_left_image_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3e
            goto Lbd
        L3e:
            java.lang.String r4 = r7.f9689r
            goto Lbd
        L42:
            java.lang.String r1 = "group_member_reply_left_emoji_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L4c
            goto Lbd
        L4c:
            java.lang.String r4 = r7.f9693v
            goto Lbd
        L50:
            java.lang.String r1 = "group_member_reply_join_image_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L5a
            goto Lbd
        L5a:
            java.lang.String r4 = r7.f9688q
            goto Lbd
        L5e:
            java.lang.String r1 = "group_member_reply_join_favorite_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L67
            goto Lbd
        L67:
            java.lang.String r4 = r7.A
            goto Lbd
        L6a:
            java.lang.String r1 = "group_member_reply_left_video_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L73
            goto Lbd
        L73:
            java.lang.String r4 = r7.f9695x
            goto Lbd
        L76:
            java.lang.String r1 = "group_member_reply_join_emoji_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L7f
            goto Lbd
        L7f:
            java.lang.String r4 = r7.f9692u
            goto Lbd
        L82:
            java.lang.String r1 = "group_member_reply_join_video_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L8b
            goto Lbd
        L8b:
            java.lang.String r4 = r7.f9694w
            goto Lbd
        L8e:
            java.lang.String r1 = "group_member_reply_left_voice_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L97
            goto Lbd
        L97:
            java.lang.String r4 = r7.f9691t
            goto Lbd
        L9a:
            java.lang.String r1 = "group_member_reply_left_file_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto La3
            goto Lbd
        La3:
            java.lang.String r4 = r7.f9697z
            goto Lbd
        La6:
            java.lang.String r1 = "group_member_reply_join_voice_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto Laf
            goto Lbd
        Laf:
            java.lang.String r4 = r7.f9690s
            goto Lbd
        Lb2:
            java.lang.String r1 = "group_member_reply_join_file_paths"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto Lbb
            goto Lbd
        Lbb:
            java.lang.String r4 = r7.f9696y
        Lbd:
            if (r4 == 0) goto Lc0
            return r4
        Lc0:
            java.lang.String r3 = n(r5, r3)
            java.lang.String r3 = r6.getString(r3, r0)
            if (r3 != 0) goto Lcb
            goto Ld2
        Lcb:
            return r3
        Lcc:
            java.lang.String r3 = r6.getString(r5, r0)
            if (r3 != 0) goto Ld3
        Ld2:
            return r0
        Ld3:
            return r3
    }

    public final o9.j u(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            g8.i r0 = wb.en.c()
            java.util.concurrent.ConcurrentHashMap r1 = r7.f9667f
            java.lang.String r2 = e(r8, r9)
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2d
            boolean r6 = og.m.t0(r1)
            if (r6 != 0) goto L25
            boolean r6 = r1.equals(r9)
            if (r6 != 0) goto L25
            r6 = r4
            goto L26
        L25:
            r6 = r3
        L26:
            if (r6 == 0) goto L29
            goto L2a
        L29:
            r1 = r5
        L2a:
            if (r1 == 0) goto L2d
            goto L4f
        L2d:
            if (r0 == 0) goto L4a
            java.lang.String r8 = r0.v(r8, r9)
            if (r8 == 0) goto L4a
            boolean r1 = og.m.t0(r8)
            if (r1 != 0) goto L43
            boolean r1 = r8.equals(r9)
            if (r1 != 0) goto L43
            r1 = r4
            goto L44
        L43:
            r1 = r3
        L44:
            if (r1 == 0) goto L47
            goto L48
        L47:
            r8 = r5
        L48:
            r1 = r8
            goto L4b
        L4a:
            r1 = r5
        L4b:
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r2
        L4f:
            if (r0 == 0) goto L56
            h.Hchat.hooks.api.model.WeChatContact r8 = r0.n(r9)
            goto L57
        L56:
            r8 = r5
        L57:
            if (r8 == 0) goto L73
            java.lang.String r0 = r8.nickname
            if (r0 == 0) goto L73
            boolean r6 = og.m.t0(r0)
            if (r6 != 0) goto L6b
            boolean r6 = r0.equals(r9)
            if (r6 != 0) goto L6b
            r6 = r4
            goto L6c
        L6b:
            r6 = r3
        L6c:
            if (r6 == 0) goto L6f
            goto L70
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L73
            goto L74
        L73:
            r0 = r2
        L74:
            if (r8 == 0) goto L8d
            java.lang.String r8 = r8.remarkName
            if (r8 == 0) goto L8d
            boolean r6 = og.m.t0(r8)
            if (r6 != 0) goto L87
            boolean r6 = r8.equals(r9)
            if (r6 != 0) goto L87
            r3 = r4
        L87:
            if (r3 == 0) goto L8a
            r5 = r8
        L8a:
            if (r5 == 0) goto L8d
            r2 = r5
        L8d:
            o9.j r8 = new o9.j
            r8.<init>(r1, r0, r2, r9)
            return r8
    }

    public final o9.m x(java.lang.String r3, java.lang.String r4, long r5, fg.l r7) {
            r2 = this;
            java.util.ArrayList r4 = G(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lc
            r3 = 0
            return r3
        Lc:
            o9.m r0 = new o9.m
            o9.g r1 = new o9.g
            r1.<init>(r4, r2, r7)
            r0.<init>(r3, r5, r1)
            return r0
    }

    public final void z() {
            r6 = this;
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L66
            r0.getClass()     // Catch: java.lang.Throwable -> L66
            g8.d r0 = h.Hchat.hooks.api.core.WeChatApis.c()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L7e
            java.util.ArrayList r0 = r0.g()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L66
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L66
            h.Hchat.hooks.api.model.WeChatChatroom r1 = (h.Hchat.hooks.api.model.WeChatChatroom) r1     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = r1.chatroomId     // Catch: java.lang.Throwable -> L66
            java.lang.CharSequence r2 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L66
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L32
            goto L15
        L32:
            java.util.List<java.lang.String> r1 = r1.memberIds     // Catch: java.lang.Throwable -> L66
            dg.n r1 = tf.m.m1(r1)     // Catch: java.lang.Throwable -> L66
            o9.e r3 = new o9.e     // Catch: java.lang.Throwable -> L66
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L66
            ng.t r1 = ng.m.W(r1, r3)     // Catch: java.lang.Throwable -> L66
            o9.e r3 = new o9.e     // Catch: java.lang.Throwable -> L66
            r4 = 2
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L66
            ng.i r4 = new ng.i     // Catch: java.lang.Throwable -> L66
            r5 = 1
            r4.<init>(r1, r5, r3)     // Catch: java.lang.Throwable -> L66
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L66
            r1.<init>()     // Catch: java.lang.Throwable -> L66
            ng.m.a0(r4, r1)     // Catch: java.lang.Throwable -> L66
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L5d
            goto L15
        L5d:
            java.util.concurrent.ConcurrentHashMap r3 = r6.f9665d     // Catch: java.lang.Throwable -> L66
            r3.putIfAbsent(r2, r1)     // Catch: java.lang.Throwable -> L66
            r6.B(r2, r1)     // Catch: java.lang.Throwable -> L66
            goto L15
        L66:
            r0 = move-exception
            goto L6b
        L68:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L66
            goto L71
        L6b:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L71:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L7e
            ia.t r1 = r6.f9662a
            java.lang.String r2 = "预加载群成员快照失败"
            r1.invoke(r2, r0)
        L7e:
            return
    }
}
