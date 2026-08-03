package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.Choreographer f9000g;

    public /* synthetic */ w(android.view.Choreographer r1) {
            r0 = this;
            r0.<init>()
            r0.f9000g = r1
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r3) {
            r2 = this;
            n2.x r0 = new n2.x
            r1 = 0
            r0.<init>(r3, r1)
            android.view.Choreographer r3 = r2.f9000g
            r3.postFrameCallback(r0)
            return
    }
}
