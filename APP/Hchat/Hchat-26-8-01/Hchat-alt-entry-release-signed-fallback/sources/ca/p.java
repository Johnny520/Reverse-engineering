package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gg.u f1551i;

    public /* synthetic */ p(java.util.concurrent.atomic.AtomicBoolean r1, gg.u r2, int r3) {
            r0 = this;
            r0.f1549g = r3
            r0.f1550h = r1
            r0.f1551i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f1549g
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L47;
                case 2: goto L31;
                case 3: goto L1b;
                default: goto L5;
            }
        L5:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1550h
            boolean r0 = r0.get()
            if (r0 != 0) goto L18
            gg.u r0 = r1.f1551i
            java.lang.Object r0 = r0.f4564g
            hb.s r0 = (hb.s) r0
            if (r0 == 0) goto L18
            r0.a()
        L18:
            sf.n r0 = sf.n.f12433a
            return r0
        L1b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1550h
            boolean r0 = r0.get()
            if (r0 != 0) goto L2e
            gg.u r0 = r1.f1551i
            java.lang.Object r0 = r0.f4564g
            hb.s r0 = (hb.s) r0
            if (r0 == 0) goto L2e
            r0.a()
        L2e:
            sf.n r0 = sf.n.f12433a
            return r0
        L31:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1550h
            boolean r0 = r0.get()
            if (r0 != 0) goto L44
            gg.u r0 = r1.f1551i
            java.lang.Object r0 = r0.f4564g
            hb.s r0 = (hb.s) r0
            if (r0 == 0) goto L44
            r0.a()
        L44:
            sf.n r0 = sf.n.f12433a
            return r0
        L47:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1550h
            boolean r0 = r0.get()
            if (r0 != 0) goto L5a
            gg.u r0 = r1.f1551i
            java.lang.Object r0 = r0.f4564g
            hb.s r0 = (hb.s) r0
            if (r0 == 0) goto L5a
            r0.a()
        L5a:
            sf.n r0 = sf.n.f12433a
            return r0
        L5d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1550h
            boolean r0 = r0.get()
            if (r0 != 0) goto L70
            gg.u r0 = r1.f1551i
            java.lang.Object r0 = r0.f4564g
            hb.s r0 = (hb.s) r0
            if (r0 == 0) goto L70
            r0.a()
        L70:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
