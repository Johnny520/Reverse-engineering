package lin.xposed.hook.javaplugin.controller;

import androidx.compose.material.ripple.RunnableC1945;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.util.ArrayList;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p042.AbstractC7143;
import p052.AbstractC7187;
import p407.C9924;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class AutoLoadPlugin extends AbstractC7143 {
    private static final String CONFIG_FILE_NAME = "AutoLoadPluginV2";
    private static final C9924 configUtils = new C9924("AutoLoadPluginV2", 0);

    public static void addAutoLoadPlugin(PluginInfo pluginInfo) {
        C9924 c9924 = configUtils;
        ArrayList arrayListM15239 = c9924.m15239(String.class, "AutoLoadPluginV2");
        if (arrayListM15239.contains(pluginInfo.getPluginID())) {
            return;
        }
        arrayListM15239.add(pluginInfo.getPluginID());
        c9924.m15236(arrayListM15239, "AutoLoadPluginV2");
    }

    public static boolean isAutoLoading(PluginInfo pluginInfo) {
        return configUtils.m15239(String.class, "AutoLoadPluginV2").contains(pluginInfo.getPluginID());
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
            getExceptionCollectionToolInstance().m12391(e);
        }
    }

    public static void removeAutoloadPlugin(PluginInfo pluginInfo) {
        C9924 c9924 = configUtils;
        ArrayList arrayListM15239 = c9924.m15239(String.class, "AutoLoadPluginV2");
        arrayListM15239.remove(pluginInfo.getPluginID());
        c9924.m15236(arrayListM15239, "AutoLoadPluginV2");
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
        return new File(AbstractC4765.m8874().concat("/Plugin")).listFiles(new C6364(0));
    }

    @Override // p042.AbstractC7143
    public boolean isLoadedByDefault() {
        return true;
    }

    @Override // p042.AbstractC7143
    public void loadHook(ClassLoader classLoader) {
        if (AbstractC7187.m12502() || AbstractC7187.f17856.equals("com.tencent.mobileqq:MSF")) {
            new Thread(new RunnableC1945(this, 8)).start();
        }
    }

    public void startAutoLoadPlugin() {
        ArrayList arrayListM15239 = configUtils.m15239(String.class, "AutoLoadPluginV2");
        ArrayList arrayList = new ArrayList();
        for (PluginInfo pluginInfo : scanAllJavaPluginInfo()) {
            String pluginID = pluginInfo.getPluginID();
            if (arrayListM15239.contains(pluginID)) {
                arrayList.add(pluginID);
                PluginManager.loadPlugin(null, pluginInfo);
            }
        }
        configUtils.m15236(arrayList, "AutoLoadPluginV2");
    }
}
