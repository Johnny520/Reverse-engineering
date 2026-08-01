package lin.xposed.hook.javaplugin;

import com.bumptech.glide.AbstractC3056;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.bean.MessageData;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.util.PluginSendMsgTool;
import lin.xposed.hook.util.qq.QQEnvTool;
import p333.AbstractC8802;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginCallback {
    private static void invokeToPluginMethodMenuCallback(PluginLoader pluginLoader, String str) {
        int chatType = PluginSendMsgTool.getChatType();
        String currentFriendUin = PluginSendMsgTool.getCurrentFriendUin();
        String currentGroupUin = PluginSendMsgTool.getCurrentGroupUin();
        if (chatType == 1) {
            PluginManager.invokeToPluginMethod(pluginLoader, str, AbstractC3056.m6668(-3937561979095614887L), currentFriendUin, Integer.valueOf(chatType));
        }
        if (chatType == 2) {
            PluginManager.invokeToPluginMethod(pluginLoader, str, currentGroupUin, AbstractC3056.m6668(-3937561979095614887L), Integer.valueOf(chatType));
        }
        if (chatType == 100) {
            PluginManager.invokeToPluginMethod(pluginLoader, str, AbstractC3056.m6668(-3937561979095614887L), QQEnvTool.getUinFromUid(currentGroupUin), Integer.valueOf(chatType));
        }
        if (chatType != 1 && chatType != 100) {
            currentFriendUin = currentGroupUin;
        }
        PluginManager.invokeToPluginMethod(pluginLoader, str, currentFriendUin);
    }

    public static void onCallbackOnRawMsg(Object obj) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC3056.m6668(-3937620120067900839L), obj);
    }

    public static void onClickFloatingWindow() {
        int chatType = PluginSendMsgTool.getChatType();
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC3056.m6668(-3937620321931363751L), Integer.valueOf(chatType), (chatType == 1 || chatType == 100) ? PluginSendMsgTool.getCurrentFriendUin() : PluginSendMsgTool.getCurrentGroupUin());
    }

    public static void onCreateMenu(PluginLoader pluginLoader, MessageData messageData) {
        PluginManager.invokeToPluginMethodAndGetInvokeResult(pluginLoader, AbstractC3056.m6668(-3937620016988685735L), messageData);
    }

    public static void onJoinTroop(String str, String str2, String str3) {
        if (AbstractC8802.m14452(str2)) {
            AbstractC8802.m14451(str, str2, AbstractC3056.m6668(-3937620205967246759L));
        }
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC3056.m6668(-3937620236032017831L), str, str2, 2);
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC3056.m6668(-3937620236032017831L), str, str2, str3, 2);
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
        if (AbstractC8802.m14452(messageData.UserUin)) {
            AbstractC8802.m14451(messageData.GroupUin, messageData.UserUin, AbstractC3056.m6668(-3937620025578620327L));
        }
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC3056.m6668(-3937620025578620327L), messageData);
    }

    public static void onMsgMenuCallback(PluginLoader pluginLoader, String str, MessageData messageData) {
        String str2 = pluginLoader.msgMenuItemMap.get(str);
        if (str2 == null) {
            return;
        }
        PluginManager.invokeToPluginMethod(pluginLoader, str2, messageData);
    }

    public static void onMsgRetract(MessageData messageData) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC3056.m6668(-3937619935384307111L), messageData);
    }

    public static String onSendMsg(String str, String str2, int i) {
        Iterator<PluginLoader> it = PluginManager.getAllRunningPluginLoader().iterator();
        while (it.hasNext()) {
            String str3 = (String) PluginManager.invokeToPluginMethodAndGetInvokeResult(it.next(), AbstractC3056.m6668(-3937620278981690791L), str, str2, Integer.valueOf(i));
            if (str3 != null) {
                str = str3;
            }
        }
        return str;
    }

    public static void onTroopBanInfo(String str, String str2, String str3, long j) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC3056.m6668(-3937620090003129767L), str, str2, str3, Long.valueOf(j));
    }

    public static void onTroopQuit(String str, String str2) {
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC3056.m6668(-3937620236032017831L), str, str2, 1);
        PluginManager.invokeInAllScriptCallbackMethod(AbstractC3056.m6668(-3937620236032017831L), str, str2, AbstractC3056.m6668(-3937561979095614887L), 1);
    }
}
