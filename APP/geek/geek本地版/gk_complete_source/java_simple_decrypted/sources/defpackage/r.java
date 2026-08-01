package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r extends ff {
    @Override // defpackage.ff
    public final void F(s r1, s r2) {
        r1.b = r2;
    }

    @Override // defpackage.ff
    public final void G(s r1, Thread r2) {
        r1.a = r2;
    }

    @Override // defpackage.ff
    public final boolean e(t r3, p r4) {
        p r0 = p.b;
        monitor-enter(r3);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.b != r4) goto L12;
        r3.b = r0;     // Catch: Throwable -> L9
        monitor-exit(r3);     // Catch: Throwable -> L9
        return true;
    L12:
        monitor-exit(r3);     // Catch: Throwable -> L9
        return false;
    }

    @Override // defpackage.ff
    public final boolean f(t r2, Object r3, Object r4) {
        monitor-enter(r2);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (r2.a != r3) goto L11;
        r2.a = r4;     // Catch: Throwable -> L8
        monitor-exit(r2);     // Catch: Throwable -> L8
        return true;
    L11:
        monitor-exit(r2);     // Catch: Throwable -> L8
        return false;
    }

    @Override // defpackage.ff
    public final boolean g(t r2, s r3, s r4) {
        monitor-enter(r2);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (r2.c != r3) goto L11;
        r2.c = r4;     // Catch: Throwable -> L8
        monitor-exit(r2);     // Catch: Throwable -> L8
        return true;
    L11:
        monitor-exit(r2);     // Catch: Throwable -> L8
        return false;
    }
}
