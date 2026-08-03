package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6405g;

    public /* synthetic */ y(int r1) {
            r0 = this;
            r0.f6405g = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22) {
            r20 = this;
            r0 = r21
            r1 = r20
            int r2 = r1.f6405g
            r3 = 0
            r4 = 0
            r5 = 2
            sf.n r6 = sf.n.f12433a
            r7 = 1
            switch(r2) {
                case 0: goto L361;
                case 1: goto L358;
                case 2: goto L2c8;
                case 3: goto L29f;
                case 4: goto L27b;
                case 5: goto L26e;
                case 6: goto L261;
                case 7: goto L23f;
                case 8: goto L232;
                case 9: goto L221;
                case 10: goto L20a;
                case 11: goto L1ff;
                case 12: goto L1f4;
                case 13: goto L1ea;
                case 14: goto L1cb;
                case 15: goto L1b8;
                case 16: goto L19d;
                case 17: goto L182;
                case 18: goto L167;
                case 19: goto L14c;
                case 20: goto L131;
                case 21: goto L110;
                case 22: goto Le1;
                case 23: goto Lce;
                case 24: goto Lbe;
                case 25: goto Lae;
                case 26: goto L46;
                case 27: goto L43;
                case 28: goto L30;
                default: goto Lf;
            }
        Lf:
            r2 = r22
            wf.e r2 = (wf.e) r2
            boolean r4 = r2 instanceof i0.o2
            if (r4 == 0) goto L2f
            boolean r4 = r0 instanceof java.lang.Integer
            if (r4 == 0) goto L1e
            r3 = r0
            java.lang.Integer r3 = (java.lang.Integer) r3
        L1e:
            if (r3 == 0) goto L25
            int r0 = r3.intValue()
            goto L26
        L25:
            r0 = r7
        L26:
            if (r0 != 0) goto L2a
            r0 = r2
            goto L2f
        L2a:
            int r0 = r0 + r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L2f:
            return r0
        L30:
            java.lang.String r0 = (java.lang.String) r0
            r2 = r22
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0.getClass()
            java.lang.String r3 = "[Hchat:AutoMessageForward] "
            java.lang.String r0 = r3.concat(r0)
            fb.v0.n(r0, r2)
            return r6
        L43:
            v0.b r0 = (v0.b) r0
            return r22
        L46:
            v0.b r0 = (v0.b) r0
            r0 = r22
            v0.d r0 = (v0.d) r0
            java.util.Map r2 = r0.f13875g
            f.k0 r0 = r0.f13876h
            java.lang.Object[] r6 = r0.f2849b
            java.lang.Object[] r7 = r0.f2850c
            long[] r0 = r0.f2848a
            int r8 = r0.length
            int r8 = r8 - r5
            if (r8 < 0) goto La5
            r5 = r4
        L5b:
            r9 = r0[r5]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto La0
            int r11 = r5 - r8
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L75:
            if (r13 >= r11) goto L9e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L9a
            int r14 = r5 << 3
            int r14 = r14 + r13
            r15 = r6[r14]
            r14 = r7[r14]
            v0.f r14 = (v0.f) r14
            java.util.Map r14 = r14.c()
            boolean r16 = r14.isEmpty()
            if (r16 == 0) goto L97
            r2.remove(r15)
            goto L9a
        L97:
            r2.put(r15, r14)
        L9a:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L75
        L9e:
            if (r11 != r12) goto La5
        La0:
            if (r5 == r8) goto La5
            int r5 = r5 + 1
            goto L5b
        La5:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lac
            goto Lad
        Lac:
            r3 = r2
        Lad:
            return r3
        Lae:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = r22
            wf.e r2 = (wf.e) r2
            int r0 = r0 + r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        Lbe:
            h1.d r0 = (h1.d) r0
            r2 = r22
            fg.l r2 = (fg.l) r2
            r0.getClass()
            r2.getClass()
            r2.invoke(r0)
            return r6
        Lce:
            java.lang.String r0 = (java.lang.String) r0
            r2 = r22
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0.getClass()
            java.lang.String r3 = "[Hchat:HideChatMenu] "
            java.lang.String r0 = r3.concat(r0)
            fb.v0.n(r0, r2)
            return r6
        Le1:
            v0.b r0 = (v0.b) r0
            r2 = r22
            sh.e2 r2 = (sh.e2) r2
            r0.getClass()
            r2.getClass()
            float r0 = r2.f12572a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            i0.f1 r3 = r2.f12574c
            float r3 = r3.g()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            i0.f1 r2 = r2.f12573b
            float r2 = r2.g()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float[] r0 = new java.lang.Float[]{r0, r3, r2}
            java.util.List r0 = a.a.y0(r0)
            return r0
        L110:
            i0.h0 r0 = (i0.h0) r0
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            if (r3 == r5) goto L11f
            r4 = r7
        L11f:
            r2 = r2 & r7
            boolean r2 = r0.S(r2, r4)
            if (r2 == 0) goto L12d
            ci.a r2 = ci.x.f1808a
            r3 = 6
            r2.a(r0, r3)
            goto L130
        L12d:
            r0.V()
        L130:
            return r6
        L131:
            i0.h0 r0 = (i0.h0) r0
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            if (r3 == r5) goto L140
            r4 = r7
        L140:
            r2 = r2 & r7
            boolean r2 = r0.S(r2, r4)
            if (r2 == 0) goto L148
            goto L14b
        L148:
            r0.V()
        L14b:
            return r6
        L14c:
            i0.h0 r0 = (i0.h0) r0
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            if (r3 == r5) goto L15b
            r4 = r7
        L15b:
            r2 = r2 & r7
            boolean r2 = r0.S(r2, r4)
            if (r2 == 0) goto L163
            goto L166
        L163:
            r0.V()
        L166:
            return r6
        L167:
            i0.h0 r0 = (i0.h0) r0
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            if (r3 == r5) goto L176
            r4 = r7
        L176:
            r2 = r2 & r7
            boolean r2 = r0.S(r2, r4)
            if (r2 == 0) goto L17e
            goto L181
        L17e:
            r0.V()
        L181:
            return r6
        L182:
            i0.h0 r0 = (i0.h0) r0
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            if (r3 == r5) goto L191
            r4 = r7
        L191:
            r2 = r2 & r7
            boolean r2 = r0.S(r2, r4)
            if (r2 == 0) goto L199
            goto L19c
        L199:
            r0.V()
        L19c:
            return r6
        L19d:
            i0.h0 r0 = (i0.h0) r0
            r2 = r22
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            if (r3 == r5) goto L1ac
            r4 = r7
        L1ac:
            r2 = r2 & r7
            boolean r2 = r0.S(r2, r4)
            if (r2 == 0) goto L1b4
            goto L1b7
        L1b4:
            r0.V()
        L1b7:
            return r6
        L1b8:
            v0.b r0 = (v0.b) r0
            r0 = r22
            s.x0 r0 = (s.x0) r0
            java.util.Map r0 = r0.c()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1c9
            goto L1ca
        L1c9:
            r3 = r0
        L1ca:
            return r3
        L1cb:
            v0.b r0 = (v0.b) r0
            r0 = r22
            r.z r0 = (r.z) r0
            int r2 = r0.h()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.i()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r2, r0}
            java.util.List r0 = a.a.y0(r0)
            return r0
        L1ea:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            r2 = r22
            wf.e r2 = (wf.e) r2
            return r0
        L1f4:
            wf.g r0 = (wf.g) r0
            r2 = r22
            wf.e r2 = (wf.e) r2
            wf.g r0 = r0.e(r2)
            return r0
        L1ff:
            wf.g r0 = (wf.g) r0
            r2 = r22
            wf.e r2 = (wf.e) r2
            wf.g r0 = r0.e(r2)
            return r0
        L20a:
            java.lang.String r0 = (java.lang.String) r0
            r2 = r22
            p8.c0 r2 = (p8.c0) r2
            r0.getClass()
            if (r2 == 0) goto L216
            goto L21b
        L216:
            p8.c0 r2 = new p8.c0
            r2.<init>()
        L21b:
            int r0 = r2.f10321b
            int r0 = r0 + r7
            r2.f10321b = r0
            return r2
        L221:
            v0.b r0 = (v0.b) r0
            r0 = r22
            k.w1 r0 = (k.w1) r0
            i0.g1 r0 = r0.f7093a
            int r0 = r0.g()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L232:
            v0.b r0 = (v0.b) r0
            r0 = r22
            t2.r r0 = (t2.r) r0
            int r0 = r0.f13027a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L23f:
            v0.b r0 = (v0.b) r0
            r2 = r22
            t2.s r2 = (t2.s) r2
            int r3 = r2.f13030a
            t2.r r4 = new t2.r
            r4.<init>(r3)
            p4.t r3 = i2.e0.f6296e
            java.lang.Object r0 = i2.d0.a(r4, r3, r0)
            boolean r2 = r2.f13031b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.util.ArrayList r0 = a.a.k(r0)
            return r0
        L261:
            v0.b r0 = (v0.b) r0
            r0 = r22
            t2.e r0 = (t2.e) r0
            int r0 = r0.f13000a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L26e:
            v0.b r0 = (v0.b) r0
            r0 = r22
            i2.j r0 = (i2.j) r0
            int r0 = r0.f6333a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L27b:
            v0.b r0 = (v0.b) r0
            r2 = r22
            i2.w r2 = (i2.w) r2
            boolean r3 = r2.f6402a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            p4.t r4 = i2.d0.f6262a
            int r2 = r2.f6403b
            i2.j r4 = new i2.j
            r4.<init>(r2)
            p4.t r2 = i2.e0.f6293b
            java.lang.Object r0 = i2.d0.a(r4, r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.util.ArrayList r0 = a.a.k(r0)
            return r0
        L29f:
            v0.b r0 = (v0.b) r0
            r2 = r22
            i2.l0 r2 = (i2.l0) r2
            i2.f0 r3 = r2.f6354a
            p4.t r4 = i2.d0.f6269h
            java.lang.Object r3 = i2.d0.a(r3, r4, r0)
            i2.f0 r5 = r2.f6355b
            java.lang.Object r5 = i2.d0.a(r5, r4, r0)
            i2.f0 r6 = r2.f6356c
            java.lang.Object r6 = i2.d0.a(r6, r4, r0)
            i2.f0 r2 = r2.f6357d
            java.lang.Object r0 = i2.d0.a(r2, r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r5, r6, r0}
            java.util.ArrayList r0 = a.a.k(r0)
            return r0
        L2c8:
            v0.b r0 = (v0.b) r0
            r2 = r22
            i2.f0 r2 = (i2.f0) r2
            t2.o r3 = r2.f6298a
            long r3 = r3.b()
            f1.w r5 = new f1.w
            r5.<init>(r3)
            i2.c0 r3 = i2.d0.f6277p
            java.lang.Object r6 = i2.d0.a(r5, r3, r0)
            long r4 = r2.f6299b
            u2.o r7 = new u2.o
            r7.<init>(r4)
            i2.c0 r4 = i2.d0.f6283v
            java.lang.Object r7 = i2.d0.a(r7, r4, r0)
            m2.k r5 = r2.f6300c
            m2.k r8 = m2.k.f8696h
            p4.t r8 = i2.d0.f6274m
            java.lang.Object r8 = i2.d0.a(r5, r8, r0)
            m2.i r5 = r2.f6301d
            p4.t r9 = i2.d0.f6281t
            java.lang.Object r9 = i2.d0.a(r5, r9, r0)
            m2.j r5 = r2.f6302e
            p4.t r10 = i2.d0.f6282u
            java.lang.Object r10 = i2.d0.a(r5, r10, r0)
            r5 = -1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            java.lang.String r12 = r2.f6304g
            long r13 = r2.f6305h
            u2.o r5 = new u2.o
            r5.<init>(r13)
            java.lang.Object r13 = i2.d0.a(r5, r4, r0)
            t2.a r4 = r2.f6306i
            p4.t r5 = i2.d0.f6275n
            java.lang.Object r14 = i2.d0.a(r4, r5, r0)
            t2.p r4 = r2.f6307j
            p4.t r5 = i2.d0.f6272k
            java.lang.Object r15 = i2.d0.a(r4, r5, r0)
            p2.b r4 = r2.f6308k
            p2.b r5 = p2.b.f10086i
            p4.t r5 = i2.d0.f6286y
            java.lang.Object r16 = i2.d0.a(r4, r5, r0)
            long r4 = r2.f6309l
            f1.w r1 = new f1.w
            r1.<init>(r4)
            java.lang.Object r17 = i2.d0.a(r1, r3, r0)
            t2.l r1 = r2.f6310m
            p4.t r3 = i2.d0.f6271j
            java.lang.Object r18 = i2.d0.a(r1, r3, r0)
            f1.q0 r1 = r2.f6311n
            f1.q0 r2 = f1.q0.f3108d
            p4.t r2 = i2.d0.f6276o
            java.lang.Object r19 = i2.d0.a(r1, r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            java.util.ArrayList r0 = a.a.k(r0)
            return r0
        L358:
            v0.b r0 = (v0.b) r0
            r0 = r22
            i2.o0 r0 = (i2.o0) r0
            java.lang.String r0 = r0.f6376a
            return r0
        L361:
            v0.b r0 = (v0.b) r0
            r1 = r22
            i2.u r1 = (i2.u) r1
            int r2 = r1.f6391a
            t2.k r3 = new t2.k
            r3.<init>(r2)
            i2.c0 r2 = i2.d0.f6278q
            java.lang.Object r4 = i2.d0.a(r3, r2, r0)
            int r2 = r1.f6392b
            t2.m r3 = new t2.m
            r3.<init>(r2)
            i2.c0 r2 = i2.d0.f6279r
            java.lang.Object r5 = i2.d0.a(r3, r2, r0)
            long r2 = r1.f6393c
            u2.o r6 = new u2.o
            r6.<init>(r2)
            i2.c0 r2 = i2.d0.f6283v
            java.lang.Object r6 = i2.d0.a(r6, r2, r0)
            t2.q r2 = r1.f6394d
            t2.q r3 = t2.q.f13024c
            p4.t r3 = i2.d0.f6273l
            java.lang.Object r7 = i2.d0.a(r2, r3, r0)
            i2.w r2 = r1.f6395e
            p4.t r3 = i2.e0.f6292a
            java.lang.Object r8 = i2.d0.a(r2, r3, r0)
            t2.i r2 = r1.f6396f
            t2.i r3 = t2.i.f13007d
            p4.t r3 = i2.d0.A
            java.lang.Object r9 = i2.d0.a(r2, r3, r0)
            int r2 = r1.f6397g
            t2.e r3 = new t2.e
            r3.<init>(r2)
            p4.t r2 = i2.e0.f6294c
            java.lang.Object r10 = i2.d0.a(r3, r2, r0)
            int r2 = r1.f6398h
            t2.d r3 = new t2.d
            r3.<init>(r2)
            i2.c0 r2 = i2.d0.f6280s
            java.lang.Object r11 = i2.d0.a(r3, r2, r0)
            t2.s r1 = r1.f6399i
            p4.t r2 = i2.e0.f6295d
            java.lang.Object r12 = i2.d0.a(r1, r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}
            java.util.ArrayList r0 = a.a.k(r0)
            return r0
    }
}
