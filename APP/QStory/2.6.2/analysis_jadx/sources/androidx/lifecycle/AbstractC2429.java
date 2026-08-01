package androidx.lifecycle;

import android.app.Application;
import androidx.collection.C0276;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC4346;
import p253.AbstractC8189;
import p383.AbstractC9032;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2429 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f7078 = AbstractC8189.m13659(Application.class, C2420.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f7077 = AbstractC8189.m13660(C2420.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC2425 m4514(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC2425) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            C0276.m847(AbstractC9032.m14590(cls, "Failed to access "), e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            C0276.m847(AbstractC9032.m14590(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Constructor m4515(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listM8850 = AbstractC4346.m8850(parameterTypes);
            if (list.equals(listM8850)) {
                return constructor;
            }
            if (list.size() == listM8850.size() && listM8850.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
