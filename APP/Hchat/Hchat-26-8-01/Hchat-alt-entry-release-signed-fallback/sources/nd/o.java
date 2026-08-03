package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.EnumMap f9384g;

    public o() {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<bc.a> r1 = bc.a.class
            r0.<init>(r1)
            r2.f9384g = r0
            return
    }

    public static void b(nd.b0 r2, bc.a r3, java.lang.String r4) {
            md.b r0 = md.b.f8849d
            md.f r1 = r2.f8877g
            oc.b r0 = r1.c(r0)
            nd.o r0 = (nd.o) r0
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            nd.o r0 = new nd.o
            r0.<init>()
            r2.y(r0)
        L15:
            java.util.EnumMap r2 = r0.f9384g
            me.a r0 = new me.a
            r1 = 3
            r0.<init>(r1)
            java.lang.Object r2 = r2.computeIfAbsent(r3, r0)
            java.util.Set r2 = (java.util.Set) r2
            r2.add(r4)
            return
    }

    @Override // oc.b
    public final oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8849d
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.util.EnumMap r0 = r3.f9384g
            java.util.Set r0 = r0.entrySet()
            me.a r1 = new me.a
            r2 = 2
            r1.<init>(r2)
            java.lang.String r2 = "\n "
            java.lang.String r0 = xe.s.k(r0, r2, r1)
            java.lang.String r1 = "JadxCommentsAttr{\n "
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }
}
