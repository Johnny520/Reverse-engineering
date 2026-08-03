package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class i0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.k f1729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.y0 f1730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1731c;

    public i0(n.k r1, k.y0 r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f1729a = r1
            r0.f1730b = r2
            r0.f1731c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof ci.i0
            if (r0 != 0) goto L8
            goto L26
        L8:
            ci.i0 r3 = (ci.i0) r3
            n.k r0 = r2.f1729a
            n.k r1 = r3.f1729a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            k.y0 r0 = r2.f1730b
            k.y0 r1 = r3.f1730b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            boolean r0 = r2.f1731c
            boolean r3 = r3.f1731c
            if (r0 == r3) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r4 = this;
            ci.l0 r0 = new ci.l0
            k.y0 r1 = r4.f1730b
            boolean r2 = r4.f1731c
            n.k r3 = r4.f1729a
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r7) {
            r6 = this;
            ci.l0 r7 = (ci.l0) r7
            r7.getClass()
            n.k r0 = r7.C
            n.k r1 = r6.f1729a
            boolean r0 = gg.l.a(r0, r1)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L1a
            r7.o1()
            r7.C = r1
            r7.f1745w = r1
            r0 = r2
            goto L1b
        L1a:
            r0 = r3
        L1b:
            k.y0 r1 = r7.f1746x
            k.y0 r4 = r6.f1730b
            boolean r1 = gg.l.a(r1, r4)
            if (r1 != 0) goto L28
            r7.f1746x = r4
            r0 = r2
        L28:
            boolean r1 = r7.f1747y
            boolean r4 = r6.f1731c
            if (r1 == r4) goto L38
            if (r4 != 0) goto L33
            r7.o1()
        L33:
            x1.k.n(r7)
            r7.f1747y = r4
        L38:
            boolean r1 = r7.D
            n.k r4 = r7.C
            if (r4 != 0) goto L44
            k.y0 r5 = r7.f1746x
            if (r5 == 0) goto L44
            r5 = r2
            goto L45
        L44:
            r5 = r3
        L45:
            if (r1 == r5) goto L57
            if (r4 != 0) goto L4e
            k.y0 r1 = r7.f1746x
            if (r1 == 0) goto L4e
            r3 = r2
        L4e:
            r7.D = r3
            if (r3 != 0) goto L57
            x1.i r1 = r7.A
            if (r1 != 0) goto L57
            goto L58
        L57:
            r2 = r0
        L58:
            if (r2 == 0) goto L6d
            x1.i r0 = r7.A
            if (r0 != 0) goto L62
            boolean r1 = r7.D
            if (r1 != 0) goto L6d
        L62:
            if (r0 == 0) goto L67
            r7.l1(r0)
        L67:
            r0 = 0
            r7.A = r0
            r7.p1()
        L6d:
            return
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            n.k r1 = r3.f1729a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            k.y0 r2 = r3.f1730b
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.f1731c
            r2 = 961(0x3c1, float:1.347E-42)
            int r0 = eh.a.h(r1, r2, r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PressableElement(interactionSource="
            r0.<init>(r1)
            n.k r1 = r3.f1729a
            r0.append(r1)
            java.lang.String r1 = ", indicationNodeFactory="
            r0.append(r1)
            k.y0 r1 = r3.f1730b
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            java.lang.String r1 = ", role=null, delay=null)"
            boolean r2 = r3.f1731c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
