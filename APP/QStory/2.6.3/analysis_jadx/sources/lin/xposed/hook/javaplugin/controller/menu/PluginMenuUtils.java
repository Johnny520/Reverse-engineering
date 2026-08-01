package lin.xposed.hook.javaplugin.controller.menu;

import lin.xposed.hook.javaplugin.controller.PluginLoader;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMenuUtils {
    public void addItemCallbackToPlugin(PluginLoader pluginLoader, String str, String str2) {
        pluginLoader.dialogItemMap.put(str, str2);
    }
}
