package p168l9;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XC_MethodHook;
import p085fg.InterfaceC1231l;
import p099h.Hchat.utils.KavaReflector;
import p276sf.C3967n;

/* JADX INFO: renamed from: l9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2536b implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8204g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2538d f8205h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2536b(C2538d c2538d, int i9) {
        this.f8204g = i9;
        this.f8205h = c2538d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Intent intent;
        XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj;
        switch (this.f8204g) {
            case 0:
                methodHookParam.getClass();
                if (this.f8205h.f8211c.getBoolean("remove_forward_limit_enable", false)) {
                    Object obj2 = methodHookParam.thisObject;
                    Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                    if (activity != null && (intent = activity.getIntent()) != null) {
                        C2538d.m5954h(intent);
                    }
                }
                break;
            case 1:
                methodHookParam.getClass();
                if (this.f8205h.f8211c.getBoolean("remove_forward_limit_enable", false)) {
                    Object objInvokeMethod = KavaReflector.invokeMethod(methodHookParam.thisObject, "getIntent", new Object[0]);
                    Intent intent2 = objInvokeMethod instanceof Intent ? (Intent) objInvokeMethod : null;
                    if (intent2 != null) {
                        C2538d.m5954h(intent2);
                    }
                }
                break;
            default:
                methodHookParam.getClass();
                if (this.f8205h.f8211c.getBoolean("remove_forward_limit_enable", false)) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
