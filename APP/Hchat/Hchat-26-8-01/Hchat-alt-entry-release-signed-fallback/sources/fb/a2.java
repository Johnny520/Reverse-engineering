package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final og.k f3397a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final og.k f3398b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.List f3399c = null;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "[\\\\/:*?\"<>|\\u0000-\\u001f]"
            r0.<init>(r1)
            fb.a2.f3397a = r0
            og.k r0 = new og.k
            java.lang.String r1 = "(?:new\\s+File|FileOutputStream|FileWriter|RandomAccessFile|Paths\\.get)\\s*\\(\\s*[\\\"'](?:/|[A-Za-z]:[\\\\/]|[^\\\"']*\\.\\.[\\\\/])"
            r0.<init>(r1)
            fb.a2.f3398b = r0
            og.k r0 = new og.k
            java.lang.String r1 = "Runtime\\.getRuntime\\(\\)\\.exec|ProcessBuilder"
            r0.<init>(r1)
            sf.e r2 = new sf.e
            java.lang.String r1 = "包含执行系统进程的代码，保存前请确认来源和用途"
            r2.<init>(r0, r1)
            og.k r0 = new og.k
            java.lang.String r1 = "ClassLoader|DexClassLoader|createPackageContext"
            r0.<init>(r1)
            sf.e r3 = new sf.e
            java.lang.String r1 = "包含 ClassLoader 或跨包加载代码，保存前请确认来源和用途"
            r3.<init>(r0, r1)
            og.k r0 = new og.k
            java.lang.String r1 = "System\\.load(?:Library)?|\\bloadSo\\s*\\("
            r0.<init>(r1)
            sf.e r4 = new sf.e
            java.lang.String r1 = "包含Native库加载代码，保存前请确认来源和用途"
            r4.<init>(r0, r1)
            og.k r0 = new og.k
            java.lang.String r1 = "java\\.lang\\.reflect|XposedBridge|XposedHelpers|hookBefore|hookAfter|hookReplace"
            r0.<init>(r1)
            sf.e r5 = new sf.e
            java.lang.String r1 = "包含反射或 Hook 代码，保存前请确认来源和用途"
            r5.<init>(r0, r1)
            og.k r0 = new og.k
            java.lang.String r1 = "\\.delete\\s*\\("
            r0.<init>(r1)
            sf.e r6 = new sf.e
            java.lang.String r1 = "包含删除文件的代码，保存前请确认来源和用途"
            r6.<init>(r0, r1)
            og.k r0 = new og.k
            java.lang.String r1 = "OkHttpClient|new\\s+URL\\s*\\(|Socket|https?://|\\b(?:get|post|download)\\s*\\(\\s*\"https?://"
            r0.<init>(r1)
            sf.e r7 = new sf.e
            java.lang.String r1 = "包含网络访问代码，保存前请确认请求目标和数据范围"
            r7.<init>(r0, r1)
            sf.e[] r0 = new sf.e[]{r2, r3, r4, r5, r6, r7}
            java.util.List r0 = a.a.y0(r0)
            fb.a2.f3399c = r0
            return
    }

    public static java.lang.String a(java.lang.String r4) {
            java.lang.String r4 = p.a.l(r4, r4)
            java.lang.String r0 = "```"
            r1 = 0
            boolean r2 = og.t.d0(r4, r0, r1)
            if (r2 == 0) goto L15
            r2 = 10
            java.lang.String r3 = ""
            java.lang.String r4 = og.m.J0(r4, r2, r3)
        L15:
            boolean r0 = og.t.W(r4, r0, r1)
            if (r0 == 0) goto L28
            r0 = 3
            java.lang.String r4 = og.m.k0(r0, r4)
            java.lang.CharSequence r4 = og.m.T0(r4)
            java.lang.String r4 = r4.toString()
        L28:
            return r4
    }

    public static boolean b(java.lang.String r16) {
            r0 = r16
            r6 = 0
            r7 = 0
            r1 = r6
            r8 = r1
            r9 = r8
            r11 = r9
            r12 = r11
            r10 = r7
        La:
            int r2 = r0.length()
            if (r1 >= r2) goto Lc3
            char r2 = r0.charAt(r1)
            int r13 = r1 + 1
            java.lang.Character r3 = og.m.n0(r0, r13)
            if (r8 == 0) goto L23
            r1 = 10
            if (r2 != r1) goto L21
            r8 = r6
        L21:
            r1 = r13
            goto La
        L23:
            r4 = 42
            r5 = 47
            if (r9 == 0) goto L38
            if (r2 != r4) goto L21
            if (r3 != 0) goto L2e
            goto L21
        L2e:
            char r2 = r3.charValue()
            if (r2 != r5) goto L21
            int r1 = r1 + 2
            r9 = r6
            goto La
        L38:
            r14 = 1
            if (r10 == 0) goto L4d
            if (r11 == 0) goto L3f
            r11 = r6
            goto L21
        L3f:
            r1 = 92
            if (r2 != r1) goto L45
            r11 = r14
            goto L21
        L45:
            char r1 = r10.charValue()
            if (r2 != r1) goto L21
            r10 = r7
            goto L21
        L4d:
            if (r2 != r5) goto L5c
            if (r3 != 0) goto L52
            goto L5c
        L52:
            char r15 = r3.charValue()
            if (r15 != r5) goto L5c
            int r1 = r1 + 2
            r8 = r14
            goto La
        L5c:
            if (r2 != r5) goto L6b
            if (r3 != 0) goto L61
            goto L6b
        L61:
            char r3 = r3.charValue()
            if (r3 != r4) goto L6b
            int r1 = r1 + 2
            r9 = r14
            goto La
        L6b:
            r3 = 34
            if (r2 == r3) goto Lbd
            r3 = 39
            if (r2 == r3) goto Lbd
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 != r3) goto L7a
            int r12 = r12 + 1
            goto L21
        L7a:
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 != r3) goto L81
            int r12 = r12 + (-1)
            goto L21
        L81:
            if (r12 != 0) goto L21
            r4 = 6
            r5 = 0
            java.lang.String r2 = "native"
            r3 = 0
            boolean r2 = og.t.Y(r0, r1, r2, r3, r4, r5)
            if (r2 == 0) goto L21
            int r2 = r1 + (-1)
            java.lang.Character r2 = og.m.n0(r0, r2)
            int r1 = r1 + 6
            java.lang.Character r1 = og.m.n0(r0, r1)
            if (r2 == 0) goto La8
            char r2 = r2.charValue()
            boolean r2 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r2 != r14) goto La8
            r2 = r14
            goto La9
        La8:
            r2 = r6
        La9:
            if (r1 == 0) goto Lb7
            char r1 = r1.charValue()
            boolean r1 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r1 != r14) goto Lb7
            r1 = r14
            goto Lb8
        Lb7:
            r1 = r6
        Lb8:
            if (r2 != 0) goto L21
            if (r1 != 0) goto L21
            return r14
        Lbd:
            java.lang.Character r10 = java.lang.Character.valueOf(r2)
            goto L21
        Lc3:
            return r6
    }

    public static fb.y c(fb.y r9) {
            java.lang.String r0 = r9.f3854c
            java.lang.String r0 = a(r0)
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            java.io.StringReader r2 = new java.io.StringReader     // Catch: java.lang.Throwable -> L13
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L13
            r1.load(r2)     // Catch: java.lang.Throwable -> L13
        L13:
            java.lang.String r2 = r9.f3852a
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L2e
            java.lang.String r2 = "name"
            java.lang.String r1 = r1.getProperty(r2)
            if (r1 != 0) goto L2d
            java.lang.String r1 = ""
        L2d:
            r2 = r1
        L2e:
            r4 = r2
            java.lang.String r1 = r9.f3853b
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L38
            r1 = r4
        L38:
            java.lang.String r5 = e(r1)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = r9.f3855d
            java.lang.String r0 = a(r0)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r7 = r0.toString()
            java.lang.String r9 = r9.f3856e
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r8 = r9.toString()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            fb.y r3 = new fb.y
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }

    public static java.util.ArrayList d(java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = fb.a2.f3399c
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            sf.e r2 = (sf.e) r2
            java.lang.Object r3 = r2.f12418g
            og.k r3 = (og.k) r3
            java.lang.Object r2 = r2.f12419h
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r3.a(r6)
            if (r3 == 0) goto L2e
            fb.a0 r3 = new fb.a0
            fb.b0 r4 = fb.b0.f3403h
            r5 = 1
            r3.<init>(r4, r2, r5)
            goto L2f
        L2e:
            r3 = 0
        L2f:
            if (r3 == 0) goto Lb
            r0.add(r3)
            goto Lb
        L35:
            return r0
    }

    public static java.lang.String e(java.lang.String r2) {
            java.lang.String r2 = p.a.l(r2, r2)
            og.k r0 = fb.a2.f3397a
            java.lang.String r1 = "_"
            java.lang.String r2 = r0.f(r2, r1)
            java.lang.String r0 = "\\s+"
            java.lang.String r2 = j8.b.h(r0, r2, r1)
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [46, 32} // fill-array
            java.lang.String r2 = og.m.S0(r2, r0)
            r0 = 64
            java.lang.String r2 = og.m.P0(r0, r2)
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L2a
            java.lang.String r2 = "ai_plugin"
        L2a:
            return r2
    }

    public static fb.z1 f(fb.y r17) {
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = r0.f3853b
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r0.f3855d
            java.lang.String r0 = r0.f3854c
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            java.io.StringReader r5 = new java.io.StringReader     // Catch: java.lang.Throwable -> L22
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r4.load(r5)     // Catch: java.lang.Throwable -> L22
        L22:
            boolean r0 = og.m.t0(r2)
            fb.b0 r5 = fb.b0.f3402g
            java.lang.String r6 = ".."
            r7 = 0
            if (r0 != 0) goto L3b
            java.lang.String r0 = "."
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3b
            boolean r0 = r2.equals(r6)
            if (r0 == 0) goto L45
        L3b:
            fb.a0 r0 = new fb.a0
            java.lang.String r8 = "插件目录名不能为空"
            r0.<init>(r5, r8, r7)
            r1.add(r0)
        L45:
            java.lang.String r0 = e(r2)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L59
            fb.a0 r0 = new fb.a0
            java.lang.String r8 = "插件目录名包含路径或文件名不允许的字符"
            r0.<init>(r5, r8, r7)
            r1.add(r0)
        L59:
            boolean r0 = og.m.h0(r2, r6, r7)
            if (r0 == 0) goto L69
            fb.a0 r0 = new fb.a0
            java.lang.String r2 = "插件目录名不能包含 .."
            r0.<init>(r5, r2, r7)
            r1.add(r0)
        L69:
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L79
            fb.a0 r0 = new fb.a0
            java.lang.String r2 = "main.java 不能为空"
            r0.<init>(r5, r2, r7)
            r1.add(r0)
        L79:
            java.lang.String r0 = "version"
            java.lang.String r2 = "author"
            java.lang.String r6 = "name"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r2}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        L8b:
            boolean r2 = r0.hasNext()
            java.lang.String r6 = ""
            if (r2 == 0) goto Lbe
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r8 = r4.getProperty(r2)
            if (r8 != 0) goto La0
            goto La1
        La0:
            r6 = r8
        La1:
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            boolean r6 = og.m.t0(r6)
            if (r6 == 0) goto L8b
            fb.a0 r6 = new fb.a0
            java.lang.String r8 = "info.prop 缺少 "
            java.lang.String r2 = wb.en.g(r8, r2)
            r6.<init>(r5, r2, r7)
            r1.add(r6)
            goto L8b
        Lbe:
            java.lang.String r0 = "process"
            java.lang.String r0 = r4.getProperty(r0)
            if (r0 != 0) goto Lc7
            goto Lc8
        Lc7:
            r6 = r0
        Lc8:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r6.toLowerCase(r0)
            r0.getClass()
            java.lang.String r2 = "[,;|\\s]+"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r2.getClass()
            og.m.D0(r7)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r4 = r2.find()
            r6 = 10
            if (r4 != 0) goto Lf2
            java.lang.String r0 = r0.toString()
            java.util.List r0 = a.a.x0(r0)
            goto L121
        Lf2:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r6)
            r8 = r7
        Lf8:
            int r9 = r2.start()
            java.lang.CharSequence r8 = r0.subSequence(r8, r9)
            java.lang.String r8 = r8.toString()
            r4.add(r8)
            int r8 = r2.end()
            boolean r9 = r2.find()
            if (r9 != 0) goto Lf8
            int r2 = r0.length()
            java.lang.CharSequence r0 = r0.subSequence(r8, r2)
            java.lang.String r0 = r0.toString()
            r4.add(r0)
            r0 = r4
        L121:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L12a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L141
            java.lang.Object r4 = r0.next()
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = og.m.t0(r8)
            if (r8 != 0) goto L12a
            r2.add(r4)
            goto L12a
        L141:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L14a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L174
            java.lang.Object r4 = r2.next()
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "main"
            boolean r9 = gg.l.a(r8, r9)
            if (r9 != 0) goto L14a
            java.lang.String r9 = "appbrand"
            boolean r9 = gg.l.a(r8, r9)
            if (r9 != 0) goto L14a
            java.lang.String r9 = "all"
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L170
            goto L14a
        L170:
            r0.add(r4)
            goto L14a
        L174:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L184
            fb.a0 r0 = new fb.a0
            java.lang.String r2 = "info.prop 的 process 只支持 main、appbrand 或 all"
            r0.<init>(r5, r2, r7)
            r1.add(r0)
        L184:
            java.lang.String r0 = "```"
            boolean r0 = og.m.h0(r3, r0, r7)
            if (r0 == 0) goto L196
            fb.a0 r0 = new fb.a0
            java.lang.String r2 = "main.java 仍包含 Markdown 代码围栏"
            r0.<init>(r5, r2, r7)
            r1.add(r0)
        L196:
            r2 = r7
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
            r4 = 0
        L19c:
            int r12 = r3.length()
            if (r2 >= r12) goto L221
            char r12 = r3.charAt(r2)
            int r13 = r2 + 1
            java.lang.Character r14 = og.m.n0(r3, r13)
            if (r8 == 0) goto L1b3
            if (r12 != r6) goto L1b1
            r8 = r7
        L1b1:
            r2 = r13
            goto L19c
        L1b3:
            r15 = 42
            r0 = 47
            if (r9 == 0) goto L1c8
            if (r12 != r15) goto L1b1
            if (r14 != 0) goto L1be
            goto L1b1
        L1be:
            char r12 = r14.charValue()
            if (r12 != r0) goto L1b1
            int r2 = r2 + 2
            r9 = r7
            goto L19c
        L1c8:
            r16 = 1
            if (r4 == 0) goto L1df
            if (r11 == 0) goto L1d0
            r11 = r7
            goto L1b1
        L1d0:
            r0 = 92
            if (r12 != r0) goto L1d7
            r11 = r16
            goto L1b1
        L1d7:
            char r0 = r4.charValue()
            if (r12 != r0) goto L1b1
            r4 = 0
            goto L1b1
        L1df:
            if (r12 != r0) goto L1f1
            if (r14 != 0) goto L1e4
            goto L1f1
        L1e4:
            char r6 = r14.charValue()
            if (r6 != r0) goto L1f1
            int r2 = r2 + 2
            r8 = r16
        L1ee:
            r6 = 10
            goto L19c
        L1f1:
            if (r12 != r0) goto L201
            if (r14 != 0) goto L1f6
            goto L201
        L1f6:
            char r0 = r14.charValue()
            if (r0 != r15) goto L201
            int r2 = r2 + 2
            r9 = r16
            goto L1ee
        L201:
            r0 = 34
            if (r12 == r0) goto L21a
            r0 = 39
            if (r12 != r0) goto L20a
            goto L21a
        L20a:
            r0 = 123(0x7b, float:1.72E-43)
            if (r12 != r0) goto L211
            int r10 = r10 + 1
            goto L21f
        L211:
            r0 = 125(0x7d, float:1.75E-43)
            if (r12 != r0) goto L21f
            int r10 = r10 + (-1)
            if (r10 >= 0) goto L21f
            goto L228
        L21a:
            java.lang.Character r0 = java.lang.Character.valueOf(r12)
            r4 = r0
        L21f:
            r2 = r13
            goto L1ee
        L221:
            if (r4 != 0) goto L228
            if (r9 != 0) goto L228
            if (r10 != 0) goto L228
            goto L232
        L228:
            fb.a0 r0 = new fb.a0
            java.lang.String r2 = "main.java 的大括号不平衡"
            r0.<init>(r5, r2, r7)
            r1.add(r0)
        L232:
            boolean r0 = b(r3)
            if (r0 == 0) goto L242
            fb.a0 r0 = new fb.a0
            java.lang.String r2 = "BeanShell 顶层 native 方法无法绑定 JNI，请把 native 声明放进类并将该类的 ClassLoader 传给 loadSo"
            r0.<init>(r5, r2, r7)
            r1.add(r0)
        L242:
            og.k r0 = fb.a2.f3398b
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L254
            fb.a0 r0 = new fb.a0
            java.lang.String r2 = "代码包含绝对路径或 .. 路径，请改用 pluginDir、pluginDirFile 或 cacheDir"
            r0.<init>(r5, r2, r7)
            r1.add(r0)
        L254:
            java.lang.String r15 = "onNewFriend"
            java.lang.String r16 = "onProtobufPacket"
            java.lang.String r8 = "onLoad"
            java.lang.String r9 = "onUnload"
            java.lang.String r10 = "openSettings"
            java.lang.String r11 = "onClickSendBtn"
            java.lang.String r12 = "onHandleMsg"
            java.lang.String r13 = "onImageDownload"
            java.lang.String r14 = "onMemberChange"
            java.lang.String[] r0 = new java.lang.String[]{r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        L272:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d5
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "\\b"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r6 = "\\s*\\("
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            r4.getClass()
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r4 = r4.find()
            if (r4 == 0) goto L272
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r5 = "\\s*\\([^)]*\\)\\s*\\{"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            r4.getClass()
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r4 = r4.find()
            if (r4 != 0) goto L272
            fb.a0 r4 = new fb.a0
            java.lang.String r5 = " 的定义看起来不完整，请确认回调签名和大括号"
            java.lang.String r2 = bc.e.i(r2, r5)
            fb.b0 r5 = fb.b0.f3403h
            r4.<init>(r5, r2, r7)
            r1.add(r4)
            goto L272
        L2d5:
            java.util.ArrayList r0 = d(r3)
            tf.r.h1(r1, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2ea:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30a
            java.lang.Object r3 = r1.next()
            r4 = r3
            fb.a0 r4 = (fb.a0) r4
            fb.b0 r5 = r4.f3391a
            java.lang.String r4 = r4.f3392b
            sf.e r6 = new sf.e
            r6.<init>(r5, r4)
            boolean r4 = r0.add(r6)
            if (r4 == 0) goto L2ea
            r2.add(r3)
            goto L2ea
        L30a:
            fb.z1 r0 = new fb.z1
            r0.<init>(r2)
            return r0
    }
}
