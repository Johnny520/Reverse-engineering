package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb.l f652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib.b f653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bb.k f654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ab.b f655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Map f656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Map f657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.ThreadLocal f660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.content.SharedPreferences f661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public bb.b f663m;

    public g(r8.g r1, bb.l r2, ib.b r3, bb.k r4, ab.b r5) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f651a = r1
            r0.f652b = r2
            r0.f653c = r3
            r0.f654d = r4
            r0.f655e = r5
            java.util.Map r2 = p.a.p()
            r0.f656f = r2
            java.util.Map r2 = p.a.p()
            r0.f657g = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r0.f658h = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r0.f659i = r2
            java.lang.ThreadLocal r2 = new java.lang.ThreadLocal
            r2.<init>()
            r0.f660j = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_real_tail_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f661k = r1
            return
    }

    public static java.lang.String e(java.lang.Object r8) {
            r0 = 0
            if (r8 != 0) goto L4
            goto L17
        L4:
            java.lang.String r1 = "field_xml"
            java.lang.String r2 = "xml"
            java.lang.String r3 = "field_content"
            java.lang.String r4 = "content"
            java.lang.String r5 = "msgContent"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r1, r2}
            r2 = 0
            r3 = r2
        L14:
            r4 = 5
            if (r3 < r4) goto L18
        L17:
            return r0
        L18:
            r4 = r1[r3]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r8, r4)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L25
            java.lang.String r4 = (java.lang.String) r4
            goto L26
        L25:
            r4 = r0
        L26:
            if (r4 == 0) goto L68
            java.lang.String r5 = ":\n"
            r6 = 6
            int r7 = og.m.r0(r4, r5, r2, r2, r6)
            if (r7 <= 0) goto L36
            int r5 = og.m.r0(r4, r5, r2, r2, r6)
            goto L44
        L36:
            java.lang.String r5 = ":\r\n"
            int r7 = og.m.r0(r4, r5, r2, r2, r6)
            if (r7 <= 0) goto L43
            int r5 = og.m.r0(r4, r5, r2, r2, r6)
            goto L44
        L43:
            r5 = -1
        L44:
            java.lang.String r6 = ""
            if (r5 <= 0) goto L5f
            r7 = 80
            if (r5 <= r7) goto L4d
            goto L5f
        L4d:
            java.lang.String r4 = r4.substring(r2, r5)
            og.k r5 = bb.l.f693c
            boolean r5 = zb.c.b(r4)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            r4 = r0
        L5b:
            if (r4 != 0) goto L5e
            goto L5f
        L5e:
            r6 = r4
        L5f:
            og.k r4 = bb.l.f693c
            boolean r4 = zb.c.b(r6)
            if (r4 == 0) goto L68
            return r6
        L68:
            int r3 = r3 + 1
            goto L14
    }

    public static void i(android.widget.TextView r2) {
            a9.c r2 = a9.i.b(r2)
            if (r2 == 0) goto L10
            a9.d r0 = a9.i.f(r2)
            r1 = 0
            r0.f85b = r1
            a9.i.a(r2)
        L10:
            return
    }

    public static void j(android.widget.TextView r2) {
            a9.c r2 = a9.i.b(r2)
            if (r2 == 0) goto L11
            a9.d r0 = a9.i.f(r2)
            java.lang.String r1 = ""
            r0.f87d = r1
            a9.i.a(r2)
        L11:
            return
    }

    public static boolean l(java.lang.String r2) {
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.c()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            int r1 = r0.length()
            if (r1 <= 0) goto L1e
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1e
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public final void a(java.lang.String r4) {
            r3 = this;
            java.lang.String r4 = p.a.l(r4, r4)
            og.k r0 = bb.l.f693c
            boolean r0 = zb.c.b(r4)
            if (r0 != 0) goto Ld
            goto L1c
        Ld:
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r0 == 0) goto L1c
            a1.d r1 = new a1.d
            r2 = 4
            r1.<init>(r3, r2, r4)
            r0.e(r1)
        L1c:
            return
    }

    public final void b(android.widget.TextView r5) {
            r4 = this;
            ib.b r0 = r4.f653c
            android.content.SharedPreferences r0 = r0.f6650a
            int r1 = r5.getVisibility()
            if (r1 == 0) goto Lb
            return
        Lb:
            a9.c r5 = a9.i.d(r5)
            java.lang.String r1 = "nickname_color"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.getString(r1, r2)
            y9.f r1 = a7.a.G(r1)
            og.k r2 = bb.l.f693c
            java.lang.String r2 = "nickname_weight"
            r3 = 400(0x190, float:5.6E-43)
            int r0 = r0.getInt(r2, r3)
            int r0 = fb.v0.h(r0)
            a9.d r2 = a9.i.f(r5)
            a9.a r3 = new a9.a
            r3.<init>(r1, r0)
            r2.f85b = r3
            a9.i.a(r5)
            return
    }

    public final boolean c(android.widget.TextView r20, java.lang.String r21, java.lang.String r22) {
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r3 = r22
            og.k r4 = bb.l.f693c
            boolean r4 = zb.c.b(r2)
            r5 = 0
            if (r4 != 0) goto L13
            goto L29a
        L13:
            java.util.Map r4 = r1.f657g
            r4.getClass()
            java.util.Map r4 = (java.util.Map) r4
            r4.put(r0, r2)
            bb.l r4 = r1.f652b
            java.lang.String r4 = r4.c(r2)
            int r6 = r4.length()
            if (r6 != 0) goto L2d
            j(r0)
            return r5
        L2d:
            int r6 = r0.getVisibility()
            if (r6 == 0) goto L35
            r6 = 1
            goto L36
        L35:
            r6 = r5
        L36:
            if (r6 == 0) goto L3b
            r0.setVisibility(r5)
        L3b:
            a9.c r8 = a9.i.d(r0)
            java.lang.CharSequence r9 = a9.i.c(r0)
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            java.lang.String r11 = ""
            if (r6 == 0) goto L4a
            r9 = r11
        L4a:
            r10.<init>(r9)
            r6 = r5
        L4e:
            r9 = 40
            r12 = 6
            r14 = 4
            java.lang.String r15 = " "
            r16 = 41
            r17 = 65289(0xff09, float:9.149E-41)
            r13 = 65288(0xff08, float:9.1488E-41)
            if (r6 >= r14) goto Led
            java.lang.String r14 = r10.toString()
            r14.getClass()
            int r7 = og.m.w0(r14, r9, r5, r12)
            int r9 = og.m.w0(r14, r13, r5, r12)
            int r7 = java.lang.Math.max(r7, r9)
            if (r7 < 0) goto Led
            int r9 = r14.length()
            int r9 = r9 + (-2)
            if (r7 < r9) goto L7d
            goto Led
        L7d:
            char r9 = r14.charAt(r7)
            if (r9 != r13) goto L86
            r9 = r17
            goto L88
        L86:
            r9 = r16
        L88:
            char r13 = og.m.u0(r14)
            if (r13 == r9) goto L8f
            goto Led
        L8f:
            int r9 = r7 + 1
            r13 = 1
            java.lang.String r9 = wb.en.f(r13, r9, r14)
            int r13 = r9.length()
            if (r13 != 0) goto L9d
            goto Led
        L9d:
            int r13 = r9.length()
            r14 = 64
            if (r13 <= r14) goto La6
            goto Led
        La6:
            r13 = 42
            boolean r14 = og.m.i0(r9, r13)
            if (r14 == 0) goto Laf
            goto Le2
        Laf:
            boolean r13 = r9.equals(r4)
            if (r13 != 0) goto Le2
            java.lang.String r13 = r4.concat(r15)
            boolean r13 = og.t.d0(r9, r13, r5)
            if (r13 == 0) goto Lc0
            goto Le2
        Lc0:
            r13 = 1
            java.lang.String r14 = og.m.Q0(r13, r4)
            int r13 = r14.length()
            if (r13 <= 0) goto Ld2
            boolean r13 = og.t.W(r9, r14, r5)
            if (r13 == 0) goto Ld2
            goto Le2
        Ld2:
            java.lang.String r13 = " 男"
            boolean r13 = og.m.h0(r9, r13, r5)
            if (r13 != 0) goto Le2
            java.lang.String r13 = " 女"
            boolean r9 = og.m.h0(r9, r13, r5)
            if (r9 == 0) goto Led
        Le2:
            int r9 = r10.length()
            r10.delete(r7, r9)
            int r6 = r6 + 1
            goto L4e
        Led:
            boolean r6 = og.m.t0(r3)
            if (r6 == 0) goto Lf5
            goto L15e
        Lf5:
            java.lang.String r6 = r10.toString()
            r6.getClass()
            r7 = 40
            int r9 = og.m.w0(r6, r7, r5, r12)
            r7 = 65288(0xff08, float:9.1488E-41)
            int r13 = og.m.w0(r6, r7, r5, r12)
            int r9 = java.lang.Math.max(r9, r13)
            if (r9 < 0) goto L15e
            int r13 = r6.length()
            int r13 = r13 + (-2)
            if (r9 < r13) goto L118
            goto L15e
        L118:
            char r13 = r6.charAt(r9)
            if (r13 != r7) goto L121
            r7 = r17
            goto L123
        L121:
            r7 = r16
        L123:
            char r13 = og.m.u0(r6)
            if (r13 == r7) goto L12a
            goto L15e
        L12a:
            int r7 = r9 + 1
            r13 = 1
            java.lang.String r6 = wb.en.f(r13, r7, r6)
            int r7 = r6.length()
            if (r7 != 0) goto L138
            goto L15e
        L138:
            int r7 = r6.length()
            r14 = 16
            if (r7 <= r14) goto L141
            goto L15e
        L141:
            java.lang.String r7 = og.m.Q0(r13, r3)
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L157
            int r3 = r7.length()
            if (r3 <= 0) goto L15e
            boolean r3 = og.t.W(r6, r7, r5)
            if (r3 == 0) goto L15e
        L157:
            int r3 = r10.length()
            r10.delete(r9, r3)
        L15e:
            r3 = r5
        L15f:
            r6 = 4
            if (r3 >= r6) goto L1ba
            java.lang.String r7 = r10.toString()
            r7.getClass()
            r9 = 40
            int r13 = og.m.w0(r7, r9, r5, r12)
            r14 = 65288(0xff08, float:9.1488E-41)
            int r6 = og.m.w0(r7, r14, r5, r12)
            int r6 = java.lang.Math.max(r13, r6)
            if (r6 < 0) goto L1ba
            int r13 = r7.length()
            int r13 = r13 + (-2)
            if (r6 < r13) goto L185
            goto L1ba
        L185:
            char r13 = r7.charAt(r6)
            if (r13 != r14) goto L18e
            r13 = r17
            goto L190
        L18e:
            r13 = r16
        L190:
            char r9 = og.m.u0(r7)
            if (r9 == r13) goto L197
            goto L1ba
        L197:
            int r9 = r6 + 1
            r13 = 1
            java.lang.String r7 = wb.en.f(r13, r9, r7)
            int r9 = r7.length()
            if (r13 > r9) goto L1ba
            r13 = 17
            if (r9 >= r13) goto L1ba
            r13 = 42
            boolean r7 = og.m.i0(r7, r13)
            if (r7 == 0) goto L1ba
            int r7 = r10.length()
            r10.delete(r6, r7)
            int r3 = r3 + 1
            goto L15f
        L1ba:
            r3 = r5
            r6 = r3
        L1bc:
            int r7 = r10.length()
            r9 = 32
            if (r6 >= r7) goto L1ef
            char r7 = r10.charAt(r6)
            r12 = 10
            if (r7 == r12) goto L1df
            r12 = 13
            if (r7 == r12) goto L1df
            r12 = 9
            if (r7 == r12) goto L1df
            if (r7 == r9) goto L1df
            r9 = 12288(0x3000, float:1.7219E-41)
            if (r7 != r9) goto L1db
            goto L1df
        L1db:
            int r6 = r6 + 1
            r3 = r5
            goto L1bc
        L1df:
            if (r3 == 0) goto L1e7
            int r7 = r6 + 1
            r10.delete(r6, r7)
            goto L1bc
        L1e7:
            int r3 = r6 + 1
            r10.replace(r6, r3, r15)
            r6 = r3
            r3 = 1
            goto L1bc
        L1ef:
            int r3 = r10.length()
            if (r3 <= 0) goto L200
            char r3 = r10.charAt(r5)
            if (r3 != r9) goto L200
            r13 = 1
            r10.delete(r5, r13)
            goto L1ef
        L200:
            r13 = 1
            int r3 = r10.length()
            if (r3 <= 0) goto L21f
            int r3 = r10.length()
            int r3 = r3 - r13
            char r3 = r10.charAt(r3)
            if (r3 != r9) goto L21f
            int r3 = r10.length()
            int r3 = r3 - r13
            int r6 = r10.length()
            r10.delete(r3, r6)
            goto L200
        L21f:
            java.lang.String r3 = r10.toString()
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            int r6 = r3.length()
            java.lang.String r7 = "微信用户（"
            java.lang.String r9 = "微信用户("
            r12 = 0
            if (r6 <= 0) goto L23a
            goto L26f
        L23a:
            g8.i r3 = wb.en.c()
            if (r3 == 0) goto L26d
            java.lang.String r3 = r3.r(r2)
            if (r3 == 0) goto L26d
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L26d
            java.lang.String r6 = "\\s+"
            java.lang.String r3 = j8.b.h(r6, r3, r15)
            boolean r6 = og.m.t0(r3)
            if (r6 != 0) goto L269
            boolean r6 = og.t.d0(r3, r9, r5)
            if (r6 != 0) goto L269
            boolean r6 = og.t.d0(r3, r7, r5)
            if (r6 != 0) goto L269
            goto L26a
        L269:
            r3 = r12
        L26a:
            if (r3 == 0) goto L26d
            goto L26f
        L26d:
            java.lang.String r3 = " "
        L26f:
            boolean r6 = og.t.d0(r3, r9, r5)
            if (r6 != 0) goto L2d8
            boolean r6 = og.t.d0(r3, r7, r5)
            if (r6 == 0) goto L27c
            goto L2d8
        L27c:
            java.lang.String r6 = r10.toString()
            boolean r6 = gg.l.a(r6, r3)
            if (r6 != 0) goto L28c
            r10.clear()
            r10.append(r3)
        L28c:
            java.lang.ThreadLocal r3 = r1.f660j
            java.lang.Object r6 = r3.get()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L29b
        L29a:
            return r5
        L29b:
            r3.set(r7)     // Catch: java.lang.Throwable -> L2d1
            java.util.ArrayList r2 = r1.f(r2, r4)     // Catch: java.lang.Throwable -> L2d1
            a9.d r4 = a9.i.e(r8)     // Catch: java.lang.Throwable -> L2d1
            r4.f84a = r10     // Catch: java.lang.Throwable -> L2d1
            a9.i.a(r8)     // Catch: java.lang.Throwable -> L2d1
            r0.setHorizontallyScrolling(r5)     // Catch: java.lang.Throwable -> L2ba
            r0.setEllipsize(r12)     // Catch: java.lang.Throwable -> L2ba
            r0.setSingleLine(r5)     // Catch: java.lang.Throwable -> L2ba
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0.setMaxLines(r4)     // Catch: java.lang.Throwable -> L2ba
        L2ba:
            java.util.Map r0 = a9.i.f102a     // Catch: java.lang.Throwable -> L2d1
            android.text.SpannableStringBuilder r0 = r1.d(r2)     // Catch: java.lang.Throwable -> L2d1
            a9.d r2 = a9.i.f(r8)     // Catch: java.lang.Throwable -> L2d1
            r2.f87d = r0     // Catch: java.lang.Throwable -> L2d1
            a9.i.a(r8)     // Catch: java.lang.Throwable -> L2d1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.set(r0)
            r18 = 1
            return r18
        L2d1:
            r0 = move-exception
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3.set(r2)
            throw r0
        L2d8:
            a9.d r0 = a9.i.f(r8)
            r0.f87d = r11
            a9.i.a(r8)
            return r5
    }

    public final android.text.SpannableStringBuilder d(java.util.ArrayList r10) {
            r9 = this;
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            java.lang.String r1 = "bracket_color"
            bb.l r2 = r9.f652b
            y9.f r1 = r2.b(r1)
            java.lang.String r3 = "bracket_weight"
            int r2 = r2.f(r3)
            int r3 = r0.length()
            java.lang.String r4 = "("
            r0.append(r4)
            a9.e r4 = new a9.e
            r4.<init>(r1, r2)
            int r5 = r0.length()
            r6 = 33
            r0.setSpan(r4, r3, r5, r6)
            java.util.Iterator r10 = r10.iterator()
            r3 = 0
        L2f:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r10.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L61
            bb.f r4 = (bb.f) r4
            if (r3 <= 0) goto L46
            java.lang.String r3 = " "
            r0.append(r3)
        L46:
            int r3 = r0.length()
            java.lang.String r7 = r4.f648a
            r0.append(r7)
            a9.e r7 = new a9.e
            y9.f r8 = r4.f649b
            int r4 = r4.f650c
            r7.<init>(r8, r4)
            int r4 = r0.length()
            r0.setSpan(r7, r3, r4, r6)
            r3 = r5
            goto L2f
        L61:
            a.a.Q0()
            r10 = 0
            throw r10
        L66:
            int r10 = r0.length()
            java.lang.String r3 = ")"
            r0.append(r3)
            a9.e r3 = new a9.e
            r3.<init>(r1, r2)
            int r1 = r0.length()
            r0.setSpan(r3, r10, r1, r6)
            return r0
    }

    public final java.util.ArrayList f(java.lang.String r11, java.lang.String r12) {
            r10 = this;
            bb.f r0 = new bb.f
            bb.l r1 = r10.f652b
            java.lang.String r2 = "tail_color"
            y9.f r2 = r1.b(r2)
            java.lang.String r3 = "tail_weight"
            int r3 = r1.f(r3)
            r0.<init>(r12, r2, r3)
            bb.f[] r12 = new bb.f[]{r0}
            java.util.ArrayList r12 = a.a.C0(r12)
            android.content.SharedPreferences r0 = r1.f694a
            java.lang.String r2 = "show_gender"
            r3 = 0
            boolean r2 = r0.getBoolean(r2, r3)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L69
            g8.i r2 = wb.en.c()
            if (r2 == 0) goto L33
            int r2 = r2.s(r11)
            goto L34
        L33:
            r2 = r3
        L34:
            java.lang.String r2 = r1.d(r2)
            int r6 = r2.length()
            if (r6 <= 0) goto L40
            r6 = r4
            goto L41
        L40:
            r6 = r3
        L41:
            if (r6 == 0) goto L45
            r6 = r2
            goto L46
        L45:
            r6 = r5
        L46:
            if (r6 == 0) goto L5c
            bb.f r7 = new bb.f
            java.lang.String r8 = "gender_color"
            y9.f r8 = r1.b(r8)
            java.lang.String r9 = "gender_weight"
            int r9 = r1.f(r9)
            r7.<init>(r6, r8, r9)
            r12.add(r7)
        L5c:
            int r2 = r2.length()
            if (r2 != 0) goto L69
            bb.b r2 = r10.f663m
            if (r2 == 0) goto L69
            r2.j(r11)
        L69:
            java.lang.String r2 = "show_region"
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto Lc2
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L90
            java.lang.String r0 = r0.z(r11)
            if (r0 == 0) goto L90
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L90
            java.lang.String r2 = "\\s+"
            java.lang.String r6 = " "
            java.lang.String r0 = j8.b.h(r2, r0, r6)
            goto L91
        L90:
            r0 = r5
        L91:
            if (r0 != 0) goto L95
            java.lang.String r0 = ""
        L95:
            int r2 = r0.length()
            if (r2 <= 0) goto L9c
            r3 = r4
        L9c:
            if (r3 == 0) goto L9f
            r5 = r0
        L9f:
            if (r5 == 0) goto Lb5
            bb.f r2 = new bb.f
            java.lang.String r3 = "region_color"
            y9.f r3 = r1.b(r3)
            java.lang.String r4 = "region_weight"
            int r1 = r1.f(r4)
            r2.<init>(r5, r3, r1)
            r12.add(r2)
        Lb5:
            int r0 = r0.length()
            if (r0 != 0) goto Lc2
            bb.b r0 = r10.f663m
            if (r0 == 0) goto Lc2
            r0.j(r11)
        Lc2:
            return r12
    }

    public final java.util.List g(java.lang.String... r5) {
            r4 = this;
            r8.g r0 = r4.f651a
            org.luckypray.dexkit.DexKitBridge r1 = r0.f11623d     // Catch: java.lang.Throwable -> L4c
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.List r5 = tf.l.L0(r5)     // Catch: java.lang.Throwable -> L4c
            fh.k.u0(r3, r5)     // Catch: java.lang.Throwable -> L4c
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L4c
            hh.p r5 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4c
        L24:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L4c
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L4c
            java.lang.ClassLoader r3 = r0.f11622c     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            r2 = r3
        L3e:
            boolean r3 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L44
            r2 = 0
        L44:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L24
            r1.add(r2)     // Catch: java.lang.Throwable -> L4c
            goto L24
        L4c:
            r5 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r5)
        L52:
            java.lang.Throwable r5 = sf.g.b(r1)
            if (r5 != 0) goto L59
            goto L62
        L59:
            ab.b r0 = r4.f655e
            java.lang.String r1 = "实名尾字定位方法失败"
            r0.invoke(r1, r5)
            tf.t r1 = tf.t.f13167g
        L62:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public final java.lang.reflect.Field h(java.lang.Class r10) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L5
            goto L78
        L5:
            java.util.concurrent.ConcurrentHashMap r1 = r9.f658h
            java.lang.Object r2 = r1.get(r10)
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L10
            return r2
        L10:
            r2 = r10
        L11:
            if (r2 == 0) goto L78
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L78
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class r6 = r5.getType()
            java.lang.Class<android.widget.TextView> r7 = android.widget.TextView.class
            boolean r6 = gg.l.a(r6, r7)
            r7 = 0
            if (r6 == 0) goto L67
            java.lang.String r6 = r5.getName()
            java.lang.String r8 = "userTV"
            boolean r6 = gg.l.a(r6, r8)
            if (r6 != 0) goto L66
            java.lang.String r6 = r5.getName()
            java.lang.String r8 = "brc"
            boolean r6 = gg.l.a(r6, r8)
            if (r6 != 0) goto L66
            java.lang.String r5 = r5.getName()
            r5.getClass()
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r8 = "user"
            boolean r5 = bc.e.t(r5, r6, r8, r7)
            if (r5 == 0) goto L67
        L66:
            r7 = 1
        L67:
            if (r7 == 0) goto L23
            goto L6b
        L6a:
            r4 = r0
        L6b:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            if (r4 == 0) goto L73
            r1.put(r10, r4)
            return r4
        L73:
            java.lang.Class r2 = r2.getSuperclass()
            goto L11
        L78:
            return r0
    }

    public final boolean k(java.lang.Class r14) {
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            java.util.concurrent.ConcurrentHashMap r1 = r13.f659i
            java.lang.Object r2 = r1.get(r14)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L13
            boolean r14 = r2.booleanValue()
            return r14
        L13:
            java.lang.String r2 = r14.getName()
            java.lang.String r3 = "com.tencent.mm.storage."
            boolean r2 = og.t.d0(r2, r3, r0)
            r3 = 1
            if (r2 != 0) goto L74
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r14)
            if (r2 == 0) goto L2d
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L2d
            goto L75
        L2d:
            java.util.Iterator r2 = r2.iterator()
        L31:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L71
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L71
            java.lang.String r11 = "getSender"
            java.lang.String r12 = "getSendTalker"
            java.lang.String r6 = "R1"
            java.lang.String r7 = "P1"
            java.lang.String r8 = "o0"
            java.lang.String r9 = "x0"
            java.lang.String r10 = "j0"
            java.lang.String[] r5 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}
            java.lang.String r4 = r4.getName()
            boolean r4 = tf.l.m0(r5, r4)
            if (r4 == 0) goto L71
            r4 = r3
            goto L72
        L71:
            r4 = r0
        L72:
            if (r4 == 0) goto L31
        L74:
            r0 = r3
        L75:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1.put(r14, r2)
            return r0
    }

    public final boolean m(java.lang.reflect.Method r6) {
            r5 = this;
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r0 = r6.length
            r1 = 3
            r2 = 0
            if (r0 < r1) goto L43
            int r0 = r6.length
            r1 = r2
        Lb:
            if (r1 >= r0) goto L43
            r3 = r6[r1]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L40
            int r0 = r6.length
            r1 = r2
        L21:
            if (r1 >= r0) goto L43
            r3 = r6[r1]
            boolean r3 = r5.k(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3d
            r6 = r6[r2]
            java.lang.reflect.Field r6 = r5.h(r6)
            if (r6 == 0) goto L43
            r6 = 1
            return r6
        L3d:
            int r1 = r1 + 1
            goto L21
        L40:
            int r1 = r1 + 1
            goto Lb
        L43:
            return r2
    }
}
