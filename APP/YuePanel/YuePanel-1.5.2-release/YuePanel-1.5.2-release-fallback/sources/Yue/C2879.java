package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public class C2879 implements Yue.InterfaceC2876 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f9300 = "GhostViewApi21";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static java.lang.Class<?> f9301;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static boolean f9302;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static java.lang.reflect.Method f9303;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static boolean f9304;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static java.lang.reflect.Method f9305;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static boolean f9306;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final android.view.View f9307;

    public C2879(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.f9307 = r1
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.InterfaceC2876 m12346(android.view.View r3, android.view.ViewGroup r4, android.graphics.Matrix r5) {
            m12347()
            java.lang.reflect.Method r0 = Yue.C2879.f9303
            r1 = 0
            if (r0 == 0) goto L23
            Yue.ۥۣ۠ۥۤ r2 = new Yue.ۥۣ۠ۥۤ     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            r2.<init>(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            return r2
        L18:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.Throwable r3 = r3.getCause()
            r4.<init>(r3)
            throw r4
        L23:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m12347() {
            boolean r0 = Yue.C2879.f9304
            if (r0 != 0) goto L2a
            r0 = 1
            m12348()     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.Class<?> r1 = Yue.C2879.f9301     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.String r2 = "addGhost"
            java.lang.Class<android.view.View> r3 = android.view.View.class
            java.lang.Class<android.view.ViewGroup> r4 = android.view.ViewGroup.class
            java.lang.Class<android.graphics.Matrix> r5 = android.graphics.Matrix.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4, r5}     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L20
            Yue.C2879.f9303 = r1     // Catch: java.lang.NoSuchMethodException -> L20
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L20
            goto L28
        L20:
            r1 = move-exception
            java.lang.String r2 = "GhostViewApi21"
            java.lang.String r3 = "Failed to retrieve addGhost method"
            android.util.Log.i(r2, r3, r1)
        L28:
            Yue.C2879.f9304 = r0
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m12348() {
            boolean r0 = Yue.C2879.f9302
            if (r0 != 0) goto L18
            java.lang.String r0 = "android.view.GhostView"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Ld
            Yue.C2879.f9301 = r0     // Catch: java.lang.ClassNotFoundException -> Ld
            goto L15
        Ld:
            r0 = move-exception
            java.lang.String r1 = "GhostViewApi21"
            java.lang.String r2 = "Failed to retrieve GhostView class"
            android.util.Log.i(r1, r2, r0)
        L15:
            r0 = 1
            Yue.C2879.f9302 = r0
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m12349() {
            boolean r0 = Yue.C2879.f9306
            if (r0 != 0) goto L26
            r0 = 1
            m12348()     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.Class<?> r1 = Yue.C2879.f9301     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.String r2 = "removeGhost"
            java.lang.Class<android.view.View> r3 = android.view.View.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L1c
            Yue.C2879.f9305 = r1     // Catch: java.lang.NoSuchMethodException -> L1c
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L1c
            goto L24
        L1c:
            r1 = move-exception
            java.lang.String r2 = "GhostViewApi21"
            java.lang.String r3 = "Failed to retrieve removeGhost method"
            android.util.Log.i(r2, r3, r1)
        L24:
            Yue.C2879.f9306 = r0
        L26:
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m12350(android.view.View r2) {
            m12349()
            java.lang.reflect.Method r0 = Yue.C2879.f9305
            if (r0 == 0) goto L1b
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L1b
            r1 = 0
            r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L1b
            goto L1b
        L10:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Throwable r2 = r2.getCause()
            r0.<init>(r2)
            throw r0
        L1b:
            return
    }

    @Override // Yue.InterfaceC2876
    public void setVisibility(int r2) {
            r1 = this;
            android.view.View r0 = r1.f9307
            r0.setVisibility(r2)
            return
    }

    @Override // Yue.InterfaceC2876
    /* JADX INFO: renamed from: ۥ */
    public void mo12337(android.view.ViewGroup r1, android.view.View r2) {
            r0 = this;
            return
    }
}
