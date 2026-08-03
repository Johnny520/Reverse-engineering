package p153k8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k8.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2354r implements InvocationHandler {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = null;
        if (method.getDeclaringClass() == Object.class) {
            String name = method.getName();
            if ("toString".equals(name)) {
                return "HchatMessageClearCallback";
            }
            if ("hashCode".equals(name)) {
                return Integer.valueOf(System.identityHashCode(obj));
            }
            if ("equals".equals(name)) {
                if (objArr != null && objArr.length > 0) {
                    obj2 = objArr[0];
                }
                return Boolean.valueOf(obj == obj2);
            }
        }
        Class<?> returnType = method.getReturnType();
        Class<?> cls = Boolean.TYPE;
        if (returnType == cls || returnType == Boolean.class) {
            return Boolean.FALSE;
        }
        if (returnType != null && returnType.isPrimitive() && returnType != Void.TYPE) {
            if (returnType == cls) {
                return Boolean.FALSE;
            }
            if (returnType == Character.TYPE) {
                return (char) 0;
            }
            if (returnType == Byte.TYPE) {
                return (byte) 0;
            }
            if (returnType == Short.TYPE) {
                return (short) 0;
            }
            if (returnType == Integer.TYPE) {
                return 0;
            }
            if (returnType == Long.TYPE) {
                return 0L;
            }
            if (returnType == Float.TYPE) {
                return Float.valueOf(0.0f);
            }
            if (returnType == Double.TYPE) {
                return Double.valueOf(0.0d);
            }
        }
        return null;
    }
}
