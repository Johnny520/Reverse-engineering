package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1027c;
import p024b9.AbstractC1061t;
import p181m4.C4965b;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p280t5.C8130u;

/* JADX INFO: renamed from: androidx.lifecycle.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0667j0 {

    /* JADX INFO: renamed from: a */
    public static final List f1963a = AbstractC5114x.m20803r(Application.class, C0651b0.class);

    /* JADX INFO: renamed from: b */
    public static final List f1964b = AbstractC5112w.m20789e(C0651b0.class);

    /* JADX INFO: renamed from: c */
    public static final Constructor m2626c(Class cls, List list) {
        cls.getClass();
        list.getClass();
        Iterator itM3774a = AbstractC1027c.m3774a(cls.getConstructors());
        while (itM3774a.hasNext()) {
            Constructor constructor = (Constructor) itM3774a.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listM20713V0 = AbstractC5106t.m20713V0(parameterTypes);
            if (AbstractC1061t.m3842c(list, listM20713V0)) {
                return constructor;
            }
            if (list.size() == listM20713V0.size() && listM20713V0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC0671l0 m2627d(Class cls, Constructor constructor, Object... objArr) {
        cls.getClass();
        constructor.getClass();
        objArr.getClass();
        try {
            return (AbstractC0671l0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            C4965b.m20055a("Failed to access ", cls, e10);
            return null;
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            C8130u.m31512a("An exception happened in constructor of " + cls, e12.getCause());
            return null;
        }
    }
}
