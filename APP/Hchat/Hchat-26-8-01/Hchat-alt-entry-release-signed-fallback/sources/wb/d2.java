package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f15598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15600k;

    public /* synthetic */ d2(java.util.List r1, i0.a1 r2, i0.a1 r3, wf.c r4, int r5) {
            r0 = this;
            r0.f15597h = r5
            r0.f15598i = r1
            r0.f15599j = r2
            r0.f15600k = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r8, wf.c r9) {
            r7 = this;
            int r8 = r7.f15597h
            switch(r8) {
                case 0: goto L2f;
                case 1: goto L21;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            wb.d2 r0 = new wb.d2
            i0.a1 r3 = r7.f15600k
            r5 = 3
            java.util.List r1 = r7.f15598i
            i0.a1 r2 = r7.f15599j
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r5 = r9
            wb.d2 r1 = new wb.d2
            i0.a1 r4 = r7.f15600k
            r6 = 2
            java.util.List r2 = r7.f15598i
            i0.a1 r3 = r7.f15599j
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L21:
            r5 = r9
            wb.d2 r1 = new wb.d2
            i0.a1 r4 = r7.f15600k
            r6 = 1
            java.util.List r2 = r7.f15598i
            i0.a1 r3 = r7.f15599j
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L2f:
            r5 = r9
            wb.d2 r1 = new wb.d2
            i0.a1 r4 = r7.f15600k
            r6 = 0
            java.util.List r2 = r7.f15598i
            i0.a1 r3 = r7.f15599j
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f15597h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L21;
                case 2: goto L15;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.d2 r2 = (wb.d2) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L15:
            wf.c r2 = r1.create(r2, r3)
            wb.d2 r2 = (wb.d2) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L21:
            wf.c r2 = r1.create(r2, r3)
            wb.d2 r2 = (wb.d2) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L2d:
            wf.c r2 = r1.create(r2, r3)
            wb.d2 r2 = (wb.d2) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f15597h
            wb.t0 r1 = wb.t0.f19153l
            java.lang.String r2 = ""
            sf.n r3 = sf.n.f12433a
            java.util.List r4 = r7.f15598i
            i0.a1 r5 = r7.f15599j
            i0.a1 r6 = r7.f15600k
            switch(r0) {
                case 0: goto L8a;
                case 1: goto L47;
                case 2: goto L38;
                default: goto L11;
            }
        L11:
            f8.i.I0(r8)
            java.lang.Object r8 = r5.getValue()
            wb.iv r8 = (wb.iv) r8
            wb.iv r0 = wb.iv.f16936m
            if (r8 != r0) goto L37
            java.lang.Object r8 = r6.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = og.m.t0(r8)
            if (r8 == 0) goto L37
            java.lang.Object r8 = tf.m.v1(r4)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L33
            goto L34
        L33:
            r2 = r8
        L34:
            r6.setValue(r2)
        L37:
            return r3
        L38:
            f8.i.I0(r8)
            java.lang.Object r8 = r5.getValue()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L46
            r6.setValue(r4)
        L46:
            return r3
        L47:
            f8.i.I0(r8)
            og.k r8 = wb.ho.f16633a
            java.lang.Object r8 = r5.getValue()
            wb.t0 r8 = (wb.t0) r8
            if (r8 != r1) goto L7a
            java.lang.Object r8 = r6.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = og.m.t0(r8)
            if (r8 != 0) goto L6c
            java.lang.Object r8 = r6.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r4.contains(r8)
            if (r8 != 0) goto L89
        L6c:
            java.lang.Object r8 = tf.m.v1(r4)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L75
            goto L76
        L75:
            r2 = r8
        L76:
            r6.setValue(r2)
            goto L89
        L7a:
            java.lang.Object r8 = r6.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = og.m.t0(r8)
            if (r8 != 0) goto L89
            r6.setValue(r2)
        L89:
            return r3
        L8a:
            f8.i.I0(r8)
            wb.h2 r8 = wb.h2.f16481a
            java.lang.Object r8 = r5.getValue()
            wb.t0 r8 = (wb.t0) r8
            if (r8 != r1) goto Lbd
            java.lang.Object r8 = r6.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = og.m.t0(r8)
            if (r8 != 0) goto Laf
            java.lang.Object r8 = r6.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r4.contains(r8)
            if (r8 != 0) goto Lcc
        Laf:
            java.lang.Object r8 = tf.m.v1(r4)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto Lb8
            goto Lb9
        Lb8:
            r2 = r8
        Lb9:
            r6.setValue(r2)
            goto Lcc
        Lbd:
            java.lang.Object r8 = r6.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = og.m.t0(r8)
            if (r8 != 0) goto Lcc
            r6.setValue(r2)
        Lcc:
            return r3
    }
}
