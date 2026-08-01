package p000;

import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: n6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0344n6 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f589b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0344n6(int i, Object obj) {
        this.f588a = i;
        this.f589b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String lowerCase;
        String name;
        int i = this.f588a;
        Object obj2 = this.f589b;
        lowerCase = "";
        switch (i) {
            case 0:
                String strM956h = AbstractC0451s6.m956h(objArr);
                StringBuilder sb = new StringBuilder("group action callback type=");
                String str = (String) obj2;
                sb.append(str);
                sb.append(" method=");
                sb.append(method == null ? "" : method.getName());
                sb.append(" args=");
                sb.append(strM956h);
                HookEntry.log(sb.toString());
                if (objArr != null && objArr.length != 0) {
                    Object obj3 = objArr[0];
                    if (obj3 instanceof Number) {
                        long jLongValue = ((Number) obj3).longValue();
                        if (jLongValue != 0) {
                            lowerCase = "code=" + jLongValue + " args=" + AbstractC0451s6.m956h(objArr);
                        }
                    }
                }
                if (lowerCase.length() > 0) {
                    HookEntry.log("group action failed type=" + str + " reason=callback " + lowerCase);
                } else if (method != null && (name = method.getName()) != null && !"toString".equals(name) && !"hashCode".equals(name) && !"equals".equals(name)) {
                    if (objArr == null || objArr.length == 0) {
                        HookEntry.log("group action success type=" + str + " reason=callback ok");
                    } else {
                        Object obj4 = objArr[0];
                        if ((obj4 instanceof Number) && ((Number) obj4).longValue() == 0) {
                        }
                    }
                }
                Class<?> cls = Void.TYPE;
                Class<?> returnType = method == null ? cls : method.getReturnType();
                if (returnType != cls && returnType.isPrimitive()) {
                    return AbstractC0451s6.m943a0(returnType);
                }
                return null;
            default:
                C0527x2 c0527x2 = (C0527x2) obj2;
                String name2 = method == null ? "" : method.getName();
                if (c0527x2 != null) {
                    lowerCase = name2 != null ? name2.toLowerCase(Locale.US) : "";
                    if (lowerCase.contains("error") || lowerCase.contains("fail") || lowerCase.contains("exception") || lowerCase.contains("cancel")) {
                        ((RunnableC0352ne) ((RunnableC0412q) c0527x2.f1027a).f727c).f610d.post(new RunnableC0412q(c0527x2, name2, 9));
                    }
                }
                return AbstractC0169w.m318r(method != null ? method.getReturnType() : null);
        }
    }
}
