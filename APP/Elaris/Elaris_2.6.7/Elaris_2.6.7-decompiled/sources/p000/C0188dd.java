package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: dd */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0188dd extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f197b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188dd(String str, boolean z) {
        super(83);
        this.f196a = z;
        this.f197b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        if (HookEntry.runtimeBool(Prefs.KEY_MEDIA_CLICK_TO_LOAD)) {
            if (this.f196a && ((objArr = methodHookParam.args) == null || objArr.length == 0 || !"fromAIO".equals(String.valueOf(objArr[0])))) {
                return;
            }
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            boolean zM345a = AbstractC0204ed.m345a(stackTrace);
            String str = this.f197b;
            if (!zM345a) {
                AbstractC0204ed.m347c("aio_emoticon_drawable_unmatched", str, stackTrace);
            } else {
                methodHookParam.setResult(null);
                AbstractC0204ed.m346b("aio_emoticon_drawable_blocked", str, stackTrace);
            }
        }
    }
}
