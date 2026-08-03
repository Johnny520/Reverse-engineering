package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p025bc.C0260j;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class StringUtil {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String classString(Class<?> cls) {
        if (Reflect.isGeneratedClass(cls)) {
            return generatedClassString(cls);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Modifier.toString(cls.getModifiers()));
        sb2.append(cls.isInterface() ? HttpUrl.FRAGMENT_ENCODE_SET : " class");
        sb2.append(" ");
        sb2.append(getTypeName(cls));
        sb2.append(getTypeExtends(cls));
        sb2.append(getTypeImplements(cls));
        sb2.append(" {");
        return sb2.toString().trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String generatedClassString(Class<?> cls) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Reflect.getClassModifiers(cls).toString().substring(11));
        sb2.append(cls.isInterface() ? " interface" : " class");
        sb2.append(" ");
        sb2.append(getTypeName(cls));
        sb2.append(getTypeExtends(cls));
        sb2.append(getTypeImplements(cls));
        sb2.append(" {");
        return sb2.toString().trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getTypeExtends(Class<?> cls) {
        if (cls.isInterface()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return " extends " + getTypeName(cls.getSuperclass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getTypeImplements(Class<?> cls) {
        StringBuilder sb2 = new StringBuilder();
        if (cls.getInterfaces().length > 0) {
            sb2.append(cls.isInterface() ? " extends " : " implements ");
            sb2.append(String.join(", ", getTypeNamesList(cls.getInterfaces())));
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static String getTypeName(Class<?> cls) {
        return cls == null ? "Object" : cls.getSimpleName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String[] getTypeNames(Class<?>[] clsArr, String[] strArr) {
        return (String[]) getTypeNamesStream(clsArr).map(new C0260j(Stream.of((Object[]) strArr).iterator(), 2)).toArray(new C0348e(12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static List<String> getTypeNamesList(Class<?>[] clsArr) {
        return (List) getTypeNamesStream(clsArr).collect(Collectors.toList());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Stream<String> getTypeNamesStream(Class<?>[] clsArr) {
        return Stream.of((Object[]) clsArr).map(new C0342b(15));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getTypeNames$0(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getTypeNames$1(Iterator it, String str) {
        StringBuilder sbM1025n = AbstractC0255e.m1025n(str, " ");
        sbM1025n.append((String) it.next());
        return sbM1025n.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getTypeNames$2(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String maxCommonPrefix(String str, String str2) {
        int i9 = 0;
        while (str.regionMatches(0, str2, 0, i9)) {
            i9++;
        }
        return str.substring(0, i9 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String methodString(BshMethod bshMethod) {
        String strSubstring = bshMethod.getModifiers().toString().substring(11);
        StringBuilder sbM1025n = AbstractC0255e.m1025n(strSubstring, " ");
        sbM1025n.append(getTypeName(bshMethod.getReturnType()));
        sbM1025n.append(" ");
        sbM1025n.append(methodString(bshMethod.getName(), bshMethod.getParameterTypes(), bshMethod.getParameterNames()));
        sbM1025n.append(strSubstring.contains("abstract") ? ";" : " {}");
        return sbM1025n.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[PHI: r0
  0x0008: PHI (r0v9 java.lang.Class<?>) = 
  (r0v0 java.lang.Class<?>)
  (r0v2 java.lang.Class<?>)
  (r0v3 java.lang.Class<?>)
  (r0v4 java.lang.Class<?>)
  (r0v1 java.lang.Class<?>)
 binds: [B:3:0x0006, B:11:0x0022, B:14:0x002b, B:17:0x0034, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String typeString(Class<?> cls) {
        Class<?> cls2 = Map.class;
        if (cls2.isAssignableFrom(cls)) {
            cls = cls2;
        } else {
            cls2 = List.class;
            if (!cls2.isAssignableFrom(cls)) {
                cls2 = Deque.class;
                if (!cls2.isAssignableFrom(cls)) {
                    cls2 = Set.class;
                    if (!cls2.isAssignableFrom(cls)) {
                        cls2 = Map.Entry.class;
                        if (cls2.isAssignableFrom(cls)) {
                        }
                    }
                }
            } else if (Queue.class.isAssignableFrom(cls)) {
                cls = Queue.class;
            }
        }
        if (!cls.isArray()) {
            return cls.getName().startsWith("java") ? cls.getSimpleName() : cls.getName();
        }
        return typeString(cls.getComponentType()) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String typeValueString(Object obj) {
        return valueString(obj) + " :" + typeString(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String valueString(Object obj) {
        StringBuilder sb2 = new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET + obj);
        if (obj != null && obj.getClass().isArray()) {
            StringBuilder sb3 = new StringBuilder("{");
            for (int i9 = 0; i9 < Array.getLength(obj); i9++) {
                sb3.append(valueString(Array.get(obj, i9)));
                sb3.append(", ");
            }
            if (sb3.reverse().charAt(0) == ' ') {
                sb3.delete(0, 2);
            }
            StringBuilder sbReverse = sb3.reverse();
            sbReverse.append("}");
            return sbReverse.toString();
        }
        if (obj instanceof Collection) {
            StringBuilder sb4 = new StringBuilder("[");
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                sb4.append(valueString(it.next()));
                sb4.append(", ");
            }
            if (sb4.reverse().charAt(0) == ' ') {
                sb4.delete(0, 2);
            }
            StringBuilder sbReverse2 = sb4.reverse();
            sbReverse2.append("]");
            return sbReverse2.toString();
        }
        if (obj instanceof Map) {
            StringBuilder sb5 = new StringBuilder("{");
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                sb5.append(valueString(entry.getKey()));
                sb5.append("=");
                sb5.append(valueString(entry.getValue()));
                sb5.append(", ");
            }
            if (sb5.reverse().charAt(0) == ' ') {
                sb5.delete(0, 2);
            }
            StringBuilder sbReverse3 = sb5.reverse();
            sbReverse3.append("}");
            return sbReverse3.toString();
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry2 = (Map.Entry) obj;
            return valueString(entry2.getKey()) + "=" + valueString(entry2.getValue());
        }
        if (obj instanceof String) {
            StringBuilder sbInsert = sb2.insert(0, "\"");
            sbInsert.append("\"");
            return sbInsert.toString();
        }
        if (Primitive.unwrap(obj) instanceof Character) {
            StringBuilder sbInsert2 = sb2.insert(0, "'");
            sbInsert2.append("'");
            return sbInsert2.toString();
        }
        if (Primitive.unwrap(obj) instanceof Number) {
            if (Primitive.unwrap(obj) instanceof Byte) {
                sb2.append("o");
                return sb2.toString();
            }
            if (Primitive.unwrap(obj) instanceof Short) {
                sb2.append("s");
                return sb2.toString();
            }
            if (Primitive.unwrap(obj) instanceof Integer) {
                sb2.append("I");
                return sb2.toString();
            }
            if (Primitive.unwrap(obj) instanceof Long) {
                sb2.append("L");
                return sb2.toString();
            }
            if (Primitive.unwrap(obj) instanceof BigInteger) {
                sb2.append("W");
                return sb2.toString();
            }
            if (Primitive.unwrap(obj) instanceof Float) {
                sb2.append("f");
                return sb2.toString();
            }
            if (Primitive.unwrap(obj) instanceof Double) {
                sb2.append("d");
                return sb2.toString();
            }
            if (Primitive.unwrap(obj) instanceof BigDecimal) {
                sb2.append("w");
                return sb2.toString();
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String variableString(Variable variable) {
        return variable.getModifiers().toString().substring(11) + " " + getTypeName(variable.getType()) + " " + variable.getName() + ";";
    }

    private static String[] getTypeNames(Class<?>[] clsArr) {
        return (String[]) getTypeNamesStream(clsArr).toArray(new C0348e(13));
    }

    public static String variableString(Field field) {
        return Modifier.toString(field.getModifiers()) + " " + getTypeName(field.getType()) + " " + field.getName() + ";";
    }

    public static String methodString(String str, String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('(');
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (i9 != 0) {
                sb2.append(", ");
            }
            sb2.append(strArr[i9]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static String methodString(String str, Class<?>[] clsArr) {
        return methodString(str, getTypeNames(clsArr));
    }

    public static String methodString(String str, Class<?>[] clsArr, String[] strArr) {
        return methodString(str, getTypeNames(clsArr, strArr));
    }

    public static String methodString(Method method) {
        String string = Modifier.toString(method.getModifiers());
        StringBuilder sbM1025n = AbstractC0255e.m1025n(string, " ");
        sbM1025n.append(getTypeName(method.getReturnType()));
        sbM1025n.append(" ");
        sbM1025n.append(methodString(method.getName(), method.getParameterTypes()));
        sbM1025n.append(string.contains("abstract") ? ";" : " {}");
        return sbM1025n.toString();
    }

    public static String methodString(String str, Object[] objArr) {
        return methodString(str, Types.getTypes(objArr));
    }

    public static String typeString(Object obj) {
        if (obj != null && Primitive.NULL != obj) {
            if (obj instanceof Primitive) {
                return ((Primitive) obj).getType().getSimpleName();
            }
            return typeString(Types.getType(obj));
        }
        return "null";
    }
}
