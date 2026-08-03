package o0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends o0.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object[] f9488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0.j f9489j;

    public g(int r1, int r2, java.lang.Object[] r3, int r4, java.lang.Object[] r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f9488i = r5
            int r2 = r2 + (-1)
            r2 = r2 & (-32)
            if (r1 <= r2) goto Lc
            r1 = r2
        Lc:
            o0.j r5 = new o0.j
            r5.<init>(r3, r1, r2, r4)
            r0.f9489j = r5
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            o0.j r0 = r3.f9489j
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            int r1 = r3.f9470g
            int r1 = r1 + 1
            r3.f9470g = r1
            java.lang.Object r0 = r0.next()
            return r0
        L19:
            int r1 = r3.f9470g
            int r2 = r1 + 1
            r3.f9470g = r2
            int r0 = r0.f9471h
            int r1 = r1 - r0
            java.lang.Object[] r0 = r3.f9488i
            r0 = r0[r1]
            return r0
        L27:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L21
            int r0 = r3.f9470g
            o0.j r1 = r3.f9489j
            int r2 = r1.f9471h
            if (r0 <= r2) goto L18
            int r0 = r0 + (-1)
            r3.f9470g = r0
            int r0 = r0 - r2
            java.lang.Object[] r1 = r3.f9488i
            r0 = r1[r0]
            return r0
        L18:
            int r0 = r0 + (-1)
            r3.f9470g = r0
            java.lang.Object r0 = r1.previous()
            return r0
        L21:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
