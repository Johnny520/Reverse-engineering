package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class eo extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1.v f16001i;

    public /* synthetic */ eo(d1.v r1, wf.c r2, int r3) {
            r0 = this;
            r0.f16000h = r3
            r0.f16001i = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f16000h
            switch(r3) {
                case 0: goto L17;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            wb.eo r3 = new wb.eo
            d1.v r0 = r2.f16001i
            r1 = 2
            r3.<init>(r0, r4, r1)
            return r3
        Le:
            wb.eo r3 = new wb.eo
            d1.v r0 = r2.f16001i
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        L17:
            wb.eo r3 = new wb.eo
            d1.v r0 = r2.f16001i
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f16000h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L21;
                case 1: goto L15;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.eo r2 = (wb.eo) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L15:
            wf.c r2 = r1.create(r2, r3)
            wb.eo r2 = (wb.eo) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L21:
            wf.c r2 = r1.create(r2, r3)
            wb.eo r2 = (wb.eo) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f16000h
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            f8.i.I0(r2)
            d1.v r2 = r1.f16001i
            d1.v.a(r2)
            sf.n r2 = sf.n.f12433a
            return r2
        L10:
            f8.i.I0(r2)
            d1.v r2 = r1.f16001i
            d1.v.a(r2)
            sf.n r2 = sf.n.f12433a
            return r2
        L1b:
            f8.i.I0(r2)
            d1.v r2 = r1.f16001i
            d1.v.a(r2)
            sf.n r2 = sf.n.f12433a
            return r2
    }
}
