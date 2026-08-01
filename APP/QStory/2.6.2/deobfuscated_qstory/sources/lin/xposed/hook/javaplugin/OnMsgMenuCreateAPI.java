package lin.xposed.hook.javaplugin;

import android.view.View;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C4210;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.javaplugin.bean.MessageData;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import p010.C6160;
import p024.AbstractC6291;
import p026.AbstractC6298;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p037.C6360;
import p392.C9125;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class OnMsgMenuCreateAPI extends AbstractC6298 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadHook$0(XC_MethodHook.MethodHookParam methodHookParam) {
        Iterator<PluginLoader> it = PluginManager.getAllRunningPluginLoader().iterator();
        while (it.hasNext()) {
            it.next().msgMenuItemMap.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$loadHook$1(PluginLoader pluginLoader, String str, MessageData messageData) {
        PluginCallback.onMsgMenuCallback(pluginLoader, str, messageData);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadHook$2(XC_MethodHook.MethodHookParam methodHookParam) {
        List list = (List) AbstractC6317.m11830(List.class, methodHookParam.args[0]);
        Object objM11830 = AbstractC6317.m11830(AbstractC6318.m11838("com.tencent.mobileqq.aio.msg.AIOMsgItem"), list.get(0));
        final MessageData message = ((PluginMessageCallbackAPI) AbstractC6291.f17375.get(PluginMessageCallbackAPI.class)).parseMessage(XposedHelpers.callMethod(objM11830, "getMsgRecord", new Object[0]));
        for (final PluginLoader pluginLoader : PluginManager.getAllRunningPluginLoader()) {
            PluginCallback.onCreateMenu(pluginLoader, message);
            Iterator<Map.Entry<String, String>> it = pluginLoader.msgMenuItemMap.entrySet().iterator();
            while (it.hasNext()) {
                final String key = it.next().getKey();
                list.add(0, C6360.m11913(objM11830, key, R.mipmap.ic_launcher_round, new Callable() { // from class: lin.xposed.hook.javaplugin.飘花落叶言子楪世苏兰哲
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return OnMsgMenuCreateAPI.lambda$loadHook$1(pluginLoader, key, message);
                    }
                }));
            }
        }
    }

    @Override // p026.AbstractC6296
    public void loadHook(ClassLoader classLoader) {
        Method methodM11827;
        C9125 c9125M14681 = C9125.m14681("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
        c9125M14681.m14683(classLoader.loadClass("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout"));
        XposedBridge.hookMethod((Method) c9125M14681.m14686(), new C6160(new C4210(), 1));
        if (AbstractC6340.f17461 > 5028) {
            C6316 c6316M11825 = C6316.m11825("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
            String strM6668 = "setMenu";
            C1245 c1245 = c6316M11825.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{Object.class, View.class};
            methodM11827 = c6316M11825.m11827();
        } else {
            C6316 c6316M118252 = C6316.m11825("com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout");
            String strM66682 = "setMenu";
            C1245 c12452 = c6316M118252.f17409;
            c12452.f3617 = strM66682;
            c12452.f3618 = new Class[]{Object.class};
            methodM11827 = c6316M118252.m11827();
        }
        AbstractC5061.m10019(methodM11827, new C5553(0));
    }
}
