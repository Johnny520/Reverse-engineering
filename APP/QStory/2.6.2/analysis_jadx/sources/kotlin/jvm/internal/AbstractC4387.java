package kotlin.jvm.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC5167;
import kotlin.reflect.InterfaceC5090;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6537;
import p052.InterfaceC6538;
import p052.InterfaceC6539;
import p052.InterfaceC6540;
import p052.InterfaceC6541;
import p052.InterfaceC6542;
import p052.InterfaceC6543;
import p052.InterfaceC6544;
import p052.InterfaceC6545;
import p052.InterfaceC6546;
import p052.InterfaceC6547;
import p052.InterfaceC6548;
import p052.InterfaceC6549;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p052.InterfaceC6552;
import p052.InterfaceC6553;
import p052.InterfaceC6554;
import p052.InterfaceC6555;
import p052.InterfaceC6556;
import p052.InterfaceC6557;
import p052.InterfaceC6558;
import p052.InterfaceC6559;
import p054.InterfaceC6561;
import p054.InterfaceC6562;
import p054.InterfaceC6564;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4387 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Method m8897(InterfaceC5090 interfaceC5090, String str) {
        str.getClass();
        if (!(interfaceC5090 instanceof InterfaceC4386)) {
            return null;
        }
        String strM10137 = AbstractC5143.m10137(str, '(');
        if (strM10137.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + interfaceC5090 + '/' + str);
        }
        Method[] declaredMethods = ((InterfaceC4386) interfaceC5090).mo8889().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (AbstractC4394.m8917(method.getName(), strM10137)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    m8902(cls, sb);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                m8902(returnType, sb);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m8898(int i, Object obj) {
        if (obj == null || m8904(i, obj)) {
            return;
        }
        m8905(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Set m8899(Object obj) {
        if ((obj instanceof InterfaceC6566) && !(obj instanceof InterfaceC6561)) {
            m8905(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            AbstractC4394.m8913(e, AbstractC4387.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Map m8900(Object obj) {
        if ((obj instanceof InterfaceC6566) && !(obj instanceof InterfaceC6562)) {
            m8905(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            AbstractC4394.m8913(e, AbstractC4387.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m8901(Object obj) {
        if ((obj instanceof InterfaceC6566) && !(obj instanceof InterfaceC6564)) {
            m8905(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            AbstractC4394.m8913(e, AbstractC4387.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8902(Class cls, StringBuilder sb) {
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
    public static boolean m8903(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC6566) || (obj instanceof InterfaceC6564);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m8904(int i, Object obj) {
        if (obj instanceof InterfaceC5167) {
            if ((obj instanceof InterfaceC4382 ? ((InterfaceC4382) obj).getArity() : obj instanceof InterfaceC6542 ? 0 : obj instanceof InterfaceC6557 ? 1 : obj instanceof InterfaceC6553 ? 2 : obj instanceof InterfaceC6550 ? 3 : obj instanceof InterfaceC6551 ? 4 : obj instanceof InterfaceC6544 ? 5 : obj instanceof InterfaceC6543 ? 6 : obj instanceof InterfaceC6546 ? 7 : obj instanceof InterfaceC6547 ? 8 : obj instanceof InterfaceC6545 ? 9 : obj instanceof InterfaceC6541 ? 10 : obj instanceof InterfaceC6540 ? 11 : obj instanceof InterfaceC6539 ? 12 : obj instanceof InterfaceC6538 ? 13 : obj instanceof InterfaceC6537 ? 14 : obj instanceof InterfaceC6555 ? 15 : obj instanceof InterfaceC6554 ? 16 : obj instanceof InterfaceC6558 ? 17 : obj instanceof InterfaceC6559 ? 18 : obj instanceof InterfaceC6556 ? 19 : obj instanceof InterfaceC6549 ? 20 : obj instanceof InterfaceC6548 ? 21 : obj instanceof InterfaceC6552 ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m8905(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC4394.m8913(classCastException, AbstractC4387.class.getName());
        throw classCastException;
    }
}
