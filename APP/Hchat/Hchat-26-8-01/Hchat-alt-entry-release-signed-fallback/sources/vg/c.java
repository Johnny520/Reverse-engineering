package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements qg.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.g f14326g;

    public c(wf.g r1) {
            r0 = this;
            r0.<init>()
            r0.f14326g = r1
            return
    }

    @Override // qg.t
    public final wf.g n() {
            r1 = this;
            wf.g r0 = r1.f14326g
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoroutineScope(coroutineContext="
            r0.<init>(r1)
            wf.g r1 = r2.f14326g
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
