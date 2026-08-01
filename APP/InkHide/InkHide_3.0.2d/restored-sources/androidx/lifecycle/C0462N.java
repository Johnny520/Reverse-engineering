package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import p018J.C0158c;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0462N extends C0461M {

    /* JADX INFO: renamed from: f */
    public static C0462N f1499f;

    /* JADX INFO: renamed from: e */
    public final Application f1500e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0462N(Application application) {
        this.f1500e = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractC0460L m918a(Class cls, Application application) {
        if (!AbstractC0466a.class.isAssignableFrom(cls)) {
            return super.mo313e(cls);
        }
        try {
            AbstractC0460L abstractC0460L = (AbstractC0460L) cls.getConstructor(Application.class).newInstance(application);
            AbstractC0223g.m417d(abstractC0460L, "{\n                try {\n…          }\n            }");
            return abstractC0460L;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.C0461M, androidx.lifecycle.InterfaceC0463O
    /* JADX INFO: renamed from: e */
    public final AbstractC0460L mo313e(Class cls) {
        Application application = this.f1500e;
        if (application != null) {
            return m918a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0463O
    /* JADX INFO: renamed from: h */
    public final AbstractC0460L mo137h(Class cls, C0158c c0158c) {
        if (this.f1500e != null) {
            return mo313e(cls);
        }
        Application application = (Application) ((LinkedHashMap) c0158c.f470a).get(C0461M.f1496b);
        if (application != null) {
            return m918a(cls, application);
        }
        if (AbstractC0466a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.mo313e(cls);
    }
}
