package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class go extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s1.t f16435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wb.t4 f16441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fg.l f16442n;

    public go(wb.t4 r1, fg.l r2, wf.c r3) {
            r0 = this;
            r0.f16441m = r1
            r0.f16442n = r2
            r0.<init>(r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            wb.go r0 = new wb.go
            wb.t4 r1 = r3.f16441m
            fg.l r2 = r3.f16442n
            r0.<init>(r1, r2, r5)
            r0.f16440l = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            s1.k0 r1 = (s1.k0) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.go r1 = (wb.go) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.f16440l
            s1.k0 r1 = (s1.k0) r1
            int r2 = r0.f16439k
            r4 = 2
            r5 = 0
            r7 = 1
            xf.a r8 = xf.a.f21579g
            if (r2 == 0) goto L2d
            if (r2 == r7) goto L27
            if (r2 != r4) goto L21
            int r2 = r0.f16438j
            float r9 = r0.f16437i
            float r10 = r0.f16436h
            s1.t r11 = r0.f16435g
            f8.i.I0(r21)
            r12 = r21
            goto L56
        L21:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            return r5
        L27:
            f8.i.I0(r21)
            r2 = r21
            goto L3b
        L2d:
            f8.i.I0(r21)
            r0.f16440l = r1
            r0.f16439k = r7
            java.lang.Object r2 = m.y2.b(r1, r0, r4)
            if (r2 != r8) goto L3b
            goto L55
        L3b:
            s1.t r2 = (s1.t) r2
            r11 = r2
            r2 = 0
            r9 = 0
            r10 = 0
        L41:
            r0.f16440l = r1
            r0.f16435g = r11
            r0.f16436h = r10
            r0.f16437i = r9
            r0.f16438j = r2
            r0.f16439k = r4
            s1.l r12 = s1.l.f12275h
            java.lang.Object r12 = r1.e(r12, r0)
            if (r12 != r8) goto L56
        L55:
            return r8
        L56:
            s1.k r12 = (s1.k) r12
            java.lang.Object r12 = r12.f12262a
            java.util.Iterator r12 = r12.iterator()
        L5e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L79
            java.lang.Object r13 = r12.next()
            r14 = r13
            s1.t r14 = (s1.t) r14
            long r14 = r14.f12291a
            long r4 = r11.f12291a
            boolean r4 = s1.s.e(r14, r4)
            if (r4 == 0) goto L76
            goto L7a
        L76:
            r4 = 2
            r5 = 0
            goto L5e
        L79:
            r13 = 0
        L7a:
            s1.t r13 = (s1.t) r13
            if (r13 == 0) goto Ldc
            long r4 = r13.f12297g
            long r14 = r13.f12293c
            r12 = 32
            r17 = r7
            r16 = 0
            long r6 = r14 >> r12
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r18 = r4
            long r3 = r18 >> r12
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r6 = r6 - r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r3
            int r5 = (int) r14
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r3 = r18 & r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r5 = r5 - r3
            float r10 = r10 + r6
            float r9 = r9 + r5
            if (r2 != 0) goto Lcc
            float r3 = java.lang.Math.abs(r10)
            r4 = 1103101952(0x41c00000, float:24.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto Lcc
            float r3 = java.lang.Math.abs(r10)
            float r4 = java.lang.Math.abs(r9)
            r5 = 1068289229(0x3faccccd, float:1.35)
            float r4 = r4 * r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto Lcc
            r2 = r17
        Lcc:
            if (r2 == 0) goto Ld1
            r13.a()
        Ld1:
            boolean r3 = r13.f12294d
            if (r3 != 0) goto Ld6
            goto Le0
        Ld6:
            r7 = r17
            r4 = 2
            r5 = 0
            goto L41
        Ldc:
            r17 = r7
            r16 = 0
        Le0:
            if (r2 == 0) goto L131
            float r1 = java.lang.Math.abs(r10)
            r2 = 1118568448(0x42ac0000, float:86.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L131
            float r1 = java.lang.Math.abs(r10)
            float r2 = java.lang.Math.abs(r9)
            r3 = 1067030938(0x3f99999a, float:1.2)
            float r2 = r2 * r3
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L131
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            zf.b r2 = wb.t4.f19169l
            wb.t4 r3 = r0.f16441m
            if (r1 >= 0) goto L11c
            og.k r1 = wb.ho.f16633a
            int r1 = r3.ordinal()
            int r1 = r1 + 1
            int r4 = a.a.b0(r2)
            r7 = 0
        L111:
            int r1 = r9.e0.r(r1, r7, r4)
            java.lang.Object r1 = r2.get(r1)
            wb.t4 r1 = (wb.t4) r1
            goto L12a
        L11c:
            r7 = 0
            og.k r1 = wb.ho.f16633a
            int r1 = r3.ordinal()
            int r1 = r1 + (-1)
            int r4 = a.a.b0(r2)
            goto L111
        L12a:
            if (r1 == r3) goto L131
            fg.l r2 = r0.f16442n
            r2.invoke(r1)
        L131:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
