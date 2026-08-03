package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1528k;

    public /* synthetic */ k(android.content.SharedPreferences r2, android.content.Context r3, i0.a1 r4, int r5) {
            r1 = this;
            r0 = 8
            r1.f1524g = r0
            r1.<init>()
            r1.f1527j = r5
            r1.f1525h = r3
            r1.f1526i = r2
            r1.f1528k = r4
            return
    }

    public /* synthetic */ k(java.lang.Object r1, int r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f1524g = r5
            r0.f1525h = r1
            r0.f1527j = r2
            r0.f1526i = r3
            r0.f1528k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ k(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.f1524g = r5
            r0.f1525h = r1
            r0.f1526i = r2
            r0.f1528k = r3
            r0.f1527j = r4
            r0.<init>()
            return
    }

    public /* synthetic */ k(v1.b1[] r2, p.e1 r3, int r4, int[] r5) {
            r1 = this;
            r0 = 4
            r1.f1524g = r0
            r1.<init>()
            r1.f1525h = r2
            r1.f1526i = r3
            r1.f1527j = r4
            r1.f1528k = r5
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r0.f1524g
            r3 = 0
            r4 = 0
            r5 = 1
            int r6 = r0.f1527j
            sf.n r7 = sf.n.f12433a
            java.lang.Object r8 = r0.f1528k
            java.lang.Object r9 = r0.f1526i
            java.lang.Object r10 = r0.f1525h
            switch(r2) {
                case 0: goto L1df;
                case 1: goto L1a5;
                case 2: goto L16d;
                case 3: goto L141;
                case 4: goto Lff;
                case 5: goto Lba;
                case 6: goto L8b;
                case 7: goto L61;
                case 8: goto L31;
                default: goto L16;
            }
        L16:
            java.util.List r10 = (java.util.List) r10
            fg.l r9 = (fg.l) r9
            db.c r8 = (db.c) r8
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r10)
            r2.set(r6, r1)
            db.c r1 = wb.ho.p7(r8, r2)
            r9.invoke(r1)
            return r7
        L31:
            android.content.Context r10 = (android.content.Context) r10
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9
            i0.a1 r8 = (i0.a1) r8
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L60
            if (r6 != r5) goto L4a
            java.util.concurrent.atomic.AtomicBoolean r2 = e9.q.f2460a
            java.lang.String r1 = e9.q.h(r10, r1)
        L4a:
            r8.setValue(r1)
            android.content.SharedPreferences$Editor r2 = r9.edit()
            java.lang.String r3 = "hb_notify_sound_mode"
            android.content.SharedPreferences$Editor r2 = r2.putInt(r3, r6)
            java.lang.String r3 = "hb_notify_sound_uri"
            android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)
            r1.apply()
        L60:
            return r7
        L61:
            i0.a1 r10 = (i0.a1) r10
            r11 = r9
            k9.j r11 = (k9.j) r11
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r17 = r1.booleanValue()
            java.lang.Object r1 = r10.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            r16 = 0
            r18 = 63
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            k9.j r2 = k9.j.a(r11, r12, r13, r14, r15, r16, r17, r18)
            r1.set(r6, r2)
            wb.ho.V0(r8, r10, r1)
            return r7
        L8b:
            u2.c r10 = (u2.c) r10
            i0.f1 r9 = (i0.f1) r9
            i0.f1 r8 = (i0.f1) r8
            v1.t r1 = (v1.t) r1
            r1.getClass()
            long r1 = r1.F()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = (float) r1
            r9.h(r1)
            float r1 = r9.g()
            r2 = 8
            float r2 = (float) r2
            float r2 = r10.x0(r2)
            float r1 = r1 - r2
            float r2 = (float) r6
            float r1 = r1 / r2
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto Lb6
            r1 = r2
        Lb6:
            r8.h(r1)
            return r7
        Lba:
            w.l0 r10 = (w.l0) r10
            v1.p0 r9 = (v1.p0) r9
            v1.b1 r8 = (v1.b1) r8
            r11 = r1
            v1.a1 r11 = (v1.a1) r11
            int r12 = r10.f14529b
            w.j1 r1 = r10.f14528a
            n2.z r13 = r10.f14530c
            fg.a r2 = r10.f14531d
            java.lang.Object r2 = r2.invoke()
            w.m1 r2 = (w.m1) r2
            if (r2 == 0) goto Ld5
            i2.k0 r4 = r2.f14569a
        Ld5:
            r14 = r4
            u2.m r2 = r9.getLayoutDirection()
            u2.m r4 = u2.m.f13355h
            if (r2 != r4) goto Le0
            r15 = r5
            goto Le1
        Le0:
            r15 = r3
        Le1:
            int r2 = r8.f13900g
            r16 = r2
            e1.c r2 = w.s.k(r11, r12, r13, r14, r15, r16)
            m.p1 r4 = m.p1.f8325h
            int r5 = r8.f13900g
            r1.a(r4, r2, r6, r5)
            i0.f1 r1 = r1.f14510a
            float r1 = r1.g()
            float r1 = -r1
            int r1 = java.lang.Math.round(r1)
            v1.a1.E(r11, r8, r1, r3)
            return r7
        Lff:
            v1.b1[] r10 = (v1.b1[]) r10
            p.e1 r9 = (p.e1) r9
            int[] r8 = (int[]) r8
            v1.a1 r1 = (v1.a1) r1
            int r2 = r10.length
            r5 = r3
        L109:
            if (r3 >= r2) goto L140
            r11 = r10[r3]
            int r12 = r5 + 1
            r11.getClass()
            java.lang.Object r13 = r11.X()
            boolean r14 = r13 instanceof p.c1
            if (r14 == 0) goto L11d
            p.c1 r13 = (p.c1) r13
            goto L11e
        L11d:
            r13 = r4
        L11e:
            if (r13 == 0) goto L123
            p.x r13 = r13.f9871c
            goto L124
        L123:
            r13 = r4
        L124:
            if (r13 == 0) goto L12f
            int r14 = r11.f13901h
            y0.f r13 = r13.f10035a
            int r13 = r13.a(r14, r6)
            goto L137
        L12f:
            y0.f r13 = r9.f9891b
            int r14 = r11.f13901h
            int r13 = r13.a(r14, r6)
        L137:
            r5 = r8[r5]
            v1.a1.B(r1, r11, r5, r13)
            int r3 = r3 + 1
            r5 = r12
            goto L109
        L140:
            return r7
        L141:
            i0.x r10 = (i0.x) r10
            s0.e r9 = (s0.e) r9
            f.b0 r8 = (f.b0) r8
            if (r1 == r10) goto L167
            boolean r2 = r1 instanceof w0.u
            if (r2 == 0) goto L165
            int r2 = r9.f12186a
            int r2 = r2 - r6
            int r3 = r8.d(r1)
            if (r3 < 0) goto L15b
            int[] r4 = r8.f2776c
            r3 = r4[r3]
            goto L15e
        L15b:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L15e:
            int r2 = java.lang.Math.min(r2, r3)
            r8.g(r2, r1)
        L165:
            r4 = r7
            goto L16c
        L167:
            java.lang.String r1 = "A derived state calculation cannot read itself"
            j8.o.A(r1)
        L16c:
            return r4
        L16d:
            ca.e0 r10 = (ca.e0) r10
            android.app.Activity r9 = (android.app.Activity) r9
            java.util.List r8 = (java.util.List) r8
            p8.c r1 = (p8.c) r1
            r1.getClass()
            uf.c r1 = r1.a()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r2 = tf.n.e1(r8)
            r11.<init>(r2)
            java.util.Iterator r2 = r8.iterator()
        L189:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L19b
            java.lang.Object r3 = r2.next()
            wb.jv r3 = (wb.jv) r3
            java.lang.String r3 = r3.f17140a
            r11.add(r3)
            goto L189
        L19b:
            java.lang.String r13 = "群发助手"
            int r12 = r0.f1527j
            r8 = r10
            r10 = r1
            r8.n(r9, r10, r11, r12, r13)
            return r7
        L1a5:
            r14 = r10
            ca.e0 r14 = (ca.e0) r14
            r15 = r9
            android.app.Activity r15 = (android.app.Activity) r15
            r16 = r8
            hb.t r16 = (hb.t) r16
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L1c1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1d3
            java.lang.Object r3 = r1.next()
            wb.jv r3 = (wb.jv) r3
            java.lang.String r3 = r3.f17140a
            r2.add(r3)
            goto L1c1
        L1d3:
            java.lang.String r19 = "群发助手"
            int r1 = r0.f1527j
            r18 = r1
            r17 = r2
            r14.o(r15, r16, r17, r18, r19)
            return r7
        L1df:
            ca.e0 r10 = (ca.e0) r10
            android.app.Activity r9 = (android.app.Activity) r9
            r2 = r8
            p8.v r2 = (p8.v) r2
            r11 = r1
            java.util.List r11 = (java.util.List) r11
            r11.getClass()
            ca.k r8 = new ca.k
            r13 = 2
            int r12 = r0.f1527j
            r20 = r10
            r10 = r9
            r9 = r20
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r1 = "群发助手"
            r9.k(r10, r2, r1, r8)
            return r7
    }
}
