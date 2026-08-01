package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: y3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0544y3 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1087a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0544y3(String str) {
        super(72);
        this.f1087a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (!HookEntry.runtimeBool(Prefs.KEY_CLEAN_EMOJI_PANEL_ENTRIES) || methodHookParam == null) {
            return;
        }
        AbstractC0560z3.m1179a(methodHookParam.thisObject, this.f1087a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (!HookEntry.runtimeBool(Prefs.KEY_CLEAN_EMOJI_PANEL_ENTRIES) || methodHookParam == null) {
            return;
        }
        AbstractC0560z3.m1179a(methodHookParam.thisObject, this.f1087a);
    }
}
