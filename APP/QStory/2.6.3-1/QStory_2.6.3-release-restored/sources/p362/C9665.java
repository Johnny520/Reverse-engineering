package p362;

import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC4765;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.bean.GroupMemberInfo;
import lin.xposed.hook.util.p011qq.C6389;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7017;
import p026.RunnableC7015;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p103.C7906;
import p103.C7964;
import p332.C9496;
import p405.AbstractC9919;
import p405.C9915;
import p405.C9917;
import p405.C9921;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9665 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f25283;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9924 f25284;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9665 f25285;

    static {
        "TroopMemberUtils";
        f25285 = new C9665();
        f25284 = new C9924("PluginTroopCache", 0);
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        "newSetFromMap(...)";
        setNewSetFromMap.getClass();
        f25283 = setNewSetFromMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final String m15051(String str, String str2) {
        if (str != null && str2 != null) {
            C9665 c9665 = f25285;
            c9665.getClass();
            String strM15056 = m15056(str, str2);
            boolean zM9466 = AbstractC5227.m9466(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()), f25284.m15237(m15058(str).concat("_time"), "0"));
            if (zM9466 && strM15056 != null) {
                return strM15056;
            }
            if (!zM9466) {
                if (f25283.add(str)) {
                    new Thread(new RunnableC7015(str, 4), "TroopMemberNameCache-".concat(str)).start();
                }
                if (strM15056 != null) {
                    return strM15056;
                }
            }
            try {
                String strM15052 = m15052(m15055(str, str2));
                if (m15059(strM15052, str2)) {
                    strM15052.getClass();
                    c9665.m15060(str, str2, strM15052);
                    return strM15052;
                }
            } catch (Exception e) {
                String strM14531 = "TroopMemberUtils";
                String str3 = AbstractC7017.f17361;
                AbstractC7017.m12164(strM14531, e.toString(), e, true);
            }
            String strM150562 = m15056(str, str2);
            if (strM150562 != null) {
                return strM150562;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m15052(Object obj) {
        if (obj != null) {
            Class clsM15228 = AbstractC9919.m15228("com.tencent.mobileqq.data.troop.TroopMemberNickInfo");
            clsM15228.getClass();
            Object objM15222 = C9915.m15222(clsM15228, "nickInfo", obj);
            Object objM152222 = C9915.m15222(String.class, "troopNick", objM15222);
            String str = objM152222 instanceof String ? (String) objM152222 : null;
            if (str != null && str.length() != 0) {
                return str;
            }
            Object objM152223 = C9915.m15222(String.class, "colorNick", objM15222);
            String str2 = objM152223 instanceof String ? (String) objM152223 : null;
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            Object objM152224 = C9915.m15222(String.class, "friendNick", objM15222);
            String str3 = objM152224 instanceof String ? (String) objM152224 : null;
            if (str3 != null && str3.length() != 0) {
                return str3;
            }
            Object objM152225 = C9915.m15222(String.class, "uin", objM15222);
            if (objM152225 instanceof String) {
                return (String) objM152225;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Method m15053() {
        C9921 c9921M15231 = C9921.m15231(QQEnvTool.getQRouteApi(AbstractC7166.m12425("com.tencent.qqnt.troopmemberlist.ITroopMemberListRepoApi")).getClass());
        c9921M15231.f25826 = "fetchTroopMemberList";
        c9921M15231.f25828 = Void.TYPE;
        c9921M15231.m15234(String.class, AbstractC7166.m12425("androidx.lifecycle.LifecycleOwner"), Boolean.TYPE, String.class, C9496.class);
        return (Method) c9921M15231.m15164();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0192 A[Catch: Exception -> 0x015f, TRY_LEAVE, TryCatch #0 {Exception -> 0x015f, blocks: (B:11:0x006b, B:14:0x0073, B:15:0x007f, B:17:0x0087, B:23:0x0113, B:22:0x00fd, B:26:0x0161, B:27:0x0170, B:29:0x0176, B:31:0x0186, B:32:0x018c, B:34:0x0192, B:19:0x00e4), top: B:38:0x006b, inners: #1 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList m15054(String str) {
        C9665 c9665;
        "group";
        str.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        Exception e = null;
        int i = 1;
        while (true) {
            c9665 = f25285;
            if (i >= 4) {
                break;
            }
            try {
                CompletableFuture completableFuture = new CompletableFuture();
                c9665.getClass();
                Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425("com.tencent.qqnt.troopmemberlist.ITroopMemberListRepoApi"));
                Method methodM15053 = m15053();
                Class<?>[] parameterTypes = methodM15053.getParameterTypes();
                methodM15053.invoke(qRouteApi, str, null, Boolean.TRUE, "TroopMemberListActivity", Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{parameterTypes[parameterTypes.length - 1]}, new C6389(completableFuture, qRouteApi, 2)));
                arrayList2 = (ArrayList) completableFuture.get(10L, TimeUnit.SECONDS);
                break;
            } catch (Exception e2) {
                e = e2;
                i++;
            }
        }
        if (arrayList2 != null) {
            try {
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    "iterator(...)";
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        "next(...)";
                        next.getClass();
                        GroupMemberInfo groupMemberInfo = new GroupMemberInfo();
                        groupMemberInfo.sourceInfo = next;
                        Object objectField = XposedHelpers.getObjectField(next, "join_time");
                        "null cannot be cast to non-null type kotlin.Long";
                        objectField.getClass();
                        groupMemberInfo.Join_Time = ((Long) objectField).longValue();
                        Object objectField2 = XposedHelpers.getObjectField(next, "last_active_time");
                        "null cannot be cast to non-null type kotlin.Long";
                        objectField2.getClass();
                        groupMemberInfo.Last_AvtivityTime = ((Long) objectField2).longValue();
                        Object objectField3 = XposedHelpers.getObjectField(next, "memberuin");
                        "null cannot be cast to non-null type kotlin.String";
                        objectField3.getClass();
                        groupMemberInfo.UserUin = (String) objectField3;
                        try {
                            Object objectField4 = XposedHelpers.getObjectField(next, "newRealLevel");
                            "null cannot be cast to non-null type kotlin.Int";
                            objectField4.getClass();
                            groupMemberInfo.UserLevel = ((Integer) objectField4).intValue();
                        } catch (Throwable unused) {
                            Object objectField5 = XposedHelpers.getObjectField(next, "realLevel");
                            "null cannot be cast to non-null type kotlin.Int";
                            objectField5.getClass();
                            groupMemberInfo.UserLevel = ((Integer) objectField5).intValue();
                        }
                        c9665.getClass();
                        groupMemberInfo.NickName = m15052(next);
                        Object objectField6 = XposedHelpers.getObjectField(next, "friendnick");
                        "null cannot be cast to non-null type kotlin.String";
                        objectField6.getClass();
                        groupMemberInfo.UserName = (String) objectField6;
                        Object objectField7 = XposedHelpers.getObjectField(next, "role");
                        groupMemberInfo.IsOwner = "OWNER".equals(objectField7.toString());
                        groupMemberInfo.IsAdmin = "ADMIN".equals(objectField7.toString());
                        arrayList.add(groupMemberInfo);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    "iterator(...)";
                    it2.getClass();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        "next(...)";
                        next2.getClass();
                        GroupMemberInfo groupMemberInfo2 = (GroupMemberInfo) next2;
                        if (groupMemberInfo2.IsAdmin) {
                            arrayList3.add(groupMemberInfo2.UserUin);
                        }
                    }
                    AbstractC9667.m15063(str, arrayList3);
                } else if (e != null) {
                    String strM14531 = "TroopMemberUtils";
                    String str2 = AbstractC7017.f17361;
                    AbstractC7017.m12164(strM14531, e.toString(), e, true);
                }
            } catch (Exception e3) {
                String strM145312 = "TroopMemberUtils";
                String str3 = AbstractC7017.f17361;
                AbstractC7017.m12164(strM145312, e3.toString(), e3, true);
            }
        } else if (e != null) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m15055(String str, String str2) {
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
                qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425("com.tencent.qqnt.troopmemberlist.ITroopMemberListRepoApi"));
                C9921 c9921M15231 = C9921.m15231(qRouteApi.getClass());
                c9921M15231.f25826 = "fetchTroopMemberInfo";
                c9921M15231.f25828 = Void.TYPE;
                c9921M15231.m15234(String.class, String.class, Boolean.TYPE, AbstractC7166.m12425("androidx.lifecycle.LifecycleOwner"), String.class, C9496.class);
                method = (Method) c9921M15231.m15164();
                parameterTypes = method.getParameterTypes();
                str3 = str;
                str4 = str2;
            } catch (Exception e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
            try {
                method.invoke(qRouteApi, str3, str4, Boolean.TRUE, null, "TroopMemberListActivity", Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{parameterTypes[parameterTypes.length - 1]}, new C6389(completableFuture, qRouteApi, 3)));
                return completableFuture.get(5L, TimeUnit.SECONDS);
            } catch (Exception e3) {
                e = e3;
                i++;
                str = str3;
                str2 = str4;
            }
        }
        if (e != null) {
            String strM14531 = "TroopMemberUtils";
            String str5 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m15056(String str, String str2) {
        String str3;
        String strM15058 = m15058(str);
        C7964 c7964 = C7964.f19434;
        Map map = (Map) f25284.m15238(strM15058, AbstractC4765.m8872(new C7906(c7964, c7964, 1)));
        if (map == null || !map.containsKey(str2) || (str3 = (String) map.get(str2)) == null || str3.length() == 0) {
            return null;
        }
        return str3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m15057(String str, String str2) {
        "group";
        str.getClass();
        "uin";
        str2.getClass();
        Object objWaitAppInterface = QQEnvTool.waitAppInterface();
        Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.troop.clockin.handler.TroopClockInHandler");
        C9917 c9917 = new C9917();
        c9917.f25616 = clsM12425;
        if (c9917.f25615 == null) {
            c9917.f25615 = clsM12425.getName();
        }
        c9917.f25819 = new Class[]{AbstractC7166.m12425("com.tencent.common.app.AppInterface")};
        c9917.f25818 = 1;
        Object objM15227 = c9917.m15227(objWaitAppInterface);
        int i = AbstractC7187.f17853;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        if (i >= 13350) {
            C9921 c9921M15231 = C9921.m15231(clsM12425);
            c9921M15231.m15234(String.class, String.class, cls2, cls);
        } else if (i >= 12290) {
            C9921 c9921M152312 = C9921.m15231(clsM12425);
            c9921M152312.m15234(cls2, String.class, String.class, cls);
        } else {
            C9921 c9921M152313 = C9921.m15231(clsM12425);
            c9921M152313.m15234(String.class, String.class, cls2, cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m15058(String str) {
        return "MemberNameCache_" + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m15059(String str, String str2) {
        return (str == null || str.length() == 0 || str.equals(str2)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m15060(String str, String str2, String str3) {
        if (m15059(str3, str2)) {
            synchronized (this) {
                try {
                    C9924 c9924 = f25284;
                    f25285.getClass();
                    String strM15058 = m15058(str);
                    C7964 c7964 = C7964.f19434;
                    Map linkedHashMap = (Map) c9924.m15238(strM15058, AbstractC4765.m8872(new C7906(c7964, c7964, 1)));
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    linkedHashMap.put(str2, str3);
                    c9924.m15236(linkedHashMap, m15058(str));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
