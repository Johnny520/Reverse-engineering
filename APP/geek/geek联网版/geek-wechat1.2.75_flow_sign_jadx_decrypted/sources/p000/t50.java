package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class t50 implements InterfaceC0110cn, InterfaceC0814vd, InterfaceC0667re, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0814vd f4414a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0295he f4415b;

    /* JADX INFO: renamed from: c */
    public transient InterfaceC0814vd f4416c;

    /* JADX INFO: renamed from: d */
    public final int f4417d;

    public t50(InterfaceC0814vd interfaceC0814vd) {
        InterfaceC0295he interfaceC0295heMo1117d = interfaceC0814vd != null ? interfaceC0814vd.mo1117d() : null;
        this.f4414a = interfaceC0814vd;
        this.f4415b = interfaceC0295heMo1117d;
        this.f4417d = 2;
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0814vd mo35a(InterfaceC0814vd interfaceC0814vd);

    @Override // p000.InterfaceC0110cn
    /* JADX INFO: renamed from: b */
    public final int mo653b() {
        return this.f4417d;
    }

    @Override // p000.InterfaceC0667re
    /* JADX INFO: renamed from: c */
    public final InterfaceC0667re mo824c() {
        InterfaceC0814vd interfaceC0814vd = this.f4414a;
        if (interfaceC0814vd instanceof InterfaceC0667re) {
            return (InterfaceC0667re) interfaceC0814vd;
        }
        return null;
    }

    @Override // p000.InterfaceC0814vd
    /* JADX INFO: renamed from: d */
    public final InterfaceC0295he mo1117d() {
        InterfaceC0295he interfaceC0295he = this.f4415b;
        AbstractC0493mp.m1854d(interfaceC0295he);
        return interfaceC0295he;
    }

    @Override // p000.InterfaceC0814vd
    /* JADX INFO: renamed from: f */
    public final void mo1118f(Object obj) {
        InterfaceC0814vd interfaceC0814vd = this;
        while (true) {
            t50 t50Var = (t50) interfaceC0814vd;
            InterfaceC0814vd interfaceC0814vd2 = t50Var.f4414a;
            AbstractC0493mp.m1854d(interfaceC0814vd2);
            try {
                obj = t50Var.mo37g(obj);
                if (obj == EnumC0630qe.f3899a) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0274gu.m1311e(th);
            }
            InterfaceC0814vd interfaceC0814vd3 = t50Var.f4416c;
            if (interfaceC0814vd3 != null && interfaceC0814vd3 != t50Var) {
                InterfaceC0295he interfaceC0295he = t50Var.f4415b;
                AbstractC0493mp.m1854d(interfaceC0295he);
                InterfaceC0221fe interfaceC0221feMo447b = interfaceC0295he.mo447b(C0893xh.f5246b);
                AbstractC0493mp.m1854d(interfaceC0221feMo447b);
                C0817vg c0817vg = (C0817vg) interfaceC0814vd3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0817vg.f4954h;
                while (atomicReferenceFieldUpdater.get(c0817vg) == g80.f1911e) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(c0817vg);
                C0698s8 c0698s8 = obj2 instanceof C0698s8 ? (C0698s8) obj2 : null;
                if (c0698s8 != null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0698s8.f4215h;
                    InterfaceC0068bh interfaceC0068bh = (InterfaceC0068bh) atomicReferenceFieldUpdater2.get(c0698s8);
                    if (interfaceC0068bh != null) {
                        interfaceC0068bh.mo522b();
                        atomicReferenceFieldUpdater2.set(c0698s8, C0833vw.f5012a);
                    }
                }
            }
            t50Var.f4416c = C0812vb.f4925a;
            if (!(interfaceC0814vd2 instanceof t50)) {
                interfaceC0814vd2.mo1118f(obj);
                return;
            }
            interfaceC0814vd = interfaceC0814vd2;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo37g(Object obj);

    /* JADX INFO: renamed from: h */
    public final String m2399h() {
        int iIntValue;
        String strM1094c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC0222ff interfaceC0222ff = (InterfaceC0222ff) getClass().getAnnotation(InterfaceC0222ff.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        if (interfaceC0222ff != null) {
            int iM1098v = interfaceC0222ff.m1098v();
            if (iM1098v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM1098v + ". Please update the Kotlin standard library.").toString());
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
            int i = iIntValue >= 0 ? interfaceC0222ff.m1096l()[iIntValue] : -1;
            C0239fw c0239fw = AbstractC0493mp.f3175m;
            C0239fw c0239fw2 = AbstractC0493mp.f3176n;
            if (c0239fw2 == null) {
                try {
                    C0239fw c0239fw3 = new C0239fw(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    AbstractC0493mp.f3176n = c0239fw3;
                    c0239fw2 = c0239fw3;
                } catch (Exception unused2) {
                    AbstractC0493mp.f3176n = c0239fw;
                    c0239fw2 = c0239fw;
                }
            }
            if (c0239fw2 != c0239fw && (method = c0239fw2.f1840a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = c0239fw2.f1841b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = c0239fw2.f1842c;
                Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (objInvoke3 instanceof String) {
                    str = (String) objInvoke3;
                }
            }
            if (str == null) {
                strM1094c = interfaceC0222ff.m1094c();
            } else {
                strM1094c = str + '/' + interfaceC0222ff.m1094c();
            }
            name = new StackTraceElement(strM1094c, interfaceC0222ff.m1097m(), interfaceC0222ff.m1095f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    public final String toString() {
        if (this.f4414a != null) {
            return m2399h();
        }
        q00.f3767a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC0493mp.m1856f("renderLambdaToString(...)", string);
        return string;
    }
}
