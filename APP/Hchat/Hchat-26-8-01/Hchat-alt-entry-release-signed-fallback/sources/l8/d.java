package l8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final java.lang.String a(l8.d r2, java.lang.String r3) {
            r2.getClass()
            java.lang.CharSequence r2 = og.m.R0(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = l(r2)
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L16
            goto L28
        L16:
            og.k r3 = new og.k
            java.lang.String r0 = "&#(x[0-9a-fA-F]+|[0-9]+);"
            r3.<init>(r0)
            i2.z r0 = new i2.z
            r1 = 20
            r0.<init>(r1)
            java.lang.String r2 = r3.e(r2, r0)
        L28:
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static final java.lang.String b(l8.d r3, java.lang.String... r4) {
            r3.getClass()
            int r3 = r4.length
            r0 = 0
        L5:
            if (r0 >= r3) goto L21
            r1 = r4[r0]
            if (r1 == 0) goto L1e
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L12
            goto L1e
        L12:
            l8.d r2 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r2.getClass()
            boolean r2 = g(r1)
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            int r0 = r0 + 1
            goto L5
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L25
            return r1
        L25:
            int r3 = r4.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.String r3 = e(r3)
            return r3
    }

    public static l8.c c(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            java.lang.String r0 = ""
            if (r8 != 0) goto L5
            r8 = r0
        L5:
            java.lang.String r8 = l(r8)
            java.util.List r1 = j(r8)
            boolean r2 = r1.isEmpty()
            java.lang.String r3 = "announcement@all"
            if (r2 == 0) goto L16
            goto L2d
        L16:
            java.util.Iterator r2 = r1.iterator()
        L1a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.t.X(r4, r3)
            if (r4 == 0) goto L1a
            goto L34
        L2d:
            r2 = 1
            boolean r3 = og.m.h0(r8, r3, r2)
            if (r3 == 0) goto L37
        L34:
            l8.c r8 = l8.c.f7902j
            return r8
        L37:
            boolean r3 = r1.isEmpty()
            java.lang.String r4 = "notify@all"
            r5 = 0
            if (r3 == 0) goto L41
            goto L6e
        L41:
            java.util.Iterator r3 = r1.iterator()
        L45:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = og.t.X(r6, r4)
            if (r7 != 0) goto L6a
            java.lang.String r7 = "all"
            boolean r7 = og.t.X(r6, r7)
            if (r7 != 0) goto L6a
            java.lang.String r7 = "@all"
            boolean r6 = og.t.X(r6, r7)
            if (r6 == 0) goto L68
            goto L6a
        L68:
            r6 = r5
            goto L6b
        L6a:
            r6 = r2
        L6b:
            if (r6 == 0) goto L45
            goto Lac
        L6e:
            boolean r3 = og.m.h0(r8, r4, r2)
            if (r3 != 0) goto Lac
            java.lang.String r3 = "atall"
            java.lang.String r4 = o(r8, r3)
            java.lang.String r6 = ".msgsource.atall"
            java.lang.String r6 = i(r8, r6)
            java.lang.String r8 = i(r8, r3)
            java.lang.String[] r8 = new java.lang.String[]{r4, r6, r8}
            java.lang.String r8 = e(r8)
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            java.lang.Integer r3 = og.t.f0(r8)
            if (r3 == 0) goto La1
            int r3 = r3.intValue()
            if (r3 <= 0) goto La1
            goto Lac
        La1:
            java.lang.String r3 = "true"
            boolean r8 = r8.equalsIgnoreCase(r3)
            if (r8 == 0) goto Laa
            goto Lac
        Laa:
            r8 = r5
            goto Lad
        Lac:
            r8 = r2
        Lad:
            if (r10 != 0) goto Lb0
            r10 = r0
        Lb0:
            boolean r3 = og.m.t0(r10)
            if (r3 != 0) goto L146
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto Lbe
            goto L146
        Lbe:
            java.util.Iterator r3 = r1.iterator()
        Lc2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L146
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.t.X(r4, r10)
            if (r4 == 0) goto Lc2
            if (r9 != 0) goto Ld7
            r9 = r0
        Ld7:
            java.lang.String r0 = ":\n"
            r3 = 6
            int r0 = og.m.r0(r9, r0, r5, r5, r3)
            if (r0 <= 0) goto Le6
            int r0 = r0 + 2
            java.lang.String r9 = r9.substring(r0)
        Le6:
            r0 = r5
        Le7:
            int r3 = r9.length()
            if (r0 >= r3) goto L146
            r3 = 64
            r4 = 4
            int r0 = og.m.q0(r9, r3, r0, r4)
            if (r0 >= 0) goto Lf7
            goto L146
        Lf7:
            int r6 = r0 + 1
            r7 = 8197(0x2005, float:1.1486E-41)
            int r4 = og.m.q0(r9, r7, r6, r4)
            if (r4 >= 0) goto L102
            goto L146
        L102:
            int r0 = r4 - r0
            r7 = 40
            if (r0 > r7) goto L143
            java.lang.String r0 = r9.substring(r6, r4)
            java.lang.String r0 = og.m.L0(r0, r3, r0)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.util.Set r3 = h.Hchat.hooks.api.model.WeChatMessage.access$getAT_ALL_LABELS$cp()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r6 = r3 instanceof java.util.Collection
            if (r6 == 0) goto L12c
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L12c
            goto L143
        L12c:
            java.util.Iterator r3 = r3.iterator()
        L130:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L143
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.t.X(r6, r0)
            if (r6 == 0) goto L130
            goto L147
        L143:
            int r0 = r4 + 1
            goto Le7
        L146:
            r2 = r5
        L147:
            if (r8 != 0) goto L17e
            if (r2 == 0) goto L14c
            goto L17e
        L14c:
            boolean r8 = og.m.t0(r10)
            if (r8 != 0) goto L172
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L159
            goto L172
        L159:
            java.util.Iterator r8 = r1.iterator()
        L15d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L172
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = og.t.X(r9, r10)
            if (r9 == 0) goto L15d
            l8.c r8 = l8.c.f7900h
            return r8
        L172:
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L17b
            l8.c r8 = l8.c.f7899g
            return r8
        L17b:
            l8.c r8 = l8.c.f7903k
            return r8
        L17e:
            l8.c r8 = l8.c.f7901i
            return r8
    }

    public static java.lang.String d(java.lang.String r4) {
            if (r4 != 0) goto L4
            java.lang.String r4 = ""
        L4:
            java.lang.String r0 = ":\n"
            r1 = 0
            r2 = 6
            int r0 = og.m.r0(r4, r0, r1, r1, r2)
            if (r0 <= 0) goto L1c
            r3 = 60
            int r1 = og.m.q0(r4, r3, r1, r2)
            if (r1 <= r0) goto L1c
            int r0 = r0 + 2
            java.lang.String r4 = r4.substring(r0)
        L1c:
            return r4
    }

    public static java.lang.String e(java.lang.String... r5) {
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

    public static int f(java.lang.String r3) {
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            java.lang.String r0 = ":\n<msg>"
            r1 = 1
            boolean r0 = og.m.h0(r3, r0, r1)
            if (r0 != 0) goto L62
            java.lang.String r0 = "<appmsg"
            boolean r0 = og.m.h0(r3, r0, r1)
            if (r0 == 0) goto L16
            goto L62
        L16:
            java.lang.String r0 = "<img"
            boolean r0 = og.m.h0(r3, r0, r1)
            if (r0 == 0) goto L20
            r3 = 3
            return r3
        L20:
            java.lang.String r0 = "<voicemsg"
            boolean r0 = og.m.h0(r3, r0, r1)
            if (r0 == 0) goto L2b
            r3 = 34
            return r3
        L2b:
            java.lang.String r0 = "<videomsg"
            boolean r0 = og.m.h0(r3, r0, r1)
            if (r0 == 0) goto L36
            r3 = 43
            return r3
        L36:
            java.lang.String r0 = "<emoji"
            boolean r0 = og.m.h0(r3, r0, r1)
            if (r0 == 0) goto L41
            r3 = 47
            return r3
        L41:
            java.lang.String r0 = "<location"
            boolean r0 = og.m.h0(r3, r0, r1)
            if (r0 == 0) goto L4c
            r3 = 48
            return r3
        L4c:
            java.lang.String r0 = "revoke"
            boolean r0 = og.m.h0(r3, r0, r1)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "撤回"
            r2 = 0
            boolean r3 = og.m.h0(r3, r0, r2)
            if (r3 == 0) goto L5e
            goto L5f
        L5e:
            return r1
        L5f:
            r3 = 10002(0x2712, float:1.4016E-41)
            return r3
        L62:
            r3 = 49
            return r3
    }

    public static boolean g(java.lang.String r2) {
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            java.lang.String r0 = "@chatroom"
            r1 = 0
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "@im.chatroom"
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "@openim"
            boolean r2 = og.t.W(r2, r0, r1)
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            return r1
        L1f:
            r2 = 1
            return r2
    }

    public static boolean h(java.lang.String r4) {
            if (r4 != 0) goto L4
            java.lang.String r4 = ""
        L4:
            java.lang.String r0 = "type"
            java.lang.String r0 = o(r4, r0)
            java.lang.Integer r0 = og.t.f0(r0)
            r1 = 0
            if (r0 == 0) goto L16
            int r0 = r0.intValue()
            goto L17
        L16:
            r0 = r1
        L17:
            r2 = 51
            r3 = 1
            if (r0 != r2) goto L1d
            goto L4a
        L1d:
            if (r0 == 0) goto L20
            goto L49
        L20:
            java.lang.String r0 = "<finderFeed>"
            boolean r0 = og.m.h0(r4, r0, r3)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "<finderObject>"
            boolean r0 = og.m.h0(r4, r0, r3)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "<finderUsername>"
            boolean r0 = og.m.h0(r4, r0, r3)
            if (r0 != 0) goto L4a
            java.lang.String r0 = "<objectId>"
            boolean r0 = og.m.h0(r4, r0, r3)
            if (r0 == 0) goto L49
            java.lang.String r0 = "<objectNonceId>"
            boolean r4 = og.m.h0(r4, r0, r3)
            if (r4 == 0) goto L49
            goto L4a
        L49:
            return r1
        L4a:
            return r3
    }

    public static java.lang.String i(java.lang.String r6, java.lang.String r7) {
            r7.getClass()
            java.lang.String r0 = ""
            if (r6 != 0) goto L8
            r6 = r0
        L8:
            java.lang.String r6 = l(r6)
            boolean r1 = og.m.t0(r6)
            if (r1 != 0) goto L68
            boolean r1 = og.m.t0(r7)
            if (r1 == 0) goto L19
            goto L68
        L19:
            java.lang.String r7 = java.util.regex.Pattern.quote(r7)
            r7.getClass()
            og.k r1 = new og.k
            java.lang.String r2 = "\\s*=\\s*(['\"])(.*?)\\1"
            java.lang.String r2 = r7.concat(r2)
            r3 = 0
            r1.<init>(r2, r3)
            og.k r2 = new og.k
            java.lang.String r4 = "\\s*=\\s*<!\\[CDATA\\[(.*?)]]>"
            java.lang.String r4 = r7.concat(r4)
            r2.<init>(r4, r3)
            og.k r4 = new og.k
            java.lang.String r5 = "\\s*=\\s*([^,;\\s}]+)"
            java.lang.String r7 = r7.concat(r5)
            r4.<init>(r7, r3)
            og.k[] r7 = new og.k[]{r1, r2, r4}
        L46:
            r1 = 3
            if (r3 < r1) goto L4a
            goto L68
        L4a:
            r1 = r7[r3]
            og.i r1 = og.k.b(r1, r6)
            if (r1 == 0) goto L65
            java.util.List r6 = r1.a()
            java.lang.Object r6 = tf.m.B1(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            return r6
        L65:
            int r3 = r3 + 1
            goto L46
        L68:
            return r0
    }

    public static java.util.List j(java.lang.String r3) {
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            java.lang.String r0 = "atuserlist"
            java.lang.String r1 = o(r3, r0)
            java.lang.String r2 = ".msgsource.atuserlist"
            java.lang.String r2 = i(r3, r2)
            java.lang.String r3 = i(r3, r0)
            java.lang.String[] r3 = new java.lang.String[]{r1, r2, r3}
            java.lang.String r3 = e(r3)
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L25
            tf.t r3 = tf.t.f13167g
            return r3
        L25:
            r0 = 4
            char[] r0 = new char[r0]
            r0 = {x006e: FILL_ARRAY_DATA , data: [44, 59, 124, 32} // fill-array
            r1 = 6
            java.util.List r3 = og.m.F0(r3, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L3d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L3d
        L4d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L56:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L56
            r3.add(r1)
            goto L56
        L6d:
            return r3
    }

    public static h.Hchat.hooks.api.model.WeChatMessage k(java.lang.String r19, java.lang.String r20, java.lang.String r21, long r22, boolean r24, int r25, long r26, java.lang.String r28, java.lang.String r29) {
            java.lang.String r0 = ""
            if (r19 != 0) goto L6
            r11 = r0
            goto L8
        L6:
            r11 = r19
        L8:
            if (r20 != 0) goto Lc
            r1 = r0
            goto Le
        Lc:
            r1 = r20
        Le:
            if (r21 != 0) goto L11
            goto L13
        L11:
            r0 = r21
        L13:
            if (r24 != 0) goto L32
            boolean r2 = g(r11)
            if (r2 == 0) goto L32
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L32
            java.lang.String r2 = ":\n"
            java.lang.String r3 = r1.concat(r2)
            r4 = 0
            boolean r3 = og.t.d0(r0, r3, r4)
            if (r3 != 0) goto L32
            java.lang.String r0 = wb.en.h(r1, r2, r0)
        L32:
            r12 = r0
            h.Hchat.hooks.api.model.WeChatMessage r1 = new h.Hchat.hooks.api.model.WeChatMessage
            if (r25 <= 0) goto L3a
            r6 = r25
            goto L3f
        L3a:
            int r0 = f(r12)
            r6 = r0
        L3f:
            java.lang.String r15 = ""
            r16 = 0
            r2 = 0
            r7 = 0
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            r9 = r22
            r8 = r24
            r4 = r26
            r17 = r28
            r18 = r29
            r1.<init>(r2, r4, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
    }

    public static java.lang.String l(java.lang.String r3) {
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

    public static java.lang.String m(java.lang.String r2, java.lang.String r3) {
            r3.getClass()
            if (r2 == 0) goto L45
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto Lc
            goto L45
        Lc:
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L13
            goto L45
        L13:
            java.lang.String r0 = "\\b"
            java.lang.String r1 = "\\s*=\\s*(['\"])(.*?)\\1"
            java.lang.String r3 = eh.a.n(r0, r3, r1)
            r0 = 2
            int r1 = l3.w.f(r0)
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r1)
            r3.getClass()
            java.util.regex.Matcher r3 = r3.matcher(r2)
            r3.getClass()
            r1 = 0
            og.i r2 = a7.a.b(r3, r1, r2)
            if (r2 == 0) goto L40
            java.util.List r2 = r2.a()
            java.lang.Object r2 = tf.m.w1(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L41
        L40:
            r2 = 0
        L41:
            if (r2 != 0) goto L44
            goto L45
        L44:
            return r2
        L45:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String n(java.lang.String r4, java.lang.String r5) {
            r5.getClass()
            if (r4 == 0) goto L74
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto Lc
            goto L74
        Lc:
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L13
            goto L74
        L13:
            java.lang.String r0 = "\\b[^>]*>(.*?)</"
            java.lang.String r1 = ">"
            java.lang.String r2 = "<"
            java.lang.String r5 = bc.e.k(r2, r5, r0, r5, r1)
            og.l r0 = og.l.f9834h
            og.l r1 = og.l.f9835i
            og.l[] r0 = new og.l[]{r0, r1}
            java.util.Set r0 = tf.d0.W(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L31:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r0.next()
            og.l r3 = (og.l) r3
            int r3 = r3.f9837g
            r2 = r2 | r3
            goto L31
        L41:
            int r0 = l3.w.f(r2)
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5, r0)
            r5.getClass()
            java.util.regex.Matcher r5 = r5.matcher(r4)
            r5.getClass()
            og.i r4 = a7.a.b(r5, r1, r4)
            if (r4 == 0) goto L6f
            java.util.List r4 = r4.a()
            r5 = 1
            java.lang.Object r4 = tf.m.w1(r5, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L6f
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            goto L70
        L6f:
            r4 = 0
        L70:
            if (r4 != 0) goto L73
            goto L74
        L73:
            return r4
        L74:
            java.lang.String r4 = ""
            return r4
    }

    public static java.lang.String o(java.lang.String r5, java.lang.String r6) {
            r6.getClass()
            if (r5 == 0) goto La2
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto Ld
            goto La2
        Ld:
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L15
            goto La2
        L15:
            java.lang.String r0 = "><!\\[CDATA\\[(.*?)]]></"
            java.lang.String r1 = "<"
            java.lang.String r2 = ">"
            java.lang.String r0 = bc.e.k(r1, r6, r0, r6, r2)
            r3 = 2
            int r3 = l3.w.f(r3)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r3)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r5)
            r0.getClass()
            r3 = 0
            og.i r0 = a7.a.b(r0, r3, r5)
            r4 = 1
            if (r0 == 0) goto L47
            java.util.List r5 = r0.a()
            og.g r5 = (og.g) r5
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L47:
            java.lang.String r0 = ">(.*?)</"
            java.lang.String r6 = bc.e.k(r1, r6, r0, r6, r2)
            og.l r0 = og.l.f9835i
            og.l r1 = og.l.f9834h
            og.l[] r0 = new og.l[]{r1, r0}
            java.util.Set r0 = tf.d0.W(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = r3
        L60:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r0.next()
            og.l r2 = (og.l) r2
            int r2 = r2.f9837g
            r1 = r1 | r2
            goto L60
        L70:
            int r0 = l3.w.f(r1)
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r0)
            r6.getClass()
            java.util.regex.Matcher r6 = r6.matcher(r5)
            r6.getClass()
            og.i r5 = a7.a.b(r6, r3, r5)
            if (r5 == 0) goto L9d
            java.util.List r5 = r5.a()
            java.lang.Object r5 = tf.m.w1(r4, r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L9d
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            goto L9e
        L9d:
            r5 = 0
        L9e:
            if (r5 != 0) goto La1
            goto La2
        La1:
            return r5
        La2:
            java.lang.String r5 = ""
            return r5
    }
}
