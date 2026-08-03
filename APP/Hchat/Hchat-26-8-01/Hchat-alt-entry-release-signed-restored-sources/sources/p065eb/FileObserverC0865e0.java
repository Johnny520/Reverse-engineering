package p065eb;

import android.os.FileObserver;
import java.io.File;
import okhttp3.HttpUrl;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: eb.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FileObserverC0865e0 extends FileObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2658a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f2659b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileObserverC0865e0(File file, String str, int i9) {
        super(str, 4040);
        this.f2658a = i9;
        this.f2659b = file;
        switch (i9) {
            case 1:
                super(str, 4032);
                break;
            default:
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.FileObserver
    public final void onEvent(int i9, String str) throws Throwable {
        switch (this.f2658a) {
            case 0:
                String strM6697L0 = str != null ? AbstractC3149m.m6697L0(str, '/', str) : HttpUrl.FRAGMENT_ENCODE_SET;
                if (strM6697L0.length() == 0) {
                    ScriptPluginRuntime.INSTANCE.notifyPluginCatalogChanged();
                } else if (strM6697L0.equals("main.java")) {
                    ScriptPluginRuntime scriptPluginRuntime = ScriptPluginRuntime.INSTANCE;
                    scriptPluginRuntime.notifyPluginCatalogChanged();
                    String name = this.f2659b.getName();
                    name.getClass();
                    scriptPluginRuntime.schedulePluginReload(name);
                } else if (strM6697L0.equals("info.prop") || strM6697L0.equals("README.md")) {
                    ScriptPluginRuntime.INSTANCE.notifyPluginCatalogChanged();
                }
                break;
            default:
                ScriptPluginRuntime scriptPluginRuntime2 = ScriptPluginRuntime.INSTANCE;
                scriptPluginRuntime2.refreshPluginDirObservers(this.f2659b);
                scriptPluginRuntime2.notifyPluginCatalogChanged();
                break;
        }
    }
}
