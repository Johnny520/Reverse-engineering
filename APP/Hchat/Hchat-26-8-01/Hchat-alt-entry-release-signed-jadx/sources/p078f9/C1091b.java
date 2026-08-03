package p078f9;

import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.Iterator;
import p085fg.InterfaceC1220a;
import p099h.Hchat.utils.KavaReflector;

/* JADX INFO: renamed from: f9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1091b implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3505g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3506h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1091b(Object obj, int i9) {
        this.f3505g = i9;
        this.f3506h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Object next;
        Object next2;
        switch (this.f3505g) {
            case 0:
                Iterator<T> it = KavaReflector.declaredMethods(this.f3506h.getClass()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        Method method = (Method) next;
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && (AbstractC1416l.m3825a(method.getName(), "getMsgId") || AbstractC1416l.m3825a(method.getName(), "getMsgID") || AbstractC1416l.m3825a(method.getName(), "getId"))) {
                            if (AbstractC1416l.m3825a(method.getReturnType(), Long.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Long.class)) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                return (Method) next;
            case 1:
                return this.f3506h;
            default:
                Iterator<T> it2 = KavaReflector.declaredMethods(this.f3506h.getClass()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        Method method2 = (Method) next2;
                        Class<?>[] parameterTypes2 = method2.getParameterTypes();
                        parameterTypes2.getClass();
                        if (parameterTypes2.length == 0 && (AbstractC1416l.m3825a(method2.getName(), "getMsgId") || AbstractC1416l.m3825a(method2.getName(), "getMsgID") || AbstractC1416l.m3825a(method2.getName(), "getId"))) {
                            if (AbstractC1416l.m3825a(method2.getReturnType(), Long.TYPE) || AbstractC1416l.m3825a(method2.getReturnType(), Long.class)) {
                            }
                        }
                    } else {
                        next2 = null;
                    }
                }
                return (Method) next2;
        }
    }
}
