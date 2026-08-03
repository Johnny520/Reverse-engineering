package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ac.k f12139h;

    public /* synthetic */ y(ac.k r1, int r2) {
            r0 = this;
            r0.f12138g = r2
            r0.f12139h = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f12138g
            switch(r0) {
                case 0: goto L62;
                case 1: goto L43;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            r.q r3 = (r.q) r3
            java.lang.Object r3 = r3.f11246k
            ac.k r0 = r1.f12139h
            int r3 = r0.o(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r.q r2 = (r.q) r2
            java.lang.Object r2 = r2.f11246k
            int r2 = r0.o(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r3.compareTo(r2)
            return r2
        L24:
            r.q r3 = (r.q) r3
            java.lang.Object r3 = r3.f11246k
            ac.k r0 = r1.f12139h
            int r3 = r0.o(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r.q r2 = (r.q) r2
            java.lang.Object r2 = r2.f11246k
            int r2 = r0.o(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r3.compareTo(r2)
            return r2
        L43:
            r.q r2 = (r.q) r2
            java.lang.Object r2 = r2.f11246k
            ac.k r0 = r1.f12139h
            int r2 = r0.o(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r.q r3 = (r.q) r3
            java.lang.Object r3 = r3.f11246k
            int r3 = r0.o(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.compareTo(r3)
            return r2
        L62:
            r.q r2 = (r.q) r2
            java.lang.Object r2 = r2.f11246k
            ac.k r0 = r1.f12139h
            int r2 = r0.o(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r.q r3 = (r.q) r3
            java.lang.Object r3 = r3.f11246k
            int r3 = r0.o(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.compareTo(r3)
            return r2
    }
}
