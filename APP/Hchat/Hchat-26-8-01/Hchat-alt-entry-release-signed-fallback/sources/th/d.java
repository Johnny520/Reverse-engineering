package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f13273i;

    public /* synthetic */ d(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f13271g = r2
            r0.f13273i = r3
            r0.f13272h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ d(int r2, java.util.Collection r3) {
            r1 = this;
            r0 = 1
            r1.f13271g = r0
            r1.<init>()
            r1.f13272h = r2
            r1.f13273i = r3
            return
    }

    public /* synthetic */ d(ya.g r1, int r2, java.util.ArrayList r3) {
            r0 = this;
            r1 = 3
            r0.f13271g = r1
            r0.<init>()
            r0.f13272h = r2
            r0.f13273i = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f13271g
            r1 = 2
            sf.n r2 = sf.n.f12433a
            int r3 = r11.f13272h
            java.lang.Object r4 = r11.f13273i
            switch(r0) {
                case 0: goto Lc4;
                case 1: goto Lb7;
                case 2: goto La4;
                default: goto Lc;
            }
        Lc:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            android.view.View r12 = (android.view.View) r12
            r12.getClass()
            boolean r0 = r12 instanceof android.view.ViewGroup
            r5 = 0
            if (r0 == 0) goto L1b
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            goto L1c
        L1b:
            r12 = r5
        L1c:
            if (r12 == 0) goto La3
            int[] r0 = new int[r1]
            r12.getLocationOnScreen(r0)
            r6 = 1
            r0 = r0[r6]
            og.k r6 = ya.g.f22385e
            int r6 = uf.d.d(r12)
            int r6 = r6 + r0
            int r7 = uf.d.d(r12)
            float r0 = (float) r0
            float r3 = (float) r3
            r8 = 1058977874(0x3f1eb852, float:0.62)
            float r8 = r8 * r3
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto La3
            float r0 = (float) r6
            r6 = 1063339950(0x3f6147ae, float:0.88)
            float r6 = r6 * r3
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto La3
            float r0 = (float) r7
            r6 = 1049582633(0x3e8f5c29, float:0.28)
            float r3 = r3 * r6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto La3
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3 = 0
            ya.g.b(r12, r3, r0)
            java.util.Set r6 = ya.g.f22386f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L68
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L68
            goto L9e
        L68:
            java.util.Iterator r6 = r6.iterator()
        L6c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L9e
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L7f
            goto L6c
        L7f:
            java.util.Iterator r8 = r0.iterator()
        L83:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L6c
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = gg.l.a(r9, r7)
            if (r9 == 0) goto L83
            int r3 = r3 + 1
            if (r3 < 0) goto L9a
            goto L6c
        L9a:
            a.a.P0()
            throw r5
        L9e:
            if (r3 < r1) goto La3
            r4.add(r12)
        La3:
            return r2
        La4:
            java.lang.String r4 = (java.lang.String) r4
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r12.getClass()
            r12.setContentDescription(r4)
            q8.a r0 = new q8.a
            r0.<init>(r3, r1)
            r12.setImageDrawable(r0)
            return r2
        Lb7:
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r12 = (java.util.List) r12
            boolean r12 = r12.addAll(r3, r4)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        Lc4:
            th.i r4 = (th.i) r4
            r6 = r12
            h1.d r6 = (h1.d) r6
            r6.getClass()
            th.a r5 = r4.f13312u
            th.g r7 = r4.C
            i0.j1 r12 = r4.J
            java.lang.Object r12 = r12.getValue()
            r8 = r12
            v1.t r8 = (v1.t) r8
            fg.l r9 = r4.f13315x
            int r10 = r11.f13272h
            r5.a(r6, r7, r8, r9, r10)
            return r2
    }
}
