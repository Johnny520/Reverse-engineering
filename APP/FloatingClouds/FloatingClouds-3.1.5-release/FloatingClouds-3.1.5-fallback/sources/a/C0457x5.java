package a;

/* JADX INFO: renamed from: a.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0457x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f758a = null;
    public static final int[] b = null;
    public static final android.graphics.Rect c = null;

    /* JADX INFO: renamed from: a.x5$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f759a = false;
        public static final java.lang.reflect.Method b = null;
        public static final java.lang.reflect.Field c = null;
        public static final java.lang.reflect.Field d = null;
        public static final java.lang.reflect.Field e = null;
        public static final java.lang.reflect.Field f = null;

        static {
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L3a
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2d java.lang.ClassNotFoundException -> L30 java.lang.NoSuchMethodException -> L32
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L46
                r8 = r0
                goto L48
            L2b:
                r7 = r1
                goto L46
            L2d:
                r6 = r1
            L2e:
                r7 = r6
                goto L46
            L30:
                r6 = r1
                goto L2e
            L32:
                r6 = r1
                goto L2e
            L34:
                r5 = r1
            L35:
                r6 = r5
                goto L2e
            L37:
                r5 = r1
            L38:
                r6 = r5
                goto L2e
            L3a:
                r5 = r1
            L3b:
                r6 = r5
                goto L2e
            L3d:
                r4 = r1
                r5 = r4
                goto L35
            L40:
                r4 = r1
                r5 = r4
                goto L38
            L43:
                r4 = r1
                r5 = r4
                goto L3b
            L46:
                r3 = r1
                r8 = r2
            L48:
                if (r8 == 0) goto L57
                a.C0457x5.a.b = r4
                a.C0457x5.a.c = r5
                a.C0457x5.a.d = r6
                a.C0457x5.a.e = r7
                a.C0457x5.a.f = r3
                a.C0457x5.a.f759a = r0
                goto L63
            L57:
                a.C0457x5.a.b = r1
                a.C0457x5.a.c = r1
                a.C0457x5.a.d = r1
                a.C0457x5.a.e = r1
                a.C0457x5.a.f = r1
                a.C0457x5.a.f759a = r2
            L63:
                return
        }
    }

    /* JADX INFO: renamed from: a.x5$b */
    public static class b {
        public static android.graphics.Insets a(android.graphics.drawable.Drawable r0) {
                android.graphics.Insets r0 = r0.getOpticalInsets()
                return r0
        }
    }

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            a.C0457x5.f758a = r0
            r0 = 0
            int[] r0 = new int[r0]
            a.C0457x5.b = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            a.C0457x5.c = r0
            return
    }

    public static void a(android.graphics.drawable.Drawable r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L32
            r2 = 31
            if (r1 >= r2) goto L32
            java.lang.String r1 = "android.graphics.drawable.ColorStateListDrawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L32
            int[] r0 = r3.getState()
            if (r0 == 0) goto L2a
            int r1 = r0.length
            if (r1 != 0) goto L24
            goto L2a
        L24:
            int[] r1 = a.C0457x5.b
            r3.setState(r1)
            goto L2f
        L2a:
            int[] r1 = a.C0457x5.f758a
            r3.setState(r1)
        L2f:
            r3.setState(r0)
        L32:
            return
    }

    public static android.graphics.Rect b(android.graphics.drawable.Drawable r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L20
            android.graphics.Insets r5 = a.C0457x5.b.a(r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = a.E.b(r5)
            int r2 = a.E.r(r5)
            int r3 = a.E.w(r5)
            int r5 = a.E.A(r5)
            r0.<init>(r1, r2, r3, r5)
            return r0
        L20:
            boolean r2 = r5 instanceof a.vh
            if (r2 == 0) goto L2a
            a.vh r5 = (a.vh) r5
            android.graphics.drawable.Drawable r5 = r5.a()
        L2a:
            if (r0 >= r1) goto L57
            boolean r0 = a.C0457x5.a.f759a
            if (r0 == 0) goto L59
            java.lang.reflect.Method r0 = a.C0457x5.a.b     // Catch: java.lang.Throwable -> L59
            r1 = 0
            java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L59
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Field r1 = a.C0457x5.a.c     // Catch: java.lang.Throwable -> L59
            int r1 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Field r2 = a.C0457x5.a.d     // Catch: java.lang.Throwable -> L59
            int r2 = r2.getInt(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Field r3 = a.C0457x5.a.e     // Catch: java.lang.Throwable -> L59
            int r3 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Field r4 = a.C0457x5.a.f     // Catch: java.lang.Throwable -> L59
            int r5 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L59
            r0.<init>(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L59
            return r0
        L57:
            boolean r5 = a.C0457x5.a.f759a
        L59:
            android.graphics.Rect r5 = a.C0457x5.c
            return r5
    }

    public static android.graphics.PorterDuff.Mode c(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}
