package p002A1;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: A1.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0121J {

    /* JADX INFO: renamed from: a */
    public static final List f511a = AbstractC2352g.m4212z(Application.class, C0112A.class);

    /* JADX INFO: renamed from: b */
    public static final List f512b = AbstractC2352g.m4211y(C0112A.class);

    /* JADX INFO: renamed from: a */
    public static final Constructor m171a(Class cls, List list) {
        AbstractC1665j.m2985e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC1665j.m2984d(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC1665j.m2984d(parameterTypes, "getParameterTypes(...)");
            List listM2007e0 = AbstractC0972l.m2007e0(parameterTypes);
            if (list.equals(listM2007e0)) {
                return constructor;
            }
            if (list.size() == listM2007e0.size() && listM2007e0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC0122K m172b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC0122K) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Failed to access " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e7.getCause());
        }
    }
}
