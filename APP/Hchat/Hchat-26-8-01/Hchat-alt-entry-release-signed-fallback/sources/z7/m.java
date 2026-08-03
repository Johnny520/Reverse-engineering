package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Iterator f22617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.Iterator f22618h;

    public m(java.util.Iterator r1) {
            r0 = this;
            r0.<init>()
            r0.f22617g = r1
            return
    }

    public final java.util.Iterator a() {
            r2 = this;
            java.util.Iterator r0 = r2.f22618h
            if (r0 == 0) goto La
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L27
        La:
            r0 = 0
            r2.f22618h = r0
        Ld:
            java.util.Iterator r0 = r2.f22617g
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r0 = r0.next()
            java.util.Iterator r0 = r2.b(r0)
            if (r0 == 0) goto Ld
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld
            r2.f22618h = r0
        L27:
            java.util.Iterator r0 = r2.f22618h
            return r0
    }

    public abstract java.util.Iterator b(java.lang.Object r1);

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator r0 = r1.a()
            if (r0 == 0) goto Le
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            java.util.Iterator r0 = r1.a()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.next()
            return r0
        Lb:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
