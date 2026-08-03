package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eh implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f15950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15954l;

    public /* synthetic */ eh(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, int r6) {
            r0 = this;
            r0.f15949g = r6
            r0.f15950h = r1
            r0.f15951i = r2
            r0.f15952j = r3
            r0.f15953k = r4
            r0.f15954l = r5
            r0.<init>()
            return
    }

    public /* synthetic */ eh(i0.a1 r2, i0.a1 r3, android.content.SharedPreferences r4, i0.a1 r5, i0.a1 r6) {
            r1 = this;
            r0 = 0
            r1.f15949g = r0
            r1.<init>()
            r1.f15951i = r2
            r1.f15952j = r3
            r1.f15950h = r4
            r1.f15953k = r5
            r1.f15954l = r6
            return
    }

    public /* synthetic */ eh(i0.a1 r2, i0.a1 r3, i0.a1 r4, android.content.SharedPreferences r5, i0.a1 r6) {
            r1 = this;
            r0 = 5
            r1.f15949g = r0
            r1.<init>()
            r1.f15951i = r2
            r1.f15952j = r3
            r1.f15953k = r4
            r1.f15950h = r5
            r1.f15954l = r6
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f15949g
            switch(r0) {
                case 0: goto L1e7;
                case 1: goto L1a7;
                case 2: goto L15a;
                case 3: goto L131;
                case 4: goto L106;
                default: goto L5;
            }
        L5:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            java.util.Set r13 = wb.ho.y6(r13)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r13)
            r0.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        L1d:
            boolean r1 = r13.hasNext()
            i0.a1 r4 = r12.f15951i
            i0.a1 r3 = r12.f15952j
            r2 = 0
            r5 = 1
            if (r1 == 0) goto L84
            java.lang.Object r1 = r13.next()
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r4.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L3a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L50
            java.lang.Object r4 = r1.next()
            r6 = r4
            ua.h r6 = (ua.h) r6
            java.lang.String r6 = r6.f13619b
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L3a
            r2 = r4
        L50:
            ua.h r2 = (ua.h) r2
            if (r2 == 0) goto L55
            goto L80
        L55:
            ua.h r6 = new ua.h
            java.lang.String r9 = wb.ho.k7(r7)
            java.lang.Object r1 = r3.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            if (r1 != r5) goto L77
            java.lang.Object r1 = r3.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = tf.m.t1(r1)
            ua.i r1 = (ua.i) r1
            java.lang.String r1 = r1.f13623a
        L75:
            r10 = r1
            goto L7a
        L77:
            java.lang.String r1 = ""
            goto L75
        L7a:
            r11 = 0
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11)
            r2 = r6
        L80:
            r0.add(r2)
            goto L1d
        L84:
            int r13 = r0.size()
            if (r13 != r5) goto Lde
            java.lang.Object r13 = tf.m.t1(r0)
            ua.h r13 = (ua.h) r13
            java.lang.Object r0 = r4.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r3 = r1
        L9c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r0.next()
            ua.h r6 = (ua.h) r6
            java.lang.String r6 = r6.f13619b
            java.lang.String r7 = r13.f13619b
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto Lb3
            goto Lb7
        Lb3:
            int r3 = r3 + 1
            goto L9c
        Lb6:
            r3 = -1
        Lb7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto Lbe
            r2 = r0
        Lbe:
            if (r2 == 0) goto Lc5
            int r0 = r2.intValue()
            goto Lcf
        Lc5:
            java.lang.Object r0 = r4.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
        Lcf:
            if (r3 < 0) goto Ld2
            goto Ld3
        Ld2:
            r5 = r1
        Ld3:
            wb.mu r1 = new wb.mu
            r1.<init>(r0, r13, r5)
            i0.a1 r13 = r12.f15953k
            r13.setValue(r1)
            goto L103
        Lde:
            boolean r13 = r0.isEmpty()
            if (r13 != 0) goto L103
            java.lang.Object r13 = r4.getValue()
            java.util.List r13 = (java.util.List) r13
            java.util.List r13 = wb.ho.u7(r13, r0)
            r4.setValue(r13)
            java.lang.Object r13 = r4.getValue()
            r7 = r13
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            r9 = 80
            android.content.SharedPreferences r2 = r12.f15950h
            i0.a1 r5 = r12.f15954l
            r6 = 0
            wb.ho.J(r2, r3, r4, r5, r6, r7, r8, r9)
        L103:
            sf.n r13 = sf.n.f12433a
            return r13
        L106:
            r.h r13 = (r.h) r13
            r13.getClass()
            s0.d r0 = wb.p0.G
            r1 = 0
            r2 = 3
            r.h.a(r13, r1, r0, r2)
            wb.bb r3 = new wb.bb
            r9 = 0
            android.content.SharedPreferences r4 = r12.f15950h
            i0.a1 r5 = r12.f15951i
            i0.a1 r6 = r12.f15952j
            i0.a1 r7 = r12.f15953k
            i0.a1 r8 = r12.f15954l
            r3.<init>(r4, r5, r6, r7, r8, r9)
            s0.d r0 = new s0.d
            r4 = 2129052763(0x7ee6c45b, float:1.5337099E38)
            r5 = 1
            r0.<init>(r4, r3, r5)
            r.h.a(r13, r1, r0, r2)
        L12e:
            sf.n r13 = sf.n.f12433a
            return r13
        L131:
            r.h r13 = (r.h) r13
            r13.getClass()
            s0.d r0 = wb.p0.f18259h0
            r1 = 0
            r2 = 3
            r.h.a(r13, r1, r0, r2)
            wb.bb r3 = new wb.bb
            r9 = 5
            android.content.SharedPreferences r4 = r12.f15950h
            i0.a1 r5 = r12.f15951i
            i0.a1 r6 = r12.f15952j
            i0.a1 r7 = r12.f15953k
            i0.a1 r8 = r12.f15954l
            r3.<init>(r4, r5, r6, r7, r8, r9)
            s0.d r0 = new s0.d
            r4 = -750242400(0xffffffffd34835a0, float:-8.5989314E11)
            r5 = 1
            r0.<init>(r4, r3, r5)
            r.h.a(r13, r1, r0, r2)
            goto L12e
        L15a:
            r.h r13 = (r.h) r13
            r13.getClass()
            s0.d r0 = wb.p0.f18389z2
            r1 = 0
            r2 = 3
            r.h.a(r13, r1, r0, r2)
            wb.t7 r0 = new wb.t7
            r3 = 6
            android.content.SharedPreferences r4 = r12.f15950h
            i0.a1 r5 = r12.f15951i
            i0.a1 r6 = r12.f15952j
            r0.<init>(r4, r5, r6, r3)
            s0.d r3 = new s0.d
            r6 = -428314057(0xffffffffe6787237, float:-2.9331344E23)
            r7 = 1
            r3.<init>(r6, r0, r7)
            r.h.a(r13, r1, r3, r2)
            java.lang.Object r0 = r5.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a4
            s0.d r0 = wb.p0.A2
            r.h.a(r13, r1, r0, r2)
            wb.t7 r0 = new wb.t7
            r3 = 7
            i0.a1 r5 = r12.f15953k
            i0.a1 r6 = r12.f15954l
            r0.<init>(r4, r5, r6, r3)
            s0.d r3 = new s0.d
            r4 = 800646418(0x2fb8e512, float:3.363217E-10)
            r3.<init>(r4, r0, r7)
            r.h.a(r13, r1, r3, r2)
        L1a4:
            sf.n r13 = sf.n.f12433a
            return r13
        L1a7:
            r.h r13 = (r.h) r13
            r13.getClass()
            s0.d r0 = wb.p0.E2
            r1 = 0
            r2 = 3
            r.h.a(r13, r1, r0, r2)
            wb.r6 r0 = new wb.r6
            r3 = 6
            android.content.SharedPreferences r4 = r12.f15950h
            r0.<init>(r4, r3)
            s0.d r3 = new s0.d
            r4 = 588862142(0x231952be, float:8.311668E-18)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r13, r1, r3, r2)
            s0.d r0 = wb.p0.F2
            r.h.a(r13, r1, r0, r2)
            wb.f8 r6 = new wb.f8
            r11 = 0
            i0.a1 r7 = r12.f15951i
            i0.a1 r8 = r12.f15952j
            i0.a1 r9 = r12.f15953k
            i0.a1 r10 = r12.f15954l
            r6.<init>(r7, r8, r9, r10, r11)
            s0.d r0 = new s0.d
            r3 = 1089064700(0x40e9cefc, float:7.3065166)
            r0.<init>(r3, r6, r5)
            r.h.a(r13, r1, r0, r2)
            goto L12e
        L1e7:
            wb.bp r13 = (wb.bp) r13
            r13.getClass()
            i0.a1 r1 = r12.f15951i
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            int r13 = r13.f15271b
            if (r13 < 0) goto L20e
            if (r13 >= r0) goto L20e
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r13 = r0.get(r13)
            na.j r13 = (na.j) r13
            java.lang.String r13 = r13.f9150a
        L20c:
            r6 = r13
            goto L211
        L20e:
            java.lang.String r13 = ""
            goto L20c
        L211:
            i0.a1 r3 = r12.f15952j
            r3.setValue(r6)
            r5 = 0
            r7 = 48
            android.content.SharedPreferences r0 = r12.f15950h
            i0.a1 r2 = r12.f15953k
            r4 = 0
            wb.ho.Y2(r0, r1, r2, r3, r4, r5, r6, r7)
            r13 = 0
            i0.a1 r0 = r12.f15954l
            r0.setValue(r13)
            goto L12e
    }
}
