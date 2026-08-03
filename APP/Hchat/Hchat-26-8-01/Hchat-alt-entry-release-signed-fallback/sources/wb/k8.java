package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k8 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y0.o f17221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f17222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.a f17223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17224l;

    public /* synthetic */ k8(java.lang.String r2, y0.o r3, boolean r4, fg.a r5, int r6) {
            r1 = this;
            r0 = 1
            r1.f17219g = r0
            r1.<init>()
            r1.f17220h = r2
            r1.f17221i = r3
            r1.f17222j = r4
            r1.f17223k = r5
            r1.f17224l = r6
            return
    }

    public /* synthetic */ k8(java.lang.String r2, boolean r3, fg.a r4, y0.o r5, int r6) {
            r1 = this;
            r0 = 0
            r1.f17219g = r0
            r1.<init>()
            r1.f17220h = r2
            r1.f17222j = r3
            r1.f17223k = r4
            r1.f17221i = r5
            r1.f17224l = r6
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f17219g
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            r3 = r8
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            int r8 = r7.f17224l
            r8 = r8 | 1
            int r1 = i0.r.C(r8)
            fg.a r2 = r7.f17223k
            java.lang.String r4 = r7.f17220h
            y0.o r5 = r7.f17221i
            boolean r6 = r7.f17222j
            wb.ho.N(r1, r2, r3, r4, r5, r6)
        L20:
            sf.n r8 = sf.n.f12433a
            return r8
        L23:
            r2 = r8
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            int r8 = r7.f17224l
            r8 = r8 | 1
            int r0 = i0.r.C(r8)
            fg.a r1 = r7.f17223k
            java.lang.String r3 = r7.f17220h
            y0.o r4 = r7.f17221i
            boolean r5 = r7.f17222j
            wb.ho.X(r0, r1, r2, r3, r4, r5)
            goto L20
    }
}
