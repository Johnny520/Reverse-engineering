package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.compose.ui.input.pointer.PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f945b;

    public /* synthetic */ g(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f944a = r2
            r0.f945b = r1
            r0.<init>()
            return
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(s1.x r13, wf.c r14) {
            r12 = this;
            int r0 = r12.f944a
            switch(r0) {
                case 0: goto L11b;
                case 1: goto Lf9;
                case 2: goto Le3;
                case 3: goto Lca;
                case 4: goto Laf;
                case 5: goto L98;
                case 6: goto L66;
                case 7: goto L55;
                case 8: goto L2d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r12.f945b
            xb.o r0 = (xb.o) r0
            xb.l r2 = new xb.l
            r1 = 1
            r2.<init>(r0, r1)
            xb.l r5 = new xb.l
            r1 = 2
            r5.<init>(r0, r1)
            v0.a r4 = new v0.a
            r1 = 9
            r4.<init>(r0, r1)
            wb.jj r3 = new wb.jj
            r1 = 3
            r3.<init>(r0, r1)
            xb.j r1 = new xb.j
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r13 = a.a.n(r13, r1, r14)
            return r13
        L2d:
            java.lang.Object r0 = r12.f945b
            xb.i r0 = (xb.i) r0
            wb.f3 r2 = new wb.f3
            r1 = 3
            r2.<init>(r0, r1)
            wb.f3 r5 = new wb.f3
            r1 = 4
            r5.<init>(r0, r1)
            wb.h3 r4 = new wb.h3
            r1 = 2
            r4.<init>(r0, r1)
            wb.zi r3 = new wb.zi
            r1 = 10
            r3.<init>(r0, r1, r13)
            xb.j r1 = new xb.j
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r13 = a.a.n(r13, r1, r14)
            return r13
        L55:
            java.lang.Object r0 = r12.f945b
            fg.a r0 = (fg.a) r0
            h0.g1 r1 = new h0.g1
            r2 = 3
            r1.<init>(r0, r2)
            r0 = 7
            r2 = 0
            java.lang.Object r13 = m.y2.d(r13, r2, r1, r14, r0)
            return r13
        L66:
            java.lang.Object r0 = r12.f945b
            h0.d1 r0 = (h0.d1) r0
            h0.q0 r1 = r0.f4872z
            h0.b1 r0 = r0.f4871y
            ac.k r2 = new ac.k
            r3 = r13
            s1.l0 r3 = (s1.l0) r3
            r3.getClass()
            x1.f0 r3 = x1.k.w(r3)
            y1.l2 r3 = r3.G
            r2.<init>(r3)
            e0.c r3 = new e0.c
            r4 = 0
            r3.<init>(r2, r1, r0, r4)
            java.lang.Object r13 = a.a.n(r13, r3, r14)
            xf.a r14 = xf.a.f21579g
            if (r13 != r14) goto L8e
            goto L90
        L8e:
            sf.n r13 = sf.n.f12433a
        L90:
            xf.a r14 = xf.a.f21579g
            if (r13 != r14) goto L95
            goto L97
        L95:
            sf.n r13 = sf.n.f12433a
        L97:
            return r13
        L98:
            a0.b r0 = new a0.b
            java.lang.Object r1 = r12.f945b
            k.i r1 = (k.i) r1
            r2 = 0
            r3 = 2
            r0.<init>(r1, r2, r3)
            java.lang.Object r13 = a.a.n(r13, r0, r14)
            xf.a r14 = xf.a.f21579g
            if (r13 != r14) goto Lac
            goto Lae
        Lac:
            sf.n r13 = sf.n.f12433a
        Lae:
            return r13
        Laf:
            java.lang.Object r0 = r12.f945b
            w.y0 r0 = (w.y0) r0
            w.u0 r1 = new w.u0
            r2 = 0
            r3 = 0
            r1.<init>(r13, r0, r2, r3)
            java.lang.Object r13 = qg.v.e(r1, r14)
            sf.n r14 = sf.n.f12433a
            xf.a r0 = xf.a.f21579g
            if (r13 != r0) goto Lc5
            goto Lc6
        Lc5:
            r13 = r14
        Lc6:
            if (r13 != r0) goto Lc9
            r14 = r13
        Lc9:
            return r14
        Lca:
            a0.b r0 = new a0.b
            java.lang.Object r1 = r12.f945b
            w.w r1 = (w.w) r1
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            s1.l0 r13 = (s1.l0) r13
            java.lang.Object r13 = r13.k1(r0, r14)
            xf.a r14 = xf.a.f21579g
            if (r13 != r14) goto Le0
            goto Le2
        Le0:
            sf.n r13 = sf.n.f12433a
        Le2:
            return r13
        Le3:
            e0.c r0 = new e0.c
            java.lang.Object r1 = r12.f945b
            e0.d r1 = (e0.d) r1
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Object r13 = a.a.n(r13, r0, r14)
            xf.a r14 = xf.a.f21579g
            if (r13 != r14) goto Lf6
            goto Lf8
        Lf6:
            sf.n r13 = sf.n.f12433a
        Lf8:
            return r13
        Lf9:
            java.lang.Object r0 = r12.f945b
            r3 = r0
            ci.l0 r3 = (ci.l0) r3
            ci.f r4 = new ci.f
            r5 = 0
            r4.<init>(r3, r5)
            ci.e r1 = new ci.e
            r6 = 0
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r13 = qg.v.e(r1, r14)
            sf.n r14 = sf.n.f12433a
            xf.a r0 = xf.a.f21579g
            if (r13 != r0) goto L116
            goto L117
        L116:
            r13 = r14
        L117:
            if (r13 != r0) goto L11a
            r14 = r13
        L11a:
            return r14
        L11b:
            r2 = r13
            c0.f r3 = new c0.f
            java.lang.Object r13 = r12.f945b
            r5 = r13
            c0.j r5 = (c0.j) r5
            r10 = 0
            r11 = 0
            r4 = 1
            java.lang.Class<c0.j> r6 = c0.j.class
            java.lang.String r7 = "tryShowContextMenu"
            java.lang.String r8 = "tryShowContextMenu-k-4lQ0M(J)V"
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            a0.b r13 = new a0.b
            r0 = 0
            r1 = 0
            r13.<init>(r3, r0, r1)
            java.lang.Object r13 = a.a.n(r2, r13, r14)
            sf.n r14 = sf.n.f12433a
            xf.a r0 = xf.a.f21579g
            if (r13 != r0) goto L142
            goto L143
        L142:
            r13 = r14
        L143:
            if (r13 != r0) goto L146
            r14 = r13
        L146:
            return r14
    }
}
