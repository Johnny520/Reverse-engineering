package p332wb;

import p065eb.C0856b0;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p117i0.InterfaceC1898z;

/* JADX INFO: renamed from: wb.bo */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4758bo implements InterfaceC1898z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0856b0 f16107b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4758bo(C0856b0 c0856b0, int i9) {
        this.f16106a = i9;
        this.f16107b = c0856b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1898z
    /* JADX INFO: renamed from: a */
    public final void mo725a() {
        switch (this.f16106a) {
            case 0:
                C0856b0 c0856b0 = this.f16107b;
                c0856b0.getClass();
                ScriptPluginRuntime.pluginCatalogListeners.remove(c0856b0.f2621a);
                break;
            default:
                C0856b0 c0856b02 = this.f16107b;
                c0856b02.getClass();
                ScriptPluginRuntime.pluginCatalogListeners.remove(c0856b02.f2621a);
                break;
        }
    }
}
