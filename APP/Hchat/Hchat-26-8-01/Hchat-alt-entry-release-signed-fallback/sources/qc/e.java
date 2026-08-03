package qc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.function.Function f10863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.List f10864b;

    public e(java.util.function.Function r1) {
            r0 = this;
            r0.<init>()
            r0.f10863a = r1
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r3) {
            r2 = this;
            java.util.List r0 = r2.f10864b
            java.util.function.Function r1 = r2.f10863a
            java.lang.Object r3 = r1.apply(r3)
            r0.add(r3)
            return
    }
}
