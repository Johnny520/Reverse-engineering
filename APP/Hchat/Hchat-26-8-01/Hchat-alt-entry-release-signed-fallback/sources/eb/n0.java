package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h.Hchat.hooks.items.script.ScriptWaBridge f2601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback f2603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2604k;

    public /* synthetic */ n0(h.Hchat.hooks.items.script.ScriptWaBridge r1, java.lang.Object r2, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.f2600g = r5
            r0.f2601h = r1
            r0.f2602i = r2
            r0.f2603j = r3
            r0.f2604k = r4
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f2600g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            me.hd.wauxv.plugin.api.callback.PluginCallBack$DownloadCallback r0 = r4.f2603j
            java.lang.String r1 = r4.f2604k
            h.Hchat.hooks.items.script.ScriptWaBridge r2 = r4.f2601h
            java.lang.Object r3 = r4.f2602i
            sf.n r0 = h.Hchat.hooks.items.script.ScriptWaBridge.P(r2, r3, r0, r1)
            return r0
        L12:
            me.hd.wauxv.plugin.api.callback.PluginCallBack$DownloadCallback r0 = r4.f2603j
            java.lang.String r1 = r4.f2604k
            h.Hchat.hooks.items.script.ScriptWaBridge r2 = r4.f2601h
            java.lang.Object r3 = r4.f2602i
            sf.n r0 = h.Hchat.hooks.items.script.ScriptWaBridge.m(r2, r3, r0, r1)
            return r0
    }
}
