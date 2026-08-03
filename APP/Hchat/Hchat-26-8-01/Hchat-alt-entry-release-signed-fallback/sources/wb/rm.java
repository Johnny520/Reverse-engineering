package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rm implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.a f18912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.p f18913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.a f18914k;

    public /* synthetic */ rm(java.util.List r1, fg.a r2, fg.p r3, fg.a r4, int r5, int r6) {
            r0 = this;
            r0.f18910g = r6
            r0.f18911h = r1
            r0.f18912i = r2
            r0.f18913j = r3
            r0.f18914k = r4
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f18910g
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L21;
                default: goto L5;
            }
        L5:
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 433(0x1b1, float:6.07E-43)
            int r6 = i0.r.C(r8)
            java.util.List r1 = r7.f18911h
            fg.a r2 = r7.f18912i
            fg.p r3 = r7.f18913j
            fg.a r4 = r7.f18914k
            wb.ho.e3(r1, r2, r3, r4, r5, r6)
        L1e:
            sf.n r8 = sf.n.f12433a
            return r8
        L21:
            r4 = r8
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 433(0x1b1, float:6.07E-43)
            int r5 = i0.r.C(r8)
            java.util.List r0 = r7.f18911h
            fg.a r1 = r7.f18912i
            fg.p r2 = r7.f18913j
            fg.a r3 = r7.f18914k
            wb.ho.d4(r0, r1, r2, r3, r4, r5)
            goto L1e
        L3b:
            r4 = r8
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.getClass()
            r8 = 3505(0xdb1, float:4.912E-42)
            int r5 = i0.r.C(r8)
            java.util.List r0 = r7.f18911h
            fg.a r1 = r7.f18912i
            fg.p r2 = r7.f18913j
            fg.a r3 = r7.f18914k
            wb.ho.c2(r0, r1, r2, r3, r4, r5)
            goto L1e
    }
}
