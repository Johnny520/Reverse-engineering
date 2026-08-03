package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C2012 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int[] f6394 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int[] f6395 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final android.graphics.Rect f6396 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۡۥ$ۥ, reason: contains not printable characters */
    public static class C2013 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final boolean f6397 = false;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final java.lang.reflect.Method f6398 = null;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final java.lang.reflect.Field f6399 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final java.lang.reflect.Field f6400 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final java.lang.reflect.Field f6401 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final java.lang.reflect.Field f6402 = null;

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
                Yue.C2012.C2013.f6398 = r4
                Yue.C2012.C2013.f6399 = r5
                Yue.C2012.C2013.f6400 = r6
                Yue.C2012.C2013.f6401 = r7
                Yue.C2012.C2013.f6402 = r3
                Yue.C2012.C2013.f6397 = r0
                goto L63
            L57:
                Yue.C2012.C2013.f6398 = r1
                Yue.C2012.C2013.f6399 = r1
                Yue.C2012.C2013.f6400 = r1
                Yue.C2012.C2013.f6401 = r1
                Yue.C2012.C2013.f6402 = r1
                Yue.C2012.C2013.f6397 = r2
            L63:
                return
        }

        public C2013() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.Rect m9308(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r5) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L31
                boolean r0 = Yue.C2012.C2013.f6397
                if (r0 == 0) goto L31
                java.lang.reflect.Method r0 = Yue.C2012.C2013.f6398     // Catch: java.lang.Throwable -> L31
                r1 = 0
                java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L31
                if (r5 == 0) goto L31
                android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L31
                java.lang.reflect.Field r1 = Yue.C2012.C2013.f6399     // Catch: java.lang.Throwable -> L31
                int r1 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L31
                java.lang.reflect.Field r2 = Yue.C2012.C2013.f6400     // Catch: java.lang.Throwable -> L31
                int r2 = r2.getInt(r5)     // Catch: java.lang.Throwable -> L31
                java.lang.reflect.Field r3 = Yue.C2012.C2013.f6401     // Catch: java.lang.Throwable -> L31
                int r3 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L31
                java.lang.reflect.Field r4 = Yue.C2012.C2013.f6402     // Catch: java.lang.Throwable -> L31
                int r5 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L31
                r0.<init>(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L31
                return r0
            L31:
                android.graphics.Rect r5 = Yue.C2012.f6396
                return r5
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۡۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C2014 {
        public C2014() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.graphics.Insets m9309(android.graphics.drawable.Drawable r0) {
                android.graphics.Insets r0 = r0.getOpticalInsets()
                return r0
        }
    }

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            Yue.C2012.f6394 = r0
            r0 = 0
            int[] r0 = new int[r0]
            Yue.C2012.f6395 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            Yue.C2012.f6396 = r0
            return
    }

    public C2012() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m9303(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r0) {
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m9304(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L1d
            r2 = 31
            if (r1 >= r2) goto L1d
            java.lang.String r1 = "android.graphics.drawable.ColorStateListDrawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            m9305(r3)
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m9305(android.graphics.drawable.Drawable r2) {
            int[] r0 = r2.getState()
            if (r0 == 0) goto L10
            int r1 = r0.length
            if (r1 != 0) goto La
            goto L10
        La:
            int[] r1 = Yue.C2012.f6395
            r2.setState(r1)
            goto L15
        L10:
            int[] r1 = Yue.C2012.f6394
            r2.setState(r1)
        L15:
            r2.setState(r0)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.graphics.Rect m9306(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L20
            android.graphics.Insets r4 = Yue.C2012.C2014.m9309(r4)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = Yue.C2006.m9297(r4)
            int r2 = Yue.C2008.m9299(r4)
            int r3 = Yue.C2010.m9301(r4)
            int r4 = Yue.C2011.m9302(r4)
            r0.<init>(r1, r2, r3, r4)
            return r0
        L20:
            android.graphics.drawable.Drawable r4 = Yue.C1995.m9234(r4)
            android.graphics.Rect r4 = Yue.C2012.C2013.m9308(r4)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.graphics.PorterDuff.Mode m9307(int r1, android.graphics.PorterDuff.Mode r2) {
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
