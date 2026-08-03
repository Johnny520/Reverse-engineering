package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f15199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f15201k;

    public /* synthetic */ bd(long r2, android.app.Activity r4, fg.l r5, java.lang.String r6) {
            r1 = this;
            r0 = 1
            r1.f15197g = r0
            r1.<init>()
            r1.f15198h = r6
            r1.f15199i = r2
            r1.f15200j = r4
            r1.f15201k = r5
            return
    }

    public /* synthetic */ bd(android.content.SharedPreferences r2, java.util.List r3, long r4, java.lang.String r6) {
            r1 = this;
            r0 = 0
            r1.f15197g = r0
            r1.<init>()
            r1.f15200j = r2
            r1.f15201k = r3
            r1.f15199i = r4
            r1.f15198h = r6
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
            r27 = this;
            r0 = r27
            int r1 = r0.f15197g
            switch(r1) {
                case 0: goto L7c;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f15200j
            r6 = r1
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r1 = r0.f15201k
            r7 = r1
            fg.l r7 = (fg.l) r7
            r5 = r28
            fg.a r5 = (fg.a) r5
            r1 = r29
            i0.h0 r1 = (i0.h0) r1
            r2 = r30
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto L32
            boolean r3 = r1.h(r5)
            if (r3 == 0) goto L30
            r3 = 4
            goto L31
        L30:
            r3 = 2
        L31:
            r2 = r2 | r3
        L32:
            r8 = r2
            r2 = r8 & 19
            r3 = 18
            if (r2 == r3) goto L3b
            r2 = 1
            goto L3c
        L3b:
            r2 = 0
        L3c:
            r3 = r8 & 1
            boolean r2 = r1.S(r3, r2)
            if (r2 == 0) goto L74
            wb.kf r2 = new wb.kf
            long r3 = r0.f15199i
            r2.<init>(r3, r5, r6, r7)
            r17 = r5
            r3 = 1778152648(0x69fc74c8, float:3.8150099E25)
            s0.d r23 = s0.i.e(r3, r2, r1)
            int r2 = r8 << 24
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r25 = r2 | 6
            r26 = 3072(0xc00, float:4.305E-42)
            r8 = 0
            java.lang.String r9 = r0.f15198h
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = r1
            oh.h.d(r8, r9, r10, r12, r14, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            goto L79
        L74:
            r24 = r1
            r24.V()
        L79:
            sf.n r1 = sf.n.f12433a
            return r1
        L7c:
            java.lang.Object r1 = r0.f15200j
            r3 = r1
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.Object r1 = r0.f15201k
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            r1 = r28
            r.d r1 = (r.d) r1
            r8 = r29
            i0.h0 r8 = (i0.h0) r8
            r2 = r30
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r5 = 16
            r9 = 1
            if (r1 == r5) goto La2
            r1 = r9
            goto La3
        La2:
            r1 = 0
        La3:
            r2 = r2 & r9
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto Lc1
            wb.kf r2 = new wb.kf
            long r5 = r0.f15199i
            java.lang.String r7 = r0.f15198h
            r2.<init>(r3, r4, r5, r7)
            r1 = -1197430173(0xffffffffb8a0aa63, float:-7.6611315E-5)
            s0.d r1 = s0.i.e(r1, r2, r8)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r8, r2, r9)
            goto Lc4
        Lc1:
            r8.V()
        Lc4:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
