package p000;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 implements ib3 {

    /* JADX INFO: renamed from: a */
    public final Application f11230a;

    /* JADX INFO: renamed from: b */
    public final hb3 f11231b;

    /* JADX INFO: renamed from: c */
    public final Bundle f11232c;

    /* JADX INFO: renamed from: d */
    public final ba1 f11233d;

    /* JADX INFO: renamed from: e */
    public final qc2 f11234e;

    public uc2(Application application, tc2 tc2Var, Bundle bundle) {
        hb3 hb3Var;
        this.f11234e = tc2Var.getSavedStateRegistry();
        this.f11233d = tc2Var.getLifecycle();
        this.f11232c = bundle;
        this.f11230a = application;
        if (application != null) {
            if (hb3.f3947c == null) {
                hb3.f3947c = new hb3(application);
            }
            hb3Var = hb3.f3947c;
            hb3Var.getClass();
        } else {
            hb3Var = new hb3(null);
        }
        this.f11231b = hb3Var;
    }

    @Override // p000.ib3
    /* JADX INFO: renamed from: a */
    public final fb3 mo2139a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m5483d(canonicalName, cls);
        }
        C0676s.m4651j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // p000.ib3
    /* JADX INFO: renamed from: b */
    public final fb3 mo2140b(Class cls, wj1 wj1Var) {
        jx2 jx2Var = AbstractC0570p7.f7998g;
        LinkedHashMap linkedHashMap = wj1Var.f9877a;
        String str = (String) linkedHashMap.get(jx2Var);
        if (str == null) {
            C0676s.m4653l("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(up0.f11398f) == null || linkedHashMap.get(up0.f11399g) == null) {
            if (this.f11233d != null) {
                return m5483d(str, cls);
            }
            C0676s.m4653l("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(hb3.f3948d);
        boolean zIsAssignableFrom = AbstractC0345jc.class.isAssignableFrom(cls);
        Constructor constructorM5666a = (!zIsAssignableFrom || application == null) ? vc2.m5666a(cls, vc2.f11902b) : vc2.m5666a(cls, vc2.f11901a);
        return constructorM5666a == null ? this.f11231b.mo2140b(cls, wj1Var) : (!zIsAssignableFrom || application == null) ? vc2.m5667b(cls, constructorM5666a, up0.m5551q(wj1Var)) : vc2.m5667b(cls, constructorM5666a, application, up0.m5551q(wj1Var));
    }

    @Override // p000.ib3
    /* JADX INFO: renamed from: c */
    public final fb3 mo2319c(C0067bt c0067bt, wj1 wj1Var) {
        return mo2140b(p40.m3741y(c0067bt), wj1Var);
    }

    /* JADX INFO: renamed from: d */
    public final fb3 m5483d(String str, Class cls) {
        AutoCloseable autoCloseable;
        Application application;
        ba1 ba1Var = this.f11233d;
        if (ba1Var == null) {
            c80.m676t("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AbstractC0345jc.class.isAssignableFrom(cls);
        Constructor constructorM5666a = (!zIsAssignableFrom || this.f11230a == null) ? vc2.m5666a(cls, vc2.f11902b) : vc2.m5666a(cls, vc2.f11901a);
        if (constructorM5666a == null) {
            if (this.f11230a != null) {
                return this.f11231b.mo2139a(cls);
            }
            if (jb3.f4956a == null) {
                jb3.f4956a = new jb3();
            }
            jb3.f4956a.getClass();
            return ci0.m782G(cls);
        }
        qc2 qc2Var = this.f11234e;
        qc2Var.getClass();
        jc2 jc2VarM3732o = p40.m3732o(qc2Var.m4133a(str), this.f11232c);
        kc2 kc2Var = new kc2(str, jc2VarM3732o);
        kc2Var.m2628h(ba1Var, qc2Var);
        aa1 aa1Var = ((la1) ba1Var).f6009h;
        if (aa1Var == aa1.f120i || aa1Var.compareTo(aa1.f122k) >= 0) {
            qc2Var.m4136d();
        } else {
            ba1Var.mo505a(new y50(ba1Var, qc2Var));
        }
        fb3 fb3VarM5667b = (!zIsAssignableFrom || (application = this.f11230a) == null) ? vc2.m5667b(cls, constructorM5666a, jc2VarM3732o) : vc2.m5667b(cls, constructorM5666a, application, jc2VarM3732o);
        fb3VarM5667b.getClass();
        gb3 gb3Var = fb3VarM5667b.f2898a;
        if (gb3Var == null) {
            return fb3VarM5667b;
        }
        if (gb3Var.f3391d) {
            gb3.m1828a(kc2Var);
            return fb3VarM5667b;
        }
        synchronized (gb3Var.f3388a) {
            autoCloseable = (AutoCloseable) gb3Var.f3389b.put("androidx.lifecycle.savedstate.vm.tag", kc2Var);
        }
        gb3.m1828a(autoCloseable);
        return fb3VarM5667b;
    }
}
