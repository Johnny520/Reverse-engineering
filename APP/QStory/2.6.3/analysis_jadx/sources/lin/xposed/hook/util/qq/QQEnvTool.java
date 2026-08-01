package lin.xposed.hook.util.qq;

import android.content.Context;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import p009.AbstractC6183;
import p033.AbstractC6333;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p389.C9086;
import p389.C9092;
import top.suzhelan.qstory.hook.item.C5925;

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
        return AbstractC6358.f17507.getResources().getIdentifier(str, AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"), AbstractC6358.f17512);
    }

    public static Context getAppInterfaceContext() {
        Object objWaitAppInterface = waitAppInterface();
        C9092 c9092M14671 = C9092.m14671(objWaitAppInterface);
        c9092M14671.f25481 = AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵");
        return (Context) c9092M14671.m14674(objWaitAppInterface, new Object[0]);
    }

    public static Object getAppRuntime() {
        try {
            return AbstractC6333.m11847(AbstractC6333.m11843(AbstractC6337.m11866(AbstractC8405.m13972(72)), AbstractC6337.m11866(AbstractC8405.m13972(72)), AbstractC8405.m13972(897), new Class[0]).invoke(null, null), AbstractC8405.m13972(898), AbstractC6337.m11866(AbstractC8405.m13972(118)), new Class[0], new Object[0]);
        } catch (Exception e) {
            C5925.m11313(e);
            return null;
        }
    }

    public static String getCurrentAccountNickName() {
        try {
            Object appRuntime = getAppRuntime();
            if (appRuntime == null) {
                return null;
            }
            HashMap map = AbstractC6333.f17456;
            return (String) AbstractC6333.m11843(appRuntime.getClass(), String.class, AbstractC8405.m13972(941), new Class[0]).invoke(appRuntime, null);
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
            HashMap map = AbstractC6333.f17456;
            return (String) AbstractC6333.m11843(appRuntime.getClass(), String.class, AbstractC8405.m13972(905), new Class[0]).invoke(appRuntime, null);
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
            String strM13972 = AbstractC8405.m13972(939);
            HashMap map = AbstractC6333.f17456;
            return ((Long) AbstractC6333.m11843(appRuntime.getClass(), Long.TYPE, strM13972, new Class[0]).invoke(appRuntime, null)).longValue();
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
            String strM13972 = AbstractC8405.m13972(907);
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(940));
            Class[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i)};
            HashMap map = AbstractC6333.f17456;
            return AbstractC6333.m11843(appRuntime.getClass(), clsM11866, strM13972, clsArr).invoke(appRuntime, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPSkey(String str) {
        try {
            return (String) AbstractC6333.m11847(getManager(2), AbstractC8405.m13972(649), String.class, new Class[]{String.class, String.class}, getCurrentUin(), str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getQRouteApi(Class<?> cls) {
        String strM13972 = AbstractC8405.m13972(938);
        HashMap map = AbstractC6333.f17456;
        try {
            return AbstractC6333.m11849(AbstractC6337.m11866(strM13972), AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵呜喵喵呜呜"), new Class[]{Class.class}).invoke(null, cls);
        } catch (IllegalAccessException e) {
            C5925.m11313(e);
            return null;
        } catch (InvocationTargetException e2) {
            C5925.m11313(e2);
            return null;
        }
    }

    public static String getRealSkey() {
        try {
            return (String) AbstractC6333.m11847(getManager(2), AbstractC8405.m13972(648), String.class, new Class[]{String.class}, getCurrentUin());
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getRunningService(Class<?> cls, String str) {
        try {
            return AbstractC6333.m11845(getAppRuntime(), AbstractC8405.m13972(936), new Class[]{Class.class, String.class}, cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object getRuntimeService(Class<?> cls, String str) {
        try {
            return AbstractC6333.m11845(peekAppRuntimeOrNull(), AbstractC8405.m13972(936), new Class[]{Class.class, String.class}, cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getUidFromUin(String str) {
        return (String) XposedHelpers.callMethod(AbstractC6183.m11587(316), AbstractC8405.m13972(937), new Object[]{str});
    }

    public static String getUinFromUid(String str) {
        return (String) XposedHelpers.callMethod(AbstractC6183.m11587(316), AbstractC8405.m13972(318), new Object[]{str});
    }

    public static Object peekAppRuntimeOrNull() {
        try {
            String strM13972 = AbstractC8405.m13972(332);
            int i = C9086.f25468;
            C9086 c9086M14662 = C9086.m14662(AbstractC9090.m14669(strM13972));
            c9086M14662.f25470 = AbstractC8405.m13972(402);
            Object objM14665 = c9086M14662.m14665(null);
            C9092 c9092M14671 = C9092.m14671(objM14665);
            c9092M14671.f25481 = AbstractC8405.m13972(942);
            return c9092M14671.m14674(objM14665, new Object[0]);
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
