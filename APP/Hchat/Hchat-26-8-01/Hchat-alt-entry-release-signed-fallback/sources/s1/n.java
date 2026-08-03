package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.a f12284a;

    public n(s1.a r1) {
            r0 = this;
            r0.<init>()
            r0.f12284a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof s1.n
            if (r1 != 0) goto L9
            goto L15
        L9:
            s1.n r3 = (s1.n) r3
            s1.a r1 = r2.f12284a
            s1.a r3 = r3.f12284a
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L17
        L15:
            r3 = 0
            return r3
        L17:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            s1.o r0 = new s1.o
            s1.a r1 = r3.f12284a
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            s1.o r3 = (s1.o) r3
            s1.a r0 = r3.f12227v
            s1.a r1 = r2.f12284a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            r3.f12227v = r1
            boolean r0 = r3.f12228w
            if (r0 == 0) goto L15
            r3.m1()
        L15:
            return
    }

    public final int hashCode() {
            r2 = this;
            s1.a r0 = r2.f12284a
            int r0 = r0.f12202b
            int r0 = r0 * 31
            r1 = 0
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerHoverIconModifierElement(icon="
            r0.<init>(r1)
            s1.a r1 = r2.f12284a
            r0.append(r1)
            java.lang.String r1 = ", overrideDescendants=false)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
