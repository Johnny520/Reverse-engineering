package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2571u5 implements InterfaceC0190Eb, InterfaceC1497hc, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0190Eb f8918a;

    public AbstractC2571u5(InterfaceC0190Eb interfaceC0190Eb) {
        this.f8918a = interfaceC0190Eb;
    }

    @Override // p000.InterfaceC1497hc
    /* JADX INFO: renamed from: c */
    public final InterfaceC1497hc mo1012c() {
        InterfaceC0190Eb interfaceC0190Eb = this.f8918a;
        if (interfaceC0190Eb instanceof InterfaceC1497hc) {
            return (InterfaceC1497hc) interfaceC0190Eb;
        }
        return null;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: f */
    public final void mo264f(Object obj) {
        InterfaceC0190Eb interfaceC0190Eb = this;
        while (true) {
            AbstractC2571u5 abstractC2571u5 = (AbstractC2571u5) interfaceC0190Eb;
            InterfaceC0190Eb interfaceC0190Eb2 = abstractC2571u5.f8918a;
            try {
                obj = abstractC2571u5.mo448i(obj);
                if (obj == EnumC1453gc.f5148a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C0297Gw(th);
            }
            abstractC2571u5.mo472j();
            if (!(interfaceC0190Eb2 instanceof AbstractC2571u5)) {
                interfaceC0190Eb2.mo264f(obj);
                return;
            }
            interfaceC0190Eb = interfaceC0190Eb2;
        }
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo448i(Object obj);

    /* JADX INFO: renamed from: j */
    public void mo472j() {
    }

    public String toString() {
        int iIntValue;
        String strM153c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC0105Cc interfaceC0105Cc = (InterfaceC0105Cc) getClass().getAnnotation(InterfaceC0105Cc.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        if (interfaceC0105Cc != null) {
            int iM157v = interfaceC0105Cc.m157v();
            if (iM157v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM157v + ". Please update the Kotlin standard library.").toString());
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
            int i = iIntValue >= 0 ? interfaceC0105Cc.m155l()[iIntValue] : -1;
            C2656w4 c2656w4 = AbstractC0585Nj.f1898c;
            C2656w4 c2656w42 = AbstractC0585Nj.f1899d;
            if (c2656w42 == null) {
                try {
                    C2656w4 c2656w43 = new C2656w4(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 20);
                    AbstractC0585Nj.f1899d = c2656w43;
                    c2656w42 = c2656w43;
                } catch (Exception unused2) {
                    AbstractC0585Nj.f1899d = c2656w4;
                    c2656w42 = c2656w4;
                }
            }
            if (c2656w42 != c2656w4 && (method = (Method) c2656w42.f9196b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c2656w42.f9197c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = (Method) c2656w42.f9198d;
                Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (objInvoke3 instanceof String) {
                    str = (String) objInvoke3;
                }
            }
            if (str == null) {
                strM153c = interfaceC0105Cc.m153c();
            } else {
                strM153c = str + '/' + interfaceC0105Cc.m153c();
            }
            name = new StackTraceElement(strM153c, interfaceC0105Cc.m156m(), interfaceC0105Cc.m154f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }
}
