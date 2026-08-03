package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vm implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f19782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.p f19783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ fg.a f19784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.l f19785m;

    public /* synthetic */ vm(java.util.List r1, java.util.List r2, fg.a r3, fg.p r4, fg.a r5, fg.l r6, int r7, int r8) {
            r0 = this;
            r0.f19779g = r8
            r0.f19780h = r1
            r0.f19781i = r2
            r0.f19782j = r3
            r0.f19783k = r4
            r0.f19784l = r5
            r0.f19785m = r6
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f19779g
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            r7 = r10
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r10 = 28033(0x6d81, float:3.9283E-41)
            int r8 = i0.r.C(r10)
            java.util.List r1 = r9.f19780h
            java.util.List r2 = r9.f19781i
            fg.a r3 = r9.f19782j
            fg.p r4 = r9.f19783k
            fg.a r5 = r9.f19784l
            fg.l r6 = r9.f19785m
            wb.ho.U2(r1, r2, r3, r4, r5, r6, r7, r8)
        L22:
            sf.n r10 = sf.n.f12433a
            return r10
        L25:
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r10 = 3457(0xd81, float:4.844E-42)
            int r7 = i0.r.C(r10)
            java.util.List r0 = r9.f19780h
            java.util.List r1 = r9.f19781i
            fg.a r2 = r9.f19782j
            fg.p r3 = r9.f19783k
            fg.a r4 = r9.f19784l
            fg.l r5 = r9.f19785m
            wb.ho.a4(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L22
    }
}
