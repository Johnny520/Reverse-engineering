package lin.xposed.hook.util.qq;

import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import p010.AbstractC6157;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class Hook_cookie {
    public static long getBkn(String str) {
        int length = str.length();
        int iCharAt = 5381;
        for (int i = 0; i < length; i++) {
            iCharAt += str.charAt(i) + (iCharAt << 5);
        }
        return Integer.MAX_VALUE & iCharAt;
    }

    public static String getG_TK(String str) {
        String pskey = getPskey(str);
        int iCharAt = 5381;
        for (int i = 0; i < pskey.length(); i++) {
            iCharAt += pskey.charAt(i) + (iCharAt << 5);
        }
        return String.valueOf(Integer.MAX_VALUE & iCharAt);
    }

    public static long getMyKey() {
        String binaryString = Long.toBinaryString(Long.parseLong(String.valueOf(XposedHelpers.callMethod(getRuntime(), "getCurrentAccountUin", new Object[0]))) * 2);
        String strM6668 = "";
        for (int i = 0; i < binaryString.length(); i++) {
            char cCharAt = binaryString.charAt(i);
            StringBuilder sbM149 = AbstractC0053.m149(strM6668);
            sbM149.append((i != 0 && i % 2 == 0) ? AbstractC3056.m6668(cCharAt % 2 == 0 ? -3937595638754313639L : -3937561652678100391L) : Character.valueOf(cCharAt));
            strM6668 = sbM149.toString();
        }
        return Long.parseLong(strM6668, 2);
    }

    public static String getMyuin() {
        try {
            return (String) XposedHelpers.callMethod(getRuntime(), "getCurrentAccountUin", new Object[0]);
        } catch (Exception e) {
            Log.d("\u62a5\u9519:getMyuin()", String.valueOf(e));
            return null;
        }
    }

    public static String getMyuinO2() {
        String myuin = getMyuin();
        while (myuin.length() < 10) {
            myuin = "0".concat(myuin);
        }
        return "o".concat(myuin);
    }

    public static String getName(String str) {
        try {
            return (String) XposedHelpers.callMethod(AbstractC6318.m11838("com.tencent.mobileqq.qwallet.ipc.impl.ComIPCUtilsImpl").newInstance(), "getFriendNickName", new Class[]{String.class}, new Object[]{str});
        } catch (Exception e) {
            Log.d("\u62a5\u9519:getName", String.valueOf(e));
            return str;
        }
    }

    public static String getPskey(String str) {
        try {
            Object runningService = QQEnvTool.getRunningService(AbstractC6318.m11838("com.tencent.mobileqq.pskey.api.IPskeyManager"), "all");
            if (runningService == null) {
                return null;
            }
            C6316 c6316M11826 = C6316.m11826(runningService.getClass());
            String strM6668 = "getPskey";
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{String[].class, Object.class};
            c1245.f3616 = Void.TYPE;
            Method methodM11827 = c6316M11826.m11827();
            CompletableFuture completableFuture = new CompletableFuture();
            methodM11827.invoke(runningService, new String[]{str}, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{methodM11827.getParameterTypes()[1]}, new C5558(completableFuture, 0)));
            return (String) ((Map) completableFuture.get(5L, TimeUnit.SECONDS)).get(str);
        } catch (Exception e) {
            AbstractC6157.m11573(e, "\u62a5\u9519:getPskey()");
            return null;
        }
    }

    public static String getPt4Token(String str) {
        return (String) XposedHelpers.callMethod(getTicketManager(2), "getPt4Token", new Class[]{String.class, String.class}, new Object[]{getMyuin(), str});
    }

    public static Object getQQAppInterface() {
        try {
            return XposedHelpers.callStaticMethod(AbstractC6318.m11838("com.tencent.biz.g.e.a.a"), "a", new Object[0]);
        } catch (Exception e) {
            Log.d("\u62a5\u9519:getQQAppInterface", String.valueOf(e));
            return null;
        }
    }

    public static Object getRuntime() {
        try {
            return XposedHelpers.callMethod(XposedHelpers.callStaticMethod(AbstractC6318.m11838("com.tencent.common.app.BaseApplicationImpl"), "getApplication", new Object[0]), "getRuntime", new Object[0]);
        } catch (Exception e) {
            String strM6668 = "\u62a5\u9519:getRuntime()";
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return null;
        }
    }

    public static String getSkey() {
        try {
            return (String) XposedHelpers.callMethod(getTicketManager(2), "getSkey", new Class[]{String.class}, new Object[]{getMyuin()});
        } catch (Exception e) {
            Log.d("\u62a5\u9519:getSkey()", String.valueOf(e));
            return null;
        }
    }

    public static String getStweb() {
        try {
            return (String) XposedHelpers.callMethod(getTicketManager(2), "getStweb", new Class[]{String.class}, new Object[]{getMyuin()});
        } catch (Exception e) {
            Log.d("\u62a5\u9519:getStweb()", String.valueOf(e));
            return null;
        }
    }

    public static Object getTicketManager(int i) {
        return XposedHelpers.callMethod(getRuntime(), "getManager", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getPskey$0(CompletableFuture completableFuture, Object obj, Method method, Object[] objArr) {
        if (method.getParameterTypes()[0] == Map.class) {
            completableFuture.complete((Map) objArr[0]);
            return null;
        }
        AbstractC6157.m11573(objArr[0], "\u5f02\u5e38\uff1agetPskey()");
        return null;
    }
}
