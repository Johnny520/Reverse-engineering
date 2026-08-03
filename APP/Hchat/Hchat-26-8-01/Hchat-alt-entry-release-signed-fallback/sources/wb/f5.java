package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f5 extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s1.t f16060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.l f16063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ wb.e5 f16064l;

    public /* synthetic */ f5(fg.l r1, wb.e5 r2, wf.c r3, int r4) {
            r0 = this;
            r0.f16059g = r4
            r0.f16063k = r1
            r0.f16064l = r2
            r0.<init>(r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            int r0 = r4.f16059g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            wb.f5 r0 = new wb.f5
            wb.e5 r1 = r4.f16064l
            r2 = 1
            fg.l r3 = r4.f16063k
            r0.<init>(r3, r1, r6, r2)
            r0.f16062j = r5
            return r0
        L12:
            wb.f5 r0 = new wb.f5
            wb.e5 r1 = r4.f16064l
            r2 = 0
            fg.l r3 = r4.f16063k
            r0.<init>(r3, r1, r6, r2)
            r0.f16062j = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f16059g
            s1.k0 r2 = (s1.k0) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            wb.f5 r2 = (wb.f5) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            wb.f5 r2 = (wb.f5) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            r25 = this;
            r0 = r25
            int r1 = r0.f16059g
            sf.n r2 = sf.n.f12433a
            s1.l r3 = s1.l.f12275h
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            xf.a r5 = xf.a.f21579g
            fg.l r8 = r0.f16063k
            wb.e5 r9 = r0.f16064l
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r12 = "#%06X"
            r15 = 3
            r16 = 0
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = 1
            r7 = 2
            switch(r1) {
                case 0: goto L13a;
                default: goto L22;
            }
        L22:
            float r1 = r9.f15833c
            float r9 = r9.f15832b
            r19 = 16777215(0xffffff, float:2.3509886E-38)
            java.lang.Object r13 = r0.f16062j
            s1.k0 r13 = (s1.k0) r13
            r20 = 0
            int r14 = r0.f16061i
            r21 = 1135869952(0x43b40000, float:360.0)
            if (r14 == 0) goto L50
            if (r14 == r6) goto L4a
            if (r14 != r7) goto L43
            s1.t r4 = r0.f16060h
            f8.i.I0(r26)
            r6 = r26
            r14 = r8
            goto Lb4
        L43:
            j8.o.A(r4)
            r2 = r16
            goto L139
        L4a:
            f8.i.I0(r26)
            r4 = r26
            goto L5e
        L50:
            f8.i.I0(r26)
            r0.f16062j = r13
            r0.f16061i = r6
            java.lang.Object r4 = m.y2.b(r13, r0, r7)
            if (r4 != r5) goto L5e
            goto Lb1
        L5e:
            s1.t r4 = (s1.t) r4
            r22 = r7
            r14 = r8
            long r7 = r4.f12293c
            long r7 = r7 & r17
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            s1.l0 r8 = r13.f12273l
            r23 = r6
            r26 = r7
            long r6 = r8.E
            long r6 = r6 & r17
            int r6 = (int) r6
            float r6 = (float) r6
            float r7 = r26 / r6
            float r6 = r9.e0.q(r7, r10, r11)
            float r6 = r6 * r21
            float[] r7 = new float[r15]
            r7[r20] = r6
            r7[r23] = r9
            r7[r22] = r1
            int r6 = android.graphics.Color.HSVToColor(r7)
            r6 = r6 & r19
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r7 = r23
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r6 = java.lang.String.format(r12, r6)
            r14.invoke(r6)
        La3:
            r0.f16062j = r13
            r0.f16060h = r4
            r6 = r22
            r0.f16061i = r6
            java.lang.Object r6 = r13.e(r3, r0)
            if (r6 != r5) goto Lb4
        Lb1:
            r2 = r5
            goto L139
        Lb4:
            s1.k r6 = (s1.k) r6
            java.lang.Object r6 = r6.f12262a
            java.util.Iterator r6 = r6.iterator()
        Lbc:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lde
            java.lang.Object r7 = r6.next()
            r8 = r7
            s1.t r8 = (s1.t) r8
            long r10 = r8.f12291a
            r24 = r1
            r8 = r2
            long r1 = r4.f12291a
            boolean r1 = s1.s.e(r10, r1)
            if (r1 == 0) goto Ld7
            goto Le3
        Ld7:
            r2 = r8
            r1 = r24
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            goto Lbc
        Lde:
            r24 = r1
            r8 = r2
            r7 = r16
        Le3:
            s1.t r7 = (s1.t) r7
            if (r7 == 0) goto L138
            long r1 = r7.f12293c
            long r1 = r1 & r17
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            s1.l0 r2 = r13.f12273l
            long r10 = r2.E
            long r10 = r10 & r17
            int r2 = (int) r10
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r9.e0.q(r1, r2, r6)
            float r1 = r1 * r21
            float[] r2 = new float[r15]
            r2[r20] = r1
            r1 = 1
            r2[r1] = r9
            r22 = 2
            r2[r22] = r24
            int r2 = android.graphics.Color.HSVToColor(r2)
            r2 = r2 & r19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r1 = java.lang.String.format(r12, r2)
            r14.invoke(r1)
            r7.a()
            boolean r1 = r7.f12294d
            if (r1 != 0) goto L12e
            goto L138
        L12e:
            r2 = r8
            r1 = r24
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r22 = 2
            goto La3
        L138:
            r2 = r8
        L139:
            return r2
        L13a:
            r14 = r8
            r19 = 16777215(0xffffff, float:2.3509886E-38)
            r20 = 0
            r8 = r2
            float r1 = r9.f15831a
            java.lang.Object r2 = r0.f16062j
            s1.k0 r2 = (s1.k0) r2
            int r6 = r0.f16061i
            r9 = 1
            r10 = 2
            if (r6 == 0) goto L16c
            if (r6 == r9) goto L166
            if (r6 != r10) goto L15f
            s1.t r4 = r0.f16060h
            f8.i.I0(r26)
            r11 = r8
            r6 = r14
            r8 = r1
            r1 = r26
            r26 = 32
            goto L1e2
        L15f:
            j8.o.A(r4)
            r2 = r16
            goto L266
        L166:
            f8.i.I0(r26)
            r4 = r26
            goto L17a
        L16c:
            f8.i.I0(r26)
            r0.f16062j = r2
            r0.f16061i = r9
            java.lang.Object r4 = m.y2.b(r2, r0, r10)
            if (r4 != r5) goto L17a
            goto L1df
        L17a:
            s1.t r4 = (s1.t) r4
            long r9 = r4.f12293c
            s1.l0 r6 = r2.f12273l
            r11 = r8
            r13 = 32
            long r7 = r6.E
            r26 = r13
            r6 = r14
            long r13 = r7 >> r26
            int r13 = (int) r13
            float r13 = (float) r13
            long r7 = r7 & r17
            int r7 = (int) r7
            float r7 = (float) r7
            r8 = r1
            r14 = r2
            long r1 = r9 >> r26
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 / r13
            r2 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            float r1 = r9.e0.q(r1, r2, r13)
            long r9 = r9 & r17
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = r9 / r7
            float r7 = r13 - r9
            float r7 = r9.e0.q(r7, r2, r13)
            float[] r2 = new float[r15]
            r2[r20] = r8
            r9 = 1
            r2[r9] = r1
            r10 = 2
            r2[r10] = r7
            int r1 = android.graphics.Color.HSVToColor(r2)
            r1 = r1 & r19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r9)
            java.lang.String r1 = java.lang.String.format(r12, r1)
            r6.invoke(r1)
            r2 = r14
        L1d3:
            r0.f16062j = r2
            r0.f16060h = r4
            r0.f16061i = r10
            java.lang.Object r1 = r2.e(r3, r0)
            if (r1 != r5) goto L1e2
        L1df:
            r2 = r5
            goto L266
        L1e2:
            s1.k r1 = (s1.k) r1
            java.lang.Object r1 = r1.f12262a
            java.util.Iterator r1 = r1.iterator()
        L1ea:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L202
            java.lang.Object r7 = r1.next()
            r9 = r7
            s1.t r9 = (s1.t) r9
            long r9 = r9.f12291a
            long r13 = r4.f12291a
            boolean r9 = s1.s.e(r9, r13)
            if (r9 == 0) goto L1ea
            goto L204
        L202:
            r7 = r16
        L204:
            s1.t r7 = (s1.t) r7
            if (r7 == 0) goto L265
            long r9 = r7.f12293c
            s1.l0 r1 = r2.f12273l
            long r13 = r1.E
            long r0 = r13 >> r26
            int r0 = (int) r0
            float r0 = (float) r0
            long r13 = r13 & r17
            int r1 = (int) r13
            float r1 = (float) r1
            long r13 = r9 >> r26
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r13 = r13 / r0
            r0 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            float r13 = r9.e0.q(r13, r0, r14)
            long r9 = r9 & r17
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = r9 / r1
            float r1 = r14 - r9
            float r1 = r9.e0.q(r1, r0, r14)
            float[] r9 = new float[r15]
            r9[r20] = r8
            r10 = 1
            r9[r10] = r13
            r22 = 2
            r9[r22] = r1
            int r1 = android.graphics.Color.HSVToColor(r9)
            r1 = r1 & r19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r10)
            java.lang.String r1 = java.lang.String.format(r12, r1)
            r6.invoke(r1)
            r7.a()
            boolean r1 = r7.f12294d
            if (r1 != 0) goto L25f
            goto L265
        L25f:
            r0 = r25
            r10 = r22
            goto L1d3
        L265:
            r2 = r11
        L266:
            return r2
    }
}
