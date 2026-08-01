package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.n4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1225n4 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m4963b(Iterator it, String str) {
        return str + " " + ((String) it.next());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String[] m4964c(int i10) {
        return new String[i10];
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String[] m4965d(int i10) {
        return new String[i10];
    }

    /* JADX INFO: renamed from: e */
    public static String m4966e(Class cls) {
        if (AbstractC1143c4.m4174i0(cls)) {
            return m4967f(cls);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Modifier.toString(cls.getModifiers()));
        sb2.append(cls.isInterface() ? _UrlKt.FRAGMENT_ENCODE_SET : " class");
        sb2.append(" ");
        sb2.append(m4970i(cls));
        sb2.append(m4968g(cls));
        sb2.append(m4969h(cls));
        sb2.append(" {");
        return sb2.toString().trim();
    }

    /* JADX INFO: renamed from: f */
    public static String m4967f(Class cls) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC1143c4.m4197u(cls).toString().substring(11));
        sb2.append(cls.isInterface() ? " interface" : " class");
        sb2.append(" ");
        sb2.append(m4970i(cls));
        sb2.append(m4968g(cls));
        sb2.append(m4969h(cls));
        sb2.append(" {");
        return sb2.toString().trim();
    }

    /* JADX INFO: renamed from: g */
    public static String m4968g(Class cls) {
        if (cls.isInterface()) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return " extends " + m4970i(cls.getSuperclass());
    }

    /* JADX INFO: renamed from: h */
    public static String m4969h(Class cls) {
        StringBuilder sb2 = new StringBuilder();
        if (cls.getInterfaces().length > 0) {
            sb2.append(cls.isInterface() ? " extends " : " implements ");
            sb2.append(String.join(", ", m4973l(cls.getInterfaces())));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m4970i(Class cls) {
        return cls == null ? "Object" : cls.getSimpleName();
    }

    /* JADX INFO: renamed from: j */
    public static String[] m4971j(Class[] clsArr) {
        return (String[]) m4974m(clsArr).toArray(new IntFunction() { // from class: bsh.l4
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return AbstractC1225n4.m4965d(i10);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static String[] m4972k(Class[] clsArr, String[] strArr) {
        final Iterator it = Stream.of((Object[]) strArr).iterator();
        return (String[]) m4974m(clsArr).map(new Function() { // from class: bsh.j4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC1225n4.m4963b(it, (String) obj);
            }
        }).toArray(new IntFunction() { // from class: bsh.k4
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return AbstractC1225n4.m4964c(i10);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static List m4973l(Class[] clsArr) {
        return (List) m4974m(clsArr).collect(Collectors.toList());
    }

    /* JADX INFO: renamed from: m */
    public static Stream m4974m(Class[] clsArr) {
        return Stream.of((Object[]) clsArr).map(new Function() { // from class: bsh.m4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC1225n4.m4970i((Class) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static String m4975n(C1168e1 c1168e1) {
        String strSubstring = c1168e1.m4285g().toString().substring(11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(" ");
        sb2.append(m4970i(c1168e1.mo4124l()));
        sb2.append(" ");
        sb2.append(m4977p(c1168e1.getName(), c1168e1.mo4123k(), c1168e1.m4288j()));
        sb2.append(strSubstring.contains("abstract") ? ";" : " {}");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m4976o(String str, Class[] clsArr) {
        return m4979r(str, m4971j(clsArr));
    }

    /* JADX INFO: renamed from: p */
    public static String m4977p(String str, Class[] clsArr, String[] strArr) {
        return m4979r(str, m4972k(clsArr, strArr));
    }

    /* JADX INFO: renamed from: q */
    public static String m4978q(String str, Object[] objArr) {
        return m4976o(str, AbstractC1273v4.m5143m(objArr));
    }

    /* JADX INFO: renamed from: r */
    public static String m4979r(String str, String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('(');
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(strArr[i10]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: s */
    public static String m4980s(Method method) {
        String string = Modifier.toString(method.getModifiers());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" ");
        sb2.append(m4970i(method.getReturnType()));
        sb2.append(" ");
        sb2.append(m4976o(method.getName(), method.getParameterTypes()));
        sb2.append(string.contains("abstract") ? ";" : " {}");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[PHI: r0
  0x0008: PHI (r0v9 java.lang.Class) = (r0v0 java.lang.Class), (r0v2 java.lang.Class), (r0v3 java.lang.Class), (r0v4 java.lang.Class), (r0v1 java.lang.Class) binds: [B:3:0x0006, B:11:0x0022, B:14:0x002b, B:17:0x0034, B:8:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m4981t(java.lang.Class r2) {
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
            java.lang.String r2 = m4981t(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: bsh.AbstractC1225n4.m4981t(java.lang.Class):java.lang.String");
    }

    /* JADX INFO: renamed from: u */
    public static String m4982u(Object obj) {
        return (obj == null || Primitive.NULL == obj) ? "null" : obj instanceof Primitive ? ((Primitive) obj).getType().getSimpleName() : m4981t(AbstractC1273v4.m5141k(obj));
    }

    /* JADX INFO: renamed from: v */
    public static String m4983v(Object obj) {
        return m4984w(obj) + " :" + m4982u(obj);
    }

    /* JADX INFO: renamed from: w */
    public static String m4984w(Object obj) {
        StringBuilder sb2 = new StringBuilder(_UrlKt.FRAGMENT_ENCODE_SET + obj);
        if (obj != null && obj.getClass().isArray()) {
            StringBuilder sb3 = new StringBuilder("{");
            for (int i10 = 0; i10 < Array.getLength(obj); i10++) {
                sb3.append(m4984w(Array.get(obj, i10)));
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
                sb4.append(m4984w(it.next()));
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
                sb5.append(m4984w(entry.getKey()));
                sb5.append("=");
                sb5.append(m4984w(entry.getValue()));
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
            return m4984w(entry2.getKey()) + "=" + m4984w(entry2.getValue());
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

    /* JADX INFO: renamed from: x */
    public static String m4985x(C1291y4 c1291y4) {
        return c1291y4.m5222c().toString().substring(11) + " " + m4970i(c1291y4.m5223d()) + " " + c1291y4.getName() + ";";
    }

    /* JADX INFO: renamed from: y */
    public static String m4986y(Field field) {
        return Modifier.toString(field.getModifiers()) + " " + m4970i(field.getType()) + " " + field.getName() + ";";
    }
}
