package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: rc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0441rc extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_SELF_MESSAGE_LEFT_SIDE)) {
            ArrayDeque arrayDeque = (ArrayDeque) AbstractC0505vc.f974d.get();
            Object objPeek = (arrayDeque == null || arrayDeque.isEmpty()) ? null : arrayDeque.peek();
            if (objPeek == null || objPeek == AbstractC0505vc.f972b) {
                return;
            }
            Object obj = methodHookParam.thisObject;
            if (obj == null || objPeek == obj) {
                methodHookParam.setResult(Boolean.FALSE);
            }
        }
    }
}
