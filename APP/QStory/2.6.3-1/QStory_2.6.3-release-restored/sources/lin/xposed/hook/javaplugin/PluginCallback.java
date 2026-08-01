package lin.xposed.hook.javaplugin;

import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.MessageData;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.util.PluginSendMsgTool;
import lin.xposed.hook.util.p011qq.QQEnvTool;

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
        PluginManager.invokeInAllScriptCallbackMethod("callbackOnRawMsg", obj);
    }

    public static void onClickFloatingWindow() {
        int chatType = PluginSendMsgTool.getChatType();
        PluginManager.invokeInAllScriptCallbackMethod("onClickFloatingWindow", Integer.valueOf(chatType), (chatType == 1 || chatType == 100) ? PluginSendMsgTool.getCurrentFriendUin() : PluginSendMsgTool.getCurrentGroupUin());
    }

    public static void onCreateMenu(PluginLoader pluginLoader, MessageData messageData) {
        PluginManager.invokeToPluginMethodAndGetInvokeResult(pluginLoader, "onCreateMenu", messageData);
    }

    public static void onJoinTroop(String str, String str2, String str3) {
        PluginManager.invokeInAllScriptCallbackMethod("onTroopEvent", str, str2, 2);
        PluginManager.invokeInAllScriptCallbackMethod("onTroopEvent", str, str2, str3, 2);
    }

    public static void onMenuCallback(PluginLoader pluginLoader, String str) {
        try {
            invokeToPluginMethodMenuCallback(pluginLoader, pluginLoader.dialogItemMap.get(str));
        } catch (Throwable th) {
            new PluginOutput(pluginLoader.getJavaPluginInfo()).m157e(th);
        }
    }

    public static void onMenuTemporaryCallback(PluginLoader pluginLoader, String str) {
        invokeToPluginMethodMenuCallback(pluginLoader, pluginLoader.temporaryItemMap.get(str));
    }

    public static void onMessage(MessageData messageData) {
        PluginManager.invokeInAllScriptCallbackMethod("onMsg", messageData);
    }

    public static void onMsgMenuCallback(PluginLoader pluginLoader, String str, MessageData messageData) {
        String str2 = pluginLoader.msgMenuItemMap.get(str);
        if (str2 == null) {
            return;
        }
        PluginManager.invokeToPluginMethod(pluginLoader, str2, messageData);
    }

    public static void onMsgRetract(MessageData messageData) {
        PluginManager.invokeInAllScriptCallbackMethod("onMsgRetract", messageData);
    }

    public static String onSendMsg(String str, String str2, int i) {
        Iterator<PluginLoader> it = PluginManager.getAllRunningPluginLoader().iterator();
        while (it.hasNext()) {
            String str3 = (String) PluginManager.invokeToPluginMethodAndGetInvokeResult(it.next(), "getMsg", str, str2, Integer.valueOf(i));
            if (str3 != null) {
                str = str3;
            }
        }
        return str;
    }

    public static void onTroopBanInfo(String str, String str2, String str3, long j) {
        PluginManager.invokeInAllScriptCallbackMethod("onForbiddenEvent", str, str2, str3, Long.valueOf(j));
    }

    public static void onTroopQuit(String str, String str2) {
        PluginManager.invokeInAllScriptCallbackMethod("onTroopEvent", str, str2, 1);
        PluginManager.invokeInAllScriptCallbackMethod("onTroopEvent", str, str2, "", 1);
    }
}
