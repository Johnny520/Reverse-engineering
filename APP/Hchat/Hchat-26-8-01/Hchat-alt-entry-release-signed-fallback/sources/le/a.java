package le;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.r f8012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.y f8013b;

    static {
            java.lang.Class<le.a> r0 = le.a.class
            mh.d.b(r0)
            return
    }

    public a(ud.r r1, i4.y r2) {
            r0 = this;
            r0.<init>()
            r0.f8012a = r1
            r0.f8013b = r2
            return
    }

    public static void a(hb.r r5) {
            java.lang.Object r0 = r5.f5457d
            ze.c r0 = (ze.c) r0
            java.lang.Object r1 = r5.f5460g
            java.util.Set r1 = (java.util.Set) r1
            java.util.BitSet r0 = r0.f22680h
            int r0 = r0.cardinality()
            r2 = 1
            md.a r3 = md.a.f8845z
            if (r0 <= r2) goto L34
            java.lang.Object r0 = r5.f5457d
            ze.c r0 = (ze.c) r0
            java.util.Iterator r0 = r0.iterator()
        L1b:
            r2 = r0
            ze.b r2 = (ze.b) r2
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r2 = r2.next()
            ud.a r2 = (ud.a) r2
            ud.a r4 = r5.j()
            if (r2 == r4) goto L1b
            r2.w(r3)
            goto L1b
        L34:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L51
            java.util.Iterator r0 = r1.iterator()
        L3e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            ud.a r2 = (ud.a) r2
            r2.w(r3)
            goto L3e
        L4e:
            r1.clear()
        L51:
            java.lang.Object r5 = r5.f5461h
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r5.next()
            ud.p r0 = (ud.p) r0
            md.a r1 = md.a.O
            r0.w(r1)
            goto L59
        L6b:
            return
    }

    public static ud.a b(ud.r r4, ud.a r5) {
            if (r5 != 0) goto L3
            goto L3b
        L3:
            java.util.BitSet r0 = r5.f13680r
            java.util.List r0 = a.a.q(r4, r0)
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            md.b r2 = md.b.E
            md.f r1 = r1.f8877g
            oc.b r1 = r1.c(r2)
            ae.c r1 = (ae.c) r1
            if (r1 != 0) goto L26
            goto Ld
        L26:
            ae.f r1 = r1.f229g
            ae.h r2 = r1.f238g
            ud.a r2 = r2.f249m
            java.util.BitSet r3 = r5.f13678p
            int r2 = r2.f13672j
            boolean r2 = r3.get(r2)
            if (r2 == 0) goto Ld
            ud.a r4 = a.a.k0(r1, r4)
            return r4
        L3b:
            r4 = 0
            return r4
    }

    public static ud.a c(ud.a r3, ud.a r4, java.util.Set r5, ud.r r6) {
            if (r3 != r4) goto L3
            return r4
        L3:
            boolean r0 = a.a.p0(r3, r4)
            if (r0 == 0) goto Ld
            r5.add(r3)
            return r4
        Ld:
            boolean r0 = a.a.n0(r3, r4)
            if (r0 == 0) goto L1c
            md.a r6 = md.a.f8840u
            r3.w(r6)
            r5.add(r3)
            return r4
        L1c:
            ud.a r0 = a.a.h0(r6, r3, r4)
            if (r0 == 0) goto L3d
            java.util.Objects.requireNonNull(r5)
            ae.g r1 = new ae.g
            r2 = 10
            r1.<init>(r5, r2)
            a.a.c1(r6, r3, r0, r1)
            ae.g r3 = new ae.g
            r1 = 10
            r3.<init>(r5, r1)
            a.a.c1(r6, r4, r0, r3)
            r5.remove(r0)
            return r0
        L3d:
            ud.a r6 = a.a.K(r3)
            ud.a r0 = a.a.K(r4)
            boolean r1 = r6.equals(r0)
            if (r1 != 0) goto L59
            boolean r6 = a.a.p0(r6, r0)
            if (r6 == 0) goto L52
            goto L59
        L52:
            java.lang.String r3 = "Unexpected merge pattern"
            ah.a.k(r3)
            r3 = 0
            return r3
        L59:
            r5.add(r3)
            r5.add(r4)
        L5f:
            ud.a r3 = a.a.e0(r3)
            if (r3 != 0) goto L70
        L65:
            ud.a r4 = a.a.e0(r4)
            if (r4 != 0) goto L6c
            return r0
        L6c:
            r5.add(r4)
            goto L65
        L70:
            r5.add(r3)
            goto L5f
    }

    public static hb.r d(hb.r r3, ud.a r4) {
            java.util.List r0 = r4.f13675m
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto La
            goto L2b
        La:
            java.lang.Object r0 = r3.f5457d
            ze.c r0 = (ze.c) r0
            java.util.List r1 = r4.f13675m
            r0.getClass()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            boolean r2 = r0.b(r2)
            if (r2 != 0) goto L17
            r3 = 0
            return r3
        L2b:
            hb.r r3 = e(r3, r4)
            return r3
    }

    public static hb.r e(hb.r r11, ud.a r12) {
            java.lang.Object r0 = r11.f5455b
            ud.r r0 = (ud.r) r0
            if (r12 == 0) goto Lb5
            md.b r1 = md.b.f8871z
            md.f r2 = r12.f8877g
            boolean r1 = r2.b(r1)
            if (r1 != 0) goto Lb5
            md.f r1 = r12.f8877g
            md.a r2 = md.a.f8845z
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L1c
            goto Lb5
        L1c:
            ud.p r1 = a.a.c0(r12)
            if (r1 == 0) goto L2d
            pd.k r1 = r1.f13713k
            pd.k r3 = pd.k.f10513v
            if (r1 != r3) goto L2d
            hb.r r11 = g(r0, r12)
            return r11
        L2d:
            java.util.List r1 = r12.f13676n
            int r3 = r1.size()
            r4 = 1
            if (r3 == r4) goto L38
            goto Lb5
        L38:
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            ud.a r1 = (ud.a) r1
            java.util.List r5 = r1.f13675m
            int r5 = r5.size()
            if (r5 != r4) goto Lb5
            md.f r5 = r1.f8877g
            boolean r2 = r5.a(r2)
            if (r2 == 0) goto L51
            goto Lb5
        L51:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r5 = r12.f13674l
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L5f
            goto L9f
        L5f:
            java.util.Iterator r5 = r5.iterator()
            r6 = r4
        L64:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L9e
            java.lang.Object r7 = r5.next()
            ud.p r7 = (ud.p) r7
            qd.r r8 = r7.f13714l
            if (r8 != 0) goto L76
        L74:
            r4 = r3
            goto L9f
        L76:
            qd.s r8 = r8.f10923m
            java.util.ArrayList r8 = r8.f10928j
            int r9 = r8.size()
            if (r9 != 0) goto L81
            goto L74
        L81:
            java.lang.Object r8 = r8.get(r3)
            qd.l r8 = (qd.l) r8
            ud.p r8 = r8.f10903j
            boolean r10 = a.a.s(r12, r8)
            if (r10 != 0) goto L96
            boolean r8 = a.a.s(r1, r8)
            if (r8 != 0) goto L96
            goto L74
        L96:
            if (r9 <= r4) goto L9c
            r2.add(r7)
            goto L64
        L9c:
            r6 = r3
            goto L64
        L9e:
            r4 = r6
        L9f:
            if (r4 != 0) goto La2
            goto Lb5
        La2:
            hb.r r12 = g(r0, r1)
            if (r12 != 0) goto Lad
            hb.r r11 = e(r11, r1)
            return r11
        Lad:
            java.lang.Object r11 = r12.f5461h
            java.util.List r11 = (java.util.List) r11
            r11.addAll(r2)
            return r12
        Lb5:
            r11 = 0
            return r11
    }

    public static boolean f(hb.r r8, ud.a r9) {
            md.a r0 = md.a.f8827k
            md.f r1 = r9.f8877g
            boolean r0 = r1.a(r0)
            md.a r1 = md.a.f8829l
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L57
            java.util.List r0 = r9.f13675m
            int r0 = r0.size()
            if (r0 != r3) goto L57
            java.util.List r0 = r9.f13675m
            java.lang.Object r0 = r0.get(r2)
            ud.a r0 = (ud.a) r0
            md.f r4 = r0.f8877g
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto L57
            md.f r4 = r9.f8877g
            md.b r5 = md.b.f8871z
            java.util.List r4 = r4.d(r5)
            md.f r0 = r0.f8877g
            java.util.List r0 = r0.d(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L57
            java.lang.Object r5 = r4.next()
            nd.t r5 = (nd.t) r5
            java.util.Iterator r6 = r0.iterator()
        L48:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L38
            java.lang.Object r7 = r6.next()
            nd.t r7 = (nd.t) r7
            if (r5 != r7) goto L48
            goto L5f
        L57:
            java.lang.Object r0 = r8.f5462i
            ud.a r0 = (ud.a) r0
            if (r0 == 0) goto L61
            if (r9 != r0) goto L60
        L5f:
            return r3
        L60:
            return r2
        L61:
            java.util.List r9 = r9.f13675m
            java.lang.Object r8 = r8.f5457d
            ze.c r8 = (ze.c) r8
            java.util.Iterator r9 = r9.iterator()
        L6b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r9.next()
            ud.a r0 = (ud.a) r0
            md.f r4 = r0.f8877g
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto L80
            goto L6b
        L80:
            ud.a r0 = a.a.O0(r0)
            boolean r0 = r8.b(r0)
            if (r0 != 0) goto L6b
            goto L8c
        L8b:
            r2 = r3
        L8c:
            r8 = r2 ^ 1
            return r8
    }

    public static hb.r g(ud.r r4, ud.a r5) {
            ud.p r0 = a.a.c0(r5)
            if (r0 == 0) goto L2a
            pd.k r1 = r0.f13713k
            pd.k r2 = pd.k.f10513v
            if (r1 == r2) goto Ld
            goto L2a
        Ld:
            pd.i r0 = (pd.i) r0
            yd.b r1 = new yd.b
            xe.e r2 = new xe.e
            r2.<init>(r0)
            r1.<init>(r2)
            hb.r r2 = new hb.r
            ud.a r3 = r0.f10493q
            ud.a r0 = r0.f10494r
            r2.<init>(r4, r1, r3, r0)
            java.lang.Object r4 = r2.f5457d
            ze.c r4 = (ze.c) r4
            r4.a(r5)
            return r2
        L2a:
            r4 = 0
            return r4
    }

    public static hb.r h(hb.r r11) {
            java.lang.Object r0 = r11.f5458e
            ud.a r0 = (ud.a) r0
            java.lang.Object r1 = r11.f5458e
            ud.a r1 = (ud.a) r1
            java.lang.Object r2 = r11.f5459f
            ud.a r2 = (ud.a) r2
            if (r0 != r2) goto L10
            goto L1b8
        L10:
            boolean r3 = a.a.r0(r0)
            if (r3 != 0) goto L1b8
            boolean r3 = a.a.r0(r2)
            if (r3 == 0) goto L1e
            goto L1b8
        L1e:
            hb.r r3 = d(r11, r0)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L28
            r6 = r5
            goto L2f
        L28:
            hb.r r3 = d(r11, r2)
            if (r3 == 0) goto L1b8
            r6 = r4
        L2f:
            java.lang.Object r7 = r3.f5461h
            java.util.List r7 = (java.util.List) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L5c
            java.lang.Object r8 = r11.f5457d
            ze.c r8 = (ze.c) r8
            java.util.Iterator r8 = r8.iterator()
        L41:
            r9 = r8
            ze.b r9 = (ze.b) r9
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L5c
            java.lang.Object r9 = r9.next()
            ud.a r9 = (ud.a) r9
            md.a r10 = md.a.f8827k
            md.f r9 = r9.f8877g
            boolean r9 = r9.a(r10)
            if (r9 == 0) goto L41
            goto L149
        L5c:
            java.lang.Object r8 = r3.f5458e
            ud.a r8 = (ud.a) r8
            boolean r8 = a.a.o0(r2, r8)
            if (r8 != 0) goto L70
            java.lang.Object r8 = r3.f5459f
            ud.a r8 = (ud.a) r8
            boolean r8 = a.a.o0(r1, r8)
            if (r8 == 0) goto L74
        L70:
            hb.r r3 = hb.r.l(r3)
        L74:
            java.lang.Object r8 = r3.f5458e
            ud.a r8 = (ud.a) r8
            boolean r8 = a.a.o0(r0, r8)
            java.lang.Object r9 = r3.f5459f
            ud.a r9 = (ud.a) r9
            boolean r9 = a.a.o0(r2, r9)
            if (r8 != 0) goto L14a
            if (r9 != 0) goto L14a
            java.util.List r4 = r0.f13677o
            int r4 = r4.size()
            if (r4 != r5) goto L9a
            java.util.List r4 = r0.f13677o
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L9a
            goto L1b8
        L9a:
            java.util.List r4 = r2.f13677o
            int r4 = r4.size()
            if (r4 != r5) goto Lac
            java.util.List r4 = r2.f13677o
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto Lac
            goto L1b8
        Lac:
            if (r6 == 0) goto Lb0
            r4 = r2
            goto Lb1
        Lb0:
            r4 = r0
        Lb1:
            ud.a r4 = a.a.K(r4)
            ud.a r5 = r3.j()
            boolean r4 = a.a.s0(r5, r4)
            if (r4 != 0) goto L115
            hb.r r0 = d(r11, r0)
            hb.r r1 = d(r11, r2)
            if (r0 == 0) goto L1b8
            if (r1 != 0) goto Lcd
            goto L1b8
        Lcd:
            ud.a r2 = r0.j()
            java.util.BitSet r2 = r2.f13680r
            ud.a r3 = r1.j()
            java.util.BitSet r3 = r3.f13680r
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Le1
            goto L1b8
        Le1:
            hb.r r2 = h(r0)
            if (r2 == 0) goto Le8
            r0 = r2
        Le8:
            java.lang.Object r2 = r0.f5459f
            ud.a r2 = (ud.a) r2
            hb.r r3 = h(r1)
            if (r3 == 0) goto Lf3
            r1 = r3
        Lf3:
            java.lang.Object r3 = r1.f5459f
            ud.a r3 = (ud.a) r3
            java.lang.Object r4 = r0.f5458e
            ud.a r4 = (ud.a) r4
            java.lang.Object r5 = r1.f5458e
            ud.a r5 = (ud.a) r5
            if (r4 != r5) goto L108
            if (r2 != r3) goto L108
            hb.r r11 = i(r11, r0, r1)
            return r11
        L108:
            if (r4 != r3) goto L1b8
            if (r2 != r5) goto L1b8
            hb.r r1 = hb.r.l(r1)
            hb.r r11 = i(r11, r0, r1)
            return r11
        L115:
            hb.r r3 = h(r3)
            if (r3 == 0) goto L149
            java.lang.Object r4 = r3.f5458e
            ud.a r4 = (ud.a) r4
            boolean r4 = a.a.o0(r2, r4)
            if (r4 != 0) goto L12f
            java.lang.Object r4 = r3.f5459f
            ud.a r4 = (ud.a) r4
            boolean r1 = a.a.o0(r1, r4)
            if (r1 == 0) goto L134
        L12f:
            hb.r r1 = hb.r.l(r3)
            r3 = r1
        L134:
            if (r6 == 0) goto L13f
            java.lang.Object r1 = r3.f5459f
            ud.a r1 = (ud.a) r1
            boolean r1 = a.a.o0(r2, r1)
            goto L147
        L13f:
            java.lang.Object r1 = r3.f5458e
            ud.a r1 = (ud.a) r1
            boolean r1 = a.a.o0(r0, r1)
        L147:
            if (r1 != 0) goto L15f
        L149:
            return r11
        L14a:
            if (r7 != 0) goto L15f
            if (r8 == 0) goto L150
            if (r6 == 0) goto L154
        L150:
            if (r9 == 0) goto L155
            if (r6 == 0) goto L155
        L154:
            r4 = r5
        L155:
            if (r4 != 0) goto L15f
            java.lang.Object r0 = r11.f5461h
            java.util.List r0 = (java.util.List) r0
            r0.clear()
            return r11
        L15f:
            java.lang.Object r1 = r3.f5459f
            ud.a r1 = (ud.a) r1
            java.lang.Object r4 = r3.f5458e
            ud.a r4 = (ud.a) r4
            java.lang.Object r5 = r11.f5455b
            ud.r r5 = (ud.r) r5
            java.lang.Object r7 = r11.f5460g
            java.util.Set r7 = (java.util.Set) r7
            if (r6 == 0) goto L176
            ud.a r1 = c(r2, r1, r7, r5)
            goto L17a
        L176:
            ud.a r4 = c(r0, r4, r7, r5)
        L17a:
            if (r6 == 0) goto L17e
            r0 = 4
            goto L17f
        L17e:
            r0 = 5
        L17f:
            java.lang.Object r2 = r11.f5456c
            yd.b r2 = (yd.b) r2
            java.lang.Object r6 = r3.f5456c
            yd.b r6 = (yd.b) r6
            int r7 = r2.f22419i
            if (r7 != r0) goto L196
            yd.b r0 = new yd.b
            r0.<init>(r2)
            java.util.List r2 = r0.f22420j
            r2.add(r6)
            goto L1a4
        L196:
            yd.b r7 = new yd.b
            yd.b[] r2 = new yd.b[]{r2, r6}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r7.<init>(r0, r2)
            r0 = r7
        L1a4:
            hb.r r2 = new hb.r
            r2.<init>(r5, r0, r4, r1)
            hb.r[] r11 = new hb.r[]{r11, r3}
            r2.m(r11)
            hb.r r11 = h(r2)
            if (r11 == 0) goto L1b7
            return r11
        L1b7:
            return r2
        L1b8:
            r11 = 0
            return r11
    }

    public static hb.r i(hb.r r5, hb.r r6, hb.r r7) {
            java.lang.Object r0 = r5.f5456c
            yd.b r0 = (yd.b) r0
            java.lang.Object r1 = r6.f5456c
            yd.b r1 = (yd.b) r1
            java.lang.Object r2 = r7.f5456c
            yd.b r2 = (yd.b) r2
            yd.b r3 = new yd.b
            yd.b[] r0 = new yd.b[]{r0, r1, r2}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1 = 2
            r3.<init>(r1, r0)
            hb.r r0 = new hb.r
            java.lang.Object r1 = r5.f5455b
            ud.r r1 = (ud.r) r1
            java.lang.Object r2 = r6.f5458e
            ud.a r2 = (ud.a) r2
            java.lang.Object r4 = r6.f5459f
            ud.a r4 = (ud.a) r4
            r0.<init>(r1, r3, r2, r4)
            hb.r[] r5 = new hb.r[]{r5, r6, r7}
            r0.m(r5)
            a(r0)
            return r0
    }

    public static hb.r j(ud.r r5, ud.a r6, hb.r r7) {
            java.lang.Object r0 = r7.f5458e
            ud.a r0 = (ud.a) r0
            java.lang.Object r1 = r7.f5459f
            ud.a r1 = (ud.a) r1
            boolean r2 = java.util.Objects.equals(r0, r1)
            r3 = 0
            if (r2 == 0) goto L17
            hb.r r5 = new hb.r
            r5.<init>(r7, r3)
            r5.f5462i = r0
            return r5
        L17:
            md.f r2 = r0.f8877g
            md.a r4 = md.a.f8833n
            boolean r2 = r2.a(r4)
            if (r2 == 0) goto L2c
            md.f r2 = r1.f8877g
            boolean r2 = r2.a(r4)
            if (r2 == 0) goto L2c
            r7.f5462i = r3
            return r7
        L2c:
            ud.a r2 = a.a.h0(r5, r0, r1)
            r7.f5462i = r2
            boolean r2 = f(r7, r0)
            boolean r4 = f(r7, r1)
            if (r2 == 0) goto L3f
            if (r4 == 0) goto L3f
            return r3
        L3f:
            if (r4 == 0) goto L4a
            hb.r r2 = new hb.r
            r2.<init>(r7, r0)
            r2.f5462i = r1
        L48:
            r7 = r2
            goto L58
        L4a:
            if (r2 == 0) goto L58
            hb.r r7 = hb.r.l(r7)
            hb.r r2 = new hb.r
            r2.<init>(r7, r1)
            r2.f5462i = r0
            goto L48
        L58:
            java.lang.Object r0 = r7.f5462i
            ud.a r0 = (ud.a) r0
            if (r0 != 0) goto L82
            java.lang.Object r0 = r7.f5458e
            ud.a r0 = (ud.a) r0
            ud.a r0 = b(r5, r0)
            java.lang.Object r1 = r7.f5459f
            ud.a r1 = (ud.a) r1
            ud.a r5 = b(r5, r1)
            if (r0 != 0) goto L75
            if (r5 == 0) goto L75
            r7.f5462i = r5
            goto L82
        L75:
            if (r0 == 0) goto L7c
            if (r5 != 0) goto L7c
            r7.f5462i = r0
            goto L82
        L7c:
            if (r0 == 0) goto L82
            if (r0 != r5) goto L82
            r7.f5462i = r0
        L82:
            java.lang.Object r5 = r7.f5462i
            ud.a r5 = (ud.a) r5
            if (r5 != 0) goto L89
            goto L91
        L89:
            java.util.List r0 = r6.f13677o
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L93
        L91:
            r5 = 0
            goto L99
        L93:
            java.util.List r6 = r6.f13676n
            boolean r5 = r6.contains(r5)
        L99:
            if (r5 == 0) goto L9d
            r7.f5462i = r3
        L9d:
            return r7
    }
}
