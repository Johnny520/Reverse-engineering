package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f10329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.ClassLoader f10330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final org.luckypray.dexkit.DexKitBridge f10331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m8.a f10332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g8.a f10333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g8.i f10334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r8.g f10335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f10336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Object f10337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f10338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Object f10339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile p8.y f10340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f10341n;

    public d0(android.content.Context r1, h.Hchat.dexkit.DexFinder r2, java.lang.ClassLoader r3, org.luckypray.dexkit.DexKitBridge r4, m8.a r5, g8.a r6, g8.i r7, r8.g r8, i8.f r9) {
            r0 = this;
            r0.<init>()
            r0.f10328a = r1
            r0.f10329b = r2
            r0.f10330c = r3
            r0.f10331d = r4
            r0.f10332e = r5
            r0.f10333f = r6
            r0.f10334g = r7
            r0.f10335h = r8
            p8.a0 r1 = new p8.a0
            r2 = 0
            r1.<init>(r0, r2)
            sf.d r2 = sf.d.f12415g
            sf.c r1 = be.h.G(r2, r1)
            r0.f10336i = r1
            p8.a0 r1 = new p8.a0
            r3 = 1
            r1.<init>(r0, r3)
            sf.c r1 = be.h.G(r2, r1)
            r0.f10337j = r1
            p8.a0 r1 = new p8.a0
            r3 = 2
            r1.<init>(r0, r3)
            sf.c r1 = be.h.G(r2, r1)
            r0.f10338k = r1
            p8.a0 r1 = new p8.a0
            r3 = 3
            r1.<init>(r0, r3)
            sf.c r1 = be.h.G(r2, r1)
            r0.f10339l = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f10341n = r1
            return
    }

    public static java.lang.Object a(java.lang.String r12, java.lang.reflect.Method r13) {
            java.lang.Class[] r13 = r13.getParameterTypes()
            r13.getClass()
            r0 = 2
            java.lang.Object r13 = tf.l.C0(r0, r13)
            java.lang.Class r13 = (java.lang.Class) r13
            r0 = 0
            if (r13 == 0) goto Ld5
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r2 = r13.equals(r1)
            if (r2 == 0) goto L1a
            return r12
        L1a:
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.reflect.Constructor r3 = h.Hchat.utils.KavaReflector.findConstructor(r13, r3)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r3, r4)
            if (r3 == 0) goto Ld5
            java.util.List r13 = h.Hchat.utils.KavaReflector.declaredMethods(r13)
            java.util.Iterator r4 = r13.iterator()
            r6 = r0
            r5 = r2
        L33:
            boolean r7 = r4.hasNext()
            java.lang.Class r8 = java.lang.Void.TYPE
            r9 = 1
            if (r7 == 0) goto L71
            java.lang.Object r7 = r4.next()
            r10 = r7
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 != 0) goto L67
            java.lang.Class r11 = r10.getReturnType()
            boolean r11 = gg.l.a(r11, r8)
            if (r11 == 0) goto L67
            java.lang.Class[] r10 = r10.getParameterTypes()
            java.lang.Class[] r11 = new java.lang.Class[]{r1}
            boolean r10 = java.util.Arrays.equals(r10, r11)
            if (r10 == 0) goto L67
            r10 = r9
            goto L68
        L67:
            r10 = r2
        L68:
            if (r10 == 0) goto L33
            if (r5 == 0) goto L6e
        L6c:
            r6 = r0
            goto L74
        L6e:
            r6 = r7
            r5 = r9
            goto L33
        L71:
            if (r5 != 0) goto L74
            goto L6c
        L74:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto Ld5
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            h.Hchat.utils.KavaReflector.invokeOrThrow(r6, r3, r12)
            java.util.Iterator r12 = r13.iterator()
            r1 = r0
            r13 = r2
        L85:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto Lc1
            java.lang.Object r4 = r12.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto Lb8
            java.lang.Class r6 = r5.getReturnType()
            boolean r6 = gg.l.a(r6, r8)
            if (r6 == 0) goto Lb8
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.Class r6 = java.lang.Integer.TYPE
            java.lang.Class[] r6 = new java.lang.Class[]{r6}
            boolean r5 = java.util.Arrays.equals(r5, r6)
            if (r5 == 0) goto Lb8
            r5 = r9
            goto Lb9
        Lb8:
            r5 = r2
        Lb9:
            if (r5 == 0) goto L85
            if (r13 == 0) goto Lbe
            goto Lc5
        Lbe:
            r1 = r4
            r13 = r9
            goto L85
        Lc1:
            if (r13 != 0) goto Lc4
            goto Lc5
        Lc4:
            r0 = r1
        Lc5:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Ld4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r3, r12)
        Ld4:
            return r3
        Ld5:
            return r0
    }

    public static java.lang.String d(p8.v r4, int r5) {
            int r0 = r4.f10428c
            java.util.ArrayList r1 = r4.f10429d
            r2 = 1
            if (r0 == r2) goto L3b
            r2 = 2
            if (r0 == r2) goto L38
            r3 = 5
            if (r0 == r3) goto L35
            r3 = 15
            if (r0 == r3) goto L35
            r3 = 54
            if (r0 == r3) goto L32
            if (r5 != r2) goto L1e
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L1e
            goto L38
        L1e:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L2f
            java.lang.String r4 = r4.f10427b
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L2f
            java.lang.String r4 = "card"
            return r4
        L2f:
            java.lang.String r4 = "unknown"
            return r4
        L32:
            java.lang.String r4 = "live_photo"
            return r4
        L35:
            java.lang.String r4 = "video"
            return r4
        L38:
            java.lang.String r4 = "text"
            return r4
        L3b:
            java.lang.String r4 = "image"
            return r4
    }

    public static java.lang.String f(java.lang.String r8) {
            java.lang.String r0 = ""
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L5c
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5c
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5c
            r8 = 8192(0x2000, float:1.148E-41)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L62
        L16:
            int r3 = r2.read(r8)     // Catch: java.lang.Throwable -> L62
            r4 = 0
            if (r3 > 0) goto L5e
            r2.close()     // Catch: java.lang.Throwable -> L5c
            byte[] r8 = r1.digest()     // Catch: java.lang.Throwable -> L5c
            r8.getClass()     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            int r2 = r8.length     // Catch: java.lang.Throwable -> L5c
            r3 = r4
        L31:
            if (r4 >= r2) goto L54
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L5c
            r6 = 1
            int r3 = r3 + r6
            if (r3 <= r6) goto L3c
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
        L3c:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "%02x"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = java.lang.String.format(r7, r5)     // Catch: java.lang.Throwable -> L5c
            r1.append(r5)     // Catch: java.lang.Throwable -> L5c
            int r4 = r4 + 1
            goto L31
        L54:
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            goto L6f
        L5c:
            r8 = move-exception
            goto L69
        L5e:
            r1.update(r8, r4, r3)     // Catch: java.lang.Throwable -> L62
            goto L16
        L62:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L64
        L64:
            r1 = move-exception
            ig.a.i(r2, r8)     // Catch: java.lang.Throwable -> L5c
            throw r1     // Catch: java.lang.Throwable -> L5c
        L69:
            sf.f r1 = new sf.f
            r1.<init>(r8)
            r8 = r1
        L6f:
            boolean r1 = r8 instanceof sf.f
            if (r1 == 0) goto L75
            goto L76
        L75:
            r0 = r8
        L76:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static void j(java.lang.Object r0, java.lang.String r1, java.lang.reflect.Method r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            h.Hchat.utils.KavaReflector.invoke(r2, r0, r1)
            return
    }

    public static h.Hchat.hooks.api.model.WeChatSnsMedia m(p8.s r6) {
            java.lang.String r1 = r6.f10412a
            int r2 = r6.f10413b
            java.lang.String r3 = r6.f10414c
            java.lang.String r4 = r6.f10415d
            p8.s r6 = r6.f10417f
            if (r6 == 0) goto L12
            h.Hchat.hooks.api.model.WeChatSnsMedia r6 = m(r6)
        L10:
            r5 = r6
            goto L14
        L12:
            r6 = 0
            goto L10
        L14:
            h.Hchat.hooks.api.model.WeChatSnsMedia r0 = new h.Hchat.hooks.api.model.WeChatSnsMedia
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final java.lang.String b(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "朋友圈视频缩略图生成异常: "
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r13.f10328a
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r3 = "Hchat_sns_thumb"
            r1.<init>(r2, r3)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 != 0) goto L1e
            boolean r2 = r1.mkdirs()
            if (r2 != 0) goto L1e
            goto Le5
        L1e:
            java.io.File r2 = new java.io.File
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L6e
            java.nio.charset.Charset r5 = og.a.f9804a     // Catch: java.lang.Throwable -> L6e
            byte[] r5 = r14.getBytes(r5)     // Catch: java.lang.Throwable -> L6e
            r5.getClass()     // Catch: java.lang.Throwable -> L6e
            byte[] r4 = r4.digest(r5)     // Catch: java.lang.Throwable -> L6e
            r4.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = ""
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r6.<init>()     // Catch: java.lang.Throwable -> L6e
            r6.append(r5)     // Catch: java.lang.Throwable -> L6e
            int r7 = r4.length     // Catch: java.lang.Throwable -> L6e
            r8 = 0
            r9 = r8
        L43:
            if (r8 >= r7) goto L66
            r10 = r4[r8]     // Catch: java.lang.Throwable -> L6e
            r11 = 1
            int r9 = r9 + r11
            if (r9 <= r11) goto L4e
            r6.append(r5)     // Catch: java.lang.Throwable -> L6e
        L4e:
            java.lang.Byte r10 = java.lang.Byte.valueOf(r10)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r12 = "%02x"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L6e
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r10 = java.lang.String.format(r12, r10)     // Catch: java.lang.Throwable -> L6e
            r6.append(r10)     // Catch: java.lang.Throwable -> L6e
            int r8 = r8 + 1
            goto L43
        L66:
            r6.append(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L6e
            goto L75
        L6e:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L75:
            int r5 = r14.hashCode()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r6 = r4 instanceof sf.f
            if (r6 == 0) goto L82
            r4 = r5
        L82:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ".jpg"
            java.lang.String r4 = bc.e.i(r4, r5)
            r2.<init>(r1, r4)
            boolean r1 = r2.isFile()
            r4 = 0
            if (r1 == 0) goto La2
            long r6 = r2.length()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto La2
            java.lang.String r14 = r2.getAbsolutePath()
            return r14
        La2:
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            r1.setDataSource(r14)     // Catch: java.lang.Throwable -> Ld5
            android.graphics.Bitmap r14 = r1.getFrameAtTime()     // Catch: java.lang.Throwable -> Ld5
            if (r14 == 0) goto Le2
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ld5
            r6.<init>(r2)     // Catch: java.lang.Throwable -> Ld5
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> Ldb
            r8 = 85
            r14.compress(r7, r8, r6)     // Catch: java.lang.Throwable -> Ldb
            r6.close()     // Catch: java.lang.Throwable -> Ld5
            r14.recycle()     // Catch: java.lang.Throwable -> Ld5
            boolean r14 = r2.isFile()     // Catch: java.lang.Throwable -> Ld5
            if (r14 == 0) goto Ld7
            long r6 = r2.length()     // Catch: java.lang.Throwable -> Ld5
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 <= 0) goto Ld7
            java.lang.String r3 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld5
            goto Ld7
        Ld5:
            r14 = move-exception
            goto Le6
        Ld7:
            r1.release()     // Catch: java.lang.Throwable -> Lfa
            goto Lfa
        Ldb:
            r14 = move-exception
            throw r14     // Catch: java.lang.Throwable -> Ldd
        Ldd:
            r2 = move-exception
            ig.a.i(r6, r14)     // Catch: java.lang.Throwable -> Ld5
            throw r2     // Catch: java.lang.Throwable -> Ld5
        Le2:
            r1.release()     // Catch: java.lang.Throwable -> Le5
        Le5:
            return r3
        Le6:
            java.lang.String r14 = r14.getMessage()     // Catch: java.lang.Throwable -> Lfb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfb
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lfb
            r2.append(r14)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r14 = r2.toString()     // Catch: java.lang.Throwable -> Lfb
            r13.l(r14)     // Catch: java.lang.Throwable -> Lfb
            goto Ld7
        Lfa:
            return r3
        Lfb:
            r14 = move-exception
            r1.release()     // Catch: java.lang.Throwable -> Lff
        Lff:
            throw r14
    }

    public final p8.f c(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto L4
            java.lang.String r4 = ""
        L4:
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            int r0 = r4.length()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L1a
            p8.f r4 = new p8.f
            r4.<init>(r1, r2)
            return r4
        L1a:
            p8.h r0 = r3.g()
            if (r0 == 0) goto L25
            p8.f r4 = r0.g(r4)
            return r4
        L25:
            p8.f r4 = new p8.f
            r4.<init>(r1, r2)
            return r4
    }

    public final boolean e(java.lang.Object r10, java.lang.String r11) {
            r9 = this;
            r0 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 0
            if (r10 == 0) goto Lcc
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1f
            goto Lcc
        L1f:
            java.lang.CharSequence r11 = og.m.R0(r11)
            java.lang.String r3 = r11.toString()
            int r11 = r3.length()
            if (r11 != 0) goto L2f
            goto Lcc
        L2f:
            java.lang.String r11 = "isExtFlag"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invokeMethod(r10, r11, r0)     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r11 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L3f
            r8 = 0
            if (r0 == 0) goto L42
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r0 = move-exception
            r10 = r0
            goto L9d
        L42:
            r11 = r8
        L43:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3f
            boolean r11 = gg.l.a(r11, r6)     // Catch: java.lang.Throwable -> L3f
            if (r11 != 0) goto L70
            p8.x r11 = r9.h()     // Catch: java.lang.Throwable -> L3f
            if (r11 == 0) goto L68
            java.lang.reflect.Method r11 = r11.f()     // Catch: java.lang.Throwable -> L3f
            if (r11 == 0) goto L68
            r0 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r5 = ""
            r1 = r10
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L3f
            h.Hchat.utils.KavaReflector.invokeOrThrow(r11, r8, r10)     // Catch: java.lang.Throwable -> L3f
            goto L8a
        L68:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r11 = "原生评论方法未就绪"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L3f
            throw r10     // Catch: java.lang.Throwable -> L3f
        L70:
            r1 = r10
            p8.x r10 = r9.h()     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L95
            java.lang.reflect.Method r10 = r10.g()     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L95
            java.lang.Object r11 = a(r3, r10)     // Catch: java.lang.Throwable -> L3f
            if (r11 == 0) goto L8d
            java.lang.Object[] r11 = new java.lang.Object[]{r1, r2, r11, r7}     // Catch: java.lang.Throwable -> L3f
            h.Hchat.utils.KavaReflector.invokeOrThrow(r10, r8, r11)     // Catch: java.lang.Throwable -> L3f
        L8a:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3f
            goto La3
        L8d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r11 = "评论正文参数创建失败"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L3f
            throw r10     // Catch: java.lang.Throwable -> L3f
        L95:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r11 = "陌生人评论方法未就绪"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L3f
            throw r10     // Catch: java.lang.Throwable -> L3f
        L9d:
            sf.f r11 = new sf.f
            r11.<init>(r10)
            r10 = r11
        La3:
            java.lang.Throwable r11 = sf.g.b(r10)
            if (r11 == 0) goto Lbe
            java.lang.String r11 = r11.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "朋友圈评论异常: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r9.l(r11)
        Lbe:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            boolean r0 = r10 instanceof sf.f
            if (r0 == 0) goto Lc5
            r10 = r11
        Lc5:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        Lcc:
            return r0
    }

    public final p8.h g() {
            r1 = this;
            java.lang.Object r0 = r1.f10338k
            java.lang.Object r0 = r0.getValue()
            p8.h r0 = (p8.h) r0
            return r0
    }

    public final p8.x h() {
            r1 = this;
            java.lang.Object r0 = r1.f10336i
            java.lang.Object r0 = r0.getValue()
            p8.x r0 = (p8.x) r0
            return r0
    }

    public final boolean i() {
            r9 = this;
            java.lang.Object r0 = r9.f10337j
            java.lang.Object r0 = r0.getValue()
            p8.e0 r0 = (p8.e0) r0
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "朋友圈入库观察Hook失败: "
            monitor-enter(r0)
            java.lang.reflect.Method r3 = r0.f10351h     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L25
            boolean r6 = p8.e0.a(r3)     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L1b
            goto L1c
        L1b:
            r3 = r5
        L1c:
            if (r3 == 0) goto L25
            monitor-exit(r0)
            r2 = r4
            goto La8
        L22:
            r1 = move-exception
            goto Lac
        L25:
            android.content.Context r3 = r0.f10344a     // Catch: java.lang.Throwable -> L22
            java.lang.ClassLoader r6 = r0.f10345b     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = e8.b.g(r3, r6)     // Catch: java.lang.Throwable -> L22
            android.content.SharedPreferences r6 = r0.f10348e     // Catch: java.lang.Throwable -> L22
            java.lang.ClassLoader r7 = r0.f10345b     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = "sns_info_replace_by_id_v2"
            java.lang.reflect.Method r6 = e8.b.c(r6, r3, r7, r8)     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L43
            boolean r7 = p8.e0.a(r6)     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto L40
            r5 = r6
        L40:
            if (r5 == 0) goto L43
            goto L50
        L43:
            java.lang.reflect.Method r5 = r0.b()     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto La6
            android.content.SharedPreferences r6 = r0.f10348e     // Catch: java.lang.Throwable -> L22
            java.lang.String r7 = "sns_info_replace_by_id_v2"
            e8.b.h(r6, r3, r7, r5)     // Catch: java.lang.Throwable -> L22
        L50:
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.accessible(r5)     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L59
            goto L5a
        L59:
            r6 = r5
        L5a:
            b9.e r7 = new b9.e     // Catch: java.lang.Throwable -> L69
            r8 = 21
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> L69
            r3.b(r6, r7)     // Catch: java.lang.Throwable -> L69
            r0.f10351h = r5     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L69
            goto L70
        L69:
            r3 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L22
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r3 = r6
        L70:
            java.lang.Throwable r6 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L97
            p8.p r7 = r0.f10347d     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = r5.toGenericString()     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L22
            r8.append(r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = " "
            r8.append(r2)     // Catch: java.lang.Throwable -> L22
            r8.append(r6)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L22
            r7.invoke(r2)     // Catch: java.lang.Throwable -> L22
        L97:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L22
            boolean r5 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L9e
            r3 = r2
        L9e:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L22
            boolean r2 = r3.booleanValue()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto La8
        La6:
            monitor-exit(r0)
            r2 = r1
        La8:
            if (r2 != r4) goto Lab
            r1 = r4
        Lab:
            return r1
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
        Lae:
            return r1
    }

    public final boolean k(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 0
            if (r6 == 0) goto L77
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L19
            goto L77
        L19:
            p8.x r3 = r5.h()
            if (r3 == 0) goto L72
            java.lang.reflect.Method r3 = r3.g()
            if (r3 == 0) goto L72
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r1, r2, r1}     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r2, r6)     // Catch: java.lang.Throwable -> L36
            boolean r1 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            r2 = r6
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r6 = move-exception
            goto L43
        L38:
            if (r2 == 0) goto L3e
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Throwable -> L36
        L3e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L36
            goto L49
        L43:
            sf.f r0 = new sf.f
            r0.<init>(r6)
            r6 = r0
        L49:
            java.lang.Throwable r0 = sf.g.b(r6)
            if (r0 == 0) goto L64
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "朋友圈点赞异常: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.l(r0)
        L64:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r6 instanceof sf.f
            if (r1 == 0) goto L6b
            r6 = r0
        L6b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L72:
            java.lang.String r6 = "朋友圈点赞失败: 原生方法未就绪"
            r5.l(r6)
        L77:
            return r2
    }

    public final void l(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[WeChatSnsApi] "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            i8.i.f(r3)
            return
    }

    public final void n(ha.c r2) {
            r1 = this;
            java.lang.Object r0 = r1.f10337j
            java.lang.Object r0 = r0.getValue()
            p8.e0 r0 = (p8.e0) r0
            if (r0 == 0) goto Lf
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f10349f
            r0.addIfAbsent(r2)
        Lf:
            return
    }

    public final h.Hchat.hooks.api.model.WeChatSnsPost o(p8.g r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.Object r2 = r1.f10354a
            android.content.ContentValues r1 = r1.f10355b
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "isAd"
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r5, r4)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = gg.l.a(r4, r5)
            r5 = 0
            if (r4 == 0) goto L1c
            goto L160
        L1c:
            java.lang.Object r4 = r0.f10339l
            java.lang.Object r4 = r4.getValue()
            p8.o r4 = (p8.o) r4
            if (r4 == 0) goto L160
            p8.v r4 = r4.u(r2)
            if (r4 == 0) goto L160
            java.lang.String r6 = "snsId"
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L35
            goto L3d
        L35:
            java.lang.String r6 = "field_snsId"
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L160
        L3d:
            boolean r7 = r6 instanceof java.lang.Number
            if (r7 == 0) goto L48
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            goto L56
        L48:
            java.lang.String r6 = r6.toString()
            java.lang.Long r6 = og.t.g0(r6)
            if (r6 == 0) goto L160
            long r6 = r6.longValue()
        L56:
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L5e
            goto L160
        L5e:
            java.lang.String r10 = "userName"
            java.lang.String r10 = r1.getAsString(r10)
            if (r10 == 0) goto L68
        L66:
            r15 = r10
            goto L71
        L68:
            java.lang.String r10 = "field_userName"
            java.lang.String r10 = r1.getAsString(r10)
            if (r10 == 0) goto L160
            goto L66
        L71:
            java.lang.String r10 = "hchatLocalId"
            java.lang.Long r10 = r1.getAsLong(r10)
            if (r10 == 0) goto L7f
        L79:
            long r10 = r10.longValue()
        L7d:
            r13 = r10
            goto Lbe
        L7f:
            java.lang.String r10 = "getLocalid"
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r10, r11)
            boolean r11 = r10 instanceof java.lang.Number
            if (r11 == 0) goto L8e
            java.lang.Number r10 = (java.lang.Number) r10
            goto L8f
        L8e:
            r10 = r5
        L8f:
            if (r10 == 0) goto L9a
            long r10 = r10.longValue()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L9b
        L9a:
            r10 = r5
        L9b:
            if (r10 == 0) goto L9e
            goto L79
        L9e:
            java.lang.String r10 = "localid"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r10)
            boolean r10 = r2 instanceof java.lang.Number
            if (r10 == 0) goto Lab
            java.lang.Number r2 = (java.lang.Number) r2
            goto Lac
        Lab:
            r2 = r5
        Lac:
            if (r2 == 0) goto Lb6
            long r10 = r2.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
        Lb6:
            if (r5 == 0) goto Lbd
            long r10 = r5.longValue()
            goto L7d
        Lbd:
            r13 = r8
        Lbe:
            java.lang.String r2 = "createTime"
            java.lang.Long r2 = r1.getAsLong(r2)
            if (r2 == 0) goto Lcd
        Lc6:
            long r8 = r2.longValue()
        Lca:
            r17 = r8
            goto Ld6
        Lcd:
            java.lang.String r2 = "field_createTime"
            java.lang.Long r2 = r1.getAsLong(r2)
            if (r2 == 0) goto Lca
            goto Lc6
        Ld6:
            java.lang.String r2 = "type"
            java.lang.Integer r2 = r1.getAsInteger(r2)
            if (r2 == 0) goto Le3
            int r1 = r2.intValue()
            goto Lf1
        Le3:
            java.lang.String r2 = "field_type"
            java.lang.Integer r1 = r1.getAsInteger(r2)
            if (r1 == 0) goto Lf0
            int r1 = r1.intValue()
            goto Lf1
        Lf0:
            r1 = -1
        Lf1:
            g8.a r2 = r0.f10333f
            java.lang.String r2 = r2.c()
            java.lang.String r5 = ""
            if (r2 != 0) goto Lfc
            r2 = r5
        Lfc:
            java.lang.String r12 = java.lang.Long.toUnsignedString(r6)
            r12.getClass()
            g8.i r6 = r0.f10334g
            java.lang.String r6 = r6.r(r15)
            if (r6 != 0) goto L10c
            goto L10d
        L10c:
            r5 = r6
        L10d:
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L116
            r16 = r15
            goto L118
        L116:
            r16 = r5
        L118:
            int r5 = r4.f10428c
            java.lang.String r21 = d(r4, r1)
            java.lang.String r6 = r4.f10427b
            java.util.ArrayList r4 = r4.f10429d
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = tf.n.e1(r4)
            r7.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L12f:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L143
            java.lang.Object r8 = r4.next()
            p8.s r8 = (p8.s) r8
            h.Hchat.hooks.api.model.WeChatSnsMedia r8 = m(r8)
            r7.add(r8)
            goto L12f
        L143:
            boolean r4 = og.m.t0(r2)
            if (r4 != 0) goto L150
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L150
            r3 = 1
        L150:
            r24 = r3
            h.Hchat.hooks.api.model.WeChatSnsPost r11 = new h.Hchat.hooks.api.model.WeChatSnsPost
            r19 = r1
            r20 = r5
            r22 = r6
            r23 = r7
            r11.<init>(r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24)
            return r11
        L160:
            return r5
    }

    public final h.Hchat.hooks.api.model.WeChatSnsPrepareResult p(java.lang.String r5, java.util.concurrent.atomic.AtomicBoolean r6) {
            r4 = this;
            r6.getClass()
            if (r5 != 0) goto L7
            java.lang.String r5 = ""
        L7:
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            int r0 = r5.length()
            if (r0 != 0) goto L23
            l8.h r5 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            java.lang.String r6 = ""
            java.lang.String r0 = "朋友圈 ID 为空"
            r5.getClass()
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r5 = l8.h.a(r6, r0)
            return r5
        L23:
            java.util.concurrent.ConcurrentHashMap r0 = r4.f10341n
            i2.y r1 = new i2.y
            r2 = 10
            r1.<init>(r2)
            eb.v r2 = new eb.v
            r3 = 2
            r2.<init>(r3, r1)
            java.lang.Object r0 = r0.compute(r5, r2)
            p8.c0 r0 = (p8.c0) r0
            if (r0 == 0) goto L80
            java.lang.Object r1 = r0.f10320a     // Catch: java.lang.Throwable -> L69
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L69
            boolean r2 = r6.get()     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L51
            l8.h r6 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "已取消准备朋友圈媒体"
            r6.getClass()     // Catch: java.lang.Throwable -> L4f
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r6 = l8.h.a(r5, r2)     // Catch: java.lang.Throwable -> L4f
            goto L55
        L4f:
            r6 = move-exception
            goto L6b
        L51:
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r6 = r4.q(r5, r6)     // Catch: java.lang.Throwable -> L4f
        L55:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.ConcurrentHashMap r1 = r4.f10341n
            b0.t r2 = new b0.t
            r3 = 18
            r2.<init>(r0, r3)
            p8.z r0 = new p8.z
            r3 = 0
            r0.<init>(r2, r3)
            r1.computeIfPresent(r5, r0)
            return r6
        L69:
            r6 = move-exception
            goto L6d
        L6b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
            throw r6     // Catch: java.lang.Throwable -> L69
        L6d:
            java.util.concurrent.ConcurrentHashMap r1 = r4.f10341n
            b0.t r2 = new b0.t
            r3 = 18
            r2.<init>(r0, r3)
            p8.z r0 = new p8.z
            r3 = 1
            r0.<init>(r2, r3)
            r1.computeIfPresent(r5, r0)
            throw r6
        L80:
            l8.h r6 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            java.lang.String r0 = "朋友圈媒体准备锁创建失败"
            r6.getClass()
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r5 = l8.h.a(r5, r0)
            return r5
    }

    public final h.Hchat.hooks.api.model.WeChatSnsPrepareResult q(java.lang.String r20, java.util.concurrent.atomic.AtomicBoolean r21) {
            r19 = this;
            r1 = r19
            r5 = r20
            p8.h r0 = r1.g()
            if (r0 == 0) goto L1c8
            r5.getClass()
            p8.f r0 = r0.g(r5)
            java.lang.Object r0 = r0.f10353b
            r2 = 0
            if (r0 == 0) goto L1a
            p8.g r2 = p8.h.j(r0, r2)
        L1a:
            if (r2 == 0) goto L1c8
            android.content.ContentValues r0 = r2.f10355b
            java.lang.Object r2 = r2.f10354a
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "isAd"
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r4, r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L3d
            l8.h r0 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            r0.getClass()
            java.lang.String r0 = "不支持准备广告朋友圈"
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r0 = l8.h.a(r5, r0)
            return r0
        L3d:
            java.lang.Object r3 = r1.f10339l
            java.lang.Object r3 = r3.getValue()
            p8.o r3 = (p8.o) r3
            if (r3 == 0) goto L1bc
            p8.v r2 = r3.u(r2)
            if (r2 == 0) goto L1b0
            java.util.ArrayList r4 = r2.f10429d
            java.lang.String r6 = "type"
            java.lang.Integer r6 = r0.getAsInteger(r6)
            if (r6 == 0) goto L5c
            int r0 = r6.intValue()
            goto L6a
        L5c:
            java.lang.String r6 = "field_type"
            java.lang.Integer r0 = r0.getAsInteger(r6)
            if (r0 == 0) goto L69
            int r0 = r0.intValue()
            goto L6a
        L69:
            r0 = -1
        L6a:
            java.lang.String r7 = d(r2, r0)
            java.lang.String r0 = "card"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L1a4
            java.lang.String r0 = "unknown"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L80
            goto L1a4
        L80:
            java.lang.String r0 = "live_photo"
            boolean r6 = r7.equals(r0)
            java.lang.String r8 = "当前只支持准备单张实况朋友圈"
            r9 = 1
            if (r6 == 0) goto L9c
            int r6 = r4.size()
            if (r6 != r9) goto L9f
            java.lang.Object r4 = tf.m.H1(r4)
            p8.s r4 = (p8.s) r4
            p8.s r4 = r4.f10417f
            if (r4 != 0) goto L9c
            goto L9f
        L9c:
            r4 = r21
            goto La9
        L9f:
            l8.h r0 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            r0.getClass()
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r0 = l8.h.a(r5, r8)
            return r0
        La9:
            p8.c r3 = r3.q(r2, r4)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r3.f10318c     // Catch: java.lang.Throwable -> Ld1
            java.util.List r6 = r3.f10317b     // Catch: java.lang.Throwable -> Ld1
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld1
            r10.<init>()     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r11 = r6.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lba:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Ld4
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> Ld1
            r13 = r12
            p8.d r13 = (p8.d) r13     // Catch: java.lang.Throwable -> Ld1
            boolean r13 = r13.a()     // Catch: java.lang.Throwable -> Ld1
            if (r13 == 0) goto Lba
            r10.add(r12)     // Catch: java.lang.Throwable -> Ld1
            goto Lba
        Ld1:
            r0 = move-exception
            goto L15f
        Ld4:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld1
            int r12 = tf.n.e1(r10)     // Catch: java.lang.Throwable -> Ld1
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Ld1
        Le1:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto L100
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> Ld1
            p8.d r12 = (p8.d) r12     // Catch: java.lang.Throwable -> Ld1
            h.Hchat.hooks.api.model.WeChatSnsLivePhoto r13 = new h.Hchat.hooks.api.model.WeChatSnsLivePhoto     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r14 = r12.f10322a     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r15 = r12.f10323b     // Catch: java.lang.Throwable -> Ld1
            int r12 = r12.f10324c     // Catch: java.lang.Throwable -> Ld1
            r17 = 0
            r16 = r12
            r13.<init>(r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Ld1
            r11.add(r13)     // Catch: java.lang.Throwable -> Ld1
            goto Le1
        L100:
            java.lang.String r10 = "image"
            boolean r10 = r7.equals(r10)     // Catch: java.lang.Throwable -> Ld1
            if (r10 == 0) goto L11b
            java.util.ArrayList r10 = r3.b()     // Catch: java.lang.Throwable -> Ld1
            boolean r10 = r10.isEmpty()     // Catch: java.lang.Throwable -> Ld1
            if (r10 != 0) goto L113
            goto L11b
        L113:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = "未找到可用的朋友圈图片"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld1
            throw r0     // Catch: java.lang.Throwable -> Ld1
        L11b:
            java.lang.String r10 = "video"
            boolean r10 = r7.equals(r10)     // Catch: java.lang.Throwable -> Ld1
            if (r10 == 0) goto L132
            boolean r10 = og.m.t0(r4)     // Catch: java.lang.Throwable -> Ld1
            if (r10 != 0) goto L12a
            goto L132
        L12a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = "未找到可用的朋友圈视频"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld1
            throw r0     // Catch: java.lang.Throwable -> Ld1
        L132:
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L14b
            int r0 = r6.size()     // Catch: java.lang.Throwable -> Ld1
            if (r0 != r9) goto L145
            int r0 = r11.size()     // Catch: java.lang.Throwable -> Ld1
            if (r0 != r9) goto L145
            goto L14b
        L145:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld1
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Ld1
            throw r0     // Catch: java.lang.Throwable -> Ld1
        L14b:
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r0 = new h.Hchat.hooks.api.model.WeChatSnsPrepareResult     // Catch: java.lang.Throwable -> Ld1
            r9 = r4
            java.lang.String r4 = "准备完成"
            java.lang.String r6 = r2.f10427b     // Catch: java.lang.Throwable -> Ld1
            java.util.ArrayList r8 = r3.b()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r10 = r3.f10319d     // Catch: java.lang.Throwable -> Ld1
            r3 = 1
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Ld1
        L15d:
            r0 = r2
            goto L165
        L15f:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            goto L15d
        L165:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 == 0) goto L188
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "准备朋友圈媒体失败: snsId="
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = " "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.l(r2)
        L188:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 != 0) goto L18f
            goto L1a1
        L18f:
            l8.h r0 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L198
            goto L19a
        L198:
            java.lang.String r2 = "准备朋友圈媒体失败"
        L19a:
            r0.getClass()
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r0 = l8.h.a(r5, r2)
        L1a1:
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r0 = (h.Hchat.hooks.api.model.WeChatSnsPrepareResult) r0
            return r0
        L1a4:
            l8.h r0 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            r0.getClass()
            java.lang.String r0 = "暂不支持转发该朋友圈类型"
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r0 = l8.h.a(r5, r0)
            return r0
        L1b0:
            l8.h r0 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            r0.getClass()
            java.lang.String r0 = "朋友圈内容解析失败"
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r0 = l8.h.a(r5, r0)
            return r0
        L1bc:
            l8.h r0 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            r0.getClass()
            java.lang.String r0 = "朋友圈媒体解析器未就绪"
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r0 = l8.h.a(r5, r0)
            return r0
        L1c8:
            l8.h r0 = h.Hchat.hooks.api.model.WeChatSnsPrepareResult.Companion
            r0.getClass()
            java.lang.String r0 = "未找到本机缓存的朋友圈"
            h.Hchat.hooks.api.model.WeChatSnsPrepareResult r0 = l8.h.a(r5, r0)
            return r0
    }

    public final boolean r(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.List r20, java.lang.String r21) {
            r16 = this;
            r1 = r16
            r2 = r19
            r3 = r21
            r4 = 0
            if (r18 == 0) goto L12
            java.lang.CharSequence r0 = og.m.R0(r18)
            java.lang.String r0 = r0.toString()
            goto L13
        L12:
            r0 = r4
        L13:
            java.lang.String r5 = ""
            if (r0 != 0) goto L18
            r0 = r5
        L18:
            boolean r6 = og.m.t0(r0)
            if (r6 != 0) goto L1f
            goto L20
        L1f:
            r0 = r4
        L20:
            r6 = 0
            if (r0 == 0) goto L33
            boolean r7 = eh.a.y(r0)
            if (r7 != 0) goto L33
            java.lang.String r2 = "朋友圈视频不存在: "
            java.lang.String r0 = r2.concat(r0)
            r1.l(r0)
            return r6
        L33:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r20.iterator()
        L3c:
            boolean r9 = r8.hasNext()
            r10 = 1
            if (r9 == 0) goto L6f
            java.lang.Object r9 = r8.next()
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto L57
            boolean r12 = eh.a.y(r11)
            if (r12 == 0) goto L57
            goto L58
        L57:
            r10 = r6
        L58:
            if (r10 != 0) goto L69
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto L69
            java.lang.String r12 = "朋友圈图片不存在: "
            java.lang.String r11 = r12.concat(r11)
            r1.l(r11)
        L69:
            if (r10 == 0) goto L3c
            r7.add(r9)
            goto L3c
        L6f:
            if (r0 == 0) goto L7d
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L7d
            java.lang.String r0 = "朋友圈发布失败: 视频和图片不能同时上传"
            r1.l(r0)
            return r6
        L7d:
            java.lang.String r8 = "null"
            h.Hchat.dexkit.DexFinder r9 = r1.f10329b
            if (r0 != 0) goto L1ac
            boolean r11 = r7.isEmpty()
            if (r11 == 0) goto L1ac
            if (r17 != 0) goto L8d
            r7 = r5
            goto L8f
        L8d:
            r7 = r17
        L8f:
            java.lang.String r10 = "朋友圈纯文字发布失败: commit返回="
            java.lang.reflect.Method r0 = r9.snsUploadManagerGetterMethod
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invoke(r0, r4, r11)
            if (r11 == 0) goto L1a6
            java.lang.reflect.Method r12 = r9.snsShareAppMsgMethod
            if (r12 != 0) goto La5
            java.lang.String r0 = "朋友圈纯文字发布失败: shareAppMsg方法为空"
            r1.l(r0)
            return r6
        La5:
            java.lang.Class[] r0 = r12.getParameterTypes()     // Catch: java.lang.Throwable -> L132
            r0.getClass()     // Catch: java.lang.Throwable -> L132
            java.lang.Object r0 = tf.l.z0(r0)     // Catch: java.lang.Throwable -> L132
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L132
            if (r0 == 0) goto L111
            java.lang.ClassLoader r13 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L132
            java.lang.String r14 = "com.tencent.mm.opensdk.modelmsg.WXTextObject"
            java.lang.Class r13 = h.Hchat.utils.KavaReflector.loadClass(r14, r13)     // Catch: java.lang.Throwable -> L132
            if (r13 == 0) goto L111
            java.lang.Class[] r14 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L132
            java.lang.reflect.Constructor r14 = h.Hchat.utils.KavaReflector.findConstructor(r13, r14)     // Catch: java.lang.Throwable -> L132
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L132
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.newInstance(r14, r15)     // Catch: java.lang.Throwable -> L132
            if (r14 == 0) goto Lcf
            goto Ld5
        Lcf:
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L132
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r13, r14)     // Catch: java.lang.Throwable -> L132
        Ld5:
            if (r14 != 0) goto Ld8
            goto L13d
        Ld8:
            java.lang.String r15 = "text"
            java.lang.Class r4 = r14.getClass()     // Catch: java.lang.Throwable -> L132
            java.lang.reflect.Field r4 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r15)     // Catch: java.lang.Throwable -> L132
            if (r4 == 0) goto Le7
            h.Hchat.utils.KavaReflector.writeField(r4, r14, r7)     // Catch: java.lang.Throwable -> L132
        Le7:
            java.lang.Class[] r4 = new java.lang.Class[]{r13}     // Catch: java.lang.Throwable -> L132
            java.lang.reflect.Constructor r4 = h.Hchat.utils.KavaReflector.findConstructor(r0, r4)     // Catch: java.lang.Throwable -> L132
            java.lang.Object[] r13 = new java.lang.Object[]{r14}     // Catch: java.lang.Throwable -> L132
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r4, r13)     // Catch: java.lang.Throwable -> L132
            if (r4 == 0) goto Lfa
            goto L10f
        Lfa:
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L132
            java.lang.reflect.Constructor r4 = h.Hchat.utils.KavaReflector.findConstructor(r0, r4)     // Catch: java.lang.Throwable -> L132
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L132
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r4, r13)     // Catch: java.lang.Throwable -> L132
            if (r4 == 0) goto L109
            goto L10f
        L109:
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L132
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r0, r4)     // Catch: java.lang.Throwable -> L132
        L10f:
            if (r4 != 0) goto L113
        L111:
            r4 = 0
            goto L13d
        L113:
            java.lang.String r0 = "mediaObject"
            java.lang.Class r13 = r4.getClass()     // Catch: java.lang.Throwable -> L132
            java.lang.reflect.Field r0 = h.Hchat.utils.KavaReflector.findFieldRecursive(r13, r0)     // Catch: java.lang.Throwable -> L132
            if (r0 == 0) goto L122
            h.Hchat.utils.KavaReflector.writeField(r0, r4, r14)     // Catch: java.lang.Throwable -> L132
        L122:
            java.lang.String r0 = "description"
            java.lang.Class r13 = r4.getClass()     // Catch: java.lang.Throwable -> L132
            java.lang.reflect.Field r0 = h.Hchat.utils.KavaReflector.findFieldRecursive(r13, r0)     // Catch: java.lang.Throwable -> L132
            if (r0 == 0) goto L138
            h.Hchat.utils.KavaReflector.writeField(r0, r4, r7)     // Catch: java.lang.Throwable -> L132
            goto L138
        L132:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
        L138:
            boolean r0 = r4 instanceof sf.f
            if (r0 == 0) goto L13d
            goto L111
        L13d:
            if (r4 == 0) goto L1a0
            if (r2 != 0) goto L142
            r2 = r5
        L142:
            if (r3 != 0) goto L145
            r3 = r5
        L145:
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r7, r2, r3}     // Catch: java.lang.Throwable -> L15f
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r12, r11, r0)     // Catch: java.lang.Throwable -> L15f
            if (r0 == 0) goto L184
            java.lang.reflect.Method r2 = r9.snsCommitMethod     // Catch: java.lang.Throwable -> L15f
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L15f
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r2, r0, r3)     // Catch: java.lang.Throwable -> L15f
            boolean r2 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L15f
            if (r2 == 0) goto L161
            r4 = r0
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L15f
            goto L162
        L15f:
            r0 = move-exception
            goto L18a
        L161:
            r4 = 0
        L162:
            if (r4 == 0) goto L169
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L15f
            goto L16a
        L169:
            r0 = r6
        L16a:
            if (r0 > 0) goto L17f
            if (r4 == 0) goto L16f
            r8 = r4
        L16f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15f
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L15f
            r0.append(r8)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15f
            r1.l(r0)     // Catch: java.lang.Throwable -> L15f
            goto L1a5
        L17f:
            boolean r6 = r1.t()     // Catch: java.lang.Throwable -> L15f
            goto L1a5
        L184:
            java.lang.String r0 = "朋友圈纯文字发布失败: native helper为空"
            r1.l(r0)     // Catch: java.lang.Throwable -> L15f
            goto L1a5
        L18a:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "朋友圈纯文字发布异常: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.l(r0)
            goto L1a5
        L1a0:
            java.lang.String r0 = "朋友圈纯文字发布失败: WXTextObject创建失败"
            r1.l(r0)
        L1a5:
            return r6
        L1a6:
            java.lang.String r0 = "朋友圈纯文字发布失败: manager为空"
            r1.l(r0)
            return r6
        L1ac:
            java.lang.Class<?> r4 = r9.snsUploadPackHelperClass
            if (r4 != 0) goto L1b6
            java.lang.String r0 = "朋友圈发布失败: helper未就绪"
            r1.l(r0)
            return r6
        L1b6:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            android.content.Context r12 = r1.f10328a
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12}
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r4, r11)
            if (r4 != 0) goto L1cc
            java.lang.String r0 = "朋友圈发布失败: 创建UploadPackHelper失败"
            r1.l(r0)
            return r6
        L1cc:
            java.lang.reflect.Method r11 = r9.snsSetContentMethod     // Catch: java.lang.Throwable -> L1e2
            if (r17 != 0) goto L1d2
            r12 = r5
            goto L1d4
        L1d2:
            r12 = r17
        L1d4:
            j(r4, r12, r11)     // Catch: java.lang.Throwable -> L1e2
            if (r2 == 0) goto L1e5
            boolean r11 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L1e2
            if (r11 == 0) goto L1e0
            goto L1e5
        L1e0:
            r11 = r6
            goto L1e6
        L1e2:
            r0 = move-exception
            goto L2cf
        L1e5:
            r11 = r10
        L1e6:
            if (r11 != 0) goto L1ed
            java.lang.reflect.Method r11 = r9.snsSetSdkIdMethod     // Catch: java.lang.Throwable -> L1e2
            j(r4, r2, r11)     // Catch: java.lang.Throwable -> L1e2
        L1ed:
            if (r3 == 0) goto L1f8
            boolean r2 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L1e2
            if (r2 == 0) goto L1f6
            goto L1f8
        L1f6:
            r2 = r6
            goto L1f9
        L1f8:
            r2 = r10
        L1f9:
            if (r2 != 0) goto L200
            java.lang.reflect.Method r2 = r9.snsSetSdkAppNameMethod     // Catch: java.lang.Throwable -> L1e2
            j(r4, r3, r2)     // Catch: java.lang.Throwable -> L1e2
        L200:
            java.util.Iterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L1e2
        L204:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1e2
            if (r3 == 0) goto L23f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1e2
            java.lang.reflect.Method r7 = r9.snsAddImageMethod     // Catch: java.lang.Throwable -> L1e2
            java.lang.Object[] r11 = new java.lang.Object[]{r3, r5}     // Catch: java.lang.Throwable -> L1e2
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r7, r4, r11)     // Catch: java.lang.Throwable -> L1e2
            boolean r11 = r7 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L1e2
            if (r11 == 0) goto L221
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L1e2
            goto L222
        L221:
            r7 = 0
        L222:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1e2
            boolean r7 = gg.l.a(r7, r11)     // Catch: java.lang.Throwable -> L1e2
            if (r7 != 0) goto L204
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e2
            r0.<init>()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r2 = "朋友圈图片添加失败: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L1e2
            r0.append(r3)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e2
            r1.l(r0)     // Catch: java.lang.Throwable -> L1e2
            return r6
        L23f:
            if (r0 == 0) goto L297
            java.lang.reflect.Method r2 = r9.snsAddVideoMethod     // Catch: java.lang.Throwable -> L1e2
            if (r2 != 0) goto L24b
            java.lang.String r0 = "朋友圈视频发布失败: 视频方法未就绪"
            r1.l(r0)     // Catch: java.lang.Throwable -> L1e2
            return r6
        L24b:
            java.lang.String r3 = r1.b(r0)     // Catch: java.lang.Throwable -> L1e2
            if (r3 == 0) goto L259
            boolean r7 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L1e2
            if (r7 == 0) goto L258
            goto L259
        L258:
            r10 = r6
        L259:
            if (r10 == 0) goto L261
            java.lang.String r0 = "朋友圈视频发布失败: 缩略图生成失败"
            r1.l(r0)     // Catch: java.lang.Throwable -> L1e2
            return r6
        L261:
            if (r17 != 0) goto L264
            goto L266
        L264:
            r5 = r17
        L266:
            java.lang.String r7 = f(r0)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3, r5, r7}     // Catch: java.lang.Throwable -> L1e2
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r2, r4, r3)     // Catch: java.lang.Throwable -> L1e2
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L1e2
            if (r3 == 0) goto L279
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1e2
            goto L27a
        L279:
            r2 = 0
        L27a:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1e2
            boolean r2 = gg.l.a(r2, r3)     // Catch: java.lang.Throwable -> L1e2
            if (r2 != 0) goto L297
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e2
            r2.<init>()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r3 = "朋友圈视频添加失败: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1e2
            r2.append(r0)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1e2
            r1.l(r0)     // Catch: java.lang.Throwable -> L1e2
            return r6
        L297:
            java.lang.reflect.Method r0 = r9.snsCommitMethod     // Catch: java.lang.Throwable -> L1e2
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1e2
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r4, r2)     // Catch: java.lang.Throwable -> L1e2
            boolean r2 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L1e2
            if (r2 == 0) goto L2a7
            r4 = r0
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L1e2
            goto L2a8
        L2a7:
            r4 = 0
        L2a8:
            if (r4 == 0) goto L2af
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> L1e2
            goto L2b0
        L2af:
            r0 = r6
        L2b0:
            if (r0 > 0) goto L2ca
            if (r4 == 0) goto L2b5
            r8 = r4
        L2b5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e2
            r0.<init>()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r2 = "朋友圈发布失败: commit返回="
            r0.append(r2)     // Catch: java.lang.Throwable -> L1e2
            r0.append(r8)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e2
            r1.l(r0)     // Catch: java.lang.Throwable -> L1e2
            return r6
        L2ca:
            boolean r0 = r1.t()     // Catch: java.lang.Throwable -> L1e2
            return r0
        L2cf:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "朋友圈发布异常: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.l(r0)
            return r6
    }

    public final boolean s() {
            r4 = this;
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            p8.x r1 = r4.h()
            r2 = 0
            if (r1 == 0) goto L64
            java.lang.reflect.Constructor r1 = r1.h()
            if (r1 == 0) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r0, r3}     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstance(r1, r0)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            m8.a r1 = r4.f10332e     // Catch: java.lang.Throwable -> L2e
            m8.c r1 = r1.f8777a     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r1.j(r0)     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            if (r0 != r1) goto L30
            r2 = r1
            goto L30
        L2e:
            r0 = move-exception
            goto L35
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            goto L3b
        L35:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L3b:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 == 0) goto L56
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "朋友圈刷新异常: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.l(r1)
        L56:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L5d
            r0 = r1
        L5d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L64:
            java.lang.String r0 = "朋友圈刷新失败: 原生请求未就绪"
            r4.l(r0)
            return r2
    }

    public final boolean t() {
            r5 = this;
            h.Hchat.dexkit.DexFinder r0 = r5.f10329b
            java.lang.reflect.Method r1 = r0.snsUploadManagerGetterMethod
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r4, r3)
            if (r1 == 0) goto L1f
            java.lang.reflect.Method r0 = r0.snsUploadCheckMethod
            if (r0 != 0) goto L18
            java.lang.String r0 = "朋友圈上传触发失败: checkPost方法为空"
            r5.l(r0)
            return r2
        L18:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            h.Hchat.utils.KavaReflector.invoke(r0, r1, r2)
            r0 = 1
            return r0
        L1f:
            java.lang.String r0 = "朋友圈上传触发失败: manager为空"
            r5.l(r0)
            return r2
    }

    public final boolean u(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            tf.t r4 = tf.t.f13167g
            r2 = 0
            r0 = r6
            r1 = r7
            r3 = r8
            r5 = r9
            boolean r7 = r0.r(r1, r2, r3, r4, r5)
            return r7
    }

    public final boolean v(long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
            r26 = this;
            r1 = r26
            if (r30 != 0) goto L7
            java.lang.String r0 = ""
            goto L9
        L7:
            r0 = r30
        L9:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            if (r31 != 0) goto L16
            java.lang.String r4 = ""
            goto L18
        L16:
            r4 = r31
        L18:
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r5 = og.m.t0(r4)
            r6 = 6
            r8 = 1
            if (r5 != 0) goto L35
            p8.e r5 = new p8.e
            r5.<init>(r0, r4)
            r23 = r6
            r31 = 2
        L31:
            r20 = 0
            goto L302
        L35:
            android.content.Context r4 = r1.f10328a
            java.io.File r13 = new java.io.File
            r13.<init>(r0)
            boolean r5 = r13.isFile()
            if (r5 != 0) goto L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "朋友圈实况发布失败: 实况图片不存在 "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.l(r0)
            r23 = r6
            r31 = 2
            r5 = 0
            goto L31
        L59:
            p8.b r5 = p8.b.f10312a
            java.io.File r4 = r4.getCacheDir()
            r4.getClass()
            monitor-enter(r5)
            boolean r14 = r13.isFile()     // Catch: java.lang.Throwable -> L1dd
            if (r14 == 0) goto L73
            long r14 = r13.length()     // Catch: java.lang.Throwable -> L1dd
            r16 = 16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L7c
        L73:
            r23 = r6
            r31 = 2
            r20 = 0
            r6 = r5
            goto L2ea
        L7c:
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r15 = "r"
            r14.<init>(r13, r15)     // Catch: java.lang.Throwable -> L1dd
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L2d6
            r15.<init>()     // Catch: java.lang.Throwable -> L2d6
            long r18 = r13.length()     // Catch: java.lang.Throwable -> L2d6
            r20 = 4194304(0x400000, double:2.0722615E-317)
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r22 <= 0) goto L98
            r9 = r20
        L95:
            r20 = 0
            goto L9b
        L98:
            r9 = r18
            goto L95
        L9b:
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L2d6
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L2d6
            java.io.RandomAccessFile r10 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = "r"
            r10.<init>(r13, r11)     // Catch: java.lang.Throwable -> L2d6
            r10.readFully(r9)     // Catch: java.lang.Throwable -> L2d9
            r10.close()     // Catch: java.lang.Throwable -> L2d6
            java.nio.charset.Charset r10 = p8.b.f10313b     // Catch: java.lang.Throwable -> L2d6
            r10.getClass()     // Catch: java.lang.Throwable -> L2d6
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L2d6
            r11.<init>(r9, r10)     // Catch: java.lang.Throwable -> L2d6
            java.util.List r9 = p8.b.f10314c     // Catch: java.lang.Throwable -> L2d6
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L2d6
        Lbb:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L2d6
            if (r10 == 0) goto L119
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> Lf1
            og.k r10 = (og.k) r10     // Catch: java.lang.Throwable -> Lf1
            ng.c r10 = og.k.c(r10, r11)     // Catch: java.lang.Throwable -> Lf1
            r31 = 2
            f.i0 r7 = new f.i0     // Catch: java.lang.Throwable -> Lf1
            r7.<init>(r10)     // Catch: java.lang.Throwable -> Lf1
        Ld2:
            boolean r10 = r7.hasNext()     // Catch: java.lang.Throwable -> Lf1
            if (r10 == 0) goto Lbb
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> Lf1
            og.f r10 = (og.f) r10     // Catch: java.lang.Throwable -> Lf1
            og.i r10 = (og.i) r10     // Catch: java.lang.Throwable -> Lf1
            java.util.List r10 = r10.a()     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r10 = tf.m.w1(r8, r10)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lf1
            if (r10 == 0) goto Lf6
            java.lang.Long r10 = og.t.g0(r10)     // Catch: java.lang.Throwable -> Lf1
            goto Lf7
        Lf1:
            r0 = move-exception
            r2 = r0
            r6 = r5
            goto L2e4
        Lf6:
            r10 = 0
        Lf7:
            if (r10 == 0) goto Ld2
            long r18 = r10.longValue()     // Catch: java.lang.Throwable -> Lf1
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 <= 0) goto Ld2
            long r18 = r13.length()     // Catch: java.lang.Throwable -> Lf1
            long r22 = r10.longValue()     // Catch: java.lang.Throwable -> Lf1
            long r18 = r18 - r22
            int r10 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r10 >= 0) goto L111
            r18 = r20
        L111:
            java.lang.Long r10 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Lf1
            r15.add(r10)     // Catch: java.lang.Throwable -> Lf1
            goto Ld2
        L119:
            r31 = 2
            dg.n r7 = new dg.n     // Catch: java.lang.Throwable -> L2d6
            r7.<init>(r15, r6)     // Catch: java.lang.Throwable -> L2d6
            m.b r9 = new m.b     // Catch: java.lang.Throwable -> L2d6
            r10 = 8
            r9.<init>(r14, r10, r13)     // Catch: java.lang.Throwable -> L2d6
            ng.i r7 = ng.m.X(r7, r9)     // Catch: java.lang.Throwable -> L2d6
            java.lang.Object r7 = ng.m.U(r7)     // Catch: java.lang.Throwable -> L2d6
            p8.a r7 = (p8.a) r7     // Catch: java.lang.Throwable -> L2d6
            if (r7 == 0) goto L139
            r23 = r6
            r17 = r13
            goto L1be
        L139:
            p8.b r7 = p8.b.f10312a     // Catch: java.lang.Throwable -> L2d6
            long r9 = r13.length()     // Catch: java.lang.Throwable -> L2d6
            int r7 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r7 >= 0) goto L14a
        L143:
            r23 = r6
            r17 = r13
        L147:
            r7 = 0
            goto L1be
        L14a:
            r7 = 1048576(0x100000, float:1.469368E-39)
            byte[] r11 = new byte[r7]     // Catch: java.lang.Throwable -> L2d2
            r15 = r9
            r8 = r20
        L151:
            int r10 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r10 >= 0) goto L143
            r14.seek(r8)     // Catch: java.lang.Throwable -> L2d2
            r17 = r13
            long r12 = (long) r7     // Catch: java.lang.Throwable -> L2d2
            r23 = r6
            long r6 = r15 - r8
            long r6 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2d2
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L2d2
            r7 = 0
            r14.readFully(r11, r7, r6)     // Catch: java.lang.Throwable -> L2d2
            int r7 = r6 + (-4)
            r12 = 4
        L16b:
            if (r12 < r7) goto L17d
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r6 >= r10) goto L172
            goto L147
        L172:
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L2d2
            r12 = 8
            long r6 = r6 - r12
            long r8 = r8 + r6
            r7 = r10
            r13 = r17
            r6 = r23
            goto L151
        L17d:
            r10 = 1048576(0x100000, float:1.469368E-39)
            r13 = r11[r12]     // Catch: java.lang.Throwable -> L2d2
            r10 = 102(0x66, float:1.43E-43)
            if (r13 != r10) goto L19d
            int r10 = r12 + 1
            r10 = r11[r10]     // Catch: java.lang.Throwable -> L2d2
            r13 = 116(0x74, float:1.63E-43)
            if (r10 != r13) goto L19d
            int r10 = r12 + 2
            r10 = r11[r10]     // Catch: java.lang.Throwable -> L2d2
            r13 = 121(0x79, float:1.7E-43)
            if (r10 != r13) goto L19d
            int r10 = r12 + 3
            r10 = r11[r10]     // Catch: java.lang.Throwable -> L2d2
            r13 = 112(0x70, float:1.57E-43)
            if (r10 == r13) goto L1a3
        L19d:
            r10 = r6
            r13 = r7
            r24 = r8
            r8 = r15
            goto L1b6
        L1a3:
            r10 = r6
            r13 = r7
            long r6 = (long) r12     // Catch: java.lang.Throwable -> L2d2
            long r6 = r6 + r8
            r24 = 4
            long r6 = r6 - r24
            r24 = r8
            r8 = r15
            p8.a r6 = p8.b.d(r14, r8, r6)     // Catch: java.lang.Throwable -> L2d2
            if (r6 == 0) goto L1b6
            r7 = r6
            goto L1be
        L1b6:
            int r12 = r12 + 1
            r15 = r8
            r6 = r10
            r7 = r13
            r8 = r24
            goto L16b
        L1be:
            r14.close()     // Catch: java.lang.Throwable -> L1dd
            if (r7 == 0) goto L2ce
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r8 = "Hchat_sns_live_photo"
            r6.<init>(r4, r8)     // Catch: java.lang.Throwable -> L1dd
            boolean r4 = r6.exists()     // Catch: java.lang.Throwable -> L1dd
            if (r4 != 0) goto L1da
            boolean r4 = r6.mkdirs()     // Catch: java.lang.Throwable -> L1dd
            if (r4 != 0) goto L1da
            monitor-exit(r5)
        L1d7:
            r5 = 0
            goto L2ed
        L1da:
            r13 = r17
            goto L1e1
        L1dd:
            r0 = move-exception
            r6 = r5
            goto L69a
        L1e1:
            java.lang.String r4 = p8.b.a(r13, r7)     // Catch: java.lang.Throwable -> L1dd
            boolean r8 = p8.b.c(r13)     // Catch: java.lang.Throwable -> L1dd
            if (r8 == 0) goto L1ee
            java.lang.String r8 = "jpg"
            goto L1f2
        L1ee:
            java.lang.String r8 = p8.b.b(r13)     // Catch: java.lang.Throwable -> L1dd
        L1f2:
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L1dd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dd
            r9.<init>()     // Catch: java.lang.Throwable -> L1dd
            r9.append(r4)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r10 = "_image."
            r9.append(r10)     // Catch: java.lang.Throwable -> L1dd
            r9.append(r8)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L1dd
            r14.<init>(r6, r8)     // Catch: java.lang.Throwable -> L1dd
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L1dd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dd
            r9.<init>()     // Catch: java.lang.Throwable -> L1dd
            r9.append(r4)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r4 = "_video.mp4"
            r9.append(r4)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L1dd
            r8.<init>(r6, r4)     // Catch: java.lang.Throwable -> L1dd
            boolean r4 = p8.b.c(r13)     // Catch: java.lang.Throwable -> L1dd
            long r9 = r7.f10308a
            if (r4 == 0) goto L283
            r4 = 4194304(0x400000, float:5.877472E-39)
            long r11 = (long) r4
            long r11 = r9 - r11
            r15 = 2
            int r4 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r4 >= 0) goto L235
            r11 = r15
        L235:
            long r17 = r9 - r11
            r24 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r17 > r24 ? 1 : (r17 == r24 ? 0 : -1))
            r6 = r5
            if (r4 <= 0) goto L242
            r4 = r24
            goto L244
        L242:
            r4 = r17
        L244:
            int r4 = (int) r4
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> L2be
            r17 = r15
            java.io.RandomAccessFile r15 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2be
            r16 = r4
            java.lang.String r4 = "r"
            r15.<init>(r13, r4)     // Catch: java.lang.Throwable -> L2be
            r15.seek(r11)     // Catch: java.lang.Throwable -> L27b
            r15.readFully(r5)     // Catch: java.lang.Throwable -> L27b
            r15.close()     // Catch: java.lang.Throwable -> L2be
            int r4 = r16 + (-2)
        L25d:
            r15 = -1
            if (r15 < r4) goto L261
            goto L273
        L261:
            r16 = r5
            r5 = r16[r4]     // Catch: java.lang.Throwable -> L2be
            if (r5 != r15) goto L276
            int r5 = r4 + 1
            r5 = r16[r5]     // Catch: java.lang.Throwable -> L2be
            r15 = -39
            if (r5 != r15) goto L276
            long r4 = (long) r4
            long r11 = r11 + r4
            long r9 = r11 + r17
        L273:
            r17 = r9
            goto L285
        L276:
            int r4 = r4 + (-1)
            r5 = r16
            goto L25d
        L27b:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L27e
        L27e:
            r0 = move-exception
            ig.a.i(r15, r2)     // Catch: java.lang.Throwable -> L2be
            throw r0     // Catch: java.lang.Throwable -> L2be
        L283:
            r6 = r5
            goto L273
        L285:
            int r4 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r4 <= 0) goto L2cb
            long r4 = r7.f10308a     // Catch: java.lang.Throwable -> L2be
            int r4 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r4 <= 0) goto L290
            goto L2cb
        L290:
            r15 = 0
            boolean r4 = p8.b.e(r13, r14, r15, r17)     // Catch: java.lang.Throwable -> L2be
            r5 = r14
            if (r4 == 0) goto L2c1
            long r9 = r7.f10308a     // Catch: java.lang.Throwable -> L2be
            long r11 = r7.f10309b     // Catch: java.lang.Throwable -> L2be
            long r17 = r11 - r9
            r14 = r8
            r15 = r9
            boolean r4 = p8.b.e(r13, r14, r15, r17)     // Catch: java.lang.Throwable -> L2be
            if (r4 != 0) goto L2a8
            goto L2c2
        L2a8:
            p8.e r4 = new p8.e     // Catch: java.lang.Throwable -> L2be
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L2be
            r5.getClass()     // Catch: java.lang.Throwable -> L2be
            java.lang.String r7 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L2be
            r7.getClass()     // Catch: java.lang.Throwable -> L2be
            r4.<init>(r5, r7)     // Catch: java.lang.Throwable -> L2be
            monitor-exit(r6)
            r5 = r4
            goto L2ed
        L2be:
            r0 = move-exception
            goto L69a
        L2c1:
            r14 = r8
        L2c2:
            r5.delete()     // Catch: java.lang.Throwable -> L2be
            r14.delete()     // Catch: java.lang.Throwable -> L2be
            monitor-exit(r6)
            goto L1d7
        L2cb:
            monitor-exit(r6)
            goto L1d7
        L2ce:
            r6 = r5
            monitor-exit(r6)
            goto L1d7
        L2d2:
            r0 = move-exception
            goto L2d7
        L2d4:
            r2 = r0
            goto L2e4
        L2d6:
            r0 = move-exception
        L2d7:
            r6 = r5
            goto L2d4
        L2d9:
            r0 = move-exception
            r6 = r5
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L2dd
        L2dd:
            r0 = move-exception
            ig.a.i(r10, r2)     // Catch: java.lang.Throwable -> L2e2
            throw r0     // Catch: java.lang.Throwable -> L2e2
        L2e2:
            r0 = move-exception
            goto L2d4
        L2e4:
            throw r2     // Catch: java.lang.Throwable -> L2e5
        L2e5:
            r0 = move-exception
            ig.a.i(r14, r2)     // Catch: java.lang.Throwable -> L2be
            throw r0     // Catch: java.lang.Throwable -> L2be
        L2ea:
            monitor-exit(r6)
            goto L1d7
        L2ed:
            if (r5 == 0) goto L2f0
            goto L302
        L2f0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "朋友圈实况发布失败: 图片内未找到有效实况视频 "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.l(r0)
            r5 = 0
        L302:
            if (r5 == 0) goto L697
            if (r29 != 0) goto L30a
            java.lang.String r0 = ""
            r4 = r0
            goto L30c
        L30a:
            r4 = r29
        L30c:
            java.lang.String r6 = r5.f10342a
            java.lang.String r5 = r5.f10343b
            int r0 = (r27 > r20 ? 1 : (r27 == r20 ? 0 : -1))
            if (r0 >= 0) goto L317
            r7 = r20
            goto L319
        L317:
            r7 = r27
        L319:
            r0 = 54
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = "("
            android.content.Context r11 = r1.f10328a
            h.Hchat.dexkit.DexFinder r12 = r1.f10329b
            java.io.File r13 = new java.io.File
            r13.<init>(r6)
            java.io.File r14 = new java.io.File
            r14.<init>(r5)
            boolean r0 = r13.isFile()
            if (r0 != 0) goto L349
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "朋友圈实况发布失败: 封面图片不存在 "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1.l(r0)
            r22 = 0
            return r22
        L349:
            r22 = 0
            boolean r0 = r14.isFile()
            if (r0 != 0) goto L35b
            java.lang.String r0 = "朋友圈实况发布失败: 实况视频不存在 "
            java.lang.String r0 = r0.concat(r5)
            r1.l(r0)
            return r22
        L35b:
            android.media.MediaMetadataRetriever r15 = new android.media.MediaMetadataRetriever
            r15.<init>()
            r15.setDataSource(r5)     // Catch: java.lang.Throwable -> L37c
            r0 = 9
            java.lang.String r0 = r15.extractMetadata(r0)     // Catch: java.lang.Throwable -> L37c
            if (r0 == 0) goto L382
            java.lang.Long r0 = og.t.g0(r0)     // Catch: java.lang.Throwable -> L37c
            if (r0 == 0) goto L382
            long r16 = r0.longValue()     // Catch: java.lang.Throwable -> L37c
            r27 = r13
            r28 = r14
            r13 = r16
            goto L388
        L37c:
            r0 = move-exception
            r27 = r13
            r28 = r14
            goto L395
        L382:
            r27 = r13
            r28 = r14
            r13 = r20
        L388:
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r0 > 0) goto L38e
            r0 = 0
            goto L39b
        L38e:
            p8.b0 r0 = new p8.b0     // Catch: java.lang.Throwable -> L394
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L394
            goto L39b
        L394:
            r0 = move-exception
        L395:
            sf.f r13 = new sf.f
            r13.<init>(r0)
            r0 = r13
        L39b:
            boolean r13 = r0 instanceof sf.f
            if (r13 == 0) goto L3a1
            r0 = 0
        L3a1:
            r13 = r0
            p8.b0 r13 = (p8.b0) r13
            r15.release()     // Catch: java.lang.Throwable -> L3a7
        L3a7:
            if (r13 == 0) goto L690
            p8.y r0 = r1.f10340m
            if (r0 == 0) goto L3b9
            r16 = r4
            r18 = r5
            r20 = r7
            r29 = r9
            r17 = r11
            goto L51c
        L3b9:
            android.content.Context r0 = r1.f10328a
            h.Hchat.dexkit.DexFinder r14 = r1.f10329b
            org.luckypray.dexkit.DexKitBridge r15 = r1.f10331d
            if (r15 == 0) goto L511
            r14.resolveSnsUploadApi()     // Catch: java.lang.Throwable -> L3c4
        L3c4:
            java.lang.ClassLoader r3 = r1.f10330c
            if (r3 == 0) goto L511
            java.lang.Class<?> r14 = r14.snsUploadPackHelperClass
            java.lang.Class<p8.d0> r16 = p8.d0.class
            gg.f r16 = gg.v.a(r16)
            java.lang.Class r16 = r16.a()
            r16.getClass()
            java.lang.String r2 = "element_class_v1"
            r16 = r4
            java.lang.String r4 = "set_upload_list_v1"
            if (r14 != 0) goto L3ea
            r18 = r5
            r20 = r7
            r29 = r9
            r17 = r11
            r0 = 0
            goto L50a
        L3ea:
            r29 = r9
            java.lang.String r9 = "Hchat_sns_live_photo_upload_cache"
            android.content.SharedPreferences r9 = ub.b.c(r0, r9)
            r17 = r11
            java.lang.String r11 = e8.b.g(r0, r3)
            java.lang.reflect.Method r0 = e8.b.c(r9, r11, r3, r4)
            r20 = r7
            java.lang.String r7 = ""
            java.lang.String r7 = r9.getString(r2, r7)
            java.lang.Class r7 = h.Hchat.utils.KavaReflector.loadClass(r7, r3)
            p8.y r0 = ig.a.g(r14, r7, r0)
            if (r0 == 0) goto L412
            r18 = r5
            goto L50a
        L412:
            e8.b.a(r9, r11, r4)
            android.content.SharedPreferences$Editor r0 = r9.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            r0.apply()
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L4df
            r0.<init>()     // Catch: java.lang.Throwable -> L4df
            fh.k r7 = new fh.k     // Catch: java.lang.Throwable -> L4df
            r7.<init>()     // Catch: java.lang.Throwable -> L4df
            java.lang.String r8 = "setUploadList"
            r18 = r5
            java.lang.String r5 = "livePhotoElement != null >> path:"
            java.lang.String[] r5 = new java.lang.String[]{r8, r5}     // Catch: java.lang.Throwable -> L4a4
            java.util.List r5 = a.a.y0(r5)     // Catch: java.lang.Throwable -> L4a4
            fh.k.u0(r7, r5)     // Catch: java.lang.Throwable -> L4a4
            r0.f1666h = r7     // Catch: java.lang.Throwable -> L4a4
            hh.p r0 = r15.findMethod(r0)     // Catch: java.lang.Throwable -> L4a4
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L4a4
            r5.getClass()     // Catch: java.lang.Throwable -> L4a4
        L448:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L4a4
            if (r0 == 0) goto L4dd
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L4a4
            r0.getClass()     // Catch: java.lang.Throwable -> L4a4
            r7 = r0
            hh.o r7 = (hh.o) r7     // Catch: java.lang.Throwable -> L4a4
            lh.d r0 = r7.p()     // Catch: java.lang.Throwable -> L461
            java.lang.reflect.Method r0 = r0.b(r3)     // Catch: java.lang.Throwable -> L461
            goto L468
        L461:
            r0 = move-exception
            sf.f r8 = new sf.f     // Catch: java.lang.Throwable -> L4a4
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L4a4
            r0 = r8
        L468:
            boolean r8 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L4a4
            if (r8 == 0) goto L46e
            r0 = 0
        L46e:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L4a4
            if (r0 == 0) goto L448
            boolean r8 = ig.a.J(r14, r0)     // Catch: java.lang.Throwable -> L4a4
            if (r8 != 0) goto L479
            goto L448
        L479:
            sf.i r7 = r7.f5577s     // Catch: java.lang.Throwable -> L4a4
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L4a4
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L4a4
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a4
            r8.<init>()     // Catch: java.lang.Throwable -> L4a4
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L4a4
        L48a:
            boolean r15 = r7.hasNext()     // Catch: java.lang.Throwable -> L4a4
            if (r15 == 0) goto L4a6
            java.lang.Object r15 = r7.next()     // Catch: java.lang.Throwable -> L4a4
            hh.q r15 = (hh.q) r15     // Catch: java.lang.Throwable -> L4a4
            hh.l r15 = r15.f5578a     // Catch: java.lang.Throwable -> L4a4
            lh.b r15 = r15.p()     // Catch: java.lang.Throwable -> L4a4
            java.lang.String r15 = r15.f8058g     // Catch: java.lang.Throwable -> L4a4
            if (r15 == 0) goto L48a
            r8.add(r15)     // Catch: java.lang.Throwable -> L4a4
            goto L48a
        L4a4:
            r0 = move-exception
            goto L4e2
        L4a6:
            java.util.Set r7 = tf.m.T1(r8)     // Catch: java.lang.Throwable -> L4a4
            java.util.List r7 = tf.m.P1(r7)     // Catch: java.lang.Throwable -> L4a4
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L4a4
        L4b2:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L4a4
            if (r8 == 0) goto L448
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4a4
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L4a4
            java.lang.Class r8 = h.Hchat.utils.KavaReflector.loadClass(r8, r3)     // Catch: java.lang.Throwable -> L4a4
            if (r8 == 0) goto L4b2
            p8.y r15 = ig.a.g(r14, r8, r0)     // Catch: java.lang.Throwable -> L4a4
            if (r15 == 0) goto L4b2
            e8.b.h(r9, r11, r4, r0)     // Catch: java.lang.Throwable -> L4a4
            android.content.SharedPreferences$Editor r0 = r9.edit()     // Catch: java.lang.Throwable -> L4a4
            java.lang.String r3 = r8.getName()     // Catch: java.lang.Throwable -> L4a4
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)     // Catch: java.lang.Throwable -> L4a4
            r0.apply()     // Catch: java.lang.Throwable -> L4a4
            goto L4e7
        L4dd:
            r15 = 0
            goto L4e7
        L4df:
            r0 = move-exception
            r18 = r5
        L4e2:
            sf.f r15 = new sf.f
            r15.<init>(r0)
        L4e7:
            java.lang.Throwable r0 = sf.g.b(r15)
            if (r0 == 0) goto L502
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "朋友圈实况上传方法定位失败: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.l(r0)
        L502:
            boolean r0 = r15 instanceof sf.f
            if (r0 == 0) goto L507
            r15 = 0
        L507:
            p8.y r15 = (p8.y) r15
            r0 = r15
        L50a:
            if (r0 == 0) goto L50f
            r1.f10340m = r0
            goto L51c
        L50f:
            r0 = 0
            goto L51c
        L511:
            r16 = r4
            r18 = r5
            r20 = r7
            r29 = r9
            r17 = r11
            goto L50f
        L51c:
            if (r0 == 0) goto L68a
            java.lang.Class<?> r2 = r12.snsUploadPackHelperClass
            if (r2 == 0) goto L644
            java.lang.String r3 = r2.getName()
            long r4 = r27.length()
            long r7 = r28.length()
            long r13 = r13.f10315a
            java.lang.reflect.Constructor r9 = r0.f10442b
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r11 = "朋友圈实况发布入队: helper="
            java.lang.String r15 = " image="
            java.lang.StringBuilder r3 = bc.e.p(r11, r3, r15, r6, r10)
            r3.append(r4)
            java.lang.String r4 = ") video="
            r3.append(r4)
            r4 = r18
            r3.append(r4)
            java.lang.String r5 = ") durationMs="
            j8.b.s(r3, r10, r7, r5)
            r3.append(r13)
            java.lang.String r5 = " coverTimeMs="
            java.lang.String r7 = " element="
            r10 = r20
            j8.b.s(r3, r5, r10, r7)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r1.l(r3)
            r3 = r29
            r5 = r17
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r5}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r2, r5)
            if (r2 == 0) goto L684
            java.lang.reflect.Method r5 = r12.snsSetContentMethod     // Catch: java.lang.Throwable -> L590
            r7 = r16
            j(r2, r7, r5)     // Catch: java.lang.Throwable -> L590
            if (r32 == 0) goto L593
            boolean r5 = og.m.t0(r32)     // Catch: java.lang.Throwable -> L590
            if (r5 == 0) goto L588
            goto L593
        L588:
            java.lang.reflect.Method r5 = r12.snsSetSdkIdMethod     // Catch: java.lang.Throwable -> L590
            r7 = r32
            j(r2, r7, r5)     // Catch: java.lang.Throwable -> L590
            goto L593
        L590:
            r0 = move-exception
            goto L66e
        L593:
            if (r33 == 0) goto L5a3
            boolean r5 = og.m.t0(r33)     // Catch: java.lang.Throwable -> L590
            if (r5 == 0) goto L59c
            goto L5a3
        L59c:
            java.lang.reflect.Method r5 = r12.snsSetSdkAppNameMethod     // Catch: java.lang.Throwable -> L590
            r7 = r33
            j(r2, r7, r5)     // Catch: java.lang.Throwable -> L590
        L5a3:
            java.lang.reflect.Constructor r5 = r0.f10442b     // Catch: java.lang.Throwable -> L590
            java.lang.Integer r7 = java.lang.Integer.valueOf(r31)     // Catch: java.lang.Throwable -> L590
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L590
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r5, r7)     // Catch: java.lang.Throwable -> L590
            if (r5 == 0) goto L644
            java.lang.reflect.Constructor r7 = r0.f10442b     // Catch: java.lang.Throwable -> L590
            java.lang.Integer r8 = java.lang.Integer.valueOf(r23)     // Catch: java.lang.Throwable -> L590
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r8}     // Catch: java.lang.Throwable -> L590
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r7, r4)     // Catch: java.lang.Throwable -> L590
            if (r4 == 0) goto L644
            java.lang.reflect.Field r7 = r0.f10443c     // Catch: java.lang.Throwable -> L590
            boolean r7 = h.Hchat.utils.KavaReflector.writeField(r7, r5, r4)     // Catch: java.lang.Throwable -> L590
            if (r7 == 0) goto L668
            java.lang.reflect.Field r7 = r0.f10444d     // Catch: java.lang.Throwable -> L590
            boolean r6 = h.Hchat.utils.KavaReflector.writeField(r7, r4, r6)     // Catch: java.lang.Throwable -> L590
            if (r6 == 0) goto L668
            java.lang.reflect.Field r6 = r0.f10445e     // Catch: java.lang.Throwable -> L590
            boolean r3 = h.Hchat.utils.KavaReflector.writeField(r6, r4, r3)     // Catch: java.lang.Throwable -> L590
            if (r3 == 0) goto L668
            java.lang.reflect.Field r3 = r0.f10446f     // Catch: java.lang.Throwable -> L590
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L590
            boolean r3 = h.Hchat.utils.KavaReflector.writeField(r3, r4, r6)     // Catch: java.lang.Throwable -> L590
            if (r3 == 0) goto L668
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L590
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L590
            r3.add(r5)     // Catch: java.lang.Throwable -> L590
            java.lang.reflect.Method r4 = r0.f10441a     // Catch: java.lang.Throwable -> L590
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L590
            h.Hchat.utils.KavaReflector.invokeOrThrow(r4, r2, r3)     // Catch: java.lang.Throwable -> L590
            java.lang.reflect.Method r0 = r0.f10441a     // Catch: java.lang.Throwable -> L590
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L590
            r3.<init>()     // Catch: java.lang.Throwable -> L590
            java.lang.String r4 = "朋友圈实况发布媒体入库完成: setUploadList="
            r3.append(r4)     // Catch: java.lang.Throwable -> L590
            r3.append(r0)     // Catch: java.lang.Throwable -> L590
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L590
            r1.l(r0)     // Catch: java.lang.Throwable -> L590
            java.lang.reflect.Method r0 = r12.snsCommitMethod     // Catch: java.lang.Throwable -> L590
            r7 = 0
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L590
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r2, r3)     // Catch: java.lang.Throwable -> L590
            boolean r2 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L590
            if (r2 == 0) goto L620
            r9 = r0
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L590
            goto L621
        L620:
            r9 = 0
        L621:
            if (r9 == 0) goto L628
            int r7 = r9.intValue()     // Catch: java.lang.Throwable -> L590
            goto L629
        L628:
            r7 = 0
        L629:
            if (r7 > 0) goto L646
            if (r9 == 0) goto L62e
            goto L630
        L62e:
            java.lang.String r9 = "null"
        L630:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L590
            r0.<init>()     // Catch: java.lang.Throwable -> L590
            java.lang.String r2 = "朋友圈实况发布失败: commit返回="
            r0.append(r2)     // Catch: java.lang.Throwable -> L590
            r0.append(r9)     // Catch: java.lang.Throwable -> L590
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L590
            r1.l(r0)     // Catch: java.lang.Throwable -> L590
        L644:
            r12 = 0
            goto L696
        L646:
            boolean r0 = r1.t()     // Catch: java.lang.Throwable -> L590
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L590
            r2.<init>()     // Catch: java.lang.Throwable -> L590
            java.lang.String r3 = "朋友圈实况发布提交完成: localId="
            r2.append(r3)     // Catch: java.lang.Throwable -> L590
            r2.append(r9)     // Catch: java.lang.Throwable -> L590
            java.lang.String r3 = " triggerUpload="
            r2.append(r3)     // Catch: java.lang.Throwable -> L590
            r2.append(r0)     // Catch: java.lang.Throwable -> L590
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L590
            r1.l(r2)     // Catch: java.lang.Throwable -> L590
            r12 = r0
            goto L696
        L668:
            java.lang.String r0 = "朋友圈实况发布失败: 实况媒体字段写入失败"
            r1.l(r0)     // Catch: java.lang.Throwable -> L590
            goto L644
        L66e:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "朋友圈实况发布异常: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.l(r0)
            goto L644
        L684:
            java.lang.String r0 = "朋友圈实况发布失败: 创建UploadPackHelper失败"
            r1.l(r0)
            goto L644
        L68a:
            java.lang.String r0 = "朋友圈实况发布失败: 当前微信没有实况上传入口"
            r1.l(r0)
            goto L644
        L690:
            java.lang.String r0 = "朋友圈实况发布失败: 实况视频无效"
            r1.l(r0)
            goto L644
        L696:
            return r12
        L697:
            r22 = 0
            return r22
        L69a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2be
            throw r0
    }

    public final boolean w(org.json.JSONObject r13) {
            r12 = this;
            java.lang.String r3 = ""
            if (r13 != 0) goto L12
            java.lang.String r7 = ""
            r1 = 0
            java.lang.String r6 = ""
            r4 = r3
            r5 = r3
            r0 = r12
            boolean r13 = r0.v(r1, r3, r4, r5, r6, r7)
            return r13
        L12:
            java.lang.String r0 = "path"
            java.lang.String r0 = r13.optString(r0, r3)
            java.lang.String r1 = "livePhotoPath"
            java.lang.String r0 = r13.optString(r1, r0)
            java.lang.String r1 = "content"
            java.lang.String r1 = r13.optString(r1, r3)
            java.lang.String r2 = "picPath"
            java.lang.String r0 = r13.optString(r2, r0)
            java.lang.String r2 = "imagePath"
            java.lang.String r4 = r13.optString(r2, r0)
            java.lang.String r0 = "liveVideoPath"
            java.lang.String r0 = r13.optString(r0, r3)
            java.lang.String r2 = "videoPath"
            java.lang.String r5 = r13.optString(r2, r0)
            java.lang.String r0 = "sdkId"
            java.lang.String r6 = r13.optString(r0, r3)
            java.lang.String r0 = "sdkAppName"
            java.lang.String r7 = r13.optString(r0, r3)
            java.lang.String r0 = "coverTime"
            r2 = 0
            long r8 = r13.optLong(r0, r2)
            java.lang.String r0 = "coverTimeMs"
            long r8 = r13.optLong(r0, r8)
            int r13 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r13 >= 0) goto L5f
            r10 = r2
            r3 = r1
            r1 = r10
        L5d:
            r0 = r12
            goto L62
        L5f:
            r3 = r1
            r1 = r8
            goto L5d
        L62:
            boolean r13 = r0.v(r1, r3, r4, r5, r6, r7)
            return r13
    }

    public final boolean x(java.lang.String r9, java.util.List r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            if (r10 != 0) goto L4
            tf.t r10 = tf.t.f13167g
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        Ld:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r10.next()
            if (r1 == 0) goto L28
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L28
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 == 0) goto Ld
            r0.add(r1)
            goto Ld
        L2f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r0.iterator()
        L38:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r10.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = og.m.t0(r1)
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L38
            r6.add(r0)
            goto L38
        L59:
            r4 = 0
            r2 = r8
            r3 = r9
            r5 = r11
            r7 = r12
            boolean r9 = r2.r(r3, r4, r5, r6, r7)
            return r9
    }

    public final boolean y(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            if (r8 == 0) goto Lb
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            goto Lc
        Lb:
            r8 = 0
        Lc:
            if (r8 != 0) goto L10
            java.lang.String r8 = ""
        L10:
            r2 = r8
            tf.t r4 = tf.t.f13167g
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            boolean r7 = r0.r(r1, r2, r3, r4, r5)
            return r7
    }

    public final boolean z(org.json.JSONObject r6) {
            r5 = this;
            java.lang.String r0 = ""
            if (r6 != 0) goto L9
            boolean r6 = r5.y(r0, r0, r0, r0)
            return r6
        L9:
            java.lang.String r1 = "path"
            java.lang.String r1 = r6.optString(r1, r0)
            java.lang.String r2 = "videoPath"
            java.lang.String r1 = r6.optString(r2, r1)
            java.lang.String r2 = "content"
            java.lang.String r2 = r6.optString(r2, r0)
            java.lang.String r3 = "sdkId"
            java.lang.String r3 = r6.optString(r3, r0)
            java.lang.String r4 = "sdkAppName"
            java.lang.String r6 = r6.optString(r4, r0)
            boolean r6 = r5.y(r2, r1, r3, r6)
            return r6
    }
}
