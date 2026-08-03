package p370yf;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p276sf.C3959f;
import p351xe.C5791l;
import p352xf.EnumC5799a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: yf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6036a implements InterfaceC5557c, InterfaceC6039d, Serializable {
    private final InterfaceC5557c completion;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6036a(InterfaceC5557c interfaceC5557c) {
        this.completion = interfaceC5557c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC5557c create(InterfaceC5557c interfaceC5557c) {
        interfaceC5557c.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC6039d getCallerFrame() {
        InterfaceC5557c interfaceC5557c = this.completion;
        if (interfaceC5557c instanceof InterfaceC6039d) {
            return (InterfaceC6039d) interfaceC5557c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC5557c getCompletion() {
        return this.completion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strM10800c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC6040e interfaceC6040e = (InterfaceC6040e) getClass().getAnnotation(InterfaceC6040e.class);
        String str = null;
        if (interfaceC6040e == null || interfaceC6040e.m10804v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i9 = iIntValue >= 0 ? interfaceC6040e.m10802l()[iIntValue] : -1;
        C5791l c5791l = AbstractC6041f.f24496b;
        C5791l c5791l2 = AbstractC6041f.f24495a;
        if (c5791l == null) {
            try {
                C5791l c5791l3 = new C5791l(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC6041f.f24496b = c5791l3;
                c5791l = c5791l3;
            } catch (Exception unused2) {
                AbstractC6041f.f24496b = c5791l2;
                c5791l = c5791l2;
            }
        }
        if (c5791l != c5791l2 && (method = (Method) c5791l.f23537b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c5791l.f23538c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c5791l.f23536a;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM10800c = interfaceC6040e.m10800c();
        } else {
            strM10800c = str + '/' + interfaceC6040e.m10800c();
        }
        return new StackTraceElement(strM10800c, interfaceC6040e.m10803m(), interfaceC6040e.m10801f(), i9);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final void resumeWith(Object obj) {
        InterfaceC5557c interfaceC5557c = this;
        while (true) {
            AbstractC6036a abstractC6036a = (AbstractC6036a) interfaceC5557c;
            InterfaceC5557c interfaceC5557c2 = abstractC6036a.completion;
            interfaceC5557c2.getClass();
            try {
                obj = abstractC6036a.invokeSuspend(obj);
                if (obj == EnumC5799a.f23547g) {
                    return;
                }
            } catch (Throwable th2) {
                obj = new C3959f(th2);
            }
            abstractC6036a.releaseIntercepted();
            if (!(interfaceC5557c2 instanceof AbstractC6036a)) {
                interfaceC5557c2.resumeWith(obj);
                return;
            }
            interfaceC5557c = interfaceC5557c2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        interfaceC5557c.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
