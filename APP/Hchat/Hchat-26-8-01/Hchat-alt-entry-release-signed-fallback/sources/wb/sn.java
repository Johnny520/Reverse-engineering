package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class sn extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19122j;

    public /* synthetic */ sn(i0.a1 r1, wf.c r2, int r3) {
            r0 = this;
            r0.f19120h = r3
            r0.f19122j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r3 = r2.f19120h
            switch(r3) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            wb.sn r3 = new wb.sn
            i0.a1 r0 = r2.f19122j
            r1 = 1
            r3.<init>(r0, r4, r1)
            return r3
        Le:
            wb.sn r3 = new wb.sn
            i0.a1 r0 = r2.f19122j
            r1 = 0
            r3.<init>(r0, r4, r1)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f19120h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L17;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.sn r2 = (wb.sn) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            xf.a r2 = xf.a.f21579g
            return r2
        L17:
            wf.c r2 = r1.create(r2, r3)
            wb.sn r2 = (wb.sn) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.f19120h
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r1) {
                case 0: goto L50;
                default: goto Lb;
            }
        Lb:
            xf.a r1 = xf.a.f21579g
            int r5 = r0.f19121i
            if (r5 == 0) goto L18
            if (r5 != r4) goto L14
            goto L18
        L14:
            j8.o.A(r3)
            goto L4f
        L18:
            f8.i.I0(r20)
        L1b:
            i0.a1 r2 = r0.f19122j
            rb.k r3 = fb.v0.f3834a
            if (r3 == 0) goto L26
            rb.m r3 = r3.l()
            goto L3f
        L26:
            rb.m r5 = new rb.m
            tf.t r12 = tf.t.f13167g
            r17 = 0
            r18 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "等待检测"
            java.lang.String r9 = ""
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = r5
        L3f:
            og.k r5 = wb.ho.f16633a
            r2.setValue(r3)
            r0.f19121i = r4
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r2 = qg.v.f(r2, r0)
            if (r2 != r1) goto L1b
            r2 = r1
        L4f:
            return r2
        L50:
            i0.a1 r1 = r0.f19122j
            xf.a r5 = xf.a.f21579g
            int r6 = r0.f19121i
            if (r6 == 0) goto L62
            if (r6 != r4) goto L5e
            f8.i.I0(r20)
            goto L7f
        L5e:
            j8.o.A(r3)
            goto L96
        L62:
            f8.i.I0(r20)
        L65:
            og.k r2 = wb.ho.f16633a
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 <= 0) goto L94
            r0.f19121i = r4
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r2 = qg.v.f(r2, r0)
            if (r2 != r5) goto L7f
            r2 = r5
            goto L96
        L7f:
            og.k r2 = wb.ho.f16633a
            java.lang.Object r2 = r1.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r2 = r2 - r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.setValue(r2)
            goto L65
        L94:
            sf.n r2 = sf.n.f12433a
        L96:
            return r2
    }
}
