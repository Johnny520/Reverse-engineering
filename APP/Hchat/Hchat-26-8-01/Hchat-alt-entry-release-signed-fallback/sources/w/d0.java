package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s1.x f14434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w.y0 f14435k;

    public /* synthetic */ d0(s1.x r1, w.y0 r2, wf.c r3, int r4) {
            r0 = this;
            r0.f14432h = r4
            r0.f14434j = r1
            r0.f14435k = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r4 = r3.f14432h
            switch(r4) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            w.d0 r4 = new w.d0
            w.y0 r0 = r3.f14435k
            r1 = 2
            s1.x r2 = r3.f14434j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L10:
            w.d0 r4 = new w.d0
            w.y0 r0 = r3.f14435k
            r1 = 1
            s1.x r2 = r3.f14434j
            r4.<init>(r2, r0, r5, r1)
            return r4
        L1b:
            w.d0 r4 = new w.d0
            w.y0 r0 = r3.f14435k
            r1 = 0
            s1.x r2 = r3.f14434j
            r4.<init>(r2, r0, r5, r1)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f14432h
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L23;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            w.d0 r2 = (w.d0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            w.d0 r2 = (w.d0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            w.d0 r2 = (w.d0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.f14432h
            r2 = 0
            w.y0 r3 = r0.f14435k
            s1.x r4 = r0.f14434j
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            xf.a r6 = xf.a.f21579g
            sf.n r7 = sf.n.f12433a
            r8 = 1
            r9 = 0
            switch(r1) {
                case 0: goto L93;
                case 1: goto L6d;
                default: goto L14;
            }
        L14:
            int r1 = r0.f14433i
            if (r1 == 0) goto L24
            if (r1 != r8) goto L1f
            f8.i.I0(r18)
        L1d:
            r6 = r7
            goto L6c
        L1f:
            j8.o.A(r5)
            r6 = r9
            goto L6c
        L24:
            f8.i.I0(r18)
            r0.f14433i = r8
            h0.y r1 = new h0.y
            r5 = 2
            r1.<init>(r3, r5)
            w.t0 r9 = new w.t0
            r9.<init>(r3, r2)
            w.t0 r14 = new w.t0
            r14.<init>(r3, r8)
            b0.t r13 = new b0.t
            r2 = 23
            r13.<init>(r3, r2)
            float r2 = m.j0.f8216a
            f0.h r12 = new f0.h
            r12.<init>(r1, r5)
            b0.d0 r15 = new b0.d0
            r1 = 25
            r15.<init>(r9, r1)
            k.s1 r11 = new k.s1
            r11.<init>(r5)
            ci.d r10 = new ci.d
            r16 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = a.a.n(r4, r10, r0)
            if (r1 != r6) goto L61
            goto L62
        L61:
            r1 = r7
        L62:
            if (r1 != r6) goto L65
            goto L66
        L65:
            r1 = r7
        L66:
            if (r1 != r6) goto L69
            goto L6a
        L69:
            r1 = r7
        L6a:
            if (r1 != r6) goto L1d
        L6c:
            return r6
        L6d:
            int r1 = r0.f14433i
            if (r1 == 0) goto L7d
            if (r1 != r8) goto L78
            f8.i.I0(r18)
        L76:
            r6 = r7
            goto L92
        L78:
            j8.o.A(r5)
            r6 = r9
            goto L92
        L7d:
            f8.i.I0(r18)
            r0.f14433i = r8
            d9.k r1 = new d9.k
            r2 = 4
            r1.<init>(r3, r9, r2)
            java.lang.Object r1 = a.a.n(r4, r1, r0)
            if (r1 != r6) goto L8f
            goto L90
        L8f:
            r1 = r7
        L90:
            if (r1 != r6) goto L76
        L92:
            return r6
        L93:
            int r1 = r0.f14433i
            if (r1 == 0) goto La2
            if (r1 != r8) goto L9d
            f8.i.I0(r18)
            goto Lb7
        L9d:
            j8.o.A(r5)
            r6 = r9
            goto Lb8
        La2:
            f8.i.I0(r18)
            r0.f14433i = r8
            w.u0 r1 = new w.u0
            r1.<init>(r4, r3, r9, r2)
            java.lang.Object r1 = qg.v.e(r1, r0)
            if (r1 != r6) goto Lb3
            goto Lb4
        Lb3:
            r1 = r7
        Lb4:
            if (r1 != r6) goto Lb7
            goto Lb8
        Lb7:
            r6 = r7
        Lb8:
            return r6
    }
}
