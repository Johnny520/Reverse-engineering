package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tx extends sx {
    public final Object d;

    public tx() {
        super(12);
        this.d = new Object();
    }

    @Override // defpackage.sx
    public final Object a() {
        Object r0 = this.d;
        monitor-enter(r0);
        Object r1 = super.a();     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.sx
    public final boolean c(Object r2) {
        Object r0 = this.d;
        monitor-enter(r0);
        boolean r22 = super.c(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r22;
    L7:
        th = move-exception;
        throw th;
    }
}
