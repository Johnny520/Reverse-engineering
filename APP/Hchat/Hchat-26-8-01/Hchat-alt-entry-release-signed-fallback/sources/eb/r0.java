package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ byte[] f2648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2649n;

    public /* synthetic */ r0(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, byte[] r6, java.lang.String r7, int r8) {
            r0 = this;
            r0.f2642g = r8
            r0.f2643h = r1
            r0.f2644i = r2
            r0.f2645j = r3
            r0.f2646k = r4
            r0.f2647l = r5
            r0.f2648m = r6
            r0.f2649n = r7
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f2642g
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.String r7 = r9.f2649n
            r8 = r10
            j8.p r8 = (j8.p) r8
            java.lang.String r1 = r9.f2643h
            java.lang.String r2 = r9.f2644i
            java.lang.String r3 = r9.f2645j
            java.lang.String r4 = r9.f2646k
            java.lang.String r5 = r9.f2647l
            byte[] r6 = r9.f2648m
            boolean r10 = h.Hchat.hooks.items.script.ScriptWaBridge.F(r1, r2, r3, r4, r5, r6, r7, r8)
        L1a:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L1f:
            java.lang.String r6 = r9.f2649n
            r7 = r10
            j8.p r7 = (j8.p) r7
            java.lang.String r0 = r9.f2643h
            java.lang.String r1 = r9.f2644i
            java.lang.String r2 = r9.f2645j
            java.lang.String r3 = r9.f2646k
            java.lang.String r4 = r9.f2647l
            byte[] r5 = r9.f2648m
            boolean r10 = h.Hchat.hooks.items.script.ScriptWaBridge.v(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L1a
    }
}
