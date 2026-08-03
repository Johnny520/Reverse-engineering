package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f6781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f6782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f6783d;

    public f() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f6781b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6782c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6783d = r0
            r0 = 1
            r1.f6780a = r0
            return
    }

    public f(android.content.Context r1, h.Hchat.dexkit.DexFinder r2, i8.f r3) {
            r0 = this;
            r0.<init>()
            r0.f6782c = r1
            r0.f6781b = r2
            return
    }

    public f(bc.g r2) {
            r1 = this;
            r1.<init>()
            od.b r0 = new od.b
            r0.<init>()
            r1.f6781b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f6782c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f6783d = r0
            boolean r2 = r2.B
            r1.f6780a = r2
            return
    }

    public f(s.b0 r1, v1.j1 r2, s.a1 r3) {
            r0 = this;
            r0.<init>()
            r0.f6781b = r1
            r0.f6782c = r2
            r0.f6783d = r3
            r1 = 1
            r0.f6780a = r1
            return
    }

    public f(java.lang.Object[] r1, int r2, java.util.Comparator r3) {
            r0 = this;
            r0.<init>()
            r0.f6781b = r1
            r0.f6782c = r3
            return
    }

    public static java.lang.Object B(java.lang.Class r4) {
            r0 = 0
            if (r4 == 0) goto L52
            boolean r1 = r4.isPrimitive()
            if (r1 == 0) goto La
            goto L52
        La:
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L25
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Constructor r1 = h.Hchat.utils.KavaReflector.findConstructor(r4, r1)     // Catch: java.lang.Throwable -> L25
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L25
            return r4
        L25:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r4)     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L52
        L2d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L52
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L52
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L40
            goto L2d
        L40:
            java.lang.Class r3 = r2.getType()     // Catch: java.lang.Throwable -> L52
            boolean r3 = r4.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L4b
            goto L2d
        L4b:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r0)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L2d
            return r2
        L52:
            return r0
    }

    public static boolean i(byte[] r11) {
            r0 = 0
            if (r11 != 0) goto L5
            goto Laa
        L5:
            int r1 = r11.length
            r2 = 6
            r3 = 1
            if (r1 < r2) goto L23
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.US_ASCII
            r1.<init>(r11, r0, r2, r4)
            java.lang.String r4 = "GIF87a"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto La9
            java.lang.String r4 = "GIF89a"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L23
            goto La9
        L23:
            int r1 = r11.length
            r4 = 80
            r5 = 8
            r6 = 10
            r7 = 3
            r8 = 2
            r9 = 255(0xff, float:3.57E-43)
            if (r1 < r5) goto L5f
            r1 = r11[r0]
            r1 = r1 & r9
            r10 = 137(0x89, float:1.92E-43)
            if (r1 != r10) goto L5f
            r1 = r11[r3]
            if (r1 != r4) goto L5f
            r1 = r11[r8]
            r10 = 78
            if (r1 != r10) goto L5f
            r1 = r11[r7]
            r10 = 71
            if (r1 != r10) goto L5f
            r1 = 4
            r1 = r11[r1]
            r10 = 13
            if (r1 != r10) goto L5f
            r1 = 5
            r1 = r11[r1]
            if (r1 != r6) goto L5f
            r1 = r11[r2]
            r2 = 26
            if (r1 != r2) goto L5f
            r1 = 7
            r1 = r11[r1]
            if (r1 != r6) goto L5f
            goto La9
        L5f:
            int r1 = r11.length
            if (r1 < r7) goto L74
            r1 = r11[r0]
            r1 = r1 & r9
            if (r1 != r9) goto L74
            r1 = r11[r3]
            r1 = r1 & r9
            r2 = 216(0xd8, float:3.03E-43)
            if (r1 != r2) goto L74
            r1 = r11[r8]
            r1 = r1 & r9
            if (r1 != r9) goto L74
            goto La9
        L74:
            int r1 = r11.length
            r2 = 12
            if (r1 < r2) goto Laa
            r1 = r11[r0]
            r2 = 82
            if (r1 != r2) goto Laa
            r1 = r11[r3]
            r2 = 73
            if (r1 != r2) goto Laa
            r1 = r11[r8]
            r2 = 70
            if (r1 != r2) goto Laa
            r1 = r11[r7]
            if (r1 != r2) goto Laa
            r1 = r11[r5]
            r2 = 87
            if (r1 != r2) goto Laa
            r1 = 9
            r1 = r11[r1]
            r2 = 69
            if (r1 != r2) goto Laa
            r1 = r11[r6]
            r2 = 66
            if (r1 != r2) goto Laa
            r1 = 11
            r11 = r11[r1]
            if (r11 != r4) goto Laa
        La9:
            return r3
        Laa:
            return r0
    }

    public static java.lang.String k(java.lang.String r4) {
            java.lang.String r0 = ""
            if (r4 == 0) goto L9
            java.lang.String r4 = r4.trim()
            goto La
        L9:
            r4 = r0
        La:
            if (r4 == 0) goto L40
            int r1 = r4.length()
            r2 = 32
            if (r1 == r2) goto L15
            goto L40
        L15:
            r1 = 0
        L16:
            int r2 = r4.length()
            if (r1 >= r2) goto L3b
            char r2 = r4.charAt(r1)
            r3 = 48
            if (r2 < r3) goto L28
            r3 = 57
            if (r2 <= r3) goto L38
        L28:
            r3 = 97
            if (r2 < r3) goto L30
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L38
        L30:
            r3 = 65
            if (r2 < r3) goto L40
            r3 = 70
            if (r2 > r3) goto L40
        L38:
            int r1 = r1 + 1
            goto L16
        L3b:
            java.lang.String r4 = r4.toLowerCase()
            return r4
        L40:
            return r0
    }

    public static java.lang.String s(java.lang.Object r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r2, r0)
            if (r2 != 0) goto Ld
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r1, r3)
        Ld:
            if (r2 == 0) goto L14
            java.lang.String r1 = java.lang.String.valueOf(r2)
            return r1
        L14:
            java.lang.String r1 = ""
            return r1
    }

    public static void z(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Field r4 = h.Hchat.utils.KavaReflector.findFieldRecursive(r0, r4)
            if (r4 != 0) goto Lb
            return
        Lb:
            java.lang.Class r0 = r4.getType()
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 0
            if (r0 != r1) goto L23
            boolean r0 = r5 instanceof java.lang.Number
            if (r0 == 0) goto L1e
            java.lang.Number r5 = (java.lang.Number) r5
            int r2 = r5.intValue()
        L1e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            goto L4e
        L23:
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L39
            boolean r0 = r5 instanceof java.lang.Number
            if (r0 == 0) goto L32
            java.lang.Number r5 = (java.lang.Number) r5
            long r0 = r5.longValue()
            goto L34
        L32:
            r0 = 0
        L34:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            goto L4e
        L39:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L4e
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L4a
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4a
            r2 = 1
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
        L4e:
            h.Hchat.utils.KavaReflector.writeField(r4, r3, r5)
            return
    }

    public java.lang.Object A(java.lang.reflect.Method r3) {
            r2 = this;
            if (r3 == 0) goto L2d
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r0 == 0) goto L9
            goto L2d
        L9:
            java.lang.Object r0 = r2.f6781b
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.Object r0 = ig.a.A(r0, r1)
            if (r0 == 0) goto L18
            return r0
        L18:
            java.lang.Class r3 = r3.getDeclaringClass()
            if (r3 != 0) goto L1f
            goto L2d
        L1f:
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Constructor r3 = h.Hchat.utils.KavaReflector.findConstructor(r3, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r3, r0)     // Catch: java.lang.Throwable -> L2d
            return r3
        L2d:
            r3 = 0
            return r3
    }

    public boolean a() {
            r1 = this;
            java.lang.Object r0 = r1.f6781b
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.reflect.Method r0 = r0.emojiSendMethod
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public byte[] b(byte[] r5) {
            r4 = this;
            int r0 = r5.length
            if (r0 == 0) goto La5
            boolean r0 = i(r5)
            if (r0 == 0) goto Lb
            goto La5
        Lb:
            java.lang.String r0 = "定位WXAM转换方法失败: "
            monitor-enter(r4)
            boolean r1 = r4.f6780a     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L18
            java.lang.Object r0 = r4.f6783d     // Catch: java.lang.Throwable -> La2
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> La2
            monitor-exit(r4)
            goto L75
        L18:
            r1 = 1
            r4.f6780a = r1     // Catch: java.lang.Throwable -> La2
            java.lang.Object r1 = r4.f6781b     // Catch: java.lang.Throwable -> L2c
            h.Hchat.dexkit.DexFinder r1 = (h.Hchat.dexkit.DexFinder) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r1 = r1.emojiDecodeDataMethod     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2e
            java.lang.Class r1 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2c
            goto L34
        L2c:
            r1 = move-exception
            goto L5d
        L2e:
            java.lang.Class<j8.f> r1 = j8.f.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2c
        L34:
            java.lang.String r2 = "com.tencent.mm.plugin.gif.MMWXGFJNI"
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r2, r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "nativeWxamToGif"
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L70
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r1)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L70
            java.lang.Class r2 = r1.getReturnType()     // Catch: java.lang.Throwable -> L2c
            java.lang.Class<byte[]> r3 = byte[].class
            if (r2 != r3) goto L70
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.accessible(r1)     // Catch: java.lang.Throwable -> L2c
            r4.f6783d = r1     // Catch: java.lang.Throwable -> L2c
            goto L70
        L5d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> La2
            r2.append(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> La2
            r4.j(r0)     // Catch: java.lang.Throwable -> La2
        L70:
            java.lang.Object r0 = r4.f6783d     // Catch: java.lang.Throwable -> La2
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> La2
            monitor-exit(r4)
        L75:
            r1 = 0
            if (r0 != 0) goto L79
            return r1
        L79:
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L89
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r5)     // Catch: java.lang.Throwable -> L89
            boolean r0 = r5 instanceof byte[]     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L8b
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L89
            r1 = r5
            goto L8b
        L89:
            r5 = move-exception
            goto L8c
        L8b:
            return r1
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "转换WXAM表情失败: "
            r0.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.j(r5)
            return r1
        La2:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La2
            throw r5
        La5:
            return r5
    }

    public byte[] c(java.lang.String r7) {
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            byte[] r2 = r6.r(r0)
            boolean r3 = i(r2)
            if (r3 == 0) goto L18
            return r2
        L18:
            java.lang.String r3 = k(r7)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L30
            boolean r4 = r0.isFile()
            if (r4 == 0) goto L30
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = k(r0)
        L30:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L74
            java.lang.Object r0 = r6.g(r3)     // Catch: java.lang.Throwable -> L71
            java.lang.Object r3 = r6.f6781b     // Catch: java.lang.Throwable -> L71
            h.Hchat.dexkit.DexFinder r3 = (h.Hchat.dexkit.DexFinder) r3     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r4 = r3.emojiDecodeDataMethod     // Catch: java.lang.Throwable -> L71
            java.lang.reflect.Method r3 = r3.emojiDecodeManagerGetterMethod     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L52
            if (r4 == 0) goto L52
            if (r3 != 0) goto L49
            goto L52
        L49:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L71
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r3, r1, r5)     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto L54
        L52:
            r0 = r1
            goto L62
        L54:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r4, r3, r0)     // Catch: java.lang.Throwable -> L71
            boolean r3 = r0 instanceof byte[]     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L52
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L71
        L62:
            if (r0 == 0) goto L74
            int r3 = r0.length     // Catch: java.lang.Throwable -> L71
            if (r3 <= 0) goto L74
            byte[] r7 = r6.b(r0)     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L73
            int r1 = r7.length     // Catch: java.lang.Throwable -> L71
            if (r1 <= 0) goto L73
            return r7
        L71:
            r7 = move-exception
            goto L91
        L73:
            return r0
        L74:
            java.lang.String r7 = r6.t(r7)     // Catch: java.lang.Throwable -> L71
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L71
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L71
            byte[] r7 = r6.r(r0)     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto La6
            int r0 = r7.length     // Catch: java.lang.Throwable -> L71
            if (r0 <= 0) goto La6
            byte[] r0 = r6.b(r7)     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L90
            int r1 = r0.length     // Catch: java.lang.Throwable -> L71
            if (r1 <= 0) goto L90
            return r0
        L90:
            return r7
        L91:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "解码表情数据失败: "
            r0.<init>(r3)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.j(r7)
        La6:
            if (r2 == 0) goto Lac
            int r7 = r2.length
            if (r7 <= 0) goto Lac
            r1 = r2
        Lac:
            return r1
    }

    public java.lang.String d(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.Object r0 = r2.f6781b
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.reflect.Method r0 = r0.emojiFilePathMethod
            if (r0 == 0) goto L1b
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L18
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L18:
            java.lang.String r3 = ""
            return r3
        L1b:
            java.lang.String r3 = bc.e.i(r3, r5)
            return r3
    }

    public java.lang.String e(java.io.File r7) {
            r6 = this;
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L4c
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L4c
            r7 = 8192(0x2000, float:1.148E-41)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L1b
        L10:
            int r0 = r2.read(r7)     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            if (r0 <= 0) goto L1e
            r1.update(r7, r3, r0)     // Catch: java.lang.Throwable -> L1b
            goto L10
        L1b:
            r7 = move-exception
            r0 = r2
            goto L4d
        L1e:
            byte[] r7 = r1.digest()     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            int r1 = r7.length     // Catch: java.lang.Throwable -> L1b
            int r1 = r1 * 2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            int r1 = r7.length     // Catch: java.lang.Throwable -> L1b
        L2b:
            if (r3 >= r1) goto L44
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L1b
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 16
            if (r4 >= r5) goto L3a
            r5 = 48
            r0.append(r5)     // Catch: java.lang.Throwable -> L1b
        L3a:
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Throwable -> L1b
            r0.append(r4)     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 + 1
            goto L2b
        L44:
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L1b
            r2.close()     // Catch: java.lang.Throwable -> L4b
        L4b:
            return r7
        L4c:
            r7 = move-exception
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = "计算表情md5失败: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L6d
            r1.append(r7)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L6d
            r6.j(r7)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = ""
            if (r0 == 0) goto L6c
            r0.close()     // Catch: java.lang.Throwable -> L6c
        L6c:
            return r7
        L6d:
            r7 = move-exception
            if (r0 == 0) goto L73
            r0.close()     // Catch: java.lang.Throwable -> L73
        L73:
            throw r7
    }

    public ud.l f(ud.e r17, java.lang.Object r18, boolean r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.Object r2 = r0.f6781b
            od.b r2 = (od.b) r2
            boolean r3 = r0.f6780a
            r4 = 0
            if (r3 != 0) goto Lf
            goto Le5
        Lf:
            r3 = r17
            ud.u r5 = r3.f13688k
            boolean r6 = r1 instanceof java.lang.Integer
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L9d
            r6 = r1
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r9 = r0.f6783d
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r6)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L2b
        L28:
            r9 = r4
            goto L9a
        L2b:
            ud.e r10 = r5.f13761t
            if (r10 != 0) goto L30
            goto L28
        L30:
            java.lang.String r11 = "/"
            r12 = 2
            java.lang.String[] r11 = r9.split(r11, r12)
            int r13 = r11.length
            if (r13 == r12) goto L3b
            goto L28
        L3b:
            r12 = r11[r8]
            r11 = r11[r7]
            java.util.List r13 = r10.f13699v
            java.util.Iterator r13 = r13.iterator()
        L45:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L78
            java.lang.Object r14 = r13.next()
            ud.e r14 = (ud.e) r14
            od.a r15 = r14.f13690m
            java.lang.String r15 = r15.f9766h
            boolean r15 = r15.equals(r12)
            if (r15 == 0) goto L45
            java.util.List r6 = r14.f13698u
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L28
            java.lang.Object r9 = r6.next()
            ud.g r9 = (ud.g) r9
            od.c r10 = r9.f13707l
            java.lang.String r10 = r10.f9774h
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L61
            goto L9a
        L78:
            r11 = 47
            r12 = 46
            java.lang.String r9 = r9.replace(r11, r12)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Not found resource field with id: "
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r6 = ", name: "
            r11.append(r6)
            r11.append(r9)
            java.lang.String r6 = r11.toString()
            r10.K(r6)
            goto L28
        L9a:
            if (r9 == 0) goto L9d
            return r9
        L9d:
            java.util.HashSet r6 = r2.f9772b
            java.util.concurrent.ConcurrentHashMap r2 = r2.f9771a
            boolean r6 = r6.contains(r1)
            if (r6 != 0) goto Laf
            boolean r6 = r2.containsKey(r1)
            if (r6 == 0) goto Lae
            goto Laf
        Lae:
            r7 = r8
        Laf:
            if (r7 == 0) goto Lb4
            if (r19 != 0) goto Lb4
            goto Le5
        Lb4:
            if (r3 == 0) goto Ldc
            java.lang.Object r6 = r0.f6782c
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r3)
            od.b r6 = (od.b) r6
            if (r6 == 0) goto Ld0
            java.util.concurrent.ConcurrentHashMap r6 = r6.f9771a
            java.lang.Object r6 = r6.get(r1)
            ud.l r6 = (ud.l) r6
            if (r6 == 0) goto Ld0
            if (r7 == 0) goto Lcf
            goto Le5
        Lcf:
            return r6
        Ld0:
            od.a r3 = r3.f13690m
            od.a r3 = r3.f9769k
            if (r3 != 0) goto Ld7
            goto Ldc
        Ld7:
            ud.e r3 = r5.f(r3)
            goto Lb4
        Ldc:
            if (r19 == 0) goto Le5
            java.lang.Object r1 = r2.get(r1)
            ud.l r1 = (ud.l) r1
            return r1
        Le5:
            return r4
    }

    public java.lang.Object g(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.f6781b
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.reflect.Method r0 = r0.emojiGetByMd5Method
            if (r0 != 0) goto Ld
            android.os.Parcelable r4 = r3.q(r4)
            return r4
        Ld:
            java.lang.Object r1 = r3.A(r0)
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r0)
            if (r2 != 0) goto L1e
            if (r1 != 0) goto L1e
            android.os.Parcelable r4 = r3.q(r4)
            return r4
        L1e:
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r2)
            if (r0 == 0) goto L29
            return r0
        L29:
            android.os.Parcelable r4 = r3.q(r4)
            return r4
    }

    public boolean h(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f6781b
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.reflect.Method r0 = r0.emojiCheckGifMethod
            if (r0 == 0) goto L3d
            java.lang.Object r1 = r4.A(r0)     // Catch: java.lang.Throwable -> L27
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r0)     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L14
            if (r1 == 0) goto L3d
        L14:
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r2)     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L3d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L27
            boolean r5 = r0.booleanValue()     // Catch: java.lang.Throwable -> L27
            return r5
        L27:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "检测GIF失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.j(r0)
        L3d:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L46
            goto L62
        L46:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r3 = "key_path"
            r0.putString(r3, r5)
            java.lang.String r3 = "checkGifFile"
            android.os.Bundle r0 = r4.p(r3, r0)
            if (r0 == 0) goto L62
            java.lang.String r2 = "key_data"
            boolean r0 = r0.getBoolean(r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L62:
            if (r2 == 0) goto L69
            boolean r5 = r2.booleanValue()
            return r5
        L69:
            if (r5 == 0) goto L78
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r0 = ".gif"
            boolean r5 = r5.endsWith(r0)
            if (r5 == 0) goto L78
            r1 = 1
        L78:
            return r1
    }

    public void j(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatEmojiApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public java.lang.String l() {
            r3 = this;
            java.lang.Object r0 = r3.f6781b
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.reflect.Method r0 = r0.emojiAccPathMethod
            if (r0 != 0) goto Ld
            java.lang.String r0 = r3.o()
            return r0
        Ld:
            java.lang.Object r1 = r3.A(r0)
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r0)
            if (r2 != 0) goto L1e
            if (r1 != 0) goto L1e
            java.lang.String r0 = r3.o()
            return r0
        L1e:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r1, r2)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L2e
            java.lang.String r0 = r3.o()
            return r0
        L2e:
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L3b
            java.lang.String r0 = r3.o()
            return r0
        L3b:
            java.lang.String r1 = "/"
            boolean r2 = r0.endsWith(r1)
            if (r2 == 0) goto L44
            return r0
        L44:
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    public void m(int r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.f6781b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0[r4]
            r2 = r0[r5]
            r0[r4] = r2
            r0[r5] = r1
            return
    }

    public java.lang.Object n(java.io.File r23, java.lang.String r24) {
            r22 = this;
            r1 = r22
            r2 = r24
            java.lang.Object r0 = r1.f6781b
            r3 = r0
            h.Hchat.dexkit.DexFinder r3 = (h.Hchat.dexkit.DexFinder) r3
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = r1.l()
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            r9 = 0
            if (r8 == 0) goto L24
            java.lang.String r0 = "发表情失败: 获取微信表情目录失败"
            r1.j(r0)
            return r9
        L24:
            java.lang.String r8 = ""
            java.lang.String r10 = r1.d(r7, r8, r2)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L36
            java.lang.String r0 = "发表情失败: 获取微信表情目标路径失败"
            r1.j(r0)
            return r9
        L36:
            java.io.File r11 = new java.io.File
            r11.<init>(r10)
            java.io.File r12 = r11.getParentFile()     // Catch: java.lang.Throwable -> L23c
            if (r12 == 0) goto L58
            boolean r13 = r12.isDirectory()     // Catch: java.lang.Throwable -> L51
            if (r13 != 0) goto L58
            boolean r12 = r12.mkdirs()     // Catch: java.lang.Throwable -> L51
            if (r12 != 0) goto L58
            r17 = r9
            goto L264
        L51:
            r0 = move-exception
            r12 = r9
            r14 = r12
            r17 = r14
            goto L242
        L58:
            boolean r12 = r11.isFile()     // Catch: java.lang.Throwable -> L23c
            if (r12 == 0) goto L6d
            long r12 = r11.length()     // Catch: java.lang.Throwable -> L51
            long r14 = r23.length()     // Catch: java.lang.Throwable -> L51
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L6d
            r13 = r23
            goto L95
        L6d:
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L23c
            r13 = r23
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L23c
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L236
            r14.<init>(r11, r0)     // Catch: java.lang.Throwable -> L236
            r11 = 8192(0x2000, float:1.148E-41)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> L87
        L7d:
            int r15 = r12.read(r11)     // Catch: java.lang.Throwable -> L87
            if (r15 <= 0) goto L8c
            r14.write(r11, r0, r15)     // Catch: java.lang.Throwable -> L87
            goto L7d
        L87:
            r0 = move-exception
            r17 = r9
            goto L242
        L8c:
            r14.flush()     // Catch: java.lang.Throwable -> L87
            r12.close()     // Catch: java.lang.Throwable -> L92
        L92:
            r14.close()     // Catch: java.lang.Throwable -> L95
        L95:
            java.lang.String r10 = r13.getAbsolutePath()
            boolean r10 = r1.h(r10)
            if (r10 == 0) goto La1
            r10 = 2
            goto La2
        La1:
            r10 = r4
        La2:
            long r11 = r13.length()
            r13 = 0
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 > 0) goto Lae
            r11 = r0
            goto Lba
        Lae:
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 <= 0) goto Lb9
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto Lba
        Lb9:
            int r11 = (int) r11
        Lba:
            java.lang.reflect.Method r12 = r3.emojiCreateInfoMethod
            if (r12 == 0) goto Ldd
            java.lang.Object r13 = r1.A(r12)
            boolean r14 = h.Hchat.utils.KavaReflector.isStatic(r12)
            if (r14 != 0) goto Lca
            if (r13 == 0) goto Ldd
        Lca:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r14 = new java.lang.Object[]{r2, r6, r14, r15}
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invoke(r12, r13, r14)
            if (r12 == 0) goto Ldd
            goto L123
        Ldd:
            boolean r12 = android.text.TextUtils.isEmpty(r2)
            if (r12 == 0) goto Le4
            goto L105
        Le4:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            java.lang.String r13 = "key_md5"
            r12.putString(r13, r2)
            java.lang.String r13 = "key_group"
            r12.putInt(r13, r0)
            java.lang.String r0 = "key_type"
            r12.putInt(r0, r10)
            java.lang.String r0 = "key_size"
            r12.putInt(r0, r11)
            java.lang.String r0 = "createEmojiInfo"
            android.os.Bundle r0 = r1.p(r0, r12)
            if (r0 != 0) goto L107
        L105:
            r12 = r9
            goto L123
        L107:
            java.lang.reflect.Method r12 = r3.emojiSendMethod     // Catch: java.lang.Throwable -> L11d
            if (r12 == 0) goto L114
            java.lang.Class r12 = r12.getDeclaringClass()     // Catch: java.lang.Throwable -> L11d
            java.lang.ClassLoader r12 = r12.getClassLoader()     // Catch: java.lang.Throwable -> L11d
            goto L11a
        L114:
            java.lang.Class<j8.f> r12 = j8.f.class
            java.lang.ClassLoader r12 = r12.getClassLoader()     // Catch: java.lang.Throwable -> L11d
        L11a:
            r0.setClassLoader(r12)     // Catch: java.lang.Throwable -> L11d
        L11d:
            java.lang.String r12 = "key_emoji_info"
            android.os.Parcelable r12 = r0.getParcelable(r12)
        L123:
            r0 = 320(0x140, float:4.48E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r13 = "field_temp"
            java.lang.String r14 = "field_groupId"
            java.lang.String r15 = "field_state"
            r16 = r4
            java.lang.String r4 = "field_start"
            r17 = r9
            java.lang.String r9 = "field_size"
            r18 = r7
            java.lang.String r7 = "field_type"
            r19 = r10
            java.lang.String r10 = "field_catalog"
            r23 = r11
            java.lang.String r11 = "field_md5"
            if (r12 != 0) goto L148
            r20 = r10
            goto L196
        L148:
            z(r12, r11, r2)     // Catch: java.lang.Throwable -> L17c
            z(r12, r10, r6)     // Catch: java.lang.Throwable -> L17c
            r20 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)     // Catch: java.lang.Throwable -> L17a
            z(r12, r7, r10)     // Catch: java.lang.Throwable -> L17a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> L17a
            z(r12, r9, r10)     // Catch: java.lang.Throwable -> L17a
            z(r12, r4, r6)     // Catch: java.lang.Throwable -> L17a
            z(r12, r15, r6)     // Catch: java.lang.Throwable -> L17a
            java.lang.String r10 = "field_needupload"
            z(r12, r10, r5)     // Catch: java.lang.Throwable -> L17a
            z(r12, r14, r8)     // Catch: java.lang.Throwable -> L17a
            java.lang.String r10 = "field_width"
            z(r12, r10, r0)     // Catch: java.lang.Throwable -> L17a
            java.lang.String r10 = "field_height"
            z(r12, r10, r0)     // Catch: java.lang.Throwable -> L17a
            z(r12, r13, r5)     // Catch: java.lang.Throwable -> L17a
            goto L196
        L17a:
            r0 = move-exception
            goto L17f
        L17c:
            r0 = move-exception
            r20 = r10
        L17f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r21 = r0
            java.lang.String r0 = "准备本地表情信息失败: "
            r10.<init>(r0)
            java.lang.String r0 = r21.getMessage()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r1.j(r0)
        L196:
            java.lang.reflect.Method r0 = r3.emojiUpdateInfoMethod
            if (r0 == 0) goto L19c
            if (r12 != 0) goto L19f
        L19c:
            r21 = r12
            goto L1cf
        L19f:
            java.lang.Object r10 = r1.A(r0)     // Catch: java.lang.Throwable -> L1b7
            boolean r21 = h.Hchat.utils.KavaReflector.isStatic(r0)     // Catch: java.lang.Throwable -> L1b7
            if (r21 != 0) goto L1ab
            if (r10 == 0) goto L19c
        L1ab:
            r21 = r12
            java.lang.Object[] r12 = new java.lang.Object[]{r21}     // Catch: java.lang.Throwable -> L1b5
            h.Hchat.utils.KavaReflector.invoke(r0, r10, r12)     // Catch: java.lang.Throwable -> L1b5
            goto L1cf
        L1b5:
            r0 = move-exception
            goto L1ba
        L1b7:
            r0 = move-exception
            r21 = r12
        L1ba:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "更新本地表情信息失败: "
            r10.<init>(r12)
            java.lang.String r0 = r0.getMessage()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r1.j(r0)
        L1cf:
            java.lang.reflect.Method r0 = r3.emojiSendMethod
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0 = r0[r16]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L222
            java.lang.reflect.Constructor r0 = h.Hchat.utils.KavaReflector.findConstructor(r0, r3)     // Catch: java.lang.Throwable -> L222
            java.lang.Object[] r3 = new java.lang.Object[]{r18}     // Catch: java.lang.Throwable -> L222
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstance(r0, r3)     // Catch: java.lang.Throwable -> L222
            z(r0, r11, r2)     // Catch: java.lang.Throwable -> L222
            r3 = 65
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L222
            r10 = r20
            z(r0, r10, r3)     // Catch: java.lang.Throwable -> L222
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)     // Catch: java.lang.Throwable -> L222
            z(r0, r7, r3)     // Catch: java.lang.Throwable -> L222
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> L222
            z(r0, r9, r3)     // Catch: java.lang.Throwable -> L222
            z(r0, r4, r6)     // Catch: java.lang.Throwable -> L222
            z(r0, r15, r6)     // Catch: java.lang.Throwable -> L222
            z(r0, r14, r8)     // Catch: java.lang.Throwable -> L222
            java.lang.String r3 = "field_name"
            z(r0, r3, r8)     // Catch: java.lang.Throwable -> L222
            java.lang.String r3 = "field_content"
            z(r0, r3, r8)     // Catch: java.lang.Throwable -> L222
            java.lang.String r3 = "field_reserved4"
            z(r0, r3, r6)     // Catch: java.lang.Throwable -> L222
            z(r0, r13, r5)     // Catch: java.lang.Throwable -> L222
            r9 = r0
            goto L224
        L222:
            r9 = r17
        L224:
            if (r9 == 0) goto L228
            r12 = r9
            goto L22a
        L228:
            r12 = r21
        L22a:
            if (r12 != 0) goto L235
            java.lang.String r0 = "发表情失败: 创建临时EmojiInfo失败 "
            java.lang.String r0 = r0.concat(r2)
            r1.j(r0)
        L235:
            return r12
        L236:
            r0 = move-exception
            r17 = r9
            r14 = r17
            goto L242
        L23c:
            r0 = move-exception
            r17 = r9
            r12 = r17
            r14 = r12
        L242:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26e
            r2.<init>()     // Catch: java.lang.Throwable -> L26e
            java.lang.String r3 = "复制表情文件异常: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L26e
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L26e
            r2.append(r0)     // Catch: java.lang.Throwable -> L26e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L26e
            r1.j(r0)     // Catch: java.lang.Throwable -> L26e
            if (r12 == 0) goto L25f
            r12.close()     // Catch: java.lang.Throwable -> L25f
        L25f:
            if (r14 == 0) goto L264
            r14.close()     // Catch: java.lang.Throwable -> L264
        L264:
            java.lang.String r0 = "发表情失败: 复制到微信表情目录失败 "
            java.lang.String r0 = r0.concat(r10)
            r1.j(r0)
            return r17
        L26e:
            r0 = move-exception
            if (r12 == 0) goto L274
            r12.close()     // Catch: java.lang.Throwable -> L274
        L274:
            if (r14 == 0) goto L279
            r14.close()     // Catch: java.lang.Throwable -> L279
        L279:
            throw r0
    }

    public java.lang.String o() {
            r3 = this;
            java.lang.String r0 = "getAccPath"
            r1 = 0
            android.os.Bundle r0 = r3.p(r0, r1)
            java.lang.String r1 = ""
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.String r2 = "path"
            java.lang.String r0 = r0.getString(r2, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L19
            return r1
        L19:
            java.lang.String r1 = "/"
            boolean r2 = r0.endsWith(r1)
            if (r2 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    public android.os.Bundle p(java.lang.String r6, android.os.Bundle r7) {
            r5 = this;
            java.lang.Object r0 = r5.f6782c
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "content://"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L29
            r3.append(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = ".storage.provider.emotion/"
            r3.append(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L29
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L29
            android.os.Bundle r6 = r2.call(r0, r6, r1, r7)     // Catch: java.lang.Throwable -> L29
            return r6
        L29:
            r7 = move-exception
            java.lang.String r0 = "EmotionProvider调用失败: "
            java.lang.String r2 = " "
            java.lang.StringBuilder r6 = bc.e.o(r0, r6, r2)
            java.lang.String r7 = r7.getMessage()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.j(r6)
            return r1
    }

    public android.os.Parcelable q(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L19
        L7:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_md5"
            r0.putString(r1, r3)
            java.lang.String r3 = "getEmojiByMd5"
            android.os.Bundle r3 = r2.p(r3, r0)
            if (r3 != 0) goto L1b
        L19:
            r3 = 0
            return r3
        L1b:
            java.lang.Object r0 = r2.f6781b     // Catch: java.lang.Throwable -> L35
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0     // Catch: java.lang.Throwable -> L35
            java.lang.reflect.Method r0 = r0.emojiSendMethod     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L2c
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L35
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L35
            goto L32
        L2c:
            java.lang.Class<j8.f> r0 = j8.f.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L35
        L32:
            r3.setClassLoader(r0)     // Catch: java.lang.Throwable -> L35
        L35:
            java.lang.String r0 = "key_emoji_info"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            return r3
    }

    public byte[] r(java.io.File r7) {
            r6 = this;
            boolean r0 = r7.isFile()
            r1 = 0
            if (r0 == 0) goto L70
            long r2 = r7.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L70
            long r2 = r7.length()
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1d
            goto L70
        L1d:
            long r2 = r7.length()     // Catch: java.lang.Throwable -> L49
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L49
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L49
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L49
            r7 = 0
            r4 = r7
        L2b:
            if (r4 >= r0) goto L3a
            int r5 = r0 - r4
            int r5 = r3.read(r2, r4, r5)     // Catch: java.lang.Throwable -> L38
            if (r5 >= 0) goto L36
            goto L3a
        L36:
            int r4 = r4 + r5
            goto L2b
        L38:
            r7 = move-exception
            goto L4b
        L3a:
            if (r4 != r0) goto L40
            r3.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            return r2
        L40:
            byte[] r0 = new byte[r4]     // Catch: java.lang.Throwable -> L38
            java.lang.System.arraycopy(r2, r7, r0, r7, r4)     // Catch: java.lang.Throwable -> L38
            r3.close()     // Catch: java.lang.Throwable -> L48
        L48:
            return r0
        L49:
            r7 = move-exception
            r3 = r1
        L4b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "读取表情文件失败: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L69
            r0.append(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r6.j(r7)     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L70
            r3.close()     // Catch: java.lang.Throwable -> L70
            goto L70
        L69:
            r7 = move-exception
            if (r3 == 0) goto L6f
            r3.close()     // Catch: java.lang.Throwable -> L6f
        L6f:
            throw r7
        L70:
            return r1
    }

    public java.lang.String t(java.lang.String r9) {
            r8 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = ""
            if (r0 == 0) goto La
            goto L90
        La:
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r2 = r0.isFile()
            r3 = 0
            if (r2 == 0) goto L24
            long r5 = r0.length()
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L24
            java.lang.String r9 = r0.getAbsolutePath()
            return r9
        L24:
            java.lang.String r9 = k(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L2f
            goto L90
        L2f:
            java.lang.String r0 = r8.l()     // Catch: java.lang.Throwable -> L5c
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L3a
            goto L90
        L3a:
            java.lang.String r2 = r8.d(r0, r1, r9)     // Catch: java.lang.Throwable -> L5c
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L5e
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r5.isFile()     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L5e
            long r6 = r5.length()     // Catch: java.lang.Throwable -> L5c
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5e
            java.lang.String r9 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L5c
            return r9
        L5c:
            r9 = move-exception
            goto L91
        L5e:
            java.lang.Object r2 = r8.g(r9)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L6d
            java.lang.String r5 = "getGroupId"
            java.lang.String r6 = "field_groupId"
            java.lang.String r2 = s(r2, r5, r6)     // Catch: java.lang.Throwable -> L5c
            goto L6e
        L6d:
            r2 = r1
        L6e:
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L90
            java.lang.String r9 = r8.d(r0, r2, r9)     // Catch: java.lang.Throwable -> L5c
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L5c
            boolean r9 = r0.isFile()     // Catch: java.lang.Throwable -> L5c
            if (r9 == 0) goto L90
            long r5 = r0.length()     // Catch: java.lang.Throwable -> L5c
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto L90
            java.lang.String r9 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L5c
            return r9
        L90:
            return r1
        L91:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "解析表情文件路径失败: "
            r0.<init>(r2)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.j(r9)
            return r1
    }

    public void u(int r10, int r11) {
            r9 = this;
            java.lang.Object r0 = r9.f6782c
            java.util.Comparator r0 = (java.util.Comparator) r0
            java.lang.Object r1 = r9.f6781b
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            if (r11 > r10) goto Lc
            goto L6c
        Lc:
            int r2 = r11 - r10
            int r2 = r2 / 2
            int r2 = r2 + r10
            r3 = r1[r2]
            r9.f6783d = r3
            r4 = 0
            r5 = 1
            if (r10 != r2) goto L2a
            r1 = r1[r11]
            if (r3 != r1) goto L1e
            goto L22
        L1e:
            int r4 = r0.compare(r1, r3)
        L22:
            if (r4 >= 0) goto L6c
            r9.m(r10, r11)
            r9.f6780a = r5
            return
        L2a:
            r2 = r10
            r3 = r11
        L2c:
            if (r2 > r3) goto L62
        L2e:
            r6 = r1[r2]
            java.lang.Object r7 = r9.f6783d
            if (r7 != r6) goto L36
            r6 = r4
            goto L3a
        L36:
            int r6 = r0.compare(r6, r7)
        L3a:
            if (r6 >= 0) goto L3f
            int r2 = r2 + 1
            goto L2e
        L3f:
            r7 = r1[r3]
            java.lang.Object r8 = r9.f6783d
            if (r8 != r7) goto L47
            r7 = r4
            goto L4b
        L47:
            int r7 = r0.compare(r7, r8)
        L4b:
            if (r7 <= 0) goto L50
            int r3 = r3 + (-1)
            goto L3f
        L50:
            if (r2 > r3) goto L2c
            if (r2 == r3) goto L5d
            if (r6 > 0) goto L58
            if (r7 >= 0) goto L5d
        L58:
            r9.m(r2, r3)
            r9.f6780a = r5
        L5d:
            int r2 = r2 + 1
            int r3 = r3 + (-1)
            goto L2c
        L62:
            if (r10 >= r3) goto L67
            r9.u(r10, r3)
        L67:
            if (r2 >= r11) goto L6c
            r9.u(r2, r11)
        L6c:
            return
    }

    public boolean v(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "发表情失败: 微信表情库不存在 "
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r1 != 0) goto L77
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L10
            goto L77
        L10:
            boolean r1 = r4.a()
            if (r1 != 0) goto L1c
            java.lang.String r5 = "发表情失败: API未就绪"
            r4.j(r5)
            return r2
        L1c:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r1.isFile()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L2e
            boolean r5 = r4.y(r1, r5)     // Catch: java.lang.Throwable -> L2c
            return r5
        L2c:
            r5 = move-exception
            goto L61
        L2e:
            java.lang.String r6 = k(r6)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L3e
            java.lang.String r5 = "发表情失败: 不是有效md5，且文件不存在"
            r4.j(r5)     // Catch: java.lang.Throwable -> L2c
            return r2
        L3e:
            java.lang.Object r1 = r4.g(r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L54
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            r5.append(r6)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2c
            r4.j(r5)     // Catch: java.lang.Throwable -> L2c
            return r2
        L54:
            boolean r6 = r4.w(r5, r6)     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L5c
            r5 = 1
            return r5
        L5c:
            boolean r5 = r4.x(r1, r5)     // Catch: java.lang.Throwable -> L2c
            return r5
        L61:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "发表情异常: "
            r6.<init>(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.j(r5)
            return r2
        L77:
            java.lang.String r5 = "发表情失败: talker/emoji为空"
            r4.j(r5)
            return r2
    }

    public boolean w(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.lang.Object r0 = r6.f6782c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r6.f6781b
            h.Hchat.dexkit.DexFinder r1 = (h.Hchat.dexkit.DexFinder) r1
            java.lang.reflect.Method r1 = r1.emojiManagerSendMethod
            r2 = 0
            if (r1 == 0) goto L5c
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 == 0) goto L14
            goto L5c
        L14:
            java.lang.Object r3 = r6.A(r1)     // Catch: java.lang.Throwable -> L46
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r1)     // Catch: java.lang.Throwable -> L46
            if (r4 != 0) goto L21
            if (r3 != 0) goto L21
            goto L5c
        L21:
            java.lang.Class[] r4 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L46
            r5 = 3
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = B(r4)     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r7, r8, r4, r5}     // Catch: java.lang.Throwable -> L46
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r1, r3, r7)     // Catch: java.lang.Throwable -> L46
            boolean r8 = r7 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L5c
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L46
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L46
            if (r7 == 0) goto L5c
            r7 = 1
            return r7
        L46:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "原生表情管理发送失败: "
            r8.<init>(r0)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.j(r7)
        L5c:
            return r2
    }

    public boolean x(java.lang.Object r10, java.lang.String r11) {
            r9 = this;
            java.lang.Object r0 = r9.f6781b
            h.Hchat.dexkit.DexFinder r0 = (h.Hchat.dexkit.DexFinder) r0
            java.lang.reflect.Method r0 = r0.emojiSendMethod
            java.lang.Object r1 = r9.A(r0)
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r0)
            r3 = 0
            if (r2 != 0) goto L25
            if (r1 != 0) goto L25
            java.lang.Class r10 = r0.getDeclaringClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "发表情失败: 无法创建发送器 "
            java.lang.String r10 = r11.concat(r10)
            r9.j(r10)
            return r3
        L25:
            java.lang.Class[] r2 = r0.getParameterTypes()
            int r4 = r2.length
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = r3
        L2d:
            int r6 = r2.length
            r7 = 1
            if (r5 >= r6) goto L8e
            r6 = r2[r5]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r5 != 0) goto L3c
            if (r6 != r8) goto L3c
            r4[r5] = r11
            goto L8b
        L3c:
            if (r5 != r7) goto L47
            boolean r7 = r6.isInstance(r10)
            if (r7 == 0) goto L47
            r4[r5] = r10
            goto L8b
        L47:
            java.lang.Class r7 = java.lang.Long.TYPE
            if (r6 == r7) goto L83
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            if (r6 != r7) goto L50
            goto L83
        L50:
            java.lang.Class r7 = java.lang.Integer.TYPE
            if (r6 == r7) goto L7c
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            if (r6 != r7) goto L59
            goto L7c
        L59:
            java.lang.Class r7 = java.lang.Boolean.TYPE
            if (r6 == r7) goto L77
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
            if (r6 != r7) goto L62
            goto L77
        L62:
            if (r6 != r8) goto L69
            java.lang.String r6 = ""
            r4[r5] = r6
            goto L8b
        L69:
            r7 = 3
            if (r5 != r7) goto L73
            java.lang.Object r6 = B(r6)
            r4[r5] = r6
            goto L8b
        L73:
            r6 = 0
            r4[r5] = r6
            goto L8b
        L77:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4[r5] = r6
            goto L8b
        L7c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r4[r5] = r6
            goto L8b
        L83:
            r6 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4[r5] = r6
        L8b:
            int r5 = r5 + 1
            goto L2d
        L8e:
            h.Hchat.utils.KavaReflector.invoke(r0, r1, r4)
            return r7
    }

    public boolean y(java.io.File r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.a()
            r1 = 0
            if (r0 != 0) goto Ld
            java.lang.String r4 = "发表情失败: 本地路径API未就绪"
            r3.j(r4)
            return r1
        Ld:
            java.lang.String r0 = r3.e(r4)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1d
            java.lang.String r4 = "发表情失败: 计算本地文件md5失败"
            r3.j(r4)
            return r1
        L1d:
            java.lang.Object r2 = r3.g(r0)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2a
            java.lang.Object r2 = r3.n(r4, r0)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r4 = move-exception
            goto L3a
        L2a:
            if (r2 != 0) goto L2d
            return r1
        L2d:
            boolean r4 = r3.w(r5, r0)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L35
            r4 = 1
            return r4
        L35:
            boolean r4 = r3.x(r2, r5)     // Catch: java.lang.Throwable -> L28
            return r4
        L3a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "发表情本地路径异常: "
            r5.<init>(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.j(r4)
            return r1
    }
}
