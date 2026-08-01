package lin.xposed.hook.javaplugin;

import android.util.Log;
import androidx.activity.AbstractC0900;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import p026.AbstractC7017;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginOutput {
    private final PluginInfo pluginInfo;

    public PluginOutput(PluginInfo pluginInfo) {
        this.pluginInfo = pluginInfo;
    }

    /* JADX INFO: renamed from: e */
    public void m157e(Throwable th) {
        StringBuilder sbM700 = AbstractC0900.m700(AbstractC7017.m12166().concat(AbstractC9234.m14532("喵呜呜呜呜喵喵呜")));
        sbM700.append(Log.getStackTraceString(th));
        AbstractC5894.m10615(this.pluginInfo.getPluginLocalPath() + AbstractC9234.m14531(599), sbM700.toString().concat(AbstractC9234.m14532("喵呜呜呜呜喵喵呜")), true);
    }

    public void log(Object obj) {
        AbstractC5894.m10615(this.pluginInfo.getPluginLocalPath() + AbstractC9234.m14531(598), (AbstractC7017.m12166().concat(AbstractC9234.m14532("喵呜呜呜呜喵喵呜")) + obj).concat(AbstractC9234.m14532("喵呜呜呜呜喵喵呜")), true);
    }
}
