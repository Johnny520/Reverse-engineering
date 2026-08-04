package yyds;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛲᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0384 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0805 f1966 = new C0805(20);

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final boolean m1088(C0903 c0903, Set set, Executable executable) {
        return m1092(set, m1107(executable.getAnnotatedExceptionTypes()), c0903);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final boolean m1089(C0903 c0903, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC0578.m1456(annotation).mo3993());
        }
        return m1092(set, arrayList, c0903);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final boolean m1090(C0903 c0903, Set set, Executable executable) {
        return !m1092(set, m1107(executable.getAnnotatedParameterTypes()), c0903);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final boolean m1091(C0903 c0903, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC0578.m1456(annotation).mo3993());
        }
        return !m1092(set, arrayList, c0903);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static boolean m1092(Collection collection, List list, C0903 c0903) {
        Class cls;
        if (collection.size() == list.size()) {
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                Class cls2 = (Class) list.get(i);
                Class clsM1094 = m1094(obj, c0903, null);
                cls = AbstractC0364.class;
                Class<AbstractC0364> clsM1450 = AbstractC0578.m1450(AbstractC1700.m3448(cls));
                if (AbstractC1544.m3188(clsM1094, clsM1450 != null ? clsM1450 : AbstractC0364.class) || AbstractC1544.m3188(cls2, clsM1094)) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0497 m1093(C0558 c0558, AbstractC2441 abstractC2441, C0903 c0903) {
        return m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(c0558, c0903, "name", abstractC2441.f12003, new C1936(24)), c0903, "nameCondition", abstractC2441.f12005, new C1936(25)), c0903, "modifiers", abstractC2441.f12007, new C1936(26)), c0903, "modifiersNot", abstractC2441.f12001, new C1936(27)), c0903, "modifiersCondition", null, new C1936(28)), c0903, "isSynthetic", null, new C1936(29)), c0903, "isSyntheticNot", null, new C2809(0)), c0903, "annotations", abstractC2441.f12006, new C2409(c0903, 15)), c0903, "annotationsNot", abstractC2441.f12004, new C2409(c0903, 16)), c0903, "genericString", null, new C2809(1));
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static Class m1094(Object obj, C0903 c0903, String str) {
        Class clsM2792;
        Class cls;
        if (obj instanceof Class) {
            clsM2792 = (Class) obj;
        } else if (obj instanceof C2234) {
            clsM2792 = ((C2234) obj).mo3993();
        } else if (obj instanceof String) {
            int i = c0903.f4118;
            Class cls2 = c0903.f4115;
            if (i == 1) {
                clsM2792 = AbstractC1371.m2791((String) obj, cls2.getClassLoader(), 2);
            } else {
                clsM2792 = AbstractC1371.m2792((String) obj, cls2.getClassLoader(), 2);
                if (clsM2792 == null) {
                    clsM2792 = AbstractC2071.class;
                    Class clsM1450 = AbstractC0578.m1450(AbstractC1700.m3448(clsM2792));
                    if (clsM1450 != null) {
                        clsM2792 = clsM1450;
                    }
                }
            }
        } else {
            if (!(obj instanceof AbstractC0364)) {
                throw new IllegalStateException(("Unsupported type: " + obj + ", supported types are Class, KClass, String and VagueType.").toString());
            }
            clsM2792 = obj.getClass();
        }
        cls = AbstractC0364.class;
        Class<AbstractC0364> clsM14502 = AbstractC0578.m1450(AbstractC1700.m3448(cls));
        if (!AbstractC1544.m3188(clsM2792, clsM14502 != null ? clsM14502 : AbstractC0364.class) || str == null) {
            return clsM2792;
        }
        throw new IllegalStateException(("VagueType is not supported for \"" + str + "\".").toString());
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final boolean m1095(C0903 c0903, Set set, Executable executable) {
        return !m1092(set, m1107(executable.getAnnotatedExceptionTypes()), c0903);
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static List m1096(AbstractC2441 abstractC2441, C0903 c0903, Class cls, InterfaceC1549 interfaceC1549) {
        Class cls2;
        List listM1096 = C1860.f9345;
        if (cls != null) {
            cls2 = Object.class;
            Class<Object> clsM1450 = AbstractC0578.m1450(AbstractC1700.m3448(cls2));
            if (!cls.equals(clsM1450 != null ? clsM1450 : Object.class)) {
                Collection collection = (Collection) interfaceC1549.mo371(cls);
                if (collection.isEmpty()) {
                    if (c0903.f4117) {
                        listM1096 = m1096(abstractC2441, c0903, cls.getSuperclass(), interfaceC1549);
                    } else {
                        m1103(abstractC2441, c0903);
                    }
                    collection = listM1096;
                }
                return (List) collection;
            }
        }
        m1103(abstractC2441, c0903);
        return listM1096;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final int m1097(String str) {
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j += ((long) str.charAt(i)) > 127 ? 2L : 1L;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static Annotation[] m1098(Member member) {
        if (member instanceof AnnotatedElement) {
            return ((AnnotatedElement) member).getDeclaredAnnotations();
        }
        C0188.m791(member, "Unsupported member type: ");
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static C0497 m1099(C0497 c0497, AbstractC2197 abstractC2197, C0903 c0903) {
        return m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(m1105(c0497, c0903, "parameters", abstractC2197.f10776, new C2409(c0903, 0)), c0903, "parametersNot", abstractC2197.f10779, new C2409(c0903, 7)), c0903, "parametersCondition", null, new C1936(17)), c0903, "parameterCount", abstractC2197.f10790, new C1936(18)), c0903, "parameterCountCondition", null, new C1936(19)), c0903, "typeParameters", abstractC2197.f10792, new C1936(20)), c0903, "typeParametersNot", abstractC2197.f10789, new C1936(21)), c0903, "exceptionTypes", abstractC2197.f10777, new C2409(c0903, 13)), c0903, "exceptionTypesNot", abstractC2197.f10775, new C2409(c0903, 14)), c0903, "genericExceptionTypes", abstractC2197.f10782, new C1936(22)), c0903, "genericExceptionTypesNot", abstractC2197.f10794, new C1936(11)), c0903, "genericParameters", abstractC2197.f10786, new C1936(12)), c0903, "genericParametersNot", abstractC2197.f10783, new C1936(13)), c0903, "isVarArgs", null, new C1936(14)), c0903, "isVarArgsNot", null, new C1936(15)), c0903, "parameterAnnotations", abstractC2197.f10793, new C2409(c0903, 1)), c0903, "parameterAnnotationsNot", abstractC2197.f10781, new C2409(c0903, 3)), c0903, "annotatedReturnType", abstractC2197.f10788, new C2409(c0903, 4)), c0903, "annotatedReturnTypeNot", abstractC2197.f10787, new C2409(c0903, 5)), c0903, "annotatedReceiverType", abstractC2197.f10785, new C2409(c0903, 6)), c0903, "annotatedReceiverTypeNot", abstractC2197.f10780, new C2409(c0903, 8)), c0903, "annotatedParameterTypes", abstractC2197.f10795, new C2409(c0903, 9)), c0903, "annotatedParameterTypesNot", abstractC2197.f10784, new C2409(c0903, 10)), c0903, "annotatedExceptionTypes", abstractC2197.f10778, new C2409(c0903, 11)), c0903, "annotatedExceptionTypesNot", abstractC2197.f10791, new C2409(c0903, 12));
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final boolean m1100(C0903 c0903, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC0578.m1456(annotation).mo3993());
        }
        return !m1092(set, arrayList, c0903);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final boolean m1101(C0903 c0903, Set set, Executable executable) {
        return m1092(set, m1107(executable.getAnnotatedParameterTypes()), c0903);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final boolean m1102(C0903 c0903, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC0578.m1456(annotation).mo3993());
        }
        return m1092(set, arrayList, c0903);
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static void m1103(AbstractC2441 abstractC2441, C0903 c0903) {
        Class cls;
        Object c2658;
        String strM4014;
        String strM1061;
        boolean z = c0903.f4117;
        Class cls2 = c0903.f4115;
        String str = z ? " (Also tried for superclass)" : "";
        String str2 = !z ? "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. " : "Check if the conditions are correct and valid, and try again. ";
        try {
            Map mapMo1846 = abstractC2441.mo1846();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapMo1846.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    strM1061 = value instanceof InterfaceC0557 ? "(Runtime Condition)" : ((value instanceof Collection) && ((Collection) value).isEmpty()) ? null : AbstractC0364.m1061(value);
                }
                String strM1598 = strM1061 != null ? AbstractC0692.m1598(strM1061.toString(), " (Kotlin reflection is not available)", "") : null;
                Pair pair = strM1598 != null ? new Pair(str3, strM1598) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            if (arrayList.isEmpty()) {
                c2658 = cls2.toString();
                cls = cls2;
            } else {
                Iterator it = arrayList.iterator();
                try {
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    final int iM1097 = m1097((String) ((Pair) it.next()).getFirst());
                    while (it.hasNext()) {
                        int iM10972 = m1097((String) ((Pair) it.next()).getFirst());
                        if (iM1097 < iM10972) {
                            iM1097 = iM10972;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int iM10973 = m1097((String) ((Pair) it2.next()).getSecond());
                    while (it2.hasNext()) {
                        int iM10974 = m1097((String) ((Pair) it2.next()).getSecond());
                        if (iM10973 < iM10974) {
                            iM10973 = iM10974;
                        }
                    }
                    String strM15982 = AbstractC0692.m1598(cls2.toString(), " (Kotlin reflection is not available)", "");
                    int iM10975 = m1097(strM15982) - ((iM1097 + iM10973) + 3);
                    if (iM10975 < 0) {
                        iM10975 = 0;
                    }
                    final int i = iM10973 + iM10975;
                    cls = cls2;
                    String str4 = "+-" + AbstractC0692.m1599(iM1097, "-") + "-+-" + AbstractC0692.m1599(i, "-") + "-+";
                    int i2 = iM1097 + i + 3;
                    c2658 = AbstractC1595.m3285(AbstractC2725.m4854("+-" + AbstractC0692.m1599(i2, "-") + "-+", "| " + m1104(i2, strM15982) + " |", str4, AbstractC1595.m3285(arrayList, "\n", null, null, new InterfaceC1549() { // from class: yyds.ᲀᛱᲁᛸ
                        @Override // yyds.InterfaceC1549
                        /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                        public final Object mo371(Object obj) {
                            Pair pair2 = (Pair) obj;
                            String str5 = (String) pair2.component1();
                            String str6 = (String) pair2.component2();
                            return "| " + AbstractC0384.m1104(iM1097, str5) + " | " + AbstractC0384.m1104(i, str6) + " |";
                        }
                    }, 30), str4), "\n", null, null, null, 62);
                } catch (Throwable th) {
                    th = th;
                    c2658 = new C2658(th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls2;
        }
        Object objConcat = AbstractC0692.m1598(cls.toString(), " (Kotlin reflection is not available)", "").concat("\nFailed to build condition table.");
        if (c2658 instanceof C2658) {
            c2658 = objConcat;
        }
        String str5 = (String) c2658;
        boolean z2 = abstractC2441 instanceof C1189;
        if (z2) {
            strM4014 = "No method found matching the condition for current class" + str + ".\n" + str5 + "\nSuggestion: " + str2;
        } else if (abstractC2441 instanceof C0176) {
            strM4014 = AbstractC2104.m4014("No constructor found matching the condition for current class.\n", str5, "\nSuggestion: Constructors are not inherited from superclass, check if the conditions are correct and valid, and try again. ");
        } else {
            if (!(abstractC2441 instanceof C0802)) {
                C0188.m791(abstractC2441, "Unsupported condition type: ");
                return;
            }
            strM4014 = "No field found matching the condition for current class" + str + ".\n" + str5 + "\nSuggestion: " + str2;
        }
        int i3 = c0903.f4118;
        if (i3 != 1) {
            if (i3 == 2) {
                C0078 c0078 = AbstractC2003.f10023;
                AbstractC2003.m3882(AbstractC0473.m1314(strM4014).toString(), null);
                return;
            }
            return;
        }
        if (z2) {
            throw new NoSuchMethodException(strM4014.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.3 ======\n"));
        }
        if (abstractC2441 instanceof C0176) {
            throw new NoSuchMethodException(strM4014.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.3 ======\n"));
        }
        if (abstractC2441 instanceof C0802) {
            throw new NoSuchFieldException(strM4014.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.3 ======\n"));
        }
        C0188.m791(abstractC2441, "Unsupported condition type: ");
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final String m1104(int i, String str) {
        int iM1097 = i - m1097(str);
        if (iM1097 <= 0) {
            return str;
        }
        return str + AbstractC0692.m1599(iM1097, " ");
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static C0497 m1105(InterfaceC1240 interfaceC1240, C0903 c0903, String str, Object obj, InterfaceC0477 interfaceC0477) {
        return AbstractC1529.m3163(interfaceC1240, new C2410(obj, interfaceC0477, c0903, str, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [yyds.ᲈᛵᛵᛴ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static List m1106(C0176 c0176, C0903 c0903) {
        ?? c2658;
        C1125 c1125;
        c0903.getClass();
        try {
            Constructor<?>[] declaredConstructors = c0903.f4115.getDeclaredConstructors();
            c2658 = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor != null) {
                    c2658.add(constructor);
                }
            }
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            C0078 c0078 = AbstractC2003.f10023;
            AbstractC2003.m3882("Failed to get declared constructors in " + f1966 + " because got an exception.", thM4249);
        }
        boolean z = c2658 instanceof C2658;
        ?? r2 = c2658;
        if (z) {
            r2 = 0;
        }
        Object obj = (List) r2;
        if (obj == null) {
            obj = C1860.f9345;
        }
        C0497 c0497M1099 = m1099(m1093(new C0558(1, obj), c0176, c0903), c0176, c0903);
        C2234 c2234M3448 = AbstractC1700.m3448(Constructor.class);
        if (c2234M3448.equals(AbstractC1700.m3448(Method.class))) {
            c1125 = new C1125(c0497M1099, new C2519(c0903, 0));
        } else if (c2234M3448.equals(AbstractC1700.m3448(Constructor.class))) {
            c1125 = new C1125(c0497M1099, new C2519(c0903, 1));
        } else {
            if (!c2234M3448.equals(AbstractC1700.m3448(Field.class))) {
                C0188.m791(c0497M1099, "Unsupported member type: ");
                return null;
            }
            c1125 = new C1125(c0497M1099, new C2519(c0903, 2));
        }
        return AbstractC1529.m3155(c1125);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static List m1107(AnnotatedElement[] annotatedElementArr) {
        int length = 0;
        for (AnnotatedElement annotatedElement : annotatedElementArr) {
            length += annotatedElement.getAnnotations().length;
        }
        if (length == 0) {
            return C1860.f9345;
        }
        C2578 c2578M3296 = AbstractC0024.m3296();
        for (AnnotatedElement annotatedElement2 : annotatedElementArr) {
            for (Annotation annotation : annotatedElement2.getAnnotations()) {
                c2578M3296.add(AbstractC0578.m1456(annotation).mo3993());
            }
        }
        return AbstractC0024.m3305(c2578M3296);
    }
}
