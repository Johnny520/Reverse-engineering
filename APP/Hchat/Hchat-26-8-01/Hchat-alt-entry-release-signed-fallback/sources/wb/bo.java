package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class bo implements i0.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb.b0 f15269b;

    public /* synthetic */ bo(eb.b0 r1, int r2) {
            r0 = this;
            r0.f15268a = r2
            r0.f15269b = r1
            r0.<init>()
            return
    }

    @Override // i0.z
    public final void a() {
            r2 = this;
            int r0 = r2.f15268a
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            eb.b0 r0 = r2.f15269b
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.access$getPluginCatalogListeners$p()
            fg.a r0 = r0.f2501a
            r1.remove(r0)
            return
        L14:
            eb.b0 r0 = r2.f15269b
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.access$getPluginCatalogListeners$p()
            fg.a r0 = r0.f2501a
            r1.remove(r0)
            return
    }
}
