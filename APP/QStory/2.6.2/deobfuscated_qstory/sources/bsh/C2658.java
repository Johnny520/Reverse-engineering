package bsh;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import p251.AbstractC8174;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2658 extends AbstractC2650 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f7953;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f7954;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f7955;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Class f7956;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Method[] f7957;

    public C2658(InterfaceC2618 interfaceC2618, Object obj, String str) {
        super(interfaceC2618);
        this.f7953 = obj;
        this.f7955 = str;
        boolean z = obj instanceof C2645;
        this.f7954 = z;
        Class<?> cls = z ? ((C2645) obj).f7917 : obj.getClass();
        this.f7956 = cls;
        this.f7957 = cls.isInterface() ? (Method[]) AbstractC8174.m13606(cls.getMethods(), Object.class.getMethods()) : cls.getMethods();
    }

    @Override // bsh.AbstractC2650
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5310(Method method, int i) {
        boolean z = this.f7954;
        String str = this.f7955;
        Class cls = this.f7956;
        if (!z) {
            Method[] methods = cls.getMethods();
            for (Method method2 : methods) {
                if (str.equals(method2.getName())) {
                    Object[] objArr = AbstractC2666.f8000;
                    if (!Modifier.isStatic(method2.getModifiers()) && AbstractC2661.m5337(method2.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC2661.m5349(method2.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        } else if (str.equals("new")) {
            for (Constructor<?> constructor : cls.getConstructors()) {
                if (AbstractC2661.m5337(constructor.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC2661.m5349(cls, method.getGenericReturnType(), i)) {
                    return true;
                }
            }
        } else {
            for (Method method3 : this.f7957) {
                if (str.equals(method3.getName())) {
                    Object[] objArr2 = AbstractC2666.f8000;
                    if (Modifier.isStatic(method3.getModifiers())) {
                        if (AbstractC2661.m5337(method3.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC2661.m5349(method3.getReturnType(), method.getGenericReturnType(), i)) {
                            return true;
                        }
                    } else if (AbstractC2661.m5337((Class[]) AbstractC8174.m13606(new Class[]{cls}, method3.getParameterTypes()), method.getGenericParameterTypes(), i) && AbstractC2661.m5349(method3.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // bsh.AbstractC2650
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5311(Object[] objArr) throws TargetError, UtilEvalError {
        InterfaceC2618 interfaceC2618 = this.f7934;
        String str = this.f7955;
        try {
            NameSpace nameSpace = new NameSpace("MethodReferenceLambda");
            CallStack callStack = new CallStack(nameSpace);
            Interpreter interpreter = new Interpreter(nameSpace);
            if (!this.f7954) {
                return AbstractC2666.m5402(this.f7953, this.f7955, objArr, interpreter, callStack, interfaceC2618);
            }
            boolean zEquals = str.equals("new");
            Class cls = this.f7956;
            if (zEquals) {
                return AbstractC2666.m5397(cls, null, objArr);
            }
            if (objArr.length != 0 && cls.isInstance(objArr[0])) {
                Class[] clsArrM5351 = AbstractC2661.m5351(objArr);
                Class[] clsArr = (Class[]) Arrays.copyOfRange(clsArrM5351, 1, clsArrM5351.length);
                for (Method method : this.f7957) {
                    if (str.equals(method.getName())) {
                        try {
                            Object[] objArr2 = AbstractC2666.f8000;
                            if (Modifier.isStatic(method.getModifiers())) {
                                if (AbstractC2661.m5337(clsArrM5351, method.getGenericParameterTypes(), 1)) {
                                    return method.invoke(null, objArr);
                                }
                            } else if (AbstractC2661.m5337(clsArr, method.getGenericParameterTypes(), 1)) {
                                return method.invoke(objArr[0], Arrays.copyOfRange(objArr, 1, objArr.length));
                            }
                        } catch (IllegalAccessException unused) {
                            continue;
                        }
                    }
                }
                throw new UtilEvalError("Can't invoke lambda made from method reference!");
            }
            return AbstractC2666.m5388(nameSpace.getClassManager(), cls, str, objArr, interfaceC2618);
        } catch (InvocationTargetException e) {
            throw new TargetError(e.getTargetException(), interfaceC2618, null);
        }
    }
}
