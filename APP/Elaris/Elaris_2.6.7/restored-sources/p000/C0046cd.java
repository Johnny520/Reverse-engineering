package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: cd */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0046cd extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f107b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046cd(String str, boolean z) {
        super(84);
        this.f106a = z;
        this.f107b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_MEDIA_CLICK_TO_LOAD)) {
            methodHookParam.setResult(null);
            AbstractC0204ed.m346b(this.f106a ? "aio_predownload_register_blocked" : "aio_predownload_message_blocked", this.f107b, HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG) ? Thread.currentThread().getStackTrace() : null);
        }
    }
}
