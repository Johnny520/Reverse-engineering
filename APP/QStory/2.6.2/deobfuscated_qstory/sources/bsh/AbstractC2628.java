package bsh;

import androidx.activity.AbstractC0053;
import com.android.dx.io.Opcodes;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import p007.AbstractC6136;

/* JADX INFO: renamed from: bsh.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2628 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int[] f7888 = {48, 58, 65, 91, 97, 123, 129, 256, 384, 592, 688, Opcodes.FILL_ARRAY_DATA_PAYLOAD, 880, 1024, 1329, 1425, 1536, 1792, 1872, 1920, 1984, 2048, 2112, 2144, 2208, 2304, 2432, 2561, 2689, 2817, 2946, 3072, 3200, 3328, 3458, 3584, 3712, 3840, 4096, 2256, 4352, 4608, 5024, 5120, 5760, 5792, 5888, 5920, 5952, 5984, 6016, 6144, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6832, 6912, 7040, 7104, 7168, 7248, 7296, 7360, 7376, 7424, 7616, 7680, 7936, 8192, 8304, 8352, 8400, 8448, 8528, 8592, 8704, 8960, 9216, 9280, 9312, 9472, 9600, 9632, 9728, 9984, 10176, 10224, 10240, 10496, 10624, 10752, 11008, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12032, 12272, 12288, 12352, 12448, 12544, 12592, 12688, 12704, 12736, 12784, 12800, 13056, 13312, 19904, 19968, 40960, 42128, 42192, 42240, 42560, 42656, 42752, 42784, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43488, 43520, 43616, 43648, 43744, 43776, 43824, 43888, 43968, 44032, 55216, 55296, 56320, 57344, 63744, 64256, 64336, 65024, 65040, 65056, 65072, 65104, 65136, 65280, 65520, 65536, 65664, 65792, 65856, 65936, 66000, 66176, 66208, 66272, 66304, 66352, 66384, 66432, 66464, 66560, 66640, 66688, 66736, 66816, 66864, 67072, 67584, 67648, 67680, 67712, 67808, 67840, 67872, 67968, 68000, 68096, 68192, 68224, 68288, 68352, 68416, 68448, 68480, 68608, 68736, 69216, 69632, 69760, 69840, 69888, 69968, 70016, 70112, 70144, 70272, 70320, 70400, 70656, 70784, 71040, 71168, 71264, 71296, 71424, 71840, 72192, 72272, 72384, 72704, 72816, 72960, 73728, 74752, 74880, 77824, 82944, 92160, 92736, 92880, 92928, 93952, 94176, 94208, 100352, 110592, 110848, 110960, 113664, 113824, 118784, 119040, 119296, 119552, 119648, 119808, 120832, 122880, 124928, 125184, 126464, 126976, 127024, 127136, 127232, 127488, 127744, 128512, 128592, 128640, 128768, 128896, 129024, 129280, 131072, 173824, 177984, 178208, 183984, 194560, 917504, 917760, 983040, 1048576};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m5274(Class cls) {
        StringBuilder sb = new StringBuilder();
        if (cls.getInterfaces().length > 0) {
            sb.append(cls.isInterface() ? " extends " : " implements ");
            sb.append(String.join(", ", (List) Stream.of((Object[]) cls.getInterfaces()).map(new C2640(15)).collect(Collectors.toList())));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m5275(int i, Object obj) throws UtilTargetError {
        Interpreter.debug("getIndex: ", obj, ", index=", Integer.valueOf(i));
        try {
            return obj instanceof List ? ((List) obj).get(i) : Primitive.wrap(Array.get(obj, i), (Class<?>) AbstractC2661.m5331(obj.getClass()));
        } catch (IndexOutOfBoundsException e) {
            throw new UtilTargetError(AbstractC6136.m11559(i, obj instanceof List ? ((List) obj).size() : Array.getLength(obj), "Index ", " out-of-bounds for length "), e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Iterator m5276(Object obj) {
        Stream streamConcat;
        if (obj == null) {
            return new C2630();
        }
        if (obj instanceof Primitive) {
            return m5276(Primitive.unwrap(obj));
        }
        if (obj.getClass().isArray()) {
            return new C2629(obj);
        }
        if (obj instanceof Iterable) {
            return ((Iterable) obj).iterator();
        }
        if (obj instanceof Iterator) {
            return (Iterator) obj;
        }
        if (obj instanceof Enumeration) {
            return Collections.list((Enumeration) obj).iterator();
        }
        if (obj instanceof CharSequence) {
            return new C2629(((CharSequence) obj).toString().toCharArray());
        }
        int i = 0;
        if (obj instanceof Number) {
            final int iIntValue = ((Number) obj).intValue();
            return iIntValue == 0 ? new C2630() : iIntValue > 0 ? IntStream.rangeClosed(0, iIntValue).iterator() : IntStream.rangeClosed(iIntValue, 0).map(new IntUnaryOperator() { // from class: bsh.飘花落叶言子楪兰哲苏世
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i2) {
                    return iIntValue - i2;
                }
            }).iterator();
        }
        if (obj instanceof Character) {
            char cCharValue = ((Character) obj).charValue();
            int i2 = 33;
            int i3 = 0;
            while (i < 281) {
                int i4 = f7888[i];
                if (i2 > cCharValue) {
                    break;
                }
                i++;
                i3 = i2;
                i2 = i4;
            }
            return IntStream.rangeClosed(i3, cCharValue).boxed().map(new C2640(9)).map(new C2640(10)).iterator();
        }
        if (obj instanceof String) {
            return new C2629(((String) obj).toCharArray());
        }
        Class<?> cls = obj.getClass();
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        if (obj instanceof C2645) {
            cls = ((C2645) obj).f7917;
        }
        int i5 = 5;
        if (AbstractC2666.m5387(cls)) {
            streamConcat = Stream.concat(Stream.concat(Stream.of(m5279(cls)), Stream.concat(Stream.of((Object[]) (!AbstractC2666.m5387(cls) ? new Variable[0] : cls.isInterface() ? AbstractC2666.m5403(AbstractC2666.m5400(cls)) : AbstractC2666.m5403(AbstractC2666.m5399(AbstractC2666.m5409(cls))))).map(new C2640(4)).map(new C2640(i5)), Stream.of((Object[]) AbstractC2666.m5415(cls)).map(new C2640(6)).map(new C2640(i5)))), Stream.of("}"));
        } else {
            streamConcat = Stream.concat(Stream.concat(Stream.of(m5279(cls)), Stream.concat(Stream.of((Object[]) cls.getFields()).map(new C2640(7)).map(new C2640(i5)), Stream.of((Object[]) cls.getMethods()).map(new C2640(8)).map(new C2640(i5)))), Stream.of("}"));
        }
        return streamConcat.iterator();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int[] m5277(Object obj) {
        int iM5332 = AbstractC2661.m5332(obj.getClass());
        int[] iArr = new int[iM5332];
        if (iM5332 != 0) {
            int length = Array.getLength(obj);
            iArr[0] = length;
            if (length != 0) {
                for (int i = 1; i < iM5332; i++) {
                    obj = Array.get(obj, 0);
                    if (obj == null) {
                        break;
                    }
                    iArr[i] = Array.getLength(obj);
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5278(Class cls, Object obj, Object... objArr) {
        int i;
        int i2;
        int length = Array.getLength(objArr[0]);
        int length2 = objArr.length > 1 ? Array.getLength(obj) : length;
        if (AbstractC2661.m5332(obj.getClass()) != 1) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length2) {
                if (length < length2 && i4 == length && (i = i5 + 1) < objArr.length) {
                    length = Array.getLength(objArr[i]);
                    i4 = 0;
                    i5 = i;
                }
                int i6 = i4 + 1;
                Object obj2 = Array.get(objArr[i5], i4);
                if (obj2 == null) {
                    Array.set(obj, i3, null);
                } else {
                    Object objNewInstance = Array.get(obj, i3);
                    if (Array.getLength(obj2) != Array.getLength(objNewInstance)) {
                        objNewInstance = Array.newInstance((Class<?>) cls, m5277(obj2));
                        Array.set(obj, i3, objNewInstance);
                    }
                    m5278(cls, objNewInstance, obj2);
                }
                i3++;
                i4 = i6;
            }
            return;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length2; i9++) {
            int i10 = i8 + 1;
            Object objUnwrap = Array.get(objArr[i7], i8);
            try {
                objUnwrap = Primitive.unwrap(AbstractC2661.m5328(objUnwrap, cls, 0));
            } catch (UtilEvalError unused) {
            }
            if (Byte.TYPE == cls) {
                Array.setByte(obj, i9, ((Byte) objUnwrap).byteValue());
            } else if (Short.TYPE == cls) {
                Array.setShort(obj, i9, ((Short) objUnwrap).shortValue());
            } else if (Integer.TYPE == cls) {
                Array.setInt(obj, i9, ((Integer) objUnwrap).intValue());
            } else if (Long.TYPE == cls) {
                Array.setLong(obj, i9, ((Long) objUnwrap).longValue());
            } else if (Float.TYPE == cls) {
                Array.setFloat(obj, i9, ((Float) objUnwrap).floatValue());
            } else if (Double.TYPE == cls) {
                Array.setDouble(obj, i9, ((Double) objUnwrap).doubleValue());
            } else if (Character.TYPE == cls) {
                Array.setChar(obj, i9, ((Character) objUnwrap).charValue());
            } else if (Boolean.TYPE == cls) {
                Array.setBoolean(obj, i9, ((Boolean) objUnwrap).booleanValue());
            } else {
                Array.set(obj, i9, objUnwrap);
            }
            if (length >= length2 || i10 != length || (i2 = i7 + 1) >= objArr.length) {
                i8 = i10;
            } else {
                length = Array.getLength(objArr[i2]);
                i7 = i2;
                i8 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m5279(Class cls) {
        if (AbstractC2666.m5387(cls)) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC2666.m5412(cls).toString().substring(11));
            sb.append(cls.isInterface() ? " interface" : " class");
            sb.append(" ");
            sb.append(cls.getSimpleName());
            sb.append(cls.isInterface() ? "" : " extends ".concat(m5286(cls.getSuperclass())));
            sb.append(m5274(cls));
            sb.append(" {");
            return sb.toString().trim();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Modifier.toString(cls.getModifiers()));
        sb2.append(cls.isInterface() ? "" : " class");
        sb2.append(" ");
        sb2.append(cls.getSimpleName());
        sb2.append(cls.isInterface() ? "" : " extends ".concat(m5286(cls.getSuperclass())));
        sb2.append(m5274(cls));
        sb2.append(" {");
        return sb2.toString().trim();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[PHI: r0
  0x0008: PHI (r0v9 java.lang.Class) = (r0v0 java.lang.Class), (r0v2 java.lang.Class), (r0v3 java.lang.Class), (r0v4 java.lang.Class), (r0v1 java.lang.Class) binds: [B:3:0x0006, B:11:0x0022, B:14:0x002b, B:17:0x0034, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m5280(java.lang.Class r2) {
        /*
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto La
        L8:
            r2 = r0
            goto L37
        La:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto L1c
            java.lang.Class<java.util.Queue> r1 = java.util.Queue.class
            boolean r2 = r1.isAssignableFrom(r2)
            if (r2 == 0) goto L8
            r2 = r1
            goto L37
        L1c:
            java.lang.Class<java.util.Deque> r0 = java.util.Deque.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto L25
            goto L8
        L25:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto L2e
            goto L8
        L2e:
            java.lang.Class<java.util.Map$Entry> r0 = java.util.Map.Entry.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto L37
            goto L8
        L37:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r2 = r2.getComponentType()
            java.lang.String r2 = m5280(r2)
            r0.append(r2)
            java.lang.String r2 = "[]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L57:
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "java"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L68
            java.lang.String r2 = r2.getSimpleName()
            return r2
        L68:
            java.lang.String r2 = r2.getName()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.AbstractC2628.m5280(java.lang.Class):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m5281(Object obj, int i, Object obj2) throws UtilTargetError {
        try {
            Object objUnwrap = Primitive.unwrap(obj2);
            if (obj instanceof List) {
                ((List) obj).set(i, objUnwrap);
            } else {
                Array.set(obj, i, objUnwrap);
            }
        } catch (IllegalArgumentException e) {
            throw new UtilTargetError(new ArrayStoreException(e.getMessage()));
        } catch (IndexOutOfBoundsException e2) {
            throw new UtilTargetError(AbstractC6136.m11559(i, obj instanceof List ? ((List) obj).size() : Array.getLength(obj), "Index ", " out-of-bounds for length "), e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String m5282(Variable variable) {
        return variable.getModifiers().toString().substring(11) + " " + m5286(variable.getType()) + " " + variable.getName() + ";";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m5283(Object obj) {
        return (obj == null || Primitive.NULL == obj) ? "null" : obj instanceof Primitive ? ((Primitive) obj).getType().getSimpleName() : m5280(AbstractC2661.m5350(obj, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String m5284(Object obj) {
        StringBuilder sb = new StringBuilder(AbstractC0053.m153(obj, ""));
        if (obj != null && obj.getClass().isArray()) {
            StringBuilder sb2 = new StringBuilder("{");
            for (int i = 0; i < Array.getLength(obj); i++) {
                sb2.append(m5284(Array.get(obj, i)));
                sb2.append(", ");
            }
            if (sb2.reverse().charAt(0) == ' ') {
                sb2.delete(0, 2);
            }
            StringBuilder sbReverse = sb2.reverse();
            sbReverse.append("}");
            return sbReverse.toString();
        }
        if (obj instanceof Collection) {
            StringBuilder sb3 = new StringBuilder("[");
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                sb3.append(m5284(it.next()));
                sb3.append(", ");
            }
            if (sb3.reverse().charAt(0) == ' ') {
                sb3.delete(0, 2);
            }
            StringBuilder sbReverse2 = sb3.reverse();
            sbReverse2.append("]");
            return sbReverse2.toString();
        }
        if (obj instanceof Map) {
            StringBuilder sb4 = new StringBuilder("{");
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                sb4.append(m5284(entry.getKey()));
                sb4.append("=");
                sb4.append(m5284(entry.getValue()));
                sb4.append(", ");
            }
            if (sb4.reverse().charAt(0) == ' ') {
                sb4.delete(0, 2);
            }
            StringBuilder sbReverse3 = sb4.reverse();
            sbReverse3.append("}");
            return sbReverse3.toString();
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry2 = (Map.Entry) obj;
            return m5284(entry2.getKey()) + "=" + m5284(entry2.getValue());
        }
        if (obj instanceof String) {
            StringBuilder sbInsert = sb.insert(0, "\"");
            sbInsert.append("\"");
            return sbInsert.toString();
        }
        if (Primitive.unwrap(obj) instanceof Character) {
            StringBuilder sbInsert2 = sb.insert(0, "'");
            sbInsert2.append("'");
            return sbInsert2.toString();
        }
        if (Primitive.unwrap(obj) instanceof Number) {
            if (Primitive.unwrap(obj) instanceof Byte) {
                sb.append("o");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Short) {
                sb.append("s");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Integer) {
                sb.append("I");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Long) {
                sb.append("L");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof BigInteger) {
                sb.append("W");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Float) {
                sb.append("f");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof Double) {
                sb.append("d");
                return sb.toString();
            }
            if (Primitive.unwrap(obj) instanceof BigDecimal) {
                sb.append("w");
                return sb.toString();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String m5285(BshMethod bshMethod) {
        String strSubstring = bshMethod.getModifiers().toString().substring(11);
        StringBuilder sbM11553 = AbstractC6136.m11553(strSubstring, " ");
        sbM11553.append(m5286(bshMethod.getReturnType()));
        sbM11553.append(" ");
        sbM11553.append(m5290(bshMethod.getName(), (String[]) Stream.of((Object[]) bshMethod.getParameterTypes()).map(new C2640(15)).map(new C2668(Stream.of((Object[]) bshMethod.getParameterNames()).iterator(), 1)).toArray(new C2649(12))));
        sbM11553.append(strSubstring.contains("abstract") ? ";" : " {}");
        return sbM11553.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m5286(Class cls) {
        return cls == null ? "Object" : cls.getSimpleName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m5287(int i, Object obj) {
        Class clsM5331 = AbstractC2661.m5331(obj.getClass());
        if (i < 1) {
            return Array.newInstance((Class<?>) clsM5331, 0);
        }
        int[] iArrM5277 = m5277(obj);
        int i2 = iArrM5277[0];
        int i3 = i * i2;
        iArrM5277[0] = i3;
        Object objNewInstance = Array.newInstance((Class<?>) clsM5331, iArrM5277);
        for (int i4 = 0; i4 < i3; i4 += i2) {
            System.arraycopy(obj, 0, objNewInstance, i4, i2);
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static AbstractList m5288(int i, List list) {
        if (i < 1) {
            return list instanceof Queue ? new LinkedList() : new ArrayList(0);
        }
        AbstractList linkedList = list instanceof Queue ? new LinkedList(list) : new ArrayList(list);
        if (i != 1) {
            while (true) {
                int i2 = i - 1;
                if (i <= 1) {
                    break;
                }
                linkedList.addAll(list);
                i = i2;
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m5289(String str, Class[] clsArr) {
        return m5290(str, (String[]) Stream.of((Object[]) clsArr).map(new C2640(15)).toArray(new C2649(13)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static String m5290(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(strArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }
}
