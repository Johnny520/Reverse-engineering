package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: ud */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0490ud extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f953a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0490ud(boolean z) {
        super(80);
        this.f953a = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int iIntValue;
        if (this.f953a || !HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT)) {
            return;
        }
        Object obj = methodHookParam.args[0];
        if (!(obj instanceof Integer) || (iIntValue = ((Integer) obj).intValue()) <= 0) {
            return;
        }
        AbstractC0538xd.m1141a(iIntValue, methodHookParam.thisObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int iIntValue;
        if (HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT)) {
            Object obj = methodHookParam.args[0];
            if (!(obj instanceof Integer) || (iIntValue = ((Integer) obj).intValue()) <= 0) {
                return;
            }
            AbstractC0538xd.m1141a(iIntValue, methodHookParam.thisObject);
            if (this.f953a) {
                methodHookParam.setResult(null);
            }
        }
    }
}
