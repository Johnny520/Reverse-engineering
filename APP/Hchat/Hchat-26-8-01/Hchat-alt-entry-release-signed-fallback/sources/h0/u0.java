package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0.d1 f5001j;

    public /* synthetic */ u0(h0.d1 r1, wf.c r2, int r3) {
            r0 = this;
            r0.f4999h = r3
            r0.f5001j = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f4999h
            switch(r0) {
                case 0: goto L17;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            h0.u0 r4 = new h0.u0
            h0.d1 r0 = r3.f5001j
            r1 = 2
            r4.<init>(r0, r5, r1)
            return r4
        Le:
            h0.u0 r4 = new h0.u0
            h0.d1 r0 = r3.f5001j
            r1 = 1
            r4.<init>(r0, r5, r1)
            return r4
        L17:
            h0.u0 r0 = new h0.u0
            h0.d1 r1 = r3.f5001j
            r2 = 0
            r0.<init>(r1, r5, r2)
            e1.b r4 = (e1.b) r4
            long r4 = r4.f2294a
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f4999h
            switch(r0) {
                case 0: goto L27;
                case 1: goto L16;
                default: goto L5;
            }
        L5:
            qg.t r3 = (qg.t) r3
            wf.c r4 = (wf.c) r4
            wf.c r3 = r2.create(r3, r4)
            h0.u0 r3 = (h0.u0) r3
            sf.n r4 = sf.n.f12433a
            java.lang.Object r3 = r3.invokeSuspend(r4)
            return r3
        L16:
            qg.t r3 = (qg.t) r3
            wf.c r4 = (wf.c) r4
            wf.c r3 = r2.create(r3, r4)
            h0.u0 r3 = (h0.u0) r3
            sf.n r4 = sf.n.f12433a
            java.lang.Object r3 = r3.invokeSuspend(r4)
            return r3
        L27:
            e1.b r3 = (e1.b) r3
            long r0 = r3.f2294a
            wf.c r4 = (wf.c) r4
            h0.u0 r3 = new h0.u0
            h0.d1 r0 = r2.f5001j
            r1 = 0
            r3.<init>(r0, r4, r1)
            sf.n r4 = sf.n.f12433a
            java.lang.Object r3 = r3.invokeSuspend(r4)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
            r46 = this;
            r0 = r46
            int r1 = r0.f4999h
            w.h0 r2 = w.h0.f14484g
            r3 = 2
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            xf.a r5 = xf.a.f21579g
            r6 = 1
            h0.d1 r7 = r0.f5001j
            sf.n r8 = sf.n.f12433a
            switch(r1) {
                case 0: goto L3e3;
                case 1: goto L348;
                default: goto L13;
            }
        L13:
            int r1 = r0.f5000i
            if (r1 == 0) goto L2e
            if (r1 == r6) goto L28
            if (r1 != r3) goto L22
            f8.i.I0(r47)
            r1 = r47
            goto L2d4
        L22:
            j8.o.A(r4)
            r5 = 0
            goto L347
        L28:
            f8.i.I0(r47)
            r4 = r47
            goto L50
        L2e:
            f8.i.I0(r47)
            y1.y0 r1 = r7.f4853g
            if (r1 == 0) goto L346
            r0.f5000i = r6
            y1.h r1 = (y1.h) r1
            y1.i r1 = r1.f21918a
            android.content.ClipboardManager r1 = r1.a()
            android.content.ClipData r1 = r1.getPrimaryClip()
            if (r1 == 0) goto L4b
            y1.x0 r4 = new y1.x0
            r4.<init>(r1)
            goto L4c
        L4b:
            r4 = 0
        L4c:
            if (r4 != r5) goto L50
            goto L347
        L50:
            y1.x0 r4 = (y1.x0) r4
            if (r4 == 0) goto L346
            r0.f5000i = r3
            android.content.ClipData r1 = r4.f22151a
            r4 = 0
            android.content.ClipData$Item r1 = r1.getItemAt(r4)
            if (r1 == 0) goto L2d0
            java.lang.CharSequence r1 = r1.getText()
            if (r1 == 0) goto L2d0
            boolean r10 = r1 instanceof android.text.Spanned
            if (r10 != 0) goto L75
            i2.g r3 = new i2.g
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            r1 = r3
            goto L2d1
        L75:
            r10 = r1
            android.text.Spanned r10 = (android.text.Spanned) r10
            int r11 = r10.length()
            java.lang.Class<android.text.Annotation> r12 = android.text.Annotation.class
            java.lang.Object[] r11 = r10.getSpans(r4, r11, r12)
            android.text.Annotation[] r11 = (android.text.Annotation[]) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.getClass()
            int r13 = r11.length
            int r13 = r13 - r6
            if (r13 < 0) goto L2b9
            r14 = r4
        L91:
            r15 = r11[r14]
            java.lang.String r9 = r15.getKey()
            java.lang.String r3 = "androidx.compose.text.SpanStyle"
            boolean r3 = gg.l.a(r9, r3)
            if (r3 != 0) goto La8
            r47 = r1
            r17 = r4
            r16 = r10
            r15 = r11
            goto L2aa
        La8:
            int r3 = r10.getSpanStart(r15)
            int r9 = r10.getSpanEnd(r15)
            o.a r6 = new o.a
            java.lang.String r15 = r15.getValue()
            r6.<init>()
            r47 = r1
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r6.f9467a = r1
            byte[] r15 = android.util.Base64.decode(r15, r4)
            r16 = r10
            int r10 = r15.length
            r1.unmarshall(r15, r4, r10)
            r1.setDataPosition(r4)
            android.os.Parcel r1 = r6.f9467a
            long r17 = f1.w.f3131g
            long r19 = u2.o.f13359c
            r22 = r17
            r36 = r22
            r24 = r19
            r31 = r24
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r33 = 0
            r34 = 0
            r38 = 0
            r39 = 0
        Lec:
            int r10 = r1.dataAvail()
            r15 = 1
            if (r10 <= r15) goto L290
            byte r10 = r1.readByte()
            r17 = r4
            r4 = 8
            if (r10 != r15) goto L10d
            int r10 = r1.dataAvail()
            if (r10 < r4) goto L10a
            long r22 = r6.a()
        L107:
            r4 = r17
            goto Lec
        L10a:
            r15 = r11
            goto L294
        L10d:
            r15 = 5
            r4 = 2
            if (r10 != r4) goto L11c
            int r4 = r1.dataAvail()
            if (r4 < r15) goto L10a
            long r24 = r6.b()
            goto L107
        L11c:
            r4 = 3
            r15 = 4
            if (r10 != r4) goto L132
            int r4 = r1.dataAvail()
            if (r4 < r15) goto L10a
            m2.k r4 = new m2.k
            int r10 = r1.readInt()
            r4.<init>(r10)
            r26 = r4
            goto L107
        L132:
            if (r10 != r15) goto L14f
            int r4 = r1.dataAvail()
            r10 = 1
            if (r4 < r10) goto L10a
            byte r4 = r1.readByte()
            if (r4 != 0) goto L144
        L141:
            r4 = r17
            goto L147
        L144:
            if (r4 != r10) goto L141
            r4 = r10
        L147:
            m2.i r15 = new m2.i
            r15.<init>(r4)
            r27 = r15
            goto L107
        L14f:
            r4 = 5
            r15 = 1
            if (r10 != r4) goto L179
            int r4 = r1.dataAvail()
            if (r4 < r15) goto L10a
            byte r4 = r1.readByte()
            if (r4 != 0) goto L162
        L15f:
            r4 = r17
            goto L171
        L162:
            if (r4 != r15) goto L168
            r4 = 65535(0xffff, float:9.1834E-41)
            goto L171
        L168:
            r10 = 3
            if (r4 != r10) goto L16d
            r4 = 2
            goto L171
        L16d:
            r10 = 2
            if (r4 != r10) goto L15f
            r4 = 1
        L171:
            m2.j r10 = new m2.j
            r10.<init>(r4)
            r28 = r10
            goto L107
        L179:
            r4 = 6
            if (r10 != r4) goto L181
            java.lang.String r30 = r1.readString()
            goto L107
        L181:
            r4 = 7
            if (r10 != r4) goto L191
            int r4 = r1.dataAvail()
            r10 = 5
            if (r4 < r10) goto L10a
            long r31 = r6.b()
            goto L107
        L191:
            r4 = 8
            if (r10 != r4) goto L1a9
            int r4 = r1.dataAvail()
            r10 = 4
            if (r4 < r10) goto L10a
            float r4 = r1.readFloat()
            t2.a r10 = new t2.a
            r10.<init>(r4)
            r33 = r10
            goto L107
        L1a9:
            r15 = 9
            if (r10 != r15) goto L1c4
            int r10 = r1.dataAvail()
            if (r10 < r4) goto L10a
            t2.p r4 = new t2.p
            float r10 = r1.readFloat()
            float r15 = r1.readFloat()
            r4.<init>(r10, r15)
            r34 = r4
            goto L107
        L1c4:
            r15 = 10
            if (r10 != r15) goto L1d4
            int r10 = r1.dataAvail()
            if (r10 < r4) goto L10a
            long r36 = r6.a()
            goto L107
        L1d4:
            r4 = 11
            if (r10 != r4) goto L24a
            int r4 = r1.dataAvail()
            r10 = 4
            if (r4 < r10) goto L10a
            int r4 = r1.readInt()
            r10 = r4 & 2
            if (r10 == 0) goto L1e9
            r10 = 1
            goto L1eb
        L1e9:
            r10 = r17
        L1eb:
            r4 = r4 & 1
            if (r4 == 0) goto L1f1
            r4 = 1
            goto L1f3
        L1f1:
            r4 = r17
        L1f3:
            t2.l r15 = t2.l.f13017d
            r18 = r1
            t2.l r1 = t2.l.f13016c
            if (r10 == 0) goto L237
            if (r4 == 0) goto L237
            t2.l[] r1 = new t2.l[]{r15, r1}
            java.util.List r1 = a.a.y0(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            int r10 = r1.size()
            r15 = r17
        L20f:
            if (r15 >= r10) goto L22b
            java.lang.Object r19 = r1.get(r15)
            r20 = r1
            r1 = r19
            t2.l r1 = (t2.l) r1
            int r4 = r4.intValue()
            int r1 = r1.f13018a
            r1 = r1 | r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r15 = r15 + 1
            r1 = r20
            goto L20f
        L22b:
            int r1 = r4.intValue()
            t2.l r4 = new t2.l
            r4.<init>(r1)
            r38 = r4
            goto L244
        L237:
            if (r10 == 0) goto L23c
            r38 = r15
            goto L244
        L23c:
            if (r4 == 0) goto L241
        L23e:
            r38 = r1
            goto L244
        L241:
            t2.l r1 = t2.l.f13015b
            goto L23e
        L244:
            r4 = r17
            r1 = r18
            goto Lec
        L24a:
            r18 = r1
            r1 = 12
            if (r10 != r1) goto L244
            int r1 = r18.dataAvail()
            r4 = 20
            if (r1 < r4) goto L10a
            f1.q0 r40 = new f1.q0
            long r42 = r6.a()
            float r1 = r18.readFloat()
            float r4 = r18.readFloat()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r15 = r11
            long r10 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r4)
            r19 = r10
            long r10 = (long) r1
            r1 = 32
            long r19 = r19 << r1
            r44 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r44
            long r44 = r19 | r10
            float r41 = r18.readFloat()
            r40.<init>(r41, r42, r44)
            r11 = r15
            r4 = r17
            r1 = r18
            r39 = r40
            goto Lec
        L290:
            r17 = r4
            goto L10a
        L294:
            i2.f0 r21 = new i2.f0
            r40 = 49152(0xc000, float:6.8877E-41)
            r29 = 0
            r35 = 0
            r21.<init>(r22, r24, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r38, r39, r40)
            r1 = r21
            i2.e r4 = new i2.e
            r4.<init>(r3, r9, r1)
            r12.add(r4)
        L2aa:
            if (r14 == r13) goto L2bb
            int r14 = r14 + 1
            r1 = r47
            r11 = r15
            r10 = r16
            r4 = r17
            r3 = 2
            r6 = 1
            goto L91
        L2b9:
            r47 = r1
        L2bb:
            i2.g r1 = new i2.g
            java.lang.String r3 = r47.toString()
            i2.g r4 = i2.h.f6321a
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L2cb
            r9 = 0
            goto L2cc
        L2cb:
            r9 = r12
        L2cc:
            r1.<init>(r9, r3)
            goto L2d1
        L2d0:
            r1 = 0
        L2d1:
            if (r1 != r5) goto L2d4
            goto L347
        L2d4:
            i2.g r1 = (i2.g) r1
            if (r1 != 0) goto L2d9
            goto L346
        L2d9:
            boolean r3 = r7.j()
            if (r3 != 0) goto L2e0
            goto L346
        L2e0:
            n2.s r3 = r7.n()
            n2.s r4 = r7.n()
            i2.g r4 = r4.f8976a
            java.lang.String r4 = r4.f6314h
            int r4 = r4.length()
            i2.g r3 = ig.a.C(r3, r4)
            i2.d r4 = new i2.d
            r4.<init>(r3)
            r4.a(r1)
            i2.g r3 = r4.e()
            n2.s r4 = r7.n()
            n2.s r5 = r7.n()
            i2.g r5 = r5.f8976a
            java.lang.String r5 = r5.f6314h
            int r5 = r5.length()
            i2.g r4 = ig.a.B(r4, r5)
            i2.d r5 = new i2.d
            r5.<init>(r3)
            r5.a(r4)
            i2.g r3 = r5.e()
            n2.s r4 = r7.n()
            long r4 = r4.f8977b
            int r4 = i2.m0.f(r4)
            java.lang.String r1 = r1.f6314h
            int r1 = r1.length()
            int r1 = r1 + r4
            long r4 = i2.e0.b(r1, r1)
            n2.s r1 = h0.d1.e(r3, r4)
            fg.l r3 = r7.f4849c
            r3.invoke(r1)
            r7.q(r2)
            w.q1 r1 = r7.f4847a
            r15 = 1
            r1.f14630e = r15
        L346:
            r5 = r8
        L347:
            return r5
        L348:
            r15 = r6
            int r1 = r0.f5000i
            if (r1 == 0) goto L35b
            if (r1 != r15) goto L355
            f8.i.I0(r47)
        L352:
            r5 = r8
            goto L3e2
        L355:
            j8.o.A(r4)
            r5 = 0
            goto L3e2
        L35b:
            f8.i.I0(r47)
            n2.s r1 = r7.n()
            long r3 = r1.f8977b
            boolean r1 = i2.m0.c(r3)
            if (r1 != 0) goto L3cc
            boolean r1 = r7.j()
            if (r1 == 0) goto L3cc
            n2.s r1 = r7.n()
            i2.g r9 = ig.a.z(r1)
            n2.s r1 = r7.n()
            n2.s r3 = r7.n()
            i2.g r3 = r3.f8976a
            java.lang.String r3 = r3.f6314h
            int r3 = r3.length()
            i2.g r1 = ig.a.C(r1, r3)
            n2.s r3 = r7.n()
            n2.s r4 = r7.n()
            i2.g r4 = r4.f8976a
            java.lang.String r4 = r4.f6314h
            int r4 = r4.length()
            i2.g r3 = ig.a.B(r3, r4)
            i2.d r4 = new i2.d
            r4.<init>(r1)
            r4.a(r3)
            i2.g r1 = r4.e()
            n2.s r3 = r7.n()
            long r3 = r3.f8977b
            int r3 = i2.m0.f(r3)
            long r3 = i2.e0.b(r3, r3)
            n2.s r1 = h0.d1.e(r1, r3)
            fg.l r3 = r7.f4849c
            r3.invoke(r1)
            r7.q(r2)
            w.q1 r1 = r7.f4847a
            r15 = 1
            r1.f14630e = r15
            goto L3ce
        L3cc:
            r15 = 1
            r9 = 0
        L3ce:
            if (r9 != 0) goto L3d1
            goto L352
        L3d1:
            y1.y0 r1 = r7.f4853g
            if (r1 == 0) goto L352
            y1.x0 r2 = o.d.a(r9)
            r0.f5000i = r15
            y1.h r1 = (y1.h) r1
            r1.a(r2)
            if (r8 != r5) goto L352
        L3e2:
            return r5
        L3e3:
            r15 = r6
            int r1 = r0.f5000i
            if (r1 == 0) goto L3fb
            if (r1 == r15) goto L3f7
            r10 = 2
            if (r1 != r10) goto L3f2
            f8.i.I0(r47)
        L3f0:
            r5 = r8
            goto L447
        L3f2:
            j8.o.A(r4)
            r5 = 0
            goto L447
        L3f7:
            f8.i.I0(r47)
            goto L407
        L3fb:
            f8.i.I0(r47)
            r0.f5000i = r15
            java.lang.Object r1 = r7.s(r0)
            if (r1 != r5) goto L407
            goto L447
        L407:
            sf.e r1 = h0.d1.a(r7)
            if (r1 == 0) goto L3f0
            java.lang.Object r2 = r1.f12418g
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r1 = r1.f12419h
            i2.m0 r1 = (i2.m0) r1
            long r12 = r1.f6360a
            h0.p r10 = r7.f4855i
            if (r10 == 0) goto L3f0
            r4 = 2
            r0.f5000i = r4
            int r1 = r11.length()
            if (r1 != 0) goto L426
            goto L42c
        L426:
            boolean r1 = i2.m0.c(r12)
            if (r1 == 0) goto L42e
        L42c:
            r1 = r8
            goto L441
        L42e:
            c0.i r9 = new c0.i
            r14 = 0
            r15 = 2
            r9.<init>(r10, r11, r12, r14, r15)
            wf.g r1 = r10.f4960a
            ci.e r2 = new ci.e
            r3 = 0
            r2.<init>(r10, r9, r3)
            java.lang.Object r1 = qg.v.x(r1, r2, r0)
        L441:
            if (r1 != r5) goto L444
            goto L445
        L444:
            r1 = r8
        L445:
            if (r1 != r5) goto L3f0
        L447:
            return r5
    }
}
