package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f10400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.p f10401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final okhttp3.OkHttpClient f10402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f10403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f10404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final android.os.Handler f10405f;

    public o(r8.g r3, fg.p r4) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.f10400a = r3
            r2.f10401b = r4
            okhttp3.OkHttpClient$Builder r3 = new okhttp3.OkHttpClient$Builder
            r3.<init>()
            r0 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r3 = r3.connectTimeout(r0, r4)
            r0 = 120(0x78, double:5.93E-322)
            okhttp3.OkHttpClient$Builder r3 = r3.readTimeout(r0, r4)
            r0 = 180(0xb4, double:8.9E-322)
            okhttp3.OkHttpClient$Builder r3 = r3.callTimeout(r0, r4)
            okhttp3.OkHttpClient r3 = r3.build()
            r2.f10402c = r3
            p8.m r3 = new p8.m
            r4 = 0
            r3.<init>(r2, r4)
            sf.d r4 = sf.d.f12415g
            sf.c r3 = be.h.G(r4, r3)
            r2.f10403d = r3
            p8.m r3 = new p8.m
            r0 = 1
            r3.<init>(r2, r0)
            sf.c r3 = be.h.G(r4, r3)
            r2.f10404e = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r2.f10405f = r3
            return
    }

    public static boolean a(java.lang.Object r3, java.lang.reflect.Method r4) {
            java.lang.Class[] r4 = r4.getParameterTypes()
            r4.getClass()
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lf
            r4 = r4[r1]
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L19
            boolean r3 = r4.isInstance(r3)
            if (r3 != r2) goto L19
            return r2
        L19:
            return r1
    }

    public static void b(java.io.InputStream r6, java.io.FileOutputStream r7, long r8, java.util.concurrent.atomic.AtomicBoolean r10) {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
        L6:
            boolean r3 = r10.get()
            if (r3 != 0) goto L24
            int r3 = r6.read(r0)
            if (r3 > 0) goto L13
            return
        L13:
            long r4 = (long) r3
            long r1 = r1 + r4
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 > 0) goto L1e
            r4 = 0
            r7.write(r0, r4, r3)
            goto L6
        L1e:
            java.lang.String r6 = "媒体文件过大"
            j8.o.A(r6)
            return
        L24:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException
            java.lang.String r7 = "已取消"
            r6.<init>(r7)
            throw r6
    }

    public static java.lang.String c(java.lang.String r3) {
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&#38;"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            return r3
    }

    public static java.util.ArrayList d(java.lang.Object r5) {
            java.util.ArrayList r0 = i(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r3 = r2.getType()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r4)
            r4 = 0
            if (r3 != 0) goto L27
            goto L3d
        L27:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r5)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L32
            java.lang.String r2 = (java.lang.String) r2
            goto L33
        L32:
            r2 = r4
        L33:
            if (r2 == 0) goto L3d
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r4 = r2.toString()
        L3d:
            if (r4 == 0) goto Ld
            r1.add(r4)
            goto Ld
        L43:
            return r1
    }

    public static java.lang.Object f(int r4, java.lang.Object r5, java.util.Set r6) {
            if (r5 == 0) goto Lc8
            r0 = 5
            if (r4 > r0) goto Lc8
            boolean r0 = r6.add(r5)
            if (r0 != 0) goto Ld
            goto Lc8
        Ld:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            return r5
        L1e:
            boolean r0 = r5 instanceof java.lang.Object[]
            r1 = 0
            if (r0 == 0) goto L36
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r0 = r5.length
        L26:
            if (r1 >= r0) goto Lc8
            r2 = r5[r1]
            int r3 = r4 + 1
            java.lang.Object r2 = f(r3, r2, r6)
            if (r2 == 0) goto L33
            return r2
        L33:
            int r1 = r1 + 1
            goto L26
        L36:
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L53
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L40:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r0 = r5.next()
            int r1 = r4 + 1
            java.lang.Object r0 = f(r1, r0, r6)
            if (r0 == 0) goto L40
            return r0
        L53:
            boolean r0 = r5 instanceof android.view.View
            if (r0 == 0) goto L64
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r5 = r5.getTag()
            int r4 = r4 + 1
            java.lang.Object r4 = f(r4, r5, r6)
            return r4
        L64:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "java."
            boolean r2 = og.t.d0(r0, r2, r1)
            if (r2 != 0) goto Lc8
            java.lang.String r2 = "android."
            boolean r0 = og.t.d0(r0, r2, r1)
            if (r0 == 0) goto L7d
            goto Lc8
        L7d:
            java.lang.Class r0 = r5.getClass()
        L81:
            if (r0 == 0) goto Lc8
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Lc8
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L93:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc3
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto L93
            java.lang.Class r3 = r2.getType()
            boolean r3 = r3.isPrimitive()
            if (r3 == 0) goto Lb4
            goto L93
        Lb4:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r5)
            if (r2 == 0) goto L93
            int r3 = r4 + 1
            java.lang.Object r2 = f(r3, r2, r6)
            if (r2 == 0) goto L93
            return r2
        Lc3:
            java.lang.Class r0 = r0.getSuperclass()
            goto L81
        Lc8:
            r4 = 0
            return r4
    }

    public static java.lang.Object g(int r9, java.lang.Object r10, java.util.Set r11) {
            r0 = 0
            if (r10 == 0) goto L125
            r1 = 5
            if (r9 > r1) goto L125
            boolean r1 = r11.add(r10)
            if (r1 != 0) goto Le
            goto L125
        Le:
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.protocal.protobuf.TimeLineObject"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1f
            return r10
        L1f:
            boolean r1 = r10 instanceof java.lang.Object[]
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L38
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            int r1 = r10.length
        L28:
            if (r3 >= r1) goto L125
            r2 = r10[r3]
            int r5 = r9 + 1
            java.lang.Object r2 = g(r5, r2, r11)
            if (r2 == 0) goto L35
            return r2
        L35:
            int r3 = r3 + 1
            goto L28
        L38:
            boolean r1 = r10 instanceof java.util.Collection
            if (r1 == 0) goto L55
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L42:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L125
            java.lang.Object r1 = r10.next()
            int r2 = r9 + 1
            java.lang.Object r1 = g(r2, r1, r11)
            if (r1 == 0) goto L42
            return r1
        L55:
            boolean r1 = r10 instanceof android.view.View
            if (r1 == 0) goto L65
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r10 = r10.getTag()
            int r9 = r9 + r4
            java.lang.Object r9 = g(r9, r10, r11)
            return r9
        L65:
            java.lang.Class r1 = r10.getClass()
        L69:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r1 == 0) goto Lc3
            boolean r6 = r1.equals(r5)
            if (r6 != 0) goto Lc3
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r1)
            java.util.Iterator r5 = r5.iterator()
        L7b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb0
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto Lac
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto Lac
            java.lang.Class r7 = r7.getReturnType()
            java.lang.String r7 = r7.getName()
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto Lac
            r7 = r4
            goto Lad
        Lac:
            r7 = r3
        Lad:
            if (r7 == 0) goto L7b
            goto Lb1
        Lb0:
            r6 = r0
        Lb1:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto Lbe
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r6, r10, r5)
            if (r5 == 0) goto Lbe
            return r5
        Lbe:
            java.lang.Class r1 = r1.getSuperclass()
            goto L69
        Lc3:
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "java."
            boolean r2 = og.t.d0(r1, r2, r3)
            if (r2 != 0) goto L125
            java.lang.String r2 = "android."
            boolean r1 = og.t.d0(r1, r2, r3)
            if (r1 == 0) goto Ldc
            goto L125
        Ldc:
            java.lang.Class r1 = r10.getClass()
        Le0:
            if (r1 == 0) goto L125
            boolean r2 = r1.equals(r5)
            if (r2 != 0) goto L125
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        Lf0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L120
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r6 = r3.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto Lf0
            java.lang.Class r6 = r3.getType()
            boolean r6 = r6.isPrimitive()
            if (r6 == 0) goto L111
            goto Lf0
        L111:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r10)
            if (r3 == 0) goto Lf0
            int r6 = r9 + 1
            java.lang.Object r3 = g(r6, r3, r11)
            if (r3 == 0) goto Lf0
            return r3
        L120:
            java.lang.Class r1 = r1.getSuperclass()
            goto Le0
        L125:
            return r0
    }

    public static java.lang.String h(java.lang.Object r2, java.lang.String r3) {
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r3)
            boolean r3 = r2 instanceof java.lang.String
            r0 = 0
            if (r3 == 0) goto Lc
            java.lang.String r2 = (java.lang.String) r2
            goto Ld
        Lc:
            r2 = r0
        Ld:
            java.lang.String r3 = ""
            if (r2 != 0) goto L12
            r2 = r3
        L12:
            java.lang.String r2 = c(r2)
            boolean r1 = k(r2)
            if (r1 == 0) goto L1d
            r0 = r2
        L1d:
            if (r0 != 0) goto L20
            return r3
        L20:
            return r0
    }

    public static java.util.ArrayList i(java.lang.Object r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r6 = r6.getClass()
        L9:
            if (r6 == 0) goto L60
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L60
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L40
            boolean r4 = r4.isSynthetic()
            if (r4 == 0) goto L3e
            goto L40
        L3e:
            r4 = 0
            goto L41
        L40:
            r4 = 1
        L41:
            if (r4 != 0) goto L20
            r2.add(r3)
            goto L20
        L47:
            java.util.Iterator r1 = r2.iterator()
        L4b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r0.add(r2)
            goto L4b
        L5b:
            java.lang.Class r6 = r6.getSuperclass()
            goto L9
        L60:
            return r0
    }

    public static boolean k(java.lang.String r2) {
            java.lang.String r0 = "https://"
            r1 = 1
            boolean r0 = og.t.d0(r2, r0, r1)
            if (r0 != 0) goto L14
            java.lang.String r0 = "http://"
            boolean r2 = og.t.d0(r2, r0, r1)
            if (r2 == 0) goto L12
            goto L14
        L12:
            r2 = 0
            return r2
        L14:
            return r1
    }

    public static boolean l(java.lang.String r2) {
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.graphics.BitmapFactory.decodeFile(r2, r0)
            int r2 = r0.outWidth
            if (r2 <= 0) goto L14
            int r2 = r0.outHeight
            if (r2 <= 0) goto L14
            return r1
        L14:
            r2 = 0
            return r2
    }

    public static boolean m(java.lang.String r8) {
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r8)     // Catch: java.lang.Throwable -> L1d
            r8 = 9
            java.lang.String r8 = r0.extractMetadata(r8)     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            if (r8 == 0) goto L1f
            java.lang.Long r8 = og.t.g0(r8)     // Catch: java.lang.Throwable -> L1d
            if (r8 == 0) goto L1f
            long r3 = r8.longValue()     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r8 = move-exception
            goto L59
        L1f:
            r3 = r1
        L20:
            r8 = 18
            java.lang.String r8 = r0.extractMetadata(r8)     // Catch: java.lang.Throwable -> L1d
            r5 = 10
            r6 = 0
            if (r8 == 0) goto L36
            java.lang.Integer r8 = og.t.e0(r5, r8)     // Catch: java.lang.Throwable -> L1d
            if (r8 == 0) goto L36
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L1d
            goto L37
        L36:
            r8 = r6
        L37:
            r7 = 19
            java.lang.String r7 = r0.extractMetadata(r7)     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L4a
            java.lang.Integer r5 = og.t.e0(r5, r7)     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L4a
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L1d
            goto L4b
        L4a:
            r5 = r6
        L4b:
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L54
            if (r8 <= 0) goto L54
            if (r5 <= 0) goto L54
            r6 = 1
        L54:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L1d
            goto L5f
        L59:
            sf.f r1 = new sf.f
            r1.<init>(r8)
            r8 = r1
        L5f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r8 instanceof sf.f
            if (r2 == 0) goto L66
            r8 = r1
        L66:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r0.release()     // Catch: java.lang.Throwable -> L6b
        L6b:
            boolean r8 = r8.booleanValue()
            return r8
    }

    public static boolean n(java.lang.Object r4) {
            java.util.ArrayList r4 = i(r4)
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            goto L5f
        Lc:
            java.util.Iterator r0 = r4.iterator()
        L10:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r2 = r2.getType()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L10
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L2f
            goto L5f
        L2f:
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r4.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Class r2 = r0.getType()
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r2 = gg.l.a(r2, r3)
            r3 = 1
            if (r2 != 0) goto L5b
            java.lang.Class r0 = r0.getType()
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L59
            goto L5b
        L59:
            r0 = r1
            goto L5c
        L5b:
            r0 = r3
        L5c:
            if (r0 == 0) goto L33
            return r3
        L5f:
            return r1
    }

    public static p8.s p(java.lang.Object r13, boolean r14) {
            java.util.ArrayList r0 = d(r13)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = k(r4)
            if (r4 == 0) goto Ld
            r1.add(r3)
            goto Ld
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = c(r3)
            r2.add(r3)
            goto L31
        L45:
            java.util.Set r1 = tf.m.T1(r2)
            java.util.List r1 = tf.m.P1(r1)
            java.lang.String r2 = "d"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r13, r2)
            boolean r3 = r2 instanceof java.lang.String
            r4 = 0
            if (r3 == 0) goto L5b
            java.lang.String r2 = (java.lang.String) r2
            goto L5c
        L5b:
            r2 = r4
        L5c:
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L76
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L76
            boolean r6 = og.m.t0(r2)
            if (r6 != 0) goto L71
            goto L72
        L71:
            r2 = r4
        L72:
            if (r2 == 0) goto L76
        L74:
            r7 = r2
            goto La8
        L76:
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L99
            java.lang.Object r2 = r0.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L95
            boolean r6 = k(r6)
            if (r6 != 0) goto L95
            r6 = r5
            goto L96
        L95:
            r6 = r3
        L96:
            if (r6 == 0) goto L7a
            goto L9a
        L99:
            r2 = r4
        L9a:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L9f
            goto L74
        L9f:
            int r0 = java.lang.System.identityHashCode(r13)
            java.lang.String r2 = java.lang.Integer.toHexString(r0)
            goto L74
        La8:
            java.lang.String r0 = "e"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r13, r0)
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto Lb5
            java.lang.Number r0 = (java.lang.Number) r0
            goto Lb6
        Lb5:
            r0 = r4
        Lb6:
            if (r0 == 0) goto Lbe
            int r0 = r0.intValue()
            r8 = r0
            goto Lbf
        Lbe:
            r8 = r3
        Lbf:
            java.lang.String r0 = "o"
            java.lang.String r0 = h(r13, r0)
            java.lang.String r2 = "q"
            java.lang.String r2 = h(r13, r2)
            boolean r6 = og.m.t0(r2)
            java.lang.String r9 = "n"
            if (r6 != 0) goto Ld8
            java.lang.String r6 = h(r13, r9)
            goto Lf3
        Ld8:
            boolean r6 = og.m.t0(r0)
            java.lang.String r10 = "i"
            if (r6 != 0) goto Le5
            java.lang.String r6 = h(r13, r10)
            goto Lf3
        Le5:
            java.lang.String r6 = h(r13, r10)
            boolean r10 = og.m.t0(r6)
            if (r10 == 0) goto Lf3
            java.lang.String r6 = h(r13, r9)
        Lf3:
            boolean r9 = og.m.t0(r6)
            if (r9 == 0) goto L104
            java.lang.Object r1 = tf.m.v1(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L103
            java.lang.String r1 = ""
        L103:
            r6 = r1
        L104:
            r9 = r6
            boolean r1 = og.m.t0(r2)
            if (r1 == 0) goto L10d
            r10 = r0
            goto L10e
        L10d:
            r10 = r2
        L10e:
            if (r14 == 0) goto L150
            java.util.ArrayList r14 = i(r13)
            dg.n r0 = new dg.n
            r1 = 6
            r0.<init>(r14, r1)
            c9.k1 r14 = new c9.k1
            r1 = 20
            r14.<init>(r13, r1)
            ng.i r1 = new ng.i
            r1.<init>(r0, r5, r14)
            c9.k1 r14 = new c9.k1
            r0 = 21
            r14.<init>(r13, r0)
            ng.i r14 = ng.m.X(r1, r14)
            ng.h r0 = new ng.h
            r0.<init>(r14)
        L136:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L149
            java.lang.Object r14 = r0.next()
            if (r14 == r13) goto L136
            boolean r1 = n(r14)
            if (r1 == 0) goto L136
            goto L14a
        L149:
            r14 = r4
        L14a:
            if (r14 == 0) goto L150
            p8.s r4 = p(r14, r3)
        L150:
            r12 = r4
            p8.s r6 = new p8.s
            r7.getClass()
            r11 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
    }

    public final java.lang.String e(java.util.List r19, java.lang.String r20, java.lang.String r21, long r22, java.util.concurrent.atomic.AtomicBoolean r24) {
            r18 = this;
            r1 = r18
            r2 = r22
            fg.p r4 = r1.f10401b
            java.io.File r5 = new java.io.File
            r8.g r0 = r1.f10400a
            android.content.Context r0 = r0.f11620a
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r6 = "Hchat_sns_forward"
            r5.<init>(r0, r6)
            boolean r0 = r5.isDirectory()
            r6 = 0
            if (r0 != 0) goto L26
            boolean r0 = r5.mkdirs()
            if (r0 != 0) goto L26
        L22:
            r16 = r6
            goto L1ac
        L26:
            int r0 = r20.hashCode()
            java.lang.String r7 = java.lang.Integer.toHexString(r0)
            java.io.File r8 = new java.io.File
            java.lang.String r0 = "remote_v2_"
            java.lang.String r9 = "."
            r10 = r21
            java.lang.String r0 = bc.e.j(r0, r7, r9, r10)
            r8.<init>(r5, r0)
            boolean r0 = r8.isFile()
            if (r0 == 0) goto L56
            long r9 = r8.length()
            r11 = 1
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 > 0) goto L56
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 > 0) goto L56
            java.lang.String r0 = r8.getAbsolutePath()
            return r0
        L56:
            java.util.Iterator r9 = r19.iterator()
        L5a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r10 = r24.get()
            if (r10 != 0) goto L1a4
            java.lang.String r10 = c(r0)
            boolean r0 = k(r10)
            if (r0 != 0) goto L77
            goto L5a
        L77:
            java.io.File r11 = new java.io.File
            java.lang.String r0 = ".part"
            java.lang.String r0 = bc.e.i(r7, r0)
            r11.<init>(r5, r0)
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L16e
            r0.<init>()     // Catch: java.lang.Throwable -> L16e
            okhttp3.Request$Builder r0 = r0.url(r10)     // Catch: java.lang.Throwable -> L16e
            java.lang.String r12 = "User-Agent"
            java.lang.String r13 = "MicroMessenger Client"
            okhttp3.Request$Builder r0 = r0.header(r12, r13)     // Catch: java.lang.Throwable -> L16e
            okhttp3.Request r0 = r0.build()     // Catch: java.lang.Throwable -> L16e
            okhttp3.OkHttpClient r12 = r1.f10402c     // Catch: java.lang.Throwable -> L16e
            okhttp3.Call r0 = r12.newCall(r0)     // Catch: java.lang.Throwable -> L16e
            okhttp3.Response r12 = r0.execute()     // Catch: java.lang.Throwable -> L16e
            boolean r0 = r12.isSuccessful()     // Catch: java.lang.Throwable -> Lcd
            r13 = 0
            if (r0 != 0) goto Ld3
            int r0 = r12.code()     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r14.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r15 = "朋友圈媒体下载响应异常: code="
            r14.append(r15)     // Catch: java.lang.Throwable -> Lcd
            r14.append(r0)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = " url="
            r14.append(r0)     // Catch: java.lang.Throwable -> Lcd
            r14.append(r10)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> Lcd
            r4.invoke(r0, r6)     // Catch: java.lang.Throwable -> Lcd
        Lc8:
            r0 = r13
            r13 = r24
            goto L15e
        Lcd:
            r0 = move-exception
            r13 = r24
        Ld0:
            r6 = r0
            goto L168
        Ld3:
            okhttp3.ResponseBody r0 = r12.body()     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto L146
            long r14 = r0.contentLength()     // Catch: java.lang.Throwable -> Lcd
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 <= 0) goto Le2
            goto Lc8
        Le2:
            java.io.InputStream r14 = r0.byteStream()     // Catch: java.lang.Throwable -> Lcd
            java.io.FileOutputStream r15 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L13c
            r15.<init>(r11, r13)     // Catch: java.lang.Throwable -> L13c
            r13 = r24
            b(r14, r15, r2, r13)     // Catch: java.lang.Throwable -> L134
            r15.close()     // Catch: java.lang.Throwable -> L131
            r14.close()     // Catch: java.lang.Throwable -> L111
            boolean r0 = r11.isFile()     // Catch: java.lang.Throwable -> L111
            if (r0 == 0) goto L12f
            long r14 = r11.length()     // Catch: java.lang.Throwable -> L111
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 > 0) goto L107
            goto L12f
        L107:
            boolean r0 = r8.exists()     // Catch: java.lang.Throwable -> L111
            if (r0 == 0) goto L113
            r8.delete()     // Catch: java.lang.Throwable -> L111
            goto L113
        L111:
            r0 = move-exception
            goto Ld0
        L113:
            boolean r0 = r11.renameTo(r8)     // Catch: java.lang.Throwable -> L111
            if (r0 != 0) goto L11f
            dg.l.a0(r11, r8)     // Catch: java.lang.Throwable -> L111
            r11.delete()     // Catch: java.lang.Throwable -> L111
        L11f:
            boolean r0 = r8.isFile()     // Catch: java.lang.Throwable -> L111
            if (r0 == 0) goto L12f
            long r14 = r8.length()     // Catch: java.lang.Throwable -> L111
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L12f
            r0 = 1
            goto L15e
        L12f:
            r0 = 0
            goto L15e
        L131:
            r0 = move-exception
        L132:
            r6 = r0
            goto L140
        L134:
            r0 = move-exception
            r6 = r0
            throw r6     // Catch: java.lang.Throwable -> L137
        L137:
            r0 = move-exception
            ig.a.i(r15, r6)     // Catch: java.lang.Throwable -> L131
            throw r0     // Catch: java.lang.Throwable -> L131
        L13c:
            r0 = move-exception
            r13 = r24
            goto L132
        L140:
            throw r6     // Catch: java.lang.Throwable -> L141
        L141:
            r0 = move-exception
            ig.a.i(r14, r6)     // Catch: java.lang.Throwable -> L111
            throw r0     // Catch: java.lang.Throwable -> L111
        L146:
            r13 = r24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111
            r0.<init>()     // Catch: java.lang.Throwable -> L111
            java.lang.String r6 = "朋友圈媒体下载响应为空: url="
            r0.append(r6)     // Catch: java.lang.Throwable -> L111
            r0.append(r10)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L111
            r6 = 0
            r4.invoke(r0, r6)     // Catch: java.lang.Throwable -> L111
            goto L12f
        L15e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L111
            r12.close()     // Catch: java.lang.Throwable -> L166
            goto L177
        L166:
            r0 = move-exception
            goto L171
        L168:
            throw r6     // Catch: java.lang.Throwable -> L169
        L169:
            r0 = move-exception
            ig.a.i(r12, r6)     // Catch: java.lang.Throwable -> L166
            throw r0     // Catch: java.lang.Throwable -> L166
        L16e:
            r0 = move-exception
            r13 = r24
        L171:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L177:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 == 0) goto L18d
            r11.delete()
            boolean r11 = r6 instanceof java.lang.InterruptedException
            if (r11 != 0) goto L18d
            java.lang.String r11 = "朋友圈媒体下载失败: "
            java.lang.String r10 = r11.concat(r10)
            r4.invoke(r10, r6)
        L18d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r10 = r0 instanceof sf.f
            if (r10 == 0) goto L194
            r0 = r6
        L194:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a1
            java.lang.String r0 = r8.getAbsolutePath()
            return r0
        L1a1:
            r6 = 0
            goto L5a
        L1a4:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            java.lang.String r2 = "已取消"
            r0.<init>(r2)
            throw r0
        L1ac:
            return r16
    }

    public final boolean j(fg.a r7) {
            r6 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L19
            java.lang.Object r7 = r7.invoke()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L19:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r3 = 1
            r2.<init>(r3)
            ac.l r4 = new ac.l
            r5 = 26
            r4.<init>(r0, r7, r2, r5)
            android.os.Handler r7 = r6.f10405f
            boolean r7 = r7.post(r4)
            if (r7 != 0) goto L35
            goto L46
        L35:
            r4 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            boolean r7 = r2.await(r4, r7)
            if (r7 == 0) goto L46
            boolean r7 = r0.get()
            if (r7 == 0) goto L46
            return r3
        L46:
            return r1
    }

    public final java.lang.String o(java.lang.String r19, java.lang.String r20, java.lang.String r21, long r22, java.util.concurrent.atomic.AtomicBoolean r24) {
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r22
            boolean r0 = og.m.t0(r2)
            r5 = 0
            if (r0 == 0) goto Lf
            goto L15c
        Lf:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r6 = r0.isFile()
            r7 = 1
            if (r6 == 0) goto L2d
            long r9 = r0.length()
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 > 0) goto L2d
            int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r6 > 0) goto L2d
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
        L2d:
            java.io.File r0 = new java.io.File
            r8.g r6 = r1.f10400a
            android.content.Context r9 = r6.f11620a
            java.io.File r9 = r9.getCacheDir()
            java.lang.String r10 = "Hchat_sns_forward"
            r0.<init>(r9, r10)
            boolean r9 = r0.isDirectory()
            if (r9 != 0) goto L4a
            boolean r9 = r0.mkdirs()
            if (r9 != 0) goto L4a
            goto L15c
        L4a:
            java.io.File r9 = new java.io.File
            int r10 = r20.hashCode()
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            java.lang.String r11 = "local_"
            java.lang.String r12 = "."
            r13 = r21
            java.lang.String r10 = bc.e.j(r11, r10, r12, r13)
            r9.<init>(r0, r10)
            boolean r0 = r9.isFile()
            if (r0 == 0) goto L78
            long r10 = r9.length()
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 > 0) goto L78
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 > 0) goto L78
            java.lang.String r0 = r9.getAbsolutePath()
            return r0
        L78:
            java.lang.String r0 = "com.tencent.mm.vfs.w6"
            java.lang.String r10 = "com.tencent.mm.vfs.p6"
            java.lang.String[] r0 = new java.lang.String[]{r0, r10}
            r10 = 0
            r11 = r10
        L82:
            r12 = 1
            r13 = 2
            if (r11 < r13) goto L8a
            r16 = r7
            r7 = r5
            goto Lef
        L8a:
            r13 = r0[r11]
            java.lang.ClassLoader r14 = r6.f11622c
            java.lang.Class r13 = h.Hchat.utils.KavaReflector.loadClass(r13, r14)
            if (r13 == 0) goto L160
            java.util.List r13 = h.Hchat.utils.KavaReflector.declaredMethods(r13)
            java.util.Iterator r13 = r13.iterator()
        L9c:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Ld6
            java.lang.Object r14 = r13.next()
            r15 = r14
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            r16 = r7
            java.lang.Class[] r7 = r15.getParameterTypes()
            int r8 = r15.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 == 0) goto Ld3
            java.lang.Class r8 = r15.getReturnType()
            java.lang.Class<java.io.InputStream> r15 = java.io.InputStream.class
            boolean r8 = gg.l.a(r8, r15)
            if (r8 == 0) goto Ld3
            int r8 = r7.length
            if (r8 != r12) goto Ld3
            r7 = r7[r10]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto Ld3
            goto Ld9
        Ld3:
            r7 = r16
            goto L9c
        Ld6:
            r16 = r7
            r14 = r5
        Ld9:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto L15d
            java.lang.Object[] r7 = new java.lang.Object[]{r2}
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r14, r5, r7)
            boolean r8 = r7 instanceof java.io.InputStream
            if (r8 == 0) goto Lec
            java.io.InputStream r7 = (java.io.InputStream) r7
            goto Led
        Lec:
            r7 = r5
        Led:
            if (r7 == 0) goto L15d
        Lef:
            if (r7 == 0) goto L15c
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L125
            r6.<init>(r9, r10)     // Catch: java.lang.Throwable -> L125
            r8 = r24
            b(r7, r6, r3, r8)     // Catch: java.lang.Throwable -> L128
            r6.close()     // Catch: java.lang.Throwable -> L125
            r7.close()     // Catch: java.lang.Throwable -> L115
            boolean r0 = r9.isFile()     // Catch: java.lang.Throwable -> L115
            if (r0 == 0) goto L117
            long r6 = r9.length()     // Catch: java.lang.Throwable -> L115
            int r0 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r0 > 0) goto L117
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L117
            r10 = r12
            goto L117
        L115:
            r0 = move-exception
            goto L136
        L117:
            if (r10 == 0) goto L11b
            r0 = r9
            goto L11c
        L11b:
            r0 = r5
        L11c:
            if (r0 == 0) goto L123
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L115
            goto L13c
        L123:
            r0 = r5
            goto L13c
        L125:
            r0 = move-exception
            r3 = r0
            goto L130
        L128:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch: java.lang.Throwable -> L12b
        L12b:
            r0 = move-exception
            ig.a.i(r6, r3)     // Catch: java.lang.Throwable -> L125
            throw r0     // Catch: java.lang.Throwable -> L125
        L130:
            throw r3     // Catch: java.lang.Throwable -> L131
        L131:
            r0 = move-exception
            ig.a.i(r7, r3)     // Catch: java.lang.Throwable -> L115
            throw r0     // Catch: java.lang.Throwable -> L115
        L136:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L13c:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 == 0) goto L154
            r9.delete()
            boolean r4 = r3 instanceof java.lang.InterruptedException
            if (r4 != 0) goto L154
            java.lang.String r4 = "读取朋友圈VFS缓存失败: "
            java.lang.String r2 = r4.concat(r2)
            fg.p r4 = r1.f10401b
            r4.invoke(r2, r3)
        L154:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L159
            goto L15a
        L159:
            r5 = r0
        L15a:
            java.lang.String r5 = (java.lang.String) r5
        L15c:
            return r5
        L15d:
            r8 = r24
            goto L163
        L160:
            r16 = r7
            goto L15d
        L163:
            int r11 = r11 + 1
            r7 = r16
            goto L82
    }

    public final p8.c q(p8.v r34, java.util.concurrent.atomic.AtomicBoolean r35) {
            r33 = this;
            r1 = r33
            r0 = r34
            r7 = r35
            java.lang.String r2 = "_video_thumb"
            r0.getClass()
            java.lang.String r8 = r0.f10427b
            java.util.ArrayList r3 = r0.f10429d
            java.lang.String r9 = r0.f10426a
            r7.getClass()
            boolean r4 = r7.get()
            java.lang.String r10 = "已取消"
            if (r4 != 0) goto L511
            int r0 = r0.f10428c
            java.lang.Object r11 = r1.f10404e
            java.lang.String r12 = "_"
            r13 = 0
            r14 = 1
            r15 = 0
            if (r0 == r14) goto L2b
            r4 = 54
            if (r0 != r4) goto L2f
        L2b:
            r34 = r15
            goto L1e1
        L2f:
            r4 = 5
            if (r0 == r4) goto L38
            r4 = 15
            if (r0 != r4) goto L37
            goto L38
        L37:
            r14 = r13
        L38:
            if (r14 == 0) goto L1d5
            java.lang.Object r0 = tf.m.v1(r3)
            p8.s r0 = (p8.s) r0
            if (r0 == 0) goto L1cf
            java.lang.Object r3 = r0.f10416e
            java.lang.String r14 = r0.f10412a
            java.lang.String r4 = "_video"
            java.lang.String r4 = wb.en.i(r9, r12, r14, r4)
            java.lang.String r6 = r1.t(r9, r0, r4, r7)
            if (r6 == 0) goto L1c9
            java.lang.Object r0 = r11.getValue()
            p8.u r0 = (p8.u) r0
            java.lang.reflect.Method r0 = r0.f10425g
            fg.p r11 = r1.f10401b
            if (r0 == 0) goto Ld8
            boolean r4 = a(r3, r0)
            if (r4 != 0) goto L6b
            r34 = r15
            r0 = r34
            r15 = r6
            goto Ldd
        L6b:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r15, r3)     // Catch: java.lang.Throwable -> L7a
            boolean r3 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L7f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L7a
            goto L80
        L7a:
            r0 = move-exception
            r34 = r15
            r15 = r6
            goto Lb6
        L7f:
            r0 = r15
        L80:
            if (r0 == 0) goto Lb2
            java.lang.String r3 = r14.concat(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "jpg"
            r2 = r6
            r5 = 41943040(0x2800000, double:2.0722615E-316)
            r34 = r15
            r15 = r2
            r2 = r0
            java.lang.String r0 = r1.o(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L9f
            boolean r3 = l(r0)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto L9f
            goto Lbc
        L9d:
            r0 = move-exception
            goto Lb6
        L9f:
            if (r0 == 0) goto Laf
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto Laf
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L9d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L9d
            r2.delete()     // Catch: java.lang.Throwable -> L9d
        Laf:
            r0 = r34
            goto Lbc
        Lb2:
            r34 = r15
            r15 = r6
            goto Laf
        Lb6:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Lbc:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 == 0) goto Lcf
            boolean r3 = r2 instanceof java.lang.InterruptedException
            if (r3 != 0) goto Lcf
            java.lang.String r3 = "读取朋友圈视频封面失败: "
            java.lang.String r3 = r3.concat(r14)
            r11.invoke(r3, r2)
        Lcf:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto Ld5
            r0 = r34
        Ld5:
            java.lang.String r0 = (java.lang.String) r0
            goto Ldd
        Ld8:
            r34 = r15
            r15 = r6
            r0 = r34
        Ldd:
            if (r0 == 0) goto Le2
        Ldf:
            r7 = r0
            goto L1b1
        Le2:
            java.lang.String r0 = wb.en.h(r9, r12, r14)
            boolean r2 = r7.get()
            if (r2 != 0) goto L1c3
            java.io.File r2 = new java.io.File
            r8.g r3 = r1.f10400a
            android.content.Context r3 = r3.f11620a
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r4 = "Hchat_sns_forward"
            r2.<init>(r3, r4)
            boolean r3 = r2.isDirectory()
            if (r3 != 0) goto L10b
            boolean r3 = r2.mkdirs()
            if (r3 != 0) goto L10b
            r0 = r34
            goto L1ad
        L10b:
            java.io.File r3 = new java.io.File
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r4 = "video_thumb_"
            java.lang.String r5 = ".jpg"
            java.lang.String r0 = eh.a.n(r4, r0, r5)
            r3.<init>(r2, r0)
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L139
            java.lang.String r0 = r3.getAbsolutePath()
            r0.getClass()
            boolean r0 = l(r0)
            if (r0 == 0) goto L139
            java.lang.String r0 = r3.getAbsolutePath()
            goto L1ad
        L139:
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            r2.setDataSource(r15)     // Catch: java.lang.Throwable -> L179
            android.graphics.Bitmap r4 = r2.getFrameAtTime()     // Catch: java.lang.Throwable -> L179
            if (r4 == 0) goto L175
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L15a
            r5.<init>(r3, r13)     // Catch: java.lang.Throwable -> L15a
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L16d
            r6 = 90
            boolean r0 = r4.compress(r0, r6, r5)     // Catch: java.lang.Throwable -> L16d
            if (r0 != 0) goto L15c
            r5.close()     // Catch: java.lang.Throwable -> L15a
            goto L16a
        L15a:
            r0 = move-exception
            goto L17c
        L15c:
            r5.close()     // Catch: java.lang.Throwable -> L15a
            java.lang.String r0 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L15a
            boolean r5 = l(r0)     // Catch: java.lang.Throwable -> L15a
            if (r5 == 0) goto L16a
            goto L182
        L16a:
            r0 = r34
            goto L182
        L16d:
            r0 = move-exception
            r6 = r0
            throw r6     // Catch: java.lang.Throwable -> L170
        L170:
            r0 = move-exception
            ig.a.i(r5, r6)     // Catch: java.lang.Throwable -> L15a
            throw r0     // Catch: java.lang.Throwable -> L15a
        L175:
            r0 = r34
            r4 = r0
            goto L182
        L179:
            r0 = move-exception
            r4 = r34
        L17c:
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L182:
            java.lang.Throwable r5 = sf.g.b(r0)
            if (r5 == 0) goto L198
            r3.delete()
            boolean r6 = r5 instanceof java.lang.InterruptedException
            if (r6 != 0) goto L198
            java.lang.String r6 = "生成朋友圈视频封面失败: "
            java.lang.String r6 = r6.concat(r15)
            r11.invoke(r6, r5)
        L198:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L19e
            r0 = r34
        L19e:
            java.lang.String r0 = (java.lang.String) r0
            if (r4 == 0) goto L1a5
            r4.recycle()
        L1a5:
            r2.release()     // Catch: java.lang.Throwable -> L1a8
        L1a8:
            if (r0 != 0) goto L1ad
            r3.delete()
        L1ad:
            if (r0 == 0) goto L1bc
            goto Ldf
        L1b1:
            p8.c r3 = new p8.c
            r5 = 0
            r4 = r8
            r8 = 2
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            goto L509
        L1bc:
            java.lang.String r0 = "朋友圈视频封面生成失败"
            j8.o.A(r0)
        L1c1:
            r0 = 0
            return r0
        L1c3:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>(r10)
            throw r0
        L1c9:
            java.lang.String r0 = "朋友圈视频下载失败"
            j8.o.A(r0)
            goto L1c1
        L1cf:
            java.lang.String r0 = "未找到朋友圈视频"
            j8.o.A(r0)
            goto L1c1
        L1d5:
            r4 = r8
            p8.c r3 = new p8.c
            r7 = 0
            r8 = 14
            r5 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L1e1:
            r15 = 9
            java.util.List r16 = tf.m.L1(r15, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = tf.n.e1(r16)
            r0.<init>(r2)
            java.util.Iterator r2 = r16.iterator()
            r3 = r13
        L1f5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L212
            java.lang.Object r4 = r2.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L20e
            p8.s r4 = (p8.s) r4
            java.lang.String r3 = r1.r(r4, r3, r7)
            r0.add(r3)
            r3 = r5
            goto L1f5
        L20e:
            a.a.Q0()
            throw r34
        L212:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = tf.n.e1(r16)
            r0.<init>(r3)
            java.util.Iterator r17 = r16.iterator()
            r3 = r13
        L225:
            boolean r4 = r17.hasNext()
            if (r4 == 0) goto L316
            java.lang.Object r4 = r17.next()
            int r18 = r3 + 1
            if (r3 < 0) goto L312
            p8.s r4 = (p8.s) r4
            java.lang.Object r3 = r2.get(r3)
            if (r3 != 0) goto L2fe
            java.lang.Object r3 = r11.getValue()
            p8.u r3 = (p8.u) r3
            r5 = r2
            java.lang.reflect.Method r2 = r3.f10419a
            if (r2 == 0) goto L258
            java.lang.reflect.Method r3 = r3.f10420b
            if (r3 == 0) goto L258
            java.lang.Class[] r6 = r3.getParameterTypes()
            r6 = r6[r13]
            java.lang.Object r13 = r4.f10416e
            boolean r6 = r6.isInstance(r13)
            if (r6 != 0) goto L25d
        L258:
            r14 = r0
            r13 = r5
        L25a:
            r0 = 0
            goto L2fa
        L25d:
            java.lang.Class[] r6 = r3.getParameterTypes()
            r13 = 3
            r6 = r6[r13]
            r6.getClass()
            java.util.List r13 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            java.util.Iterator r19 = r13.iterator()
        L26f:
            boolean r20 = r19.hasNext()
            if (r20 == 0) goto L298
            java.lang.Object r20 = r19.next()
            r21 = r20
            java.lang.reflect.Field r21 = (java.lang.reflect.Field) r21
            int r22 = r21.getModifiers()
            boolean r22 = java.lang.reflect.Modifier.isStatic(r22)
            if (r22 != 0) goto L294
            java.lang.Class r15 = r21.getType()
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            boolean r14 = gg.l.a(r15, r14)
            if (r14 == 0) goto L294
            goto L29a
        L294:
            r14 = 1
            r15 = 9
            goto L26f
        L298:
            r20 = r34
        L29a:
            r14 = r20
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            if (r14 == 0) goto L2e0
            dg.n r15 = new dg.n
            r19 = r0
            r0 = 6
            r15.<init>(r13, r0)
            ha.q r0 = new ha.q
            r13 = 3
            r0.<init>(r6, r13)
            ng.i r6 = new ng.i
            r13 = 1
            r6.<init>(r15, r13, r0)
            o9.e r0 = new o9.e
            r15 = 10
            r0.<init>(r15)
            ng.i r0 = ng.m.X(r6, r0)
            ng.h r6 = new ng.h
            r6.<init>(r0)
        L2c4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2dd
            java.lang.Object r0 = r6.next()
            java.lang.Object r15 = h.Hchat.utils.KavaReflector.readField(r14, r0)
            java.lang.String r13 = "timeline"
            boolean r13 = gg.l.a(r15, r13)
            if (r13 == 0) goto L2db
            goto L2e3
        L2db:
            r13 = 1
            goto L2c4
        L2dd:
            r0 = r34
            goto L2e3
        L2e0:
            r19 = r0
            goto L2dd
        L2e3:
            if (r0 == 0) goto L2f5
            r6 = r5
            r5 = r0
            c9.r0 r0 = new c9.r0
            r13 = r6
            r6 = 4
            r14 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r0 = r1.j(r0)
            goto L2fa
        L2f5:
            r13 = r5
            r14 = r19
            goto L25a
        L2fa:
            if (r0 == 0) goto L300
            r0 = 1
            goto L301
        L2fe:
            r14 = r0
            r13 = r2
        L300:
            r0 = 0
        L301:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r14.add(r0)
            r2 = r13
            r0 = r14
            r3 = r18
            r13 = 0
            r14 = 1
            r15 = 9
            goto L225
        L312:
            a.a.Q0()
            throw r34
        L316:
            r14 = r0
            r13 = r2
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 60000(0xea60, double:2.9644E-319)
            long r17 = r2 + r4
            java.util.Iterator r0 = r16.iterator()
            r11 = 0
        L326:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c2
            java.lang.Object r2 = r0.next()
            int r15 = r11 + 1
            if (r11 < 0) goto L3be
            p8.s r2 = (p8.s) r2
            java.lang.Object r3 = r13.get(r11)
            if (r3 != 0) goto L370
            java.lang.Object r3 = r14.get(r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L370
        L348:
            long r3 = android.os.SystemClock.elapsedRealtime()
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 >= 0) goto L369
            boolean r3 = r7.get()
            if (r3 != 0) goto L363
            java.lang.String r3 = r1.r(r2, r11, r7)
            if (r3 == 0) goto L35d
            goto L36d
        L35d:
            r3 = 500(0x1f4, double:2.47E-321)
            android.os.SystemClock.sleep(r3)
            goto L348
        L363:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>(r10)
            throw r0
        L369:
            java.lang.String r3 = r1.r(r2, r11, r7)
        L36d:
            r13.set(r11, r3)
        L370:
            java.lang.Object r3 = r13.get(r11)
            if (r3 != 0) goto L3bb
            java.lang.String r3 = r2.f10414c
            java.util.List r3 = a.a.x0(r3)
            java.lang.String r2 = r2.f10412a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r12)
            r4.append(r2)
            r4.append(r12)
            r4.append(r11)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "jpg"
            r5 = 41943040(0x2800000, double:2.0722615E-316)
            r32 = r3
            r3 = r2
            r2 = r32
            java.lang.String r2 = r1.e(r2, r3, r4, r5, r7)
            if (r2 == 0) goto L3b6
            boolean r3 = l(r2)
            if (r3 == 0) goto L3ae
            r3 = r2
            goto L3b0
        L3ae:
            r3 = r34
        L3b0:
            if (r3 == 0) goto L3b3
            goto L3b8
        L3b3:
            p.a.v(r2)
        L3b6:
            r3 = r34
        L3b8:
            r13.set(r11, r3)
        L3bb:
            r11 = r15
            goto L326
        L3be:
            a.a.Q0()
            throw r34
        L3c2:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = tf.n.e1(r13)
            r2.<init>(r0)
            java.util.Iterator r0 = r13.iterator()
            r3 = 0
        L3d0:
            boolean r4 = r0.hasNext()
            java.lang.String r5 = "第"
            if (r4 == 0) goto L3f8
            java.lang.Object r4 = r0.next()
            int r6 = r3 + 1
            if (r3 < 0) goto L3f4
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L3e9
            r2.add(r4)
            r3 = r6
            goto L3d0
        L3e9:
            java.lang.String r0 = "张图片下载失败"
            java.lang.String r0 = eh.a.m(r6, r5, r0)
            j8.o.A(r0)
            goto L1c1
        L3f4:
            a.a.Q0()
            throw r34
        L3f8:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L50a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = tf.n.e1(r16)
            r3.<init>(r0)
            java.util.Iterator r4 = r16.iterator()
            r0 = 0
        L40c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4fe
            java.lang.Object r6 = r4.next()
            int r10 = r0 + 1
            if (r0 < 0) goto L4fa
            p8.s r6 = (p8.s) r6
            java.lang.Object r0 = r2.get(r0)
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            p8.s r0 = r6.f10417f
            if (r0 == 0) goto L4e0
            java.lang.String r6 = r6.f10412a
            java.lang.String r11 = r0.f10412a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r12)
            r13.append(r6)
            r13.append(r12)
            r13.append(r11)
            java.lang.String r6 = "_live"
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            java.lang.String r6 = r1.t(r9, r0, r6, r7)
            if (r6 == 0) goto L4d5
            android.media.MediaMetadataRetriever r11 = new android.media.MediaMetadataRetriever
            r11.<init>()
            r11.setDataSource(r6)     // Catch: java.lang.Throwable -> L477
            r15 = 9
            java.lang.String r0 = r11.extractMetadata(r15)     // Catch: java.lang.Throwable -> L46a
            if (r0 == 0) goto L46e
            java.lang.Long r0 = og.t.g0(r0)     // Catch: java.lang.Throwable -> L46a
            if (r0 == 0) goto L46e
            long r16 = r0.longValue()     // Catch: java.lang.Throwable -> L46a
            goto L470
        L46a:
            r0 = move-exception
        L46b:
            r16 = 0
            goto L47b
        L46e:
            r16 = 0
        L470:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> L46a
            r16 = 0
            goto L481
        L477:
            r0 = move-exception
            r15 = 9
            goto L46b
        L47b:
            sf.f r13 = new sf.f
            r13.<init>(r0)
            r0 = r13
        L481:
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            boolean r14 = r0 instanceof sf.f
            if (r14 == 0) goto L48a
            r0 = r13
        L48a:
            java.lang.Number r0 = (java.lang.Number) r0
            r0.longValue()
            r11.release()     // Catch: java.lang.Throwable -> L492
        L492:
            long r13 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 <= 0) goto L4a0
            r11 = 1
            goto L4a1
        L4a0:
            r11 = 0
        L4a1:
            if (r11 == 0) goto L4a4
            goto L4a6
        L4a4:
            r0 = r34
        L4a6:
            if (r0 == 0) goto L4ca
            long r13 = r0.longValue()
            r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 <= 0) goto L4b5
            r13 = r16
        L4b5:
            int r0 = (int) r13
            p8.d r23 = new p8.d
            r29 = 0
            r31 = 120(0x78, float:1.68E-43)
            r27 = 0
            r28 = 0
            r26 = r0
            r25 = r6
            r23.<init>(r24, r25, r26, r27, r28, r29, r31)
        L4c7:
            r0 = r23
            goto L4f4
        L4ca:
            java.lang.String r0 = "张实况视频无效"
            java.lang.String r0 = eh.a.m(r10, r5, r0)
            j8.o.A(r0)
            goto L1c1
        L4d5:
            java.lang.String r0 = "张实况视频下载失败"
            java.lang.String r0 = eh.a.m(r10, r5, r0)
            j8.o.A(r0)
            goto L1c1
        L4e0:
            r15 = 9
            p8.d r23 = new p8.d
            r29 = 0
            r31 = 126(0x7e, float:1.77E-43)
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r23.<init>(r24, r25, r26, r27, r28, r29, r31)
            goto L4c7
        L4f4:
            r3.add(r0)
            r0 = r10
            goto L40c
        L4fa:
            a.a.Q0()
            throw r34
        L4fe:
            r5 = r3
            p8.c r3 = new p8.c
            r7 = 0
            r4 = r8
            r8 = 12
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
        L509:
            return r3
        L50a:
            java.lang.String r0 = "未找到朋友圈图片"
            j8.o.A(r0)
            goto L1c1
        L511:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>(r10)
            throw r0
    }

    public final java.lang.String r(p8.s r11, int r12, java.util.concurrent.atomic.AtomicBoolean r13) {
            r10 = this;
            java.lang.Object r2 = r10.f10403d
            java.lang.Object r2 = r2.getValue()
            p8.r r2 = (p8.r) r2
            java.lang.reflect.Method r3 = r2.f10408a
            r8 = 0
            if (r3 == 0) goto Lbc
            java.lang.reflect.Method r4 = r2.f10409b
            if (r4 == 0) goto Lbc
            java.lang.reflect.Method r2 = r2.f10410c
            if (r2 == 0) goto Lbc
            java.lang.Object r5 = r11.f10416e
            java.lang.String r9 = r11.f10412a
            boolean r5 = a(r5, r2)
            if (r5 != 0) goto L21
            goto Lbc
        L21:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r3, r8, r5)     // Catch: java.lang.Throwable -> L2f
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2f
            if (r5 == 0) goto L32
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r0 = move-exception
            goto L99
        L32:
            r3 = r8
        L33:
            if (r3 == 0) goto L97
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r9}     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r4, r8, r3)     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L44
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2f
            goto L45
        L44:
            r3 = r8
        L45:
            if (r3 == 0) goto L97
            java.lang.Object r0 = r11.f10416e     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r2, r8, r0)     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L58
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L2f
            goto L59
        L58:
            r0 = r8
        L59:
            if (r0 == 0) goto L97
            java.lang.String r2 = r3.concat(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r0.<init>()     // Catch: java.lang.Throwable -> L2f
            r0.append(r9)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "_"
            r0.append(r3)     // Catch: java.lang.Throwable -> L2f
            r0.append(r12)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "jpg"
            r5 = 41943040(0x2800000, double:2.0722615E-316)
            r1 = r10
            r7 = r13
            java.lang.String r0 = r1.o(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L87
            boolean r3 = l(r0)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L87
            goto L9f
        L87:
            if (r0 == 0) goto L97
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L97
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            r2.delete()     // Catch: java.lang.Throwable -> L2f
        L97:
            r0 = r8
            goto L9f
        L99:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L9f:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 == 0) goto Lb4
            boolean r3 = r2 instanceof java.lang.InterruptedException
            if (r3 != 0) goto Lb4
            java.lang.String r3 = "读取朋友圈本地原图失败: "
            java.lang.String r3 = r3.concat(r9)
            fg.p r4 = r10.f10401b
            r4.invoke(r3, r2)
        Lb4:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto Lb9
            goto Lba
        Lb9:
            r8 = r0
        Lba:
            java.lang.String r8 = (java.lang.String) r8
        Lbc:
            return r8
    }

    public final java.lang.String s(java.lang.String r10, p8.s r11, java.util.concurrent.atomic.AtomicBoolean r12) {
            r9 = this;
            r1 = 0
            java.lang.Object r0 = r9.f10404e     // Catch: java.lang.Throwable -> Lfb
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lfb
            p8.u r0 = (p8.u) r0     // Catch: java.lang.Throwable -> Lfb
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lfb
            r3 = 3
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lfb
            java.lang.reflect.Method r3 = r0.f10424f     // Catch: java.lang.Throwable -> Lfb
            java.lang.reflect.Method r4 = r0.f10423e     // Catch: java.lang.Throwable -> Lfb
            java.lang.reflect.Method[] r3 = new java.lang.reflect.Method[]{r3, r4}     // Catch: java.lang.Throwable -> Lfb
            java.util.List r3 = a.a.y0(r3)     // Catch: java.lang.Throwable -> Lfb
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lfb
        L1f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> Lfb
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L1f
            java.lang.Object r6 = r11.f10416e     // Catch: java.lang.Throwable -> L56
            java.lang.Class[] r7 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L56
            r7.getClass()     // Catch: java.lang.Throwable -> L56
            r8 = 1
            java.lang.Object r7 = tf.l.C0(r8, r7)     // Catch: java.lang.Throwable -> L56
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L1f
            boolean r6 = r7.isInstance(r6)     // Catch: java.lang.Throwable -> L56
            if (r6 != r8) goto L1f
            java.lang.Object r6 = r11.f10416e     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r6 = new java.lang.Object[]{r10, r6}     // Catch: java.lang.Throwable -> L56
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invokeOrThrow(r5, r1, r6)     // Catch: java.lang.Throwable -> L56
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L5b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L56
            goto L5c
        L56:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L101
        L5b:
            r5 = r1
        L5c:
            if (r5 == 0) goto L1f
            boolean r6 = og.m.t0(r5)     // Catch: java.lang.Throwable -> L56
            if (r6 != 0) goto L65
            goto L66
        L65:
            r5 = r1
        L66:
            if (r5 == 0) goto L1f
            r2.add(r5)     // Catch: java.lang.Throwable -> L56
            goto L1f
        L6c:
            java.lang.reflect.Method r10 = r0.f10424f     // Catch: java.lang.Throwable -> Lfb
            if (r10 != 0) goto La7
            if (r4 != 0) goto La7
            java.lang.Object r10 = r9.f10403d     // Catch: java.lang.Throwable -> L56
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L56
            p8.r r10 = (p8.r) r10     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Method r10 = r10.f10411d     // Catch: java.lang.Throwable -> L56
            if (r10 == 0) goto La7
            java.lang.Object r0 = r11.f10416e     // Catch: java.lang.Throwable -> L56
            boolean r0 = a(r0, r10)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto La7
            java.lang.Object r0 = r11.f10416e     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L56
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invokeOrThrow(r10, r1, r0)     // Catch: java.lang.Throwable -> L56
            boolean r0 = r10 instanceof java.lang.String     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L97
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L56
            goto L98
        L97:
            r10 = r1
        L98:
            if (r10 == 0) goto La7
            boolean r0 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto La1
            goto La2
        La1:
            r10 = r1
        La2:
            if (r10 == 0) goto La7
            r2.add(r10)     // Catch: java.lang.Throwable -> L56
        La7:
            java.util.Set r10 = tf.m.T1(r2)     // Catch: java.lang.Throwable -> Lfb
            java.util.List r10 = tf.m.P1(r10)     // Catch: java.lang.Throwable -> Lfb
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Lfb
        Lb3:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> Lfb
            if (r0 == 0) goto Lfe
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> Lfb
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r0 = r11.f10412a     // Catch: java.lang.Throwable -> Lfb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lfb
            r2.<init>()     // Catch: java.lang.Throwable -> Lfb
            r2.append(r0)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r0 = "_video"
            r2.append(r0)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r5 = "mp4"
            r6 = 536870912(0x20000000, double:2.65249474E-315)
            r2 = r9
            r8 = r12
            java.lang.String r12 = r2.o(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> Lf6
            if (r12 == 0) goto Lf9
            boolean r0 = m(r12)     // Catch: java.lang.Throwable -> Lf6
            if (r0 == 0) goto Le7
            goto L106
        Le7:
            boolean r0 = r12.equals(r3)     // Catch: java.lang.Throwable -> Lf6
            if (r0 != 0) goto Lf9
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lf6
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lf6
            r0.delete()     // Catch: java.lang.Throwable -> Lf6
            goto Lf9
        Lf6:
            r0 = move-exception
        Lf7:
            r10 = r0
            goto L101
        Lf9:
            r12 = r8
            goto Lb3
        Lfb:
            r0 = move-exception
            r2 = r9
            goto Lf7
        Lfe:
            r2 = r9
            r12 = r1
            goto L106
        L101:
            sf.f r12 = new sf.f
            r12.<init>(r10)
        L106:
            java.lang.Throwable r10 = sf.g.b(r12)
            if (r10 == 0) goto L11d
            boolean r0 = r10 instanceof java.lang.InterruptedException
            if (r0 != 0) goto L11d
            java.lang.String r11 = r11.f10412a
            java.lang.String r0 = "读取朋友圈本地视频失败: "
            java.lang.String r11 = r0.concat(r11)
            fg.p r0 = r2.f10401b
            r0.invoke(r11, r10)
        L11d:
            boolean r10 = r12 instanceof sf.f
            if (r10 == 0) goto L122
            goto L123
        L122:
            r1 = r12
        L123:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public final java.lang.String t(java.lang.String r10, p8.s r11, java.lang.String r12, java.util.concurrent.atomic.AtomicBoolean r13) {
            r9 = this;
            java.lang.String r7 = r9.s(r10, r11, r13)
            if (r7 != 0) goto L68
            java.lang.Object r1 = r9.f10404e
            java.lang.Object r1 = r1.getValue()
            p8.u r1 = (p8.u) r1
            java.lang.reflect.Method r2 = r1.f10421c
            r3 = 0
            if (r2 == 0) goto L35
            java.lang.reflect.Method r1 = r1.f10422d
            if (r1 == 0) goto L35
            java.lang.Class[] r6 = r1.getParameterTypes()
            r6 = r6[r3]
            java.lang.Object r8 = r11.f10416e
            boolean r6 = r6.isInstance(r8)
            if (r6 != 0) goto L26
            goto L35
        L26:
            c9.r0 r0 = new c9.r0
            r6 = 3
            r5 = r10
            r4 = r11
            r3 = r1
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r0
            boolean r3 = r9.j(r1)
        L35:
            if (r3 == 0) goto L68
            long r1 = android.os.SystemClock.elapsedRealtime()
            r7 = 90000(0x15f90, double:4.4466E-319)
            long r1 = r1 + r7
        L3f:
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 >= 0) goto L63
            boolean r3 = r13.get()
            if (r3 != 0) goto L5b
            java.lang.String r3 = r9.s(r10, r11, r13)
            if (r3 == 0) goto L55
            r7 = r3
            goto L68
        L55:
            r7 = 500(0x1f4, double:2.47E-321)
            android.os.SystemClock.sleep(r7)
            goto L3f
        L5b:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            java.lang.String r2 = "已取消"
            r1.<init>(r2)
            throw r1
        L63:
            java.lang.String r1 = r9.s(r10, r11, r13)
            r7 = r1
        L68:
            if (r7 == 0) goto L6b
            return r7
        L6b:
            java.lang.String r1 = r11.f10414c
            java.util.List r1 = a.a.x0(r1)
            java.lang.String r3 = "mp4"
            r4 = 536870912(0x20000000, double:2.65249474E-315)
            r0 = r9
            r2 = r12
            r6 = r13
            java.lang.String r1 = r0.e(r1, r2, r3, r4, r6)
            r0 = 0
            if (r1 == 0) goto L8f
            boolean r2 = m(r1)
            if (r2 == 0) goto L88
            r2 = r1
            goto L89
        L88:
            r2 = r0
        L89:
            if (r2 == 0) goto L8c
            return r2
        L8c:
            p.a.v(r1)
        L8f:
            return r0
    }

    public final p8.v u(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "getTimeLine"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L14
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r1, r2)     // Catch: java.lang.Throwable -> L14
            if (r5 == 0) goto L16
            p8.v r5 = r4.v(r5)     // Catch: java.lang.Throwable -> L14
            goto L1e
        L14:
            r5 = move-exception
            goto L18
        L16:
            r5 = r0
            goto L1e
        L18:
            sf.f r1 = new sf.f
            r1.<init>(r5)
            r5 = r1
        L1e:
            java.lang.Throwable r1 = sf.g.b(r5)
            if (r1 == 0) goto L2b
            fg.p r2 = r4.f10401b
            java.lang.String r3 = "解析朋友圈原生内容失败"
            r2.invoke(r3, r1)
        L2b:
            boolean r1 = r5 instanceof sf.f
            if (r1 == 0) goto L30
            goto L31
        L30:
            r0 = r5
        L31:
            p8.v r0 = (p8.v) r0
            return r0
    }

    public final p8.v v(java.lang.Object r20) {
            r19 = this;
            r0 = r20
            java.lang.String r1 = "ContentDesc"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r0, r1)
            boolean r2 = r1 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L10
            java.lang.String r1 = (java.lang.String) r1
            goto L11
        L10:
            r1 = r3
        L11:
            java.lang.String r2 = ""
            if (r1 != 0) goto L16
            r1 = r2
        L16:
            java.lang.String r4 = "ContentObj"
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r0, r4)
            r5 = 0
            if (r4 == 0) goto L34
            java.lang.String r6 = "e"
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r4, r6)
            boolean r7 = r6 instanceof java.lang.Number
            if (r7 == 0) goto L2c
            java.lang.Number r6 = (java.lang.Number) r6
            goto L2d
        L2c:
            r6 = r3
        L2d:
            if (r6 == 0) goto L34
            int r6 = r6.intValue()
            goto L35
        L34:
            r6 = r5
        L35:
            tf.t r7 = tf.t.f13167g
            r8 = 1
            if (r4 == 0) goto L65
            java.util.ArrayList r9 = i(r4)
            dg.n r10 = new dg.n
            r11 = 6
            r10.<init>(r9, r11)
            o9.e r9 = new o9.e
            r11 = 12
            r9.<init>(r11)
            ng.i r11 = new ng.i
            r11.<init>(r10, r8, r9)
            c9.k1 r9 = new c9.k1
            r10 = r19
            r9.<init>(r4, r10)
            ng.i r9 = ng.m.X(r11, r9)
            java.lang.Object r9 = ng.m.U(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L68
            r9 = r7
            goto L68
        L65:
            r10 = r19
            r9 = r3
        L68:
            if (r9 != 0) goto L6b
            goto L6c
        L6b:
            r7 = r9
        L6c:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r11 = r7.hasNext()
            r12 = 54
            if (r11 == 0) goto L8e
            java.lang.Object r11 = r7.next()
            if (r6 != r12) goto L85
            r12 = r8
            goto L86
        L85:
            r12 = r5
        L86:
            p8.s r11 = p(r11, r12)
            r9.add(r11)
            goto L75
        L8e:
            java.lang.String r5 = "Id"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r0, r5)
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto L9b
            java.lang.String r5 = (java.lang.String) r5
            goto L9c
        L9b:
            r5 = r3
        L9c:
            if (r5 == 0) goto La9
            boolean r7 = og.m.t0(r5)
            if (r7 != 0) goto La5
            goto La6
        La5:
            r5 = r3
        La6:
            if (r5 == 0) goto La9
            goto Lb7
        La9:
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r5 = "sns_"
            java.lang.String r5 = wb.en.g(r5, r0)
        Lb7:
            boolean r0 = og.m.t0(r1)
            r7 = 15
            r11 = 5
            if (r0 == 0) goto L12b
            if (r6 == r8) goto L12b
            if (r6 == r11) goto L12b
            if (r6 == r7) goto L12b
            if (r6 != r12) goto Lc9
            goto L12b
        Lc9:
            if (r4 == 0) goto L125
            java.util.ArrayList r0 = d(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld8:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lef
            java.lang.Object r4 = r0.next()
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = k(r13)
            if (r13 != 0) goto Ld8
            r1.add(r4)
            goto Ld8
        Lef:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lf8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L10f
            java.lang.Object r4 = r1.next()
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = og.m.t0(r13)
            if (r13 != 0) goto Lf8
            r0.add(r4)
            goto Lf8
        L10f:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r13 = tf.m.P1(r0)
            r17 = 0
            r18 = 62
            java.lang.String r14 = "\n"
            r15 = 0
            r16 = 0
            java.lang.String r0 = tf.m.A1(r13, r14, r15, r16, r17, r18)
            goto L126
        L125:
            r0 = r3
        L126:
            if (r0 != 0) goto L12a
            r1 = r2
            goto L12b
        L12a:
            r1 = r0
        L12b:
            if (r6 == r8) goto L1a8
            if (r6 == r11) goto L1a8
            if (r6 == r7) goto L1a8
            if (r6 != r12) goto L135
            goto L1a8
        L135:
            dg.n r0 = new dg.n
            r4 = 6
            r0.<init>(r9, r4)
            o9.e r4 = new o9.e
            r7 = 11
            r4.<init>(r7)
            ng.t r0 = ng.m.W(r0, r4)
            ng.j r4 = r0.f9459a
            java.util.Iterator r4 = r4.iterator()
        L14c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L166
            fg.l r7 = r0.f9460b
            java.lang.Object r8 = r4.next()
            java.lang.Object r7 = r7.invoke(r8)
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = og.m.t0(r8)
            if (r8 != 0) goto L14c
            goto L167
        L166:
            r7 = r3
        L167:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L16c
            goto L16d
        L16c:
            r2 = r7
        L16d:
            java.lang.String[] r0 = new java.lang.String[]{r1, r2}
            java.util.List r0 = a.a.y0(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L17e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L195
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L17e
            r1.add(r2)
            goto L17e
        L195:
            java.util.Set r0 = tf.m.T1(r1)
            java.util.List r11 = tf.m.P1(r0)
            r15 = 0
            r16 = 62
            java.lang.String r12 = "\n"
            r13 = 0
            r14 = 0
            java.lang.String r1 = tf.m.A1(r11, r12, r13, r14, r15, r16)
        L1a8:
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L1b5
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L1b5
            return r3
        L1b5:
            p8.v r0 = new p8.v
            r0.<init>(r5, r1, r6, r9)
            return r0
    }
}
