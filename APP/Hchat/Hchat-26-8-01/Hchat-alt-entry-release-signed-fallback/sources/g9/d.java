package g9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final og.k f4395g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4396h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f4397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f4398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f4399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.Handler f4400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Set f4401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Map f4402f;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "[0-9a-fA-F]{32}"
            r0.<init>(r1)
            g9.d.f4395g = r0
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [-119, 80, 78, 71, 13, 10, 26, 10} // fill-array
            g9.d.f4396h = r0
            return
    }

    public d(r8.g r1, ab.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f4397a = r1
            r0.f4398b = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_emoji_save_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f4399c = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f4400d = r1
            java.util.Set r1 = j8.b.o()
            r0.f4401e = r1
            java.util.Map r1 = p.a.p()
            r0.f4402f = r1
            return
    }

    public static java.lang.Number c(java.lang.Object r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r3, r0)
            boolean r0 = r3 instanceof java.lang.Number
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.Number r3 = (java.lang.Number) r3
            goto L10
        Lf:
            r3 = r1
        L10:
            if (r3 == 0) goto L13
            return r3
        L13:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r2, r4)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            goto L1f
        L1e:
            r3 = r1
        L1f:
            if (r3 == 0) goto L22
            return r3
        L22:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r5)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L2d
            java.lang.Number r2 = (java.lang.Number) r2
            return r2
        L2d:
            return r1
    }

    public static java.lang.String d(java.lang.Object r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r1, r2, r0)
            if (r2 == 0) goto L10
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L10
            return r2
        L10:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r1, r3)
            if (r2 == 0) goto L1b
            java.lang.String r1 = r2.toString()
            return r1
        L1b:
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r4)
            if (r1 == 0) goto L26
            java.lang.String r1 = r1.toString()
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 == 0) goto L2a
            return r1
        L2a:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.Object e(int r9, java.lang.Object r10, java.util.Set r11) {
            r0 = 0
            if (r10 == 0) goto Lf1
            r1 = 5
            if (r9 > r1) goto Lf1
            boolean r1 = r11.add(r10)
            if (r1 != 0) goto Le
            goto Lf1
        Le:
            java.lang.String r1 = "field_msgId"
            java.lang.String r2 = "msgId"
            java.lang.String r3 = "getMsgId"
            java.lang.Number r1 = c(r10, r3, r1, r2)
            r2 = 0
            if (r1 == 0) goto L1c
            goto L2c
        L1c:
            java.lang.String r1 = "getMsgID"
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r10, r1, r3)
            boolean r3 = r1 instanceof java.lang.Number
            if (r3 == 0) goto L2b
            java.lang.Number r1 = (java.lang.Number) r1
            goto L2c
        L2b:
            r1 = r0
        L2c:
            java.lang.String r3 = "com.tencent.mm.storage."
            boolean r3 = eh.a.z(r3, r10, r2)
            r4 = 1
            if (r3 == 0) goto L47
            if (r1 == 0) goto L47
            long r5 = r1.longValue()
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L43
            r1 = r4
            goto L44
        L43:
            r1 = r2
        L44:
            if (r1 != r4) goto L47
            return r10
        L47:
            boolean r1 = r10 instanceof android.view.View
            if (r1 == 0) goto L57
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r10 = r10.getTag()
            int r9 = r9 + r4
            java.lang.Object r9 = e(r9, r10, r11)
            return r9
        L57:
            boolean r1 = r10 instanceof java.lang.Object[]
            if (r1 == 0) goto L6e
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            int r1 = r10.length
        L5e:
            if (r2 >= r1) goto Lf1
            r3 = r10[r2]
            int r5 = r9 + 1
            java.lang.Object r3 = e(r5, r3, r11)
            if (r3 == 0) goto L6b
            return r3
        L6b:
            int r2 = r2 + 1
            goto L5e
        L6e:
            boolean r1 = r10 instanceof java.util.Collection
            if (r1 == 0) goto L8b
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L78:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Lf1
            java.lang.Object r1 = r10.next()
            int r2 = r9 + 1
            java.lang.Object r1 = e(r2, r1, r11)
            if (r1 == 0) goto L78
            return r1
        L8b:
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "java."
            boolean r3 = og.t.d0(r1, r3, r2)
            if (r3 != 0) goto Lf1
            java.lang.String r3 = "android."
            boolean r1 = og.t.d0(r1, r3, r2)
            if (r1 == 0) goto La4
            goto Lf1
        La4:
            java.lang.Class r1 = r10.getClass()
        La8:
            if (r1 == 0) goto Lf1
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lf1
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        Lba:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lec
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r5 = r3.getType()
            boolean r5 = r5.isPrimitive()
            if (r5 != 0) goto Lba
            java.lang.Class r5 = r3.getType()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto Ldd
            goto Lba
        Ldd:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r10)
            if (r3 == 0) goto Lba
            int r5 = r9 + 1
            java.lang.Object r3 = e(r5, r3, r11)
            if (r3 == 0) goto Lba
            return r3
        Lec:
            java.lang.Class r1 = r1.getSuperclass()
            goto La8
        Lf1:
            return r0
    }

    public static boolean f(java.io.File r6, byte[] r7) {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L1e
            r0.write(r7)     // Catch: java.lang.Throwable -> L25
            r0.close()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r6.isFile()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            long r2 = r6.length()     // Catch: java.lang.Throwable -> L1e
            int r7 = r7.length     // Catch: java.lang.Throwable -> L1e
            long r4 = (long) r7     // Catch: java.lang.Throwable -> L1e
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L20
            r1 = 1
            goto L20
        L1e:
            r7 = move-exception
            goto L2c
        L20:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L1e
            goto L32
        L25:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L27
        L27:
            r1 = move-exception
            ig.a.i(r0, r7)     // Catch: java.lang.Throwable -> L1e
            throw r1     // Catch: java.lang.Throwable -> L1e
        L2c:
            sf.f r0 = new sf.f
            r0.<init>(r7)
            r7 = r0
        L32:
            java.lang.Throwable r0 = sf.g.b(r7)
            if (r0 != 0) goto L39
            goto L3e
        L39:
            r6.delete()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L3e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            return r6
    }

    public final java.io.File a(byte[] r10) {
            r9 = this;
            java.io.File r0 = new java.io.File
            r8.g r1 = r9.f4397a
            android.content.Context r2 = r1.f11620a
            android.content.Context r2 = r2.getApplicationContext()
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            android.content.Context r2 = r1.f11620a
        Lf:
            r1 = 0
            r3 = 0
            java.io.File[] r4 = r2.getExternalMediaDirs()     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L25
            int r5 = r4.length     // Catch: java.lang.Throwable -> L23
            r6 = r1
        L19:
            if (r6 >= r5) goto L25
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto L20
            goto L2c
        L20:
            int r6 = r6 + 1
            goto L19
        L23:
            r4 = move-exception
            goto L27
        L25:
            r7 = r3
            goto L2c
        L27:
            sf.f r7 = new sf.f
            r7.<init>(r4)
        L2c:
            boolean r4 = r7 instanceof sf.f
            if (r4 == 0) goto L31
            r7 = r3
        L31:
            java.io.File r7 = (java.io.File) r7
            java.io.File r4 = new java.io.File
            if (r7 == 0) goto L38
            goto L47
        L38:
            java.io.File r7 = new java.io.File
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r5 = "/storage/emulated/0/Android/media/"
            java.lang.String r2 = wb.en.g(r5, r2)
            r7.<init>(r2)
        L47:
            java.lang.String r2 = "Hchat"
            r4.<init>(r7, r2)
            java.lang.String r2 = "Emoji"
            r0.<init>(r4, r2)
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L5e
            boolean r2 = r0.mkdirs()
            if (r2 != 0) goto L5e
            return r3
        L5e:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMdd_HHmmss_SSS"
            java.util.Locale r4 = java.util.Locale.US
            r2.<init>(r3, r4)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r2 = r2.format(r3)
            java.io.File r3 = new java.io.File
            int r4 = r10.length
            r5 = 6
            if (r4 < r5) goto L92
            java.lang.String r6 = "GIF87a"
            java.lang.String r7 = "GIF89a"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}
            java.util.Set r6 = tf.d0.W(r6)
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = og.a.f9805b
            r7.<init>(r10, r1, r5, r8)
            boolean r5 = r6.contains(r7)
            if (r5 == 0) goto L92
            java.lang.String r10 = ".gif"
            goto Le2
        L92:
            r5 = 8
            if (r4 < r5) goto La5
            byte[] r6 = tf.l.t0(r10, r1, r5)
            byte[] r7 = g9.d.f4396h
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 == 0) goto La5
            java.lang.String r10 = ".png"
            goto Le2
        La5:
            r6 = 3
            if (r4 < r6) goto Lbc
            r6 = r10[r1]
            r7 = -1
            if (r6 != r7) goto Lbc
            r6 = 1
            r6 = r10[r6]
            r8 = -40
            if (r6 != r8) goto Lbc
            r6 = 2
            r6 = r10[r6]
            if (r6 != r7) goto Lbc
            java.lang.String r10 = ".jpg"
            goto Le2
        Lbc:
            r6 = 12
            if (r4 < r6) goto Le0
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r6 = og.a.f9805b
            r7 = 4
            r4.<init>(r10, r1, r7, r6)
            java.lang.String r1 = "RIFF"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto Le0
            java.lang.String r1 = new java.lang.String
            r1.<init>(r10, r5, r7, r6)
            java.lang.String r10 = "WEBP"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto Le0
            java.lang.String r10 = ".webp"
            goto Le2
        Le0:
            java.lang.String r10 = ".bin"
        Le2:
            java.lang.String r1 = "Hchat_emoji_"
            java.lang.String r10 = eh.a.n(r1, r2, r10)
            r3.<init>(r0, r10)
            return r3
    }

    public final boolean b(java.lang.reflect.Method r4, de.robv.android.xposed.XC_MethodHook r5) {
            r3 = this;
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L60
            java.lang.Class r0 = r4.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L15
            goto L60
        L15:
            java.util.Set r0 = r3.f4401e
            boolean r1 = r0.add(r4)
            if (r1 != 0) goto L1f
            r4 = 1
            return r4
        L1f:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L28
            goto L29
        L28:
            r2 = r4
        L29:
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r5 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r5)
            r5 = r1
        L36:
            java.lang.Throwable r1 = sf.g.b(r5)
            if (r1 != 0) goto L3d
            goto L59
        L3d:
            r0.remove(r4)
            java.lang.String r4 = r4.toGenericString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "保存表情菜单 Hook 安装失败: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            ab.b r5 = r3.f4398b
            r5.invoke(r4, r1)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            return r4
        L60:
            r4 = 0
            return r4
    }
}
