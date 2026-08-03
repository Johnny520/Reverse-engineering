package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements wa.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f2656h;

    public /* synthetic */ t(java.util.function.Consumer r1, int r2) {
            r0 = this;
            r0.f2655g = r2
            r0.f2656h = r1
            r0.<init>()
            return
    }

    @Override // wa.h
    public final void c(java.lang.String r2, boolean r3) {
            r1 = this;
            int r0 = r1.f2655g
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.util.function.Consumer r0 = r1.f2656h
            h.Hchat.hooks.items.script.ScriptPluginRuntime.j(r0, r3, r2)
            return
        Lb:
            java.util.function.Consumer r0 = r1.f2656h
            h.Hchat.hooks.items.script.ScriptPluginRuntime.f(r0, r3, r2)
            return
    }
}
