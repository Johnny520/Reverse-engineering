package yf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements wf.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final yf.b f22436g = null;

    static {
            yf.b r0 = new yf.b
            r0.<init>()
            yf.b.f22436g = r0
            return
    }

    @Override // wf.c
    public final wf.g getContext() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This continuation is already complete"
            r0.<init>(r1)
            throw r0
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This continuation is already complete"
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "This continuation is already complete"
            return r0
    }
}
