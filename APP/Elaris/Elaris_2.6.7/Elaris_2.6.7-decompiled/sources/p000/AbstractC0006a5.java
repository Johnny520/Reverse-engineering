package p000;

import android.content.Context;
import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: a5 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0006a5 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f20a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final Set f21b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: c */
    public static final List f22c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: d */
    public static volatile boolean f23d;

    /* JADX INFO: renamed from: e */
    public static volatile long f24e;

    /* JADX INFO: renamed from: f */
    public static volatile long f25f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m31a(Object obj, Field field) throws IllegalAccessException {
        Class<?> type = field.getType();
        long jM33c = m33c(obj, field);
        if ((8192 & jM33c) != 0) {
            long j = (-8193) & jM33c;
            if (type == Integer.TYPE) {
                field.setInt(obj, (int) j);
            } else if (type == Integer.class) {
                field.set(obj, Integer.valueOf((int) j));
            } else if (type == Long.TYPE) {
                field.setLong(obj, j);
            } else if (type == Long.class) {
                field.set(obj, Long.valueOf(j));
            } else if (type == Short.TYPE) {
                field.setShort(obj, (short) j);
            } else if (type == Short.class) {
                field.set(obj, Short.valueOf((short) j));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - f25f < 1200) {
                return 1;
            }
            f25f = jCurrentTimeMillis;
            StringBuilder sb = new StringBuilder("flash pic subtype cleared: source=");
            String strReplace = "aio-constructor".replace('\r', ' ').replace('\n', ' ').replace('\t', ' ');
            if (strReplace.length() > 220) {
                strReplace = strReplace.substring(0, 220).concat("...");
            }
            sb.append(strReplace);
            sb.append(", old=");
            sb.append(jM33c);
            sb.append(", new=");
            sb.append(j);
            HookEntry.logAlways(sb.toString());
            return 1;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static synchronized void m32b() {
        List list = f22c;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((XC_MethodHook.Unhook) it.next()).unhook();
                    } catch (Throwable th) {
                        AbstractC0198e7.m343a("flash-pic", "unhook-constructor", th);
                    }
                }
                f22c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f20a.clear();
        f21b.clear();
        f23d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static long m33c(Object obj, Field field) throws IllegalAccessException {
        Class<?> type = field.getType();
        if (type == Integer.TYPE) {
            return field.getInt(obj);
        }
        if (type == Long.TYPE) {
            return field.getLong(obj);
        }
        if (type == Short.TYPE) {
            return field.getShort(obj);
        }
        Object obj2 = field.get(obj);
        if (obj2 instanceof Number) {
            return ((Number) obj2).longValue();
        }
        return Long.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Field m34d(Class cls) {
        Field[] declaredFields;
        if (cls == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = f20a;
        Field field = (Field) concurrentHashMap.get(cls);
        if (field != null) {
            return field;
        }
        Set set = f21b;
        if (set.contains(cls)) {
            return null;
        }
        for (Class superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                for (Field field2 : declaredFields) {
                    try {
                        if (Modifier.isStatic(field2.getModifiers())) {
                            continue;
                        } else {
                            String name = field2.getName();
                            String lowerCase = "";
                            if (name != null) {
                                lowerCase = name.replace("_", "").replace("-", "").toLowerCase(Locale.ROOT);
                            }
                            if ("submsgtype".equals(lowerCase)) {
                                Class<?> type = field2.getType();
                                if (type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
                                    field2.setAccessible(true);
                                    concurrentHashMap.put(cls, field2);
                                    return field2;
                                }
                            } else {
                                continue;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        set.add(cls);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        if ((r12 instanceof java.util.Collection) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
    
        r12 = ((java.util.Collection) r12).iterator();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r12.hasNext() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
    
        r3 = r12.next();
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a4, code lost:
    
        if (r1 <= 40) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        if (m35e(r3, r13 + 1, r14) == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b4, code lost:
    
        if ((r12 instanceof java.util.Map) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        r12 = ((java.util.Map) r12).values().iterator();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c5, code lost:
    
        if (r12.hasNext() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c7, code lost:
    
        r3 = r12.next();
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cc, code lost:
    
        if (r1 <= 40) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d6, code lost:
    
        if (m35e(r3, r13 + 1, r14) == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00da, code lost:
    
        r1 = r12.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e2, code lost:
    
        if (r1.isArray() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ec, code lost:
    
        if (r1.getComponentType().isPrimitive() != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ee, code lost:
    
        r1 = java.lang.reflect.Array.getLength(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f3, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010a, code lost:
    
        if (r1 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010c, code lost:
    
        if (r1 == java.lang.Object.class) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010e, code lost:
    
        r6 = r1.getDeclaredFields();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0113, code lost:
    
        r6 = null;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m35e(Object obj, int i, Set set) {
        Field[] declaredFields;
        int i2;
        int length;
        int i3;
        if (obj != null && i <= 4 && set.add(obj) && !(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Context) && !(obj instanceof View) && !(obj instanceof Class)) {
            Field fieldM34d = m34d(obj.getClass());
            if (fieldM34d != null) {
                try {
                    if ((m33c(obj, fieldM34d) & 8192) != 0) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
            Class<?> superclass = obj.getClass();
            loop0: while (true) {
                Field[] declaredFields2 = null;
                if (superclass == null || superclass == Object.class) {
                    break;
                }
                try {
                    declaredFields2 = superclass.getDeclaredFields();
                } catch (Throwable unused2) {
                }
                if (declaredFields2 != null) {
                    for (Field field : declaredFields2) {
                        try {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                String name = field.getName();
                                String lowerCase = name == null ? "" : name.toLowerCase(Locale.ROOT);
                                if (m38h(lowerCase)) {
                                    field.setAccessible(true);
                                    if (m37g(obj, lowerCase, field)) {
                                        break loop0;
                                    }
                                }
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                }
                superclass = superclass.getSuperclass();
            }
            return true;
        }
        return false;
        for (i3 = 0; i3 < length && i3 < 40; i3++) {
            if (m35e(Array.get(obj, i3), i + 1, set)) {
                return true;
            }
        }
        return false;
        if (declaredFields != null) {
            for (Field field2 : declaredFields) {
                try {
                    if (!Modifier.isStatic(field2.getModifiers()) && !field2.getType().isPrimitive()) {
                        String name2 = field2.getName();
                        String lowerCase2 = name2 == null ? "" : name2.toLowerCase(Locale.ROOT);
                        if (lowerCase2.contains("pic") || lowerCase2.contains("image") || lowerCase2.contains("element") || lowerCase2.contains("record") || lowerCase2.contains("msg")) {
                            field2.setAccessible(true);
                            if (m35e(field2.get(obj), i + 1, set)) {
                                return true;
                            }
                        }
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        Class<?> superclass2 = superclass2.getSuperclass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static synchronized void m36f(ClassLoader classLoader) {
        try {
            if (f23d || classLoader == null) {
                return;
            }
            int size = 0;
            try {
                Set<XC_MethodHook.Unhook> setHookAllConstructors = XposedBridge.hookAllConstructors(XposedHelpers.findClass("com.tencent.mobileqq.aio.msg.AIOMsgItem", classLoader), new C0561z4(39));
                if (setHookAllConstructors != null && !setHookAllConstructors.isEmpty()) {
                    f22c.addAll(setHookAllConstructors);
                    size = setHookAllConstructors.size();
                }
            } catch (Throwable unused) {
            }
            if (size > 0) {
                f23d = true;
                HookEntry.logAlways("flash pic constructor hook installed count=" + size);
            } else {
                HookEntry.log("flash pic hooks target not found");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m37g(Object obj, String str, Field field) throws IllegalAccessException {
        if (field.getType() == Boolean.TYPE) {
            return field.getBoolean(obj);
        }
        Object obj2 = field.get(obj);
        if (obj2 instanceof Boolean) {
            return ((Boolean) obj2).booleanValue();
        }
        if (obj2 instanceof Number) {
            return ((Number) obj2).longValue() != 0;
        }
        if (!(obj2 instanceof String)) {
            return false;
        }
        String strTrim = ((String) obj2).trim();
        if (strTrim.length() == 0) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        if (str.contains("md5") || str.contains("sha") || str.contains("hash") || str.contains("uuid") || str.contains("guid") || str.contains("id") || strTrim.indexOf(47) >= 0 || strTrim.indexOf(92) >= 0 || strTrim.startsWith("content://")) {
            return false;
        }
        String strM1083b = AbstractC0497v4.m1083b(strTrim);
        Locale locale = Locale.ROOT;
        String lowerCase = strM1083b.toLowerCase(locale);
        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".webp") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".heic") || lowerCase.endsWith(".heif") || strTrim.length() > 40) {
            return false;
        }
        String lowerCase2 = strTrim.toLowerCase(locale);
        return ("0".equals(lowerCase2) || "false".equals(lowerCase2) || "normal".equals(lowerCase2) || "none".equals(lowerCase2) || "no".equals(lowerCase2)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m38h(String str) {
        if (str == null || str.length() == 0 || str.contains("path") || str.contains("name") || str.contains("url") || str.contains("md5") || str.contains("sha") || str.contains("hash")) {
            return false;
        }
        return str.contains("flash") || str.contains("burn") || str.contains("ephemeral") || str.contains("selfdestruct") || str.contains("self_destruct") || str.contains("disappear") || str.contains("destroy") || str.contains("secret");
    }
}
