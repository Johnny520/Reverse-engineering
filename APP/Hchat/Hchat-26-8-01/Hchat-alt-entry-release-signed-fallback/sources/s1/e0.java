package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1.l f12225a;

    public e0(x1.l r1) {
            r0 = this;
            r0.<init>()
            r0.f12225a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L1f
        L3:
            boolean r0 = r2 instanceof s1.e0
            if (r0 != 0) goto L8
            goto L1d
        L8:
            s1.e0 r2 = (s1.e0) r2
            s1.a r0 = w.s.f14645e
            boolean r0 = r0.equals(r0)
            if (r0 != 0) goto L13
            goto L1d
        L13:
            x1.l r0 = r1.f12225a
            x1.l r2 = r2.f12225a
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            s1.f0 r0 = new s1.f0
            s1.a r1 = w.s.f14645e
            x1.l r2 = r3.f12225a
            r0.<init>(r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            s1.f0 r3 = (s1.f0) r3
            s1.a r0 = w.s.f14645e
            s1.a r1 = r3.f12227v
            boolean r1 = gg.l.a(r1, r0)
            if (r1 != 0) goto L15
            r3.f12227v = r0
            boolean r0 = r3.f12228w
            if (r0 == 0) goto L15
            r3.m1()
        L15:
            x1.l r0 = r2.f12225a
            r3.f12226u = r0
            return
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1022(0x3fe, float:1.432E-42)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = eh.a.h(r0, r1, r2)
            x1.l r1 = r3.f12225a
            if (r1 != 0) goto Lf
            goto L13
        Lf:
            int r2 = r1.hashCode()
        L13:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StylusHoverIconModifierElement(icon="
            r0.<init>(r1)
            s1.a r1 = w.s.f14645e
            r0.append(r1)
            java.lang.String r1 = ", overrideDescendants=false, touchBoundsExpansion="
            r0.append(r1)
            x1.l r1 = r2.f12225a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
