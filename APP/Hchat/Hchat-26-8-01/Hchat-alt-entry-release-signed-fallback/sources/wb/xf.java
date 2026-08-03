package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xf implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f20154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f20155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f20157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20159o;

    public /* synthetic */ xf(android.content.Context r2, java.lang.String r3, java.lang.String r4, int r5, fg.l r6, fg.l r7, int r8, int r9) {
            r1 = this;
            r0 = 2
            r1.f20151g = r0
            r1.<init>()
            r1.f20158n = r2
            r1.f20152h = r3
            r1.f20153i = r4
            r1.f20154j = r5
            r1.f20155k = r6
            r1.f20159o = r7
            r1.f20156l = r8
            r1.f20157m = r9
            return
    }

    public /* synthetic */ xf(android.content.SharedPreferences r2, java.lang.String r3, java.lang.String r4, java.util.ArrayList r5, int r6, fg.l r7, int r8, int r9) {
            r1 = this;
            r0 = 1
            r1.f20151g = r0
            r1.<init>()
            r1.f20158n = r2
            r1.f20152h = r3
            r1.f20153i = r4
            r1.f20159o = r5
            r1.f20154j = r6
            r1.f20155k = r7
            r1.f20156l = r8
            r1.f20157m = r9
            return
    }

    public /* synthetic */ xf(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.List r5, int r6, fg.l r7, int r8, int r9) {
            r1 = this;
            r0 = 0
            r1.f20151g = r0
            r1.<init>()
            r1.f20152h = r2
            r1.f20153i = r3
            r1.f20158n = r4
            r1.f20159o = r5
            r1.f20154j = r6
            r1.f20155k = r7
            r1.f20156l = r8
            r1.f20157m = r9
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f20151g
            switch(r0) {
                case 0: goto L57;
                case 1: goto L2f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.f20158n
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r10.f20159o
            r6 = r0
            fg.l r6 = (fg.l) r6
            r7 = r11
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r11 = r10.f20156l
            r11 = r11 | 1
            int r8 = i0.r.C(r11)
            java.lang.String r2 = r10.f20152h
            java.lang.String r3 = r10.f20153i
            int r4 = r10.f20154j
            fg.l r5 = r10.f20155k
            int r9 = r10.f20157m
            wb.ho.n1(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L2c:
            sf.n r11 = sf.n.f12433a
            return r11
        L2f:
            java.lang.Object r0 = r10.f20158n
            r1 = r0
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r0 = r10.f20159o
            r4 = r0
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r7 = r11
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r11 = r10.f20156l
            r11 = r11 | 1
            int r8 = i0.r.C(r11)
            java.lang.String r2 = r10.f20152h
            java.lang.String r3 = r10.f20153i
            int r5 = r10.f20154j
            fg.l r6 = r10.f20155k
            int r9 = r10.f20157m
            wb.ho.z2(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L2c
        L57:
            java.lang.Object r0 = r10.f20158n
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r10.f20159o
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            r7 = r11
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            int r11 = r10.f20156l
            r11 = r11 | 1
            int r8 = i0.r.C(r11)
            java.lang.String r1 = r10.f20152h
            java.lang.String r2 = r10.f20153i
            int r5 = r10.f20154j
            fg.l r6 = r10.f20155k
            int r9 = r10.f20157m
            wb.ho.i4(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L2c
    }
}
