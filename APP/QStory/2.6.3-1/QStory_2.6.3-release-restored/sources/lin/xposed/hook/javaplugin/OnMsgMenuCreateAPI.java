package lin.xposed.hook.javaplugin;

import android.view.View;
import androidx.compose.runtime.internal.C2080;
import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C5043;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.javaplugin.bean.MessageData;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import p026.C7020;
import p040.AbstractC7138;
import p042.AbstractC7145;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p054.C7206;
import p405.C9921;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class OnMsgMenuCreateAPI extends AbstractC7145 {
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
        List list = (List) AbstractC7165.m12417(List.class, methodHookParam.args[0]);
        Object objM12417 = AbstractC7165.m12417(AbstractC7166.m12425("com.tencent.mobileqq.aio.msg.AIOMsgItem"), list.get(0));
        final MessageData message = ((PluginMessageCallbackAPI) AbstractC7138.f17769.get(PluginMessageCallbackAPI.class)).parseMessage(XposedHelpers.callMethod(objM12417, "getMsgRecord", new Object[0]));
        for (final PluginLoader pluginLoader : PluginManager.getAllRunningPluginLoader()) {
            PluginCallback.onCreateMenu(pluginLoader, message);
            Iterator<Map.Entry<String, String>> it = pluginLoader.msgMenuItemMap.entrySet().iterator();
            while (it.hasNext()) {
                final String key = it.next().getKey();
                list.add(0, C7206.m12520(objM12417, key, C0328R.mipmap.ic_launcher_round, new Callable() { // from class: lin.xposed.hook.javaplugin.飘花落叶言子楪世苏兰哲
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return OnMsgMenuCreateAPI.lambda$loadHook$1(pluginLoader, key, message);
                    }
                }));
            }
        }
    }

    @Override // p042.AbstractC7143
    public void loadHook(ClassLoader classLoader) {
        Method methodM12414;
        C9921 c9921M15232 = C9921.m15232("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
        c9921M15232.m15234(classLoader.loadClass("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout"));
        XposedBridge.hookMethod((Method) c9921M15232.m15164(), new C7020(new C5043(), 1));
        if (AbstractC7187.f17853 > 5028) {
            C7164 c7164M12412 = C7164.m12412("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout");
            String strM14532 = "setMenu";
            C2080 c2080 = c7164M12412.f17803;
            c2080.f3963 = strM14532;
            c2080.f3964 = new Class[]{Object.class, View.class};
            methodM12414 = c7164M12412.m12414();
        } else {
            C7164 c7164M124122 = C7164.m12412("com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout");
            String strM145322 = "setMenu";
            C2080 c20802 = c7164M124122.f17803;
            c20802.f3963 = strM145322;
            c20802.f3964 = new Class[]{Object.class};
            methodM12414 = c7164M124122.m12414();
        }
        AbstractC5894.m10598(methodM12414, new C6385(0));
    }
}
