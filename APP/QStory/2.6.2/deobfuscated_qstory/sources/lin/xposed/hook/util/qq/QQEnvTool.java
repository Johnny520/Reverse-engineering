package lin.xposed.hook.util.qq;

import android.content.Context;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import p007.AbstractC6136;
import p032.AbstractC6314;
import p032.AbstractC6318;
import p035.AbstractC6340;
import p392.AbstractC9121;
import p392.C9117;
import p392.C9125;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        return AbstractC6340.f17460.getResources().getIdentifier(str, "id", AbstractC6340.f17465);
    }

    public static Context getAppInterfaceContext() {
        Object objWaitAppInterface = waitAppInterface();
        C9125 c9125M14679 = C9125.m14679(objWaitAppInterface);
        c9125M14679.f25504 = "getApp";
        return (Context) c9125M14679.m14682(objWaitAppInterface, new Object[0]);
    }

    public static Object getAppRuntime() {
        try {
            return AbstractC6314.m11819(AbstractC6314.m11815(AbstractC6318.m11838("com.tencent.common.app.BaseApplicationImpl"), AbstractC6318.m11838("com.tencent.common.app.BaseApplicationImpl"), "getApplication", new Class[0]).invoke(null, null), "getRuntime", AbstractC6318.m11838("mqq.app.AppRuntime"), new Class[0], new Object[0]);
        } catch (Exception e) {
            C5919.m11252(e);
            return null;
        }
    }

    public static String getCurrentAccountNickName() {
        try {
            Object appRuntime = getAppRuntime();
            if (appRuntime == null) {
                return null;
            }
            HashMap map = AbstractC6314.f17407;
            return (String) AbstractC6314.m11815(appRuntime.getClass(), String.class, "getCurrentNickname", new Class[0]).invoke(appRuntime, null);
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
            HashMap map = AbstractC6314.f17407;
            return (String) AbstractC6314.m11815(appRuntime.getClass(), String.class, "getCurrentAccountUin", new Class[0]).invoke(appRuntime, null);
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
            String strM6668 = "getLongAccountUin";
            HashMap map = AbstractC6314.f17407;
            return ((Long) AbstractC6314.m11815(appRuntime.getClass(), Long.TYPE, strM6668, new Class[0]).invoke(appRuntime, null)).longValue();
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
            String strM6668 = "getManager";
            Class clsM11838 = AbstractC6318.m11838("mqq.manager.Manager");
            Class[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i)};
            HashMap map = AbstractC6314.f17407;
            return AbstractC6314.m11815(appRuntime.getClass(), clsM11838, strM6668, clsArr).invoke(appRuntime, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPSkey(String str) {
        try {
            return (String) AbstractC6314.m11819(getManager(2), "getPskey", String.class, new Class[]{String.class, String.class}, getCurrentUin(), str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getQRouteApi(Class<?> cls) {
        String strM6668 = "com.tencent.mobileqq.qroute.QRoute";
        HashMap map = AbstractC6314.f17407;
        try {
            return AbstractC6314.m11821(AbstractC6318.m11838(strM6668), "api", new Class[]{Class.class}).invoke(null, cls);
        } catch (IllegalAccessException e) {
            C5919.m11252(e);
            return null;
        } catch (InvocationTargetException e2) {
            C5919.m11252(e2);
            return null;
        }
    }

    public static String getRealSkey() {
        try {
            return (String) AbstractC6314.m11819(getManager(2), "getRealSkey", String.class, new Class[]{String.class}, getCurrentUin());
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getRunningService(Class<?> cls, String str) {
        try {
            return AbstractC6314.m11817(getAppRuntime(), "getRuntimeService", new Class[]{Class.class, String.class}, cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getRuntimeService(Class<?> cls, String str) {
        try {
            return AbstractC6314.m11817(peekAppRuntimeOrNull(), "getRuntimeService", new Class[]{Class.class, String.class}, cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getUidFromUin(String str) {
        return (String) XposedHelpers.callMethod(AbstractC6136.m11554(-3937595179192812967L), "getUidFromUin", new Object[]{str});
    }

    public static String getUinFromUid(String str) {
        return (String) XposedHelpers.callMethod(AbstractC6136.m11554(-3937595179192812967L), "getUinFromUid", new Object[]{str});
    }

    public static Object peekAppRuntimeOrNull() {
        try {
            String strM6668 = "mqq.app.MobileQQ";
            int i = C9117.f25488;
            C9117 c9117M14648 = C9117.m14648(AbstractC9121.m14657(strM6668));
            c9117M14648.f25490 = "sMobileQQ";
            Object objM14653 = c9117M14648.m14653(null);
            C9125 c9125M14679 = C9125.m14679(objM14653);
            c9125M14679.f25504 = "peekAppRuntime";
            return c9125M14679.m14682(objM14653, new Object[0]);
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
