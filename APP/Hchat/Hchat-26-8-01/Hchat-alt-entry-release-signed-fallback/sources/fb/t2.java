package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f3808a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Set f3809b = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            fb.t2.f3808a = r0
            java.lang.String r13 = "show_diff"
            java.lang.String r14 = "workspace_status"
            java.lang.String r1 = "check_access"
            java.lang.String r2 = "list_files"
            java.lang.String r3 = "read_file"
            java.lang.String r4 = "search_files"
            java.lang.String r5 = "create_directory"
            java.lang.String r6 = "write_file"
            java.lang.String r7 = "apply_patch"
            java.lang.String r8 = "move_path"
            java.lang.String r9 = "delete_path"
            java.lang.String r10 = "restore_path"
            java.lang.String r11 = "reset_workspace"
            java.lang.String r12 = "delete_plugin"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            java.util.Set r0 = tf.d0.W(r0)
            fb.t2.f3809b = r0
            return
    }

    public static org.json.JSONObject A(java.lang.String r3, int r4, int r5, java.lang.Integer r6) {
            java.lang.String r0 = "integer"
            java.lang.String r1 = "description"
            java.lang.String r2 = "type"
            org.json.JSONObject r3 = wb.en.l(r2, r0, r1, r3)
            java.lang.String r0 = "default"
            r3.put(r0, r4)
            java.lang.String r4 = "minimum"
            r3.put(r4, r5)
            if (r6 == 0) goto L1f
            int r4 = r6.intValue()
            java.lang.String r5 = "maximum"
            r3.put(r5, r4)
        L1f:
            return r3
    }

    public static final boolean B(java.lang.String r2) {
            r2.getClass()
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "local."
            java.lang.String r2 = og.m.A0(r2, r0)
            java.lang.String r0 = "hchat.workspace."
            r1 = 0
            boolean r0 = og.t.d0(r2, r0, r1)
            if (r0 == 0) goto L28
            java.util.Set r0 = fb.t2.f3809b
            java.lang.String r2 = E(r2)
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L28
            r2 = 1
            return r2
        L28:
            return r1
    }

    public static boolean C(byte[] r6) {
            int r0 = r6.length
            r1 = 8192(0x2000, float:1.148E-41)
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
            r3 = r2
        La:
            if (r2 < r0) goto L14
            if (r0 == 0) goto L12
            int r3 = r3 * 10
            if (r3 >= r0) goto L1a
        L12:
            r6 = 1
            return r6
        L14:
            r4 = r6[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 != 0) goto L1b
        L1a:
            return r1
        L1b:
            r5 = 9
            if (r4 < r5) goto L27
            r5 = 14
            if (r5 > r4) goto L29
            r5 = 32
            if (r4 >= r5) goto L29
        L27:
            int r3 = r3 + 1
        L29:
            int r2 = r2 + 1
            goto La
    }

    public static final boolean D(java.lang.String r8) {
            java.lang.String r6 = "reset_workspace"
            java.lang.String r7 = "delete_plugin"
            java.lang.String r0 = "create_directory"
            java.lang.String r1 = "write_file"
            java.lang.String r2 = "apply_patch"
            java.lang.String r3 = "move_path"
            java.lang.String r4 = "delete_path"
            java.lang.String r5 = "restore_path"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.util.Set r0 = tf.d0.W(r0)
            java.lang.String r8 = E(r8)
            boolean r8 = r0.contains(r8)
            return r8
    }

    public static java.lang.String E(java.lang.String r1) {
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "local."
            java.lang.String r1 = og.m.A0(r1, r0)
            java.lang.String r0 = "hchat.workspace."
            java.lang.String r1 = og.m.A0(r1, r0)
            return r1
    }

    public static final fb.s2 F(android.content.Context r18, java.lang.String r19) {
            r0 = r18
            r19.getClass()
            j(r0)
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.io.File r2 = r1.ensureDirs(r0)
            java.io.File r2 = r2.getCanonicalFile()
            r2.getClass()
            N(r2)
            M(r2)
            java.lang.CharSequence r3 = og.m.R0(r19)
            java.lang.String r3 = r3.toString()
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L136
            java.util.List r1 = r1.listPlugins(r0)
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r1.next()
            r5 = r4
            eb.c0 r5 = (eb.c0) r5
            java.lang.String r6 = r5.f2506a
            boolean r6 = r6.equalsIgnoreCase(r3)
            if (r6 != 0) goto L5b
            java.lang.String r6 = r5.f2507b
            boolean r6 = r6.equalsIgnoreCase(r3)
            if (r6 != 0) goto L5b
            java.lang.String r5 = r5.f2513h
            if (r5 == 0) goto L31
            boolean r5 = r5.equalsIgnoreCase(r3)
            r6 = 1
            if (r5 != r6) goto L31
            goto L5b
        L5a:
            r4 = 0
        L5b:
            eb.c0 r4 = (eb.c0) r4
            if (r4 == 0) goto L61
            java.lang.String r3 = r4.f2506a
        L61:
            r7 = r3
            java.lang.String r1 = fb.a2.e(r7)
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L130
            java.lang.String r1 = ".."
            r3 = 0
            boolean r1 = og.m.h0(r7, r1, r3)
            if (r1 != 0) goto L130
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r7)
            java.io.File r1 = r1.getAbsoluteFile()
            java.io.File r8 = r1.getCanonicalFile()
            java.io.File r3 = r8.getParentFile()
            boolean r2 = gg.l.a(r3, r2)
            if (r2 == 0) goto L12a
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L12a
            boolean r10 = r8.isDirectory()
            if (r10 == 0) goto L9b
            u(r8)
        L9b:
            java.io.File r9 = new java.io.File
            java.io.File r1 = c0(r0)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            r9.<init>(r1, r2)
            boolean r1 = r9.mkdirs()
            if (r1 == 0) goto L123
            if (r10 == 0) goto Lc1
            s(r8)     // Catch: java.lang.Throwable -> Lbf
            n(r8, r9)     // Catch: java.lang.Throwable -> Lbf
            java.util.Map r1 = S(r9)     // Catch: java.lang.Throwable -> Lbf
            goto Lc3
        Lbf:
            r0 = move-exception
            goto L11f
        Lc1:
            tf.u r1 = tf.u.f13168g     // Catch: java.lang.Throwable -> Lbf
        Lc3:
            android.content.Context r2 = r0.getApplicationContext()
            if (r2 == 0) goto Lcb
            r6 = r2
            goto Lcc
        Lcb:
            r6 = r0
        Lcc:
            java.lang.String r11 = a0(r1)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            int r0 = r1.size()
            int r0 = tf.y.a0(r0)
            r12.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Le7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L105
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            fb.q2 r1 = (fb.q2) r1
            java.lang.String r1 = R(r1)
            r12.put(r2, r1)
            goto Le7
        L105:
            if (r4 == 0) goto L10d
            java.lang.String r0 = r4.f2513h
            if (r0 == 0) goto L10d
        L10b:
            r13 = r0
            goto L113
        L10d:
            if (r4 == 0) goto L112
            java.lang.String r0 = r4.f2507b
            goto L10b
        L112:
            r13 = r7
        L113:
            fb.s2 r5 = new fb.s2
            r16 = -1
            r17 = 0
            r14 = 0
            r15 = -1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r5
        L11f:
            q(r9)     // Catch: java.lang.Throwable -> L122
        L122:
            throw r0
        L123:
            java.lang.String r0 = "创建插件暂存工作区失败"
            j8.o.A(r0)
        L128:
            r0 = 0
            return r0
        L12a:
            java.lang.String r0 = "插件目录不在脚本根目录内或使用了符号链接"
            j8.o.t(r0)
            goto L128
        L130:
            java.lang.String r0 = "plugin_id 包含不允许的路径字符"
            j8.o.t(r0)
            goto L128
        L136:
            java.lang.String r0 = "plugin_id 不能为空"
            j8.o.t(r0)
            goto L128
    }

    public static java.lang.String G(java.io.File r5, java.lang.String r6) {
            java.io.File r0 = new java.io.File
            r0.<init>(r5, r6)
            java.io.File r0 = r0.getAbsoluteFile()
            java.io.File r1 = r0.getCanonicalFile()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            boolean r0 = gg.l.a(r1, r5)
            r2 = 0
            if (r0 != 0) goto L3c
            java.lang.String r0 = r1.getPath()
            r0.getClass()
            java.lang.String r5 = r5.getPath()
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = r4.toString()
            boolean r5 = og.t.d0(r0, r5, r2)
            if (r5 == 0) goto L67
        L3c:
            boolean r5 = r1.exists()
            if (r5 != 0) goto L44
            r5 = 0
            goto L62
        L44:
            boolean r5 = r1.isDirectory()
            if (r5 == 0) goto L55
            fb.q2 r5 = new fb.q2
            r0 = 0
            java.lang.String r6 = ""
            r2 = 1
            r5.<init>(r2, r0, r6)
            goto L62
        L55:
            fb.q2 r5 = new fb.q2
            long r3 = r1.length()
            java.lang.String r6 = y(r1)
            r5.<init>(r2, r3, r6)
        L62:
            java.lang.String r5 = R(r5)
            return r5
        L67:
            java.lang.String r5 = "变更路径超出插件目录或使用了符号链接: "
            java.lang.String r5 = wb.en.g(r5, r6)
            j8.o.q(r5)
            r5 = 0
            return r5
    }

    public static fb.o2 H(java.io.File r4) {
            boolean r0 = r4.isDirectory()
            r1 = 0
            if (r0 != 0) goto Lf
            fb.o2 r4 = new fb.o2
            java.lang.String r0 = "目录不存在"
            r4.<init>(r1, r0)
            return r4
        Lf:
            boolean r0 = r4.canWrite()
            if (r0 == 0) goto La9
            boolean r0 = r4.canExecute()
            if (r0 != 0) goto L1d
            goto La9
        L1d:
            java.io.File r0 = new java.io.File
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            r2.getClass()
            r3 = 8
            java.lang.String r2 = og.m.P0(r3, r2)
            java.lang.String r3 = ".hchat-agent-access-"
            java.lang.String r2 = r3.concat(r2)
            r0.<init>(r4, r2)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L53
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L53
            r4.write(r1)     // Catch: java.lang.Throwable -> L5d
            r4.close()     // Catch: java.lang.Throwable -> L53
            boolean r4 = r0.delete()     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L55
            fb.o2 r4 = new fb.o2     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "写入探针成功"
            r3 = 1
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L53
            goto L6a
        L53:
            r4 = move-exception
            goto L64
        L55:
            java.lang.String r4 = "无法清理权限探针"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L53
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L53
            throw r2     // Catch: java.lang.Throwable -> L53
        L5d:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L5f
        L5f:
            r3 = move-exception
            ig.a.i(r4, r2)     // Catch: java.lang.Throwable -> L53
            throw r3     // Catch: java.lang.Throwable -> L53
        L64:
            sf.f r2 = new sf.f
            r2.<init>(r4)
            r4 = r2
        L6a:
            java.lang.Throwable r2 = sf.g.b(r4)
            if (r2 != 0) goto L71
            goto La6
        L71:
            r0.delete()     // Catch: java.lang.Throwable -> L74
        L74:
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L84
            java.lang.String r0 = ""
        L84:
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L8c
            java.lang.String r0 = "未知写入错误"
        L8c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = ": "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            fb.o2 r0 = new fb.o2
            r0.<init>(r1, r4)
            r4 = r0
        La6:
            fb.o2 r4 = (fb.o2) r4
            return r4
        La9:
            fb.o2 r4 = new fb.o2
            java.lang.String r0 = "File.canWrite/canExecute=false"
            r4.<init>(r1, r0)
            return r4
    }

    public static fb.r2 I(java.io.File r2) {
            boolean r0 = r2.exists()
            if (r0 != 0) goto Lf
            fb.r2 r2 = new fb.r2
            r0 = 1
            tf.t r1 = tf.t.f13167g
            r2.<init>(r1, r0)
            return r2
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            gg.s r1 = new gg.s
            r1.<init>()
            J(r0, r1, r2, r2)
            fb.r2 r2 = new fb.r2
            boolean r1 = r0.isEmpty()
            r2.<init>(r0, r1)
            return r2
    }

    public static final void J(java.util.ArrayList r3, gg.s r4, java.io.File r5, java.io.File r6) {
            int r0 = r3.size()
            r1 = 8
            if (r0 < r1) goto La
            goto Lea
        La:
            int r0 = r4.f4562g
            int r0 = r0 + 1
            r4.f4562g = r0
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L1a
            java.lang.String r4 = "目录项过多，无法完成安全替换预检"
            r3.add(r4)
            return
        L1a:
            java.io.File r0 = r6.getCanonicalFile()     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L26:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto Leb
            java.io.File r0 = (java.io.File) r0
            java.io.File r1 = r6.getAbsoluteFile()
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L46
            java.lang.String r4 = K(r5, r6)
            java.lang.String r5 = " 是不支持的符号链接"
            java.lang.String r4 = r4.concat(r5)
            r3.add(r4)
            return
        L46:
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto Lad
            boolean r0 = r6.canRead()
            if (r0 == 0) goto L9f
            boolean r0 = r6.canExecute()
            if (r0 != 0) goto L59
            goto L9f
        L59:
            fb.o2 r0 = H(r6)
            boolean r1 = r0.f3692a
            if (r1 != 0) goto L7f
            java.lang.String r4 = K(r5, r6)
            java.lang.String r5 = r0.f3693b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = " 目录不可修改："
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r3.add(r4)
            return
        L7f:
            java.io.File[] r0 = r6.listFiles()
            if (r0 != 0) goto L93
            java.lang.String r4 = K(r5, r6)
            java.lang.String r5 = " 无法列出目录内容"
            java.lang.String r4 = r4.concat(r5)
            r3.add(r4)
            return
        L93:
            int r6 = r0.length
            r1 = 0
        L95:
            if (r1 >= r6) goto Lea
            r2 = r0[r1]
            J(r3, r4, r5, r2)
            int r1 = r1 + 1
            goto L95
        L9f:
            java.lang.String r4 = K(r5, r6)
            java.lang.String r5 = " 目录不可读或不可进入"
            java.lang.String r4 = r4.concat(r5)
            r3.add(r4)
            return
        Lad:
            boolean r4 = r6.isFile()
            if (r4 != 0) goto Lc1
            java.lang.String r4 = K(r5, r6)
            java.lang.String r5 = " 不是普通文件"
            java.lang.String r4 = r4.concat(r5)
            r3.add(r4)
            goto Lea
        Lc1:
            boolean r4 = r6.canRead()
            if (r4 == 0) goto Ldd
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Ld2
            r4.<init>(r6)     // Catch: java.lang.Throwable -> Ld2
            r4.close()     // Catch: java.lang.Throwable -> Ld2
            sf.n r4 = sf.n.f12433a     // Catch: java.lang.Throwable -> Ld2
            goto Ld9
        Ld2:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        Ld9:
            boolean r4 = r4 instanceof sf.f
            if (r4 == 0) goto Lea
        Ldd:
            java.lang.String r4 = K(r5, r6)
            java.lang.String r5 = " 文件不可读，无法创建备份"
            java.lang.String r4 = r4.concat(r5)
            r3.add(r4)
        Lea:
            return
        Leb:
            java.lang.String r4 = K(r5, r6)
            java.lang.String r5 = r1.getMessage()
            if (r5 != 0) goto Lf7
            java.lang.String r5 = ""
        Lf7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = " 无法解析真实路径："
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r3.add(r4)
            return
    }

    public static final java.lang.String K(java.io.File r4, java.io.File r5) {
            boolean r0 = gg.l.a(r5, r4)
            if (r0 == 0) goto L9
            java.lang.String r4 = "."
            return r4
        L9:
            java.lang.String r0 = r5.getPath()
            r0.getClass()
            java.lang.String r1 = r4.getPath()
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r2 = 0
            boolean r0 = og.t.d0(r0, r1, r2)
            if (r0 == 0) goto L35
            java.io.File r4 = dg.l.i0(r5, r4)
            java.lang.String r4 = dg.l.d0(r4)
            return r4
        L35:
            java.lang.String r4 = r5.getName()
            r4.getClass()
            return r4
    }

    public static java.lang.String L(java.io.File r6) {
            boolean r0 = r6.isFile()
            r1 = 0
            if (r0 == 0) goto L37
            long r2 = r6.length()
            r4 = 2097152(0x200000, double:1.036131E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L13
            goto L37
        L13:
            byte[] r6 = dg.l.g0(r6)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r6 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r6)
            r6 = r0
        L1f:
            boolean r0 = r6 instanceof sf.f
            if (r0 == 0) goto L25
            r6 = r1
        L25:
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L37
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r2 = og.a.f9804a
            r0.<init>(r6, r2)
            boolean r6 = C(r6)
            if (r6 == 0) goto L37
            r1 = r0
        L37:
            return r1
    }

    public static void M(java.io.File r14) {
            java.lang.String r0 = "^\\.(.+)\\.agent-(new|old|copy)-([A-Za-z0-9]+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.io.File[] r1 = r14.listFiles()
            r2 = 0
            if (r1 == 0) goto L69
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.length
            r5 = 0
        L17:
            if (r5 >= r4) goto L6a
            r6 = r1[r5]
            java.lang.String r7 = r6.getName()
            r7.getClass()
            java.util.regex.Matcher r8 = r0.matcher(r7)
            r8.getClass()
            boolean r9 = r8.matches()
            if (r9 != 0) goto L31
            r9 = r2
            goto L36
        L31:
            og.i r9 = new og.i
            r9.<init>(r8, r7)
        L36:
            if (r9 == 0) goto L4f
            java.util.List r7 = r9.a()
            og.g r7 = (og.g) r7
            r8 = 1
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = fb.a2.e(r7)
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L51
        L4f:
            r8 = r2
            goto L61
        L51:
            sf.j r8 = new sf.j
            java.util.List r9 = r9.a()
            r10 = 2
            og.g r9 = (og.g) r9
            java.lang.Object r9 = r9.get(r10)
            r8.<init>(r7, r9, r6)
        L61:
            if (r8 == 0) goto L66
            r3.add(r8)
        L66:
            int r5 = r5 + 1
            goto L17
        L69:
            r3 = r2
        L6a:
            if (r3 != 0) goto L6e
            tf.t r3 = tf.t.f13167g
        L6e:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
        L77:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L9c
            java.lang.Object r3 = r1.next()
            r4 = r3
            sf.j r4 = (sf.j) r4
            java.lang.Object r4 = r4.f12428g
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L96
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.put(r4, r5)
        L96:
            java.util.List r5 = (java.util.List) r5
            r5.add(r3)
            goto L77
        L9c:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        La4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3b0
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            fb.g0 r0 = new fb.g0
            r5 = 25
            r0.<init>(r5)
            bc.j r5 = new bc.j
            r6 = 9
            r5.<init>(r0, r6)
            java.util.concurrent.ConcurrentHashMap r0 = fb.t2.f3808a
            java.lang.Object r0 = r0.computeIfAbsent(r3, r5)
            r0.getClass()
            r5 = r0
            java.util.concurrent.locks.ReentrantLock r5 = (java.util.concurrent.locks.ReentrantLock) r5
            r5.lock()
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L130
            r0.<init>(r14, r3)     // Catch: java.lang.Throwable -> L130
            java.io.File r3 = r0.getAbsoluteFile()     // Catch: java.lang.Throwable -> L130
            java.io.File r0 = r3.getCanonicalFile()     // Catch: java.lang.Throwable -> Le8
            goto Lef
        Le8:
            r0 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L130
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L130
            r0 = r6
        Lef:
            boolean r6 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L130
            if (r6 == 0) goto Lf5
            r0 = r2
        Lf5:
            r6 = r0
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Throwable -> L130
            if (r6 == 0) goto L3a7
            java.io.File r0 = r6.getParentFile()     // Catch: java.lang.Throwable -> L130
            boolean r0 = gg.l.a(r0, r14)     // Catch: java.lang.Throwable -> L130
            if (r0 == 0) goto L3a7
            boolean r0 = gg.l.a(r3, r6)     // Catch: java.lang.Throwable -> L130
            if (r0 != 0) goto L10c
            goto L3a7
        L10c:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L130
            r0.<init>()     // Catch: java.lang.Throwable -> L130
            java.util.Iterator r3 = r4.iterator()     // Catch: java.lang.Throwable -> L130
        L115:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r7 == 0) goto L134
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L130
            r8 = r7
            sf.j r8 = (sf.j) r8     // Catch: java.lang.Throwable -> L130
            java.lang.Object r8 = r8.f12429h     // Catch: java.lang.Throwable -> L130
            java.lang.String r9 = "old"
            boolean r8 = gg.l.a(r8, r9)     // Catch: java.lang.Throwable -> L130
            if (r8 == 0) goto L115
            r0.add(r7)     // Catch: java.lang.Throwable -> L130
            goto L115
        L130:
            r0 = move-exception
            r14 = r0
            goto L3ac
        L134:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L130
            int r7 = tf.n.e1(r0)     // Catch: java.lang.Throwable -> L130
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L130
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L130
        L141:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r7 == 0) goto L155
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L130
            sf.j r7 = (sf.j) r7     // Catch: java.lang.Throwable -> L130
            java.lang.Object r7 = r7.f12430i     // Catch: java.lang.Throwable -> L130
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> L130
            r3.add(r7)     // Catch: java.lang.Throwable -> L130
            goto L141
        L155:
            fb.r r0 = new fb.r     // Catch: java.lang.Throwable -> L130
            r7 = 12
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L130
            java.util.List r0 = tf.m.K1(r3, r0)     // Catch: java.lang.Throwable -> L130
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L130
            r3.<init>()     // Catch: java.lang.Throwable -> L130
            java.util.Iterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> L130
        L169:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r8 == 0) goto L184
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L130
            r9 = r8
            sf.j r9 = (sf.j) r9     // Catch: java.lang.Throwable -> L130
            java.lang.Object r9 = r9.f12429h     // Catch: java.lang.Throwable -> L130
            java.lang.String r10 = "copy"
            boolean r9 = gg.l.a(r9, r10)     // Catch: java.lang.Throwable -> L130
            if (r9 == 0) goto L169
            r3.add(r8)     // Catch: java.lang.Throwable -> L130
            goto L169
        L184:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L130
            int r8 = tf.n.e1(r3)     // Catch: java.lang.Throwable -> L130
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L130
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L130
        L191:
            boolean r8 = r3.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r8 == 0) goto L1a5
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L130
            sf.j r8 = (sf.j) r8     // Catch: java.lang.Throwable -> L130
            java.lang.Object r8 = r8.f12430i     // Catch: java.lang.Throwable -> L130
            java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Throwable -> L130
            r7.add(r8)     // Catch: java.lang.Throwable -> L130
            goto L191
        L1a5:
            fb.r r3 = new fb.r     // Catch: java.lang.Throwable -> L130
            r8 = 13
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L130
            java.util.List r3 = tf.m.K1(r7, r3)     // Catch: java.lang.Throwable -> L130
            java.util.ArrayList r3 = tf.m.F1(r0, r3)     // Catch: java.lang.Throwable -> L130
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L130
            r7.<init>()     // Catch: java.lang.Throwable -> L130
            java.util.Iterator r8 = r3.iterator()     // Catch: java.lang.Throwable -> L130
        L1bd:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L130
            java.lang.String r10 = "complete"
            if (r9 == 0) goto L1f1
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L130
            r11 = r9
            java.io.File r11 = (java.io.File) r11     // Catch: java.lang.Throwable -> L130
            r11.getClass()     // Catch: java.lang.Throwable -> L130
            java.io.File r12 = X(r11)     // Catch: java.lang.Throwable -> L130
            java.lang.String r12 = Y(r12)     // Catch: java.lang.Throwable -> L130
            boolean r10 = gg.l.a(r12, r10)     // Catch: java.lang.Throwable -> L130
            if (r10 != 0) goto L1bd
            java.io.File r10 = Z(r11)     // Catch: java.lang.Throwable -> L130
            boolean r10 = r10.isFile()     // Catch: java.lang.Throwable -> L130
            if (r10 == 0) goto L1bd
            boolean r10 = z(r11)     // Catch: java.lang.Throwable -> L130
            if (r10 != 0) goto L1bd
            r7.add(r9)     // Catch: java.lang.Throwable -> L130
            goto L1bd
        L1f1:
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L130
            if (r8 != 0) goto L21d
            fb.g0 r11 = new fb.g0     // Catch: java.lang.Throwable -> L130
            r0 = 22
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L130
            r12 = 31
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r0 = tf.m.A1(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L130
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L130
            r3.<init>()     // Catch: java.lang.Throwable -> L130
            java.lang.String r4 = "[Hchat:ScriptAgent] 插件事务备份校验失败，已保留现场: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L130
            r3.append(r0)     // Catch: java.lang.Throwable -> L130
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L130
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> L130
            goto L3a7
        L21d:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L130
            r7.<init>()     // Catch: java.lang.Throwable -> L130
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L130
        L226:
            boolean r8 = r3.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r8 == 0) goto L24e
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L130
            r9 = r8
            java.io.File r9 = (java.io.File) r9     // Catch: java.lang.Throwable -> L130
            r9.getClass()     // Catch: java.lang.Throwable -> L130
            boolean r11 = z(r9)     // Catch: java.lang.Throwable -> L130
            if (r11 == 0) goto L226
            java.io.File r9 = X(r9)     // Catch: java.lang.Throwable -> L130
            java.lang.String r9 = Y(r9)     // Catch: java.lang.Throwable -> L130
            boolean r9 = gg.l.a(r9, r10)     // Catch: java.lang.Throwable -> L130
            if (r9 != 0) goto L226
            r7.add(r8)     // Catch: java.lang.Throwable -> L130
            goto L226
        L24e:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L130
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L130
            boolean r7 = r6.exists()     // Catch: java.lang.Throwable -> L130
            if (r7 != 0) goto L291
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L130
            r7.<init>()     // Catch: java.lang.Throwable -> L130
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L130
        L262:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r8 == 0) goto L28e
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L130
            r9 = r8
            java.io.File r9 = (java.io.File) r9     // Catch: java.lang.Throwable -> L130
            r9.getClass()     // Catch: java.lang.Throwable -> L130
            java.io.File r11 = Z(r9)     // Catch: java.lang.Throwable -> L130
            boolean r11 = r11.exists()     // Catch: java.lang.Throwable -> L130
            if (r11 != 0) goto L262
            java.io.File r9 = X(r9)     // Catch: java.lang.Throwable -> L130
            java.lang.String r9 = Y(r9)     // Catch: java.lang.Throwable -> L130
            boolean r9 = gg.l.a(r9, r10)     // Catch: java.lang.Throwable -> L130
            if (r9 != 0) goto L262
            r7.add(r8)     // Catch: java.lang.Throwable -> L130
            goto L262
        L28e:
            tf.r.h1(r3, r7)     // Catch: java.lang.Throwable -> L130
        L291:
            java.util.Set r0 = tf.m.T1(r3)     // Catch: java.lang.Throwable -> L130
            java.util.List r0 = tf.m.P1(r0)     // Catch: java.lang.Throwable -> L130
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L130
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r3 != 0) goto L2a5
            r3 = r2
            goto L2f8
        L2a5:
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L130
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r7 != 0) goto L2b0
            goto L2f8
        L2b0:
            r7 = r3
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> L130
            r7.getClass()     // Catch: java.lang.Throwable -> L130
            java.io.File r8 = Z(r7)     // Catch: java.lang.Throwable -> L130
            long r8 = r8.lastModified()     // Catch: java.lang.Throwable -> L130
            long r10 = r7.lastModified()     // Catch: java.lang.Throwable -> L130
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L2c7
            r8 = r10
        L2c7:
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L130
        L2cb:
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L130
            r9 = r8
            java.io.File r9 = (java.io.File) r9     // Catch: java.lang.Throwable -> L130
            r9.getClass()     // Catch: java.lang.Throwable -> L130
            java.io.File r10 = Z(r9)     // Catch: java.lang.Throwable -> L130
            long r10 = r10.lastModified()     // Catch: java.lang.Throwable -> L130
            long r12 = r9.lastModified()     // Catch: java.lang.Throwable -> L130
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 >= 0) goto L2e6
            r10 = r12
        L2e6:
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L130
            int r10 = r7.compareTo(r9)     // Catch: java.lang.Throwable -> L130
            if (r10 >= 0) goto L2f2
            r3 = r8
            r7 = r9
        L2f2:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r8 != 0) goto L2cb
        L2f8:
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L130
            sf.n r7 = sf.n.f12433a
            if (r3 == 0) goto L32f
            java.lang.String r0 = "恢复插件事务备份失败"
            P(r3, r6, r0)     // Catch: java.lang.Throwable -> L305
            r8 = r7
            goto L30b
        L305:
            r0 = move-exception
            sf.f r8 = new sf.f     // Catch: java.lang.Throwable -> L130
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L130
        L30b:
            java.lang.Throwable r0 = sf.g.b(r8)     // Catch: java.lang.Throwable -> L130
            if (r0 == 0) goto L329
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L130
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L130
            r9.<init>()     // Catch: java.lang.Throwable -> L130
            java.lang.String r10 = "[Hchat:ScriptAgent] 恢复插件事务失败: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L130
            r9.append(r3)     // Catch: java.lang.Throwable -> L130
            java.lang.String r3 = r9.toString()     // Catch: java.lang.Throwable -> L130
            fb.v0.n(r3, r0)     // Catch: java.lang.Throwable -> L130
        L329:
            boolean r0 = r8 instanceof sf.f     // Catch: java.lang.Throwable -> L130
            if (r0 == 0) goto L32f
            goto L3a7
        L32f:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L130
            r0.<init>()     // Catch: java.lang.Throwable -> L130
            java.util.Iterator r3 = r4.iterator()     // Catch: java.lang.Throwable -> L130
        L338:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r4 == 0) goto L351
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L130
            r8 = r4
            sf.j r8 = (sf.j) r8     // Catch: java.lang.Throwable -> L130
            java.lang.Object r8 = r8.f12430i     // Catch: java.lang.Throwable -> L130
            boolean r8 = gg.l.a(r8, r6)     // Catch: java.lang.Throwable -> L130
            if (r8 != 0) goto L338
            r0.add(r4)     // Catch: java.lang.Throwable -> L130
            goto L338
        L351:
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L130
        L355:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L130
            if (r0 == 0) goto L3a7
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L130
            sf.j r0 = (sf.j) r0     // Catch: java.lang.Throwable -> L130
            java.lang.Object r4 = r0.f12429h     // Catch: java.lang.Throwable -> L130
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L130
            java.lang.Object r0 = r0.f12430i     // Catch: java.lang.Throwable -> L130
            r6 = r0
            java.io.File r6 = (java.io.File) r6     // Catch: java.lang.Throwable -> L130
            java.lang.String r0 = "new"
            boolean r0 = gg.l.a(r4, r0)     // Catch: java.lang.Throwable -> L379
            if (r0 == 0) goto L37b
            r6.getClass()     // Catch: java.lang.Throwable -> L379
            q(r6)     // Catch: java.lang.Throwable -> L379
            goto L381
        L379:
            r0 = move-exception
            goto L383
        L37b:
            r6.getClass()     // Catch: java.lang.Throwable -> L379
            o(r6)     // Catch: java.lang.Throwable -> L379
        L381:
            r4 = r7
            goto L388
        L383:
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L130
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L130
        L388:
            java.lang.Throwable r0 = sf.g.b(r4)     // Catch: java.lang.Throwable -> L130
            if (r0 == 0) goto L355
            java.lang.String r4 = r6.getPath()     // Catch: java.lang.Throwable -> L130
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L130
            r6.<init>()     // Catch: java.lang.Throwable -> L130
            java.lang.String r8 = "[Hchat:ScriptAgent] 清理插件事务残留失败: "
            r6.append(r8)     // Catch: java.lang.Throwable -> L130
            r6.append(r4)     // Catch: java.lang.Throwable -> L130
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L130
            fb.v0.n(r4, r0)     // Catch: java.lang.Throwable -> L130
            goto L355
        L3a7:
            r5.unlock()
            goto La4
        L3ac:
            r5.unlock()
            throw r14
        L3b0:
            return
    }

    public static void N(java.io.File r2) {
            boolean r0 = r2.exists()
            if (r0 != 0) goto L7
            goto L36
        L7:
            r0 = 1
            r2.setReadable(r0, r0)     // Catch: java.lang.Throwable -> Lb
        Lb:
            r2.setWritable(r0, r0)     // Catch: java.lang.Throwable -> Le
        Le:
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L17
            r2.setExecutable(r0, r0)     // Catch: java.lang.Throwable -> L17
        L17:
            java.lang.String r0 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L36
            android.system.StructStat r0 = android.system.Os.stat(r0)     // Catch: java.lang.Throwable -> L36
            boolean r1 = r2.isDirectory()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L28
            r1 = 448(0x1c0, float:6.28E-43)
            goto L2a
        L28:
            r1 = 384(0x180, float:5.38E-43)
        L2a:
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L36
            int r0 = r0.st_mode     // Catch: java.lang.Throwable -> L36
            r0 = r0 & 4095(0xfff, float:5.738E-42)
            r0 = r0 | r1
            android.system.Os.chmod(r2, r0)     // Catch: java.lang.Throwable -> L36
        L36:
            return
    }

    public static void O(java.io.File r3) {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L30
            java.io.File r0 = r3.getAbsoluteFile()
            java.io.File r1 = r3.getCanonicalFile()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L30
        L15:
            N(r3)
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L30
            java.io.File[] r3 = r3.listFiles()
            if (r3 == 0) goto L30
            int r0 = r3.length
            r1 = 0
        L26:
            if (r1 >= r0) goto L30
            r2 = r3[r1]
            O(r2)
            int r1 = r1 + 1
            goto L26
        L30:
            return
    }

    public static void P(java.io.File r4, java.io.File r5, java.lang.String r6) {
            java.lang.String r0 = "：目标不是目录"
            java.lang.String r1 = "：创建目标目录失败"
            boolean r2 = r4.isDirectory()
            if (r2 == 0) goto Lae
            boolean r2 = r5.exists()
            if (r2 != 0) goto L2a
            java.lang.String r2 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e
            android.system.Os.rename(r2, r3)     // Catch: java.lang.Throwable -> L1e
            sf.n r2 = sf.n.f12433a     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L25:
            boolean r2 = r2 instanceof sf.f
            if (r2 != 0) goto L2a
            goto L74
        L2a:
            java.util.Map r2 = S(r4)
            java.lang.String r2 = a0(r2)
            boolean r3 = r5.exists()     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L4f
            boolean r3 = r5.mkdirs()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L3f
            goto L4f
        L3f:
            java.lang.String r4 = r6.concat(r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            throw r5     // Catch: java.lang.Throwable -> L4d
        L4d:
            r4 = move-exception
            goto L93
        L4f:
            boolean r1 = r5.isDirectory()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L85
            U(r4, r5)     // Catch: java.lang.Throwable -> L4d
            java.util.Map r4 = S(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = a0(r4)     // Catch: java.lang.Throwable -> L4d
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L7d
            java.util.Map r4 = S(r5)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = a0(r4)     // Catch: java.lang.Throwable -> L4d
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L75
        L74:
            return
        L75:
            java.lang.String r4 = "目标目录内容不完整"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            throw r5     // Catch: java.lang.Throwable -> L4d
        L7d:
            java.lang.String r4 = "源目录在复制时发生变化"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            throw r5     // Catch: java.lang.Throwable -> L4d
        L85:
            java.lang.String r4 = r6.concat(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            throw r5     // Catch: java.lang.Throwable -> L4d
        L93:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = r4.getMessage()
            if (r0 == 0) goto L9c
            goto La4
        L9c:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getSimpleName()
        La4:
            java.lang.String r1 = "："
            java.lang.String r6 = wb.en.h(r6, r1, r0)
            r5.<init>(r6, r4)
            throw r5
        Lae:
            java.lang.String r4 = "：源目录不存在"
            java.lang.String r4 = r6.concat(r4)
            j8.o.q(r4)
            return
    }

    public static final fb.s2 Q(android.content.Context r13, fb.j2 r14) {
            java.lang.String r6 = r14.f3593d
            java.util.LinkedHashMap r7 = r14.f3595f
            java.lang.String r0 = r14.f3594e
            j(r13)
            long r1 = r14.f3601l
            long r3 = java.lang.System.currentTimeMillis()
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 - r8
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 < 0) goto L1ac
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.io.File r1 = r1.ensureDirs(r13)
            java.io.File r1 = r1.getCanonicalFile()
            r1.getClass()
            N(r1)
            M(r1)
            java.lang.String r3 = r14.f3591b
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = fb.a2.e(r3)
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L1a5
            java.lang.String r4 = ".."
            r5 = 0
            boolean r8 = og.m.h0(r3, r4, r5)
            if (r8 != 0) goto L1a5
            java.io.File r8 = new java.io.File
            r8.<init>(r1, r3)
            java.io.File r8 = r8.getAbsoluteFile()
            r9 = r2
            r2 = r3
            java.io.File r3 = r8.getCanonicalFile()
            java.io.File r10 = r3.getParentFile()
            boolean r1 = gg.l.a(r10, r1)
            if (r1 == 0) goto L19f
            boolean r1 = r8.equals(r3)
            if (r1 == 0) goto L19f
            java.lang.String r1 = "[0-9a-f]{64}"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r1)
            r8.getClass()
            java.util.regex.Matcher r8 = r8.matcher(r6)
            boolean r8 = r8.matches()
            if (r8 == 0) goto L199
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L193
            int r1 = r7.size()
            r8 = 4096(0x1000, float:5.74E-42)
            if (r1 > r8) goto L18d
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L9b
            goto L12b
        L9b:
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        La3:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L12b
            java.lang.Object r8 = r1.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r11 = og.m.t0(r10)
            if (r11 != 0) goto L125
            int r11 = r10.length()
            r12 = 240(0xf0, float:3.36E-43)
            if (r11 > r12) goto L125
            boolean r11 = og.m.i0(r10, r5)
            if (r11 != 0) goto L125
            r11 = 92
            boolean r11 = og.m.i0(r10, r11)
            if (r11 != 0) goto L125
            r11 = 47
            boolean r12 = og.m.I0(r10, r11)
            if (r12 != 0) goto L125
            boolean r12 = og.m.l0(r10, r11)
            if (r12 != 0) goto L125
            r12 = 1
            char[] r12 = new char[r12]
            r12[r5] = r11
            r11 = 6
            java.util.List r10 = og.m.F0(r10, r12, r11)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto Lf6
            goto L11b
        Lf6:
            java.util.Iterator r10 = r10.iterator()
        Lfa:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L11b
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto L125
            java.lang.String r12 = "."
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L125
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto L125
            goto Lfa
        L11b:
            int r8 = r8.length()
            r10 = 256(0x100, float:3.59E-43)
            if (r8 > r10) goto L125
            goto La3
        L125:
            java.lang.String r13 = "插件工作区恢复点包含无效路径"
            j8.o.t(r13)
            return r9
        L12b:
            int r1 = r14.f3597h
            if (r1 < 0) goto L187
            int r4 = r14.f3598i
            r5 = -1
            if (r5 > r4) goto L187
            if (r4 > r1) goto L187
            int r4 = r14.f3599j
            if (r5 > r4) goto L187
            if (r4 > r1) goto L187
            java.lang.String r1 = r14.f3590a
            java.io.File r4 = i(r13, r1)
            u(r4)
            s(r4)
            java.util.Map r1 = S(r4)
            java.lang.String r1 = a0(r1)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L181
            long r0 = java.lang.System.currentTimeMillis()
            r4.setLastModified(r0)
            android.content.Context r0 = r13.getApplicationContext()
            if (r0 == 0) goto L165
            r1 = r0
            goto L166
        L165:
            r1 = r13
        L166:
            boolean r5 = r14.f3592c
            java.lang.String r13 = r14.f3596g
            boolean r0 = og.m.t0(r13)
            if (r0 == 0) goto L172
            r8 = r2
            goto L173
        L172:
            r8 = r13
        L173:
            int r9 = r14.f3597h
            int r10 = r14.f3598i
            int r11 = r14.f3599j
            boolean r12 = r14.f3600k
            fb.s2 r0 = new fb.s2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L181:
            java.lang.String r13 = "插件工作区内容与恢复点不一致"
            j8.o.t(r13)
            return r9
        L187:
            java.lang.String r13 = "插件工作区恢复点的 revision 无效"
            j8.o.t(r13)
            return r9
        L18d:
            java.lang.String r13 = "插件工作区恢复点包含过多路径"
            j8.o.t(r13)
            return r9
        L193:
            java.lang.String r13 = "插件工作区恢复点缺少有效内容指纹"
            j8.o.t(r13)
            return r9
        L199:
            java.lang.String r13 = "插件工作区恢复点缺少有效基线"
            j8.o.t(r13)
            return r9
        L19f:
            java.lang.String r13 = "插件工作区恢复点不在脚本根目录内"
            j8.o.t(r13)
            return r9
        L1a5:
            r9 = r2
            java.lang.String r13 = "插件工作区恢复点的 plugin_id 无效"
            j8.o.t(r13)
            return r9
        L1ac:
            r9 = r2
            java.lang.String r13 = "插件工作区恢复点已过期"
            j8.o.t(r13)
            return r9
    }

    public static java.lang.String R(fb.q2 r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = "missing"
            return r4
        L5:
            boolean r0 = r4.f3740a
            if (r0 == 0) goto Lc
            java.lang.String r0 = "directory"
            goto Le
        Lc:
            java.lang.String r0 = "file"
        Le:
            long r1 = r4.f3741b
            java.lang.String r4 = r4.f3742c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ":"
            r3.append(r0)
            r3.append(r1)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            return r4
    }

    public static java.util.Map S(java.io.File r9) {
            boolean r0 = r9.isDirectory()
            if (r0 != 0) goto L9
            tf.u r9 = tf.u.f13168g
            return r9
        L9:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            dg.j r1 = new dg.j
            r2 = 0
            dg.k r3 = dg.k.f2255g
            r1.<init>(r9, r3, r2)
            fb.l2 r2 = new fb.l2
            r3 = 0
            r2.<init>(r9, r3)
            ng.i r3 = new ng.i
            r4 = 1
            r3.<init>(r1, r4, r2)
            ng.h r1 = new ng.h
            r1.<init>(r3)
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.io.File r3 = dg.l.i0(r2, r9)
            java.lang.String r3 = dg.l.d0(r3)
            boolean r5 = r2.isDirectory()
            if (r5 == 0) goto L4b
            fb.q2 r2 = new fb.q2
            r5 = 0
            java.lang.String r7 = ""
            r2.<init>(r4, r5, r7)
            goto L5a
        L4b:
            fb.q2 r5 = new fb.q2
            long r6 = r2.length()
            java.lang.String r2 = y(r2)
            r8 = 0
            r5.<init>(r8, r6, r2)
            r2 = r5
        L5a:
            r0.put(r3, r2)
            goto L27
        L5e:
            return r0
    }

    public static org.json.JSONObject T(int r3, java.lang.String r4) {
            java.lang.String r0 = "string"
            java.lang.String r1 = "description"
            java.lang.String r2 = "type"
            org.json.JSONObject r4 = wb.en.l(r2, r0, r1, r4)
            java.lang.String r0 = "minLength"
            r4.put(r0, r3)
            return r4
    }

    public static void U(java.io.File r7, java.io.File r8) {
            java.util.Map r0 = S(r7)
            java.util.Map r1 = S(r8)
            java.util.Set r2 = r1.keySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.get(r5)
            fb.q2 r6 = (fb.q2) r6
            if (r6 == 0) goto L3b
            boolean r6 = r6.f3740a
            java.lang.Object r5 = tf.y.Y(r5, r1)
            fb.q2 r5 = (fb.q2) r5
            boolean r5 = r5.f3740a
            if (r6 == r5) goto L39
            goto L3b
        L39:
            r5 = 0
            goto L3c
        L3b:
            r5 = 1
        L3c:
            if (r5 == 0) goto L17
            r3.add(r4)
            goto L17
        L42:
            fb.r r2 = new fb.r
            r4 = 15
            r2.<init>(r4)
            java.util.List r2 = tf.m.K1(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L51:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = new java.io.File
            r4.<init>(r8, r3)
            q(r4)
            goto L51
        L66:
            java.util.Set r2 = r0.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L75:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L90
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            fb.q2 r5 = (fb.q2) r5
            boolean r5 = r5.f3740a
            if (r5 == 0) goto L75
            r3.add(r4)
            goto L75
        L90:
            fb.r r2 = new fb.r
            r4 = 14
            r2.<init>(r4)
            java.util.List r2 = tf.m.K1(r3, r2)
            java.util.Iterator r2 = r2.iterator()
        L9f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lcd
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = new java.io.File
            r4.<init>(r8, r3)
            boolean r5 = r4.isDirectory()
            if (r5 != 0) goto L9f
            boolean r4 = r4.mkdirs()
            if (r4 == 0) goto Lc3
            goto L9f
        Lc3:
            java.lang.String r7 = "创建目录失败: "
            java.lang.String r7 = wb.en.g(r7, r3)
            ah.a.h(r7)
            return
        Lcd:
            java.util.Set r0 = r0.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ldc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lf7
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            fb.q2 r4 = (fb.q2) r4
            boolean r4 = r4.f3740a
            if (r4 != 0) goto Ldc
            r2.add(r3)
            goto Ldc
        Lf7:
            java.util.Iterator r0 = r2.iterator()
        Lfb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L12f
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            fb.q2 r2 = (fb.q2) r2
            java.lang.Object r4 = r1.get(r3)
            boolean r2 = gg.l.a(r4, r2)
            if (r2 == 0) goto L11e
            goto Lfb
        L11e:
            java.io.File r2 = new java.io.File
            r2.<init>(r8, r3)
            q(r2)
            java.io.File r4 = new java.io.File
            r4.<init>(r7, r3)
            m(r4, r2)
            goto Lfb
        L12f:
            s(r8)
            return
    }

    public static void V(org.json.JSONArray r2, java.lang.String r3, java.lang.String r4, java.util.LinkedHashMap r5, java.util.List r6) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "hchat.workspace."
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = "name"
            r0.put(r1, r3)
            java.lang.String r3 = "description"
            r0.put(r3, r4)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "type"
            java.lang.String r1 = "object"
            r3.put(r4, r1)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>(r5)
            java.lang.String r5 = "properties"
            r3.put(r5, r4)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r6)
            java.lang.String r5 = "required"
            r3.put(r5, r4)
            java.lang.String r4 = "additionalProperties"
            r5 = 0
            r3.put(r4, r5)
            java.lang.String r4 = "inputSchema"
            r0.put(r4, r3)
            r2.put(r0)
            return
    }

    public static final java.lang.String W() {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1 = 1
            java.lang.String r2 = "插件目录名；必须使用插件列表中的准确 ID"
            org.json.JSONObject r2 = T(r1, r2)
            sf.e r3 = new sf.e
            java.lang.String r4 = "plugin_id"
            r3.<init>(r4, r2)
            r2 = 0
            java.lang.String r5 = "相对插件目录的路径，默认 ."
            org.json.JSONObject r6 = T(r2, r5)
            sf.e r7 = new sf.e
            java.lang.String r8 = "path"
            r7.<init>(r8, r6)
            java.lang.String r6 = "是否递归检查子文件和目录"
            org.json.JSONObject r6 = e(r6, r1)
            sf.e r9 = new sf.e
            java.lang.String r10 = "recursive"
            r9.<init>(r10, r6)
            java.lang.String r6 = "是否尝试补齐当前文件所有者的读写权限和目录进入权限"
            org.json.JSONObject r6 = e(r6, r2)
            sf.e r11 = new sf.e
            java.lang.String r12 = "repair"
            r11.<init>(r12, r6)
            sf.e[] r3 = new sf.e[]{r3, r7, r9, r11}
            java.util.LinkedHashMap r3 = tf.y.Z(r3)
            java.util.List r6 = a.a.x0(r4)
            java.lang.String r7 = "check_access"
            java.lang.String r9 = "检查插件文件是否可读、可写或可替换，并可尝试修复当前微信进程有权修改的文件权限"
            V(r0, r7, r9, r3, r6)
            java.lang.String r3 = "插件目录名；修改现有插件时使用插件列表中的准确 ID"
            org.json.JSONObject r3 = T(r1, r3)
            sf.e r6 = new sf.e
            r6.<init>(r4, r3)
            org.json.JSONObject r3 = T(r2, r5)
            sf.e r5 = new sf.e
            r5.<init>(r8, r3)
            java.lang.String r3 = "是否递归列出"
            org.json.JSONObject r3 = e(r3, r2)
            sf.e r7 = new sf.e
            r7.<init>(r10, r3)
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r9 = "递归最大深度"
            r10 = 3
            org.json.JSONObject r3 = A(r9, r10, r1, r3)
            sf.e r9 = new sf.e
            java.lang.String r10 = "max_depth"
            r9.<init>(r10, r3)
            sf.e[] r3 = new sf.e[]{r6, r5, r7, r9}
            java.util.LinkedHashMap r3 = tf.y.Z(r3)
            java.util.List r5 = a.a.x0(r4)
            java.lang.String r6 = "list_files"
            java.lang.String r7 = "列出插件工作区内的文件和目录"
            V(r0, r6, r7, r3, r5)
            java.lang.String r3 = "插件目录名"
            org.json.JSONObject r5 = T(r1, r3)
            sf.e r9 = new sf.e
            r9.<init>(r4, r5)
            java.lang.String r5 = "相对插件目录的文件路径"
            org.json.JSONObject r6 = T(r1, r5)
            sf.e r10 = new sf.e
            r10.<init>(r8, r6)
            java.lang.String r6 = "起始行，从 1 开始"
            r7 = 0
            org.json.JSONObject r6 = A(r6, r1, r1, r7)
            sf.e r11 = new sf.e
            java.lang.String r12 = "start_line"
            r11.<init>(r12, r6)
            java.lang.String r6 = "起始行内的字符位置，从 1 开始"
            org.json.JSONObject r6 = A(r6, r1, r1, r7)
            sf.e r12 = new sf.e
            java.lang.String r13 = "start_column"
            r12.<init>(r13, r6)
            java.lang.String r6 = "可选结束行，0 表示按 max_lines"
            org.json.JSONObject r6 = A(r6, r2, r2, r7)
            sf.e r13 = new sf.e
            java.lang.String r7 = "end_line"
            r13.<init>(r7, r6)
            r6 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "未指定 end_line 时最多返回行数"
            r14 = 400(0x190, float:5.6E-43)
            org.json.JSONObject r6 = A(r7, r14, r1, r6)
            sf.e r14 = new sf.e
            java.lang.String r7 = "max_lines"
            r14.<init>(r7, r6)
            java.lang.String r6 = "是否在内容前显示行号"
            org.json.JSONObject r6 = e(r6, r1)
            sf.e r15 = new sf.e
            java.lang.String r7 = "include_line_numbers"
            r15.<init>(r7, r6)
            sf.e[] r6 = new sf.e[]{r9, r10, r11, r12, r13, r14, r15}
            java.util.LinkedHashMap r6 = tf.y.Z(r6)
            java.lang.String[] r7 = new java.lang.String[]{r4, r8}
            java.util.List r7 = a.a.y0(r7)
            java.lang.String r9 = "read_file"
            java.lang.String r10 = "按行读取插件工作区内的文本文件并返回稳定行号"
            V(r0, r9, r10, r6, r7)
            org.json.JSONObject r6 = T(r1, r3)
            sf.e r9 = new sf.e
            r9.<init>(r4, r6)
            java.lang.String r6 = "搜索文本或正则表达式"
            org.json.JSONObject r6 = T(r1, r6)
            sf.e r10 = new sf.e
            java.lang.String r7 = "query"
            r10.<init>(r7, r6)
            java.lang.String r6 = "搜索起始目录，默认 ."
            org.json.JSONObject r6 = T(r2, r6)
            sf.e r11 = new sf.e
            r11.<init>(r8, r6)
            java.lang.String r6 = "是否按正则表达式搜索"
            org.json.JSONObject r6 = e(r6, r2)
            sf.e r12 = new sf.e
            java.lang.String r13 = "regex"
            r12.<init>(r13, r6)
            java.lang.String r6 = "是否区分大小写"
            org.json.JSONObject r6 = e(r6, r2)
            sf.e r13 = new sf.e
            java.lang.String r14 = "case_sensitive"
            r13.<init>(r14, r6)
            java.lang.String r6 = "可选路径通配符，例如 **/*.java"
            org.json.JSONObject r6 = T(r2, r6)
            sf.e r14 = new sf.e
            java.lang.String r15 = "file_pattern"
            r14.<init>(r15, r6)
            java.lang.String r6 = "可选排除路径通配符"
            org.json.JSONObject r6 = T(r2, r6)
            sf.e r15 = new sf.e
            java.lang.String r1 = "exclude_pattern"
            r15.<init>(r1, r6)
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r6 = "返回匹配行之前的上下文行数"
            org.json.JSONObject r6 = A(r6, r2, r2, r1)
            sf.e r2 = new sf.e
            r16 = r9
            java.lang.String r9 = "before_context"
            r2.<init>(r9, r6)
            java.lang.String r6 = "返回匹配行之后的上下文行数"
            r9 = 0
            org.json.JSONObject r1 = A(r6, r9, r9, r1)
            sf.e r6 = new sf.e
            java.lang.String r9 = "after_context"
            r6.<init>(r9, r1)
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r9 = "最多返回匹配数量"
            r17 = r2
            r2 = 50
            r18 = r6
            r6 = 1
            org.json.JSONObject r1 = A(r9, r2, r6, r1)
            sf.e r2 = new sf.e
            java.lang.String r9 = "limit"
            r2.<init>(r9, r1)
            r9 = r16
            r16 = r17
            r17 = r18
            r18 = r2
            sf.e[] r1 = new sf.e[]{r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.lang.String[] r2 = new java.lang.String[]{r4, r7}
            java.util.List r2 = a.a.y0(r2)
            java.lang.String r7 = "search_files"
            java.lang.String r9 = "搜索插件工作区内文本文件的内容"
            V(r0, r7, r9, r1, r2)
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            java.lang.String r1 = "要创建的相对目录路径"
            org.json.JSONObject r1 = T(r6, r1)
            sf.e r7 = new sf.e
            r7.<init>(r8, r1)
            sf.e[] r1 = new sf.e[]{r2, r7}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.lang.String[] r2 = new java.lang.String[]{r4, r8}
            java.util.List r2 = a.a.y0(r2)
            java.lang.String r7 = "create_directory"
            java.lang.String r9 = "在插件工作区内创建目录"
            V(r0, r7, r9, r1, r2)
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            org.json.JSONObject r1 = T(r6, r5)
            sf.e r5 = new sf.e
            r5.<init>(r8, r1)
            java.lang.String r1 = "完整文件内容"
            r9 = 0
            org.json.JSONObject r1 = T(r9, r1)
            sf.e r6 = new sf.e
            java.lang.String r7 = "content"
            r6.<init>(r7, r1)
            java.lang.String r1 = "是否允许覆写现有文件"
            org.json.JSONObject r1 = e(r1, r9)
            sf.e r9 = new sf.e
            java.lang.String r10 = "overwrite"
            r9.<init>(r10, r1)
            sf.e[] r1 = new sf.e[]{r2, r5, r6, r9}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.lang.String[] r2 = new java.lang.String[]{r4, r8, r7}
            java.util.List r2 = a.a.y0(r2)
            java.lang.String r5 = "write_file"
            java.lang.String r6 = "新建文本文件，或在 overwrite=true 时完整覆写文件"
            V(r0, r5, r6, r1, r2)
            r6 = 1
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            java.lang.String r1 = "以 *** Begin Patch 开始、*** End Patch 结束的完整统一补丁"
            org.json.JSONObject r1 = T(r6, r1)
            sf.e r5 = new sf.e
            java.lang.String r7 = "patch"
            r5.<init>(r7, r1)
            sf.e[] r1 = new sf.e[]{r2, r5}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.lang.String[] r2 = new java.lang.String[]{r4, r7}
            java.util.List r2 = a.a.y0(r2)
            java.lang.String r5 = "apply_patch"
            java.lang.String r7 = "应用 Codex 风格统一补丁，可在一次调用中新增、更新、移动或删除多个文件"
            V(r0, r5, r7, r1, r2)
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            java.lang.String r1 = "源相对路径"
            org.json.JSONObject r1 = T(r6, r1)
            sf.e r5 = new sf.e
            java.lang.String r7 = "source"
            r5.<init>(r7, r1)
            java.lang.String r1 = "目标相对路径"
            org.json.JSONObject r1 = T(r6, r1)
            sf.e r6 = new sf.e
            java.lang.String r9 = "destination"
            r6.<init>(r9, r1)
            java.lang.String r1 = "是否覆盖目标"
            r11 = 0
            org.json.JSONObject r1 = e(r1, r11)
            sf.e r11 = new sf.e
            r11.<init>(r10, r1)
            sf.e[] r1 = new sf.e[]{r2, r5, r6, r11}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.lang.String[] r2 = new java.lang.String[]{r4, r7, r9}
            java.util.List r2 = a.a.y0(r2)
            java.lang.String r5 = "move_path"
            java.lang.String r6 = "移动或重命名插件工作区内的文件或目录"
            V(r0, r5, r6, r1, r2)
            r6 = 1
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            java.lang.String r1 = "要删除的相对路径"
            org.json.JSONObject r1 = T(r6, r1)
            sf.e r5 = new sf.e
            r5.<init>(r8, r1)
            sf.e[] r1 = new sf.e[]{r2, r5}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.lang.String[] r2 = new java.lang.String[]{r4, r8}
            java.util.List r2 = a.a.y0(r2)
            java.lang.String r5 = "delete_path"
            java.lang.String r9 = "删除插件工作区内的文件或子目录；不能删除插件根目录"
            V(r0, r5, r9, r1, r2)
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            java.lang.String r1 = "要恢复的相对路径"
            org.json.JSONObject r1 = T(r6, r1)
            sf.e r5 = new sf.e
            r5.<init>(r8, r1)
            sf.e[] r1 = new sf.e[]{r2, r5}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.lang.String[] r2 = new java.lang.String[]{r4, r8}
            java.util.List r2 = a.a.y0(r2)
            java.lang.String r5 = "restore_path"
            java.lang.String r9 = "把文件或目录恢复到本轮开始时的状态；新建路径会被移除"
            V(r0, r5, r9, r1, r2)
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            sf.e[] r1 = new sf.e[]{r2}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.util.List r2 = a.a.x0(r4)
            java.lang.String r5 = "reset_workspace"
            java.lang.String r9 = "丢弃本轮全部暂存修改并恢复到任务开始状态"
            V(r0, r5, r9, r1, r2)
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            sf.e[] r1 = new sf.e[]{r2}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.util.List r2 = a.a.x0(r4)
            java.lang.String r5 = "delete_plugin"
            java.lang.String r9 = "标记删除整个现有插件；最终提交前客户端一定会要求用户确认"
            V(r0, r5, r9, r1, r2)
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            java.lang.String r1 = "可选相对路径，只显示该路径下的差异"
            r9 = 0
            org.json.JSONObject r1 = T(r9, r1)
            sf.e r5 = new sf.e
            r5.<init>(r8, r1)
            sf.e[] r1 = new sf.e[]{r2, r5}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.util.List r2 = a.a.x0(r4)
            java.lang.String r5 = "show_diff"
            java.lang.String r6 = "显示当前暂存工作区相对原插件的标准统一 diff"
            V(r0, r5, r6, r1, r2)
            r6 = 1
            org.json.JSONObject r1 = T(r6, r3)
            sf.e r2 = new sf.e
            r2.<init>(r4, r1)
            sf.e[] r1 = new sf.e[]{r2}
            java.util.LinkedHashMap r1 = tf.y.Z(r1)
            java.util.List r2 = a.a.x0(r4)
            java.lang.String r3 = "workspace_status"
            java.lang.String r4 = "检查工作区变更、必需文件和静态校验结果"
            V(r0, r3, r4, r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "Hchat 插件工作区工具"
            r1.put(r7, r2)
            java.lang.String r2 = "instructions"
            java.lang.String r3 = "所有路径均相对单个插件目录。权限异常或写入失败时先调用 check_access，必要时设置 repair=true；修改代码先 list/read/search，再使用 Codex 风格 apply_patch。完成前必须依次调用 workspace_status 和 show_diff。"
            r1.put(r2, r3)
            java.lang.String r2 = "tools"
            r1.put(r2, r0)
            java.lang.String r0 = r1.toString()
            r0.getClass()
            return r0
    }

    public static java.io.File X(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.getParentFile()
            java.lang.String r3 = r3.getName()
            java.lang.String r2 = ".committed"
            java.lang.String r3 = bc.e.i(r3, r2)
            r0.<init>(r1, r3)
            return r0
    }

    public static java.lang.String Y(java.io.File r6) {
            boolean r0 = r6.isFile()
            r1 = 0
            if (r0 == 0) goto L2e
            long r2 = r6.length()
            r4 = 1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L2e
            r4 = 129(0x81, double:6.37E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L2e
            java.nio.charset.Charset r0 = og.a.f9804a     // Catch: java.lang.Throwable -> L1e
            java.lang.String r6 = dg.l.h0(r6, r0)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r6 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r6)
            r6 = r0
        L25:
            boolean r0 = r6 instanceof sf.f
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r1 = r6
        L2c:
            java.lang.String r1 = (java.lang.String) r1
        L2e:
            return r1
    }

    public static java.io.File Z(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.getParentFile()
            java.lang.String r3 = r3.getName()
            java.lang.String r2 = ".ready"
            java.lang.String r3 = bc.e.i(r3, r2)
            r0.<init>(r1, r3)
            return r0
    }

    public static final void a(java.io.File r5, java.lang.String r6) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.getParentFile()
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "."
            java.lang.String r4 = ".agent.tmp"
            java.lang.String r2 = eh.a.n(r3, r2, r4)
            r0.<init>(r1, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            java.nio.charset.Charset r2 = og.a.f9804a     // Catch: java.lang.Throwable -> L50
            byte[] r6 = r6.getBytes(r2)     // Catch: java.lang.Throwable -> L50
            r6.getClass()     // Catch: java.lang.Throwable -> L50
            r1.write(r6)     // Catch: java.lang.Throwable -> L50
            java.io.FileDescriptor r6 = r1.getFD()     // Catch: java.lang.Throwable -> L50
            r6.sync()     // Catch: java.lang.Throwable -> L50
            r1.close()
            java.lang.String r6 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L3c
            android.system.Os.rename(r6, r1)     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r6 = move-exception
            r0.delete()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "写入文件失败: "
            java.lang.String r5 = wb.en.g(r1, r5)
            r0.<init>(r5, r6)
            throw r0
        L50:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L52
        L52:
            r6 = move-exception
            ig.a.i(r1, r5)
            throw r6
    }

    public static java.lang.String a0(java.util.Map r4) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>(r4)
            java.util.Set r4 = r1.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            fb.q2 r1 = (fb.q2) r1
            r2.getClass()
            java.nio.charset.Charset r3 = og.a.f9804a
            byte[] r2 = r2.getBytes(r3)
            r2.getClass()
            r0.update(r2)
            boolean r2 = r1.f3740a
            r0.update(r2)
            long r2 = r1.f3741b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.nio.charset.Charset r3 = og.a.f9805b
            byte[] r2 = r2.getBytes(r3)
            r2.getClass()
            r0.update(r2)
            java.lang.String r1 = r1.f3742c
            byte[] r1 = r1.getBytes(r3)
            r1.getClass()
            r0.update(r1)
            goto L13
        L5e:
            byte[] r4 = r0.digest()
            r4.getClass()
            fb.g0 r0 = new fb.g0
            r1 = 24
            r0.<init>(r1)
            java.lang.String r4 = tf.l.E0(r4, r0)
            return r4
    }

    public static final org.json.JSONArray b(java.util.List r4, int r5, int r6) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r5 >= 0) goto L8
            r5 = 0
        L8:
            int r1 = r4.size()
            if (r6 <= r1) goto Lf
            r6 = r1
        Lf:
            if (r5 < r6) goto L12
            return r0
        L12:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            int r2 = r5 + 1
            java.lang.String r3 = "line"
            r1.put(r3, r2)
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3 = 500(0x1f4, float:7.0E-43)
            java.lang.String r5 = og.m.P0(r3, r5)
            java.lang.String r3 = "text"
            r1.put(r3, r5)
            r0.put(r1)
            r5 = r2
            goto Lf
    }

    public static fb.p2 b0(java.io.File r14, java.lang.String r15) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "main.java"
            r0.<init>(r14, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "info.prop"
            r1.<init>(r14, r2)
            boolean r2 = r0.isFile()
            r3 = 0
            if (r2 == 0) goto L1b0
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L1aa
            long r4 = r0.length()
            r6 = 2097152(0x200000, double:1.036131E-317)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L1a4
            long r4 = r1.length()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L1a4
            java.nio.charset.Charset r2 = og.a.f9804a
            java.lang.String r11 = dg.l.h0(r1, r2)
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            java.io.StringReader r2 = new java.io.StringReader     // Catch: java.lang.Throwable -> L41
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L41
            r1.load(r2)     // Catch: java.lang.Throwable -> L41
        L41:
            og.k r2 = fb.a2.f3397a
            fb.y r8 = new fb.y
            java.lang.String r2 = "name"
            java.lang.String r1 = r1.getProperty(r2)
            if (r1 != 0) goto L4f
            java.lang.String r1 = ""
        L4f:
            r9 = r1
            java.nio.charset.Charset r1 = og.a.f9804a
            java.lang.String r12 = dg.l.h0(r0, r1)
            java.lang.String r13 = ""
            r10 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            fb.y r15 = fb.a2.c(r8)
            fb.z1 r0 = fb.a2.f(r15)
            java.util.List r0 = r0.f3871a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            dg.j r0 = new dg.j
            dg.k r2 = dg.k.f2255g
            r0.<init>(r14, r2, r3)
            fb.g0 r2 = new fb.g0
            r4 = 21
            r2.<init>(r4)
            ng.i r4 = new ng.i
            r5 = 1
            r4.<init>(r0, r5, r2)
            ng.h r2 = new ng.h
            r2.<init>(r4)
        L84:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16b
            java.lang.Object r0 = r2.next()
            java.io.File r0 = (java.io.File) r0
            java.io.File r4 = dg.l.i0(r0, r14)
            java.lang.String r4 = dg.l.d0(r4)
            long r8 = r0.length()
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            fb.b0 r8 = fb.b0.f3402g
            r9 = 0
            if (r5 <= 0) goto Lb2
            fb.a0 r0 = new fb.a0
            java.lang.String r5 = " 超过 2 MB，不能执行静态检查"
            java.lang.String r4 = r4.concat(r5)
            r0.<init>(r8, r4, r9)
            r1.add(r0)
            goto L84
        Lb2:
            byte[] r0 = dg.l.g0(r0)     // Catch: java.lang.Throwable -> Lb7
            goto Lbe
        Lb7:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        Lbe:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto Lc4
            r0 = r3
        Lc4:
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L15b
            boolean r5 = C(r0)
            if (r5 != 0) goto Ld0
            goto L15b
        Ld0:
            og.k r5 = fb.a2.f3397a
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r10 = og.a.f9804a
            r5.<init>(r0, r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "```"
            boolean r10 = og.m.h0(r5, r10, r9)
            if (r10 == 0) goto Lf4
            fb.a0 r10 = new fb.a0
            java.lang.String r11 = " 仍包含 Markdown 代码围栏"
            java.lang.String r11 = r4.concat(r11)
            r10.<init>(r8, r11, r9)
            r0.add(r10)
        Lf4:
            og.k r10 = fb.a2.f3398b
            boolean r10 = r10.a(r5)
            if (r10 == 0) goto L10a
            fb.a0 r10 = new fb.a0
            java.lang.String r11 = " 包含绝对路径或 .. 路径，请改用 pluginDir、pluginDirFile 或 cacheDir"
            java.lang.String r11 = r4.concat(r11)
            r10.<init>(r8, r11, r9)
            r0.add(r10)
        L10a:
            boolean r10 = fb.a2.b(r5)
            if (r10 == 0) goto L11e
            fb.a0 r10 = new fb.a0
            java.lang.String r11 = ": BeanShell 顶层 native 方法无法绑定 JNI，请把 native 声明放进类并将该类的 ClassLoader 传给 loadSo"
            java.lang.String r11 = r4.concat(r11)
            r10.<init>(r8, r11, r9)
            r0.add(r10)
        L11e:
            java.util.ArrayList r5 = fb.a2.d(r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = tf.n.e1(r5)
            r8.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L12f:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L153
            java.lang.Object r9 = r5.next()
            fb.a0 r9 = (fb.a0) r9
            java.lang.String r10 = r9.f3392b
            java.lang.String r11 = ": "
            java.lang.String r10 = wb.en.h(r4, r11, r10)
            fb.b0 r11 = r9.f3391a
            boolean r9 = r9.f3393c
            r11.getClass()
            fb.a0 r12 = new fb.a0
            r12.<init>(r11, r10, r9)
            r8.add(r12)
            goto L12f
        L153:
            tf.r.h1(r0, r8)
            tf.r.h1(r1, r0)
            goto L84
        L15b:
            fb.a0 r0 = new fb.a0
            java.lang.String r5 = " 不是可静态检查的文本代码"
            java.lang.String r4 = r4.concat(r5)
            r0.<init>(r8, r4, r9)
            r1.add(r0)
            goto L84
        L16b:
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L179:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L199
            java.lang.Object r2 = r1.next()
            r3 = r2
            fb.a0 r3 = (fb.a0) r3
            fb.b0 r4 = r3.f3391a
            java.lang.String r3 = r3.f3392b
            sf.e r5 = new sf.e
            r5.<init>(r4, r3)
            boolean r3 = r14.add(r5)
            if (r3 == 0) goto L179
            r0.add(r2)
            goto L179
        L199:
            fb.z1 r14 = new fb.z1
            r14.<init>(r0)
            fb.p2 r0 = new fb.p2
            r0.<init>(r15, r14)
            return r0
        L1a4:
            java.lang.String r14 = "插件主文件超过大小限制"
            j8.o.t(r14)
            return r3
        L1aa:
            java.lang.String r14 = "插件缺少 info.prop"
            j8.o.t(r14)
            return r3
        L1b0:
            java.lang.String r14 = "插件缺少 main.java"
            j8.o.t(r14)
            return r3
    }

    public static final og.k c(java.lang.String r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "^"
            r0.<init>(r1)
            r1 = 92
            r2 = 47
            java.lang.String r9 = r9.replace(r1, r2)
            r9.getClass()
            boolean r3 = og.m.i0(r9, r2)
            java.lang.String r4 = "(?:.*/)?"
            if (r3 != 0) goto L1d
            r0.append(r4)
        L1d:
            r3 = 0
            r5 = r3
        L1f:
            int r6 = r9.length()
            r7 = 36
            if (r5 >= r6) goto L82
            char r6 = r9.charAt(r5)
            if (r6 == r7) goto L79
            r7 = 46
            if (r6 == r7) goto L79
            r7 = 63
            if (r6 == r7) goto L73
            switch(r6) {
                case 40: goto L79;
                case 41: goto L79;
                case 42: goto L42;
                case 43: goto L79;
                default: goto L38;
            }
        L38:
            switch(r6) {
                case 91: goto L79;
                case 92: goto L79;
                case 93: goto L79;
                case 94: goto L79;
                default: goto L3b;
            }
        L3b:
            switch(r6) {
                case 123: goto L79;
                case 124: goto L79;
                case 125: goto L79;
                default: goto L3e;
            }
        L3e:
            r0.append(r6)
            goto L7f
        L42:
            int r6 = r5 + 1
            java.lang.Character r7 = og.m.n0(r9, r6)
            if (r7 != 0) goto L4b
            goto L6d
        L4b:
            char r7 = r7.charValue()
            r8 = 42
            if (r7 != r8) goto L6d
            int r5 = r5 + 2
            java.lang.Character r7 = og.m.n0(r9, r5)
            if (r7 != 0) goto L5c
            goto L66
        L5c:
            char r7 = r7.charValue()
            if (r7 != r2) goto L66
            r0.append(r4)
            goto L7f
        L66:
            java.lang.String r5 = ".*"
            r0.append(r5)
            r5 = r6
            goto L7f
        L6d:
            java.lang.String r6 = "[^/]*"
            r0.append(r6)
            goto L7f
        L73:
            java.lang.String r6 = "[^/]"
            r0.append(r6)
            goto L7f
        L79:
            r0.append(r1)
            r0.append(r6)
        L7f:
            int r5 = r5 + 1
            goto L1f
        L82:
            r0.append(r7)
            java.lang.String r9 = r0.toString()
            og.k r0 = new og.k
            r0.<init>(r9, r3)
            return r0
    }

    public static java.io.File c0(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r1 = "Hchat_agent_plugin_workspaces"
            r0.<init>(r2, r1)
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L1f
            boolean r2 = r0.mkdirs()
            if (r2 == 0) goto L18
            goto L1f
        L18:
            java.lang.String r2 = "创建 Agent 工作区目录失败"
            j8.o.A(r2)
            r2 = 0
            return r2
        L1f:
            return r0
    }

    public static void d(java.io.File r4, java.io.File r5, fb.i2 r6) {
            java.util.List r0 = r6.f3565h
            fb.r r1 = new fb.r
            r2 = 10
            r1.<init>(r2)
            java.util.List r0 = tf.m.K1(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r2 = new java.io.File
            r2.<init>(r5, r1)
            q(r2)
            goto L11
        L26:
            java.util.List r0 = r6.f3563f
            java.util.List r6 = r6.f3564g
            java.util.ArrayList r6 = tf.m.F1(r0, r6)
            java.util.Set r6 = tf.m.T1(r6)
            java.util.List r6 = tf.m.P1(r6)
            fb.r r0 = new fb.r
            r1 = 9
            r0.<init>(r1)
            java.util.List r6 = tf.m.K1(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r0)
            java.io.File r2 = new java.io.File
            r2.<init>(r5, r0)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L94
            boolean r3 = r1.isDirectory()
            if (r3 == 0) goto L8d
            boolean r1 = r2.exists()
            if (r1 == 0) goto L76
            boolean r1 = r2.isDirectory()
            if (r1 != 0) goto L76
            p(r2)
        L76:
            boolean r1 = r2.isDirectory()
            if (r1 != 0) goto L45
            boolean r1 = r2.mkdirs()
            if (r1 == 0) goto L83
            goto L45
        L83:
            java.lang.String r4 = "创建目录失败: "
            java.lang.String r4 = wb.en.g(r4, r0)
            ah.a.h(r4)
            return
        L8d:
            q(r2)
            m(r1, r2)
            goto L45
        L94:
            java.lang.String r4 = "暂存变更路径不存在: "
            java.lang.String r4 = wb.en.g(r4, r0)
            j8.o.q(r4)
        L9d:
            return
    }

    public static void d0(java.io.File r1, java.lang.String r2) {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            java.nio.charset.Charset r1 = og.a.f9804a     // Catch: java.lang.Throwable -> L1c
            byte[] r1 = r2.getBytes(r1)     // Catch: java.lang.Throwable -> L1c
            r1.getClass()     // Catch: java.lang.Throwable -> L1c
            r0.write(r1)     // Catch: java.lang.Throwable -> L1c
            java.io.FileDescriptor r1 = r0.getFD()     // Catch: java.lang.Throwable -> L1c
            r1.sync()     // Catch: java.lang.Throwable -> L1c
            r0.close()
            return
        L1c:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1e
        L1e:
            r2 = move-exception
            ig.a.i(r0, r1)
            throw r2
    }

    public static org.json.JSONObject e(java.lang.String r3, boolean r4) {
            java.lang.String r0 = "boolean"
            java.lang.String r1 = "description"
            java.lang.String r2 = "type"
            org.json.JSONObject r3 = wb.en.l(r2, r0, r1, r3)
            java.lang.String r0 = "default"
            r3.put(r0, r4)
            return r3
    }

    public static final java.lang.String f(android.content.Context r20, java.lang.String r21, org.json.JSONObject r22) {
            r0 = r22
            java.lang.String r1 = E(r21)
            java.lang.String r2 = "check_access"
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L405
            j(r20)
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r3 = r20
            java.io.File r1 = r1.ensureDirs(r3)
            java.io.File r1 = r1.getCanonicalFile()
            r1.getClass()
            M(r1)
            java.lang.String r3 = "plugin_id"
            java.lang.String r4 = ""
            java.lang.String r3 = bc.e.l(r3, r4, r0)
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L3ff
            java.lang.String r4 = fb.a2.e(r3)
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L3f9
            java.lang.String r4 = ".."
            r5 = 0
            boolean r6 = og.m.h0(r3, r4, r5)
            if (r6 != 0) goto L3f9
            java.io.File r6 = new java.io.File
            r6.<init>(r1, r3)
            java.io.File r6 = r6.getAbsoluteFile()
            java.io.File r9 = r6.getCanonicalFile()
            java.io.File r7 = r9.getParentFile()
            boolean r7 = gg.l.a(r7, r1)
            if (r7 == 0) goto L3f3
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L3f3
            java.lang.String r6 = "path"
            java.lang.String r7 = "."
            java.lang.String r8 = r0.optString(r6, r7)
            r8.getClass()
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            r10 = 92
            r11 = 47
            java.lang.String r8 = og.t.b0(r8, r10, r11)
            r13 = 1
            char[] r10 = new char[r13]
            r10[r5] = r11
            java.lang.String r8 = og.m.S0(r8, r10)
            boolean r10 = og.m.t0(r8)
            if (r10 != 0) goto Lfb
            boolean r10 = r8.equals(r7)
            if (r10 == 0) goto L93
            goto Lfb
        L93:
            boolean r10 = og.m.I0(r8, r11)
            if (r10 != 0) goto Lf5
            boolean r10 = og.m.i0(r8, r5)
            if (r10 != 0) goto Lf5
            char[] r10 = new char[r13]
            r10[r5] = r11
            r11 = 6
            java.util.List r14 = og.m.F0(r8, r10, r11)
            boolean r10 = r14.isEmpty()
            if (r10 == 0) goto Laf
            goto Ld8
        Laf:
            java.util.Iterator r10 = r14.iterator()
        Lb3:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Ld8
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto Ld2
            boolean r12 = r11.equals(r7)
            if (r12 != 0) goto Ld2
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto Ld2
            goto Lb3
        Ld2:
            java.lang.String r0 = "路径包含不允许的片段"
            j8.o.t(r0)
            return r2
        Ld8:
            int r4 = r8.length()
            r8 = 240(0xf0, float:3.36E-43)
            if (r4 > r8) goto Lef
            r18 = 0
            r19 = 62
            java.lang.String r15 = "/"
            r16 = 0
            r17 = 0
            java.lang.String r4 = tf.m.A1(r14, r15, r16, r17, r18, r19)
            goto Lfc
        Lef:
            java.lang.String r0 = "路径过长"
            j8.o.t(r0)
            return r2
        Lf5:
            java.lang.String r0 = "必须使用插件目录内的相对路径"
            j8.o.t(r0)
            return r2
        Lfb:
            r4 = r7
        Lfc:
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L104
            r7 = r9
            goto L10d
        L104:
            java.io.File r7 = new java.io.File
            r7.<init>(r9, r4)
            java.io.File r7 = r7.getAbsoluteFile()
        L10d:
            java.io.File r12 = r7.getCanonicalFile()
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L3ed
            boolean r7 = gg.l.a(r12, r9)
            if (r7 != 0) goto L13f
            java.lang.String r7 = r12.getPath()
            r7.getClass()
            java.lang.String r8 = r9.getPath()
            java.lang.String r10 = java.io.File.separator
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            boolean r7 = og.t.d0(r7, r8, r5)
            if (r7 == 0) goto L3ed
        L13f:
            java.lang.String r2 = "recursive"
            boolean r11 = r0.optBoolean(r2, r13)
            java.lang.String r2 = "repair"
            boolean r0 = r0.optBoolean(r2, r5)
            if (r0 == 0) goto L1a8
            N(r1)
            boolean r2 = r9.exists()
            if (r2 == 0) goto L15a
            O(r9)
            goto L1a8
        L15a:
            java.io.File r2 = r12.getParentFile()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L163:
            if (r2 == 0) goto L188
            java.lang.String r8 = r2.getPath()
            r8.getClass()
            java.lang.String r10 = r9.getPath()
            r10.getClass()
            boolean r8 = og.t.d0(r8, r10, r5)
            if (r8 == 0) goto L188
            r7.add(r2)
            boolean r8 = r2.equals(r9)
            if (r8 == 0) goto L183
            goto L188
        L183:
            java.io.File r2 = r2.getParentFile()
            goto L163
        L188:
            tf.a0 r2 = new tf.a0
            r2.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L191:
            r7 = r2
            tf.z r7 = (tf.z) r7
            java.lang.Object r7 = r7.f13173h
            java.util.ListIterator r7 = (java.util.ListIterator) r7
            boolean r8 = r7.hasPrevious()
            if (r8 == 0) goto L1a8
            java.lang.Object r7 = r7.previous()
            java.io.File r7 = (java.io.File) r7
            N(r7)
            goto L191
        L1a8:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r12.getClass()
            gg.q r8 = new gg.q
            r8.<init>()
            k(r7, r8, r9, r10, r11, r12)
            boolean r2 = r8.f4560g
            fb.o2 r1 = H(r1)
            fb.r2 r8 = I(r9)
            boolean r9 = r1.f3692a
            if (r2 != 0) goto L1f3
            boolean r11 = r7.isEmpty()
            if (r11 == 0) goto L1d2
            goto L1eb
        L1d2:
            java.util.Iterator r11 = r7.iterator()
        L1d6:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1eb
            java.lang.Object r12 = r11.next()
            fb.m2 r12 = (fb.m2) r12
            boolean r14 = r12.f3637b
            if (r14 == 0) goto L1d6
            boolean r12 = r12.f3645j
            if (r12 == 0) goto L1f3
            goto L1d6
        L1eb:
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L1f3
            r11 = r13
            goto L1f4
        L1f3:
            r11 = r5
        L1f4:
            if (r2 != 0) goto L214
            boolean r12 = r7.isEmpty()
            if (r12 == 0) goto L1fd
            goto L212
        L1fd:
            java.util.Iterator r12 = r7.iterator()
        L201:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L212
            java.lang.Object r14 = r12.next()
            fb.m2 r14 = (fb.m2) r14
            boolean r14 = r14.f3646k
            if (r14 != 0) goto L201
            goto L214
        L212:
            r12 = r13
            goto L215
        L214:
            r12 = r5
        L215:
            if (r9 == 0) goto L21c
            boolean r14 = r8.f3751a
            if (r14 == 0) goto L21c
            r5 = r13
        L21c:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.addAll(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r15 = r7.iterator()
        L22d:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L24f
            java.lang.Object r13 = r15.next()
            r21 = r7
            r7 = r13
            fb.m2 r7 = (fb.m2) r7
            r22 = r15
            boolean r15 = r7.f3637b
            if (r15 == 0) goto L249
            boolean r7 = r7.f3645j
            if (r7 != 0) goto L249
            r10.add(r13)
        L249:
            r7 = r21
            r15 = r22
            r13 = 1
            goto L22d
        L24f:
            r21 = r7
            java.util.Iterator r7 = r10.iterator()
        L255:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L26d
            java.lang.Object r10 = r7.next()
            fb.m2 r10 = (fb.m2) r10
            java.lang.String r10 = r10.f3636a
            java.lang.String r13 = " 当前不可读"
            java.lang.String r10 = r10.concat(r13)
            r14.add(r10)
            goto L255
        L26d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r10 = r21.iterator()
        L276:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L28b
            java.lang.Object r13 = r10.next()
            r15 = r13
            fb.m2 r15 = (fb.m2) r15
            boolean r15 = r15.f3646k
            if (r15 != 0) goto L276
            r7.add(r13)
            goto L276
        L28b:
            java.util.Iterator r7 = r7.iterator()
        L28f:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L2a7
            java.lang.Object r10 = r7.next()
            fb.m2 r10 = (fb.m2) r10
            java.lang.String r10 = r10.f3636a
            java.lang.String r13 = " 当前不可修改或替换"
            java.lang.String r10 = r10.concat(r13)
            r14.add(r10)
            goto L28f
        L2a7:
            if (r2 == 0) goto L2ae
            java.lang.String r7 = "权限检查结果超过 500 项，请缩小 path 后继续检查"
            r14.add(r7)
        L2ae:
            if (r9 != 0) goto L2bb
            java.lang.String r1 = r1.f3693b
            java.lang.String r7 = "脚本插件根目录不可写，无法提交插件目录："
            java.lang.String r1 = r7.concat(r1)
            r14.add(r1)
        L2bb:
            java.lang.Object r1 = r8.f3752b
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = tf.n.e1(r1)
            r7.<init>(r8)
            java.util.Iterator r1 = r1.iterator()
        L2ca:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L2e8
            java.lang.Object r8 = r1.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r13 = "插件目录无法安全替换："
            r10.<init>(r13)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r7.add(r8)
            goto L2ca
        L2e8:
            r14.addAll(r7)
            java.util.Set r1 = tf.m.T1(r14)
            java.util.List r1 = tf.m.P1(r1)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r8 = "ok"
            r10 = 1
            r7.put(r8, r10)
            java.lang.String r8 = "pluginId"
            r7.put(r8, r3)
            r7.put(r6, r4)
            java.lang.String r3 = "repairAttempted"
            r7.put(r3, r0)
            java.lang.String r3 = "appUid"
            int r4 = android.os.Process.myUid()
            r7.put(r3, r4)
            java.lang.String r3 = "scriptRootWritable"
            r7.put(r3, r9)
            java.lang.String r3 = "canRead"
            r7.put(r3, r11)
            java.lang.String r3 = "canModify"
            r7.put(r3, r12)
            java.lang.String r3 = "canCommitPlugin"
            r7.put(r3, r5)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r1)
            java.lang.String r4 = "issues"
            r7.put(r4, r3)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r4 = r21.iterator()
        L33b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3c6
            java.lang.Object r5 = r4.next()
            fb.m2 r5 = (fb.m2) r5
            r5.getClass()
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = r5.f3636a
            r8.put(r6, r9)
            java.lang.String r9 = "exists"
            boolean r10 = r5.f3637b
            r8.put(r9, r10)
            java.lang.String r9 = "type"
            java.lang.String r10 = r5.f3638c
            r8.put(r9, r10)
            java.lang.String r9 = "readable"
            boolean r10 = r5.f3639d
            r8.put(r9, r10)
            java.lang.String r9 = "writable"
            boolean r10 = r5.f3640e
            r8.put(r9, r10)
            java.lang.String r9 = "executable"
            boolean r10 = r5.f3641f
            r8.put(r9, r10)
            java.lang.String r9 = "symbolicLink"
            boolean r10 = r5.f3642g
            r8.put(r9, r10)
            java.lang.String r9 = "parentWritable"
            boolean r10 = r5.f3643h
            r8.put(r9, r10)
            java.lang.String r9 = "replaceable"
            boolean r10 = r5.f3644i
            r8.put(r9, r10)
            java.lang.String r9 = "workspaceReadable"
            boolean r10 = r5.f3645j
            r8.put(r9, r10)
            java.lang.String r9 = "modifiable"
            boolean r10 = r5.f3646k
            r8.put(r9, r10)
            java.lang.String r9 = r5.f3647l
            boolean r10 = og.m.t0(r9)
            if (r10 != 0) goto L3a7
            java.lang.String r10 = "mode"
            r8.put(r10, r9)
        L3a7:
            java.lang.Integer r9 = r5.f3648m
            if (r9 == 0) goto L3b4
            int r9 = r9.intValue()
            java.lang.String r10 = "ownerUid"
            r8.put(r10, r9)
        L3b4:
            java.lang.Integer r5 = r5.f3649n
            if (r5 == 0) goto L3c1
            int r5 = r5.intValue()
            java.lang.String r9 = "ownerGid"
            r8.put(r9, r5)
        L3c1:
            r3.put(r8)
            goto L33b
        L3c6:
            java.lang.String r4 = "items"
            r7.put(r4, r3)
            java.lang.String r3 = "truncated"
            r7.put(r3, r2)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3d9
            java.lang.String r0 = "当前路径可由插件 Agent 读取和修改"
            goto L3e0
        L3d9:
            if (r0 != 0) goto L3de
            java.lang.String r0 = "请再次调用 check_access 并设置 repair=true"
            goto L3e0
        L3de:
            java.lang.String r0 = "当前微信进程无法修复这些权限，请用系统文件管理器重新复制该插件目录后再试"
        L3e0:
            java.lang.String r1 = "recommendation"
            r7.put(r1, r0)
            java.lang.String r0 = r7.toString()
            r0.getClass()
            return r0
        L3ed:
            java.lang.String r0 = "检查路径超出插件目录或使用了符号链接"
            j8.o.t(r0)
            return r2
        L3f3:
            java.lang.String r0 = "插件目录不在脚本根目录内或使用了符号链接"
            j8.o.t(r0)
            return r2
        L3f9:
            java.lang.String r0 = "plugin_id 包含不允许的路径字符"
            j8.o.t(r0)
            return r2
        L3ff:
            java.lang.String r0 = "plugin_id 不能为空"
            j8.o.t(r0)
            return r2
        L405:
            java.lang.String r0 = "不是工作区预检工具: "
            r1 = r21
            java.lang.String r0 = r0.concat(r1)
            j8.o.q(r0)
            return r2
    }

    public static java.io.File g(android.content.Context r1, fb.i2 r2) {
            java.io.File r1 = c0(r1)
            java.io.File r1 = r1.getCanonicalFile()
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r2.f3560c
            r0.<init>(r2)
            java.io.File r2 = r0.getCanonicalFile()
            java.io.File r0 = r2.getParentFile()
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L24
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L24
            return r2
        L24:
            java.lang.String r1 = "插件暂存工作区无效或已失效"
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static final boolean h(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "."
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L28
            boolean r0 = gg.l.a(r2, r1)
            if (r0 != 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r0 = 0
            boolean r1 = og.t.d0(r2, r1, r0)
            if (r1 == 0) goto L27
            goto L28
        L27:
            return r0
        L28:
            r1 = 1
            return r1
    }

    public static java.io.File i(android.content.Context r1, java.lang.String r2) {
            java.io.File r1 = c0(r1)
            java.io.File r1 = r1.getCanonicalFile()
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r2 = r0.getAbsoluteFile()
            java.io.File r0 = r2.getCanonicalFile()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2c
            java.io.File r2 = r0.getParentFile()
            boolean r1 = gg.l.a(r2, r1)
            if (r1 == 0) goto L2c
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L2c
            return r0
        L2c:
            java.lang.String r1 = "插件暂存工作区无效或已失效"
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static void j(android.content.Context r8) {
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 - r2
            java.io.File r8 = c0(r8)
            java.io.File[] r8 = r8.listFiles()
            if (r8 == 0) goto L48
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r8.length
            r4 = 0
        L19:
            if (r4 >= r3) goto L31
            r5 = r8[r4]
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L2e
            long r6 = r5.lastModified()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L2e
            r2.add(r5)
        L2e:
            int r4 = r4 + 1
            goto L19
        L31:
            java.util.Iterator r8 = r2.iterator()
        L35:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r8.next()
            java.io.File r0 = (java.io.File) r0
            r0.getClass()     // Catch: java.lang.Throwable -> L35
            p(r0)     // Catch: java.lang.Throwable -> L35
            goto L35
        L48:
            return
    }

    public static final void k(java.util.ArrayList r22, gg.q r23, java.io.File r24, java.util.ArrayList r25, boolean r26, java.io.File r27) {
            r2 = r23
            r3 = r24
            r4 = r25
            r1 = r27
            int r0 = r22.size()
            r5 = 500(0x1f4, float:7.0E-43)
            r6 = 1
            if (r0 < r5) goto L14
            r2.f4560g = r6
            return
        L14:
            boolean r9 = r1.exists()
            java.io.File r0 = r1.getAbsoluteFile()     // Catch: java.lang.Throwable -> L2a
            java.io.File r5 = r1.getCanonicalFile()     // Catch: java.lang.Throwable -> L2a
            boolean r0 = gg.l.a(r0, r5)     // Catch: java.lang.Throwable -> L2a
            r0 = r0 ^ r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L31:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto L38
            r0 = r5
        L38:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            boolean r5 = r1.isDirectory()
            java.io.File r0 = r1.getParentFile()
            if (r0 == 0) goto L5f
            boolean r8 = r0.isDirectory()
            if (r8 == 0) goto L5c
            boolean r8 = r0.canWrite()
            if (r8 == 0) goto L5c
            boolean r0 = r0.canExecute()
            if (r0 == 0) goto L5c
            r0 = r6
            goto L5d
        L5c:
            r0 = 0
        L5d:
            r15 = r0
            goto L60
        L5f:
            r15 = 0
        L60:
            if (r9 == 0) goto L6a
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L6a
            r11 = r6
            goto L6b
        L6a:
            r11 = 0
        L6b:
            if (r9 == 0) goto L75
            boolean r0 = r1.canWrite()
            if (r0 == 0) goto L75
            r12 = r6
            goto L76
        L75:
            r12 = 0
        L76:
            if (r9 == 0) goto L80
            boolean r0 = r1.canExecute()
            if (r0 == 0) goto L80
            r13 = r6
            goto L81
        L80:
            r13 = 0
        L81:
            if (r14 == 0) goto L86
        L83:
            r17 = 0
            goto Lb6
        L86:
            if (r9 != 0) goto L8b
        L88:
            r17 = r6
            goto Lb6
        L8b:
            if (r5 == 0) goto L9d
            if (r11 == 0) goto L99
            if (r13 == 0) goto L99
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L99
            r0 = r6
            goto L9a
        L99:
            r0 = 0
        L9a:
            r17 = r0
            goto Lb6
        L9d:
            if (r11 == 0) goto L83
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Laa
            r0.close()     // Catch: java.lang.Throwable -> Laa
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> Laa
            goto Lb1
        Laa:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        Lb1:
            boolean r0 = r0 instanceof sf.f
            if (r0 != 0) goto L83
            goto L88
        Lb6:
            if (r14 == 0) goto Lbb
        Lb8:
            r18 = 0
            goto Ld2
        Lbb:
            if (r9 != 0) goto Lc0
            r18 = r15
            goto Ld2
        Lc0:
            if (r5 == 0) goto Lcc
            if (r12 == 0) goto Lc8
            if (r13 == 0) goto Lc8
            r0 = r6
            goto Lc9
        Lc8:
            r0 = 0
        Lc9:
            r18 = r0
            goto Ld2
        Lcc:
            if (r12 != 0) goto Ld0
            if (r15 == 0) goto Lb8
        Ld0:
            r18 = r6
        Ld2:
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Ldb
            android.system.StructStat r0 = android.system.Os.stat(r0)     // Catch: java.lang.Throwable -> Ldb
            goto Le2
        Ldb:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        Le2:
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto Le8
            r0 = 0
        Le8:
            android.system.StructStat r0 = (android.system.StructStat) r0
            boolean r8 = r1.equals(r3)
            if (r8 == 0) goto Lf4
            java.lang.String r7 = "."
        Lf2:
            r8 = r7
            goto L125
        Lf4:
            java.lang.String r8 = r1.getPath()
            r8.getClass()
            java.lang.String r10 = r3.getPath()
            java.lang.String r6 = java.io.File.separator
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = 0
            boolean r6 = og.t.d0(r8, r6, r7)
            if (r6 == 0) goto L120
            java.io.File r6 = dg.l.i0(r1, r3)
            java.lang.String r7 = dg.l.d0(r6)
            goto Lf2
        L120:
            java.lang.String r7 = r1.getName()
            goto Lf2
        L125:
            r8.getClass()
            if (r14 == 0) goto L12e
            java.lang.String r5 = "symbolic_link"
        L12c:
            r10 = r5
            goto L144
        L12e:
            if (r9 != 0) goto L133
            java.lang.String r5 = "missing"
            goto L12c
        L133:
            if (r5 == 0) goto L138
            java.lang.String r5 = "directory"
            goto L12c
        L138:
            boolean r5 = r1.isFile()
            if (r5 == 0) goto L141
            java.lang.String r5 = "file"
            goto L12c
        L141:
            java.lang.String r5 = "other"
            goto L12c
        L144:
            if (r0 == 0) goto L160
            java.util.Locale r5 = java.util.Locale.US
            int r6 = r0.st_mode
            r6 = r6 & 4095(0xfff, float:5.738E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r7 = 1
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r7 = "%04o"
            java.lang.String r5 = java.lang.String.format(r5, r7, r6)
            goto L161
        L160:
            r5 = 0
        L161:
            if (r5 != 0) goto L165
            java.lang.String r5 = ""
        L165:
            r19 = r5
            if (r0 == 0) goto L172
            int r5 = r0.st_uid
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r20 = r5
            goto L174
        L172:
            r20 = 0
        L174:
            if (r0 == 0) goto L17f
            int r0 = r0.st_gid
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r21 = r0
            goto L181
        L17f:
            r21 = 0
        L181:
            fb.m2 r7 = new fb.m2
            r16 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5 = r22
            r5.add(r7)
            if (r14 == 0) goto L199
            java.lang.String r0 = " 是不支持的符号链接"
            java.lang.String r0 = r8.concat(r0)
            r4.add(r0)
            return
        L199:
            if (r26 == 0) goto L1e1
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L1e1
            boolean r0 = r2.f4560g
            if (r0 == 0) goto L1a6
            goto L1e1
        L1a6:
            java.io.File[] r0 = r1.listFiles()
            if (r0 != 0) goto L1b6
            java.lang.String r0 = " 无法列出目录内容"
            java.lang.String r0 = r8.concat(r0)
            r4.add(r0)
            return
        L1b6:
            fb.r r1 = new fb.r
            r6 = 11
            r1.<init>(r6)
            java.util.List r0 = tf.l.H0(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1c5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e1
            java.lang.Object r1 = r0.next()
            r6 = r1
            java.io.File r6 = (java.io.File) r6
            r1 = r5
            r5 = r26
            k(r1, r2, r3, r4, r5, r6)
            r5 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            goto L1c5
        L1e1:
            return
    }

    public static void l(java.io.File r2, java.io.File r3) {
            java.util.Map r0 = S(r2)
            java.lang.String r0 = a0(r0)
            o(r3)     // Catch: java.lang.Throwable -> L32
            n(r2, r3)     // Catch: java.lang.Throwable -> L32
            java.util.Map r2 = S(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = a0(r2)     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3c
            java.util.Map r2 = S(r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = a0(r2)     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L34
            java.io.File r2 = Z(r3)     // Catch: java.lang.Throwable -> L32
            d0(r2, r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r2 = move-exception
            goto L44
        L34:
            java.lang.String r2 = "备份目录内容不完整"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L3c:
            java.lang.String r2 = "源插件目录在备份时发生变化"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L44:
            o(r3)     // Catch: java.lang.Throwable -> L47
        L47:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L50
            goto L58
        L50:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L58:
            java.lang.String r1 = "备份原插件目录失败："
            java.lang.String r0 = r1.concat(r0)
            r3.<init>(r0, r2)
            throw r3
    }

    public static void m(java.io.File r2, java.io.File r3) {
            java.io.File r0 = r2.getAbsoluteFile()
            java.io.File r1 = r2.getCanonicalFile()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L5c
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L18
            n(r2, r3)
            return
        L18:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L39
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L39
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L2b
            goto L39
        L2b:
            java.lang.String r2 = r0.getName()
            java.lang.String r3 = "创建恢复目录失败: "
            java.lang.String r2 = wb.en.g(r3, r2)
            ah.a.h(r2)
            return
        L39:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4d
            g4.a.j(r0, r2)     // Catch: java.lang.Throwable -> L4f
            r2.close()     // Catch: java.lang.Throwable -> L4d
            r0.close()
            return
        L4d:
            r2 = move-exception
            goto L56
        L4f:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L51
        L51:
            r1 = move-exception
            ig.a.i(r2, r3)     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L56:
            throw r2     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            ig.a.i(r0, r2)
            throw r3
        L5c:
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "不支持恢复符号链接: "
            java.lang.String r2 = wb.en.g(r3, r2)
            j8.o.q(r2)
            return
    }

    public static void n(java.io.File r4, java.io.File r5) {
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L99
            dg.j r0 = new dg.j
            r1 = 0
            dg.k r2 = dg.k.f2255g
            r0.<init>(r4, r2, r1)
            dg.h r1 = new dg.h
            r1.<init>(r0)
        L13:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            java.io.File r2 = r0.getAbsoluteFile()
            java.io.File r3 = r0.getCanonicalFile()
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L87
            java.io.File r2 = dg.l.i0(r0, r4)
            java.io.File r3 = new java.io.File
            java.lang.String r2 = r2.getPath()
            r3.<init>(r5, r2)
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L5b
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L13
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L4d
            goto L13
        L4d:
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "创建目录失败: "
            java.lang.String r4 = wb.en.g(r5, r4)
            ah.a.h(r4)
            return
        L5b:
            java.io.File r2 = r3.getParentFile()
            if (r2 == 0) goto L64
            r2.mkdirs()
        L64:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L78
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L78
            g4.a.j(r2, r0)     // Catch: java.lang.Throwable -> L7a
            r0.close()     // Catch: java.lang.Throwable -> L78
            r2.close()
            goto L13
        L78:
            r4 = move-exception
            goto L81
        L7a:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L7c
        L7c:
            r5 = move-exception
            ig.a.i(r0, r4)     // Catch: java.lang.Throwable -> L78
            throw r5     // Catch: java.lang.Throwable -> L78
        L81:
            throw r4     // Catch: java.lang.Throwable -> L82
        L82:
            r5 = move-exception
            ig.a.i(r2, r4)
            throw r5
        L87:
            java.lang.String r4 = r0.getName()
            java.lang.String r5 = "不支持符号链接: "
            java.lang.String r4 = wb.en.g(r5, r4)
            j8.o.q(r4)
            return
        L95:
            s(r5)
            return
        L99:
            java.lang.String r4 = r4.getPath()
            java.lang.String r5 = "源目录不存在: "
            java.lang.String r4 = wb.en.g(r5, r4)
            j8.o.q(r4)
            return
    }

    public static void o(java.io.File r2) {
            q(r2)
            java.io.File r0 = Z(r2)
            java.io.File r2 = X(r2)
            java.io.File[] r2 = new java.io.File[]{r0, r2}
            java.util.List r2 = a.a.y0(r2)
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r2.next()
            java.io.File r0 = (java.io.File) r0
            boolean r1 = r0.exists()
            if (r1 == 0) goto L17
            boolean r1 = r0.delete()
            if (r1 == 0) goto L30
            goto L17
        L30:
            java.lang.String r2 = r0.getName()
            java.lang.String r0 = "删除事务标记失败: "
            java.lang.String r2 = wb.en.g(r0, r2)
            ah.a.h(r2)
        L3d:
            return
    }

    public static void p(java.io.File r4) {
            java.io.File r0 = r4.getAbsoluteFile()
            java.io.File r1 = r4.getCanonicalFile()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L3b
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L26
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L26
            int r1 = r0.length
            r2 = 0
        L1c:
            if (r2 >= r1) goto L26
            r3 = r0[r2]
            p(r3)
            int r2 = r2 + 1
            goto L1c
        L26:
            boolean r0 = r4.delete()
            if (r0 == 0) goto L2d
            return
        L2d:
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "删除失败: "
            java.lang.String r4 = wb.en.g(r0, r4)
            ah.a.h(r4)
            return
        L3b:
            java.lang.String r4 = "不支持删除符号链接"
            j8.o.t(r4)
            return
    }

    public static void q(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L9
            p(r1)
        L9:
            return
    }

    public static final java.lang.String r(java.lang.String r2) {
            r2.getClass()
            java.lang.String r0 = E(r2)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1903804409: goto Lb1;
                case -1526776777: goto La5;
                case -1356730971: goto L99;
                case -1121949127: goto L8d;
                case -1113857403: goto L81;
                case -636524068: goto L75;
                case -440298373: goto L69;
                case -146128825: goto L5d;
                case -38568228: goto L51;
                case 450667808: goto L44;
                case 695361430: goto L37;
                case 1068342227: goto L2a;
                case 1648866102: goto L1d;
                case 1675538154: goto L10;
                default: goto Le;
            }
        Le:
            goto Lb9
        L10:
            java.lang.String r1 = "create_directory"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            goto Lb9
        L1a:
            java.lang.String r2 = "创建插件目录"
            return r2
        L1d:
            java.lang.String r1 = "restore_path"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto Lb9
        L27:
            java.lang.String r2 = "恢复插件路径"
            return r2
        L2a:
            java.lang.String r1 = "move_path"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34
            goto Lb9
        L34:
            java.lang.String r2 = "移动插件路径"
            return r2
        L37:
            java.lang.String r1 = "list_files"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto Lb9
        L41:
            java.lang.String r2 = "列出插件文件"
            return r2
        L44:
            java.lang.String r1 = "search_files"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto Lb9
        L4e:
            java.lang.String r2 = "搜索插件文件"
            return r2
        L51:
            java.lang.String r1 = "workspace_status"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            goto Lb9
        L5a:
            java.lang.String r2 = "检查插件变更"
            return r2
        L5d:
            java.lang.String r1 = "delete_plugin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L66
            goto Lb9
        L66:
            java.lang.String r2 = "删除整个插件"
            return r2
        L69:
            java.lang.String r1 = "check_access"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L72
            goto Lb9
        L72:
            java.lang.String r2 = "检查插件文件权限"
            return r2
        L75:
            java.lang.String r1 = "write_file"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7e
            goto Lb9
        L7e:
            java.lang.String r2 = "写入插件文件"
            return r2
        L81:
            java.lang.String r1 = "read_file"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            goto Lb9
        L8a:
            java.lang.String r2 = "读取插件文件"
            return r2
        L8d:
            java.lang.String r1 = "delete_path"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L96
            goto Lb9
        L96:
            java.lang.String r2 = "删除插件路径"
            return r2
        L99:
            java.lang.String r1 = "reset_workspace"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La2
            goto Lb9
        La2:
            java.lang.String r2 = "重置插件工作区"
            return r2
        La5:
            java.lang.String r1 = "apply_patch"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lae
            goto Lb9
        Lae:
            java.lang.String r2 = "修改插件文件"
            return r2
        Lb1:
            java.lang.String r1 = "show_diff"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lba
        Lb9:
            return r2
        Lba:
            java.lang.String r2 = "查看代码差异"
            return r2
    }

    public static void s(java.io.File r7) {
            dg.j r0 = new dg.j
            r1 = 0
            dg.k r2 = dg.k.f2255g
            r0.<init>(r7, r2, r1)
            fb.g0 r7 = new fb.g0
            r1 = 23
            r7.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r0, r2, r7)
            ng.h r7 = new ng.h
            r7.<init>(r1)
            r0 = 0
            r3 = 0
        L1d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r7.next()
            java.io.File r1 = (java.io.File) r1
            int r0 = r0 + r2
            long r5 = r1.length()
            long r3 = r3 + r5
            r1 = 512(0x200, float:7.17E-43)
            if (r0 > r1) goto L41
            r5 = 33554432(0x2000000, double:1.6578092E-316)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L3b
            goto L1d
        L3b:
            java.lang.String r7 = "插件总大小超过 32 MB"
            j8.o.t(r7)
            return
        L41:
            java.lang.String r7 = "插件文件数量超过 512"
            j8.o.t(r7)
        L46:
            return
    }

    public static void t(java.io.File r2, java.io.File r3) {
            N(r2)
            boolean r0 = r3.exists()
            if (r0 == 0) goto Lc
            O(r3)
        Lc:
            java.lang.String r0 = "脚本插件根目录"
            w(r2, r0)
            boolean r2 = r3.isDirectory()
            if (r2 == 0) goto L2c
            java.lang.String r2 = r3.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "插件目录 "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            w(r3, r2)
        L2c:
            return
    }

    public static void u(java.io.File r6) {
            O(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            v(r0, r6)
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L12
            return
        L12:
            r4 = 0
            r5 = 62
            java.lang.String r1 = "；"
            r2 = 0
            r3 = 0
            java.lang.String r6 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "插件文件权限不可用，当前微信进程无法修复："
            java.lang.String r6 = r0.concat(r6)
            ah.a.h(r6)
            return
    }

    public static final void v(java.util.ArrayList r3, java.io.File r4) {
            int r0 = r3.size()
            r1 = 8
            if (r0 < r1) goto La
            goto Lbc
        La:
            java.io.File r0 = r4.getAbsoluteFile()
            java.io.File r1 = r4.getCanonicalFile()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L31
            java.lang.String r4 = r4.getPath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = ": 不支持符号链接"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.add(r4)
            return
        L31:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L88
            boolean r0 = r4.canRead()
            if (r0 == 0) goto L6f
            boolean r0 = r4.canExecute()
            if (r0 != 0) goto L44
            goto L6f
        L44:
            java.io.File[] r0 = r4.listFiles()
            if (r0 != 0) goto L63
            java.lang.String r4 = r4.getPath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = ": 无法列出目录内容"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.add(r4)
            return
        L63:
            int r4 = r0.length
            r1 = 0
        L65:
            if (r1 >= r4) goto Lbc
            r2 = r0[r1]
            v(r3, r2)
            int r1 = r1 + 1
            goto L65
        L6f:
            java.lang.String r4 = r4.getPath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = ": 目录不可读或不可进入"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.add(r4)
            return
        L88:
            boolean r0 = r4.canRead()
            if (r0 == 0) goto La4
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L99
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L99
            r0.close()     // Catch: java.lang.Throwable -> L99
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L99
            goto La0
        L99:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        La0:
            boolean r0 = r0 instanceof sf.f
            if (r0 == 0) goto Lbc
        La4:
            java.lang.String r4 = r4.getPath()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = ": 文件不可读"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.add(r4)
        Lbc:
            return
    }

    public static void w(java.io.File r4, java.lang.String r5) {
            N(r4)
            fb.o2 r0 = H(r4)
            boolean r1 = r0.f3692a
            if (r1 != 0) goto L59
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L14
            android.system.StructStat r4 = android.system.Os.stat(r4)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r4 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r4)
            r4 = r1
        L1b:
            boolean r1 = r4 instanceof sf.f
            if (r1 == 0) goto L21
            r4 = 0
        L21:
            android.system.StructStat r4 = (android.system.StructStat) r4
            if (r4 == 0) goto L32
            int r1 = r4.st_uid
            int r4 = r4.st_gid
            java.lang.String r2 = "uid="
            java.lang.String r3 = ", gid="
            java.lang.String r4 = p.a.j(r1, r2, r3, r4)
            goto L34
        L32:
            java.lang.String r4 = "无法读取所有者"
        L34:
            int r1 = android.os.Process.myUid()
            java.lang.String r0 = r0.f3693b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r5 = " 不可写，当前微信进程 uid="
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = "，"
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = eh.a.r(r2, r5, r0)
            ah.a.h(r4)
        L59:
            return
    }

    public static java.lang.String x(java.io.File r21, java.io.File r22, java.lang.String r23) {
            r0 = r23
            r1 = 1
            java.lang.String r2 = " b/"
            java.lang.String r3 = "diff --git a/"
            if (r21 == 0) goto L10
            boolean r4 = r21.isDirectory()
            if (r4 != r1) goto L10
            goto L18
        L10:
            if (r22 == 0) goto L46
            boolean r4 = r22.isDirectory()
            if (r4 != r1) goto L46
        L18:
            if (r21 != 0) goto L28
            java.lang.String r1 = "\nnew directory "
            java.lang.StringBuilder r1 = bc.e.p(r3, r0, r2, r0, r1)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L28:
            if (r22 != 0) goto L38
            java.lang.String r1 = "\ndeleted directory "
            java.lang.StringBuilder r1 = bc.e.p(r3, r0, r2, r0, r1)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L38:
            java.lang.String r1 = "\npath type changed "
            java.lang.StringBuilder r1 = bc.e.p(r3, r0, r2, r0, r1)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L46:
            if (r21 == 0) goto L4d
            java.lang.String r5 = L(r21)
            goto L4e
        L4d:
            r5 = 0
        L4e:
            if (r22 == 0) goto L55
            java.lang.String r6 = L(r22)
            goto L56
        L55:
            r6 = 0
        L56:
            if (r21 == 0) goto L5a
            if (r5 == 0) goto L5e
        L5a:
            if (r22 == 0) goto L65
            if (r6 != 0) goto L65
        L5e:
            java.lang.String r1 = "\nBinary files differ"
            java.lang.String r0 = bc.e.k(r3, r0, r2, r0, r1)
            return r0
        L65:
            r0.getClass()
            java.lang.String r7 = ""
            if (r5 != 0) goto L6e
            r8 = r7
            goto L6f
        L6e:
            r8 = r5
        L6f:
            java.util.List r8 = x6.d.J(r8)
            if (r6 != 0) goto L76
            goto L77
        L76:
            r7 = r6
        L77:
            java.util.List r7 = x6.d.J(r7)
            r10 = 0
        L7c:
            int r11 = r8.size()
            if (r10 >= r11) goto L99
            int r11 = r7.size()
            if (r10 >= r11) goto L99
            java.lang.Object r11 = r8.get(r10)
            java.lang.Object r12 = r7.get(r10)
            boolean r11 = gg.l.a(r11, r12)
            if (r11 == 0) goto L99
            int r10 = r10 + 1
            goto L7c
        L99:
            r11 = 0
        L9a:
            int r12 = r8.size()
            int r12 = r12 - r10
            if (r11 >= r12) goto Lc5
            int r12 = r7.size()
            int r12 = r12 - r10
            if (r11 >= r12) goto Lc5
            int r12 = r8.size()
            int r12 = r12 - r1
            int r12 = r12 - r11
            java.lang.Object r12 = r8.get(r12)
            int r13 = r7.size()
            int r13 = r13 - r1
            int r13 = r13 - r11
            java.lang.Object r13 = r7.get(r13)
            boolean r12 = gg.l.a(r12, r13)
            if (r12 == 0) goto Lc5
            int r11 = r11 + 1
            goto L9a
        Lc5:
            int r12 = r8.size()
            int r12 = r12 - r11
            java.util.List r12 = r8.subList(r10, r12)
            int r13 = r7.size()
            int r13 = r13 - r11
            java.util.List r13 = r7.subList(r10, r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = r8.size()
            int r7 = r7.size()
            int r7 = r7 + r15
            r14.<init>(r7)
            java.util.List r7 = tf.m.L1(r10, r8)
            java.util.Iterator r7 = r7.iterator()
        Led:
            boolean r10 = r7.hasNext()
            fb.u1 r15 = fb.u1.f3815g
            if (r10 == 0) goto L106
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            r16 = 0
            fb.v1 r4 = new fb.v1
            r4.<init>(r15, r10)
            r14.add(r4)
            goto Led
        L106:
            r16 = 0
            int r4 = r12.size()
            long r9 = (long) r4
            int r4 = r13.size()
            r7 = r1
            r17 = r2
            long r1 = (long) r4
            long r9 = r9 * r1
            r1 = 2000000(0x1e8480, double:9.881313E-318)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            fb.u1 r2 = fb.u1.f3816h
            fb.u1 r4 = fb.u1.f3817i
            if (r1 > 0) goto L211
            int r1 = r12.size()
            int r1 = r1 + r7
            int[][] r9 = new int[r1][]
            r10 = 0
        L129:
            if (r10 >= r1) goto L13c
            int r18 = r13.size()
            r22 = r7
            int r7 = r18 + 1
            int[] r7 = new int[r7]
            r9[r10] = r7
            int r10 = r10 + 1
            r7 = r22
            goto L129
        L13c:
            r22 = r7
            int r1 = r12.size()
            int r1 = r1 + (-1)
        L144:
            r7 = -1
            if (r7 < r1) goto L1cc
            r1 = 0
            r7 = 0
        L149:
            int r10 = r12.size()
            if (r1 < r10) goto L15a
            int r10 = r13.size()
            if (r7 >= r10) goto L156
            goto L15a
        L156:
            r18 = r5
            goto L247
        L15a:
            int r10 = r12.size()
            if (r1 >= r10) goto L189
            int r10 = r13.size()
            if (r7 >= r10) goto L189
            java.lang.Object r10 = r12.get(r1)
            r18 = r5
            java.lang.Object r5 = r13.get(r7)
            boolean r5 = gg.l.a(r10, r5)
            if (r5 == 0) goto L18b
            fb.v1 r5 = new fb.v1
            java.lang.Object r10 = r12.get(r1)
            java.lang.String r10 = (java.lang.String) r10
            r5.<init>(r15, r10)
            r14.add(r5)
            int r1 = r1 + 1
            int r7 = r7 + 1
            goto L1c8
        L189:
            r18 = r5
        L18b:
            int r5 = r13.size()
            if (r7 >= r5) goto L1b7
            int r5 = r12.size()
            if (r1 >= r5) goto L1a5
            r5 = r9[r1]
            int r10 = r7 + 1
            r5 = r5[r10]
            int r10 = r1 + 1
            r10 = r9[r10]
            r10 = r10[r7]
            if (r5 <= r10) goto L1b7
        L1a5:
            fb.v1 r5 = new fb.v1
            int r10 = r7 + 1
            java.lang.Object r7 = r13.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r5.<init>(r4, r7)
            r14.add(r5)
            r7 = r10
            goto L1c8
        L1b7:
            fb.v1 r5 = new fb.v1
            int r10 = r1 + 1
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r2, r1)
            r14.add(r5)
            r1 = r10
        L1c8:
            r5 = r18
            goto L149
        L1cc:
            r18 = r5
            int r5 = r13.size()
            int r5 = r5 + (-1)
        L1d4:
            if (r7 < r5) goto L1dc
            int r1 = r1 + (-1)
            r5 = r18
            goto L144
        L1dc:
            r10 = r9[r1]
            java.lang.Object r7 = r12.get(r1)
            r19 = r1
            java.lang.Object r1 = r13.get(r5)
            boolean r1 = gg.l.a(r7, r1)
            if (r1 == 0) goto L1f9
            int r1 = r19 + 1
            r1 = r9[r1]
            int r7 = r5 + 1
            r1 = r1[r7]
            int r1 = r1 + 1
            goto L209
        L1f9:
            int r1 = r19 + 1
            r1 = r9[r1]
            r1 = r1[r5]
            r7 = r9[r19]
            int r20 = r5 + 1
            r7 = r7[r20]
            int r1 = java.lang.Math.max(r1, r7)
        L209:
            r10[r5] = r1
            int r5 = r5 + (-1)
            r1 = r19
            r7 = -1
            goto L1d4
        L211:
            r18 = r5
            r22 = r7
            java.util.Iterator r1 = r12.iterator()
        L219:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L22e
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            fb.v1 r7 = new fb.v1
            r7.<init>(r2, r5)
            r14.add(r7)
            goto L219
        L22e:
            java.util.Iterator r1 = r13.iterator()
        L232:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L247
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            fb.v1 r7 = new fb.v1
            r7.<init>(r4, r5)
            r14.add(r7)
            goto L232
        L247:
            if (r11 <= 0) goto L266
            java.util.List r1 = tf.m.M1(r11, r8)
            java.util.Iterator r1 = r1.iterator()
        L251:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L266
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            fb.v1 r7 = new fb.v1
            r7.<init>(r15, r5)
            r14.add(r7)
            goto L251
        L266:
            lg.d r1 = a.a.X(r14)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L273:
            r7 = r1
            lg.c r7 = (lg.c) r7
            boolean r8 = r7.f8047i
            if (r8 == 0) goto L293
            java.lang.Object r7 = r7.next()
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r8 = r14.get(r8)
            fb.v1 r8 = (fb.v1) r8
            fb.u1 r8 = r8.f3836a
            if (r8 == r15) goto L273
            r5.add(r7)
            goto L273
        L293:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L2aa
            java.lang.String r1 = "\n--- a/"
            r7 = r17
            java.lang.StringBuilder r1 = bc.e.p(r3, r0, r7, r0, r1)
            java.lang.String r2 = "\n+++ b/"
            java.lang.String r3 = "\nFile bytes changed without line-level text changes"
            java.lang.String r0 = j8.b.k(r1, r0, r2, r0, r3)
            return r0
        L2aa:
            r7 = r17
            int r1 = r14.size()
            int r1 = r1 + 1
            int[] r1 = new int[r1]
            int r8 = r14.size()
            int r8 = r8 + 1
            int[] r8 = new int[r8]
            java.util.Iterator r9 = r14.iterator()
            r10 = r22
            r11 = r10
            r12 = 0
        L2c4:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L2e9
            java.lang.Object r13 = r9.next()
            int r17 = r12 + 1
            if (r12 < 0) goto L2e5
            fb.v1 r13 = (fb.v1) r13
            r1[r12] = r10
            r8[r12] = r11
            fb.u1 r12 = r13.f3836a
            if (r12 == r4) goto L2de
            int r10 = r10 + 1
        L2de:
            if (r12 == r2) goto L2e2
            int r11 = r11 + 1
        L2e2:
            r12 = r17
            goto L2c4
        L2e5:
            a.a.Q0()
            throw r16
        L2e9:
            int r9 = r14.size()
            r1[r9] = r10
            int r9 = r14.size()
            r8[r9] = r11
            java.lang.String r9 = "\n--- "
            java.lang.StringBuilder r3 = bc.e.p(r3, r0, r7, r0, r9)
            java.lang.String r7 = "/dev/null"
            if (r18 != 0) goto L301
            r9 = r7
            goto L307
        L301:
            java.lang.String r9 = "a/"
            java.lang.String r9 = r9.concat(r0)
        L307:
            r3.append(r9)
            java.lang.String r9 = "\n+++ "
            r3.append(r9)
            if (r6 != 0) goto L312
            goto L318
        L312:
            java.lang.String r6 = "b/"
            java.lang.String r7 = r6.concat(r0)
        L318:
            r3.append(r7)
            r0 = 10
            r3.append(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r7 = tf.m.t1(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            int r9 = r7.intValue()
            r7 = r22
            java.util.List r5 = tf.m.q1(r7, r5)
            java.util.Iterator r5 = r5.iterator()
            r10 = r9
        L33a:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L390
            java.lang.Object r11 = r5.next()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            int r12 = r10 + 1
            java.util.List r12 = r14.subList(r12, r11)
            if (r12 == 0) goto L35a
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L35a
            r13 = 0
            goto L37a
        L35a:
            java.util.Iterator r12 = r12.iterator()
            r13 = 0
        L35f:
            boolean r17 = r12.hasNext()
            if (r17 == 0) goto L37a
            java.lang.Object r17 = r12.next()
            r7 = r17
            fb.v1 r7 = (fb.v1) r7
            fb.u1 r7 = r7.f3836a
            if (r7 != r15) goto L35f
            int r13 = r13 + 1
            if (r13 < 0) goto L376
            goto L35f
        L376:
            a.a.P0()
            throw r16
        L37a:
            r7 = 6
            if (r13 <= r7) goto L38e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            sf.e r10 = new sf.e
            r10.<init>(r7, r9)
            r6.add(r10)
            r9 = r11
        L38e:
            r10 = r11
            goto L33a
        L390:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            sf.e r9 = new sf.e
            r9.<init>(r5, r7)
            r6.add(r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = tf.n.e1(r6)
            r5.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L3ad:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L403
            java.lang.Object r7 = r6.next()
            sf.e r7 = (sf.e) r7
            java.lang.Object r9 = r7.f12418g
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r7 = r7.f12419h
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r10 = 0
        L3ca:
            r11 = 3
            if (r10 >= r11) goto L3e0
            if (r9 <= 0) goto L3dd
            int r11 = r9 + (-1)
            java.lang.Object r11 = r14.get(r11)
            fb.v1 r11 = (fb.v1) r11
            fb.u1 r11 = r11.f3836a
            if (r11 != r15) goto L3dd
            int r9 = r9 + (-1)
        L3dd:
            int r10 = r10 + 1
            goto L3ca
        L3e0:
            r10 = 0
        L3e1:
            if (r10 >= r11) goto L3f9
            int r12 = r7 + 1
            int r13 = r14.size()
            if (r12 >= r13) goto L3f6
            java.lang.Object r13 = r14.get(r12)
            fb.v1 r13 = (fb.v1) r13
            fb.u1 r13 = r13.f3836a
            if (r13 != r15) goto L3f6
            r7 = r12
        L3f6:
            int r10 = r10 + 1
            goto L3e1
        L3f9:
            lg.d r10 = new lg.d
            r11 = 1
            r10.<init>(r9, r7, r11)
            r5.add(r10)
            goto L3ad
        L403:
            r11 = 1
            java.util.Iterator r5 = r5.iterator()
        L408:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4d4
            java.lang.Object r6 = r5.next()
            lg.d r6 = (lg.d) r6
            int r9 = r6.f8042g
            int r6 = r6.f8043h
            int r6 = r6 + r11
            java.util.List r6 = r14.subList(r9, r6)
            if (r6 == 0) goto L427
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L427
            r11 = 0
            goto L44a
        L427:
            java.util.Iterator r10 = r6.iterator()
            r11 = 0
        L42c:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L44a
            java.lang.Object r12 = r10.next()
            fb.v1 r12 = (fb.v1) r12
            fb.u1 r12 = r12.f3836a
            if (r12 == r4) goto L43e
            r12 = 1
            goto L43f
        L43e:
            r12 = 0
        L43f:
            if (r12 == 0) goto L42c
            int r11 = r11 + 1
            if (r11 < 0) goto L446
            goto L42c
        L446:
            a.a.P0()
            throw r16
        L44a:
            if (r6 == 0) goto L454
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L454
            r12 = 0
            goto L477
        L454:
            java.util.Iterator r10 = r6.iterator()
            r12 = 0
        L459:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L477
            java.lang.Object r13 = r10.next()
            fb.v1 r13 = (fb.v1) r13
            fb.u1 r13 = r13.f3836a
            if (r13 == r2) goto L46b
            r13 = 1
            goto L46c
        L46b:
            r13 = 0
        L46c:
            if (r13 == 0) goto L459
            int r12 = r12 + 1
            if (r12 < 0) goto L473
            goto L459
        L473:
            a.a.P0()
            throw r16
        L477:
            java.lang.String r10 = "@@ -"
            r3.append(r10)
            r10 = r1[r9]
            java.lang.String r10 = x6.d.W(r10, r11)
            r3.append(r10)
            java.lang.String r10 = " +"
            r3.append(r10)
            r9 = r8[r9]
            java.lang.String r9 = x6.d.W(r9, r12)
            r3.append(r9)
            java.lang.String r9 = " @@\n"
            r3.append(r9)
            java.util.Iterator r6 = r6.iterator()
        L49c:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L4d0
            java.lang.Object r9 = r6.next()
            fb.v1 r9 = (fb.v1) r9
            fb.u1 r10 = r9.f3836a
            int r10 = r10.ordinal()
            if (r10 == 0) goto L4c1
            r7 = 1
            if (r10 == r7) goto L4be
            r11 = 2
            if (r10 != r11) goto L4b9
            r10 = 43
            goto L4c4
        L4b9:
            okio.a.k()
            r0 = 0
            return r0
        L4be:
            r10 = 45
            goto L4c4
        L4c1:
            r7 = 1
            r10 = 32
        L4c4:
            r3.append(r10)
            java.lang.String r9 = r9.f3837b
            r3.append(r9)
            r3.append(r0)
            goto L49c
        L4d0:
            r7 = 1
            r11 = r7
            goto L408
        L4d4:
            java.lang.String r0 = r3.toString()
            java.lang.CharSequence r0 = og.m.T0(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String y(java.io.File r4) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r4)
            r4 = 32768(0x8000, float:4.5918E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L31
        L10:
            int r2 = r1.read(r4)     // Catch: java.lang.Throwable -> L31
            if (r2 > 0) goto L2c
            r1.close()
            byte[] r4 = r0.digest()
            r4.getClass()
            fb.g0 r0 = new fb.g0
            r1 = 24
            r0.<init>(r1)
            java.lang.String r4 = tf.l.E0(r4, r0)
            return r4
        L2c:
            r3 = 0
            r0.update(r4, r3, r2)     // Catch: java.lang.Throwable -> L31
            goto L10
        L31:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L33
        L33:
            r0 = move-exception
            ig.a.i(r1, r4)
            throw r0
    }

    public static boolean z(java.io.File r2) {
            java.io.File r0 = Z(r2)
            java.lang.String r0 = Y(r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = "[0-9a-f]{64}"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L1e
            goto L44
        L1e:
            java.util.Map r2 = S(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = a0(r2)     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r2 instanceof sf.f
            if (r1 == 0) goto L3d
            r2 = r0
        L3d:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L44:
            r2 = 0
            return r2
    }
}
