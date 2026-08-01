package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gi extends defpackage.ip {
    public final /* synthetic */ defpackage.ip C;
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor D;

    public gi(defpackage.ip r1, java.util.concurrent.ThreadPoolExecutor r2) {
            r0 = this;
            r0.<init>()
            r0.C = r1
            r0.D = r2
            return
    }

    @Override // defpackage.ip
    public final void F(java.lang.Throwable r3) {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r2.D
            ip r1 = r2.C     // Catch: java.lang.Throwable -> Lb
            r1.F(r3)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r3 = move-exception
            r0.shutdown()
            throw r3
    }

    @Override // defpackage.ip
    public final void I(defpackage.a8 r3) {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r2.D
            ip r1 = r2.C     // Catch: java.lang.Throwable -> Lb
            r1.I(r3)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r3 = move-exception
            r0.shutdown()
            throw r3
    }
}
