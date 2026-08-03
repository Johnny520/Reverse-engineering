package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4778 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public static final Yue.C4776 f15131 = null;

    static {
            Yue.ۥ۠ۥۨۥ r0 = new Yue.ۥ۠ۥۨۥ
            r0.<init>()
            Yue.C4778.f15131 = r0
            return
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m19027(int r1, int r2, int r3) {
            Yue.ۥ۠ۦۧۨ r0 = Yue.C3557.f11344
            boolean r1 = r0.m14484(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ <T> T m19028(java.lang.Object r5) {
            java.lang.String r0 = "T"
            r1 = 1
            Yue.C3329.m13915(r1, r0)     // Catch: java.lang.ClassCastException -> L7
            return r5
        L7:
            r1 = move-exception
            java.lang.Class r5 = r5.getClass()
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r2 = 4
            Yue.C3329.m13915(r2, r0)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            boolean r2 = Yue.C3329.m13897(r5, r0)
            if (r2 != 0) goto L3f
            java.lang.ClassNotFoundException r2 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Instance class was loaded from a different classloader: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = ", base type classloader: "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5, r1)
            throw r2
        L3f:
            throw r1
    }
}
