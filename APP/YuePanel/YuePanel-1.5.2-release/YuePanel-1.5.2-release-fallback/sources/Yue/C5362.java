package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5362 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f19956 = "ResourcesCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<android.util.TypedValue> f19957 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("sColorStateCacheLock")
    public static final java.util.WeakHashMap<Yue.C5362.C5367, android.util.SparseArray<Yue.C5362.C5366>> f19958 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.Object f19959 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC0411
    public static final int f19960 = 0;

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C5363 {
        public C5363() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.drawable.Drawable m20239(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.graphics.drawable.Drawable m20240(android.content.res.Resources r0, int r1, int r2, android.content.res.Resources.Theme r3) {
                android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C5364 {
        public C5364() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m20241(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                int r0 = r0.getColor(r1, r2)
                return r0
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.content.res.ColorStateList m20242(@Yue.InterfaceC4410 android.content.res.Resources r0, @Yue.InterfaceC1241 int r1, @Yue.InterfaceC4544 android.content.res.Resources.Theme r2) {
                android.content.res.ColorStateList r0 = r0.getColorStateList(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C5365 {
        public C5365() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m20243(@Yue.InterfaceC4410 android.content.res.Resources r0, @Yue.InterfaceC1848 int r1) {
                float r0 = r0.getFloat(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C5366 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.res.ColorStateList f19961;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.content.res.Configuration f19962;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f19963;

        public C5366(@Yue.InterfaceC4410 android.content.res.ColorStateList r1, @Yue.InterfaceC4410 android.content.res.Configuration r2, @Yue.InterfaceC4544 android.content.res.Resources.Theme r3) {
                r0 = this;
                r0.<init>()
                r0.f19961 = r1
                r0.f19962 = r2
                if (r3 != 0) goto Lb
                r1 = 0
                goto Lf
            Lb:
                int r1 = r3.hashCode()
            Lf:
                r0.f19963 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C5367 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.res.Resources f19964;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.content.res.Resources.Theme f19965;

        public C5367(@Yue.InterfaceC4410 android.content.res.Resources r1, @Yue.InterfaceC4544 android.content.res.Resources.Theme r2) {
                r0 = this;
                r0.<init>()
                r0.f19964 = r1
                r0.f19965 = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L29
                java.lang.Class r2 = r5.getClass()
                java.lang.Class<Yue.ۥۡۦۦۣ$ۥ۟۟۟۟> r3 = Yue.C5362.C5367.class
                if (r3 == r2) goto L10
                goto L29
            L10:
                Yue.ۥۡۦۦۣ$ۥ۟۟۟۟ r5 = (Yue.C5362.C5367) r5
                android.content.res.Resources r2 = r4.f19964
                android.content.res.Resources r3 = r5.f19964
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                android.content.res.Resources$Theme r2 = r4.f19965
                android.content.res.Resources$Theme r5 = r5.f19965
                boolean r5 = Yue.C4554.m18124(r2, r5)
                if (r5 == 0) goto L27
                goto L28
            L27:
                r0 = r1
            L28:
                return r0
            L29:
                return r1
        }

        public int hashCode() {
                r2 = this;
                android.content.res.Resources r0 = r2.f19964
                android.content.res.Resources$Theme r1 = r2.f19965
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = Yue.C4554.m18125(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC5368 {
        public AbstractC5368() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        public static android.os.Handler getHandler(@Yue.InterfaceC4544 android.os.Handler r1) {
                if (r1 != 0) goto Lb
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
            Lb:
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m20244(Yue.C5362.AbstractC5368 r0, android.graphics.Typeface r1) {
                r0.m20247(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m20245(Yue.C5362.AbstractC5368 r0, int r1) {
                r0.m20246(r1)
                return
        }

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
        public final void callbackFailAsync(int r2, @Yue.InterfaceC4544 android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = getHandler(r3)
                Yue.ۥۡۦۦۥ r0 = new Yue.ۥۡۦۦۥ
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
        public final void callbackSuccessAsync(@Yue.InterfaceC4410 android.graphics.Typeface r2, @Yue.InterfaceC4544 android.os.Handler r3) {
                r1 = this;
                android.os.Handler r3 = getHandler(r3)
                Yue.ۥۡۦۦۤ r0 = new Yue.ۥۡۦۦۤ
                r0.<init>(r1, r2)
                r3.post(r0)
                return
        }

        public abstract void onFontRetrievalFailed(int r1);

        public abstract void onFontRetrieved(@Yue.InterfaceC4410 android.graphics.Typeface r1);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m20246(int r1) {
                r0 = this;
                r0.onFontRetrievalFailed(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m20247(android.graphics.Typeface r1) {
                r0 = this;
                r0.onFontRetrieved(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C5369 {

        /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟ۡ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5336(23)
        public static class C5370 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static final java.lang.Object f19966 = null;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public static java.lang.reflect.Method f19967;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static boolean f19968;

            static {
                    java.lang.Object r0 = new java.lang.Object
                    r0.<init>()
                    Yue.C5362.C5369.C5370.f19966 = r0
                    return
            }

            public C5370() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static void m20249(@Yue.InterfaceC4410 android.content.res.Resources.Theme r6) {
                    java.lang.Object r0 = Yue.C5362.C5369.C5370.f19966
                    monitor-enter(r0)
                    boolean r1 = Yue.C5362.C5369.C5370.f19968     // Catch: java.lang.Throwable -> L17
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    Yue.C5362.C5369.C5370.f19967 = r3     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    goto L21
                L17:
                    r6 = move-exception
                    goto L39
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L17
                L21:
                    Yue.C5362.C5369.C5370.f19968 = r1     // Catch: java.lang.Throwable -> L17
                L23:
                    java.lang.reflect.Method r1 = Yue.C5362.C5369.C5370.f19967     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L37
                    r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L17 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
                    goto L37
                L2b:
                    r6 = move-exception
                    goto L2e
                L2d:
                    r6 = move-exception
                L2e:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r3, r6)     // Catch: java.lang.Throwable -> L17
                    Yue.C5362.C5369.C5370.f19967 = r2     // Catch: java.lang.Throwable -> L17
                L37:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    return
                L39:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r6
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۦۦۣ$ۥ۟۟۟ۡ$ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC5336(29)
        public static class C5371 {
            public C5371() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Yue.InterfaceC1947
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static void m20250(@Yue.InterfaceC4410 android.content.res.Resources.Theme r0) {
                    r0.rebase()
                    return
            }
        }

        public C5369() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m20248(@Yue.InterfaceC4410 android.content.res.Resources.Theme r2) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto La
                Yue.C5362.C5369.C5371.m20250(r2)
                goto Ld
            La:
                Yue.C5362.C5369.C5370.m20249(r2)
            Ld:
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            Yue.C5362.f19957 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            Yue.C5362.f19958 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C5362.f19959 = r0
            return
    }

    public C5362() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m20222(@Yue.InterfaceC4410 Yue.C5362.C5367 r3, @Yue.InterfaceC1241 int r4, @Yue.InterfaceC4410 android.content.res.ColorStateList r5, @Yue.InterfaceC4544 android.content.res.Resources.Theme r6) {
            java.lang.Object r0 = Yue.C5362.f19959
            monitor-enter(r0)
            java.util.WeakHashMap<Yue.ۥۡۦۦۣ$ۥ۟۟۟۟, android.util.SparseArray<Yue.ۥۡۦۦۣ$ۥ۟۟۟>> r1 = Yue.C5362.f19958     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> L16
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L28
        L18:
            Yue.ۥۡۦۦۣ$ۥ۟۟۟ r1 = new Yue.ۥۡۦۦۣ$ۥ۟۟۟     // Catch: java.lang.Throwable -> L16
            android.content.res.Resources r3 = r3.f19964     // Catch: java.lang.Throwable -> L16
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r5, r3, r6)     // Catch: java.lang.Throwable -> L16
            r2.append(r4, r1)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m20223(@Yue.InterfaceC4410 android.content.res.Resources.Theme r3) {
            java.lang.Object r0 = Yue.C5362.f19959
            monitor-enter(r0)
            java.util.WeakHashMap<Yue.ۥۡۦۦۣ$ۥ۟۟۟۟, android.util.SparseArray<Yue.ۥۡۦۦۣ$ۥ۟۟۟>> r1 = Yue.C5362.f19958     // Catch: java.lang.Throwable -> L27
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L27
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L27
            Yue.ۥۡۦۦۣ$ۥ۟۟۟۟ r2 = (Yue.C5362.C5367) r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto Ld
            android.content.res.Resources$Theme r2 = r2.f19965     // Catch: java.lang.Throwable -> L27
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto Ld
            r1.remove()     // Catch: java.lang.Throwable -> L27
            goto Ld
        L27:
            r3 = move-exception
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.content.res.ColorStateList m20224(@Yue.InterfaceC4410 Yue.C5362.C5367 r5, @Yue.InterfaceC1241 int r6) {
            java.lang.Object r0 = Yue.C5362.f19959
            monitor-enter(r0)
            java.util.WeakHashMap<Yue.ۥۡۦۦۣ$ۥ۟۟۟۟, android.util.SparseArray<Yue.ۥۡۦۦۣ$ۥ۟۟۟>> r1 = Yue.C5362.f19958     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            Yue.ۥۡۦۦۣ$ۥ۟۟۟ r2 = (Yue.C5362.C5366) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f19962     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f19964     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f19965     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f19963     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f19963     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f19961     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.graphics.Typeface m20225(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC2728 int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r6 = 0
            r7 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = m20237(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m20226(@Yue.InterfaceC4410 android.content.res.Resources r0, @Yue.InterfaceC1241 int r1, @Yue.InterfaceC4544 android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            int r0 = Yue.C5362.C5364.m20241(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.content.res.ColorStateList m20227(@Yue.InterfaceC4410 android.content.res.Resources r2, @Yue.InterfaceC1241 int r3, @Yue.InterfaceC4544 android.content.res.Resources.Theme r4) throws android.content.res.Resources.NotFoundException {
            Yue.ۥۡۦۦۣ$ۥ۟۟۟۟ r0 = new Yue.ۥۡۦۦۣ$ۥ۟۟۟۟
            r0.<init>(r2, r4)
            android.content.res.ColorStateList r1 = m20224(r0, r3)
            if (r1 == 0) goto Lc
            return r1
        Lc:
            android.content.res.ColorStateList r1 = m20235(r2, r3, r4)
            if (r1 == 0) goto L16
            m20222(r0, r3, r1, r4)
            return r1
        L16:
            android.content.res.ColorStateList r2 = Yue.C5362.C5364.m20242(r2, r3, r4)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static android.graphics.drawable.Drawable m20228(@Yue.InterfaceC4410 android.content.res.Resources r0, @Yue.InterfaceC2004 int r1, @Yue.InterfaceC4544 android.content.res.Resources.Theme r2) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = Yue.C5362.C5363.m20239(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static android.graphics.drawable.Drawable m20229(@Yue.InterfaceC4410 android.content.res.Resources r0, @Yue.InterfaceC2004 int r1, int r2, @Yue.InterfaceC4544 android.content.res.Resources.Theme r3) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = Yue.C5362.C5363.m20240(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static float m20230(@Yue.InterfaceC4410 android.content.res.Resources r3, @Yue.InterfaceC1848 int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            float r3 = Yue.C5362.C5365.m20243(r3, r4)
            return r3
        Lb:
            android.util.TypedValue r0 = m20234()
            r1 = 1
            r3.getValue(r4, r0, r1)
            int r3 = r0.type
            r1 = 4
            if (r3 != r1) goto L1d
            float r3 = r0.getFloat()
            return r3
        L1d:
            android.content.res.Resources$NotFoundException r3 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Resource ID #0x"
            r1.append(r2)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = " type #0x"
            r1.append(r4)
            int r4 = r0.type
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = " is not valid"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static android.graphics.Typeface m20231(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC2728 int r9) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r6 = 0
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            android.graphics.Typeface r8 = m20237(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static android.graphics.Typeface m20232(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC2728 int r9, @Yue.InterfaceC4410 android.util.TypedValue r10, int r11, @Yue.InterfaceC4544 Yue.C5362.AbstractC5368 r12) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            r6 = 1
            r7 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            android.graphics.Typeface r8 = m20237(r0, r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m20233(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC2728 int r9, @Yue.InterfaceC4410 Yue.C5362.AbstractC5368 r10, @Yue.InterfaceC4544 android.os.Handler r11) throws android.content.res.Resources.NotFoundException {
            Yue.C4868.m19181(r10)
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Le
            r8 = -4
            r10.callbackFailAsync(r8, r11)
            return
        Le:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r6 = 0
            r7 = 0
            r3 = 0
            r0 = r8
            r1 = r9
            r4 = r10
            r5 = r11
            m20237(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static android.util.TypedValue m20234() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = Yue.C5362.f19957
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static android.content.res.ColorStateList m20235(android.content.res.Resources r2, int r3, @Yue.InterfaceC4544 android.content.res.Resources.Theme r4) {
            boolean r0 = m20236(r2, r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.res.XmlResourceParser r3 = r2.getXml(r3)
            android.content.res.ColorStateList r2 = Yue.C1247.m6631(r2, r3, r4)     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r4 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r4, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m20236(@Yue.InterfaceC4410 android.content.res.Resources r2, @Yue.InterfaceC1241 int r3) {
            android.util.TypedValue r0 = m20234()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L13
            r3 = 31
            if (r2 > r3) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static android.graphics.Typeface m20237(@Yue.InterfaceC4410 android.content.Context r10, int r11, @Yue.InterfaceC4410 android.util.TypedValue r12, int r13, @Yue.InterfaceC4544 Yue.C5362.AbstractC5368 r14, @Yue.InterfaceC4544 android.os.Handler r15, boolean r16, boolean r17) {
            android.content.res.Resources r1 = r10.getResources()
            r0 = 1
            r9 = r11
            r2 = r12
            r1.getValue(r11, r12, r0)
            r0 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            android.graphics.Typeface r0 = m20238(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != 0) goto L3e
            if (r14 != 0) goto L3e
            if (r17 == 0) goto L1e
            goto L3e
        L1e:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Font resource ID #0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r11)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3e:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static android.graphics.Typeface m20238(@Yue.InterfaceC4410 android.content.Context r16, android.content.res.Resources r17, @Yue.InterfaceC4410 android.util.TypedValue r18, int r19, int r20, @Yue.InterfaceC4544 Yue.C5362.AbstractC5368 r21, @Yue.InterfaceC4544 android.os.Handler r22, boolean r23, boolean r24) {
            r0 = r17
            r1 = r18
            r4 = r19
            r11 = r21
            r12 = r22
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lc6
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = 0
            r10 = -3
            if (r2 != 0) goto L24
            if (r11 == 0) goto L23
            r11.callbackFailAsync(r10, r12)
        L23:
            return r15
        L24:
            int r2 = r1.assetCookie
            r7 = r20
            android.graphics.Typeface r2 = Yue.C6482.m23925(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L34
            if (r11 == 0) goto L33
            r11.callbackSuccessAsync(r2, r12)
        L33:
            return r2
        L34:
            if (r24 == 0) goto L37
            return r15
        L37:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            if (r2 == 0) goto L7a
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            Yue.ۥ۠ۢۦۡ$ۥ۟ r2 = Yue.C2729.m11980(r2, r0)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            if (r2 != 0) goto L5f
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            if (r11 == 0) goto L5e
            r11.callbackFailAsync(r10, r12)     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            goto L5e
        L58:
            r0 = move-exception
            r15 = r10
            goto L96
        L5b:
            r0 = move-exception
            r15 = r10
            goto Lab
        L5e:
            return r15
        L5f:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L58 org.xmlpull.v1.XmlPullParserException -> L5b
            r1 = r16
            r3 = r17
            r4 = r19
            r5 = r14
            r7 = r20
            r8 = r21
            r9 = r22
            r15 = r10
            r10 = r23
            android.graphics.Typeface r0 = Yue.C6482.m23920(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L78
            return r0
        L76:
            r0 = move-exception
            goto L96
        L78:
            r0 = move-exception
            goto Lab
        L7a:
            r15 = r10
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L78
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r14
            r6 = r20
            android.graphics.Typeface r0 = Yue.C6482.m23922(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L78
            if (r11 == 0) goto L95
            if (r0 == 0) goto L92
            r11.callbackSuccessAsync(r0, r12)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L78
            goto L95
        L92:
            r11.callbackFailAsync(r15, r12)     // Catch: java.io.IOException -> L76 org.xmlpull.v1.XmlPullParserException -> L78
        L95:
            return r0
        L96:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lbf
        Lab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lbf:
            if (r11 == 0) goto Lc4
            r11.callbackFailAsync(r15, r12)
        Lc4:
            r1 = 0
            return r1
        Lc6:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r19)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }
}
