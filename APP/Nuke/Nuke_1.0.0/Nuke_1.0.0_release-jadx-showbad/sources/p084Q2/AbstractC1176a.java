package p084Q2;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p000A.C0072l0;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: Q2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1176a implements InterfaceC1046d, InterfaceC1179d, Serializable {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1046d f3864d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1176a(InterfaceC1046d interfaceC1046d) {
        this.f3864d = interfaceC1046d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.InterfaceC1179d
    /* JADX INFO: renamed from: d */
    public InterfaceC1179d mo2123d() {
        InterfaceC1046d interfaceC1046d = this.f3864d;
        if (interfaceC1046d instanceof InterfaceC1179d) {
            return (InterfaceC1179d) interfaceC1046d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        InterfaceC1046d interfaceC1046d = this;
        while (true) {
            AbstractC1176a abstractC1176a = (AbstractC1176a) interfaceC1046d;
            InterfaceC1046d interfaceC1046d2 = abstractC1176a.f3864d;
            AbstractC1665j.m2982b(interfaceC1046d2);
            try {
                obj = abstractC1176a.mo8p(obj);
                if (obj == EnumC1152a.f3788d) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC1784a.m3229o(th);
            }
            abstractC1176a.mo2228q();
            if (!(interfaceC1046d2 instanceof AbstractC1176a)) {
                interfaceC1046d2.mo278i(obj);
                return;
            }
            interfaceC1046d = interfaceC1046d2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public StackTraceElement mo2227o() {
        int iIntValue;
        String strM2229c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        InterfaceC1180e interfaceC1180e = (InterfaceC1180e) getClass().getAnnotation(InterfaceC1180e.class);
        String str = null;
        if (interfaceC1180e == null || interfaceC1180e.m2233v() < 1) {
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
        int i5 = iIntValue >= 0 ? interfaceC1180e.m2231l()[iIntValue] : -1;
        C0072l0 c0072l0 = AbstractC1181f.f3869b;
        C0072l0 c0072l02 = AbstractC1181f.f3868a;
        if (c0072l0 == null) {
            try {
                C0072l0 c0072l03 = new C0072l0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 2);
                AbstractC1181f.f3869b = c0072l03;
                c0072l0 = c0072l03;
            } catch (Exception unused2) {
                AbstractC1181f.f3869b = c0072l02;
                c0072l0 = c0072l02;
            }
        }
        if (c0072l0 != c0072l02 && (method = (Method) c0072l0.f307e) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c0072l0.f308f) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c0072l0.f309g;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM2229c = interfaceC1180e.m2229c();
        } else {
            strM2229c = str + '/' + interfaceC1180e.m2229c();
        }
        return new StackTraceElement(strM2229c, interfaceC1180e.m2232m(), interfaceC1180e.m2230f(), i5);
    }

    /* JADX INFO: renamed from: p */
    public abstract Object mo8p(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo2227o = mo2227o();
        if (objMo2227o == null) {
            objMo2227o = getClass().getName();
        }
        sb.append(objMo2227o);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public void mo2228q() {
    }
}
