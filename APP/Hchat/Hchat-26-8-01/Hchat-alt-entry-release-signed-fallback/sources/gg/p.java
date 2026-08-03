package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends gg.d implements mg.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f4559m;

    public p(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.f4559m = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof gg.p
            if (r0 == 0) goto L37
            gg.p r3 = (gg.p) r3
            gg.e r0 = r2.f()
            gg.e r1 = r3.f()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.f4551j
            java.lang.String r1 = r3.f4551j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.f4552k
            java.lang.String r1 = r3.f4552k
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.Object r0 = r2.f4549h
            java.lang.Object r3 = r3.f4549h
            boolean r3 = gg.l.a(r0, r3)
            if (r3 == 0) goto L44
        L35:
            r3 = 1
            return r3
        L37:
            boolean r0 = r3 instanceof mg.d
            if (r0 == 0) goto L44
            mg.a r0 = r2.g()
            boolean r3 = r3.equals(r0)
            return r3
        L44:
            r3 = 0
            return r3
    }

    public final mg.a g() {
            r1 = this;
            boolean r0 = r1.f4559m
            if (r0 == 0) goto L5
            return r1
        L5:
            mg.a r0 = r1.f4548g
            if (r0 != 0) goto Lf
            mg.a r0 = r1.e()
            r1.f4548g = r0
        Lf:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            gg.e r0 = r3.f()
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4551j
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f4552k
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            mg.a r0 = r3.g()
            if (r0 == r3) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "property "
            r0.<init>(r1)
            java.lang.String r1 = r3.f4551j
            java.lang.String r2 = " (Kotlin reflection is not available)"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
