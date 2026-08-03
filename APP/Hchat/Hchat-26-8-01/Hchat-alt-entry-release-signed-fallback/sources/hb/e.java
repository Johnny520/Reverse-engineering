package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hb.k f5356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hb.i f5357i;

    public /* synthetic */ e(hb.k r1, hb.i r2, int r3) {
            r0 = this;
            r0.f5355g = r3
            r0.f5356h = r1
            r0.f5357i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f5355g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            hb.k r0 = r3.f5356h
            hb.i r1 = r3.f5357i
            r0.m(r1)
            return
        Ld:
            hb.i r0 = r3.f5357i
            hb.k r1 = r3.f5356h
            java.util.ArrayDeque r2 = r1.f5422e
            r2.addLast(r0)
            hb.i r0 = r1.f5424g
            if (r0 != 0) goto L1d
            r1.n()
        L1d:
            return
    }
}
