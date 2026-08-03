package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends android.os.FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.io.File f2539b;

    public e0(java.io.File r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f2538a = r3
            r0.f2539b = r1
            switch(r3) {
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            r1 = 4040(0xfc8, float:5.661E-42)
            r0.<init>(r2, r1)
            return
        Ld:
            r1 = 4032(0xfc0, float:5.65E-42)
            r0.<init>(r2, r1)
            return
    }

    @Override // android.os.FileObserver
    public final void onEvent(int r1, java.lang.String r2) {
            r0 = this;
            int r1 = r0.f2538a
            switch(r1) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.io.File r2 = r0.f2539b
            h.Hchat.hooks.items.script.ScriptPluginRuntime.access$refreshPluginDirObservers(r1, r2)
            h.Hchat.hooks.items.script.ScriptPluginRuntime.access$notifyPluginCatalogChanged(r1)
            return
        L10:
            if (r2 == 0) goto L19
            r1 = 47
            java.lang.String r1 = og.m.L0(r2, r1, r2)
            goto L1b
        L19:
            java.lang.String r1 = ""
        L1b:
            int r2 = r1.length()
            if (r2 != 0) goto L27
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            h.Hchat.hooks.items.script.ScriptPluginRuntime.access$notifyPluginCatalogChanged(r1)
            goto L56
        L27:
            java.lang.String r2 = "main.java"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L41
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            h.Hchat.hooks.items.script.ScriptPluginRuntime.access$notifyPluginCatalogChanged(r1)
            java.io.File r2 = r0.f2539b
            java.lang.String r2 = r2.getName()
            r2.getClass()
            h.Hchat.hooks.items.script.ScriptPluginRuntime.access$schedulePluginReload(r1, r2)
            goto L56
        L41:
            java.lang.String r2 = "info.prop"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L51
            java.lang.String r2 = "README.md"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L56
        L51:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            h.Hchat.hooks.items.script.ScriptPluginRuntime.access$notifyPluginCatalogChanged(r1)
        L56:
            return
    }
}
