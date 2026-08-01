package p346;

import io.ktor.client.plugins.AbstractC3933;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.util.qq.C5558;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6188;
import p010.RunnableC6186;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p087.C7077;
import p087.C7135;
import p287.AbstractC8405;
import p316.C8667;
import p389.AbstractC9090;
import p389.C9086;
import p389.C9088;
import p389.C9092;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f24938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9095 f24939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8836 f24940;

    static {
        AbstractC8405.m13972(2833);
        f24940 = new C8836();
        f24939 = new C9095(AbstractC8405.m13972(2850), 0);
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        AbstractC8405.m13972(2851);
        setNewSetFromMap.getClass();
        f24938 = setNewSetFromMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final String m14492(String str, String str2) {
        if (str != null && str2 != null) {
            C8836 c8836 = f24940;
            c8836.getClass();
            String strM14497 = m14497(str, str2);
            boolean zM8907 = AbstractC4395.m8907(new SimpleDateFormat(AbstractC8405.m13972(1168), Locale.getDefault()).format(new Date()), f24939.m14678(m14499(str).concat(AbstractC8405.m13973("喵喵呜喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵")), AbstractC8405.m13973("喵呜喵喵喵喵呜呜")));
            if (zM8907 && strM14497 != null) {
                return strM14497;
            }
            if (!zM8907) {
                if (f24938.add(str)) {
                    new Thread(new RunnableC6186(str, 4), AbstractC8405.m13972(2843).concat(str)).start();
                }
                if (strM14497 != null) {
                    return strM14497;
                }
            }
            try {
                String strM14493 = m14493(m14496(str, str2));
                if (m14500(strM14493, str2)) {
                    strM14493.getClass();
                    c8836.m14501(str, str2, strM14493);
                    return strM14493;
                }
            } catch (Exception e) {
                String strM13972 = AbstractC8405.m13972(2833);
                String str3 = AbstractC6188.f17016;
                AbstractC6188.m11605(strM13972, e.toString(), e, true);
            }
            String strM144972 = m14497(str, str2);
            if (strM144972 != null) {
                return strM144972;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m14493(Object obj) {
        if (obj != null) {
            Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(2840));
            clsM14669.getClass();
            Object objM14663 = C9086.m14663(clsM14669, AbstractC8405.m13972(991), obj);
            Object objM146632 = C9086.m14663(String.class, AbstractC8405.m13972(2841), objM14663);
            String str = objM146632 instanceof String ? (String) objM146632 : null;
            if (str != null && str.length() != 0) {
                return str;
            }
            Object objM146633 = C9086.m14663(String.class, AbstractC8405.m13972(2842), objM14663);
            String str2 = objM146633 instanceof String ? (String) objM146633 : null;
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            Object objM146634 = C9086.m14663(String.class, AbstractC8405.m13972(992), objM14663);
            String str3 = objM146634 instanceof String ? (String) objM146634 : null;
            if (str3 != null && str3.length() != 0) {
                return str3;
            }
            Object objM146635 = C9086.m14663(String.class, AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), objM14663);
            if (objM146635 instanceof String) {
                return (String) objM146635;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Method m14494() {
        C9092 c9092M14672 = C9092.m14672(QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(988))).getClass());
        c9092M14672.f25481 = AbstractC8405.m13972(2832);
        c9092M14672.f25483 = Void.TYPE;
        c9092M14672.m14675(String.class, AbstractC6337.m11866(AbstractC8405.m13972(1005)), Boolean.TYPE, String.class, C8667.class);
        return (Method) c9092M14672.m14605();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0192 A[Catch: Exception -> 0x015f, TRY_LEAVE, TryCatch #0 {Exception -> 0x015f, blocks: (B:11:0x006b, B:14:0x0073, B:15:0x007f, B:17:0x0087, B:23:0x0113, B:22:0x00fd, B:26:0x0161, B:27:0x0170, B:29:0x0176, B:31:0x0186, B:32:0x018c, B:34:0x0192, B:19:0x00e4), top: B:38:0x006b, inners: #1 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList m14495(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p346.C8836.m14495(java.lang.String):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m14496(String str, String str2) {
        String str3;
        String str4;
        CompletableFuture completableFuture;
        Object qRouteApi;
        Method method;
        Class<?>[] parameterTypes;
        Exception e = null;
        int i = 1;
        while (i < 4) {
            try {
                completableFuture = new CompletableFuture();
                qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(988)));
                C9092 c9092M14672 = C9092.m14672(qRouteApi.getClass());
                c9092M14672.f25481 = AbstractC8405.m13972(1004);
                c9092M14672.f25483 = Void.TYPE;
                c9092M14672.m14675(String.class, String.class, Boolean.TYPE, AbstractC6337.m11866(AbstractC8405.m13972(1005)), String.class, C8667.class);
                method = (Method) c9092M14672.m14605();
                parameterTypes = method.getParameterTypes();
                str3 = str;
                str4 = str2;
            } catch (Exception e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
            try {
                method.invoke(qRouteApi, str3, str4, Boolean.TRUE, null, AbstractC8405.m13972(1006), Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{parameterTypes[parameterTypes.length - 1]}, new C5558(completableFuture, qRouteApi, 3)));
                return completableFuture.get(5L, TimeUnit.SECONDS);
            } catch (Exception e3) {
                e = e3;
                i++;
                str = str3;
                str2 = str4;
            }
        }
        if (e != null) {
            String strM13972 = AbstractC8405.m13972(2833);
            String str5 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14497(String str, String str2) {
        String str3;
        String strM14499 = m14499(str);
        C7135 c7135 = C7135.f19089;
        Map map = (Map) f24939.m14679(strM14499, AbstractC3933.m8313(new C7077(c7135, c7135, 1)));
        if (map == null || !map.containsKey(str2) || (str3 = (String) map.get(str2)) == null || str3.length() == 0) {
            return null;
        }
        return str3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m14498(String str, String str2) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜");
        str.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
        str2.getClass();
        Object objWaitAppInterface = QQEnvTool.waitAppInterface();
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1003));
        C9088 c9088 = new C9088();
        c9088.f25271 = clsM11866;
        if (c9088.f25270 == null) {
            c9088.f25270 = clsM11866.getName();
        }
        c9088.f25474 = new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(1002))};
        c9088.f25473 = 1;
        Object objM14668 = c9088.m14668(objWaitAppInterface);
        int i = AbstractC6358.f17508;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        if (i >= 13350) {
            C9092 c9092M14672 = C9092.m14672(clsM11866);
            c9092M14672.m14675(String.class, String.class, cls2, cls);
        } else if (i >= 12290) {
            C9092 c9092M146722 = C9092.m14672(clsM11866);
            c9092M146722.m14675(cls2, String.class, String.class, cls);
        } else {
            C9092 c9092M146723 = C9092.m14672(clsM11866);
            c9092M146723.m14675(String.class, String.class, cls2, cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m14499(String str) {
        return AbstractC8405.m13972(2844) + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m14500(String str, String str2) {
        return (str == null || str.length() == 0 || str.equals(str2)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14501(String str, String str2, String str3) {
        if (m14500(str3, str2)) {
            synchronized (this) {
                try {
                    C9095 c9095 = f24939;
                    f24940.getClass();
                    String strM14499 = m14499(str);
                    C7135 c7135 = C7135.f19089;
                    Map linkedHashMap = (Map) c9095.m14679(strM14499, AbstractC3933.m8313(new C7077(c7135, c7135, 1)));
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    linkedHashMap.put(str2, str3);
                    c9095.m14677(linkedHashMap, m14499(str));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
