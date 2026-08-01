package p000;

/* JADX INFO: renamed from: v4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0896v4 implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r1)
            r0.start()
            return
    }
}
