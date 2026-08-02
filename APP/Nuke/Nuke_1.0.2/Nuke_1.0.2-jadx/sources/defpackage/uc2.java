package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 implements ib3 {
    public final Application a;
    public final hb3 b;
    public final Bundle c;
    public final ba1 d;
    public final qc2 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uc2(Application application, tc2 tc2Var, Bundle bundle) {
        hb3 hb3Var;
        this.e = tc2Var.getSavedStateRegistry();
        this.d = tc2Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (hb3.c == null) {
                hb3.c = new hb3(application);
            }
            hb3Var = hb3.c;
            hb3Var.getClass();
        } else {
            hb3Var = new hb3(null);
        }
        this.b = hb3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ib3
    public final fb3 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        s.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ib3
    public final fb3 b(Class cls, wj1 wj1Var) {
        jx2 jx2Var = p7.g;
        LinkedHashMap linkedHashMap = wj1Var.a;
        String str = (String) linkedHashMap.get(jx2Var);
        if (str == null) {
            s.l("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(up0.f) == null || linkedHashMap.get(up0.g) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            s.l("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(hb3.d);
        boolean zIsAssignableFrom = jc.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? vc2.a(cls, vc2.b) : vc2.a(cls, vc2.a);
        return constructorA == null ? this.b.b(cls, wj1Var) : (!zIsAssignableFrom || application == null) ? vc2.b(cls, constructorA, up0.q(wj1Var)) : vc2.b(cls, constructorA, application, up0.q(wj1Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ib3
    public final fb3 c(bt btVar, wj1 wj1Var) {
        return b(p40.y(btVar), wj1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fb3 d(String str, Class cls) {
        AutoCloseable autoCloseable;
        Application application;
        ba1 ba1Var = this.d;
        if (ba1Var == null) {
            c80.t("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = jc.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.a == null) ? vc2.a(cls, vc2.b) : vc2.a(cls, vc2.a);
        if (constructorA == null) {
            if (this.a != null) {
                return this.b.a(cls);
            }
            if (jb3.a == null) {
                jb3.a = new jb3();
            }
            jb3.a.getClass();
            return ci0.G(cls);
        }
        qc2 qc2Var = this.e;
        qc2Var.getClass();
        jc2 jc2VarO = p40.o(qc2Var.a(str), this.c);
        kc2 kc2Var = new kc2(str, jc2VarO);
        kc2Var.h(ba1Var, qc2Var);
        aa1 aa1Var = ((la1) ba1Var).h;
        if (aa1Var == aa1.i || aa1Var.compareTo(aa1.k) >= 0) {
            qc2Var.d();
        } else {
            ba1Var.a(new y50(ba1Var, qc2Var));
        }
        fb3 fb3VarB = (!zIsAssignableFrom || (application = this.a) == null) ? vc2.b(cls, constructorA, jc2VarO) : vc2.b(cls, constructorA, application, jc2VarO);
        fb3VarB.getClass();
        gb3 gb3Var = fb3VarB.a;
        if (gb3Var == null) {
            return fb3VarB;
        }
        if (gb3Var.d) {
            gb3.a(kc2Var);
            return fb3VarB;
        }
        synchronized (gb3Var.a) {
            autoCloseable = (AutoCloseable) gb3Var.b.put("androidx.lifecycle.savedstate.vm.tag", kc2Var);
        }
        gb3.a(autoCloseable);
        return fb3VarB;
    }
}
