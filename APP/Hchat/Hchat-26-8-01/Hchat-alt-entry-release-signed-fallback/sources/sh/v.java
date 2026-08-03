package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12864i;

    public /* synthetic */ v(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f12862g = r2
            r0.f12863h = r3
            r0.f12864i = r1
            r0.<init>()
            return
    }

    public /* synthetic */ v(int r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f12862g = r3
            r0.f12864i = r1
            r0.f12863h = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f12862g
            switch(r0) {
                case 0: goto Lc0;
                case 1: goto L9f;
                case 2: goto L7e;
                case 3: goto L53;
                case 4: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f12863h
            h0.s r0 = (h0.s) r0
            java.lang.Object r0 = r0.f4982e
            i2.k0 r0 = (i2.k0) r0
            i2.o r0 = r0.f6347b
            int r1 = r4.f12864i
            int r0 = r0.d(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L1a:
            java.lang.Object r0 = r4.f12863h
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            int r2 = r4.f12864i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.LinkedHashSet r1 = tf.d0.S(r1, r2)
            goto L4d
        L3f:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.LinkedHashSet r1 = tf.d0.V(r1, r2)
        L4d:
            r0.setValue(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L53:
            java.lang.Object r0 = r4.f12863h
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            int r2 = r4.f12864i
            r1.remove(r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L78
            x8.s r1 = new x8.s
            r2 = 31
            r3 = 0
            r1.<init>(r2, r3, r3)
            java.util.List r1 = a.a.x0(r1)
        L78:
            r0.setValue(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L7e:
            java.lang.Object r0 = r4.f12863h
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            int r2 = r4.f12864i
            java.lang.Object r3 = r1.remove(r2)
            x8.s r3 = (x8.s) r3
            int r2 = r2 + 1
            r1.add(r2, r3)
            r0.setValue(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L9f:
            java.lang.Object r0 = r4.f12863h
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            int r2 = r4.f12864i
            java.lang.Object r3 = r1.remove(r2)
            x8.s r3 = (x8.s) r3
            int r2 = r2 + (-1)
            r1.add(r2, r3)
            r0.setValue(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        Lc0:
            java.lang.Object r0 = r4.f12863h
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r0 = r0.getValue()
            fg.l r0 = (fg.l) r0
            int r1 = r4.f12864i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r1)
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
