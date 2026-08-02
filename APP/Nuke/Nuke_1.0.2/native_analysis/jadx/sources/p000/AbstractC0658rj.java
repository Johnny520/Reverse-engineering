package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: rj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0658rj implements t00, l20, Serializable {

    /* JADX INFO: renamed from: h */
    public final t00 f9604h;

    public AbstractC0658rj(t00 t00Var) {
        this.f9604h = t00Var;
    }

    @Override // p000.l20
    /* JADX INFO: renamed from: d */
    public l20 mo2144d() {
        t00 t00Var = this.f9604h;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p000.t00
    /* JADX INFO: renamed from: h */
    public final void mo2509h(Object obj) {
        ?? r2 = this;
        while (true) {
            AbstractC0658rj abstractC0658rj = (AbstractC0658rj) r2;
            t00 t00Var = abstractC0658rj.f9604h;
            t00Var.getClass();
            try {
                obj = abstractC0658rj.mo7r(obj);
                if (obj == k20.f5323h) {
                    return;
                }
            } catch (Throwable th) {
                obj = new x92(th);
            }
            abstractC0658rj.mo4496s();
            if (!(t00Var instanceof AbstractC0658rj)) {
                t00Var.mo2509h(obj);
                return;
            }
            r2 = t00Var;
        }
    }

    /* JADX INFO: renamed from: p */
    public t00 mo13p(t00 t00Var, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: q */
    public StackTraceElement mo4495q() {
        int iIntValue;
        String strM3480c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        o40 o40Var = (o40) getClass().getAnnotation(o40.class);
        String str = null;
        if (o40Var == null || o40Var.m3484v() < 1) {
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
        int i = iIntValue >= 0 ? o40Var.m3482l()[iIntValue] : -1;
        C0043b5 c0043b5 = p40.f7974j;
        C0043b5 c0043b52 = p40.f7975k;
        if (c0043b52 == null) {
            try {
                C0043b5 c0043b53 = new C0043b5(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 20);
                p40.f7975k = c0043b53;
                c0043b52 = c0043b53;
            } catch (Exception unused2) {
                p40.f7975k = c0043b5;
                c0043b52 = c0043b5;
            }
        }
        if (c0043b52 != c0043b5 && (method = (Method) c0043b52.f562i) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c0043b52.f563j) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c0043b52.f564k;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM3480c = o40Var.m3480c();
        } else {
            strM3480c = str + '/' + o40Var.m3480c();
        }
        return new StackTraceElement(strM3480c, o40Var.m3483m(), o40Var.m3481f(), i);
    }

    /* JADX INFO: renamed from: r */
    public abstract Object mo7r(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objMo4495q = mo4495q();
        if (objMo4495q == null) {
            objMo4495q = getClass().getName();
        }
        sb.append(objMo4495q);
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public void mo4496s() {
    }
}
