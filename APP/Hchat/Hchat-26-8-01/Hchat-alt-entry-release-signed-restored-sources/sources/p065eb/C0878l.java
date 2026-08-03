package p065eb;

import android.app.Activity;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p136j8.C2105p;

/* JADX INFO: renamed from: eb.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0878l implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2693g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2694h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f2695i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f2696j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0878l(int i9, String str, String str2, String str3) {
        this.f2693g = i9;
        this.f2694h = str;
        this.f2695i = str2;
        this.f2696j = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f2693g) {
            case 0:
                return ScriptPluginBridge.showModuleDialog$lambda$0(this.f2694h, this.f2695i, this.f2696j, (Activity) obj);
            case 1:
                return Boolean.valueOf(ScriptWaBridge.sendImage$lambda$1(this.f2694h, this.f2695i, this.f2696j, (C2105p) obj));
            case 2:
                return Boolean.valueOf(ScriptWaBridge.sendFile$lambda$1(this.f2694h, this.f2695i, this.f2696j, (C2105p) obj));
            default:
                return Boolean.valueOf(ScriptWaBridge.shareText$lambda$0(this.f2694h, this.f2695i, this.f2696j, (C2105p) obj));
        }
    }
}
