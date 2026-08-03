package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class o extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.c f2973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w.q0 f2974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.d1 f2975c;

    public o(f0.c r1, w.q0 r2, h0.d1 r3) {
            r0 = this;
            r0.<init>()
            r0.f2973a = r1
            r0.f2974b = r2
            r0.f2975c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof f0.o
            if (r0 != 0) goto L8
            goto L2a
        L8:
            f0.o r3 = (f0.o) r3
            f0.c r0 = r2.f2973a
            f0.c r1 = r3.f2973a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            w.q0 r0 = r2.f2974b
            w.q0 r1 = r3.f2974b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            h0.d1 r0 = r2.f2975c
            h0.d1 r3 = r3.f2975c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r4 = this;
            f0.p r0 = new f0.p
            w.q0 r1 = r4.f2974b
            h0.d1 r2 = r4.f2975c
            f0.c r3 = r4.f2973a
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            f0.p r3 = (f0.p) r3
            boolean r0 = r3.f21832t
            if (r0 == 0) goto L10
            f0.c r0 = r3.f2976u
            r0.d()
            f0.c r0 = r3.f2976u
            r0.k(r3)
        L10:
            f0.c r0 = r2.f2973a
            r3.f2976u = r0
            boolean r1 = r3.f21832t
            if (r1 == 0) goto L24
            f0.p r1 = r0.f2939a
            if (r1 != 0) goto L1d
            goto L22
        L1d:
            java.lang.String r1 = "Expected textInputModifierNode to be null"
            o.b.c(r1)
        L22:
            r0.f2939a = r3
        L24:
            w.q0 r0 = r2.f2974b
            r3.f2977v = r0
            h0.d1 r0 = r2.f2975c
            r3.f2978w = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            f0.c r0 = r2.f2973a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            w.q0 r1 = r2.f2974b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            h0.d1 r0 = r2.f2975c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LegacyAdaptingPlatformTextInputModifier(serviceAdapter="
            r0.<init>(r1)
            f0.c r1 = r2.f2973a
            r0.append(r1)
            java.lang.String r1 = ", legacyTextFieldState="
            r0.append(r1)
            w.q0 r1 = r2.f2974b
            r0.append(r1)
            java.lang.String r1 = ", textFieldSelectionManager="
            r0.append(r1)
            h0.d1 r1 = r2.f2975c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
