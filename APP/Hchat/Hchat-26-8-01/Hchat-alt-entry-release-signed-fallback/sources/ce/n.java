package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1653g;

    public /* synthetic */ n(int r1) {
            r0 = this;
            r0.f1653g = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f1653g
            switch(r0) {
                case 0: goto L1ab;
                case 1: goto L1a0;
                case 2: goto L197;
                case 3: goto L184;
                case 4: goto L171;
                case 5: goto L168;
                case 6: goto L153;
                case 7: goto L14a;
                case 8: goto L13b;
                case 9: goto L132;
                case 10: goto L12b;
                case 11: goto L120;
                case 12: goto L113;
                case 13: goto Lfd;
                case 14: goto Lf1;
                case 15: goto Lea;
                case 16: goto Ld2;
                case 17: goto L96;
                case 18: goto L7e;
                case 19: goto L6f;
                case 20: goto L63;
                case 21: goto L57;
                case 22: goto L4e;
                case 23: goto L47;
                case 24: goto L42;
                case 25: goto L3d;
                case 26: goto L34;
                case 27: goto L2d;
                case 28: goto L1c;
                default: goto L5;
            }
        L5:
            r7.u r4 = (r7.u) r4
            r7.s r0 = r4.f11590p
            r1 = 1
            if (r0 != 0) goto Ld
            goto L1b
        Ld:
            o7.b r4 = r4.f11587m
            z7.c r4 = r4.f9563k
            int r4 = r4.size()
            if (r4 == 0) goto L19
            r4 = r1
            goto L1a
        L19:
            r4 = 0
        L1a:
            r1 = r1 ^ r4
        L1b:
            return r1
        L1c:
            r7.n r4 = (r7.n) r4
            r7.o r0 = r4.N()
            if (r0 != 0) goto L25
            goto L29
        L25:
            int r4 = r4.f11560n
            if (r4 != 0) goto L2b
        L29:
            r4 = 1
            goto L2c
        L2b:
            r4 = 0
        L2c:
            return r4
        L2d:
            v7.d r4 = (v7.d) r4
            boolean r4 = r4.y()
            return r4
        L34:
            v7.d r4 = (v7.d) r4
            boolean r4 = r4.y()
            r4 = r4 ^ 1
            return r4
        L3d:
            boolean r4 = r4 instanceof r7.t
            r4 = r4 ^ 1
            return r4
        L42:
            qe.s r4 = (qe.s) r4
            boolean r4 = r4.f10986b
            return r4
        L47:
            qe.s r4 = (qe.s) r4
            boolean r4 = r4.f10986b
            r4 = r4 ^ 1
            return r4
        L4e:
            java.lang.Class<qe.f> r0 = qe.f.class
            qe.d r4 = (qe.d) r4
            boolean r4 = r0.isInstance(r4)
            return r4
        L57:
            qe.d r4 = (qe.d) r4
            qd.j r4 = r4.getType()
            r4.getClass()
            boolean r4 = r4 instanceof qd.c
            return r4
        L63:
            ud.p r4 = (ud.p) r4
            pd.k r4 = r4.f13713k
            pd.k r0 = pd.k.X
            if (r4 != r0) goto L6d
            r4 = 1
            goto L6e
        L6d:
            r4 = 0
        L6e:
            return r4
        L6f:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            oc.b r4 = (oc.b) r4
            boolean r4 = r4.r()
            r4 = r4 ^ 1
            return r4
        L7e:
            m7.u r4 = (m7.u) r4
            k7.a r0 = r4.f7389h
            r1 = 1
            if (r0 != 0) goto L86
            goto L95
        L86:
            r7.f r0 = r4.f8735p
            int r0 = r0.f11560n
            r2 = -1
            if (r0 != r2) goto L94
            r7.f r4 = r4.f8734o
            int r4 = r4.f11560n
            if (r4 != r2) goto L94
            goto L95
        L94:
            r1 = 0
        L95:
            return r1
        L96:
            m7.j r4 = (m7.j) r4
            d7.b r0 = r4.R()
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            if (r0 != 0) goto Ld0
            m7.t r0 = r4.V()
            m7.d r0 = r0.f8769w
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            if (r0 != 0) goto Ld0
            k7.c r0 = r4.f8760k
            m7.k r0 = (m7.k) r0
            m7.v r0 = r0.f8751m
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            if (r0 != 0) goto Ld0
            m7.t r4 = r4.V()
            java.lang.String r4 = r4.U()
            boolean r4 = y7.a.f(r4)
            if (r4 == 0) goto Ld0
            r4 = 1
            goto Ld1
        Ld0:
            r4 = 0
        Ld1:
            return r4
        Ld2:
            xd.c r4 = (xd.c) r4
            java.util.List r0 = r4.f21540a
            uf.d r1 = xd.d.f21542m
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Le8
            ud.j r4 = r4.f21541b
            boolean r4 = f8.i.n0(r4)
            if (r4 != 0) goto Le8
            r4 = 1
            goto Le9
        Le8:
            r4 = 0
        Le9:
            return r4
        Lea:
            l7.f r4 = (l7.f) r4
            boolean r4 = r4.isEmpty()
            return r4
        Lf1:
            ud.p r4 = (ud.p) r4
            pd.k r4 = r4.f13713k
            pd.k r0 = pd.k.T
            if (r4 != r0) goto Lfb
            r4 = 1
            goto Lfc
        Lfb:
            r4 = 0
        Lfc:
            return r4
        Lfd:
            xd.c r4 = (xd.c) r4
            java.util.List r4 = r4.f21540a
            int r0 = r4.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L112
            java.lang.Object r4 = r4.get(r1)
            uf.d r0 = xd.d.f21542m
            if (r4 != r0) goto L112
            r1 = r2
        L112:
            return r1
        L113:
            ud.j r4 = (ud.j) r4
            md.a r0 = md.a.f8840u
            md.e r4 = (md.e) r4
            md.f r4 = r4.f8877g
            boolean r4 = r4.a(r0)
            return r4
        L120:
            ud.p r4 = (ud.p) r4
            md.a r0 = md.a.O
            md.f r4 = r4.f8877g
            boolean r4 = r4.a(r0)
            return r4
        L12b:
            ud.j r4 = (ud.j) r4
            boolean r4 = ke.g.t0(r4)
            return r4
        L132:
            k7.a r4 = (k7.a) r4
            boolean r4 = r4.y()
            r4 = r4 ^ 1
            return r4
        L13b:
            l7.m r4 = (l7.m) r4
            s7.b r4 = r4.f7890o
            r0 = 1
            java.util.Iterator r4 = r4.n0(r0)
            boolean r4 = r4.hasNext()
            r4 = r4 ^ r0
            return r4
        L14a:
            java.util.List r4 = (java.util.List) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ 1
            return r4
        L153:
            ud.r r4 = (ud.r) r4
            ud.e r4 = r4.f13718l
            ud.e r4 = r4.a0()
            int r4 = r4.f13702y
            r0 = 4
            if (r4 == r0) goto L166
            r0 = 5
            if (r4 != r0) goto L164
            goto L166
        L164:
            r4 = 0
            goto L167
        L166:
            r4 = 1
        L167:
            return r4
        L168:
            ud.a r4 = (ud.a) r4
            pd.k r0 = pd.k.f10509r
            boolean r4 = a.a.v(r4, r0)
            return r4
        L171:
            ae.h r4 = (ae.h) r4
            boolean r0 = r4.f248l
            if (r0 != 0) goto L182
            java.util.List r4 = r4.f244h
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L180
            goto L182
        L180:
            r4 = 0
            goto L183
        L182:
            r4 = 1
        L183:
            return r4
        L184:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 3
            if (r4 <= r0) goto L195
            r4 = 1
            goto L196
        L195:
            r4 = 0
        L196:
            return r4
        L197:
            ud.a r4 = (ud.a) r4
            pd.k r0 = pd.k.Z
            boolean r4 = a.a.v(r4, r0)
            return r4
        L1a0:
            nd.h0 r4 = (nd.h0) r4
            int r4 = r4.f9372g
            r0 = 2
            if (r4 != r0) goto L1a9
            r4 = 1
            goto L1aa
        L1a9:
            r4 = 0
        L1aa:
            return r4
        L1ab:
            nd.h0 r4 = (nd.h0) r4
            int r0 = r4.f9372g
            r1 = 1
            if (r0 != r1) goto L1c2
            ud.a r0 = r4.f9374i
            ud.a r4 = r4.f9373h
            if (r0 == r4) goto L1c2
            java.util.BitSet r4 = r4.f13678p
            int r0 = r0.f13672j
            boolean r4 = r4.get(r0)
            if (r4 == 0) goto L1c3
        L1c2:
            r1 = 0
        L1c3:
            return r1
    }
}
