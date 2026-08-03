package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ha.h f5195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ha.g f5196i;

    public /* synthetic */ f(ha.h r1, ha.g r2, int r3) {
            r0 = this;
            r0.f5194g = r3
            r0.f5195h = r1
            r0.f5196i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f5194g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            ha.h r0 = r2.f5195h
            ha.g r1 = r2.f5196i
            r0.c(r1)
            return
        Ld:
            ha.h r0 = r2.f5195h
            ha.g r1 = r2.f5196i
            r0.c(r1)
            return
    }
}
