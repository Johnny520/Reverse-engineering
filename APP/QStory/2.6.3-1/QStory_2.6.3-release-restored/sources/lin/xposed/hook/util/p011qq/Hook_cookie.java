package lin.xposed.hook.util.p011qq;

import android.util.Log;
import androidx.activity.AbstractC0900;
import androidx.compose.runtime.internal.C2080;
import com.google.protobuf.DescriptorProtos$Edition;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import p026.AbstractC7017;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        String string = "";
        for (int i = 0; i < binaryString.length(); i++) {
            char cCharAt = binaryString.charAt(i);
            StringBuilder sbM700 = AbstractC0900.m700(string);
            sbM700.append((i != 0 && i % 2 == 0) ? (cCharAt % 2 == 0 ? "1" : "0") : Character.valueOf(cCharAt));
            string = sbM700.toString();
        }
        return Long.parseLong(string, 2);
    }

    public static String getMyuin() {
        try {
            return (String) XposedHelpers.callMethod(getRuntime(), "getCurrentAccountUin", new Object[0]);
        } catch (Exception e) {
            Log.d("报错:getMyuin()", String.valueOf(e));
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
            return (String) XposedHelpers.callMethod(AbstractC7166.m12425("com.tencent.mobileqq.qwallet.ipc.impl.ComIPCUtilsImpl").newInstance(), "getFriendNickName", new Class[]{String.class}, new Object[]{str});
        } catch (Exception e) {
            Log.d("报错:getName", String.valueOf(e));
            return str;
        }
    }

    public static String getPskey(String str) {
        try {
            Object runningService = QQEnvTool.getRunningService(AbstractC7166.m12425("com.tencent.mobileqq.pskey.api.IPskeyManager"), "all");
            if (runningService == null) {
                return null;
            }
            C7164 c7164M12413 = C7164.m12413(runningService.getClass());
            String strM14531 = "getPskey";
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3964 = new Class[]{String[].class, Object.class};
            c2080.f3962 = Void.TYPE;
            Method methodM12414 = c7164M12413.m12414();
            CompletableFuture completableFuture = new CompletableFuture();
            methodM12414.invoke(runningService, new String[]{str}, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{methodM12414.getParameterTypes()[1]}, new C6390(completableFuture, 0)));
            return (String) ((Map) completableFuture.get(5L, TimeUnit.SECONDS)).get(str);
        } catch (Exception e) {
            AbstractC7017.m12163(e, "报错:getPskey()");
            return null;
        }
    }

    public static String getPt4Token(String str) {
        return (String) XposedHelpers.callMethod(getTicketManager(2), "getPt4Token", new Class[]{String.class, String.class}, new Object[]{getMyuin(), str});
    }

    public static Object getQQAppInterface() {
        try {
            return XposedHelpers.callStaticMethod(AbstractC7166.m12425("com.tencent.biz.g.e.a.a"), "a", new Object[0]);
        } catch (Exception e) {
            Log.d("报错:getQQAppInterface", String.valueOf(e));
            return null;
        }
    }

    public static Object getRuntime() {
        try {
            return XposedHelpers.callMethod(XposedHelpers.callStaticMethod(AbstractC7166.m12425("com.tencent.common.app.BaseApplicationImpl"), "getApplication", new Object[0]), "getRuntime", new Object[0]);
        } catch (Exception e) {
            String strM14531 = "报错:getRuntime()";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return null;
        }
    }

    public static String getSkey() {
        try {
            return (String) XposedHelpers.callMethod(getTicketManager(2), "getSkey", new Class[]{String.class}, new Object[]{getMyuin()});
        } catch (Exception e) {
            Log.d("报错:getSkey()", String.valueOf(e));
            return null;
        }
    }

    public static String getStweb() {
        try {
            return (String) XposedHelpers.callMethod(getTicketManager(2), "getStweb", new Class[]{String.class}, new Object[]{getMyuin()});
        } catch (Exception e) {
            Log.d("报错:getStweb()", String.valueOf(e));
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
        AbstractC7017.m12163(objArr[0], "异常：getPskey()");
        return null;
    }
}
