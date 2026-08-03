package p000a;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p000a.C0823sb;

/* JADX INFO: renamed from: a.W1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399W1 implements InterfaceC0474a4<Object>, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0474a4<Object> f1526a;

    public AbstractC0399W1(InterfaceC0474a4<Object> interfaceC0474a4) {
        this.f1526a = interfaceC0474a4;
    }

    @Override // p000a.InterfaceC0474a4
    /* JADX INFO: renamed from: d */
    public final void mo847d(Object obj) {
        InterfaceC0474a4<Object> interfaceC0474a4 = this;
        while (true) {
            AbstractC0399W1 abstractC0399W1 = (AbstractC0399W1) interfaceC0474a4;
            InterfaceC0474a4<Object> interfaceC0474a42 = abstractC0399W1.f1526a;
            C0631i9.m1479b(interfaceC0474a42);
            try {
                obj = abstractC0399W1.mo148h(obj);
                if (obj == EnumC0930y4.f3540a) {
                    return;
                }
            } catch (Throwable th) {
                obj = C0920xd.m2206a(th);
            }
            abstractC0399W1.mo1040i();
            if (!(interfaceC0474a42 instanceof AbstractC0399W1)) {
                interfaceC0474a42.mo847d(obj);
                return;
            }
            interfaceC0474a4 = interfaceC0474a42;
        }
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC0474a4<C0413Wf> mo147g(Object obj, InterfaceC0474a4<?> interfaceC0474a4) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo148h(Object obj);

    /* JADX INFO: renamed from: i */
    public void mo1040i() {
    }

    public String toString() {
        int iIntValue;
        String strM577c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC0205L4 interfaceC0205L4 = (InterfaceC0205L4) getClass().getAnnotation(InterfaceC0205L4.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        if (interfaceC0205L4 != null) {
            int iM581v = interfaceC0205L4.m581v();
            if (iM581v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM581v + ". Please update the Kotlin standard library.").toString());
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
            int i = iIntValue >= 0 ? interfaceC0205L4.m579l()[iIntValue] : -1;
            C0823sb.a aVar = C0823sb.f3278b;
            C0823sb.a aVar2 = C0823sb.f3277a;
            if (aVar == null) {
                try {
                    C0823sb.a aVar3 = new C0823sb.a(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    C0823sb.f3278b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    C0823sb.f3278b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2 && (method = aVar.f3279a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = aVar.f3280b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = aVar.f3281c;
                Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (objInvoke3 instanceof String) {
                    str = (String) objInvoke3;
                }
            }
            if (str == null) {
                strM577c = interfaceC0205L4.m577c();
            } else {
                strM577c = str + '/' + interfaceC0205L4.m577c();
            }
            name = new StackTraceElement(strM577c, interfaceC0205L4.m580m(), interfaceC0205L4.m578f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }
}
