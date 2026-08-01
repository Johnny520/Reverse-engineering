package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: t2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0463t2 {

    /* JADX INFO: renamed from: a */
    public static final String[] f879a = {"com.tencent.mobileqq.aio.core.BaseChatPie", "com.tencent.mobileqq.activity.aio.core.BaseChatPie", "com.tencent.mobileqq.aio.core.BaseAIOContext"};

    /* JADX INFO: renamed from: b */
    public static final String[] f880b = {"com.tencent.qqnt.chats.view.RollingTextView", "com.tencent.qqnt.chats.view.RecentRollingTextView", "com.tencent.mobileqq.widget.RollingTextView", "com.tencent.mobileqq.activity.recent.RecentRollingTextView", "com.tencent.mobileqq.activity.home.impl.widget.RecentRollingTextView", "com.tencent.mobileqq.activity.recent.cur.DragFrameLayout$RecentRollingTextView", "com.tencent.widget.RollingTextView"};

    /* JADX INFO: renamed from: c */
    public static final String[] f881c = {"com.tencent.mobileqq.activity.miniaio.c", "com.tencent.mobileqq.activity.miniaio.d", "com.tencent.mobileqq.activity.miniaio.e", "com.tencent.mobileqq.activity.miniaio.f", "com.tencent.mobileqq.activity.miniaio.g", "com.tencent.mobileqq.activity.miniaio.h", "com.tencent.mobileqq.activity.miniaio.i"};

    /* JADX INFO: renamed from: d */
    public static final String[] f882d = {"com.tencent.qqmini.sdk.core.utils.CustomWidgetUtil", "com.tencent.mobileqq.utils.CustomWidgetUtil", "com.tencent.widget.CustomWidgetUtil"};

    /* JADX INFO: renamed from: e */
    public static final String[] f883e = {"com.tencent.mobileqq.troop.guild.TroopGuildChatPie"};

    /* JADX INFO: renamed from: f */
    public static final String[] f884f = {"com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy", "com.tencent.qqnt.kernelpublic.nativeinterface.IKernelMsgService$CppProxy"};

    /* JADX INFO: renamed from: g */
    public static final String[] f885g = {"com.tencent.qqnt.chats.view.MiniOldStyleHeaderNew", "com.tencent.qqnt.chats.view.MiniOldStyleHeader", "com.tencent.qqnt.chats.view.QQChatListTwoLevelHeader"};

    /* JADX INFO: renamed from: h */
    public static final String[] f886h = {"com.qqnt.widget.smartrefreshlayout.SmartRefreshLayout", "com.qqnt.widget.smartrefreshlayout.layout.SmartRefreshLayout", "com.scwang.smart.refresh.layout.SmartRefreshLayout", "com.tencent.richframework.widget.refresh.layout.SmartRefreshLayout"};

    /* JADX INFO: renamed from: i */
    public static final String[] f887i = {"com.tencent.mobileqq.msg.api.impl.MessageFacadeImpl", "com.tencent.imcore.message.QQMessageFacade", "com.tencent.imcore.message.BaseQQMessageFacade"};

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap f888j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public static volatile boolean f889k;

    /* JADX INFO: renamed from: l */
    public static volatile boolean f890l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1000a(Context context, Object obj) {
        if (obj == null) {
            return;
        }
        if (HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER) || HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER_LONG_PRESS_MENU)) {
            try {
                String strM1001b = m1001b(obj, "com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
                String strM1001b2 = m1001b(obj, "com.tencent.mobileqq.aio.msg.AIOMsgItem");
                String strM1001b3 = m1001b(obj, "com.tencent.qqnt.aio.menu.c");
                if (strM1001b.length() == 0 || strM1001b2.length() == 0 || strM1001b3.length() == 0) {
                    HookEntry.log("dexkit locate repeater_menu miss base=" + m1017r(strM1001b) + " msg=" + m1017r(strM1001b2) + " item=" + m1017r(strM1001b3));
                } else {
                    m1014o(context, "target.repeater_menu.base_class", strM1001b);
                    m1014o(context, "target.repeater_menu.msg_class", strM1001b2);
                    m1014o(context, "target.repeater_menu.item_class", strM1001b3);
                    HookEntry.log("dexkit locate repeater_menu ok base=" + strM1001b + " msg=" + strM1001b2 + " item=" + strM1001b3);
                }
            } catch (Throwable th) {
                HookEntry.log("dexkit locate repeater_menu failed: " + th.getClass().getSimpleName() + ": " + m1017r(th.getMessage()));
            }
            int iM1016q = m1016q(context, obj, "target.repeater.aio_param_class", "com.tencent.aio.data.AIOParam") + m1016q(context, obj, "target.repeater.follow_component_class", "com.tencent.mobileqq.aio.msglist.holder.component.msgfollow.AIOMsgFollowComponent");
            String strM1012m = m1012m(obj, f879a);
            if (strM1012m.length() > 0) {
                m1014o(context, "target.repeater.aio_param_host_classes", strM1012m);
            }
            HookEntry.log("dexkit locate repeater hits=" + iM1016q + " aio_hosts=" + m1018s(strM1012m).length);
        }
        if (HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT) || HookEntry.runtimeBool(Prefs.KEY_CHAT_EDGE_GUARD)) {
            int iM1016q2 = m1016q(context, obj, "target.unread_full.frame_controller_class", "com.tencent.mobileqq.activity.framebusiness.controllerinject.FrameControllerInjectImpl") + m1016q(context, obj, "target.unread_full.qui_badge_class", "com.tencent.mobileqq.quibadge.QUIBadge");
            String strM1012m2 = m1012m(obj, f880b);
            String strM1012m3 = m1012m(obj, f881c);
            String strM1012m4 = m1012m(obj, f882d);
            if (strM1012m2.length() > 0) {
                m1014o(context, "target.unread_full.rolling_text_classes", strM1012m2);
            }
            if (strM1012m3.length() > 0) {
                m1014o(context, "target.unread_full.mini_aio_classes", strM1012m3);
            }
            if (strM1012m4.length() > 0) {
                m1014o(context, "target.unread_full.mini_widget_classes", strM1012m4);
            }
            int iM1016q3 = m1016q(context, obj, "target.chat_right_swipe.drawer_class", "com.tencent.aio.frame.drawer.DrawerFrameViewGroup");
            String strM1012m5 = m1012m(obj, f883e);
            if (strM1012m5.length() > 0) {
                m1014o(context, "target.chat_right_swipe.troop_guild_classes", strM1012m5);
            }
            HookEntry.log("dexkit locate chat_message unread=" + (iM1016q2 + m1018s(strM1012m2).length + m1018s(strM1012m3).length + m1018s(strM1012m4).length) + " gestures=" + (iM1016q3 + m1018s(strM1012m5).length));
        }
        if (HookEntry.runtimeBool(Prefs.KEY_PIC_SUMMARY_ENABLED) || HookEntry.runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT) || HookEntry.runtimeBool(Prefs.KEY_DEFAULT_BUBBLE) || HookEntry.runtimeBool(Prefs.KEY_DEFAULT_FONT) || HookEntry.runtimeBool(Prefs.KEY_BLOCK_AVATAR_PENDANT) || HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
            String strM1012m6 = m1012m(obj, f884f);
            if (strM1012m6.length() > 0) {
                m1014o(context, "target.kernel.msg_service_classes", strM1012m6);
            }
            HookEntry.log("dexkit locate kernel_msg_service count=" + m1018s(strM1012m6).length);
        }
        if (HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD)) {
            String strM1012m7 = m1012m(obj, f885g);
            String strM1012m8 = m1012m(obj, f886h);
            if (strM1012m7.length() > 0) {
                m1014o(context, "target.mini_pull.header_classes", strM1012m7);
            }
            if (strM1012m8.length() > 0) {
                m1014o(context, "target.mini_pull.refresh_source_classes", strM1012m8);
            }
            HookEntry.log("dexkit locate mini_pull headers=" + m1018s(strM1012m7).length + " refresh=" + m1018s(strM1012m8).length);
        }
        if (HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
            int iM1016q4 = m1016q(context, obj, "target.anti_recall.troop_member_api_class", "com.tencent.qqnt.troopmemberlist.ITroopMemberListRepoApi") + m1016q(context, obj, "target.anti_recall.uid_api_class", "com.tencent.relation.common.api.IRelationNTUinAndUidApi") + m1016q(context, obj, "target.anti_recall.qroute_class", "com.tencent.mobileqq.qroute.QRoute") + m1016q(context, obj, "target.anti_recall.delete_service_class", "com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy") + m1016q(context, obj, "target.anti_recall.session_class", "com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession$CppProxy");
            String strM1012m9 = m1012m(obj, f887i);
            if (strM1012m9.length() > 0) {
                m1014o(context, "target.anti_recall.legacy_facade_classes", strM1012m9);
            }
            HookEntry.log("dexkit locate anti_recall hits=" + iM1016q4 + " facades=" + m1018s(strM1012m9).length);
        }
        if (HookEntry.runtimeBool(Prefs.KEY_CLEAN_EMOJI_PANEL_ENTRIES)) {
            HookEntry.log("dexkit locate emoji_panel hits=" + m1016q(context, obj, "target.emoji_panel.controller_class", "com.tencent.mobileqq.emoticonview.EmoticonPanelController"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1001b(Object obj, String str) {
        if (obj != null && str != null && str.length() != 0) {
            try {
                Object objInvoke = obj.getClass().getMethod("getClassData", String.class).invoke(obj, str);
                if (objInvoke == null) {
                    return "";
                }
                Object objInvoke2 = objInvoke.getClass().getMethod("getName", null).invoke(objInvoke, null);
                if (objInvoke2 instanceof String) {
                    return (String) objInvoke2;
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m1002c(Context context, String str) {
        String strM1003d = m1003d(context);
        if (strM1003d.endsWith(".")) {
            return strM1003d + str;
        }
        return strM1003d + "." + str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m1003d(Context context) {
        String strHostVersionSummary = HookEntry.hostVersionSummary();
        int iIndexOf = strHostVersionSummary.indexOf(", process=");
        if (iIndexOf >= 0) {
            strHostVersionSummary = strHostVersionSummary.substring(0, iIndexOf);
        }
        return "v7." + context.getPackageName() + "." + strHostVersionSummary + ".";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m1004e(String str) {
        Context contextHostContext = HookEntry.hostContext();
        if (contextHostContext != null && str.length() != 0) {
            try {
                String string = contextHostContext.getSharedPreferences("elaris_dexkit_locator", 0).getString(m1002c(contextHostContext, str), "");
                if (string != null) {
                    return string;
                }
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String[] m1005f(String str, String[] strArr, ClassLoader classLoader) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String[] strArrM1018s = m1018s(m1004e(str));
        if (strArrM1018s != null) {
            for (String str2 : strArrM1018s) {
                Class clsM1009j = m1009j(str2, classLoader);
                if (clsM1009j != null) {
                    linkedHashSet.add(clsM1009j.getName());
                }
            }
        }
        if (strArr != null) {
            for (String str3 : strArr) {
                Class clsM1009j2 = m1009j(str3, classLoader);
                if (clsM1009j2 != null) {
                    linkedHashSet.add(clsM1009j2.getName());
                }
            }
        }
        return linkedHashSet.isEmpty() ? strArr == null ? new String[0] : strArr : (String[]) linkedHashSet.toArray(new String[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m1006g(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof Closeable) {
                ((Closeable) obj).close();
            } else {
                obj.getClass().getMethod("close", null).invoke(obj, null);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m1007h(SharedPreferences sharedPreferences, String str) {
        int i = 0;
        if (sharedPreferences != null) {
            try {
                for (String str2 : sharedPreferences.getAll().keySet()) {
                    if (str2 != null && str2.startsWith(str)) {
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Class m1008i(ClassLoader classLoader, String str, String str2) {
        Class clsM1009j = m1009j(m1004e(str), classLoader);
        return clsM1009j != null ? clsM1009j : m1009j(str2, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Class m1009j(String str, ClassLoader classLoader) {
        if (str != null && str.length() != 0 && classLoader != null) {
            try {
                return Class.forName(str.replace('/', '.'), false, classLoader);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m1010k(Context context, SharedPreferences sharedPreferences, String... strArr) {
        for (String str : strArr) {
            if (!m1011l(context, sharedPreferences, str)) {
                return str;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m1011l(Context context, SharedPreferences sharedPreferences, String str) {
        try {
            String string = sharedPreferences.getString(m1002c(context, str), "");
            if (string != null) {
                return string.length() > 0;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m1012m(Object obj, String[] strArr) {
        if (strArr.length == 0) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            String strM1001b = m1001b(obj, str);
            if (strM1001b.length() > 0 && !arrayList.contains(strM1001b)) {
                arrayList.add(strM1001b);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            if (str2 != null && str2.length() != 0) {
                if (sb.length() > 0) {
                    sb.append('|');
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m1013n(Context context, SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return "context";
        }
        if (HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER) || HookEntry.runtimeBool(Prefs.KEY_MESSAGE_REPEATER_LONG_PRESS_MENU)) {
            String strM1010k = m1010k(context, sharedPreferences, "target.repeater_menu.base_class", "target.repeater_menu.msg_class", "target.repeater_menu.item_class", "target.repeater.follow_component_class", "target.repeater.aio_param_class");
            if (strM1010k.length() > 0) {
                return strM1010k;
            }
        }
        if (HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT)) {
            String strM1010k2 = m1010k(context, sharedPreferences, "target.unread_full.qui_badge_class", "target.unread_full.frame_controller_class", "target.unread_full.rolling_text_classes", "target.unread_full.mini_aio_classes", "target.unread_full.mini_widget_classes");
            if (strM1010k2.length() > 0) {
                return strM1010k2;
            }
        }
        if (HookEntry.runtimeBool(Prefs.KEY_CHAT_EDGE_GUARD)) {
            String strM1010k3 = m1010k(context, sharedPreferences, "target.chat_right_swipe.drawer_class");
            if (strM1010k3.length() > 0) {
                return strM1010k3;
            }
        }
        if ((HookEntry.runtimeBool(Prefs.KEY_PIC_SUMMARY_ENABLED) || HookEntry.runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT) || HookEntry.runtimeBool(Prefs.KEY_DEFAULT_BUBBLE) || HookEntry.runtimeBool(Prefs.KEY_DEFAULT_FONT) || HookEntry.runtimeBool(Prefs.KEY_BLOCK_AVATAR_PENDANT) || HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) && !m1011l(context, sharedPreferences, "target.kernel.msg_service_classes")) {
            return "target.kernel.msg_service_classes";
        }
        if (HookEntry.runtimeBool(Prefs.KEY_HOME_PULL_GUARD)) {
            String strM1010k4 = m1010k(context, sharedPreferences, "target.mini_pull.header_classes", "target.mini_pull.refresh_source_classes");
            if (strM1010k4.length() > 0) {
                return strM1010k4;
            }
        }
        if (HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
            String strM1010k5 = m1010k(context, sharedPreferences, "target.anti_recall.session_class", "target.anti_recall.delete_service_class", "target.anti_recall.qroute_class", "target.anti_recall.uid_api_class", "target.anti_recall.troop_member_api_class", "target.anti_recall.legacy_facade_classes");
            if (strM1010k5.length() > 0) {
                return strM1010k5;
            }
        }
        return (!HookEntry.runtimeBool(Prefs.KEY_CLEAN_EMOJI_PANEL_ENTRIES) || m1011l(context, sharedPreferences, "target.emoji_panel.controller_class")) ? "" : "target.emoji_panel.controller_class";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m1014o(Context context, String str, String str2) {
        if (str.length() == 0 || str2.length() == 0) {
            return;
        }
        try {
            context.getSharedPreferences("elaris_dexkit_locator", 0).edit().putString(m1002c(context, str), str2).apply();
        } catch (Throwable th) {
            HookEntry.log("dexkit locator cache write failed key=" + m1017r(str) + ": " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m1015p(String str, String str2) {
        Context contextHostContext = HookEntry.hostContext();
        if (contextHostContext == null || str.length() == 0 || str2.length() == 0) {
            return;
        }
        try {
            contextHostContext.getSharedPreferences("elaris_dexkit_locator", 0).edit().putString(m1002c(contextHostContext, str), str2).apply();
        } catch (Throwable th) {
            HookEntry.log("dexkit locator cache write failed key=" + m1017r(str) + ": " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static int m1016q(Context context, Object obj, String str, String str2) {
        String strM1001b = m1001b(obj, str2);
        if (strM1001b.length() == 0) {
            return 0;
        }
        m1014o(context, str, strM1001b);
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m1017r(String str) {
        if (str == null) {
            return "";
        }
        String strReplace = str.replace('\n', ' ').replace('\r', ' ');
        return strReplace.length() > 160 ? strReplace.substring(0, 160) : strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String[] m1018s(String str) {
        if (str.length() == 0) {
            return new String[0];
        }
        String[] strArrSplit = str.split("\\|");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        int length = strArrSplit.length;
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            String strTrim = str2 == null ? "" : str2.trim();
            if (strTrim.length() > 0) {
                arrayList.add(strTrim);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
