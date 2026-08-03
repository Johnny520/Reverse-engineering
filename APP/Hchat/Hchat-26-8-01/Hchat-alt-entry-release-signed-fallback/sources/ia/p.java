package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f6618h;

    public /* synthetic */ p(java.util.Set r1, int r2) {
            r0 = this;
            r0.f6617g = r2
            r0.f6618h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f6617g
            switch(r0) {
                case 0: goto L75;
                case 1: goto L67;
                case 2: goto L55;
                case 3: goto L47;
                case 4: goto L19;
                default: goto L5;
            }
        L5:
            wb.m5 r3 = (wb.m5) r3
            r3.getClass()
            wb.s0 r3 = r3.f17595a
            java.lang.String r3 = r3.f18970a
            java.util.Set r0 = r2.f6618h
            boolean r3 = r0.contains(r3)
        L14:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L19:
            wb.t5 r3 = (wb.t5) r3
            r3.getClass()
            java.util.List r3 = r3.f19172c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L27
            goto L41
        L27:
            java.util.Iterator r3 = r3.iterator()
        L2b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Set r1 = r2.f6618h
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2b
            r3 = 1
            goto L42
        L41:
            r3 = 0
        L42:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L47:
            wb.s0 r3 = (wb.s0) r3
            r3.getClass()
            java.lang.String r3 = r3.f18970a
            java.util.Set r0 = r2.f6618h
            boolean r3 = r0.contains(r3)
            goto L14
        L55:
            j8.i r3 = (j8.i) r3
            r3.getClass()
            long r0 = r3.f6799a
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.util.Set r0 = r2.f6618h
            boolean r3 = r0.contains(r3)
            goto L14
        L67:
            wb.s0 r3 = (wb.s0) r3
            r3.getClass()
            java.lang.String r3 = r3.f18970a
            java.util.Set r0 = r2.f6618h
            boolean r3 = r0.contains(r3)
            goto L14
        L75:
            wb.jv r3 = (wb.jv) r3
            r3.getClass()
            java.lang.String r3 = r3.f17140a
            java.lang.String r0 = "wxid_hchat_fake_like_"
            r1 = 0
            boolean r0 = og.t.d0(r3, r0, r1)
            if (r0 != 0) goto L8d
            java.util.Set r0 = r2.f6618h
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L8e
        L8d:
            r1 = 1
        L8e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
    }
}
