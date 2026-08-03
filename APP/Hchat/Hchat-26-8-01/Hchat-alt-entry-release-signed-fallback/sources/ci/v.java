package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ci.v f1802h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ci.v f1803i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1804g;

    static {
            ci.v r0 = new ci.v
            r1 = 0
            r0.<init>(r1)
            ci.v.f1802h = r0
            ci.v r0 = new ci.v
            r1 = 1
            r0.<init>(r1)
            ci.v.f1803i = r0
            return
    }

    public /* synthetic */ v(int r1) {
            r0 = this;
            r0.f1804g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f1804g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.ClassCastException r2 = eh.a.j(r2)
            throw r2
        La:
            java.lang.ClassCastException r2 = eh.a.j(r2)
            throw r2
    }
}
