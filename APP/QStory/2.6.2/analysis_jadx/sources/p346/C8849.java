package p346;

import com.bumptech.glide.AbstractC3056;
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
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.util.qq.C5557;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p010.RunnableC6155;
import p032.AbstractC6318;
import p035.AbstractC6340;
import p087.C7076;
import p087.C7134;
import p316.C8675;
import p391.C9114;
import p392.AbstractC9121;
import p392.AbstractC9124;
import p392.C9117;
import p392.C9119;
import p392.C9125;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8849 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f24953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9114 f24954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8849 f24955;

    static {
        AbstractC3056.m6668(-3937277351612908967L);
        f24955 = new C8849();
        f24954 = new C9114(AbstractC3056.m6668(-3937275891324028327L), 0);
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        AbstractC3056.m6668(-3937275826899518887L);
        setNewSetFromMap.getClass();
        f24953 = setNewSetFromMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final String m14477(String str, String str2) {
        if (str != null && str2 != null) {
            C8849 c8849 = f24955;
            c8849.getClass();
            String strM14482 = m14482(str, str2);
            boolean zM8917 = AbstractC4394.m8917(new SimpleDateFormat(AbstractC3056.m6668(-3937683122943165863L), Locale.getDefault()).format(new Date()), f24954.m14641(m14484(str).concat(AbstractC3056.m6668(-3937678720601687463L)), AbstractC3056.m6668(-3937561652678100391L)));
            if (zM8917 && strM14482 != null) {
                return strM14482;
            }
            if (!zM8917) {
                if (f24953.add(str)) {
                    new Thread(new RunnableC6155(str, 3), AbstractC3056.m6668(-3937276664418141607L).concat(str)).start();
                }
                if (strM14482 != null) {
                    return strM14482;
                }
            }
            try {
                String strM14478 = m14478(m14481(str, str2));
                if (m14485(strM14478, str2)) {
                    strM14478.getClass();
                    c8849.m14486(str, str2, strM14478);
                    return strM14478;
                }
            } catch (Exception e) {
                String strM6668 = AbstractC3056.m6668(-3937277351612908967L);
                String str3 = AbstractC6157.f16779;
                AbstractC6157.m11574(strM6668, e.toString(), e, true);
            }
            String strM144822 = m14482(str, str2);
            if (strM144822 != null) {
                return strM144822;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m14478(Object obj) {
        if (obj != null) {
            Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937277042375263655L));
            clsM14657.getClass();
            Object objM14649 = C9117.m14649(clsM14657, AbstractC3056.m6668(-3937651146911647143L), obj);
            Object objM146492 = C9117.m14649(String.class, AbstractC3056.m6668(-3937276819036964263L), objM14649);
            String str = objM146492 instanceof String ? (String) objM146492 : null;
            if (str != null && str.length() != 0) {
                return str;
            }
            Object objM146493 = C9117.m14649(String.class, AbstractC3056.m6668(-3937276724547683751L), objM14649);
            String str2 = objM146493 instanceof String ? (String) objM146493 : null;
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            Object objM146494 = C9117.m14649(String.class, AbstractC3056.m6668(-3937651082487137703L), objM14649);
            String str3 = objM146494 instanceof String ? (String) objM146494 : null;
            if (str3 != null && str3.length() != 0) {
                return str3;
            }
            Object objM146495 = C9117.m14649(String.class, AbstractC3056.m6668(-3937586675157566887L), objM14649);
            if (objM146495 instanceof String) {
                return (String) objM146495;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Method m14479() {
        C9125 c9125M14680 = C9125.m14680(QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937651546343605671L))).getClass());
        c9125M14680.f25504 = AbstractC3056.m6668(-3937277536296502695L);
        c9125M14680.f25506 = Void.TYPE;
        c9125M14680.m14683(String.class, AbstractC6318.m11838(AbstractC3056.m6668(-3937667059765478823L)), Boolean.TYPE, String.class, AbstractC9124.class);
        return (Method) c9125M14680.m14686();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01ca A[Catch: Exception -> 0x0197, TRY_LEAVE, TryCatch #2 {Exception -> 0x0197, blocks: (B:11:0x0079, B:14:0x0081, B:15:0x0090, B:17:0x009b, B:23:0x013f, B:22:0x0129, B:26:0x0199, B:27:0x01a8, B:29:0x01ae, B:31:0x01be, B:32:0x01c4, B:34:0x01ca, B:19:0x010d), top: B:42:0x0079, inners: #1 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList m14480(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p346.C8849.m14480(java.lang.String):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m14481(String str, String str2) {
        String str3;
        String str4;
        Exception e = null;
        int i = 1;
        while (i < 4) {
            try {
                CompletableFuture completableFuture = new CompletableFuture();
                Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937651546343605671L)));
                C9125 c9125M14680 = C9125.m14680(qRouteApi.getClass());
                c9125M14680.f25504 = AbstractC3056.m6668(-3937667244449072551L);
                c9125M14680.f25506 = Void.TYPE;
                c9125M14680.m14683(String.class, String.class, Boolean.TYPE, AbstractC6318.m11838(AbstractC3056.m6668(-3937667059765478823L)), String.class, AbstractC9124.class);
                Method method = (Method) c9125M14680.m14686();
                Class<?>[] parameterTypes = method.getParameterTypes();
                str3 = str;
                str4 = str2;
                try {
                    method.invoke(qRouteApi, str3, str4, Boolean.TRUE, null, AbstractC3056.m6668(-3937666930916459943L), Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{parameterTypes[parameterTypes.length - 1]}, new C5557(completableFuture, qRouteApi, 3)));
                    return completableFuture.get(5L, TimeUnit.SECONDS);
                } catch (Exception e2) {
                    e = e2;
                    i++;
                    str = str3;
                    str2 = str4;
                }
            } catch (Exception e3) {
                e = e3;
                str3 = str;
                str4 = str2;
            }
        }
        if (e != null) {
            String strM6668 = AbstractC3056.m6668(-3937277351612908967L);
            String str5 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14482(String str, String str2) {
        String str3;
        String strM14484 = m14484(str);
        C7134 c7134 = C7134.f19094;
        Map map = (Map) f24954.m14642(strM14484, C8675.m14355(new C7076(c7134, c7134, 1)));
        if (map == null || !map.containsKey(str2) || (str3 = (String) map.get(str2)) == null || str3.length() == 0) {
            return null;
        }
        return str3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m14483(String str, String str2) {
        AbstractC6136.m11546(-3937824753784718759L, -3937586675157566887L, str);
        str2.getClass();
        Object objWaitAppInterface = QQEnvTool.waitAppInterface();
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937667489262208423L));
        C9119 c9119 = new C9119();
        c9119.f25514 = clsM11838;
        if (c9119.f25513 == null) {
            c9119.f25513 = clsM11838.getName();
        }
        c9119.f25494 = new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937667643881031079L))};
        c9119.f25493 = 1;
        Object objM14656 = c9119.m14656(objWaitAppInterface);
        int i = AbstractC6340.f17461;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        if (i >= 13350) {
            C9125 c9125M14680 = C9125.m14680(clsM11838);
            c9125M14680.m14683(String.class, String.class, cls2, cls);
        } else if (i >= 12290) {
            C9125 c9125M146802 = C9125.m14680(clsM11838);
            c9125M146802.m14683(cls2, String.class, String.class, cls);
        } else {
            C9125 c9125M146803 = C9125.m14680(clsM11838);
            c9125M146803.m14683(String.class, String.class, cls2, cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m14484(String str) {
        return AbstractC6136.m11557(-3937276587108730279L, new StringBuilder(), str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m14485(String str, String str2) {
        return (str == null || str.length() == 0 || str.equals(str2)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14486(String str, String str2, String str3) {
        if (m14485(str3, str2)) {
            synchronized (this) {
                try {
                    C9114 c9114 = f24954;
                    f24955.getClass();
                    String strM14484 = m14484(str);
                    C7134 c7134 = C7134.f19094;
                    Map linkedHashMap = (Map) c9114.m14642(strM14484, C8675.m14355(new C7076(c7134, c7134, 1)));
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    linkedHashMap.put(str2, str3);
                    c9114.m14640(linkedHashMap, m14484(str));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
