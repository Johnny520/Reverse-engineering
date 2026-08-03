package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f13151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.Iterator f13152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f13157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f13158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f13159o;

    public e0(int r1, int r2, java.util.Iterator r3, wf.c r4) {
            r0 = this;
            r0.f13157m = r1
            r0.f13158n = r2
            r0.f13159o = r3
            r0.<init>(r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            tf.e0 r0 = new tf.e0
            int r1 = r4.f13158n
            java.util.Iterator r2 = r4.f13159o
            int r3 = r4.f13157m
            r0.<init>(r3, r1, r2, r6)
            r0.f13156l = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ng.l r1 = (ng.l) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            tf.e0 r1 = (tf.e0) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.f13156l
            ng.l r1 = (ng.l) r1
            int r2 = r0.f13155k
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            int r7 = r0.f13158n
            r8 = 1
            int r9 = r0.f13157m
            r10 = 0
            xf.a r11 = xf.a.f21579g
            if (r2 == 0) goto L6b
            if (r2 == r8) goto L57
            if (r2 == r6) goto L52
            if (r2 == r5) goto L40
            if (r2 == r4) goto L30
            if (r2 != r3) goto L29
            java.lang.Object r1 = r0.f13151g
            tf.c0 r1 = (tf.c0) r1
        L24:
            f8.i.I0(r21)
            goto L178
        L29:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
        L2e:
            r1 = 0
            return r1
        L30:
            int r2 = r0.f13154j
            int r5 = r0.f13153i
            java.lang.Object r6 = r0.f13151g
            tf.c0 r6 = (tf.c0) r6
            f8.i.I0(r21)
            r6.a(r7)
            goto L147
        L40:
            int r2 = r0.f13154j
            int r6 = r0.f13153i
            java.util.Iterator r12 = r0.f13152h
            java.lang.Object r13 = r0.f13151g
            tf.c0 r13 = (tf.c0) r13
            f8.i.I0(r21)
            r13.a(r7)
            goto Lcf
        L52:
            java.lang.Object r1 = r0.f13151g
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            goto L24
        L57:
            int r2 = r0.f13154j
            int r3 = r0.f13153i
            java.util.Iterator r4 = r0.f13152h
            java.lang.Object r5 = r0.f13151g
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            f8.i.I0(r21)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r9)
            r12 = r2
            goto L83
        L6b:
            f8.i.I0(r21)
            r2 = 1024(0x400, float:1.435E-42)
            if (r9 <= r2) goto L73
            goto L74
        L73:
            r2 = r9
        L74:
            int r12 = r7 - r9
            java.util.Iterator r13 = r0.f13159o
            r14 = 0
            if (r12 < 0) goto Lc1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            r3 = r2
            r4 = r13
            r2 = r14
        L83:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lab
            java.lang.Object r7 = r4.next()
            if (r2 <= 0) goto L92
            int r2 = r2 + (-1)
            goto L83
        L92:
            r5.add(r7)
            int r7 = r5.size()
            if (r7 != r9) goto L83
            r0.f13156l = r1
            r0.f13151g = r5
            r0.f13152h = r4
            r0.f13153i = r3
            r0.f13154j = r12
            r0.f13155k = r8
            r1.a(r5, r0)
            return r11
        Lab:
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L178
            r0.f13156l = r10
            r0.f13151g = r10
            r0.f13152h = r10
            r0.f13153i = r3
            r0.f13154j = r12
            r0.f13155k = r6
            r1.a(r5, r0)
            return r11
        Lc1:
            tf.c0 r6 = new tf.c0
            java.lang.Object[] r15 = new java.lang.Object[r2]
            r6.<init>(r14, r15)
            r19 = r6
            r6 = r2
            r2 = r12
            r12 = r13
            r13 = r19
        Lcf:
            int r14 = r13.f13144h
            java.lang.Object[] r15 = r13.f13143g
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L145
            java.lang.Object r16 = r12.next()
            r17 = r8
            int r8 = r13.size()
            if (r8 == r14) goto L13e
            int r8 = r13.f13145i
            int r18 = r13.size()
            int r18 = r18 + r8
            int r18 = r18 % r14
            r15[r18] = r16
            int r8 = r13.size()
            int r8 = r8 + 1
            r13.f13146j = r8
            int r8 = r13.size()
            if (r8 != r14) goto L126
            int r8 = r13.size()
            if (r8 >= r9) goto L129
            int r8 = r14 >> 1
            int r14 = r14 + r8
            int r14 = r14 + 1
            if (r14 <= r9) goto L10d
            r14 = r9
        L10d:
            int r8 = r13.f13145i
            if (r8 != 0) goto L116
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r15, r14)
            goto L11c
        L116:
            java.lang.Object[] r8 = new java.lang.Object[r14]
            java.lang.Object[] r8 = r13.toArray(r8)
        L11c:
            tf.c0 r14 = new tf.c0
            int r13 = r13.size()
            r14.<init>(r13, r8)
            r13 = r14
        L126:
            r8 = r17
            goto Lcf
        L129:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r13)
            r0.f13156l = r1
            r0.f13151g = r13
            r0.f13152h = r12
            r0.f13153i = r6
            r0.f13154j = r2
            r0.f13155k = r5
            r1.a(r3, r0)
            return r11
        L13e:
            java.lang.String r1 = "ring buffer is full"
            j8.o.A(r1)
            goto L2e
        L145:
            r5 = r6
            r6 = r13
        L147:
            int r8 = r6.size()
            if (r8 <= r7) goto L162
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            r0.f13156l = r1
            r0.f13151g = r6
            r0.f13152h = r10
            r0.f13153i = r5
            r0.f13154j = r2
            r0.f13155k = r4
            r1.a(r3, r0)
            return r11
        L162:
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L178
            r0.f13156l = r10
            r0.f13151g = r10
            r0.f13152h = r10
            r0.f13153i = r5
            r0.f13154j = r2
            r0.f13155k = r3
            r1.a(r6, r0)
            return r11
        L178:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
