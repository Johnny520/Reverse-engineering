package p045Y;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p006D.AbstractC0079h;
import p022L.AbstractC0174d;
import p037T.C0265p;

/* JADX INFO: renamed from: Y.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0357c {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0079h f834a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0079h c0355a;
        try {
            c0355a = new C0356b();
        } catch (NoSuchMethodException unused) {
            c0355a = new C0355a();
        }
        f834a = c0355a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m612a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i2].getSimpleName());
        }
        sb.append(')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m613b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m612a(constructor, sb);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m614c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m615d(AccessibleObject accessibleObject, boolean z2) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m614c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m612a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m613b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z2 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m616e(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e2) {
            throw new C0265p(AbstractC0174d.m353i("Failed making ", m615d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e2);
        }
    }
}
