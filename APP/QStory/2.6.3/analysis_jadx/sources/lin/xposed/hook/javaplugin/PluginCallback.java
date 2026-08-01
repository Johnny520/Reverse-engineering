package lin.xposed.hook.javaplugin;

import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.MessageData;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.util.PluginSendMsgTool;
import lin.xposed.hook.util.qq.QQEnvTool;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginCallback {
    private static void invokeToPluginMethodMenuCallback(PluginLoader pluginLoader, String str) {
        int chatType = PluginSendMsgTool.getChatType();
        String currentFriendUin = PluginSendMsgTool.getCurrentFriendUin();
        String currentGroupUin = PluginSendMsgTool.getCurrentGroupUin();
        if (chatType == 1) {
            PluginManager.invokeToPluginMethod(pluginLoader, str, "", currentFriendUin, Integer.valueOf(chatType));
        }
        if (chatType == 2) {
            PluginManager.invokeToPluginMethod(pluginLoader, str, currentGroupUin, "", Integer.valueOf(chatType));
        }
        if (chatType == 100) {
            PluginManager.invokeToPluginMethod(pluginLoader, str, "", QQEnvTool.getUinFromUid(currentGroupUin), Integer.valueOf(chatType));
        }
        if (chatType != 1 && chatType != 100) {
            currentFriendUin = currentGroupUin;
        }
        PluginManager.invokeToPluginMethod(pluginLoader, str, currentFriendUin);
    }

    public static void onCallbackOnRawMsg(Object obj) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC8405.m13972(579), obj);
    }

    public static void onClickFloatingWindow() {
        int chatType = PluginSendMsgTool.getChatType();
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC8405.m13972(577), Integer.valueOf(chatType), (chatType == 1 || chatType == 100) ? PluginSendMsgTool.getCurrentFriendUin() : PluginSendMsgTool.getCurrentGroupUin());
    }

    public static void onCreateMenu(PluginLoader pluginLoader, MessageData messageData) {
        PluginManager.invokeToPluginMethodAndGetInvokeResult(pluginLoader, AbstractC8405.m13972(581), messageData);
    }

    public static void onJoinTroop(String str, String str2, String str3) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC8405.m13972(578), str, str2, 2);
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC8405.m13972(578), str, str2, str3, 2);
    }

    public static void onMenuCallback(PluginLoader pluginLoader, String str) {
        try {
            invokeToPluginMethodMenuCallback(pluginLoader, pluginLoader.dialogItemMap.get(str));
        } catch (Throwable th) {
            new PluginOutput(pluginLoader.getJavaPluginInfo()).e(th);
        }
    }

    public static void onMenuTemporaryCallback(PluginLoader pluginLoader, String str) {
        invokeToPluginMethodMenuCallback(pluginLoader, pluginLoader.temporaryItemMap.get(str));
    }

    public static void onMessage(MessageData messageData) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜喵呜呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵呜喵"), messageData);
    }

    public static void onMsgMenuCallback(PluginLoader pluginLoader, String str, MessageData messageData) {
        String str2 = pluginLoader.msgMenuItemMap.get(str);
        if (str2 == null) {
            return;
        }
        PluginManager.invokeToPluginMethod(pluginLoader, str2, messageData);
    }

    public static void onMsgRetract(MessageData messageData) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC8405.m13972(582), messageData);
    }

    public static String onSendMsg(String str, String str2, int i) {
        Iterator<PluginLoader> it = PluginManager.getAllRunningPluginLoader().iterator();
        while (it.hasNext()) {
            String str3 = (String) PluginManager.invokeToPluginMethodAndGetInvokeResult(it.next(), AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵呜呜"), str, str2, Integer.valueOf(i));
            if (str3 != null) {
                str = str3;
            }
        }
        return str;
    }

    public static void onTroopBanInfo(String str, String str2, String str3, long j) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC8405.m13972(580), str, str2, str3, Long.valueOf(j));
    }

    public static void onTroopQuit(String str, String str2) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC8405.m13972(578), str, str2, 1);
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC8405.m13972(578), str, str2, "", 1);
    }
}
