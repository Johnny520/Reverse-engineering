package lin.xposed.hook.util.qq;

import android.content.Context;
import android.os.Handler;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.javaplugin.bean.GroupBanInfo;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTTroopTool {
    private static Object getGroupGagInfo(String str, String str2) {
        Object runtimeService = getRuntimeService(AbstractC6318.m11838(AbstractC3056.m6668(-3937652572840789415L)));
        C6316 c6316M11826 = C6316.m11826(runtimeService.getClass());
        String strM6668 = AbstractC3056.m6668(-3937652289372947879L);
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3617 = strM6668;
        c1245.f3618 = new Class[]{String.class, String.class};
        return c6316M11826.m11828(runtimeService, str, str2);
    }

    private static Object getGroupInfo(String str) {
        Object runtimeService = getRuntimeService(AbstractC6318.m11838(AbstractC3056.m6668(-3937652572840789415L)));
        C6316 c6316M11826 = C6316.m11826(runtimeService.getClass());
        String strM6668 = AbstractC3056.m6668(-3937652336617588135L);
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3617 = strM6668;
        c1245.f3618 = new Class[]{String.class};
        return c6316M11826.m11828(runtimeService, str);
    }

    private static List<Object> getGroupListBy9_0_65() {
        return (ArrayList) XposedHelpers.callMethod(AbstractC6136.m11554(-3937652216358503847L), AbstractC3056.m6668(-3937652117574256039L), new Object[0]);
    }

    private static List<Object> getGroupListByOld() {
        return (ArrayList) XposedHelpers.callMethod(getRuntimeService(AbstractC6318.m11838(AbstractC3056.m6668(-3937652572840789415L))), AbstractC3056.m6668(-3937651928595695015L), new Object[0]);
    }

    public static String getGroupName(String str) {
        try {
            Object objInvoke = XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937657366024291751L), AbstractC6318.f17411).getDeclaredMethod(AbstractC3056.m6668(-3937657275829978535L), Class.class).invoke(null, XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937666329621038503L), AbstractC6318.f17411));
            return String.valueOf(objInvoke.getClass().getDeclaredMethod(AbstractC3056.m6668(-3937666037563262375L), XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937667643881031079L), AbstractC6318.f17411), String.class, Boolean.TYPE).invoke(objInvoke, Hook_cookie.getRuntime(), str, Boolean.TRUE));
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937640864759940519L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return str;
        }
    }

    public static Object getMemberInfo(String str, String str2) {
        int i = 1;
        try {
            CompletableFuture completableFuture = new CompletableFuture();
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937651546343605671L)));
            C6316 c6316M11826 = C6316.m11826(qRouteApi.getClass());
            String strM6668 = AbstractC3056.m6668(-3937667244449072551L);
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3616 = Void.TYPE;
            c6316M11826.f17409.f3618 = new Class[]{String.class, String.class, Boolean.TYPE, AbstractC6318.m11838(AbstractC3056.m6668(-3937667059765478823L)), String.class, Object.class};
            Method methodM11827 = c6316M11826.m11827();
            Class<?>[] parameterTypes = methodM11827.getParameterTypes();
            methodM11827.invoke(qRouteApi, str, str2, Boolean.TRUE, null, AbstractC3056.m6668(-3937666930916459943L), Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{parameterTypes[parameterTypes.length - 1]}, new C5557(completableFuture, qRouteApi, i)));
            return completableFuture.get(5L, TimeUnit.SECONDS);
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937640864759940519L);
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
            return null;
        }
    }

    public static String getMemberName(String str, String str2) {
        if (AbstractC6340.f17461 > 5844) {
            try {
                return (String) AbstractC6314.m11818(String.class, AbstractC3056.m6668(-3937666896556721575L), AbstractC6317.m11831(null, AbstractC3056.m6668(-3937651146911647143L), getMemberInfo(str, str2)));
            } catch (Exception e) {
                String strM6668 = AbstractC3056.m6668(-3937640864759940519L);
                String str3 = AbstractC6157.f16779;
                AbstractC6157.m11574(strM6668, e.toString(), e, true);
            }
        }
        try {
            Object runtimeService = getRuntimeService(XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937666776297637287L), AbstractC6318.f17411));
            return String.valueOf(runtimeService.getClass().getDeclaredMethod(AbstractC3056.m6668(-3937666600203978151L), String.class, String.class).invoke(runtimeService, str, str2));
        } catch (Exception e2) {
            String strM66682 = AbstractC3056.m6668(-3937640864759940519L);
            String str4 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e2.toString(), e2, true);
            return str2;
        }
    }

    public static List<GroupBanInfo> getProhibitList(String str) {
        long j;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = AbstractC6340.f17461;
        Class cls = Boolean.TYPE;
        if (i > 5844) {
            try {
                CompletableFuture completableFuture = new CompletableFuture();
                Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937651546343605671L)));
                if (qRouteApi != null) {
                    C6316 c6316M11826 = C6316.m11826(qRouteApi.getClass());
                    c6316M11826.f17409.f3618 = new Class[]{String.class, Object.class, cls, String.class, Object.class};
                    String strM6668 = AbstractC3056.m6668(-3937651241400927655L);
                    C1245 c1245 = c6316M11826.f17409;
                    c1245.f3617 = strM6668;
                    c1245.f3616 = Void.TYPE;
                    Method methodM11827 = c6316M11826.m11827();
                    Class<?>[] parameterTypes = methodM11827.getParameterTypes();
                    Class<?> cls2 = parameterTypes[parameterTypes.length - 1];
                    j = -3937640864759940519L;
                    try {
                        methodM11827.invoke(qRouteApi, str, null, Boolean.TRUE, AbstractC3056.m6668(-3937561979095614887L), Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{cls2}, new C5557(completableFuture, qRouteApi, 0)));
                    } catch (Exception e) {
                        e = e;
                        String strM66682 = AbstractC3056.m6668(j);
                        String str2 = AbstractC6157.f16779;
                        AbstractC6157.m11574(strM66682, e.toString(), e, true);
                    }
                } else {
                    j = -3937640864759940519L;
                }
                arrayList = (ArrayList) completableFuture.get(5L, TimeUnit.SECONDS);
                arrayList2 = arrayList;
            } catch (Exception e2) {
                e = e2;
                j = -3937640864759940519L;
            }
        } else {
            j = -3937640864759940519L;
            try {
                arrayList = (ArrayList) AbstractC6314.m11819(QQEnvTool.getManager(((Integer) AbstractC6317.m11829(AbstractC6318.m11838(AbstractC3056.m6668(-3937652882078434727L)), Integer.TYPE, AbstractC3056.m6668(-3937651207041189287L))).intValue()), null, ArrayList.class, new Class[]{String.class, cls}, str, Boolean.TRUE);
                arrayList2 = arrayList;
            } catch (Exception e3) {
                String strM66683 = AbstractC3056.m6668(-3937640864759940519L);
                String str3 = AbstractC6157.f16779;
                AbstractC6157.m11574(strM66683, e3.toString(), e3, true);
            }
        }
        try {
            for (Object obj : arrayList2) {
                Object objM11836 = AbstractC6317.m11836(obj, AbstractC3056.m6668(-3937651146911647143L));
                GroupBanInfo groupBanInfo = new GroupBanInfo();
                groupBanInfo.UserUin = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937586675157566887L), objM11836);
                groupBanInfo.UserName = (String) AbstractC6317.m11831(String.class, AbstractC3056.m6668(-3937651082487137703L), objM11836);
                groupBanInfo.Endtime = ((Long) AbstractC6317.m11831(Long.TYPE, AbstractC3056.m6668(-3937650992292824487L), obj)).longValue() * 1000;
                arrayList3.add(groupBanInfo);
            }
            Collections.sort(arrayList3, new Comparator<GroupBanInfo>() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.1
                @Override // java.util.Comparator
                public int compare(GroupBanInfo groupBanInfo2, GroupBanInfo groupBanInfo3) {
                    return Long.compare(Long.parseLong(groupBanInfo2.UserUin), Long.parseLong(groupBanInfo3.UserUin));
                }
            });
        } catch (Exception e4) {
            String strM66684 = AbstractC3056.m6668(j);
            String str4 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66684, e4.toString(), e4, true);
        }
        return arrayList3;
    }

    private static Object getRuntimeService(Class<?> cls) {
        try {
            return QQServiceTool.getService(cls);
        } catch (Exception e) {
            C5919.m11252(e);
            return null;
        }
    }

    public static int getTROOP_GAG_MANAGER() {
        return ((Integer) XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937652882078434727L), AbstractC6318.f17411).getDeclaredField(AbstractC3056.m6668(-3937651207041189287L)).get(null)).intValue();
    }

    private static int getTROOP_MANAGER() {
        return ((Integer) XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937652882078434727L), AbstractC6318.f17411).getDeclaredField(AbstractC3056.m6668(-3937652615790462375L)).get(null)).intValue();
    }

    private static Object getTroopManager(int i) {
        return Hook_cookie.getTicketManager(i);
    }

    public static void groupClockIn(String str, String str2) {
        try {
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937667489262208423L));
            AbstractC6314.m11819(AbstractC6087.m11389(new Object[]{Hook_cookie.getRuntime()}, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937667643881031079L))}, clsM11838), null, Void.TYPE, new Class[]{String.class, String.class}, str, str2);
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937640864759940519L);
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }

    public static boolean isShutUp(String str) {
        Object groupInfo = getGroupInfo(str);
        return ((Long) AbstractC6317.m11836(groupInfo, AbstractC3056.m6668(-3937650618630669735L))).longValue() == 0 && ((Long) AbstractC6317.m11832(groupInfo.getClass(), AbstractC3056.m6668(-3937650579975964071L)).get(groupInfo)).longValue() == 0;
    }

    public static void kickMember(String str, String str2, boolean z) {
        try {
            int i = AbstractC6340.f17461;
            Class cls = Boolean.TYPE;
            if (i < 6722) {
                Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937650322277926311L));
                Object objM11389 = AbstractC6087.m11389(new Object[]{Hook_cookie.getRuntime()}, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937667643881031079L))}, clsM11838);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
                AbstractC6314.m11819(objM11389, null, Void.TYPE, new Class[]{Long.TYPE, List.class, cls, cls}, Long.valueOf(Long.parseLong(str)), arrayList, Boolean.valueOf(z), Boolean.FALSE);
                return;
            }
            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937650910688445863L)));
            C6316 c6316M11826 = C6316.m11826(qRouteApi.getClass());
            String strM6668 = AbstractC3056.m6668(-3937650382407468455L);
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{Object.class, Object.class, String.class, Object.class};
            Method methodM11827 = c6316M11826.m11827();
            Class<?>[] parameterTypes = methodM11827.getParameterTypes();
            Object objNewInstance = parameterTypes[0].newInstance();
            HashMap map = AbstractC6317.f17410;
            AbstractC6317.m11833(objNewInstance.getClass(), String.class).set(objNewInstance, str);
            AbstractC6317.m11833(objNewInstance.getClass(), cls).set(objNewInstance, Boolean.valueOf(z));
            C6316 c6316M118262 = C6316.m11826(objNewInstance.getClass());
            c6316M118262.f17409.f3618 = new Class[]{String.class};
            c6316M118262.m11828(objNewInstance, str2);
            methodM11827.invoke(qRouteApi, objNewInstance, null, AbstractC3056.m6668(-3937561979095614887L), Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.5
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 3) {
                        return null;
                    }
                    return method.invoke(qRouteApi, objArr);
                }
            }));
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937640864759940519L);
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getMemberInfo$1(CompletableFuture completableFuture, Object obj, Object obj2, Method method, Object[] objArr) {
        if (method.getReturnType() != Void.TYPE || method.getParameterTypes().length != 1) {
            return method.invoke(obj, objArr);
        }
        completableFuture.complete(objArr[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getProhibitList$0(CompletableFuture completableFuture, Object obj, Object obj2, Method method, Object[] objArr) {
        if (method.getReturnType() != Void.TYPE || method.getParameterTypes().length != 2) {
            return method.invoke(obj, objArr);
        }
        for (Object obj3 : objArr) {
            if (obj3 instanceof List) {
                completableFuture.complete((ArrayList) ((List) obj3));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setGroupMemberTitle$2(Object obj, Method method, Object[] objArr) {
        return null;
    }

    public static void setGroupMemberTitle(String str, String str2, String str3) {
        try {
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937666441290188199L));
            Class cls = Void.TYPE;
            Class[] clsArr = {AbstractC6318.m11838(AbstractC3056.m6668(-3937566175278663079L)), String.class, String.class, String.class, AbstractC6318.m11838(AbstractC3056.m6668(-3937598473432728999L))};
            AbstractC6314.m11815(clsM11838, cls, null, clsArr).invoke(null, Hook_cookie.getRuntime(), str, str2, str3, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937598473432728999L), AbstractC6318.f17411)}, new C5556(0)));
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937640864759940519L);
            String str4 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }

    public static void shutUp(String str, String str2, long j) {
        try {
            if (AbstractC6340.f17461 < 6722) {
                AbstractC6314.m11819(getTroopManager(getTROOP_GAG_MANAGER()), null, Boolean.TYPE, new Class[]{String.class, String.class, Long.TYPE}, str, str2, Long.valueOf(j));
                return;
            }
            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937650910688445863L)));
            C6316 c6316M11826 = C6316.m11826(qRouteApi.getClass());
            String strM6668 = AbstractC3056.m6668(-3937650687350146471L);
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{String.class, String.class, Long.TYPE, Object.class, String.class, Object.class};
            c1245.f3616 = Void.TYPE;
            Method methodM11827 = c6316M11826.m11827();
            Class<?>[] parameterTypes = methodM11827.getParameterTypes();
            methodM11827.invoke(qRouteApi, str, QQEnvTool.getUidFromUin(str2), Long.valueOf(j), null, AbstractC3056.m6668(-3937561979095614887L), Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.2
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getName().equals(AbstractC3056.m6668(-3937652843423729063L))) {
                        return null;
                    }
                    return method.invoke(qRouteApi, objArr);
                }
            }));
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937640864759940519L);
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
    }

    public static void shutUpAll(String str, boolean z) {
        try {
            int i = AbstractC6340.f17461;
            Class cls = Void.TYPE;
            Class cls2 = Long.TYPE;
            if (i < 6722) {
                AbstractC6314.m11819(XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC3056.m6668(-3937617848030201255L), new Class[]{String.class}, new Object[]{AbstractC6317.m11829(AbstractC6318.m11838(AbstractC3056.m6668(-3937618144382944679L)), String.class, AbstractC3056.m6668(-3937650476896748967L))}), null, cls, new Class[]{String.class, cls2}, str, Long.valueOf(z ? 268435455 : 0));
                return;
            }
            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937653161251308967L)));
            C6316 c6316M11826 = C6316.m11826(qRouteApi.getClass());
            String strM6668 = AbstractC3056.m6668(-3937650485486683559L);
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{String.class, cls2, Object.class, Object.class};
            c1245.f3616 = cls;
            Method methodM11827 = c6316M11826.m11827();
            Class<?>[] parameterTypes = methodM11827.getParameterTypes();
            methodM11827.invoke(qRouteApi, str, Long.valueOf(z ? 268435455 : 0), null, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.3
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getName().equals(AbstractC3056.m6668(-3937652843423729063L))) {
                        return null;
                    }
                    return method.invoke(qRouteApi, objArr);
                }
            }));
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937640864759940519L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
    }

    public static void updateGetMemberList(String str) {
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937651799746676135L), AbstractC6318.f17411);
            clsFindClassIfExists.getDeclaredMethod(AbstractC3056.m6668(-3937578832547284391L), Boolean.TYPE).invoke(clsFindClassIfExists.getConstructor(XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937566175278663079L), AbstractC6318.f17411), Context.class, String.class, Handler.class).newInstance(Hook_cookie.getRuntime(), AbstractC6340.f17460, str, null), Boolean.TRUE);
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937640864759940519L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }

    public static void shutUpAll(String str, long j) {
        try {
            int i = AbstractC6340.f17461;
            Class cls = Void.TYPE;
            Class cls2 = Long.TYPE;
            if (i >= 6722) {
                final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937653161251308967L)));
                C6316 c6316M11826 = C6316.m11826(qRouteApi.getClass());
                String strM6668 = AbstractC3056.m6668(-3937650485486683559L);
                C1245 c1245 = c6316M11826.f17409;
                c1245.f3617 = strM6668;
                c1245.f3618 = new Class[]{String.class, cls2, Object.class, Object.class};
                c1245.f3616 = cls;
                Method methodM11827 = c6316M11826.m11827();
                Class<?>[] parameterTypes = methodM11827.getParameterTypes();
                methodM11827.invoke(qRouteApi, str, Long.valueOf(j), null, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.4
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method, Object[] objArr) {
                        if (method.getName().equals(AbstractC3056.m6668(-3937652843423729063L))) {
                            return null;
                        }
                        return method.invoke(qRouteApi, objArr);
                    }
                }));
                return;
            }
            AbstractC6314.m11819(XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC3056.m6668(-3937617848030201255L), new Class[]{String.class}, new Object[]{AbstractC6317.m11829(AbstractC6318.m11838(AbstractC3056.m6668(-3937618144382944679L)), String.class, AbstractC3056.m6668(-3937650476896748967L))}), null, cls, new Class[]{String.class, cls2}, str, Long.valueOf(j));
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937640864759940519L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
    }
}
