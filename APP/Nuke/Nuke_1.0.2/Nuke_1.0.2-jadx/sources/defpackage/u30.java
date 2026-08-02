package defpackage;

import android.content.Context;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u30 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(t00 t00Var, hg2 hg2Var, dq1 dq1Var) {
        super(2, t00Var);
        this.l = 6;
        this.m = hg2Var;
        this.n = dq1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) throws IOException {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                return ((u30) p(t00Var, j20Var)).r(a83Var);
            case 1:
                return ((u30) p(t00Var, j20Var)).r(a83Var);
            case 2:
                ((u30) p(t00Var, j20Var)).r(a83Var);
                return a83Var;
            case 3:
                return ((u30) p(t00Var, j20Var)).r(a83Var);
            case 4:
                return ((u30) p(t00Var, j20Var)).r(a83Var);
            case 5:
                return ((u30) p(t00Var, j20Var)).r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ((u30) p(t00Var, j20Var)).r(a83Var);
            default:
                ((u30) p(t00Var, j20Var)).r(a83Var);
                return a83Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                u30 u30Var = new u30((v30) obj2, t00Var);
                u30Var.m = obj;
                return u30Var;
            case 1:
                return new u30((b5) this.m, (String) obj2, t00Var, 1);
            case 2:
                return new u30((xk2) this.m, (yk2) obj2, t00Var, 2);
            case 3:
                return new u30((ru0) this.m, (vn1) obj2, t00Var, 3);
            case 4:
                return new u30((qu0) this.m, (vn1) obj2, t00Var, 4);
            case 5:
                return new u30((vn1) this.m, (Field) obj2, t00Var, 5);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new u30(t00Var, (hg2) this.m, (dq1) obj2);
            default:
                return new u30((xk1) this.m, (xk1) obj2, t00Var, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v15, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) throws IOException {
        List list;
        int i = this.l;
        a83 a83Var = a83.a;
        boolean z = false;
        boolean zExists = false;
        int i2 = 0;
        Object obj2 = this.n;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                fg1.T(obj);
                j20 j20Var = (j20) this.m;
                v30 v30Var = (v30) obj2;
                k21 k21Var = (k21) v30Var.b.getAndSet(null);
                AtomicReference atomicReference = v30Var.b;
                zt2 zt2VarA = p7.A(j20Var, null, new a2(k21Var, v30Var, objArr == true ? 1 : 0, 13), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, zt2VarA)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                fg1.T(obj);
                b5 b5Var = (b5) this.m;
                File file = (File) b5Var.j;
                file.getClass();
                File fileG0 = wi0.g0(file, ((String) obj2) + ".json");
                if (!fileG0.isFile()) {
                    return new d41(ce0.h);
                }
                v31 v31Var = (v31) b5Var.k;
                String strF0 = wi0.f0(fileG0);
                v31Var.getClass();
                j31 j31Var = (j31) v31Var.a(o31.a, strF0);
                d41 d41Var = j31Var instanceof d41 ? (d41) j31Var : null;
                if (d41Var != null) {
                    return d41Var;
                }
                s.j("Script config root must be a JSON object.");
                return null;
            case 2:
                fg1.T(obj);
                xk2 xk2Var = (xk2) this.m;
                int iOrdinal = xk2Var.b.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        c80.s();
                        return null;
                    }
                    i2 = 1;
                }
                Context context = up0.i;
                if (context == null) {
                    t11.S("hostContext");
                    throw null;
                }
                Toast.makeText(context, ((yk2) obj2).b + ": " + xk2Var.a, i2).show();
                return a83Var;
            case 3:
                fg1.T(obj);
                ru0 ru0Var = (ru0) this.m;
                Method method = ru0Var.a;
                method.setAccessible(true);
                try {
                    Object[] objArr2 = ru0Var.b;
                    return method.invoke(null, Arrays.copyOf(objArr2, objArr2.length));
                } catch (InvocationTargetException e) {
                    Throwable targetException = e.getTargetException();
                    throw new sd2("INTERNAL_ERROR", "The host member threw an exception.", false, null, targetException == null ? e : targetException, 12);
                } catch (ReflectiveOperationException e2) {
                    c80.p("INTERNAL_ERROR", "The host member could not be invoked.", 0, null, e2, 12);
                    return null;
                }
            case 4:
                fg1.T(obj);
                qu0 qu0Var = (qu0) this.m;
                Constructor constructor = qu0Var.a;
                constructor.setAccessible(true);
                try {
                    Object[] objArr3 = qu0Var.b;
                    return constructor.newInstance(Arrays.copyOf(objArr3, objArr3.length));
                } catch (InvocationTargetException e3) {
                    Throwable targetException2 = e3.getTargetException();
                    throw new sd2("INTERNAL_ERROR", "The host member threw an exception.", false, null, targetException2 == null ? e3 : targetException2, 12);
                } catch (ReflectiveOperationException e4) {
                    c80.p("INTERNAL_ERROR", "The host member could not be invoked.", 0, null, e4, 12);
                    return null;
                }
            case 5:
                fg1.T(obj);
                Field field = (Field) obj2;
                try {
                    field.setAccessible(true);
                    return field.get(null);
                } catch (InvocationTargetException e5) {
                    Throwable targetException3 = e5.getTargetException();
                    throw new sd2("INTERNAL_ERROR", "The host member threw an exception.", false, null, targetException3 == null ? e5 : targetException3, 12);
                } catch (ReflectiveOperationException e6) {
                    c80.p("INTERNAL_ERROR", "The host member could not be invoked.", 0, null, e6, 12);
                    return null;
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                dq1 dq1Var = (dq1) obj2;
                fg1.T(obj);
                hg2 hg2Var = (hg2) this.m;
                int iOrdinal2 = hg2Var.a.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                        c80.s();
                        return null;
                    }
                    zExists = dq1Var.T(hg2Var).exists();
                } else if (dq1Var.L(hg2Var.b) != null) {
                    zExists = true;
                }
                return Boolean.valueOf(zExists);
            default:
                xk1 xk1Var = (xk1) obj2;
                fg1.T(obj);
                xk1 xk1Var2 = (xk1) this.m;
                if (((String) xk1Var2.getValue()) == null || ((list = ((tq1) xk1Var.getValue()).a) != null && list.isEmpty())) {
                    cq1 cq1Var = (cq1) du.q0(((tq1) xk1Var.getValue()).a);
                    xk1Var2.setValue(cq1Var != null ? cq1Var.a : null);
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (t11.l(((cq1) it.next()).a, (String) xk1Var2.getValue())) {
                        }
                    }
                    cq1 cq1Var2 = (cq1) du.q0(((tq1) xk1Var.getValue()).a);
                    xk1Var2.setValue(cq1Var2 != null ? cq1Var2.a : null);
                }
                return a83Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(v30 v30Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 0;
        this.n = v30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u30(Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }
}
