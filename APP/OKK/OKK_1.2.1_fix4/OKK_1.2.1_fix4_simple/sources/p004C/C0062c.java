package p004C;

/* JADX INFO: renamed from: C.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0062c extends C0061b {

    /* JADX INFO: renamed from: d */
    public final Object f208d;

    public C0062c() {
        super(12);
        this.f208d = new Object();
    }

    @Override // p004C.C0061b
    /* JADX INFO: renamed from: a */
    public final Object mo198a() {
        Object r02 = this.f208d;
        monitor-enter(r02);
        Object r1 = super.mo198a();     // Catch: Throwable -> L7
        monitor-exit(r02);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // p004C.C0061b
    /* JADX INFO: renamed from: c */
    public final boolean mo200c(Object r2) {
        Object r02 = this.f208d;
        monitor-enter(r02);
        boolean r22 = super.mo200c(r2);     // Catch: Throwable -> L7
        monitor-exit(r02);
        return r22;
    L7:
        th = move-exception;
        throw th;
    }
}
