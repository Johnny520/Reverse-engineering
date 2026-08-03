package a;

/* JADX INFO: renamed from: a.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0355rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0355rb f672a = null;
    public static final java.util.LinkedHashMap b = null;
    public static final java.util.LinkedHashMap c = null;

    static {
            a.rb r0 = new a.rb
            r0.<init>()
            a.C0355rb.f672a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            a.C0355rb.b = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            a.C0355rb.c = r0
            return
    }

    public final synchronized boolean a(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = a.C0355rb.b     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L12
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r2 = move-exception
            goto L15
        L12:
            r2 = 0
        L13:
            monitor-exit(r1)
            return r2
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public final synchronized void b(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La
            java.util.LinkedHashMap r1 = a.C0355rb.b     // Catch: java.lang.Throwable -> La
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return
        La:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}
