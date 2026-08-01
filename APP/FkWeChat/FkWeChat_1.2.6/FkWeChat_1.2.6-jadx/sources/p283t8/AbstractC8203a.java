package p283t8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p314vb.InterfaceC8893a;

/* JADX INFO: renamed from: t8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8203a {

    /* JADX INFO: renamed from: t8.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f27513a = new a();

        /* JADX INFO: renamed from: b */
        public static final Method f27514b;

        /* JADX INFO: renamed from: c */
        public static final Method f27515c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            methods.getClass();
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (AbstractC1061t.m3842c(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (AbstractC1061t.m3842c(AbstractC5106t.m20687H0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f27514b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (AbstractC1061t.m3842c(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f27515c = method;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo31889a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        Method method = a.f27514b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public List mo31890b(Throwable th) {
        Object objInvoke;
        List listM20652d;
        th.getClass();
        Method method = a.f27515c;
        return (method == null || (objInvoke = method.invoke(th, null)) == null || (listM20652d = AbstractC5102r.m20652d((Throwable[]) objInvoke)) == null) ? AbstractC5114x.m20800o() : listM20652d;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC8893a mo31891c();
}
