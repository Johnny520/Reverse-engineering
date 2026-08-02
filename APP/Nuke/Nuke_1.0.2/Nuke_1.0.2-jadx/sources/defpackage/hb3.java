package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hb3 extends jb3 {
    public static hb3 c;
    public static final ix2 d = new ix2(7);
    public final Application b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hb3(Application application) {
        this.b = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jb3, defpackage.ib3
    public final fb3 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        c80.t("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jb3, defpackage.ib3
    public final fb3 b(Class cls, wj1 wj1Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) wj1Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!jc.class.isAssignableFrom(cls)) {
            return ci0.G(cls);
        }
        s.j("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fb3 d(Class cls, Application application) {
        if (!jc.class.isAssignableFrom(cls)) {
            return ci0.G(cls);
        }
        try {
            fb3 fb3Var = (fb3) cls.getConstructor(Application.class).newInstance(application);
            fb3Var.getClass();
            return fb3Var;
        } catch (IllegalAccessException e) {
            c80.o("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            c80.o("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            c80.o("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            c80.o("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
