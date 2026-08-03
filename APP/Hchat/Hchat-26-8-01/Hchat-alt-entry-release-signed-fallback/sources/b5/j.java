package b5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f486g;

    public j(int r1) {
            r0 = this;
            r0.<init>()
            r0.f486g = r1
            return
    }

    public int a(b5.j r4) {
            r3 = this;
            int r0 = r3.f486g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r4.f486g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L27
            double r0 = r3.b()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r1 = r4.b()
            java.lang.Double r4 = java.lang.Double.valueOf(r1)
            int r4 = r0.compareTo(r4)
            return r4
        L27:
            return r0
    }

    public abstract double b();

    public abstract boolean c(e5.a r1);

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            b5.j r1 = (b5.j) r1
            int r1 = r0.a(r1)
            return r1
    }
}
