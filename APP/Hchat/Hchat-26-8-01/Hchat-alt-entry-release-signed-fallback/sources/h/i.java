package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i.k1 f4694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0.o f4695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f4696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f4697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s0.d f4698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4699l;

    public i(i.k1 r1, y0.o r2, fg.l r3, fg.l r4, s0.d r5, int r6) {
            r0 = this;
            r0.f4694g = r1
            r0.f4695h = r2
            r0.f4696i = r3
            r0.f4697j = r4
            r0.f4698k = r5
            r0.f4699l = r6
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            r5 = r8
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            int r8 = r7.f4699l
            r8 = r8 | 1
            int r6 = i0.r.C(r8)
            i.k1 r0 = r7.f4694g
            y0.o r1 = r7.f4695h
            fg.l r2 = r7.f4696i
            fg.l r3 = r7.f4697j
            s0.d r4 = r7.f4698k
            h.k.a(r0, r1, r2, r3, r4, r5, r6)
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
