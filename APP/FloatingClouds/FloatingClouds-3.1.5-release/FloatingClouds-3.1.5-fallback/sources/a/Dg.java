package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f62a;
    public final java.util.LinkedHashSet b;
    public volatile boolean c;

    public Dg() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f62a = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.b = r0
            r0 = 0
            r1.c = r0
            return
    }

    public static void a(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.io.Closeable
            if (r0 == 0) goto L11
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch: java.io.IOException -> La
            r1.close()     // Catch: java.io.IOException -> La
            return
        La:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L11:
            return
    }

    public void b() {
            r0 = this;
            return
    }
}
