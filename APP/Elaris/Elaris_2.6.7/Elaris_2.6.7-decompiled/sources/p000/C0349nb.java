package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.Locale;

/* JADX INFO: renamed from: nb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0349nb extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_BLOCK_QQ_SHOW)) {
            try {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int iMin = stackTrace == null ? 0 : Math.min(stackTrace.length, 36);
                for (int i = 0; i < iMin; i++) {
                    String className = stackTrace[i].getClassName();
                    if (className != null) {
                        String lowerCase = className.toLowerCase(Locale.ROOT);
                        if (lowerCase.contains("profilecard") || lowerCase.contains("friendprofile") || lowerCase.contains("visitorhome") || lowerCase.contains("homepage")) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                AbstractC0198e7.m343a("qqshow-sidebar", "profile-card-stack", th);
            }
            methodHookParam.setResult(Boolean.FALSE);
        }
    }
}
