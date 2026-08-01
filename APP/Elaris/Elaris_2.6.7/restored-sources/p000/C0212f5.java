package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: f5 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0212f5 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0212f5(int i) {
        super(50);
        this.f255a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_ALLOW_FORBID_CARD)) {
            AbstractC0228g5.m434c(methodHookParam.thisObject);
            Object[] objArr = methodHookParam.args;
            if (objArr != null) {
                int length = objArr.length;
                int i = this.f255a;
                if (i < length) {
                    AbstractC0228g5.m435d(objArr[i]);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_ALLOW_FORBID_CARD)) {
            AbstractC0228g5.m434c(methodHookParam.thisObject);
            Object[] objArr = methodHookParam.args;
            if (objArr != null) {
                int length = objArr.length;
                int i = this.f255a;
                if (i < length) {
                    AbstractC0228g5.m435d(objArr[i]);
                }
            }
        }
    }
}
