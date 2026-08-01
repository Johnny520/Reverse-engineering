package p000;

import android.app.Application;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: g7 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0230g7 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0548y7 f308b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f309c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230g7(ClassLoader classLoader, C0548y7 c0548y7, String str) {
        super(120);
        this.f307a = classLoader;
        this.f308b = c0548y7;
        this.f309c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Application application;
        Object[] objArr = methodHookParam.args;
        if (objArr == null || objArr.length <= 0) {
            application = null;
        } else {
            Object obj = objArr[0];
            if (obj instanceof Application) {
                application = (Application) obj;
            }
        }
        HookEntry.prepareHostApplication(application, this.f307a, this.f308b, this.f309c, "Instrumentation.callApplicationOnCreate");
    }
}
