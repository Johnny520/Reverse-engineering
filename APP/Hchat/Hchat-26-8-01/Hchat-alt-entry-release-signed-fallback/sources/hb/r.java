package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f5455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f5456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f5457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f5458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f5459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f5460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f5461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f5462i;

    public r(hb.r r10, ud.a r11) {
            r9 = this;
            r0 = 3
            r9.f5454a = r0
            java.lang.Object r0 = r10.f5455b
            r2 = r0
            ud.r r2 = (ud.r) r2
            java.lang.Object r0 = r10.f5456c
            r3 = r0
            yd.b r3 = (yd.b) r3
            java.lang.Object r0 = r10.f5457d
            r6 = r0
            ze.c r6 = (ze.c) r6
            java.lang.Object r0 = r10.f5460g
            r7 = r0
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r10 = r10.f5461h
            r8 = r10
            java.util.List r8 = (java.util.List) r8
            r5 = 0
            r1 = r9
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public r(r8.g r2, ab.b r3) {
            r1 = this;
            r0 = 0
            r1.f5454a = r0
            r2.getClass()
            r1.<init>()
            r1.f5455b = r2
            r1.f5456c = r3
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r1.f5457d = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f5458e = r2
            java.lang.String r2 = ""
            r1.f5460g = r2
            tf.t r2 = tf.t.f13167g
            r1.f5461h = r2
            return
    }

    public r(r8.g r2, ia.t r3) {
            r1 = this;
            r0 = 2
            r1.f5454a = r0
            r2.getClass()
            r1.<init>()
            r1.f5455b = r3
            android.content.Context r2 = r2.f11620a
            java.lang.String r3 = "Hchat_group_rename_monitor_config"
            android.content.SharedPreferences r3 = ub.b.c(r2, r3)
            r1.f5456c = r3
            bb.l r3 = new bb.l
            r3.<init>(r2)
            r1.f5457d = r3
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f5458e = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f5459f = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f5460g = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.f5461h = r2
            og.k r2 = new og.k
            java.lang.String r3 = "\\[AtWx=([^\\]]+)]"
            r2.<init>(r3)
            r1.f5462i = r2
            return
    }

    public r(ud.r r2, xd.d r3) {
            r1 = this;
            r0 = 1
            r1.f5454a = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5457d = r0
            r1.f5455b = r2
            r1.f5456c = r3
            return
    }

    public r(ud.r r10, yd.b r11, ud.a r12, ud.a r13) {
            r9 = this;
            r0 = 3
            r9.f5454a = r0
            ze.c r6 = new ze.c
            r6.<init>(r10)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public r(ud.r r2, yd.b r3, ud.a r4, ud.a r5, ze.c r6, java.util.Set r7, java.util.List r8) {
            r1 = this;
            r0 = 3
            r1.f5454a = r0
            r1.<init>()
            r1.f5455b = r2
            r1.f5456c = r3
            r1.f5458e = r4
            r1.f5459f = r5
            r1.f5457d = r6
            r1.f5460g = r7
            r1.f5461h = r8
            return
    }

    public static java.lang.String b(java.lang.String r3, q9.f r4) {
            java.lang.String r0 = r4.f10750b
            java.lang.String r1 = "%userName%"
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r1, r0, r2)
            java.lang.String r0 = "%groupNickname%"
            java.lang.String r1 = r4.f10751c
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%oldGroupNickname%"
            java.lang.String r1 = r4.f10752d
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%newGroupNickname%"
            java.lang.String r1 = r4.f10753e
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%userWxid%"
            java.lang.String r1 = r4.f10749a
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%realNameTail%"
            java.lang.String r1 = r4.f10754f
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%gender%"
            java.lang.String r1 = r4.f10755g
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%region%"
            java.lang.String r1 = r4.f10756h
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%groupName%"
            java.lang.String r1 = r4.f10757i
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "%time%"
            java.lang.String r4 = r4.f10758j
            java.lang.String r3 = og.t.a0(r3, r0, r4, r2)
            return r3
    }

    public static java.util.Map f(java.lang.String r8, java.util.LinkedHashSet r9, b.e r10) {
            g8.i r0 = wb.en.c()
            r1 = 0
            if (r0 == 0) goto Lc
            java.util.LinkedHashMap r8 = r0.w(r8)
            goto Ld
        Lc:
            r8 = r1
        Ld:
            tf.u r0 = tf.u.f13168g
            if (r8 != 0) goto L12
            r8 = r0
        L12:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r3 = r9.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r8.containsKey(r4)
            if (r5 == 0) goto L1b
            java.lang.Object r5 = r8.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = n(r5, r4)
            r2.put(r4, r5)
            goto L1b
        L3b:
            if (r10 == 0) goto L42
            java.lang.Object r8 = r10.f333i
            h.Hchat.hooks.api.model.WeChatChatroom r8 = (h.Hchat.hooks.api.model.WeChatChatroom) r8
            goto L43
        L42:
            r8 = r1
        L43:
            if (r8 == 0) goto Ld4
            java.util.List<java.lang.String> r10 = r8.memberIds
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto Ld4
            java.lang.String r10 = r8.rawDisplayNames
            java.util.List<java.lang.String> r3 = r8.memberIds
            int r3 = r3.size()
            boolean r4 = og.m.t0(r10)
            if (r4 == 0) goto L5e
            tf.t r10 = tf.t.f13167g
            goto L92
        L5e:
            java.lang.String r4 = "\n"
            java.lang.String r5 = ";"
            java.lang.String r6 = "\u0001"
            java.lang.String r7 = "\u0002"
            java.lang.String[] r4 = new java.lang.String[]{r6, r7, r4, r5}
            java.util.List r4 = a.a.y0(r4)
            java.util.Iterator r4 = r4.iterator()
        L72:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8e
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.util.List r5 = og.m.G0(r10, r5)
            int r6 = r5.size()
            if (r6 != r3) goto L72
            r10 = r5
            goto L92
        L8e:
            java.util.List r10 = a.a.x0(r10)
        L92:
            int r3 = r10.size()
            java.util.List<java.lang.String> r4 = r8.memberIds
            int r4 = r4.size()
            if (r3 != r4) goto Ld4
            java.util.List<java.lang.String> r8 = r8.memberIds
            java.util.Iterator r8 = r8.iterator()
            r3 = 0
        La5:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto Ld4
            java.lang.Object r4 = r8.next()
            int r5 = r3 + 1
            if (r3 < 0) goto Ld0
            java.lang.String r4 = (java.lang.String) r4
            boolean r6 = r9.contains(r4)
            if (r6 == 0) goto Lce
            boolean r6 = r2.containsKey(r4)
            if (r6 != 0) goto Lce
            java.lang.Object r3 = r10.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = n(r3, r4)
            r2.put(r4, r3)
        Lce:
            r3 = r5
            goto La5
        Ld0:
            a.a.Q0()
            throw r1
        Ld4:
            java.util.Set r8 = r2.keySet()
            boolean r8 = r8.containsAll(r9)
            if (r8 == 0) goto Ldf
            r1 = r2
        Ldf:
            if (r1 != 0) goto Le2
            return r0
        Le2:
            return r1
    }

    public static java.lang.String h(java.lang.String r3) {
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

    public static java.lang.String i(java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L19
            r3 = r5[r2]
            if (r3 == 0) goto L12
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L10
            goto L12
        L10:
            r4 = r1
            goto L13
        L12:
            r4 = 1
        L13:
            if (r4 != 0) goto L16
            goto L1a
        L16:
            int r2 = r2 + 1
            goto L3
        L19:
            r3 = 0
        L1a:
            if (r3 != 0) goto L1f
            java.lang.String r5 = ""
            return r5
        L1f:
            return r3
    }

    public static hb.r l(hb.r r8) {
            hb.r r0 = new hb.r
            java.lang.Object r1 = r8.f5455b
            ud.r r1 = (ud.r) r1
            java.lang.Object r2 = r8.f5456c
            yd.b r2 = (yd.b) r2
            yd.b r2 = yd.b.K(r2)
            java.lang.Object r3 = r8.f5459f
            ud.a r3 = (ud.a) r3
            java.lang.Object r4 = r8.f5458e
            ud.a r4 = (ud.a) r4
            java.lang.Object r5 = r8.f5457d
            ze.c r5 = (ze.c) r5
            java.lang.Object r6 = r8.f5460g
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r8 = r8.f5461h
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static java.lang.String n(java.lang.String r2, java.lang.String r3) {
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
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L19
            r0 = r2
        L19:
            if (r0 != 0) goto L1c
            return r1
        L1c:
            return r0
    }

    public static java.lang.String o(java.lang.String r3) {
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

    public static java.util.Set t(java.lang.String r3) {
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x0052: FILL_ARRAY_DATA , data: [124, 44} // fill-array
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
            java.util.Set r3 = tf.m.U1(r3)
            return r3
    }

    public void a(hb.q r4, int r5, long r6) {
            r3 = this;
            java.lang.Object r0 = r3.f5457d
            android.os.Handler r0 = (android.os.Handler) r0
            java.lang.String r1 = ""
            r3.f5460g = r1
            tf.t r1 = tf.t.f13167g
            r3.f5461h = r1
            java.lang.Object r1 = r3.f5462i
            hb.o r1 = (hb.o) r1
            if (r1 == 0) goto L15
            r0.removeCallbacks(r1)
        L15:
            r1 = 0
            r3.f5462i = r1
            int r1 = r4.f5449f
            java.util.List r2 = r4.f5446c
            int r1 = r1 + r5
            int r5 = r2.size()
            if (r1 <= r5) goto L24
            r1 = r5
        L24:
            r4.f5449f = r1
            int r5 = r2.size()
            if (r1 < r5) goto L30
            r3.e(r4)
            return
        L30:
            hb.n r5 = new hb.n
            r1 = 0
            r5.<init>(r3, r4, r1)
            r0.postDelayed(r5, r6)
            return
    }

    public java.lang.String c(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f5456c
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r5.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "group_rename_prompt_type"
            r1.append(r2)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "global"
            java.lang.String r1 = r0.getString(r1, r3)
            if (r1 == 0) goto L26
            goto L27
        L26:
            r1 = r3
        L27:
            boolean r1 = r1.equals(r3)
            java.lang.String r3 = "group_rename_both_order"
            if (r1 == 0) goto L30
            goto L34
        L30:
            java.lang.String r3 = wb.en.h(r3, r2, r5)
        L34:
            java.lang.String r5 = "text_first"
            java.lang.String r0 = r0.getString(r3, r5)
            if (r0 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r5
        L3e:
            java.lang.String r1 = "card_first"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            r5 = r1
        L47:
            return r5
    }

    public java.lang.String d(java.lang.String r12, q9.d r13) {
            r11 = this;
            q9.f r12 = r11.r(r12, r13)
            java.lang.Object r13 = r11.f5456c
            android.content.SharedPreferences r13 = (android.content.SharedPreferences) r13
            java.lang.String r0 = "group_rename_notice_text"
            java.lang.String r1 = "%oldGroupNickname% 改名为 %newGroupNickname%(%userWxid%)"
            java.lang.String r13 = r13.getString(r0, r1)
            if (r13 == 0) goto L13
            r1 = r13
        L13:
            java.lang.String r13 = r12.f10750b
            sf.e r2 = new sf.e
            java.lang.String r0 = "%userName%"
            r2.<init>(r0, r13)
            java.lang.String r13 = r12.f10751c
            sf.e r3 = new sf.e
            java.lang.String r0 = "%groupNickname%"
            r3.<init>(r0, r13)
            java.lang.String r13 = r12.f10752d
            sf.e r4 = new sf.e
            java.lang.String r0 = "%oldGroupNickname%"
            r4.<init>(r0, r13)
            java.lang.String r13 = r12.f10753e
            sf.e r5 = new sf.e
            java.lang.String r0 = "%newGroupNickname%"
            r5.<init>(r0, r13)
            java.lang.String r13 = r12.f10754f
            sf.e r6 = new sf.e
            java.lang.String r0 = "%realNameTail%"
            r6.<init>(r0, r13)
            java.lang.String r13 = r12.f10755g
            sf.e r7 = new sf.e
            java.lang.String r0 = "%gender%"
            r7.<init>(r0, r13)
            java.lang.String r13 = r12.f10756h
            sf.e r8 = new sf.e
            java.lang.String r0 = "%region%"
            r8.<init>(r0, r13)
            java.lang.String r13 = r12.f10757i
            sf.e r9 = new sf.e
            java.lang.String r0 = "%groupName%"
            r9.<init>(r0, r13)
            java.lang.String r13 = r12.f10758j
            sf.e r10 = new sf.e
            java.lang.String r0 = "%time%"
            r10.<init>(r0, r13)
            sf.e[] r13 = new sf.e[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r13 = tf.y.b0(r13)
            java.util.Set r0 = r13.keySet()
            java.lang.String r2 = "%userWxid%"
            java.util.LinkedHashSet r0 = tf.d0.V(r0, r2)
            og.k r2 = new og.k
            a9.h r3 = new a9.h
            r4 = 27
            r3.<init>(r4)
            java.util.List r5 = tf.m.K1(r0, r3)
            o9.e r9 = new o9.e
            r0 = 21
            r9.<init>(r0)
            r10 = 30
            java.lang.String r6 = "|"
            r7 = 0
            r8 = 0
            java.lang.String r0 = tf.m.A1(r5, r6, r7, r8, r9, r10)
            r2.<init>(r0)
            b0.s r0 = new b0.s
            r3 = 14
            r0.<init>(r11, r12, r13, r3)
            java.lang.String r12 = r2.e(r1, r0)
            return r12
    }

    public void e(hb.q r5) {
            r4 = this;
            java.lang.Object r0 = r4.f5457d
            android.os.Handler r0 = (android.os.Handler) r0
            java.lang.String r1 = ""
            r4.f5460g = r1
            tf.t r1 = tf.t.f13167g
            r4.f5461h = r1
            java.lang.Object r1 = r4.f5462i
            hb.o r1 = (hb.o) r1
            if (r1 == 0) goto L15
            r0.removeCallbacks(r1)
        L15:
            r1 = 0
            r4.f5462i = r1
            int r2 = r5.f5448e
            int r2 = r2 + 1
            r5.f5448e = r2
            r2 = 0
            r5.f5449f = r2
            r2 = -1
            r5.f5452i = r2
            r5.f5453j = r1
            hb.n r1 = new hb.n
            r2 = 2
            r1.<init>(r4, r5, r2)
            r2 = 350(0x15e, double:1.73E-321)
            r0.postDelayed(r1, r2)
            return
    }

    public hb.s g(java.util.List r6, java.util.List r7, fg.q r8) {
            r5 = this;
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L8
            goto Lb4
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            r3 = r2
            hb.t r3 = (hb.t) r3
            k8.t r4 = r3.f5470g
            if (r4 != 0) goto L2d
            java.lang.String r3 = r3.f5471h
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto L2b
            goto L2d
        L2b:
            r3 = 0
            goto L2e
        L2d:
            r3 = 1
        L2e:
            if (r3 == 0) goto L11
            r0.add(r2)
            goto L11
        L34:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r7)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L41:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            j8.b.r(r2, r1)
            goto L41
        L51:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L5a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto L5a
            r7.add(r2)
            goto L5a
        L71:
            java.util.Set r7 = tf.m.T1(r7)
            java.util.List r7 = tf.m.P1(r7)
            int r1 = r0.size()
            int r6 = r6.size()
            if (r1 != r6) goto Lb4
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L8a
            goto Lb4
        L8a:
            hb.q r6 = new hb.q
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r6.<init>(r1, r0, r7, r8)
            java.lang.Object r7 = r5.f5457d
            android.os.Handler r7 = (android.os.Handler) r7
            hb.n r8 = new hb.n
            r0 = 1
            r8.<init>(r5, r6, r0)
            r7.post(r8)
            hb.s r7 = new hb.s
            aa.c r8 = new aa.c
            r0 = 14
            r8.<init>(r5, r0, r6)
            r7.<init>(r8)
            return r7
        Lb4:
            r6 = 0
            return r6
    }

    public ud.a j() {
            r3 = this;
            java.lang.Object r0 = r3.f5457d
            ze.c r0 = (ze.c) r0
            ud.r r1 = r0.f22679g
            java.util.List r1 = r1.f13732z
            java.util.BitSet r0 = r0.f22680h
            r2 = 0
            int r0 = r0.nextSetBit(r2)
            java.lang.Object r0 = r1.get(r0)
            ud.a r0 = (ud.a) r0
            return r0
    }

    public java.lang.String k(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.Object r0 = r3.f5456c
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r4.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 0
            java.lang.String r4 = r0.getString(r4, r1)
            if (r4 == 0) goto L23
            return r4
        L23:
            java.lang.String r4 = r0.getString(r5, r6)
            if (r4 == 0) goto L2a
            return r4
        L2a:
            return r6
    }

    public void m(hb.r... r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L2e
            r2 = r6[r1]
            java.lang.Object r3 = r5.f5457d
            ze.c r3 = (ze.c) r3
            java.lang.Object r4 = r2.f5457d
            ze.c r4 = (ze.c) r4
            java.util.BitSet r3 = r3.f22680h
            java.util.BitSet r4 = r4.f22680h
            r3.or(r4)
            java.lang.Object r3 = r5.f5460g
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r4 = r2.f5460g
            java.util.Set r4 = (java.util.Set) r4
            r3.addAll(r4)
            java.lang.Object r2 = r2.f5461h
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r5.f5461h
            java.util.List r3 = (java.util.List) r3
            r3.addAll(r2)
            int r1 = r1 + 1
            goto L2
        L2e:
            return
    }

    public void p() {
            r6 = this;
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L79
            r0.getClass()     // Catch: java.lang.Throwable -> L79
            g8.d r0 = h.Hchat.hooks.api.core.WeChatApis.c()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L93
            java.util.ArrayList r0 = r0.g()     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L79
        L15:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L79
            h.Hchat.hooks.api.model.WeChatChatroom r1 = (h.Hchat.hooks.api.model.WeChatChatroom) r1     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r1.chatroomId     // Catch: java.lang.Throwable -> L79
            java.lang.CharSequence r2 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L79
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L32
            goto L15
        L32:
            java.util.List<java.lang.String> r1 = r1.memberIds     // Catch: java.lang.Throwable -> L79
            dg.n r1 = tf.m.m1(r1)     // Catch: java.lang.Throwable -> L79
            o9.e r3 = new o9.e     // Catch: java.lang.Throwable -> L79
            r4 = 17
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L79
            ng.t r1 = ng.m.W(r1, r3)     // Catch: java.lang.Throwable -> L79
            o9.e r3 = new o9.e     // Catch: java.lang.Throwable -> L79
            r4 = 18
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L79
            ng.i r4 = new ng.i     // Catch: java.lang.Throwable -> L79
            r5 = 1
            r4.<init>(r1, r5, r3)     // Catch: java.lang.Throwable -> L79
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L79
            r1.<init>()     // Catch: java.lang.Throwable -> L79
            ng.m.a0(r4, r1)     // Catch: java.lang.Throwable -> L79
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L5f
            goto L15
        L5f:
            java.lang.Object r3 = r6.f5458e     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L79
            r3.putIfAbsent(r2, r1)     // Catch: java.lang.Throwable -> L79
            r3 = 0
            java.util.Map r1 = f(r2, r1, r3)     // Catch: java.lang.Throwable -> L79
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L15
            java.lang.Object r3 = r6.f5459f     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch: java.lang.Throwable -> L79
            r3.putIfAbsent(r2, r1)     // Catch: java.lang.Throwable -> L79
            goto L15
        L79:
            r0 = move-exception
            goto L7e
        L7b:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L79
            goto L84
        L7e:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L84:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L93
            java.lang.Object r1 = r6.f5455b
            ia.t r1 = (ia.t) r1
            java.lang.String r2 = "预加载群成员改名快照失败"
            r1.invoke(r2, r0)
        L93:
            return
    }

    public q9.g q(java.lang.String r7) {
            r6 = this;
            java.lang.Object r0 = r6.f5456c
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = "group_rename_template_bindings"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.getString(r1, r2)
            if (r1 != 0) goto Lf
            r1 = r2
        Lf:
            java.util.List r1 = x6.d.S(r1)
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r1.next()
            r5 = r3
            q9.h r5 = (q9.h) r5
            java.lang.String r5 = r5.f10768a
            boolean r5 = gg.l.a(r5, r7)
            if (r5 == 0) goto L17
            goto L2f
        L2e:
            r3 = r4
        L2f:
            q9.h r3 = (q9.h) r3
            if (r3 == 0) goto L5f
            java.lang.String r7 = "group_rename_templates"
            java.lang.String r7 = r0.getString(r7, r2)
            if (r7 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r7
        L3d:
            java.util.List r7 = x6.d.U(r2)
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r7.next()
            r1 = r0
            q9.g r1 = (q9.g) r1
            java.lang.String r1 = r1.f10759a
            java.lang.String r2 = r3.f10770c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L45
            r4 = r0
        L5d:
            q9.g r4 = (q9.g) r4
        L5f:
            return r4
    }

    public q9.f r(java.lang.String r21, q9.d r22) {
            r20 = this;
            r0 = r21
            r1 = r20
            r2 = r22
            java.lang.Object r3 = r1.f5457d
            bb.l r3 = (bb.l) r3
            g8.i r4 = wb.en.c()
            r5 = 0
            if (r4 == 0) goto L18
            java.lang.String r6 = r2.f10744a
            h.Hchat.hooks.api.model.WeChatContact r6 = r4.n(r6)
            goto L19
        L18:
            r6 = r5
        L19:
            if (r6 == 0) goto L1e
            java.lang.String r7 = r6.nickname
            goto L1f
        L1e:
            r7 = r5
        L1f:
            if (r6 == 0) goto L24
            java.lang.String r6 = r6.remarkName
            goto L25
        L24:
            r6 = r5
        L25:
            java.lang.String r8 = r2.f10744a
            java.lang.String[] r6 = new java.lang.String[]{r7, r6, r8}
            java.lang.String r11 = i(r6)
            java.lang.String r6 = r2.f10745b
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L39
            r13 = r11
            goto L3a
        L39:
            r13 = r6
        L3a:
            java.lang.String r6 = r2.f10746c
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L44
            r12 = r11
            goto L45
        L44:
            r12 = r6
        L45:
            java.lang.String r10 = r2.f10744a
            java.lang.String r15 = r3.c(r10)
            if (r4 == 0) goto L52
            int r2 = r4.s(r8)
            goto L53
        L52:
            r2 = 0
        L53:
            java.lang.String r16 = r3.d(r2)
            if (r4 == 0) goto L72
            java.lang.String r2 = r4.z(r8)
            if (r2 == 0) goto L72
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L72
            java.lang.String r3 = "\\s+"
            java.lang.String r6 = " "
            java.lang.String r2 = j8.b.h(r3, r2, r6)
            goto L73
        L72:
            r2 = r5
        L73:
            if (r2 != 0) goto L77
            java.lang.String r2 = ""
        L77:
            r17 = r2
            if (r4 == 0) goto L9a
            h.Hchat.hooks.api.model.WeChatContact r2 = r4.n(r0)
            if (r2 == 0) goto L9a
            java.lang.String r2 = r2.displayName()
            if (r2 == 0) goto L9a
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L94
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L94
            goto L95
        L94:
            r2 = r5
        L95:
            if (r2 == 0) goto L9a
            r18 = r2
            goto Lb4
        L9a:
            g8.d r2 = j8.b.f()
            if (r2 == 0) goto Lad
            java.lang.String r2 = r2.f(r0)
            if (r2 == 0) goto Lad
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto Lad
            r5 = r2
        Lad:
            if (r5 == 0) goto Lb2
            r18 = r5
            goto Lb4
        Lb2:
            r18 = r0
        Lb4:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r3 = java.util.Locale.getDefault()
            r0.<init>(r2, r3)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r19 = r0.format(r2)
            r19.getClass()
            q9.f r9 = new q9.f
            r14 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r9
    }

    public void s(hb.q r22) {
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.Object r0 = r1.f5455b
            r8.g r0 = (r8.g) r0
            java.lang.Object r3 = r1.f5456c
            ab.b r3 = (ab.b) r3
            java.lang.Object r4 = r1.f5459f
            hb.q r4 = (hb.q) r4
            if (r4 == r2) goto L14
            goto L3e9
        L14:
            int r4 = r2.f5448e
            java.util.ArrayList r5 = r2.f5445b
            java.util.List r6 = r2.f5446c
            int r7 = r5.size()
            java.lang.String r8 = ""
            r9 = 0
            if (r4 < r7) goto L40
            fg.q r0 = r2.f5447d
            int r3 = r2.f5450g
            int r2 = r2.f5451h
            r1.f5459f = r9
            r1.f5460g = r8
            if (r0 == 0) goto L3c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r0.b(r3, r2, r4)
        L3c:
            r1.u()
            return
        L40:
            int r4 = r2.f5448e
            java.lang.Object r4 = r5.get(r4)
            hb.t r4 = (hb.t) r4
            int r5 = r2.f5452i
            int r7 = r2.f5448e
            r11 = 43
            r12 = 62
            r13 = 34
            r15 = 1
            if (r5 != r7) goto L59
            hb.p r5 = r2.f5453j
            goto L1f0
        L59:
            int r5 = r4.f5465b
            k8.t r7 = r4.f5470g
            r16 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r16
            k8.g r16 = p.a.q()
            if (r16 == 0) goto L69
            goto L6d
        L69:
            k8.g r16 = h.Hchat.hooks.api.core.WeChatApis.messages()
        L6d:
            j8.p r17 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r5 == r11) goto L78
            if (r5 == r12) goto L78
        L75:
            r9 = r8
            goto L12e
        L78:
            if (r7 == 0) goto L7d
            java.lang.String r9 = r7.f7477f
            goto L7e
        L7d:
            r9 = 0
        L7e:
            if (r9 != 0) goto L81
            r9 = r8
        L81:
            java.lang.String r14 = r4.f5468e
            java.lang.String[] r9 = new java.lang.String[]{r9, r14}
            java.util.List r9 = a.a.y0(r9)
            java.util.ArrayList r14 = new java.util.ArrayList
            int r10 = tf.n.e1(r9)
            r14.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L98:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La8
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            j8.b.r(r10, r14)
            goto L98
        La8:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r14.iterator()
        Lb1:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto Lc9
            java.lang.Object r14 = r10.next()
            r19 = r14
            java.lang.String r19 = (java.lang.String) r19
            boolean r19 = og.m.t0(r19)
            if (r19 != 0) goto Lb1
            r9.add(r14)
            goto Lb1
        Lc9:
            java.util.Set r9 = tf.m.T1(r9)
            java.util.List r9 = tf.m.P1(r9)
            java.util.Iterator r10 = r9.iterator()
        Ld5:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto Lea
            java.lang.Object r14 = r10.next()
            r19 = r14
            java.lang.String r19 = (java.lang.String) r19
            boolean r19 = eh.a.y(r19)
            if (r19 == 0) goto Ld5
            goto Leb
        Lea:
            r14 = 0
        Leb:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto Lfc
            java.io.File r9 = new java.io.File
            r9.<init>(r14)
            java.lang.String r9 = r9.getAbsolutePath()
            r9.getClass()
            goto L12e
        Lfc:
            j8.p r10 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r10 == 0) goto L75
            bb.b r10 = r10.f6817c
            if (r10 == 0) goto L75
            java.util.Iterator r9 = r9.iterator()
        L10a:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L129
            java.lang.Object r14 = r9.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r14 = r10.o(r14)
            r14.getClass()
            boolean r19 = og.m.t0(r14)
            if (r19 != 0) goto L124
            goto L125
        L124:
            r14 = 0
        L125:
            if (r14 == 0) goto L10a
            r9 = r14
            goto L12a
        L129:
            r9 = 0
        L12a:
            if (r9 != 0) goto L12e
            goto L75
        L12e:
            r10 = 47
            if (r5 == r13) goto L192
            if (r5 == r11) goto L194
            if (r5 == r10) goto L13a
            if (r5 == r12) goto L194
            r9 = r8
            goto L194
        L13a:
            if (r7 == 0) goto L13f
            java.lang.String r9 = r7.f7477f
            goto L140
        L13f:
            r9 = 0
        L140:
            if (r9 != 0) goto L143
            r9 = r8
        L143:
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            boolean r14 = eh.a.y(r9)
            if (r14 != 0) goto L194
            java.lang.String r14 = "[0-9a-fA-F]{32}"
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r14)
            r14.getClass()
            r9.getClass()
            java.util.regex.Matcher r14 = r14.matcher(r9)
            boolean r14 = r14.matches()
            if (r14 == 0) goto L168
            goto L194
        L168:
            if (r7 == 0) goto L16d
            java.lang.String r9 = r7.f7474c
            goto L16e
        L16d:
            r9 = 0
        L16e:
            if (r9 != 0) goto L171
            r9 = r8
        L171:
            boolean r14 = og.m.t0(r9)
            if (r14 == 0) goto L179
            java.lang.String r9 = r4.f5467d
        L179:
            l8.d r14 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r14.getClass()
            java.lang.String r14 = "md5"
            java.lang.String r19 = l8.d.m(r9, r14)
            boolean r20 = og.m.t0(r19)
            if (r20 == 0) goto L18f
            java.lang.String r9 = l8.d.o(r9, r14)
            goto L194
        L18f:
            r9 = r19
            goto L194
        L192:
            java.lang.String r9 = r4.f5471h
        L194:
            if (r5 == r15) goto L1cf
            if (r5 == r13) goto L1be
            if (r5 == r12) goto L1be
            r14 = 42
            if (r5 == r14) goto L1cf
            if (r5 == r11) goto L1be
            switch(r5) {
                case 47: goto L1be;
                case 48: goto L1cf;
                case 49: goto L1a5;
                default: goto L1a3;
            }
        L1a3:
            r7 = 0
            goto L1e0
        L1a5:
            boolean r10 = r4.a()
            if (r10 != 0) goto L1a3
            if (r16 == 0) goto L1a3
            if (r7 == 0) goto L1b2
            java.lang.String r7 = r7.f7474c
            goto L1b3
        L1b2:
            r7 = 0
        L1b3:
            if (r7 == 0) goto L1a3
            boolean r7 = og.m.t0(r7)
            if (r7 == 0) goto L1bc
            goto L1a3
        L1bc:
            r7 = r15
            goto L1e0
        L1be:
            if (r17 == 0) goto L1a3
            boolean r7 = og.m.t0(r9)
            if (r7 != 0) goto L1a3
            if (r5 == r10) goto L1bc
            boolean r7 = eh.a.y(r9)
            if (r7 == 0) goto L1a3
            goto L1bc
        L1cf:
            if (r16 == 0) goto L1a3
            if (r7 == 0) goto L1d6
            java.lang.String r7 = r7.f7474c
            goto L1d7
        L1d6:
            r7 = 0
        L1d7:
            if (r7 == 0) goto L1a3
            boolean r7 = og.m.t0(r7)
            if (r7 == 0) goto L1bc
            goto L1a3
        L1e0:
            int r10 = r2.f5448e
            r2.f5452i = r10
            if (r7 == 0) goto L1ed
            hb.p r7 = new hb.p
            r7.<init>(r5, r9)
            r5 = r7
            goto L1ee
        L1ed:
            r5 = 0
        L1ee:
            r2.f5453j = r5
        L1f0:
            if (r5 == 0) goto L2d9
            int r7 = r5.f5442a
            int r0 = r2.f5449f
            int r9 = r6.size()
            if (r0 < r9) goto L200
            r21.e(r22)
            return
        L200:
            int r0 = r2.f5449f
            java.lang.Object r0 = r6.get(r0)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()     // Catch: java.lang.Throwable -> L228
            r0.getClass()     // Catch: java.lang.Throwable -> L228
            k8.g r0 = h.Hchat.hooks.api.core.WeChatApis.j()     // Catch: java.lang.Throwable -> L228
            if (r0 == 0) goto L217
            goto L21b
        L217:
            k8.g r0 = h.Hchat.hooks.api.core.WeChatApis.messages()     // Catch: java.lang.Throwable -> L228
        L21b:
            j8.p r9 = h.Hchat.hooks.api.core.WeChatApis.media()     // Catch: java.lang.Throwable -> L228
            k8.t r10 = r4.f5470g     // Catch: java.lang.Throwable -> L228
            if (r10 == 0) goto L22b
            java.lang.String r10 = r10.f7474c     // Catch: java.lang.Throwable -> L228
            r18 = r10
            goto L22d
        L228:
            r0 = move-exception
            goto L29a
        L22b:
            r18 = 0
        L22d:
            if (r18 != 0) goto L230
            goto L232
        L230:
            r8 = r18
        L232:
            java.lang.String r5 = r5.f5443b
            if (r7 == r15) goto L28c
            if (r7 == r13) goto L27d
            if (r7 == r12) goto L270
            r14 = 42
            if (r7 == r14) goto L265
            if (r7 == r11) goto L270
            switch(r7) {
                case 47: goto L25a;
                case 48: goto L24f;
                case 49: goto L245;
                default: goto L243;
            }
        L243:
            r14 = 0
            goto L295
        L245:
            if (r0 == 0) goto L243
            boolean r0 = r0.z(r6, r8)     // Catch: java.lang.Throwable -> L228
            if (r0 != r15) goto L243
        L24d:
            r14 = r15
            goto L295
        L24f:
            if (r0 == 0) goto L243
            r4 = 48
            boolean r0 = r0.v(r4, r6, r8)     // Catch: java.lang.Throwable -> L228
            if (r0 != r15) goto L243
            goto L24d
        L25a:
            if (r9 == 0) goto L243
            j8.f r0 = r9.f6818d     // Catch: java.lang.Throwable -> L228
            boolean r0 = r0.v(r6, r5)     // Catch: java.lang.Throwable -> L228
            if (r0 != r15) goto L243
            goto L24d
        L265:
            if (r0 == 0) goto L243
            r14 = 42
            boolean r0 = r0.v(r14, r6, r8)     // Catch: java.lang.Throwable -> L228
            if (r0 != r15) goto L243
            goto L24d
        L270:
            if (r9 == 0) goto L243
            bb.b r0 = r9.f6817c     // Catch: java.lang.Throwable -> L228
            if (r0 == 0) goto L243
            boolean r0 = r0.q(r6, r5)     // Catch: java.lang.Throwable -> L228
            if (r0 != r15) goto L243
            goto L24d
        L27d:
            if (r9 == 0) goto L243
            j8.y r0 = r9.f6816b     // Catch: java.lang.Throwable -> L228
            if (r0 == 0) goto L243
            int r4 = r4.f5472i     // Catch: java.lang.Throwable -> L228
            boolean r0 = r0.s(r4, r6, r5)     // Catch: java.lang.Throwable -> L228
            if (r0 != r15) goto L243
            goto L24d
        L28c:
            if (r0 == 0) goto L243
            boolean r0 = r0.x(r6, r8)     // Catch: java.lang.Throwable -> L228
            if (r0 != r15) goto L243
            goto L24d
        L295:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L228
            goto L2a0
        L29a:
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L2a0:
            java.lang.Throwable r4 = sf.g.b(r0)
            if (r4 == 0) goto L2bf
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "群发助手模块发送失败: target="
            r5.<init>(r8)
            r5.append(r6)
            java.lang.String r6 = " type="
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r3.invoke(r5, r4)
        L2bf:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto L2c6
            r0 = r3
        L2c6:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2d3
            int r0 = r2.f5450g
            int r0 = r0 + r15
            r2.f5450g = r0
        L2d3:
            r3 = 500(0x1f4, double:2.47E-321)
            r1.a(r2, r15, r3)
            return
        L2d9:
            k8.t r4 = r4.f5470g
            if (r4 != 0) goto L2e1
            r21.e(r22)
            return
        L2e1:
            int r5 = r2.f5449f
            int r7 = r6.size()
            if (r5 < r7) goto L2ed
            r21.e(r22)
            return
        L2ed:
            int r5 = r2.f5449f
            int r7 = r5 + 10
            int r9 = r6.size()
            if (r7 <= r9) goto L2f8
            r7 = r9
        L2f8:
            java.util.List r5 = r6.subList(r5, r7)
            java.util.List r9 = tf.m.P1(r5)
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            r5.getClass()
            r1.f5460g = r5
            r1.f5461h = r9
            q8.o r6 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r6 == 0) goto L31a
            android.app.Activity r6 = r6.a()
            goto L31b
        L31a:
            r6 = 0
        L31b:
            if (r6 == 0) goto L320
            r18 = r6
            goto L322
        L320:
            r18 = 0
        L322:
            if (r18 == 0) goto L327
            r6 = r18
            goto L329
        L327:
            android.content.Context r6 = r0.f11620a
        L329:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.content.Context r0 = r0.f11620a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r10 = "com.tencent.mm.ui.transmit.MsgRetransmitUI"
            r7.setClassName(r0, r10)
            if (r18 != 0) goto L340
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r7.addFlags(r0)
        L340:
            java.lang.String r0 = "Retr_MsgQuickShare"
            r7.putExtra(r0, r15)
            r13 = 0
            r14 = 62
            java.lang.String r10 = ","
            r11 = 0
            r12 = 0
            java.lang.String r0 = tf.m.A1(r9, r10, r11, r12, r13, r14)
            java.lang.String r10 = "Select_Conv_User"
            r7.putExtra(r10, r0)
            java.lang.String r0 = "custom_send_text"
            r7.putExtra(r0, r8)
            java.lang.String r0 = "Retr_Msg_Type"
            int r8 = r4.f7475d
            r7.putExtra(r0, r8)
            java.lang.String r0 = "Retr_Msg_Id"
            long r10 = r4.f7472a
            r7.putExtra(r0, r10)
            java.lang.String r0 = "Retr_MsgTalker"
            java.lang.String r8 = r4.f7473b
            r7.putExtra(r0, r8)
            java.lang.String r0 = "Retr_Msg_content"
            java.lang.String r8 = r4.f7474c
            r7.putExtra(r0, r8)
            java.lang.String r0 = "Retr_File_Name"
            java.lang.String r8 = r4.f7477f
            r7.putExtra(r0, r8)
            java.lang.String r0 = "Edit_Mode_Sigle_Msg"
            r7.putExtra(r0, r15)
            java.lang.String r0 = "Retr_MsgFromScene"
            int r8 = r4.f7476e
            r7.putExtra(r0, r8)
            java.lang.String r0 = "Retr_show_success_tips"
            r8 = 0
            r7.putExtra(r0, r8)
            java.lang.String r0 = "Retr_go_to_chattingUI"
            r7.putExtra(r0, r8)
            java.lang.String r0 = "Retr_start_where_you_are"
            r7.putExtra(r0, r15)
            java.lang.String r0 = "scene_from"
            r8 = 17
            r7.putExtra(r0, r8)
            java.lang.String r0 = "hchat_selected_message_send_token"
            r7.putExtra(r0, r5)
            int r0 = r4.f7478g
            if (r0 <= 0) goto L3ae
            java.lang.String r4 = "Retr_length"
            r7.putExtra(r4, r0)
        L3ae:
            r6.startActivity(r7)     // Catch: java.lang.Throwable -> L3b4
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L3b4
            goto L3bb
        L3b4:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L3bb:
            boolean r4 = r0 instanceof sf.f
            if (r4 != 0) goto L3d5
            r4 = r0
            sf.n r4 = (sf.n) r4
            hb.o r4 = new hb.o
            r6 = 0
            r4.<init>(r1, r5, r6)
            java.lang.Object r5 = r1.f5457d
            android.os.Handler r5 = (android.os.Handler) r5
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            r5.postDelayed(r4, r6)
            r1.f5462i = r4
        L3d5:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L3e9
            java.lang.String r4 = "群发助手启动微信重发失败"
            r3.invoke(r4, r0)
            int r0 = r9.size()
            r3 = 750(0x2ee, double:3.705E-321)
            r1.a(r2, r0, r3)
        L3e9:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f5454a
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r4.f5458e
            ud.a r0 = (ud.a) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r4.f5459f
            ud.a r1 = (ud.a) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "IfInfo: then: "
            java.lang.String r3 = ", else: "
            java.lang.String r0 = bc.e.j(r2, r0, r3, r1)
            return r0
    }

    public void u() {
            r3 = this;
            java.lang.Object r0 = r3.f5459f
            hb.q r0 = (hb.q) r0
            if (r0 == 0) goto L7
            goto L27
        L7:
            java.lang.Object r0 = r3.f5458e
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r0 = r0.pollFirst()
            hb.q r0 = (hb.q) r0
            r3.f5459f = r0
            if (r0 == 0) goto L27
            java.util.ArrayList r1 = r0.f5445b
            int r1 = r1.size()
            java.util.List r2 = r0.f5446c
            int r2 = r2.size()
            int r2 = r2 * r1
            r0.f5451h = r2
            r3.s(r0)
        L27:
            return
    }
}
