package p054c0;

import com.p055lu.wxmask.MainHook;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import p001A0.C0026a;

/* JADX INFO: renamed from: c0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0512d implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public C0511c f1618a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(this.f1618a, objArr);
        } catch (Throwable th) {
            C0026a c0026a = (C0026a) AbstractC0514f.f1621a.f444c;
            if (c0026a == null) {
                return null;
            }
            switch (c0026a.f203a) {
                case 22:
                    return null;
                default:
                    return MainHook.lambda$handleLoadPackage$1(method, th);
            }
        }
    }
}
