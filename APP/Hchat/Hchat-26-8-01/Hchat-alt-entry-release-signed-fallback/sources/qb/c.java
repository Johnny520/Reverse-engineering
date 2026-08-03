package qb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qb.k f10804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f10805i;

    public /* synthetic */ c(qb.k r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.f10803g = r3
            r0.f10804h = r1
            r0.f10805i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f10803g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            android.app.Activity r0 = r2.f10805i
            qb.k r1 = r2.f10804h
            java.util.Set r1 = r1.f10845l
            r1.remove(r0)
        Le:
            sf.n r0 = sf.n.f12433a
            return r0
        L11:
            android.app.Activity r0 = r2.f10805i
            qb.k r1 = r2.f10804h
            java.util.Set r1 = r1.f10845l
            r1.remove(r0)
            goto Le
    }
}
