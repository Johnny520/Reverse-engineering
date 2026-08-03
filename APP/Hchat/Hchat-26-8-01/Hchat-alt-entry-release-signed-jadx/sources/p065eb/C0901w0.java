package p065eb;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import me.p186hd.wauxv.plugin.api.callback.PluginCallBack;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p210o8.C3086j;

/* JADX INFO: renamed from: eb.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0901w0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2799g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AtomicBoolean f2800h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3086j f2801i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f2802j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ PluginCallBack.DownloadCallback f2803k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0901w0(AtomicBoolean atomicBoolean, C3086j c3086j, String str, PluginCallBack.DownloadCallback downloadCallback, int i9) {
        this.f2799g = i9;
        this.f2800h = atomicBoolean;
        this.f2801i = c3086j;
        this.f2802j = str;
        this.f2803k = downloadCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f2799g) {
            case 0:
                return ScriptWaBridge.downloadVideoInternal$lambda$0(this.f2800h, this.f2801i, this.f2802j, this.f2803k, (File) obj);
            default:
                return ScriptWaBridge.downloadVideoInternal$lambda$1(this.f2800h, this.f2801i, this.f2802j, this.f2803k, (Exception) obj);
        }
    }
}
