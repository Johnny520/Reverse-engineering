package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.ArrayList;

/* JADX INFO: renamed from: u */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0476u extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        ArrayList arrayList;
        if (HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
            Object[] objArr = methodHookParam.args;
            if (objArr == null || objArr.length <= 0) {
                arrayList = null;
            } else {
                Object obj = objArr[0];
                if (obj instanceof ArrayList) {
                    arrayList = (ArrayList) obj;
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            methodHookParam.setResult(null);
            try {
                arrayList.clear();
            } catch (Throwable unused) {
            }
        }
    }
}
