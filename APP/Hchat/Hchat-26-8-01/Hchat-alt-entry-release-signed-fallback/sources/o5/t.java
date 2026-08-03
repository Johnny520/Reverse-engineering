package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f9547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a5.a f9548i;

    public t(androidx.lifecycle.x r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 2
            r2.f9546g = r0
            r3.getClass()
            a5.a r0 = new a5.a
            r1 = 5
            r0.<init>(r4, r1, r3)
            r2.f9548i = r0
            return
    }

    public abstract java.lang.Object a(a5.a r1);

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.f9546g
            r1 = 1
            if (r0 == r1) goto L1c
            r2 = 3
            if (r0 == r2) goto L1a
            r0 = 4
            r3.f9546g = r0
            a5.a r0 = r3.f9548i
            java.lang.Object r0 = r3.a(r0)
            r3.f9547h = r0
            int r0 = r3.f9546g
            if (r0 == r2) goto L1a
            r3.f9546g = r1
            return r1
        L1a:
            r0 = 0
            return r0
        L1c:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            r0 = 2
            r2.f9546g = r0
            java.lang.Object r0 = r2.f9547h
            r1 = 0
            r2.f9547h = r1
            return r0
        Lf:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
