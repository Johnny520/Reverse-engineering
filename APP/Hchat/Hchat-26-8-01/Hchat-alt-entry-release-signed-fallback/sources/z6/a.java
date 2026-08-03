package z6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f1.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z6.c f22563a;

    public a() {
            r1 = this;
            r1.<init>()
            z6.c r0 = z6.c.f22577h
            r1.f22563a = r0
            return
    }

    @Override // f1.r0
    public final f1.c0 a(long r1, u2.m r3, u2.c r4) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            float r3 = e1.e.b(r1)
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            z6.c r4 = r0.f22563a
            f1.c0 r1 = ac.p.K(r1, r3, r4)
            return r1
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof z6.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z6.a r4 = (z6.a) r4
            z6.c r4 = r4.f22563a
            z6.c r1 = r3.f22563a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            z6.c r0 = r1.f22563a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Capsule(style="
            r0.<init>(r1)
            z6.c r1 = r2.f22563a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
