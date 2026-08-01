package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.HashSet;

/* JADX INFO: renamed from: u0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0477u0 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
            Object obj = methodHookParam.thisObject;
            ThreadLocal threadLocal = AbstractC0545y4.f1088a;
            if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE) && HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
                AbstractC0545y4.m1168i(obj, 0, new HashSet());
            }
        }
    }
}
