package lin.xposed.hook.util.p011qq;

import android.content.Context;
import android.os.Handler;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.AbstractC3738;
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
import p025.AbstractC7012;
import p026.AbstractC7017;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTTroopTool {
    private static Object getGroupGagInfo(String str, String str2) {
        Object runtimeService = getRuntimeService(AbstractC7166.m12425(AbstractC9234.m14531(981)));
        C7164 c7164M12413 = C7164.m12413(runtimeService.getClass());
        String strM14531 = AbstractC9234.m14531(983);
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3963 = strM14531;
        c2080.f3964 = new Class[]{String.class, String.class};
        return c7164M12413.m12415(runtimeService, str, str2);
    }

    private static Object getGroupInfo(String str) {
        Object runtimeService = getRuntimeService(AbstractC7166.m12425(AbstractC9234.m14531(981)));
        C7164 c7164M12413 = C7164.m12413(runtimeService.getClass());
        String strM14531 = AbstractC9234.m14531(982);
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3963 = strM14531;
        c2080.f3964 = new Class[]{String.class};
        return c7164M12413.m12415(runtimeService, str);
    }

    private static List<Object> getGroupListBy9_0_65() {
        return (ArrayList) XposedHelpers.callMethod(AbstractC7012.m12146(984), AbstractC9234.m14531(985), new Object[0]);
    }

    private static List<Object> getGroupListByOld() {
        return (ArrayList) XposedHelpers.callMethod(getRuntimeService(AbstractC7166.m12425(AbstractC9234.m14531(981))), AbstractC9234.m14531(986), new Object[0]);
    }

    public static String getGroupName(String str) {
        try {
            Object objInvoke = XposedHelpers.findClassIfExists(AbstractC9234.m14531(938), AbstractC7166.f17805).getDeclaredMethod(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵呜喵喵呜呜"), Class.class).invoke(null, XposedHelpers.findClassIfExists(AbstractC9234.m14531(1011), AbstractC7166.f17805));
            return String.valueOf(objInvoke.getClass().getDeclaredMethod(AbstractC9234.m14531(1012), XposedHelpers.findClassIfExists(AbstractC9234.m14531(1002), AbstractC7166.f17805), String.class, Boolean.TYPE).invoke(objInvoke, Hook_cookie.getRuntime(), str, Boolean.TRUE));
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(733);
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
            return str;
        }
    }

    public static Object getMemberInfo(String str, String str2) {
        int i = 1;
        try {
            CompletableFuture completableFuture = new CompletableFuture();
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425(AbstractC9234.m14531(988)));
            C7164 c7164M12413 = C7164.m12413(qRouteApi.getClass());
            String strM14531 = AbstractC9234.m14531(1004);
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3962 = Void.TYPE;
            c7164M12413.f17803.f3964 = new Class[]{String.class, String.class, Boolean.TYPE, AbstractC7166.m12425(AbstractC9234.m14531(1005)), String.class, Object.class};
            Method methodM12414 = c7164M12413.m12414();
            Class<?>[] parameterTypes = methodM12414.getParameterTypes();
            methodM12414.invoke(qRouteApi, str, str2, Boolean.TRUE, null, AbstractC9234.m14531(1006), Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{parameterTypes[parameterTypes.length - 1]}, new C6389(completableFuture, qRouteApi, i)));
            return completableFuture.get(5L, TimeUnit.SECONDS);
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(733);
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
            return null;
        }
    }

    public static String getMemberName(String str, String str2) {
        if (AbstractC7187.f17853 > 5844) {
            try {
                return (String) AbstractC7162.m12405(String.class, AbstractC9234.m14531(1007), AbstractC7165.m12418(null, AbstractC9234.m14531(991), getMemberInfo(str, str2)));
            } catch (Exception e) {
                String strM14531 = AbstractC9234.m14531(733);
                String str3 = AbstractC7017.f17361;
                AbstractC7017.m12164(strM14531, e.toString(), e, true);
            }
        }
        try {
            Object runtimeService = getRuntimeService(XposedHelpers.findClassIfExists(AbstractC9234.m14531(1008), AbstractC7166.f17805));
            return String.valueOf(runtimeService.getClass().getDeclaredMethod(AbstractC9234.m14531(1009), String.class, String.class).invoke(runtimeService, str, str2));
        } catch (Exception e2) {
            String strM145312 = AbstractC9234.m14531(733);
            String str4 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e2.toString(), e2, true);
            return str2;
        }
    }

    public static List<GroupBanInfo> getProhibitList(String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = AbstractC7187.f17853;
        Class cls = Boolean.TYPE;
        if (i > 5844) {
            try {
                CompletableFuture completableFuture = new CompletableFuture();
                Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425(AbstractC9234.m14531(988)));
                if (qRouteApi != null) {
                    C7164 c7164M12413 = C7164.m12413(qRouteApi.getClass());
                    c7164M12413.f17803.f3964 = new Class[]{String.class, Object.class, cls, String.class, Object.class};
                    String strM14531 = AbstractC9234.m14531(989);
                    C2080 c2080 = c7164M12413.f17803;
                    c2080.f3963 = strM14531;
                    c2080.f3962 = Void.TYPE;
                    Method methodM12414 = c7164M12413.m12414();
                    Class<?>[] parameterTypes = methodM12414.getParameterTypes();
                    methodM12414.invoke(qRouteApi, str, null, Boolean.TRUE, "", Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{parameterTypes[parameterTypes.length - 1]}, new C6389(completableFuture, qRouteApi, 0)));
                }
                arrayList = (ArrayList) completableFuture.get(5L, TimeUnit.SECONDS);
                arrayList2 = arrayList;
            } catch (Exception e) {
                String strM145312 = AbstractC9234.m14531(733);
                String str2 = AbstractC7017.f17361;
                AbstractC7017.m12164(strM145312, e.toString(), e, true);
            }
        } else {
            try {
                arrayList = (ArrayList) AbstractC7162.m12406(QQEnvTool.getManager(((Integer) AbstractC7165.m12416(AbstractC7166.m12425(AbstractC9234.m14531(979)), Integer.TYPE, AbstractC9234.m14531(990))).intValue()), null, ArrayList.class, new Class[]{String.class, cls}, str, Boolean.TRUE);
                arrayList2 = arrayList;
            } catch (Exception e2) {
                String strM145313 = AbstractC9234.m14531(733);
                String str3 = AbstractC7017.f17361;
                AbstractC7017.m12164(strM145313, e2.toString(), e2, true);
            }
        }
        try {
            for (Object obj : arrayList2) {
                Object objM12423 = AbstractC7165.m12423(obj, AbstractC9234.m14531(991));
                GroupBanInfo groupBanInfo = new GroupBanInfo();
                groupBanInfo.UserUin = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), objM12423);
                groupBanInfo.UserName = (String) AbstractC7165.m12418(String.class, AbstractC9234.m14531(992), objM12423);
                groupBanInfo.Endtime = ((Long) AbstractC7165.m12418(Long.TYPE, AbstractC9234.m14531(993), obj)).longValue() * 1000;
                arrayList3.add(groupBanInfo);
            }
            Collections.sort(arrayList3, new Comparator<GroupBanInfo>() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.1
                @Override // java.util.Comparator
                public int compare(GroupBanInfo groupBanInfo2, GroupBanInfo groupBanInfo3) {
                    return Long.compare(Long.parseLong(groupBanInfo2.UserUin), Long.parseLong(groupBanInfo3.UserUin));
                }
            });
        } catch (Exception e3) {
            String strM145314 = AbstractC9234.m14531(733);
            String str4 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145314, e3.toString(), e3, true);
        }
        return arrayList3;
    }

    private static Object getRuntimeService(Class<?> cls) {
        try {
            return QQServiceTool.getService(cls);
        } catch (Exception e) {
            C6755.m11872(e);
            return null;
        }
    }

    public static int getTROOP_GAG_MANAGER() {
        return ((Integer) XposedHelpers.findClassIfExists(AbstractC9234.m14531(979), AbstractC7166.f17805).getDeclaredField(AbstractC9234.m14531(990)).get(null)).intValue();
    }

    private static int getTROOP_MANAGER() {
        return ((Integer) XposedHelpers.findClassIfExists(AbstractC9234.m14531(979), AbstractC7166.f17805).getDeclaredField(AbstractC9234.m14531(980)).get(null)).intValue();
    }

    private static Object getTroopManager(int i) {
        return Hook_cookie.getTicketManager(i);
    }

    public static void groupClockIn(String str, String str2) {
        try {
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1003));
            AbstractC7162.m12406(AbstractC3738.m6845(new Object[]{Hook_cookie.getRuntime()}, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(1002))}, clsM12425), null, Void.TYPE, new Class[]{String.class, String.class}, str, str2);
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(733);
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
        }
    }

    public static boolean isShutUp(String str) {
        Object groupInfo = getGroupInfo(str);
        return ((Long) AbstractC7165.m12423(groupInfo, AbstractC9234.m14531(996))).longValue() == 0 && ((Long) AbstractC7165.m12419(groupInfo.getClass(), AbstractC9234.m14531(997)).get(groupInfo)).longValue() == 0;
    }

    public static void kickMember(String str, String str2, boolean z) {
        try {
            int i = AbstractC7187.f17853;
            Class cls = Boolean.TYPE;
            if (i < 6722) {
                Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(DescriptorProtos$Edition.EDITION_2024_VALUE));
                Object objM6845 = AbstractC3738.m6845(new Object[]{Hook_cookie.getRuntime()}, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(1002))}, clsM12425);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
                AbstractC7162.m12406(objM6845, null, Void.TYPE, new Class[]{Long.TYPE, List.class, cls, cls}, Long.valueOf(Long.parseLong(str)), arrayList, Boolean.valueOf(z), Boolean.FALSE);
                return;
            }
            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425(AbstractC9234.m14531(994)));
            C7164 c7164M12413 = C7164.m12413(qRouteApi.getClass());
            String strM14531 = AbstractC9234.m14531(DescriptorProtos$Edition.EDITION_2023_VALUE);
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3964 = new Class[]{Object.class, Object.class, String.class, Object.class};
            Method methodM12414 = c7164M12413.m12414();
            Class<?>[] parameterTypes = methodM12414.getParameterTypes();
            Object objNewInstance = parameterTypes[0].newInstance();
            HashMap map = AbstractC7165.f17804;
            AbstractC7165.m12420(objNewInstance.getClass(), String.class).set(objNewInstance, str);
            AbstractC7165.m12420(objNewInstance.getClass(), cls).set(objNewInstance, Boolean.valueOf(z));
            C7164 c7164M124132 = C7164.m12413(objNewInstance.getClass());
            c7164M124132.f17803.f3964 = new Class[]{String.class};
            c7164M124132.m12415(objNewInstance, str2);
            methodM12414.invoke(qRouteApi, objNewInstance, null, "", Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.5
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getReturnType() == Void.TYPE && method.getParameterTypes().length == 3) {
                        return null;
                    }
                    return method.invoke(qRouteApi, objArr);
                }
            }));
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(733);
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
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
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1010));
            Class cls = Void.TYPE;
            Class[] clsArr = {AbstractC7166.m12425(AbstractC9234.m14531(122)), String.class, String.class, String.class, AbstractC7166.m12425(AbstractC9234.m14531(422))};
            AbstractC7162.m12402(clsM12425, cls, null, clsArr).invoke(null, Hook_cookie.getRuntime(), str, str2, str3, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{XposedHelpers.findClassIfExists(AbstractC9234.m14531(422), AbstractC7166.f17805)}, new C6388(0)));
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(733);
            String str4 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
        }
    }

    public static void shutUp(String str, String str2, long j) {
        try {
            if (AbstractC7187.f17853 < 6722) {
                AbstractC7162.m12406(getTroopManager(getTROOP_GAG_MANAGER()), null, Boolean.TYPE, new Class[]{String.class, String.class, Long.TYPE}, str, str2, Long.valueOf(j));
                return;
            }
            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425(AbstractC9234.m14531(994)));
            C7164 c7164M12413 = C7164.m12413(qRouteApi.getClass());
            String strM14531 = AbstractC9234.m14531(995);
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3964 = new Class[]{String.class, String.class, Long.TYPE, Object.class, String.class, Object.class};
            c2080.f3962 = Void.TYPE;
            Method methodM12414 = c7164M12413.m12414();
            Class<?>[] parameterTypes = methodM12414.getParameterTypes();
            methodM12414.invoke(qRouteApi, str, QQEnvTool.getUidFromUin(str2), Long.valueOf(j), null, "", Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.2
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getName().equals(AbstractC9234.m14531(978))) {
                        return null;
                    }
                    return method.invoke(qRouteApi, objArr);
                }
            }));
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(733);
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
    }

    public static void shutUpAll(String str, boolean z) {
        try {
            int i = AbstractC7187.f17853;
            Class cls = Void.TYPE;
            Class cls2 = Long.TYPE;
            if (i < 6722) {
                AbstractC7162.m12406(XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC9234.m14531(602), new Class[]{String.class}, new Object[]{AbstractC7165.m12416(AbstractC7166.m12425(AbstractC9234.m14531(600)), String.class, AbstractC9234.m14531(999))}), null, cls, new Class[]{String.class, cls2}, str, Long.valueOf(z ? 268435455 : 0));
                return;
            }
            final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425(AbstractC9234.m14531(975)));
            C7164 c7164M12413 = C7164.m12413(qRouteApi.getClass());
            String strM14531 = AbstractC9234.m14531(DescriptorProtos$Edition.EDITION_PROTO2_VALUE);
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3964 = new Class[]{String.class, cls2, Object.class, Object.class};
            c2080.f3962 = cls;
            Method methodM12414 = c7164M12413.m12414();
            Class<?>[] parameterTypes = methodM12414.getParameterTypes();
            methodM12414.invoke(qRouteApi, str, Long.valueOf(z ? 268435455 : 0), null, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.3
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) {
                    if (method.getName().equals(AbstractC9234.m14531(978))) {
                        return null;
                    }
                    return method.invoke(qRouteApi, objArr);
                }
            }));
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(733);
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
    }

    public static void updateGetMemberList(String str) {
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC9234.m14531(987), AbstractC7166.f17805);
            clsFindClassIfExists.getDeclaredMethod(AbstractC9234.m14532("喵喵喵呜喵呜呜呜"), Boolean.TYPE).invoke(clsFindClassIfExists.getConstructor(XposedHelpers.findClassIfExists(AbstractC9234.m14531(122), AbstractC7166.f17805), Context.class, String.class, Handler.class).newInstance(Hook_cookie.getRuntime(), AbstractC7187.f17852, str, null), Boolean.TRUE);
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(733);
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
        }
    }

    public static void shutUpAll(String str, long j) {
        try {
            int i = AbstractC7187.f17853;
            Class cls = Void.TYPE;
            Class cls2 = Long.TYPE;
            if (i >= 6722) {
                final Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425(AbstractC9234.m14531(975)));
                C7164 c7164M12413 = C7164.m12413(qRouteApi.getClass());
                String strM14531 = AbstractC9234.m14531(DescriptorProtos$Edition.EDITION_PROTO2_VALUE);
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3964 = new Class[]{String.class, cls2, Object.class, Object.class};
                c2080.f3962 = cls;
                Method methodM12414 = c7164M12413.m12414();
                Class<?>[] parameterTypes = methodM12414.getParameterTypes();
                methodM12414.invoke(qRouteApi, str, Long.valueOf(j), null, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{parameterTypes[parameterTypes.length - 1]}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTTroopTool.4
                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method, Object[] objArr) {
                        if (method.getName().equals(AbstractC9234.m14531(978))) {
                            return null;
                        }
                        return method.invoke(qRouteApi, objArr);
                    }
                }));
                return;
            }
            AbstractC7162.m12406(XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC9234.m14531(602), new Class[]{String.class}, new Object[]{AbstractC7165.m12416(AbstractC7166.m12425(AbstractC9234.m14531(600)), String.class, AbstractC9234.m14531(999))}), null, cls, new Class[]{String.class, cls2}, str, Long.valueOf(j));
        } catch (Exception e) {
            String strM145312 = AbstractC9234.m14531(733);
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
    }
}
