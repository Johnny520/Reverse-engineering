package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.M */
/* JADX INFO: loaded from: classes.dex */
public class C0461M implements InterfaceC0463O {

    /* JADX INFO: renamed from: b */
    public static final C0461M f1496b = new C0461M();

    /* JADX INFO: renamed from: c */
    public static final C0461M f1497c = new C0461M();

    /* JADX INFO: renamed from: d */
    public static C0461M f1498d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0463O
    /* JADX INFO: renamed from: e */
    public AbstractC0460L mo313e(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            AbstractC0223g.m417d(objNewInstance, "{\n                modelC…wInstance()\n            }");
            return (AbstractC0460L) objNewInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
