package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2576j;

    public /* synthetic */ l(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.f2573g = r1
            r0.f2574h = r2
            r0.f2575i = r3
            r0.f2576j = r4
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f2573g
            switch(r0) {
                case 0: goto L38;
                case 1: goto L27;
                case 2: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r3.f2576j
            j8.p r4 = (j8.p) r4
            java.lang.String r1 = r3.f2574h
            java.lang.String r2 = r3.f2575i
            boolean r4 = h.Hchat.hooks.items.script.ScriptWaBridge.l(r1, r2, r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L16:
            java.lang.String r0 = r3.f2576j
            j8.p r4 = (j8.p) r4
            java.lang.String r1 = r3.f2574h
            java.lang.String r2 = r3.f2575i
            boolean r4 = h.Hchat.hooks.items.script.ScriptWaBridge.b(r1, r2, r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L27:
            java.lang.String r0 = r3.f2576j
            j8.p r4 = (j8.p) r4
            java.lang.String r1 = r3.f2574h
            java.lang.String r2 = r3.f2575i
            boolean r4 = h.Hchat.hooks.items.script.ScriptWaBridge.f(r1, r2, r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L38:
            java.lang.String r0 = r3.f2576j
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String r1 = r3.f2574h
            java.lang.String r2 = r3.f2575i
            sf.n r4 = h.Hchat.hooks.items.script.ScriptPluginBridge.t(r1, r2, r0, r4)
            return r4
    }
}
