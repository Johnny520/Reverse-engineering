package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: vE */
/* JADX INFO: loaded from: classes.dex */
public final class C2623vE extends C0111Ci {

    /* JADX INFO: renamed from: d */
    public static C2623vE f9107d;

    /* JADX INFO: renamed from: c */
    public final Application f9108c;

    public C2623vE(Application application) {
        super(2);
        this.f9108c = application;
    }

    @Override // p000.C0111Ci, p000.InterfaceC2666wE
    /* JADX INFO: renamed from: a */
    public final AbstractC2580uE mo171a(Class cls) {
        Application application = this.f9108c;
        if (application != null) {
            return m5139c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // p000.InterfaceC2666wE
    /* JADX INFO: renamed from: b */
    public final AbstractC2580uE mo2563b(Class cls, C2557ts c2557ts) {
        if (this.f9108c != null) {
            return mo171a(cls);
        }
        Application application = (Application) c2557ts.f7638a.get(C1456gf.f5169m);
        if (application != null) {
            return m5139c(cls, application);
        }
        if (AbstractC0218F2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.mo171a(cls);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2580uE m5139c(Class cls, Application application) {
        if (!AbstractC0218F2.class.isAssignableFrom(cls)) {
            return super.mo171a(cls);
        }
        try {
            return (AbstractC2580uE) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
