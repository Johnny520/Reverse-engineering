package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class x implements z7.s, i.q1, u4.a, j8.l, y2.b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f310h;

    public x(float r3, float r4) {
            r2 = this;
            r0 = 20
            r2.f309g = r0
            r2.<init>()
            i.a0 r0 = new i.a0
            r1 = 1008981770(0x3c23d70a, float:0.01)
            r0.<init>(r3, r4, r1)
            r2.f310h = r0
            return
    }

    public x(float r2, float r3, i.q r4) {
            r1 = this;
            r0 = 22
            r1.f309g = r0
            int[] r0 = i.o1.f5739a
            if (r4 == 0) goto Le
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            r0.<init>(r4, r2, r3)
            goto L13
        Le:
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            r0.<init>(r2, r3)
        L13:
            r1.<init>()
            hb.c r2 = new hb.c
            r2.<init>(r0)
            r1.f310h = r2
            return
    }

    public x(int r2) {
            r1 = this;
            r1.f309g = r2
            switch(r2) {
                case 8: goto L32;
                case 11: goto L27;
                case 12: goto L1c;
                case 17: goto L11;
                default: goto L5;
            }
        L5:
            r1.<init>()
            z7.c r2 = new z7.c
            r0 = 0
            r2.<init>(r0)
            r1.f310h = r2
            return
        L11:
            r1.<init>()
            h3.h r2 = new h3.h
            r2.<init>(r1)
            r1.f310h = r2
            return
        L1c:
            r1.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f310h = r2
            return
        L27:
            r1.<init>()
            android.graphics.Region r2 = new android.graphics.Region
            r2.<init>()
            r1.f310h = r2
            return
        L32:
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            i0.j1 r2 = i0.r.u(r2)
            r1.f310h = r2
            return
    }

    public /* synthetic */ x(int r1, boolean r2) {
            r0 = this;
            r0.f309g = r1
            r0.<init>()
            return
    }

    public x(android.view.View r3) {
            r2 = this;
            r0 = 14
            r2.f309g = r0
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L19
            g3.j r0 = new g3.j
            r1 = 13
            r0.<init>(r3, r1)
            r0.f4216i = r3
            r2.f310h = r0
            goto L22
        L19:
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            r1 = 13
            r0.<init>(r3, r1)
            r2.f310h = r0
        L22:
            return
    }

    public x(f6.e r4) {
            r3 = this;
            r0 = 6
            r3.f309g = r0
            r3.<init>()
            int r0 = r4.size()
            int[] r0 = new int[r0]
            r3.f310h = r0
            r0 = 0
            r1 = r0
        L10:
            int r2 = r4.size()
            if (r0 >= r2) goto L2a
            java.lang.Object r2 = r3.f310h
            int[] r2 = (int[]) r2
            r2[r0] = r1
            java.lang.Object r2 = r4.get(r0)
            t5.d r2 = (t5.d) r2
            int r2 = r2.c()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L10
        L2a:
            return
    }

    public x(h.Hchat.dexkit.DexFinder r1, j8.o r2) {
            r0 = this;
            r2 = 26
            r0.f309g = r2
            r0.<init>()
            r0.f310h = r1
            return
    }

    public x(i.q r6, float r7, float r8) {
            r5 = this;
            r0 = 19
            r5.f309g = r0
            r5.<init>()
            int r0 = r6.b()
            i.a0[] r1 = new i.a0[r0]
            r2 = 0
        Le:
            if (r2 >= r0) goto L1e
            i.a0 r3 = new i.a0
            float r4 = r6.a(r2)
            r3.<init>(r7, r8, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Le
        L1e:
            r5.f310h = r1
            return
    }

    public /* synthetic */ x(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f309g = r2
            r0.f310h = r1
            r0.<init>()
            return
    }

    public x(r8.g r2) {
            r1 = this;
            r0 = 7
            r1.f309g = r0
            r2.getClass()
            r1.<init>()
            r1.f310h = r2
            return
    }

    public x(u2.c r3) {
            r2 = this;
            r0 = 15
            r2.f309g = r0
            r2.<init>()
            h.v0 r0 = new h.v0
            float r1 = h.g1.f4677a
            r0.<init>(r1, r3)
            r2.f310h = r0
            return
    }

    public x(int[] r22, float[] r23, float[][] r24) {
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 18
            r0.f309g = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            i.r[][] r4 = new i.r[r2][]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L14:
            if (r6 >= r2) goto L6b
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L2a
            if (r9 == r3) goto L33
            if (r9 == r11) goto L31
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 == r10) goto L2a
            r10 = 5
            if (r9 == r10) goto L2a
            r13 = r8
            goto L35
        L2a:
            r13 = r10
            goto L35
        L2c:
            if (r7 != r3) goto L33
            goto L31
        L2f:
            r13 = r7
            goto L35
        L31:
            r7 = r11
            goto L2f
        L33:
            r7 = r3
            goto L2f
        L35:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            i.r[] r11 = new i.r[r3]
            r12 = r5
        L47:
            if (r12 >= r3) goto L65
            int r16 = r12 * 2
            r17 = r12
            i.r r12 = new i.r
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L47
        L65:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L14
        L6b:
            r0.f310h = r4
            return
    }

    public static java.lang.String A(android.app.Activity r1, android.content.Intent r2) {
            java.lang.String r0 = "分享消息"
            android.content.Intent r2 = android.content.Intent.createChooser(r2, r0)     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            r2.addFlags(r0)     // Catch: java.lang.Throwable -> Lf
            r1.startActivity(r2)     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            goto L16
        Lf:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L16:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 != 0) goto L1d
            goto L1f
        L1d:
            java.lang.String r1 = "没有可用的分享应用"
        L1f:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static boolean C(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            goto L26
        L7:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "attachment"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L28
            java.lang.String r0 = "appattach"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L28
            java.lang.String r0 = "app_attach"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L26
            goto L28
        L26:
            r1 = 0
            return r1
        L28:
            r1 = 1
            return r1
    }

    public static java.lang.String R(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "@app"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L1b
            r0 = 0
            r1 = 4
            java.lang.String r2 = wb.en.f(r1, r0, r2)
        L1b:
            return r2
    }

    public static void X(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            if (r1 != 0) goto L3
            goto Le
        L3:
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> Le
            java.lang.reflect.Field r2 = h.Hchat.utils.KavaReflector.findField(r0, r2)     // Catch: java.lang.Throwable -> Le
            h.Hchat.utils.KavaReflector.writeField(r2, r1, r3)     // Catch: java.lang.Throwable -> Le
        Le:
            return
    }

    public static java.lang.String a0(android.app.Activity r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L7
            return r3
        L7:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.SEND"
            r3.<init>(r0)
            java.lang.String r0 = "text/plain"
            r3.setType(r0)
            java.lang.String r0 = "android.intent.extra.TEXT"
            r3.putExtra(r0, r2)
            java.lang.String r1 = A(r1, r3)
            return r1
    }

    public static void h(java.lang.Object r7, java.lang.Object[][] r8) {
            if (r7 == 0) goto L4a
            if (r8 != 0) goto L5
            goto L4a
        L5:
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L4a
            r3 = r8[r2]
            if (r3 == 0) goto L47
            int r4 = r3.length
            r5 = 2
            if (r4 >= r5) goto L13
            goto L47
        L13:
            r4 = r3[r1]
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L1c
            java.lang.String r4 = (java.lang.String) r4
            goto L1d
        L1c:
            r4 = 0
        L1d:
            r5 = 1
            r3 = r3[r5]
            j8.j r5 = j8.j.f6806g
            if (r3 != 0) goto L26
        L24:
            r3 = r5
            goto L3f
        L26:
            boolean r6 = r3 instanceof java.lang.String
            if (r6 == 0) goto L34
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L34
            goto L24
        L34:
            boolean r6 = r3 instanceof byte[]
            if (r6 == 0) goto L3f
            r6 = r3
            byte[] r6 = (byte[]) r6
            int r6 = r6.length
            if (r6 != 0) goto L3f
            goto L24
        L3f:
            if (r4 == 0) goto L47
            if (r3 != r5) goto L44
            goto L47
        L44:
            X(r7, r4, r3)
        L47:
            int r2 = r2 + 1
            goto L8
        L4a:
            return
    }

    public static androidx.lifecycle.x[] k(java.lang.String r10, r7.u r11) {
            int r0 = r10.length()
            int r1 = r0 + 1
            androidx.lifecycle.x[] r2 = new androidx.lifecycle.x[r1]
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r0) goto L29
            androidx.lifecycle.x r5 = new androidx.lifecycle.x
            r6 = 4
            r5.<init>(r6)
            char r6 = r10.charAt(r4)
            b8.g r7 = new b8.g
            r8 = 2
            r9 = 0
            r7.<init>(r8, r6, r9)
            java.lang.Object r6 = r5.f310h
            z7.c r6 = (z7.c) r6
            r6.add(r7)
            r2[r4] = r5
            int r4 = r4 + 1
            goto La
        L29:
            androidx.lifecycle.x r10 = new androidx.lifecycle.x
            r4 = 4
            r10.<init>(r4)
            r2[r0] = r10
            java.util.Iterator r10 = r11.iterator()
        L35:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L86
            java.lang.Object r11 = r10.next()
            b8.b r11 = (b8.b) r11
            int r0 = r11.f()
            if (r0 < r1) goto L48
            goto L35
        L48:
            int r4 = r11.e()
            if (r4 < r1) goto L4f
            goto L35
        L4f:
            r5 = r2[r0]
            if (r0 < r4) goto L63
            r5.getClass()
            b8.g r0 = new b8.g
            r0.<init>(r3, r3, r11)
            java.lang.Object r11 = r5.f310h
            z7.c r11 = (z7.c) r11
            r11.add(r0)
            goto L35
        L63:
            r5.getClass()
            b8.g r0 = new b8.g
            r6 = 1
            r0.<init>(r6, r3, r11)
            java.lang.Object r5 = r5.f310h
            z7.c r5 = (z7.c) r5
            r5.add(r0)
            r0 = r2[r4]
            r0.getClass()
            b8.g r4 = new b8.g
            r5 = 3
            r4.<init>(r5, r3, r11)
            java.lang.Object r11 = r0.f310h
            z7.c r11 = (z7.c) r11
            r11.add(r4)
            goto L35
        L86:
            return r2
    }

    public static java.lang.String p(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.String r0 = "/"
            boolean r1 = r2.endsWith(r0)
            if (r1 == 0) goto L12
            return r2
        L12:
            java.lang.String r2 = r2.concat(r0)
            return r2
    }

    public static java.lang.Object[][] q(java.lang.Object... r8) {
            int r0 = r8.length
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 1
            r3 = 2
            r4 = 0
            if (r0 != 0) goto L15
            int[] r8 = new int[r3]
            r8[r2] = r4
            r8[r4] = r4
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r1, r8)
            java.lang.Object[][] r8 = (java.lang.Object[][]) r8
            return r8
        L15:
            int r0 = r8.length
            int r0 = r0 / r3
            int[] r3 = new int[]{r0, r3}
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r3)
            java.lang.Object[][] r1 = (java.lang.Object[][]) r1
            r3 = r4
        L22:
            if (r3 >= r0) goto L36
            r5 = r1[r3]
            int r6 = r3 * 2
            r7 = r8[r6]
            r5[r4] = r7
            r5 = r1[r3]
            int r6 = r6 + r2
            r6 = r8[r6]
            r5[r2] = r6
            int r3 = r3 + 1
            goto L22
        L36:
            return r1
    }

    public void B(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatFileApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public java.lang.Object D(java.lang.String r8, java.lang.Object[][] r9, java.lang.Object[][] r10) {
            r7 = this;
            java.lang.String r0 = "创建媒体消息失败: 构造mediaObject失败 "
            java.lang.String r1 = "创建媒体消息失败: 未找到 "
            java.lang.Object r2 = r7.f310h
            h.Hchat.dexkit.DexFinder r2 = (h.Hchat.dexkit.DexFinder) r2
            java.lang.reflect.Method r2 = r2.sendFileMethod
            r3 = 0
            if (r2 != 0) goto L13
            java.lang.String r8 = "创建媒体消息失败: sendFileMethod未就绪"
            r7.B(r8)
            return r3
        L13:
            java.lang.Class r4 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L29
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L29
            java.lang.Class r4 = h.Hchat.utils.KavaReflector.loadClass(r8, r4)     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L2b
            java.lang.String r8 = r1.concat(r8)     // Catch: java.lang.Throwable -> L29
            r7.B(r8)     // Catch: java.lang.Throwable -> L29
            return r3
        L29:
            r8 = move-exception
            goto L56
        L2b:
            r1 = 0
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Constructor r5 = h.Hchat.utils.KavaReflector.findConstructor(r4, r5)     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r5, r6)     // Catch: java.lang.Throwable -> L29
            if (r5 != 0) goto L40
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r4, r1)     // Catch: java.lang.Throwable -> L29
        L40:
            if (r5 != 0) goto L44
            r5 = r3
            goto L47
        L44:
            h(r5, r9)     // Catch: java.lang.Throwable -> L29
        L47:
            if (r5 != 0) goto L51
            java.lang.String r8 = r0.concat(r8)     // Catch: java.lang.Throwable -> L29
            r7.B(r8)     // Catch: java.lang.Throwable -> L29
            return r3
        L51:
            java.lang.Object r8 = r7.G(r2, r5, r10)     // Catch: java.lang.Throwable -> L29
            return r8
        L56:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "创建媒体消息异常: "
            r9.<init>(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.B(r8)
            return r3
    }

    public java.lang.Object E(java.lang.Class r3, java.lang.String r4) {
            r2 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L13
            java.lang.reflect.Constructor r0 = h.Hchat.utils.KavaReflector.findConstructor(r3, r0)     // Catch: java.lang.Throwable -> L13
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r0, r1)     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Constructor r3 = h.Hchat.utils.KavaReflector.findConstructor(r3, r1)     // Catch: java.lang.Throwable -> L26
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r3, r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = "filePath"
            X(r3, r0, r4)     // Catch: java.lang.Throwable -> L26
            return r3
        L26:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "创建WXFileObject异常: "
            r4.<init>(r0)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.B(r3)
            r3 = 0
            return r3
    }

    public java.lang.Object F(java.lang.reflect.Method r11, java.io.File r12, java.lang.String r13) {
            r10 = this;
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Class r2 = r11.getDeclaringClass()     // Catch: java.lang.Throwable -> L51
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L51
            java.lang.Class[] r11 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> L51
            r3 = 0
            r11 = r11[r3]     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "com.tencent.mm.opensdk.modelmsg.WXFileObject"
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r4, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r10.E(r2, r4)     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L23
            return r1
        L23:
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredConstructors(r11)     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L51
        L2b:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L53
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L51
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6     // Catch: java.lang.Throwable -> L51
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L51
            int r8 = r7.length     // Catch: java.lang.Throwable -> L51
            r9 = 1
            if (r8 != r9) goto L2b
            r7 = r7[r3]     // Catch: java.lang.Throwable -> L51
            boolean r7 = r7.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L48
            goto L2b
        L48:
            java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.newInstance(r6, r2)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r11 = move-exception
            goto L92
        L53:
            r2 = r1
        L54:
            if (r2 != 0) goto L67
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L51
            java.lang.reflect.Constructor r11 = h.Hchat.utils.KavaReflector.findConstructor(r11, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.newInstance(r11, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r11 = "mediaObject"
            X(r2, r11, r4)     // Catch: java.lang.Throwable -> L51
        L67:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L51
            if (r11 != 0) goto L6e
            goto L72
        L6e:
            java.lang.String r13 = r12.getName()     // Catch: java.lang.Throwable -> L51
        L72:
            java.lang.String r11 = "title"
            if (r13 == 0) goto L83
            int r12 = r13.length()     // Catch: java.lang.Throwable -> L51
            r4 = 512(0x200, float:7.17E-43)
            if (r12 > r4) goto L7f
            goto L83
        L7f:
            java.lang.String r13 = r13.substring(r3, r4)     // Catch: java.lang.Throwable -> L51
        L83:
            X(r2, r11, r13)     // Catch: java.lang.Throwable -> L51
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L51
            if (r11 != 0) goto L91
            java.lang.String r11 = "description"
            X(r2, r11, r0)     // Catch: java.lang.Throwable -> L51
        L91:
            return r2
        L92:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "创建WXMediaMessage异常: "
            r12.<init>(r13)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.B(r11)
            return r1
    }

    public java.lang.Object G(java.lang.reflect.Method r8, java.lang.Object r9, java.lang.Object[][] r10) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L6b
            java.lang.Class[] r8 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            r8 = r8[r1]     // Catch: java.lang.Throwable -> L3c
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredConstructors(r8)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3c
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            int r5 = r4.length     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            if (r5 != r6) goto L12
            r4 = r4[r1]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r5 = r9.getClass()     // Catch: java.lang.Throwable -> L3c
            boolean r4 = r4.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L33
            goto L12
        L33:
            java.lang.Object[] r2 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.newInstance(r3, r2)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r8 = move-exception
            goto L56
        L3e:
            r2 = r0
        L3f:
            if (r2 != 0) goto L52
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Constructor r8 = h.Hchat.utils.KavaReflector.findConstructor(r8, r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.newInstance(r8, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = "mediaObject"
            X(r2, r8, r9)     // Catch: java.lang.Throwable -> L3c
        L52:
            h(r2, r10)     // Catch: java.lang.Throwable -> L3c
            return r2
        L56:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "构造WXMediaMessage失败: "
            r9.<init>(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.B(r8)
        L6b:
            return r0
    }

    public boolean H(int r1, int r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.io.File I(java.lang.reflect.Method r8, java.io.File r9) {
            r7 = this;
            r0 = 0
            java.lang.Class r1 = r8.getDeclaringClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r7.o(r1)     // Catch: java.lang.Throwable -> L6f
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L11
            goto L91
        L11:
            java.lang.Class r8 = r8.getDeclaringClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r9.getName()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = r9.getName()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = ""
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L26
            goto L4d
        L26:
            r5 = 47
            int r5 = r3.lastIndexOf(r5)     // Catch: java.lang.Throwable -> L6f
            r6 = 92
            int r6 = r3.lastIndexOf(r6)     // Catch: java.lang.Throwable -> L6f
            int r5 = java.lang.Math.max(r5, r6)     // Catch: java.lang.Throwable -> L6f
            r6 = 46
            int r6 = r3.lastIndexOf(r6)     // Catch: java.lang.Throwable -> L6f
            if (r6 <= r5) goto L4d
            int r5 = r3.length()     // Catch: java.lang.Throwable -> L6f
            int r5 = r5 + (-1)
            if (r6 < r5) goto L47
            goto L4d
        L47:
            int r6 = r6 + 1
            java.lang.String r4 = r3.substring(r6)     // Catch: java.lang.Throwable -> L6f
        L4d:
            java.lang.String r8 = r7.i(r8, r1, r2, r4)     // Catch: java.lang.Throwable -> L6f
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L71
            java.lang.String r8 = r9.getName()     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = p(r1)     // Catch: java.lang.Throwable -> L6f
            r2.append(r1)     // Catch: java.lang.Throwable -> L6f
            r2.append(r8)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r8 = move-exception
            goto L9a
        L71:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r8 = r9.getCanonicalPath()     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r1.getCanonicalPath()     // Catch: java.lang.Throwable -> L83
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L83
            goto L8f
        L83:
            java.lang.String r8 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L6f
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L6f
        L8f:
            if (r8 == 0) goto L92
        L91:
            return r9
        L92:
            boolean r8 = r7.j(r9, r1)     // Catch: java.lang.Throwable -> L6f
            if (r8 != 0) goto L99
            return r0
        L99:
            return r1
        L9a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "准备附件异常: "
            r9.<init>(r1)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.B(r8)
            return r0
    }

    public int J(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f310h
            byte[] r0 = (byte[]) r0
            r1 = r0[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 1
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r4 + 2
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r4 = r4 + 3
            r4 = r0[r4]
            int r4 = r4 << 24
            r4 = r4 | r1
            return r4
    }

    public long K(int r9) {
            r8 = this;
            java.lang.Object r0 = r8.f310h
            byte[] r0 = (byte[]) r0
            r1 = r0[r9]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r9 + 1
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r9 + 2
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            long r1 = (long) r1
            int r3 = r9 + 3
            r3 = r0[r3]
            long r3 = (long) r3
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r7 = 24
            long r3 = r3 << r7
            long r1 = r1 | r3
            int r3 = r9 + 4
            r3 = r0[r3]
            long r3 = (long) r3
            long r3 = r3 & r5
            r7 = 32
            long r3 = r3 << r7
            long r1 = r1 | r3
            int r3 = r9 + 5
            r3 = r0[r3]
            long r3 = (long) r3
            long r3 = r3 & r5
            r7 = 40
            long r3 = r3 << r7
            long r1 = r1 | r3
            int r3 = r9 + 6
            r3 = r0[r3]
            long r3 = (long) r3
            long r3 = r3 & r5
            r5 = 48
            long r3 = r3 << r5
            long r1 = r1 | r3
            int r9 = r9 + 7
            r9 = r0[r9]
            long r3 = (long) r9
            r9 = 56
            long r3 = r3 << r9
            long r0 = r1 | r3
            return r0
    }

    public int L(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f310h
            byte[] r0 = (byte[]) r0
            r1 = r0[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 1
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r4 + 2
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r4 + 3
            r0 = r0[r2]
            int r0 = r0 << 24
            r0 = r0 | r1
            r1 = -1
            if (r0 < r1) goto L25
            return r0
        L25:
            d6.f r0 = new d6.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r1 = 0
            java.lang.String r2 = "Encountered optional uint that is out of range at offset 0x%x"
            r0.<init>(r1, r2, r4)
            throw r0
    }

    public int M(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f310h
            byte[] r0 = (byte[]) r0
            r1 = r0[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 1
            r3 = r0[r3]
            int r3 = r3 << 8
            r3 = r3 | r1
            return r3
    }

    public int N(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f310h
            byte[] r0 = (byte[]) r0
            r1 = r0[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r4 + 1
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = r4 + 2
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r4 + 3
            r0 = r0[r2]
            int r0 = r0 << 24
            r0 = r0 | r1
            if (r0 < 0) goto L24
            return r0
        L24:
            d6.f r0 = new d6.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r1 = 0
            java.lang.String r2 = "Encountered small uint that is out of range at offset 0x%x"
            r0.<init>(r1, r2, r4)
            throw r0
    }

    public int O(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            byte[] r0 = (byte[]) r0
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            return r2
    }

    public int P(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f310h
            byte[] r0 = (byte[]) r0
            r1 = r0[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r3 = r3 | r1
            return r3
    }

    public java.lang.Object Q(sg.g r21, fg.a r22) {
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.Object r2 = r1.f310h
            f1.n0 r2 = (f1.n0) r2
            if (r2 == 0) goto Lb
            goto L10
        Lb:
            java.lang.String r2 = "Called runAndWatch on a manager that has been disposed of"
            i0.n1.b(r2)
        L10:
            java.lang.Object r2 = r1.f310h
            f1.n0 r2 = (f1.n0) r2
            boolean r3 = r2 instanceof i0.f2
            if (r3 == 0) goto La1
            i0.f2 r2 = (i0.f2) r2
            sg.p r3 = r2.f5886l
            if (r3 == 0) goto La1
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto La1
            i0.z0 r3 = new i0.z0
            r3.<init>()
            sg.p r4 = r2.f5886l
            if (r4 == 0) goto L2e
            goto L33
        L2e:
            java.lang.String r5 = "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"
            i0.n1.b(r5)
        L33:
            f.l0 r5 = r2.f5884j
            java.util.ArrayList r6 = r3.f6122i
            if (r5 != 0) goto L47
            java.lang.Object r5 = r2.f5882h
            r5.getClass()
            i0.w0 r7 = new i0.w0
            r7.<init>(r5, r4)
            r6.add(r7)
            goto L99
        L47:
            java.lang.Object[] r7 = r5.f2856b
            long[] r5 = r5.f2855a
            int r8 = r5.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L99
            r10 = 0
        L51:
            r11 = r5[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L94
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L6b:
            if (r15 >= r13) goto L91
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L88
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r7[r16]
            r16 = r14
            i0.w0 r14 = new i0.w0
            r14.<init>(r9, r4)
            r6.add(r14)
            goto L8a
        L88:
            r16 = r14
        L8a:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L6b
        L91:
            r9 = r14
            if (r13 != r9) goto L99
        L94:
            if (r10 == r8) goto L99
            int r10 = r10 + 1
            goto L51
        L99:
            r3.h()
            r2.j()
            r1.f310h = r3
        La1:
            java.lang.Object r2 = r1.f310h
            f1.n0 r2 = (f1.n0) r2
            r2.getClass()
            fg.l r3 = r2.n(r0)
            w0.f r4 = w0.m.j()
            w0.f r3 = r4.u(r3)
            r2.g(r0)
            w0.f r4 = r3.j()     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r0 = r22.invoke()     // Catch: java.lang.Throwable -> Lcb
            w0.f.q(r4)     // Catch: java.lang.Throwable -> Lc9
            r3.c()
            r2.h()
            return r0
        Lc9:
            r0 = move-exception
            goto Ld0
        Lcb:
            r0 = move-exception
            w0.f.q(r4)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Ld0:
            r3.c()
            throw r0
    }

    public void S(float r6, float r7, long r8) {
            r5 = this;
            java.lang.Object r0 = r5.f310h
            b5.c r0 = (b5.c) r0
            f1.u r0 = r0.p()
            r1 = 32
            long r1 = r8 >> r1
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r3
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            r0.m(r2, r9)
            r0.b(r6, r7)
            float r6 = java.lang.Float.intBitsToFloat(r1)
            float r6 = -r6
            float r7 = java.lang.Float.intBitsToFloat(r8)
            float r7 = -r7
            r0.m(r6, r7)
            return
    }

    public boolean T(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            java.lang.String r0 = "发送文件失败: AppMsgLogic返回 "
            java.lang.String r1 = "Hchat_file_"
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            r3 = 0
            if (r2 != 0) goto Ld8
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 == 0) goto L13
            goto Ld8
        L13:
            java.io.File r2 = new java.io.File
            r2.<init>(r13)
            boolean r4 = r2.isFile()
            if (r4 != 0) goto L30
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "发送文件失败: 文件不存在 "
            r12.<init>(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.B(r12)
            return r3
        L30:
            java.lang.Object r13 = r11.f310h
            h.Hchat.dexkit.DexFinder r13 = (h.Hchat.dexkit.DexFinder) r13
            java.lang.reflect.Method r13 = r13.sendFileMethod
            if (r13 == 0) goto Ld2
            java.io.File r2 = r11.I(r13, r2)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto Lb6
            boolean r4 = r2.isFile()     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L45
            goto Lb6
        L45:
            java.lang.Object r5 = r11.F(r13, r2, r14)     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L54
            java.lang.String r12 = "发送文件失败: WXMediaMessage创建失败"
            r11.B(r12)     // Catch: java.lang.Throwable -> L51
            return r3
        L51:
            r0 = move-exception
            r12 = r0
            goto Lbc
        L54:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r14.<init>(r1)     // Catch: java.lang.Throwable -> L51
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51
            r14.append(r6)     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = r14.toString()     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = "wx4310bbd51be7d979"
            java.lang.String r7 = "WeChat"
            r14 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L51
            r8 = r12
            java.lang.Object[] r12 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Throwable -> L51
            r14 = 0
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invoke(r13, r14, r12)     // Catch: java.lang.Throwable -> L51
            boolean r13 = r12 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L51
            if (r13 == 0) goto Lb4
            r13 = r12
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> L51
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L51
            if (r13 >= 0) goto Lb4
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L51
            r13.append(r12)     // Catch: java.lang.Throwable -> L51
            java.lang.String r12 = " talker="
            r13.append(r12)     // Catch: java.lang.Throwable -> L51
            r13.append(r8)     // Catch: java.lang.Throwable -> L51
            java.lang.String r12 = " size="
            r13.append(r12)     // Catch: java.lang.Throwable -> L51
            long r0 = r2.length()     // Catch: java.lang.Throwable -> L51
            r13.append(r0)     // Catch: java.lang.Throwable -> L51
            java.lang.String r12 = " attach="
            r13.append(r12)     // Catch: java.lang.Throwable -> L51
            java.lang.String r12 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L51
            r13.append(r12)     // Catch: java.lang.Throwable -> L51
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L51
            r11.B(r12)     // Catch: java.lang.Throwable -> L51
            return r3
        Lb4:
            r12 = 1
            return r12
        Lb6:
            java.lang.String r12 = "发送文件失败: 准备附件失败"
            r11.B(r12)     // Catch: java.lang.Throwable -> L51
            return r3
        Lbc:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "发送文件异常: "
            r13.<init>(r14)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.B(r12)
            return r3
        Ld2:
            java.lang.String r12 = "发送文件失败: API未就绪"
            r11.B(r12)
            return r3
        Ld8:
            java.lang.String r12 = "发送文件失败: talker/filePath为空"
            r11.B(r12)
            return r3
    }

    public boolean U(java.lang.Object r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            java.lang.String r0 = "发送媒体消息失败: AppMsgLogic返回 "
            java.lang.String r1 = "Hchat_media_"
            java.lang.String r2 = "发送媒体消息失败: mediaMessage类型不匹配 "
            boolean r3 = android.text.TextUtils.isEmpty(r13)
            r4 = 0
            if (r3 != 0) goto La6
            if (r12 != 0) goto L11
            goto La6
        L11:
            java.lang.Object r3 = r11.f310h
            h.Hchat.dexkit.DexFinder r3 = (h.Hchat.dexkit.DexFinder) r3
            java.lang.reflect.Method r3 = r3.sendFileMethod
            if (r3 == 0) goto La0
            java.lang.Class[] r5 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L35
            r5 = r5[r4]     // Catch: java.lang.Throwable -> L35
            boolean r5 = r5.isInstance(r12)     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L38
            java.lang.Class r12 = r12.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.String r12 = r12.getName()     // Catch: java.lang.Throwable -> L35
            java.lang.String r12 = r2.concat(r12)     // Catch: java.lang.Throwable -> L35
            r11.B(r12)     // Catch: java.lang.Throwable -> L35
            return r4
        L35:
            r0 = move-exception
            r12 = r0
            goto L8a
        L38:
            boolean r2 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L40
            java.lang.String r14 = "wx4310bbd51be7d979"
        L40:
            r6 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r14.<init>(r1)     // Catch: java.lang.Throwable -> L35
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L35
            r14.append(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r10 = r14.toString()     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = "WeChat"
            r14 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L35
            r5 = r12
            r8 = r13
            java.lang.Object[] r12 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Throwable -> L35
            r13 = 0
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invoke(r3, r13, r12)     // Catch: java.lang.Throwable -> L35
            boolean r13 = r12 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L35
            if (r13 == 0) goto L88
            r13 = r12
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> L35
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L35
            if (r13 >= 0) goto L88
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r13.append(r12)     // Catch: java.lang.Throwable -> L35
            java.lang.String r12 = " talker="
            r13.append(r12)     // Catch: java.lang.Throwable -> L35
            r13.append(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L35
            r11.B(r12)     // Catch: java.lang.Throwable -> L35
            return r4
        L88:
            r12 = 1
            return r12
        L8a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "发送媒体消息异常: "
            r13.<init>(r14)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.B(r12)
            return r4
        La0:
            java.lang.String r12 = "发送媒体消息失败: API未就绪"
            r11.B(r12)
            return r4
        La6:
            java.lang.String r12 = "发送媒体消息失败: talker/mediaMessage为空"
            r11.B(r12)
            return r4
    }

    public void V(b5.c r10) {
            r9 = this;
            java.lang.Object r0 = r10.f469a
            b8.e r0 = (b8.e) r0
            java.lang.Object r1 = r9.f310h
            z7.c r1 = (z7.c) r1
            r4.m r2 = y7.a.f22307a
            r1.sort(r2)
            int r2 = r1.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto Ldb
            java.lang.Object[] r4 = r1.f22584g
            r4 = r4[r3]
            b8.g r4 = (b8.g) r4
            b8.b r5 = r4.f516i
            int r6 = r4.f514g
            r7 = 2
            if (r6 != r7) goto L54
            char r4 = r4.f515h
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.Object r5 = r10.f471c
            b8.h r5 = (b8.h) r5
            if (r5 != 0) goto L3a
            java.lang.Object r5 = r10.f470b
            b8.f r5 = (b8.f) r5
            if (r5 != 0) goto L34
            r5 = r0
        L34:
            b8.h r5 = r5.o()
            r10.f471c = r5
        L3a:
            if (r4 != 0) goto L3e
            goto Lce
        L3e:
            java.lang.String r6 = r5.f517h
            int r6 = r6.length()
            if (r6 != 0) goto L4a
            r5.f517h = r4
            goto Lce
        L4a:
            java.lang.String r6 = r5.f517h
            java.lang.String r4 = r6.concat(r4)
            r5.f517h = r4
            goto Lce
        L54:
            r4 = 0
            if (r6 != 0) goto L8e
            b8.f r5 = r5.l()
            java.lang.String r6 = r5.f512l
            r10.f471c = r4
            java.lang.Object r4 = r10.f470b
            b8.f r4 = (b8.f) r4
            if (r4 != 0) goto L66
            r4 = r0
        L66:
            b8.f r4 = r4.n()
            r4.t(r6)
            r10.f470b = r4
            z7.l r4 = new z7.l
            androidx.lifecycle.x r7 = new androidx.lifecycle.x
            r8 = 3
            r7.<init>(r5, r8)
            r4.<init>(r7)
        L7a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r4.next()
            b8.d r5 = (b8.d) r5
            r5.o(r10)
            goto L7a
        L8a:
            r10.j(r6)
            goto Lce
        L8e:
            r7 = 1
            if (r6 != r7) goto Lc4
            b8.f r5 = r5.l()
            java.lang.String r6 = r5.f512l
            r10.f471c = r4
            java.lang.Object r4 = r10.f470b
            b8.f r4 = (b8.f) r4
            if (r4 != 0) goto La0
            r4 = r0
        La0:
            b8.f r4 = r4.n()
            r4.t(r6)
            r10.f470b = r4
            z7.l r4 = new z7.l
            androidx.lifecycle.x r6 = new androidx.lifecycle.x
            r7 = 3
            r6.<init>(r5, r7)
            r4.<init>(r6)
        Lb4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lce
            java.lang.Object r5 = r4.next()
            b8.d r5 = (b8.d) r5
            r5.o(r10)
            goto Lb4
        Lc4:
            r4 = 3
            if (r6 != r4) goto Ld2
            java.lang.String r4 = r5.getTagName()
            r10.j(r4)
        Lce:
            int r3 = r3 + 1
            goto L12
        Ld2:
            java.lang.String r10 = "Unknown span event: "
            java.lang.String r10 = eh.a.l(r6, r10)
            j8.o.y(r10)
        Ldb:
            return
    }

    public void W(u2.k r5) {
            r4 = this;
            java.lang.Object r0 = r4.f310h
            android.graphics.Region r0 = (android.graphics.Region) r0
            int r1 = r5.f13349a
            int r2 = r5.f13350b
            int r3 = r5.f13351c
            int r5 = r5.f13352d
            r0.set(r1, r2, r3, r5)
            return
    }

    public java.lang.String Y(android.app.Activity r9, java.util.List r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r9 = "分享文件不存在"
            return r9
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r10)
            r0.<init>(r1)
            java.util.Iterator r1 = r10.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r8.f310h
            r8.g r3 = (r8.g) r3
            java.lang.ClassLoader r3 = r3.f11622c
            java.lang.String r4 = "android.support.v4.content.FileProvider"
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r4, r3)
            r4 = 0
            if (r3 == 0) goto L5c
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.io.File> r6 = java.io.File.class
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[]{r7, r5, r6}
            java.lang.String r6 = "getUriForFile"
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethod(r3, r6, r5)
            if (r3 == 0) goto L5c
            java.lang.String r5 = r9.getPackageName()
            java.lang.String r6 = ".external.fileprovider"
            java.lang.String r5 = bc.e.i(r5, r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r9, r5, r2}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r3, r4, r2)
            boolean r3 = r2 instanceof android.net.Uri
            if (r3 == 0) goto L5c
            r4 = r2
            android.net.Uri r4 = (android.net.Uri) r4
        L5c:
            if (r4 == 0) goto L62
            r0.add(r4)
            goto L16
        L62:
            java.lang.String r9 = "无法生成分享文件地址"
            return r9
        L65:
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L6e
            r1 = r2
            goto L6f
        L6e:
            r1 = 0
        L6f:
            android.content.Intent r3 = new android.content.Intent
            if (r1 == 0) goto L76
            java.lang.String r4 = "android.intent.action.SEND_MULTIPLE"
            goto L78
        L76:
            java.lang.String r4 = "android.intent.action.SEND"
        L78:
            r3.<init>(r4)
            r3.setType(r11)
            java.lang.String r11 = "android.intent.extra.STREAM"
            if (r1 == 0) goto L8b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r3.putParcelableArrayListExtra(r11, r1)
            goto L94
        L8b:
            java.lang.Object r1 = tf.m.t1(r0)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r3.putExtra(r11, r1)
        L94:
            boolean r11 = og.m.t0(r12)
            if (r11 != 0) goto L9f
            java.lang.String r11 = "android.intent.extra.TEXT"
            r3.putExtra(r11, r12)
        L9f:
            android.content.ContentResolver r11 = r9.getContentResolver()
            java.lang.Object r10 = tf.m.t1(r10)
            java.io.File r10 = (java.io.File) r10
            java.lang.String r10 = r10.getName()
            java.lang.Object r12 = tf.m.t1(r0)
            android.net.Uri r12 = (android.net.Uri) r12
            android.content.ClipData r10 = android.content.ClipData.newUri(r11, r10, r12)
            int r11 = r0.size()
            r12 = r2
        Lbc:
            if (r12 < r11) goto Lc9
            r3.setClipData(r10)
            r3.addFlags(r2)
            java.lang.String r9 = A(r9, r3)
            return r9
        Lc9:
            android.content.ClipData$Item r1 = new android.content.ClipData$Item
            java.lang.Object r4 = r0.get(r12)
            android.net.Uri r4 = (android.net.Uri) r4
            r1.<init>(r4)
            r10.addItem(r1)
            int r12 = r12 + 1
            goto Lbc
    }

    public boolean Z(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, byte[] r16, java.lang.String r17) {
            r8 = this;
            java.lang.String r4 = "songLyric"
            java.lang.String r6 = "songAlbumUrl"
            java.lang.String r0 = "musicUrl"
            java.lang.String r2 = "musicDataUrl"
            r1 = r12
            r3 = r13
            r5 = r14
            r7 = r15
            java.lang.Object[] r12 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.lang.Object[][] r12 = q(r12)
            java.lang.String r2 = "description"
            java.lang.String r4 = "thumbData"
            java.lang.String r0 = "title"
            r1 = r10
            r3 = r11
            r5 = r16
            java.lang.Object[] r10 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5}
            java.lang.Object[][] r10 = q(r10)
            java.lang.String r11 = "com.tencent.mm.opensdk.modelmsg.WXMusicObject"
            java.lang.Object r10 = r8.D(r11, r12, r10)
            if (r10 == 0) goto L38
            r11 = r17
            boolean r9 = r8.U(r10, r9, r11)
            if (r9 == 0) goto L38
            r9 = 1
            return r9
        L38:
            r9 = 0
            return r9
    }

    @Override // i.q1, i.n1
    public boolean a() {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            hb.c r0 = (hb.c) r0
            r0.getClass()
            r0 = 0
            return r0
    }

    @Override // i.n1
    public long b(i.q r2, i.q r3, i.q r4) {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            hb.c r0 = (hb.c) r0
            long r2 = r0.b(r2, r3, r4)
            return r2
    }

    public void b0() {
            r3 = this;
            java.lang.Object r0 = r3.f310h
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L7
            goto L3f
        L7:
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L1d
            boolean r1 = r0.onCheckIsTextEditor()
            if (r1 == 0) goto L14
            goto L1d
        L14:
            android.view.View r1 = r0.getRootView()
            android.view.View r1 = r1.findFocus()
            goto L21
        L1d:
            r0.requestFocus()
            r1 = r0
        L21:
            if (r1 != 0) goto L2e
            android.view.View r0 = r0.getRootView()
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r1)
        L2e:
            if (r1 == 0) goto L3f
            boolean r0 = r1.hasWindowFocus()
            if (r0 == 0) goto L3f
            g3.g r0 = new g3.g
            r2 = 0
            r0.<init>(r1, r2)
            r1.post(r0)
        L3f:
            return
    }

    @Override // j8.l
    public void c(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            j8.q r0 = (j8.q) r0
            r0.c(r2)
            return
    }

    public void c0(float r2, float r3) {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            b5.c r0 = (b5.c) r0
            f1.u r0 = r0.p()
            r0.m(r2, r3)
            return
    }

    @Override // u4.a
    public void d(u4.b r2) {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            z4.g r0 = (z4.g) r0
            int r2 = r2.f13365a
            r0.l(r2)
            return
    }

    @Override // y2.b0
    public long e(u2.k r9, long r10, u2.m r12, long r13) {
            r8 = this;
            java.lang.Object r0 = r8.f310h
            fg.a r0 = (fg.a) r0
            java.lang.Object r0 = r0.invoke()
            u2.j r0 = (u2.j) r0
            long r0 = r0.f13347a
            int r2 = r9.f13349a
            r3 = 32
            long r4 = r0 >> r3
            int r4 = (int) r4
            int r2 = r2 + r4
            long r4 = r13 >> r3
            int r4 = (int) r4
            long r5 = r10 >> r3
            int r5 = (int) r5
            u2.m r6 = u2.m.f13354g
            r7 = 1
            if (r12 != r6) goto L21
            r12 = r7
            goto L22
        L21:
            r12 = 0
        L22:
            int r12 = l.c.a(r2, r4, r5, r12)
            int r9 = r9.f13350b
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            int r9 = r9 + r0
            long r13 = r13 & r4
            int r13 = (int) r13
            long r10 = r10 & r4
            int r10 = (int) r10
            int r9 = l.c.a(r9, r13, r10, r7)
            long r10 = (long) r12
            long r10 = r10 << r3
            long r12 = (long) r9
            long r12 = r12 & r4
            long r9 = r10 | r12
            return r9
    }

    public void f(int r1, h3.g r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            return
    }

    @Override // i.n1
    public i.q g(i.q r2, i.q r3, i.q r4) {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            hb.c r0 = (hb.c) r0
            i.q r2 = r0.g(r2, r3, r4)
            return r2
    }

    @Override // z7.s
    public java.lang.Object get(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            b8.f r0 = (b8.f) r0
            z7.c r0 = r0.f511k
            java.lang.Object[] r0 = r0.f22584g
            r2 = r0[r2]
            b8.d r2 = (b8.d) r2
            return r2
    }

    public java.lang.String i(java.lang.Class r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            java.lang.Object r0 = r7.f310h
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.reflect.Method r0 = r0.sendFileAttachPathMethod
            r1 = 0
            java.lang.String r2 = ""
            if (r0 != 0) goto Lc
            goto L1f
        Lc:
            java.lang.String r3 = p(r9)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10, r11}     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r3)     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L1f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r0 = r2
        L20:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L27
            return r0
        L27:
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredMethods(r8)     // Catch: java.lang.Throwable -> L7c
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L7c
        L2f:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L7c
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L7c
            java.lang.Class[] r3 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L7c
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r0)     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L2f
            java.lang.Class r4 = r0.getReturnType()     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L2f
            int r4 = r3.length     // Catch: java.lang.Throwable -> L7c
            r6 = 3
            if (r4 != r6) goto L2f
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L7c
            if (r4 != r5) goto L2f
            r4 = 1
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L7c
            if (r4 != r5) goto L2f
            r4 = 2
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L7c
            if (r3 == r5) goto L61
            goto L2f
        L61:
            java.lang.String r3 = p(r9)     // Catch: java.lang.Throwable -> L74
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10, r11}     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r3)     // Catch: java.lang.Throwable -> L74
            boolean r3 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L74
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L74
            goto L75
        L74:
            r0 = r2
        L75:
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L2f
            return r0
        L7c:
            return r2
    }

    public boolean j(java.io.File r7, java.io.File r8) {
            r6 = this;
            r0 = 0
            r1 = 0
            java.io.File r2 = r8.getParentFile()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L19
            boolean r3 = r2.isDirectory()     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L19
            boolean r2 = r2.mkdirs()     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L19
            goto L7a
        L16:
            r7 = move-exception
            r8 = r1
            goto L58
        L19:
            boolean r2 = r8.isFile()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L2c
            long r2 = r8.length()     // Catch: java.lang.Throwable -> L16
            long r4 = r7.length()     // Catch: java.lang.Throwable -> L16
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2c
            goto L53
        L2c:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L16
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L16
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55
            r7.<init>(r8, r0)     // Catch: java.lang.Throwable -> L55
            r8 = 8192(0x2000, float:1.148E-41)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L44
        L3a:
            int r1 = r2.read(r8)     // Catch: java.lang.Throwable -> L44
            if (r1 <= 0) goto L4a
            r7.write(r8, r0, r1)     // Catch: java.lang.Throwable -> L44
            goto L3a
        L44:
            r8 = move-exception
            r1 = r8
            r8 = r7
            r7 = r1
        L48:
            r1 = r2
            goto L58
        L4a:
            r7.flush()     // Catch: java.lang.Throwable -> L44
            r2.close()     // Catch: java.lang.Throwable -> L50
        L50:
            r7.close()     // Catch: java.lang.Throwable -> L53
        L53:
            r7 = 1
            return r7
        L55:
            r7 = move-exception
            r8 = r1
            goto L48
        L58:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "复制附件异常: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L7b
            r2.append(r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L7b
            r6.B(r7)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L75
            r1.close()     // Catch: java.lang.Throwable -> L75
        L75:
            if (r8 == 0) goto L7a
            r8.close()     // Catch: java.lang.Throwable -> L7a
        L7a:
            return r0
        L7b:
            r7 = move-exception
            if (r1 == 0) goto L81
            r1.close()     // Catch: java.lang.Throwable -> L81
        L81:
            if (r8 == 0) goto L86
            r8.close()     // Catch: java.lang.Throwable -> L86
        L86:
            throw r7
    }

    public h3.g l(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void m() {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            i0.o r0 = (i0.o) r0
            r0.getClass()
            return
    }

    @Override // i.n1
    public i.q n(long r8, i.q r10, i.q r11, i.q r12) {
            r7 = this;
            java.lang.Object r0 = r7.f310h
            r1 = r0
            hb.c r1 = (hb.c) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            i.q r8 = r1.n(r2, r4, r5, r6)
            return r8
    }

    public java.lang.String o(java.lang.Class r7) {
            r6 = this;
            java.lang.Object r0 = r6.f310h
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.reflect.Method r0 = r0.sendFileAttachDirMethod
            r1 = 0
            r2 = 0
            java.lang.String r3 = ""
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r2, r4)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L1a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1a
            goto L1b
        L1a:
            r0 = r3
        L1b:
            boolean r4 = C(r0)
            if (r4 == 0) goto L26
            java.lang.String r7 = p(r0)
            return r7
        L26:
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r7)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L69
        L2e:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L69
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L69
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r0)     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L2e
            java.lang.Class r4 = r0.getReturnType()     // Catch: java.lang.Throwable -> L69
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L2e
            java.lang.Class[] r4 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L69
            int r4 = r4.length     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L50
            goto L2e
        L50:
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r2, r4)     // Catch: java.lang.Throwable -> L5d
            boolean r4 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L5d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L5d
            goto L5e
        L5d:
            r0 = r3
        L5e:
            boolean r4 = C(r0)     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L2e
            java.lang.String r7 = p(r0)     // Catch: java.lang.Throwable -> L69
            return r7
        L69:
            return r3
    }

    @Override // j8.l
    public void onSuccess(java.io.File r2) {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            j8.q r0 = (j8.q) r0
            r0.onSuccess(r2)
            return
    }

    public h3.g r(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // z7.r
    public int size() {
            r1 = this;
            java.lang.Object r0 = r1.f310h
            b8.f r0 = (b8.f) r0
            z7.c r0 = r0.f511k
            int r0 = r0.size()
            return r0
    }

    public i.z t(int r2) {
            r1 = this;
            int r0 = r1.f309g
            switch(r0) {
                case 19: goto Lf;
                case 20: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r1.f310h
            i.z r2 = (i.z) r2
            return r2
        La:
            java.lang.Object r2 = r1.f310h
            i.a0 r2 = (i.a0) r2
            return r2
        Lf:
            java.lang.Object r0 = r1.f310h
            i.a0[] r0 = (i.a0[]) r0
            r2 = r0[r2]
            return r2
    }

    public int u(int r4) {
            r3 = this;
            if (r4 < 0) goto Lc
            java.lang.Object r0 = r3.f310h
            int[] r0 = (int[]) r0
            int r1 = r0.length
            if (r4 >= r1) goto Lc
            r4 = r0[r4]
            return r4
        Lc:
            c6.a r0 = new c6.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r1 = 0
            java.lang.String r2 = "Instruction index out of bounds: %d"
            r0.<init>(r1, r2, r4)
            throw r0
    }

    @Override // i.n1
    public i.q w(long r8, i.q r10, i.q r11, i.q r12) {
            r7 = this;
            java.lang.Object r0 = r7.f310h
            r1 = r0
            hb.c r1 = (hb.c) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            i.q r8 = r1.w(r2, r4, r5, r6)
            return r8
    }

    public int x(int r3, boolean r4) {
            r2 = this;
            java.lang.Object r0 = r2.f310h
            int[] r0 = (int[]) r0
            int r0 = java.util.Arrays.binarySearch(r0, r3)
            if (r0 >= 0) goto L21
            if (r4 != 0) goto L10
            int r3 = ~r0
            int r3 = r3 + (-1)
            return r3
        L10:
            c6.b r4 = new c6.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0 = 0
            java.lang.String r1 = "No instruction at offset %d"
            r4.<init>(r0, r1, r3)
            throw r4
        L21:
            return r0
    }

    public void y() {
            r3 = this;
            java.lang.Object r0 = r3.f310h
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1a
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.os.IBinder r0 = r0.getWindowToken()
            r2 = 0
            r1.hideSoftInputFromWindow(r0, r2)
        L1a:
            return
    }

    public void z(float r10, float r11, float r12, float r13) {
            r9 = this;
            java.lang.Object r0 = r9.f310h
            b5.c r0 = (b5.c) r0
            f1.u r1 = r0.p()
            long r2 = r0.v()
            r4 = 32
            long r2 = r2 >> r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r12 = r12 + r10
            float r2 = r2 - r12
            long r5 = r0.v()
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r12 = (int) r5
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r13 = r13 + r11
            float r12 = r12 - r13
            int r13 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r13
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r12
            long r2 = r2 << r4
            long r12 = r12 & r7
            long r12 = r12 | r2
            long r2 = r12 >> r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L4c
            long r4 = r12 & r7
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L4c
            goto L51
        L4c:
            java.lang.String r2 = "Width and height must be greater than or equal to zero"
            f1.g0.a(r2)
        L51:
            r0.U(r12)
            r1.m(r10, r11)
            return
    }
}
