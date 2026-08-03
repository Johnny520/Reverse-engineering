package vf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vf.a f14314h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final vf.a f14315i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14316g;

    static {
            vf.a r0 = new vf.a
            r1 = 0
            r0.<init>(r1)
            vf.a.f14314h = r0
            vf.a r0 = new vf.a
            r1 = 1
            r0.<init>(r1)
            vf.a.f14315i = r0
            return
    }

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.f14316g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f14316g
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r2.getClass()
            r3.getClass()
            int r2 = r3.compareTo(r2)
            return r2
        L14:
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r2.getClass()
            r3.getClass()
            int r2 = r2.compareTo(r3)
            return r2
    }

    @Override // java.util.Comparator
    public final java.util.Comparator reversed() {
            r1 = this;
            int r0 = r1.f14316g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            vf.a r0 = vf.a.f14314h
            return r0
        L8:
            vf.a r0 = vf.a.f14315i
            return r0
    }
}
