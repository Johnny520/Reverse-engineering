package p000;

import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: vd */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0506vd extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT)) {
            Object[] objArr = methodHookParam.args;
            int iIntValue = 0;
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[0];
                if (obj instanceof Number) {
                    iIntValue = ((Number) obj).intValue();
                }
            }
            if (iIntValue > 0) {
                Object obj2 = methodHookParam.thisObject;
                if (iIntValue > 0 && (obj2 instanceof View)) {
                    AbstractC0538xd.f1073d.put((View) obj2, Integer.valueOf(iIntValue));
                }
                AbstractC0538xd.m1147g(methodHookParam.thisObject, iIntValue, 4, AbstractC0260i5.m624i1());
            }
        }
    }
}
