package p000;

import android.app.Activity;
import android.content.Intent;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: b */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0016b extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        InterfaceC0032c interfaceC0032c;
        if (!(methodHookParam.thisObject instanceof Activity) || (objArr = methodHookParam.args) == null || objArr.length < 3) {
            return;
        }
        Object obj = objArr[0];
        if ((obj instanceof Integer) && (objArr[1] instanceof Integer)) {
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            synchronized (AbstractC0174d.class) {
                interfaceC0032c = (InterfaceC0032c) AbstractC0174d.f179a.get(num);
            }
            if (interfaceC0032c == null) {
                return;
            }
            Object[] objArr2 = methodHookParam.args;
            Object obj2 = objArr2[2];
            try {
                interfaceC0032c.onActivityResult((Activity) methodHookParam.thisObject, iIntValue, ((Integer) objArr2[1]).intValue(), obj2 instanceof Intent ? (Intent) obj2 : null);
            } catch (Throwable th) {
                AbstractC0198e7.m343a("activity-result", "dispatch-" + iIntValue, th);
            }
        }
    }
}
