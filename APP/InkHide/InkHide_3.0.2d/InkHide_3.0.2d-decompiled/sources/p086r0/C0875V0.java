package p086r0;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;

/* JADX INFO: renamed from: r0.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0875V0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0881Y0 f3012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f3013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f3014c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f3015d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Class f3016e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0875V0(C0881Y0 c0881y0, Class cls, Context context, Class cls2, Class cls3) {
        this.f3012a = c0881y0;
        this.f3013b = cls;
        this.f3014c = context;
        this.f3015d = cls2;
        this.f3016e = cls3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0223g.m418e(methodHookParam, "param");
        C0881Y0 c0881y0 = this.f3012a;
        Object obj = methodHookParam.thisObject;
        Class cls = this.f3013b;
        Context context = this.f3014c;
        Class cls2 = this.f3015d;
        Class cls3 = this.f3016e;
        c0881y0.getClass();
        if (obj == null) {
            return;
        }
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList<Method> arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length == 0) {
                Class<?> returnType = method.getReturnType();
                AbstractC0223g.m417d(returnType, "getReturnType(...)");
                if (C0881Y0.m1769E(returnType, cls)) {
                    arrayList.add(method);
                }
            }
        }
        for (Method method2 : arrayList) {
            try {
                method2.setAccessible(true);
                Object objInvoke = method2.invoke(obj, null);
                if (objInvoke != null) {
                    c0881y0.f3047k = objInvoke;
                    c0881y0.m1799k(context, objInvoke, cls2, cls3);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
