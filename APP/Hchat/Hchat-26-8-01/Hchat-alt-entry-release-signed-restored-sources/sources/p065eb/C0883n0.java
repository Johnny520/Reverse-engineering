package p065eb;

import me.p186hd.wauxv.plugin.api.callback.PluginCallBack;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;

/* JADX INFO: renamed from: eb.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0883n0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2720g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ScriptWaBridge f2721h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2722i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ PluginCallBack.DownloadCallback f2723j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f2724k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0883n0(ScriptWaBridge scriptWaBridge, Object obj, PluginCallBack.DownloadCallback downloadCallback, String str, int i9) {
        this.f2720g = i9;
        this.f2721h = scriptWaBridge;
        this.f2722i = obj;
        this.f2723j = downloadCallback;
        this.f2724k = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f2720g) {
            case 0:
                return ScriptWaBridge.downloadVideo$lambda$1(this.f2721h, this.f2722i, this.f2723j, this.f2724k);
            default:
                return ScriptWaBridge.downloadImg$lambda$0(this.f2721h, this.f2722i, this.f2723j, this.f2724k);
        }
    }
}
