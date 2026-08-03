package b5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class f extends b5.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f473h;

    public f(a5.a r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r2)
            r0.f473h = r3
            return
    }

    @Override // b5.j
    public final int a(b5.j r3) {
            r2 = this;
            int r0 = super.a(r3)
            if (r0 != 0) goto L15
            boolean r1 = r3 instanceof b5.f
            if (r1 == 0) goto L15
            b5.f r3 = (b5.f) r3
            java.lang.String r3 = r3.f473h
            java.lang.String r0 = r2.f473h
            int r3 = r0.compareTo(r3)
            return r3
        L15:
            return r0
    }

    @Override // b5.j
    public double b() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // b5.j
    public final boolean c(e5.a r3) {
            r2 = this;
            r0 = 58
            r3.write(r0)
            java.lang.String r0 = r2.f473h
            r3.write(r0)
            int r0 = r2.d()
            long r0 = (long) r0
            r3.C(r0)
            r3 = 1
            return r3
    }

    @Override // b5.j, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            b5.j r1 = (b5.j) r1
            int r1 = r0.a(r1)
            return r1
    }

    public int d() {
            r1 = this;
            int r0 = r1.f486g
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof b5.f
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            b5.j r3 = (b5.j) r3
            int r3 = r2.a(r3)
            if (r3 != 0) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f486g
            return r0
    }
}
