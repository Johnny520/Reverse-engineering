package androidx.lifecycle;

import android.app.Application;
import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC5179;
import p050.AbstractC7176;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3262 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f7424 = AbstractC7176.m12490(Application.class, C3253.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f7423 = AbstractC7176.m12487(C3253.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC3258 m5084(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC3258) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            C1123.m1408(AbstractC0900.m714(cls, "Failed to access "), e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            C1123.m1408(AbstractC0900.m714(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Constructor m5085(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listM9405 = AbstractC5179.m9405(parameterTypes);
            if (list.equals(listM9405)) {
                return constructor;
            }
            if (list.size() == listM9405.size() && listM9405.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
