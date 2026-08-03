package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements tg.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f4768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f4769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Object f4770j;

    public /* synthetic */ w(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f4767g = r4
            r0.f4768h = r1
            r0.f4769i = r2
            r0.f4770j = r3
            r0.<init>()
            return
    }

    public w(java.util.List r2, i0.a1 r3, i0.a1 r4) {
            r1 = this;
            r0 = 3
            r1.f4767g = r0
            r1.<init>()
            r1.f4768h = r2
            r1.f4770j = r3
            r1.f4769i = r4
            return
    }

    public w(tg.e r3, wf.g r4) {
            r2 = this;
            r0 = 2
            r2.f4767g = r0
            r2.<init>()
            r2.f4768h = r4
            java.lang.Object r4 = vg.a.k(r4)
            r2.f4769i = r4
            ci.j r4 = new ci.j
            r0 = 0
            r1 = 17
            r4.<init>(r3, r0, r1)
            r2.f4770j = r4
            return
    }

    @Override // tg.e
    public final java.lang.Object e(java.lang.Object r8, wf.c r9) {
            r7 = this;
            int r0 = r7.f4767g
            switch(r0) {
                case 0: goto Le2;
                case 1: goto L59;
                case 2: goto L43;
                default: goto L5;
            }
        L5:
            sf.e r8 = (sf.e) r8
            java.lang.Object r9 = r7.f4770j
            i0.a1 r9 = (i0.a1) r9
            java.lang.Object r0 = r8.f12418g
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r8 = r8.f12419h
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L23
            wb.y2.Q(r9, r2)
            goto L28
        L23:
            if (r0 == 0) goto L28
            wb.y2.Q(r9, r1)
        L28:
            java.lang.Object r9 = r7.f4769i
            i0.a1 r9 = (i0.a1) r9
            if (r8 != 0) goto L39
            java.lang.Object r8 = r7.f4768h
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L39
            r1 = r2
        L39:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r9.setValue(r8)
            sf.n r8 = sf.n.f12433a
            return r8
        L43:
            java.lang.Object r0 = r7.f4768h
            wf.g r0 = (wf.g) r0
            java.lang.Object r1 = r7.f4770j
            ci.j r1 = (ci.j) r1
            java.lang.Object r2 = r7.f4769i
            java.lang.Object r8 = ug.c.a(r0, r8, r2, r1, r9)
            xf.a r9 = xf.a.f21579g
            if (r8 != r9) goto L56
            goto L58
        L56:
            sf.n r8 = sf.n.f12433a
        L58:
            return r8
        L59:
            boolean r0 = r9 instanceof tg.g
            if (r0 == 0) goto L6c
            r0 = r9
            tg.g r0 = (tg.g) r0
            int r1 = r0.f13204k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L6c
            int r1 = r1 - r2
            r0.f13204k = r1
            goto L71
        L6c:
            tg.g r0 = new tg.g
            r0.<init>(r7, r9)
        L71:
            java.lang.Object r9 = r0.f13202i
            int r1 = r0.f13204k
            r2 = 3
            r3 = 2
            sf.n r4 = sf.n.f12433a
            r5 = 1
            xf.a r6 = xf.a.f21579g
            if (r1 == 0) goto L97
            if (r1 == r5) goto L84
            if (r1 == r3) goto L8f
            if (r1 != r2) goto L88
        L84:
            f8.i.I0(r9)
            goto Le1
        L88:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r4 = 0
            goto Le1
        L8f:
            java.lang.Object r8 = r0.f13201h
            h.w r1 = r0.f13200g
            f8.i.I0(r9)
            goto Lc1
        L97:
            f8.i.I0(r9)
            java.lang.Object r9 = r7.f4768h
            gg.q r9 = (gg.q) r9
            boolean r9 = r9.f4560g
            if (r9 == 0) goto Laf
            java.lang.Object r9 = r7.f4769i
            tg.e r9 = (tg.e) r9
            r0.f13204k = r5
            java.lang.Object r8 = r9.e(r8, r0)
            if (r8 != r6) goto Le1
            goto Le0
        Laf:
            java.lang.Object r9 = r7.f4770j
            i0.v1 r9 = (i0.v1) r9
            r0.f13200g = r7
            r0.f13201h = r8
            r0.f13204k = r3
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r6) goto Lc0
            goto Le0
        Lc0:
            r1 = r7
        Lc1:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto Le1
            java.lang.Object r9 = r1.f4768h
            gg.q r9 = (gg.q) r9
            r9.f4560g = r5
            java.lang.Object r9 = r1.f4769i
            tg.e r9 = (tg.e) r9
            r1 = 0
            r0.f13200g = r1
            r0.f13201h = r1
            r0.f13204k = r2
            java.lang.Object r8 = r9.e(r8, r0)
            if (r8 != r6) goto Le1
        Le0:
            r4 = r6
        Le1:
            return r4
        Le2:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.Object r9 = r7.f4769i
            i.k1 r9 = (i.k1) r9
            java.lang.Object r0 = r7.f4768h
            i0.o1 r0 = (i0.o1) r0
            if (r8 == 0) goto L111
            java.lang.Object r8 = r7.f4770j
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r8 = r8.getValue()
            fg.p r8 = (fg.p) r8
            java.lang.Object r1 = r9.c()
            i0.j1 r9 = r9.f5710d
            java.lang.Object r9 = r9.getValue()
            java.lang.Object r8 = r8.invoke(r1, r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L112
        L111:
            r8 = 0
        L112:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0.setValue(r8)
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
