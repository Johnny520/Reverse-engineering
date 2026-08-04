package yyds;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛴᛳᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0816 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static volatile String f3744;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0816 f3745;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0078 f3746;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static volatile C0139 f3747;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static volatile WeakReference f3748;

    static {
        AbstractC2328.m4341(-772823103210350L);
        f3745 = new C0816();
        f3746 = new C0078(new C0824(11));
        f3748 = new WeakReference(null);
        f3744 = AbstractC2328.m4341(-772904707588974L);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m1883(Field field, Method method, Constructor constructor) {
        AbstractC2328.m4341(-772024239293294L);
        AbstractC2328.m4341(-772084368835438L);
        AbstractC2328.m4341(-772131613475694L);
        field.setAccessible(true);
        method.setAccessible(true);
        constructor.setAccessible(true);
        f3747 = new C0139(field, method, constructor);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Object m1884(Constructor constructor, float f, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class cls;
        int i;
        Object objValueOf;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        AbstractC2328.m4341(-772337771905902L);
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        int length = parameterTypes.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Class<?> cls2 = parameterTypes[i2];
            if (AbstractC1544.m3188(cls2, Float.TYPE) || AbstractC1544.m3188(cls2, Float.class)) {
                i = i3;
                objValueOf = Float.valueOf(f);
            } else {
                if (!AbstractC1544.m3188(cls2, String.class)) {
                    throw new IllegalStateException(AbstractC2328.m4341(-772518160532334L).concat(cls2.getName()).toString());
                }
                i = i3 + 1;
                objValueOf = i3 == 0 ? AbstractC2328.m4341(-772436556153710L) : str;
            }
            arrayList.add(objValueOf);
            i2++;
            i3 = i;
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object objNewInstance = constructor.newInstance(Arrays.copyOf(array, array.length));
        Field[] declaredFields = objNewInstance.getClass().getDeclaredFields();
        AbstractC2328.m4341(-772573995107182L);
        ArrayList arrayList2 = new ArrayList();
        int length2 = declaredFields.length;
        int i4 = 0;
        while (true) {
            cls = Boolean.TYPE;
            if (i4 >= length2) {
                break;
            }
            Field field = declaredFields[i4];
            if (!Modifier.isStatic(field.getModifiers()) && (AbstractC1544.m3188(field.getType(), cls) || AbstractC1544.m3188(field.getType(), Boolean.class))) {
                arrayList2.add(field);
            }
            i4++;
        }
        Field field2 = (Field) AbstractC1595.m3275(arrayList2);
        if (field2 != null) {
            field2.setAccessible(true);
            if (AbstractC1544.m3188(field2.getType(), cls)) {
                field2.setBoolean(objNewInstance, false);
            } else {
                field2.set(objNewInstance, Boolean.FALSE);
            }
        }
        AbstractC2328.m4341(-772672779354990L);
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static boolean m1885(final float f, final Object obj, final String str, final C0139 c0139) {
        if (Math.abs(f) <= Float.MAX_VALUE) {
            ((Handler) f3746.getValue()).post(new Runnable() { // from class: yyds.ᛴᲈᛶᲀ
                @Override // java.lang.Runnable
                public final void run() {
                    Object c2658;
                    C0139 c01392 = c0139;
                    float f2 = f;
                    String str2 = str;
                    Object obj2 = obj;
                    C0816 c0816 = C0816.f3745;
                    try {
                        Constructor constructor = c01392.f848;
                        c0816.getClass();
                        c2658 = c01392.f847.invoke(obj2, C0816.m1884(constructor, f2, str2));
                    } catch (Throwable th) {
                        c2658 = new C2658(th);
                    }
                    Throwable thM4249 = C2248.m4249(c2658);
                    if (thM4249 != null) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-772715729027950L) + f2 + AbstractC2328.m4341(-772801628373870L), thM4249);
                    }
                }
            });
            return true;
        }
        C2336.f11496.m4354(AbstractC2328.m4341(-772299117200238L) + f);
        return false;
    }
}
