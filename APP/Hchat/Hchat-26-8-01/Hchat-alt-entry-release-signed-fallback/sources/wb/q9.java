package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q9 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f18586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ eb.c0 f18587i;

    public /* synthetic */ q9(fg.l r1, eb.c0 r2, int r3) {
            r0 = this;
            r0.f18585g = r3
            r0.f18586h = r1
            r0.f18587i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f18585g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            fg.l r0 = r2.f18586h
            eb.c0 r1 = r2.f18587i
            r0.invoke(r1)
        Lc:
            sf.n r0 = sf.n.f12433a
            return r0
        Lf:
            fg.l r0 = r2.f18586h
            eb.c0 r1 = r2.f18587i
            r0.invoke(r1)
            goto Lc
    }
}
