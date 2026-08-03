package p259r9;

import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import p085fg.InterfaceC1231l;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: r9.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3748b0 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12161a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1231l f12162b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3752d0 f12163c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Method f12164d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3748b0(InterfaceC1231l interfaceC1231l, C3752d0 c3752d0, Method method, int i9) {
        this.f12161a = i9;
        this.f12162b = interfaceC1231l;
        this.f12163c = c3752d0;
        this.f12164d = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c3959f;
        switch (this.f12161a) {
            case 0:
                methodHookParam.getClass();
                try {
                    this.f12162b.invoke(methodHookParam);
                    c3959f = C3967n.f12976a;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    this.f12163c.f12191b.invoke("Hchat扩展Hook执行失败: " + this.f12164d.getName(), thM8182b);
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c3959f;
        switch (this.f12161a) {
            case 1:
                methodHookParam.getClass();
                try {
                    this.f12162b.invoke(methodHookParam);
                    c3959f = C3967n.f12976a;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    this.f12163c.f12191b.invoke("Hchat扩展Hook执行失败: " + this.f12164d.getName(), thM8182b);
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
