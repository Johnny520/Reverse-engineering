package lin.xposed.hook.util.p011qq;

import android.content.Context;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import p025.AbstractC7012;
import p049.AbstractC7162;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p405.AbstractC9919;
import p405.C9915;
import p405.C9921;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQEnvTool {
    public static boolean checkQQ(String str) {
        if (str == null || str.length() < 5 || str.length() > 12 || str.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }

    public static int findResId(String str) {
        return AbstractC7187.f17852.getResources().getIdentifier(str, "id", AbstractC7187.f17857);
    }

    public static Context getAppInterfaceContext() {
        Object objWaitAppInterface = waitAppInterface();
        C9921 c9921M15230 = C9921.m15230(objWaitAppInterface);
        c9921M15230.f25826 = "getApp";
        return (Context) c9921M15230.m15233(objWaitAppInterface, new Object[0]);
    }

    public static Object getAppRuntime() {
        try {
            return AbstractC7162.m12406(AbstractC7162.m12402(AbstractC7166.m12425("com.tencent.common.app.BaseApplicationImpl"), AbstractC7166.m12425("com.tencent.common.app.BaseApplicationImpl"), "getApplication", new Class[0]).invoke(null, null), "getRuntime", AbstractC7166.m12425("mqq.app.AppRuntime"), new Class[0], new Object[0]);
        } catch (Exception e) {
            C6755.m11872(e);
            return null;
        }
    }

    public static String getCurrentAccountNickName() {
        try {
            Object appRuntime = getAppRuntime();
            if (appRuntime == null) {
                return null;
            }
            HashMap map = AbstractC7162.f17801;
            return (String) AbstractC7162.m12402(appRuntime.getClass(), String.class, "getCurrentNickname", new Class[0]).invoke(appRuntime, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getCurrentUin() {
        try {
            Object appRuntime = getAppRuntime();
            if (appRuntime == null) {
                return null;
            }
            HashMap map = AbstractC7162.f17801;
            return (String) AbstractC7162.m12402(appRuntime.getClass(), String.class, "getCurrentAccountUin", new Class[0]).invoke(appRuntime, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static long getGTK(String str) {
        int length = str.length();
        int iCharAt = 5381;
        for (int i = 0; i < length; i++) {
            iCharAt += str.charAt(i) + (iCharAt << 5);
        }
        return Integer.MAX_VALUE & iCharAt;
    }

    public static long getLongAccountUin() {
        try {
            Object appRuntime = getAppRuntime();
            if (appRuntime == null) {
                return 0L;
            }
            String strM14531 = "getLongAccountUin";
            HashMap map = AbstractC7162.f17801;
            return ((Long) AbstractC7162.m12402(appRuntime.getClass(), Long.TYPE, strM14531, new Class[0]).invoke(appRuntime, null)).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static Object getManager(int i) {
        try {
            Object appRuntime = getAppRuntime();
            if (appRuntime == null) {
                return null;
            }
            String strM14531 = "getManager";
            Class clsM12425 = AbstractC7166.m12425("mqq.manager.Manager");
            Class[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i)};
            HashMap map = AbstractC7162.f17801;
            return AbstractC7162.m12402(appRuntime.getClass(), clsM12425, strM14531, clsArr).invoke(appRuntime, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPSkey(String str) {
        try {
            return (String) AbstractC7162.m12406(getManager(2), "getPskey", String.class, new Class[]{String.class, String.class}, getCurrentUin(), str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getQRouteApi(Class<?> cls) {
        String strM14531 = "com.tencent.mobileqq.qroute.QRoute";
        HashMap map = AbstractC7162.f17801;
        try {
            return AbstractC7162.m12408(AbstractC7166.m12425(strM14531), "api", new Class[]{Class.class}).invoke(null, cls);
        } catch (IllegalAccessException e) {
            C6755.m11872(e);
            return null;
        } catch (InvocationTargetException e2) {
            C6755.m11872(e2);
            return null;
        }
    }

    public static String getRealSkey() {
        try {
            return (String) AbstractC7162.m12406(getManager(2), "getRealSkey", String.class, new Class[]{String.class}, getCurrentUin());
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getRunningService(Class<?> cls, String str) {
        try {
            return AbstractC7162.m12404(getAppRuntime(), "getRuntimeService", new Class[]{Class.class, String.class}, cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getRuntimeService(Class<?> cls, String str) {
        try {
            return AbstractC7162.m12404(peekAppRuntimeOrNull(), "getRuntimeService", new Class[]{Class.class, String.class}, cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getUidFromUin(String str) {
        return (String) XposedHelpers.callMethod(AbstractC7012.m12146(316), "getUidFromUin", new Object[]{str});
    }

    public static String getUinFromUid(String str) {
        return (String) XposedHelpers.callMethod(AbstractC7012.m12146(316), "getUinFromUid", new Object[]{str});
    }

    public static Object peekAppRuntimeOrNull() {
        try {
            String strM14531 = "mqq.app.MobileQQ";
            int i = C9915.f25813;
            C9915 c9915M15221 = C9915.m15221(AbstractC9919.m15228(strM14531));
            c9915M15221.f25815 = "sMobileQQ";
            Object objM15224 = c9915M15221.m15224(null);
            C9921 c9921M15230 = C9921.m15230(objM15224);
            c9921M15230.f25826 = "peekAppRuntime";
            return c9921M15230.m15233(objM15224, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object waitAppInterface() {
        for (int i = 0; i < 10; i++) {
            Object objPeekAppRuntimeOrNull = peekAppRuntimeOrNull();
            if (objPeekAppRuntimeOrNull != null) {
                return objPeekAppRuntimeOrNull;
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
        return null;
    }
}
