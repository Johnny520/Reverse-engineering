package a;

/* JADX INFO: loaded from: classes.dex */
public final class R6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.W9<java.lang.String, android.graphics.Typeface> f242a = null;
    public static final java.util.concurrent.ThreadPoolExecutor b = null;
    public static final java.lang.Object c = null;
    public static final a.C0162ge<java.lang.String, java.util.ArrayList<a.Q3<a.R6.a>>> d = null;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.graphics.Typeface f243a;
        public final int b;

        public a(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f243a = r0
                r1.b = r2
                return
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        public a(android.graphics.Typeface r1) {
                r0 = this;
                r0.<init>()
                r0.f243a = r1
                r1 = 0
                r0.b = r1
                return
        }
    }

    static {
            a.W9 r0 = new a.W9
            r1 = 16
            r0.<init>(r1)
            a.R6.f242a = r0
            a.Zc r9 = new a.Zc
            r9.<init>()
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            r0 = 10000(0x2710, float:1.4013E-41)
            long r5 = (long) r0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            r3 = 0
            r4 = 1
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r0 = 1
            r2.allowCoreThreadTimeOut(r0)
            a.R6.b = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.R6.c = r0
            a.ge r0 = new a.ge
            r0.<init>()
            a.R6.d = r0
            return
    }

    public static a.R6.a a(java.lang.String r6, android.content.Context r7, a.M6 r8, int r9) {
            a.W9<java.lang.String, android.graphics.Typeface> r0 = a.R6.f242a
            java.lang.Object r1 = r0.a(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            a.R6$a r6 = new a.R6$a
            r6.<init>(r1)
            return r6
        L10:
            a.Cc r8 = a.L6.a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r1 = 1
            r2 = -3
            java.lang.Object[] r3 = r8.b
            a.T6[] r3 = (a.T6[]) r3
            int r8 = r8.c
            if (r8 == 0) goto L24
            if (r8 == r1) goto L22
        L20:
            r1 = r2
            goto L3d
        L22:
            r1 = -2
            goto L3d
        L24:
            if (r3 == 0) goto L3d
            int r8 = r3.length
            if (r8 != 0) goto L2a
            goto L3d
        L2a:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L2d:
            if (r4 >= r8) goto L3d
            r5 = r3[r4]
            int r5 = r5.e
            if (r5 == 0) goto L3a
            if (r5 >= 0) goto L38
            goto L20
        L38:
            r1 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L2d
        L3d:
            if (r1 == 0) goto L45
            a.R6$a r6 = new a.R6$a
            r6.<init>(r1)
            return r6
        L45:
            a.Rf r8 = a.Mf.f178a
            android.graphics.Typeface r7 = r8.b(r7, r3, r9)
            if (r7 == 0) goto L56
            r0.b(r6, r7)
            a.R6$a r6 = new a.R6$a
            r6.<init>(r7)
            return r6
        L56:
            a.R6$a r6 = new a.R6$a
            r6.<init>(r2)
            return r6
        L5c:
            a.R6$a r6 = new a.R6$a
            r7 = -1
            r6.<init>(r7)
            return r6
    }
}
