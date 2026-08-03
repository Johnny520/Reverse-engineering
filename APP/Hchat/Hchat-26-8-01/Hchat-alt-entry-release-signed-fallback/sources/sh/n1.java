package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f12746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12751n;

    public /* synthetic */ n1(m1.f r2, java.lang.String r3, boolean r4, fg.a r5, boolean r6, int r7, int r8) {
            r1 = this;
            r0 = 1
            r1.f12744g = r0
            r1.<init>()
            r1.f12749l = r2
            r1.f12750m = r3
            r1.f12745h = r4
            r1.f12751n = r5
            r1.f12746i = r6
            r1.f12747j = r7
            r1.f12748k = r8
            return
    }

    public /* synthetic */ n1(boolean r2, fg.l r3, y0.o r4, sh.l1 r5, boolean r6, int r7, int r8) {
            r1 = this;
            r0 = 0
            r1.f12744g = r0
            r1.<init>()
            r1.f12745h = r2
            r1.f12749l = r3
            r1.f12750m = r4
            r1.f12751n = r5
            r1.f12746i = r6
            r1.f12747j = r7
            r1.f12748k = r8
            return
    }

    public /* synthetic */ n1(boolean r2, java.lang.String r3, java.lang.String r4, boolean r5, fg.l r6, int r7, int r8) {
            r1 = this;
            r0 = 2
            r1.f12744g = r0
            r1.<init>()
            r1.f12745h = r2
            r1.f12750m = r3
            r1.f12751n = r4
            r1.f12746i = r5
            r1.f12749l = r6
            r1.f12747j = r7
            r1.f12748k = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f12744g
            switch(r0) {
                case 0: goto L59;
                case 1: goto L30;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f12750m
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r9.f12751n
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r9.f12749l
            r5 = r0
            fg.l r5 = (fg.l) r5
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f12747j
            r10 = r10 | 1
            int r7 = i0.r.C(r10)
            boolean r1 = r9.f12745h
            boolean r4 = r9.f12746i
            int r8 = r9.f12748k
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
        L2d:
            sf.n r10 = sf.n.f12433a
            return r10
        L30:
            java.lang.Object r0 = r9.f12749l
            r6 = r0
            m1.f r6 = (m1.f) r6
            java.lang.Object r0 = r9.f12750m
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r9.f12751n
            r3 = r0
            fg.a r3 = (fg.a) r3
            r4 = r10
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f12747j
            r10 = r10 | 1
            int r1 = i0.r.C(r10)
            int r2 = r9.f12748k
            boolean r7 = r9.f12745h
            boolean r8 = r9.f12746i
            wb.ho.S0(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L2d
        L59:
            java.lang.Object r0 = r9.f12749l
            r2 = r0
            fg.l r2 = (fg.l) r2
            java.lang.Object r0 = r9.f12750m
            r3 = r0
            y0.o r3 = (y0.o) r3
            java.lang.Object r0 = r9.f12751n
            r4 = r0
            sh.l1 r4 = (sh.l1) r4
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            int r10 = r9.f12747j
            r10 = r10 | 1
            int r7 = i0.r.C(r10)
            boolean r1 = r9.f12745h
            boolean r5 = r9.f12746i
            int r8 = r9.f12748k
            sh.s.m(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L2d
    }
}
