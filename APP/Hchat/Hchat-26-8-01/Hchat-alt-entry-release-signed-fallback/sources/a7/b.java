package a7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f60g;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f60g = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f60g
            switch(r0) {
                case 0: goto L1b0;
                case 1: goto L1a3;
                case 2: goto L17b;
                case 3: goto L172;
                case 4: goto L168;
                case 5: goto L15d;
                case 6: goto L150;
                case 7: goto L142;
                case 8: goto L139;
                case 9: goto L12e;
                case 10: goto L11c;
                case 11: goto L115;
                case 12: goto L10e;
                case 13: goto L103;
                case 14: goto Lf8;
                case 15: goto Led;
                case 16: goto Le6;
                case 17: goto Ld9;
                case 18: goto Lcf;
                case 19: goto Lc8;
                case 20: goto Lb6;
                case 21: goto Lac;
                case 22: goto La5;
                case 23: goto L85;
                case 24: goto L6e;
                case 25: goto L63;
                case 26: goto L58;
                case 27: goto L51;
                case 28: goto L1f;
                default: goto L5;
            }
        L5:
            ud.p r5 = (ud.p) r5
            md.f r0 = r5.f8877g
            boolean r0 = r0.f()
            if (r0 != 0) goto L10
            goto L1b
        L10:
            pd.k r5 = r5.f13713k
            pd.k r0 = pd.k.f10508q
            if (r5 == r0) goto L1d
            pd.k r0 = pd.k.Q
            if (r5 != r0) goto L1b
            goto L1d
        L1b:
            r5 = 0
            goto L1e
        L1d:
            r5 = 1
        L1e:
            return r5
        L1f:
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r0 = r5.f13674l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4f
            java.util.List r0 = r5.f13675m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4f
            java.util.List r0 = r5.f13676n
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4f
            md.a r0 = md.a.f8819g
            md.f r1 = r5.f8877g
            boolean r0 = r1.a(r0)
            if (r0 != 0) goto L4f
            md.a r0 = md.a.f8821h
            md.f r5 = r5.f8877g
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = 0
        L50:
            return r5
        L51:
            ud.a r5 = (ud.a) r5
            boolean r5 = ce.m.q(r5)
            return r5
        L58:
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r5 = r5.f13674l
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            return r5
        L63:
            ud.a r5 = (ud.a) r5
            md.a r0 = md.a.f8840u
            md.f r5 = r5.f8877g
            boolean r5 = r5.a(r0)
            return r5
        L6e:
            ae.h r5 = (ae.h) r5
            java.util.List r0 = r5.f245i
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L83
            java.util.List r5 = r5.f244h
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L81
            goto L83
        L81:
            r5 = 0
            goto L84
        L83:
            r5 = 1
        L84:
            return r5
        L85:
            c7.b r5 = (c7.b) r5
            long r0 = r5.b()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto La2
            d7.m r5 = r5.f1034a
            java.lang.String r5 = r5.a0()
            java.lang.String r0 = "/"
            boolean r5 = r5.endsWith(r0)
            if (r5 == 0) goto La2
            r5 = r1
            goto La3
        La2:
            r5 = 0
        La3:
            r5 = r5 ^ r1
            return r5
        La5:
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = bsh.classpath.BshClassPath.isClassFileName(r5)
            return r5
        Lac:
            java.nio.file.Path r5 = (java.nio.file.Path) r5
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r5 = java.nio.file.Files.isRegularFile(r5, r0)
            return r5
        Lb6:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            r0 = 1
            if (r5 != r0) goto Lc6
            goto Lc7
        Lc6:
            r0 = 0
        Lc7:
            return r0
        Lc8:
            ud.r r5 = (ud.r) r5
            boolean r5 = r5.W()
            return r5
        Lcf:
            nd.b0 r5 = (nd.b0) r5
            int r5 = r5.f9389i
            if (r5 == 0) goto Ld7
            r5 = 1
            goto Ld8
        Ld7:
            r5 = 0
        Ld8:
            return r5
        Ld9:
            nd.b0 r5 = (nd.b0) r5
            md.a r0 = md.a.f8838s
            md.f r5 = r5.f8877g
            boolean r5 = r5.a(r0)
            r5 = r5 ^ 1
            return r5
        Le6:
            ud.m r5 = (ud.m) r5
            boolean r5 = r5 instanceof ud.r
            r5 = r5 ^ 1
            return r5
        Led:
            qd.r r5 = (qd.r) r5
            ud.p r5 = r5.f10903j
            pd.k r0 = pd.k.f10513v
            boolean r5 = xe.m.j(r5, r0)
            return r5
        Lf8:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "java.lang.Throwable"
            boolean r5 = r5.equals(r0)
            r5 = r5 ^ 1
            return r5
        L103:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "java.lang.Exception"
            boolean r5 = r5.equals(r0)
            r5 = r5 ^ 1
            return r5
        L10e:
            qd.j r5 = (qd.j) r5
            boolean r5 = r5.w()
            return r5
        L115:
            qd.j r5 = (qd.j) r5
            boolean r5 = java.util.Objects.nonNull(r5)
            return r5
        L11c:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0 = 1
            if (r5 <= r0) goto L12c
            goto L12d
        L12c:
            r0 = 0
        L12d:
            return r0
        L12e:
            ud.g r5 = (ud.g) r5
            b5.k r5 = r5.f13708m
            boolean r5 = r5.h()
            r5 = r5 ^ 1
            return r5
        L139:
            ud.g r5 = (ud.g) r5
            b5.k r5 = r5.f13708m
            boolean r5 = r5.h()
            return r5
        L142:
            ud.p r5 = (ud.p) r5
            java.util.List r5 = r5.f13715m
            int r5 = r5.size()
            r0 = 1
            if (r5 != r0) goto L14e
            goto L14f
        L14e:
            r0 = 0
        L14f:
            return r0
        L150:
            ud.g r5 = (ud.g) r5
            od.c r5 = r5.f13707l
            java.lang.String r5 = r5.f9774h
            java.lang.String r0 = "$VALUES"
            boolean r5 = r5.equals(r0)
            return r5
        L15d:
            ud.g r5 = (ud.g) r5
            b5.k r5 = r5.f13708m
            boolean r5 = r5.i()
            r5 = r5 ^ 1
            return r5
        L168:
            ud.g r5 = (ud.g) r5
            qd.j r5 = r5.f13709n
            r5.getClass()
            boolean r5 = r5 instanceof qd.a
            return r5
        L172:
            ud.g r5 = (ud.g) r5
            b5.k r5 = r5.f13708m
            boolean r5 = r5.h()
            return r5
        L17b:
            qd.r r5 = (qd.r) r5
            ud.p r0 = r5.f10903j
            if (r0 == 0) goto L1a1
            pd.k r1 = r0.f13713k
            pd.k r2 = pd.k.X
            if (r1 != r2) goto L188
            goto L1a1
        L188:
            qd.s r5 = r5.f10923m
            qd.k r5 = r5.b()
            java.util.List r5 = r5.f10896c
            int r5 = r5.size()
            r1 = 1
            if (r5 <= r1) goto L198
            goto L1a1
        L198:
            md.a r5 = md.a.f8838s
            md.f r0 = r0.f8877g
            boolean r5 = r0.a(r5)
            goto L1a2
        L1a1:
            r5 = 0
        L1a2:
            return r5
        L1a3:
            qd.s r5 = (qd.s) r5
            qd.r r5 = r5.f10927i
            md.a r0 = md.a.M
            md.f r5 = r5.f8877g
            boolean r5 = r5.a(r0)
            return r5
        L1b0:
            v7.d r5 = (v7.d) r5
            v7.g0 r0 = r5.f14150k
            boolean r0 = r0 instanceof v7.b0
            r1 = 0
            if (r0 == 0) goto L1e8
            java.lang.Class<l7.m> r0 = l7.m.class
            k7.a r5 = r5.u(r0)
            l7.m r5 = (l7.m) r5
            if (r5 == 0) goto L1c8
            java.lang.String r5 = r5.V()
            goto L1c9
        L1c8:
            r5 = 0
        L1c9:
            r0 = 1
            if (r5 != 0) goto L1ce
            r5 = r1
            goto L1e4
        L1ce:
            java.lang.String r2 = "string"
            boolean r3 = r2.equals(r5)
            if (r3 == 0) goto L1d8
            r5 = r0
            goto L1e4
        L1d8:
            java.lang.String r2 = l7.m.W(r2)
            java.lang.String r5 = l7.m.W(r5)
            boolean r5 = r2.equals(r5)
        L1e4:
            if (r5 == 0) goto L1e7
            goto L1e8
        L1e7:
            r1 = r0
        L1e8:
            return r1
    }
}
