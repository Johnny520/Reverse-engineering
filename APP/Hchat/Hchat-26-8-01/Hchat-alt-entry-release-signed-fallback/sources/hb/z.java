package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.l f5507m;

    public /* synthetic */ z(fg.l r1, int r2, int r3, int r4, int r5, int r6, int r7) {
            r0 = this;
            r0.f5501g = r7
            r0.f5507m = r1
            r0.f5502h = r2
            r0.f5503i = r3
            r0.f5504j = r4
            r0.f5505k = r5
            r0.f5506l = r6
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f5501g
            switch(r0) {
                case 0: goto L4a;
                default: goto L5;
            }
        L5:
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 1
            int r2 = r8.f5502h
            r0.set(r1, r2)
            r1 = 2
            int r2 = r8.f5503i
            r0.set(r1, r2)
            r1 = 5
            int r2 = r8.f5504j
            r0.set(r1, r2)
            r1 = 11
            int r2 = r8.f5505k
            r0.set(r1, r2)
            r1 = 12
            int r2 = r8.f5506l
            r0.set(r1, r2)
            r1 = 13
            r0.set(r1, r9)
            r9 = 14
            r1 = 0
            r0.set(r9, r1)
            long r0 = r0.getTimeInMillis()
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            fg.l r0 = r8.f5507m
            r0.invoke(r9)
        L47:
            sf.n r9 = sf.n.f12433a
            return r9
        L4a:
            fg.l r0 = r8.f5507m
            hb.a0 r0 = (hb.a0) r0
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r7 = r9.intValue()
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            int r2 = r8.f5502h
            int r3 = r8.f5503i
            int r4 = r8.f5504j
            int r5 = r8.f5505k
            int r6 = r8.f5506l
            r1.set(r2, r3, r4, r5, r6, r7)
            r9 = 14
            r2 = 0
            r1.set(r9, r2)
            long r1 = r1.getTimeInMillis()
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            r0.invoke(r9)
            goto L47
    }
}
