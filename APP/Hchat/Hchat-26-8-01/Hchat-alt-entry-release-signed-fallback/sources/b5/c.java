package b5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements v0.e, j8.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f471c;

    public c(int r2) {
            r1 = this;
            switch(r2) {
                case 18: goto L4c;
                case 21: goto L3f;
                case 22: goto L2b;
                case 29: goto L10;
                default: goto L3;
            }
        L3:
            r1.<init>()
            l3.w r2 = new l3.w
            r0 = 17
            r2.<init>(r0)
            r1.f471c = r2
            return
        L10:
            r1.<init>()
            m.a r2 = new m.a
            r0 = 28
            r2.<init>(r0)
            r1.f469a = r2
            m.a r2 = new m.a
            r2.<init>(r0)
            r1.f470b = r2
            m.a r2 = new m.a
            r2.<init>(r0)
            r1.f471c = r2
            return
        L2b:
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            s0.j r0 = s0.i.f12197b
            r2.<init>(r0)
            r1.f469a = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f470b = r2
            return
        L3f:
            r1.<init>()
            long[] r2 = f.r0.f2895a
            f.k0 r2 = new f.k0
            r2.<init>()
            r1.f469a = r2
            return
        L4c:
            r1.<init>()
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r1.f469a = r2
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r1.f470b = r2
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r1.f471c = r2
            return
    }

    public c(a5.a r6, k5.o r7) {
            r5 = this;
            r5.<init>()
            r5.f469a = r6
            a2.a r6 = new a2.a
            r0 = 7
            r6.<init>(r0)
            r5.f471c = r6
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r0 = 1
            java.lang.Iterable r0 = r7.f1(r0)
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r0.next()
            k5.z r1 = (k5.z) r1
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "<clinit>"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1b
            ac.k r1 = r1.i1()
            if (r1 == 0) goto L1b
            k5.b0 r1 = r1.p()
            java.util.Iterator r1 = r1.iterator()
        L41:
            r2 = r1
            o5.t r2 = (o5.t) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1b
            java.lang.Object r2 = r2.next()
            t5.d r2 = (t5.d) r2
            f5.f r3 = r2.i()
            int r3 = r3.ordinal()
            switch(r3) {
                case 97: goto L5c;
                case 98: goto L5c;
                case 99: goto L5c;
                case 100: goto L5c;
                case 101: goto L5c;
                case 102: goto L5c;
                case 103: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L41
        L5c:
            l5.i r2 = (l5.i) r2
            v5.b r2 = r2.a()
            i5.a r2 = (i5.a) r2
            r2.a()     // Catch: v5.a -> L41
            java.lang.String r3 = r2.f1()     // Catch: v5.a -> L41
            java.lang.String r4 = r7.getType()     // Catch: v5.a -> L41
            boolean r3 = r3.equals(r4)     // Catch: v5.a -> L41
            if (r3 == 0) goto L41
            java.lang.Object r3 = r5.f471c     // Catch: v5.a -> L41
            a2.a r3 = (a2.a) r3     // Catch: v5.a -> L41
            java.lang.String r2 = r3.h(r2)     // Catch: v5.a -> L41
            r6.add(r2)     // Catch: v5.a -> L41
            goto L41
        L81:
            r5.f470b = r6
            return
    }

    public c(android.content.Context r3, int r4) {
            r2 = this;
            switch(r4) {
                case 13: goto L37;
                case 28: goto L16;
                default: goto L3;
            }
        L3:
            r2.<init>()
            java.lang.String r4 = "Hchat_moments_fake_interaction_config"
            android.content.SharedPreferences r3 = ub.b.c(r3, r4)
            r2.f469a = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.f471c = r3
            return
        L16:
            r2.<init>()
            android.content.Context r4 = r3.getApplicationContext()
            if (r4 == 0) goto L20
            r3 = r4
        L20:
            r2.f469a = r3
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss.SSS"
            r3.<init>(r0, r4)
            r2.f470b = r3
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy-MM-dd_HH-mm"
            r3.<init>(r0, r4)
            r2.f471c = r3
            return
        L37:
            r2.<init>()
            r2.f469a = r3
            java.util.Set r3 = j8.b.o()
            r2.f470b = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r0 = 0
            r3.<init>(r0)
            r2.f471c = r3
            return
    }

    public c(i4.s r1, i4.n r2, z4.g r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L18
            if (r2 == 0) goto L11
            r3.k()
            r0.f469a = r1
            r0.f470b = r2
            r0.f471c = r3
            return
        L11:
            java.lang.String r1 = "stack == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L18:
            java.lang.String r1 = "locals == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    public /* synthetic */ c(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.f469a = r1
            r0.f470b = r2
            r0.f471c = r3
            r0.<init>()
            return
    }

    public c(m2.r r1, b5.c r2) {
            r0 = this;
            r0.<init>()
            r0.f469a = r1
            r0.f470b = r2
            java.lang.Object r1 = r1.f8711g
            r0.f471c = r1
            return
    }

    public static boolean B(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto L1c
            r2.getClass()
            java.lang.String r0 = "@chatroom"
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "@im.chatroom"
            boolean r2 = og.t.W(r2, r0, r1)
            if (r2 == 0) goto L1c
        L1a:
            r2 = 1
            return r2
        L1c:
            return r1
    }

    public static void I(java.util.LinkedHashMap r1, java.lang.String r2, ia.c r3) {
            boolean r0 = r3.c()
            if (r0 == 0) goto La
            r1.remove(r2)
            return
        La:
            r1.put(r2, r3)
            return
    }

    public static java.util.List W(org.json.JSONArray r12) {
            if (r12 != 0) goto L5
            tf.t r12 = tf.t.f13167g
            return r12
        L5:
            uf.c r0 = a.a.E()
            int r1 = r12.length()
            r2 = 0
        Le:
            if (r2 < r1) goto L15
            uf.c r12 = a.a.t(r0)
            return r12
        L15:
            org.json.JSONObject r3 = r12.optJSONObject(r2)
            if (r3 == 0) goto L6f
            java.lang.String r4 = "id"
            java.lang.String r4 = wb.en.j(r4, r3)
            int r5 = r4.length()
            if (r5 != 0) goto L32
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r4.getClass()
        L32:
            r6 = r4
            java.lang.String r4 = "author"
            java.lang.String r7 = wb.en.j(r4, r3)
            java.lang.String r4 = "authorName"
            java.lang.String r4 = wb.en.j(r4, r3)
            int r5 = r4.length()
            if (r5 != 0) goto L47
            r8 = r7
            goto L48
        L47:
            r8 = r4
        L48:
            java.lang.String r4 = "content"
            java.lang.String r9 = wb.en.j(r4, r3)
            java.lang.String r4 = "time"
            r10 = 0
            long r3 = r3.optLong(r4, r10)
            int r5 = r7.length()
            if (r5 <= 0) goto L6f
            int r5 = r9.length()
            if (r5 <= 0) goto L6f
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 <= 0) goto L6f
            ia.b r5 = new ia.b
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r0.add(r5)
        L6f:
            int r2 = r2 + 1
            goto Le
    }

    public static org.json.JSONObject X(ia.b r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r2 = r4.f6553a
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "author"
            java.lang.String r2 = r4.f6554b
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "authorName"
            java.lang.String r2 = r4.f6555c
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "content"
            java.lang.String r2 = r4.f6556d
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r1 = "time"
            long r2 = r4.f6557e
            org.json.JSONObject r4 = r0.put(r1, r2)
            r4.getClass()
            return r4
    }

    public static java.util.List Y(org.json.JSONArray r9) {
            if (r9 != 0) goto L5
            tf.t r9 = tf.t.f13167g
            return r9
        L5:
            uf.c r0 = a.a.E()
            int r1 = r9.length()
            r2 = 0
        Le:
            if (r2 < r1) goto L15
            uf.c r9 = a.a.t(r0)
            return r9
        L15:
            java.lang.Object r3 = r9.opt(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = ""
            r6 = 0
            if (r4 == 0) goto L2a
            r7 = r3
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r8 = "wxId"
            java.lang.String r7 = wb.en.j(r8, r7)
            goto L3d
        L2a:
            if (r3 == 0) goto L31
            java.lang.String r7 = r3.toString()
            goto L32
        L31:
            r7 = r6
        L32:
            if (r7 != 0) goto L35
            r7 = r5
        L35:
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
        L3d:
            int r8 = r7.length()
            if (r8 != 0) goto L44
            goto L6f
        L44:
            if (r4 == 0) goto L49
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            goto L4a
        L49:
            r3 = r6
        L4a:
            if (r3 == 0) goto L5c
            java.lang.String r4 = "displayName"
            java.lang.String r3 = r3.optString(r4)
            if (r3 == 0) goto L5c
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r6 = r3.toString()
        L5c:
            if (r6 != 0) goto L5f
            goto L60
        L5f:
            r5 = r6
        L60:
            int r3 = r5.length()
            if (r3 != 0) goto L67
            r5 = r7
        L67:
            ia.d r3 = new ia.d
            r3.<init>(r7, r5)
            r0.add(r3)
        L6f:
            int r2 = r2 + 1
            goto Le
    }

    public static java.lang.String e(java.lang.String r2) {
            java.lang.String r0 = f8.i.s0(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L10
            java.lang.String r2 = "sendid_"
            java.lang.String r2 = r2.concat(r0)
        L10:
            java.lang.String r0 = "hb_amount_"
            java.lang.String r2 = wb.en.g(r0, r2)
            return r2
    }

    public static sf.j h(ia.b r3) {
            sf.j r0 = new sf.j
            java.lang.String r1 = r3.f6553a
            java.lang.String r2 = r3.f6554b
            java.lang.String r3 = r3.f6556d
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static void z(nd.t r10) {
            ud.a r0 = r10.f9393b
            java.util.List r1 = r0.f13675m
            int r2 = r1.size()
            r3 = 1
            if (r2 > r3) goto Ld
            goto L9c
        Ld:
            java.util.HashSet r10 = r10.b()
            java.util.Iterator r2 = r1.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9c
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            md.a r4 = md.a.f8831m
            md.f r5 = r3.f8877g
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L15
            pd.k r4 = pd.k.U
            boolean r5 = a.a.v(r3, r4)
            if (r5 == 0) goto L34
            goto L15
        L34:
            java.util.List r5 = r3.f13675m
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3d
            goto L15
        L3d:
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            ud.a r5 = (ud.a) r5
            md.a r7 = md.a.f8845z
            md.f r8 = r5.f8877g
            boolean r7 = r8.a(r7)
            if (r7 == 0) goto L4f
            goto L15
        L4f:
            java.util.BitSet r7 = r0.f13678p
            int r8 = r5.f13672j
            boolean r7 = r7.get(r8)
            if (r7 != 0) goto L15
            boolean r7 = r10.contains(r5)
            if (r7 == 0) goto L60
            goto L15
        L60:
            java.util.Iterator r7 = r1.iterator()
        L64:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L15
            java.lang.Object r8 = r7.next()
            ud.a r8 = (ud.a) r8
            java.util.BitSet r8 = r8.f13678p
            int r9 = r5.f13672j
            boolean r8 = r8.get(r9)
            if (r8 != 0) goto L64
            java.util.Iterator r7 = r10.iterator()
        L7e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L15
            java.lang.Object r8 = r7.next()
            ud.a r8 = (ud.a) r8
            boolean r8 = a.a.s0(r5, r8)
            if (r8 == 0) goto L7e
            ud.p r5 = new ud.p
            r5.<init>(r4, r6)
            java.util.ArrayList r3 = r3.f13674l
            r3.add(r5)
            goto L15
        L9c:
            return
    }

    public boolean A(le.c r18, nd.t r19, ud.a r20, ud.f r21) {
            r17 = this;
            r0 = r19
            r1 = r17
            r2 = r21
            java.lang.Object r3 = r1.f469a
            ud.r r3 = (ud.r) r3
            ud.a r4 = r2.f13705b
            ud.a r5 = a.a.K(r4)
            md.f r5 = r5.f8877g
            md.b r6 = md.b.f8871z
            java.util.List r5 = r5.d(r6)
            java.util.Iterator r5 = r5.iterator()
        L1c:
            boolean r7 = r5.hasNext()
            r8 = 1
            r9 = 0
            r10 = 0
            if (r7 == 0) goto L3a
            java.lang.Object r7 = r5.next()
            nd.t r7 = (nd.t) r7
            if (r7 == r0) goto L1c
            nd.t r11 = r0.f9396e
        L2f:
            if (r11 != 0) goto L32
            goto L1c
        L32:
            if (r11 != r7) goto L37
            r7 = r2
            r5 = r8
            goto L3c
        L37:
            nd.t r11 = r11.f9396e
            goto L2f
        L3a:
            r7 = r9
            r5 = r10
        L3c:
            if (r5 != 0) goto Le3
            java.util.BitSet r11 = new java.util.BitSet
            java.util.List r12 = r3.f13732z
            int r12 = r12.size()
            r11.<init>(r12)
            r12 = r4
            r13 = r9
        L4b:
            if (r12 == 0) goto Le4
            int r14 = r12.f13672j
            boolean r14 = r11.get(r14)
            if (r14 == 0) goto L57
            goto Le4
        L57:
            int r14 = r12.f13672j
            r11.set(r14)
            r14 = r20
            if (r13 == 0) goto Lcc
            boolean r15 = a.a.s0(r14, r12)
            if (r15 == 0) goto Lcc
            boolean r5 = a.a.A(r13)
            if (r5 == 0) goto L6e
            goto Le6
        L6e:
            java.util.List r5 = a.a.u(r13)
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L9e
            int r7 = r5.size()
            int r7 = r7 - r8
            java.lang.Object r5 = r5.get(r7)
            ud.a r5 = (ud.a) r5
            md.a r7 = md.a.f8821h
            md.f r11 = r5.f8877g
            boolean r7 = r11.a(r7)
            if (r7 != 0) goto Le6
            md.a r7 = md.a.f8833n
            md.f r11 = r5.f8877g
            boolean r7 = r11.a(r7)
            if (r7 != 0) goto Le6
            boolean r5 = r3.Y(r5)
            if (r5 == 0) goto L9e
            goto Le6
        L9e:
            ud.a r5 = r3.B
            java.util.HashSet r5 = a.a.P(r5, r13)
            java.util.Iterator r5 = r5.iterator()
        La8:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lbd
            java.lang.Object r7 = r5.next()
            ud.a r7 = (ud.a) r7
            pd.k r11 = pd.k.f10514w
            boolean r7 = a.a.v(r7, r11)
            if (r7 == 0) goto La8
            goto Le6
        Lbd:
            ud.f r7 = new ud.f
            java.util.List r5 = r13.f13676n
            java.lang.Object r5 = r5.get(r10)
            ud.a r5 = (ud.a) r5
            r7.<init>(r13, r5)
            r5 = r8
            goto Le4
        Lcc:
            java.util.List r13 = r12.f13677o
            int r15 = r13.size()
            if (r15 != r8) goto Ldb
            java.lang.Object r13 = r13.get(r10)
            ud.a r13 = (ud.a) r13
            goto Ldc
        Ldb:
            r13 = r9
        Ldc:
            r16 = r13
            r13 = r12
            r12 = r16
            goto L4b
        Le3:
            r12 = r4
        Le4:
            if (r5 != 0) goto Le7
        Le6:
            return r10
        Le7:
            ud.p r5 = new ud.p
            pd.k r11 = pd.k.T
            r5.<init>(r11, r10)
            r5.x(r6, r0)
            ud.a r0 = r7.f13704a
            ud.a r6 = r7.f13705b
            nd.f r7 = new nd.f
            r7.<init>(r0, r6, r5)
            md.f r10 = r0.f8877g
            md.b r11 = md.b.A
            java.util.List r10 = r10.d(r11)
            boolean r10 = r10.contains(r7)
            if (r10 != 0) goto L10b
            r0.x(r11, r7)
        L10b:
            md.f r0 = r6.f8877g
            java.util.List r0 = r0.d(r11)
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L11a
            r6.x(r11, r7)
        L11a:
            r0 = r18
            r0.a(r12)
            ud.a r0 = a.a.d0(r4)
            if (r0 != 0) goto L126
            goto L172
        L126:
            java.util.List r0 = r3.R(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L131
            goto L172
        L131:
            ud.a r0 = r2.f13704a
            java.util.List r0 = r3.R(r0)
            int r2 = r0.size()
            r3 = 2
            if (r2 >= r3) goto L13f
            goto L172
        L13f:
            java.util.Iterator r0 = r0.iterator()
        L143:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L154
            java.lang.Object r2 = r0.next()
            nd.t r2 = (nd.t) r2
            nd.t r3 = r2.f9396e
            if (r3 != 0) goto L143
            r9 = r2
        L154:
            if (r9 != 0) goto L157
            goto L172
        L157:
            ud.a r0 = r9.f9393b
            if (r0 == r12) goto L172
            java.util.HashSet r0 = r9.b()
            boolean r0 = r0.contains(r12)
            if (r0 != 0) goto L172
            nd.u r0 = new nd.u
            r0.<init>(r9)
            r5.y(r0)
            ud.a r2 = r9.f9392a
            r2.y(r0)
        L172:
            return r8
    }

    public boolean C() {
            r2 = this;
            java.lang.Object r0 = r2.f469a
            m.a r0 = (m.a) r0
            java.lang.Object r0 = r0.f8069h
            x1.a2 r0 = (x1.a2) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.f471c
            m.a r0 = (m.a) r0
            java.lang.Object r0 = r0.f8069h
            x1.a2 r0 = (x1.a2) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.f470b
            m.a r0 = (m.a) r0
            java.lang.Object r0 = r0.f8069h
            x1.a2 r0 = (x1.a2) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2d
            r0 = r1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            r0 = r0 ^ r1
            return r0
    }

    public boolean D() {
            r2 = this;
            java.lang.Object r0 = r2.f469a
            i0.l2 r0 = (i0.l2) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r2.f471c
            if (r0 != r1) goto L1b
            java.lang.Object r0 = r2.f470b
            b5.c r0 = (b5.c) r0
            if (r0 == 0) goto L19
            boolean r0 = r0.D()
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            r0 = 1
            return r0
    }

    public java.io.File E() {
            r8 = this;
            java.lang.Object r0 = r8.f469a
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            java.io.File[] r2 = r0.getExternalMediaDirs()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L26
            int r3 = r2.length     // Catch: java.lang.Throwable -> L26
            r4 = 0
            r5 = r4
        Le:
            if (r5 >= r3) goto L26
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L16
            r7 = 1
            goto L17
        L16:
            r7 = r4
        L17:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L26
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r7 == 0) goto L23
            r1 = r6
            goto L26
        L23:
            int r5 = r5 + 1
            goto Le
        L26:
            if (r1 == 0) goto L29
            goto L38
        L29:
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "/storage/emulated/0/Android/media/"
            java.lang.String r0 = wb.en.g(r2, r0)
            r1.<init>(r0)
        L38:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "Hchat/抓包日志"
            r0.<init>(r1, r2)
            return r0
    }

    public b5.c F(int r8, int r9, b5.c r10) {
            r7 = this;
            java.lang.Object r0 = r7.f471c
            z4.g r0 = (z4.g) r0
            java.lang.Object r1 = r7.f469a
            i4.s r1 = (i4.s) r1
            java.lang.Object r2 = r10.f469a
            i4.s r2 = (i4.s) r2
            i4.t r9 = r1.r(r2, r9)
            java.lang.Object r2 = r7.f470b
            i4.n r2 = (i4.n) r2
            java.lang.Object r3 = r10.f470b
            i4.n r3 = (i4.n) r3
            r2.getClass()
            i4.n r3 = x6.d.N(r2, r3)     // Catch: i4.b0 -> L6e
            java.lang.Object r10 = r10.f471c
            z4.g r10 = (z4.g) r10
            z4.g r10 = r10.p()
            r10.l(r8)
            r8 = 0
            r10.f22555g = r8
            if (r9 != r1) goto L38
            if (r3 != r2) goto L38
            boolean r8 = r0.equals(r10)
            if (r8 == 0) goto L38
            return r7
        L38:
            boolean r8 = r0.equals(r10)
            if (r8 == 0) goto L3f
            goto L68
        L3f:
            int r8 = r0.f22552i
            int r1 = r10.f22552i
            if (r8 <= r1) goto L46
            goto L49
        L46:
            r6 = r0
            r0 = r10
            r10 = r6
        L49:
            int r8 = r0.f22552i
            int r1 = r10.f22552i
            int r2 = r1 + (-1)
        L4f:
            if (r2 < 0) goto L68
            int r4 = r10.n(r2)
            int r5 = r8 - r1
            int r5 = r5 + r2
            int r5 = r0.n(r5)
            if (r4 != r5) goto L61
            int r2 = r2 + (-1)
            goto L4f
        L61:
            java.lang.String r8 = "Incompatible merged subroutines"
            bsh.j.g(r8)
            r8 = 0
            return r8
        L68:
            b5.c r8 = new b5.c
            r8.<init>(r9, r3, r0)
            return r8
        L6e:
            r8 = move-exception
            java.lang.String r9 = "underlay stack:"
            r8.a(r9)
            r2.l(r8)
            java.lang.String r9 = "overlay stack:"
            r8.a(r9)
            r3.l(r8)
            throw r8
    }

    public java.lang.Object G(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, l3.o r22) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            k4.a r5 = new k4.a
            java.lang.Object r6 = r0.f470b
            hb.c r6 = (hb.c) r6
            java.lang.Object r6 = r6.f5340i
            l3.t r6 = (l3.t) r6
            r5.<init>(r6)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 0
            r8 = 1
            r9 = r6
            r10 = r7
            r11 = r8
            r6 = r18
        L22:
            r7 = r6
        L23:
            r12 = 2
            if (r6 >= r2) goto Ld8
            if (r10 >= r3) goto Ld8
            if (r11 == 0) goto Ld8
            java.lang.Object r13 = r5.f7145e
            l3.t r13 = (l3.t) r13
            android.util.SparseArray r13 = r13.f7823a
            if (r13 != 0) goto L34
            r13 = 0
            goto L3a
        L34:
            java.lang.Object r13 = r13.get(r9)
            l3.t r13 = (l3.t) r13
        L3a:
            int r14 = r5.f7141a
            r15 = 3
            if (r14 == r12) goto L4e
            if (r13 != 0) goto L46
            r5.b()
        L44:
            r13 = r8
            goto L92
        L46:
            r5.f7141a = r12
            r5.f7145e = r13
            r5.f7143c = r8
        L4c:
            r13 = r12
            goto L92
        L4e:
            if (r13 == 0) goto L58
            r5.f7145e = r13
            int r13 = r5.f7143c
            int r13 = r13 + r8
            r5.f7143c = r13
            goto L4c
        L58:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L61
            r5.b()
            goto L44
        L61:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L67
            goto L4c
        L67:
            java.lang.Object r13 = r5.f7145e
            l3.t r13 = (l3.t) r13
            l3.u r14 = r13.f7824b
            if (r14 == 0) goto L8e
            int r14 = r5.f7143c
            if (r14 != r8) goto L88
            boolean r13 = r5.c()
            if (r13 == 0) goto L84
            java.lang.Object r13 = r5.f7145e
            l3.t r13 = (l3.t) r13
            r5.f7146f = r13
            r5.b()
        L82:
            r13 = r15
            goto L92
        L84:
            r5.b()
            goto L44
        L88:
            r5.f7146f = r13
            r5.b()
            goto L82
        L8e:
            r5.b()
            goto L44
        L92:
            r5.f7142b = r9
            if (r13 == r8) goto Lc6
            if (r13 == r12) goto Lb7
            if (r13 == r15) goto L9b
            goto L23
        L9b:
            if (r21 != 0) goto La9
            java.lang.Object r12 = r5.f7146f
            l3.t r12 = (l3.t) r12
            l3.u r12 = r12.f7824b
            boolean r12 = r0.w(r1, r7, r6, r12)
            if (r12 != 0) goto L22
        La9:
            java.lang.Object r11 = r5.f7146f
            l3.t r11 = (l3.t) r11
            l3.u r11 = r11.f7824b
            boolean r11 = r4.a(r1, r7, r6, r11)
            int r10 = r10 + 1
            goto L22
        Lb7:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto Lc3
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        Lc3:
            r6 = r12
            goto L23
        Lc6:
            int r6 = java.lang.Character.codePointAt(r1, r7)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r7
            if (r6 >= r2) goto L22
            int r7 = java.lang.Character.codePointAt(r1, r6)
            r9 = r7
            goto L22
        Ld8:
            int r2 = r5.f7141a
            if (r2 != r12) goto L109
            java.lang.Object r2 = r5.f7145e
            l3.t r2 = (l3.t) r2
            l3.u r2 = r2.f7824b
            if (r2 == 0) goto L109
            int r2 = r5.f7143c
            if (r2 > r8) goto Lee
            boolean r2 = r5.c()
            if (r2 == 0) goto L109
        Lee:
            if (r10 >= r3) goto L109
            if (r11 == 0) goto L109
            if (r21 != 0) goto L100
            java.lang.Object r2 = r5.f7145e
            l3.t r2 = (l3.t) r2
            l3.u r2 = r2.f7824b
            boolean r2 = r0.w(r1, r7, r6, r2)
            if (r2 != 0) goto L109
        L100:
            java.lang.Object r2 = r5.f7145e
            l3.t r2 = (l3.t) r2
            l3.u r2 = r2.f7824b
            r4.a(r1, r7, r6, r2)
        L109:
            java.lang.Object r1 = r4.e()
            return r1
    }

    public ud.a H(xd.b r28, nd.t r29, le.c r30) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            java.util.ArrayList r4 = r1.f21539k
            java.lang.Object r5 = r0.f469a
            ud.r r5 = (ud.r) r5
            java.lang.Object r6 = r0.f470b
            i4.y r6 = (i4.y) r6
            java.lang.Object r7 = r6.f6499g
            ze.c r7 = (ze.c) r7
            ud.a r8 = r2.f9392a
            ud.a r9 = r2.f9393b
            java.util.HashSet r10 = r2.b()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r10.size()
            r11.<init>(r12)
            ud.a r12 = a.a.d0(r8)
            if (r12 == 0) goto L36
            boolean r13 = r10.remove(r12)
            if (r13 == 0) goto L36
            r11.add(r12)
        L36:
            boolean r12 = r10.remove(r8)
            if (r12 == 0) goto L3f
            r11.add(r8)
        L3f:
            boolean r12 = r10.remove(r9)
            if (r12 == 0) goto L48
            r11.add(r9)
        L48:
            r11.addAll(r10)
            java.util.Iterator r10 = r11.iterator()
        L4f:
            boolean r12 = r10.hasNext()
            md.b r13 = md.b.E
            md.b r15 = md.b.f8871z
            if (r12 == 0) goto L261
            java.lang.Object r12 = r10.next()
            ud.a r12 = (ud.a) r12
            md.f r14 = r12.f8877g
            boolean r14 = r14.b(r13)
            if (r14 == 0) goto L68
            goto L4f
        L68:
            ud.p r14 = a.a.c0(r12)
            if (r14 == 0) goto L25d
            pd.k r14 = r14.f13713k
            r17 = r10
            pd.k r10 = pd.k.f10513v
            if (r14 == r10) goto L79
        L76:
            r10 = r17
            goto L4f
        L79:
            md.f r10 = r12.f8877g
            java.util.List r10 = r10.d(r15)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L8d
            r14 = 0
            java.lang.Object r10 = r10.get(r14)
            if (r10 == r2) goto L8d
            goto L76
        L8d:
            ud.a r10 = r2.f9392a
            if (r12 != r9) goto L95
        L91:
            r18 = r11
            r14 = 1
            goto Lba
        L95:
            java.util.ArrayList r14 = r10.f13674l
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto La9
            java.util.List r14 = r10.f13676n
            boolean r14 = be.h.E(r14, r12)
            if (r14 == 0) goto La9
        La5:
            r18 = r11
            r14 = 0
            goto Lba
        La9:
            java.util.ArrayList r14 = r9.f13674l
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto La5
            java.util.List r14 = r9.f13675m
            boolean r14 = be.h.E(r14, r12)
            if (r14 == 0) goto La5
            goto L91
        Lba:
            zd.c r11 = new zd.c
            r11.<init>(r1, r2, r12, r14)
            r19 = r14
            if (r12 == r10) goto L1ae
            if (r19 != 0) goto L1ae
            if (r10 != r12) goto Ld4
            java.util.ArrayList r14 = r10.f13674l
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto Ld4
            r21 = r9
            r20 = r13
            goto L11a
        Ld4:
            java.util.ArrayList r14 = r10.f13674l
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L11b
            java.util.List r14 = r10.f13677o
            int r14 = r14.size()
            r20 = r13
            r13 = 1
            if (r14 == r13) goto Lea
        Le7:
            r21 = r9
            goto L11e
        Lea:
            ud.a r14 = a.a.d0(r10)
        Lee:
            if (r14 == 0) goto L116
            if (r14 == r12) goto L116
            java.util.List r13 = r14.f13677o
            int r13 = r13.size()
            r21 = r9
            r9 = 2
            if (r13 >= r9) goto L118
            java.util.List r9 = r14.f13675m
            int r9 = r9.size()
            r13 = 1
            if (r9 != r13) goto L118
            java.util.ArrayList r9 = r14.f13674l
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L118
            ud.a r14 = a.a.d0(r14)
            r9 = r21
            r13 = 1
            goto Lee
        L116:
            r21 = r9
        L118:
            if (r14 != r12) goto L11e
        L11a:
            goto L130
        L11b:
            r20 = r13
            goto Le7
        L11e:
            java.util.List r9 = r12.f13675m
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L1a8
            r11.f22669p = r10
            java.util.ArrayList r9 = r10.f13674l
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L136
        L130:
            r22 = r6
            r23 = r11
            goto L1b6
        L136:
            yd.b r10 = r11.f22417k
            if (r10 != 0) goto L13c
            goto L1a8
        L13c:
            java.util.ArrayList r10 = r10.J()
            boolean r13 = r10.isEmpty()
            if (r13 == 0) goto L148
            goto L1a8
        L148:
            int r13 = r9.size()
            r14 = 0
        L14d:
            if (r14 >= r13) goto L130
            java.lang.Object r22 = r9.get(r14)
            r23 = r11
            r11 = r22
            ud.p r11 = (ud.p) r11
            qd.r r11 = r11.f13714l
            if (r11 != 0) goto L160
            r22 = r6
            goto L1ac
        L160:
            r22 = r6
            qd.s r6 = r11.f10923m
            java.util.ArrayList r6 = r6.f10928j
            int r6 = r6.size()
            r0 = 1
            if (r6 <= r0) goto L16e
        L16d:
            goto L1ac
        L16e:
            int r0 = r14 + 1
            r24 = r0
            r6 = 0
        L173:
            if (r0 >= r13) goto L193
            java.lang.Object r25 = r9.get(r14)
            r26 = r0
            r0 = r25
            ud.p r0 = (ud.p) r0
            java.util.List r0 = r0.f13715m
            int r25 = r0.size()
            if (r25 != 0) goto L189
            r0 = 0
            goto L18d
        L189:
            boolean r0 = xe.m.b(r0, r11)
        L18d:
            if (r0 == 0) goto L190
            r6 = 1
        L190:
            int r0 = r26 + 1
            goto L173
        L193:
            if (r6 != 0) goto L19c
            boolean r0 = xe.m.b(r10, r11)
            if (r0 == 0) goto L19c
            r6 = 1
        L19c:
            if (r6 != 0) goto L19f
            goto L16d
        L19f:
            r0 = r27
            r6 = r22
            r11 = r23
            r14 = r24
            goto L14d
        L1a8:
            r22 = r6
            r23 = r11
        L1ac:
            r14 = 0
            goto L1b7
        L1ae:
            r22 = r6
            r21 = r9
            r23 = r11
            r20 = r13
        L1b6:
            r14 = 1
        L1b7:
            if (r14 == 0) goto L1e9
            java.util.List r0 = r5.R(r12)
            int r0 = r0.size()
            r9 = 2
            if (r0 < r9) goto L1e9
            java.util.List r0 = r12.f13677o
            java.util.Iterator r0 = r0.iterator()
        L1ca:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L1e5
            java.lang.Object r6 = r0.next()
            ud.a r6 = (ud.a) r6
            java.util.List r6 = r5.R(r6)
            r6.remove(r2)
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L1ca
            r0 = 0
            goto L1e6
        L1e5:
            r0 = 1
        L1e6:
            if (r0 == 0) goto L1e9
            r14 = 0
        L1e9:
            if (r14 == 0) goto L24c
            java.util.ArrayList r0 = r2.a()
            int r6 = r0.size()
            r9 = 2
            if (r6 >= r9) goto L1f8
        L1f6:
            r0 = 1
            goto L239
        L1f8:
            java.util.stream.Stream r6 = r0.stream()
            ce.o r9 = new ce.o
            r10 = 3
            r9.<init>(r12, r10)
            java.util.stream.Stream r6 = r6.filter(r9)
            java.util.Optional r6 = r6.findFirst()
            boolean r9 = r6.isPresent()
            if (r9 == 0) goto L23d
            java.lang.Object r6 = r6.get()
            ud.f r6 = (ud.f) r6
            ud.a r9 = r6.f13705b
            java.util.Iterator r0 = r0.iterator()
        L21c:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L1f6
            java.lang.Object r10 = r0.next()
            ud.f r10 = (ud.f) r10
            if (r10 == r6) goto L21c
            ud.a r10 = r10.f13705b
            boolean r11 = a.a.o0(r9, r10)
            if (r11 != 0) goto L21c
            ud.a r10 = a.a.h0(r5, r9, r10)
            if (r10 == 0) goto L21c
            r0 = 0
        L239:
            if (r0 != 0) goto L24c
            r14 = 0
            goto L24c
        L23d:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "Not found exit edge by exit block: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            r0 = 0
            return r0
        L24c:
            if (r14 == 0) goto L251
            r11 = r23
            goto L26a
        L251:
            r0 = r27
            r10 = r17
            r11 = r18
            r9 = r21
            r6 = r22
            goto L4f
        L25d:
            r0 = r27
            goto L4f
        L261:
            r22 = r6
            r21 = r9
            r18 = r11
            r20 = r13
            r11 = 0
        L26a:
            if (r11 != 0) goto L344
            zd.c r0 = new zd.c
            r6 = 0
            r14 = 0
            r0.<init>(r1, r2, r6, r14)
            r4.add(r0)
            r8.E(r15)
            java.util.BitSet r1 = r7.f22680h
            int r4 = r8.f13672j
            r1.clear(r4)
            r3.c(r0)
            java.util.ArrayList r1 = r2.a()
            int r4 = r1.size()
            r13 = 1
            if (r4 != r13) goto L2ac
            java.lang.Object r1 = r1.get(r14)
            ud.f r1 = (ud.f) r1
            ud.a r4 = r1.f13705b
            r9 = r27
            boolean r1 = r9.A(r3, r2, r4, r1)
            if (r1 == 0) goto L2a8
            ud.a r1 = a.a.d0(r4)
            if (r1 == 0) goto L2a8
            r3.a(r1)
            goto L2a9
        L2a8:
            r1 = r6
        L2a9:
            r10 = r22
            goto L2eb
        L2ac:
            r9 = r27
            java.util.Iterator r1 = r1.iterator()
            r4 = r6
        L2b3:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L2e9
            java.lang.Object r7 = r1.next()
            ud.f r7 = (ud.f) r7
            ud.a r10 = r7.f13705b
            java.util.BitSet r11 = r10.f13680r
            java.util.List r11 = a.a.q(r5, r11)
            java.util.Iterator r11 = r11.iterator()
        L2cb:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L2b3
            java.lang.Object r12 = r11.next()
            ud.a r12 = (ud.a) r12
            boolean r13 = a.a.s0(r10, r12)
            if (r13 == 0) goto L2e5
            r3.a(r12)
            r9.A(r3, r2, r12, r7)
            r4 = r12
            goto L2cb
        L2e5:
            r9.A(r3, r2, r10, r7)
            goto L2cb
        L2e9:
            r1 = r4
            goto L2a9
        L2eb:
            xd.b r4 = r10.b(r8)
            r12 = r21
            boolean r7 = f8.i.Z(r12, r4)
            if (r7 != 0) goto L32a
            md.f r7 = r12.f8877g
            r10 = r20
            boolean r7 = r7.b(r10)
            if (r7 != 0) goto L32a
            java.util.List r7 = r5.E
            int r7 = r7.size()
            if (r7 != 0) goto L30a
            goto L325
        L30a:
            java.util.List r5 = r5.E
            java.util.Iterator r5 = r5.iterator()
        L310:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L325
            java.lang.Object r7 = r5.next()
            ae.f r7 = (ae.f) r7
            java.util.ArrayList r7 = r7.f235d
            boolean r7 = r7.contains(r12)
            if (r7 == 0) goto L310
            goto L32a
        L325:
            java.util.ArrayList r5 = r4.f21539k
            r5.add(r12)
        L32a:
            r0.f22670q = r4
            if (r1 != 0) goto L33a
            ud.a r0 = a.a.d0(r12)
            boolean r1 = f8.i.Z(r0, r4)
            if (r1 == 0) goto L339
            r0 = r6
        L339:
            r1 = r0
        L33a:
            r3.b()
            r8.x(r15, r2)
            z(r2)
            return r1
        L344:
            r9 = r27
            r12 = r21
            r10 = r22
            r6 = 0
            r4.add(r11)
            le.b r0 = r3.f8017b
            xd.a r0 = r0.f8015b
            r3.c(r11)
            java.lang.Object r1 = r9.f471c
            le.a r1 = (le.a) r1
            ud.r r1 = r1.f8012a
            ud.a r4 = r11.f22668o
            hb.r r1 = le.a.g(r1, r4)
            hb.r r4 = le.a.h(r1)
            if (r4 == 0) goto L368
            r1 = r4
        L368:
            le.a.a(r1)
            java.util.HashSet r4 = r2.f9394c
            java.lang.Object r5 = r1.f5458e
            ud.a r5 = (ud.a) r5
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L37b
            hb.r r1 = hb.r.l(r1)
        L37b:
            java.lang.Object r4 = r1.f5458e
            ud.a r4 = (ud.a) r4
            java.lang.Object r5 = r1.f5457d
            ze.c r5 = (ze.c) r5
            java.lang.Object r13 = r1.f5459f
            ud.a r13 = (ud.a) r13
            java.lang.Object r14 = r1.f5456c
            yd.b r14 = (yd.b) r14
            r11.f22417k = r14
            java.util.List r14 = r5.c()
            r11.f22418l = r14
            ae.e r14 = new ae.e
            r6 = 22
            r14.<init>(r6)
            r5.forEach(r14)
            java.util.List r5 = r5.c()
            r6 = r18
            r6.removeAll(r5)
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L3d2
            if (r13 == 0) goto L3d2
            java.util.ArrayList r5 = r2.a()
            java.util.Iterator r5 = r5.iterator()
        L3b6:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L3d2
            java.lang.Object r14 = r5.next()
            ud.f r14 = (ud.f) r14
            r16 = r1
            ud.a r1 = r14.f13704a
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L3cf
            r9.A(r3, r2, r13, r14)
        L3cf:
            r1 = r16
            goto L3b6
        L3d2:
            r16 = r1
            boolean r1 = r11.f22667n
            md.a r5 = md.a.f8845z
            if (r1 == 0) goto L401
            if (r4 == r12) goto L3de
            if (r4 != r8) goto L3df
        L3de:
            r4 = r13
        L3df:
            ud.a r0 = a.a.K(r4)
            r8.E(r15)
            r12.w(r5)
            r3.a(r12)
            java.util.BitSet r1 = r7.f22680h
            int r4 = r8.f13672j
            r1.clear(r4)
            xd.b r1 = r10.b(r8)
            r11.f22670q = r1
            r8.x(r15, r2)
            r12.D(r5)
            goto L471
        L401:
            if (r0 == 0) goto L423
            if (r13 == 0) goto L423
            md.a r1 = md.a.f8827k
            md.f r6 = r13.f8877g
            boolean r1 = r6.a(r1)
            if (r1 == 0) goto L423
            md.f r1 = r13.f8877g
            java.util.List r1 = r1.d(r15)
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L423
            boolean r0 = f8.i.Z(r13, r0)
            if (r0 == 0) goto L423
            r15 = 0
            goto L424
        L423:
            r15 = r13
        L424:
            r3.a(r15)
            boolean r0 = java.util.Objects.equals(r4, r8)
            if (r0 == 0) goto L433
            xd.b r0 = new xd.b
            r0.<init>(r11)
            goto L437
        L433:
            xd.b r0 = r10.b(r4)
        L437:
            ud.a r1 = r16.j()
            if (r8 == r1) goto L46e
            java.util.HashSet r4 = a.a.P(r8, r1)
            r4.remove(r1)
            java.util.Iterator r1 = r4.iterator()
        L448:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L46e
            java.lang.Object r4 = r1.next()
            ud.a r4 = (ud.a) r4
            java.util.ArrayList r6 = r4.f13674l
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L448
            md.f r6 = r4.f8877g
            boolean r6 = r6.a(r5)
            if (r6 != 0) goto L448
            boolean r6 = f8.i.Z(r4, r0)
            if (r6 != 0) goto L448
            r0.H(r4)
            goto L448
        L46e:
            r11.f22670q = r0
            r0 = r15
        L471:
            r3.b()
            z(r2)
            return r0
    }

    public java.util.LinkedHashMap J() {
            r13 = this;
            java.lang.Object r0 = r13.f469a
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = "entries_v1"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            java.lang.Object r0 = r13.f470b
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r13.f471c
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            return r0
        L1f:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r1 = og.m.t0(r2)
            if (r1 != 0) goto L12c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12c
            java.util.Iterator r3 = r1.keys()     // Catch: java.lang.Throwable -> L12c
        L33:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L12c
            if (r4 == 0) goto L12c
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L12c
            r4.getClass()     // Catch: java.lang.Throwable -> L12c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L12c
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L12c
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L12c
            if (r5 == 0) goto L33
            java.lang.String r6 = "likes"
            org.json.JSONArray r6 = r5.optJSONArray(r6)     // Catch: java.lang.Throwable -> L12c
            java.util.List r6 = Y(r6)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r7 = "comments"
            org.json.JSONArray r7 = r5.optJSONArray(r7)     // Catch: java.lang.Throwable -> L12c
            java.util.List r7 = W(r7)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r8 = "pendingLikes"
            org.json.JSONArray r8 = r5.optJSONArray(r8)     // Catch: java.lang.Throwable -> L12c
            java.util.List r8 = Y(r8)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r9 = "pendingComments"
            org.json.JSONArray r5 = r5.optJSONArray(r9)     // Catch: java.lang.Throwable -> L12c
            java.util.List r5 = W(r5)     // Catch: java.lang.Throwable -> L12c
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L12c
            r9.<init>()     // Catch: java.lang.Throwable -> L12c
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12c
            r10.<init>()     // Catch: java.lang.Throwable -> L12c
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L12c
        L86:
            boolean r11 = r6.hasNext()     // Catch: java.lang.Throwable -> L12c
            if (r11 == 0) goto L9f
            java.lang.Object r11 = r6.next()     // Catch: java.lang.Throwable -> L12c
            r12 = r11
            ia.d r12 = (ia.d) r12     // Catch: java.lang.Throwable -> L12c
            java.lang.String r12 = r12.f6562a     // Catch: java.lang.Throwable -> L12c
            boolean r12 = r9.add(r12)     // Catch: java.lang.Throwable -> L12c
            if (r12 == 0) goto L86
            r10.add(r11)     // Catch: java.lang.Throwable -> L12c
            goto L86
        L9f:
            java.util.HashSet r6 = new java.util.HashSet     // Catch: java.lang.Throwable -> L12c
            r6.<init>()     // Catch: java.lang.Throwable -> L12c
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12c
            r9.<init>()     // Catch: java.lang.Throwable -> L12c
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L12c
        Lad:
            boolean r11 = r7.hasNext()     // Catch: java.lang.Throwable -> L12c
            if (r11 == 0) goto Lc6
            java.lang.Object r11 = r7.next()     // Catch: java.lang.Throwable -> L12c
            r12 = r11
            ia.b r12 = (ia.b) r12     // Catch: java.lang.Throwable -> L12c
            java.lang.String r12 = r12.f6553a     // Catch: java.lang.Throwable -> L12c
            boolean r12 = r6.add(r12)     // Catch: java.lang.Throwable -> L12c
            if (r12 == 0) goto Lad
            r9.add(r11)     // Catch: java.lang.Throwable -> L12c
            goto Lad
        Lc6:
            java.util.HashSet r6 = new java.util.HashSet     // Catch: java.lang.Throwable -> L12c
            r6.<init>()     // Catch: java.lang.Throwable -> L12c
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12c
            r7.<init>()     // Catch: java.lang.Throwable -> L12c
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L12c
        Ld4:
            boolean r11 = r8.hasNext()     // Catch: java.lang.Throwable -> L12c
            if (r11 == 0) goto Led
            java.lang.Object r11 = r8.next()     // Catch: java.lang.Throwable -> L12c
            r12 = r11
            ia.d r12 = (ia.d) r12     // Catch: java.lang.Throwable -> L12c
            java.lang.String r12 = r12.f6562a     // Catch: java.lang.Throwable -> L12c
            boolean r12 = r6.add(r12)     // Catch: java.lang.Throwable -> L12c
            if (r12 == 0) goto Ld4
            r7.add(r11)     // Catch: java.lang.Throwable -> L12c
            goto Ld4
        Led:
            java.util.HashSet r6 = new java.util.HashSet     // Catch: java.lang.Throwable -> L12c
            r6.<init>()     // Catch: java.lang.Throwable -> L12c
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12c
            r8.<init>()     // Catch: java.lang.Throwable -> L12c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L12c
        Lfb:
            boolean r11 = r5.hasNext()     // Catch: java.lang.Throwable -> L12c
            if (r11 == 0) goto L116
            java.lang.Object r11 = r5.next()     // Catch: java.lang.Throwable -> L12c
            r12 = r11
            ia.b r12 = (ia.b) r12     // Catch: java.lang.Throwable -> L12c
            sf.j r12 = h(r12)     // Catch: java.lang.Throwable -> L12c
            boolean r12 = r6.add(r12)     // Catch: java.lang.Throwable -> L12c
            if (r12 == 0) goto Lfb
            r8.add(r11)     // Catch: java.lang.Throwable -> L12c
            goto Lfb
        L116:
            ia.c r5 = new ia.c     // Catch: java.lang.Throwable -> L12c
            r5.<init>(r10, r9, r7, r8)     // Catch: java.lang.Throwable -> L12c
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L12c
            if (r6 <= 0) goto L33
            boolean r6 = r5.c()     // Catch: java.lang.Throwable -> L12c
            if (r6 != 0) goto L33
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> L12c
            goto L33
        L12c:
            r13.f470b = r2
            r13.f471c = r0
            return r0
    }

    public java.lang.String K(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L13
            java.lang.Object r0 = r1.f469a
            na.k r0 = (na.k) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.f9181f
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L15
        L13:
            java.lang.String r2 = ""
        L15:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L21
            boolean r0 = B(r2)
            if (r0 == 0) goto L34
        L21:
            java.lang.String r0 = "fromusername"
            java.lang.String r3 = oa.b.e(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L34
            boolean r0 = B(r3)
            if (r0 != 0) goto L34
            r2 = r3
        L34:
            java.lang.String r2 = oa.b.g(r2)
            r2.getClass()
            return r2
    }

    public ca.a L(java.lang.Object r22, long r23) {
            r21 = this;
            r1 = r23
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.Class r3 = r22.getClass()
        Lb:
            r4 = 1
            if (r3 == 0) goto L66
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L66
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r3)
            dg.n r5 = tf.m.m1(r5)
            b4.b r6 = new b4.b
            r7 = 8
            r6.<init>(r7)
            ng.i r7 = new ng.i
            r7.<init>(r5, r4, r6)
            c9.k1 r5 = new c9.k1
            r6 = 3
            r8 = r22
            r5.<init>(r8, r6)
            ng.i r5 = ng.m.X(r7, r5)
            b4.b r6 = new b4.b
            r7 = 9
            r6.<init>(r7)
            ng.t r5 = ng.m.W(r5, r6)
            ca.c r6 = new ca.c
            r7 = 0
            r6.<init>(r1, r7)
            ng.i r7 = new ng.i
            r7.<init>(r5, r4, r6)
            ng.h r4 = new ng.h
            r4.<init>(r7)
        L51:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L61
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r0.add(r5)
            goto L51
        L61:
            java.lang.Class r3 = r3.getSuperclass()
            goto Lb
        L66:
            java.util.Iterator r3 = r0.iterator()
            r3.getClass()
        L6d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2db
            java.lang.Object r0 = r3.next()
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            r6 = r21
            java.lang.Object r7 = r6.f469a
            r8.g r7 = (r8.g) r7
            java.io.File r8 = new java.io.File
            r8.<init>(r0)
            boolean r9 = r8.isFile()
            r11 = 0
            if (r9 == 0) goto La1
            long r13 = r8.length()
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 <= 0) goto La1
            java.lang.String r0 = r8.getAbsolutePath()
        L9b:
            r10 = r0
            r16 = r11
            r5 = 0
            goto L20f
        La1:
            java.io.File r8 = new java.io.File
            android.content.Context r9 = r7.f11620a
            java.io.File r9 = r9.getCacheDir()
            java.lang.String r13 = "Hchat_live_photo"
            r8.<init>(r9, r13)
            boolean r9 = r8.isDirectory()
            if (r9 != 0) goto Lc0
            boolean r9 = r8.mkdirs()
            if (r9 != 0) goto Lc0
            r16 = r11
            r5 = 0
        Lbd:
            r10 = 0
            goto L20f
        Lc0:
            java.io.File r9 = new java.io.File
            int r13 = r0.hashCode()
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "live_"
            r14.<init>(r15)
            r14.append(r1)
            java.lang.String r15 = "_"
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = ".mp4"
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r9.<init>(r8, r13)
            boolean r8 = r9.isFile()
            if (r8 == 0) goto Lfb
            long r13 = r9.length()
            int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r8 <= 0) goto Lfb
            java.lang.String r0 = r9.getAbsolutePath()
            goto L9b
        Lfb:
            java.lang.String r8 = "com.tencent.mm.vfs.w6"
            java.lang.String r13 = "com.tencent.mm.vfs.p6"
            java.lang.String[] r8 = new java.lang.String[]{r8, r13}
            r13 = 0
        L104:
            r14 = 2
            if (r13 < r14) goto L10e
            r16 = r11
            r22 = 0
            r10 = 0
            goto L1b4
        L10e:
            r15 = r8[r13]
            r16 = r11
            java.lang.ClassLoader r11 = r7.f11622c
            java.lang.Class r11 = h.Hchat.utils.KavaReflector.loadClass(r15, r11)
            if (r11 == 0) goto L2d1
            java.lang.String r12 = "E"
            java.lang.String r15 = "F"
            java.lang.String[] r12 = new java.lang.String[]{r12, r15}
            r22 = 0
            r15 = 0
        L125:
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r15 < r14) goto L184
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredMethods(r11)
            java.util.Iterator r11 = r11.iterator()
        L131:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L164
            java.lang.Object r12 = r11.next()
            r14 = r12
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.Class[] r15 = r14.getParameterTypes()
            int r18 = r14.getModifiers()
            boolean r18 = java.lang.reflect.Modifier.isStatic(r18)
            if (r18 == 0) goto L131
            java.lang.Class r14 = r14.getReturnType()
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            boolean r5 = gg.l.a(r14, r5)
            if (r5 == 0) goto L131
            int r5 = r15.length
            if (r5 != r4) goto L131
            r5 = r15[r22]
            boolean r5 = gg.l.a(r5, r10)
            if (r5 == 0) goto L131
            goto L165
        L164:
            r12 = 0
        L165:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto L17e
            java.lang.Object[] r5 = new java.lang.Object[]{r0}
            r10 = 0
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r12, r10, r5)
            boolean r10 = r5 instanceof java.io.InputStream
            if (r10 == 0) goto L179
            java.io.InputStream r5 = (java.io.InputStream) r5
            goto L17a
        L179:
            r5 = 0
        L17a:
            if (r5 == 0) goto L17e
            r10 = r5
            goto L1b4
        L17e:
            r5 = r22
            r19 = r16
            goto L2d4
        L184:
            r5 = r12[r15]
            java.lang.Class[] r10 = new java.lang.Class[]{r10}
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethod(r11, r5, r10)
            if (r5 == 0) goto L19a
            int r10 = r5.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L1a0
        L19a:
            r5 = r22
            r19 = r16
            goto L2c8
        L1a0:
            java.lang.Object[] r10 = new java.lang.Object[]{r0}
            r4 = 0
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r4, r10)
            boolean r4 = r5 instanceof java.io.InputStream
            if (r4 == 0) goto L1b1
            r10 = r5
            java.io.InputStream r10 = (java.io.InputStream) r10
            goto L1b2
        L1b1:
            r10 = 0
        L1b2:
            if (r10 == 0) goto L19a
        L1b4:
            if (r10 == 0) goto L20b
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1e8
            r5 = r22
            r4.<init>(r9, r5)     // Catch: java.lang.Throwable -> L1dd
            g4.a.j(r10, r4)     // Catch: java.lang.Throwable -> L1e0
            r4.close()     // Catch: java.lang.Throwable -> L1dd
            r10.close()     // Catch: java.lang.Throwable -> L1d9
            java.lang.String r10 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L1d9
            boolean r0 = r9.isFile()     // Catch: java.lang.Throwable -> L1d9
            if (r0 == 0) goto L1db
            long r7 = r9.length()     // Catch: java.lang.Throwable -> L1d9
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 <= 0) goto L1db
            goto L1f8
        L1d9:
            r0 = move-exception
            goto L1f2
        L1db:
            r10 = 0
            goto L1f8
        L1dd:
            r0 = move-exception
        L1de:
            r4 = r0
            goto L1ec
        L1e0:
            r0 = move-exception
            r7 = r0
            throw r7     // Catch: java.lang.Throwable -> L1e3
        L1e3:
            r0 = move-exception
            ig.a.i(r4, r7)     // Catch: java.lang.Throwable -> L1dd
            throw r0     // Catch: java.lang.Throwable -> L1dd
        L1e8:
            r0 = move-exception
            r5 = r22
            goto L1de
        L1ec:
            throw r4     // Catch: java.lang.Throwable -> L1ed
        L1ed:
            r0 = move-exception
            ig.a.i(r10, r4)     // Catch: java.lang.Throwable -> L1d9
            throw r0     // Catch: java.lang.Throwable -> L1d9
        L1f2:
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r10 = r4
        L1f8:
            java.lang.Throwable r0 = sf.g.b(r10)
            if (r0 == 0) goto L201
            r9.delete()
        L201:
            boolean r0 = r10 instanceof sf.f
            if (r0 == 0) goto L206
            r10 = 0
        L206:
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            goto L20f
        L20b:
            r5 = r22
            goto Lbd
        L20f:
            if (r10 == 0) goto L2c5
            java.io.File r0 = new java.io.File
            r0.<init>(r10)
            boolean r4 = r0.isFile()
            if (r4 == 0) goto L2b4
            long r7 = r0.length()
            int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r4 > 0) goto L226
            goto L2b4
        L226:
            android.media.MediaMetadataRetriever r4 = new android.media.MediaMetadataRetriever
            r4.<init>()
            r4.setDataSource(r10)     // Catch: java.lang.Throwable -> L24d
            r7 = 9
            java.lang.String r7 = r4.extractMetadata(r7)     // Catch: java.lang.Throwable -> L24d
            if (r7 == 0) goto L24f
            java.lang.Long r7 = og.t.g0(r7)     // Catch: java.lang.Throwable -> L24d
            if (r7 == 0) goto L24f
            long r8 = r7.longValue()     // Catch: java.lang.Throwable -> L24d
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L245
            goto L246
        L245:
            r7 = 0
        L246:
            if (r7 == 0) goto L24f
            long r7 = r7.longValue()     // Catch: java.lang.Throwable -> L24d
            goto L251
        L24d:
            r0 = move-exception
            goto L2a2
        L24f:
            r7 = r16
        L251:
            r9 = 18
            java.lang.String r9 = r4.extractMetadata(r9)     // Catch: java.lang.Throwable -> L24d
            r11 = 10
            if (r9 == 0) goto L267
            java.lang.Integer r9 = og.t.e0(r11, r9)     // Catch: java.lang.Throwable -> L24d
            if (r9 == 0) goto L267
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L24d
            r13 = r9
            goto L268
        L267:
            r13 = r5
        L268:
            r9 = 19
            java.lang.String r9 = r4.extractMetadata(r9)     // Catch: java.lang.Throwable -> L24d
            if (r9 == 0) goto L27a
            java.lang.Integer r9 = og.t.e0(r11, r9)     // Catch: java.lang.Throwable -> L24d
            if (r9 == 0) goto L27a
            int r5 = r9.intValue()     // Catch: java.lang.Throwable -> L24d
        L27a:
            r19 = r16
            r16 = r5
            int r5 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r5 > 0) goto L288
            if (r13 > 0) goto L288
            if (r16 > 0) goto L288
            r11 = 0
            goto L2a7
        L288:
            ca.d r11 = new ca.d     // Catch: java.lang.Throwable -> L24d
            r14 = 1
            int r5 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r5 >= 0) goto L291
            r7 = r14
        L291:
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r5 <= 0) goto L299
            r7 = r14
        L299:
            int r12 = (int) r7     // Catch: java.lang.Throwable -> L24d
            long r14 = r0.length()     // Catch: java.lang.Throwable -> L24d
            r11.<init>(r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L24d
            goto L2a7
        L2a2:
            sf.f r11 = new sf.f
            r11.<init>(r0)
        L2a7:
            boolean r0 = r11 instanceof sf.f
            if (r0 == 0) goto L2ad
            r5 = 0
            goto L2ae
        L2ad:
            r5 = r11
        L2ae:
            ca.d r5 = (ca.d) r5
            r4.release()     // Catch: java.lang.Throwable -> L2b5
            goto L2b5
        L2b4:
            r5 = 0
        L2b5:
            if (r5 == 0) goto L2c5
            ca.a r7 = new ca.a
            int r8 = r5.f1470a
            int r9 = r5.f1471b
            int r13 = r5.f1472c
            long r11 = r5.f1473d
            r7.<init>(r8, r9, r10, r11, r13)
            return r7
        L2c5:
            r4 = 1
            goto L6d
        L2c8:
            int r15 = r15 + 1
            r22 = r5
            r16 = r19
            r4 = 1
            goto L125
        L2d1:
            r19 = r16
            r5 = 0
        L2d4:
            int r13 = r13 + 1
            r11 = r19
            r4 = 1
            goto L104
        L2db:
            r6 = r21
            r18 = 0
            return r18
    }

    public boolean M(int r8) {
            r7 = this;
            r0 = 5
            r1 = 6
            r2 = 2
            r3 = 1
            r4 = 7
            if (r8 != r4) goto Lb
            r7.t()
            goto L30
        Lb:
            if (r8 != r2) goto L11
            r7.t()
            goto L30
        L11:
            if (r8 != r1) goto L17
            r7.t()
            goto L30
        L17:
            if (r8 != r0) goto L1d
            r7.t()
            goto L30
        L1d:
            r5 = 3
            if (r8 != r5) goto L24
            r7.t()
            goto L30
        L24:
            r5 = 4
            if (r8 != r5) goto L2b
            r7.t()
            goto L30
        L2b:
            if (r8 != r3) goto L2e
            goto L30
        L2e:
            if (r8 != 0) goto L67
        L30:
            r5 = 0
            java.lang.String r6 = "focusManager"
            if (r8 != r1) goto L45
            java.lang.Object r8 = r7.f471c
            d1.l r8 = (d1.l) r8
            if (r8 == 0) goto L41
            d1.p r8 = (d1.p) r8
            r8.g(r3, r3)
            return r3
        L41:
            gg.l.g(r6)
            throw r5
        L45:
            if (r8 != r0) goto L57
            java.lang.Object r8 = r7.f471c
            d1.l r8 = (d1.l) r8
            if (r8 == 0) goto L53
            d1.p r8 = (d1.p) r8
            r8.g(r2, r3)
            return r3
        L53:
            gg.l.g(r6)
            throw r5
        L57:
            if (r8 != r4) goto L65
            java.lang.Object r8 = r7.f469a
            y1.g2 r8 = (y1.g2) r8
            if (r8 == 0) goto L65
            y1.i1 r8 = (y1.i1) r8
            r8.a()
            return r3
        L65:
            r8 = 0
            return r8
        L67:
            java.lang.String r8 = "invalid ImeAction"
            j8.o.A(r8)
            r8 = 0
            return r8
    }

    public void N(java.util.LinkedHashMap r13) {
            r12 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r1 = r13.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le4
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            ia.c r2 = (ia.c) r2
            boolean r4 = r2.c()
            if (r4 == 0) goto L2c
            goto Ld
        L2c:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.List r6 = r2.f6558a
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r7 = r6.hasNext()
            java.lang.String r8 = "displayName"
            java.lang.String r9 = "wxId"
            if (r7 == 0) goto L61
            java.lang.Object r7 = r6.next()
            ia.d r7 = (ia.d) r7
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r11 = r7.f6562a
            org.json.JSONObject r9 = r10.put(r9, r11)
            java.lang.String r7 = r7.f6563b
            org.json.JSONObject r7 = r9.put(r8, r7)
            r5.put(r7)
            goto L3c
        L61:
            java.lang.String r6 = "likes"
            r4.put(r6, r5)
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.List r6 = r2.f6559b
            java.util.Iterator r6 = r6.iterator()
        L71:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L85
            java.lang.Object r7 = r6.next()
            ia.b r7 = (ia.b) r7
            org.json.JSONObject r7 = X(r7)
            r5.put(r7)
            goto L71
        L85:
            java.lang.String r6 = "comments"
            r4.put(r6, r5)
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.List r6 = r2.f6560c
            java.util.Iterator r6 = r6.iterator()
        L95:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb6
            java.lang.Object r7 = r6.next()
            ia.d r7 = (ia.d) r7
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r11 = r7.f6562a
            org.json.JSONObject r10 = r10.put(r9, r11)
            java.lang.String r7 = r7.f6563b
            org.json.JSONObject r7 = r10.put(r8, r7)
            r5.put(r7)
            goto L95
        Lb6:
            java.lang.String r6 = "pendingLikes"
            r4.put(r6, r5)
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.List r2 = r2.f6561d
            java.util.Iterator r2 = r2.iterator()
        Lc6:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Lda
            java.lang.Object r6 = r2.next()
            ia.b r6 = (ia.b) r6
            org.json.JSONObject r6 = X(r6)
            r5.put(r6)
            goto Lc6
        Lda:
            java.lang.String r2 = "pendingComments"
            r4.put(r2, r5)
            r0.put(r3, r4)
            goto Ld
        Le4:
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.lang.Object r1 = r12.f469a
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "entries_v1"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r0)
            r1.commit()
            r12.f470b = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r13)
            r12.f471c = r0
            return
    }

    public void O(java.lang.Object r6) {
            r5 = this;
            long r0 = s0.i.c()
            long r2 = s0.k.f12201a
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Ld
            r5.f471c = r6
            return
        Ld:
            java.lang.Object r2 = r5.f470b
            monitor-enter(r2)
            java.lang.Object r3 = r5.f469a     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L2d
            s0.j r3 = (s0.j) r3     // Catch: java.lang.Throwable -> L2d
            int r4 = r3.a(r0)     // Catch: java.lang.Throwable -> L2d
            if (r4 >= 0) goto L2f
            java.lang.Object r4 = r5.f469a     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4     // Catch: java.lang.Throwable -> L2d
            s0.j r6 = r3.b(r6, r0)     // Catch: java.lang.Throwable -> L2d
            r4.set(r6)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return
        L2d:
            r6 = move-exception
            goto L35
        L2f:
            java.lang.Object[] r0 = r3.f12200c     // Catch: java.lang.Throwable -> L2d
            r0[r4] = r6     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return
        L35:
            monitor-exit(r2)
            throw r6
    }

    public void P(f1.u r2) {
            r1 = this;
            java.lang.Object r0 = r1.f471c
            h1.b r0 = (h1.b) r0
            h1.a r0 = r0.f5037g
            r0.f5035c = r2
            return
    }

    public synchronized void Q(java.lang.String r14, java.util.List r15) {
            r13 = this;
            monitor-enter(r13)
            r14.getClass()     // Catch: java.lang.Throwable -> L7b
            java.util.LinkedHashMap r0 = r13.J()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r0.get(r14)     // Catch: java.lang.Throwable -> L7b
            ia.c r1 = (ia.c) r1     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            if (r1 == 0) goto L13
        L11:
            r4 = r1
            goto L1b
        L13:
            ia.c r1 = new ia.c     // Catch: java.lang.Throwable -> L7b
            r3 = 15
            r1.<init>(r3, r2, r2)     // Catch: java.lang.Throwable -> L7b
            goto L11
        L1b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7b
            r1.<init>()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L7b
        L24:
            boolean r3 = r15.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r15.next()     // Catch: java.lang.Throwable -> L7b
            r5 = r3
            ia.b r5 = (ia.b) r5     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = r5.f6554b     // Catch: java.lang.Throwable -> L7b
            java.lang.CharSequence r3 = og.m.R0(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = r5.f6556d     // Catch: java.lang.Throwable -> L7b
            java.lang.CharSequence r3 = og.m.R0(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L7b
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L7b
            if (r3 != 0) goto L4c
            goto L52
        L4c:
            int r3 = r8.length()     // Catch: java.lang.Throwable -> L7b
            if (r3 != 0) goto L54
        L52:
            r3 = r2
            goto L75
        L54:
            java.lang.String r3 = r5.f6555c     // Catch: java.lang.Throwable -> L7b
            java.lang.CharSequence r3 = og.m.R0(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7b
            int r7 = r3.length()     // Catch: java.lang.Throwable -> L7b
            if (r7 != 0) goto L66
            r7 = r6
            goto L67
        L66:
            r7 = r3
        L67:
            long r9 = r5.f6557e     // Catch: java.lang.Throwable -> L7b
            r11 = 1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 >= 0) goto L70
            r9 = r11
        L70:
            r11 = 1
            ia.b r3 = ia.b.a(r5, r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L7b
        L75:
            if (r3 == 0) goto L24
            r1.add(r3)     // Catch: java.lang.Throwable -> L7b
            goto L24
        L7b:
            r0 = move-exception
            r14 = r0
            goto L127
        L7f:
            java.util.HashSet r15 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7b
            r15.<init>()     // Catch: java.lang.Throwable -> L7b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7b
            r6.<init>()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7b
        L8d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L7b
            r3 = r2
            ia.b r3 = (ia.b) r3     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = r3.f6553a     // Catch: java.lang.Throwable -> L7b
            boolean r3 = r15.add(r3)     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L8d
            r6.add(r2)     // Catch: java.lang.Throwable -> L7b
            goto L8d
        La6:
            java.util.HashSet r15 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7b
            r15.<init>()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L7b
        Laf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto Lc3
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L7b
            ia.b r2 = (ia.b) r2     // Catch: java.lang.Throwable -> L7b
            sf.j r2 = h(r2)     // Catch: java.lang.Throwable -> L7b
            r15.add(r2)     // Catch: java.lang.Throwable -> L7b
            goto Laf
        Lc3:
            java.util.List r1 = r4.f6561d     // Catch: java.lang.Throwable -> L7b
            java.util.List r2 = r4.f6559b     // Catch: java.lang.Throwable -> L7b
            java.util.ArrayList r1 = tf.m.F1(r1, r2)     // Catch: java.lang.Throwable -> L7b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7b
        Ld4:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto Lef
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L7b
            r5 = r3
            ia.b r5 = (ia.b) r5     // Catch: java.lang.Throwable -> L7b
            sf.j r5 = h(r5)     // Catch: java.lang.Throwable -> L7b
            boolean r5 = r15.contains(r5)     // Catch: java.lang.Throwable -> L7b
            if (r5 != 0) goto Ld4
            r2.add(r3)     // Catch: java.lang.Throwable -> L7b
            goto Ld4
        Lef:
            java.util.HashSet r15 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7b
            r15.<init>()     // Catch: java.lang.Throwable -> L7b
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7b
            r8.<init>()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L7b
        Lfd:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L118
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L7b
            r3 = r2
            ia.b r3 = (ia.b) r3     // Catch: java.lang.Throwable -> L7b
            sf.j r3 = h(r3)     // Catch: java.lang.Throwable -> L7b
            boolean r3 = r15.add(r3)     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto Lfd
            r8.add(r2)     // Catch: java.lang.Throwable -> L7b
            goto Lfd
        L118:
            r7 = 0
            r9 = 5
            r5 = 0
            ia.c r15 = ia.c.b(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7b
            I(r0, r14, r15)     // Catch: java.lang.Throwable -> L7b
            r13.N(r0)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r13)
            return
        L127:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7b
            throw r14
    }

    public void R(u2.c r2) {
            r1 = this;
            java.lang.Object r0 = r1.f471c
            h1.b r0 = (h1.b) r0
            h1.a r0 = r0.f5037g
            r0.f5033a = r2
            return
    }

    public void S(u2.m r2) {
            r1 = this;
            java.lang.Object r0 = r1.f471c
            h1.b r0 = (h1.b) r0
            h1.a r0 = r0.f5037g
            r0.f5034b = r2
            return
    }

    public synchronized void T(java.lang.String r11, java.util.List r12) {
            r10 = this;
            monitor-enter(r10)
            r11.getClass()     // Catch: java.lang.Throwable -> L5e
            java.util.LinkedHashMap r0 = r10.J()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = r0.get(r11)     // Catch: java.lang.Throwable -> L5e
            ia.c r1 = (ia.c) r1     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            if (r1 == 0) goto L13
        L11:
            r4 = r1
            goto L1b
        L13:
            ia.c r1 = new ia.c     // Catch: java.lang.Throwable -> L5e
            r3 = 15
            r1.<init>(r3, r2, r2)     // Catch: java.lang.Throwable -> L5e
            goto L11
        L1b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L5e
        L24:
            boolean r3 = r12.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L62
            java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> L5e
            ia.d r3 = (ia.d) r3     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = r3.f6562a     // Catch: java.lang.Throwable -> L5e
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5e
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L42
            r6 = r2
            goto L58
        L42:
            java.lang.String r3 = r3.f6563b     // Catch: java.lang.Throwable -> L5e
            java.lang.CharSequence r3 = og.m.R0(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L53
            r3 = r5
        L53:
            ia.d r6 = new ia.d     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r5, r3)     // Catch: java.lang.Throwable -> L5e
        L58:
            if (r6 == 0) goto L24
            r1.add(r6)     // Catch: java.lang.Throwable -> L5e
            goto L24
        L5e:
            r0 = move-exception
            r11 = r0
            goto L105
        L62:
            java.util.HashSet r12 = new java.util.HashSet     // Catch: java.lang.Throwable -> L5e
            r12.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r5.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5e
        L70:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L89
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L5e
            r3 = r2
            ia.d r3 = (ia.d) r3     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.f6562a     // Catch: java.lang.Throwable -> L5e
            boolean r3 = r12.add(r3)     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L70
            r5.add(r2)     // Catch: java.lang.Throwable -> L5e
            goto L70
        L89:
            java.util.HashSet r12 = new java.util.HashSet     // Catch: java.lang.Throwable -> L5e
            r12.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L5e
        L92:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto La4
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L5e
            ia.d r2 = (ia.d) r2     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r2.f6562a     // Catch: java.lang.Throwable -> L5e
            r12.add(r2)     // Catch: java.lang.Throwable -> L5e
            goto L92
        La4:
            java.util.List r1 = r4.f6560c     // Catch: java.lang.Throwable -> L5e
            java.util.List r2 = r4.f6558a     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r1 = tf.m.F1(r1, r2)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r2.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5e
        Lb5:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto Lce
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L5e
            r6 = r3
            ia.d r6 = (ia.d) r6     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = r6.f6562a     // Catch: java.lang.Throwable -> L5e
            boolean r6 = r12.contains(r6)     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto Lb5
            r2.add(r3)     // Catch: java.lang.Throwable -> L5e
            goto Lb5
        Lce:
            java.util.HashSet r12 = new java.util.HashSet     // Catch: java.lang.Throwable -> L5e
            r12.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r7.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L5e
        Ldc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto Lf5
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L5e
            r3 = r2
            ia.d r3 = (ia.d) r3     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.f6562a     // Catch: java.lang.Throwable -> L5e
            boolean r3 = r12.add(r3)     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto Ldc
            r7.add(r2)     // Catch: java.lang.Throwable -> L5e
            goto Ldc
        Lf5:
            r8 = 0
            r9 = 10
            r6 = 0
            ia.c r12 = ia.c.b(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5e
            I(r0, r11, r12)     // Catch: java.lang.Throwable -> L5e
            r10.N(r0)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r10)
            return
        L105:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5e
            throw r11
    }

    public void U(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.f471c
            h1.b r0 = (h1.b) r0
            h1.a r0 = r0.f5037g
            r0.f5036d = r2
            return
    }

    public void V(android.content.Context r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, float r19, boolean r20, java.io.File r21, long r22) {
            r14 = this;
            r0 = r15
            r1 = r17
            r2 = r22
            java.lang.String r4 = "系统回退到 "
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Object r6 = r14.f470b
            java.util.Set r6 = (java.util.Set) r6
            java.lang.String r7 = "状态 "
            java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch
            r9 = 1
            r8.<init>(r9)
            java.util.concurrent.atomic.AtomicInteger r10 = new java.util.concurrent.atomic.AtomicInteger
            r11 = -1
            r10.<init>(r11)
            ob.a r12 = new ob.a
            r13 = 0
            r12.<init>(r10, r8, r13)
            boolean r13 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L2d
            if (r13 == 0) goto L30
            android.speech.tts.TextToSpeech r13 = new android.speech.tts.TextToSpeech     // Catch: java.lang.Throwable -> L2d
            r13.<init>(r15, r12)     // Catch: java.lang.Throwable -> L2d
            goto L35
        L2d:
            r0 = move-exception
            goto L1db
        L30:
            android.speech.tts.TextToSpeech r13 = new android.speech.tts.TextToSpeech     // Catch: java.lang.Throwable -> L2d
            r13.<init>(r15, r12, r1)     // Catch: java.lang.Throwable -> L2d
        L35:
            r6.getClass()
            java.util.Collection r6 = (java.util.Collection) r6
            r6.add(r13)
            r14.k(r2)     // Catch: java.lang.Throwable -> L60
            r12 = r10
            r9 = 15
            boolean r8 = r8.await(r9, r5)     // Catch: java.lang.Throwable -> L60
            r9 = 0
            if (r8 == 0) goto L1c2
            r14.k(r2)     // Catch: java.lang.Throwable -> L60
            int r2 = r12.get()     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L1aa
            java.lang.String r2 = "mCurrentEngine"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r13, r2)     // Catch: java.lang.Throwable -> L60
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L65
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L60
            goto L66
        L60:
            r0 = move-exception
            r8 = r21
            goto L1cc
        L65:
            r2 = r9
        L66:
            if (r2 != 0) goto L6a
            java.lang.String r2 = ""
        L6a:
            java.lang.CharSequence r2 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L60
            boolean r3 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L8f
            boolean r3 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L60
            if (r3 != 0) goto L8f
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L85
            goto L8f
        L85:
            ob.b r0 = new ob.b     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r4.concat(r2)     // Catch: java.lang.Throwable -> L60
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L8f:
            boolean r1 = og.m.t0(r18)     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto Ld6
            java.util.Set r1 = r13.getVoices()     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto Lce
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L60
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L60
        La1:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L60
            r3 = r2
            android.speech.tts.Voice r3 = (android.speech.tts.Voice) r3     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L60
            r4 = r18
            boolean r3 = gg.l.a(r3, r4)     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto La1
            r9 = r2
        Lbb:
            android.speech.tts.Voice r9 = (android.speech.tts.Voice) r9     // Catch: java.lang.Throwable -> L60
            if (r9 == 0) goto Lce
            int r1 = r13.setVoice(r9)     // Catch: java.lang.Throwable -> L60
            if (r1 == r11) goto Lc6
            goto Le0
        Lc6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "TTS 角色设置失败"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        Lce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "所选 TTS 角色已不可用"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        Ld6:
            if (r20 == 0) goto Ldb
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Throwable -> L60
            goto Ldd
        Ldb:
            java.util.Locale r1 = java.util.Locale.SIMPLIFIED_CHINESE     // Catch: java.lang.Throwable -> L60
        Ldd:
            r13.setLanguage(r1)     // Catch: java.lang.Throwable -> L60
        Le0:
            float r1 = ob.p.a(r19)     // Catch: java.lang.Throwable -> L60
            int r1 = r13.setSpeechRate(r1)     // Catch: java.lang.Throwable -> L60
            if (r1 == r11) goto L1a0
            java.io.File r1 = r21.getParentFile()     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L105
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L105
            boolean r1 = r1.mkdirs()     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto Lfd
            goto L105
        Lfd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "无法创建语音缓存目录"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L60
            throw r0     // Catch: java.lang.Throwable -> L60
        L105:
            r21.delete()     // Catch: java.lang.Throwable -> L60
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r2.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "hchat_"
            r2.append(r3)     // Catch: java.lang.Throwable -> L60
            r2.append(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L60
            r0 = 1
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            ob.c r3 = new ob.c     // Catch: java.lang.Throwable -> L60
            r3.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L60
            r13.setOnUtteranceProgressListener(r3)     // Catch: java.lang.Throwable -> L60
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L60
            r3.<init>()     // Catch: java.lang.Throwable -> L60
            r4 = r16
            r8 = r21
            int r1 = r13.synthesizeToFile(r4, r3, r8, r1)     // Catch: java.lang.Throwable -> L17c
            if (r1 == r11) goto L198
            r3 = 60
            boolean r1 = r2.await(r3, r5)     // Catch: java.lang.Throwable -> L17c
            if (r1 == 0) goto L190
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L17c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L17c
            if (r0 != 0) goto L186
            boolean r0 = r8.isFile()     // Catch: java.lang.Throwable -> L17c
            if (r0 == 0) goto L17e
            long r1 = r8.length()     // Catch: java.lang.Throwable -> L17c
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L17e
            long r1 = r8.length()     // Catch: java.lang.Throwable -> L17c
            r3 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L174
            r6.remove(r13)
            r13.stop()     // Catch: java.lang.Throwable -> L170
        L170:
            r13.shutdown()     // Catch: java.lang.Throwable -> L173
        L173:
            return
        L174:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17c
            java.lang.String r1 = "语音文件超过 16 MiB"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17c
            throw r0     // Catch: java.lang.Throwable -> L17c
        L17c:
            r0 = move-exception
            goto L1cc
        L17e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17c
            java.lang.String r1 = "TTS 未生成语音文件"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17c
            throw r0     // Catch: java.lang.Throwable -> L17c
        L186:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L17c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L17c
            throw r1     // Catch: java.lang.Throwable -> L17c
        L190:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17c
            java.lang.String r1 = "TTS 合成超时"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17c
            throw r0     // Catch: java.lang.Throwable -> L17c
        L198:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17c
            java.lang.String r1 = "TTS 引擎拒绝合成"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17c
            throw r0     // Catch: java.lang.Throwable -> L17c
        L1a0:
            r8 = r21
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17c
            java.lang.String r1 = "TTS 语速设置失败"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17c
            throw r0     // Catch: java.lang.Throwable -> L17c
        L1aa:
            r8 = r21
            ob.b r0 = new ob.b     // Catch: java.lang.Throwable -> L17c
            int r1 = r12.get()     // Catch: java.lang.Throwable -> L17c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17c
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L17c
            r2.append(r1)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L17c
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L17c
            throw r0     // Catch: java.lang.Throwable -> L17c
        L1c2:
            r8 = r21
            ob.b r0 = new ob.b     // Catch: java.lang.Throwable -> L17c
            java.lang.String r1 = "连接超时"
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L17c
            throw r0     // Catch: java.lang.Throwable -> L17c
        L1cc:
            r8.delete()     // Catch: java.lang.Throwable -> L1d0
            throw r0     // Catch: java.lang.Throwable -> L1d0
        L1d0:
            r0 = move-exception
            r6.remove(r13)
            r13.stop()     // Catch: java.lang.Throwable -> L1d7
        L1d7:
            r13.shutdown()     // Catch: java.lang.Throwable -> L1da
        L1da:
            throw r0
        L1db:
            ob.b r1 = new ob.b
            java.lang.String r2 = "创建失败"
            r1.<init>(r2, r0)
            throw r1
    }

    public void Z() {
            r4 = this;
            java.lang.Object r0 = r4.f469a
            f.k0 r0 = (f.k0) r0
            java.lang.Object r1 = r4.f470b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.k(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L17
            java.lang.Object r3 = r4.f471c
            fg.a r3 = (fg.a) r3
            r2.remove(r3)
        L17:
            if (r2 == 0) goto L23
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L20
            goto L23
        L20:
            r0.m(r1, r2)
        L23:
            return
    }

    public synchronized void a(java.lang.String r9, ia.c r10) {
            r8 = this;
            monitor-enter(r8)
            r9.getClass()     // Catch: java.lang.Throwable -> L2e
            java.util.LinkedHashMap r0 = r8.J()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L2e
            r2 = r1
            ia.c r2 = (ia.c) r2     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto Laa
            java.util.List r1 = r10.f6560c     // Catch: java.lang.Throwable -> L2e
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L2e
            r3.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2e
        L1c:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L32
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L2e
            ia.d r4 = (ia.d) r4     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r4.f6562a     // Catch: java.lang.Throwable -> L2e
            r3.add(r4)     // Catch: java.lang.Throwable -> L2e
            goto L1c
        L2e:
            r0 = move-exception
            r9 = r0
            goto Lac
        L32:
            java.util.List r10 = r10.f6561d     // Catch: java.lang.Throwable -> L2e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2e
        L3d:
            boolean r4 = r10.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L51
            java.lang.Object r4 = r10.next()     // Catch: java.lang.Throwable -> L2e
            ia.b r4 = (ia.b) r4     // Catch: java.lang.Throwable -> L2e
            sf.j r4 = h(r4)     // Catch: java.lang.Throwable -> L2e
            r1.add(r4)     // Catch: java.lang.Throwable -> L2e
            goto L3d
        L51:
            java.util.List r10 = r2.f6560c     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r5.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2e
        L5c:
            boolean r4 = r10.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L75
            java.lang.Object r4 = r10.next()     // Catch: java.lang.Throwable -> L2e
            r6 = r4
            ia.d r6 = (ia.d) r6     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = r6.f6562a     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r3.contains(r6)     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L5c
            r5.add(r4)     // Catch: java.lang.Throwable -> L2e
            goto L5c
        L75:
            java.util.List r10 = r2.f6561d     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r6.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L2e
        L80:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> L2e
            r4 = r3
            ia.b r4 = (ia.b) r4     // Catch: java.lang.Throwable -> L2e
            sf.j r4 = h(r4)     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r1.contains(r4)     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L80
            r6.add(r3)     // Catch: java.lang.Throwable -> L2e
            goto L80
        L9b:
            r7 = 3
            r3 = 0
            r4 = 0
            ia.c r10 = ia.c.b(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e
            I(r0, r9, r10)     // Catch: java.lang.Throwable -> L2e
            r8.N(r0)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r8)
            return
        Laa:
            monitor-exit(r8)
            return
        Lac:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9
    }

    public void b(x1.f0 r5, x1.s r6) {
            r4 = this;
            java.lang.Object r0 = r4.f469a
            m.a r0 = (m.a) r0
            java.lang.Object r1 = r4.f470b
            m.a r1 = (m.a) r1
            java.lang.Object r2 = r4.f471c
            m.a r2 = (m.a) r2
            int r6 = r6.ordinal()
            if (r6 == 0) goto L3e
            r3 = 1
            if (r6 == r3) goto L37
            r3 = 2
            if (r6 == r3) goto L2b
            r0 = 3
            if (r6 != r0) goto L27
            x1.f0 r6 = r5.f20896n
            if (r6 == 0) goto L23
            r2.f(r5)
            return
        L23:
            r1.f(r5)
            return
        L27:
            okio.a.k()
            return
        L2b:
            x1.f0 r6 = r5.f20896n
            if (r6 == 0) goto L33
            r2.f(r5)
            return
        L33:
            r0.f(r5)
            return
        L37:
            r1.f(r5)
            r2.f(r5)
            return
        L3e:
            r0.f(r5)
            r2.f(r5)
            return
    }

    @Override // j8.q
    public void c(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f470b
            v8.q r0 = (v8.q) r0
            java.lang.Object r1 = r4.f471c
            v8.h r1 = (v8.h) r1
            ab.e r2 = new ab.e
            r3 = 14
            r2.<init>(r1, r5, r0, r3)
            r5 = 0
            r0.b(r1, r5, r2)
            return
    }

    public synchronized java.util.LinkedHashSet d() {
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r1 = r2.J()     // Catch: java.lang.Throwable -> L12
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L12
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    public java.lang.String f() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setTime(r1)
            long r1 = r0.getTimeInMillis()
            r3 = 300000(0x493e0, double:1.482197E-318)
            long r1 = r1 / r3
            long r1 = r1 * r3
            r0.setTimeInMillis(r1)
            java.lang.Object r1 = r5.f471c
            java.text.SimpleDateFormat r1 = (java.text.SimpleDateFormat) r1
            monitor-enter(r1)
            java.lang.Object r2 = r5.f471c     // Catch: java.lang.Throwable -> L33
            java.text.SimpleDateFormat r2 = (java.text.SimpleDateFormat) r2     // Catch: java.lang.Throwable -> L33
            java.util.Date r0 = r0.getTime()     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r2.format(r0)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r1)
            java.lang.String r1 = ".log"
            java.lang.String r0 = bc.e.i(r0, r1)
            return r0
        L33:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void g() {
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L2e
            java.util.LinkedHashMap r1 = r2.J()     // Catch: java.lang.Throwable -> L2e
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r2.f469a     // Catch: java.lang.Throwable -> L2e
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch: java.lang.Throwable -> L2e
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "entries_v1"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L2e
            r0.commit()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = ""
            r2.f470b = r0     // Catch: java.lang.Throwable -> L2e
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            r2.f471c = r0     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)
            return
        L2e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r0
    }

    public boolean i(x1.f0 r5) {
            r4 = this;
            x1.f0 r0 = r5.f20896n
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            java.lang.Object r3 = r4.f469a
            m.a r3 = (m.a) r3
            java.lang.Object r3 = r3.f8069h
            x1.a2 r3 = (x1.a2) r3
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L28
            java.lang.Object r3 = r4.f470b
            m.a r3 = (m.a) r3
            java.lang.Object r3 = r3.f8069h
            x1.a2 r3 = (x1.a2) r3
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L26
            goto L28
        L26:
            r5 = r1
            goto L29
        L28:
            r5 = r2
        L29:
            if (r0 != 0) goto L2e
            if (r5 == 0) goto L2e
            return r2
        L2e:
            return r1
    }

    public void j(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f470b
            b8.f r0 = (b8.f) r0
            if (r0 == 0) goto L51
            r1 = 0
            r2 = 0
            if (r5 != 0) goto L10
            java.lang.String r3 = r0.f512l
            if (r3 != 0) goto L2f
            r1 = 1
            goto L2f
        L10:
            int r3 = b8.l.f522a
            r3 = 58
            int r3 = r5.indexOf(r3)
            if (r3 <= 0) goto L1f
            java.lang.String r3 = r5.substring(r1, r3)
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 == 0) goto L29
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L29
            goto L2f
        L29:
            java.lang.String r1 = r0.f512l
            boolean r1 = r5.equals(r1)
        L2f:
            if (r1 == 0) goto L3a
            b8.f r5 = r0.r()
            r4.f470b = r5
            r4.f471c = r2
            return
        L3a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Mismatch end: "
            java.lang.String r3 = ", expect = "
            java.lang.StringBuilder r5 = bc.e.o(r2, r5, r3)
            java.lang.String r0 = r0.f512l
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L51:
            java.lang.String r0 = "Invalid state endTag "
            java.lang.String r5 = wb.en.g(r0, r5)
            j8.o.y(r5)
            return
    }

    public void k(long r3) {
            r2 = this;
            java.lang.Object r0 = r2.f471c
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            long r0 = r0.get()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L17
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            boolean r3 = r3.isInterrupted()
            if (r3 != 0) goto L17
            return
        L17:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException
            java.lang.String r4 = "TTS 合成已取消"
            r3.<init>(r4)
            throw r3
    }

    public synchronized ia.c l(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L2d
            java.util.LinkedHashMap r0 = r3.J()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L2d
            ia.c r4 = (ia.c) r4     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            java.util.List r0 = r4.f6558a     // Catch: java.lang.Throwable -> L2d
            java.util.List r0 = tf.m.P1(r0)     // Catch: java.lang.Throwable -> L2d
            java.util.List r1 = r4.f6559b     // Catch: java.lang.Throwable -> L2d
            java.util.List r1 = tf.m.P1(r1)     // Catch: java.lang.Throwable -> L2d
            java.util.List r2 = r4.f6560c     // Catch: java.lang.Throwable -> L2d
            java.util.List r2 = tf.m.P1(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.List r4 = r4.f6561d     // Catch: java.lang.Throwable -> L2d
            java.util.List r4 = tf.m.P1(r4)     // Catch: java.lang.Throwable -> L2d
            ia.c r4 = ia.c.a(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L2d
            goto L37
        L2d:
            r4 = move-exception
            goto L39
        L2f:
            ia.c r4 = new ia.c     // Catch: java.lang.Throwable -> L2d
            r0 = 15
            r1 = 0
            r4.<init>(r0, r1, r1)     // Catch: java.lang.Throwable -> L2d
        L37:
            monitor-exit(r3)
            return r4
        L39:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r4
    }

    public void m(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f469a
            j8.l r0 = (j8.l) r0
            if (r0 == 0) goto L16
            java.lang.Object r1 = r4.f471c
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 != 0) goto L13
            goto L16
        L13:
            r0.c(r5)     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    public java.lang.String n(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            java.lang.Object r0 = r6.f471c
            sa.d r0 = (sa.d) r0
            java.lang.String r1 = ""
            if (r7 == 0) goto L9
            goto La
        L9:
            r7 = r1
        La:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            r3 = 0
            if (r2 == 0) goto L14
            java.lang.String r8 = "未知"
            goto L1d
        L14:
            r8.getClass()
            java.lang.String r2 = "元"
            java.lang.String r8 = og.t.a0(r8, r2, r1, r3)
        L1d:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 == 0) goto L25
        L23:
            r2 = r1
            goto L60
        L25:
            i8.a r2 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L3d
            r2.getClass()     // Catch: java.lang.Throwable -> L3d
            g8.i r2 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L3f
            boolean r4 = r2.G()     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L3f
            java.lang.String r2 = r2.r(r9)     // Catch: java.lang.Throwable -> L3d
            goto L44
        L3d:
            r2 = move-exception
            goto L48
        L3f:
            if (r9 == 0) goto L43
            r2 = r9
            goto L44
        L43:
            r2 = r1
        L44:
            r2.getClass()     // Catch: java.lang.Throwable -> L3d
            goto L60
        L48:
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "解析会话名失败: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.a(r2)
            if (r9 == 0) goto L23
            r2 = r9
        L60:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L68
            java.lang.String r2 = "未知会话"
        L68:
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 != 0) goto L7b
            java.lang.Object r4 = r6.f469a
            na.k r4 = (na.k) r4
            java.util.concurrent.ConcurrentHashMap r4 = r4.f9182g
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            goto L7c
        L7b:
            r4 = r1
        L7c:
            java.lang.String r10 = r6.K(r10, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L87
            goto Lce
        L87:
            i8.a r1 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> Lab
            r1.getClass()     // Catch: java.lang.Throwable -> Lab
            g8.i r1 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto Lb3
            boolean r4 = r1.G()     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto Lb3
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lab
            if (r4 != 0) goto Lad
            boolean r4 = g8.i.I(r9)     // Catch: java.lang.Throwable -> Lab
            if (r4 == 0) goto Lad
            java.lang.String r9 = r1.t(r9, r10)     // Catch: java.lang.Throwable -> Lab
            goto Lb1
        Lab:
            r9 = move-exception
            goto Lb8
        Lad:
            java.lang.String r9 = r1.r(r10)     // Catch: java.lang.Throwable -> Lab
        Lb1:
            r1 = r9
            goto Lb4
        Lb3:
            r1 = r10
        Lb4:
            r1.getClass()     // Catch: java.lang.Throwable -> Lab
            goto Lce
        Lb8:
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "解析成员名失败: "
            r1.<init>(r4)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.a(r9)
            r1 = r10
        Lce:
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 == 0) goto Ld6
            java.lang.String r1 = "未知成员"
        Ld6:
            java.lang.String r9 = "@"
            java.lang.String r10 = "\u2005"
            java.lang.String r9 = eh.a.n(r9, r1, r10)
            java.lang.Object r10 = r6.f470b
            l3.l r10 = (l3.l) r10
            java.lang.String r0 = "hb_time_format"
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r10 = r10.d(r0, r4)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = a.a.M(r4, r10)
            java.lang.String r0 = "{amount}"
            java.lang.String r7 = og.t.a0(r7, r0, r8, r3)
            java.lang.String r0 = "{金额}"
            java.lang.String r7 = og.t.a0(r7, r0, r8, r3)
            java.lang.String r8 = "{talker}"
            java.lang.String r7 = og.t.a0(r7, r8, r2, r3)
            java.lang.String r8 = "{会话}"
            java.lang.String r7 = og.t.a0(r7, r8, r2, r3)
            java.lang.String r8 = "{@发红包的人}"
            java.lang.String r7 = og.t.a0(r7, r8, r9, r3)
            java.lang.String r8 = "{@sender}"
            java.lang.String r7 = og.t.a0(r7, r8, r9, r3)
            java.lang.String r8 = "{@成员}"
            java.lang.String r7 = og.t.a0(r7, r8, r9, r3)
            java.lang.String r8 = "{sender}"
            java.lang.String r7 = og.t.a0(r7, r8, r1, r3)
            java.lang.String r8 = "{成员}"
            java.lang.String r7 = og.t.a0(r7, r8, r1, r3)
            java.lang.String r8 = "{time}"
            java.lang.String r7 = og.t.a0(r7, r8, r10, r3)
            return r7
    }

    public java.lang.Object o() {
            r4 = this;
            long r0 = s0.i.c()
            long r2 = s0.k.f12201a
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Ld
            java.lang.Object r0 = r4.f471c
            return r0
        Ld:
            java.lang.Object r2 = r4.f469a
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            java.lang.Object r2 = r2.get()
            s0.j r2 = (s0.j) r2
            int r0 = r2.a(r0)
            if (r0 < 0) goto L22
            java.lang.Object[] r1 = r2.f12200c
            r0 = r1[r0]
            return r0
        L22:
            r0 = 0
            return r0
    }

    @Override // j8.q
    public void onSuccess(java.io.File r8) {
            r7 = this;
            java.lang.Object r0 = r7.f471c
            v8.h r0 = (v8.h) r0
            java.lang.Object r1 = r7.f470b
            v8.q r1 = (v8.q) r1
            java.lang.Object r2 = r7.f469a
            v8.e r2 = (v8.e) r2
            long r2 = r2.f14231e
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L3b
            long r4 = r8.length()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3b
            long r4 = r8.length()
            java.lang.String r8 = "视频下载文件不完整: "
            java.lang.String r6 = "/"
            java.lang.StringBuilder r8 = p.a.o(r4, r8, r6)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            ab.e r2 = new ab.e
            r3 = 14
            r2.<init>(r0, r8, r1, r3)
            r8 = 0
            r1.b(r0, r8, r2)
            return
        L3b:
            v8.c r2 = new v8.c
            r2.<init>(r1, r0, r8)
            v8.c r3 = new v8.c
            r3.<init>(r0, r8, r1)
            r1.b(r0, r2, r3)
            return
    }

    public f1.u p() {
            r1 = this;
            java.lang.Object r0 = r1.f471c
            h1.b r0 = (h1.b) r0
            h1.a r0 = r0.f5037g
            f1.u r0 = r0.f5035c
            return r0
    }

    public e5.a q(e5.a r3) {
            r2 = this;
            b5.d r0 = new b5.d
            java.io.Writer r3 = r3.f10661g
            d6.g r3 = (d6.g) r3
            r0.<init>(r3)
            e5.a r3 = new e5.a
            r1 = 0
            r3.<init>(r0, r1)
            return r3
    }

    public p2.b r() {
            r7 = this;
            android.os.LocaleList r0 = android.os.LocaleList.getDefault()
            java.lang.Object r1 = r7.f471c
            l3.w r1 = (l3.w) r1
            monitor-enter(r1)
            java.lang.Object r2 = r7.f470b     // Catch: java.lang.Throwable -> L32
            p2.b r2 = (p2.b) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L17
            java.lang.Object r3 = r7.f469a     // Catch: java.lang.Throwable -> L32
            android.os.LocaleList r3 = (android.os.LocaleList) r3     // Catch: java.lang.Throwable -> L32
            if (r0 != r3) goto L17
            monitor-exit(r1)
            return r2
        L17:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L32
            r4 = 0
        L21:
            if (r4 >= r2) goto L34
            p2.a r5 = new p2.a     // Catch: java.lang.Throwable -> L32
            java.util.Locale r6 = r0.get(r4)     // Catch: java.lang.Throwable -> L32
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r3.add(r5)     // Catch: java.lang.Throwable -> L32
            int r4 = r4 + 1
            goto L21
        L32:
            r0 = move-exception
            goto L3f
        L34:
            p2.b r2 = new p2.b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r7.f469a = r0     // Catch: java.lang.Throwable -> L32
            r7.f470b = r2     // Catch: java.lang.Throwable -> L32
            monitor-exit(r1)
            return r2
        L3f:
            monitor-exit(r1)
            throw r0
    }

    public u2.c s() {
            r1 = this;
            java.lang.Object r0 = r1.f471c
            h1.b r0 = (h1.b) r0
            h1.a r0 = r0.f5037g
            u2.c r0 = r0.f5033a
            return r0
    }

    public w.o0 t() {
            r1 = this;
            java.lang.Object r0 = r1.f470b
            w.o0 r0 = (w.o0) r0
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "keyboardActions"
            gg.l.g(r0)
            r0 = 0
            throw r0
    }

    public u2.m u() {
            r1 = this;
            java.lang.Object r0 = r1.f471c
            h1.b r0 = (h1.b) r0
            h1.a r0 = r0.f5037g
            u2.m r0 = r0.f5034b
            return r0
    }

    public long v() {
            r2 = this;
            java.lang.Object r0 = r2.f471c
            h1.b r0 = (h1.b) r0
            h1.a r0 = r0.f5037g
            long r0 = r0.f5036d
            return r0
    }

    public boolean w(java.lang.CharSequence r8, int r9, int r10, l3.u r11) {
            r7 = this;
            int r0 = r11.f7828c
            r0 = r0 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L64
            java.lang.Object r0 = r7.f471c
            l3.d r0 = (l3.d) r0
            m3.a r4 = r11.b()
            r5 = 8
            int r5 = r4.a(r5)
            if (r5 == 0) goto L23
            java.lang.Object r6 = r4.f8716j
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r4 = r4.f8713g
            int r5 = r5 + r4
            r6.getShort(r5)
        L23:
            r0.getClass()
            java.lang.ThreadLocal r4 = l3.d.f7783b
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L36
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4.set(r5)
        L36:
            java.lang.Object r4 = r4.get()
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.setLength(r2)
        L3f:
            if (r9 >= r10) goto L4b
            char r5 = r8.charAt(r9)
            r4.append(r5)
            int r9 = r9 + 1
            goto L3f
        L4b:
            android.text.TextPaint r8 = r0.f7784a
            java.lang.String r9 = r4.toString()
            int r10 = b3.b.f449a
            boolean r8 = r8.hasGlyph(r9)
            int r9 = r11.f7828c
            r9 = r9 & 4
            if (r8 == 0) goto L60
            r8 = r9 | 2
            goto L62
        L60:
            r8 = r9 | 1
        L62:
            r11.f7828c = r8
        L64:
            int r8 = r11.f7828c
            r8 = r8 & 3
            if (r8 != r1) goto L6b
            return r3
        L6b:
            return r2
    }

    public boolean x(java.lang.reflect.Method r4) {
            r3 = this;
            java.lang.Object r0 = r3.f471c
            java.util.Set r0 = (java.util.Set) r0
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L49
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 == 0) goto L19
            goto L49
        L19:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L26
            b9.e r2 = new b9.e     // Catch: java.lang.Throwable -> L26
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            r1.b(r4, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L2d:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 != 0) goto L34
            goto L42
        L34:
            r0.remove(r4)
            java.lang.String r4 = r4.toGenericString()
            java.lang.String r0 = "[Hchat:HideChatMenu] 安装聊天长按菜单 Hook 失败: "
            eh.a.x(r0, r4, r2)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L42:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r4 = r1.booleanValue()
            return r4
        L49:
            r0.remove(r4)
            r4 = 0
            return r4
    }

    public boolean y(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "hb_stats_today"
            java.lang.String r1 = "hb_stats_count"
            java.lang.Object r2 = r6.f470b
            na.k r2 = (na.k) r2
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            r4 = 0
            if (r3 == 0) goto L11
        Lf:
            r7 = r4
            goto L2c
        L11:
            if (r7 == 0) goto Lf
            java.lang.String r3 = f8.i.s0(r7)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L26
            java.util.Set r5 = r2.f9177b
            boolean r3 = r5.add(r3)
            if (r3 != 0) goto L26
            goto Lf
        L26:
            java.util.Set r2 = r2.f9176a
            boolean r7 = r2.add(r7)
        L2c:
            if (r7 != 0) goto L2f
            return r4
        L2f:
            r7 = 1
            java.lang.Object r2 = r6.f469a     // Catch: java.lang.Throwable -> L53
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "Hchat_redpacket_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r3)     // Catch: java.lang.Throwable -> L53
            android.content.SharedPreferences$Editor r3 = r2.edit()     // Catch: java.lang.Throwable -> L53
            int r5 = r2.getInt(r1, r4)     // Catch: java.lang.Throwable -> L53
            int r5 = r5 + r7
            android.content.SharedPreferences$Editor r1 = r3.putInt(r1, r5)     // Catch: java.lang.Throwable -> L53
            int r2 = r2.getInt(r0, r4)     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + r7
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)     // Catch: java.lang.Throwable -> L53
            r0.apply()     // Catch: java.lang.Throwable -> L53
        L53:
            return r7
    }
}
