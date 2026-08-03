package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Set f4440a = null;

    static {
            java.lang.String r0 = "info.prop"
            java.lang.String r1 = "README.md"
            java.lang.String r2 = "main.java"
            java.lang.String r3 = "main.java.bshs"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.Set r0 = tf.d0.W(r0)
            gb.k.f4440a = r0
            return
    }

    public static java.lang.Object a(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.List r20) {
            r0 = r17
            java.lang.String r1 = "README.md"
            r16.getClass()
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L148
            r3 = r16
            java.util.List r2 = r2.listPlugins(r3)     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L148
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L148
            r4 = 0
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L148
            r5 = r3
            eb.c0 r5 = (eb.c0) r5     // Catch: java.lang.Throwable -> L148
            java.lang.String r5 = r5.f2506a     // Catch: java.lang.Throwable -> L148
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L148
            if (r5 == 0) goto L13
            goto L2b
        L2a:
            r3 = r4
        L2b:
            eb.c0 r3 = (eb.c0) r3     // Catch: java.lang.Throwable -> L148
            if (r3 == 0) goto L12d
            java.lang.String r9 = r3.f2511f     // Catch: java.lang.Throwable -> L148
            java.lang.String r8 = r3.f2510e     // Catch: java.lang.Throwable -> L148
            java.lang.String r6 = r3.f2506a     // Catch: java.lang.Throwable -> L148
            java.io.File r0 = r3.f2508c     // Catch: java.lang.Throwable -> L148
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L148
            r15.<init>()     // Catch: java.lang.Throwable -> L148
            java.lang.String r2 = "main.java"
            r5 = 1
            gb.g r2 = p(r0, r2, r5, r2)     // Catch: java.lang.Throwable -> L148
            java.lang.String r7 = "Required value was null."
            if (r2 == 0) goto L127
            r15.add(r2)     // Catch: java.lang.Throwable -> L148
            gb.g r2 = q(r0)     // Catch: java.lang.Throwable -> L148
            if (r2 == 0) goto L53
            r15.add(r2)     // Catch: java.lang.Throwable -> L148
        L53:
            java.lang.String r2 = "info.prop"
            r10 = 0
            gb.g r2 = p(r0, r2, r10, r2)     // Catch: java.lang.Throwable -> L148
            if (r2 == 0) goto L5f
            r15.add(r2)     // Catch: java.lang.Throwable -> L148
        L5f:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L148
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L148
            boolean r11 = r2.isFile()     // Catch: java.lang.Throwable -> L148
            if (r11 == 0) goto L6b
            goto L6c
        L6b:
            r2 = r4
        L6c:
            if (r2 == 0) goto L6f
            goto L7e
        L6f:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L148
            java.lang.String r11 = "readme.md"
            r2.<init>(r0, r11)     // Catch: java.lang.Throwable -> L148
            boolean r11 = r2.isFile()     // Catch: java.lang.Throwable -> L148
            if (r11 == 0) goto L7d
            goto L7e
        L7d:
            r2 = r4
        L7e:
            if (r2 == 0) goto L90
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L148
            r2.getClass()     // Catch: java.lang.Throwable -> L148
            gb.g r0 = p(r0, r2, r5, r1)     // Catch: java.lang.Throwable -> L148
            if (r0 == 0) goto L93
            r15.add(r0)     // Catch: java.lang.Throwable -> L148
        L90:
            r0 = r20
            goto L99
        L93:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L148
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L148
            throw r0     // Catch: java.lang.Throwable -> L148
        L99:
            tf.r.h1(r15, r0)     // Catch: java.lang.Throwable -> L148
            v(r15, r10)     // Catch: java.lang.Throwable -> L148
            if (r18 == 0) goto Laa
            java.lang.CharSequence r0 = og.m.R0(r18)     // Catch: java.lang.Throwable -> L148
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L148
            goto Lab
        Laa:
            r0 = r4
        Lab:
            if (r0 == 0) goto Lb5
            boolean r1 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L148
            if (r1 == 0) goto Lb4
            goto Lb5
        Lb4:
            r5 = r10
        Lb5:
            if (r5 != 0) goto Lb8
            r4 = r0
        Lb8:
            if (r4 == 0) goto Lbc
        Lba:
            r7 = r4
            goto Lbf
        Lbc:
            java.lang.String r4 = r3.f2507b     // Catch: java.lang.Throwable -> L148
            goto Lba
        Lbf:
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L148
            r1 = 128(0x80, float:1.8E-43)
            if (r0 > r1) goto L11f
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L148
            r1 = 100
            if (r0 > r1) goto L117
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L148
            if (r0 > r1) goto L10f
            int r0 = r9.length()     // Catch: java.lang.Throwable -> L148
            r1 = 64
            if (r0 > r1) goto L107
            int r0 = r19.length()     // Catch: java.lang.Throwable -> L148
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 > r1) goto Lff
            gb.j r0 = d()     // Catch: java.lang.Throwable -> L148
            gb.r r5 = new gb.r     // Catch: java.lang.Throwable -> L148
            java.lang.String r10 = r3.f2512g     // Catch: java.lang.Throwable -> L148
            java.lang.CharSequence r1 = og.m.R0(r19)     // Catch: java.lang.Throwable -> L148
            java.lang.String r11 = r1.toString()     // Catch: java.lang.Throwable -> L148
            java.lang.String r12 = r0.f4437a     // Catch: java.lang.Throwable -> L148
            java.lang.String r13 = r0.f4438b     // Catch: java.lang.Throwable -> L148
            java.lang.String r14 = r0.f4439c     // Catch: java.lang.Throwable -> L148
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L148
            return r5
        Lff:
            java.lang.String r0 = "更新说明不能超过 500 个字符"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L148
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L148
            throw r1     // Catch: java.lang.Throwable -> L148
        L107:
            java.lang.String r0 = "插件版本不能超过 64 个字符"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L148
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L148
            throw r1     // Catch: java.lang.Throwable -> L148
        L10f:
            java.lang.String r0 = "插件作者不能超过 100 个字符"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L148
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L148
            throw r1     // Catch: java.lang.Throwable -> L148
        L117:
            java.lang.String r0 = "上传插件名不能超过 100 个字符"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L148
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L148
            throw r1     // Catch: java.lang.Throwable -> L148
        L11f:
            java.lang.String r0 = "本地插件目录名不能超过 128 个字符"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L148
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L148
            throw r1     // Catch: java.lang.Throwable -> L148
        L127:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L148
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L148
            throw r0     // Catch: java.lang.Throwable -> L148
        L12d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L148
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L148
            r2.<init>()     // Catch: java.lang.Throwable -> L148
            java.lang.String r3 = "未找到本地插件: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L148
            r2.append(r0)     // Catch: java.lang.Throwable -> L148
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L148
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L148
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L148
            throw r1     // Catch: java.lang.Throwable -> L148
        L148:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            return r1
    }

    public static void b(java.io.File r5, java.io.File r6) {
            j(r5)
            boolean r0 = r6.isDirectory()
            if (r0 != 0) goto L16
            boolean r0 = r6.mkdirs()
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.lang.String r5 = "创建插件暂存目录失败"
            j8.o.A(r5)
            return
        L16:
            dg.j r0 = new dg.j
            r1 = 0
            dg.k r2 = dg.k.f2255g
            r0.<init>(r5, r2, r1)
            dg.h r1 = new dg.h
            r1.<init>(r0)
        L23:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            java.io.File r2 = dg.l.i0(r0, r5)
            java.io.File r3 = new java.io.File
            java.lang.String r2 = r2.getPath()
            r3.<init>(r6, r2)
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L5d
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L23
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L4f
            goto L23
        L4f:
            java.lang.String r5 = r3.getName()
            java.lang.String r6 = "创建目录失败: "
            java.lang.String r5 = wb.en.g(r6, r5)
            ah.a.h(r5)
            return
        L5d:
            java.io.File r2 = r3.getParentFile()
            if (r2 == 0) goto L76
            boolean r4 = r2.isDirectory()
            if (r4 != 0) goto L76
            boolean r2 = r2.mkdirs()
            if (r2 == 0) goto L70
            goto L76
        L70:
            java.lang.String r5 = "创建父目录失败"
            j8.o.A(r5)
            return
        L76:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8a
            g4.a.j(r2, r0)     // Catch: java.lang.Throwable -> L8c
            r0.close()     // Catch: java.lang.Throwable -> L8a
            r2.close()
            goto L23
        L8a:
            r5 = move-exception
            goto L93
        L8c:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L8e
        L8e:
            r6 = move-exception
            ig.a.i(r0, r5)     // Catch: java.lang.Throwable -> L8a
            throw r6     // Catch: java.lang.Throwable -> L8a
        L93:
            throw r5     // Catch: java.lang.Throwable -> L94
        L94:
            r6 = move-exception
            ig.a.i(r2, r5)
            throw r6
        L99:
            return
    }

    public static gb.g c(java.lang.String r7, byte[] r8) {
            java.lang.String r1 = w(r7)
            boolean r7 = n(r1)
            if (r7 != 0) goto L6f
            int r7 = r8.length
            long r2 = (long) r7
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L64
            java.lang.String r7 = e(r1, r8)     // Catch: java.lang.Throwable -> L18
            goto L20
        L18:
            r0 = move-exception
            r7 = r0
            sf.f r0 = new sf.f
            r0.<init>(r7)
            r7 = r0
        L20:
            boolean r0 = r7 instanceof sf.f
            if (r0 == 0) goto L26
            r7 = 0
        L26:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "utf8"
            if (r7 == 0) goto L40
            int r2 = r8.length
            r3 = 0
            r4 = r3
        L2f:
            if (r4 >= r2) goto L3e
            r5 = r8[r4]
            if (r5 != 0) goto L37
            r5 = 1
            goto L38
        L37:
            r5 = r3
        L38:
            if (r5 == 0) goto L3b
            goto L40
        L3b:
            int r4 = r4 + 1
            goto L2f
        L3e:
            r4 = r0
            goto L43
        L40:
            java.lang.String r2 = "base64"
            r4 = r2
        L43:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L4f
            if (r7 != 0) goto L4d
            java.lang.String r7 = ""
        L4d:
            r2 = r7
            goto L55
        L4f:
            r7 = 2
            java.lang.String r7 = android.util.Base64.encodeToString(r8, r7)
            goto L4d
        L55:
            gb.g r0 = new gb.g
            r2.getClass()
            java.lang.String r3 = t(r8)
            int r7 = r8.length
            long r5 = (long) r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L64:
            java.lang.String r7 = " 超过 16384 KiB"
            java.lang.String r7 = r1.concat(r7)
            j8.o.q(r7)
        L6d:
            r7 = 0
            return r7
        L6f:
            java.lang.String r7 = "附加文件不能覆盖默认插件文件: "
            java.lang.String r7 = r7.concat(r1)
            j8.o.q(r7)
            goto L6d
    }

    public static gb.j d() {
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r0 == 0) goto Lbe
            java.lang.String r1 = r0.c()
            r1.getClass()
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto Lb8
            r2 = 0
            g8.i r3 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L29
            h.Hchat.hooks.api.model.WeChatContact r3 = r3.n(r1)     // Catch: java.lang.Throwable -> L27
            goto L31
        L27:
            r3 = move-exception
            goto L2b
        L29:
            r3 = r2
            goto L31
        L2b:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L31:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L37
            r3 = r2
        L37:
            h.Hchat.hooks.api.model.WeChatContact r3 = (h.Hchat.hooks.api.model.WeChatContact) r3
            r4 = 42
            java.lang.String r4 = r0.b(r4)
            r4.getClass()
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r5 = og.m.t0(r4)
            java.lang.String r6 = ""
            if (r5 == 0) goto L63
            if (r3 == 0) goto L57
            java.lang.String r4 = r3.customWxId
            goto L58
        L57:
            r4 = r2
        L58:
            if (r4 != 0) goto L5b
            r4 = r6
        L5b:
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
        L63:
            r5 = 4
            java.lang.String r0 = r0.b(r5)
            r0.getClass()
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r5 = og.m.t0(r0)
            if (r5 == 0) goto L89
            if (r3 == 0) goto L7d
            java.lang.String r2 = r3.nickname
        L7d:
            if (r2 != 0) goto L80
            goto L81
        L80:
            r6 = r2
        L81:
            java.lang.CharSequence r0 = og.m.R0(r6)
            java.lang.String r0 = r0.toString()
        L89:
            int r2 = r1.length()
            r3 = 128(0x80, float:1.8E-43)
            if (r2 > r3) goto Lb2
            int r2 = r4.length()
            if (r2 > r3) goto Lac
            int r2 = r0.length()
            r3 = 100
            if (r2 > r3) goto La5
            gb.j r2 = new gb.j
            r2.<init>(r1, r4, r0)
            return r2
        La5:
            java.lang.String r0 = "当前账号微信昵称过长"
            j8.o.t(r0)
        Laa:
            r0 = 0
            return r0
        Lac:
            java.lang.String r0 = "当前账号微信号长度异常"
            j8.o.t(r0)
            goto Laa
        Lb2:
            java.lang.String r0 = "当前账号 wxid 长度异常"
            j8.o.t(r0)
            goto Laa
        Lb8:
            java.lang.String r0 = "无法读取当前账号 wxid，请重启微信后重试"
            j8.o.t(r0)
            goto Laa
        Lbe:
            java.lang.String r0 = "当前微信账号资料尚未就绪，请重启微信后重试"
            j8.o.A(r0)
            goto Laa
    }

    public static java.lang.String e(java.lang.String r2, byte[] r3) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1d
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()     // Catch: java.lang.Throwable -> L1d
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT     // Catch: java.lang.Throwable -> L1d
            java.nio.charset.CharsetDecoder r0 = r0.onMalformedInput(r1)     // Catch: java.lang.Throwable -> L1d
            java.nio.charset.CharsetDecoder r0 = r0.onUnmappableCharacter(r1)     // Catch: java.lang.Throwable -> L1d
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)     // Catch: java.lang.Throwable -> L1d
            java.nio.CharBuffer r3 = r0.decode(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L24:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 != 0) goto L30
            r3.getClass()
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L30:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r1 = " 不是有效 UTF-8 文本"
            java.lang.String r2 = r2.concat(r1)
            r3.<init>(r2, r0)
            throw r3
    }

    public static java.lang.String f(gb.o r2) {
            r2.getClass()
            java.lang.String r0 = r2.f4450b
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto Ld
            java.lang.String r0 = r2.f4449a
        Ld:
            java.lang.String r2 = s(r0)
            return r2
    }

    public static void g(java.io.File r4) {
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
            g(r3)
            int r2 = r2 + 1
            goto L1c
        L26:
            boolean r0 = r4.delete()
            if (r0 == 0) goto L2d
            return
        L2d:
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "删除文件失败: "
            java.lang.String r4 = wb.en.g(r0, r4)
            ah.a.h(r4)
            return
        L3b:
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "不支持删除符号链接: "
            java.lang.String r4 = wb.en.g(r0, r4)
            j8.o.q(r4)
            return
    }

    public static void h(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 != 0) goto L7
            return
        L7:
            g(r1)
            return
    }

    public static void i(java.io.File r2, java.io.File r3) {
            java.io.File r0 = r2.getAbsoluteFile()
            java.io.File r1 = r2.getCanonicalFile()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L27
            java.io.File r2 = r2.getCanonicalFile()
            java.io.File r2 = r2.getParentFile()
            java.io.File r3 = r3.getCanonicalFile()
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L21
            return
        L21:
            java.lang.String r2 = "插件文件路径越界"
            j8.o.t(r2)
            return
        L27:
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "插件文件不能是符号链接: "
            java.lang.String r2 = wb.en.g(r3, r2)
            j8.o.q(r2)
            return
    }

    public static void j(java.io.File r3) {
            java.io.File r0 = r3.getAbsoluteFile()
            java.io.File r1 = r3.getCanonicalFile()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L4b
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto L15
            goto L4a
        L15:
            dg.j r0 = new dg.j
            r1 = 0
            dg.k r2 = dg.k.f2255g
            r0.<init>(r3, r2, r1)
            dg.h r3 = new dg.h
            r3.<init>(r0)
        L22:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r3.next()
            java.io.File r0 = (java.io.File) r0
            java.io.File r1 = r0.getAbsoluteFile()
            java.io.File r2 = r0.getCanonicalFile()
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L3d
            goto L22
        L3d:
            java.lang.String r3 = r0.getName()
            java.lang.String r0 = "插件目录包含不支持的符号链接: "
            java.lang.String r3 = wb.en.g(r0, r3)
            j8.o.q(r3)
        L4a:
            return
        L4b:
            java.lang.String r3 = "插件目录包含不支持的符号链接"
            j8.o.t(r3)
            return
    }

    public static java.lang.String k(android.content.Context r2, gb.o r3) {
            r3.getClass()
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.io.File r2 = r0.scriptDir(r2)
            java.lang.String r0 = f(r3)
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto L19
            return r0
        L19:
            java.lang.String r3 = r3.f4449a
            java.lang.String r3 = s(r3)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L32
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L32
            r2 = 1
            goto L33
        L32:
            r2 = 0
        L33:
            if (r2 == 0) goto L36
            return r3
        L36:
            r2 = 0
            return r2
    }

    public static long l(java.lang.String r2) {
            int r0 = r2.hashCode()
            switch(r0) {
                case -296580809: goto L28;
                case 1186280611: goto L1b;
                case 1567368051: goto L15;
                case 1685611991: goto L8;
                default: goto L7;
            }
        L7:
            goto L30
        L8:
            java.lang.String r0 = "README.md"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L11
            goto L30
        L11:
            r0 = 262144(0x40000, double:1.295163E-318)
            return r0
        L15:
            java.lang.String r0 = "main.java.bshs"
            r2.equals(r0)
            goto L30
        L1b:
            java.lang.String r0 = "info.prop"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L24
            goto L30
        L24:
            r0 = 65536(0x10000, double:3.2379E-319)
            return r0
        L28:
            java.lang.String r0 = "main.java"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L34
        L30:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            return r0
        L34:
            r0 = 524288(0x80000, double:2.590327E-318)
            return r0
    }

    public static java.lang.Object m(android.content.Context r18, gb.o r19, boolean r20) {
            r1 = r18
            r0 = r19
            java.lang.String r2 = "[Hchat:PluginMarket] 清理插件安装暂存目录失败: "
            sf.n r3 = sf.n.f12433a
            java.lang.String r4 = ".hchat-plugin-market-backup-"
            java.lang.String r5 = ".hchat-plugin-market-stage-"
            java.lang.String r6 = "本地插件已存在，需要确认覆盖: "
            java.lang.String r7 = "插件目标不是目录: "
            r0.getClass()
            java.util.List r8 = r0.f4460l
            java.lang.String r9 = r0.f4449a     // Catch: java.lang.Throwable -> L333
            java.lang.CharSequence r9 = og.m.R0(r9)     // Catch: java.lang.Throwable -> L333
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L333
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L333
            if (r10 != 0) goto L32b
            r10 = 1
            v(r8, r10)     // Catch: java.lang.Throwable -> L333
            h.Hchat.hooks.items.script.ScriptPluginRuntime r11 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L333
            java.io.File r12 = r11.ensureDirs(r1)     // Catch: java.lang.Throwable -> L333
            java.io.File r12 = r12.getCanonicalFile()     // Catch: java.lang.Throwable -> L333
            java.lang.String r0 = f(r0)     // Catch: java.lang.Throwable -> L333
            java.lang.String r13 = s(r0)     // Catch: java.lang.Throwable -> L333
            boolean r0 = og.m.t0(r13)     // Catch: java.lang.Throwable -> L333
            if (r0 != 0) goto L323
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L333
            r0.<init>(r12, r13)     // Catch: java.lang.Throwable -> L333
            java.io.File r0 = r0.getAbsoluteFile()     // Catch: java.lang.Throwable -> L333
            java.io.File r14 = r0.getCanonicalFile()     // Catch: java.lang.Throwable -> L333
            java.io.File r15 = r14.getParentFile()     // Catch: java.lang.Throwable -> L333
            boolean r15 = gg.l.a(r15, r12)     // Catch: java.lang.Throwable -> L333
            if (r15 == 0) goto L31b
            boolean r0 = r0.equals(r14)     // Catch: java.lang.Throwable -> L333
            if (r0 == 0) goto L31b
            boolean r0 = r14.exists()     // Catch: java.lang.Throwable -> L333
            if (r0 == 0) goto L79
            boolean r0 = r14.isDirectory()     // Catch: java.lang.Throwable -> L333
            if (r0 == 0) goto L6b
            goto L79
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L333
            java.lang.String r1 = r7.concat(r13)     // Catch: java.lang.Throwable -> L333
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L333
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L333
            throw r0     // Catch: java.lang.Throwable -> L333
        L79:
            java.lang.String r0 = s(r9)     // Catch: java.lang.Throwable -> L333
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L333
            r7.<init>(r12, r0)     // Catch: java.lang.Throwable -> L333
            java.io.File r7 = r7.getCanonicalFile()     // Catch: java.lang.Throwable -> L333
            boolean r0 = r13.equals(r0)     // Catch: java.lang.Throwable -> L333
            if (r0 != 0) goto L99
            boolean r0 = r14.exists()     // Catch: java.lang.Throwable -> L333
            if (r0 != 0) goto L99
            boolean r0 = r7.isDirectory()     // Catch: java.lang.Throwable -> L333
            if (r0 == 0) goto L99
            goto L9a
        L99:
            r7 = r14
        L9a:
            java.lang.String r9 = r7.getName()     // Catch: java.lang.Throwable -> L333
            boolean r15 = r7.isDirectory()     // Catch: java.lang.Throwable -> L333
            if (r15 == 0) goto Lb5
            if (r20 == 0) goto La7
            goto Lb5
        La7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L333
            java.lang.String r1 = r6.concat(r13)     // Catch: java.lang.Throwable -> L333
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L333
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L333
            throw r0     // Catch: java.lang.Throwable -> L333
        Lb5:
            if (r15 == 0) goto Lba
            j(r7)     // Catch: java.lang.Throwable -> L333
        Lba:
            java.io.File r0 = r12.getParentFile()     // Catch: java.lang.Throwable -> L333
            if (r0 == 0) goto L313
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L333
            java.util.UUID r12 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L333
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L333
            r10.<init>(r5)     // Catch: java.lang.Throwable -> L333
            r10.append(r12)     // Catch: java.lang.Throwable -> L333
            java.lang.String r5 = r10.toString()     // Catch: java.lang.Throwable -> L333
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L333
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L333
            r5.<init>(r6, r13)     // Catch: java.lang.Throwable -> L333
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L333
            java.util.UUID r12 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L333
            r16 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L333
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L333
            r3.append(r9)     // Catch: java.lang.Throwable -> L333
            java.lang.String r4 = "-"
            r3.append(r4)     // Catch: java.lang.Throwable -> L333
            r3.append(r12)     // Catch: java.lang.Throwable -> L333
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L333
            r10.<init>(r0, r3)     // Catch: java.lang.Throwable -> L333
            h(r6)     // Catch: java.lang.Throwable -> L333
            h(r10)     // Catch: java.lang.Throwable -> L333
            if (r15 == 0) goto L10c
            r9.getClass()     // Catch: java.lang.Throwable -> L333
            boolean r0 = r11.isPluginEnabled(r1, r9)     // Catch: java.lang.Throwable -> L333
            if (r0 == 0) goto L10c
            r4 = 1
            goto L10d
        L10c:
            r4 = 0
        L10d:
            boolean r0 = r6.mkdirs()     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L283
            if (r15 == 0) goto L11f
            b(r7, r5)     // Catch: java.lang.Throwable -> L119
            goto L125
        L119:
            r0 = move-exception
            r3 = 0
        L11b:
            r5 = 0
            r8 = 0
            goto L28b
        L11f:
            boolean r0 = r5.mkdirs()     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L27b
        L125:
            r(r5, r8)     // Catch: java.lang.Throwable -> L119
            java.util.Iterator r0 = r8.iterator()     // Catch: java.lang.Throwable -> L119
        L12c:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L119
            if (r8 == 0) goto L1b9
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L119
            gb.g r8 = (gb.g) r8     // Catch: java.lang.Throwable -> L119
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L119
            java.lang.String r12 = r8.f4422a     // Catch: java.lang.Throwable -> L119
            r11.<init>(r5, r12)     // Catch: java.lang.Throwable -> L119
            java.io.File r17 = r11.getCanonicalFile()     // Catch: java.lang.Throwable -> L119
            java.io.File r3 = r17.getParentFile()     // Catch: java.lang.Throwable -> L119
            r20 = r0
            java.io.File r0 = r5.getCanonicalFile()     // Catch: java.lang.Throwable -> L119
            boolean r0 = gg.l.a(r3, r0)     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L1b1
            java.lang.String r0 = r11.getName()     // Catch: java.lang.Throwable -> L119
            r0.getClass()     // Catch: java.lang.Throwable -> L119
            w(r0)     // Catch: java.lang.Throwable -> L119
            boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L1a6
            boolean r0 = r11.isFile()     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L18b
            boolean r0 = r11.delete()     // Catch: java.lang.Throwable -> L119
            if (r0 == 0) goto L170
            goto L1a6
        L170:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L119
            r0.<init>()     // Catch: java.lang.Throwable -> L119
            java.lang.String r3 = "删除旧插件文件失败: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L119
            r0.append(r12)     // Catch: java.lang.Throwable -> L119
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L119
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L119
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L119
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L119
            throw r3     // Catch: java.lang.Throwable -> L119
        L18b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L119
            r0.<init>()     // Catch: java.lang.Throwable -> L119
            java.lang.String r3 = "插件文件目标与本地目录冲突: "
            r0.append(r3)     // Catch: java.lang.Throwable -> L119
            r0.append(r12)     // Catch: java.lang.Throwable -> L119
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L119
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L119
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L119
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L119
            throw r3     // Catch: java.lang.Throwable -> L119
        L1a6:
            byte[] r0 = r8.a()     // Catch: java.lang.Throwable -> L119
            x(r11, r0)     // Catch: java.lang.Throwable -> L119
            r0 = r20
            goto L12c
        L1b1:
            java.lang.String r0 = "插件文件路径越界"
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L119
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L119
            throw r3     // Catch: java.lang.Throwable -> L119
        L1b9:
            j(r5)     // Catch: java.lang.Throwable -> L119
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L119
            r3 = 0
            java.lang.Object r8 = r0.m16setPluginEnabled0E7RQCE(r1, r13, r3)     // Catch: java.lang.Throwable -> L119
            f8.i.I0(r8)     // Catch: java.lang.Throwable -> L119
            boolean r8 = gg.l.a(r9, r13)     // Catch: java.lang.Throwable -> L119
            if (r8 != 0) goto L1d6
            r9.getClass()     // Catch: java.lang.Throwable -> L119
            java.lang.Object r8 = r0.m16setPluginEnabled0E7RQCE(r1, r9, r3)     // Catch: java.lang.Throwable -> L119
            f8.i.I0(r8)     // Catch: java.lang.Throwable -> L119
        L1d6:
            boolean r3 = r7.exists()     // Catch: java.lang.Throwable -> L1ec
            if (r3 == 0) goto L1f0
            boolean r3 = r7.renameTo(r10)     // Catch: java.lang.Throwable -> L1ec
            if (r3 == 0) goto L1e4
            r3 = 1
            goto L1f1
        L1e4:
            java.lang.String r0 = "备份旧插件目录失败"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1ec
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1ec
            throw r3     // Catch: java.lang.Throwable -> L1ec
        L1ec:
            r0 = move-exception
            r3 = 1
            goto L11b
        L1f0:
            r3 = 0
        L1f1:
            boolean r5 = r5.renameTo(r14)     // Catch: java.lang.Throwable -> L276
            if (r5 == 0) goto L26e
            r0.refreshPluginObserver(r1, r13)     // Catch: java.lang.Throwable -> L207
            boolean r5 = gg.l.a(r9, r13)     // Catch: java.lang.Throwable -> L207
            if (r5 != 0) goto L20d
            r9.getClass()     // Catch: java.lang.Throwable -> L207
            r0.refreshPluginObserver(r1, r9)     // Catch: java.lang.Throwable -> L207
            goto L20d
        L207:
            r0 = move-exception
            r8 = r3
            r3 = 1
            r5 = 1
            goto L28b
        L20d:
            h(r10)     // Catch: java.lang.Throwable -> L213
            r5 = r16
            goto L219
        L213:
            r0 = move-exception
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L207
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L207
        L219:
            java.lang.Throwable r0 = sf.g.b(r5)     // Catch: java.lang.Throwable -> L207
            if (r0 == 0) goto L237
            java.lang.String r5 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L207
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L207
            r8.<init>()     // Catch: java.lang.Throwable -> L207
            java.lang.String r11 = "[Hchat:PluginMarket] 清理插件安装备份失败: "
            r8.append(r11)     // Catch: java.lang.Throwable -> L207
            r8.append(r5)     // Catch: java.lang.Throwable -> L207
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L207
            fb.v0.n(r5, r0)     // Catch: java.lang.Throwable -> L207
        L237:
            gb.i r5 = new gb.i     // Catch: java.lang.Throwable -> L207
            java.lang.String r0 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L207
            r0.getClass()     // Catch: java.lang.Throwable -> L207
            r8 = 0
            r5.<init>(r13, r0, r15, r8)     // Catch: java.lang.Throwable -> L207
            h(r6)     // Catch: java.lang.Throwable -> L24a
            r3 = r16
            goto L250
        L24a:
            r0 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L333
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L333
        L250:
            java.lang.Throwable r0 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L333
            if (r0 == 0) goto L339
            java.lang.String r1 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L333
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L333
            r3.<init>()     // Catch: java.lang.Throwable -> L333
            r3.append(r2)     // Catch: java.lang.Throwable -> L333
            r3.append(r1)     // Catch: java.lang.Throwable -> L333
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L333
            fb.v0.n(r1, r0)     // Catch: java.lang.Throwable -> L333
            goto L339
        L26e:
            java.lang.String r0 = "安装插件目录失败"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L276
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L276
            throw r5     // Catch: java.lang.Throwable -> L276
        L276:
            r0 = move-exception
            r8 = r3
            r3 = 1
            r5 = 0
            goto L28b
        L27b:
            java.lang.String r0 = "创建插件目录失败"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L119
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L119
            throw r3     // Catch: java.lang.Throwable -> L119
        L283:
            java.lang.String r0 = "创建插件暂存目录失败"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L119
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L119
            throw r3     // Catch: java.lang.Throwable -> L119
        L28b:
            if (r3 == 0) goto L294
            h.Hchat.hooks.items.script.ScriptPluginRuntime r11 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L294
            r12 = 0
            r11.m16setPluginEnabled0E7RQCE(r1, r13, r12)     // Catch: java.lang.Throwable -> L295
            goto L295
        L294:
            r12 = 0
        L295:
            if (r5 == 0) goto L2a4
            boolean r5 = r14.exists()     // Catch: java.lang.Throwable -> L2a1
            if (r5 == 0) goto L2a4
            h(r14)     // Catch: java.lang.Throwable -> L2a4
            goto L2a4
        L2a1:
            r0 = move-exception
            r1 = r0
            goto L2ea
        L2a4:
            if (r8 == 0) goto L2b2
            boolean r5 = r10.exists()     // Catch: java.lang.Throwable -> L2a1
            if (r5 == 0) goto L2b3
            boolean r5 = r10.renameTo(r7)     // Catch: java.lang.Throwable -> L2a1
            if (r5 == 0) goto L2b3
        L2b2:
            r12 = 1
        L2b3:
            if (r12 == 0) goto L2cc
            if (r8 == 0) goto L2bf
            h.Hchat.hooks.items.script.ScriptPluginRuntime r5 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L2bf
            r9.getClass()     // Catch: java.lang.Throwable -> L2bf
            r5.refreshPluginObserver(r1, r9)     // Catch: java.lang.Throwable -> L2bf
        L2bf:
            if (r3 == 0) goto L2cc
            if (r4 == 0) goto L2cc
            h.Hchat.hooks.items.script.ScriptPluginRuntime r3 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE     // Catch: java.lang.Throwable -> L2cc
            r9.getClass()     // Catch: java.lang.Throwable -> L2cc
            r4 = 1
            r3.m16setPluginEnabled0E7RQCE(r1, r9, r4)     // Catch: java.lang.Throwable -> L2cc
        L2cc:
            if (r12 != 0) goto L2e9
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r3 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L2a1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a1
            r4.<init>()     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r5 = "插件安装失败且旧插件恢复失败，备份保留在 "
            r4.append(r5)     // Catch: java.lang.Throwable -> L2a1
            r4.append(r3)     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L2a1
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2a1
            throw r1     // Catch: java.lang.Throwable -> L2a1
        L2e9:
            throw r0     // Catch: java.lang.Throwable -> L2a1
        L2ea:
            h(r6)     // Catch: java.lang.Throwable -> L2f0
            r3 = r16
            goto L2f6
        L2f0:
            r0 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L333
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L333
        L2f6:
            java.lang.Throwable r0 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L333
            if (r0 == 0) goto L312
            java.lang.String r3 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L333
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L333
            r4.<init>()     // Catch: java.lang.Throwable -> L333
            r4.append(r2)     // Catch: java.lang.Throwable -> L333
            r4.append(r3)     // Catch: java.lang.Throwable -> L333
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L333
            fb.v0.n(r2, r0)     // Catch: java.lang.Throwable -> L333
        L312:
            throw r1     // Catch: java.lang.Throwable -> L333
        L313:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L333
            java.lang.String r1 = "插件根目录没有父目录"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L333
            throw r0     // Catch: java.lang.Throwable -> L333
        L31b:
            java.lang.String r0 = "插件安装目录不在脚本插件根目录内"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L333
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L333
            throw r1     // Catch: java.lang.Throwable -> L333
        L323:
            java.lang.String r0 = "无法生成本地插件目录名"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L333
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L333
            throw r1     // Catch: java.lang.Throwable -> L333
        L32b:
            java.lang.String r0 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L333
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L333
            throw r1     // Catch: java.lang.Throwable -> L333
        L333:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
        L339:
            return r5
    }

    public static boolean n(java.lang.String r2) {
            java.util.Set r0 = gb.k.f4440a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L12
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            goto L2a
        L12:
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = og.t.X(r1, r2)
            if (r1 == 0) goto L16
            r2 = 1
            return r2
        L2a:
            r2 = 0
            return r2
    }

    public static boolean o(byte[] r2) {
            java.lang.String r0 = "插件文件"
            e(r0, r2)     // Catch: java.lang.Throwable -> L8
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        Lf:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r2 instanceof sf.f
            if (r1 == 0) goto L16
            r2 = r0
        L16:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    public static gb.g p(java.io.File r7, java.lang.String r8, boolean r9, java.lang.String r10) {
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r8)
            boolean r1 = r0.isFile()
            if (r1 != 0) goto L1f
            if (r9 != 0) goto Lf
            r7 = 0
            return r7
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r9 = "插件缺少 "
            java.lang.String r8 = r9.concat(r8)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L1f:
            i(r0, r7)
            java.lang.String r7 = r0.getName()
            java.lang.String r8 = "readme.md"
            boolean r7 = og.t.X(r7, r8)
            if (r7 == 0) goto L31
            java.lang.String r7 = "README.md"
            goto L35
        L31:
            java.lang.String r7 = r0.getName()
        L35:
            r7.getClass()
            long r7 = l(r7)
            long r1 = r0.length()
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r1 = 1024(0x400, float:1.435E-42)
            if (r9 > 0) goto L88
            byte[] r9 = dg.l.g0(r0)
            int r2 = r9.length
            long r2 = (long) r2
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto L7d
            java.lang.String r7 = r0.getName()
            r7.getClass()
            java.lang.String r2 = e(r7, r9)
            gb.g r0 = new gb.g
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            r7.getClass()
            byte[] r8 = r2.getBytes(r7)
            r8.getClass()
            java.lang.String r3 = t(r8)
            byte[] r7 = r2.getBytes(r7)
            r7.getClass()
            int r7 = r7.length
            long r5 = (long) r7
            java.lang.String r4 = "utf8"
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L7d:
            java.lang.String r9 = r0.getName()
            long r0 = (long) r1
            long r7 = r7 / r0
            g1.d.d(r9, r7)
        L86:
            r7 = 0
            return r7
        L88:
            java.lang.String r9 = r0.getName()
            long r0 = (long) r1
            long r7 = r7 / r0
            g1.d.d(r9, r7)
            goto L86
    }

    public static gb.g q(java.io.File r11) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "main.java.bshs"
            r0.<init>(r11, r1)
            boolean r2 = r0.isFile()
            r3 = 0
            if (r2 != 0) goto Lf
            return r3
        Lf:
            i(r0, r11)
            long r1 = l(r1)
            long r4 = r0.length()
            int r11 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            java.lang.String r4 = " KiB"
            java.lang.String r5 = "main.java.bshs 超过 "
            r6 = 1024(0x400, float:1.435E-42)
            if (r11 > 0) goto L66
            byte[] r11 = dg.l.g0(r0)
            int r0 = r11.length
            long r7 = (long) r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L60
            int r0 = r11.length
            r1 = 4
            if (r0 < r1) goto L5a
            r0 = 0
            byte[] r0 = tf.l.t0(r11, r0, r1)
            byte[] r1 = new byte[r1]
            r1 = {x006c: FILL_ARRAY_DATA , data: [66, 83, 72, 83} // fill-array
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L5a
            gb.g r4 = new gb.g
            r0 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r11, r0)
            r6.getClass()
            java.lang.String r7 = t(r11)
            int r11 = r11.length
            long r9 = (long) r11
            java.lang.String r8 = "base64"
            java.lang.String r5 = "main.java.bshs"
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L5a:
            java.lang.String r11 = "main.java.bshs 不是有效的 BeanShell 快照"
            j8.o.t(r11)
            return r3
        L60:
            long r6 = (long) r6
            long r1 = r1 / r6
            okio.a.f(r1, r5, r4)
            return r3
        L66:
            long r6 = (long) r6
            long r1 = r1 / r6
            okio.a.f(r1, r5, r4)
            return r3
    }

    public static void r(java.io.File r4, java.util.List r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r5.next()
            gb.g r1 = (gb.g) r1
            java.lang.String r1 = r1.f4422a
            r0.add(r1)
            goto Ld
        L1f:
            java.util.Set r5 = tf.m.U1(r0)
            java.util.Set r0 = gb.k.f4440a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L30
            r1.add(r2)
            goto L30
        L47:
            java.util.Iterator r5 = r1.iterator()
        L4b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L4b
            h(r1)
            goto L4b
        L66:
            java.io.File r5 = new java.io.File
            java.lang.String r0 = "readme.md"
            r5.<init>(r4, r0)
            boolean r4 = r5.exists()
            if (r4 == 0) goto L76
            h(r5)
        L76:
            return
    }

    public static java.lang.String s(java.lang.String r2) {
            java.lang.String r2 = p.a.l(r2, r2)
            java.lang.String r0 = "[\\\\/:*?\"<>|\\u0000-\\u001f]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r2.getClass()
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r0 = "_"
            java.lang.String r2 = r2.replaceAll(r0)
            r2.getClass()
            java.lang.String r1 = "\\s+"
            java.lang.String r2 = j8.b.h(r1, r2, r0)
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [46, 32} // fill-array
            java.lang.String r2 = og.m.S0(r2, r0)
            r0 = 64
            java.lang.String r2 = og.m.P0(r0, r2)
            java.lang.String r0 = "."
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4c
            java.lang.String r0 = ".."
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4c
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L4b
            java.lang.String r2 = "online_plugin"
        L4b:
            return r2
        L4c:
            java.lang.String r2 = "插件目录名无效"
            j8.o.t(r2)
            r2 = 0
            return r2
    }

    public static java.lang.String t(byte[] r2) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r2 = r0.digest(r2)
            r2.getClass()
            g0.o r0 = new g0.o
            r1 = 1
            r0.<init>(r1)
            java.lang.String r2 = tf.l.E0(r2, r0)
            return r2
    }

    public static java.lang.Object u(gb.o r1) {
            java.lang.String r0 = r1.f4449a     // Catch: java.lang.Throwable -> L19
            boolean r0 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L11
            java.util.List r1 = r1.f4460l     // Catch: java.lang.Throwable -> L19
            r0 = 1
            v(r1, r0)     // Catch: java.lang.Throwable -> L19
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> L19
            return r1
        L11:
            java.lang.String r1 = "远程插件 ID 不能为空"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L19
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L19:
            r1 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r1)
            return r0
    }

    public static void v(java.util.List r13, boolean r14) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r13)
            r0.<init>(r1)
            java.util.Iterator r1 = r13.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            gb.g r2 = (gb.g) r2
            java.lang.String r2 = r2.f4422a
            r0.add(r2)
            goto Ld
        L1f:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L2c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r4 = java.util.Locale.ROOT
            r4.getClass()
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            r1.add(r3)
            goto L2c
        L48:
            java.util.Set r2 = tf.m.T1(r1)
            java.util.List r2 = tf.m.P1(r2)
            int r2 = r2.size()
            int r1 = r1.size()
            if (r2 != r1) goto L20f
            java.util.Iterator r1 = r0.iterator()
        L5e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            w(r2)
            goto L5e
        L6e:
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L77
            r3 = r2
            goto L98
        L77:
            java.util.Iterator r1 = r0.iterator()
            r3 = r2
        L7c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L98
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = n(r4)
            if (r4 != 0) goto L7c
            int r3 = r3 + 1
            if (r3 < 0) goto L93
            goto L7c
        L93:
            a.a.P0()
            r13 = 0
            throw r13
        L98:
            r1 = 32
            r4 = 1
            if (r3 > r1) goto L9f
            r1 = r4
            goto La0
        L9f:
            r1 = r2
        La0:
            if (r1 == 0) goto L209
            java.lang.String r1 = "main.java"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L203
            java.util.Iterator r0 = r13.iterator()
        Lae:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1fd
            java.lang.Object r3 = r0.next()
            gb.g r3 = (gb.g) r3
            java.lang.String r5 = r3.f4422a
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto Lae
            java.lang.String r0 = r3.f4423b
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L1f7
            java.util.Iterator r13 = r13.iterator()
            r0 = 0
        Ld0:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L1e6
            java.lang.Object r3 = r13.next()
            gb.g r3 = (gb.g) r3
            java.lang.String r5 = r3.f4422a
            java.lang.String r6 = r3.f4424c
            java.lang.String r7 = r3.f4426e
            long r8 = l(r5)
            byte[] r10 = r3.a()     // Catch: java.lang.Throwable -> Leb
            goto Lf2
        Leb:
            r10 = move-exception
            sf.f r11 = new sf.f
            r11.<init>(r10)
            r10 = r11
        Lf2:
            java.lang.Throwable r11 = sf.g.b(r10)
            if (r11 != 0) goto L1da
            byte[] r10 = (byte[]) r10
            int r11 = r10.length
            long r11 = (long) r11
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 > 0) goto L102
            r11 = r4
            goto L103
        L102:
            r11 = r2
        L103:
            if (r11 == 0) goto L1d2
            java.lang.String r8 = "main.java.bshs"
            boolean r8 = r5.equals(r8)
            java.lang.String r9 = "base64"
            if (r8 == 0) goto L13a
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L134
            int r7 = r10.length
            r8 = 4
            if (r7 < r8) goto L12a
            byte[] r7 = tf.l.t0(r10, r2, r8)
            byte[] r8 = new byte[r8]
            r8 = {x0216: FILL_ARRAY_DATA , data: [66, 83, 72, 83} // fill-array
            boolean r7 = java.util.Arrays.equals(r7, r8)
            if (r7 == 0) goto L12a
            r7 = r4
            goto L12b
        L12a:
            r7 = r2
        L12b:
            if (r7 == 0) goto L12e
            goto L185
        L12e:
            java.lang.String r13 = "main.java.bshs 不是有效的 BeanShell 快照"
            j8.o.t(r13)
            return
        L134:
            java.lang.String r13 = "main.java.bshs 必须使用 Base64 传输"
            j8.o.t(r13)
            return
        L13a:
            boolean r8 = n(r5)
            java.lang.String r11 = " 不是有效 UTF-8 文本"
            java.lang.String r12 = "utf8"
            if (r8 == 0) goto L15e
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L152
            boolean r7 = o(r10)
            if (r7 == 0) goto L152
            r7 = r4
            goto L153
        L152:
            r7 = r2
        L153:
            if (r7 == 0) goto L156
            goto L185
        L156:
            java.lang.String r13 = r5.concat(r11)
            j8.o.q(r13)
            return
        L15e:
            boolean r8 = r7.equals(r12)
            if (r8 != 0) goto L16d
            boolean r8 = r7.equals(r9)
            if (r8 == 0) goto L16b
            goto L16d
        L16b:
            r8 = r2
            goto L16e
        L16d:
            r8 = r4
        L16e:
            if (r8 == 0) goto L1c8
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L185
            boolean r7 = o(r10)
            if (r7 == 0) goto L17d
            goto L185
        L17d:
            java.lang.String r13 = r5.concat(r11)
            j8.o.q(r13)
            return
        L185:
            long r7 = r3.f4425d
            int r3 = r10.length
            long r11 = (long) r3
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 != 0) goto L18f
            r3 = r4
            goto L190
        L18f:
            r3 = r2
        L190:
            if (r3 == 0) goto L1be
            if (r14 == 0) goto L1b9
            boolean r3 = og.m.t0(r6)
            if (r3 != 0) goto L1af
            java.lang.String r3 = t(r10)
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L1a5
            goto L1b9
        L1a5:
            java.lang.String r13 = " sha256 校验失败"
            java.lang.String r13 = r5.concat(r13)
            j8.o.q(r13)
            return
        L1af:
            java.lang.String r13 = " 缺少 sha256"
            java.lang.String r13 = r5.concat(r13)
            j8.o.q(r13)
            return
        L1b9:
            int r3 = r10.length
            long r5 = (long) r3
            long r0 = r0 + r5
            goto Ld0
        L1be:
            java.lang.String r13 = " 文件大小校验失败"
            java.lang.String r13 = r5.concat(r13)
            j8.o.q(r13)
            return
        L1c8:
            java.lang.String r13 = " 使用了不支持的编码"
            java.lang.String r13 = r5.concat(r13)
            j8.o.q(r13)
            return
        L1d2:
            r13 = 1024(0x400, float:1.435E-42)
            long r13 = (long) r13
            long r8 = r8 / r13
            g1.d.d(r5, r8)
            return
        L1da:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = " 内容解码失败"
            java.lang.String r14 = r5.concat(r14)
            r13.<init>(r14, r11)
            throw r13
        L1e6:
            r13 = 33554432(0x2000000, double:1.6578092E-316)
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 > 0) goto L1ee
            r2 = r4
        L1ee:
            if (r2 == 0) goto L1f1
            return
        L1f1:
            java.lang.String r13 = "插件包超过 32768 KiB"
            j8.o.t(r13)
            return
        L1f7:
            java.lang.String r13 = "main.java 不能为空"
            j8.o.t(r13)
            return
        L1fd:
            java.lang.String r13 = "Collection contains no element matching the predicate."
            j8.o.l(r13)
            return
        L203:
            java.lang.String r13 = "插件包缺少 main.java"
            j8.o.t(r13)
            return
        L209:
            java.lang.String r13 = "插件包附加文件不能超过 32 个"
            j8.o.t(r13)
            return
        L20f:
            java.lang.String r13 = "插件包包含重复文件"
            j8.o.t(r13)
            return
    }

    public static java.lang.String w(java.lang.String r4) {
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r0 = og.m.t0(r4)
            if (r0 != 0) goto L76
            java.lang.String r0 = "."
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L76
            java.lang.String r0 = ".."
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L76
            int r0 = r4.length()
            r1 = 128(0x80, float:1.8E-43)
            if (r0 > r1) goto L70
            r0 = 0
            r1 = r0
        L28:
            int r2 = r4.length()
            if (r1 >= r2) goto L56
            char r2 = r4.charAt(r1)
            r3 = 47
            if (r2 == r3) goto L45
            r3 = 92
            if (r2 == r3) goto L45
            r3 = 32
            if (r2 < r3) goto L45
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 != r3) goto L43
            goto L45
        L43:
            r2 = r0
            goto L46
        L45:
            r2 = 1
        L46:
            if (r2 != 0) goto L4b
            int r1 = r1 + 1
            goto L28
        L4b:
            java.lang.String r0 = "插件文件名不能包含路径或控制字符: "
            java.lang.String r4 = r0.concat(r4)
            j8.o.q(r4)
        L54:
            r4 = 0
            return r4
        L56:
            boolean r0 = n(r4)
            if (r0 == 0) goto L6f
            java.util.Set r0 = gb.k.f4440a
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L65
            goto L6f
        L65:
            java.lang.String r0 = "默认插件文件名必须使用标准大小写: "
            java.lang.String r4 = r0.concat(r4)
            j8.o.q(r4)
            goto L54
        L6f:
            return r4
        L70:
            java.lang.String r4 = "插件文件名不能超过 128 个字符"
            j8.o.t(r4)
            goto L54
        L76:
            java.lang.String r4 = "插件文件名无效"
            j8.o.t(r4)
            goto L54
    }

    public static void x(java.io.File r6, byte[] r7) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.getParentFile()
            java.lang.String r2 = r6.getName()
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "."
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ".market-"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ".tmp"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r1, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r1.write(r7)     // Catch: java.lang.Throwable -> L60
            java.io.FileDescriptor r7 = r1.getFD()     // Catch: java.lang.Throwable -> L60
            r7.sync()     // Catch: java.lang.Throwable -> L60
            r1.close()
            java.lang.String r7 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L4a
            android.system.Os.rename(r7, r1)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r7 = move-exception
            r0.delete()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.getName()
            java.lang.String r1 = "写入 "
            java.lang.String r2 = " 失败"
            java.lang.String r6 = eh.a.n(r1, r6, r2)
            r0.<init>(r6, r7)
            throw r0
        L60:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L62
        L62:
            r7 = move-exception
            ig.a.i(r1, r6)
            throw r7
    }
}
