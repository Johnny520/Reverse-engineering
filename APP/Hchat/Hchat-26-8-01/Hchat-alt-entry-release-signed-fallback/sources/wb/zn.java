package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class zn extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s1.t f20683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f20686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ wb.c0 f20687l;

    public /* synthetic */ zn(fg.l r1, wb.c0 r2, wf.c r3, int r4) {
            r0 = this;
            r0.f20682g = r4
            r0.f20686k = r1
            r0.f20687l = r2
            r0.<init>(r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            int r0 = r4.f20682g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            wb.zn r0 = new wb.zn
            wb.c0 r1 = r4.f20687l
            r2 = 1
            fg.l r3 = r4.f20686k
            r0.<init>(r3, r1, r6, r2)
            r0.f20685j = r5
            return r0
        L12:
            wb.zn r0 = new wb.zn
            wb.c0 r1 = r4.f20687l
            r2 = 0
            fg.l r3 = r4.f20686k
            r0.<init>(r3, r1, r6, r2)
            r0.f20685j = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f20682g
            s1.k0 r2 = (s1.k0) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.zn r2 = (wb.zn) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            wb.zn r2 = (wb.zn) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.f20682g
            switch(r1) {
                case 0: goto Lb4;
                default: goto L7;
            }
        L7:
            wb.c0 r1 = r0.f20687l
            float r2 = r1.f15330c
            float r1 = r1.f15329b
            java.lang.Object r3 = r0.f20685j
            s1.k0 r3 = (s1.k0) r3
            int r4 = r0.f20684i
            fg.l r5 = r0.f20686k
            r6 = 2
            r7 = 1
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            xf.a r10 = xf.a.f21579g
            if (r4 == 0) goto L3a
            if (r4 == r7) goto L34
            if (r4 != r6) goto L2c
            s1.t r4 = r0.f20683h
            f8.i.I0(r18)
            r7 = r18
            goto L6f
        L2c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r10 = 0
            goto Lb3
        L34:
            f8.i.I0(r18)
            r4 = r18
            goto L48
        L3a:
            f8.i.I0(r18)
            r0.f20685j = r3
            r0.f20684i = r7
            java.lang.Object r4 = m.y2.b(r3, r0, r6)
            if (r4 != r10) goto L48
            goto Lb3
        L48:
            s1.t r4 = (s1.t) r4
            long r11 = r4.f12293c
            long r11 = r11 & r8
            int r7 = (int) r11
            float r7 = java.lang.Float.intBitsToFloat(r7)
            s1.l0 r11 = r3.f12273l
            long r11 = r11.E
            long r11 = r11 & r8
            int r11 = (int) r11
            float r11 = (float) r11
            java.lang.String r7 = wb.ho.x4(r1, r2, r7, r11)
            r5.invoke(r7)
        L60:
            r0.f20685j = r3
            r0.f20683h = r4
            r0.f20684i = r6
            s1.l r7 = s1.l.f12275h
            java.lang.Object r7 = r3.e(r7, r0)
            if (r7 != r10) goto L6f
            goto Lb3
        L6f:
            s1.k r7 = (s1.k) r7
            java.lang.Object r7 = r7.f12262a
            java.util.Iterator r7 = r7.iterator()
        L77:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L8f
            java.lang.Object r11 = r7.next()
            r12 = r11
            s1.t r12 = (s1.t) r12
            long r12 = r12.f12291a
            long r14 = r4.f12291a
            boolean r12 = s1.s.e(r12, r14)
            if (r12 == 0) goto L77
            goto L90
        L8f:
            r11 = 0
        L90:
            s1.t r11 = (s1.t) r11
            if (r11 == 0) goto Lb1
            long r12 = r11.f12293c
            long r12 = r12 & r8
            int r7 = (int) r12
            float r7 = java.lang.Float.intBitsToFloat(r7)
            s1.l0 r12 = r3.f12273l
            long r12 = r12.E
            long r12 = r12 & r8
            int r12 = (int) r12
            float r12 = (float) r12
            java.lang.String r7 = wb.ho.x4(r1, r2, r7, r12)
            r5.invoke(r7)
            r11.a()
            boolean r7 = r11.f12294d
            if (r7 != 0) goto L60
        Lb1:
            sf.n r10 = sf.n.f12433a
        Lb3:
            return r10
        Lb4:
            wb.c0 r1 = r0.f20687l
            float r1 = r1.f15328a
            java.lang.Object r2 = r0.f20685j
            s1.k0 r2 = (s1.k0) r2
            int r3 = r0.f20684i
            r6 = 32
            fg.l r7 = r0.f20686k
            r8 = 2
            r9 = 1
            xf.a r10 = xf.a.f21579g
            if (r3 == 0) goto Le7
            if (r3 == r9) goto Le1
            if (r3 != r8) goto Ld9
            s1.t r3 = r0.f20683h
            f8.i.I0(r18)
            r4 = r18
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L11f
        Ld9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r10 = 0
            goto L164
        Le1:
            f8.i.I0(r18)
            r3 = r18
            goto Lf5
        Le7:
            f8.i.I0(r18)
            r0.f20685j = r2
            r0.f20684i = r9
            java.lang.Object r3 = m.y2.b(r2, r0, r8)
            if (r3 != r10) goto Lf5
            goto L164
        Lf5:
            s1.t r3 = (s1.t) r3
            long r11 = r3.f12293c
            s1.l0 r9 = r2.f12273l
            long r13 = r9.E
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r13 >> r6
            int r4 = (int) r4
            float r4 = (float) r4
            long r13 = r13 & r15
            int r5 = (int) r13
            float r5 = (float) r5
            java.lang.String r4 = wb.ho.y4(r1, r4, r5, r11)
            r7.invoke(r4)
        L110:
            r0.f20685j = r2
            r0.f20683h = r3
            r0.f20684i = r8
            s1.l r4 = s1.l.f12275h
            java.lang.Object r4 = r2.e(r4, r0)
            if (r4 != r10) goto L11f
            goto L164
        L11f:
            s1.k r4 = (s1.k) r4
            java.lang.Object r4 = r4.f12262a
            java.util.Iterator r4 = r4.iterator()
        L127:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L13f
            java.lang.Object r5 = r4.next()
            r9 = r5
            s1.t r9 = (s1.t) r9
            long r11 = r9.f12291a
            long r13 = r3.f12291a
            boolean r9 = s1.s.e(r11, r13)
            if (r9 == 0) goto L127
            goto L140
        L13f:
            r5 = 0
        L140:
            s1.t r5 = (s1.t) r5
            if (r5 == 0) goto L162
            long r11 = r5.f12293c
            s1.l0 r4 = r2.f12273l
            long r13 = r4.E
            long r8 = r13 >> r6
            int r8 = (int) r8
            float r8 = (float) r8
            long r13 = r13 & r15
            int r9 = (int) r13
            float r9 = (float) r9
            java.lang.String r8 = wb.ho.y4(r1, r8, r9, r11)
            r7.invoke(r8)
            r5.a()
            boolean r5 = r5.f12294d
            if (r5 != 0) goto L160
            goto L162
        L160:
            r8 = 2
            goto L110
        L162:
            sf.n r10 = sf.n.f12433a
        L164:
            return r10
    }
}
