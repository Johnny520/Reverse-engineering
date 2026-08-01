package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.Collections;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0512w3 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f994a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0512w3(String str) {
        super(72);
        this.f994a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int iM1181c;
        if (!HookEntry.runtimeBool(Prefs.KEY_CLEAN_EMOJI_PANEL_ENTRIES) || methodHookParam == null || (iM1181c = AbstractC0560z3.m1181c(methodHookParam.thisObject, 0, Collections.newSetFromMap(new IdentityHashMap()))) <= 0) {
            return;
        }
        AbstractC0560z3.m1180b(this.f994a, iM1181c);
    }
}
