package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.i0 f2827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.j0 f2828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f2829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f.j0 f2833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f.i0 f2834n;

    public h0(f.j0 r1, f.i0 r2, wf.c r3) {
            r0 = this;
            r0.f2833m = r1
            r0.f2834n = r2
            r0.<init>(r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            f.h0 r0 = new f.h0
            f.j0 r1 = r3.f2833m
            f.i0 r2 = r3.f2834n
            r0.<init>(r1, r2, r5)
            r0.f2832l = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ng.l r1 = (ng.l) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            f.h0 r1 = (f.h0) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f2831k
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L17
            int r0 = r10.f2830j
            long[] r2 = r10.f2829i
            f.j0 r3 = r10.f2828h
            f.i0 r4 = r10.f2827g
            java.lang.Object r5 = r10.f2832l
            ng.l r5 = (ng.l) r5
            f8.i.I0(r11)
            goto L30
        L17:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            return r11
        L1e:
            f8.i.I0(r11)
            java.lang.Object r11 = r10.f2832l
            r5 = r11
            ng.l r5 = (ng.l) r5
            f.j0 r3 = r10.f2833m
            f.g0 r11 = r3.f2842h
            long[] r2 = r11.f2819c
            int r0 = r11.f2821e
            f.i0 r4 = r10.f2834n
        L30:
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r11) goto L59
            r6 = r2[r0]
            r11 = 31
            long r6 = r6 >> r11
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r6 = r6 & r8
            int r11 = (int) r6
            r4.f2837h = r0
            f.g0 r6 = r3.f2842h
            java.lang.Object[] r6 = r6.f2818b
            r0 = r6[r0]
            r10.f2832l = r5
            r10.f2827g = r4
            r10.f2828h = r3
            r10.f2829i = r2
            r10.f2830j = r11
            r10.f2831k = r1
            r5.a(r0, r10)
            xf.a r11 = xf.a.f21579g
            return r11
        L59:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
