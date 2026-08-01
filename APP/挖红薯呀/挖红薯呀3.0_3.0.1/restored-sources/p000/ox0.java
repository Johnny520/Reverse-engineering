package p000;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ox0 implements tc1 {

    /* JADX INFO: renamed from: a */
    public final Application f4670a;

    /* JADX INFO: renamed from: b */
    public final sc1 f4671b;

    /* JADX INFO: renamed from: c */
    public final Bundle f4672c;

    /* JADX INFO: renamed from: d */
    public final s90 f4673d;

    /* JADX INFO: renamed from: e */
    public final kx0 f4674e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ox0(Application application, MainActivity mainActivity, Bundle bundle) {
        sc1 sc1Var;
        this.f4674e = mainActivity.getSavedStateRegistry();
        this.f4673d = mainActivity.getLifecycle();
        this.f4672c = bundle;
        this.f4670a = application;
        if (application != null) {
            if (sc1.f5740c == null) {
                sc1.f5740c = new sc1(application);
            }
            sc1Var = sc1.f5740c;
            sc1Var.getClass();
        } else {
            sc1Var = new sc1(null);
        }
        this.f4671b = sc1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.tc1
    /* JADX INFO: renamed from: a */
    public final qc1 mo2959a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m2961d(cls, canonicalName);
        }
        C0921xc.m5131l("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.tc1
    /* JADX INFO: renamed from: b */
    public final qc1 mo2960b(Class cls, rg0 rg0Var) {
        jo0 jo0Var = o30.f4430P;
        LinkedHashMap linkedHashMap = rg0Var.f1481a;
        String str = (String) linkedHashMap.get(jo0Var);
        if (str == null) {
            C0921xc.m5134o("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(AbstractC0398kl.f3208s) == null || linkedHashMap.get(AbstractC0398kl.f3209t) == null) {
            if (this.f4673d != null) {
                return m2961d(cls, str);
            }
            C0921xc.m5134o("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(sc1.f5741d);
        boolean zIsAssignableFrom = AbstractC0829v6.class.isAssignableFrom(cls);
        Constructor constructorM3161a = (!zIsAssignableFrom || application == null) ? px0.m3161a(cls, px0.f4983b) : px0.m3161a(cls, px0.f4982a);
        return constructorM3161a == null ? this.f4671b.mo2960b(cls, rg0Var) : (!zIsAssignableFrom || application == null) ? px0.m3162b(cls, constructorM3161a, AbstractC0398kl.m1925k(rg0Var)) : px0.m3162b(cls, constructorM3161a, application, AbstractC0398kl.m1925k(rg0Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.tc1
    /* JADX INFO: renamed from: c */
    public final qc1 mo1195c(C0352je c0352je, rg0 rg0Var) {
        Class cls = c0352je.f2804d;
        cls.getClass();
        return mo2960b(cls, rg0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final qc1 m2961d(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        s90 s90Var = this.f4673d;
        if (s90Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0829v6.class.isAssignableFrom(cls);
        Constructor constructorM3161a = (!zIsAssignableFrom || this.f4670a == null) ? px0.m3161a(cls, px0.f4983b) : px0.m3161a(cls, px0.f4982a);
        if (constructorM3161a == null) {
            if (this.f4670a != null) {
                return this.f4671b.mo2959a(cls);
            }
            if (uc1.f6191a == null) {
                uc1.f6191a = new uc1();
            }
            uc1.f6191a.getClass();
            return o30.m2773m(cls);
        }
        kx0 kx0Var = this.f4674e;
        kx0Var.getClass();
        dx0 dx0VarM3408j = r60.m3408j(kx0Var.m1960a(str), this.f4672c);
        ex0 ex0Var = new ex0(str, dx0VarM3408j);
        ex0Var.m975d(s90Var, kx0Var);
        r90 r90Var = ((z90) s90Var).f7841c;
        if (r90Var == r90.f5333e || r90Var.compareTo(r90.f5335g) >= 0) {
            kx0Var.m1963d();
        } else {
            s90Var.mo4014a(new C0251gm(s90Var, kx0Var));
        }
        qc1 qc1VarM3162b = (!zIsAssignableFrom || (application = this.f4670a) == null) ? px0.m3162b(cls, constructorM3161a, dx0VarM3408j) : px0.m3162b(cls, constructorM3161a, application, dx0VarM3408j);
        qc1VarM3162b.getClass();
        rc1 rc1Var = qc1VarM3162b.f5119a;
        if (rc1Var == null) {
            return qc1VarM3162b;
        }
        if (rc1Var.f5356d) {
            rc1.m3441a(ex0Var);
            return qc1VarM3162b;
        }
        synchronized (rc1Var.f5353a) {
            autoCloseable = (AutoCloseable) rc1Var.f5354b.put("androidx.lifecycle.savedstate.vm.tag", ex0Var);
        }
        rc1.m3441a(autoCloseable);
        return qc1VarM3162b;
    }
}
