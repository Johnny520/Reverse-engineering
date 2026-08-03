package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zi implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20633i;

    public /* synthetic */ zi(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f20631g = r2
            r0.f20632h = r1
            r0.f20633i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ zi(java.lang.Object r1, java.lang.Object r2, int r3, int r4) {
            r0 = this;
            r0.f20631g = r4
            r0.f20632h = r1
            r0.f20633i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
            r27 = this;
            r0 = r27
            int r1 = r0.f20631g
            switch(r1) {
                case 0: goto L240;
                case 1: goto L223;
                case 2: goto L206;
                case 3: goto L1e9;
                case 4: goto L1cb;
                case 5: goto L1ad;
                case 6: goto L11e;
                case 7: goto L101;
                case 8: goto Le2;
                case 9: goto Laf;
                case 10: goto L63;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f20632h
            fg.a r1 = (fg.a) r1
            java.lang.Object r2 = r0.f20633i
            s0.d r2 = (s0.d) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L23
            r5 = r7
            goto L24
        L23:
            r5 = 0
        L24:
            r4 = r4 & r7
            boolean r4 = r3.S(r4, r5)
            if (r4 == 0) goto L5d
            i0.m2 r4 = bi.g.f895a
            boolean r5 = r3.f(r1)
            java.lang.Object r6 = r3.P()
            if (r5 != 0) goto L3b
            i0.e r5 = i0.l.f5952a
            if (r6 != r5) goto L44
        L3b:
            xh.f r6 = new xh.f
            r5 = 1
            r6.<init>(r1, r5)
            r3.k0(r6)
        L44:
            fg.a r6 = (fg.a) r6
            i0.q1 r1 = r4.a(r6)
            bi.i r4 = new bi.i
            r5 = 4
            r4.<init>(r2, r5)
            r2 = 80198205(0x4c7ba3d, float:4.6955708E-36)
            s0.d r2 = s0.i.e(r2, r4, r3)
            r4 = 56
            i0.r.a(r1, r2, r3, r4)
            goto L60
        L5d:
            r3.V()
        L60:
            sf.n r1 = sf.n.f12433a
            return r1
        L63:
            java.lang.Object r1 = r0.f20632h
            xb.i r1 = (xb.i) r1
            java.lang.Object r2 = r0.f20633i
            s1.x r2 = (s1.x) r2
            r3 = r28
            s1.t r3 = (s1.t) r3
            r4 = r29
            e1.b r4 = (e1.b) r4
            r3.getClass()
            long r5 = r3.f12293c
            long r7 = r3.f12297g
            c9.u r3 = r1.f21484c
            e1.b r9 = new e1.b
            r9.<init>(r5)
            java.lang.Object r5 = r3.invoke(r9)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            e1.b r6 = new e1.b
            r6.<init>(r7)
            java.lang.Object r3 = r3.invoke(r6)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r5 == 0) goto Lac
            if (r3 == 0) goto Lac
            wb.k3 r3 = r1.f21486e
            s1.l0 r2 = (s1.l0) r2
            long r5 = r2.E
            u2.l r2 = new u2.l
            r2.<init>(r5)
            r3.b(r1, r2, r4)
        Lac:
            sf.n r1 = sf.n.f12433a
            return r1
        Laf:
            java.lang.Object r1 = r0.f20632h
            s0.d r1 = (s0.d) r1
            java.lang.Object r2 = r0.f20633i
            wb.n7 r2 = (wb.n7) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == r6) goto Lcc
            r5 = r8
            goto Lcd
        Lcc:
            r5 = r7
        Lcd:
            r4 = r4 & r8
            boolean r4 = r3.S(r4, r5)
            if (r4 == 0) goto Ldc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r1.b(r2, r3, r4)
            goto Ldf
        Ldc:
            r3.V()
        Ldf:
            sf.n r1 = sf.n.f12433a
            return r1
        Le2:
            java.lang.Object r1 = r0.f20632h
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r2 = r0.f20633i
            java.lang.String r2 = (java.lang.String) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 49
            int r4 = i0.r.C(r4)
            r1.V(r2, r3, r4)
        Lfe:
            sf.n r1 = sf.n.f12433a
            return r1
        L101:
            java.lang.Object r1 = r0.f20632h
            wb.y2 r1 = (wb.y2) r1
            java.lang.Object r2 = r0.f20633i
            y0.o r2 = (y0.o) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 55
            int r4 = i0.r.C(r4)
            r1.t0(r2, r3, r4)
            goto Lfe
        L11e:
            java.lang.Object r1 = r0.f20632h
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r0.f20633i
            x8.r r2 = (x8.r) r2
            r3 = r28
            x8.b r3 = (x8.b) r3
            r4 = r29
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r7 = r4.booleanValue()
            r3.getClass()
            java.lang.Object r4 = r1.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = tf.n.e1(r4)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L148:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L1a7
            java.lang.Object r6 = r4.next()
            x8.b r6 = (x8.b) r6
            java.lang.String r8 = r6.f21231a
            java.lang.String r9 = r3.f21231a
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L19c
            r24 = 0
            r25 = 524283(0x7fffb, float:7.34677E-40)
            r8 = r5
            r5 = r6
            r6 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r17 = r16
            r16 = 0
            r18 = r17
            r17 = 0
            r19 = r18
            r18 = 0
            r20 = r19
            r19 = 0
            r21 = r20
            r20 = 0
            r23 = r21
            r21 = 0
            r26 = r23
            r23 = 0
            r28 = r3
            r3 = r26
            x8.b r6 = x8.b.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25)
            goto L1a0
        L19c:
            r28 = r3
            r3 = r5
            r5 = r6
        L1a0:
            r3.add(r6)
            r5 = r3
            r3 = r28
            goto L148
        L1a7:
            r3 = r5
            wb.ho.B(r2, r1, r3)
            goto Lfe
        L1ad:
            java.lang.Object r1 = r0.f20632h
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r0.f20633i
            s0.d r2 = (s0.d) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 49
            int r4 = i0.r.C(r4)
            wb.ho.x1(r1, r2, r3, r4)
            goto Lfe
        L1cb:
            java.lang.Object r1 = r0.f20632h
            j8.i r1 = (j8.i) r1
            java.lang.Object r2 = r0.f20633i
            fg.l r2 = (fg.l) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 9
            int r4 = i0.r.C(r4)
            wb.ho.C0(r1, r2, r3, r4)
            goto Lfe
        L1e9:
            java.lang.Object r1 = r0.f20632h
            wb.t0 r1 = (wb.t0) r1
            java.lang.Object r2 = r0.f20633i
            fg.l r2 = (fg.l) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 1
            int r4 = i0.r.C(r4)
            wb.ho.Z0(r1, r2, r3, r4)
            goto Lfe
        L206:
            java.lang.Object r1 = r0.f20632h
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r2 = r0.f20633i
            fg.l r2 = (fg.l) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 1
            int r4 = i0.r.C(r4)
            wb.ho.o3(r1, r2, r3, r4)
            goto Lfe
        L223:
            java.lang.Object r1 = r0.f20632h
            wb.t5 r1 = (wb.t5) r1
            java.lang.Object r2 = r0.f20633i
            fg.a r2 = (fg.a) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 1
            int r4 = i0.r.C(r4)
            wb.ho.Z1(r1, r2, r3, r4)
            goto Lfe
        L240:
            java.lang.Object r1 = r0.f20632h
            wb.a3 r1 = (wb.a3) r1
            java.lang.Object r2 = r0.f20633i
            fg.l r2 = (fg.l) r2
            r3 = r28
            i0.h0 r3 = (i0.h0) r3
            r4 = r29
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = 1
            int r4 = i0.r.C(r4)
            wb.ho.D0(r1, r2, r3, r4)
            goto Lfe
    }
}
