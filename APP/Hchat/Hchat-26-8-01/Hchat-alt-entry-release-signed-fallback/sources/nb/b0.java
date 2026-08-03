package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gg.u f9210h;

    public /* synthetic */ b0(gg.u r1, int r2) {
            r0 = this;
            r0.f9209g = r2
            r0.f9210h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f9209g
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            gg.u r0 = r1.f9210h
            java.lang.Object r0 = r0.f4564g
            if (r0 == 0) goto L11
            fg.a r0 = (fg.a) r0
            r0.invoke()
            return
        L11:
            java.lang.String r0 = "startNext"
            gg.l.g(r0)
            r0 = 0
            throw r0
        L18:
            gg.u r0 = r1.f9210h
            java.lang.Object r0 = r0.f4564g
            if (r0 == 0) goto L24
            fg.a r0 = (fg.a) r0
            r0.invoke()
            return
        L24:
            java.lang.String r0 = "startNext"
            gg.l.g(r0)
            r0 = 0
            throw r0
    }
}
