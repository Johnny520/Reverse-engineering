package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hb3 extends jb3 {

    /* JADX INFO: renamed from: c */
    public static hb3 f3947c;

    /* JADX INFO: renamed from: d */
    public static final ix2 f3948d = new ix2(7);

    /* JADX INFO: renamed from: b */
    public final Application f3949b;

    public hb3(Application application) {
        this.f3949b = application;
    }

    @Override // p000.jb3, p000.ib3
    /* JADX INFO: renamed from: a */
    public final fb3 mo2139a(Class cls) {
        Application application = this.f3949b;
        if (application != null) {
            return m2141d(cls, application);
        }
        c80.m676t("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // p000.jb3, p000.ib3
    /* JADX INFO: renamed from: b */
    public final fb3 mo2140b(Class cls, wj1 wj1Var) {
        if (this.f3949b != null) {
            return mo2139a(cls);
        }
        Application application = (Application) wj1Var.f9877a.get(f3948d);
        if (application != null) {
            return m2141d(cls, application);
        }
        if (!AbstractC0345jc.class.isAssignableFrom(cls)) {
            return ci0.m782G(cls);
        }
        C0676s.m4651j("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final fb3 m2141d(Class cls, Application application) {
        if (!AbstractC0345jc.class.isAssignableFrom(cls)) {
            return ci0.m782G(cls);
        }
        try {
            fb3 fb3Var = (fb3) cls.getConstructor(Application.class).newInstance(application);
            fb3Var.getClass();
            return fb3Var;
        } catch (IllegalAccessException e) {
            c80.m671o("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            c80.m671o("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            c80.m671o("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            c80.m671o("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
