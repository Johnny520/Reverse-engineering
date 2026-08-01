package lin.xposed.hook.javaplugin;

import android.app.Activity;
import android.content.Context;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.load.engine.C3004;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import io.ktor.client.plugins.AbstractC3932;
import lin.xposed.hook.javaplugin.dialog.PluginDialog;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p257.C8226;
import p257.RunnableC8233;
import p319.C8684;
import p319.C8685;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class JavaPluginLoad {
    public static void showOnlinePluginDialog(Context context) {
        try {
            PluginSdkConfig.setDOWNLOAD_DIR(AbstractC3932.m8321(AbstractC3056.m6668(-3937620394945807783L)));
            PluginSdkConfig.setINSTALL_DIR(AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937620425010578855L)));
            PluginSdkConfig.setUSER_UIN(QQEnvTool.getCurrentUin());
            PluginSdkConfig.setUSER_NICKNAME(QQEnvTool.getCurrentAccountNickName());
            C3004 c3004 = new C3004((Activity) context, 5);
            C8226 c8226 = (C8226) c3004.f9535;
            int i = 0;
            c8226.f22707 = new C8684(c3004, (byte) 0);
            if (c8226.f22709 != null) {
                AbstractC3737.m8043(new RunnableC8233(c8226, i));
            }
            C8685 c8685 = new C8685(c3004, 4);
            c8226.f22701 = c8685;
            if (c8226.f11579) {
                c8685.mo8079(c8226.f22702);
            }
            c8226.m13733();
        } catch (Exception e) {
            AbstractC6154.m11561(e);
            String strM6668 = AbstractC3056.m6668(-3937620506614957479L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }

    public static void showPluginDialog(Context context) {
        try {
            new PluginDialog(context).show();
        } catch (Exception e) {
            AbstractC6154.m11561(e);
            String strM6668 = AbstractC3056.m6668(-3937620506614957479L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }
}
