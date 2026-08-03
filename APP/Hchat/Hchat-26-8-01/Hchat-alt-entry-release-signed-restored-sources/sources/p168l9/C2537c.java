package p168l9;

import de.robv.android.xposed.XC_MethodHook;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: l9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2537c extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1231l f8207b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2537c(InterfaceC1231l interfaceC1231l, int i9) {
        this.f8206a = i9;
        this.f8207b = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c3959f;
        switch (this.f8206a) {
            case 1:
                methodHookParam.getClass();
                try {
                    this.f8207b.invoke(methodHookParam);
                    c3959f = C3967n.f12976a;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC0921a.m2261x("[Hchat:ProfileId] 注入资料页 ID 失败: ", thM8182b.getMessage(), thM8182b);
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f8206a) {
            case 0:
                methodHookParam.getClass();
                this.f8207b.invoke(methodHookParam);
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
