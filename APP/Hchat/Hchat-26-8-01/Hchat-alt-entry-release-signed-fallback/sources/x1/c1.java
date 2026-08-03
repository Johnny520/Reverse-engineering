package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements x1.e1 {
    @Override // x1.e1
    public final int a() {
            r1 = this;
            r0 = 16
            return r0
    }

    @Override // x1.e1
    public final boolean c(x1.f0 r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // x1.e1
    public final boolean d(x1.p r10, x1.f0 r11) {
            r9 = this;
            x1.b1 r11 = r11.L
            x1.i1 r11 = r11.f20842d
            r11.getClass()
            r0 = 16
            boolean r1 = x1.j1.g(r0)
            y0.n r11 = r11.t1(r1)
            r1 = 0
            if (r11 != 0) goto L16
            goto L89
        L16:
            boolean r2 = r11.f21832t
            if (r2 == 0) goto L89
            y0.n r2 = r11.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto L25
            java.lang.String r2 = "visitLocalDescendants called on an unattached node"
            u1.a.b(r2)
        L25:
            y0.n r11 = r11.f21819g
            int r2 = r11.f21822j
            r2 = r2 & r0
            if (r2 == 0) goto L89
        L2c:
            if (r11 == 0) goto L89
            int r2 = r11.f21821i
            r2 = r2 & r0
            if (r2 == 0) goto L86
            r2 = 0
            r3 = r11
            r4 = r2
        L36:
            if (r3 == 0) goto L86
            boolean r5 = r3 instanceof x1.w1
            r6 = 1
            if (r5 == 0) goto L4d
            x1.w1 r3 = (x1.w1) r3
            boolean r3 = r3.J0()
            if (r3 == 0) goto L81
            f.f0 r11 = r10.f21015g
            int r11 = r11.f2804b
            int r11 = r11 - r6
            r10.f21017i = r11
            return r6
        L4d:
            int r5 = r3.f21821i
            r5 = r5 & r0
            if (r5 == 0) goto L81
            boolean r5 = r3 instanceof x1.j
            if (r5 == 0) goto L81
            r5 = r3
            x1.j r5 = (x1.j) r5
            y0.n r5 = r5.f20950v
            r7 = r1
        L5c:
            if (r5 == 0) goto L7e
            int r8 = r5.f21821i
            r8 = r8 & r0
            if (r8 == 0) goto L7b
            int r7 = r7 + 1
            if (r7 != r6) goto L69
            r3 = r5
            goto L7b
        L69:
            if (r4 != 0) goto L72
            j0.b r4 = new j0.b
            y0.n[] r8 = new y0.n[r0]
            r4.<init>(r8)
        L72:
            if (r3 == 0) goto L78
            r4.b(r3)
            r3 = r2
        L78:
            r4.b(r5)
        L7b:
            y0.n r5 = r5.f21824l
            goto L5c
        L7e:
            if (r7 != r6) goto L81
            goto L36
        L81:
            y0.n r3 = x1.k.e(r4)
            goto L36
        L86:
            y0.n r11 = r11.f21824l
            goto L2c
        L89:
            return r1
    }

    @Override // x1.e1
    public final void e(x1.f0 r1, long r2, x1.p r4, int r5, boolean r6) {
            r0 = this;
            r1.z(r2, r4, r5, r6)
            return
    }

    @Override // x1.e1
    public final boolean f(y0.n r8) {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 0
            if (r8 == 0) goto L4a
            boolean r3 = r8 instanceof x1.w1
            if (r3 == 0) goto Lf
            x1.w1 r8 = (x1.w1) r8
            r8.h0()
            goto L45
        Lf:
            int r3 = r8.f21821i
            r4 = 16
            r3 = r3 & r4
            if (r3 == 0) goto L45
            boolean r3 = r8 instanceof x1.j
            if (r3 == 0) goto L45
            r3 = r8
            x1.j r3 = (x1.j) r3
            y0.n r3 = r3.f20950v
        L1f:
            r5 = 1
            if (r3 == 0) goto L42
            int r6 = r3.f21821i
            r6 = r6 & r4
            if (r6 == 0) goto L3f
            int r2 = r2 + 1
            if (r2 != r5) goto L2d
            r8 = r3
            goto L3f
        L2d:
            if (r1 != 0) goto L36
            j0.b r1 = new j0.b
            y0.n[] r5 = new y0.n[r4]
            r1.<init>(r5)
        L36:
            if (r8 == 0) goto L3c
            r1.b(r8)
            r8 = r0
        L3c:
            r1.b(r3)
        L3f:
            y0.n r3 = r3.f21824l
            goto L1f
        L42:
            if (r2 != r5) goto L45
            goto L2
        L45:
            y0.n r8 = x1.k.e(r1)
            goto L2
        L4a:
            return r2
    }
}
