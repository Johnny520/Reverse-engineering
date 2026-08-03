package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class kn implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f17328h;

    public /* synthetic */ kn(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f17327g = r2
            r0.f17328h = r1
            r0.<init>()
            return
    }

    public kn(java.util.List r3) {
            r2 = this;
            r0 = 11
            r2.f17327g = r0
            r2.<init>()
            java.util.stream.Stream r3 = r3.stream()
            xe.n r0 = new xe.n
            r1 = 0
            r0.<init>(r1)
            java.util.stream.Stream r3 = r3.map(r0)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toSet()
            java.lang.Object r3 = r3.collect(r0)
            java.util.Set r3 = (java.util.Set) r3
            r2.f17328h = r3
            return
    }

    public boolean a(java.util.List r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r2.f17328h
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f17327g
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Object r5 = r6.f17328h
            switch(r0) {
                case 0: goto L204;
                case 1: goto L1e1;
                case 2: goto L1c3;
                case 3: goto L1a0;
                case 4: goto L17d;
                case 5: goto L15f;
                case 6: goto L141;
                case 7: goto L11e;
                case 8: goto Lf7;
                case 9: goto Lca;
                case 10: goto Lb0;
                case 11: goto L83;
                case 12: goto L45;
                default: goto Ld;
            }
        Ld:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.m r5 = (r4.m) r5
            int r1 = r5.compare(r7, r8)
            if (r1 == 0) goto L1a
            goto L44
        L1a:
            ya.e r7 = (ya.e) r7
            int r7 = r7.f22380c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto L26
            r7 = r3
            goto L27
        L26:
            r7 = r2
        L27:
            if (r7 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r4
        L2b:
            if (r1 == 0) goto L2e
            goto L2f
        L2e:
            r1 = r0
        L2f:
            ya.e r8 = (ya.e) r8
            int r7 = r8.f22380c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto L3a
            r2 = r3
        L3a:
            if (r2 == 0) goto L3d
            r4 = r8
        L3d:
            if (r4 == 0) goto L40
            r0 = r4
        L40:
            int r1 = r1.compareTo(r0)
        L44:
            return r1
        L45:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.m r5 = (r4.m) r5
            int r1 = r5.compare(r7, r8)
            if (r1 == 0) goto L52
            goto L82
        L52:
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            og.k r1 = ya.g.f22385e
            int r7 = uf.d.e(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto L62
            r7 = r3
            goto L63
        L62:
            r7 = r2
        L63:
            if (r7 == 0) goto L66
            goto L67
        L66:
            r1 = r4
        L67:
            if (r1 == 0) goto L6a
            goto L6b
        L6a:
            r1 = r0
        L6b:
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r7 = uf.d.e(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto L78
            r2 = r3
        L78:
            if (r2 == 0) goto L7b
            r4 = r8
        L7b:
            if (r4 == 0) goto L7e
            r0 = r4
        L7e:
            int r1 = r1.compareTo(r0)
        L82:
            return r1
        L83:
            xe.p r7 = (xe.p) r7
            xe.p r8 = (xe.p) r8
            r7.getClass()
            boolean r7 = r6.a(r4)
            if (r7 != 0) goto L99
            boolean r7 = r6.a(r4)
            if (r7 == 0) goto L97
            goto L99
        L97:
            r7 = r2
            goto L9a
        L99:
            r7 = r3
        L9a:
            r8.getClass()
            boolean r8 = r6.a(r4)
            if (r8 != 0) goto La9
            boolean r8 = r6.a(r4)
            if (r8 == 0) goto Laa
        La9:
            r2 = r3
        Laa:
            int r7 = java.lang.Boolean.compare(r7, r2)
            int r7 = -r7
            return r7
        Lb0:
            wb.kn r5 = (wb.kn) r5
            int r0 = r5.compare(r7, r8)
            if (r0 == 0) goto Lb9
            goto Lc9
        Lb9:
            sf.e r7 = (sf.e) r7
            java.lang.Object r7 = r7.f12418g
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            sf.e r8 = (sf.e) r8
            java.lang.Object r8 = r8.f12418g
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r0 = a7.a.m(r7, r8)
        Lc9:
            return r0
        Lca:
            sf.e r7 = (sf.e) r7
            fg.l r5 = (fg.l) r5
            java.lang.Object r7 = r7.f12419h
            java.lang.Object r7 = r5.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            sf.e r8 = (sf.e) r8
            java.lang.Object r8 = r8.f12419h
            java.lang.Object r8 = r5.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r8 = r8 ^ r3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            int r7 = r7.compareTo(r8)
            return r7
        Lf7:
            wb.e2 r5 = (wb.e2) r5
            int r0 = r5.compare(r7, r8)
            if (r0 == 0) goto L100
            goto L11d
        L100:
            wb.m5 r7 = (wb.m5) r7
            wb.s0 r7 = r7.f17595a
            java.lang.String r7 = r7.f18971b
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = j8.b.l(r0, r7, r0)
            wb.m5 r8 = (wb.m5) r8
            wb.s0 r8 = r8.f17595a
            java.lang.String r8 = r8.f18971b
            java.lang.String r8 = r8.toLowerCase(r0)
            r8.getClass()
            int r0 = r7.compareTo(r8)
        L11d:
            return r0
        L11e:
            wb.kn r5 = (wb.kn) r5
            int r0 = r5.compare(r7, r8)
            if (r0 == 0) goto L127
            goto L140
        L127:
            wb.s0 r7 = (wb.s0) r7
            java.lang.String r7 = r7.f18971b
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = j8.b.l(r0, r7, r0)
            wb.s0 r8 = (wb.s0) r8
            java.lang.String r8 = r8.f18971b
            java.lang.String r8 = r8.toLowerCase(r0)
            r8.getClass()
            int r0 = r7.compareTo(r8)
        L140:
            return r0
        L141:
            wb.kn r5 = (wb.kn) r5
            int r0 = r5.compare(r7, r8)
            if (r0 == 0) goto L14a
            goto L15e
        L14a:
            wb.s0 r7 = (wb.s0) r7
            boolean r7 = r7.f18976g
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            wb.s0 r8 = (wb.s0) r8
            boolean r8 = r8.f18976g
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            int r0 = r7.compareTo(r8)
        L15e:
            return r0
        L15f:
            c9.z r5 = (c9.z) r5
            int r0 = r5.compare(r7, r8)
            if (r0 == 0) goto L168
            goto L17c
        L168:
            wb.s0 r7 = (wb.s0) r7
            boolean r7 = r7.f18972c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            wb.s0 r8 = (wb.s0) r8
            boolean r8 = r8.f18972c
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            int r0 = r7.compareTo(r8)
        L17c:
            return r0
        L17d:
            vb.a r7 = (vb.a) r7
            java.util.List r5 = (java.util.List) r5
            java.lang.String r7 = r7.a()
            int r7 = r5.indexOf(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            vb.a r8 = (vb.a) r8
            java.lang.String r8 = r8.a()
            int r8 = r5.indexOf(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = r7.compareTo(r8)
            return r7
        L1a0:
            wb.kn r5 = (wb.kn) r5
            int r0 = r5.compare(r7, r8)
            if (r0 == 0) goto L1a9
            goto L1c2
        L1a9:
            e9.c r7 = (e9.c) r7
            java.lang.String r7 = r7.f2392c
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = j8.b.l(r0, r7, r0)
            e9.c r8 = (e9.c) r8
            java.lang.String r8 = r8.f2392c
            java.lang.String r8 = r8.toLowerCase(r0)
            r8.getClass()
            int r0 = r7.compareTo(r8)
        L1c2:
            return r0
        L1c3:
            wb.e2 r5 = (wb.e2) r5
            int r0 = r5.compare(r7, r8)
            if (r0 == 0) goto L1cc
            goto L1e0
        L1cc:
            e9.c r7 = (e9.c) r7
            boolean r7 = r7.f2393d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            e9.c r8 = (e9.c) r8
            boolean r8 = r8.f2393d
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            int r0 = r7.compareTo(r8)
        L1e0:
            return r0
        L1e1:
            wb.e2 r5 = (wb.e2) r5
            int r0 = r5.compare(r7, r8)
            if (r0 == 0) goto L1ea
            goto L203
        L1ea:
            e9.c r7 = (e9.c) r7
            java.lang.String r7 = r7.f2392c
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = j8.b.l(r0, r7, r0)
            e9.c r8 = (e9.c) r8
            java.lang.String r8 = r8.f2392c
            java.lang.String r8 = r8.toLowerCase(r0)
            r8.getClass()
            int r0 = r7.compareTo(r8)
        L203:
            return r0
        L204:
            c9.a0 r5 = (c9.a0) r5
            int r0 = r5.compare(r7, r8)
            if (r0 == 0) goto L20d
            goto L222
        L20d:
            java.lang.String r7 = (java.lang.String) r7
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = j8.b.l(r0, r7, r0)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.toLowerCase(r0)
            r8.getClass()
            int r0 = r7.compareTo(r8)
        L222:
            return r0
    }
}
