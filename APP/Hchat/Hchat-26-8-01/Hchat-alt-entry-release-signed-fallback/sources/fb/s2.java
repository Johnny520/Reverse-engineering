package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.content.Context f3770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f3771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.io.File f3772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.io.File f3773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f3774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f3775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.LinkedHashMap f3776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f3777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3781r;

    public s2(android.content.Context r1, java.lang.String r2, java.io.File r3, java.io.File r4, boolean r5, java.lang.String r6, java.util.LinkedHashMap r7, java.lang.String r8, int r9, int r10, int r11, boolean r12) {
            r0 = this;
            r8.getClass()
            r0.<init>()
            r0.f3770g = r1
            r0.f3771h = r2
            r0.f3772i = r3
            r0.f3773j = r4
            r0.f3774k = r5
            r0.f3775l = r6
            r0.f3776m = r7
            r0.f3777n = r8
            r0.f3778o = r9
            r0.f3779p = r12
            r0.f3780q = r10
            r0.f3781r = r11
            return
    }

    public static fb.n2 J(fb.s2 r18, java.lang.String r19, int r20) {
            r0 = r18
            r1 = r20 & 1
            if (r1 == 0) goto L9
            java.lang.String r1 = "."
            goto Lb
        L9:
            r1 = r19
        Lb:
            r2 = r20 & 2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L13
            r2 = r4
            goto L14
        L13:
            r2 = r3
        L14:
            java.util.concurrent.ConcurrentHashMap r5 = fb.t2.f3808a
            java.util.LinkedHashMap r5 = r0.f3776m
            java.io.File r6 = r0.f3772i
            java.io.File r0 = r0.f3773j
            java.util.Map r7 = fb.t2.S(r0)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r9 = r7.size()
            int r9 = tf.y.a0(r9)
            r8.<init>(r9)
            java.util.Set r7 = r7.entrySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L37:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L57
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.util.concurrent.ConcurrentHashMap r11 = fb.t2.f3808a
            java.lang.Object r9 = r9.getValue()
            fb.q2 r9 = (fb.q2) r9
            java.lang.String r9 = fb.t2.R(r9)
            r8.put(r10, r9)
            goto L37
        L57:
            java.util.Set r7 = r8.keySet()
            java.util.Set r9 = r5.keySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Set r7 = tf.d0.T(r7, r9)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L70:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L87
            java.lang.Object r10 = r7.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = fb.t2.h(r1, r11)
            if (r11 == 0) goto L70
            r9.add(r10)
            goto L70
        L87:
            java.util.List r13 = tf.m.J1(r9)
            java.util.Set r7 = r5.keySet()
            java.util.Set r9 = r8.keySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Set r7 = tf.d0.T(r7, r9)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        La4:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lbb
            java.lang.Object r10 = r7.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = fb.t2.h(r1, r11)
            if (r11 == 0) goto La4
            r9.add(r10)
            goto La4
        Lbb:
            java.util.List r15 = tf.m.J1(r9)
            java.util.Set r7 = r5.keySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Set r9 = r8.keySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.LinkedHashSet r7 = tf.m.x1(r7, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        Ld8:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lfd
            java.lang.Object r10 = r7.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = fb.t2.h(r1, r11)
            if (r12 == 0) goto Ld8
            java.lang.Object r12 = r5.get(r11)
            java.lang.Object r11 = r8.get(r11)
            boolean r11 = gg.l.a(r12, r11)
            if (r11 != 0) goto Ld8
            r9.add(r10)
            goto Ld8
        Lfd:
            java.util.List r14 = tf.m.J1(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r2 == 0) goto L111
            java.util.ArrayList r2 = tf.m.F1(r13, r14)
            java.util.ArrayList r2 = tf.m.F1(r2, r15)
            goto L113
        L111:
            tf.t r2 = tf.t.f13167g
        L113:
            java.util.Iterator r2 = r2.iterator()
        L117:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L188
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.io.File r7 = new java.io.File
            r7.<init>(r6, r5)
            java.io.File r8 = new java.io.File
            r8.<init>(r0, r5)
            boolean r9 = r13.contains(r5)
            r10 = 0
            if (r9 == 0) goto L139
            java.lang.String r5 = fb.t2.x(r10, r8, r5)
            goto L148
        L139:
            boolean r9 = r15.contains(r5)
            if (r9 == 0) goto L144
            java.lang.String r5 = fb.t2.x(r7, r10, r5)
            goto L148
        L144:
            java.lang.String r5 = fb.t2.x(r7, r8, r5)
        L148:
            int r7 = r1.length()
            if (r7 != 0) goto L151
            java.lang.String r7 = ""
            goto L153
        L151:
            java.lang.String r7 = "\n\n"
        L153:
            int r8 = r1.length()
            int r9 = r7.length()
            int r9 = r9 + r8
            int r8 = r5.length()
            int r8 = r8 + r9
            r9 = 96000(0x17700, float:1.34525E-40)
            if (r8 <= r9) goto L181
            int r0 = r1.length()
            int r9 = r9 - r0
            int r0 = r7.length()
            int r9 = r9 - r0
            if (r9 >= 0) goto L173
            goto L174
        L173:
            r3 = r9
        L174:
            r1.append(r7)
            java.lang.String r0 = og.m.P0(r3, r5)
            r1.append(r0)
            r17 = r4
            goto L18a
        L181:
            r1.append(r7)
            r1.append(r5)
            goto L117
        L188:
            r17 = r3
        L18a:
            if (r17 == 0) goto L191
            java.lang.String r0 = "\n... diff 已截断，请按 path 分段调用 show_diff ..."
            r1.append(r0)
        L191:
            fb.n2 r12 = new fb.n2
            java.lang.String r16 = r1.toString()
            r12.<init>(r13, r14, r15, r16, r17)
            return r12
    }

    public static java.lang.String y(java.lang.String r12, boolean r13) {
            java.lang.CharSequence r12 = og.m.R0(r12)
            java.lang.String r12 = r12.toString()
            r0 = 92
            r1 = 47
            java.lang.String r12 = og.t.b0(r12, r0, r1)
            r0 = 1
            char[] r2 = new char[r0]
            r3 = 0
            r2[r3] = r1
            java.lang.String r12 = og.m.S0(r12, r2)
            boolean r2 = og.m.t0(r12)
            r4 = 0
            java.lang.String r5 = "."
            if (r2 != 0) goto L98
            boolean r2 = r12.equals(r5)
            if (r2 == 0) goto L2b
            goto L98
        L2b:
            boolean r13 = og.m.I0(r12, r1)
            if (r13 != 0) goto L92
            boolean r13 = og.m.i0(r12, r3)
            if (r13 != 0) goto L92
            char[] r13 = new char[r0]
            r13[r3] = r1
            r1 = 6
            java.util.List r6 = og.m.F0(r12, r13, r1)
            boolean r13 = r6.isEmpty()
            if (r13 == 0) goto L47
            goto L78
        L47:
            java.util.Iterator r13 = r6.iterator()
        L4b:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L6e
            boolean r2 = r1.equals(r5)
            if (r2 != 0) goto L6e
            java.lang.String r2 = ".."
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6c
            goto L6e
        L6c:
            r1 = r3
            goto L6f
        L6e:
            r1 = r0
        L6f:
            if (r1 != 0) goto L72
            goto L4b
        L72:
            java.lang.String r12 = "路径包含不允许的片段"
            j8.o.t(r12)
            return r4
        L78:
            int r12 = r12.length()
            r13 = 240(0xf0, float:3.36E-43)
            if (r12 > r13) goto L8c
            r10 = 0
            r11 = 62
            java.lang.String r7 = "/"
            r8 = 0
            r9 = 0
            java.lang.String r12 = tf.m.A1(r6, r7, r8, r9, r10, r11)
            return r12
        L8c:
            java.lang.String r12 = "路径过长"
            j8.o.t(r12)
            return r4
        L92:
            java.lang.String r12 = "必须使用插件目录内的相对路径"
            j8.o.t(r12)
            return r4
        L98:
            if (r13 == 0) goto L9b
            return r5
        L9b:
            java.lang.String r12 = "path 不能为空"
            j8.o.t(r12)
            return r4
    }

    public final java.lang.String A(org.json.JSONObject r21) {
            r20 = this;
            r0 = r21
            java.lang.String r1 = "path"
            java.lang.String r2 = ""
            java.lang.String r3 = r0.optString(r1, r2)
            r3.getClass()
            r4 = 0
            java.lang.String r3 = y(r3, r4)
            r5 = r20
            java.io.File r6 = r5.D(r3, r4)
            boolean r7 = r6.isFile()
            r8 = 0
            if (r7 == 0) goto L1de
            long r9 = r6.length()
            r11 = 2097152(0x200000, double:1.036131E-317)
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 > 0) goto L1d8
            byte[] r6 = dg.l.g0(r6)
            java.util.concurrent.ConcurrentHashMap r7 = fb.t2.f3808a
            boolean r7 = fb.t2.C(r6)
            if (r7 == 0) goto L1ce
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = og.a.f9804a
            r7.<init>(r6, r8)
            java.lang.String r6 = "\r\n"
            java.lang.String r8 = "\n"
            java.lang.String r6 = og.t.a0(r7, r6, r8, r4)
            r8 = 13
            r9 = 10
            java.lang.String r6 = r6.replace(r8, r9)
            r6.getClass()
            int r8 = r6.length()
            r10 = 1
            if (r8 != 0) goto L5a
            tf.t r6 = tf.t.f13167g
            goto L76
        L5a:
            boolean r8 = og.m.l0(r6, r9)
            r11 = 6
            if (r8 == 0) goto L6e
            java.lang.String r6 = og.m.k0(r10, r6)
            char[] r8 = new char[r10]
            r8[r4] = r9
            java.util.List r6 = og.m.F0(r6, r8, r11)
            goto L76
        L6e:
            char[] r8 = new char[r10]
            r8[r4] = r9
            java.util.List r6 = og.m.F0(r6, r8, r11)
        L76:
            java.lang.String r8 = "start_line"
            int r8 = r0.optInt(r8, r10)
            if (r8 >= r10) goto L7f
            r8 = r10
        L7f:
            java.lang.String r11 = "start_column"
            int r11 = r0.optInt(r11, r10)
            if (r11 >= r10) goto L88
            r11 = r10
        L88:
            java.lang.String r12 = "max_lines"
            r13 = 400(0x190, float:5.6E-43)
            int r12 = r0.optInt(r12, r13)
            r13 = 2000(0x7d0, float:2.803E-42)
            int r12 = r9.e0.r(r12, r10, r13)
            java.lang.String r13 = "end_line"
            int r13 = r0.optInt(r13, r4)
            if (r13 <= 0) goto La9
            if (r13 >= r8) goto La1
            r13 = r8
        La1:
            int r12 = r6.size()
            if (r13 <= r12) goto Lb1
        La7:
            r13 = r12
            goto Lb1
        La9:
            int r12 = r12 + r8
            int r12 = r12 - r10
            int r13 = r6.size()
            if (r12 <= r13) goto La7
        Lb1:
            java.lang.String r12 = "include_line_numbers"
            boolean r0 = r0.optBoolean(r12, r10)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r14 = r6.size()
            if (r8 > r14) goto L174
            if (r8 > r13) goto L174
            r15 = r4
            r16 = r15
            r14 = r8
        Lc8:
            int r4 = r14 + (-1)
            java.lang.Object r4 = r6.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r14 != r8) goto Ldd
            int r17 = r4.length()
            int r9 = r17 + 1
            if (r11 <= r9) goto Ldb
            goto Lde
        Ldb:
            r9 = r11
            goto Lde
        Ldd:
            r9 = r10
        Lde:
            int r10 = r9 + (-1)
            java.lang.String r4 = r4.substring(r10)
            if (r0 == 0) goto L10e
            java.lang.String r10 = " | "
            r21 = r0
            r0 = 1
            if (r9 <= r0) goto L107
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r18 = r2
            java.lang.String r2 = ":"
            r0.append(r2)
            r0.append(r9)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            goto L114
        L107:
            r18 = r2
            java.lang.String r0 = p.a.i(r14, r10)
            goto L114
        L10e:
            r21 = r0
            r18 = r2
            r0 = r18
        L114:
            int r2 = r12.length()
            if (r2 != 0) goto L11e
            r17 = 1
        L11c:
            r2 = 1
            goto L121
        L11e:
            r17 = 0
            goto L11c
        L121:
            r10 = r17 ^ 1
            r17 = 64000(0xfa00, float:8.9683E-41)
            int r19 = r12.length()
            int r17 = r17 - r19
            int r17 = r17 - r10
            int r10 = r0.length()
            int r10 = r17 - r10
            if (r10 > 0) goto L137
            goto L176
        L137:
            int r17 = r12.length()
            r2 = 10
            if (r17 <= 0) goto L142
            r12.append(r2)
        L142:
            r12.append(r0)
            int r0 = r4.length()
            if (r0 <= r10) goto L154
            java.lang.String r0 = og.m.P0(r10, r4)
            r12.append(r0)
            int r9 = r9 + r10
            goto L176
        L154:
            r12.append(r4)
            if (r14 != r13) goto L163
            int r0 = r6.size()
            if (r13 >= r0) goto L163
            int r15 = r13 + 1
            r16 = 1
        L163:
            if (r14 != r13) goto L169
            r14 = r15
            r9 = r16
            goto L176
        L169:
            int r14 = r14 + 1
            r0 = r21
            r9 = r2
            r2 = r18
            r4 = 0
            r10 = 1
            goto Lc8
        L174:
            r9 = 0
            r14 = 0
        L176:
            org.json.JSONObject r0 = r5.z()
            r0.put(r1, r3)
            java.lang.String r1 = "startLine"
            r0.put(r1, r8)
            java.lang.String r1 = "startColumn"
            r0.put(r1, r11)
            java.lang.String r1 = "endLine"
            r0.put(r1, r13)
            java.lang.String r1 = "returnedLength"
            int r2 = r12.length()
            r0.put(r1, r2)
            java.lang.String r1 = "totalLength"
            int r2 = r7.length()
            r0.put(r1, r2)
            java.lang.String r1 = "totalLines"
            int r2 = r6.size()
            r0.put(r1, r2)
            if (r14 <= 0) goto L1ab
            r4 = 1
            goto L1ac
        L1ab:
            r4 = 0
        L1ac:
            java.lang.String r1 = "truncated"
            r0.put(r1, r4)
            if (r14 <= 0) goto L1bd
            java.lang.String r1 = "nextLine"
            r0.put(r1, r14)
            java.lang.String r1 = "nextColumn"
            r0.put(r1, r9)
        L1bd:
            java.lang.String r1 = "content"
            java.lang.String r2 = r12.toString()
            r0.put(r1, r2)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            return r0
        L1ce:
            java.lang.String r0 = "文件不是可读取的文本文件: "
            java.lang.String r0 = r0.concat(r3)
            j8.o.q(r0)
            return r8
        L1d8:
            java.lang.String r0 = "文件超过 2 MB，不能作为文本读取"
            j8.o.t(r0)
            return r8
        L1de:
            java.lang.String r0 = "文件不存在: "
            java.lang.String r0 = r0.concat(r3)
            j8.o.q(r0)
            return r8
    }

    public final void B() {
            r1 = this;
            boolean r0 = r1.f3779p
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "整个插件已标记删除，不能继续修改文件"
            j8.o.t(r0)
            return
    }

    public final java.lang.String C() {
            r7 = this;
            java.util.concurrent.ConcurrentHashMap r0 = fb.t2.f3808a
            java.io.File r0 = r7.f3772i
            java.util.Map r1 = fb.t2.S(r0)
            java.lang.String r1 = fb.t2.a0(r1)
            java.lang.String r2 = r7.f3775l
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            java.io.File r1 = r7.f3773j
            java.io.File[] r2 = r1.listFiles()
            r3 = 0
            if (r2 == 0) goto L2b
            java.util.concurrent.ConcurrentHashMap r4 = fb.t2.f3808a
            int r4 = r2.length
            r5 = r3
        L21:
            if (r5 >= r4) goto L2b
            r6 = r2[r5]
            fb.t2.p(r6)
            int r5 = r5 + 1
            goto L21
        L2b:
            boolean r2 = r7.f3774k
            if (r2 == 0) goto L34
            java.util.concurrent.ConcurrentHashMap r2 = fb.t2.f3808a
            fb.t2.n(r0, r1)
        L34:
            r7.f3779p = r3
            r7.g()
            org.json.JSONObject r0 = r7.H()
            java.lang.String r1 = "reset"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = "hasChanges"
            r0.put(r1, r3)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            return r0
        L50:
            java.lang.String r0 = "原插件已在任务期间发生变化，请重新读取后修改"
            j8.o.t(r0)
            r0 = 0
            return r0
    }

    public final java.io.File D(java.lang.String r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "."
            boolean r0 = gg.l.a(r6, r0)
            java.io.File r1 = r5.f3773j
            if (r0 == 0) goto Lc
            r0 = r1
            goto L11
        Lc:
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r6)
        L11:
            java.io.File r6 = r0.getCanonicalFile()
            java.io.File r0 = r1.getCanonicalFile()
            boolean r1 = gg.l.a(r6, r0)
            if (r1 != 0) goto L4a
            java.lang.String r1 = r6.getPath()
            r1.getClass()
            java.lang.String r2 = r0.getPath()
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r3 = 0
            boolean r1 = og.t.d0(r1, r2, r3)
            if (r1 == 0) goto L43
            goto L4a
        L43:
            java.lang.String r6 = "路径超出插件工作区"
            j8.o.t(r6)
        L48:
            r6 = 0
            return r6
        L4a:
            if (r7 != 0) goto L59
            boolean r7 = gg.l.a(r6, r0)
            if (r7 != 0) goto L53
            goto L59
        L53:
            java.lang.String r6 = "不能操作插件工作区根目录"
            j8.o.t(r6)
            goto L48
        L59:
            r6.getClass()
            return r6
    }

    public final java.lang.String E(org.json.JSONObject r10) {
            r9 = this;
            r9.B()
            java.util.concurrent.ConcurrentHashMap r0 = fb.t2.f3808a
            java.io.File r0 = r9.f3772i
            java.util.Map r1 = fb.t2.S(r0)
            java.lang.String r1 = fb.t2.a0(r1)
            java.lang.String r2 = r9.f3775l
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto Lc7
            java.lang.String r1 = ""
            java.lang.String r3 = "path"
            java.lang.String r10 = r10.optString(r3, r1)
            r10.getClass()
            r1 = 0
            java.lang.String r10 = y(r10, r1)
            java.io.File r4 = r9.D(r10, r1)
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r10)
            java.io.File r5 = r5.getAbsoluteFile()
            java.io.File r6 = r5.getCanonicalFile()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lc1
            boolean r5 = gg.l.a(r6, r0)
            if (r5 != 0) goto L67
            java.lang.String r5 = r6.getPath()
            r5.getClass()
            java.lang.String r0 = r0.getPath()
            java.lang.String r7 = java.io.File.separator
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r7)
            java.lang.String r0 = r8.toString()
            boolean r0 = og.t.d0(r5, r0, r1)
            if (r0 == 0) goto Lc1
        L67:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L7e
            boolean r0 = r6.exists()
            if (r0 == 0) goto L74
            goto L7e
        L74:
            java.lang.String r0 = "路径在原插件和工作区中都不存在: "
            java.lang.String r10 = r0.concat(r10)
            j8.o.q(r10)
            return r2
        L7e:
            boolean r0 = r4.exists()
            if (r0 == 0) goto L89
            java.util.concurrent.ConcurrentHashMap r0 = fb.t2.f3808a
            fb.t2.p(r4)
        L89:
            boolean r0 = r6.exists()
            if (r0 == 0) goto L94
            java.util.concurrent.ConcurrentHashMap r0 = fb.t2.f3808a
            fb.t2.m(r6, r4)
        L94:
            java.util.concurrent.ConcurrentHashMap r0 = fb.t2.f3808a
            java.io.File r0 = r9.f3773j
            fb.t2.s(r0)
            r9.g()
            org.json.JSONObject r0 = r9.H()
            r0.put(r3, r10)
            java.lang.String r10 = "restored"
            boolean r1 = r6.exists()
            r0.put(r10, r1)
            boolean r10 = r6.exists()
            r10 = r10 ^ 1
            java.lang.String r1 = "removedNewPath"
            r0.put(r1, r10)
            java.lang.String r10 = r0.toString()
            r10.getClass()
            return r10
        Lc1:
            java.lang.String r10 = "恢复路径超出原插件目录或使用了符号链接"
            j8.o.t(r10)
            return r2
        Lc7:
            java.lang.String r10 = "原插件已在任务期间发生变化，请重新读取后修改"
            j8.o.t(r10)
            return r2
    }

    public final java.lang.String F(org.json.JSONObject r24, fb.b r25) {
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.String r2 = "query"
            java.lang.String r3 = ""
            java.lang.String r4 = r0.optString(r2, r3)
            r4.getClass()
            boolean r5 = og.m.t0(r4)
            r6 = 0
            if (r5 != 0) goto L256
            java.lang.String r5 = "."
            java.lang.String r7 = "path"
            java.lang.String r5 = r0.optString(r7, r5)
            r5.getClass()
            r8 = 1
            java.lang.String r5 = y(r5, r8)
            java.io.File r9 = r1.D(r5, r8)
            boolean r10 = r9.exists()
            if (r10 == 0) goto L24a
            java.lang.String r5 = "case_sensitive"
            r10 = 0
            boolean r5 = r0.optBoolean(r5, r10)
            java.lang.String r11 = "regex"
            boolean r11 = r0.optBoolean(r11, r10)
            java.lang.String r12 = "limit"
            r13 = 50
            int r12 = r0.optInt(r12, r13)
            r13 = 200(0xc8, float:2.8E-43)
            int r12 = r9.e0.r(r12, r8, r13)
            java.lang.String r13 = "file_pattern"
            java.lang.String r13 = bc.e.l(r13, r3, r0)
            java.lang.String r14 = "exclude_pattern"
            java.lang.String r3 = bc.e.l(r14, r3, r0)
            boolean r14 = og.m.t0(r13)
            if (r14 != 0) goto L5e
            goto L5f
        L5e:
            r13 = r6
        L5f:
            if (r13 == 0) goto L66
            og.k r13 = fb.t2.c(r13)
            goto L67
        L66:
            r13 = r6
        L67:
            boolean r14 = og.m.t0(r3)
            if (r14 != 0) goto L6e
            goto L6f
        L6e:
            r3 = r6
        L6f:
            if (r3 == 0) goto L76
            og.k r3 = fb.t2.c(r3)
            goto L77
        L76:
            r3 = r6
        L77:
            java.lang.String r14 = "before_context"
            int r14 = r0.optInt(r14, r10)
            r15 = 10
            int r14 = r9.e0.r(r14, r10, r15)
            java.lang.String r8 = "after_context"
            int r0 = r0.optInt(r8, r10)
            int r8 = r9.e0.r(r0, r10, r15)
            if (r11 == 0) goto La1
            og.k r0 = new og.k
            if (r5 == 0) goto L96
            tf.v r11 = tf.v.f13169g
            goto L9c
        L96:
            og.l r11 = og.l.f9834h
            java.util.Set r11 = ac.p.N(r11)
        L9c:
            r0.<init>(r4, r11)
            r11 = r0
            goto La2
        La1:
            r11 = r6
        La2:
            if (r5 == 0) goto La7
            r16 = r4
            goto Lb2
        La7:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r4.toLowerCase(r0)
            r0.getClass()
            r16 = r0
        Lb2:
            org.json.JSONArray r15 = new org.json.JSONArray
            r15.<init>()
            boolean r0 = r9.isFile()
            if (r0 == 0) goto Lc6
            dg.n r0 = new dg.n
            r10 = 3
            r0.<init>(r9, r10)
            r18 = r6
            goto Ldd
        Lc6:
            dg.j r0 = new dg.j
            dg.k r10 = dg.k.f2255g
            r0.<init>(r9, r10, r6)
            fb.g0 r9 = new fb.g0
            r10 = 27
            r9.<init>(r10)
            ng.i r10 = new ng.i
            r18 = r6
            r6 = 1
            r10.<init>(r0, r6, r9)
            r0 = r10
        Ldd:
            java.util.Iterator r6 = r0.iterator()
        Le1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L228
            java.lang.Object r0 = r6.next()
            java.io.File r0 = (java.io.File) r0
            r25.d()
            int r9 = r15.length()
            if (r9 < r12) goto Lf8
            goto L228
        Lf8:
            java.io.File r9 = r1.f3773j
            java.io.File r9 = dg.l.i0(r0, r9)
            java.lang.String r9 = dg.l.d0(r9)
            if (r13 == 0) goto L10b
            boolean r10 = r13.d(r9)
            if (r10 != 0) goto L10b
            goto Le1
        L10b:
            if (r3 == 0) goto L114
            boolean r10 = r3.d(r9)
            if (r10 == 0) goto L114
            goto Le1
        L114:
            long r19 = r0.length()
            r21 = 2097152(0x200000, double:1.036131E-317)
            int r10 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r10 <= 0) goto L120
            goto Le1
        L120:
            byte[] r0 = dg.l.g0(r0)     // Catch: java.lang.Throwable -> L125
            goto L12c
        L125:
            r0 = move-exception
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
        L12c:
            boolean r10 = r0 instanceof sf.f
            if (r10 == 0) goto L133
            r0 = r18
        L133:
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L222
            java.util.concurrent.ConcurrentHashMap r10 = fb.t2.f3808a
            boolean r10 = fb.t2.C(r0)
            if (r10 != 0) goto L140
            goto Le1
        L140:
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r1 = og.a.f9804a
            r10.<init>(r0, r1)
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = "\n"
            r19 = r3
            r3 = 0
            java.lang.String r0 = og.t.a0(r10, r0, r1, r3)
            r1 = 13
            r10 = 10
            java.lang.String r0 = r0.replace(r1, r10)
            r0.getClass()
            r17 = r3
            r1 = 1
            char[] r3 = new char[r1]
            r3[r17] = r10
            r1 = 6
            java.util.List r0 = og.m.F0(r0, r3, r1)
            r3 = 0
        L16a:
            int r10 = r0.size()
            if (r3 >= r10) goto L20c
            int r10 = r15.length()
            if (r10 >= r12) goto L20c
            r25.d()
            java.lang.Object r10 = r0.get(r3)
            java.lang.String r10 = (java.lang.String) r10
            if (r11 == 0) goto L19e
            og.i r20 = og.k.b(r11, r10)
            if (r20 == 0) goto L190
            lg.d r1 = r20.b()
            if (r1 == 0) goto L190
            int r1 = r1.f8042g
            goto L191
        L190:
            r1 = -1
        L191:
            r24 = r16
            r16 = r5
            r5 = r24
            r24 = r6
            r17 = r8
            r6 = 6
            r8 = 0
            goto L1bc
        L19e:
            if (r5 == 0) goto L1ae
            r1 = r10
        L1a1:
            r24 = r16
            r16 = r5
            r5 = r24
            r24 = r6
            r17 = r8
            r6 = 6
            r8 = 0
            goto L1b8
        L1ae:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r10.toLowerCase(r1)
            r1.getClass()
            goto L1a1
        L1b8:
            int r1 = og.m.r0(r1, r5, r8, r8, r6)
        L1bc:
            if (r1 < 0) goto L1fd
            org.json.JSONObject r6 = wb.en.k(r7, r9)
            int r8 = r3 + 1
            r22 = r1
            java.lang.String r1 = "line"
            r6.put(r1, r8)
            int r1 = r22 + 1
            r22 = r5
            java.lang.String r5 = "column"
            r6.put(r5, r1)
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r1 = og.m.P0(r1, r10)
            java.lang.String r5 = "preview"
            r6.put(r5, r1)
            if (r14 <= 0) goto L1ec
            int r1 = r3 - r14
            org.json.JSONArray r1 = fb.t2.b(r0, r1, r3)
            java.lang.String r5 = "before"
            r6.put(r5, r1)
        L1ec:
            if (r17 <= 0) goto L1f9
            int r1 = r8 + r17
            org.json.JSONArray r1 = fb.t2.b(r0, r8, r1)
            java.lang.String r5 = "after"
            r6.put(r5, r1)
        L1f9:
            r15.put(r6)
            goto L1ff
        L1fd:
            r22 = r5
        L1ff:
            int r3 = r3 + 1
            r6 = r24
            r5 = r16
            r8 = r17
            r16 = r22
            r1 = 6
            goto L16a
        L20c:
            r24 = r6
            r17 = r8
            r22 = r16
            r16 = r5
            r1 = r23
            r6 = r24
            r5 = r16
            r8 = r17
            r3 = r19
            r16 = r22
            goto Le1
        L222:
            r22 = r16
            r1 = r23
            goto Le1
        L228:
            org.json.JSONObject r0 = r23.z()
            r0.put(r2, r4)
            java.lang.String r1 = "matches"
            r0.put(r1, r15)
            int r1 = r15.length()
            if (r1 < r12) goto L23c
            r8 = 1
            goto L23d
        L23c:
            r8 = 0
        L23d:
            java.lang.String r1 = "truncated"
            r0.put(r1, r8)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            return r0
        L24a:
            r18 = r6
            java.lang.String r0 = "搜索路径不存在: "
            java.lang.String r0 = r0.concat(r5)
            j8.o.q(r0)
            return r18
        L256:
            r18 = r6
            java.lang.String r0 = "query 不能为空"
            j8.o.t(r0)
            return r18
    }

    public final java.lang.String G(org.json.JSONObject r6) {
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "path"
            java.lang.String r6 = bc.e.l(r1, r0, r6)
            boolean r0 = og.m.t0(r6)
            r2 = 0
            java.lang.String r3 = "."
            if (r0 != 0) goto L1d
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            java.lang.String r6 = y(r6, r2)
            goto L1e
        L1d:
            r6 = r3
        L1e:
            r0 = 2
            fb.n2 r0 = J(r5, r6, r0)
            boolean r4 = r6.equals(r3)
            if (r4 == 0) goto L2d
            int r4 = r5.f3778o
            r5.f3781r = r4
        L2d:
            org.json.JSONObject r4 = r5.z()
            r4.put(r1, r6)
            java.lang.String r1 = "completeDiff"
            boolean r6 = r6.equals(r3)
            r4.put(r1, r6)
            boolean r6 = r0.a()
            if (r6 != 0) goto L47
            boolean r6 = r5.f3779p
            if (r6 == 0) goto L48
        L47:
            r2 = 1
        L48:
            java.lang.String r6 = "hasChanges"
            r4.put(r6, r2)
            org.json.JSONArray r6 = new org.json.JSONArray
            java.util.List r1 = r0.f3672a
            r6.<init>(r1)
            java.lang.String r1 = "created"
            r4.put(r1, r6)
            org.json.JSONArray r6 = new org.json.JSONArray
            java.util.List r1 = r0.f3673b
            r6.<init>(r1)
            java.lang.String r1 = "modified"
            r4.put(r1, r6)
            org.json.JSONArray r6 = new org.json.JSONArray
            java.util.List r1 = r0.f3674c
            r6.<init>(r1)
            java.lang.String r1 = "deleted"
            r4.put(r1, r6)
            java.lang.String r6 = "diff"
            java.lang.String r1 = r0.f3675d
            r4.put(r6, r1)
            java.lang.String r6 = "truncated"
            boolean r0 = r0.f3676e
            r4.put(r6, r0)
            java.lang.String r6 = r4.toString()
            r6.getClass()
            return r6
    }

    public final org.json.JSONObject H() {
            r3 = this;
            org.json.JSONObject r0 = r3.z()
            java.lang.String r1 = "staged"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = "persisted"
            r2 = 0
            r0.put(r1, r2)
            java.lang.String r1 = "message"
            java.lang.String r2 = "变更仅写入暂存工作区，尚未提交到真实插件目录"
            r0.put(r1, r2)
            return r0
    }

    public final java.lang.String I() {
            r7 = this;
            r0 = 0
            r1 = 1
            fb.n2 r0 = J(r7, r0, r1)
            boolean r2 = r7.f3779p
            r3 = 0
            if (r2 == 0) goto L13
            fb.z1 r2 = new fb.z1
            tf.t r4 = tf.t.f13167g
            r2.<init>(r4)
            goto L49
        L13:
            java.util.concurrent.ConcurrentHashMap r2 = fb.t2.f3808a     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r7.f3771h     // Catch: java.lang.Throwable -> L20
            java.io.File r4 = r7.f3773j     // Catch: java.lang.Throwable -> L20
            fb.p2 r2 = fb.t2.b0(r4, r2)     // Catch: java.lang.Throwable -> L20
            fb.z1 r2 = r2.f3717b     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r2 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r2)
            r2 = r4
        L27:
            java.lang.Throwable r4 = sf.g.b(r2)
            if (r4 != 0) goto L2e
            goto L47
        L2e:
            fb.z1 r2 = new fb.z1
            fb.a0 r5 = new fb.a0
            java.lang.String r4 = r4.getMessage()
            if (r4 == 0) goto L39
            goto L3b
        L39:
            java.lang.String r4 = "插件文件不完整"
        L3b:
            fb.b0 r6 = fb.b0.f3402g
            r5.<init>(r6, r4, r3)
            java.util.List r4 = a.a.x0(r5)
            r2.<init>(r4)
        L47:
            fb.z1 r2 = (fb.z1) r2
        L49:
            int r4 = r7.f3778o
            r7.f3780q = r4
            org.json.JSONObject r4 = r7.z()
            boolean r5 = r0.a()
            if (r5 != 0) goto L5b
            boolean r5 = r7.f3779p
            if (r5 == 0) goto L5c
        L5b:
            r3 = r1
        L5c:
            java.lang.String r5 = "hasChanges"
            r4.put(r5, r3)
            java.lang.String r3 = "deletePlugin"
            boolean r5 = r7.f3779p
            r4.put(r3, r5)
            org.json.JSONArray r3 = new org.json.JSONArray
            java.util.List r5 = r0.f3672a
            r3.<init>(r5)
            java.lang.String r5 = "created"
            r4.put(r5, r3)
            org.json.JSONArray r3 = new org.json.JSONArray
            java.util.List r5 = r0.f3673b
            r3.<init>(r5)
            java.lang.String r5 = "modified"
            r4.put(r5, r3)
            org.json.JSONArray r3 = new org.json.JSONArray
            java.util.List r0 = r0.f3674c
            r3.<init>(r0)
            java.lang.String r0 = "deleted"
            r4.put(r0, r3)
            java.lang.String r0 = "canApply"
            boolean r3 = r2.a()
            r4.put(r0, r3)
            java.util.ArrayList r0 = r2.b()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = tf.n.e1(r0)
            r3.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        La6:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lb8
            java.lang.Object r5 = r0.next()
            fb.a0 r5 = (fb.a0) r5
            java.lang.String r5 = r5.f3392b
            r3.add(r5)
            goto La6
        Lb8:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r3)
            java.lang.String r3 = "errors"
            r4.put(r3, r0)
            java.util.ArrayList r0 = r2.c()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        Ld3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le5
            java.lang.Object r3 = r0.next()
            fb.a0 r3 = (fb.a0) r3
            java.lang.String r3 = r3.f3392b
            r2.add(r3)
            goto Ld3
        Le5:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r2)
            java.lang.String r2 = "warnings"
            r4.put(r2, r0)
            java.lang.String r0 = "requiresDiff"
            r4.put(r0, r1)
            java.lang.String r0 = r4.toString()
            r0.getClass()
            return r0
    }

    public final java.lang.String K(org.json.JSONObject r13) {
            r12 = this;
            r12.B()
            java.lang.String r0 = "path"
            java.lang.String r1 = ""
            java.lang.String r2 = r13.optString(r0, r1)
            r2.getClass()
            r3 = 0
            java.lang.String r2 = y(r2, r3)
            java.io.File r4 = r12.D(r2, r3)
            java.lang.String r5 = "content"
            java.lang.String r1 = r13.optString(r5, r1)
            r1.getClass()
            java.nio.charset.Charset r5 = og.a.f9804a
            byte[] r5 = r1.getBytes(r5)
            r5.getClass()
            int r6 = r5.length
            long r6 = (long) r6
            r8 = 2097152(0x200000, double:1.036131E-317)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto Le2
            boolean r6 = r4.isDirectory()
            if (r6 != 0) goto Ld7
            boolean r6 = r4.exists()
            if (r6 == 0) goto L4e
            java.lang.String r7 = "overwrite"
            boolean r13 = r13.optBoolean(r7, r3)
            if (r13 == 0) goto L47
            goto L4e
        L47:
            java.lang.String r13 = "文件已存在；局部修改请使用 apply_patch，完整覆盖需传 overwrite=true"
            j8.o.t(r13)
            r13 = 0
            return r13
        L4e:
            int r13 = r5.length
            long r7 = (long) r13
            dg.j r13 = new dg.j
            r3 = 0
            java.io.File r5 = r12.f3773j
            dg.k r9 = dg.k.f2255g
            r13.<init>(r5, r9, r3)
            fb.l2 r3 = new fb.l2
            r5 = 2
            r3.<init>(r4, r5)
            ng.i r5 = new ng.i
            r9 = 1
            r5.<init>(r13, r9, r3)
            ng.h r13 = new ng.h
            r13.<init>(r5)
            r3 = r9
        L6c:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L98
            java.lang.Object r5 = r13.next()
            java.io.File r5 = (java.io.File) r5
            int r3 = r3 + r9
            long r10 = r5.length()
            long r7 = r7 + r10
            r5 = 512(0x200, float:7.17E-43)
            if (r3 > r5) goto L91
            r10 = 33554432(0x2000000, double:1.6578092E-316)
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 > 0) goto L8a
            goto L6c
        L8a:
            java.lang.String r13 = "插件总大小超过 32 MB"
            j8.o.t(r13)
            r13 = 0
            return r13
        L91:
            java.lang.String r13 = "插件文件数量超过 512"
            j8.o.t(r13)
            r13 = 0
            return r13
        L98:
            java.io.File r13 = r4.getParentFile()
            if (r13 == 0) goto Lb2
            boolean r3 = r13.isDirectory()
            if (r3 != 0) goto Lb2
            boolean r13 = r13.mkdirs()
            if (r13 == 0) goto Lab
            goto Lb2
        Lab:
            java.lang.String r13 = "创建父目录失败"
            j8.o.A(r13)
            r13 = 0
            return r13
        Lb2:
            fb.t2.a(r4, r1)
            r12.g()
            org.json.JSONObject r13 = r12.H()
            r13.put(r0, r2)
            java.lang.String r0 = "created"
            r1 = r6 ^ 1
            r13.put(r0, r1)
            java.lang.String r0 = "bytes"
            long r1 = r4.length()
            r13.put(r0, r1)
            java.lang.String r13 = r13.toString()
            r13.getClass()
            return r13
        Ld7:
            java.lang.String r13 = "目标是目录: "
            java.lang.String r13 = r13.concat(r2)
            j8.o.q(r13)
            r13 = 0
            return r13
        Le2:
            java.lang.String r13 = "写入内容超过 2 MB"
            j8.o.t(r13)
            r13 = 0
            return r13
    }

    public final synchronized boolean a(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            r7.getClass()     // Catch: java.lang.Throwable -> L2a
            java.lang.CharSequence r7 = og.m.R0(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = r6.f3771h     // Catch: java.lang.Throwable -> L2a
            boolean r0 = og.t.X(r7, r0)     // Catch: java.lang.Throwable -> L2a
            r1 = 1
            if (r0 == 0) goto L17
            monitor-exit(r6)
            return r1
        L17:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L2a
            android.content.Context r2 = r6.f3770g     // Catch: java.lang.Throwable -> L2a
            java.util.List r0 = r0.listPlugins(r2)     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            if (r0 == 0) goto L2c
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
        L28:
            r1 = r2
            goto L5d
        L2a:
            r7 = move-exception
            goto L5f
        L2c:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a
        L30:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L28
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L2a
            eb.c0 r3 = (eb.c0) r3     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r3.f2506a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r6.f3771h     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L5a
            java.lang.String r4 = r3.f2507b     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r4.equalsIgnoreCase(r7)     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L58
            java.lang.String r3 = r3.f2513h     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L5a
            boolean r3 = r3.equalsIgnoreCase(r7)     // Catch: java.lang.Throwable -> L2a
            if (r3 != r1) goto L5a
        L58:
            r3 = r1
            goto L5b
        L5a:
            r3 = r2
        L5b:
            if (r3 == 0) goto L30
        L5d:
            monitor-exit(r6)
            return r1
        L5f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            throw r7
    }

    public final java.lang.String b(org.json.JSONObject r35) {
            r34 = this;
            r34.B()
            java.lang.String r0 = "patch"
            java.lang.String r9 = ""
            r1 = r35
            java.lang.String r10 = r1.optString(r0, r9)
            r10.getClass()
            boolean r0 = og.m.t0(r10)
            if (r0 != 0) goto L893
            java.nio.charset.Charset r0 = og.a.f9804a
            byte[] r0 = r10.getBytes(r0)
            r0.getClass()
            int r0 = r0.length
            long r0 = (long) r0
            r2 = 4194304(0x400000, double:2.0722615E-317)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L889
            og.k r0 = fb.y1.f3861a
            c0.f r0 = new c0.f
            java.lang.Class<fb.s2> r1 = fb.s2.class
            java.lang.Class r3 = eh.a.i(r1)
            r7 = 0
            r8 = 14
            r1 = 1
            java.lang.String r4 = "readPatchText"
            java.lang.String r5 = "readPatchText(Ljava/lang/String;)Ljava/lang/String;"
            r6 = 0
            r2 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = "\r\n"
            java.lang.String r3 = "\n"
            r4 = 0
            java.lang.String r5 = og.t.a0(r10, r1, r3, r4)
            r6 = 13
            r7 = 10
            java.lang.String r5 = r5.replace(r6, r7)
            r5.getClass()
            r8 = 1
            char[] r10 = new char[r8]
            r10[r4] = r7
            java.lang.String r5 = og.m.U0(r5, r10)
            char[] r10 = new char[r8]
            r10[r4] = r7
            r12 = 6
            java.util.List r5 = og.m.F0(r5, r10, r12)
            java.lang.Object r10 = tf.m.v1(r5)
            java.lang.String r13 = "*** Begin Patch"
            boolean r10 = gg.l.a(r10, r13)
            if (r10 == 0) goto L87f
            java.lang.Object r10 = tf.m.C1(r5)
            java.lang.String r13 = "*** End Patch"
            boolean r10 = gg.l.a(r10, r13)
            if (r10 == 0) goto L875
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            r14 = r8
        L89:
            int r15 = r5.size()
            int r15 = r15 - r8
            if (r14 >= r15) goto L64a
            java.lang.Object r15 = r5.get(r14)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r12 = "*** Add File: "
            boolean r16 = og.t.d0(r15, r12, r4)
            r6 = 43
            java.lang.String r7 = "*** "
            if (r16 == 0) goto L133
            java.lang.String r12 = og.m.A0(r15, r12)
            java.lang.CharSequence r12 = og.m.R0(r12)
            java.lang.String r12 = r12.toString()
            r12.getClass()
            java.lang.String r12 = y(r12, r4)
            java.lang.String r15 = fb.y1.c(r10, r0, r12)
            if (r15 != 0) goto L127
            int r14 = r14 + 1
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        Lc2:
            int r16 = r5.size()
            r24 = 0
            int r11 = r16 + (-1)
            if (r14 >= r11) goto Lf9
            java.lang.Object r11 = r5.get(r14)
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = og.t.d0(r11, r7, r4)
            if (r11 != 0) goto Lf9
            int r11 = r14 + 1
            java.lang.Object r14 = r5.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            boolean r16 = og.m.I0(r14, r6)
            if (r16 == 0) goto Lef
            java.lang.String r14 = r14.substring(r8)
            r15.add(r14)
            r14 = r11
            goto Lc2
        Lef:
            java.lang.String r0 = "新增文件内容每行必须以 + 开头: "
            java.lang.String r0 = r0.concat(r12)
            j8.o.q(r0)
            return r24
        Lf9:
            boolean r6 = r15.isEmpty()
            if (r6 == 0) goto L101
            r6 = r9
            goto L111
        L101:
            r22 = 0
            r23 = 58
            java.lang.String r19 = "\n"
            r20 = 0
            java.lang.String r21 = "\n"
            r18 = r15
            java.lang.String r6 = tf.m.A1(r18, r19, r20, r21, r22, r23)
        L111:
            fb.w1 r7 = new fb.w1
            java.lang.String r11 = "add"
            r7.<init>(r12, r6, r11, r9)
            fb.y1.d(r10, r13, r7)
        L11b:
            r19 = r0
            r21 = r1
            r22 = r3
            r32 = r5
            r3 = r9
            r1 = r10
            goto L627
        L127:
            r24 = 0
            java.lang.String r0 = "新增文件已存在: "
            java.lang.String r0 = r0.concat(r12)
            j8.o.q(r0)
            return r24
        L133:
            r24 = 0
            java.lang.String r11 = "*** Delete File: "
            boolean r12 = og.t.d0(r15, r11, r4)
            if (r12 == 0) goto L171
            java.lang.String r6 = og.m.A0(r15, r11)
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            r6.getClass()
            java.lang.String r6 = y(r6, r4)
            java.lang.String r7 = fb.y1.c(r10, r0, r6)
            if (r7 == 0) goto L165
            fb.w1 r7 = new fb.w1
            java.lang.String r11 = "delete"
            r12 = r24
            r7.<init>(r6, r12, r11, r9)
            fb.y1.d(r10, r13, r7)
            int r14 = r14 + 1
            goto L11b
        L165:
            r12 = r24
            java.lang.String r0 = "删除文件不存在: "
            java.lang.String r0 = r0.concat(r6)
            j8.o.q(r0)
            return r12
        L171:
            java.lang.String r11 = "*** Update File: "
            boolean r12 = og.t.d0(r15, r11, r4)
            if (r12 == 0) goto L615
            java.lang.String r11 = og.m.A0(r15, r11)
            java.lang.CharSequence r11 = og.m.R0(r11)
            java.lang.String r11 = r11.toString()
            r11.getClass()
            java.lang.String r11 = y(r11, r4)
            java.lang.String r12 = fb.y1.c(r10, r0, r11)
            if (r12 == 0) goto L605
            int r15 = r14 + 1
            int r16 = r5.size()
            int r6 = r16 + (-1)
            if (r15 >= r6) goto L1e8
            java.lang.Object r6 = r5.get(r15)
            java.lang.String r6 = (java.lang.String) r6
            r16 = r8
            java.lang.String r8 = "*** Move to: "
            boolean r6 = og.t.d0(r6, r8, r4)
            if (r6 == 0) goto L1ea
            java.lang.Object r6 = r5.get(r15)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = og.m.A0(r6, r8)
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            r6.getClass()
            java.lang.String r6 = y(r6, r4)
            boolean r8 = r6.equals(r11)
            if (r8 != 0) goto L1dc
            java.lang.String r8 = fb.y1.c(r10, r0, r6)
            if (r8 != 0) goto L1d4
            int r15 = r14 + 2
            goto L1eb
        L1d4:
            java.lang.String r0 = "移动目标已存在: "
            j8.o.z(r6, r0)
            r24 = 0
            return r24
        L1dc:
            r24 = 0
            java.lang.String r0 = "移动目标与源文件相同: "
            java.lang.String r0 = r0.concat(r11)
            j8.o.q(r0)
            return r24
        L1e8:
            r16 = r8
        L1ea:
            r6 = r11
        L1eb:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r14 = 0
        L1f1:
            int r19 = r5.size()
            int r4 = r19 + (-1)
            if (r15 >= r4) goto L309
            java.lang.Object r4 = r5.get(r15)
            java.lang.String r4 = (java.lang.String) r4
            r19 = r0
            r0 = 0
            boolean r4 = og.t.d0(r4, r7, r0)
            java.lang.String r0 = "*** End of File"
            if (r4 == 0) goto L21d
            java.lang.Object r4 = r5.get(r15)
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L215
            goto L21d
        L215:
            r23 = r9
            r25 = r10
            r22 = r14
            goto L30d
        L21d:
            int r4 = r15 + 1
            java.lang.Object r15 = r5.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            boolean r21 = gg.l.a(r15, r0)
            if (r21 == 0) goto L236
            r15 = r4
            r23 = r9
            r25 = r10
            r22 = r14
            r0 = r16
            goto L30e
        L236:
            r21 = r4
            java.lang.String r4 = "@@"
            r22 = r14
            r14 = 0
            boolean r23 = og.t.d0(r15, r4, r14)
            if (r23 == 0) goto L2eb
            og.k r14 = fb.y1.f3861a
            java.util.regex.Pattern r14 = r14.f9833g
            java.util.regex.Matcher r14 = r14.matcher(r15)
            r14.getClass()
            boolean r23 = r14.matches()
            if (r23 != 0) goto L256
            r2 = 0
            goto L25b
        L256:
            og.i r2 = new og.i
            r2.<init>(r14, r15)
        L25b:
            if (r2 == 0) goto L272
            java.util.List r2 = r2.a()
            r14 = r16
            java.lang.Object r2 = tf.m.w1(r14, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L272
            r14 = 10
            java.lang.Integer r2 = og.t.e0(r14, r2)
            goto L273
        L272:
            r2 = 0
        L273:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r15 = r21
        L27a:
            int r21 = r5.size()
            r23 = r9
            r16 = 1
            int r9 = r21 + (-1)
            if (r15 >= r9) goto L2c8
            java.lang.Object r9 = r5.get(r15)
            java.lang.String r9 = (java.lang.String) r9
            r25 = r10
            r10 = 0
            boolean r9 = og.t.d0(r9, r4, r10)
            if (r9 != 0) goto L2ca
            java.lang.Object r9 = r5.get(r15)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = og.t.d0(r9, r7, r10)
            if (r9 == 0) goto L2ab
            java.lang.Object r9 = r5.get(r15)
            boolean r9 = gg.l.a(r9, r0)
            if (r9 == 0) goto L2ca
        L2ab:
            java.lang.Object r9 = r5.get(r15)
            boolean r9 = gg.l.a(r9, r0)
            if (r9 == 0) goto L2b9
            int r15 = r15 + 1
            r0 = 1
            goto L2cb
        L2b9:
            int r9 = r15 + 1
            java.lang.Object r10 = r5.get(r15)
            r14.add(r10)
            r15 = r9
            r9 = r23
            r10 = r25
            goto L27a
        L2c8:
            r25 = r10
        L2ca:
            r0 = 0
        L2cb:
            boolean r4 = r14.isEmpty()
            if (r4 != 0) goto L2df
            fb.y1.e(r11, r14)
            fb.x1 r4 = new fb.x1
            r4.<init>(r2, r14, r0)
            r8.add(r4)
            r14 = r22
            goto L2fe
        L2df:
            java.lang.String r0 = "补丁区块不能为空: "
            java.lang.String r0 = r0.concat(r11)
            j8.o.q(r0)
            r24 = 0
            return r24
        L2eb:
            r23 = r9
            r25 = r10
            if (r22 != 0) goto L2f7
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            goto L2f9
        L2f7:
            r14 = r22
        L2f9:
            r14.add(r15)
            r15 = r21
        L2fe:
            r0 = r19
            r9 = r23
            r10 = r25
            r4 = 0
            r16 = 1
            goto L1f1
        L309:
            r19 = r0
            goto L215
        L30d:
            r0 = 0
        L30e:
            if (r22 == 0) goto L33a
            boolean r2 = r22.isEmpty()
            if (r2 != 0) goto L319
            r2 = r22
            goto L31a
        L319:
            r2 = 0
        L31a:
            if (r2 == 0) goto L33a
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L32f
            fb.y1.e(r11, r2)
            fb.x1 r4 = new fb.x1
            r7 = 0
            r4.<init>(r7, r2, r0)
            r8.add(r4)
            goto L33a
        L32f:
            r7 = 0
            java.lang.String r0 = "带 @@ 的补丁不能混用无标题区块: "
            java.lang.String r0 = r0.concat(r11)
            j8.o.q(r0)
            return r7
        L33a:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L353
            boolean r0 = r6.equals(r11)
            if (r0 != 0) goto L347
            goto L353
        L347:
            java.lang.String r0 = "更新文件缺少补丁区块: "
            java.lang.String r0 = r0.concat(r11)
            j8.o.q(r0)
            r24 = 0
            return r24
        L353:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L361
            r21 = r1
            r22 = r3
            r32 = r5
            goto L5d5
        L361:
            r14 = 0
            boolean r0 = og.m.h0(r12, r1, r14)
            if (r0 == 0) goto L36b
            r27 = r1
            goto L36d
        L36b:
            r27 = r3
        L36d:
            java.lang.String r0 = og.t.a0(r12, r1, r3, r14)
            r2 = 13
            r4 = 10
            java.lang.String r0 = r0.replace(r2, r4)
            r0.getClass()
            boolean r7 = og.m.l0(r0, r4)
            int r9 = r0.length()
            if (r9 != 0) goto L38d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10 = 6
            goto L3b8
        L38d:
            if (r7 == 0) goto L3a6
            r14 = 1
            java.lang.String r0 = og.m.k0(r14, r0)
            char[] r9 = new char[r14]
            r20 = 0
            r9[r20] = r4
            r10 = 6
            java.util.List r0 = og.m.F0(r0, r9, r10)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
        L3a4:
            r0 = r9
            goto L3b8
        L3a6:
            r10 = 6
            r14 = 1
            r20 = 0
            char[] r9 = new char[r14]
            r9[r20] = r4
            java.util.List r0 = og.m.F0(r0, r9, r10)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            goto L3a4
        L3b8:
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
            r12 = 0
            r14 = 0
        L3bf:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L5aa
            java.lang.Object r17 = r8.next()
            int r2 = r9 + 1
            if (r9 < 0) goto L5a4
            r9 = r17
            fb.x1 r9 = (fb.x1) r9
            java.util.ArrayList r4 = r9.f3850b
            boolean r10 = r9.f3851c
            r21 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L3e0:
            boolean r22 = r4.hasNext()
            if (r22 == 0) goto L416
            r22 = r3
            java.lang.Object r3 = r4.next()
            r26 = r4
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            r32 = r5
            r5 = 43
            boolean r28 = og.m.I0(r4, r5)
            if (r28 != 0) goto L413
            java.lang.String r5 = "\\ "
            r33 = r7
            r7 = 0
            boolean r4 = og.t.d0(r4, r5, r7)
            if (r4 == 0) goto L407
            goto L40a
        L407:
            r1.add(r3)
        L40a:
            r3 = r22
            r4 = r26
            r5 = r32
            r7 = r33
            goto L3e0
        L413:
            r33 = r7
            goto L40a
        L416:
            r22 = r3
            r32 = r5
            r33 = r7
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = tf.n.e1(r1)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L429:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43e
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            java.lang.String r4 = r4.substring(r5)
            r3.add(r4)
            goto L429
        L43e:
            r5 = 1
            java.lang.Integer r1 = r9.f3849a
            if (r1 == 0) goto L451
            int r1 = r1.intValue()
            int r1 = r1 - r5
            int r1 = r1 + r14
            if (r1 >= 0) goto L44c
            r1 = 0
        L44c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L452
        L451:
            r1 = 0
        L452:
            if (r10 == 0) goto L460
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L460
            int r1 = r0.size()
            goto L503
        L460:
            r4 = -1
            if (r10 == 0) goto L48d
            int r1 = r0.size()
            int r5 = r3.size()
            int r1 = r1 - r5
            boolean r5 = fb.y1.a(r0, r3, r1)
            if (r5 == 0) goto L474
            goto L503
        L474:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            if (r1 < 0) goto L481
            boolean r1 = fb.y1.b(r0, r3, r1)
            if (r1 == 0) goto L481
            goto L482
        L481:
            r5 = 0
        L482:
            if (r5 == 0) goto L48a
            int r1 = r5.intValue()
            goto L503
        L48a:
            r1 = r4
            goto L503
        L48d:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L4aa
            if (r1 == 0) goto L4a0
            int r1 = r1.intValue()
            int r4 = r0.size()
            if (r1 <= r4) goto L503
            goto L48a
        L4a0:
            int r1 = r0.size()
            if (r12 <= r1) goto L4a7
            r12 = r1
        L4a7:
            r1 = r12
            goto L503
        L4aa:
            if (r1 == 0) goto L4bb
            int r5 = r1.intValue()
            boolean r5 = fb.y1.a(r0, r3, r5)
            if (r5 == 0) goto L4bb
            int r1 = r1.intValue()
            goto L503
        L4bb:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L4cb
            int r1 = r0.size()
            r7 = 0
            int r1 = r9.e0.r(r12, r7, r1)
            goto L503
        L4cb:
            int r1 = r0.size()
            int r5 = r3.size()
            int r1 = r1 - r5
            if (r1 >= 0) goto L4d7
            goto L48a
        L4d7:
            if (r12 >= 0) goto L4db
            r5 = 0
            goto L4dc
        L4db:
            r5 = r12
        L4dc:
            if (r5 > r1) goto L4ec
        L4de:
            boolean r7 = fb.y1.a(r0, r3, r5)
            if (r7 == 0) goto L4e6
        L4e4:
            r1 = r5
            goto L503
        L4e6:
            if (r5 != r1) goto L4e9
            goto L4ec
        L4e9:
            int r5 = r5 + 1
            goto L4de
        L4ec:
            if (r12 >= 0) goto L4ef
            r12 = 0
        L4ef:
            if (r12 > r1) goto L48a
            r5 = r4
        L4f2:
            boolean r7 = fb.y1.b(r0, r3, r12)
            if (r7 != 0) goto L4f9
            goto L4fd
        L4f9:
            if (r5 < 0) goto L4fc
            goto L48a
        L4fc:
            r5 = r12
        L4fd:
            if (r12 != r1) goto L500
            goto L4e4
        L500:
            int r12 = r12 + 1
            goto L4f2
        L503:
            if (r1 < 0) goto L57f
            java.util.ArrayList r4 = r9.f3850b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
        L511:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L54d
            java.lang.Object r9 = r4.next()
            java.lang.String r9 = (java.lang.String) r9
            r10 = 32
            boolean r10 = og.m.I0(r9, r10)
            if (r10 == 0) goto L533
            int r9 = r1 + r7
            java.lang.Object r9 = r0.get(r9)
            r5.add(r9)
        L52e:
            int r7 = r7 + 1
            r10 = 43
            goto L511
        L533:
            r10 = 45
            boolean r10 = og.m.I0(r9, r10)
            if (r10 == 0) goto L53c
            goto L52e
        L53c:
            r10 = 43
            boolean r12 = og.m.I0(r9, r10)
            if (r12 == 0) goto L511
            r12 = 1
            java.lang.String r9 = r9.substring(r12)
            r5.add(r9)
            goto L511
        L54d:
            r10 = 43
            int r4 = r3.size()
            r7 = 0
        L554:
            if (r7 >= r4) goto L55c
            r0.remove(r1)
            int r7 = r7 + 1
            goto L554
        L55c:
            r0.addAll(r1, r5)
            int r4 = r5.size()
            int r12 = r4 + r1
            int r1 = r5.size()
            int r3 = r3.size()
            int r1 = r1 - r3
            int r14 = r14 + r1
            r9 = r2
            r1 = r21
            r3 = r22
            r5 = r32
            r7 = r33
            r2 = 13
            r4 = 10
            r10 = 6
            goto L3bf
        L57f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "第 "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " 个补丁区块在 "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " 中找不到匹配上下文，请重新读取文件"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L5a4:
            a.a.Q0()
            r24 = 0
            throw r24
        L5aa:
            r21 = r1
            r22 = r3
            r32 = r5
            r33 = r7
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L5bb
            r12 = r23
            goto L5d5
        L5bb:
            r30 = 0
            r31 = 62
            r28 = 0
            r29 = 0
            r26 = r0
            java.lang.String r0 = tf.m.A1(r26, r27, r28, r29, r30, r31)
            if (r33 == 0) goto L5ce
            r1 = r27
            goto L5d0
        L5ce:
            r1 = r23
        L5d0:
            java.lang.String r0 = r0.concat(r1)
            r12 = r0
        L5d5:
            boolean r0 = r6.equals(r11)
            if (r0 != 0) goto L5f5
            fb.w1 r0 = new fb.w1
            java.lang.String r1 = "move-source"
            r7 = 0
            r0.<init>(r11, r7, r1, r11)
            r1 = r25
            fb.y1.d(r1, r13, r0)
            fb.w1 r0 = new fb.w1
            java.lang.String r2 = "move"
            r0.<init>(r6, r12, r2, r11)
            fb.y1.d(r1, r13, r0)
            r3 = r23
            goto L603
        L5f5:
            r1 = r25
            fb.w1 r0 = new fb.w1
            java.lang.String r2 = "update"
            r3 = r23
            r0.<init>(r11, r12, r2, r3)
            fb.y1.d(r1, r13, r0)
        L603:
            r14 = r15
            goto L627
        L605:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "更新文件不存在: "
            java.lang.String r1 = r1.concat(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L615:
            r19 = r0
            r21 = r1
            r22 = r3
            r32 = r5
            r3 = r9
            r1 = r10
            boolean r0 = og.m.t0(r15)
            if (r0 == 0) goto L63a
            int r14 = r14 + 1
        L627:
            r10 = r1
            r9 = r3
            r0 = r19
            r1 = r21
            r3 = r22
            r5 = r32
            r4 = 0
            r6 = 13
            r7 = 10
            r8 = 1
            r12 = 6
            goto L89
        L63a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "未知补丁指令: "
            java.lang.String r1 = r1.concat(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L64a:
            r3 = r9
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L86b
            java.util.Collection r0 = r13.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = tf.m.P1(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            dg.j r2 = new dg.j
            r4 = r34
            java.io.File r5 = r4.f3773j
            dg.k r6 = dg.k.f2255g
            r7 = 0
            r2.<init>(r5, r6, r7)
            fb.g0 r6 = new fb.g0
            r7 = 28
            r6.<init>(r7)
            ng.i r7 = new ng.i
            r14 = 1
            r7.<init>(r2, r14, r6)
            ng.h r2 = new ng.h
            r2.<init>(r7)
        L681:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6a1
            java.lang.Object r6 = r2.next()
            java.io.File r6 = (java.io.File) r6
            java.io.File r7 = dg.l.i0(r6, r5)
            java.lang.String r7 = dg.l.d0(r7)
            long r8 = r6.length()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r1.put(r7, r6)
            goto L681
        L6a1:
            java.util.Iterator r2 = r0.iterator()
        L6a5:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L6e1
            java.lang.Object r5 = r2.next()
            fb.w1 r5 = (fb.w1) r5
            java.lang.String r6 = r5.f3843b
            java.lang.String r5 = r5.f3842a
            if (r6 != 0) goto L6bb
            r1.remove(r5)
            goto L6a5
        L6bb:
            java.nio.charset.Charset r7 = og.a.f9804a
            byte[] r6 = r6.getBytes(r7)
            r6.getClass()
            int r6 = r6.length
            long r6 = (long) r6
            r8 = 2097152(0x200000, double:1.036131E-317)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 > 0) goto L6d5
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r1.put(r5, r6)
            goto L6a5
        L6d5:
            java.lang.String r0 = " 超过 2 MB"
            java.lang.String r0 = bc.e.i(r5, r0)
            j8.o.q(r0)
            r24 = 0
            return r24
        L6e1:
            int r2 = r1.size()
            r5 = 512(0x200, float:7.17E-43)
            if (r2 > r5) goto L863
            java.util.Collection r1 = r1.values()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r5 = 0
        L6f8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70a
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r7 = r2.longValue()
            long r5 = r5 + r7
            goto L6f8
        L70a:
            r1 = 33554432(0x2000000, double:1.6578092E-316)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L85b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L71a:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L72f
            java.lang.Object r5 = r2.next()
            r6 = r5
            fb.w1 r6 = (fb.w1) r6
            java.lang.String r6 = r6.f3843b
            if (r6 != 0) goto L71a
            r1.add(r5)
            goto L71a
        L72f:
            java.util.Iterator r1 = r1.iterator()
        L733:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L766
            java.lang.Object r2 = r1.next()
            fb.w1 r2 = (fb.w1) r2
            java.lang.String r5 = r2.f3842a
            r14 = 0
            java.io.File r5 = r4.D(r5, r14)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L733
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L758
            java.util.concurrent.ConcurrentHashMap r2 = fb.t2.f3808a
            fb.t2.p(r5)
            goto L733
        L758:
            java.lang.String r0 = r2.f3842a
            java.lang.String r1 = "统一补丁只能删除文件: "
            java.lang.String r0 = wb.en.g(r1, r0)
            j8.o.q(r0)
            r24 = 0
            return r24
        L766:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L76f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L784
            java.lang.Object r5 = r2.next()
            r6 = r5
            fb.w1 r6 = (fb.w1) r6
            java.lang.String r6 = r6.f3843b
            if (r6 == 0) goto L76f
            r1.add(r5)
            goto L76f
        L784:
            java.util.Iterator r1 = r1.iterator()
        L788:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7fb
            java.lang.Object r2 = r1.next()
            fb.w1 r2 = (fb.w1) r2
            java.lang.String r5 = r2.f3842a
            r14 = 0
            java.io.File r6 = r4.D(r5, r14)
            boolean r7 = r6.isDirectory()
            if (r7 == 0) goto L7bf
            java.io.File[] r7 = r6.listFiles()
            if (r7 != 0) goto L7a9
            java.io.File[] r7 = new java.io.File[r14]
        L7a9:
            int r7 = r7.length
            if (r7 != 0) goto L7bf
            boolean r7 = r6.delete()
            if (r7 == 0) goto L7b3
            goto L7bf
        L7b3:
            java.lang.String r0 = "替换空目录失败: "
            java.lang.String r0 = wb.en.g(r0, r5)
            ah.a.h(r0)
            r24 = 0
            return r24
        L7bf:
            boolean r7 = r6.isDirectory()
            if (r7 != 0) goto L7ef
            java.io.File r7 = r6.getParentFile()
            if (r7 == 0) goto L7e4
            boolean r8 = r7.isDirectory()
            if (r8 != 0) goto L7e4
            boolean r7 = r7.mkdirs()
            if (r7 == 0) goto L7d8
            goto L7e4
        L7d8:
            java.lang.String r0 = "创建父目录失败: "
            java.lang.String r0 = wb.en.g(r0, r5)
            ah.a.h(r0)
            r24 = 0
            return r24
        L7e4:
            java.util.concurrent.ConcurrentHashMap r5 = fb.t2.f3808a
            java.lang.String r2 = r2.f3843b
            if (r2 != 0) goto L7eb
            r2 = r3
        L7eb:
            fb.t2.a(r6, r2)
            goto L788
        L7ef:
            java.lang.String r0 = "统一补丁目标是目录: "
            java.lang.String r0 = wb.en.g(r0, r5)
            j8.o.q(r0)
            r24 = 0
            return r24
        L7fb:
            r4.g()
            org.json.JSONObject r1 = r4.H()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L80b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L84e
            java.lang.Object r3 = r0.next()
            fb.w1 r3 = (fb.w1) r3
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = r3.f3842a
            java.lang.String r7 = r3.f3845d
            java.lang.String r8 = "path"
            r5.put(r8, r6)
            java.lang.String r6 = "operation"
            java.lang.String r8 = r3.f3844c
            r5.put(r6, r8)
            boolean r6 = og.m.t0(r7)
            if (r6 != 0) goto L837
            java.lang.String r6 = "sourcePath"
            r5.put(r6, r7)
        L837:
            java.lang.String r3 = r3.f3843b
            if (r3 == 0) goto L84a
            java.nio.charset.Charset r6 = og.a.f9804a
            byte[] r3 = r3.getBytes(r6)
            r3.getClass()
            int r3 = r3.length
            java.lang.String r6 = "bytes"
            r5.put(r6, r3)
        L84a:
            r2.put(r5)
            goto L80b
        L84e:
            java.lang.String r0 = "files"
            r1.put(r0, r2)
            java.lang.String r0 = r1.toString()
            r0.getClass()
            return r0
        L85b:
            java.lang.String r0 = "插件总大小超过 32 MB"
            j8.o.t(r0)
            r24 = 0
            return r24
        L863:
            r24 = 0
            java.lang.String r0 = "插件文件数量超过 512"
            j8.o.t(r0)
            return r24
        L86b:
            r4 = r34
            r24 = 0
            java.lang.String r0 = "补丁没有文件变更"
            j8.o.t(r0)
            return r24
        L875:
            r4 = r34
            r24 = 0
            java.lang.String r0 = "补丁必须以 *** End Patch 结束"
            j8.o.t(r0)
            return r24
        L87f:
            r4 = r34
            r24 = 0
            java.lang.String r0 = "补丁必须以 *** Begin Patch 开始"
            j8.o.t(r0)
            return r24
        L889:
            r4 = r34
            r24 = 0
            java.lang.String r0 = "补丁超过 4 MB"
            j8.o.t(r0)
            return r24
        L893:
            r4 = r34
            r24 = 0
            java.lang.String r0 = "patch 不能为空"
            j8.o.t(r0)
            return r24
    }

    public final synchronized fb.i2 c() {
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            int r0 = r1.f3780q     // Catch: java.lang.Throwable -> L1f
            int r2 = r1.f3778o     // Catch: java.lang.Throwable -> L1f
            if (r0 != r2) goto L103
            int r0 = r1.f3781r     // Catch: java.lang.Throwable -> L1f
            if (r0 != r2) goto Lfb
            r0 = 3
            r2 = 0
            fb.n2 r0 = J(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r0.a()     // Catch: java.lang.Throwable -> L1f
            if (r3 != 0) goto L22
            boolean r3 = r1.f3779p     // Catch: java.lang.Throwable -> L1f
            if (r3 != 0) goto L22
            monitor-exit(r17)
            return r2
        L1f:
            r0 = move-exception
            goto L10b
        L22:
            boolean r3 = r1.f3779p     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L28
            r3 = r2
            goto L32
        L28:
            java.util.concurrent.ConcurrentHashMap r3 = fb.t2.f3808a     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r1.f3771h     // Catch: java.lang.Throwable -> L1f
            java.io.File r4 = r1.f3773j     // Catch: java.lang.Throwable -> L1f
            fb.p2 r3 = fb.t2.b0(r4, r3)     // Catch: java.lang.Throwable -> L1f
        L32:
            if (r3 == 0) goto L38
            fb.y r4 = r3.f3716a     // Catch: java.lang.Throwable -> L1f
            r12 = r4
            goto L39
        L38:
            r12 = r2
        L39:
            if (r3 == 0) goto L3e
            fb.z1 r3 = r3.f3717b     // Catch: java.lang.Throwable -> L1f
            goto L3f
        L3e:
            r3 = r2
        L3f:
            if (r3 == 0) goto L48
            boolean r4 = r3.a()     // Catch: java.lang.Throwable -> L1f
            r4 = r4 ^ 1
            goto L49
        L48:
            r4 = 0
        L49:
            if (r4 == 0) goto L70
            if (r3 == 0) goto L51
            java.util.ArrayList r2 = r3.b()     // Catch: java.lang.Throwable -> L1f
        L51:
            if (r2 != 0) goto L55
            tf.t r2 = tf.t.f13167g     // Catch: java.lang.Throwable -> L1f
        L55:
            java.lang.String r3 = "；"
            fb.g0 r6 = new fb.g0     // Catch: java.lang.Throwable -> L1f
            r0 = 26
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            r7 = 30
            r4 = 0
            r5 = 0
            java.lang.String r0 = tf.m.A1(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1f
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r2     // Catch: java.lang.Throwable -> L1f
        L70:
            r4 = r3
            java.lang.String r3 = r1.f3771h     // Catch: java.lang.Throwable -> L1f
            if (r12 == 0) goto L7a
            java.lang.String r5 = r12.f3852a     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto L7a
            goto L7c
        L7a:
            java.lang.String r5 = r1.f3777n     // Catch: java.lang.Throwable -> L1f
        L7c:
            java.io.File r6 = r1.f3773j     // Catch: java.lang.Throwable -> L1f
            java.lang.String r6 = r6.getCanonicalPath()     // Catch: java.lang.Throwable -> L1f
            r6.getClass()     // Catch: java.lang.Throwable -> L1f
            r7 = r4
            r4 = r5
            r5 = r6
            boolean r6 = r1.f3774k     // Catch: java.lang.Throwable -> L1f
            r8 = r7
            java.lang.String r7 = r1.f3775l     // Catch: java.lang.Throwable -> L1f
            r9 = r8
            java.util.List r8 = r0.f3672a     // Catch: java.lang.Throwable -> L1f
            r10 = r9
            java.util.List r9 = r0.f3673b     // Catch: java.lang.Throwable -> L1f
            r11 = r10
            java.util.List r10 = r0.f3674c     // Catch: java.lang.Throwable -> L1f
            r13 = r11
            java.lang.String r11 = r0.f3675d     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList r14 = tf.m.F1(r8, r9)     // Catch: java.lang.Throwable -> L1f
            java.util.List r0 = r0.f3674c     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList r0 = tf.m.F1(r14, r0)     // Catch: java.lang.Throwable -> L1f
            java.util.Set r0 = tf.m.T1(r0)     // Catch: java.lang.Throwable -> L1f
            java.util.List r0 = tf.m.P1(r0)     // Catch: java.lang.Throwable -> L1f
            r14 = r13
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L1f
            int r15 = tf.n.e1(r0)     // Catch: java.lang.Throwable -> L1f
            int r15 = tf.y.a0(r15)     // Catch: java.lang.Throwable -> L1f
            r2 = 16
            if (r15 >= r2) goto Lbb
            r15 = r2
        Lbb:
            r13.<init>(r15)     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1f
        Lc2:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto Le4
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L1f
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L1f
            r16 = r0
            java.util.LinkedHashMap r0 = r1.f3776m     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get(r15)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto Ldc
            goto Lde
        Ldc:
            java.lang.String r0 = "missing"
        Lde:
            r13.put(r2, r0)     // Catch: java.lang.Throwable -> L1f
            r0 = r16
            goto Lc2
        Le4:
            r2 = r14
            boolean r14 = r1.f3779p     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto Lee
            java.util.ArrayList r2 = r2.c()     // Catch: java.lang.Throwable -> L1f
            goto Lef
        Lee:
            r2 = 0
        Lef:
            if (r2 != 0) goto Lf3
            tf.t r2 = tf.t.f13167g     // Catch: java.lang.Throwable -> L1f
        Lf3:
            r15 = r2
            fb.i2 r2 = new fb.i2     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r17)
            return r2
        Lfb:
            java.lang.String r0 = "完成前必须对当前版本调用 show_diff"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r2     // Catch: java.lang.Throwable -> L1f
        L103:
            java.lang.String r0 = "完成前必须对当前版本调用 workspace_status"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r2     // Catch: java.lang.Throwable -> L1f
        L10b:
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L1f
            throw r0
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap r0 = fb.t2.f3808a     // Catch: java.lang.Throwable -> L7
            java.io.File r0 = r1.f3773j     // Catch: java.lang.Throwable -> L7
            fb.t2.q(r0)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public final synchronized java.lang.String e(java.lang.String r5, org.json.JSONObject r6, fb.b r7) {
            r4 = this;
            java.lang.String r0 = "本轮只能操作插件 "
            java.lang.String r1 = "未知插件工作区工具: "
            monitor-enter(r4)
            r7.d()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "plugin_id"
            java.lang.String r3 = ""
            java.lang.String r2 = r6.optString(r2, r3)     // Catch: java.lang.Throwable -> L36
            r2.getClass()     // Catch: java.lang.Throwable -> L36
            boolean r2 = r4.a(r2)     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto Leb
            java.util.concurrent.ConcurrentHashMap r0 = fb.t2.f3808a     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = fb.t2.E(r5)     // Catch: java.lang.Throwable -> L36
            int r2 = r0.hashCode()     // Catch: java.lang.Throwable -> L36
            switch(r2) {
                case -1903804409: goto Lcc;
                case -1526776777: goto Lbf;
                case -1356730971: goto Lb2;
                case -1121949127: goto La5;
                case -1113857403: goto L98;
                case -636524068: goto L8b;
                case -146128825: goto L7e;
                case -38568228: goto L71;
                case 450667808: goto L63;
                case 695361430: goto L55;
                case 1068342227: goto L47;
                case 1648866102: goto L39;
                case 1675538154: goto L28;
                default: goto L26;
            }     // Catch: java.lang.Throwable -> L36
        L26:
            goto Ldd
        L28:
            java.lang.String r2 = "create_directory"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.i(r6)     // Catch: java.lang.Throwable -> L36
            goto Ld8
        L36:
            r5 = move-exception
            goto Lfb
        L39:
            java.lang.String r2 = "restore_path"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.E(r6)     // Catch: java.lang.Throwable -> L36
            goto Ld8
        L47:
            java.lang.String r2 = "move_path"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.x(r6)     // Catch: java.lang.Throwable -> L36
            goto Ld8
        L55:
            java.lang.String r2 = "list_files"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.w(r6, r7)     // Catch: java.lang.Throwable -> L36
            goto Ld8
        L63:
            java.lang.String r2 = "search_files"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.F(r6, r7)     // Catch: java.lang.Throwable -> L36
            goto Ld8
        L71:
            java.lang.String r6 = "workspace_status"
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Ldd
            java.lang.String r5 = r4.I()     // Catch: java.lang.Throwable -> L36
            goto Ld8
        L7e:
            java.lang.String r6 = "delete_plugin"
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Ldd
            java.lang.String r5 = r4.l()     // Catch: java.lang.Throwable -> L36
            goto Ld8
        L8b:
            java.lang.String r2 = "write_file"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.K(r6)     // Catch: java.lang.Throwable -> L36
            goto Ld8
        L98:
            java.lang.String r2 = "read_file"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.A(r6)     // Catch: java.lang.Throwable -> L36
            goto Ld8
        La5:
            java.lang.String r2 = "delete_path"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.k(r6)     // Catch: java.lang.Throwable -> L36
            goto Ld8
        Lb2:
            java.lang.String r6 = "reset_workspace"
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Ldd
            java.lang.String r5 = r4.C()     // Catch: java.lang.Throwable -> L36
            goto Ld8
        Lbf:
            java.lang.String r2 = "apply_patch"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.b(r6)     // Catch: java.lang.Throwable -> L36
            goto Ld8
        Lcc:
            java.lang.String r2 = "show_diff"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r4.G(r6)     // Catch: java.lang.Throwable -> L36
        Ld8:
            r7.d()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return r5
        Ldd:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r1.concat(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L36
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L36
            throw r6     // Catch: java.lang.Throwable -> L36
        Leb:
            java.lang.String r5 = r4.f3771h     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r0.concat(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L36
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L36
            throw r6     // Catch: java.lang.Throwable -> L36
        Lfb:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r5
    }

    public final void g() {
            r3 = this;
            int r0 = r3.f3778o
            int r0 = r0 + 1
            r3.f3778o = r0
            r0 = -1
            r3.f3780q = r0
            r3.f3781r = r0
            java.io.File r0 = r3.f3773j
            long r1 = java.lang.System.currentTimeMillis()
            r0.setLastModified(r1)
            return
    }

    public final synchronized fb.j2 h() {
            r14 = this;
            monitor-enter(r14)
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L38
            java.io.File r0 = r14.f3773j     // Catch: java.lang.Throwable -> L38
            r0.setLastModified(r12)     // Catch: java.lang.Throwable -> L38
            fb.j2 r0 = new fb.j2     // Catch: java.lang.Throwable -> L38
            java.io.File r1 = r14.f3773j     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = r1.getCanonicalPath()     // Catch: java.lang.Throwable -> L38
            r1.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r14.f3771h     // Catch: java.lang.Throwable -> L38
            boolean r3 = r14.f3774k     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r14.f3775l     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.ConcurrentHashMap r5 = fb.t2.f3808a     // Catch: java.lang.Throwable -> L38
            java.io.File r5 = r14.f3773j     // Catch: java.lang.Throwable -> L38
            java.util.Map r5 = fb.t2.S(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = fb.t2.a0(r5)     // Catch: java.lang.Throwable -> L38
            java.util.LinkedHashMap r6 = r14.f3776m     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r14.f3777n     // Catch: java.lang.Throwable -> L38
            int r8 = r14.f3778o     // Catch: java.lang.Throwable -> L38
            int r9 = r14.f3780q     // Catch: java.lang.Throwable -> L38
            int r10 = r14.f3781r     // Catch: java.lang.Throwable -> L38
            boolean r11 = r14.f3779p     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r14)
            return r0
        L38:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    public final java.lang.String i(org.json.JSONObject r5) {
            r4 = this;
            r4.B()
            java.lang.String r0 = ""
            java.lang.String r1 = "path"
            java.lang.String r5 = r5.optString(r1, r0)
            r5.getClass()
            r0 = 0
            java.lang.String r5 = y(r5, r0)
            java.io.File r0 = r4.D(r5, r0)
            boolean r2 = r0.isFile()
            if (r2 != 0) goto L50
            boolean r2 = r0.isDirectory()
            r3 = r2 ^ 1
            if (r2 != 0) goto L37
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L2c
            goto L37
        L2c:
            java.lang.String r0 = "创建目录失败: "
            java.lang.String r5 = r0.concat(r5)
            ah.a.h(r5)
            r5 = 0
            return r5
        L37:
            if (r2 != 0) goto L3c
            r4.g()
        L3c:
            org.json.JSONObject r0 = r4.H()
            r0.put(r1, r5)
            java.lang.String r5 = "created"
            r0.put(r5, r3)
            java.lang.String r5 = r0.toString()
            r5.getClass()
            return r5
        L50:
            java.lang.String r0 = "同名文件已存在: "
            java.lang.String r5 = r0.concat(r5)
            j8.o.q(r5)
            r5 = 0
            return r5
    }

    public final java.lang.String k(org.json.JSONObject r4) {
            r3 = this;
            r3.B()
            java.lang.String r0 = ""
            java.lang.String r1 = "path"
            java.lang.String r4 = r4.optString(r1, r0)
            r4.getClass()
            r0 = 0
            java.lang.String r4 = y(r4, r0)
            java.io.File r0 = r3.D(r4, r0)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L34
            java.util.concurrent.ConcurrentHashMap r2 = fb.t2.f3808a
            fb.t2.p(r0)
            r3.g()
            org.json.JSONObject r0 = r3.H()
            r0.put(r1, r4)
            java.lang.String r4 = r0.toString()
            r4.getClass()
            return r4
        L34:
            java.lang.String r0 = "路径不存在: "
            java.lang.String r4 = r0.concat(r4)
            j8.o.q(r4)
            r4 = 0
            return r4
    }

    public final java.lang.String l() {
            r5 = this;
            boolean r0 = r5.f3774k
            if (r0 == 0) goto L3c
            boolean r0 = r5.f3779p
            if (r0 != 0) goto L1e
            java.io.File r1 = r5.f3773j
            java.io.File[] r1 = r1.listFiles()
            if (r1 == 0) goto L1e
            java.util.concurrent.ConcurrentHashMap r2 = fb.t2.f3808a
            int r2 = r1.length
            r3 = 0
        L14:
            if (r3 >= r2) goto L1e
            r4 = r1[r3]
            fb.t2.p(r4)
            int r3 = r3 + 1
            goto L14
        L1e:
            r1 = 1
            r5.f3779p = r1
            if (r0 != 0) goto L26
            r5.g()
        L26:
            org.json.JSONObject r0 = r5.H()
            java.lang.String r2 = "deletePlugin"
            r0.put(r2, r1)
            java.lang.String r2 = "requiresConfirmation"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            return r0
        L3c:
            java.lang.String r0 = "新插件尚未存在，不能删除整个插件"
            j8.o.t(r0)
            r0 = 0
            return r0
    }

    public final int m(java.io.File r6) {
            r5 = this;
            java.io.File r0 = r5.f3773j
            java.io.File r6 = dg.l.i0(r6, r0)
            java.lang.String r6 = dg.l.d0(r6)
            r0 = 0
            r1 = r0
            r2 = r1
        Ld:
            int r3 = r6.length()
            if (r1 >= r3) goto L25
            char r3 = r6.charAt(r1)
            r4 = 47
            if (r3 != r4) goto L1d
            r3 = 1
            goto L1e
        L1d:
            r3 = r0
        L1e:
            if (r3 == 0) goto L22
            int r2 = r2 + 1
        L22:
            int r1 = r1 + 1
            goto Ld
        L25:
            return r2
    }

    public final synchronized void o() {
            r2 = this;
            monitor-enter(r2)
            java.io.File r0 = r2.f3772i     // Catch: java.lang.Throwable -> L15
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            java.util.concurrent.ConcurrentHashMap r1 = fb.t2.f3808a     // Catch: java.lang.Throwable -> L15
            fb.t2.N(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "脚本插件根目录"
            fb.t2.w(r0, r1)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        L15:
            r0 = move-exception
            goto L1f
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "插件根目录无效"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public final org.json.JSONObject q(java.io.File r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.io.File r1 = r4.f3773j
            java.io.File r1 = dg.l.i0(r5, r1)
            java.lang.String r1 = dg.l.d0(r1)
            java.lang.String r2 = "path"
            r0.put(r2, r1)
            boolean r1 = r5.isDirectory()
            if (r1 == 0) goto L1d
            java.lang.String r1 = "directory"
            goto L1f
        L1d:
            java.lang.String r1 = "file"
        L1f:
            java.lang.String r2 = "type"
            r0.put(r2, r1)
            boolean r1 = r5.isFile()
            if (r1 == 0) goto L33
            java.lang.String r1 = "size"
            long r2 = r5.length()
            r0.put(r1, r2)
        L33:
            return r0
    }

    public final java.lang.String s() {
            r1 = this;
            java.lang.String r0 = r1.f3771h
            return r0
    }

    public final int t() {
            r1 = this;
            int r0 = r1.f3778o
            return r0
    }

    public final synchronized boolean u() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f3779p     // Catch: java.lang.Throwable -> L14
            r1 = 1
            if (r0 != 0) goto L16
            r0 = 0
            fb.n2 r0 = J(r2, r0, r1)     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L12
            goto L16
        L12:
            r1 = 0
            goto L16
        L14:
            r0 = move-exception
            goto L18
        L16:
            monitor-exit(r2)
            return r1
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    public final java.lang.String w(org.json.JSONObject r13, fb.b r14) {
            r12 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "path"
            java.lang.String r0 = r13.optString(r1, r0)
            r0.getClass()
            r2 = 1
            java.lang.String r0 = y(r0, r2)
            java.io.File r3 = r12.D(r0, r2)
            boolean r4 = r3.exists()
            if (r4 == 0) goto Lb5
            java.lang.String r4 = "recursive"
            r5 = 0
            boolean r4 = r13.optBoolean(r4, r5)
            java.lang.String r6 = "max_depth"
            r7 = 3
            int r13 = r13.optInt(r6, r7)
            r6 = 8
            int r13 = r9.e0.r(r13, r2, r6)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            boolean r7 = r3.isFile()
            r8 = 500(0x1f4, float:7.0E-43)
            if (r7 == 0) goto L43
            org.json.JSONObject r13 = r12.q(r3)
            r6.put(r13)
            goto L94
        L43:
            int r7 = r12.m(r3)
            c9.x r9 = new c9.x
            r9.<init>(r14, r4, r3)
            dg.j r10 = new dg.j
            dg.k r11 = dg.k.f2255g
            r10.<init>(r3, r11, r9)
            fb.l2 r9 = new fb.l2
            r11 = 1
            r9.<init>(r3, r11)
            ng.i r11 = new ng.i
            r11.<init>(r10, r2, r9)
            ng.j r9 = ng.m.Z(r11, r8)
            java.util.Iterator r9 = r9.iterator()
        L66:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L94
            java.lang.Object r10 = r9.next()
            java.io.File r10 = (java.io.File) r10
            r14.d()
            if (r4 == 0) goto L7f
            int r11 = r12.m(r10)
            int r11 = r11 - r7
            if (r11 <= r13) goto L7f
            goto L66
        L7f:
            if (r4 != 0) goto L8c
            java.io.File r11 = r10.getParentFile()
            boolean r11 = gg.l.a(r11, r3)
            if (r11 != 0) goto L8c
            goto L66
        L8c:
            org.json.JSONObject r10 = r12.q(r10)
            r6.put(r10)
            goto L66
        L94:
            org.json.JSONObject r13 = r12.z()
            r13.put(r1, r0)
            java.lang.String r14 = "items"
            r13.put(r14, r6)
            int r14 = r6.length()
            if (r14 < r8) goto La7
            goto La8
        La7:
            r2 = r5
        La8:
            java.lang.String r14 = "truncated"
            r13.put(r14, r2)
            java.lang.String r13 = r13.toString()
            r13.getClass()
            return r13
        Lb5:
            java.lang.String r13 = "路径不存在: "
            java.lang.String r13 = r13.concat(r0)
            j8.o.q(r13)
            r13 = 0
            return r13
    }

    public final java.lang.String x(org.json.JSONObject r13) {
            r12 = this;
            r12.B()
            java.lang.String r0 = "source"
            java.lang.String r1 = ""
            java.lang.String r2 = r13.optString(r0, r1)
            r2.getClass()
            r3 = 0
            java.lang.String r2 = y(r2, r3)
            java.lang.String r4 = "destination"
            java.lang.String r1 = r13.optString(r4, r1)
            r1.getClass()
            java.lang.String r1 = y(r1, r3)
            java.io.File r5 = r12.D(r2, r3)
            java.io.File r6 = r12.D(r1, r3)
            boolean r7 = r5.exists()
            r8 = 0
            if (r7 == 0) goto Lc2
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto Lbc
            boolean r7 = r5.isDirectory()
            if (r7 == 0) goto L64
            java.lang.String r7 = r6.getCanonicalPath()
            r7.getClass()
            java.lang.String r9 = r5.getCanonicalPath()
            java.lang.String r10 = java.io.File.separator
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = r11.toString()
            boolean r7 = og.t.d0(r7, r9, r3)
            if (r7 != 0) goto L5e
            goto L64
        L5e:
            java.lang.String r13 = "不能把目录移动到自身内部"
            j8.o.t(r13)
            return r8
        L64:
            boolean r7 = r6.exists()
            if (r7 == 0) goto L82
            java.lang.String r7 = "overwrite"
            boolean r13 = r13.optBoolean(r7, r3)
            if (r13 == 0) goto L78
            java.util.concurrent.ConcurrentHashMap r13 = fb.t2.f3808a
            fb.t2.p(r6)
            goto L82
        L78:
            java.lang.String r13 = "目标路径已存在: "
            java.lang.String r13 = r13.concat(r1)
            j8.o.q(r13)
            return r8
        L82:
            java.io.File r13 = r6.getParentFile()
            if (r13 == 0) goto L9b
            boolean r3 = r13.isDirectory()
            if (r3 != 0) goto L9b
            boolean r13 = r13.mkdirs()
            if (r13 == 0) goto L95
            goto L9b
        L95:
            java.lang.String r13 = "创建目标父目录失败"
            j8.o.A(r13)
            return r8
        L9b:
            boolean r13 = r5.renameTo(r6)
            if (r13 == 0) goto Lb6
            r12.g()
            org.json.JSONObject r13 = r12.H()
            r13.put(r0, r2)
            r13.put(r4, r1)
            java.lang.String r13 = r13.toString()
            r13.getClass()
            return r13
        Lb6:
            java.lang.String r13 = "移动路径失败"
            j8.o.A(r13)
            return r8
        Lbc:
            java.lang.String r13 = "源路径和目标路径相同"
            j8.o.t(r13)
            return r8
        Lc2:
            java.lang.String r13 = "源路径不存在: "
            java.lang.String r13 = r13.concat(r2)
            j8.o.q(r13)
            return r8
    }

    public final org.json.JSONObject z() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ok"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = "pluginId"
            java.lang.String r2 = r3.f3771h
            r0.put(r1, r2)
            java.lang.String r1 = "revision"
            int r2 = r3.f3778o
            r0.put(r1, r2)
            return r0
    }
}
