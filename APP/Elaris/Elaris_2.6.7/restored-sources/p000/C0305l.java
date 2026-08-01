package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0305l extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object[] objArr = methodHookParam == null ? null : methodHookParam.args;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return;
        }
        Object obj2 = methodHookParam.thisObject;
        if (obj == null) {
            return;
        }
        if (obj2 != null) {
            synchronized (AbstractC0444s.f807a) {
                AbstractC0444s.f808b.put(obj2, new WeakReference(obj));
            }
        }
        AbstractC0444s.f809c = new WeakReference(obj);
        HookEntry.log("album video bubble route captured source=filter-part");
    }
}
