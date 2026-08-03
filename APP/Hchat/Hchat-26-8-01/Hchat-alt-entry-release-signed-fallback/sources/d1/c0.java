package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1910h;

    public /* synthetic */ c0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f1909g = r2
            r0.f1910h = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r17 = this;
            r1 = r17
            int r0 = r1.f1909g
            switch(r0) {
                case 0: goto L215;
                case 1: goto L1fb;
                case 2: goto L1df;
                case 3: goto L1d3;
                case 4: goto L1c7;
                case 5: goto L1bb;
                case 6: goto L1af;
                case 7: goto L1a4;
                case 8: goto L175;
                case 9: goto L169;
                case 10: goto L151;
                case 11: goto L144;
                case 12: goto L13d;
                case 13: goto L134;
                case 14: goto L118;
                case 15: goto L9d;
                case 16: goto L89;
                case 17: goto L84;
                case 18: goto L77;
                case 19: goto L74;
                case 20: goto L4b;
                case 21: goto L2a;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f1910h
            y2.x r0 = (y2.x) r0
            v1.t r2 = y2.x.m(r0)
            r3 = 0
            if (r2 == 0) goto L19
            boolean r4 = r2.C()
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r2 = r3
        L1a:
            if (r2 == 0) goto L24
            u2.l r0 = r0.m186getPopupContentSizebOM6tXw()
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2a:
            java.lang.Object r0 = r1.f1910h
            y1.x1 r0 = (y1.x1) r0
            xe.e r0 = r0.f22152a
            java.lang.Object r0 = r0.f21559b
            t0.c r0 = (t0.c) r0
            boolean r2 = r0.f12975b
            if (r2 == 0) goto L39
            goto L48
        L39:
            boolean r2 = r0.f12976c
            if (r2 == 0) goto L42
            java.lang.String r2 = "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"
            u0.a.a(r2)
        L42:
            r0.a()
            r2 = 1
            r0.f12976c = r2
        L48:
            sf.n r0 = sf.n.f12433a
            return r0
        L4b:
            java.lang.Object r0 = r1.f1910h
            y1.f1 r0 = (y1.f1) r0
            r2 = 0
            boolean r4 = u2.l.a(r2, r2)
            android.view.View r0 = r0.f21888a
            if (r4 == 0) goto L5e
            y1.j1 r0 = y1.g0.e(r0)
            goto L73
        L5e:
            android.content.Context r0 = r0.getContext()
            u2.e r0 = be.h.a(r0)
            long r4 = r9.e0.q0(r2)
            long r4 = r0.K(r4)
            y1.j1 r0 = new y1.j1
            r0.<init>(r2, r4)
        L73:
            return r0
        L74:
            sf.n r0 = sf.n.f12433a
            return r0
        L77:
            java.lang.Object r0 = r1.f1910h
            y1.k0 r0 = (y1.k0) r0
            qg.t r0 = r0.f21989i
            r2 = 0
            qg.v.c(r0, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L84:
            java.lang.Object r0 = r1.f1910h
            e1.c r0 = (e1.c) r0
            return r0
        L89:
            java.lang.Object r0 = r1.f1910h
            x1.f0 r0 = (x1.f0) r0
            x1.j0 r0 = r0.M
            x1.v0 r2 = r0.f20966p
            r3 = 1
            r2.F = r3
            x1.r0 r0 = r0.f20967q
            if (r0 == 0) goto L9a
            r0.f21039z = r3
        L9a:
            sf.n r0 = sf.n.f12433a
            return r0
        L9d:
            java.lang.Object r0 = r1.f1910h
            v1.j1 r0 = (v1.j1) r0
            v1.j0 r0 = r0.a()
            x1.f0 r2 = r0.f13955g
            java.util.List r3 = r2.o()
            f.d0 r3 = (f.d0) r3
            java.lang.Object r3 = r3.f2789h
            j0.b r3 = (j0.b) r3
            int r3 = r3.f6673i
            int r4 = r0.f13968t
            if (r4 == r3) goto L115
            f.k0 r0 = r0.f13960l
            java.lang.Object[] r3 = r0.f2850c
            long[] r0 = r0.f2848a
            int r4 = r0.length
            int r4 = r4 + (-2)
            r5 = 7
            r6 = 0
            if (r4 < 0) goto Lfe
            r7 = r6
        Lc5:
            r8 = r0[r7]
            long r10 = ~r8
            long r10 = r10 << r5
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto Lf9
            int r10 = r7 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        Lde:
            if (r12 >= r10) goto Lf7
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto Lf3
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            v1.b0 r13 = (v1.b0) r13
            r14 = 1
            r13.f13895d = r14
        Lf3:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto Lde
        Lf7:
            if (r10 != r11) goto Lfe
        Lf9:
            if (r7 == r4) goto Lfe
            int r7 = r7 + 1
            goto Lc5
        Lfe:
            x1.f0 r0 = r2.f20896n
            if (r0 == 0) goto L10c
            x1.j0 r0 = r2.M
            boolean r0 = r0.f20955e
            if (r0 != 0) goto L115
            x1.f0.T(r2, r6, r5)
            goto L115
        L10c:
            boolean r0 = r2.q()
            if (r0 != 0) goto L115
            x1.f0.V(r2, r6, r5)
        L115:
            sf.n r0 = sf.n.f12433a
            return r0
        L118:
            java.lang.Object r0 = r1.f1910h
            v1.b0 r0 = (v1.b0) r0
            i0.j1 r2 = r0.f13898g
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L131
            i0.q r0 = r0.f13894c
            if (r0 == 0) goto L131
            r0.l()
        L131:
            sf.n r0 = sf.n.f12433a
            return r0
        L134:
            java.lang.Object r0 = r1.f1910h
            r1.i r0 = (r1.i) r0
            qg.t r0 = r0.k1()
            return r0
        L13d:
            java.lang.Object r0 = r1.f1910h
            r1.d r0 = (r1.d) r0
            qg.t r0 = r0.f11315d
            return r0
        L144:
            android.view.inputmethod.BaseInputConnection r0 = new android.view.inputmethod.BaseInputConnection
            java.lang.Object r2 = r1.f1910h
            n2.v r2 = (n2.v) r2
            android.view.View r2 = r2.f8986a
            r3 = 0
            r0.<init>(r2, r3)
            return r0
        L151:
            java.lang.Object r0 = r1.f1910h
            b5.c r0 = (b5.c) r0
            java.lang.Object r0 = r0.f469a
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r2)
            r0.getClass()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            return r0
        L169:
            java.lang.Object r0 = r1.f1910h
            m1.j0 r0 = (m1.j0) r0
            i0.j1 r0 = r0.f8619h
            sf.n r2 = sf.n.f12433a
            r0.setValue(r2)
            return r2
        L175:
            java.lang.Object r0 = r1.f1910h
            lh.d r0 = (lh.d) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "("
            r2.<init>(r3)
            java.util.ArrayList r4 = r0.f8065i
            lh.c r8 = lh.c.f8062g
            r9 = 30
            java.lang.String r5 = ""
            r6 = 0
            r7 = 0
            java.lang.String r3 = tf.m.A1(r4, r5, r6, r7, r8, r9)
            r2.append(r3)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r0 = r0.f8066j
            java.lang.String r0 = kh.b.g(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L1a4:
            java.lang.Object r0 = r1.f1910h
            lh.b r0 = (lh.b) r0
            java.lang.String r0 = r0.f8060i
            java.lang.String r0 = kh.b.g(r0)
            return r0
        L1af:
            lh.d r0 = new lh.d
            java.lang.Object r2 = r1.f1910h
            hh.o r2 = (hh.o) r2
            java.lang.String r2 = r2.f5568j
            r0.<init>(r2)
            return r0
        L1bb:
            lh.b r0 = new lh.b
            java.lang.Object r2 = r1.f1910h
            hh.l r2 = (hh.l) r2
            java.lang.String r2 = r2.f5559j
            r0.<init>(r2)
            return r0
        L1c7:
            lh.a r0 = new lh.a
            java.lang.Object r2 = r1.f1910h
            hh.i r2 = (hh.i) r2
            java.lang.String r2 = r2.f5542j
            r0.<init>(r2)
            return r0
        L1d3:
            lh.a r0 = new lh.a
            java.lang.Object r2 = r1.f1910h
            hh.a r2 = (hh.a) r2
            java.lang.String r2 = r2.f5522h
            r0.<init>(r2)
            return r0
        L1df:
            java.lang.Object r0 = r1.f1910h
            i.k1 r0 = (i.k1) r0
            java.lang.Object r2 = r0.c()
            h.f0 r3 = h.f0.f4661i
            if (r2 != r3) goto L1f5
            i0.j1 r0 = r0.f5710d
            java.lang.Object r0 = r0.getValue()
            if (r0 != r3) goto L1f5
            r0 = 1
            goto L1f6
        L1f5:
            r0 = 0
        L1f6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1fb:
            java.lang.Object r0 = r1.f1910h
            g2.b r0 = (g2.b) r0
            r2 = 0
            r0.f4153h = r2
            java.lang.String r2 = "OnPositionedDispatch"
            android.os.Trace.beginSection(r2)
            r0.a()     // Catch: java.lang.Throwable -> L210
            android.os.Trace.endSection()
            sf.n r0 = sf.n.f12433a
            return r0
        L210:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L215:
            java.lang.Object r0 = r1.f1910h
            d1.b0 r0 = (d1.b0) r0
            r0.m1()
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
