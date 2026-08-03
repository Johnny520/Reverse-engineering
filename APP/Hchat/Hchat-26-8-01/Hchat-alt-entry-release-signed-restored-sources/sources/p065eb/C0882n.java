package p065eb;

import java.util.Set;
import java.util.function.Consumer;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;

/* JADX INFO: renamed from: eb.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0882n implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2717g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ScriptPluginBridge f2718h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Consumer f2719i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0882n(ScriptPluginBridge scriptPluginBridge, Consumer consumer, int i9) {
        this.f2717g = i9;
        this.f2718h = scriptPluginBridge;
        this.f2719i = consumer;
    }

    /* JADX DEBUG: Class process forced to load method for inline: h.Hchat.hooks.items.script.ScriptPluginBridge.a(h.Hchat.hooks.items.script.ScriptPluginBridge, java.util.function.Consumer, java.lang.String):sf.n */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f2717g) {
            case 0:
                return ScriptPluginBridge.showModuleChoiceDialog$lambda$1$1(this.f2718h, this.f2719i, ((Integer) obj).intValue());
            case 1:
                return ScriptPluginBridge.showModuleMultiChoiceDialog$lambda$3$1(this.f2718h, this.f2719i, (Set) obj);
            case 2:
                return ScriptPluginBridge.showModuleConfirmDialog$lambda$0$0(this.f2718h, this.f2719i, ((Boolean) obj).booleanValue());
            default:
                return ScriptPluginBridge.showModuleInputDialog$lambda$0$0(this.f2718h, this.f2719i, (String) obj);
        }
    }
}
