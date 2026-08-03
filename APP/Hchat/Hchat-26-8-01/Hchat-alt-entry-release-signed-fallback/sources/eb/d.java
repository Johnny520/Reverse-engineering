package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eb.d f2520a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f2521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2522c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2523d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2524e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.List f2525f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.List f2526g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final og.k f2527h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final og.k f2528i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final og.k f2529j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final og.k f2530k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final og.k f2531l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final og.k f2532m = null;

    static {
            eb.d r0 = new eb.d
            r0.<init>()
            eb.d.f2520a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            eb.d.f2522c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            eb.d.f2523d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            eb.d.f2524e = r0
            java.lang.String r6 = "scan the qr code"
            java.lang.String r7 = "通过扫描"
            java.lang.String r1 = "加入了群聊"
            java.lang.String r2 = "joined the group chat"
            java.lang.String r3 = "invited"
            java.lang.String r4 = "邀请"
            java.lang.String r5 = "二维码"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            java.util.List r0 = a.a.y0(r0)
            eb.d.f2525f = r0
            java.lang.String r0 = "退出了群聊"
            java.lang.String r1 = "left the group chat"
            java.lang.String r2 = "移出了群聊"
            java.lang.String r3 = "removed from the group chat"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            eb.d.f2526g = r0
            og.k r0 = new og.k
            java.lang.String r1 = "<link\\b[^>]*\\bname=\"([^\"]+)\"[^>]*\\busername=\"([^\"]+)\""
            r2 = 0
            r0.<init>(r1, r2)
            eb.d.f2527h = r0
            og.k r0 = new og.k
            java.lang.String r1 = "<link\\b[^>]*\\busername=\"([^\"]+)\"[^>]*\\bname=\"([^\"]+)\""
            r0.<init>(r1, r2)
            eb.d.f2528i = r0
            og.k r0 = new og.k
            java.lang.String r1 = "<member\\b[^>]*\\bnickname=\"([^\"]+)\"[^>]*\\busername=\"([^\"]+)\""
            r0.<init>(r1, r2)
            eb.d.f2529j = r0
            og.k r0 = new og.k
            java.lang.String r1 = "<member\\b[^>]*\\busername=\"([^\"]+)\"[^>]*\\bnickname=\"([^\"]+)\""
            r0.<init>(r1, r2)
            eb.d.f2530k = r0
            og.k r0 = new og.k
            java.lang.String r1 = "\\busername=\"([^\"]+)\"[^>]{0,160}?\\bname=\"([^\"]+)\""
            r0.<init>(r1, r2)
            eb.d.f2531l = r0
            og.k r0 = new og.k
            java.lang.String r1 = "\\bname=\"([^\"]+)\"[^>]{0,160}?\\busername=\"([^\"]+)\""
            r0.<init>(r1, r2)
            eb.d.f2532m = r0
            return
    }

    public static java.lang.String a(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "|"
            java.lang.String r1 = wb.en.h(r1, r0, r2)
            return r1
    }

    public static java.lang.String b(java.lang.String r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto Lc
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            goto Ld
        Lc:
            r2 = r0
        Ld:
            java.lang.String r1 = ""
            if (r2 != 0) goto L12
            r2 = r1
        L12:
            if (r3 == 0) goto L1d
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            goto L1e
        L1d:
            r3 = r0
        L1e:
            if (r3 != 0) goto L21
            goto L22
        L21:
            r1 = r3
        L22:
            int r3 = r2.length()
            if (r3 != 0) goto L29
            goto L50
        L29:
            int r3 = r1.length()
            if (r3 != 0) goto L30
            goto L50
        L30:
            java.util.concurrent.ConcurrentHashMap r3 = eb.d.f2523d
            java.lang.String r2 = a(r2, r1)
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L50
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L4c
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L4c
            r3 = 1
            goto L4d
        L4c:
            r3 = 0
        L4d:
            if (r3 == 0) goto L50
            return r2
        L50:
            return r0
    }

    public static void c(java.lang.String r6, java.util.LinkedHashMap r7) {
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L8
            goto L214
        L8:
            og.k r0 = eb.d.f2527h
            ng.c r0 = og.k.c(r0, r6)
            f.i0 r1 = new f.i0
            r1.<init>(r0)
        L13:
            boolean r0 = r1.hasNext()
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r1.next()
            og.f r0 = (og.f) r0
            og.i r0 = (og.i) r0
            java.util.List r4 = r0.a()
            og.g r4 = (og.g) r4
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = d(r2)
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.util.List r0 = r0.a()
            og.g r0 = (og.g) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = d(r0)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r3 = r0.length()
            if (r3 <= 0) goto L13
            r7.put(r0, r2)
            goto L13
        L5d:
            og.k r0 = eb.d.f2528i
            ng.c r0 = og.k.c(r0, r6)
            f.i0 r1 = new f.i0
            r1.<init>(r0)
        L68:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r1.next()
            og.f r0 = (og.f) r0
            og.i r0 = (og.i) r0
            java.util.List r4 = r0.a()
            og.g r4 = (og.g) r4
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = d(r4)
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            java.util.List r0 = r0.a()
            og.g r0 = (og.g) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = d(r0)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r5 = r4.length()
            if (r5 <= 0) goto L68
            r7.put(r4, r0)
            goto L68
        Lb0:
            og.k r0 = eb.d.f2529j
            ng.c r0 = og.k.c(r0, r6)
            f.i0 r1 = new f.i0
            r1.<init>(r0)
        Lbb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L103
            java.lang.Object r0 = r1.next()
            og.f r0 = (og.f) r0
            og.i r0 = (og.i) r0
            java.util.List r4 = r0.a()
            og.g r4 = (og.g) r4
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = d(r4)
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            java.util.List r0 = r0.a()
            og.g r0 = (og.g) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = d(r0)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r5 = r0.length()
            if (r5 <= 0) goto Lbb
            r7.put(r0, r4)
            goto Lbb
        L103:
            og.k r0 = eb.d.f2530k
            ng.c r0 = og.k.c(r0, r6)
            f.i0 r1 = new f.i0
            r1.<init>(r0)
        L10e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L156
            java.lang.Object r0 = r1.next()
            og.f r0 = (og.f) r0
            og.i r0 = (og.i) r0
            java.util.List r4 = r0.a()
            og.g r4 = (og.g) r4
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = d(r4)
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            java.util.List r0 = r0.a()
            og.g r0 = (og.g) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = d(r0)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r5 = r4.length()
            if (r5 <= 0) goto L10e
            r7.put(r4, r0)
            goto L10e
        L156:
            og.k r0 = eb.d.f2531l
            ng.c r0 = og.k.c(r0, r6)
            f.i0 r1 = new f.i0
            r1.<init>(r0)
        L161:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1b5
            java.lang.Object r0 = r1.next()
            og.f r0 = (og.f) r0
            og.i r0 = (og.i) r0
            java.util.List r4 = r0.a()
            og.g r4 = (og.g) r4
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = d(r4)
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            java.util.List r0 = r0.a()
            og.g r0 = (og.g) r0
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = d(r0)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r5 = r4.length()
            if (r5 <= 0) goto L161
            int r5 = r0.length()
            if (r5 <= 0) goto L161
            boolean r5 = r7.containsKey(r4)
            if (r5 != 0) goto L161
            r7.put(r4, r0)
            goto L161
        L1b5:
            og.k r0 = eb.d.f2532m
            ng.c r6 = og.k.c(r0, r6)
            f.i0 r0 = new f.i0
            r0.<init>(r6)
        L1c0:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L214
            java.lang.Object r6 = r0.next()
            og.f r6 = (og.f) r6
            og.i r6 = (og.i) r6
            java.util.List r1 = r6.a()
            og.g r1 = (og.g) r1
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = d(r1)
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.util.List r6 = r6.a()
            og.g r6 = (og.g) r6
            java.lang.Object r6 = r6.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = d(r6)
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            int r4 = r6.length()
            if (r4 <= 0) goto L1c0
            int r4 = r1.length()
            if (r4 <= 0) goto L1c0
            boolean r4 = r7.containsKey(r6)
            if (r4 != 0) goto L1c0
            r7.put(r6, r1)
            goto L1c0
        L214:
            return
    }

    public static java.lang.String d(java.lang.String r3) {
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

    public static void e(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            java.lang.CharSequence r10 = og.m.R0(r10)
            java.lang.String r10 = r10.toString()
            int r0 = r10.length()
            if (r0 != 0) goto Lf
            goto L4c
        Lf:
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r2 = eb.d.f2524e
            int r3 = r2.size()
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L1e
            goto L32
        L1e:
            java.util.Set r3 = r2.entrySet()
            ca.c r4 = new ca.c
            r5 = 3
            r4.<init>(r0, r5)
            be.i r5 = new be.i
            r6 = 9
            r5.<init>(r4, r6)
            r3.removeIf(r5)
        L32:
            java.lang.String r3 = "|"
            java.lang.String r3 = bc.e.v(r8, r3, r9, r3, r10)
            java.lang.Object r4 = r2.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L4d
            long r4 = r4.longValue()
            long r4 = r0 - r4
            r6 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L4d
        L4c:
            return
        L4d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r0.dispatchOnMemberChange(r8, r9, r10, r11)
            return
    }

    public static java.lang.String f(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = b(r2, r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            g8.d r0 = j8.b.f()
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r2 = r0.h(r2, r3)
            if (r2 == 0) goto L1b
            boolean r0 = og.m.t0(r2)
            if (r0 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L1f
            return r2
        L1f:
            g8.i r2 = wb.en.c()
            if (r2 == 0) goto L32
            java.lang.String r2 = r2.r(r3)
            if (r2 == 0) goto L32
            boolean r0 = og.m.t0(r2)
            if (r0 != 0) goto L32
            r1 = r2
        L32:
            if (r1 == 0) goto L35
            return r1
        L35:
            return r3
    }

    public static void g() {
            g8.d r0 = j8.b.f()
            if (r0 == 0) goto L61
            java.util.ArrayList r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            h.Hchat.hooks.api.model.WeChatChatroom r1 = (h.Hchat.hooks.api.model.WeChatChatroom) r1
            java.lang.String r2 = r1.chatroomId
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            int r3 = r2.length()
            if (r3 != 0) goto L2b
            goto Le
        L2b:
            java.util.List<java.lang.String> r1 = r1.memberIds
            dg.n r1 = tf.m.m1(r1)
            e9.h r3 = new e9.h
            r4 = 9
            r3.<init>(r4)
            ng.t r1 = ng.m.W(r1, r3)
            e9.h r3 = new e9.h
            r4 = 10
            r3.<init>(r4)
            ng.i r4 = new ng.i
            r5 = 1
            r4.<init>(r1, r5, r3)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            ng.m.a0(r4, r1)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L58
            goto Le
        L58:
            java.util.concurrent.ConcurrentHashMap r3 = eb.d.f2522c
            r3.putIfAbsent(r2, r1)
            h(r2, r1)
            goto Le
        L61:
            return
    }

    public static void h(java.lang.String r6, java.util.LinkedHashSet r7) {
            g8.i r0 = wb.en.c()
            r1 = 0
            if (r0 == 0) goto Lc
            java.util.LinkedHashMap r0 = r0.w(r6)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L11
            tf.u r0 = tf.u.f13168g
        L11:
            java.util.Iterator r7 = r7.iterator()
        L15:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r7.next()
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
            java.lang.String r4 = a(r6, r2)
            java.util.concurrent.ConcurrentHashMap r5 = eb.d.f2523d
            r5.remove(r4)
            int r4 = r3.length()
            if (r4 <= 0) goto L15
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L15
            java.lang.String r2 = a(r6, r2)
            r5.put(r2, r3)
            goto L15
        L54:
            return
    }
}
