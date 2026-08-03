package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3841 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.HashMap<java.lang.String, java.lang.Class<?>> f12139 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12140;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12141;

    static {
            r0 = 409(0x199, float:5.73E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            Yue.C3841.f12139 = r0
            return
    }

    public C3841() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native boolean m15379(java.lang.Class<?> r0, java.lang.Class<?> r1);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native <T> T m15380(java.lang.Class<?> r0, java.lang.Class<?>[] r1, java.lang.Object... r2) throws java.lang.Exception;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native <T> T m15381(java.lang.Class<?> r0, java.lang.Object... r1) throws java.lang.Exception;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native java.lang.reflect.Constructor<?> m15382(java.lang.Class<?> r0, java.lang.Class<?>[] r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native java.lang.Class<?> m15383(java.lang.Class<?> r0);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.Class<?> m15384(java.lang.String r2) {
            java.util.HashMap<java.lang.String, java.lang.Class<?>> r0 = Yue.C3841.f12139
            java.lang.Object r1 = r0.get(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            r1 = 0
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L25
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L19
            java.lang.Class r1 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L25
            goto L21
        L19:
            java.lang.ClassLoader r1 = Yue.C0421.m1607()     // Catch: java.lang.Throwable -> L25
            java.lang.Class r1 = de.robv.android.xposed.XposedHelpers.findClass(r2, r1)     // Catch: java.lang.Throwable -> L25
        L21:
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r2 = 0
            return r2
    }
}
