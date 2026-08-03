package o0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o0.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Object f9475j;

    public d(java.lang.Object r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f9474i = r0
            r1.<init>(r3, r0)
            r1.f9475j = r2
            return
    }

    public d(java.lang.Object[] r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f9474i = r0
            r1.<init>(r3, r4)
            r1.f9475j = r2
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f9474i
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L14
            int r0 = r3.f9470g
            int r0 = r0 + 1
            r3.f9470g = r0
            java.lang.Object r0 = r3.f9475j
            goto L18
        L14:
            bsh.j.e()
            r0 = 0
        L18:
            return r0
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.f9475j
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r3.f9470g
            int r2 = r1 + 1
            r3.f9470g = r2
            r0 = r0[r1]
            goto L30
        L2c:
            bsh.j.e()
            r0 = 0
        L30:
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r2 = this;
            int r0 = r2.f9474i
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L14
            int r0 = r2.f9470g
            int r0 = r0 + (-1)
            r2.f9470g = r0
            java.lang.Object r0 = r2.f9475j
            goto L18
        L14:
            bsh.j.e()
            r0 = 0
        L18:
            return r0
        L19:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r2.f9475j
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r2.f9470g
            int r1 = r1 + (-1)
            r2.f9470g = r1
            r0 = r0[r1]
            goto L30
        L2c:
            bsh.j.e()
            r0 = 0
        L30:
            return r0
    }
}
