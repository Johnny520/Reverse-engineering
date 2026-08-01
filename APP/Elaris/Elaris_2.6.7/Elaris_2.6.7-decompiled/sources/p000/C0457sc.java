package p000;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.callbacks.XCallback;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: sc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0457sc extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f861a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Field f862b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f863c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Field f864d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0457sc(Method method, Field field, Method method2, Field field2) {
        super(XCallback.PRIORITY_LOWEST);
        this.f861a = method;
        this.f862b = field;
        this.f863c = method2;
        this.f864d = field2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            AbstractC0505vc.m1109a(methodHookParam, this.f864d);
        } finally {
            AbstractC0505vc.m1110b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Method method = this.f861a;
        Field field = this.f862b;
        Object objM1209a = null;
        if (methodHookParam != null) {
            try {
                objM1209a = AbstractC0569zc.m1209a(methodHookParam.thisObject, method, field, methodHookParam.args);
            } catch (Throwable unused) {
            }
        }
        AbstractC0505vc.m1111c(objM1209a, this.f863c, true);
    }
}
