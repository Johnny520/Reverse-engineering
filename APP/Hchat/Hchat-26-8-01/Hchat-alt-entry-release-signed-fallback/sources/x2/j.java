package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg.l f21144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0.o f21145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f21146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f21147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f21148k;

    public j(fg.l r1, y0.o r2, fg.l r3, int r4, int r5) {
            r0 = this;
            r0.f21144g = r1
            r0.f21145h = r2
            r0.f21146i = r3
            r0.f21147j = r4
            r0.f21148k = r5
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            r3 = r7
            i0.h0 r3 = (i0.h0) r3
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            int r7 = r6.f21147j
            r7 = r7 | 1
            int r4 = i0.r.C(r7)
            int r5 = r6.f21148k
            fg.l r0 = r6.f21144g
            y0.o r1 = r6.f21145h
            fg.l r2 = r6.f21146i
            x2.i.b(r0, r1, r2, r3, r4, r5)
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
