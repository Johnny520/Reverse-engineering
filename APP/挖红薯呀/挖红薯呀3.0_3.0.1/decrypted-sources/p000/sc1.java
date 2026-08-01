package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class sc1 extends uc1 {

    /* JADX INFO: renamed from: c */
    public static sc1 f5740c;

    /* JADX INFO: renamed from: d */
    public static final jo0 f5741d = new jo0(26);

    /* JADX INFO: renamed from: b */
    public final Application f5742b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sc1(Application application) {
        this.f5742b = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.uc1, p000.tc1
    /* JADX INFO: renamed from: a */
    public final qc1 mo2959a(Class cls) {
        Application application = this.f5742b;
        if (application != null) {
            return m4062d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.uc1, p000.tc1
    /* JADX INFO: renamed from: b */
    public final qc1 mo2960b(Class cls, rg0 rg0Var) {
        if (this.f5742b != null) {
            return mo2959a(cls);
        }
        Application application = (Application) rg0Var.f1481a.get(f5741d);
        if (application != null) {
            return m4062d(cls, application);
        }
        if (!AbstractC0829v6.class.isAssignableFrom(cls)) {
            return o30.m2773m(cls);
        }
        C0921xc.m5131l("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final qc1 m4062d(Class cls, Application application) {
        if (!AbstractC0829v6.class.isAssignableFrom(cls)) {
            return o30.m2773m(cls);
        }
        try {
            qc1 qc1Var = (qc1) cls.getConstructor(Application.class).newInstance(application);
            qc1Var.getClass();
            return qc1Var;
        } catch (IllegalAccessException e) {
            C0921xc.m5128i("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            C0921xc.m5128i("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C0921xc.m5128i("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            C0921xc.m5128i("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
