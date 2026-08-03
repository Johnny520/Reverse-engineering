package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.v0 f15018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15019i;

    public /* synthetic */ ak(wb.v0 r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f15017g = r3
            r0.f15018h = r1
            r0.f15019i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f15017g
            java.util.List r4 = (java.util.List) r4
            switch(r0) {
                case 0: goto La5;
                case 1: goto L71;
                case 2: goto L3d;
                default: goto L7;
            }
        L7:
            r4.getClass()
            wb.v0 r0 = r3.f15018h
            fg.l r0 = r0.f19587e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r4)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r4.next()
            wb.s0 r2 = (wb.s0) r2
            java.lang.String r2 = r2.f18970a
            r1.add(r2)
            goto L1b
        L2d:
            java.lang.String r4 = wb.ho.D5(r1)
            r0.invoke(r4)
            r4 = 0
            i0.a1 r0 = r3.f15019i
            r0.setValue(r4)
        L3a:
            sf.n r4 = sf.n.f12433a
            return r4
        L3d:
            r4.getClass()
            wb.v0 r0 = r3.f15018h
            fg.l r0 = r0.f19587e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r4)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L51:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r4.next()
            wb.s0 r2 = (wb.s0) r2
            java.lang.String r2 = r2.f18970a
            r1.add(r2)
            goto L51
        L63:
            java.lang.String r4 = wb.ho.D5(r1)
            r0.invoke(r4)
            r4 = 0
            i0.a1 r0 = r3.f15019i
            r0.setValue(r4)
            goto L3a
        L71:
            r4.getClass()
            wb.v0 r0 = r3.f15018h
            fg.l r0 = r0.f19587e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r4)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L85:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r4.next()
            wb.s0 r2 = (wb.s0) r2
            java.lang.String r2 = r2.f18970a
            r1.add(r2)
            goto L85
        L97:
            java.lang.String r4 = wb.ho.D5(r1)
            r0.invoke(r4)
            r4 = 0
            i0.a1 r0 = r3.f15019i
            r0.setValue(r4)
            goto L3a
        La5:
            r4.getClass()
            wb.v0 r0 = r3.f15018h
            fg.l r0 = r0.f19587e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r4)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        Lb9:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r4.next()
            wb.s0 r2 = (wb.s0) r2
            java.lang.String r2 = r2.f18970a
            r1.add(r2)
            goto Lb9
        Lcb:
            java.lang.String r4 = wb.ho.D5(r1)
            r0.invoke(r4)
            r4 = 0
            i0.a1 r0 = r3.f15019i
            r0.setValue(r4)
            goto L3a
    }
}
