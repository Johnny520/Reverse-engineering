package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ byte[] f2668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2669m;

    public /* synthetic */ u0(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, byte[] r5, java.lang.String r6, int r7) {
            r0 = this;
            r0.f2663g = r7
            r0.f2664h = r1
            r0.f2665i = r2
            r0.f2666j = r3
            r0.f2667k = r4
            r0.f2668l = r5
            r0.f2669m = r6
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f2663g
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            java.lang.String r6 = r8.f2669m
            r7 = r9
            j8.p r7 = (j8.p) r7
            java.lang.String r1 = r8.f2664h
            java.lang.String r2 = r8.f2665i
            java.lang.String r3 = r8.f2666j
            java.lang.String r4 = r8.f2667k
            byte[] r5 = r8.f2668l
            boolean r9 = h.Hchat.hooks.items.script.ScriptWaBridge.O(r1, r2, r3, r4, r5, r6, r7)
        L18:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L1d:
            java.lang.String r5 = r8.f2669m
            r6 = r9
            j8.p r6 = (j8.p) r6
            java.lang.String r0 = r8.f2664h
            java.lang.String r1 = r8.f2665i
            java.lang.String r2 = r8.f2666j
            java.lang.String r3 = r8.f2667k
            byte[] r4 = r8.f2668l
            boolean r9 = h.Hchat.hooks.items.script.ScriptWaBridge.w(r0, r1, r2, r3, r4, r5, r6)
            goto L18
    }
}
