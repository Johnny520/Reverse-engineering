package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tx extends defpackage.sx {
    public final java.lang.Object d;

    public tx() {
            r1 = this;
            r0 = 12
            r1.<init>(r0)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.d = r0
            return
    }

    @Override // defpackage.sx
    public final java.lang.Object a() {
            r2 = this;
            java.lang.Object r0 = r2.d
            monitor-enter(r0)
            java.lang.Object r1 = super.a()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // defpackage.sx
    public final boolean c(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.d
            monitor-enter(r0)
            boolean r2 = super.c(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }
}
