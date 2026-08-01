package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r extends defpackage.ff {
    @Override // defpackage.ff
    public final void F(defpackage.s r1, defpackage.s r2) {
            r0 = this;
            r1.b = r2
            return
    }

    @Override // defpackage.ff
    public final void G(defpackage.s r1, java.lang.Thread r2) {
            r0 = this;
            r1.a = r2
            return
    }

    @Override // defpackage.ff
    public final boolean e(defpackage.t r3, defpackage.p r4) {
            r2 = this;
            p r0 = defpackage.p.b
            monitor-enter(r3)
            p r1 = r3.b     // Catch: java.lang.Throwable -> Lc
            if (r1 != r4) goto Le
            r3.b = r0     // Catch: java.lang.Throwable -> Lc
            r4 = 1
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
            return r4
        Lc:
            r4 = move-exception
            goto L11
        Le:
            r4 = 0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
            return r4
        L11:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
            throw r4
    }

    @Override // defpackage.ff
    public final boolean f(defpackage.t r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.a     // Catch: java.lang.Throwable -> La
            if (r0 != r3) goto Lc
            r2.a = r4     // Catch: java.lang.Throwable -> La
            r3 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return r3
        La:
            r3 = move-exception
            goto Lf
        Lc:
            r3 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return r3
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // defpackage.ff
    public final boolean g(defpackage.t r2, defpackage.s r3, defpackage.s r4) {
            r1 = this;
            monitor-enter(r2)
            s r0 = r2.c     // Catch: java.lang.Throwable -> La
            if (r0 != r3) goto Lc
            r2.c = r4     // Catch: java.lang.Throwable -> La
            r3 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return r3
        La:
            r3 = move-exception
            goto Lf
        Lc:
            r3 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return r3
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}
