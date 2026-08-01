package bsh;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import p267.AbstractC9004;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3492 extends AbstractC3484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f8300;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f8301;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f8302;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Class f8303;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Method[] f8304;

    public C3492(InterfaceC3452 interfaceC3452, Object obj, String str) {
        super(interfaceC3452);
        this.f8300 = obj;
        this.f8302 = str;
        boolean z = obj instanceof C3479;
        this.f8301 = z;
        Class<?> cls = z ? ((C3479) obj).f8264 : obj.getClass();
        this.f8303 = cls;
        this.f8304 = cls.isInterface() ? (Method[]) AbstractC9004.m14203(cls.getMethods(), Object.class.getMethods()) : cls.getMethods();
    }

    @Override // bsh.AbstractC3484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5915(Method method, int i) {
        boolean z = this.f8301;
        String str = this.f8302;
        Class cls = this.f8303;
        if (!z) {
            Method[] methods = cls.getMethods();
            for (Method method2 : methods) {
                if (str.equals(method2.getName())) {
                    Object[] objArr = AbstractC3500.f8347;
                    if (!Modifier.isStatic(method2.getModifiers()) && AbstractC3495.m5942(method2.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC3495.m5954(method2.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        } else if (str.equals("new")) {
            for (Constructor<?> constructor : cls.getConstructors()) {
                if (AbstractC3495.m5942(constructor.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC3495.m5954(cls, method.getGenericReturnType(), i)) {
                    return true;
                }
            }
        } else {
            for (Method method3 : this.f8304) {
                if (str.equals(method3.getName())) {
                    Object[] objArr2 = AbstractC3500.f8347;
                    if (Modifier.isStatic(method3.getModifiers())) {
                        if (AbstractC3495.m5942(method3.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC3495.m5954(method3.getReturnType(), method.getGenericReturnType(), i)) {
                            return true;
                        }
                    } else if (AbstractC3495.m5942((Class[]) AbstractC9004.m14203(new Class[]{cls}, method3.getParameterTypes()), method.getGenericParameterTypes(), i) && AbstractC3495.m5954(method3.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // bsh.AbstractC3484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5916(Object[] objArr) throws TargetError, UtilEvalError {
        InterfaceC3452 interfaceC3452 = this.f8281;
        String str = this.f8302;
        try {
            NameSpace nameSpace = new NameSpace("MethodReferenceLambda");
            CallStack callStack = new CallStack(nameSpace);
            Interpreter interpreter = new Interpreter(nameSpace);
            if (!this.f8301) {
                return AbstractC3500.m6007(this.f8300, this.f8302, objArr, interpreter, callStack, interfaceC3452);
            }
            boolean zEquals = str.equals("new");
            Class cls = this.f8303;
            if (zEquals) {
                return AbstractC3500.m6002(cls, null, objArr);
            }
            if (objArr.length != 0 && cls.isInstance(objArr[0])) {
                Class[] clsArrM5956 = AbstractC3495.m5956(objArr);
                Class[] clsArr = (Class[]) Arrays.copyOfRange(clsArrM5956, 1, clsArrM5956.length);
                for (Method method : this.f8304) {
                    if (str.equals(method.getName())) {
                        try {
                            Object[] objArr2 = AbstractC3500.f8347;
                            if (Modifier.isStatic(method.getModifiers())) {
                                if (AbstractC3495.m5942(clsArrM5956, method.getGenericParameterTypes(), 1)) {
                                    return method.invoke(null, objArr);
                                }
                            } else if (AbstractC3495.m5942(clsArr, method.getGenericParameterTypes(), 1)) {
                                return method.invoke(objArr[0], Arrays.copyOfRange(objArr, 1, objArr.length));
                            }
                        } catch (IllegalAccessException unused) {
                            continue;
                        }
                    }
                }
                throw new UtilEvalError("Can't invoke lambda made from method reference!");
            }
            return AbstractC3500.m5993(nameSpace.getClassManager(), cls, str, objArr, interfaceC3452);
        } catch (InvocationTargetException e) {
            throw new TargetError(e.getTargetException(), interfaceC3452, null);
        }
    }
}
