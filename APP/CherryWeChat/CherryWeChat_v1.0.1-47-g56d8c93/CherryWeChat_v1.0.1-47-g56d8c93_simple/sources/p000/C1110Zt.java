package p000;

/* JADX INFO: renamed from: Zt */
/* JADX INFO: loaded from: classes.dex */
public final class C1110Zt extends C1067Yt {

    /* JADX INFO: renamed from: c */
    public final Object f3506c;

    public C1110Zt(int r1) {
        super(r1);
        this.f3506c = new Object();
    }

    @Override // p000.C1067Yt, p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: a */
    public final boolean mo1934a(Object r2) {
        Object r0 = this.f3506c;
        monitor-enter(r0);
        boolean r22 = super.mo1934a(r2);     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r22;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // p000.C1067Yt, p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: c */
    public final Object mo1935c() {
        Object r0 = this.f3506c;
        monitor-enter(r0);
        Object r1 = super.mo1935c();     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
