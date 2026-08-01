package lin.xposed.hook.javaplugin.controller;

import androidx.compose.material.ripple.RunnableC1107;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.util.ArrayList;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p026.AbstractC6314;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p391.C9095;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class AutoLoadPlugin extends AbstractC6314 {
    private static final String CONFIG_FILE_NAME = AbstractC8405.m13972(612);
    private static final C9095 configUtils = new C9095(AbstractC8405.m13972(612), 0);

    public static void addAutoLoadPlugin(PluginInfo pluginInfo) {
        C9095 c9095 = configUtils;
        ArrayList arrayListM14680 = c9095.m14680(String.class, AbstractC8405.m13972(612));
        if (arrayListM14680.contains(pluginInfo.getPluginID())) {
            return;
        }
        arrayListM14680.add(pluginInfo.getPluginID());
        c9095.m14677(arrayListM14680, AbstractC8405.m13972(612));
    }

    public static boolean isAutoLoading(PluginInfo pluginInfo) {
        return configUtils.m14680(String.class, AbstractC8405.m13972(612)).contains(pluginInfo.getPluginID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadHook$0() {
        while (QQEnvTool.getCurrentUin() == null) {
            try {
                Thread.sleep(50L);
            } catch (InterruptedException unused) {
            }
        }
        PluginManager.stopAllPlugin();
        try {
            startAutoLoadPlugin();
        } catch (Exception e) {
            getExceptionCollectionToolInstance().m11832(e);
        }
    }

    public static void removeAutoloadPlugin(PluginInfo pluginInfo) {
        C9095 c9095 = configUtils;
        ArrayList arrayListM14680 = c9095.m14680(String.class, AbstractC8405.m13972(612));
        arrayListM14680.remove(pluginInfo.getPluginID());
        c9095.m14677(arrayListM14680, AbstractC8405.m13972(612));
    }

    private ArrayList<PluginInfo> scanAllJavaPluginInfo() {
        ArrayList<PluginInfo> arrayList = new ArrayList<>();
        File[] fileArrScanScriptDirectory = scanScriptDirectory();
        if (fileArrScanScriptDirectory != null) {
            for (File file : fileArrScanScriptDirectory) {
                PluginInfo pluginInfoNewPluginInfo = PluginManager.newPluginInfo(file);
                if (pluginInfoNewPluginInfo != null) {
                    arrayList.add(pluginInfoNewPluginInfo);
                }
            }
        }
        return arrayList;
    }

    private File[] scanScriptDirectory() {
        return new File(AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"))).listFiles(new C5532(0));
    }

    @Override // p026.AbstractC6314
    public boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public void loadHook(ClassLoader classLoader) {
        if (AbstractC6358.m11943() || AbstractC6358.f17511.equals(AbstractC8405.m13972(61))) {
            new Thread(new RunnableC1107(this, 8)).start();
        }
    }

    public void startAutoLoadPlugin() {
        ArrayList arrayListM14680 = configUtils.m14680(String.class, AbstractC8405.m13972(612));
        ArrayList arrayList = new ArrayList();
        for (PluginInfo pluginInfo : scanAllJavaPluginInfo()) {
            String pluginID = pluginInfo.getPluginID();
            if (arrayListM14680.contains(pluginID)) {
                arrayList.add(pluginID);
                PluginManager.loadPlugin(null, pluginInfo);
            }
        }
        configUtils.m14677(arrayList, AbstractC8405.m13972(612));
    }
}
