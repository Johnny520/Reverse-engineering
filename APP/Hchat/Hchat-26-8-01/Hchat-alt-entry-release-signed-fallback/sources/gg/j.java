package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class j extends gg.d implements gg.i, mg.a, sf.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4556m;

    public j(int r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
            r8 = this;
            gg.c r2 = gg.c.f4547g
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public j(int r7, java.lang.Object r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12, int r13) {
            r6 = this;
            r13 = 1
            r12 = r12 & r13
            if (r12 != r13) goto Lb
        L4:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r13
            goto Ld
        Lb:
            r13 = 0
            goto L4
        Ld:
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f4556m = r7
            return
    }

    @Override // gg.d
    public final mg.a e() {
            r1 = this;
            gg.w r0 = gg.v.f4565a
            r0.getClass()
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof gg.j
            if (r0 == 0) goto L37
            gg.j r3 = (gg.j) r3
            java.lang.String r0 = r2.f4551j
            java.lang.String r1 = r3.f4551j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            java.lang.String r0 = r2.f4552k
            java.lang.String r1 = r3.f4552k
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r2.f4549h
            java.lang.Object r1 = r3.f4549h
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L4a
            gg.e r0 = r2.f()
            gg.e r3 = r3.f()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L4a
        L35:
            r3 = 1
            return r3
        L37:
            boolean r0 = r3 instanceof gg.j
            if (r0 == 0) goto L4a
            mg.a r0 = r2.f4548g
            if (r0 != 0) goto L45
            r2.e()
            r2.f4548g = r2
            r0 = r2
        L45:
            boolean r3 = r3.equals(r0)
            return r3
        L4a:
            r3 = 0
            return r3
    }

    @Override // gg.i
    public final int getArity() {
            r1 = this;
            int r0 = r1.f4556m
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r3.f()
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
            mg.a r0 = r3.f4548g
            if (r0 != 0) goto La
            r3.e()
            r3.f4548g = r3
            r0 = r3
        La:
            if (r0 == r3) goto L11
            java.lang.String r0 = r0.toString()
            return r0
        L11:
            java.lang.String r0 = "<init>"
            java.lang.String r1 = r3.f4551j
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "constructor (Kotlin reflection is not available)"
            return r0
        L1e:
            java.lang.String r0 = "function "
            java.lang.String r2 = " (Kotlin reflection is not available)"
            java.lang.String r0 = eh.a.n(r0, r1, r2)
            return r0
    }
}
