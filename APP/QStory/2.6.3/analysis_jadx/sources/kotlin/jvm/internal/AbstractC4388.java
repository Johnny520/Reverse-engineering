package kotlin.jvm.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.InterfaceC5168;
import kotlin.reflect.InterfaceC5091;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
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
import p052.InterfaceC6560;
import p054.InterfaceC6562;
import p054.InterfaceC6563;
import p054.InterfaceC6565;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4388 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Method m8887(InterfaceC5091 interfaceC5091, String str) {
        str.getClass();
        if (!(interfaceC5091 instanceof InterfaceC4387)) {
            return null;
        }
        String strM10157 = AbstractC5144.m10157(str, '(');
        if (strM10157.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME)) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + interfaceC5091 + '/' + str);
        }
        Method[] declaredMethods = ((InterfaceC4387) interfaceC5091).mo8879().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (AbstractC4395.m8907(method.getName(), strM10157)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    m8892(cls, sb);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                m8892(returnType, sb);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m8888(int i, Object obj) {
        if (obj == null || m8894(i, obj)) {
            return;
        }
        m8895(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Set m8889(Object obj) {
        if ((obj instanceof InterfaceC6567) && !(obj instanceof InterfaceC6562)) {
            m8895(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            AbstractC4395.m8903(e, AbstractC4388.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Map m8890(Object obj) {
        if ((obj instanceof InterfaceC6567) && !(obj instanceof InterfaceC6563)) {
            m8895(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            AbstractC4395.m8903(e, AbstractC4388.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m8891(Object obj) {
        if ((obj instanceof InterfaceC6567) && !(obj instanceof InterfaceC6565)) {
            m8895(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            AbstractC4395.m8903(e, AbstractC4388.class.getName());
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8892(Class cls, StringBuilder sb) {
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
    public static boolean m8893(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC6567) || (obj instanceof InterfaceC6565);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m8894(int i, Object obj) {
        if (obj instanceof InterfaceC5168) {
            if ((obj instanceof InterfaceC4383 ? ((InterfaceC4383) obj).getArity() : obj instanceof InterfaceC6543 ? 0 : obj instanceof InterfaceC6558 ? 1 : obj instanceof InterfaceC6554 ? 2 : obj instanceof InterfaceC6551 ? 3 : obj instanceof InterfaceC6552 ? 4 : obj instanceof InterfaceC6545 ? 5 : obj instanceof InterfaceC6544 ? 6 : obj instanceof InterfaceC6547 ? 7 : obj instanceof InterfaceC6548 ? 8 : obj instanceof InterfaceC6546 ? 9 : obj instanceof InterfaceC6542 ? 10 : obj instanceof InterfaceC6541 ? 11 : obj instanceof InterfaceC6540 ? 12 : obj instanceof InterfaceC6539 ? 13 : obj instanceof InterfaceC6538 ? 14 : obj instanceof InterfaceC6556 ? 15 : obj instanceof InterfaceC6555 ? 16 : obj instanceof InterfaceC6559 ? 17 : obj instanceof InterfaceC6560 ? 18 : obj instanceof InterfaceC6557 ? 19 : obj instanceof InterfaceC6550 ? 20 : obj instanceof InterfaceC6549 ? 21 : obj instanceof InterfaceC6553 ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m8895(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC4395.m8903(classCastException, AbstractC4388.class.getName());
        throw classCastException;
    }
}
