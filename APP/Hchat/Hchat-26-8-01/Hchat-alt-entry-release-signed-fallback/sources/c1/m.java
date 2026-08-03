package c1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class m extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1.b f989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.c f990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1.s0 f991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1.n f993e;

    public m(k1.b r1, y0.c r2, v1.s0 r3, float r4, f1.n r5) {
            r0 = this;
            r0.<init>()
            r0.f989a = r1
            r0.f990b = r2
            r0.f991c = r3
            r0.f992d = r4
            r0.f993e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof c1.m
            if (r0 != 0) goto L8
            goto L40
        L8:
            c1.m r3 = (c1.m) r3
            k1.b r0 = r2.f989a
            k1.b r1 = r3.f989a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            y0.c r0 = r2.f990b
            y0.c r1 = r3.f990b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            v1.s0 r0 = r2.f991c
            v1.s0 r1 = r3.f991c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            float r0 = r2.f992d
            float r1 = r3.f992d
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L36
            goto L40
        L36:
            f1.n r0 = r2.f993e
            f1.n r3 = r3.f993e
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L42
        L40:
            r3 = 0
            return r3
        L42:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            c1.o r0 = new c1.o
            r0.<init>()
            k1.b r1 = r2.f989a
            r0.f996u = r1
            r1 = 1
            r0.f997v = r1
            y0.c r1 = r2.f990b
            r0.f998w = r1
            v1.s0 r1 = r2.f991c
            r0.f999x = r1
            float r1 = r2.f992d
            r0.f1000y = r1
            f1.n r1 = r2.f993e
            r0.f1001z = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r8) {
            r7 = this;
            c1.o r8 = (c1.o) r8
            boolean r0 = r8.f997v
            k1.b r1 = r7.f989a
            r2 = 1
            if (r0 != r2) goto L1c
            k1.b r0 = r8.f996u
            long r3 = r0.d()
            long r5 = r1.d()
            boolean r0 = e1.e.a(r3, r5)
            if (r0 != 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r8.f996u = r1
            r8.f997v = r2
            y0.c r1 = r7.f990b
            r8.f998w = r1
            v1.s0 r1 = r7.f991c
            r8.f999x = r1
            float r1 = r7.f992d
            r8.f1000y = r1
            f1.n r1 = r7.f993e
            r8.f1001z = r1
            if (r0 == 0) goto L36
            x1.k.m(r8)
        L36:
            x1.k.l(r8)
            return
    }

    public final int hashCode() {
            r3 = this;
            k1.b r0 = r3.f989a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 1
            int r0 = eh.a.h(r0, r1, r2)
            y0.c r2 = r3.f990b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            v1.s0 r0 = r3.f991c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r3.f992d
            int r0 = eh.a.d(r2, r0, r1)
            f1.n r1 = r3.f993e
            if (r1 != 0) goto L2a
            r1 = 0
            goto L2e
        L2a:
            int r1 = r1.hashCode()
        L2e:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PainterElement(painter="
            r0.<init>(r1)
            k1.b r1 = r2.f989a
            r0.append(r1)
            java.lang.String r1 = ", sizeToIntrinsics=true, alignment="
            r0.append(r1)
            y0.c r1 = r2.f990b
            r0.append(r1)
            java.lang.String r1 = ", contentScale="
            r0.append(r1)
            v1.s0 r1 = r2.f991c
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r2.f992d
            r0.append(r1)
            java.lang.String r1 = ", colorFilter="
            r0.append(r1)
            f1.n r1 = r2.f993e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
