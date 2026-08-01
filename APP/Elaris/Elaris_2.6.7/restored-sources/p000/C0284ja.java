package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ja */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0284ja extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f475a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0284ja(Method method) {
        super(60);
        this.f475a = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT)) {
            try {
                this.f475a.invoke(methodHookParam.thisObject, Boolean.TRUE);
                AbstractC0332ma.m760a("photo-panel");
            } catch (Throwable th) {
                AbstractC0000a.m3d(th, new StringBuilder("original image panel set failed: "), ": ");
            }
        }
    }
}
