package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0162ge<java.lang.ClassLoader, a.C0162ge<java.lang.String, java.lang.Class<?>>> f912a = null;

    static {
            a.ge r0 = new a.ge
            r0.<init>()
            androidx.fragment.app.d.f912a = r0
            return
    }

    public static java.lang.Class<?> b(java.lang.ClassLoader r3, java.lang.String r4) {
            a.ge<java.lang.ClassLoader, a.ge<java.lang.String, java.lang.Class<?>>> r0 = androidx.fragment.app.d.f912a
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r3, r1)
            a.ge r2 = (a.C0162ge) r2
            if (r2 != 0) goto L13
            a.ge r2 = new a.ge
            r2.<init>()
            r0.put(r3, r2)
        L13:
            java.lang.Object r0 = r2.getOrDefault(r4, r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L24
            r0 = 0
            java.lang.Class r3 = java.lang.Class.forName(r4, r0, r3)
            r2.put(r4, r3)
            return r3
        L24:
            return r0
    }

    public static java.lang.Class<? extends androidx.fragment.app.b> c(java.lang.ClassLoader r3, java.lang.String r4) {
            java.lang.String r0 = "Unable to instantiate fragment "
            java.lang.Class r3 = b(r3, r4)     // Catch: java.lang.ClassCastException -> L7 java.lang.ClassNotFoundException -> L14
            return r3
        L7:
            r3 = move-exception
            androidx.fragment.app.b$e r1 = new androidx.fragment.app.b$e
            java.lang.String r2 = ": make sure class is a valid subclass of Fragment"
            java.lang.String r4 = a.C0487z.g(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
        L14:
            r3 = move-exception
            androidx.fragment.app.b$e r1 = new androidx.fragment.app.b$e
            java.lang.String r2 = ": make sure class name exists"
            java.lang.String r4 = a.C0487z.g(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
    }

    public androidx.fragment.app.b a(java.lang.String r1) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
