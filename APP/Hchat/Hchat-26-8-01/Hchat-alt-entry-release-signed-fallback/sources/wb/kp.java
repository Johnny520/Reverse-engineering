package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eb.c0 f17350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17351i;

    public /* synthetic */ kp(eb.c0 r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f17349g = r3
            r0.f17350h = r1
            r0.f17351i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f17349g
            switch(r0) {
                case 0: goto Le7;
                case 1: goto Lb2;
                case 2: goto L7d;
                default: goto L5;
            }
        L5:
            java.util.List r8 = (java.util.List) r8
            r8.getClass()
            i0.a1 r0 = r7.f17351i
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            eb.c0 r2 = r7.f17350h
            java.lang.String r2 = r2.f2506a
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L20
            tf.t r1 = tf.t.f13167g
        L20:
            java.util.ArrayList r8 = tf.m.F1(r8, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r8.iterator()
        L32:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r8.next()
            r5 = r4
            gb.g r5 = (gb.g) r5
            java.lang.String r5 = r5.f4422a
            java.util.Locale r6 = java.util.Locale.ROOT
            r6.getClass()
            java.lang.String r5 = r5.toLowerCase(r6)
            r5.getClass()
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto L32
            r3.add(r4)
            goto L32
        L57:
            java.lang.Object r8 = r0.getValue()
            java.util.Map r8 = (java.util.Map) r8
            r8.getClass()
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L6e
            java.util.Map r8 = java.util.Collections.singletonMap(r2, r3)
            r8.getClass()
            goto L77
        L6e:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r8)
            r1.put(r2, r3)
            r8 = r1
        L77:
            r0.setValue(r8)
        L7a:
            sf.n r8 = sf.n.f12433a
            return r8
        L7d:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            i0.a1 r0 = r7.f17351i
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            eb.c0 r2 = r7.f17350h
            java.lang.String r2 = r2.f2506a
            r3 = 500(0x1f4, float:7.0E-43)
            java.lang.String r8 = og.m.P0(r3, r8)
            r1.getClass()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto La5
            java.util.Map r8 = java.util.Collections.singletonMap(r2, r8)
            r8.getClass()
            goto Lae
        La5:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            r3.put(r2, r8)
            r8 = r3
        Lae:
            r0.setValue(r8)
            goto L7a
        Lb2:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            i0.a1 r0 = r7.f17351i
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            eb.c0 r2 = r7.f17350h
            java.lang.String r2 = r2.f2506a
            r3 = 100
            java.lang.String r8 = og.m.P0(r3, r8)
            r1.getClass()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto Lda
            java.util.Map r8 = java.util.Collections.singletonMap(r2, r8)
            r8.getClass()
            goto Le3
        Lda:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            r3.put(r2, r8)
            r8 = r3
        Le3:
            r0.setValue(r8)
            goto L7a
        Le7:
            eb.c0 r0 = r7.f17350h
            java.lang.String r0 = r0.f2506a
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            i0.a1 r1 = r7.f17351i
            if (r8 == 0) goto L100
            java.lang.Object r8 = r1.getValue()
            java.util.Set r8 = (java.util.Set) r8
            java.util.LinkedHashSet r8 = tf.d0.V(r8, r0)
            goto L10a
        L100:
            java.lang.Object r8 = r1.getValue()
            java.util.Set r8 = (java.util.Set) r8
            java.util.LinkedHashSet r8 = tf.d0.S(r8, r0)
        L10a:
            r1.setValue(r8)
            goto L7a
    }
}
