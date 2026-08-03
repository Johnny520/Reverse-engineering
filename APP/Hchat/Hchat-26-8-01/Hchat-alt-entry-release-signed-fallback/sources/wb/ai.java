package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f15008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f15009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f15010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15014o;

    public /* synthetic */ ai(k9.j r1, boolean r2, boolean r3, fg.l r4, fg.a r5, fg.a r6, fg.a r7, fg.a r8, int r9) {
            r0 = this;
            r9 = 0
            r0.f15006g = r9
            r0.<init>()
            r0.f15011l = r1
            r0.f15007h = r2
            r0.f15008i = r3
            r0.f15010k = r4
            r0.f15009j = r5
            r0.f15012m = r6
            r0.f15013n = r7
            r0.f15014o = r8
            return
    }

    public /* synthetic */ ai(wb.y2 r1, java.util.List r2, boolean r3, java.lang.String r4, java.lang.String r5, boolean r6, fg.a r7, fg.l r8, int r9) {
            r0 = this;
            r9 = 1
            r0.f15006g = r9
            r0.<init>()
            r0.f15011l = r1
            r0.f15012m = r2
            r0.f15007h = r3
            r0.f15013n = r4
            r0.f15014o = r5
            r0.f15008i = r6
            r0.f15009j = r7
            r0.f15010k = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.f15006g
            switch(r0) {
                case 0: goto L36;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f15011l
            r1 = r0
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r0 = r11.f15012m
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r11.f15013n
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r11.f15014o
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            r9 = r12
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
            r12 = 12582913(0xc00001, float:1.7632417E-38)
            int r10 = i0.r.C(r12)
            boolean r3 = r11.f15007h
            boolean r6 = r11.f15008i
            fg.a r7 = r11.f15009j
            fg.l r8 = r11.f15010k
            r1.t(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L33:
            sf.n r12 = sf.n.f12433a
            return r12
        L36:
            java.lang.Object r0 = r11.f15011l
            r1 = r0
            k9.j r1 = (k9.j) r1
            java.lang.Object r0 = r11.f15012m
            r6 = r0
            fg.a r6 = (fg.a) r6
            java.lang.Object r0 = r11.f15013n
            r7 = r0
            fg.a r7 = (fg.a) r7
            java.lang.Object r0 = r11.f15014o
            r8 = r0
            fg.a r8 = (fg.a) r8
            r9 = r12
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
            r12 = 1
            int r10 = i0.r.C(r12)
            boolean r2 = r11.f15007h
            boolean r3 = r11.f15008i
            fg.l r4 = r11.f15010k
            fg.a r5 = r11.f15009j
            wb.ho.W0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L33
    }
}
