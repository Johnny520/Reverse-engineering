package p000;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: p9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0406p9 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr = methodHookParam.args;
        if (objArr == null) {
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] instanceof Long) {
                objArr[i] = 0L;
            }
        }
    }
}
