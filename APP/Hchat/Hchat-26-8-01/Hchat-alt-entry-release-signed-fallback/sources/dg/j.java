package dg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ng.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.l f2252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f2253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f2254d;

    public j(java.io.File r2, dg.k r3, c9.x r4) {
            r1 = this;
            r0 = 0
            r1.f2251a = r0
            r1.<init>()
            r1.f2253c = r2
            r1.f2254d = r3
            r1.f2252b = r4
            return
    }

    public j(ng.j r2, fg.l r3, fg.l r4) {
            r1 = this;
            r0 = 1
            r1.f2251a = r0
            r2.getClass()
            r3.getClass()
            r1.<init>()
            r1.f2253c = r2
            r1.f2252b = r3
            r1.f2254d = r4
            return
    }

    @Override // ng.j
    public final java.util.Iterator iterator() {
            r1 = this;
            int r0 = r1.f2251a
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            ng.h r0 = new ng.h
            r0.<init>(r1)
            return r0
        Lb:
            dg.h r0 = new dg.h
            r0.<init>(r1)
            return r0
    }
}
