package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ch implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f15466i;

    public /* synthetic */ ch(int r2, fg.l r3) {
            r1 = this;
            r0 = 1
            r1.f15464g = r0
            r1.<init>()
            r1.f15465h = r2
            r1.f15466i = r3
            return
    }

    public /* synthetic */ ch(fg.l r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f15464g = r0
            r1.<init>()
            r1.f15466i = r2
            r1.f15465h = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f15464g
            java.lang.String r6 = (java.lang.String) r6
            switch(r0) {
                case 0: goto L4e;
                default: goto L7;
            }
        L7:
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length()
            r2 = 0
        L14:
            if (r2 >= r1) goto L26
            char r3 = r6.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 == 0) goto L23
            r0.append(r3)
        L23:
            int r2 = r2 + 1
            goto L14
        L26:
            java.lang.String r6 = r0.toString()
            r0 = 2
            java.lang.String r6 = og.m.P0(r0, r6)
            r0 = 10
            java.lang.Integer r0 = og.t.e0(r0, r6)
            int r1 = r6.length()
            if (r1 != 0) goto L3c
            goto L46
        L3c:
            if (r0 == 0) goto L4b
            int r0 = r0.intValue()
            int r1 = r5.f15465h
            if (r0 > r1) goto L4b
        L46:
            fg.l r0 = r5.f15466i
            r0.invoke(r6)
        L4b:
            sf.n r6 = sf.n.f12433a
            return r6
        L4e:
            r6.getClass()
            r0 = 10
            java.lang.Integer r6 = og.t.e0(r0, r6)
            if (r6 == 0) goto L5e
            int r6 = r6.intValue()
            goto L60
        L5e:
            int r6 = r5.f15465h
        L60:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            fg.l r0 = r5.f15466i
            r0.invoke(r6)
            sf.n r6 = sf.n.f12433a
            return r6
    }
}
