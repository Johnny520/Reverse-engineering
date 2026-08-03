package p065eb;

import java.util.function.Consumer;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p331wa.InterfaceC4697h;

/* JADX INFO: renamed from: eb.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0894t implements InterfaceC4697h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2775g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Consumer f2776h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0894t(Consumer consumer, int i9) {
        this.f2775g = i9;
        this.f2776h = consumer;
    }

    /* JADX DEBUG: Class process forced to load method for inline: h.Hchat.hooks.items.script.ScriptPluginRuntime.j(java.util.function.Consumer, boolean, java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p331wa.InterfaceC4697h
    /* JADX INFO: renamed from: c */
    public final void mo2205c(String str, boolean z9) {
        switch (this.f2775g) {
            case 0:
                ScriptPluginRuntime.sendProtobufPacket$lambda$1(this.f2776h, z9, str);
                break;
            default:
                ScriptPluginRuntime.sendProtobufPacket$lambda$0(this.f2776h, z9, str);
                break;
        }
    }
}
