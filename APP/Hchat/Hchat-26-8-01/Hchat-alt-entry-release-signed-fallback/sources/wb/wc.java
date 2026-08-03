package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wc implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ db.c f19928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f19929i;

    public /* synthetic */ wc(int r1, db.c r2, fg.l r3) {
            r0 = this;
            r0.f19927g = r1
            r0.f19928h = r2
            r0.f19929i = r3
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.f19927g
            r.d r4 = (r.d) r4
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            switch(r0) {
                case 0: goto L6e;
                case 1: goto L41;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L1b
            r4 = r1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L3b
            wb.qe r4 = new wb.qe
            r6 = 1
            db.c r0 = r3.f19928h
            fg.l r2 = r3.f19929i
            r4.<init>(r6, r0, r2)
            r6 = 587792467(0x23090053, float:7.4268535E-18)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L3e
        L3b:
            r5.V()
        L3e:
            sf.n r4 = sf.n.f12433a
            return r4
        L41:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L48
            r4 = r1
            goto L49
        L48:
            r4 = 0
        L49:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L68
            wb.qe r4 = new wb.qe
            r6 = 0
            db.c r0 = r3.f19928h
            fg.l r2 = r3.f19929i
            r4.<init>(r6, r0, r2)
            r6 = 66564087(0x3f7aff7, float:1.4557755E-36)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L6b
        L68:
            r5.V()
        L6b:
            sf.n r4 = sf.n.f12433a
            return r4
        L6e:
            r0 = 16
            r1 = 1
            if (r4 == r0) goto L75
            r4 = r1
            goto L76
        L75:
            r4 = 0
        L76:
            r6 = r6 & r1
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L95
            wb.qe r4 = new wb.qe
            r6 = 2
            db.c r0 = r3.f19928h
            fg.l r2 = r3.f19929i
            r4.<init>(r6, r0, r2)
            r6 = -1975213902(0xffffffff8a44a0b2, float:-9.46728E-33)
            s0.d r4 = s0.i.e(r6, r4, r5)
            r6 = 48
            r0 = 0
            wb.ho.C3(r0, r4, r5, r6, r1)
            goto L98
        L95:
            r5.V()
        L98:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
