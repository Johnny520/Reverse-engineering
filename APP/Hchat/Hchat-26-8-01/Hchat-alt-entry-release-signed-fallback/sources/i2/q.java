package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6380g;

    public /* synthetic */ q(int r1) {
            r0 = this;
            r0.f6380g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f6380g
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L5e0;
                case 1: goto L57d;
                case 2: goto L54a;
                case 3: goto L53b;
                case 4: goto L51c;
                case 5: goto L4de;
                case 6: goto L4cf;
                case 7: goto L4c0;
                case 8: goto L490;
                case 9: goto L428;
                case 10: goto L419;
                case 11: goto L3e5;
                case 12: goto L3d6;
                case 13: goto L3c7;
                case 14: goto L38d;
                case 15: goto L37e;
                case 16: goto L36f;
                case 17: goto L326;
                case 18: goto L2f4;
                case 19: goto L2a1;
                case 20: goto L262;
                case 21: goto L22f;
                case 22: goto L1fb;
                case 23: goto L19f;
                case 24: goto L18d;
                case 25: goto L17e;
                case 26: goto L35;
                case 27: goto L26;
                case 28: goto L18;
                default: goto La;
            }
        La:
            i2.o0 r0 = new i2.o0
            if (r13 == 0) goto L11
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
        L11:
            r5.getClass()
            r0.<init>(r5)
            return r0
        L18:
            i2.p0 r0 = new i2.p0
            if (r13 == 0) goto L1f
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
        L1f:
            r5.getClass()
            r0.<init>(r5)
            return r0
        L26:
            r13.getClass()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            t2.g r0 = new t2.g
            r0.<init>(r13)
            return r0
        L35:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r13.get(r3)
            if (r0 == 0) goto L43
            i2.i r0 = (i2.i) r0
            goto L44
        L43:
            r0 = r5
        L44:
            r0.getClass()
            java.lang.Object r2 = r13.get(r2)
            if (r2 == 0) goto L50
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L51
        L50:
            r2 = r5
        L51:
            r2.getClass()
            int r2 = r2.intValue()
            java.lang.Object r1 = r13.get(r1)
            if (r1 == 0) goto L61
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L62
        L61:
            r1 = r5
        L62:
            r1.getClass()
            int r1 = r1.intValue()
            r3 = 4
            java.lang.Object r3 = r13.get(r3)
            if (r3 == 0) goto L73
            java.lang.String r3 = (java.lang.String) r3
            goto L74
        L73:
            r3 = r5
        L74:
            r3.getClass()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L157;
                case 1: goto L131;
                case 2: goto L10b;
                case 3: goto Le6;
                case 4: goto Lc1;
                case 5: goto L9c;
                case 6: goto L83;
                default: goto L7e;
            }
        L7e:
            okio.a.k()
            goto L17d
        L83:
            java.lang.Object r13 = r13.get(r4)
            if (r13 == 0) goto L8c
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
        L8c:
            r5.getClass()
            i2.e r13 = new i2.e
            i2.h0 r0 = new i2.h0
            r0.<init>(r5)
            r13.<init>(r3, r2, r1, r0)
        L99:
            r5 = r13
            goto L17d
        L9c:
            java.lang.Object r13 = r13.get(r4)
            p4.t r0 = i2.d0.f6267f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = gg.l.a(r13, r4)
            if (r4 == 0) goto Lab
            goto Lb8
        Lab:
            if (r13 == 0) goto Lb8
            java.lang.Object r0 = r0.f10225i
            fg.l r0 = (fg.l) r0
            java.lang.Object r13 = r0.invoke(r13)
            r5 = r13
            i2.k r5 = (i2.k) r5
        Lb8:
            r5.getClass()
            i2.e r13 = new i2.e
            r13.<init>(r3, r2, r1, r5)
            goto L99
        Lc1:
            java.lang.Object r13 = r13.get(r4)
            p4.t r0 = i2.d0.f6266e
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = gg.l.a(r13, r4)
            if (r4 == 0) goto Ld0
            goto Ldd
        Ld0:
            if (r13 == 0) goto Ldd
            java.lang.Object r0 = r0.f10225i
            fg.l r0 = (fg.l) r0
            java.lang.Object r13 = r0.invoke(r13)
            r5 = r13
            i2.l r5 = (i2.l) r5
        Ldd:
            r5.getClass()
            i2.e r13 = new i2.e
            r13.<init>(r3, r2, r1, r5)
            goto L99
        Le6:
            java.lang.Object r13 = r13.get(r4)
            p4.t r0 = i2.d0.f6265d
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = gg.l.a(r13, r4)
            if (r4 == 0) goto Lf5
            goto L102
        Lf5:
            if (r13 == 0) goto L102
            java.lang.Object r0 = r0.f10225i
            fg.l r0 = (fg.l) r0
            java.lang.Object r13 = r0.invoke(r13)
            r5 = r13
            i2.o0 r5 = (i2.o0) r5
        L102:
            r5.getClass()
            i2.e r13 = new i2.e
            r13.<init>(r3, r2, r1, r5)
            goto L99
        L10b:
            java.lang.Object r13 = r13.get(r4)
            p4.t r0 = i2.d0.f6264c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = gg.l.a(r13, r4)
            if (r4 == 0) goto L11a
            goto L127
        L11a:
            if (r13 == 0) goto L127
            java.lang.Object r0 = r0.f10225i
            fg.l r0 = (fg.l) r0
            java.lang.Object r13 = r0.invoke(r13)
            r5 = r13
            i2.p0 r5 = (i2.p0) r5
        L127:
            r5.getClass()
            i2.e r13 = new i2.e
            r13.<init>(r3, r2, r1, r5)
            goto L99
        L131:
            java.lang.Object r13 = r13.get(r4)
            p4.t r0 = i2.d0.f6269h
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = gg.l.a(r13, r4)
            if (r4 == 0) goto L140
            goto L14d
        L140:
            if (r13 == 0) goto L14d
            java.lang.Object r0 = r0.f10225i
            fg.l r0 = (fg.l) r0
            java.lang.Object r13 = r0.invoke(r13)
            r5 = r13
            i2.f0 r5 = (i2.f0) r5
        L14d:
            r5.getClass()
            i2.e r13 = new i2.e
            r13.<init>(r3, r2, r1, r5)
            goto L99
        L157:
            java.lang.Object r13 = r13.get(r4)
            p4.t r0 = i2.d0.f6268g
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = gg.l.a(r13, r4)
            if (r4 == 0) goto L166
            goto L173
        L166:
            if (r13 == 0) goto L173
            java.lang.Object r0 = r0.f10225i
            fg.l r0 = (fg.l) r0
            java.lang.Object r13 = r0.invoke(r13)
            r5 = r13
            i2.u r5 = (i2.u) r5
        L173:
            r5.getClass()
            i2.e r13 = new i2.e
            r13.<init>(r3, r2, r1, r5)
            goto L99
        L17d:
            return r5
        L17e:
            r13.getClass()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            t2.h r0 = new t2.h
            r0.<init>(r13)
            return r0
        L18d:
            r13.getClass()
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            t2.f.a(r13)
            t2.f r0 = new t2.f
            r0.<init>(r13)
            return r0
        L19f:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            t2.i r0 = new t2.i
            java.lang.Object r1 = r13.get(r3)
            float r3 = t2.f.f13001b
            i2.c0 r3 = i2.d0.B
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            gg.l.a(r1, r6)
            if (r1 == 0) goto L1be
            fg.l r3 = r3.f6258h
            java.lang.Object r1 = r3.invoke(r1)
            t2.f r1 = (t2.f) r1
            goto L1bf
        L1be:
            r1 = r5
        L1bf:
            r1.getClass()
            float r1 = r1.f13004a
            java.lang.Object r3 = r13.get(r4)
            i2.c0 r4 = i2.d0.C
            gg.l.a(r3, r6)
            if (r3 == 0) goto L1d8
            fg.l r4 = r4.f6258h
            java.lang.Object r3 = r4.invoke(r3)
            t2.h r3 = (t2.h) r3
            goto L1d9
        L1d8:
            r3 = r5
        L1d9:
            r3.getClass()
            int r3 = r3.f13006a
            java.lang.Object r13 = r13.get(r2)
            i2.c0 r2 = i2.d0.D
            gg.l.a(r13, r6)
            if (r13 == 0) goto L1f2
            fg.l r2 = r2.f6258h
            java.lang.Object r13 = r2.invoke(r13)
            r5 = r13
            t2.g r5 = (t2.g) r5
        L1f2:
            r5.getClass()
            int r13 = r5.f13005a
            r0.<init>(r1, r3, r13)
            return r0
        L1fb:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r13.get(r3)
            if (r0 == 0) goto L209
            java.lang.String r0 = (java.lang.String) r0
            goto L20a
        L209:
            r0 = r5
        L20a:
            r0.getClass()
            java.lang.Object r13 = r13.get(r4)
            p4.t r1 = i2.d0.f6270i
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = gg.l.a(r13, r2)
            if (r2 == 0) goto L21c
            goto L229
        L21c:
            if (r13 == 0) goto L229
            java.lang.Object r1 = r1.f10225i
            fg.l r1 = (fg.l) r1
            java.lang.Object r13 = r1.invoke(r13)
            r5 = r13
            i2.l0 r5 = (i2.l0) r5
        L229:
            i2.k r13 = new i2.k
            r13.<init>(r0, r5)
            return r13
        L22f:
            p2.a r0 = new p2.a
            r13.getClass()
            java.lang.String r13 = (java.lang.String) r13
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r13)
            java.lang.String r2 = r1.toLanguageTag()
            java.lang.String r3 = "und"
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L25e
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The language tag "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r13 = " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            r2.println(r13)
        L25e:
            r0.<init>(r1)
            return r0
        L262:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.size()
            r0.<init>(r1)
            int r1 = r13.size()
        L274:
            if (r3 >= r1) goto L29b
            java.lang.Object r2 = r13.get(r3)
            p4.t r4 = i2.d0.f6287z
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r6 = gg.l.a(r2, r6)
            if (r6 == 0) goto L286
        L284:
            r2 = r5
            goto L292
        L286:
            if (r2 == 0) goto L284
            java.lang.Object r4 = r4.f10225i
            fg.l r4 = (fg.l) r4
            java.lang.Object r2 = r4.invoke(r2)
            p2.a r2 = (p2.a) r2
        L292:
            r2.getClass()
            r0.add(r2)
            int r3 = r3 + 1
            goto L274
        L29b:
            p2.b r13 = new p2.b
            r13.<init>(r0)
            return r13
        L2a1:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = gg.l.a(r13, r0)
            if (r0 == 0) goto L2b4
            e1.b r13 = new e1.b
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r13.<init>(r0)
            goto L2f3
        L2b4:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r13.get(r3)
            if (r0 == 0) goto L2c2
            java.lang.Float r0 = (java.lang.Float) r0
            goto L2c3
        L2c2:
            r0 = r5
        L2c3:
            r0.getClass()
            float r0 = r0.floatValue()
            java.lang.Object r13 = r13.get(r4)
            if (r13 == 0) goto L2d3
            r5 = r13
            java.lang.Float r5 = (java.lang.Float) r5
        L2d3:
            r5.getClass()
            float r13 = r5.floatValue()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            long r2 = (long) r13
            r13 = 32
            long r0 = r0 << r13
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            e1.b r13 = new e1.b
            r13.<init>(r0)
        L2f3:
            return r13
        L2f4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = gg.l.a(r13, r0)
            if (r0 == 0) goto L309
            u2.p r13 = new u2.p
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            r13.<init>(r0)
            goto L325
        L309:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r13 = gg.l.a(r13, r0)
            if (r13 == 0) goto L31e
            u2.p r13 = new u2.p
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            r13.<init>(r0)
            goto L325
        L31e:
            u2.p r13 = new u2.p
            r0 = 0
            r13.<init>(r0)
        L325:
            return r13
        L326:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = gg.l.a(r13, r0)
            if (r1 == 0) goto L336
            long r0 = u2.o.f13359c
            u2.o r13 = new u2.o
            r13.<init>(r0)
            goto L36e
        L336:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r1 = r13.get(r3)
            if (r1 == 0) goto L344
            java.lang.Float r1 = (java.lang.Float) r1
            goto L345
        L344:
            r1 = r5
        L345:
            r1.getClass()
            float r1 = r1.floatValue()
            java.lang.Object r13 = r13.get(r4)
            i2.c0 r2 = i2.d0.f6284w
            gg.l.a(r13, r0)
            if (r13 == 0) goto L360
            fg.l r0 = r2.f6258h
            java.lang.Object r13 = r0.invoke(r13)
            r5 = r13
            u2.p r5 = (u2.p) r5
        L360:
            r5.getClass()
            long r2 = r5.f13361a
            long r0 = x6.d.R(r2, r1)
            u2.o r13 = new u2.o
            r13.<init>(r0)
        L36e:
            return r13
        L36f:
            r13.getClass()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            m2.j r0 = new m2.j
            r0.<init>(r13)
            return r0
        L37e:
            r13.getClass()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            m2.i r0 = new m2.i
            r0.<init>(r13)
            return r0
        L38d:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.size()
            r0.<init>(r1)
            int r1 = r13.size()
        L39f:
            if (r3 >= r1) goto L3c6
            java.lang.Object r2 = r13.get(r3)
            p4.t r4 = i2.d0.f6263b
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r6 = gg.l.a(r2, r6)
            if (r6 == 0) goto L3b1
        L3af:
            r2 = r5
            goto L3bd
        L3b1:
            if (r2 == 0) goto L3af
            java.lang.Object r4 = r4.f10225i
            fg.l r4 = (fg.l) r4
            java.lang.Object r2 = r4.invoke(r2)
            i2.e r2 = (i2.e) r2
        L3bd:
            r2.getClass()
            r0.add(r2)
            int r3 = r3 + 1
            goto L39f
        L3c6:
            return r0
        L3c7:
            r13.getClass()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            t2.d r0 = new t2.d
            r0.<init>(r13)
            return r0
        L3d6:
            r13.getClass()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            t2.m r0 = new t2.m
            r0.<init>(r13)
            return r0
        L3e5:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r13.get(r3)
            if (r0 == 0) goto L3f3
            java.lang.String r0 = (java.lang.String) r0
            goto L3f4
        L3f3:
            r0 = r5
        L3f4:
            r0.getClass()
            java.lang.Object r13 = r13.get(r4)
            p4.t r1 = i2.d0.f6270i
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = gg.l.a(r13, r2)
            if (r2 == 0) goto L406
            goto L413
        L406:
            if (r13 == 0) goto L413
            java.lang.Object r1 = r1.f10225i
            fg.l r1 = (fg.l) r1
            java.lang.Object r13 = r1.invoke(r13)
            r5 = r13
            i2.l0 r5 = (i2.l0) r5
        L413:
            i2.l r13 = new i2.l
            r13.<init>(r0, r5)
            return r13
        L419:
            r13.getClass()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            t2.k r0 = new t2.k
            r0.<init>(r13)
            return r0
        L428:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            f1.q0 r6 = new f1.q0
            java.lang.Object r0 = r13.get(r3)
            int r1 = f1.w.f3132h
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            gg.l.a(r0, r1)
            if (r0 == 0) goto L45c
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r3 = gg.l.a(r0, r3)
            if (r3 == 0) goto L44c
            long r7 = f1.w.f3131g
            f1.w r0 = new f1.w
            r0.<init>(r7)
            goto L45d
        L44c:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r7 = f1.c0.c(r0)
            f1.w r0 = new f1.w
            r0.<init>(r7)
            goto L45d
        L45c:
            r0 = r5
        L45d:
            r0.getClass()
            long r8 = r0.f3133a
            java.lang.Object r0 = r13.get(r4)
            i2.c0 r3 = i2.d0.f6285x
            gg.l.a(r0, r1)
            if (r0 == 0) goto L476
            fg.l r1 = r3.f6258h
            java.lang.Object r0 = r1.invoke(r0)
            e1.b r0 = (e1.b) r0
            goto L477
        L476:
            r0 = r5
        L477:
            r0.getClass()
            long r10 = r0.f2294a
            java.lang.Object r13 = r13.get(r2)
            if (r13 == 0) goto L485
            r5 = r13
            java.lang.Float r5 = (java.lang.Float) r5
        L485:
            r5.getClass()
            float r7 = r5.floatValue()
            r6.<init>(r7, r8, r10)
            return r6
        L490:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r13.get(r3)
            if (r0 == 0) goto L49e
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L49f
        L49e:
            r0 = r5
        L49f:
            r0.getClass()
            int r0 = r0.intValue()
            java.lang.Object r13 = r13.get(r4)
            if (r13 == 0) goto L4af
            r5 = r13
            java.lang.Integer r5 = (java.lang.Integer) r5
        L4af:
            r5.getClass()
            int r13 = r5.intValue()
            long r0 = i2.e0.b(r0, r13)
            i2.m0 r13 = new i2.m0
            r13.<init>(r0)
            return r13
        L4c0:
            r13.getClass()
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            t2.a r0 = new t2.a
            r0.<init>(r13)
            return r0
        L4cf:
            m2.k r0 = new m2.k
            r13.getClass()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0.<init>(r13)
            return r0
        L4de:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            t2.q r0 = new t2.q
            java.lang.Object r1 = r13.get(r3)
            u2.p[] r2 = u2.o.f13358b
            i2.c0 r2 = i2.d0.f6283v
            fg.l r2 = r2.f6258h
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            gg.l.a(r1, r3)
            if (r1 == 0) goto L4fd
            java.lang.Object r1 = r2.invoke(r1)
            u2.o r1 = (u2.o) r1
            goto L4fe
        L4fd:
            r1 = r5
        L4fe:
            r1.getClass()
            long r6 = r1.f13360a
            java.lang.Object r13 = r13.get(r4)
            gg.l.a(r13, r3)
            if (r13 == 0) goto L513
            java.lang.Object r13 = r2.invoke(r13)
            r5 = r13
            u2.o r5 = (u2.o) r5
        L513:
            r5.getClass()
            long r1 = r5.f13360a
            r0.<init>(r6, r1)
            return r0
        L51c:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            t2.p r0 = new t2.p
            java.lang.Object r1 = r13.get(r3)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Object r13 = r13.get(r4)
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r0.<init>(r1, r13)
            return r0
        L53b:
            t2.l r0 = new t2.l
            r13.getClass()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0.<init>(r13)
            return r0
        L54a:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r13.get(r4)
            p4.t r1 = i2.d0.f6262a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = gg.l.a(r0, r2)
            if (r2 == 0) goto L55f
        L55d:
            r0 = r5
            goto L56b
        L55f:
            if (r0 == 0) goto L55d
            java.lang.Object r1 = r1.f10225i
            fg.l r1 = (fg.l) r1
            java.lang.Object r0 = r1.invoke(r0)
            java.util.List r0 = (java.util.List) r0
        L56b:
            java.lang.Object r13 = r13.get(r3)
            if (r13 == 0) goto L574
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
        L574:
            r5.getClass()
            i2.g r13 = new i2.g
            r13.<init>(r0, r5)
            return r13
        L57d:
            r13.getClass()
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r13.get(r3)
            p4.t r3 = i2.d0.f6269h
            java.lang.Object r3 = r3.f10225i
            fg.l r3 = (fg.l) r3
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = gg.l.a(r0, r6)
            if (r7 == 0) goto L596
        L594:
            r0 = r5
            goto L59e
        L596:
            if (r0 == 0) goto L594
            java.lang.Object r0 = r3.invoke(r0)
            i2.f0 r0 = (i2.f0) r0
        L59e:
            java.lang.Object r4 = r13.get(r4)
            boolean r7 = gg.l.a(r4, r6)
            if (r7 == 0) goto L5aa
        L5a8:
            r4 = r5
            goto L5b2
        L5aa:
            if (r4 == 0) goto L5a8
            java.lang.Object r4 = r3.invoke(r4)
            i2.f0 r4 = (i2.f0) r4
        L5b2:
            java.lang.Object r2 = r13.get(r2)
            boolean r7 = gg.l.a(r2, r6)
            if (r7 == 0) goto L5be
        L5bc:
            r2 = r5
            goto L5c6
        L5be:
            if (r2 == 0) goto L5bc
            java.lang.Object r2 = r3.invoke(r2)
            i2.f0 r2 = (i2.f0) r2
        L5c6:
            java.lang.Object r13 = r13.get(r1)
            boolean r1 = gg.l.a(r13, r6)
            if (r1 == 0) goto L5d1
            goto L5da
        L5d1:
            if (r13 == 0) goto L5da
            java.lang.Object r13 = r3.invoke(r13)
            r5 = r13
            i2.f0 r5 = (i2.f0) r5
        L5da:
            i2.l0 r13 = new i2.l0
            r13.<init>(r0, r4, r2, r5)
            return r13
        L5e0:
            i2.r r13 = (i2.r) r13
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            int r1 = r13.f6382b
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r13 = r13.f6383c
            r1 = 41
            java.lang.String r13 = p.a.n(r0, r13, r1)
            return r13
    }
}
