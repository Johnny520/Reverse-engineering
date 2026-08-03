package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ml implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f17706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.p f17707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ fg.a f17708l;

    public /* synthetic */ ml(java.util.List r1, java.util.List r2, fg.a r3, fg.p r4, fg.a r5, int r6, int r7) {
            r0 = this;
            r0.f17703g = r7
            r0.f17704h = r1
            r0.f17705i = r2
            r0.f17706j = r3
            r0.f17707k = r4
            r0.f17708l = r5
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f17703g
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            r6 = r9
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r9 = 3457(0xd81, float:4.844E-42)
            int r7 = i0.r.C(r9)
            java.util.List r1 = r8.f17704h
            java.util.List r2 = r8.f17705i
            fg.a r3 = r8.f17706j
            fg.p r4 = r8.f17707k
            fg.a r5 = r8.f17708l
            wb.ho.v1(r1, r2, r3, r4, r5, r6, r7)
        L20:
            sf.n r9 = sf.n.f12433a
            return r9
        L23:
            r5 = r9
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r9 = 3457(0xd81, float:4.844E-42)
            int r6 = i0.r.C(r9)
            java.util.List r0 = r8.f17704h
            java.util.List r1 = r8.f17705i
            fg.a r2 = r8.f17706j
            fg.p r3 = r8.f17707k
            fg.a r4 = r8.f17708l
            wb.ho.j1(r0, r1, r2, r3, r4, r5, r6)
            goto L20
    }
}
