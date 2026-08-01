package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v5 implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r2)
            r0.start()
            return
    }
}
