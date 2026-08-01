package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ε */
    public final android.os.Handler f7692;

    public nn1(android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            r0.f7692 = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            r2.getClass()
            android.os.Handler r1 = r1.f7692
            boolean r2 = r1.post(r2)
            if (r2 == 0) goto Lc
            return
        Lc:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is shutting down"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
    }
}
