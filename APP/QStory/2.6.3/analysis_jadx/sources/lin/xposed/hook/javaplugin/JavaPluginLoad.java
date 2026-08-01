package lin.xposed.hook.javaplugin;

import android.app.Activity;
import android.content.Context;
import com.bumptech.glide.load.engine.C3005;
import io.ktor.client.plugins.AbstractC3933;
import lin.xposed.hook.javaplugin.dialog.PluginDialog;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p287.AbstractC8405;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class JavaPluginLoad {
    public static void showOnlinePluginDialog(Context context) {
        try {
            PluginSdkConfig.setDOWNLOAD_DIR(AbstractC3933.m8311(AbstractC8405.m13973("喵喵呜喵喵喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵")));
            PluginSdkConfig.setINSTALL_DIR(AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜")));
            PluginSdkConfig.setUSER_UIN(QQEnvTool.getCurrentUin());
            PluginSdkConfig.setUSER_NICKNAME(QQEnvTool.getCurrentAccountNickName());
            C3005 c3005 = new C3005((Activity) context, 5);
            c3005.m6495();
            c3005.m6492();
        } catch (Exception e) {
            AbstractC6185.m11592(e);
            String strM13972 = AbstractC8405.m13972(576);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
    }

    public static void showPluginDialog(Context context) {
        try {
            new PluginDialog(context).show();
        } catch (Exception e) {
            AbstractC6185.m11592(e);
            String strM13972 = AbstractC8405.m13972(576);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
    }
}
