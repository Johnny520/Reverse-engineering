package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15001k;

    public /* synthetic */ af(i0.a1 r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, int r5) {
            r0 = this;
            r0.f14997g = r5
            r0.f14998h = r1
            r0.f14999i = r2
            r0.f15000j = r3
            r0.f15001k = r4
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r9 = this;
            int r0 = r9.f14997g
            switch(r0) {
                case 0: goto L23;
                case 1: goto L15;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r9.f15001k
            r1 = 5000(0x1388, float:7.006E-42)
            i0.a1 r2 = r9.f14998h
            i0.a1 r3 = r9.f14999i
            i0.a1 r4 = r9.f15000j
            wb.y2.s(r2, r3, r4, r0, r1)
        L12:
            sf.n r0 = sf.n.f12433a
            return r0
        L15:
            i0.a1 r0 = r9.f15001k
            r1 = -5000(0xffffffffffffec78, float:NaN)
            i0.a1 r2 = r9.f14998h
            i0.a1 r3 = r9.f14999i
            i0.a1 r4 = r9.f15000j
            wb.y2.s(r2, r3, r4, r0, r1)
            goto L12
        L23:
            wb.v0 r1 = new wb.v0
            i0.a1 r0 = r9.f14998h
            java.lang.Object r2 = r0.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 1
            if (r2 != r3) goto L37
            java.lang.String r2 = "选择白名单"
            goto L39
        L37:
            java.lang.String r2 = "选择黑名单"
        L39:
            java.lang.Object r4 = r0.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            i0.a1 r5 = r9.f14999i
            i0.a1 r6 = r9.f15000j
            if (r4 != r3) goto L51
            java.lang.Object r3 = r5.getValue()
            java.lang.String r3 = (java.lang.String) r3
        L4f:
            r4 = r6
            goto L58
        L51:
            java.lang.Object r3 = r6.getValue()
            java.lang.String r3 = (java.lang.String) r3
            goto L4f
        L58:
            wb.ad r6 = new wb.ad
            r7 = 1
            r6.<init>(r0, r5, r4, r7)
            r8 = 192(0xc0, float:2.69E-43)
            r5 = r3
            wb.u0 r3 = wb.u0.f19346i
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            i0.a1 r0 = r9.f15001k
            r0.setValue(r1)
            goto L12
    }
}
