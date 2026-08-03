package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.j f5927l;

    public i(i0.j r1, wf.c r2) {
            r0 = this;
            r0.f5927l = r1
            r0.<init>(r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            i0.i r0 = new i0.i
            i0.j r1 = r2.f5927l
            r0.<init>(r1, r4)
            r0.f5926k = r3
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ng.l r1 = (ng.l) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            i0.i r1 = (i0.i) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            i0.j r0 = r11.f5927l
            f.f0 r1 = r0.f5930g
            f.v r2 = r0.f5932i
            int r3 = r11.f5925j
            r4 = 1
            if (r3 == 0) goto L22
            if (r3 != r4) goto L1b
            int r3 = r11.f5924i
            int r5 = r11.f5923h
            int r6 = r11.f5922g
            java.lang.Object r7 = r11.f5926k
            ng.l r7 = (ng.l) r7
            f8.i.I0(r12)
            goto L2d
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r12 = 0
            return r12
        L22:
            f8.i.I0(r12)
            java.lang.Object r12 = r11.f5926k
            r7 = r12
            ng.l r7 = (ng.l) r7
            r3 = 0
            r5 = r3
            r6 = r5
        L2d:
            int r12 = r0.f5933j
            int r12 = r12 + 10
            int r8 = r2.f2916b
            int r12 = java.lang.Math.min(r12, r8)
            if (r6 >= r12) goto L15f
            int r12 = r6 + 1
            int r8 = r2.c(r6)
            r9 = 32
            switch(r8) {
                case 0: goto L139;
                case 1: goto L122;
                case 2: goto L100;
                case 3: goto Ld2;
                case 4: goto Lcf;
                case 5: goto Lae;
                case 6: goto L88;
                case 7: goto L69;
                case 8: goto L50;
                case 9: goto L4c;
                default: goto L44;
            }
        L44:
            java.lang.String r0 = "unknown op: "
            java.lang.String r0 = eh.a.l(r8, r0)
            goto L13b
        L4c:
            java.lang.String r0 = "recompose pending"
            goto L13b
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "reuse "
            r1.<init>(r2)
            f.f0 r0 = r0.f5931h
            int r2 = r3 + 1
            java.lang.Object r0 = r0.f(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3 = r2
            goto L13b
        L69:
            java.lang.Object r0 = r1.f(r5)
            r0.getClass()
            r1 = 2
            gg.x.c(r1, r0)
            fg.p r0 = (fg.p) r0
            int r5 = r5 + 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "apply "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L13b
        L88:
            int r0 = r6 + 2
            int r12 = r2.c(r12)
            int r2 = r5 + 1
            java.lang.Object r1 = r1.f(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "insertTopDown "
            r5.<init>(r8)
            r5.append(r12)
            r5.append(r9)
            r5.append(r1)
            java.lang.String r12 = r5.toString()
        La8:
            r5 = r0
            r0 = r12
            r12 = r5
            r5 = r2
            goto L13b
        Lae:
            int r0 = r6 + 2
            int r12 = r2.c(r12)
            int r2 = r5 + 1
            java.lang.Object r1 = r1.f(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "insertBottomUp "
            r5.<init>(r8)
            r5.append(r12)
            r5.append(r9)
            r5.append(r1)
            java.lang.String r12 = r5.toString()
            goto La8
        Lcf:
            java.lang.String r0 = "clear"
            goto L13b
        Ld2:
            int r0 = r6 + 2
            int r12 = r2.c(r12)
            int r1 = r6 + 3
            int r0 = r2.c(r0)
            int r8 = r6 + 4
            int r1 = r2.c(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r10 = "move "
            r2.<init>(r10)
            r2.append(r12)
            r2.append(r9)
            r2.append(r0)
            r2.append(r9)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r12 = r8
            goto L13b
        L100:
            int r0 = r6 + 2
            int r12 = r2.c(r12)
            int r1 = r6 + 3
            int r0 = r2.c(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "remove "
            r2.<init>(r8)
            r2.append(r12)
            r2.append(r9)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r12 = r1
            goto L13b
        L122:
            int r0 = r5 + 1
            java.lang.Object r1 = r1.f(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "down "
            r2.<init>(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5 = r0
            r0 = r1
            goto L13b
        L139:
            java.lang.String r0 = "up"
        L13b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = ": "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.f5926k = r7
            r11.f5922g = r12
            r11.f5923h = r5
            r11.f5924i = r3
            r11.f5925j = r4
            r7.a(r0, r11)
            xf.a r12 = xf.a.f21579g
            return r12
        L15f:
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
