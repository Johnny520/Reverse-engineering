package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bb.k f670h;

    public /* synthetic */ i(bb.k r1, int r2) {
            r0 = this;
            r0.f669g = r2
            r0.f670h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f669g
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            bb.k r0 = r1.f670h
            r0.d()
            return
        Lb:
            bb.k r0 = r1.f670h
            r0.k()
            return
        L11:
            bb.k r0 = r1.f670h
            r0.k()
            return
    }
}
