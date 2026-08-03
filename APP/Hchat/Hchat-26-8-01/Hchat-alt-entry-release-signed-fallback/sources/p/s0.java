package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements p.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.r1 f9984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9985b;

    public s0(p.r1 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9984a = r1
            r0.f9985b = r2
            return
    }

    @Override // p.r1
    public final int a(u2.c r3, u2.m r4) {
            r2 = this;
            u2.m r0 = u2.m.f13354g
            if (r4 != r0) goto L6
            r0 = 4
            goto L7
        L6:
            r0 = 1
        L7:
            int r1 = r2.f9985b
            r0 = r0 & r1
            if (r0 == 0) goto L13
            p.r1 r0 = r2.f9984a
            int r3 = r0.a(r3, r4)
            return r3
        L13:
            r3 = 0
            return r3
    }

    @Override // p.r1
    public final int b(u2.c r2) {
            r1 = this;
            int r0 = r1.f9985b
            r0 = r0 & 32
            if (r0 == 0) goto Ld
            p.r1 r0 = r1.f9984a
            int r2 = r0.b(r2)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // p.r1
    public final int c(u2.c r3, u2.m r4) {
            r2 = this;
            u2.m r0 = u2.m.f13354g
            if (r4 != r0) goto L7
            r0 = 8
            goto L8
        L7:
            r0 = 2
        L8:
            int r1 = r2.f9985b
            r0 = r0 & r1
            if (r0 == 0) goto L14
            p.r1 r0 = r2.f9984a
            int r3 = r0.c(r3, r4)
            return r3
        L14:
            r3 = 0
            return r3
    }

    @Override // p.r1
    public final int d(u2.c r2) {
            r1 = this;
            int r0 = r1.f9985b
            r0 = r0 & 16
            if (r0 == 0) goto Ld
            p.r1 r0 = r1.f9984a
            int r2 = r0.d(r2)
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p.s0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p.s0 r5 = (p.s0) r5
            p.r1 r1 = r5.f9984a
            p.r1 r3 = r4.f9984a
            boolean r1 = gg.l.a(r3, r1)
            if (r1 == 0) goto L1d
            int r1 = r4.f9985b
            int r5 = r5.f9985b
            if (r1 != r5) goto L1d
            return r0
        L1d:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            p.r1 r0 = r2.f9984a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f9985b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            p.r1 r1 = r6.f9984a
            r0.append(r1)
            java.lang.String r1 = " only "
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "WindowInsetsSides("
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = p.d.f9879h
            int r4 = r6.f9985b
            r5 = r4 & r3
            if (r5 != r3) goto L2a
            java.lang.String r3 = "Start"
            p.d.r(r2, r3)
        L2a:
            int r3 = p.d.f9881j
            r5 = r4 & r3
            if (r5 != r3) goto L35
            java.lang.String r3 = "Left"
            p.d.r(r2, r3)
        L35:
            r3 = r4 & 16
            r5 = 16
            if (r3 != r5) goto L40
            java.lang.String r3 = "Top"
            p.d.r(r2, r3)
        L40:
            int r3 = p.d.f9880i
            r5 = r4 & r3
            if (r5 != r3) goto L4b
            java.lang.String r3 = "End"
            p.d.r(r2, r3)
        L4b:
            int r3 = p.d.f9882k
            r5 = r4 & r3
            if (r5 != r3) goto L56
            java.lang.String r3 = "Right"
            p.d.r(r2, r3)
        L56:
            r3 = 32
            r4 = r4 & r3
            if (r4 != r3) goto L60
            java.lang.String r3 = "Bottom"
            p.d.r(r2, r3)
        L60:
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
