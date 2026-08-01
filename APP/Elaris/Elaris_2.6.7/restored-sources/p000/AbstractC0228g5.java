package p000;

import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: g5 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0228g5 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f306a = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m432a(ClassLoader classLoader) {
        int i;
        Class<?> clsM1091j;
        Class clsM1091j2;
        int i2 = 0;
        if (classLoader == null || f306a) {
            return 0;
        }
        f306a = true;
        try {
            clsM1091j = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.data.Card");
            clsM1091j2 = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.profilecard.api.impl.ProfileDataServiceImpl");
        } catch (Throwable th) {
            AbstractC0000a.m2c("hookAllowForbidCardService failed: ", th);
        }
        if (clsM1091j == null || clsM1091j2 == null) {
            i = 0;
        } else {
            i = 0;
            for (Method method : clsM1091j2.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && method.getReturnType() == clsM1091j) {
                    XposedBridge.hookMethod(method, new C0180d5(40));
                    i++;
                    AbstractC0497v4.m1076C("hooked allow forbid card service: " + AbstractC0497v4.m1078E(method));
                }
            }
        }
        try {
            Class<?> clsM1091j3 = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.data.Card");
            if (clsM1091j3 != null) {
                String[] strArr = {"com.tencent.mobileqq.profilecard.activity.FriendProfileCardActivity", "com.tencent.mobileqq.activity.FriendProfileCardActivity"};
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    Class clsM1091j4 = AbstractC0497v4.m1091j(classLoader, strArr[i4]);
                    if (clsM1091j4 != null) {
                        for (Method method2 : clsM1091j4.getDeclaredMethods()) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            if (!Modifier.isAbstract(method2.getModifiers()) && parameterTypes.length == 1 && parameterTypes[0] == clsM1091j3) {
                                XposedBridge.hookMethod(method2, new C0196e5(40));
                                i3++;
                                AbstractC0497v4.m1076C("hooked allow forbid card activity: " + AbstractC0497v4.m1078E(method2));
                            }
                        }
                    }
                }
                i2 = i3;
            }
        } catch (Throwable th2) {
            AbstractC0000a.m2c("hookAllowForbidCardActivity failed: ", th2);
        }
        int iM433b = m433b(classLoader, "com.tencent.mobileqq.profilecard.api.impl.ProfileProtocolServiceImpl") + m433b(classLoader, "com.tencent.mobileqq.profilecard.processor.ProfileSecureProcessor") + i + i2;
        if (iM433b == 0) {
            AbstractC0497v4.m1076C("allow forbid card data targets not found");
        }
        return iM433b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m433b(ClassLoader classLoader, String str) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int i2 = 0;
                while (true) {
                    if (i2 >= parameterTypes.length) {
                        i2 = -1;
                        break;
                    }
                    Class<?> cls = parameterTypes[i2];
                    if (cls != null) {
                        String name = cls.getName();
                        if ("SummaryCard.RespHead".equals(name) || name.endsWith(".SummaryCard$RespHead") || name.endsWith(".SummaryCard.RespHead") || (name.contains("SummaryCard") && name.endsWith("RespHead"))) {
                            break;
                        }
                    }
                    i2++;
                }
                if (i2 >= 0 && !Modifier.isAbstract(method.getModifiers())) {
                    XposedBridge.hookMethod(method, new C0212f5(i2));
                    i++;
                    AbstractC0497v4.m1076C("hooked profile response sanitizer: " + AbstractC0497v4.m1078E(method));
                }
            }
            if (i == 0) {
                AbstractC0497v4.m1076C("profile response sanitizer target not found: " + str);
            }
            return i;
        } catch (Throwable th) {
            AbstractC0497v4.m1076C("hookProfileRespHeadSanitizer failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m434c(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            int iM1120c = AbstractC0513w4.m1120c(obj, "forbidCode", 0);
            boolean zEquals = Boolean.TRUE.equals(AbstractC0513w4.m1119b(obj, "isForbidAccount"));
            if (iM1120c == 201 || iM1120c == 202 || zEquals) {
                AbstractC0513w4.m1121d(obj, "isForbidAccount", Boolean.FALSE);
                AbstractC0513w4.m1121d(obj, "forbidCode", 0);
            }
        } catch (Throwable th) {
            AbstractC0000a.m2c("sanitizeForbidCard failed: ", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m435d(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            String[] strArr = {"iResult", "result", "resultCode", "ret", "retCode", "errCode", "errorCode", "code"};
            boolean z = false;
            for (int i = 0; i < 8; i++) {
                int iM1120c = AbstractC0513w4.m1120c(obj, strArr[i], 0);
                if (iM1120c == 201 || iM1120c == 202) {
                    z = true;
                }
            }
            Object objM1119b = AbstractC0513w4.m1119b(obj, "msg");
            if (objM1119b == null) {
                objM1119b = AbstractC0513w4.m1119b(obj, "message");
            }
            if (objM1119b == null) {
                objM1119b = AbstractC0513w4.m1119b(obj, "errMsg");
            }
            String strValueOf = String.valueOf(objM1119b);
            if ((strValueOf.contains("账号状态异常") || strValueOf.contains("多人举报") || strValueOf.contains("违规行为")) && (strValueOf.contains("资料卡") || strValueOf.contains("查看资料") || strValueOf.contains("暂不支持"))) {
                z = true;
            }
            if (z) {
                for (int i2 = 0; i2 < 8; i2++) {
                    AbstractC0513w4.m1121d(obj, strArr[i2], 0);
                }
                AbstractC0513w4.m1121d(obj, "msg", "");
                AbstractC0513w4.m1121d(obj, "message", "");
                AbstractC0513w4.m1121d(obj, "errMsg", "");
            }
        } catch (Throwable th) {
            AbstractC0000a.m2c("sanitizeRespHead failed: ", th);
        }
    }
}
