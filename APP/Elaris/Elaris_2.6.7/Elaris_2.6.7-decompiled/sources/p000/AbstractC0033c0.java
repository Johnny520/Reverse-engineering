package p000;

import android.content.Context;
import android.content.Intent;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: c0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0033c0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f71a = {"com.tencent.mobileqq.msg.api.impl.MessageFacadeImpl", "com.tencent.imcore.message.QQMessageFacade", "com.tencent.imcore.message.BaseQQMessageFacade"};

    /* JADX INFO: renamed from: b */
    public static final C0461t0 f72b = new C0461t0();

    /* JADX INFO: renamed from: c */
    public static final C0191e0 f73c = new C0191e0();

    /* JADX INFO: renamed from: d */
    public static final C0175d0 f74d = new C0175d0();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f75e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static volatile int f76f = 0;

    /* JADX INFO: renamed from: g */
    public static volatile String f77g = "";

    /* JADX INFO: renamed from: h */
    public static volatile String f78h = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(14:10|(3:92|11|(1:(3:94|13|99)(2:98|16)))|(1:18)(11:19|22|(1:24)(1:25)|26|88|27|(1:(3:90|29|101)(2:100|32))|(1:34)(3:35|38|(3:45|(6:48|(1:50)(2:51|(1:53)(4:54|(6:57|96|58|(1:(3:86|60|113)(2:112|63))|(5:65|68|69|(2:71|110)(1:111)|72)(4:66|69|(0)(0)|72)|55)|109|73))|74|(3:77|(2:108|106)(2:102|81)|75)|104|46)|103))|37|38|(5:40|42|45|(1:46)|103)(4:42|45|(1:46)|103))|21|22|(0)(0)|26|88|27|(1:(0)(0))|(0)(0)|37|38|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:27:0x0046, B:35:0x005d, B:31:0x0054, B:29:0x004c), top: B:88:0x0046, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m75a(ArrayList arrayList, Object obj) {
        Object obj2;
        int iIntValue;
        Object obj3;
        String strValueOf;
        Set setSingleton;
        Object obj4;
        Field declaredField;
        Class<?> superclass;
        Field declaredField2;
        Field declaredField3;
        if (obj != null && arrayList != null && !arrayList.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = f75e;
            if (!concurrentHashMap.isEmpty()) {
                try {
                    Class<?> superclass2 = obj.getClass();
                    while (true) {
                        if (superclass2 == null) {
                            declaredField3 = null;
                            break;
                        }
                        try {
                            declaredField3 = superclass2.getDeclaredField("chatType");
                            declaredField3.setAccessible(true);
                            break;
                        } catch (Throwable unused) {
                            superclass2 = superclass2.getSuperclass();
                        }
                    }
                } catch (Throwable unused2) {
                }
                if (declaredField3 != null) {
                    obj2 = declaredField3.get(obj);
                    iIntValue = !(obj2 instanceof Number) ? ((Number) obj2).intValue() : -1;
                    superclass = obj.getClass();
                    while (true) {
                        if (superclass != null) {
                            declaredField2 = null;
                            break;
                        }
                        try {
                            declaredField2 = superclass.getDeclaredField("peerUid");
                            declaredField2.setAccessible(true);
                            break;
                        } catch (Throwable unused3) {
                            superclass = superclass.getSuperclass();
                        }
                    }
                    if (declaredField2 == null) {
                        obj3 = declaredField2.get(obj);
                        strValueOf = String.valueOf(obj3);
                        if ((iIntValue == 1 || iIntValue == 2) && !m84j(strValueOf)) {
                            String str = iIntValue + "|" + strValueOf + "#";
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            for (Object obj5 : arrayList) {
                                if (obj5 == null) {
                                    setSingleton = Collections.EMPTY_SET;
                                } else if (obj5 instanceof Number) {
                                    setSingleton = Collections.singleton(Long.valueOf(((Number) obj5).longValue()));
                                } else {
                                    HashSet hashSet = new HashSet(4);
                                    String[] strArr = {"msgSeq", "msgId", "msgUid", "msgRandom", "randomId", "msgRandomId"};
                                    for (int i = 0; i < 6; i++) {
                                        String str2 = strArr[i];
                                        try {
                                            Class<?> superclass3 = obj5.getClass();
                                            while (true) {
                                                if (superclass3 == null) {
                                                    declaredField = null;
                                                    break;
                                                }
                                                try {
                                                    declaredField = superclass3.getDeclaredField(str2);
                                                    declaredField.setAccessible(true);
                                                    break;
                                                } catch (Throwable unused4) {
                                                    superclass3 = superclass3.getSuperclass();
                                                }
                                            }
                                        } catch (Throwable unused5) {
                                        }
                                        if (declaredField == null) {
                                            obj4 = null;
                                            if (!(obj4 instanceof Number)) {
                                                hashSet.add(Long.valueOf(((Number) obj4).longValue()));
                                            }
                                        } else {
                                            obj4 = declaredField.get(obj5);
                                            if (!(obj4 instanceof Number)) {
                                            }
                                        }
                                    }
                                    setSingleton = hashSet;
                                }
                                Iterator it = setSingleton.iterator();
                                while (it.hasNext()) {
                                    Long l = (Long) concurrentHashMap.get(str + ((Long) it.next()));
                                    if (l != null && jCurrentTimeMillis - l.longValue() < 180000) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    obj3 = null;
                    strValueOf = String.valueOf(obj3);
                    if (iIntValue == 1) {
                        String str3 = iIntValue + "|" + strValueOf + "#";
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        while (r3.hasNext()) {
                        }
                    } else {
                        String str32 = iIntValue + "|" + strValueOf + "#";
                        long jCurrentTimeMillis22 = System.currentTimeMillis();
                        while (r3.hasNext()) {
                        }
                    }
                }
                obj2 = null;
                if (!(obj2 instanceof Number)) {
                }
                superclass = obj.getClass();
                while (true) {
                    if (superclass != null) {
                    }
                }
                if (declaredField2 == null) {
                }
                obj3 = null;
                strValueOf = String.valueOf(obj3);
                if (iIntValue == 1) {
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m76b(C0001a0 c0001a0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = c0001a0.f0a;
        String str = c0001a0.f2c;
        String str2 = c0001a0.f3d;
        String strTrim = str.trim();
        String strTrim2 = str2.trim();
        int i2 = (i != 2 || strTrim.length() <= 0 || strTrim2.length() <= 0 || strTrim.equals(strTrim2)) ? 1 : 2;
        String strConcat = (c0001a0.f0a + "|" + c0001a0.f1b).concat("#");
        if (c0001a0.f4e > 0) {
            f75e.put(strConcat + c0001a0.f4e, Long.valueOf(jCurrentTimeMillis));
        }
        if (c0001a0.f5f > 0) {
            f75e.put(strConcat + c0001a0.f5f, Long.valueOf(jCurrentTimeMillis));
        }
        if (c0001a0.f6g > 0) {
            f75e.put(strConcat + c0001a0.f6g, Long.valueOf(jCurrentTimeMillis));
        }
        ConcurrentHashMap concurrentHashMap = f75e;
        if (concurrentHashMap.size() >= 64) {
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (jCurrentTimeMillis - ((Long) entry.getValue()).longValue() > 180000) {
                    concurrentHashMap.remove(entry.getKey());
                }
            }
        }
        int i3 = i2;
        f72b.m999e(c0001a0.f0a, c0001a0.f1b, c0001a0.f4e, c0001a0.f5f, c0001a0.f6g, c0001a0.f3d, i3, jCurrentTimeMillis);
        C0191e0 c0191e0 = f73c;
        File file = HookEntry.hostContext() == null ? null : new File(HookEntry.hostContext().getFilesDir(), "elaris_anti_recall_status_v2");
        int i4 = c0001a0.f0a;
        String str3 = c0001a0.f1b;
        long j = c0001a0.f4e;
        long j2 = c0001a0.f5f;
        long j3 = c0001a0.f6g;
        String str4 = c0001a0.f3d;
        synchronized (c0191e0) {
            if (file != null) {
                if (str3.length() != 0) {
                    int iM1071x = AbstractC0486u9.m1071x(i3);
                    if (iM1071x != 0) {
                        c0191e0.m342c(jCurrentTimeMillis, file);
                        c0191e0.f211a.m999e(i4, str3, j, j2, j3, str4, iM1071x, jCurrentTimeMillis);
                        try {
                            if (C0191e0.m340a(file, (jCurrentTimeMillis + "\t" + i4 + "\t" + str3.replace('\t', '_').replace('\r', '_').replace('\n', '_') + "\t" + j + "\t" + j2 + "\t" + j3 + "\t" + str4.replace('\t', '_').replace('\r', '_').replace('\n', '_') + "\t" + iM1071x + "\n").getBytes(StandardCharsets.UTF_8))) {
                                ((ConcurrentHashMap) c0191e0.f211a.f873c).clear();
                                c0191e0.f211a.m999e(i4, str3, j, j2, j3, str4, iM1071x, jCurrentTimeMillis);
                            }
                            c0191e0.f212b = file.lastModified();
                            c0191e0.f213c = file.length();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        try {
            Context contextHostContext = HookEntry.hostContext();
            if (contextHostContext == null) {
                return;
            }
            Intent intent = new Intent("com.mr.elaris.action.ANTI_RECALL_STATUS_CHANGED");
            intent.setPackage(contextHostContext.getPackageName());
            contextHostContext.sendBroadcast(intent);
        } catch (Throwable unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ArrayList m77c(ClassLoader classLoader, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        try {
            C0556z c0556z = new C0556z(bArr);
            while (c0556z.m1174a()) {
                if (c0556z.f1120d == 8 && c0556z.f1121e == 2) {
                    try {
                        C0556z c0556z2 = new C0556z(c0556z.m1175b());
                        while (c0556z2.m1174a()) {
                            if (c0556z2.f1120d == 4 && c0556z2.f1121e == 2) {
                                m92r(classLoader, c0556z2.m1175b(), arrayList);
                            } else {
                                c0556z2.m1178e();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    c0556z.m1178e();
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static ArrayList m78d(ClassLoader classLoader, byte[] bArr) {
        byte[] bArrM1175b;
        int i;
        C0556z c0556z;
        ArrayList arrayList = new ArrayList();
        int i2 = 2;
        int i3 = 1;
        try {
            c0556z = new C0556z(bArr);
        } catch (Throwable unused) {
        }
        while (c0556z.m1174a()) {
            if (c0556z.f1120d == 1 && c0556z.f1121e == 2) {
                bArrM1175b = c0556z.m1175b();
                break;
            }
            c0556z.m1178e();
            bArrM1175b = null;
        }
        bArrM1175b = null;
        if (bArrM1175b != null) {
            C0543y2 c0543y2M91q = m91q(bArrM1175b);
            byte[] bArr2 = (byte[]) c0543y2M91q.f1084a;
            if (bArr2 != null && (i = c0543y2M91q.f1085b) != 0) {
                if (i == 528 && c0543y2M91q.f1086c == 138) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        C0556z c0556z2 = new C0556z(bArr2);
                        while (c0556z2.m1174a()) {
                            if (c0556z2.f1120d == i3 && c0556z2.f1121e == i2) {
                                C0508w c0508wM87m = m87m(c0556z2.m1175b());
                                if (c0508wM87m.f984f > 0) {
                                    String strM81g = m81g(classLoader);
                                    if (m84j(strM81g) || !strM81g.equals(c0508wM87m.f979a)) {
                                        String str = !m84j(c0508wM87m.f979a) ? c0508wM87m.f979a : c0508wM87m.f980b;
                                        String str2 = c0508wM87m.f979a;
                                        arrayList2.add(new C0001a0(1, str, str2, str2, c0508wM87m.f984f, c0508wM87m.f981c, c0508wM87m.f983e, c0508wM87m.f982d));
                                        i2 = 2;
                                        i3 = 1;
                                    }
                                }
                            } else {
                                c0556z2.m1178e();
                                i2 = 2;
                                i3 = 1;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    arrayList.addAll(arrayList2);
                } else if (i == 732 && c0543y2M91q.f1086c == 17) {
                    arrayList.addAll(m89o(classLoader, bArr2));
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static byte[] m79e(byte[] bArr) {
        byte[] byteArray;
        C0017b0 c0017b0M93s;
        int i;
        int iMin;
        int i2 = 0;
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            while (i2 < bArr.length && (i = (c0017b0M93s = m93s(i2, bArr)).f51a) > i2 && i <= bArr.length) {
                long j = c0017b0M93s.f52b;
                int i3 = (int) (j >>> 3);
                int i4 = (int) (j & 7);
                if (i4 == 0) {
                    iMin = m93s(i, bArr).f51a;
                } else if (i4 == 1) {
                    iMin = Math.min(bArr.length, i + 8);
                } else if (i4 != 2) {
                    iMin = i4 != 5 ? bArr.length : Math.min(bArr.length, i + 4);
                } else {
                    C0017b0 c0017b0M93s2 = m93s(i, bArr);
                    long j2 = c0017b0M93s2.f51a;
                    long j3 = c0017b0M93s2.f52b + j2;
                    iMin = j3 < j2 ? bArr.length : (int) Math.min(bArr.length, j3);
                }
                if (iMin < i2 || iMin > bArr.length) {
                    break;
                }
                if (i3 != 8) {
                    byteArrayOutputStream.write(bArr, i2, iMin - i2);
                }
                i2 = iMin;
            }
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Throwable unused) {
        }
        return byteArray.length == 0 ? bArr : byteArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m80f(Class cls) {
        String name;
        if (cls == null) {
            return;
        }
        try {
            name = cls.getName();
        } catch (Throwable unused) {
            name = "";
        }
        if (name.length() == 0) {
            return;
        }
        String strM1004e = AbstractC0463t2.m1004e("target.anti_recall.legacy_facade_classes");
        if (strM1004e.length() == 0) {
            AbstractC0463t2.m1015p("target.anti_recall.legacy_facade_classes", name);
            return;
        }
        for (String str : strM1004e.split("\\|")) {
            if (name.equals(str)) {
                return;
            }
        }
        AbstractC0463t2.m1015p("target.anti_recall.legacy_facade_classes", strM1004e + "|" + name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m81g(ClassLoader classLoader) {
        Object obj;
        Class<?> clsFindClass;
        Object staticObjectField;
        Field declaredField;
        try {
            clsFindClass = XposedHelpers.findClass("mqq.app.MobileQQ", classLoader);
            staticObjectField = XposedHelpers.getStaticObjectField(clsFindClass, "sMobileQQ");
        } catch (Throwable unused) {
        }
        if (staticObjectField == null) {
            obj = null;
        } else {
            while (true) {
                if (clsFindClass == null) {
                    declaredField = null;
                    break;
                }
                try {
                    declaredField = clsFindClass.getDeclaredField("mAppRuntime");
                    declaredField.setAccessible(true);
                    break;
                } catch (Throwable unused2) {
                    clsFindClass = clsFindClass.getSuperclass();
                }
            }
            if (declaredField != null) {
                obj = declaredField.get(staticObjectField);
            }
            obj = null;
        }
        if (obj == null) {
            return "";
        }
        try {
            String strValueOf = String.valueOf(obj.getClass().getMethod("getAccount", null).invoke(obj, null));
            if (m84j(strValueOf)) {
                return "";
            }
            if (strValueOf.equals(f77g) && !m84j(f78h)) {
                return f78h;
            }
            String strM94t = m94t(classLoader, strValueOf);
            if (!m84j(strM94t)) {
                f77g = strValueOf;
                f78h = strM94t;
            }
            return strM94t;
        } catch (Throwable unused3) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static synchronized void m82h(ClassLoader classLoader, boolean z) {
        m83i(1, classLoader);
        m83i(2, classLoader);
        m83i(3, classLoader);
        if (z) {
            AbstractC0429r0.m830j(classLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110 A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #1 {all -> 0x0143, blocks: (B:49:0x00d9, B:51:0x00ed, B:53:0x00f1, B:55:0x00f5, B:59:0x0100, B:66:0x0110), top: B:110:0x00d9 }] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m83i(int i, ClassLoader classLoader) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 1;
        C0175d0 c0175d0 = f74d;
        if (i == 1 ? c0175d0.f181a : i == 2 ? c0175d0.f182b : c0175d0.f183c) {
            return;
        }
        int i6 = 0;
        if (i == 1) {
            try {
                Class<?> clsM1008i = AbstractC0463t2.m1008i(classLoader, "target.anti_recall.session_class", "com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession$CppProxy");
                if (clsM1008i == null) {
                    clsM1008i = XposedHelpers.findClass("com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession", classLoader);
                } else {
                    AbstractC0463t2.m1015p("target.anti_recall.session_class", clsM1008i.getName());
                }
                int i7 = 0;
                for (Method method : clsM1008i.getDeclaredMethods()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if ("onMsfPush".equals(method.getName()) && !Modifier.isAbstract(method.getModifiers()) && parameterTypes.length >= 2 && parameterTypes[0] == String.class && parameterTypes[1] == byte[].class) {
                        XposedBridge.hookMethod(method, new C0460t(classLoader));
                        i7++;
                        m85k("hooked anti-recall NT push: " + m86l(method));
                    }
                }
                if (i7 == 0) {
                    m85k("anti-recall NT push target not found");
                }
                if (i7 <= 0) {
                    return;
                } else {
                    z = 1;
                }
            } catch (Throwable th) {
                m85k("hookNtRecallPush failed: " + th);
                return;
            }
        } else {
            if (i == 2) {
                String[] strArrM1005f = AbstractC0463t2.m1005f("target.anti_recall.legacy_facade_classes", f71a, classLoader);
                int length = strArrM1005f.length;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length) {
                    String str = strArrM1005f[i8];
                    try {
                        Class<?> clsFindClass = XposedHelpers.findClass(str, classLoader);
                        m80f(clsFindClass);
                        Method[] declaredMethods = clsFindClass.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i10 = i6;
                        while (i10 < length2) {
                            Method method2 = declaredMethods[i10];
                            i4 = i6;
                            try {
                                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                                i3 = i5;
                                try {
                                    boolean zEquals = "handleRevokedNotifyAndNotify".equals(method2.getName());
                                    int i11 = (method2.getReturnType() == Void.TYPE && parameterTypes2.length == 2 && parameterTypes2[i4] == ArrayList.class && parameterTypes2[i3] == Boolean.TYPE) ? i3 : i4;
                                    if (str.endsWith("MessageFacadeImpl")) {
                                        if (zEquals) {
                                            XposedBridge.hookMethod(method2, new C0476u(90));
                                            i9++;
                                            m85k("hooked legacy recall facade: " + m86l(method2));
                                        }
                                    } else if (zEquals || i11 != 0) {
                                    }
                                    i10++;
                                    i6 = i4;
                                    i5 = i3;
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                                i3 = i5;
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                    i3 = i5;
                    i4 = i6;
                    i8++;
                    i6 = i4;
                    i5 = i3;
                }
                i2 = i5;
                if (i9 == 0) {
                    m85k("legacy recall facade target not found");
                }
                if (i9 <= 0) {
                    return;
                }
            } else {
                i2 = 1;
                int i12 = 0;
                try {
                    Class clsM1008i2 = AbstractC0463t2.m1008i(classLoader, "target.anti_recall.delete_service_class", "com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy");
                    if (clsM1008i2 == null) {
                        return;
                    }
                    AbstractC0463t2.m1015p("target.anti_recall.delete_service_class", clsM1008i2.getName());
                    for (Method method3 : clsM1008i2.getDeclaredMethods()) {
                        Class<?>[] parameterTypes3 = method3.getParameterTypes();
                        if ("deleteMsg".equals(method3.getName()) && !Modifier.isAbstract(method3.getModifiers()) && parameterTypes3.length >= 2 && ArrayList.class.isAssignableFrom(parameterTypes3[1])) {
                            XposedBridge.hookMethod(method3, new C0492v(80));
                            i12++;
                            m85k("hooked anti-recall delete fallback: " + m86l(method3));
                        }
                    }
                    if (i12 == 0) {
                        m85k("deleteMsg fallback target not found");
                    }
                    if (i12 <= 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    m85k("hookKernelDeleteFallback failed: " + th2);
                    return;
                }
            }
            z = i2;
        }
        if (i == z) {
            c0175d0.f181a = z;
        } else if (i == 2) {
            c0175d0.f182b = z;
        } else {
            c0175d0.f183c = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m84j(String str) {
        return str == null || str.length() == 0 || "null".equals(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m85k(String str) {
        if (HookEntry.shouldLogMessage(str)) {
            XposedBridge.log("Elaris: ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m86l(Method method) {
        return method.getDeclaringClass().getName() + "." + method.getName() + Arrays.toString(method.getParameterTypes());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C0508w m87m(byte[] bArr) {
        C0508w c0508w = new C0508w();
        c0508w.f979a = "";
        c0508w.f980b = "";
        try {
            C0556z c0556z = new C0556z(bArr);
            while (c0556z.m1174a()) {
                int i = c0556z.f1120d;
                if (i != 20) {
                    switch (i) {
                        case 1:
                            if (c0556z.f1121e != 2) {
                                c0556z.m1178e();
                            } else {
                                c0508w.f979a = c0556z.m1177d();
                            }
                            break;
                        case 2:
                            if (c0556z.f1121e != 2) {
                                c0556z.m1178e();
                            } else {
                                c0508w.f980b = c0556z.m1177d();
                            }
                            break;
                        case 3:
                            if (c0556z.f1121e != 0) {
                                c0556z.m1178e();
                            } else {
                                c0556z.m1176c();
                            }
                            break;
                        case 4:
                            if (c0556z.f1121e != 0) {
                                c0556z.m1178e();
                            } else {
                                c0508w.f981c = c0556z.m1176c();
                            }
                            break;
                        case 5:
                            if (c0556z.f1121e != 0) {
                                c0556z.m1178e();
                            } else {
                                c0508w.f982d = c0556z.m1176c();
                            }
                            break;
                        case 6:
                            if (c0556z.f1121e != 0) {
                                c0556z.m1178e();
                            } else {
                                c0508w.f983e = c0556z.m1176c();
                            }
                            break;
                        default:
                            c0556z.m1178e();
                            break;
                    }
                } else if (c0556z.f1121e == 0) {
                    c0508w.f984f = c0556z.m1176c();
                } else {
                    c0556z.m1178e();
                }
            }
        } catch (Throwable unused) {
        }
        return c0508w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C0524x m88n(byte[] bArr) {
        C0524x c0524x = new C0524x();
        c0524x.f1025d = "";
        try {
            C0556z c0556z = new C0556z(bArr);
            while (c0556z.m1174a()) {
                int i = c0556z.f1120d;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                c0556z.m1178e();
                            } else if (c0556z.f1121e == 2) {
                                c0524x.f1025d = c0556z.m1177d();
                            } else {
                                c0556z.m1178e();
                            }
                        } else if (c0556z.f1121e == 0) {
                            c0524x.f1024c = c0556z.m1176c();
                        } else {
                            c0556z.m1178e();
                        }
                    } else if (c0556z.f1121e == 0) {
                        c0524x.f1023b = c0556z.m1176c();
                    } else {
                        c0556z.m1178e();
                    }
                } else if (c0556z.f1121e == 0) {
                    c0524x.f1022a = c0556z.m1176c();
                } else {
                    c0556z.m1178e();
                }
            }
        } catch (Throwable unused) {
        }
        return c0524x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static ArrayList m89o(ClassLoader classLoader, byte[] bArr) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (bArr != null && bArr.length > 7) {
            try {
                C0556z c0556z = new C0556z(Arrays.copyOfRange(bArr, 7, bArr.length));
                long j = 0;
                byte[] bArrM1175b = null;
                long jM1176c = 0;
                long jM1176c2 = 0;
                while (true) {
                    z = true;
                    if (!c0556z.m1174a()) {
                        break;
                    }
                    int i = c0556z.f1120d;
                    if (i == 1 && c0556z.f1121e == 0) {
                        jM1176c = c0556z.m1176c();
                    } else if (i == 4 && c0556z.f1121e == 0) {
                        jM1176c2 = c0556z.m1176c();
                    } else if (i == 11 && c0556z.f1121e == 2) {
                        bArrM1175b = c0556z.m1175b();
                    } else {
                        c0556z.m1178e();
                    }
                }
                if (jM1176c == 7 && jM1176c2 > 0 && bArrM1175b != null) {
                    C0540y c0540yM90p = m90p(bArrM1175b);
                    String str = (String) c0540yM90p.f1082b;
                    if (m84j(str) || !str.equals(m81g(classLoader))) {
                        z = false;
                    }
                    if (!z) {
                        String strValueOf = String.valueOf(jM1176c2);
                        for (C0524x c0524x : (ArrayList) c0540yM90p.f1081a) {
                            long j2 = c0524x.f1022a;
                            if (j2 > j) {
                                arrayList.add(new C0001a0(2, strValueOf, (String) c0540yM90p.f1082b, c0524x.f1025d, j2, 0L, c0524x.f1024c, c0524x.f1023b));
                                j = 0;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C0540y m90p(byte[] bArr) {
        C0540y c0540y = new C0540y();
        try {
            C0556z c0556z = new C0556z(bArr);
            while (c0556z.m1174a()) {
                int i = c0556z.f1120d;
                if (i == 1 && c0556z.f1121e == 2) {
                    c0540y.f1082b = c0556z.m1177d();
                } else if (i == 3 && c0556z.f1121e == 2) {
                    ((ArrayList) c0540y.f1081a).add(m88n(c0556z.m1175b()));
                } else {
                    c0556z.m1178e();
                }
            }
        } catch (Throwable unused) {
        }
        return c0540y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Serializable] */
    /* JADX INFO: renamed from: q */
    public static C0543y2 m91q(byte[] bArr) {
        ?? M1175b;
        C0543y2 c0543y2 = new C0543y2();
        try {
            C0556z c0556z = new C0556z(bArr);
            while (c0556z.m1174a()) {
                int i = c0556z.f1120d;
                if (i == 2 && c0556z.f1121e == 2) {
                    try {
                        C0556z c0556z2 = new C0556z(c0556z.m1175b());
                        while (c0556z2.m1174a()) {
                            int i2 = c0556z2.f1120d;
                            if (i2 == 1 && c0556z2.f1121e == 0) {
                                c0543y2.f1085b = (int) c0556z2.m1176c();
                            } else if (i2 == 2 && c0556z2.f1121e == 0) {
                                c0543y2.f1086c = (int) c0556z2.m1176c();
                            } else {
                                c0556z2.m1178e();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                } else if (i == 3 && c0556z.f1121e == 2) {
                    try {
                        C0556z c0556z3 = new C0556z(c0556z.m1175b());
                        while (c0556z3.m1174a()) {
                            if (c0556z3.f1120d == 2 && c0556z3.f1121e == 2) {
                                M1175b = c0556z3.m1175b();
                                break;
                            }
                            c0556z3.m1178e();
                        }
                    } catch (Throwable unused2) {
                    }
                    M1175b = 0;
                    c0543y2.f1084a = M1175b;
                } else {
                    c0556z.m1178e();
                }
            }
        } catch (Throwable unused3) {
        }
        return c0543y2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m92r(ClassLoader classLoader, byte[] bArr, ArrayList arrayList) {
        byte[] bArr2;
        try {
            C0556z c0556z = new C0556z(bArr);
            String strM1177d = "";
            ArrayList arrayList2 = new ArrayList(2);
            while (c0556z.m1174a()) {
                int i = c0556z.f1120d;
                if (i == 2 && c0556z.f1121e == 2) {
                    strM1177d = c0556z.m1177d();
                } else if (i == 8 && c0556z.f1121e == 2) {
                    arrayList2.add(c0556z.m1175b());
                } else {
                    c0556z.m1178e();
                }
            }
            if (m84j(strM1177d)) {
                return;
            }
            for (int i2 = 0; i2 < strM1177d.length(); i2++) {
                if (!Character.isDigit(strM1177d.charAt(i2))) {
                    return;
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C0543y2 c0543y2M91q = m91q((byte[]) it.next());
                if (c0543y2M91q.f1085b == 732 && c0543y2M91q.f1086c == 17 && (bArr2 = (byte[]) c0543y2M91q.f1084a) != null) {
                    arrayList.addAll(m89o(classLoader, bArr2));
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static C0017b0 m93s(int i, byte[] bArr) {
        long j = 0;
        int i2 = 0;
        while (i2 < 64 && i < bArr.length) {
            int i3 = i + 1;
            byte b = bArr[i];
            j |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                return new C0017b0(j, i3);
            }
            i2 += 7;
            i = i3;
        }
        return new C0017b0(j, bArr.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static String m94t(ClassLoader classLoader, String str) {
        try {
            Object objInvoke = XposedHelpers.findClass("com.tencent.mobileqq.qroute.QRoute", classLoader).getMethod("api", Class.class).invoke(null, XposedHelpers.findClass("com.tencent.relation.common.api.IRelationNTUinAndUidApi", classLoader));
            Object objInvoke2 = objInvoke.getClass().getMethod("getUidFromUin", String.class).invoke(objInvoke, str);
            return objInvoke2 == null ? "" : String.valueOf(objInvoke2);
        } catch (Throwable unused) {
            return "";
        }
    }
}
