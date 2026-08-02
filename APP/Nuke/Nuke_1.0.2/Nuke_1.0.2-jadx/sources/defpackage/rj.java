package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rj implements t00, l20, Serializable {
    public final t00 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rj(t00 t00Var) {
        this.h = t00Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l20
    public l20 d() {
        t00 t00Var = this.h;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.t00
    public final void h(Object obj) {
        ?? r2 = this;
        while (true) {
            rj rjVar = (rj) r2;
            t00 t00Var = rjVar.h;
            t00Var.getClass();
            try {
                obj = rjVar.r(obj);
                if (obj == k20.h) {
                    return;
                }
            } catch (Throwable th) {
                obj = new x92(th);
            }
            rjVar.s();
            if (!(t00Var instanceof rj)) {
                t00Var.h(obj);
                return;
            }
            r2 = t00Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t00 p(t00 t00Var, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StackTraceElement q() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        o40 o40Var = (o40) getClass().getAnnotation(o40.class);
        String str = null;
        if (o40Var == null || o40Var.v() < 1) {
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
        int i = iIntValue >= 0 ? o40Var.l()[iIntValue] : -1;
        b5 b5Var = p40.j;
        b5 b5Var2 = p40.k;
        if (b5Var2 == null) {
            try {
                b5 b5Var3 = new b5(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 20);
                p40.k = b5Var3;
                b5Var2 = b5Var3;
            } catch (Exception unused2) {
                p40.k = b5Var;
                b5Var2 = b5Var;
            }
        }
        if (b5Var2 != b5Var && (method = (Method) b5Var2.i) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) b5Var2.j) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) b5Var2.k;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = o40Var.c();
        } else {
            strC = str + '/' + o40Var.c();
        }
        return new StackTraceElement(strC, o40Var.m(), o40Var.f(), i);
    }

    public abstract Object r(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objQ = q();
        if (objQ == null) {
            objQ = getClass().getName();
        }
        sb.append(objQ);
        return sb.toString();
    }

    public void s() {
    }
}
