package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f22629g;

    public static java.util.Iterator a(java.lang.Object r1) {
            if (r1 != 0) goto L5
            z7.h r1 = z7.h.f22606g
            return r1
        L5:
            z7.q r0 = new z7.q
            r0.<init>()
            r0.f22629g = r1
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.lang.Object r0 = r1.f22629g
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            java.lang.Object r0 = r2.f22629g
            r1 = 0
            r2.f22629g = r1
            return r0
    }
}
