package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏哲楪子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f11467;

    static {
        char[] cArr = new char[80];
        f11467 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8168(GeneratedMessageLite generatedMessageLite, StringBuilder sb, int i) {
        int i2;
        boolean zBooleanValue;
        boolean zEquals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = generatedMessageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m8169(sb, i, AbstractC0900.m721(4, 0, strSubstring), GeneratedMessageLite.invokeOrDie(method2, generatedMessageLite, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m8169(sb, i, AbstractC0900.m721(3, 0, strSubstring), GeneratedMessageLite.invokeOrDie(method, generatedMessageLite, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method4, generatedMessageLite, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objInvokeOrDie instanceof Boolean) {
                            zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                        } else if (objInvokeOrDie instanceof Integer) {
                            zEquals = ((Integer) objInvokeOrDie).intValue() == 0;
                        } else if (objInvokeOrDie instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                            }
                        } else if (objInvokeOrDie instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                            }
                        } else if (objInvokeOrDie instanceof String) {
                            zEquals = objInvokeOrDie.equals("");
                        } else if (objInvokeOrDie instanceof ByteString) {
                            zEquals = objInvokeOrDie.equals(ByteString.EMPTY);
                        } else if (!(objInvokeOrDie instanceof InterfaceC4273) ? !(objInvokeOrDie instanceof java.lang.Enum) || ((java.lang.Enum) objInvokeOrDie).ordinal() != 0 : objInvokeOrDie != ((InterfaceC4273) objInvokeOrDie).getDefaultInstanceForType()) {
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method5, generatedMessageLite, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m8169(sb, i, strSubstring, objInvokeOrDie);
                    }
                }
            }
            i2 = 3;
        }
        if (generatedMessageLite instanceof GeneratedMessageLite.AbstractC4138) {
            Iterator itM8470 = ((GeneratedMessageLite.AbstractC4138) generatedMessageLite).extensions.m8470();
            while (itM8470.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itM8470.next();
                m8169(sb, i, AbstractC0900.m707(new StringBuilder("["), "]", ((C4434) entry2.getKey()).f11584), entry2.getValue());
            }
        }
        C4539 c4539 = generatedMessageLite.unknownFields;
        if (c4539 != null) {
            for (int i4 = 0; i4 < c4539.f11866; i4++) {
                m8169(sb, i, String.valueOf(c4539.f11865[i4] >>> 3), c4539.f11864[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8169(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m8169(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8169(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m8170(sb, i);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append(JavaConstant.Dynamic.DEFAULT_NAME);
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC4245.m8084((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(AbstractC4245.m8073(((ByteString) obj).toByteArray()));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            m8168((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            m8170(sb, i);
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
        m8169(sb, i3, "key", entry.getKey());
        m8169(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m8170(sb, i);
        sb.append("}");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8170(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f11467, 0, i2);
            i -= i2;
        }
    }
}
