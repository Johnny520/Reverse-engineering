package o8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o8.j f9596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f9597i;

    public /* synthetic */ h(o8.j r1, java.lang.Runnable r2, int r3) {
            r0 = this;
            r0.f9595g = r3
            r0.f9596h = r1
            r0.f9597i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f9595g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            o8.j r0 = r2.f9596h
            java.lang.Runnable r1 = r2.f9597i
            r0.g(r1)
            return
        Ld:
            o8.j r0 = r2.f9596h
            java.lang.Runnable r1 = r2.f9597i
            r0.g(r1)
            return
    }
}
