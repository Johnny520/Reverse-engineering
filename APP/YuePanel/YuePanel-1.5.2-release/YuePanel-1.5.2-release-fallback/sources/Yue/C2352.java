package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2352 {
    static {
            r0 = 92
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C2352() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native java.util.List<java.lang.reflect.Field> m10799(java.lang.Class<?> r0, java.lang.Class<?> r1, int r2);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native java.lang.Object m10800(java.lang.Object r0, java.lang.Class<?> r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native java.util.List<java.lang.reflect.Field> m10801(java.lang.Class<?> r0, java.lang.Class<?> r1);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native java.util.List<java.lang.reflect.Field> m10802(java.lang.Class<?> r0, java.lang.Class<?> r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.Object m10803(java.lang.Object r3, java.lang.Class<?> r4, java.util.HashSet<java.lang.Object> r5) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5.contains(r3)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r5.add(r3)
            java.lang.Class r1 = r3.getClass()
            boolean r2 = r4.isAssignableFrom(r1)
            if (r2 == 0) goto L19
            return r3
        L19:
            Yue.C0421.m1607()     // Catch: java.lang.Throwable -> L43
            r2 = 1
            java.util.List r1 = m10799(r1, r0, r2)     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L43
        L25:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r2 = de.robv.android.xposed.XposedHelpers.getObjectField(r3, r2)     // Catch: java.lang.Throwable -> L43
            if (r2 != 0) goto L3c
            goto L25
        L3c:
            java.lang.Object r2 = m10803(r2, r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L25
            return r2
        L43:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native java.lang.Object m10804(java.lang.reflect.Field r0, java.lang.Object r1) throws java.lang.IllegalAccessException;
}
