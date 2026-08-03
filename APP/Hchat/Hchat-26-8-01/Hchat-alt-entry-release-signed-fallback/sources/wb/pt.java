package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class pt extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qg.t f18538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fb.v f18541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18543m;

    public pt(qg.t r1, i0.a1 r2, i0.a1 r3, fb.v r4, i0.a1 r5, i0.a1 r6, wf.c r7) {
            r0 = this;
            r0.f18538h = r1
            r0.f18539i = r2
            r0.f18540j = r3
            r0.f18541k = r4
            r0.f18542l = r5
            r0.f18543m = r6
            r1 = 2
            r0.<init>(r1, r7)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r9, wf.c r10) {
            r8 = this;
            wb.pt r0 = new wb.pt
            i0.a1 r5 = r8.f18542l
            i0.a1 r6 = r8.f18543m
            qg.t r1 = r8.f18538h
            i0.a1 r2 = r8.f18539i
            i0.a1 r3 = r8.f18540j
            fb.v r4 = r8.f18541k
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.pt r1 = (wb.pt) r1
            sf.n r2 = sf.n.f12433a
            r1.invokeSuspend(r2)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            f8.i.I0(r7)
            i0.a1 r4 = r6.f18542l
            i0.a1 r5 = r6.f18543m
            qg.t r0 = r6.f18538h
            i0.a1 r1 = r6.f18539i
            i0.a1 r2 = r6.f18540j
            fb.v r3 = r6.f18541k
            wb.y2.f0(r0, r1, r2, r3, r4, r5)
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
