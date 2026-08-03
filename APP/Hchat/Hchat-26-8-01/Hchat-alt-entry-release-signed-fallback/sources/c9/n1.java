package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1287g;

    public /* synthetic */ n1(byte r1, int r2) {
            r0 = this;
            r0.f1287g = r2
            r0.<init>()
            return
    }

    public /* synthetic */ n1(int r1) {
            r0 = this;
            r1 = 1
            r0.f1287g = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f1287g
            switch(r0) {
                case 0: goto L35f;
                case 1: goto L34d;
                case 2: goto L33a;
                case 3: goto L323;
                case 4: goto L318;
                case 5: goto L2ff;
                case 6: goto L2da;
                case 7: goto L2cf;
                case 8: goto L2b8;
                case 9: goto L2ad;
                case 10: goto L286;
                case 11: goto L262;
                case 12: goto L235;
                case 13: goto L22a;
                case 14: goto L21f;
                case 15: goto L214;
                case 16: goto L209;
                case 17: goto L1fe;
                case 18: goto L1c5;
                case 19: goto L1ae;
                case 20: goto L183;
                case 21: goto L143;
                case 22: goto L95;
                case 23: goto L6c;
                case 24: goto L61;
                case 25: goto L2d;
                case 26: goto L22;
                case 27: goto L17;
                case 28: goto Lc;
                default: goto L5;
            }
        L5:
            v0.b r6 = (v0.b) r6
            i2.p0 r7 = (i2.p0) r7
            java.lang.String r6 = r7.f6379a
            return r6
        Lc:
            v0.b r6 = (v0.b) r6
            t2.g r7 = (t2.g) r7
            int r6 = r7.f13005a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L17:
            v0.b r6 = (v0.b) r6
            t2.h r7 = (t2.h) r7
            int r6 = r7.f13006a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L22:
            v0.b r6 = (v0.b) r6
            t2.f r7 = (t2.f) r7
            float r6 = r7.f13004a
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            return r6
        L2d:
            v0.b r6 = (v0.b) r6
            t2.i r7 = (t2.i) r7
            float r0 = r7.f13008a
            t2.f r1 = new t2.f
            r1.<init>(r0)
            i2.c0 r0 = i2.d0.B
            java.lang.Object r0 = i2.d0.a(r1, r0, r6)
            int r1 = r7.f13009b
            t2.h r2 = new t2.h
            r2.<init>(r1)
            i2.c0 r1 = i2.d0.C
            java.lang.Object r1 = i2.d0.a(r2, r1, r6)
            int r7 = r7.f13010c
            t2.g r2 = new t2.g
            r2.<init>(r7)
            i2.c0 r7 = i2.d0.D
            java.lang.Object r6 = i2.d0.a(r2, r7, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r1, r6}
            java.util.ArrayList r6 = a.a.k(r6)
            return r6
        L61:
            v0.b r6 = (v0.b) r6
            p2.a r7 = (p2.a) r7
            java.util.Locale r6 = r7.f10085a
            java.lang.String r6 = r6.toLanguageTag()
            return r6
        L6c:
            v0.b r6 = (v0.b) r6
            p2.b r7 = (p2.b) r7
            java.lang.Object r7 = r7.f10087g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            int r1 = r7.size()
            r2 = 0
        L80:
            if (r2 >= r1) goto L94
            java.lang.Object r3 = r7.get(r2)
            p2.a r3 = (p2.a) r3
            p4.t r4 = i2.d0.f6287z
            java.lang.Object r3 = i2.d0.a(r3, r4, r6)
            r0.add(r3)
            int r2 = r2 + 1
            goto L80
        L94:
            return r0
        L95:
            v0.b r6 = (v0.b) r6
            i2.e r7 = (i2.e) r7
            java.lang.Object r0 = r7.f6288a
            boolean r1 = r0 instanceof i2.u
            if (r1 == 0) goto La2
            i2.i r1 = i2.i.f6323g
            goto Lcb
        La2:
            boolean r1 = r0 instanceof i2.f0
            if (r1 == 0) goto La9
            i2.i r1 = i2.i.f6324h
            goto Lcb
        La9:
            boolean r1 = r0 instanceof i2.p0
            if (r1 == 0) goto Lb0
            i2.i r1 = i2.i.f6325i
            goto Lcb
        Lb0:
            boolean r1 = r0 instanceof i2.o0
            if (r1 == 0) goto Lb7
            i2.i r1 = i2.i.f6326j
            goto Lcb
        Lb7:
            boolean r1 = r0 instanceof i2.l
            if (r1 == 0) goto Lbe
            i2.i r1 = i2.i.f6327k
            goto Lcb
        Lbe:
            boolean r1 = r0 instanceof i2.k
            if (r1 == 0) goto Lc5
            i2.i r1 = i2.i.f6328l
            goto Lcb
        Lc5:
            boolean r1 = r0 instanceof i2.h0
            if (r1 == 0) goto L13d
            i2.i r1 = i2.i.f6329m
        Lcb:
            int r2 = r1.ordinal()
            switch(r2) {
                case 0: goto L11b;
                case 1: goto L10f;
                case 2: goto L103;
                case 3: goto Lf7;
                case 4: goto Leb;
                case 5: goto Ldf;
                case 6: goto Ld7;
                default: goto Ld2;
            }
        Ld2:
            okio.a.k()
            r6 = 0
            goto L13c
        Ld7:
            r0.getClass()
            i2.h0 r0 = (i2.h0) r0
            java.lang.String r6 = r0.f6322a
            goto L126
        Ldf:
            r0.getClass()
            i2.k r0 = (i2.k) r0
            p4.t r2 = i2.d0.f6267f
            java.lang.Object r6 = i2.d0.a(r0, r2, r6)
            goto L126
        Leb:
            r0.getClass()
            i2.l r0 = (i2.l) r0
            p4.t r2 = i2.d0.f6266e
            java.lang.Object r6 = i2.d0.a(r0, r2, r6)
            goto L126
        Lf7:
            r0.getClass()
            i2.o0 r0 = (i2.o0) r0
            p4.t r2 = i2.d0.f6265d
            java.lang.Object r6 = i2.d0.a(r0, r2, r6)
            goto L126
        L103:
            r0.getClass()
            i2.p0 r0 = (i2.p0) r0
            p4.t r2 = i2.d0.f6264c
            java.lang.Object r6 = i2.d0.a(r0, r2, r6)
            goto L126
        L10f:
            r0.getClass()
            i2.f0 r0 = (i2.f0) r0
            p4.t r2 = i2.d0.f6269h
            java.lang.Object r6 = i2.d0.a(r0, r2, r6)
            goto L126
        L11b:
            r0.getClass()
            i2.u r0 = (i2.u) r0
            p4.t r2 = i2.d0.f6268g
            java.lang.Object r6 = i2.d0.a(r0, r2, r6)
        L126:
            int r0 = r7.f6289b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r7.f6290c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r7 = r7.f6291d
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r6, r0, r2, r7}
            java.util.ArrayList r6 = a.a.k(r6)
        L13c:
            return r6
        L13d:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            r6.<init>()
            throw r6
        L143:
            v0.b r6 = (v0.b) r6
            e1.b r7 = (e1.b) r7
            if (r7 != 0) goto L14b
            r6 = 0
            goto L156
        L14b:
            long r0 = r7.f2294a
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r6 = e1.b.b(r0, r2)
        L156:
            if (r6 == 0) goto L15b
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L182
        L15b:
            long r0 = r7.f2294a
            r6 = 32
            long r0 = r0 >> r6
            int r6 = (int) r0
            float r6 = java.lang.Float.intBitsToFloat(r6)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            long r0 = r7.f2294a
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r7 = (int) r0
            float r7 = java.lang.Float.intBitsToFloat(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Float[] r6 = new java.lang.Float[]{r6, r7}
            java.util.ArrayList r6 = a.a.k(r6)
        L182:
            return r6
        L183:
            v0.b r6 = (v0.b) r6
            u2.p r7 = (u2.p) r7
            long r6 = r7.f13361a
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = u2.p.a(r6, r0)
            if (r0 == 0) goto L19a
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L1ad
        L19a:
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r6 = u2.p.a(r6, r0)
            if (r6 == 0) goto L1ab
            r6 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L1ad
        L1ab:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L1ad:
            return r6
        L1ae:
            v0.b r6 = (v0.b) r6
            i2.k r7 = (i2.k) r7
            java.lang.String r0 = r7.f6344a
            i2.l0 r7 = r7.f6345b
            p4.t r1 = i2.d0.f6270i
            java.lang.Object r6 = i2.d0.a(r7, r1, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            java.util.ArrayList r6 = a.a.k(r6)
            return r6
        L1c5:
            v0.b r6 = (v0.b) r6
            u2.o r7 = (u2.o) r7
            long r0 = u2.o.f13359c
            if (r7 != 0) goto L1cf
            r0 = 0
            goto L1d5
        L1cf:
            long r2 = r7.f13360a
            boolean r0 = u2.o.a(r2, r0)
        L1d5:
            if (r0 == 0) goto L1da
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L1fd
        L1da:
            long r0 = r7.f13360a
            float r0 = u2.o.c(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            long r1 = r7.f13360a
            long r1 = u2.o.b(r1)
            u2.p r7 = new u2.p
            r7.<init>(r1)
            i2.c0 r1 = i2.d0.f6284w
            java.lang.Object r6 = i2.d0.a(r7, r1, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            java.util.ArrayList r6 = a.a.k(r6)
        L1fd:
            return r6
        L1fe:
            v0.b r6 = (v0.b) r6
            m2.j r7 = (m2.j) r7
            int r6 = r7.f8695a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L209:
            v0.b r6 = (v0.b) r6
            m2.i r7 = (m2.i) r7
            int r6 = r7.f8694a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L214:
            v0.b r6 = (v0.b) r6
            t2.d r7 = (t2.d) r7
            int r6 = r7.f12998a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L21f:
            v0.b r6 = (v0.b) r6
            t2.m r7 = (t2.m) r7
            int r6 = r7.f13019a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L22a:
            v0.b r6 = (v0.b) r6
            t2.k r7 = (t2.k) r7
            int r6 = r7.f13014a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L235:
            v0.b r6 = (v0.b) r6
            f1.q0 r7 = (f1.q0) r7
            long r0 = r7.f3109a
            f1.w r2 = new f1.w
            r2.<init>(r0)
            i2.c0 r0 = i2.d0.f6277p
            java.lang.Object r0 = i2.d0.a(r2, r0, r6)
            long r1 = r7.f3110b
            e1.b r3 = new e1.b
            r3.<init>(r1)
            i2.c0 r1 = i2.d0.f6285x
            java.lang.Object r6 = i2.d0.a(r3, r1, r6)
            float r7 = r7.f3111c
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6, r7}
            java.util.ArrayList r6 = a.a.k(r6)
            return r6
        L262:
            v0.b r6 = (v0.b) r6
            i2.m0 r7 = (i2.m0) r7
            long r0 = r7.f6360a
            r6 = 32
            long r0 = r0 >> r6
            int r6 = (int) r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            long r0 = r7.f6360a
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r7 = (int) r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer[] r6 = new java.lang.Integer[]{r6, r7}
            java.util.ArrayList r6 = a.a.k(r6)
            return r6
        L286:
            v0.b r6 = (v0.b) r6
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            int r1 = r7.size()
            r2 = 0
        L298:
            if (r2 >= r1) goto L2ac
            java.lang.Object r3 = r7.get(r2)
            i2.e r3 = (i2.e) r3
            p4.t r4 = i2.d0.f6263b
            java.lang.Object r3 = i2.d0.a(r3, r4, r6)
            r0.add(r3)
            int r2 = r2 + 1
            goto L298
        L2ac:
            return r0
        L2ad:
            v0.b r6 = (v0.b) r6
            t2.a r7 = (t2.a) r7
            float r6 = r7.f12994a
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            return r6
        L2b8:
            v0.b r6 = (v0.b) r6
            i2.l r7 = (i2.l) r7
            java.lang.String r0 = r7.f6352a
            i2.l0 r7 = r7.f6353b
            p4.t r1 = i2.d0.f6270i
            java.lang.Object r6 = i2.d0.a(r7, r1, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            java.util.ArrayList r6 = a.a.k(r6)
            return r6
        L2cf:
            v0.b r6 = (v0.b) r6
            m2.k r7 = (m2.k) r7
            int r6 = r7.f8701g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L2da:
            v0.b r6 = (v0.b) r6
            t2.q r7 = (t2.q) r7
            long r0 = r7.f13025a
            u2.o r2 = new u2.o
            r2.<init>(r0)
            i2.c0 r0 = i2.d0.f6283v
            java.lang.Object r1 = i2.d0.a(r2, r0, r6)
            long r2 = r7.f13026b
            u2.o r7 = new u2.o
            r7.<init>(r2)
            java.lang.Object r6 = i2.d0.a(r7, r0, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r6}
            java.util.ArrayList r6 = a.a.k(r6)
            return r6
        L2ff:
            v0.b r6 = (v0.b) r6
            t2.p r7 = (t2.p) r7
            float r6 = r7.f13022a
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            float r7 = r7.f13023b
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Float[] r6 = new java.lang.Float[]{r6, r7}
            java.util.ArrayList r6 = a.a.k(r6)
            return r6
        L318:
            v0.b r6 = (v0.b) r6
            t2.l r7 = (t2.l) r7
            int r6 = r7.f13018a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L323:
            v0.b r6 = (v0.b) r6
            i2.g r7 = (i2.g) r7
            java.lang.String r0 = r7.f6314h
            java.util.List r7 = r7.f6313g
            p4.t r1 = i2.d0.f6262a
            java.lang.Object r6 = i2.d0.a(r7, r1, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            java.util.ArrayList r6 = a.a.k(r6)
            return r6
        L33a:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r6.getClass()
            java.lang.String r0 = "[Hchat:FakeLocation] "
            java.lang.String r6 = r0.concat(r6)
            fb.v0.n(r6, r7)
            sf.n r6 = sf.n.f12433a
            return r6
        L34d:
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            r7.getClass()
            r7 = 1
            int r7 = i0.r.C(r7)
            ci.k0.a(r6, r7)
            sf.n r6 = sf.n.f12433a
            return r6
        L35f:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r6.getClass()
            java.lang.String r0 = "[Hchat:ConversationGroup] "
            java.lang.String r6 = r0.concat(r6)
            fb.v0.n(r6, r7)
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
