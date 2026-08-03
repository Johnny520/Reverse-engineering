package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class mt extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s1.t f17780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f17782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f17785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f17786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fg.a f17787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fg.a f17788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17789p;

    public mt(float r1, fg.a r2, fg.a r3, i0.a1 r4, wf.c r5) {
            r0 = this;
            r0.f17786m = r1
            r0.f17787n = r2
            r0.f17788o = r3
            r0.f17789p = r4
            r0.<init>(r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r7, wf.c r8) {
            r6 = this;
            wb.mt r0 = new wb.mt
            fg.a r3 = r6.f17788o
            i0.a1 r4 = r6.f17789p
            float r1 = r6.f17786m
            fg.a r2 = r6.f17787n
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f17785l = r7
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            s1.k0 r1 = (s1.k0) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.mt r1 = (wb.mt) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.f17785l
            s1.k0 r1 = (s1.k0) r1
            int r2 = r0.f17784k
            r4 = 2
            r6 = 1
            xf.a r7 = xf.a.f21579g
            if (r2 == 0) goto L2d
            if (r2 == r6) goto L27
            if (r2 != r4) goto L20
            int r2 = r0.f17783j
            float r8 = r0.f17782i
            float r9 = r0.f17781h
            s1.t r10 = r0.f17780g
            f8.i.I0(r19)
            r11 = r19
            goto L56
        L20:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            return r1
        L27:
            f8.i.I0(r19)
            r2 = r19
            goto L3b
        L2d:
            f8.i.I0(r19)
            r0.f17785l = r1
            r0.f17784k = r6
            java.lang.Object r2 = m.y2.b(r1, r0, r4)
            if (r2 != r7) goto L3b
            goto L55
        L3b:
            s1.t r2 = (s1.t) r2
            r10 = r2
            r2 = 0
            r8 = 0
            r9 = 0
        L41:
            r0.f17785l = r1
            r0.f17780g = r10
            r0.f17781h = r9
            r0.f17782i = r8
            r0.f17783j = r2
            r0.f17784k = r4
            s1.l r11 = s1.l.f12275h
            java.lang.Object r11 = r1.e(r11, r0)
            if (r11 != r7) goto L56
        L55:
            return r7
        L56:
            s1.k r11 = (s1.k) r11
            java.lang.Object r11 = r11.f12262a
            java.util.Iterator r11 = r11.iterator()
        L5e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L78
            java.lang.Object r12 = r11.next()
            r13 = r12
            s1.t r13 = (s1.t) r13
            long r13 = r13.f12291a
            long r3 = r10.f12291a
            boolean r3 = s1.s.e(r13, r3)
            if (r3 == 0) goto L76
            goto L79
        L76:
            r4 = 2
            goto L5e
        L78:
            r12 = 0
        L79:
            s1.t r12 = (s1.t) r12
            float r3 = r0.f17786m
            i0.a1 r4 = r0.f17789p
            if (r12 == 0) goto Lf4
            long r13 = r12.f12297g
            r11 = 0
            long r5 = r12.f12293c
            r15 = 32
            r16 = r11
            r19 = r12
            long r11 = r5 >> r15
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r12 = r1
            r17 = r2
            long r1 = r13 >> r15
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r11 = r11 - r1
            float r9 = r9 + r11
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r1
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r1 = r1 & r13
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r5 = r5 - r1
            float r8 = r8 + r5
            if (r17 != 0) goto Ld5
            float r1 = java.lang.Math.abs(r9)
            y1.l2 r2 = r12.B()
            float r2 = r2.f()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Ld5
            float r1 = java.lang.Math.abs(r9)
            float r2 = java.lang.Math.abs(r8)
            r5 = 1067450368(0x3fa00000, float:1.25)
            float r2 = r2 * r5
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Ld5
            r2 = 1
            goto Ld7
        Ld5:
            r2 = r17
        Ld7:
            if (r2 == 0) goto Le8
            float r1 = -r3
            float r1 = r9.e0.q(r9, r1, r3)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r4.setValue(r1)
            r19.a()
        Le8:
            r1 = r19
            boolean r1 = r1.f12294d
            if (r1 != 0) goto Lef
            goto Lf6
        Lef:
            r1 = r12
            r4 = 2
            r6 = 1
            goto L41
        Lf4:
            r16 = 0
        Lf6:
            java.lang.Object r1 = r4.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r2 = 1058306785(0x3f147ae1, float:0.58)
            float r5 = r3 * r2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L10b
            r3 = 1
            goto L11e
        L10b:
            java.lang.Object r1 = r4.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r3 = -r3
            float r3 = r3 * r2
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L11d
            r3 = -1
            goto L11e
        L11d:
            r3 = 0
        L11e:
            java.lang.Float r1 = java.lang.Float.valueOf(r16)
            r4.setValue(r1)
            if (r3 <= 0) goto L12d
            fg.a r1 = r0.f17787n
        L129:
            r1.invoke()
            goto L132
        L12d:
            if (r3 >= 0) goto L132
            fg.a r1 = r0.f17788o
            goto L129
        L132:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
