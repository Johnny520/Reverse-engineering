package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: g9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0232g9 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f310a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f311b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232g9(boolean z, Method method) {
        super(90);
        this.f310a = z;
        this.f311b = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (HookEntry.runtimeBool(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT)) {
            boolean z = this.f310a;
            methodHookParam.setResult(Boolean.valueOf(z));
            HookEntry.log("legacy group file layout forced method=" + this.f311b.getName() + " result=" + z);
        }
    }
}
