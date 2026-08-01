package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class gi extends ip {
    public final /* synthetic */ ip C;
    public final /* synthetic */ ThreadPoolExecutor D;

    public gi(ip r1, ThreadPoolExecutor r2) {
        this.C = r1;
        this.D = r2;
    }

    @Override // defpackage.ip
    public final void F(Throwable r3) {
        ThreadPoolExecutor r0 = this.D;
        this.C.F(r3);     // Catch: Throwable -> L6
        r0.shutdown();
        return;
    L6:
        th = move-exception;
        r0.shutdown();
        throw th;
    }

    @Override // defpackage.ip
    public final void I(a8 r3) {
        ThreadPoolExecutor r0 = this.D;
        this.C.I(r3);     // Catch: Throwable -> L6
        r0.shutdown();
        return;
    L6:
        th = move-exception;
        r0.shutdown();
        throw th;
    }
}
