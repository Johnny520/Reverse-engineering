package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xe.j f21566i;

    public i(xe.j r1) {
            r0 = this;
            r0.<init>()
            r0.f21566i = r1
            java.lang.Object[] r1 = r1.f21567g
            int r1 = r1.length
            r0.f21564g = r1
            r1 = 0
            r0.f21565h = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f21565h
            int r1 = r2.f21564g
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            xe.j r0 = r3.f21566i     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            java.lang.Object[] r0 = r0.f21567g     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            int r1 = r3.f21565h     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            int r2 = r1 + 1
            r3.f21565h = r2     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            r0 = r0[r1]     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            j8.o.l(r0)
            r0 = 0
            return r0
    }
}
