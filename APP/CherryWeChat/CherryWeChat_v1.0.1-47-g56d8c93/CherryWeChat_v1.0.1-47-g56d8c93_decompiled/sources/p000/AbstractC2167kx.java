package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: kx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2167kx {

    /* JADX INFO: renamed from: a */
    public static final List f7551a = AbstractC2496sa.m4977b0(Application.class, C1194ax.class);

    /* JADX INFO: renamed from: b */
    public static final List f7552b = Collections.singletonList(C1194ax.class);

    /* JADX INFO: renamed from: a */
    public static final Constructor m4368a(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listM1316K = AbstractC0650P4.m1316K(constructor.getParameterTypes());
            if (list.equals(listM1316K)) {
                return constructor;
            }
            if (list.size() == listM1316K.size() && listM1316K.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC2580uE m4369b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC2580uE) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
