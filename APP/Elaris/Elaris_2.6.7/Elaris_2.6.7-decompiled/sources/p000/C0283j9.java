package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0283j9 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f473a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f474b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283j9(String str, boolean z) {
        super(40);
        this.f473a = str;
        this.f474b = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (!HookEntry.runtimeBool(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT)) {
            String strConcat = "layout_disabled_".concat(this.f473a);
            if (AbstractC0299k9.f501c == 0) {
                return;
            }
            AbstractC0299k9.f501c = 0L;
            HookEntry.log("legacy group file page cleared reason=".concat(strConcat));
            return;
        }
        AbstractC0299k9.f501c = this.f474b ? System.currentTimeMillis() + 4500 : 0L;
        StringBuilder sb = new StringBuilder("legacy group file page ");
        sb.append(this.f474b ? "entered" : "left");
        sb.append(" method=");
        sb.append(this.f473a);
        HookEntry.log(sb.toString());
    }
}
