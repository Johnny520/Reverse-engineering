package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends h6.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k6.n f7359b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7360a;

    static {
            k6.o r0 = new k6.o
            r1 = 0
            r0.<init>(r1)
            k6.n r1 = new k6.n
            r2 = 0
            r1.<init>(r0, r2)
            k6.o.f7359b = r1
            return
    }

    public /* synthetic */ o(int r1) {
            r0 = this;
            r0.f7360a = r1
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f7360a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            r2.l()
            return
        L9:
            java.lang.Number r3 = (java.lang.Number) r3
            r2.w(r3)
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f7360a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = "AnonymousOrNonStaticLocalClassAdapter"
            return r0
    }
}
