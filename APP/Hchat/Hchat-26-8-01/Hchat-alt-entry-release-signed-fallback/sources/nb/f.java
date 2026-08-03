package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nb.w f9259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f9260i;

    public /* synthetic */ f(nb.w r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f9258g = r3
            r0.f9259h = r1
            r0.f9260i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.f9258g
            switch(r0) {
                case 0: goto L29;
                case 1: goto L1d;
                case 2: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r4.f9260i
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
        Lb:
            nb.w r1 = r4.f9259h
            nb.w.a(r1, r0)
            return
        L11:
            java.lang.String r0 = r4.f9260i
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
        L17:
            nb.w r1 = r4.f9259h
            nb.w.a(r1, r0)
            return
        L1d:
            java.lang.String r0 = r4.f9260i
            if (r0 != 0) goto L23
            java.lang.String r0 = ""
        L23:
            nb.w r1 = r4.f9259h
            nb.w.a(r1, r0)
            return
        L29:
            nb.n r0 = new nb.n
            java.lang.String r1 = r4.f9260i
            r0.<init>(r1)
            nb.w r1 = r4.f9259h
            nb.z r2 = r1.y()
            java.lang.String r3 = "text_speech_enable"
            boolean r2 = r2.b(r3)
            if (r2 != 0) goto L3f
            goto L47
        L3f:
            java.util.ArrayDeque r2 = r1.f9313c
            r2.addLast(r0)
            r1.n()
        L47:
            return
    }
}
