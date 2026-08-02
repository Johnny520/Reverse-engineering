package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vc2 {

    /* JADX INFO: renamed from: a */
    public static final List f11901a = AbstractC0179eu.m1435P(Application.class, jc2.class);

    /* JADX INFO: renamed from: b */
    public static final List f11902b = AbstractC0179eu.m1434O(jc2.class);

    /* JADX INFO: renamed from: a */
    public static final Constructor m5666a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listM3105t0 = AbstractC0460mg.m3105t0(parameterTypes);
            if (list.equals(listM3105t0)) {
                return constructor;
            }
            if (list.size() == listM3105t0.size() && listM3105t0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final fb3 m5667b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (fb3) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            c80.m671o("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
