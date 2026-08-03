package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements p.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.r1 f9930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2.c f9931b;

    public j0(p.r1 r1, u2.c r2) {
            r0 = this;
            r0.<init>()
            r0.f9930a = r1
            r0.f9931b = r2
            return
    }

    @Override // p.x0
    public final float a() {
            r2 = this;
            p.r1 r0 = r2.f9930a
            u2.c r1 = r2.f9931b
            int r0 = r0.b(r1)
            float r0 = r1.i0(r0)
            return r0
    }

    @Override // p.x0
    public final float b(u2.m r3) {
            r2 = this;
            p.r1 r0 = r2.f9930a
            u2.c r1 = r2.f9931b
            int r3 = r0.a(r1, r3)
            float r3 = r1.i0(r3)
            return r3
    }

    @Override // p.x0
    public final float c() {
            r2 = this;
            p.r1 r0 = r2.f9930a
            u2.c r1 = r2.f9931b
            int r0 = r0.d(r1)
            float r0 = r1.i0(r0)
            return r0
    }

    @Override // p.x0
    public final float d(u2.m r3) {
            r2 = this;
            p.r1 r0 = r2.f9930a
            u2.c r1 = r2.f9931b
            int r3 = r0.c(r1, r3)
            float r3 = r1.i0(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p.j0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p.j0 r5 = (p.j0) r5
            p.r1 r1 = r5.f9930a
            p.r1 r3 = r4.f9930a
            boolean r1 = gg.l.a(r3, r1)
            if (r1 == 0) goto L21
            u2.c r1 = r4.f9931b
            u2.c r5 = r5.f9931b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            p.r1 r0 = r2.f9930a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            u2.c r1 = r2.f9931b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InsetsPaddingValues(insets="
            r0.<init>(r1)
            p.r1 r1 = r2.f9930a
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            u2.c r1 = r2.f9931b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
