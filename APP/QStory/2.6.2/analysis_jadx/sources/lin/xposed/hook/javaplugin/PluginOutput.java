package lin.xposed.hook.javaplugin;

import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3056;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import p010.AbstractC6157;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginOutput {
    private final PluginInfo pluginInfo;

    public PluginOutput(PluginInfo pluginInfo) {
        this.pluginInfo = pluginInfo;
    }

    public void e(Throwable th) {
        StringBuilder sbM149 = AbstractC0053.m149(AbstractC6157.m11576().concat(AbstractC3056.m6668(-3937560690605426087L)));
        sbM149.append(Log.getStackTraceString(th));
        AbstractC0455.m1145(this.pluginInfo.getPluginLocalPath() + AbstractC3056.m6668(-3937618234577257895L), sbM149.toString().concat(AbstractC3056.m6668(-3937560690605426087L)), true);
    }

    public void log(Object obj) {
        AbstractC0455.m1145(this.pluginInfo.getPluginLocalPath() + AbstractC3056.m6668(-3937618299001767335L), (AbstractC6157.m11576().concat(AbstractC3056.m6668(-3937560690605426087L)) + obj).concat(AbstractC3056.m6668(-3937560690605426087L)), true);
    }
}
