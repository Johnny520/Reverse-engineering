package a;

/* JADX INFO: loaded from: classes.dex */
public final class E8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> f71a = null;
    public static volatile int b;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            a.E8.f71a = r0
            r0 = -1
            a.E8.b = r0
            return
    }

    public static void a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r3 = r0.toString()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r0 = a.E8.f71a
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L32
            a.F8 r2 = new a.F8
            int r7 = a.E8.b
            java.lang.System.currentTimeMillis()
            r4 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r8 = r0.putIfAbsent(r3, r2)
            if (r8 != 0) goto L31
            r1 = r2
            goto L32
        L31:
            r1 = r8
        L32:
            a.F8 r1 = (a.F8) r1
            r8 = 200(0xc8, float:2.8E-43)
            a.Ce.X(r11, r8)
            java.lang.System.currentTimeMillis()
            return
    }

    public static void b(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            java.lang.String r0 = "hookId"
            a.C0193i9.e(r9, r0)
            java.lang.String r0 = "target"
            a.C0193i9.e(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = "/"
            java.lang.String r3 = a.C0487z.h(r0, r1, r9)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r0 = a.E8.f71a
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L36
            a.F8 r2 = new a.F8
            int r7 = a.E8.b
            java.lang.System.currentTimeMillis()
            r4 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r8 = r0.putIfAbsent(r3, r2)
            if (r8 != 0) goto L35
            r1 = r2
            goto L36
        L35:
            r1 = r8
        L36:
            a.F8 r1 = (a.F8) r1
            return
    }
}
