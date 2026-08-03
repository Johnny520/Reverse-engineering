package a;

/* JADX INFO: loaded from: classes.dex */
public final class Fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, a.C0297o6> f90a = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            a.Fd.f90a = r0
            return
    }

    public static a.C0297o6 a(java.lang.String r2) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.o6> r0 = a.Fd.f90a
            java.lang.Object r1 = r0.get(r2)
            if (r1 != 0) goto L15
            a.o6 r1 = new a.o6
            r1.<init>(r2)
            java.lang.Object r2 = r0.putIfAbsent(r2, r1)
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r2
        L15:
            a.o6 r1 = (a.C0297o6) r1
            return r1
    }
}
