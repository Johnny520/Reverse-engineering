package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: e5 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0196e5 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        if (!HookEntry.runtimeBool(Prefs.KEY_ALLOW_FORBID_CARD) || (objArr = methodHookParam.args) == null || objArr.length <= 0) {
            return;
        }
        AbstractC0228g5.m434c(objArr[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        if (!HookEntry.runtimeBool(Prefs.KEY_ALLOW_FORBID_CARD) || (objArr = methodHookParam.args) == null || objArr.length <= 0) {
            return;
        }
        AbstractC0228g5.m434c(objArr[0]);
    }
}
