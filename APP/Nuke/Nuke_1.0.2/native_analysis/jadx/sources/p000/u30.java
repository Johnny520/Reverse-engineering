package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u30 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11084l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f11085m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f11086n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(t00 t00Var, hg2 hg2Var, dq1 dq1Var) {
        super(2, t00Var);
        this.f11084l = 6;
        this.f11085m = hg2Var;
        this.f11086n = dq1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws IOException {
        int i = this.f11084l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                return ((u30) mo13p(t00Var, j20Var)).mo7r(a83Var);
            case 1:
                return ((u30) mo13p(t00Var, j20Var)).mo7r(a83Var);
            case 2:
                ((u30) mo13p(t00Var, j20Var)).mo7r(a83Var);
                return a83Var;
            case 3:
                return ((u30) mo13p(t00Var, j20Var)).mo7r(a83Var);
            case 4:
                return ((u30) mo13p(t00Var, j20Var)).mo7r(a83Var);
            case 5:
                return ((u30) mo13p(t00Var, j20Var)).mo7r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ((u30) mo13p(t00Var, j20Var)).mo7r(a83Var);
            default:
                ((u30) mo13p(t00Var, j20Var)).mo7r(a83Var);
                return a83Var;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f11084l;
        Object obj2 = this.f11086n;
        switch (i) {
            case 0:
                u30 u30Var = new u30((v30) obj2, t00Var);
                u30Var.f11085m = obj;
                return u30Var;
            case 1:
                return new u30((C0043b5) this.f11085m, (String) obj2, t00Var, 1);
            case 2:
                return new u30((xk2) this.f11085m, (yk2) obj2, t00Var, 2);
            case 3:
                return new u30((ru0) this.f11085m, (vn1) obj2, t00Var, 3);
            case 4:
                return new u30((qu0) this.f11085m, (vn1) obj2, t00Var, 4);
            case 5:
                return new u30((vn1) this.f11085m, (Field) obj2, t00Var, 5);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new u30(t00Var, (hg2) this.f11085m, (dq1) obj2);
            default:
                return new u30((xk1) this.f11085m, (xk1) obj2, t00Var, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) throws IOException {
        List list;
        int i = this.f11084l;
        a83 a83Var = a83.f116a;
        boolean z = false;
        boolean zExists = false;
        int i2 = 0;
        Object obj2 = this.f11086n;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                fg1.m1627T(obj);
                j20 j20Var = (j20) this.f11085m;
                v30 v30Var = (v30) obj2;
                k21 k21Var = (k21) v30Var.f11663b.getAndSet(null);
                AtomicReference atomicReference = v30Var.f11663b;
                zt2 zt2VarM3745A = AbstractC0570p7.m3745A(j20Var, null, new C0003a2(k21Var, v30Var, objArr == true ? 1 : 0, 13), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, zt2VarM3745A)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                fg1.m1627T(obj);
                C0043b5 c0043b5 = (C0043b5) this.f11085m;
                File file = (File) c0043b5.f563j;
                file.getClass();
                File fileM5901g0 = wi0.m5901g0(file, ((String) obj2) + ".json");
                if (!fileM5901g0.isFile()) {
                    return new d41(ce0.f1492h);
                }
                v31 v31Var = (v31) c0043b5.f564k;
                String strM5900f0 = wi0.m5900f0(fileM5901g0);
                v31Var.getClass();
                j31 j31Var = (j31) v31Var.m5453a(o31.f7461a, strM5900f0);
                d41 d41Var = j31Var instanceof d41 ? (d41) j31Var : null;
                if (d41Var != null) {
                    return d41Var;
                }
                C0676s.m4651j("Script config root must be a JSON object.");
                return null;
            case 2:
                fg1.m1627T(obj);
                xk2 xk2Var = (xk2) this.f11085m;
                int iOrdinal = xk2Var.f13069b.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        c80.m675s();
                        return null;
                    }
                    i2 = 1;
                }
                Context context = up0.f11401i;
                if (context == null) {
                    t11.m5067S("hostContext");
                    throw null;
                }
                Toast.makeText(context, ((yk2) obj2).f13503b + ": " + xk2Var.f13068a, i2).show();
                return a83Var;
            case 3:
                fg1.m1627T(obj);
                ru0 ru0Var = (ru0) this.f11085m;
                Method method = ru0Var.f9757a;
                method.setAccessible(true);
                try {
                    Object[] objArr2 = ru0Var.f9758b;
                    return method.invoke(null, Arrays.copyOf(objArr2, objArr2.length));
                } catch (InvocationTargetException e) {
                    Throwable targetException = e.getTargetException();
                    throw new sd2("INTERNAL_ERROR", "The host member threw an exception.", false, null, targetException == null ? e : targetException, 12);
                } catch (ReflectiveOperationException e2) {
                    c80.m672p("INTERNAL_ERROR", "The host member could not be invoked.", 0, null, e2, 12);
                    return null;
                }
            case 4:
                fg1.m1627T(obj);
                qu0 qu0Var = (qu0) this.f11085m;
                Constructor constructor = qu0Var.f9169a;
                constructor.setAccessible(true);
                try {
                    Object[] objArr3 = qu0Var.f9170b;
                    return constructor.newInstance(Arrays.copyOf(objArr3, objArr3.length));
                } catch (InvocationTargetException e3) {
                    Throwable targetException2 = e3.getTargetException();
                    throw new sd2("INTERNAL_ERROR", "The host member threw an exception.", false, null, targetException2 == null ? e3 : targetException2, 12);
                } catch (ReflectiveOperationException e4) {
                    c80.m672p("INTERNAL_ERROR", "The host member could not be invoked.", 0, null, e4, 12);
                    return null;
                }
            case 5:
                fg1.m1627T(obj);
                Field field = (Field) obj2;
                try {
                    field.setAccessible(true);
                    return field.get(null);
                } catch (InvocationTargetException e5) {
                    Throwable targetException3 = e5.getTargetException();
                    throw new sd2("INTERNAL_ERROR", "The host member threw an exception.", false, null, targetException3 == null ? e5 : targetException3, 12);
                } catch (ReflectiveOperationException e6) {
                    c80.m672p("INTERNAL_ERROR", "The host member could not be invoked.", 0, null, e6, 12);
                    return null;
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                dq1 dq1Var = (dq1) obj2;
                fg1.m1627T(obj);
                hg2 hg2Var = (hg2) this.f11085m;
                int iOrdinal2 = hg2Var.f4002a.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                        c80.m675s();
                        return null;
                    }
                    zExists = dq1Var.m1095T(hg2Var).exists();
                } else if (dq1Var.m1088L(hg2Var.f4003b) != null) {
                    zExists = true;
                }
                return Boolean.valueOf(zExists);
            default:
                xk1 xk1Var = (xk1) obj2;
                fg1.m1627T(obj);
                xk1 xk1Var2 = (xk1) this.f11085m;
                if (((String) xk1Var2.getValue()) == null || ((list = ((tq1) xk1Var.getValue()).f10899a) != null && list.isEmpty())) {
                    cq1 cq1Var = (cq1) AbstractC0142du.m1161q0(((tq1) xk1Var.getValue()).f10899a);
                    xk1Var2.setValue(cq1Var != null ? cq1Var.f1675a : null);
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (t11.m5086l(((cq1) it.next()).f1675a, (String) xk1Var2.getValue())) {
                        }
                    }
                    cq1 cq1Var2 = (cq1) AbstractC0142du.m1161q0(((tq1) xk1Var.getValue()).f10899a);
                    xk1Var2.setValue(cq1Var2 != null ? cq1Var2.f1675a : null);
                }
                return a83Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(v30 v30Var, t00 t00Var) {
        super(2, t00Var);
        this.f11084l = 0;
        this.f11086n = v30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u30(Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.f11084l = i;
        this.f11085m = obj;
        this.f11086n = obj2;
    }
}
