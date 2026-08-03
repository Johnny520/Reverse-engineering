package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f6787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f6788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.ClassLoader f6789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final org.luckypray.dexkit.DexKitBridge f6790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q8.o f6791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fb.k1 f6792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.LinkedHashMap f6793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f6794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f6795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f6796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile java.lang.String f6797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f6798l;

    public h(android.content.Context r1, h.Hchat.dexkit.DexFinder r2, java.lang.ClassLoader r3, org.luckypray.dexkit.DexKitBridge r4, q8.o r5, j8.o r6) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f6787a = r1
            r0.f6788b = r2
            r0.f6789c = r3
            r0.f6790d = r4
            r0.f6791e = r5
            fb.k1 r1 = new fb.k1
            r2 = 1
            r3 = 80
            r4 = 1061158912(0x3f400000, float:0.75)
            r5 = 1
            r1.<init>(r3, r4, r5, r2)
            r0.f6792f = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.f6793g = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f6794h = r1
            r0.f6796j = r5
            java.lang.String r1 = ""
            r0.f6797k = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r0.f6798l = r1
            return
    }

    public static java.lang.String C(java.lang.String r4, java.lang.String r5) {
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L7
            goto L5c
        L7:
            java.lang.String r0 = "(?:\\s[^>]*)?>(.*?)</"
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
        L25:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r0.next()
            og.l r3 = (og.l) r3
            int r3 = r3.f9837g
            r2 = r2 | r3
            goto L25
        L35:
            int r0 = l3.w.f(r2)
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5, r0)
            r5.getClass()
            java.util.regex.Matcher r5 = r5.matcher(r4)
            r5.getClass()
            og.i r4 = a7.a.b(r5, r1, r4)
            if (r4 == 0) goto L59
            java.util.List r4 = r4.a()
            r5 = 1
            java.lang.Object r4 = tf.m.w1(r5, r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L5a
        L59:
            r4 = 0
        L5a:
            if (r4 != 0) goto L5e
        L5c:
            java.lang.String r4 = ""
        L5e:
            return r4
    }

    public static java.lang.String D(java.lang.String r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 < r0) goto L7
            java.lang.String r4 = ""
            return r4
        L7:
            r2 = r5[r1]
            java.lang.String r2 = C(r4, r2)
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "<![CDATA["
            java.lang.String r2 = og.m.A0(r2, r3)
            java.lang.String r3 = "]]>"
            java.lang.String r2 = og.m.B0(r2, r3)
            java.lang.String r2 = h(r2)
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r1 = r1 + 1
            goto L2
    }

    public static final void a(j8.h r1, java.lang.String r2, java.lang.Throwable r3) {
            if (r3 != 0) goto L3
            goto L10
        L3:
            r1.getClass()
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = ": "
            java.lang.String r2 = wb.en.h(r2, r0, r3)
        L10:
            r1.getClass()
            i8.i.f(r2)
            return
    }

    public static java.lang.String e(java.lang.String r1) {
            java.lang.String r1 = h(r1)
            boolean r0 = o(r1)
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 != 0) goto L10
            java.lang.String r1 = ""
        L10:
            return r1
    }

    public static void f(java.lang.Object r4, java.util.ArrayList r5, java.util.HashSet r6, int r7) {
            if (r4 == 0) goto Lbb
            r0 = 3
            if (r7 > r0) goto Lbb
            boolean r0 = r6.add(r4)
            if (r0 != 0) goto Ld
            goto Lbb
        Ld:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L39
            og.k r6 = new og.k
            java.lang.String r7 = "(?:wxid_[A-Za-z0-9_-]+|gh_[A-Za-z0-9_-]+|[A-Za-z0-9_-]+@(?:im\\.)?chatroom)"
            r6.<init>(r7)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            ng.c r4 = og.k.c(r6, r4)
            f.i0 r6 = new f.i0
            r6.<init>(r4)
        L23:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto Lbb
            java.lang.Object r4 = r6.next()
            og.f r4 = (og.f) r4
            og.i r4 = (og.i) r4
            java.lang.String r4 = r4.c()
            r5.add(r4)
            goto L23
        L39:
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L53
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L43:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r4.next()
            int r1 = r7 + 1
            f(r0, r5, r6, r1)
            goto L43
        L53:
            boolean r0 = r4 instanceof java.lang.Object[]
            r1 = 0
            if (r0 == 0) goto L67
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r4.length
        L5b:
            if (r1 >= r0) goto Lbb
            r2 = r4[r1]
            int r3 = r7 + 1
            f(r2, r5, r6, r3)
            int r1 = r1 + 1
            goto L5b
        L67:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "java."
            boolean r2 = og.t.d0(r0, r2, r1)
            if (r2 != 0) goto Lbb
            java.lang.String r2 = "android."
            boolean r0 = og.t.d0(r0, r2, r1)
            if (r0 == 0) goto L80
            goto Lbb
        L80:
            java.lang.Class r0 = r4.getClass()
        L84:
            if (r0 == 0) goto Lbb
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lbb
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L96:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r3 = r2.getType()
            boolean r3 = r3.isPrimitive()
            if (r3 != 0) goto L96
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r4)
            int r3 = r7 + 1
            f(r2, r5, r6, r3)
            goto L96
        Lb6:
            java.lang.Class r0 = r0.getSuperclass()
            goto L84
        Lbb:
            return
    }

    public static void g(java.lang.Object r5, java.util.ArrayList r6, java.util.HashSet r7, int r8) {
            if (r5 == 0) goto Lc4
            r0 = 2
            if (r8 > r0) goto Lc4
            boolean r0 = r7.add(r5)
            if (r0 != 0) goto Ld
            goto Lc4
        Ld:
            boolean r0 = r5 instanceof java.lang.String
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L40
            java.lang.String r5 = (java.lang.String) r5
            boolean r7 = og.m.t0(r5)
            if (r7 == 0) goto L1c
            goto L26
        L1c:
            java.lang.String r5 = h(r5)
            boolean r7 = og.m.t0(r5)
            if (r7 == 0) goto L29
        L26:
            java.lang.String r5 = ""
            goto L2f
        L29:
            r7 = 160(0xa0, float:2.24E-43)
            java.lang.String r5 = og.m.P0(r7, r5)
        L2f:
            int r7 = r5.length()
            if (r7 <= 0) goto L36
            r1 = r2
        L36:
            if (r1 == 0) goto L39
            goto L3a
        L39:
            r5 = 0
        L3a:
            if (r5 == 0) goto Lc4
            r6.add(r5)
            return
        L40:
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L5a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = r5.next()
            int r1 = r8 + 1
            g(r0, r6, r7, r1)
            goto L4a
        L5a:
            boolean r0 = r5 instanceof java.lang.Object[]
            if (r0 == 0) goto L6d
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r0 = r5.length
        L61:
            if (r1 >= r0) goto Lc4
            r3 = r5[r1]
            int r4 = r8 + 1
            g(r3, r6, r7, r4)
            int r1 = r1 + 1
            goto L61
        L6d:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "java."
            boolean r3 = og.t.d0(r0, r3, r1)
            if (r3 != 0) goto Lc4
            java.lang.String r3 = "android."
            boolean r0 = og.t.d0(r0, r3, r1)
            if (r0 == 0) goto L86
            goto Lc4
        L86:
            java.lang.Class r0 = r5.getClass()
        L8a:
            if (r0 == 0) goto Lc4
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lc4
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L9c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lbf
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r4 = r3.getType()
            boolean r4 = r4.isPrimitive()
            if (r4 == 0) goto Lb3
            goto L9c
        Lb3:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r5)
            if (r3 == 0) goto L9c
            int r4 = r8 + 1
            g(r3, r6, r7, r4)
            goto L9c
        Lbf:
            java.lang.Class r0 = r0.getSuperclass()
            goto L8a
        Lc4:
            return
    }

    public static java.lang.String h(java.lang.String r3) {
            boolean r0 = og.m.t0(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            r0 = 0
            android.text.Spanned r3 = android.text.Html.fromHtml(r3, r0)
            java.lang.String r3 = r3.toString()
            r0 = 65532(0xfffc, float:9.183E-41)
            r2 = 32
            java.lang.String r3 = og.t.b0(r3, r0, r2)
            java.lang.String r0 = "[\\u0000-\\u0008\\u000B\\u000C\\u000E-\\u001F\\u007F]"
            java.lang.String r3 = j8.b.h(r0, r3, r1)
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = " "
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r1)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static int k(java.lang.Object r2) {
            java.lang.String r0 = "field_type"
            java.lang.String r1 = "type"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.Number r2 = m(r2, r0)
            if (r2 == 0) goto L13
            int r2 = r2.intValue()
            return r2
        L13:
            r2 = 0
            return r2
    }

    public static java.lang.String l(java.lang.Object r4) {
            java.lang.String r0 = "field_content"
            java.lang.String r1 = "content"
            java.lang.String r2 = "field_xml"
            java.lang.String r3 = "xml"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            r1 = 0
        Ld:
            r2 = 4
            if (r1 < r2) goto L11
            goto L27
        L11:
            r2 = r0[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L1e
            java.lang.String r2 = (java.lang.String) r2
            goto L1f
        L1e:
            r2 = 0
        L1f:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L2b
            if (r2 != 0) goto L2a
        L27:
            java.lang.String r4 = ""
            return r4
        L2a:
            return r2
        L2b:
            int r1 = r1 + 1
            goto Ld
    }

    public static java.lang.Number m(java.lang.Object r4, java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 < r0) goto L6
            r4 = 0
            return r4
        L6:
            r2 = r5[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L13
            java.lang.Number r2 = (java.lang.Number) r2
            return r2
        L13:
            int r1 = r1 + 1
            goto L2
    }

    public static boolean o(java.lang.String r3) {
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L25
            r0 = r1
        L10:
            int r2 = r3.length()
            if (r0 >= r2) goto L25
            char r2 = r3.charAt(r0)
            boolean r2 = java.lang.Character.isLetterOrDigit(r2)
            if (r2 == 0) goto L22
            r3 = 1
            return r3
        L22:
            int r0 = r0 + 1
            goto L10
        L25:
            return r1
    }

    public static boolean p(java.lang.String r14) {
            java.lang.CharSequence r14 = og.m.R0(r14)
            java.lang.String r14 = r14.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = j8.b.l(r0, r14, r0)
            boolean r1 = og.m.t0(r14)
            r2 = 0
            if (r1 != 0) goto Lb6
            int r1 = r14.length()
            r3 = 2
            if (r1 >= r3) goto L1e
            goto Lb6
        L1e:
            java.lang.String r12 = "htm"
            java.lang.String r13 = "html"
            java.lang.String r4 = "silk"
            java.lang.String r5 = "amr"
            java.lang.String r6 = "mp3"
            java.lang.String r7 = "mp4"
            java.lang.String r8 = "jpg"
            java.lang.String r9 = "jpeg"
            java.lang.String r10 = "png"
            java.lang.String r11 = "gif"
            java.lang.String[] r1 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.Set r1 = tf.d0.W(r1)
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L42
            goto Lb6
        L42:
            java.lang.String r1 = "wxid_"
            boolean r1 = og.t.d0(r0, r1, r2)
            if (r1 != 0) goto Lb6
            java.lang.String r1 = "@chatroom"
            boolean r1 = og.t.W(r0, r1, r2)
            if (r1 == 0) goto L53
            goto Lb6
        L53:
            java.lang.String r1 = "content://"
            boolean r0 = og.t.d0(r0, r1, r2)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = "/"
            boolean r0 = og.t.d0(r14, r0, r2)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = "^[A-Za-z]:[\\\\/]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r0 = r0.find()
            if (r0 == 0) goto L77
            goto Lb6
        L77:
            java.lang.String r0 = "^[0-9a-f]{16,}$"
            int r1 = l3.w.f(r3)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r0.getClass()
            java.lang.String r1 = " "
            java.lang.String r3 = ""
            java.lang.String r1 = og.t.a0(r14, r1, r3, r2)
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L97
            goto Lb6
        L97:
            java.lang.String r0 = "^[A-Za-z0-9_-]{24,}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Lab
            goto Lb6
        Lab:
            java.lang.String r0 = "."
            boolean r14 = og.t.d0(r14, r0, r2)
            if (r14 == 0) goto Lb4
            goto Lb6
        Lb4:
            r14 = 1
            return r14
        Lb6:
            return r2
    }

    public static java.util.List x(java.lang.Object r3) {
            if (r3 != 0) goto L5
            tf.t r3 = tf.t.f13167g
            return r3
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = 0
            g(r3, r0, r1, r2)
            java.util.Set r3 = tf.m.T1(r0)
            java.util.List r3 = tf.m.P1(r3)
            return r3
    }

    public final boolean A(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r6.getClass()
            r7.getClass()
            java.lang.CharSequence r0 = og.m.R0(r7)
            java.lang.String r0 = r0.toString()
            java.lang.Long r0 = og.t.g0(r0)
            if (r0 == 0) goto L28
            long r1 = r0.longValue()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L1f
            goto L28
        L1f:
            long r0 = r0.longValue()
            boolean r6 = r5.z(r0, r6)
            return r6
        L28:
            java.lang.String r6 = "发送收藏失败: localId 非法 "
            java.lang.String r6 = r6.concat(r7)
            i8.i.f(r6)
            r6 = 0
            return r6
    }

    public final boolean B(java.lang.String r4, j8.c r5) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r5.f6775a
            r0.<init>(r1)
            boolean r0 = r0.isFile()
            r2 = 0
            if (r0 != 0) goto Lf
            return r2
        Lf:
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L26
            j8.y r0 = r0.f6816b     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L26
            int r5 = r5.f6776b     // Catch: java.lang.Throwable -> L24
            boolean r4 = r0.s(r5, r4, r1)     // Catch: java.lang.Throwable -> L24
            r5 = 1
            if (r4 != r5) goto L26
            r2 = r5
            goto L26
        L24:
            r4 = move-exception
            goto L2b
        L26:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L24
            goto L31
        L2b:
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L31:
            java.lang.Throwable r5 = sf.g.b(r4)
            if (r5 != 0) goto L38
            goto L4f
        L38:
            java.lang.String r4 = r5.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "发送收藏语音失败: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            i8.i.f(r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L4f:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
    }

    public final void b(java.lang.Object r3, long r4) {
            r2 = this;
            fb.k1 r0 = r2.f6792f
            monitor-enter(r0)
            fb.k1 r1 = r2.f6792f     // Catch: java.lang.Throwable -> Le
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Le
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final j8.g c() {
            r5 = this;
            java.lang.Object r0 = r5.f6794h
            monitor-enter(r0)
            j8.g r1 = new j8.g     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r2 = r5.f6793g     // Catch: java.lang.Throwable -> L1c
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L1c
            r2.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L1c
            java.util.List r2 = tf.m.P1(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r5.f6796j     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r1
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean d() {
            r2 = this;
            h.Hchat.dexkit.DexFinder r0 = r2.f6788b
            java.lang.Class<?> r1 = r0.favoriteServiceClass
            if (r1 == 0) goto L14
            java.lang.reflect.Method r1 = r0.favoriteServiceResolverMethod
            if (r1 == 0) goto L14
            java.lang.reflect.Method r1 = r0.favoriteStorageGetterMethod
            if (r1 == 0) goto L14
            java.lang.reflect.Method r0 = r0.favoriteListMethod
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final j8.i i(java.lang.Object r30) {
            r29 = this;
            r0 = r30
            if (r0 == 0) goto L5d6
            java.lang.String r2 = "localId"
            java.lang.String r3 = "id"
            java.lang.String r4 = "field_localId"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            java.lang.Number r2 = m(r0, r2)
            if (r2 == 0) goto L5d6
            long r4 = r2.longValue()
            int r6 = k(r0)
            java.lang.String r2 = "datatotalsize"
            java.lang.String r3 = "totalSize"
            java.lang.String r7 = "field_datatotalsize"
            java.lang.String[] r2 = new java.lang.String[]{r7, r2, r3}
            java.lang.Number r2 = m(r0, r2)
            r7 = 0
            if (r2 == 0) goto L34
            long r2 = r2.longValue()
            r9 = r2
            goto L35
        L34:
            r9 = r7
        L35:
            java.lang.String r2 = "field_updateTime"
            java.lang.String r3 = "updateTime"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.Number r2 = m(r0, r2)
            if (r2 == 0) goto L5a
            long r2 = r2.longValue()
            r7 = 1
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L59
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L59
            r7 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r7
        L59:
            r7 = r2
        L5a:
            r11 = r7
            java.lang.String r2 = l(r0)
            java.lang.String r3 = "field_favProto"
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r0, r3)
            java.lang.String r8 = ""
            java.lang.Class<java.util.Collection> r14 = java.util.Collection.class
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
            r16 = 0
            r1 = 1
            if (r6 != r1) goto L10c
            java.lang.String r1 = "content"
            java.lang.String r7 = "title"
            java.lang.String r13 = "desc"
            java.lang.String[] r1 = new java.lang.String[]{r13, r1, r7}
            java.lang.String r1 = D(r2, r1)
            boolean r7 = og.m.t0(r1)
            if (r7 != 0) goto L85
            goto L87
        L85:
            r1 = r16
        L87:
            if (r1 == 0) goto L95
            r7 = 160(0xa0, float:2.24E-43)
            java.lang.String r1 = og.m.P0(r7, r1)
        L8f:
            r7 = r29
            r21 = r4
            goto L209
        L95:
            java.util.List r1 = x(r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        La2:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto Lba
            java.lang.Object r13 = r1.next()
            r21 = r13
            java.lang.String r21 = (java.lang.String) r21
            boolean r21 = p(r21)
            if (r21 == 0) goto La2
            r7.add(r13)
            goto La2
        Lba:
            java.util.Iterator r1 = r7.iterator()
            boolean r7 = r1.hasNext()
            if (r7 != 0) goto Lc7
            r7 = r16
            goto Lfe
        Lc7:
            java.lang.Object r7 = r1.next()
            boolean r13 = r1.hasNext()
            if (r13 != 0) goto Ld2
            goto Lfe
        Ld2:
            r13 = r7
            java.lang.String r13 = (java.lang.String) r13
            int r13 = r13.length()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
        Ldd:
            java.lang.Object r21 = r1.next()
            r22 = r21
            java.lang.String r22 = (java.lang.String) r22
            int r22 = r22.length()
            r23 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            int r22 = r13.compareTo(r1)
            if (r22 >= 0) goto Lf8
            r13 = r1
            r7 = r21
        Lf8:
            boolean r1 = r23.hasNext()
            if (r1 != 0) goto L109
        Lfe:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L10c
            r1 = 160(0xa0, float:2.24E-43)
            java.lang.String r1 = og.m.P0(r1, r7)
            goto L8f
        L109:
            r1 = r23
            goto Ldd
        L10c:
            boolean r1 = og.m.t0(r2)
            if (r1 == 0) goto L119
            tf.t r1 = tf.t.f13167g
            r7 = r29
            r21 = r4
            goto L150
        L119:
            og.k r1 = new og.k
            og.l r7 = og.l.f9834h
            og.l r13 = og.l.f9835i
            og.l[] r7 = new og.l[]{r7, r13}
            java.util.Set r7 = tf.d0.W(r7)
            java.lang.String r13 = "<(title|desc|description|content|filename|fileName|appname|sourcename|locationname)(?:\\s[^>]*)?>(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?</\\1>"
            r1.<init>(r13, r7)
            ng.c r1 = og.k.c(r1, r2)
            i2.z r2 = new i2.z
            r13 = 10
            r7 = r29
            r2.<init>(r7, r13)
            ng.t r1 = ng.m.W(r1, r2)
            i2.z r2 = new i2.z
            r13 = 11
            r2.<init>(r13)
            ng.i r13 = new ng.i
            r21 = r4
            r4 = 1
            r13.<init>(r1, r4, r2)
            java.util.List r1 = ng.m.b0(r13)
        L150:
            java.util.Iterator r1 = r1.iterator()
        L154:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L168
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = p(r4)
            if (r4 == 0) goto L154
            goto L16a
        L168:
            r2 = r16
        L16a:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L176
            r1 = 160(0xa0, float:2.24E-43)
            java.lang.String r1 = og.m.P0(r1, r2)
            goto L209
        L176:
            if (r3 == 0) goto L1cf
            java.lang.Class r1 = r3.getClass()
        L17c:
            if (r1 == 0) goto L1cf
            boolean r2 = r1.equals(r15)
            if (r2 != 0) goto L1cf
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        L18c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1ca
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()
            boolean r5 = r14.isAssignableFrom(r5)
            if (r5 != 0) goto L1a3
            goto L18c
        L1a3:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r3)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L1ae
            java.util.Collection r4 = (java.util.Collection) r4
            goto L1b0
        L1ae:
            r4 = r16
        L1b0:
            if (r4 == 0) goto L1c5
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L1b8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1c5
            java.lang.Object r5 = r4.next()
            if (r5 == 0) goto L1b8
            goto L1c7
        L1c5:
            r5 = r16
        L1c7:
            if (r5 == 0) goto L18c
            goto L1d1
        L1ca:
            java.lang.Class r1 = r1.getSuperclass()
            goto L17c
        L1cf:
            r5 = r16
        L1d1:
            java.util.List r1 = x(r5)
            java.util.List r2 = x(r3)
            java.util.ArrayList r1 = tf.m.F1(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L1e1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f5
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = p(r3)
            if (r3 == 0) goto L1e1
            goto L1f7
        L1f5:
            r2 = r16
        L1f7:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L202
            r1 = 160(0xa0, float:2.24E-43)
            java.lang.String r1 = og.m.P0(r1, r2)
            goto L209
        L202:
            r1 = 3
            if (r6 != r1) goto L208
            java.lang.String r1 = "语音收藏"
            goto L209
        L208:
            r1 = r8
        L209:
            java.lang.String r2 = "语音"
            java.lang.String r3 = "笔记"
            r13 = 10
            if (r6 == r13) goto L243
            r4 = 14
            if (r6 == r4) goto L241
            r4 = 18
            if (r6 == r4) goto L243
            r3 = 19
            if (r6 == r3) goto L23e
            switch(r6) {
                case 1: goto L23b;
                case 2: goto L238;
                case 3: goto L236;
                case 4: goto L233;
                case 5: goto L230;
                case 6: goto L22d;
                case 7: goto L22a;
                case 8: goto L227;
                default: goto L220;
            }
        L220:
            java.lang.String r3 = "类型"
            java.lang.String r3 = eh.a.l(r6, r3)
            goto L243
        L227:
            java.lang.String r3 = "文件"
            goto L243
        L22a:
            java.lang.String r3 = "音乐"
            goto L243
        L22d:
            java.lang.String r3 = "位置"
            goto L243
        L230:
            java.lang.String r3 = "链接"
            goto L243
        L233:
            java.lang.String r3 = "视频"
            goto L243
        L236:
            r3 = r2
            goto L243
        L238:
            java.lang.String r3 = "图片"
            goto L243
        L23b:
            java.lang.String r3 = "文字"
            goto L243
        L23e:
            java.lang.String r3 = "小程序"
            goto L243
        L241:
            java.lang.String r3 = "聊天记录"
        L243:
            boolean r4 = og.m.t0(r1)
            if (r4 == 0) goto L24f
            java.lang.String r1 = "收藏"
            java.lang.String r1 = r3.concat(r1)
        L24f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r13 = 0
            f(r0, r4, r5, r13)
            java.util.Set r4 = tf.m.T1(r4)
            java.util.List r4 = tf.m.P1(r4)
            java.util.Iterator r5 = r4.iterator()
        L269:
            boolean r19 = r5.hasNext()
            if (r19 == 0) goto L291
            java.lang.Object r19 = r5.next()
            r20 = r1
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r23 = r4
            java.lang.String r4 = "@chatroom"
            boolean r4 = og.t.W(r1, r4, r13)
            if (r4 != 0) goto L297
            java.lang.String r4 = "@im.chatroom"
            boolean r1 = og.t.W(r1, r4, r13)
            if (r1 == 0) goto L28c
            goto L297
        L28c:
            r1 = r20
            r4 = r23
            goto L269
        L291:
            r20 = r1
            r23 = r4
            r19 = r16
        L297:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            java.util.Iterator r4 = r23.iterator()
        L29f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2c7
            java.lang.Object r5 = r4.next()
            r19 = r4
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r23 = r5
            java.lang.String r5 = "wxid_"
            boolean r5 = og.t.d0(r4, r5, r13)
            if (r5 != 0) goto L2c4
            java.lang.String r5 = "gh_"
            boolean r4 = og.t.d0(r4, r5, r13)
            if (r4 == 0) goto L2c1
            goto L2c4
        L2c1:
            r4 = r19
            goto L29f
        L2c4:
            r5 = r23
            goto L2c9
        L2c7:
            r5 = r16
        L2c9:
            java.lang.String r5 = (java.lang.String) r5
            i8.a r4 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r4.getClass()
            g8.k r4 = h.Hchat.hooks.api.core.WeChatApis.r()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.add(r3)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L35b
            java.util.concurrent.ConcurrentHashMap r2 = j8.d.f6777a
            int r2 = j8.d.e(r0)
            r3 = 3
            if (r2 == r3) goto L2f2
        L2ed:
            r17 = r6
            r2 = r16
            goto L319
        L2f2:
            java.lang.Object r2 = j8.d.f(r0)
            if (r2 == 0) goto L2ed
            java.lang.String r3 = "duration"
            r17 = r6
            java.lang.String r6 = "length"
            java.lang.String r7 = "y"
            java.lang.String[] r3 = new java.lang.String[]{r7, r3, r6}
            java.lang.Number r2 = j8.d.g(r2, r3)
            if (r2 == 0) goto L313
            long r2 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L315
        L313:
            r2 = r16
        L315:
            java.lang.Integer r2 = j8.d.k(r2)
        L319:
            if (r2 == 0) goto L35d
            int r2 = r2.intValue()
            if (r2 >= 0) goto L322
            r2 = 0
        L322:
            int r2 = r2 + 999
            int r2 = r2 / 1000
            r3 = 1
            if (r2 >= r3) goto L32a
            r2 = r3
        L32a:
            int r3 = r2 / 60
            int r2 = r2 % 60
            java.lang.String r6 = "秒"
            if (r3 <= 0) goto L353
            if (r2 != 0) goto L33b
            java.lang.String r2 = "分钟"
            java.lang.String r2 = p.a.i(r3, r2)
            goto L357
        L33b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = "分"
            r7.append(r3)
            r7.append(r2)
            r7.append(r6)
            java.lang.String r2 = r7.toString()
            goto L357
        L353:
            java.lang.String r2 = p.a.i(r2, r6)
        L357:
            r13.add(r2)
            goto L35d
        L35b:
            r17 = r6
        L35d:
            java.lang.String r2 = "）"
            java.lang.String r3 = "（"
            if (r1 == 0) goto L395
            boolean r6 = og.m.t0(r1)
            if (r6 == 0) goto L36a
            goto L395
        L36a:
            if (r4 == 0) goto L371
            java.lang.String r6 = r4.a(r1)
            goto L373
        L371:
            r6 = r16
        L373:
            if (r6 != 0) goto L376
            r6 = r8
        L376:
            java.lang.String r6 = e(r6)
            boolean r7 = r6.equals(r1)
            if (r7 != 0) goto L381
            goto L383
        L381:
            r6 = r16
        L383:
            if (r6 != 0) goto L386
            r6 = r8
        L386:
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L38e
            r6 = r1
            goto L392
        L38e:
            java.lang.String r6 = wb.en.i(r6, r3, r1, r2)
        L392:
            r13.add(r6)
        L395:
            if (r5 == 0) goto L442
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L39f
            goto L442
        L39f:
            if (r4 == 0) goto L3a6
            java.lang.String r6 = r4.a(r5)
            goto L3a8
        L3a6:
            r6 = r16
        L3a8:
            if (r6 != 0) goto L3ab
            r6 = r8
        L3ab:
            java.lang.String r6 = e(r6)
            boolean r7 = r6.equals(r5)
            if (r7 != 0) goto L3b6
            goto L3b8
        L3b6:
            r6 = r16
        L3b8:
            if (r6 != 0) goto L3bb
            r6 = r8
        L3bb:
            if (r1 == 0) goto L3f6
            boolean r7 = og.m.t0(r1)
            if (r7 == 0) goto L3c4
            goto L3f6
        L3c4:
            if (r4 == 0) goto L3e0
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 == 0) goto L3cd
            goto L3dc
        L3cd:
            g8.i r4 = r4.f4387b
            java.lang.String r1 = r4.t(r1, r5)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L3de
            if (r1 == 0) goto L3dc
            goto L3e2
        L3dc:
            r1 = r8
            goto L3e2
        L3de:
            r1 = r5
            goto L3e2
        L3e0:
            r1 = r16
        L3e2:
            if (r1 != 0) goto L3e5
            r1 = r8
        L3e5:
            java.lang.String r1 = e(r1)
            boolean r4 = r1.equals(r5)
            if (r4 != 0) goto L3f0
            goto L3f2
        L3f0:
            r1 = r16
        L3f2:
            if (r1 != 0) goto L3f5
            goto L3f6
        L3f5:
            r8 = r1
        L3f6:
            java.lang.String[] r1 = new java.lang.String[]{r6, r8}
            java.util.List r1 = a.a.y0(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L407:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L41e
            java.lang.Object r6 = r1.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = og.m.t0(r7)
            if (r7 != 0) goto L407
            r4.add(r6)
            goto L407
        L41e:
            java.util.Set r1 = tf.m.T1(r4)
            java.util.List r23 = tf.m.P1(r1)
            boolean r1 = r23.isEmpty()
            if (r1 == 0) goto L42d
            goto L43f
        L42d:
            r27 = 0
            r28 = 62
            java.lang.String r24 = " / "
            r25 = 0
            r26 = 0
            java.lang.String r1 = tf.m.A1(r23, r24, r25, r26, r27, r28)
            java.lang.String r5 = wb.en.i(r1, r3, r5, r2)
        L43f:
            r13.add(r5)
        L442:
            java.util.Set r1 = tf.m.T1(r13)
            java.util.List r2 = tf.m.P1(r1)
            r6 = 0
            r7 = 62
            java.lang.String r3 = " · "
            r4 = 0
            r5 = 0
            java.lang.String r8 = tf.m.A1(r2, r3, r4, r5, r6, r7)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.lang.Class r2 = r0.getClass()
        L45e:
            if (r2 == 0) goto L5c4
            boolean r3 = r2.equals(r15)
            if (r3 != 0) goto L5c4
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r3 = r3.iterator()
        L46e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5ba
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()
            boolean r5 = r5.isPrimitive()
            if (r5 != 0) goto L490
            java.lang.Class r5 = r4.getType()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L496
        L490:
            r18 = r2
            r19 = r3
            goto L5ae
        L496:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r0)
            if (r4 == 0) goto L5b6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Class r6 = r4.getClass()
        L4a5:
            if (r6 == 0) goto L54f
            boolean r7 = r6.equals(r15)
            if (r7 != 0) goto L54f
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            java.util.Iterator r7 = r7.iterator()
        L4b5:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L543
            java.lang.Object r13 = r7.next()
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            java.lang.Class r0 = r13.getType()
            boolean r0 = r14.isAssignableFrom(r0)
            if (r0 != 0) goto L4ce
        L4cb:
            r0 = r30
            goto L4b5
        L4ce:
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r13, r4)
            boolean r13 = r0 instanceof java.util.Collection
            if (r13 == 0) goto L4d9
            java.util.Collection r0 = (java.util.Collection) r0
            goto L4db
        L4d9:
            r0 = r16
        L4db:
            if (r0 == 0) goto L4cb
            boolean r13 = r0.isEmpty()
            if (r13 != 0) goto L509
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r13 = r0 instanceof java.util.Collection
            if (r13 == 0) goto L4f5
            r13 = r0
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L4f5
        L4f2:
            r18 = r0
            goto L511
        L4f5:
            java.util.Iterator r13 = r0.iterator()
        L4f9:
            boolean r18 = r13.hasNext()
            if (r18 == 0) goto L4f2
            r18 = r0
            java.lang.Object r0 = r13.next()
            boolean r0 = r0 instanceof java.lang.String
            if (r0 != 0) goto L50e
        L509:
            r18 = r2
            r19 = r3
            goto L53b
        L50e:
            r0 = r18
            goto L4f9
        L511:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r18.iterator()
        L51a:
            boolean r18 = r13.hasNext()
            if (r18 == 0) goto L534
            r18 = r2
            java.lang.Object r2 = r13.next()
            r19 = r3
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L52f
            r0.add(r2)
        L52f:
            r2 = r18
            r3 = r19
            goto L51a
        L534:
            r18 = r2
            r19 = r3
            tf.r.h1(r5, r0)
        L53b:
            r0 = r30
            r2 = r18
            r3 = r19
            goto L4b5
        L543:
            r18 = r2
            r19 = r3
            java.lang.Class r6 = r6.getSuperclass()
            r0 = r30
            goto L4a5
        L54f:
            r18 = r2
            r19 = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = tf.n.e1(r5)
            r0.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L560:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L574
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = h(r3)
            r0.add(r3)
            goto L560
        L574:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L57d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L594
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = o(r4)
            if (r4 == 0) goto L57d
            r2.add(r3)
            goto L57d
        L594:
            java.util.Iterator r0 = r2.iterator()
        L598:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5ae
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 24
            java.lang.String r2 = og.m.P0(r3, r2)
            r1.add(r2)
            goto L598
        L5ae:
            r0 = r30
            r2 = r18
            r3 = r19
            goto L46e
        L5b6:
            r0 = r30
            goto L46e
        L5ba:
            r18 = r2
            java.lang.Class r2 = r18.getSuperclass()
            r0 = r30
            goto L45e
        L5c4:
            r0 = 8
            java.util.List r13 = tf.m.L1(r0, r1)
            j8.i r3 = new j8.i
            r6 = r17
            r7 = r20
            r4 = r21
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            return r3
        L5d6:
            r16 = 0
            return r16
    }

    public final java.lang.Object j() {
            r4 = this;
            h.Hchat.dexkit.DexFinder r0 = r4.f6788b
            r0.resolveFavoriteApi()
            java.lang.reflect.Method r1 = r0.favoriteServiceResolverMethod
            r2 = 0
            if (r1 == 0) goto L24
            java.lang.Class<?> r3 = r0.favoriteServiceClass
            if (r3 == 0) goto L24
            java.lang.reflect.Method r0 = r0.favoriteStorageGetterMethod
            if (r0 == 0) goto L24
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r2, r3)
            if (r1 == 0) goto L24
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r2)
            return r0
        L24:
            return r2
    }

    public final void n(java.lang.reflect.Method r18, android.content.Context r19, java.lang.String r20, java.lang.Object r21) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.Class[] r4 = r0.getParameterTypes()
            int r5 = r4.length
            r6 = 5
            java.lang.String r7 = ""
            r8 = 0
            if (r5 != r6) goto L23
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r4.add(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r7, r4, r8}
            h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r8, r1)
            return
        L23:
            r5 = r17
            h.Hchat.dexkit.DexFinder r6 = r5.f6788b
            java.lang.Class<?> r6 = r6.favoriteSendParamClass
            r9 = 1
            if (r6 == 0) goto L2d
            goto L36
        L2d:
            java.lang.Object r4 = tf.l.C0(r9, r4)
            r6 = r4
            java.lang.Class r6 = (java.lang.Class) r6
            if (r6 == 0) goto L12c
        L36:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredConstructors(r6)
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L56
            java.lang.Object r10 = r4.next()
            r11 = r10
            java.lang.reflect.Constructor r11 = (java.lang.reflect.Constructor) r11
            java.lang.Class[] r11 = r11.getParameterTypes()
            r11.getClass()
            int r11 = r11.length
            if (r11 != 0) goto L3e
            goto L57
        L56:
            r10 = r8
        L57:
            java.lang.reflect.Constructor r10 = (java.lang.reflect.Constructor) r10
            r4 = 0
            if (r10 == 0) goto L5d
            goto L73
        L5d:
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.reflect.Constructor r10 = h.Hchat.utils.KavaReflector.findConstructor(r6, r10)
            if (r10 == 0) goto L70
            java.lang.Class[] r11 = r10.getParameterTypes()
            r11.getClass()
            int r11 = r11.length
            if (r11 != 0) goto L70
            goto L71
        L70:
            r10 = r8
        L71:
            if (r10 == 0) goto L112
        L73:
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.newInstance(r10, r11)
            if (r10 == 0) goto L112
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            r11.add(r3)
            java.lang.Class r3 = r10.getClass()
            r12 = r4
            r13 = r12
        L89:
            if (r3 == 0) goto L10d
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            boolean r14 = r3.equals(r14)
            if (r14 != 0) goto L10d
            java.util.List r14 = h.Hchat.utils.KavaReflector.declaredFields(r3)
            java.util.Iterator r14 = r14.iterator()
        L9b:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L105
            java.lang.Object r15 = r14.next()
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            boolean r16 = h.Hchat.utils.KavaReflector.isStatic(r15)
            if (r16 == 0) goto Lae
            goto L9b
        Lae:
            java.lang.Class r9 = r15.getType()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r8 = gg.l.a(r9, r8)
            if (r8 == 0) goto Ld0
            int r8 = r13 + 1
            if (r13 != 0) goto Lc0
            r9 = r2
            goto Lc1
        Lc0:
            r9 = r7
        Lc1:
            boolean r13 = h.Hchat.utils.KavaReflector.writeField(r15, r10, r9)
            if (r13 == 0) goto Lce
            boolean r9 = gg.l.a(r9, r2)
            if (r9 == 0) goto Lce
            r4 = 1
        Lce:
            r13 = r8
            goto L102
        Ld0:
            java.lang.Class r8 = r15.getType()
            java.lang.Class r9 = java.lang.Boolean.TYPE
            boolean r8 = gg.l.a(r8, r9)
            if (r8 != 0) goto Lfd
            java.lang.Class r8 = r15.getType()
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto Le9
            goto Lfd
        Le9:
            java.lang.Class<java.util.List> r8 = java.util.List.class
            java.lang.Class r9 = r15.getType()
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L102
            boolean r8 = h.Hchat.utils.KavaReflector.writeField(r15, r10, r11)
            if (r8 == 0) goto L102
            r12 = 1
            goto L102
        Lfd:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            h.Hchat.utils.KavaReflector.writeField(r15, r10, r8)
        L102:
            r8 = 0
            r9 = 1
            goto L9b
        L105:
            java.lang.Class r3 = r3.getSuperclass()
            r8 = 0
            r9 = 1
            goto L89
        L10d:
            if (r4 == 0) goto L112
            if (r12 == 0) goto L112
            goto L113
        L112:
            r10 = 0
        L113:
            if (r10 == 0) goto L11e
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r10, r2}
            h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r2, r1)
            return
        L11e:
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = "favorite request build failed: "
            java.lang.String r0 = r1.concat(r0)
            j8.o.A(r0)
            return
        L12c:
            java.lang.String r0 = "favorite request class missing"
            j8.o.A(r0)
            return
    }

    public final java.util.List q(int r7) {
            r6 = this;
            h.Hchat.dexkit.DexFinder r0 = r6.f6788b
            r0.resolveFavoriteApi()
            boolean r1 = r6.d()
            r2 = 0
            if (r1 != 0) goto Ld
            return r2
        Ld:
            java.lang.reflect.Method r1 = r0.favoriteServiceResolverMethod     // Catch: java.lang.Throwable -> L44
            java.lang.Class<?> r3 = r0.favoriteServiceClass     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r2, r3)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L71
            java.lang.reflect.Method r3 = r0.favoriteStorageGetterMethod     // Catch: java.lang.Throwable -> L44
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r3, r1, r4)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L71
            java.lang.reflect.Method r0 = r0.favoriteListMethod     // Catch: java.lang.Throwable -> L44
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L44
            java.util.List r4 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L44
            java.util.Set r5 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r7 = new java.lang.Object[]{r3, r7, r4, r5, r2}     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r7)     // Catch: java.lang.Throwable -> L44
            boolean r0 = r7 instanceof java.util.List     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L44
            goto L47
        L44:
            r7 = move-exception
            goto L73
        L46:
            r7 = r2
        L47:
            if (r7 == 0) goto L71
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L44
        L52:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L78
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L60
        L5e:
            r3 = r2
            goto L6b
        L60:
            j8.i r3 = r6.i(r1)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L5e
            long r4 = r3.f6799a     // Catch: java.lang.Throwable -> L44
            r6.b(r1, r4)     // Catch: java.lang.Throwable -> L44
        L6b:
            if (r3 == 0) goto L52
            r0.add(r3)     // Catch: java.lang.Throwable -> L44
            goto L52
        L71:
            r0 = r2
            goto L78
        L73:
            sf.f r0 = new sf.f
            r0.<init>(r7)
        L78:
            java.lang.Throwable r7 = sf.g.b(r0)
            if (r7 != 0) goto L80
            r2 = r0
            goto L95
        L80:
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "调用微信原生收藏列表失败: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            i8.i.f(r7)
        L95:
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public final java.lang.Object r(long r14) {
            r13 = this;
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L9
            goto L111
        L9:
            fb.k1 r0 = r13.f6792f
            monitor-enter(r0)
            fb.k1 r2 = r13.f6792f     // Catch: java.lang.Throwable -> L112
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L112
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L112
            monitor-exit(r0)
            if (r2 == 0) goto L1a
            return r2
        L1a:
            java.lang.Object r0 = r13.j()
            if (r0 == 0) goto L111
            h.Hchat.dexkit.DexFinder r2 = r13.f6788b
            java.lang.Class<?> r3 = r2.favoriteItemClass
            if (r3 == 0) goto L111
            java.lang.reflect.Method r2 = r2.favoriteGetMethod
            uf.c r4 = a.a.E()
            if (r2 == 0) goto L31
            r4.add(r2)
        L31:
            java.lang.Class r5 = r0.getClass()
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L42:
            boolean r7 = r5.hasNext()
            r8 = 0
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r5.next()
            r9 = r7
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            boolean r10 = h.Hchat.utils.KavaReflector.isStatic(r9)
            if (r10 != 0) goto L77
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            r11 = 1
            if (r10 != r11) goto L77
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r8]
            java.lang.Class r12 = java.lang.Long.TYPE
            boolean r10 = gg.l.a(r10, r12)
            if (r10 == 0) goto L77
            java.lang.Class r9 = r9.getReturnType()
            boolean r9 = r3.isAssignableFrom(r9)
            if (r9 == 0) goto L77
            r8 = r11
        L77:
            if (r8 == 0) goto L42
            r6.add(r7)
            goto L42
        L7d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r6.iterator()
        L86:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = gg.l.a(r7, r2)
            if (r7 != 0) goto L86
            r3.add(r6)
            goto L86
        L9d:
            java.util.Iterator r2 = r3.iterator()
        La1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r4.add(r3)
            goto La1
        Lb1:
            uf.c r2 = a.a.t(r4)
            java.util.ListIterator r2 = r2.listIterator(r8)
        Lb9:
            r3 = r2
            uf.a r3 = (uf.a) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L10c
            java.lang.Object r3 = r3.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r3, r0, r4)     // Catch: java.lang.Throwable -> Ld5
            goto Ldc
        Ld5:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        Ldc:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto Le2
            r3 = r1
        Le2:
            if (r3 == 0) goto Lb9
            java.lang.String r4 = "field_localId"
            java.lang.String r5 = "localId"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.Number r4 = m(r3, r4)
            if (r4 == 0) goto Lfb
            long r4 = r4.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto Lfc
        Lfb:
            r4 = r1
        Lfc:
            if (r4 != 0) goto Lff
            goto Lb9
        Lff:
            long r4 = r4.longValue()
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L108
            goto Lb9
        L108:
            r13.b(r3, r14)
            return r3
        L10c:
            java.lang.String r14 = "调用微信原生收藏读取失败: localId 未匹配"
            i8.i.f(r14)
        L111:
            return r1
        L112:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
    }

    public final j8.g s() {
            r8 = this;
            java.lang.Object r0 = r8.f6794h
            monitor-enter(r0)
            boolean r1 = r8.f6796j     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 != 0) goto L21
            j8.g r1 = new j8.g     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap r3 = r8.f6793g     // Catch: java.lang.Throwable -> L1e
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L1e
            r3.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L1e
            java.util.List r3 = tf.m.P1(r3)     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r3, r2, r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r1
        L1e:
            r1 = move-exception
            goto Lfa
        L21:
            long r3 = r8.f6795i     // Catch: java.lang.Throwable -> L1e
            java.util.List r1 = r8.w(r3)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto Le2
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L47
            r8.f6796j = r2     // Catch: java.lang.Throwable -> L1e
            j8.g r1 = new j8.g     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap r3 = r8.f6793g     // Catch: java.lang.Throwable -> L1e
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L1e
            r3.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L1e
            java.util.List r3 = tf.m.P1(r3)     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r3, r2, r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r1
        L47:
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> L1e
        L4b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L6f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L58
            goto L4b
        L58:
            j8.i r5 = r8.i(r4)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto L4b
            long r6 = r5.f6799a     // Catch: java.lang.Throwable -> L1e
            r8.b(r4, r6)     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap r4 = r8.f6793g     // Catch: java.lang.Throwable -> L1e
            long r6 = r5.f6799a     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L1e
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L1e
            goto L4b
        L6f:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L1e
            r4 = 20
            if (r3 < r4) goto L79
            r3 = 1
            goto L7a
        L79:
            r3 = r2
        L7a:
            r8.f6796j = r3     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r8.f6796j     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L92
            long r3 = r8.f6795i     // Catch: java.lang.Throwable -> L1e
            long r3 = r8.t(r1, r3)     // Catch: java.lang.Throwable -> L1e
            r8.f6795i = r3     // Catch: java.lang.Throwable -> L1e
            long r3 = r8.f6795i     // Catch: java.lang.Throwable -> L1e
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L92
            r8.f6796j = r2     // Catch: java.lang.Throwable -> L1e
        L92:
            java.lang.String r1 = r8.f6797k     // Catch: java.lang.Throwable -> L1e
            boolean r1 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto Lca
            java.util.LinkedHashMap r1 = r8.f6793g     // Catch: java.lang.Throwable -> L1e
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L1e
            r1.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = tf.m.u1(r1)     // Catch: java.lang.Throwable -> L1e
            j8.i r1 = (j8.i) r1     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto Lc6
            long r3 = r1.f6799a     // Catch: java.lang.Throwable -> L1e
            long r5 = r1.f6804f     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            r1.append(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = ":"
            r1.append(r3)     // Catch: java.lang.Throwable -> L1e
            r1.append(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e
            goto Lc8
        Lc6:
            java.lang.String r1 = "empty"
        Lc8:
            r8.f6797k = r1     // Catch: java.lang.Throwable -> L1e
        Lca:
            j8.g r1 = new j8.g     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap r3 = r8.f6793g     // Catch: java.lang.Throwable -> L1e
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L1e
            r3.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L1e
            java.util.List r3 = tf.m.P1(r3)     // Catch: java.lang.Throwable -> L1e
            boolean r4 = r8.f6796j     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r3, r4, r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r1
        Le2:
            r8.f6796j = r2     // Catch: java.lang.Throwable -> L1e
            j8.g r1 = new j8.g     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap r3 = r8.f6793g     // Catch: java.lang.Throwable -> L1e
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L1e
            r3.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L1e
            java.util.List r3 = tf.m.P1(r3)     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r3, r2, r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r1
        Lfa:
            monitor-exit(r0)
            throw r1
    }

    public final long t(java.util.List r7, long r8) {
            r6 = this;
            h.Hchat.dexkit.DexFinder r0 = r6.f6788b
            java.lang.reflect.Method r0 = r0.favoriteListCursorMethod
            r1 = 0
            if (r0 == 0) goto L63
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L24
            java.lang.Object r7 = tf.m.C1(r7)
            if (r7 == 0) goto L63
            java.lang.String r8 = "field_updateTime"
            java.lang.String r9 = "updateTime"
            java.lang.String[] r8 = new java.lang.String[]{r8, r9}
            java.lang.Number r7 = m(r7, r8)
            if (r7 == 0) goto L63
            long r8 = r7.longValue()
        L24:
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 20
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r3, r4}
            r3 = 0
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r0, r3, r7)
            boolean r0 = r7 instanceof java.lang.Number
            if (r0 == 0) goto L43
            java.lang.Number r7 = (java.lang.Number) r7
            goto L44
        L43:
            r7 = r3
        L44:
            if (r7 == 0) goto L63
            long r4 = r7.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L58
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L58
            r8 = 1
            goto L59
        L58:
            r8 = 0
        L59:
            if (r8 == 0) goto L5c
            r3 = r7
        L5c:
            if (r3 == 0) goto L63
            long r7 = r3.longValue()
            return r7
        L63:
            return r1
    }

    public final j8.g u() {
            r7 = this;
            r0 = 1
            java.util.List r1 = r7.q(r0)
            if (r1 == 0) goto L87
            java.lang.Object r1 = tf.m.v1(r1)
            j8.i r1 = (j8.i) r1
            if (r1 == 0) goto L28
            long r2 = r1.f6799a
            long r4 = r1.f6804f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L2a
        L28:
            java.lang.String r1 = "empty"
        L2a:
            java.lang.Object r2 = r7.f6794h
            monitor-enter(r2)
            java.util.LinkedHashMap r3 = r7.f6793g     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L58
            r4 = r3 ^ 1
            if (r3 != 0) goto L5a
            java.lang.String r3 = r7.f6797k     // Catch: java.lang.Throwable -> L58
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L5a
            j8.g r0 = new j8.g     // Catch: java.lang.Throwable -> L58
            java.util.LinkedHashMap r1 = r7.f6793g     // Catch: java.lang.Throwable -> L58
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L58
            r1.getClass()     // Catch: java.lang.Throwable -> L58
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L58
            java.util.List r1 = tf.m.P1(r1)     // Catch: java.lang.Throwable -> L58
            boolean r3 = r7.f6796j     // Catch: java.lang.Throwable -> L58
            r4 = 0
            r0.<init>(r1, r3, r4)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r2)
            return r0
        L58:
            r0 = move-exception
            goto L85
        L5a:
            java.util.LinkedHashMap r3 = r7.f6793g     // Catch: java.lang.Throwable -> L58
            r3.clear()     // Catch: java.lang.Throwable -> L58
            fb.k1 r3 = r7.f6792f     // Catch: java.lang.Throwable -> L58
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L58
            fb.k1 r5 = r7.f6792f     // Catch: java.lang.Throwable -> L82
            r5.clear()     // Catch: java.lang.Throwable -> L82
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            r5 = 0
            r7.f6795i = r5     // Catch: java.lang.Throwable -> L58
            r7.f6796j = r0     // Catch: java.lang.Throwable -> L58
            r7.f6797k = r1     // Catch: java.lang.Throwable -> L58
            monitor-exit(r2)
            j8.g r0 = r7.s()
            java.util.List r1 = r0.f6784a
            boolean r0 = r0.f6785b
            r1.getClass()
            j8.g r2 = new j8.g
            r2.<init>(r1, r0, r4)
            return r2
        L82:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L85:
            monitor-exit(r2)
            throw r0
        L87:
            j8.g r0 = r7.c()
            return r0
    }

    public final java.lang.String v(long r10) {
            r9 = this;
            java.lang.Object r10 = r9.r(r10)
            if (r10 == 0) goto L57
            java.util.concurrent.ConcurrentHashMap r11 = j8.d.f6777a
            ia.t r0 = new ia.t
            java.lang.Class<j8.h> r11 = j8.h.class
            java.lang.Class r3 = eh.a.i(r11)
            r7 = 0
            r8 = 1
            r1 = 2
            java.lang.String r4 = "logFavoriteVoice"
            java.lang.String r5 = "logFavoriteVoice(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.ClassLoader r11 = r2.f6789c
            r11.getClass()
            int r1 = j8.d.e(r10)
            r3 = 2
            r4 = 4
            if (r1 == r3) goto L2c
            if (r1 == r4) goto L2c
            goto L58
        L2c:
            java.lang.Object r10 = j8.d.f(r10)
            if (r10 == 0) goto L58
            if (r1 != r4) goto L37
            java.lang.String r1 = "mp4"
            goto L39
        L37:
            java.lang.String r1 = "jpg"
        L39:
            android.content.Context r3 = r2.f6787a
            org.luckypray.dexkit.DexKitBridge r4 = r2.f6790d
            java.util.List r10 = j8.d.d(r3, r11, r4, r10, r0)
            dg.n r0 = new dg.n
            r4 = 6
            r0.<init>(r10, r4)
            b0.s r10 = new b0.s
            r10.<init>(r3, r11, r1)
            ng.i r10 = ng.m.X(r0, r10)
            java.lang.Object r10 = ng.m.U(r10)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L57:
            r2 = r9
        L58:
            r10 = 0
            return r10
    }

    public final java.util.List w(long r7) {
            r6 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            h.Hchat.dexkit.DexFinder r1 = r6.f6788b
            r1.resolveFavoriteApi()
            boolean r2 = r6.d()
            r3 = 0
            if (r2 != 0) goto L13
            goto L7e
        L13:
            java.lang.Object r2 = r6.j()
            if (r2 == 0) goto L7e
            r4 = 0
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L3e
            java.lang.reflect.Method r7 = r1.favoriteListMethod     // Catch: java.lang.Throwable -> L3a
            r8 = 20
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L3a
            java.util.List r1 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L3a
            java.util.Set r4 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L3a
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r8, r1, r4, r3}     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r7, r2, r8)     // Catch: java.lang.Throwable -> L3a
            boolean r8 = r7 instanceof java.util.List     // Catch: java.lang.Throwable -> L3a
            if (r8 == 0) goto L3c
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L3a
            goto L5f
        L3a:
            r7 = move-exception
            goto L59
        L3c:
            r7 = r3
            goto L5f
        L3e:
            java.lang.reflect.Method r1 = r1.favoriteListNextMethod     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L3c
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L3a
            java.util.List r8 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L3a
            java.util.Set r4 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> L3a
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r0, r8, r4, r3}     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r1, r2, r7)     // Catch: java.lang.Throwable -> L3a
            boolean r8 = r7 instanceof java.util.List     // Catch: java.lang.Throwable -> L3a
            if (r8 == 0) goto L3c
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L3a
            goto L5f
        L59:
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        L5f:
            java.lang.Throwable r8 = sf.g.b(r7)
            if (r8 != 0) goto L67
            r3 = r7
            goto L7c
        L67:
            java.lang.String r7 = r8.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "调用微信原生收藏分页失败: "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            i8.i.f(r7)
        L7c:
            java.util.List r3 = (java.util.List) r3
        L7e:
            return r3
    }

    public final j8.c y(java.lang.Object r11) {
            r10 = this;
            java.util.concurrent.ConcurrentHashMap r0 = j8.d.f6777a
            ia.t r1 = new ia.t
            java.lang.Class<j8.h> r0 = j8.h.class
            java.lang.Class r4 = eh.a.i(r0)
            r8 = 0
            r9 = 2
            r2 = 2
            java.lang.String r5 = "logFavoriteVoice"
            java.lang.String r6 = "logFavoriteVoice(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.ClassLoader r0 = r3.f6789c
            r0.getClass()
            int r2 = j8.d.e(r11)
            r4 = 3
            r5 = 0
            if (r2 == r4) goto L25
            goto La2
        L25:
            java.lang.Object r2 = j8.d.f(r11)
            if (r2 == 0) goto La2
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            android.content.Context r6 = r3.f6787a
            org.luckypray.dexkit.DexKitBridge r7 = r3.f6790d
            java.util.List r1 = j8.d.d(r6, r0, r7, r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L4c
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            r4.add(r7)
            goto L3c
        L4c:
            java.lang.String r1 = j8.d.m(r0, r2)
            if (r1 == 0) goto L55
            r4.add(r1)
        L55:
            java.lang.String r11 = j8.d.m(r0, r11)
            if (r11 == 0) goto L5e
            r4.add(r11)
        L5e:
            dg.n r11 = new dg.n
            r1 = 6
            r11.<init>(r4, r1)
            c9.i r1 = new c9.i
            r4 = 23
            r1.<init>(r6, r4, r0)
            ng.i r11 = ng.m.X(r11, r1)
            java.lang.Object r11 = ng.m.U(r11)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto La2
            java.lang.String r0 = "duration"
            java.lang.String r1 = "length"
            java.lang.String r4 = "y"
            java.lang.String[] r0 = new java.lang.String[]{r4, r0, r1}
            java.lang.Number r0 = j8.d.g(r2, r0)
            if (r0 == 0) goto L8f
            long r0 = r0.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L8f:
            java.lang.Integer r0 = j8.d.k(r5)
            if (r0 == 0) goto L9a
            int r0 = r0.intValue()
            goto L9c
        L9a:
            r0 = 1000(0x3e8, float:1.401E-42)
        L9c:
            j8.c r1 = new j8.c
            r1.<init>(r11, r0)
            return r1
        La2:
            return r5
    }

    public final boolean z(long r18, java.lang.String r20) {
            r17 = this;
            r1 = r17
            r20.getClass()
            boolean r0 = og.m.t0(r20)
            r12 = 0
            if (r0 != 0) goto L12
            r2 = 0
            int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r0 > 0) goto L16
        L12:
            r16 = r12
            goto L267
        L16:
            java.lang.Object r13 = r17.r(r18)
            if (r13 == 0) goto L251
            int r0 = k(r13)
            android.content.Context r14 = r1.f6787a
            r2 = 3
            if (r0 == r2) goto L10a
            r2 = 19
            if (r0 == r2) goto L2d
            r3 = r20
            goto Lb5
        L2d:
            java.lang.String r0 = l(r13)
            java.lang.String r2 = "appbranditem"
            java.lang.String r2 = C(r0, r2)
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L41
        L3d:
            r3 = r20
            r15 = 0
            goto Lae
        L41:
            java.lang.String r3 = "username"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.String r6 = D(r2, r3)
            boolean r3 = og.m.t0(r6)
            if (r3 == 0) goto L52
            goto L3d
        L52:
            java.lang.String r3 = "pagepath"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.String r7 = D(r2, r3)
            java.lang.String r3 = "appid"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.String r9 = D(r2, r3)
            java.lang.String r2 = "datatitle"
            java.lang.String r3 = "title"
            java.lang.String r4 = "desc"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            java.lang.String r2 = D(r0, r2)
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L7c
            java.lang.String r2 = "小程序"
        L7c:
            java.lang.String r3 = "datadesc"
            java.lang.String r4 = "sourcedisplayname"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.String r0 = D(r0, r3)
            j8.p r3 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r3 == 0) goto L3d
            r4 = 128(0x80, float:1.8E-43)
            java.lang.String r4 = og.m.P0(r4, r2)
            r2 = 256(0x100, float:3.59E-43)
            java.lang.String r5 = og.m.P0(r2, r0)
            byte[] r8 = new byte[r12]
            r2 = r3
            r3 = r20
            boolean r0 = r2.b(r3, r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto Laa
            java.lang.String r2 = "发送收藏小程序失败: 公共小程序 API 未成功"
            i8.i.f(r2)
        Laa:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
        Lae:
            if (r15 == 0) goto Lb5
            boolean r0 = r15.booleanValue()
            return r0
        Lb5:
            h.Hchat.dexkit.DexFinder r0 = r1.f6788b
            r0.resolveFavoriteApi()
            r0.resolveFavoriteApi()
            java.lang.Class<?> r2 = r0.favoriteItemClass
            if (r2 == 0) goto L104
            java.lang.reflect.Method r2 = r0.favoriteGetMethod
            if (r2 == 0) goto L104
            java.lang.reflect.Method r0 = r0.favoriteSendMethod
            if (r0 == 0) goto L104
            q8.o r2 = r1.f6791e
            android.app.Activity r2 = r2.a()
            if (r2 == 0) goto Ld2
            r14 = r2
        Ld2:
            r1.n(r0, r14, r3, r13)     // Catch: java.lang.Throwable -> Ld8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Ld8
            goto Ldf
        Ld8:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Ldf:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 != 0) goto Le6
            goto Lfd
        Le6:
            java.lang.String r0 = r2.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "发送收藏异常: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            i8.i.f(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        Lfd:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L104:
            java.lang.String r0 = "发送收藏失败: API 未就绪"
            i8.i.f(r0)
            return r12
        L10a:
            r3 = r20
            j8.c r0 = r1.y(r13)
            if (r0 == 0) goto L117
            boolean r0 = r1.B(r3, r0)
            return r0
        L117:
            java.util.concurrent.ConcurrentHashMap r0 = j8.d.f6777a
            ia.t r1 = new ia.t
            java.lang.Class<j8.h> r0 = j8.h.class
            java.lang.Class r4 = eh.a.i(r0)
            r8 = 0
            r9 = 3
            r0 = r2
            r2 = 2
            java.lang.String r5 = "logFavoriteVoice"
            java.lang.String r6 = "logFavoriteVoice(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r7 = 0
            r16 = r12
            r12 = r3
            r3 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r1
            r1 = r3
            java.lang.ClassLoader r3 = r1.f6789c
            r3.getClass()
            int r4 = j8.d.e(r13)
            if (r4 == r0) goto L141
            goto L24a
        L141:
            java.lang.Class r0 = r13.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = j8.d.f6778b
            java.lang.Object r5 = r4.get(r0)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L158
            boolean r6 = j8.d.i(r0, r5)
            if (r6 == 0) goto L158
            r15 = r5
            goto L1ff
        L158:
            java.lang.String r5 = "Hchat_favorite_voice_method_cache"
            android.content.SharedPreferences r5 = ub.b.c(r14, r5)
            java.lang.String r6 = e8.b.g(r14, r3)
            java.lang.String r7 = r0.getName()
            java.lang.String r8 = "fav_voice_download_v1_"
            java.lang.String r7 = r8.concat(r7)
            java.lang.reflect.Method r8 = e8.b.c(r5, r6, r3, r7)
            if (r8 == 0) goto L17e
            boolean r9 = j8.d.i(r0, r8)
            if (r9 == 0) goto L17e
            r4.put(r0, r8)
            r15 = r8
            goto L1ff
        L17e:
            org.luckypray.dexkit.DexKitBridge r8 = r1.f6790d
            if (r8 != 0) goto L185
            r15 = 0
            goto L1ff
        L185:
            ch.e r9 = new ch.e     // Catch: java.lang.Throwable -> L1da
            r9.<init>()     // Catch: java.lang.Throwable -> L1da
            fh.k r14 = new fh.k     // Catch: java.lang.Throwable -> L1da
            r14.<init>()     // Catch: java.lang.Throwable -> L1da
            java.lang.String r15 = "key_detail_data_id"
            java.lang.String r1 = "key_detail_info_id"
            java.lang.String r10 = "get fav item info error"
            java.lang.String[] r1 = new java.lang.String[]{r15, r1, r10}     // Catch: java.lang.Throwable -> L1da
            java.util.List r1 = a.a.y0(r1)     // Catch: java.lang.Throwable -> L1da
            fh.k.u0(r14, r1)     // Catch: java.lang.Throwable -> L1da
            r9.f1666h = r14     // Catch: java.lang.Throwable -> L1da
            hh.p r1 = r8.findMethod(r9)     // Catch: java.lang.Throwable -> L1da
            dg.n r1 = tf.m.m1(r1)     // Catch: java.lang.Throwable -> L1da
            i2.z r8 = new i2.z     // Catch: java.lang.Throwable -> L1da
            r9 = 8
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1da
            dg.j r9 = new dg.j     // Catch: java.lang.Throwable -> L1da
            ng.q r10 = ng.q.f9453n     // Catch: java.lang.Throwable -> L1da
            r9.<init>(r1, r8, r10)     // Catch: java.lang.Throwable -> L1da
            b0.d0 r1 = new b0.d0     // Catch: java.lang.Throwable -> L1da
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1da
            ng.i r1 = ng.m.X(r9, r1)     // Catch: java.lang.Throwable -> L1da
            ng.h r3 = new ng.h     // Catch: java.lang.Throwable -> L1da
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1da
        L1c6:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L1da
            if (r1 == 0) goto L1dc
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L1da
            r8 = r1
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L1da
            boolean r8 = j8.d.i(r0, r8)     // Catch: java.lang.Throwable -> L1da
            if (r8 == 0) goto L1c6
            goto L1dd
        L1da:
            r0 = move-exception
            goto L1ea
        L1dc:
            r1 = 0
        L1dd:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L1da
            if (r1 == 0) goto L1e8
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L1da
            e8.b.h(r5, r6, r7, r1)     // Catch: java.lang.Throwable -> L1da
            goto L1ef
        L1e8:
            r1 = 0
            goto L1ef
        L1ea:
            sf.f r1 = new sf.f
            r1.<init>(r0)
        L1ef:
            java.lang.Throwable r0 = sf.g.b(r1)
            if (r0 != 0) goto L1f7
            r15 = r1
            goto L1fd
        L1f7:
            java.lang.String r1 = "收藏语音定位下载方法失败"
            r2.invoke(r1, r0)
            r15 = 0
        L1fd:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
        L1ff:
            if (r15 == 0) goto L24a
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r0 == 0) goto L24a
            ac.l r1 = new ac.l
            r3 = 17
            r1.<init>(r15, r13, r2, r3)
            r0.e(r1)
            o8.j r6 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r6 == 0) goto L247
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r1 = ":"
            r0.append(r1)
            r10 = r18
            r0.append(r10)
            java.lang.String r2 = r0.toString()
            r1 = r17
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r1.f6798l
            boolean r0 = r0.add(r2)
            r7 = 1
            if (r0 != 0) goto L23a
        L238:
            r12 = r7
            goto L250
        L23a:
            b9.c r0 = new b9.c
            r5 = 8
            r4 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d(r0)
            goto L238
        L247:
            r12 = r16
            goto L250
        L24a:
            java.lang.String r0 = "发送收藏语音失败: 文件不存在且无法启动下载"
            i8.i.f(r0)
            goto L247
        L250:
            return r12
        L251:
            r10 = r18
            r16 = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "发送收藏失败: 未找到收藏 localId="
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            i8.i.f(r0)
            return r16
        L267:
            java.lang.String r0 = "发送收藏失败: talker/localId 为空"
            i8.i.f(r0)
            return r16
    }
}
