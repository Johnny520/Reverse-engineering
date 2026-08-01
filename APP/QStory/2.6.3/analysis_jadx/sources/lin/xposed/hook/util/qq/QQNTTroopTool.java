package lin.xposed.hook.util.qq;

import android.content.Context;
import android.os.Handler;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.AbstractC2905;
import com.google.protobuf.DescriptorProtos$Edition;
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
import p009.AbstractC6183;
import p010.AbstractC6188;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTTroopTool {
    private static Object getGroupGagInfo(String str, String str2) {
        Object runtimeService = getRuntimeService(AbstractC6337.m11866(AbstractC8405.m13972(981)));
        C6335 c6335M11854 = C6335.m11854(runtimeService.getClass());
        String strM13972 = AbstractC8405.m13972(983);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3618 = strM13972;
        c1245.f3619 = new Class[]{String.class, String.class};
        return c6335M11854.m11856(runtimeService, str, str2);
    }

    private static Object getGroupInfo(String str) {
        Object runtimeService = getRuntimeService(AbstractC6337.m11866(AbstractC8405.m13972(981)));
        C6335 c6335M11854 = C6335.m11854(runtimeService.getClass());
        String strM13972 = AbstractC8405.m13972(982);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3618 = strM13972;
        c1245.f3619 = new Class[]{String.class};
        return c6335M11854.m11856(runtimeService, str);
    }

    private static List<Object> getGroupListBy9_0_65() {
        return (ArrayList) XposedHelpers.callMethod(AbstractC6183.m11587(984), AbstractC8405.m13972(985), new Object[0]);
    }

    private static List<Object> getGroupListByOld() {
        return (ArrayList) XposedHelpers.callMethod(getRuntimeService(AbstractC6337.m11866(AbstractC8405.m13972(981))), AbstractC8405.m13972(986), new Object[0]);
    }

    public static String getGroupName(String str) {
        try {
            Object objInvoke = XposedHelpers.findClassIfExists(AbstractC8405.m13972(938), AbstractC6337.f17460).getDeclaredMethod(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵呜喵喵呜呜"), Class.class).invoke(null, XposedHelpers.findClassIfExists(AbstractC8405.m13972(1011), AbstractC6337.f17460));
            return String.valueOf(objInvoke.getClass().getDeclaredMethod(AbstractC8405.m13972(1012), XposedHelpers.findClassIfExists(AbstractC8405.m13972(1002), AbstractC6337.f17460), String.class, Boolean.TYPE).invoke(objInvoke, Hook_cookie.getRuntime(), str, Boolean.TRUE));
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(733);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
            return str;
        }
    }

    public static Object getMemberInfo(String str, String str2) {
        int i = 1;
        try {
            CompletableFuture completableFuture = new CompletableFuture();
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(988)));
            C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
            String strM13972 = AbstractC8405.m13972(1004);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            c1245.f3617 = Void.TYPE;
            c6335M11854.f17458.f3619 = new Class[]{String.class, String.class, Boolean.TYPE, AbstractC6337.m11866(AbstractC8405.m13972(1005)), String.class, Object.class};
            Method methodM11855 = c6335M11854.m11855();
            Class<?>[] parameterTypes = methodM11855.getParameterTypes();
            methodM11855.invoke(qRouteApi, str, str2, Boolean.TRUE, null, AbstractC8405.m13972(1006), Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{parameterTypes[parameterTypes.length - 1]}, new C5558(completableFuture, qRouteApi, i)));
            return completableFuture.get(5L, TimeUnit.SECONDS);
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(733);
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
            return null;
        }
    }

    public static String getMemberName(String str, String str2) {
        if (AbstractC6358.f17508 > 5844) {
            try {
                return (String) AbstractC6333.m11846(String.class, AbstractC8405.m13972(1007), AbstractC6336.m11859(null, AbstractC8405.m13972(991), getMemberInfo(str, str2)));
            } catch (Exception e) {
                String strM13972 = AbstractC8405.m13972(733);
                String str3 = AbstractC6188.f17016;
                AbstractC6188.m11605(strM13972, e.toString(), e, true);
            }
        }
        try {
            Object runtimeService = getRuntimeService(XposedHelpers.findClassIfExists(AbstractC8405.m13972(1008), AbstractC6337.f17460));
            return String.valueOf(runtimeService.getClass().getDeclaredMethod(AbstractC8405.m13972(1009), String.class, String.class).invoke(runtimeService, str, str2));
        } catch (Exception e2) {
            String strM139722 = AbstractC8405.m13972(733);
            String str4 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e2.toString(), e2, true);
            return str2;
        }
    }

    public static List<GroupBanInfo> getProhibitList(String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = AbstractC6358.f17508;
        Class cls = Boolean.TYPE;
        if (i > 5844) {
            try {
                CompletableFuture completableFuture = new CompletableFuture();
                Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(988)));
                if (qRouteApi != null) {
                    C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
                    c6335M11854.f17458.f3619 = new Class[]{String.class, Object.class, cls, String.class, Object.class};
                    String strM13972 = AbstractC8405.m13972(989);
                    C1245 c1245 = c6335M11854.f17458;
                    c1245.f3618 = strM13972;
                    c1245.f3617 = Void.TYPE;
                    Method methodM11855 = c6335M11854.m11855();
                    Class<?>[] parameterTypes = methodM11855.getParameterTypes();
                    methodM11855.invoke(qRouteApi, str, null, Boolean.TRUE, "", Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{parameterTypes[parameterTypes.length - 1]}, new C5558(completableFuture, qRouteApi, 0)));
                }
                arrayList = (ArrayList) completableFuture.get(5L, TimeUnit.SECONDS);
                arrayList2 = arrayList;
            } catch (Exception e) {
                String strM139722 = AbstractC8405.m13972(733);
                String str2 = AbstractC6188.f17016;
                AbstractC6188.m11605(strM139722, e.toString(), e, true);
            }
        } else {
            try {
                arrayList = (ArrayList) AbstractC6333.m11847(QQEnvTool.getManager(((Integer) AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(979)), Integer.TYPE, AbstractC8405.m13972(990))).intValue()), null, ArrayList.class, new Class[]{String.class, cls}, str, Boolean.TRUE);
                arrayList2 = arrayList;
            } catch (Exception e2) {
                String strM139723 = AbstractC8405.m13972(733);
                String str3 = AbstractC6188.f17016;
                AbstractC6188.m11605(strM139723, e2.toString(), e2, true);
            }
        }
        try {
            for (Object obj : arrayList2) {
                Object objM11864 = AbstractC6336.m11864(obj, AbstractC8405.m13972(991));
                GroupBanInfo groupBanInfo = new GroupBanInfo();
                groupBanInfo.UserUin = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), objM11864);
                groupBanInfo.UserName = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(992), objM11864);
                groupBanInfo.Endtime = ((Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13972(993), obj)).longValue() * 1000;
                arrayList3.add(groupBanInfo);
            }
            Collections.sort(arrayList3, new Comparator<GroupBanInfo>() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.1
                @Override // java.util.Comparator
                public int compare(GroupBanInfo groupBanInfo2, GroupBanInfo groupBanInfo3) {
                    return Long.compare(Long.parseLong(groupBanInfo2.UserUin), Long.parseLong(groupBanInfo3.UserUin));
                }
            });
        } catch (Exception e3) {
            String strM139724 = AbstractC8405.m13972(733);
            String str4 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139724, e3.toString(), e3, true);
        }
        return arrayList3;
    }

    private static Object getRuntimeService(Class<?> cls) {
        try {
            return QQServiceTool.getService(cls);
        } catch (Exception e) {
            C5925.m11313(e);
            return null;
        }
    }

    public static int getTROOP_GAG_MANAGER() {
        return ((Integer) XposedHelpers.findClassIfExists(AbstractC8405.m13972(979), AbstractC6337.f17460).getDeclaredField(AbstractC8405.m13972(990)).get(null)).intValue();
    }

    private static int getTROOP_MANAGER() {
        return ((Integer) XposedHelpers.findClassIfExists(AbstractC8405.m13972(979), AbstractC6337.f17460).getDeclaredField(AbstractC8405.m13972(980)).get(null)).intValue();
    }

    private static Object getTroopManager(int i) {
        return Hook_cookie.getTicketManager(i);
    }

    public static void groupClockIn(String str, String str2) {
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1003));
            AbstractC6333.m11847(AbstractC2905.m6285(new Object[]{Hook_cookie.getRuntime()}, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(1002))}, clsM11866), null, Void.TYPE, new Class[]{String.class, String.class}, str, str2);
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(733);
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
    }

    public static boolean isShutUp(String str) {
        Object groupInfo = getGroupInfo(str);
        return ((Long) AbstractC6336.m11864(groupInfo, AbstractC8405.m13972(996))).longValue() == 0 && ((Long) AbstractC6336.m11860(groupInfo.getClass(), AbstractC8405.m13972(997)).get(groupInfo)).longValue() == 0;
    }

    public static void kickMember(String str, String str2, boolean z) {
        try {
            int i = AbstractC6358.f17508;
            Class cls = Boolean.TYPE;
            if (i < 6722) {
                Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(DescriptorProtos$Edition.EDITION_2024_VALUE));
                Object objM6285 = AbstractC2905.m6285(new Object[]{Hook_cookie.getRuntime()}, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(1002))}, clsM11866);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
                AbstractC6333.m11847(objM6285, null, Void.TYPE, new Class[]{Long.TYPE, List.class, cls, cls}, Long.valueOf(Long.parseLong(str)), arrayList, Boolean.valueOf(z), Boolean.FALSE);
                return;
            }
            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(994)));
            C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
            String strM13972 = AbstractC8405.m13972(DescriptorProtos$Edition.EDITION_2023_VALUE);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            c1245.f3619 = new Class[]{Object.class, Object.class, String.class, Object.class};
            Method methodM11855 = c6335M11854.m11855();
            Class<?>[] parameterTypes = methodM11855.getParameterTypes();
            Object objNewInstance = parameterTypes[0].newInstance();
            HashMap map = AbstractC6336.f17459;
            AbstractC6336.m11861(objNewInstance.getClass(), String.class).set(objNewInstance, str);
            AbstractC6336.m11861(objNewInstance.getClass(), cls).set(objNewInstance, Boolean.valueOf(z));
            C6335 c6335M118542 = C6335.m11854(objNewInstance.getClass());
            c6335M118542.f17458.f3619 = new Class[]{String.class};
            c6335M118542.m11856(objNewInstance, str2);
            methodM11855.invoke(qRouteApi, objNewInstance, null, "", Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.5
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 3) {
                        return null;
                    }
                    return method.invoke(qRouteApi, objArr);
                }
            }));
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(733);
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
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
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1010));
            Class cls = Void.TYPE;
            Class[] clsArr = {AbstractC6337.m11866(AbstractC8405.m13972(122)), String.class, String.class, String.class, AbstractC6337.m11866(AbstractC8405.m13972(422))};
            AbstractC6333.m11843(clsM11866, cls, null, clsArr).invoke(null, Hook_cookie.getRuntime(), str, str2, str3, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{XposedHelpers.findClassIfExists(AbstractC8405.m13972(422), AbstractC6337.f17460)}, new C5557(0)));
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(733);
            String str4 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
    }

    public static void shutUp(String str, String str2, long j) {
        try {
            if (AbstractC6358.f17508 < 6722) {
                AbstractC6333.m11847(getTroopManager(getTROOP_GAG_MANAGER()), null, Boolean.TYPE, new Class[]{String.class, String.class, Long.TYPE}, str, str2, Long.valueOf(j));
                return;
            }
            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(994)));
            C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
            String strM13972 = AbstractC8405.m13972(995);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            c1245.f3619 = new Class[]{String.class, String.class, Long.TYPE, Object.class, String.class, Object.class};
            c1245.f3617 = Void.TYPE;
            Method methodM11855 = c6335M11854.m11855();
            Class<?>[] parameterTypes = methodM11855.getParameterTypes();
            methodM11855.invoke(qRouteApi, str, QQEnvTool.getUidFromUin(str2), Long.valueOf(j), null, "", Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.2
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getName().equals(AbstractC8405.m13972(978))) {
                        return null;
                    }
                    return method.invoke(qRouteApi, objArr);
                }
            }));
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(733);
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
    }

    public static void shutUpAll(String str, boolean z) {
        try {
            int i = AbstractC6358.f17508;
            Class cls = Void.TYPE;
            Class cls2 = Long.TYPE;
            if (i < 6722) {
                AbstractC6333.m11847(XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(602), new Class[]{String.class}, new Object[]{AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(600)), String.class, AbstractC8405.m13972(999))}), null, cls, new Class[]{String.class, cls2}, str, Long.valueOf(z ? 268435455 : 0));
                return;
            }
            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(975)));
            C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
            String strM13972 = AbstractC8405.m13972(DescriptorProtos$Edition.EDITION_PROTO2_VALUE);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            c1245.f3619 = new Class[]{String.class, cls2, Object.class, Object.class};
            c1245.f3617 = cls;
            Method methodM11855 = c6335M11854.m11855();
            Class<?>[] parameterTypes = methodM11855.getParameterTypes();
            methodM11855.invoke(qRouteApi, str, Long.valueOf(z ? 268435455 : 0), null, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.3
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getName().equals(AbstractC8405.m13972(978))) {
                        return null;
                    }
                    return method.invoke(qRouteApi, objArr);
                }
            }));
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(733);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
    }

    public static void updateGetMemberList(String str) {
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC8405.m13972(987), AbstractC6337.f17460);
            clsFindClassIfExists.getDeclaredMethod(AbstractC8405.m13973("喵喵喵呜喵呜呜呜"), Boolean.TYPE).invoke(clsFindClassIfExists.getConstructor(XposedHelpers.findClassIfExists(AbstractC8405.m13972(122), AbstractC6337.f17460), Context.class, String.class, Handler.class).newInstance(Hook_cookie.getRuntime(), AbstractC6358.f17507, str, null), Boolean.TRUE);
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(733);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
    }

    public static void shutUpAll(String str, long j) {
        try {
            int i = AbstractC6358.f17508;
            Class cls = Void.TYPE;
            Class cls2 = Long.TYPE;
            if (i >= 6722) {
                final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(975)));
                C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
                String strM13972 = AbstractC8405.m13972(DescriptorProtos$Edition.EDITION_PROTO2_VALUE);
                C1245 c1245 = c6335M11854.f17458;
                c1245.f3618 = strM13972;
                c1245.f3619 = new Class[]{String.class, cls2, Object.class, Object.class};
                c1245.f3617 = cls;
                Method methodM11855 = c6335M11854.m11855();
                Class<?>[] parameterTypes = methodM11855.getParameterTypes();
                methodM11855.invoke(qRouteApi, str, Long.valueOf(j), null, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.4
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method, Object[] objArr) {
                        if (method.getName().equals(AbstractC8405.m13972(978))) {
                            return null;
                        }
                        return method.invoke(qRouteApi, objArr);
                    }
                }));
                return;
            }
            AbstractC6333.m11847(XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(602), new Class[]{String.class}, new Object[]{AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(600)), String.class, AbstractC8405.m13972(999))}), null, cls, new Class[]{String.class, cls2}, str, Long.valueOf(j));
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(733);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
    }
}
