package o0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f9473h;

    public /* synthetic */ b(int r1, java.util.Collection r2) {
            r0 = this;
            r0.f9472g = r1
            r0.f9473h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f9472g
            switch(r0) {
                case 0: goto L19;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            java.util.Collection r0 = r1.f9473h
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.retainAll(r0)
        Ld:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L12:
            java.util.Collection r0 = r1.f9473h
            boolean r2 = r0.contains(r2)
            goto Ld
        L19:
            java.util.Collection r0 = r1.f9473h
            boolean r2 = r0.contains(r2)
            goto Ld
    }
}
