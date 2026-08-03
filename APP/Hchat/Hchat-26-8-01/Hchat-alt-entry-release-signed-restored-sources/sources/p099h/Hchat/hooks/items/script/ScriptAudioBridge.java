package p099h.Hchat.hooks.items.script;

import p015b0.C0136d0;
import p276sf.C3967n;
import p288tb.C4143c;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptAudioBridge extends C4143c {
    public static final int $stable = C4143c.$stable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScriptAudioBridge(ScriptPluginBridge scriptPluginBridge) {
        super(new C0136d0(scriptPluginBridge, 10));
        scriptPluginBridge.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n _init_$lambda$0(ScriptPluginBridge scriptPluginBridge, String str) {
        str.getClass();
        scriptPluginBridge.log(str);
        return C3967n.f12976a;
    }
}
