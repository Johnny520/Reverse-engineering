package p000;

import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: h */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0238h {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f337a = false;

    /* JADX INFO: renamed from: b */
    public static final HashSet f338b = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m464a(Class cls) {
        try {
            Object[] enumConstants = cls.getEnumConstants();
            if (enumConstants == null) {
                return null;
            }
            for (Object obj : enumConstants) {
                if (obj != null && "TABLET".equals(String.valueOf(obj))) {
                    return obj;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #0 {all -> 0x0047, blocks: (B:10:0x0011, B:13:0x001e, B:15:0x0025, B:17:0x0029, B:19:0x002d, B:25:0x003b, B:20:0x0032), top: B:34:0x0011 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m465b(Class cls, Class[] clsArr) {
        Object objM464a;
        int i = 0;
        if (cls != null && clsArr.length != 0) {
            try {
                int i2 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    try {
                        if (Modifier.isStatic(field.getModifiers())) {
                            Class<?> type = field.getType();
                            if (type != null) {
                                for (Class cls2 : clsArr) {
                                    if (type == cls2) {
                                        objM464a = m464a(cls2);
                                        break;
                                    }
                                }
                                objM464a = null;
                                if (objM464a == null) {
                                    field.setAccessible(true);
                                    field.set(null, objM464a);
                                    i2++;
                                }
                            } else {
                                objM464a = null;
                                if (objM464a == null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        i = i2;
                        AbstractC0497v4.m1076C("tablet mode cached field write failed: " + cls.getName() + ": " + th);
                        return i;
                    }
                }
                return i2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086 A[Catch: all -> 0x00df, TryCatch #2 {all -> 0x00df, blocks: (B:6:0x0008, B:23:0x0042, B:25:0x004c, B:28:0x0051, B:31:0x005f, B:46:0x00af, B:34:0x006c, B:36:0x0072, B:38:0x0076, B:40:0x007a, B:45:0x0086, B:41:0x007f, B:48:0x00b4, B:50:0x00d3, B:52:0x00d9), top: B:63:0x0008 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m466c(ClassLoader classLoader) {
        Object objM464a;
        if (f337a || classLoader == null) {
            return;
        }
        try {
            Class<?> clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.common.config.pad.PadUtil", classLoader);
            ArrayList arrayList = new ArrayList();
            try {
                Class<?> clsFindClassIfExists2 = XposedHelpers.findClassIfExists("com.tencent.common.config.pad.DeviceType", classLoader);
                if (clsFindClassIfExists2 != null && clsFindClassIfExists2.isEnum() && m464a(clsFindClassIfExists2) != null) {
                    arrayList.add(clsFindClassIfExists2);
                }
            } catch (Throwable unused) {
            }
            try {
                Class<?> clsFindClassIfExists3 = XposedHelpers.findClassIfExists("com.tencent.common.config.DeviceType", classLoader);
                if (clsFindClassIfExists3 != null && clsFindClassIfExists3.isEnum() && m464a(clsFindClassIfExists3) != null) {
                    arrayList.add(clsFindClassIfExists3);
                }
            } catch (Throwable unused2) {
            }
            Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            if (clsFindClassIfExists != null && clsArr.length != 0) {
                int iM465b = m465b(clsFindClassIfExists, clsArr);
                int i = 0;
                for (Method method : clsFindClassIfExists.getDeclaredMethods()) {
                    if (!Modifier.isAbstract(method.getModifiers())) {
                        Class<?> returnType = method.getReturnType();
                        if (returnType != null) {
                            for (Class<?> cls : clsArr) {
                                if (returnType == cls) {
                                    objM464a = m464a(cls);
                                    break;
                                }
                            }
                            objM464a = null;
                            if (objM464a == null) {
                                method.setAccessible(true);
                                XposedBridge.hookMethod(method, new C0190e(method.getDeclaringClass(), clsArr, objM464a));
                                i++;
                                AbstractC0497v4.m1076C("hooked tablet mode: " + AbstractC0497v4.m1078E(method));
                            }
                        } else {
                            objM464a = null;
                            if (objM464a == null) {
                            }
                        }
                    }
                }
                if (i <= 0) {
                    AbstractC0497v4.m1076C("tablet mode method not found");
                    return;
                }
                f337a = true;
                AbstractC0497v4.m1076C("tablet mode hooks installed count=" + i + ", cachedFields=" + iM465b);
                return;
            }
            AbstractC0497v4.m1076C("tablet mode target not found");
        } catch (Throwable th) {
            AbstractC0000a.m2c("hookForceTabletMode failed: ", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m467d(ClassLoader classLoader) {
        int i;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        boolean zAdd;
        boolean zAdd2;
        int i2 = 0;
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, "com.tencent.smtt.sdk.QbSdk");
            if (clsM1091j != null) {
                i = 0;
                for (Method method : clsM1091j.getDeclaredMethods()) {
                    try {
                        if ("getIsSysWebViewForcedByOuter".equals(method.getName()) || "isSysWebViewForcedByOuter".equals(method.getName())) {
                            if (Modifier.isStatic(method.getModifiers()) && method.getReturnType() == Boolean.TYPE && method.getParameterTypes().length == 0) {
                                String strM1078E = AbstractC0497v4.m1078E(method);
                                HashSet hashSet = f338b;
                                synchronized (hashSet) {
                                    zAdd2 = hashSet.add(strM1078E);
                                }
                                if (zAdd2) {
                                    try {
                                        XposedBridge.hookMethod(method, new C0206f(40));
                                        i++;
                                        AbstractC0497v4.m1076C("hooked web kernel runtime fallback gate: " + strM1078E);
                                    } catch (Throwable th) {
                                        HashSet hashSet2 = f338b;
                                        synchronized (hashSet2) {
                                            hashSet2.remove(strM1078E);
                                            throw th;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC0497v4.m1076C("hook QbSdk web fallback failed: " + th);
                        AbstractC0198e7.m343a("web-kernel", "qbsdk-hook", th);
                        if (i == 0) {
                        }
                        if (i != 0) {
                        }
                    }
                }
            } else {
                i = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            i = 0;
        }
        if (i == 0) {
            HashSet hashSet3 = f338b;
            synchronized (hashSet3) {
                zIsEmpty2 = hashSet3.isEmpty();
            }
            if (zIsEmpty2) {
                try {
                    Class clsM1091j2 = AbstractC0497v4.m1091j(classLoader, "com.tencent.smtt.utils.LoadPropertiesUtils");
                    if (clsM1091j2 != null) {
                        Method[] declaredMethods = clsM1091j2.getDeclaredMethods();
                        int length = declaredMethods.length;
                        Method method2 = null;
                        int i3 = 0;
                        Method method3 = null;
                        while (true) {
                            if (i3 >= length) {
                                method2 = method3;
                                break;
                            }
                            Method method4 = declaredMethods[i3];
                            if (!Modifier.isStatic(method4.getModifiers()) && !Modifier.isAbstract(method4.getModifiers()) && method4.getReturnType() == Void.TYPE && method4.getParameterTypes().length == 0) {
                                if (method3 != null) {
                                    break;
                                } else {
                                    method3 = method4;
                                }
                            }
                            i3++;
                        }
                        if (method2 == null) {
                            AbstractC0497v4.m1076C("web kernel properties fallback skipped reason=unique zero-arg void target missing");
                        } else {
                            String strM1078E2 = AbstractC0497v4.m1078E(method2);
                            HashSet hashSet4 = f338b;
                            synchronized (hashSet4) {
                                zAdd = hashSet4.add(strM1078E2);
                            }
                            if (zAdd) {
                                try {
                                    method2.setAccessible(true);
                                    XposedBridge.hookMethod(method2, new C0222g(40));
                                    AbstractC0497v4.m1076C("hooked web kernel properties force system: " + strM1078E2);
                                    i2 = 1;
                                } catch (Throwable th4) {
                                    HashSet hashSet5 = f338b;
                                    synchronized (hashSet5) {
                                        hashSet5.remove(strM1078E2);
                                        throw th4;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    AbstractC0497v4.m1076C("hookLoadPropertiesUtils failed: " + th5);
                    AbstractC0198e7.m343a("web-kernel", "legacy-properties-hook", th5);
                }
                i += i2;
            }
        }
        if (i != 0) {
            HashSet hashSet6 = f338b;
            synchronized (hashSet6) {
                zIsEmpty = hashSet6.isEmpty();
            }
            if (zIsEmpty) {
                AbstractC0497v4.m1076C("web kernel fallback target not found");
            }
        }
    }
}
