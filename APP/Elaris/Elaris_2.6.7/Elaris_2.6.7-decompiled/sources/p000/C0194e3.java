package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: e3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0194e3 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194e3(int i) {
        super(70);
        this.f224a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj = AbstractC0004a3.f11a;
        if (HookEntry.runtimeBool(Prefs.KEY_DOWNLOAD_DIRECT_WRITE)) {
            Object[] objArr = methodHookParam.args;
            int length = objArr.length;
            int i = this.f224a;
            if (i >= length) {
                return;
            }
            AbstractC0242h3.m486b(objArr[i]);
        }
    }
}
