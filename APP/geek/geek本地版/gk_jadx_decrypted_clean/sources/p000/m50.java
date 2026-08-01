package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class m50 implements InterfaceC0024an, InterfaceC0444ld, InterfaceC0631qe, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0444ld f3142a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0258ge f3143b;

    /* JADX INFO: renamed from: c */
    public transient InterfaceC0444ld f3144c;

    /* JADX INFO: renamed from: d */
    public final int f3145d;

    public m50(InterfaceC0444ld interfaceC0444ld) {
        InterfaceC0258ge interfaceC0258geMo1240d = interfaceC0444ld != null ? interfaceC0444ld.mo1240d() : null;
        this.f3142a = interfaceC0444ld;
        this.f3143b = interfaceC0258geMo1240d;
        this.f3145d = 2;
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0444ld mo471a(InterfaceC0444ld interfaceC0444ld);

    @Override // p000.InterfaceC0024an
    /* JADX INFO: renamed from: b */
    public final int mo115b() {
        return this.f3145d;
    }

    @Override // p000.InterfaceC0631qe
    /* JADX INFO: renamed from: c */
    public final InterfaceC0631qe mo1405c() {
        InterfaceC0444ld interfaceC0444ld = this.f3142a;
        if (interfaceC0444ld instanceof InterfaceC0631qe) {
            return (InterfaceC0631qe) interfaceC0444ld;
        }
        return null;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: d */
    public final InterfaceC0258ge mo1240d() {
        InterfaceC0258ge interfaceC0258ge = this.f3143b;
        AbstractC0346ip.m1500l(interfaceC0258ge);
        return interfaceC0258ge;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: f */
    public final void mo1241f(Object obj) {
        InterfaceC0444ld interfaceC0444ld = this;
        while (true) {
            m50 m50Var = (m50) interfaceC0444ld;
            InterfaceC0444ld interfaceC0444ld2 = m50Var.f3142a;
            AbstractC0346ip.m1500l(interfaceC0444ld2);
            try {
                obj = m50Var.mo473g(obj);
                if (obj == EnumC0594pe.f3883a) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0126ct.m812f(th);
            }
            InterfaceC0444ld interfaceC0444ld3 = m50Var.f3144c;
            if (interfaceC0444ld3 != null && interfaceC0444ld3 != m50Var) {
                InterfaceC0258ge interfaceC0258ge = m50Var.f3143b;
                AbstractC0346ip.m1500l(interfaceC0258ge);
                InterfaceC0184ee interfaceC0184eeMo1272b = interfaceC0258ge.mo1272b(C0819vh.f4843b);
                AbstractC0346ip.m1500l(interfaceC0184eeMo1272b);
                C0744tg c0744tg = (C0744tg) interfaceC0444ld3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0744tg.f4571h;
                while (atomicReferenceFieldUpdater.get(c0744tg) == a80.f72e) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(c0744tg);
                C0326i8 c0326i8 = obj2 instanceof C0326i8 ? (C0326i8) obj2 : null;
                if (c0326i8 != null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0326i8.f2365h;
                    InterfaceC0966zg interfaceC0966zg = (InterfaceC0966zg) atomicReferenceFieldUpdater2.get(c0326i8);
                    if (interfaceC0966zg != null) {
                        interfaceC0966zg.mo1361b();
                        atomicReferenceFieldUpdater2.set(c0326i8, C0537nw.f3454a);
                    }
                }
            }
            m50Var.f3144c = C0479mb.f3185a;
            if (!(interfaceC0444ld2 instanceof m50)) {
                interfaceC0444ld2.mo1241f(obj);
                return;
            }
            interfaceC0444ld = interfaceC0444ld2;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo473g(Object obj);

    /* JADX INFO: renamed from: h */
    public final String m1784h() {
        int iIntValue;
        String strM1021c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC0185ef interfaceC0185ef = (InterfaceC0185ef) getClass().getAnnotation(InterfaceC0185ef.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        if (interfaceC0185ef != null) {
            int iM1025v = interfaceC0185ef.m1025v();
            if (iM1025v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM1025v + ". Please update the Kotlin standard library.").toString());
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
            int i = iIntValue >= 0 ? interfaceC0185ef.m1023l()[iIntValue] : -1;
            C0944yv c0944yv = AbstractC0346ip.f2484m;
            C0944yv c0944yv2 = AbstractC0346ip.f2485n;
            if (c0944yv2 == null) {
                try {
                    C0944yv c0944yv3 = new C0944yv(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    AbstractC0346ip.f2485n = c0944yv3;
                    c0944yv2 = c0944yv3;
                } catch (Exception unused2) {
                    AbstractC0346ip.f2485n = c0944yv;
                    c0944yv2 = c0944yv;
                }
            }
            if (c0944yv2 != c0944yv && (method = c0944yv2.f5407a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = c0944yv2.f5408b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = c0944yv2.f5409c;
                Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (objInvoke3 instanceof String) {
                    str = (String) objInvoke3;
                }
            }
            if (str == null) {
                strM1021c = interfaceC0185ef.m1021c();
            } else {
                strM1021c = str + '/' + interfaceC0185ef.m1021c();
            }
            name = new StackTraceElement(strM1021c, interfaceC0185ef.m1024m(), interfaceC0185ef.m1022f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    public final String toString() {
        if (this.f3142a != null) {
            return m1784h();
        }
        j00.f2515a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC0346ip.m1502n("renderLambdaToString(...)", string);
        return string;
    }
}
