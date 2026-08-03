package a;

/* JADX INFO: loaded from: classes.dex */
public final class Dc<T> extends a.Cc {
    public final java.lang.Object d;

    public Dc() {
            r1 = this;
            r0 = 12
            r1.<init>(r0)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.d = r0
            return
    }

    @Override // a.Cc
    public final T a() {
            r2 = this;
            java.lang.Object r0 = r2.d
            monitor-enter(r0)
            java.lang.Object r1 = super.a()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // a.Cc
    public final boolean c(T r2) {
            r1 = this;
            java.lang.Object r0 = r1.d
            monitor-enter(r0)
            boolean r2 = super.c(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }
}
