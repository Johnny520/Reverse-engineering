package lin.xposed.hook.javaplugin;

import android.app.Activity;
import android.content.Context;
import com.bumptech.glide.load.engine.C3837;
import io.ktor.client.plugins.AbstractC4765;
import lin.xposed.hook.javaplugin.dialog.PluginDialog;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7014;
import p026.AbstractC7017;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class JavaPluginLoad {
    public static void showOnlinePluginDialog(Context context) {
        try {
            PluginSdkConfig.setDOWNLOAD_DIR(AbstractC4765.m8870("Plugin"));
            PluginSdkConfig.setINSTALL_DIR(AbstractC4765.m8874().concat("/Plugin"));
            PluginSdkConfig.setUSER_UIN(QQEnvTool.getCurrentUin());
            PluginSdkConfig.setUSER_NICKNAME(QQEnvTool.getCurrentAccountNickName());
            C3837 c3837 = new C3837((Activity) context, 5);
            c3837.m7055();
            c3837.m7052();
        } catch (Exception e) {
            AbstractC7014.m12151(e);
            String strM14531 = "plugin dialog";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
        }
    }

    public static void showPluginDialog(Context context) {
        try {
            new PluginDialog(context).show();
        } catch (Exception e) {
            AbstractC7014.m12151(e);
            String strM14531 = "plugin dialog";
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
        }
    }
}
