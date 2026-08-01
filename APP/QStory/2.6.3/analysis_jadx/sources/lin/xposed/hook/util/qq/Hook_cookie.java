package lin.xposed.hook.util.qq;

import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import com.google.protobuf.DescriptorProtos$Edition;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import p010.AbstractC6188;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

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
        String binaryString = Long.toBinaryString(Long.parseLong(String.valueOf(XposedHelpers.callMethod(getRuntime(), AbstractC8405.m13972(905), new Object[0]))) * 2);
        String string = "";
        for (int i = 0; i < binaryString.length(); i++) {
            char cCharAt = binaryString.charAt(i);
            StringBuilder sbM140 = AbstractC0053.m140(string);
            sbM140.append((i != 0 && i % 2 == 0) ? AbstractC8405.m13973(cCharAt % 2 == 0 ? "喵呜喵喵喵喵呜喵" : "喵呜喵喵喵喵呜呜") : Character.valueOf(cCharAt));
            string = sbM140.toString();
        }
        return Long.parseLong(string, 2);
    }

    public static String getMyuin() {
        try {
            return (String) XposedHelpers.callMethod(getRuntime(), AbstractC8405.m13972(905), new Object[0]);
        } catch (Exception e) {
            Log.d(AbstractC8405.m13972(906), String.valueOf(e));
            return null;
        }
    }

    public static String getMyuinO2() {
        String myuin = getMyuin();
        while (myuin.length() < 10) {
            myuin = AbstractC8405.m13973("喵呜喵喵喵喵呜呜").concat(myuin);
        }
        return AbstractC8405.m13973("喵喵喵呜呜呜喵喵").concat(myuin);
    }

    public static String getName(String str) {
        try {
            return (String) XposedHelpers.callMethod(AbstractC6337.m11866(AbstractC8405.m13972(902)).newInstance(), AbstractC8405.m13972(903), new Class[]{String.class}, new Object[]{str});
        } catch (Exception e) {
            Log.d(AbstractC8405.m13972(904), String.valueOf(e));
            return str;
        }
    }

    public static String getPskey(String str) {
        try {
            Object runningService = QQEnvTool.getRunningService(AbstractC6337.m11866(AbstractC8405.m13972(911)), AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜呜喵"));
            if (runningService == null) {
                return null;
            }
            C6335 c6335M11854 = C6335.m11854(runningService.getClass());
            String strM13972 = AbstractC8405.m13972(649);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            c1245.f3619 = new Class[]{String[].class, Object.class};
            c1245.f3617 = Void.TYPE;
            Method methodM11855 = c6335M11854.m11855();
            CompletableFuture completableFuture = new CompletableFuture();
            methodM11855.invoke(runningService, new String[]{str}, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{methodM11855.getParameterTypes()[1]}, new C5559(completableFuture, 0)));
            return (String) ((Map) completableFuture.get(5L, TimeUnit.SECONDS)).get(str);
        } catch (Exception e) {
            AbstractC6188.m11604(e, AbstractC8405.m13972(912));
            return null;
        }
    }

    public static String getPt4Token(String str) {
        return (String) XposedHelpers.callMethod(getTicketManager(2), AbstractC8405.m13972(913), new Class[]{String.class, String.class}, new Object[]{getMyuin(), str});
    }

    public static Object getQQAppInterface() {
        try {
            return XposedHelpers.callStaticMethod(AbstractC6337.m11866(AbstractC8405.m13972(DescriptorProtos$Edition.EDITION_LEGACY_VALUE)), AbstractC8405.m13973("喵喵喵呜喵喵呜喵"), new Object[0]);
        } catch (Exception e) {
            Log.d(AbstractC8405.m13972(901), String.valueOf(e));
            return null;
        }
    }

    public static Object getRuntime() {
        try {
            return XposedHelpers.callMethod(XposedHelpers.callStaticMethod(AbstractC6337.m11866(AbstractC8405.m13972(72)), AbstractC8405.m13972(897), new Object[0]), AbstractC8405.m13972(898), new Object[0]);
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(899);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
            return null;
        }
    }

    public static String getSkey() {
        try {
            return (String) XposedHelpers.callMethod(getTicketManager(2), AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜呜呜喵呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), new Class[]{String.class}, new Object[]{getMyuin()});
        } catch (Exception e) {
            Log.d(AbstractC8405.m13972(910), String.valueOf(e));
            return null;
        }
    }

    public static String getStweb() {
        try {
            return (String) XposedHelpers.callMethod(getTicketManager(2), AbstractC8405.m13972(908), new Class[]{String.class}, new Object[]{getMyuin()});
        } catch (Exception e) {
            Log.d(AbstractC8405.m13972(909), String.valueOf(e));
            return null;
        }
    }

    public static Object getTicketManager(int i) {
        return XposedHelpers.callMethod(getRuntime(), AbstractC8405.m13972(907), new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getPskey$0(CompletableFuture completableFuture, Object obj, Method method, Object[] objArr) {
        if (method.getParameterTypes()[0] == Map.class) {
            completableFuture.complete((Map) objArr[0]);
            return null;
        }
        AbstractC6188.m11604(objArr[0], AbstractC8405.m13972(914));
        return null;
    }
}
