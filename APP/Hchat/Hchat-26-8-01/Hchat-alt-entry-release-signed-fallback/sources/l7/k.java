package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l7.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j7.a f7884o;

    public k() {
            r3 = this;
            p7.h r0 = new p7.h
            r0.<init>()
            r1 = 1
            r3.<init>(r0, r1)
            j7.a r1 = new j7.a
            r7.f r0 = r0.f10288r
            r2 = 1
            r1.<init>(r0, r2)
            r3.f7884o = r1
            r3.P(r1)
            return
    }

    @Override // l7.a
    public final void S() {
            r2 = this;
            p7.a r0 = r2.f7869m
            p7.h r0 = (p7.h) r0
            r7.f r0 = r0.f10288r
            j7.a r1 = r2.f7884o
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.k(r1)
            return
    }

    @Override // l7.a
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<l7.k> r1 = l7.k.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": count="
            r0.append(r1)
            j7.a r1 = r2.f7884o
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // k7.a
    public final boolean y() {
            r1 = this;
            j7.a r0 = r1.f7884o
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
