package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f2680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o8.j f2681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback f2683k;

    public /* synthetic */ w0(java.util.concurrent.atomic.AtomicBoolean r1, o8.j r2, java.lang.String r3, me.hd.wauxv.plugin.api.callback.PluginCallBack.DownloadCallback r4, int r5) {
            r0 = this;
            r0.f2679g = r5
            r0.f2680h = r1
            r0.f2681i = r2
            r0.f2682j = r3
            r0.f2683k = r4
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f2679g
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            me.hd.wauxv.plugin.api.callback.PluginCallBack$DownloadCallback r0 = r4.f2683k
            java.lang.Exception r5 = (java.lang.Exception) r5
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f2680h
            o8.j r2 = r4.f2681i
            java.lang.String r3 = r4.f2682j
            sf.n r5 = h.Hchat.hooks.items.script.ScriptWaBridge.H(r1, r2, r3, r0, r5)
            return r5
        L14:
            me.hd.wauxv.plugin.api.callback.PluginCallBack$DownloadCallback r0 = r4.f2683k
            java.io.File r5 = (java.io.File) r5
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f2680h
            o8.j r2 = r4.f2681i
            java.lang.String r3 = r4.f2682j
            sf.n r5 = h.Hchat.hooks.items.script.ScriptWaBridge.M(r1, r2, r3, r0, r5)
            return r5
    }
}
