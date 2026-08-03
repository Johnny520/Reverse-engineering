package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j8 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.v0 f16987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16989j;

    public /* synthetic */ j8(wb.v0 r1, android.content.Context r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f16986g = r4
            r0.f16987h = r1
            r0.f16988i = r2
            r0.f16989j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f16986g
            java.util.List r5 = (java.util.List) r5
            switch(r0) {
                case 0: goto L4b;
                default: goto L7;
            }
        L7:
            r5.getClass()
            wb.v0 r0 = r4.f16987h
            fg.l r0 = r0.f19587e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r5)
            r1.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            wb.s0 r3 = (wb.s0) r3
            java.lang.String r3 = r3.f18970a
            r1.add(r3)
            goto L1b
        L2d:
            java.lang.String r1 = wb.ho.D5(r1)
            r0.invoke(r1)
            int r5 = r5.size()
            java.lang.String r0 = " 项"
            r1 = 0
            java.lang.String r2 = "已选择 "
            android.content.Context r3 = r4.f16988i
            wb.en.o(r2, r5, r0, r3, r1)
            r5 = 0
            i0.a1 r0 = r4.f16989j
            r0.setValue(r5)
        L48:
            sf.n r5 = sf.n.f12433a
            return r5
        L4b:
            r5.getClass()
            wb.v0 r0 = r4.f16987h
            fg.l r0 = r0.f19587e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r5)
            r1.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L5f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r2.next()
            wb.s0 r3 = (wb.s0) r3
            java.lang.String r3 = r3.f18970a
            r1.add(r3)
            goto L5f
        L71:
            java.lang.String r1 = wb.ho.D5(r1)
            r0.invoke(r1)
            int r5 = r5.size()
            java.lang.String r0 = " 项"
            r1 = 0
            java.lang.String r2 = "已选择 "
            android.content.Context r3 = r4.f16988i
            wb.en.o(r2, r5, r0, r3, r1)
            r5 = 0
            i0.a1 r0 = r4.f16989j
            r0.setValue(r5)
            goto L48
    }
}
