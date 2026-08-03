package y8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.List f22315j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long[] f22316k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia.t f22317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f22318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.Handler f22319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.WeakHashMap f22320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.WeakHashMap f22321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.WeakHashMap f22322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.LinkedHashSet f22323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f22325i;

    static {
            java.lang.String r0 = "cnb"
            java.lang.String r1 = "p1o"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            y8.d.f22315j = r0
            r0 = 6
            long[] r0 = new long[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [80, 160, 320, 640, 1000, 1500} // fill-array
            y8.d.f22316k = r0
            return
    }

    public d(r8.g r1, ia.t r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f22317a = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_auto_view_original_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f22318b = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f22319c = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.f22320d = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.f22321e = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.f22322f = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f22323g = r1
            return
    }

    public static boolean a(java.lang.reflect.Method r1) {
            if (r1 == 0) goto L18
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L18
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L18
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static java.lang.Object b(java.lang.Object r6, java.lang.String r7) {
            java.lang.Class r0 = r6.getClass()
        L4:
            r1 = 0
            if (r0 == 0) goto L52
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L52
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L3e
            java.lang.Class r4 = r4.getType()
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L3e
            r4 = 1
            goto L3f
        L3e:
            r4 = 0
        L3f:
            if (r4 == 0) goto L17
            r1 = r3
        L42:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 == 0) goto L4d
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r6)
            if (r1 == 0) goto L4d
            return r1
        L4d:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L52:
            return r1
    }

    public final void c(android.app.Activity r6, int r7, long r8) {
            r5 = this;
            java.util.WeakHashMap r0 = r5.f22320d
            java.lang.Object r1 = r0.remove(r6)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.os.Handler r2 = r5.f22319c
            if (r1 == 0) goto Lf
            r2.removeCallbacks(r1)
        Lf:
            java.util.WeakHashMap r1 = r5.f22321e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1.put(r6, r3)
            java.lang.String r1 = "auto_view_original_enable"
            r3 = 0
            android.content.SharedPreferences r4 = r5.f22318b
            boolean r1 = r4.getBoolean(r1, r3)
            if (r1 == 0) goto L4e
            java.util.WeakHashMap r1 = r5.f22322f
            java.lang.Object r1 = r1.get(r6)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L39
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r1 = r1.contains(r3)
            r3 = 1
            if (r1 != r3) goto L39
            goto L4e
        L39:
            y8.c r1 = new y8.c
            r1.<init>(r5, r6, r7)
            r0.put(r6, r1)
            r6 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 <= 0) goto L4b
            r2.postDelayed(r1, r8)
            return
        L4b:
            r2.post(r1)
        L4e:
            return
    }
}
