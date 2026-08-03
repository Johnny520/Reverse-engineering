package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1202i;

    public /* synthetic */ h(java.util.concurrent.atomic.AtomicBoolean r1, java.util.concurrent.atomic.AtomicBoolean r2, int r3) {
            r0 = this;
            r0.f1200g = r3
            r0.f1201h = r1
            r0.f1202i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f1200g
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L49;
                case 2: goto L38;
                case 3: goto L27;
                case 4: goto L16;
                default: goto L5;
            }
        L5:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1201h
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f1202i
            r1.set(r0)
        L13:
            sf.n r0 = sf.n.f12433a
            return r0
        L16:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1201h
            boolean r0 = r0.get()
            if (r0 != 0) goto L24
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f1202i
            r1.set(r0)
        L24:
            sf.n r0 = sf.n.f12433a
            return r0
        L27:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1201h
            boolean r0 = r0.get()
            if (r0 != 0) goto L35
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f1202i
            r1.set(r0)
        L35:
            sf.n r0 = sf.n.f12433a
            return r0
        L38:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1201h
            boolean r0 = r0.get()
            if (r0 != 0) goto L46
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f1202i
            r1.set(r0)
        L46:
            sf.n r0 = sf.n.f12433a
            return r0
        L49:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1201h
            boolean r0 = r0.get()
            if (r0 != 0) goto L57
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f1202i
            r1.set(r0)
        L57:
            sf.n r0 = sf.n.f12433a
            return r0
        L5a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1201h
            boolean r0 = r0.get()
            if (r0 != 0) goto L68
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.f1202i
            r1.set(r0)
        L68:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
