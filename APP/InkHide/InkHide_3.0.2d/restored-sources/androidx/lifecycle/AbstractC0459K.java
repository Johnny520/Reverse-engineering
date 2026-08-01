package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p006D.AbstractC0079h;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0124l;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: androidx.lifecycle.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0459K {

    /* JADX INFO: renamed from: a */
    public static final List f1489a = AbstractC0124l.m286Z(Application.class, C0454F.class);

    /* JADX INFO: renamed from: b */
    public static final List f1490b = AbstractC0079h.m167E(C0454F.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Constructor m915a(Class cls, List list) {
        AbstractC0223g.m418e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC0223g.m417d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC0223g.m417d(parameterTypes, "constructor.parameterTypes");
            List listM262j0 = AbstractC0120h.m262j0(parameterTypes);
            if (list.equals(listM262j0)) {
                return constructor;
            }
            if (list.size() == listM262j0.size() && listM262j0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final AbstractC0460L m916b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC0460L) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
        }
    }
}
