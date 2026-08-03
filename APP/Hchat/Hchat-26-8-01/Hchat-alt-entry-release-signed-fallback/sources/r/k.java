package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.z f11174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.h f11175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r.d f11176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ac.k f11177d;

    public k(r.z r1, r.h r2, r.d r3, ac.k r4) {
            r0 = this;
            r0.<init>()
            r0.f11174a = r1
            r0.f11175b = r2
            r0.f11176c = r3
            r0.f11177d = r4
            return
    }

    public final void a(int r9, java.lang.Object r10, i0.h0 r11, int r12) {
            r8 = this;
            r0 = -462424778(0xffffffffe46ff536, float:-1.7705765E22)
            r11.b0(r0)
            boolean r0 = r11.d(r9)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r12
            boolean r1 = r11.h(r10)
            if (r1 == 0) goto L19
            r1 = 32
            goto L1b
        L19:
            r1 = 16
        L1b:
            r0 = r0 | r1
            boolean r1 = r11.f(r8)
            if (r1 == 0) goto L25
            r1 = 256(0x100, float:3.59E-43)
            goto L27
        L25:
            r1 = 128(0x80, float:1.8E-43)
        L27:
            r0 = r0 | r1
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 == r2) goto L30
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            r2 = r0 & 1
            boolean r1 = r11.S(r2, r1)
            if (r1 == 0) goto L5c
            r.z r1 = r8.f11174a
            s.j0 r4 = r1.f11298s
            r.i r1 = new r.i
            r1.<init>(r8, r9)
            r2 = -824725566(0xffffffffced7afc2, float:-1.80931E9)
            s0.d r5 = s0.i.e(r2, r1, r11)
            int r1 = r0 >> 3
            r1 = r1 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r7 = r1 | r0
            r3 = r9
            r2 = r10
            r6 = r11
            s.o.b(r2, r3, r4, r5, r6, r7)
            goto L62
        L5c:
            r3 = r9
            r2 = r10
            r6 = r11
            r6.V()
        L62:
            i0.r1 r9 = r6.t()
            if (r9 == 0) goto L6f
            r.j r10 = new r.j
            r10.<init>(r8, r3, r2, r12)
            r9.f6035d = r10
        L6f:
            return
    }

    public final java.lang.Object b(int r3) {
            r2 = this;
            r.h r0 = r2.f11175b
            r0.getClass()
            ac.k r0 = r0.f11166a
            s.i r0 = r0.l(r3)
            int r1 = r0.f12025a
            int r3 = r3 - r1
            b5.c r0 = r0.f12027c
            java.lang.Object r0 = r0.f470b
            fg.l r0 = (fg.l) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.invoke(r3)
            return r3
    }

    public final int c() {
            r1 = this;
            r.h r0 = r1.f11175b
            r0.getClass()
            ac.k r0 = r0.f11166a
            int r0 = r0.f177h
            return r0
    }

    public final java.lang.Object d(int r4) {
            r3 = this;
            ac.k r0 = r3.f11177d
            java.lang.Object r1 = r0.f179j
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = r0.f177h
            int r0 = r4 - r0
            if (r0 < 0) goto L12
            int r2 = r1.length
            if (r0 >= r2) goto L12
            r0 = r1[r0]
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L3d
            r.h r0 = r3.f11175b
            r0.getClass()
            ac.k r0 = r0.f11166a
            s.i r0 = r0.l(r4)
            int r1 = r0.f12025a
            int r1 = r4 - r1
            b5.c r0 = r0.f12027c
            java.lang.Object r0 = r0.f469a
            fg.l r0 = (fg.l) r0
            if (r0 == 0) goto L38
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            if (r0 != 0) goto L37
            goto L38
        L37:
            return r0
        L38:
            s.g r0 = new s.g
            r0.<init>(r4)
        L3d:
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof r.k
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            r.k r2 = (r.k) r2
            r.h r2 = r2.f11175b
            r.h r0 = r1.f11175b
            boolean r2 = gg.l.a(r0, r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            r.h r0 = r1.f11175b
            int r0 = r0.hashCode()
            return r0
    }
}
