package p000a;

import android.app.Application;
import androidx.lifecycle.C1128m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: a.Md */
/* JADX INFO: loaded from: classes.dex */
public final class C0232Md {

    /* JADX INFO: renamed from: a */
    public static final List<Class<?>> f772a = C0739o3.m1757d0(Application.class, C1128m.class);

    /* JADX INFO: renamed from: b */
    public static final List<Class<?>> f773b = C0889w1.m2124K(C1128m.class);

    /* JADX INFO: renamed from: a */
    public static final <T> Constructor<T> m623a(Class<T> cls, List<? extends Class<?>> list) {
        C0631i9.m1482e(list, "signature");
        Object[] constructors = cls.getConstructors();
        C0631i9.m1481d(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C0631i9.m1481d(parameterTypes, "constructor.parameterTypes");
            List listM633g0 = C0238N1.m633g0(parameterTypes);
            if (list.equals(listM633g0)) {
                return constructor;
            }
            if (list.size() == listM633g0.size() && listM633g0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final <T extends AbstractC0073Dg> T m624b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
