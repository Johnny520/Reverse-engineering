package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eb.k f2567a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2568b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2569c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f2570d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile boolean f2571e;

    static {
            eb.k r0 = new eb.k
            r0.<init>()
            eb.k.f2567a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            eb.k.f2568b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            eb.k.f2569c = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            eb.k.f2570d = r0
            return
    }

    public static java.lang.String a(int r1, java.lang.String r2, java.lang.String r3) {
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void b(java.lang.StringBuilder r1, java.lang.String r2) {
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r1.length()
            if (r0 <= 0) goto L12
            r0 = 10
            r1.append(r0)
        L12:
            r1.append(r2)
            return
    }

    public static java.lang.String c(java.lang.String r2, java.lang.String r3) {
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L7
            goto L49
        L7:
            java.lang.String r3 = java.util.regex.Pattern.quote(r3)
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\\b"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "\\s*=\\s*(['\"])(.*?)\\1"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 2
            int r1 = l3.w.f(r0)
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r1)
            r3.getClass()
            java.util.regex.Matcher r3 = r3.matcher(r2)
            r3.getClass()
            r1 = 0
            og.i r2 = a7.a.b(r3, r1, r2)
            if (r2 == 0) goto L46
            java.util.List r2 = r2.a()
            java.lang.Object r2 = tf.m.w1(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L47
        L46:
            r2 = 0
        L47:
            if (r2 != 0) goto L4b
        L49:
            java.lang.String r2 = ""
        L4b:
            return r2
    }

    public static java.lang.String d(java.lang.String r3) {
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
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
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            r0 = 6
            char[] r0 = new char[r0]
            r0 = {x0044: FILL_ARRAY_DATA , data: [34, 39, 32, 10, 13, 9} // fill-array
            java.lang.String r3 = og.m.S0(r3, r0)
            return r3
    }

    public static void e(long r4) {
            java.util.concurrent.ConcurrentHashMap r0 = eb.k.f2568b
            int r1 = r0.size()
            r2 = 64
            if (r1 < r2) goto L1e
            java.util.Set r0 = r0.entrySet()
            ca.c r1 = new ca.c
            r2 = 5
            r1.<init>(r4, r2)
            be.i r2 = new be.i
            r3 = 11
            r2.<init>(r1, r3)
            r0.removeIf(r2)
        L1e:
            java.util.concurrent.ConcurrentHashMap r0 = eb.k.f2569c
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L3a
            java.util.Set r0 = r0.entrySet()
            ca.c r1 = new ca.c
            r2 = 6
            r1.<init>(r4, r2)
            be.i r4 = new be.i
            r5 = 12
            r4.<init>(r1, r5)
            r0.removeIf(r4)
        L3a:
            return
    }

    public static java.lang.String f(android.content.ContentValues r3, java.lang.String r4) {
            boolean r0 = r3.containsKey(r4)
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.String r0 = r3.getAsString(r4)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L18
            r0 = r1
            goto L18
        L11:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L18:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 != 0) goto L1f
            goto L30
        L1f:
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L2a
            java.lang.String r3 = r3.toString()
            goto L2b
        L2a:
            r3 = 0
        L2b:
            if (r3 != 0) goto L2e
            goto L2f
        L2e:
            r1 = r3
        L2f:
            r0 = r1
        L30:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static java.lang.String g(eb.i r3) {
            java.lang.String r0 = r3.f2557b
            java.lang.String r1 = r3.f2556a
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = h(r0)
            java.lang.String r1 = r3.f2558c
            int r3 = r3.f2559d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "|"
            r2.append(r0)
            r2.append(r1)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            return r3
    }

    public static java.lang.String h(java.lang.String... r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto Ld
            goto L11
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L16
            java.lang.String r4 = ""
            return r4
        L16:
            return r2
    }

    public static void i(h.Hchat.hooks.items.script.ScriptMessageBean r8) {
            java.lang.String r0 = r8.getMsgType()
            java.lang.Integer r2 = og.t.f0(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.getContent()
            java.lang.String r3 = r8.getXml()
            java.lang.String r4 = r8.getMsgSource()
            boolean r5 = og.m.t0(r1)
            if (r5 != 0) goto L22
            r0.append(r1)
        L22:
            boolean r5 = og.m.t0(r3)
            r6 = 10
            if (r5 != 0) goto L36
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L36
            r0.append(r6)
            r0.append(r3)
        L36:
            boolean r1 = og.m.t0(r4)
            if (r1 != 0) goto L42
            r0.append(r6)
            r0.append(r4)
        L42:
            java.lang.String r1 = r0.toString()
            java.lang.String r3 = r8.getSender()
            r4 = 0
            java.lang.String r5 = ""
            r6 = r5
            r7 = r5
            eb.i r8 = m(r1, r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto La2
            long r0 = java.lang.System.currentTimeMillis()
            e(r0)
            o(r8, r0)
            java.lang.String r2 = g(r8)
            java.util.concurrent.ConcurrentHashMap r3 = eb.k.f2568b
            java.lang.Object r4 = r3.get(r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L7a
            long r4 = r4.longValue()
            long r4 = r0 - r4
            r6 = 3000(0xbb8, double:1.482E-320)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L7a
            goto La2
        L7a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = eb.k.f2570d
            java.util.Iterator r0 = r0.iterator()
        L87:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r0.next()
            fg.l r1 = (fg.l) r1
            r1.invoke(r8)     // Catch: java.lang.Throwable -> L87
            goto L87
        L97:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.String r1 = r8.f2556a
            java.lang.String r2 = r8.f2558c
            int r8 = r8.f2559d
            r0.dispatchOnNewFriend(r1, r2, r8)
        La2:
            return
    }

    public static boolean k(java.lang.String r3) {
            boolean r0 = og.m.t0(r3)
            r1 = 0
            if (r0 == 0) goto L8
            goto L49
        L8:
            java.lang.String r0 = "fmessage"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L11
            goto L49
        L11:
            java.lang.String r0 = "@chatroom"
            boolean r0 = og.t.W(r3, r0, r1)
            if (r0 != 0) goto L49
            java.lang.String r0 = "@openim"
            boolean r0 = og.t.W(r3, r0, r1)
            if (r0 != 0) goto L49
            java.lang.String r0 = "@im.chatroom"
            boolean r0 = og.t.W(r3, r0, r1)
            if (r0 == 0) goto L2a
            goto L49
        L2a:
            java.lang.String r0 = "gh_"
            boolean r0 = og.t.d0(r3, r0, r1)
            if (r0 == 0) goto L33
            goto L49
        L33:
            r0 = r1
        L34:
            int r2 = r3.length()
            if (r0 >= r2) goto L49
            char r2 = r3.charAt(r0)
            boolean r2 = java.lang.Character.isLetterOrDigit(r2)
            if (r2 == 0) goto L46
            r3 = 1
            return r3
        L46:
            int r0 = r0 + 1
            goto L34
        L49:
            return r1
    }

    public static boolean l(java.lang.String r2) {
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "@stranger"
            r1 = 1
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "v1_"
            boolean r0 = og.t.d0(r2, r0, r1)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "v2_"
            boolean r0 = og.t.d0(r2, r0, r1)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "v3_"
            boolean r2 = og.t.d0(r2, r0, r1)
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            return r1
    }

    public static eb.i m(java.lang.String r17, java.lang.Integer r18, java.lang.String r19, boolean r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
            r0 = r17
            boolean r1 = og.m.t0(r0)
            r2 = 0
            if (r1 == 0) goto L17
            boolean r1 = og.m.t0(r21)
            if (r1 == 0) goto L17
            boolean r1 = og.m.t0(r22)
            if (r1 == 0) goto L17
            goto L197
        L17:
            r1 = 0
            if (r20 != 0) goto L45
            if (r18 == 0) goto L21
            int r3 = r18.intValue()
            goto L22
        L21:
            r3 = r1
        L22:
            if (r3 > 0) goto L25
            goto L3f
        L25:
            r4 = r3 & 255(0xff, float:3.57E-43)
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r3
            int r6 = r3 >>> 16
            if (r6 != 0) goto L30
            goto L3f
        L30:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 == r6) goto L3e
            r6 = 10002(0x2712, float:1.4016E-41)
            if (r5 == r6) goto L3e
            if (r4 == 0) goto L3f
            if (r5 != r4) goto L3f
            r3 = r4
            goto L3f
        L3e:
            r3 = r5
        L3f:
            r4 = 37
            if (r3 == r4) goto L45
            goto L197
        L45:
            java.lang.String r3 = "encryptusername"
            java.lang.String r4 = q(r0, r3)
            java.lang.String r5 = "encryptuser"
            java.lang.String r5 = q(r0, r5)
            java.lang.String r6 = c(r0, r3)
            java.lang.String r7 = n(r0, r3)
            java.lang.String r3 = d(r21)
            boolean r3 = l(r3)
            if (r3 == 0) goto L66
            r3 = r21
            goto L67
        L66:
            r3 = r2
        L67:
            java.lang.String r10 = ""
            if (r3 != 0) goto L6d
            r8 = r10
            goto L6e
        L6d:
            r8 = r3
        L6e:
            java.lang.String r3 = d(r19)
            boolean r3 = l(r3)
            if (r3 == 0) goto L7b
            r3 = r19
            goto L7c
        L7b:
            r3 = r2
        L7c:
            if (r3 != 0) goto L80
            r9 = r10
            goto L81
        L80:
            r9 = r3
        L81:
            java.lang.String[] r3 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            java.lang.String r3 = h(r3)
            java.lang.String r3 = d(r3)
            boolean r4 = k(r3)
            if (r4 == 0) goto L94
            goto L95
        L94:
            r3 = r2
        L95:
            if (r3 != 0) goto L98
            r3 = r10
        L98:
            java.lang.String r4 = "fromusername"
            java.lang.String r11 = q(r0, r4)
            java.lang.String r5 = "username"
            java.lang.String r12 = q(r0, r5)
            java.lang.String r13 = c(r0, r4)
            java.lang.String r14 = n(r0, r4)
            java.lang.String r4 = d(r21)
            boolean r4 = l(r4)
            if (r4 != 0) goto Lb9
            r4 = r21
            goto Lba
        Lb9:
            r4 = r2
        Lba:
            if (r4 != 0) goto Lbe
            r15 = r10
            goto Lbf
        Lbe:
            r15 = r4
        Lbf:
            java.lang.String r4 = d(r19)
            boolean r4 = l(r4)
            if (r4 != 0) goto Lcc
            r4 = r19
            goto Lcd
        Lcc:
            r4 = r2
        Lcd:
            if (r4 != 0) goto Ld2
            r16 = r10
            goto Ld4
        Ld2:
            r16 = r4
        Ld4:
            java.lang.String[] r4 = new java.lang.String[]{r11, r12, r13, r14, r15, r16}
            java.lang.String r4 = h(r4)
            java.lang.String r4 = d(r4)
            boolean r5 = k(r4)
            if (r5 == 0) goto Le7
            goto Le8
        Le7:
            r4 = r2
        Le8:
            if (r4 != 0) goto Leb
            goto Lec
        Leb:
            r10 = r4
        Lec:
            java.lang.String[] r4 = new java.lang.String[]{r10, r3}
            java.lang.String r4 = h(r4)
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String r3 = h(r3)
            java.lang.String r5 = "ticket"
            java.lang.String r6 = q(r0, r5)
            java.lang.String r7 = "antispamticket"
            java.lang.String r8 = q(r0, r7)
            java.lang.String r9 = "antispam_ticket"
            java.lang.String r9 = q(r0, r9)
            java.lang.String r10 = "verifyticket"
            java.lang.String r10 = q(r0, r10)
            java.lang.String r11 = "verify_ticket"
            java.lang.String r11 = q(r0, r11)
            r12 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            java.lang.String r11 = c(r0, r5)
            r13 = r12
            java.lang.String r12 = c(r0, r7)
            java.lang.String r5 = n(r0, r5)
            java.lang.String r14 = n(r0, r7)
            r15 = r22
            r7 = r13
            r13 = r5
            java.lang.String[] r5 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15}
            java.lang.String r5 = h(r5)
            java.lang.String r5 = d(r5)
            boolean r6 = og.m.t0(r4)
            if (r6 != 0) goto L197
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L14c
            goto L197
        L14c:
            java.lang.String r2 = "scene"
            java.lang.String r6 = q(r0, r2)
            java.lang.String r7 = "scence"
            java.lang.String r7 = q(r0, r7)
            java.lang.String r8 = "sceneid"
            java.lang.String r9 = q(r0, r8)
            java.lang.String r10 = "scene_id"
            r11 = r9
            java.lang.String r9 = q(r0, r10)
            java.lang.String r12 = c(r0, r2)
            java.lang.String r2 = n(r0, r2)
            java.lang.String r8 = n(r0, r8)
            java.lang.String r13 = n(r0, r10)
            r14 = r23
            r10 = r12
            r12 = r8
            r8 = r11
            r11 = r2
            java.lang.String[] r0 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14}
            java.lang.String r0 = h(r0)
            java.lang.String r0 = d(r0)
            java.lang.Integer r0 = og.t.f0(r0)
            if (r0 == 0) goto L191
            int r1 = r0.intValue()
        L191:
            eb.i r0 = new eb.i
            r0.<init>(r1, r4, r3, r5)
            return r0
        L197:
            return r2
    }

    public static java.lang.String n(java.lang.String r3, java.lang.String r4) {
            boolean r0 = og.m.t0(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r4 = java.util.regex.Pattern.quote(r4)
            r4.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "(?:[?&]|&amp;)"
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r4 = "=([^&\\s<\"']+)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 2
            int r0 = l3.w.f(r0)
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r0)
            r4.getClass()
            java.util.regex.Matcher r4 = r4.matcher(r3)
            r4.getClass()
            r0 = 0
            og.i r3 = a7.a.b(r4, r0, r3)
            if (r3 == 0) goto L62
            java.util.List r3 = r3.a()
            r4 = 1
            java.lang.Object r3 = tf.m.w1(r4, r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L62
            java.lang.String r4 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r3, r4)     // Catch: java.lang.Throwable -> L51
            goto L58
        L51:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        L58:
            boolean r0 = r4 instanceof sf.f
            if (r0 == 0) goto L5e
            goto L5f
        L5e:
            r3 = r4
        L5f:
            java.lang.String r3 = (java.lang.String) r3
            goto L63
        L62:
            r3 = 0
        L63:
            if (r3 != 0) goto L66
            goto L67
        L66:
            r1 = r3
        L67:
            return r1
    }

    public static void o(eb.i r7, long r8) {
            java.lang.String r1 = r7.f2556a
            java.lang.String r2 = r7.f2557b
            boolean r0 = og.m.t0(r1)
            if (r0 != 0) goto L2f
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L11
            goto L2f
        L11:
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L18
            goto L2f
        L18:
            eb.j r0 = new eb.j
            java.lang.String r3 = r7.f2558c
            int r4 = r7.f2559d
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r8 = r7.f2558c
            int r7 = r7.f2559d
            java.lang.String r7 = a(r7, r1, r8)
            java.util.concurrent.ConcurrentHashMap r8 = eb.k.f2569c
            r8.put(r7, r0)
        L2f:
            return
    }

    public static java.lang.String p(int r5, java.lang.String r6, java.lang.String r7) {
            r0 = 0
            if (r6 == 0) goto Lc
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            goto Ld
        Lc:
            r6 = r0
        Ld:
            java.lang.String r1 = ""
            if (r6 != 0) goto L12
            r6 = r1
        L12:
            boolean r2 = og.m.t0(r6)
            if (r2 != 0) goto Lad
            boolean r2 = l(r6)
            if (r2 == 0) goto L20
            goto Lad
        L20:
            long r2 = java.lang.System.currentTimeMillis()
            e(r2)
            if (r7 != 0) goto L2b
            r2 = r1
            goto L2c
        L2b:
            r2 = r7
        L2c:
            java.lang.String r5 = a(r5, r6, r2)
            java.util.concurrent.ConcurrentHashMap r2 = eb.k.f2569c
            java.lang.Object r5 = r2.get(r5)
            eb.j r5 = (eb.j) r5
            if (r5 == 0) goto L43
            java.lang.String r5 = r5.f2561b
            boolean r3 = og.m.t0(r5)
            if (r3 != 0) goto L43
            return r5
        L43:
            if (r7 != 0) goto L46
            r7 = r1
        L46:
            java.util.Collection r5 = r2.values()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r5, r2)
            eb.g r5 = new eb.g
            r2 = 0
            r5.<init>(r2, r6, r7)
            ng.i r7 = new ng.i
            r2 = 1
            r7.<init>(r1, r2, r5)
            ng.h r5 = new ng.h
            r5.<init>(r7)
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L6e
            r7 = r0
            goto L9d
        L6e:
            java.lang.Object r7 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L79
            goto L9d
        L79:
            r1 = r7
            eb.j r1 = (eb.j) r1
            long r1 = r1.f2564e
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L82:
            java.lang.Object r2 = r5.next()
            r3 = r2
            eb.j r3 = (eb.j) r3
            long r3 = r3.f2564e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L97
            r7 = r2
            r1 = r3
        L97:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L82
        L9d:
            eb.j r7 = (eb.j) r7
            if (r7 == 0) goto Lad
            java.lang.String r5 = r7.f2561b
            boolean r7 = og.m.t0(r5)
            if (r7 != 0) goto Laa
            r0 = r5
        Laa:
            if (r0 == 0) goto Lad
            return r0
        Lad:
            return r6
    }

    public static java.lang.String q(java.lang.String r0, java.lang.String r1) {
            java.lang.String r0 = k8.q.c(r0, r1)
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            return r0
    }

    public final synchronized void j(r8.g r4) {
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L64
            boolean r0 = eb.k.f2571e     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto La
            monitor-exit(r3)
            return
        La:
            i8.e r0 = h.Hchat.hooks.api.core.WeChatApis.runtime()     // Catch: java.lang.Throwable -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L16
            o8.d r0 = h.Hchat.hooks.api.core.WeChatApis.g()     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r0 = move-exception
            sf.f r1 = new sf.f     // Catch: java.lang.Throwable -> L64
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L64
            r0 = r1
        L1d:
            boolean r1 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L64
            r2 = 0
            if (r1 == 0) goto L24
            r0 = r2
        L24:
            o8.d r0 = (o8.d) r0     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L3a
            boolean r1 = r0.f()     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L2f
            goto L3a
        L2f:
            r0.e()     // Catch: java.lang.Throwable -> L32
        L32:
            eb.h r1 = new eb.h     // Catch: java.lang.Throwable -> L64
            r1.<init>()     // Catch: java.lang.Throwable -> L64
            r0.g(r1)     // Catch: java.lang.Throwable -> L64
        L3a:
            k8.p r0 = h.Hchat.hooks.api.core.WeChatApis.messageObserve()     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r0 = move-exception
            sf.f r1 = new sf.f     // Catch: java.lang.Throwable -> L64
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L64
            r0 = r1
        L46:
            boolean r1 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L4c
            goto L4d
        L4c:
            r2 = r0
        L4d:
            k8.p r2 = (k8.p) r2     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L66
            boolean r0 = r2.c()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L66
            r2.b()     // Catch: java.lang.Throwable -> L5a
        L5a:
            eb.b r4 = new eb.b     // Catch: java.lang.Throwable -> L64
            r0 = 1
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L64
            r2.e(r4)     // Catch: java.lang.Throwable -> L64
            goto L74
        L64:
            r4 = move-exception
            goto L79
        L66:
            f8.c r4 = r4.f11625f     // Catch: java.lang.Throwable -> L64
            java.lang.Class<f8.g> r0 = f8.g.class
            ah.a r1 = new ah.a     // Catch: java.lang.Throwable -> L64
            r2 = 24
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L64
            r4.c(r0, r1)     // Catch: java.lang.Throwable -> L64
        L74:
            r4 = 1
            eb.k.f2571e = r4     // Catch: java.lang.Throwable -> L64
            monitor-exit(r3)
            return
        L79:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L64
            throw r4
    }
}
