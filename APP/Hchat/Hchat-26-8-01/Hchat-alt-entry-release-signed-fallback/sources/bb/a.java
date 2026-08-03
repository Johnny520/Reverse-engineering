package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bb.b f635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f636i;

    public /* synthetic */ a(bb.b r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f634g = r3
            r0.f635h = r1
            r0.f636i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f634g
            switch(r0) {
                case 0: goto L19;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            bb.b r0 = r2.f635h
            java.lang.Object r0 = r0.f639c
            bb.c r0 = (bb.c) r0
            java.lang.String r1 = r2.f636i
            r0.invoke(r1)
            return
        L11:
            bb.b r0 = r2.f635h
            java.lang.String r1 = r2.f636i
            r0.k(r1)
            return
        L19:
            bb.b r0 = r2.f635h
            java.lang.String r1 = r2.f636i
            r0.k(r1)
            return
    }
}
