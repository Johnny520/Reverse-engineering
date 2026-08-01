package top.suzhelan.plugin.sdk.online.manager;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import p095.C7206;
import p095.ExecutorC7207;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.manager.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int f15915;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashSet f15914 = new LinkedHashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Handler f15913 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11157() {
        if (PluginSdkConfig.getUSER_UIN().length() == 0) {
            Log.w("MessageBadgeManager", "Cannot refresh unread count: USER_UIN is empty");
        } else {
            C7206 c7206 = AbstractC5394.f15030;
            AbstractC5398.m10473(AbstractC5398.m10485(ExecutorC7207.f19230), null, null, new MessageBadgeManager$refreshUnreadCount$1(null), 3);
        }
    }
}
