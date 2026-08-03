package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: Lr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0507Lr {

    /* JADX INFO: renamed from: a */
    public static final char[] f1661a = null;

    static {
        char[] r0 = new char[80];
        f1661a = r0;
        Arrays.fill(r0, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m989a(int r3, StringBuilder r4) {
    L2:
        if (r3 <= 0) goto L8;
        int r0 = 80;
        if (r3 > 80) goto L7;
        r0 = r3;
    L7:
        r4.append(f1661a, 0, r0);
        r3 = r3 - r0;
        goto L2
    }

    /* JADX INFO: renamed from: b */
    public static void m990b(StringBuilder r4, int r5, String r6, Object r7) {
        if ((r7 instanceof List) == false) goto L9;
        Iterator r72 = ((List) r7).iterator();
    L6:
        if (r72.hasNext() == false) goto L14;
        m990b(r4, r5, r6, r72.next());
        goto L6
    L14:
        return;
    L9:
        if ((r7 instanceof Map) == false) goto L15;
        Iterator r73 = ((Map) r7).entrySet().iterator();
    L12:
        if (r73.hasNext() == false) goto L49;
        m990b(r4, r5, r6, (Map.Entry) r73.next());
        goto L12
    L49:
        return;
    L15:
        r4.append('\n');
        m989a(r5, r4);
        if (r6.isEmpty() == true) goto L26;
        StringBuilder r0 = new StringBuilder();
        r0.append(Character.toLowerCase(r6.charAt(0)));
        int r1 = 1;
    L20:
        if (r1 >= r6.length()) goto L25;
        char r2 = r6.charAt(r1);
        if (Character.isUpperCase(r2) == false) goto L24;
        r0.append("_");
    L24:
        r0.append(Character.toLowerCase(r2));
        r1 = r1 + 1;
        goto L20
    L25:
        r6 = r0.toString();
    L26:
        r4.append(r6);
        if ((r7 instanceof String) == false) goto L31;
        r4.append(": \"");
        C2701x6 r52 = AbstractC2744y6.f9369b;
        r4.append(AbstractC0828TB.m1641h(new C2701x6(((String) r7).getBytes(AbstractC0501Ll.f1637a))));
        r4.append('\"');
        return;
    L31:
        if ((r7 instanceof AbstractC2744y6) == false) goto L35;
        r4.append(": \"");
        r4.append(AbstractC0828TB.m1641h((AbstractC2744y6) r7));
        r4.append('\"');
        return;
    L35:
        if ((r7 instanceof AbstractC2634vj) == false) goto L39;
        r4.append(" {");
        m991c((AbstractC2634vj) r7, r4, r5 + 2);
        r4.append("\n");
        m989a(r5, r4);
        r4.append("}");
        return;
    L39:
        if ((r7 instanceof Map.Entry) == false) goto L42;
        r4.append(" {");
        Map.Entry r74 = (Map.Entry) r7;
        int r62 = r5 + 2;
        m990b(r4, r62, "key", r74.getKey());
        m990b(r4, r62, "value", r74.getValue());
        r4.append("\n");
        m989a(r5, r4);
        r4.append("}");
        return;
    L42:
        r4.append(": ");
        r4.append(r7);
    }

    /* JADX INFO: renamed from: c */
    public static void m991c(AbstractC2634vj r21, StringBuilder r22, int r23) {
        HashSet r3 = new HashSet();
        HashMap r4 = new HashMap();
        TreeMap r5 = new TreeMap();
        Method[] r6 = r21.getClass().getDeclaredMethods();
        int r7 = r6.length;
        int r8 = 0;
        int r9 = 0;
    L3:
        int r13 = 3;
        if (r9 >= r7) goto L27;
        Method r14 = r6[r9];
        if (Modifier.isStatic(r14.getModifiers()) == true) goto L26;
        if (r14.getName().length() < 3) goto L26;
        if (r14.getName().startsWith("set") == false) goto L15;
        r3.add(r14.getName());
        goto L26
    L15:
        if (Modifier.isPublic(r14.getModifiers()) == false) goto L26;
        if (r14.getParameterTypes().length != 0) goto L26;
        if (r14.getName().startsWith("has") == false) goto L24;
        r4.put(r14.getName(), r14);
        goto L26
    L24:
        if (r14.getName().startsWith("get") == false) goto L26;
        r5.put(r14.getName(), r14);
    L26:
        r9 = r9 + 1;
        goto L3
    L27:
        Iterator r62 = r5.entrySet().iterator();
    L29:
        if (r62.hasNext() == false) goto L109;
        Map.Entry r72 = (Map.Entry) r62.next();
        String r92 = ((String) r72.getKey()).substring(r13);
        if (r92.endsWith("List") == true) goto L33;
    L42:
        int r16 = r13;
    L44:
        if (r92.endsWith("Map") == false) goto L57;
        if (r92.equals("Map") == true) goto L57;
        Method r132 = (Method) r72.getValue();
        if (r132 == null) goto L57;
        if (r132.getReturnType().equals(Map.class) == false) goto L57;
        if (r132.isAnnotationPresent(Deprecated.class) == true) goto L57;
        if (Modifier.isPublic(r132.getModifiers()) == false) goto L57;
        m990b(r22, r23, r92.substring(0, r92.length() - 3), AbstractC2634vj.m5147l(r132, r21, new Object[0]));
    L41:
        r13 = r16;
    L57:
        if (r3.contains("set".concat(r92)) == false) goto L41;
        if (r92.endsWith("Bytes") == true) goto L62;
    L64:
        Method r73 = (Method) r72.getValue();
        Method r133 = (Method) r4.get("has".concat(r92));
        if (r73 == null) goto L41;
        Object r74 = AbstractC2634vj.m5147l(r73, r21, new Object[0]);
        if (r133 != null) goto L106;
        boolean r142 = true;
        if ((r74 instanceof Boolean) == false) goto L72;
        boolean r134 = !((Boolean) r74).booleanValue();
    L103:
        if (r134 == false) goto L107;
        r142 = false;
    L107:
        if (r142 == false) goto L41;
        m990b(r22, r23, r92, r74);
        goto L41
    L72:
        if ((r74 instanceof Integer) == false) goto L78;
        if (((Integer) r74).intValue() != 0) goto L76;
    L75:
        r134 = true;
    L76:
        r134 = false;
        goto L103
    L78:
        if ((r74 instanceof Float) == false) goto L83;
        if (Float.floatToRawIntBits(((Float) r74).floatValue()) != 0) goto L76;
    L83:
        if ((r74 instanceof Double) == false) goto L88;
        if (Double.doubleToRawLongBits(((Double) r74).doubleValue()) != 0) goto L76;
    L88:
        if ((r74 instanceof String) == false) goto L91;
        r134 = r74.equals("");
        goto L103
    L91:
        if ((r74 instanceof AbstractC2744y6) == false) goto L94;
        r134 = r74.equals(AbstractC2744y6.f9369b);
        goto L103
    L94:
        if ((r74 instanceof AbstractC0043B) == false) goto L99;
        if (r74 != ((AbstractC0043B) r74).mo1a()) goto L76;
    L99:
        if ((r74 instanceof Enum) == false) goto L76;
        if (((Enum) r74).ordinal() != 0) goto L76;
    L106:
        r142 = ((Boolean) AbstractC2634vj.m5147l(r133, r21, new Object[0])).booleanValue();
        goto L107
    L62:
        if (r5.containsKey("get" + r92.substring(0, r92.length() - 5)) == false) goto L64;
    L33:
        if (r92.endsWith("OrBuilderList") == true) goto L42;
        if (r92.equals("List") == true) goto L42;
        Method r143 = (Method) r72.getValue();
        if (r143 == null) goto L42;
        r16 = r13;
        if (r143.getReturnType().equals(List.class) == false) goto L44;
        m990b(r22, r23, r92.substring(0, r92.length() - 4), AbstractC2634vj.m5147l(r143, r21, new Object[0]));
        goto L41
    L109:
        C1001XC r0 = r21.unknownFields;
        if (r0 != null) goto L112;
        return;
    L112:
        if (r8 >= r0.f3196a) goto L133;
        m990b(r22, r23, String.valueOf(r0.f3197b[r8] >>> 3), r0.f3198c[r8]);
        r8 = r8 + 1;
        goto L112
    }
}
