package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gg.s f2968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gg.s f2969i;

    public /* synthetic */ l(gg.s r1, gg.s r2, int r3) {
            r0 = this;
            r0.f2967g = r3
            r0.f2968h = r1
            r0.f2969i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f2967g
            switch(r0) {
                case 0: goto L71;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            gg.s r0 = r3.f2968h
            int r1 = r0.f4562g
            int r1 = r1 + 1
            r0.f4562g = r1
            java.lang.String r0 = "备注"
            r1 = 0
            boolean r0 = og.m.h0(r4, r0, r1)
            gg.s r2 = r3.f2969i
            if (r0 == 0) goto L24
            int r4 = r2.f4562g
            int r4 = r4 + 12
            r2.f4562g = r4
            goto L6e
        L24:
            java.lang.String r0 = "标签"
            boolean r0 = og.m.h0(r4, r0, r1)
            if (r0 == 0) goto L33
            int r4 = r2.f4562g
            int r4 = r4 + 12
            r2.f4562g = r4
            goto L6e
        L33:
            java.lang.String r0 = "群聊名称"
            boolean r0 = og.m.h0(r4, r0, r1)
            if (r0 == 0) goto L42
            int r4 = r2.f4562g
            int r4 = r4 + 16
            r2.f4562g = r4
            goto L6e
        L42:
            java.lang.String r0 = "查找聊天记录"
            boolean r0 = og.m.h0(r4, r0, r1)
            if (r0 == 0) goto L51
            int r4 = r2.f4562g
            int r4 = r4 + 10
            r2.f4562g = r4
            goto L6e
        L51:
            java.lang.String r0 = "聊天信息"
            boolean r0 = og.m.h0(r4, r0, r1)
            if (r0 == 0) goto L60
            int r4 = r2.f4562g
            int r4 = r4 + 8
            r2.f4562g = r4
            goto L6e
        L60:
            java.lang.String r0 = "设置"
            boolean r4 = og.m.h0(r4, r0, r1)
            if (r4 == 0) goto L6e
            int r4 = r2.f4562g
            int r4 = r4 + 4
            r2.f4562g = r4
        L6e:
            sf.n r4 = sf.n.f12433a
            return r4
        L71:
            og.f r4 = (og.f) r4
            gg.s r0 = r3.f2968h
            int r1 = r0.f4562g
            r2 = -1
            if (r1 != r2) goto L85
            r1 = r4
            og.i r1 = (og.i) r1
            lg.d r1 = r1.b()
            int r1 = r1.f8042g
            r0.f4562g = r1
        L85:
            og.i r4 = (og.i) r4
            lg.d r4 = r4.b()
            int r4 = r4.f8043h
            int r4 = r4 + 1
            gg.s r0 = r3.f2969i
            r0.f4562g = r4
            java.lang.String r4 = ""
            return r4
    }
}
