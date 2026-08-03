package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements c9.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c9.p0 f1215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1216b;

    public i1(c9.p0 r1, java.util.concurrent.atomic.AtomicBoolean r2) {
            r0 = this;
            r0.<init>()
            r0.f1215a = r1
            r0.f1216b = r2
            return
    }

    @Override // c9.d1
    public final boolean a() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1216b
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            return r0
    }

    @Override // c9.d1
    public final void close() {
            r1 = this;
            c9.p0 r0 = r1.f1215a
            r0.invoke()
            return
    }
}
