package lin.xposed.hook.javaplugin;

import android.view.View;
import androidx.compose.runtime.internal.C1245;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C4211;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.reflect.jvm.internal.AbstractC5062;
import lin.xposed.hook.javaplugin.bean.MessageData;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import p010.C6191;
import p024.AbstractC6309;
import p026.AbstractC6316;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p038.C6377;
import p287.AbstractC8405;
import p389.C9092;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class OnMsgMenuCreateAPI extends AbstractC6316 {
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
        List list = (List) AbstractC6336.m11858(List.class, methodHookParam.args[0]);
        Object objM11858 = AbstractC6336.m11858(AbstractC6337.m11866(AbstractC8405.m13972(160)), list.get(0));
        final MessageData message = ((PluginMessageCallbackAPI) AbstractC6309.f17424.get(PluginMessageCallbackAPI.class)).parseMessage(XposedHelpers.callMethod(objM11858, AbstractC8405.m13972(164), new Object[0]));
        for (final PluginLoader pluginLoader : PluginManager.getAllRunningPluginLoader()) {
            PluginCallback.onCreateMenu(pluginLoader, message);
            Iterator<Map.Entry<String, String>> it = pluginLoader.msgMenuItemMap.entrySet().iterator();
            while (it.hasNext()) {
                final String key = it.next().getKey();
                list.add(0, C6377.m11961(objM11858, key, R.mipmap.ic_launcher_round, new Callable() { // from class: lin.xposed.hook.javaplugin.飘花落叶言子楪世苏兰哲
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return OnMsgMenuCreateAPI.lambda$loadHook$1(pluginLoader, key, message);
                    }
                }));
            }
        }
    }

    @Override // p026.AbstractC6314
    public void loadHook(ClassLoader classLoader) {
        Method methodM11855;
        C9092 c9092M14673 = C9092.m14673(AbstractC8405.m13972(158));
        c9092M14673.m14675(classLoader.loadClass(AbstractC8405.m13972(158)));
        XposedBridge.hookMethod((Method) c9092M14673.m14605(), new C6191(new C4211(), 1));
        if (AbstractC6358.f17508 > 5028) {
            C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(158));
            String strM13973 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
            C1245 c1245 = c6335M11853.f17458;
            c1245.f3618 = strM13973;
            c1245.f3619 = new Class[]{Object.class, View.class};
            methodM11855 = c6335M11853.m11855();
        } else {
            C6335 c6335M118532 = C6335.m11853(AbstractC8405.m13972(159));
            String strM139732 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
            C1245 c12452 = c6335M118532.f17458;
            c12452.f3618 = strM139732;
            c12452.f3619 = new Class[]{Object.class};
            methodM11855 = c6335M118532.m11855();
        }
        AbstractC5062.m10039(methodM11855, new C5554(0));
    }
}
