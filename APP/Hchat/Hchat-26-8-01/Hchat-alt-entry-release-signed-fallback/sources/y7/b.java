package y7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z7.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22308p;

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r2.c(r3)
            r1 = 0
            if (r0 != 0) goto L11
            if (r3 != 0) goto La
            goto L11
        La:
            r2.f22308p = r1
            boolean r3 = super.add(r3)
            return r3
        L11:
            return r1
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f22586i
            java.util.Iterator r2 = r2.iterator()
            r1.add(r2)
            int r2 = r1.f22586i
            if (r0 == r2) goto Lf
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // z7.c, java.util.List, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r2 = super.remove(r2)
            if (r2 == 0) goto L9
            r0 = 0
            r1.f22308p = r0
        L9:
            return r2
    }

    @Override // z7.c, java.util.List
    public final void sort(java.util.Comparator r5) {
            r4 = this;
            boolean r0 = r4.f22308p
            if (r0 != 0) goto Ld
            int r1 = r4.f22586i
            r2 = 2
            r3 = 1
            if (r1 >= r2) goto Lb
            r0 = r3
        Lb:
            r4.f22308p = r3
        Ld:
            if (r0 != 0) goto L12
            super.sort(r5)
        L12:
            return
    }
}
