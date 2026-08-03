package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.Hchat.hooks.items.script.ScriptPluginBridge f2598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f2599i;

    public /* synthetic */ n(h.Hchat.hooks.items.script.ScriptPluginBridge r1, java.util.function.Consumer r2, int r3) {
            r0 = this;
            r0.f2597g = r3
            r0.f2598h = r1
            r0.f2599i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f2597g
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L1f;
                case 2: goto L10;
                default: goto L5;
            }
        L5:
            java.util.function.Consumer r0 = r2.f2599i
            java.lang.String r3 = (java.lang.String) r3
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = r2.f2598h
            sf.n r3 = h.Hchat.hooks.items.script.ScriptPluginBridge.a(r1, r0, r3)
            return r3
        L10:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = r2.f2598h
            java.util.function.Consumer r1 = r2.f2599i
            sf.n r3 = h.Hchat.hooks.items.script.ScriptPluginBridge.n(r0, r1, r3)
            return r3
        L1f:
            java.util.function.Consumer r0 = r2.f2599i
            java.util.Set r3 = (java.util.Set) r3
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = r2.f2598h
            sf.n r3 = h.Hchat.hooks.items.script.ScriptPluginBridge.i(r1, r0, r3)
            return r3
        L2a:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = r2.f2598h
            java.util.function.Consumer r1 = r2.f2599i
            sf.n r3 = h.Hchat.hooks.items.script.ScriptPluginBridge.f(r0, r1, r3)
            return r3
    }
}
