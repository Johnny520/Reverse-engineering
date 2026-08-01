package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: ka */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0300ka extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT)) {
            methodHookParam.setResult(Boolean.TRUE);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - AbstractC0332ma.f568b < 1800) {
                return;
            }
            AbstractC0332ma.f568b = jCurrentTimeMillis;
            HookEntry.logAlways("original image album raw config forced");
        }
    }
}
