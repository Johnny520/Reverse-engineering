package c5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c5.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1024i;

    public /* synthetic */ a(int r1, int r2, int r3) {
            r0 = this;
            r0.f1024i = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // b5.j
    public final boolean c(e5.a r2) {
            r1 = this;
            int r0 = r1.f1024i
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = ".prologue"
            r2.write(r0)
        La:
            r2 = 1
            return r2
        Lc:
            java.lang.String r0 = ".prologue"
            r2.write(r0)
            goto La
    }
}
