package kotlin.jvm.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC6000;
import kotlin.reflect.InterfaceC5923;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7367;
import p068.InterfaceC7368;
import p068.InterfaceC7369;
import p068.InterfaceC7370;
import p068.InterfaceC7371;
import p068.InterfaceC7372;
import p068.InterfaceC7373;
import p068.InterfaceC7374;
import p068.InterfaceC7375;
import p068.InterfaceC7376;
import p068.InterfaceC7377;
import p068.InterfaceC7378;
import p068.InterfaceC7379;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7382;
import p068.InterfaceC7383;
import p068.InterfaceC7384;
import p068.InterfaceC7385;
import p068.InterfaceC7386;
import p068.InterfaceC7387;
import p068.InterfaceC7388;
import p068.InterfaceC7389;
import p070.InterfaceC7391;
import p070.InterfaceC7392;
import p070.InterfaceC7394;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5220 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Method m9446(InterfaceC5923 interfaceC5923, String str) {
        str.getClass();
        if (!(interfaceC5923 instanceof InterfaceC5219)) {
            return null;
        }
        String strM10716 = AbstractC5976.m10716(str, '(');
        if (strM10716.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + interfaceC5923 + '/' + str);
        }
        Method[] declaredMethods = ((InterfaceC5219) interfaceC5923).mo9438().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (AbstractC5227.m9466(method.getName(), strM10716)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    m9451(cls, sb);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                m9451(returnType, sb);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m9447(int i, Object obj) {
        if (obj == null || m9453(i, obj)) {
            return;
        }
        m9454(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Set m9448(Object obj) {
        if ((obj instanceof InterfaceC7396) && !(obj instanceof InterfaceC7391)) {
            m9454(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            AbstractC5227.m9462(e, AbstractC5220.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Map m9449(Object obj) {
        if ((obj instanceof InterfaceC7396) && !(obj instanceof InterfaceC7392)) {
            m9454(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            AbstractC5227.m9462(e, AbstractC5220.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m9450(Object obj) {
        if ((obj instanceof InterfaceC7396) && !(obj instanceof InterfaceC7394)) {
            m9454(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            AbstractC5227.m9462(e, AbstractC5220.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m9451(Class cls, StringBuilder sb) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String strReplace = cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        strReplace.getClass();
        sb.append((CharSequence) strReplace);
        sb.append(";");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m9452(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC7396) || (obj instanceof InterfaceC7394);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m9453(int i, Object obj) {
        if (obj instanceof InterfaceC6000) {
            if ((obj instanceof InterfaceC5215 ? ((InterfaceC5215) obj).getArity() : obj instanceof InterfaceC7372 ? 0 : obj instanceof InterfaceC7387 ? 1 : obj instanceof InterfaceC7383 ? 2 : obj instanceof InterfaceC7380 ? 3 : obj instanceof InterfaceC7381 ? 4 : obj instanceof InterfaceC7374 ? 5 : obj instanceof InterfaceC7373 ? 6 : obj instanceof InterfaceC7376 ? 7 : obj instanceof InterfaceC7377 ? 8 : obj instanceof InterfaceC7375 ? 9 : obj instanceof InterfaceC7371 ? 10 : obj instanceof InterfaceC7370 ? 11 : obj instanceof InterfaceC7369 ? 12 : obj instanceof InterfaceC7368 ? 13 : obj instanceof InterfaceC7367 ? 14 : obj instanceof InterfaceC7385 ? 15 : obj instanceof InterfaceC7384 ? 16 : obj instanceof InterfaceC7388 ? 17 : obj instanceof InterfaceC7389 ? 18 : obj instanceof InterfaceC7386 ? 19 : obj instanceof InterfaceC7379 ? 20 : obj instanceof InterfaceC7378 ? 21 : obj instanceof InterfaceC7382 ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m9454(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC5227.m9462(classCastException, AbstractC5220.class.getName());
        throw classCastException;
    }
}
