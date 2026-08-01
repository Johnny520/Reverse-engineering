package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: ad */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0014ad extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f50a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0014ad(String str) {
        super(82);
        this.f50a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_MEDIA_CLICK_TO_LOAD)) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (AbstractC0204ed.m345a(stackTrace)) {
                methodHookParam.setResult(Boolean.FALSE);
                AbstractC0204ed.m346b("auto_download=false", this.f50a, stackTrace);
            }
        }
    }
}
