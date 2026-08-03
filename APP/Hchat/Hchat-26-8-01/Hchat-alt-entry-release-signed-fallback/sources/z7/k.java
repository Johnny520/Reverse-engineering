package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class k implements java.util.Iterator, java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Iterator f22610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f22611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.function.Predicate f22612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22613j;

    public k(java.util.Iterator r1, java.util.function.Predicate r2) {
            r0 = this;
            r0.<init>()
            r0.f22610g = r1
            r0.f22612i = r2
            return
    }

    public final java.lang.Object a() {
            r2 = this;
            java.lang.Object r0 = r2.f22611h
            if (r0 != 0) goto L25
        L4:
            java.util.Iterator r0 = r2.f22610g
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r0 = r0.next()
            if (r0 == 0) goto L4
            boolean r1 = r2.test(r0)
            if (r1 != 0) goto L19
            goto L4
        L19:
            java.util.function.Predicate r1 = r2.f22612i
            if (r1 == 0) goto L23
            boolean r1 = r1.test(r0)
            if (r1 == 0) goto L4
        L23:
            r2.f22611h = r0
        L25:
            java.lang.Object r0 = r2.f22611h
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            boolean r0 = r3.f22613j
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r3.a()
            r2 = 1
            if (r0 == 0) goto Le
            return r2
        Le:
            r3.f22613j = r2
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            java.lang.Object r0 = r2.a()
            if (r0 == 0) goto La
            r1 = 0
            r2.f22611h = r1
            return r0
        La:
            bsh.j.e()
            r0 = 0
            return r0
    }

    public boolean test(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }
}
