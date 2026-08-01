package lin.xposed.hook.javaplugin;

import android.util.Log;
import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.AbstractC5062;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import p010.AbstractC6188;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginOutput {
    private final PluginInfo pluginInfo;

    public PluginOutput(PluginInfo pluginInfo) {
        this.pluginInfo = pluginInfo;
    }

    public void e(Throwable th) {
        StringBuilder sbM140 = AbstractC0053.m140(AbstractC6188.m11607().concat(AbstractC8405.m13973("喵呜呜呜呜喵喵呜")));
        sbM140.append(Log.getStackTraceString(th));
        AbstractC5062.m10056(this.pluginInfo.getPluginLocalPath() + AbstractC8405.m13972(599), sbM140.toString().concat(AbstractC8405.m13973("喵呜呜呜呜喵喵呜")), true);
    }

    public void log(Object obj) {
        AbstractC5062.m10056(this.pluginInfo.getPluginLocalPath() + AbstractC8405.m13972(598), (AbstractC6188.m11607().concat(AbstractC8405.m13973("喵呜呜呜呜喵喵呜")) + obj).concat(AbstractC8405.m13973("喵呜呜呜呜喵喵呜")), true);
    }
}
