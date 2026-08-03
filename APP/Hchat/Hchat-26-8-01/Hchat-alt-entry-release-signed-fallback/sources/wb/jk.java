package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jk implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17060g;

    public /* synthetic */ jk(int r1) {
            r0 = this;
            r0.f17060g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f17060g
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            sf.n r7 = sf.n.f12433a
            switch(r1) {
                case 0: goto L297;
                case 1: goto L28f;
                case 2: goto L287;
                case 3: goto L27a;
                case 4: goto L272;
                case 5: goto L26a;
                case 6: goto L262;
                case 7: goto L23b;
                case 8: goto L233;
                case 9: goto L224;
                case 10: goto L202;
                case 11: goto L1db;
                case 12: goto L1d3;
                case 13: goto L1af;
                case 14: goto L1a7;
                case 15: goto L166;
                case 16: goto L15e;
                case 17: goto L156;
                case 18: goto L14e;
                case 19: goto L141;
                case 20: goto L139;
                case 21: goto L131;
                case 22: goto L129;
                case 23: goto L99;
                case 24: goto L5c;
                case 25: goto L4d;
                case 26: goto L45;
                case 27: goto L22;
                case 28: goto L18;
                default: goto Le;
            }
        Le:
            r1 = r19
            gb.g r1 = (gb.g) r1
            r1.getClass()
            java.lang.String r1 = r1.f4422a
            return r1
        L18:
            r1 = r19
            gb.g r1 = (gb.g) r1
            r1.getClass()
            java.lang.String r1 = r1.f4422a
            return r1
        L22:
            r1 = r19
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            java.lang.Class[] r2 = r1.getParameterTypes()
            r2.getClass()
            int r2 = r2.length
            if (r2 != 0) goto L40
            java.lang.Class r1 = r1.getReturnType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L40
            r5 = r6
        L40:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        L45:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L4d:
            r1 = r19
            wb.no r1 = (wb.no) r1
            r1.getClass()
            boolean r1 = r1 instanceof wb.mo
            r1 = r1 ^ r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L5c:
            r1 = r19
            wb.r2 r1 = (wb.r2) r1
            r1.getClass()
            wb.m2 r2 = wb.m2.f17591b
            boolean r2 = gg.l.a(r1, r2)
            if (r2 == 0) goto L6d
            r3 = r5
            goto L94
        L6d:
            wb.m2 r2 = wb.m2.f17592c
            boolean r2 = gg.l.a(r1, r2)
            if (r2 != 0) goto L93
            boolean r2 = r1 instanceof wb.o2
            if (r2 != 0) goto L93
            boolean r2 = r1 instanceof wb.n2
            if (r2 == 0) goto L7e
            goto L93
        L7e:
            wb.m2 r2 = wb.m2.f17590a
            boolean r2 = gg.l.a(r1, r2)
            if (r2 != 0) goto L94
            boolean r2 = r1 instanceof wb.q2
            if (r2 != 0) goto L94
            boolean r1 = r1 instanceof wb.p2
            if (r1 == 0) goto L8f
            goto L94
        L8f:
            okio.a.k()
            goto L98
        L93:
            r3 = r6
        L94:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L98:
            return r4
        L99:
            r1 = r19
            h.t r1 = (h.t) r1
            r1.getClass()
            java.lang.Object r7 = r1.c()
            wb.t4 r7 = (wb.t4) r7
            int r7 = r7.ordinal()
            java.lang.Object r1 = r1.b()
            wb.t4 r1 = (wb.t4) r1
            int r1 = r1.ordinal()
            if (r7 <= r1) goto Lb8
            r1 = r6
            goto Lb9
        Lb8:
            r1 = r5
        Lb9:
            r7 = 240(0xf0, float:3.36E-43)
            r8 = 6
            i.l1 r7 = i.d.p(r7, r8, r4)
            wb.m6 r9 = new wb.m6
            r9.<init>(r3, r1)
            i.m1 r10 = h.m0.f4717a
            h.l0 r10 = new h.l0
            r10.<init>(r9, r5)
            h.r0 r5 = new h.r0
            h.h1 r11 = new h.h1
            h.f1 r13 = new h.f1
            r13.<init>(r10, r7)
            r16 = 0
            r17 = 125(0x7d, float:1.75E-43)
            r12 = 0
            r14 = 0
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.<init>(r11)
            r7 = 160(0xa0, float:2.24E-43)
            i.l1 r7 = i.d.p(r7, r8, r4)
            h.r0 r7 = h.m0.a(r7, r3)
            h.r0 r5 = r5.a(r7)
            r7 = 220(0xdc, float:3.08E-43)
            i.l1 r7 = i.d.p(r7, r8, r4)
            wb.m6 r9 = new wb.m6
            r9.<init>(r2, r1)
            h.l0 r1 = new h.l0
            r1.<init>(r9, r6)
            h.s0 r2 = new h.s0
            h.h1 r9 = new h.h1
            h.f1 r11 = new h.f1
            r11.<init>(r1, r7)
            r15 = 125(0x7d, float:1.75E-43)
            r10 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r2.<init>(r9)
            r1 = 140(0x8c, float:1.96E-43)
            i.l1 r1 = i.d.p(r1, r8, r4)
            h.s0 r1 = h.m0.b(r1, r3)
            h.s0 r1 = r2.a(r1)
            int r2 = h.k.f4708b
            h.e0 r2 = new h.e0
            r2.<init>(r5, r1)
            return r2
        L129:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L131:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L139:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L141:
            r1 = r19
            wb.b3 r1 = (wb.b3) r1
            if (r1 != 0) goto L148
            goto L149
        L148:
            r5 = r6
        L149:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            return r1
        L14e:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L156:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L15e:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L166:
            r1 = r19
            wb.j r1 = (wb.j) r1
            r1.getClass()
            wb.h r2 = wb.h.f16466a
            boolean r2 = gg.l.a(r1, r2)
            if (r2 == 0) goto L177
            r3 = r5
            goto L1a2
        L177:
            wb.h r2 = wb.h.f16467b
            boolean r2 = gg.l.a(r1, r2)
            if (r2 != 0) goto L1a1
            wb.h r2 = wb.h.f16468c
            boolean r2 = gg.l.a(r1, r2)
            if (r2 == 0) goto L188
            goto L1a1
        L188:
            wb.h r2 = wb.h.f16469d
            boolean r2 = gg.l.a(r1, r2)
            if (r2 != 0) goto L1a2
            wb.h r2 = wb.h.f16470e
            boolean r2 = gg.l.a(r1, r2)
            if (r2 != 0) goto L1a2
            boolean r1 = r1 instanceof wb.i
            if (r1 == 0) goto L19d
            goto L1a2
        L19d:
            okio.a.k()
            goto L1a6
        L1a1:
            r3 = r6
        L1a2:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L1a6:
            return r4
        L1a7:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L1af:
            r1 = r19
            wb.mq r1 = (wb.mq) r1
            r1.getClass()
            wb.kq r2 = wb.kq.f17352a
            boolean r2 = gg.l.a(r1, r2)
            if (r2 == 0) goto L1c0
            r3 = r5
            goto L1ca
        L1c0:
            boolean r2 = r1 instanceof wb.lq
            if (r2 == 0) goto L1c6
            r3 = r6
            goto L1ca
        L1c6:
            boolean r1 = r1 instanceof wb.jq
            if (r1 == 0) goto L1cf
        L1ca:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            goto L1d2
        L1cf:
            okio.a.k()
        L1d2:
            return r4
        L1d3:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L1db:
            r1 = r19
            wb.o r1 = (wb.o) r1
            r1.getClass()
            wb.m r2 = wb.m.f17585a
            boolean r2 = gg.l.a(r1, r2)
            if (r2 == 0) goto L1eb
            goto L1fd
        L1eb:
            boolean r2 = r1 instanceof wb.n
            if (r2 != 0) goto L1fc
            boolean r2 = r1 instanceof wb.k
            if (r2 != 0) goto L1fc
            boolean r1 = r1 instanceof wb.l
            if (r1 == 0) goto L1f8
            goto L1fc
        L1f8:
            okio.a.k()
            goto L201
        L1fc:
            r5 = r6
        L1fd:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
        L201:
            return r4
        L202:
            r1 = r19
            wb.e r1 = (wb.e) r1
            r1.getClass()
            wb.e r2 = wb.e.f15817b
            boolean r2 = gg.l.a(r1, r2)
            if (r2 == 0) goto L212
            goto L21b
        L212:
            wb.e r2 = wb.e.f15816a
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L220
            r5 = r6
        L21b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            goto L223
        L220:
            okio.a.k()
        L223:
            return r4
        L224:
            r1 = r19
            wb.gq r1 = (wb.gq) r1
            r1.getClass()
            boolean r1 = r1 instanceof wb.fq
            r1 = r1 ^ r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L233:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L23b:
            r1 = r19
            wb.v r1 = (wb.v) r1
            r1.getClass()
            wb.t r2 = wb.t.f19149a
            boolean r2 = gg.l.a(r1, r2)
            if (r2 == 0) goto L24b
            goto L25d
        L24b:
            boolean r2 = r1 instanceof wb.u
            if (r2 != 0) goto L25c
            boolean r2 = r1 instanceof wb.r
            if (r2 != 0) goto L25c
            boolean r1 = r1 instanceof wb.s
            if (r1 == 0) goto L258
            goto L25c
        L258:
            okio.a.k()
            goto L261
        L25c:
            r5 = r6
        L25d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
        L261:
            return r4
        L262:
            r1 = r19
            wb.bp r1 = (wb.bp) r1
            r1.getClass()
            return r7
        L26a:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L272:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L27a:
            r1 = r19
            r.h r1 = (r.h) r1
            r1.getClass()
            s0.d r3 = wb.p0.f18285k6
            r.h.a(r1, r4, r3, r2)
            return r7
        L287:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L28f:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
        L297:
            r1 = r19
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            return r7
    }
}
