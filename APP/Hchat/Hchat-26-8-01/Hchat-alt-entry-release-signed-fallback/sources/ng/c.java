package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ng.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.l f9428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f9429c;

    public c(fg.a r2, fg.l r3) {
            r1 = this;
            r0 = 1
            r1.f9427a = r0
            r1.<init>()
            r1.f9429c = r2
            r1.f9428b = r3
            return
    }

    public c(ng.j r2, fg.l r3) {
            r1 = this;
            r0 = 0
            r1.f9427a = r0
            r3.getClass()
            r1.<init>()
            r1.f9429c = r2
            r1.f9428b = r3
            return
    }

    @Override // ng.j
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f9427a
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            f.i0 r0 = new f.i0
            r0.<init>(r3)
            return r0
        Lb:
            ng.b r0 = new ng.b
            java.lang.Object r1 = r3.f9429c
            ng.j r1 = (ng.j) r1
            java.util.Iterator r1 = r1.iterator()
            fg.l r2 = r3.f9428b
            r0.<init>(r1, r2)
            return r0
    }
}
