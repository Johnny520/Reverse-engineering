package lin.xposed.hook.javaplugin.controller;

import androidx.compose.material.ripple.RunnableC1107;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.util.ArrayList;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p026.AbstractC6296;
import p035.AbstractC6340;
import p391.C9114;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class AutoLoadPlugin extends AbstractC6296 {
    private static final String CONFIG_FILE_NAME = AbstractC3056.m6668(-3937617216670008743L);
    private static final C9114 configUtils = new C9114(AbstractC3056.m6668(-3937617216670008743L), 0);

    public static void addAutoLoadPlugin(PluginInfo pluginInfo) {
        C9114 c9114 = configUtils;
        ArrayList arrayListM14643 = c9114.m14643(String.class, AbstractC3056.m6668(-3937617216670008743L));
        if (arrayListM14643.contains(pluginInfo.getPluginID())) {
            return;
        }
        arrayListM14643.add(pluginInfo.getPluginID());
        c9114.m14640(arrayListM14643, AbstractC3056.m6668(-3937617216670008743L));
    }

    public static boolean isAutoLoading(PluginInfo pluginInfo) {
        return configUtils.m14643(String.class, AbstractC3056.m6668(-3937617216670008743L)).contains(pluginInfo.getPluginID());
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
            getExceptionCollectionToolInstance().m11804(e);
        }
    }

    public static void removeAutoloadPlugin(PluginInfo pluginInfo) {
        C9114 c9114 = configUtils;
        ArrayList arrayListM14643 = c9114.m14643(String.class, AbstractC3056.m6668(-3937617216670008743L));
        arrayListM14643.remove(pluginInfo.getPluginID());
        c9114.m14640(arrayListM14643, AbstractC3056.m6668(-3937617216670008743L));
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
        return new File(AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937620425010578855L))).listFiles(new C5531(0));
    }

    @Override // p026.AbstractC6296
    public boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public void loadHook(ClassLoader classLoader) {
        if (AbstractC6340.m11895() || AbstractC6340.f17464.equals(AbstractC3056.m6668(-3937555257471796647L))) {
            new Thread(new RunnableC1107(this, 8)).start();
        }
    }

    public void startAutoLoadPlugin() {
        ArrayList arrayListM14643 = configUtils.m14643(String.class, AbstractC3056.m6668(-3937617216670008743L));
        ArrayList arrayList = new ArrayList();
        for (PluginInfo pluginInfo : scanAllJavaPluginInfo()) {
            String pluginID = pluginInfo.getPluginID();
            if (arrayListM14643.contains(pluginID)) {
                arrayList.add(pluginID);
                PluginManager.loadPlugin(null, pluginInfo);
            }
        }
        configUtils.m14640(arrayList, AbstractC3056.m6668(-3937617216670008743L));
    }
}
