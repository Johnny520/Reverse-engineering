package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f15961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f15962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ sf.b f15964l;

    public /* synthetic */ ej(j8.i r1, boolean r2, boolean r3, fg.l r4, fg.a r5, int r6) {
            r0 = this;
            r6 = 2
            r0.f15959g = r6
            r0.<init>()
            r0.f15963k = r1
            r0.f15960h = r2
            r0.f15961i = r3
            r0.f15964l = r4
            r0.f15962j = r5
            return
    }

    public /* synthetic */ ej(boolean r2, boolean r3, fg.a r4, fg.a r5, fg.a r6) {
            r1 = this;
            r0 = 0
            r1.f15959g = r0
            r1.<init>()
            r1.f15960h = r2
            r1.f15961i = r3
            r1.f15962j = r4
            r1.f15963k = r5
            r1.f15964l = r6
            return
    }

    public /* synthetic */ ej(boolean r1, boolean r2, fg.a r3, fg.a r4, fg.a r5, int r6) {
            r0 = this;
            r6 = 1
            r0.f15959g = r6
            r0.<init>()
            r0.f15960h = r1
            r0.f15961i = r2
            r0.f15962j = r3
            r0.f15963k = r4
            r0.f15964l = r5
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f15959g
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L29;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f15963k
            r1 = r0
            j8.i r1 = (j8.i) r1
            sf.b r0 = r8.f15964l
            r4 = r0
            fg.l r4 = (fg.l) r4
            r6 = r9
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r9 = 9
            int r7 = i0.r.C(r9)
            boolean r2 = r8.f15960h
            boolean r3 = r8.f15961i
            fg.a r5 = r8.f15962j
            wb.ho.A0(r1, r2, r3, r4, r5, r6, r7)
        L26:
            sf.n r9 = sf.n.f12433a
            return r9
        L29:
            java.lang.Object r0 = r8.f15963k
            r4 = r0
            fg.a r4 = (fg.a) r4
            sf.b r0 = r8.f15964l
            r5 = r0
            fg.a r5 = (fg.a) r5
            r6 = r9
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r9 = 1
            int r7 = i0.r.C(r9)
            boolean r1 = r8.f15960h
            boolean r2 = r8.f15961i
            fg.a r3 = r8.f15962j
            wb.ho.a3(r1, r2, r3, r4, r5, r6, r7)
            goto L26
        L4a:
            java.lang.Object r0 = r8.f15963k
            r4 = r0
            fg.a r4 = (fg.a) r4
            sf.b r0 = r8.f15964l
            r5 = r0
            fg.a r5 = (fg.a) r5
            r6 = r9
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r10 = r9 & 3
            r0 = 2
            r1 = 1
            if (r10 == r0) goto L65
            r10 = r1
            goto L66
        L65:
            r10 = 0
        L66:
            r9 = r9 & r1
            boolean r9 = r6.S(r9, r10)
            if (r9 == 0) goto L78
            r7 = 0
            boolean r1 = r8.f15960h
            boolean r2 = r8.f15961i
            fg.a r3 = r8.f15962j
            wb.ho.a3(r1, r2, r3, r4, r5, r6, r7)
            goto L7b
        L78:
            r6.V()
        L7b:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
