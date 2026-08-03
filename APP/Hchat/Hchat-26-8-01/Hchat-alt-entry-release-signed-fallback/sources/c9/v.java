package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1398h;

    public /* synthetic */ v(java.util.concurrent.atomic.AtomicBoolean r1, int r2) {
            r0 = this;
            r0.f1397g = r2
            r0.f1398h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f1397g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1398h
            r1 = 1
            r0.set(r1)
        Lb:
            sf.n r0 = sf.n.f12433a
            return r0
        Le:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1398h
            r1 = 1
            r0.set(r1)
            goto Lb
    }
}
