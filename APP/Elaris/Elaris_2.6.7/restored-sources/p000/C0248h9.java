package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: h9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0248h9 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f355a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0248h9(Method method) {
        super(90);
        this.f355a = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT)) {
            String str = this.f355a.getDeclaringClass().getName() + "#" + this.f355a.getName();
            AbstractC0299k9.f501c = System.currentTimeMillis() + 4500;
            HookEntry.log("legacy group file page active reason=openTroopFileMainPage");
            HookEntry.log("legacy group file layout opened source=" + AbstractC0260i5.m535H1(str, 120));
        }
    }
}
