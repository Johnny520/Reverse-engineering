package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.List;

/* JADX INFO: renamed from: v3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0496v3 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f955a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0496v3(String str) {
        super(72);
        this.f955a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int iM1184f;
        if (HookEntry.runtimeBool(Prefs.KEY_CLEAN_EMOJI_PANEL_ENTRIES)) {
            Object result = methodHookParam == null ? null : methodHookParam.getResult();
            if ((result instanceof List) && (iM1184f = AbstractC0560z3.m1184f((List) result)) > 0) {
                AbstractC0560z3.m1180b(this.f955a, iM1184f);
            }
        }
    }
}
