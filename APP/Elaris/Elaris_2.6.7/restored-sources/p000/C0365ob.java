package p000;

import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: ob */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0365ob extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean zRuntimeBool = HookEntry.runtimeBool(Prefs.KEY_BLOCK_QQ_SHOW);
        Object result = methodHookParam.getResult();
        if (zRuntimeBool) {
            AbstractC0497v4.m1098q(result);
        }
        if (zRuntimeBool && (result instanceof View)) {
            AbstractC0440rb.m871j(((View) result).getRootView());
        }
    }
}
