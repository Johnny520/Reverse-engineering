package bsh;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import p251.AbstractC8175;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2659 extends AbstractC2651 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f7955;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f7956;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f7957;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Class f7958;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Method[] f7959;

    public C2659(InterfaceC2619 interfaceC2619, Object obj, String str) {
        super(interfaceC2619);
        this.f7955 = obj;
        this.f7957 = str;
        boolean z = obj instanceof C2646;
        this.f7956 = z;
        Class<?> cls = z ? ((C2646) obj).f7919 : obj.getClass();
        this.f7958 = cls;
        this.f7959 = cls.isInterface() ? (Method[]) AbstractC8175.m13644(cls.getMethods(), Object.class.getMethods()) : cls.getMethods();
    }

    @Override // bsh.AbstractC2651
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5355(Method method, int i) {
        boolean z = this.f7956;
        String str = this.f7957;
        Class cls = this.f7958;
        if (!z) {
            Method[] methods = cls.getMethods();
            for (Method method2 : methods) {
                if (str.equals(method2.getName())) {
                    Object[] objArr = AbstractC2667.f8002;
                    if (!Modifier.isStatic(method2.getModifiers()) && AbstractC2662.m5382(method2.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC2662.m5394(method2.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        } else if (str.equals("new")) {
            for (Constructor<?> constructor : cls.getConstructors()) {
                if (AbstractC2662.m5382(constructor.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC2662.m5394(cls, method.getGenericReturnType(), i)) {
                    return true;
                }
            }
        } else {
            for (Method method3 : this.f7959) {
                if (str.equals(method3.getName())) {
                    Object[] objArr2 = AbstractC2667.f8002;
                    if (Modifier.isStatic(method3.getModifiers())) {
                        if (AbstractC2662.m5382(method3.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC2662.m5394(method3.getReturnType(), method.getGenericReturnType(), i)) {
                            return true;
                        }
                    } else if (AbstractC2662.m5382((Class[]) AbstractC8175.m13644(new Class[]{cls}, method3.getParameterTypes()), method.getGenericParameterTypes(), i) && AbstractC2662.m5394(method3.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // bsh.AbstractC2651
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5356(Object[] objArr) throws TargetError, UtilEvalError {
        InterfaceC2619 interfaceC2619 = this.f7936;
        String str = this.f7957;
        try {
            NameSpace nameSpace = new NameSpace("MethodReferenceLambda");
            CallStack callStack = new CallStack(nameSpace);
            Interpreter interpreter = new Interpreter(nameSpace);
            if (!this.f7956) {
                return AbstractC2667.m5447(this.f7955, this.f7957, objArr, interpreter, callStack, interfaceC2619);
            }
            boolean zEquals = str.equals("new");
            Class cls = this.f7958;
            if (zEquals) {
                return AbstractC2667.m5442(cls, null, objArr);
            }
            if (objArr.length != 0 && cls.isInstance(objArr[0])) {
                Class[] clsArrM5396 = AbstractC2662.m5396(objArr);
                Class[] clsArr = (Class[]) Arrays.copyOfRange(clsArrM5396, 1, clsArrM5396.length);
                for (Method method : this.f7959) {
                    if (str.equals(method.getName())) {
                        try {
                            Object[] objArr2 = AbstractC2667.f8002;
                            if (Modifier.isStatic(method.getModifiers())) {
                                if (AbstractC2662.m5382(clsArrM5396, method.getGenericParameterTypes(), 1)) {
                                    return method.invoke(null, objArr);
                                }
                            } else if (AbstractC2662.m5382(clsArr, method.getGenericParameterTypes(), 1)) {
                                return method.invoke(objArr[0], Arrays.copyOfRange(objArr, 1, objArr.length));
                            }
                        } catch (IllegalAccessException unused) {
                            continue;
                        }
                    }
                }
                throw new UtilEvalError("Can't invoke lambda made from method reference!");
            }
            return AbstractC2667.m5433(nameSpace.getClassManager(), cls, str, objArr, interfaceC2619);
        } catch (InvocationTargetException e) {
            throw new TargetError(e.getTargetException(), interfaceC2619, null);
        }
    }
}
