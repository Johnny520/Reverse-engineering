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
    public static final char[] f1661a;

    static {
        char[] cArr = new char[80];
        f1661a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m989a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f1661a, 0, i2);
            i -= i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m990b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m990b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m990b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m989a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C2701x6 c2701x6 = AbstractC2744y6.f9369b;
            sb.append(AbstractC0828TB.m1641h(new C2701x6(((String) obj).getBytes(AbstractC0501Ll.f1637a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2744y6) {
            sb.append(": \"");
            sb.append(AbstractC0828TB.m1641h((AbstractC2744y6) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC2634vj) {
            sb.append(" {");
            m991c((AbstractC2634vj) obj, sb, i + 2);
            sb.append("\n");
            m989a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        m990b(sb, i3, "key", entry.getKey());
        m990b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m989a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m991c(AbstractC2634vj abstractC2634vj, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC2634vj.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    m990b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2634vj.m5147l(method2, abstractC2634vj, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m990b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2634vj.m5147l(method, abstractC2634vj, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) map.get("has".concat(strSubstring));
                        if (method4 != null) {
                            Object objM5147l = AbstractC2634vj.m5147l(method4, abstractC2634vj, new Object[0]);
                            if (method5 == null) {
                                zBooleanValue = true;
                                if (objM5147l instanceof Boolean) {
                                    zEquals = !((Boolean) objM5147l).booleanValue();
                                } else if (objM5147l instanceof Integer) {
                                    zEquals = ((Integer) objM5147l).intValue() == 0;
                                } else if (objM5147l instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM5147l).floatValue()) == 0) {
                                    }
                                } else if (objM5147l instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM5147l).doubleValue()) == 0) {
                                    }
                                } else if (objM5147l instanceof String) {
                                    zEquals = objM5147l.equals("");
                                } else if (objM5147l instanceof AbstractC2744y6) {
                                    zEquals = objM5147l.equals(AbstractC2744y6.f9369b);
                                } else if (!(objM5147l instanceof AbstractC0043B) ? !(objM5147l instanceof Enum) || ((Enum) objM5147l).ordinal() != 0 : objM5147l != ((AbstractC0043B) objM5147l).mo1a()) {
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC2634vj.m5147l(method5, abstractC2634vj, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                m990b(sb, i, strSubstring, objM5147l);
                            }
                        }
                    }
                }
            }
            i2 = i3;
        }
        C1001XC c1001xc = abstractC2634vj.unknownFields;
        if (c1001xc != null) {
            for (int i5 = 0; i5 < c1001xc.f3196a; i5++) {
                m990b(sb, i, String.valueOf(c1001xc.f3197b[i5] >>> 3), c1001xc.f3198c[i5]);
            }
        }
    }
}
