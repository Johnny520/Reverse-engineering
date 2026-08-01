package p000;

import android.util.SparseArray;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: c7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0040c7 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_HIDE_OFFICIAL_CENTER_TIME) && methodHookParam != null && (methodHookParam.getResult() instanceof SparseArray)) {
            SparseArray sparseArray = (SparseArray) methodHookParam.getResult();
            int i = 0;
            if (sparseArray != null) {
                for (int size = sparseArray.size() - 1; size >= 0; size--) {
                    Object objValueAt = sparseArray.valueAt(size);
                    if (objValueAt != null && "com.tencent.mobileqq.aio.msglist.holder.component.timestamp.AIOTimestampComponent".equals(objValueAt.getClass().getName())) {
                        sparseArray.removeAt(size);
                        i++;
                    }
                }
            }
            if (i <= 0 || !HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - AbstractC0182d7.f192c < 60000) {
                return;
            }
            AbstractC0182d7.f192c = jCurrentTimeMillis;
            HookEntry.log("official center time component removed count=" + i);
        }
    }
}
